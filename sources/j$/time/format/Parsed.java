package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.UnsupportedTemporalTypeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class Parsed implements TemporalAccessor {
    Chronology chrono;
    private ChronoLocalDate date;
    Period excessDays = Period.ZERO;
    final Map fieldValues = new HashMap();
    boolean leapSecond;
    private ResolverStyle resolverStyle;
    private LocalTime time;
    ZoneId zone;

    Parsed() {
    }

    private void crossCheck() {
        ChronoLocalDate chronoLocalDate = this.date;
        if (chronoLocalDate != null) {
            crossCheck(chronoLocalDate);
        }
        LocalTime localTime = this.time;
        if (localTime != null) {
            crossCheck(localTime);
            if (this.date != null && this.fieldValues.size() > 0) {
                crossCheck(this.date.atTime(this.time));
            }
        }
    }

    private void crossCheck(TemporalAccessor temporalAccessor) {
        Iterator it = this.fieldValues.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.isSupported(temporalField)) {
                try {
                    long j10 = temporalAccessor.getLong(temporalField);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (j10 == longValue) {
                        it.remove();
                    } else {
                        throw new DateTimeException("Conflict found: Field " + temporalField + " " + j10 + " differs from " + temporalField + " " + longValue + " derived from " + temporalAccessor);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void resolveDateFields() {
        updateCheckConflict(this.chrono.resolveDate(this.fieldValues, this.resolverStyle));
    }

    private void resolveFields() {
        resolveInstantFields();
        resolveDateFields();
        resolveTimeFields();
        if (this.fieldValues.size() > 0) {
            int i10 = 0;
            loop0:
            while (i10 < 50) {
                for (Map.Entry key : this.fieldValues.entrySet()) {
                    TemporalField temporalField = (TemporalField) key.getKey();
                    Object resolve = temporalField.resolve(this.fieldValues, this, this.resolverStyle);
                    if (resolve != null) {
                        if (resolve instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) resolve;
                            ZoneId zoneId = this.zone;
                            if (zoneId == null) {
                                this.zone = chronoZonedDateTime.getZone();
                            } else if (!zoneId.equals(chronoZonedDateTime.getZone())) {
                                ZoneId zoneId2 = this.zone;
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + zoneId2);
                            }
                            resolve = chronoZonedDateTime.toLocalDateTime();
                        }
                        if (resolve instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) resolve;
                            updateCheckConflict(chronoLocalDateTime.toLocalTime(), Period.ZERO);
                            updateCheckConflict(chronoLocalDateTime.toLocalDate());
                        } else if (resolve instanceof ChronoLocalDate) {
                            updateCheckConflict((ChronoLocalDate) resolve);
                        } else if (resolve instanceof LocalTime) {
                            updateCheckConflict((LocalTime) resolve, Period.ZERO);
                        } else {
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    } else if (!this.fieldValues.containsKey(temporalField)) {
                    }
                    i10++;
                }
            }
            if (i10 == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            } else if (i10 > 0) {
                resolveInstantFields();
                resolveDateFields();
                resolveTimeFields();
            }
        }
    }

    private void resolveFractional() {
        if (this.time != null) {
            return;
        }
        if (this.fieldValues.containsKey(ChronoField.INSTANT_SECONDS) || this.fieldValues.containsKey(ChronoField.SECOND_OF_DAY) || this.fieldValues.containsKey(ChronoField.SECOND_OF_MINUTE)) {
            Map map = this.fieldValues;
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            if (map.containsKey(chronoField)) {
                long longValue = ((Long) this.fieldValues.get(chronoField)).longValue();
                this.fieldValues.put(ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
                this.fieldValues.put(ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
                return;
            }
            this.fieldValues.put(chronoField, 0L);
            this.fieldValues.put(ChronoField.MICRO_OF_SECOND, 0L);
            this.fieldValues.put(ChronoField.MILLI_OF_SECOND, 0L);
        }
    }

    private void resolveInstant() {
        ChronoZonedDateTime atZone;
        if (this.date != null && this.time != null) {
            Long l10 = (Long) this.fieldValues.get(ChronoField.OFFSET_SECONDS);
            if (l10 != null) {
                atZone = this.date.atTime(this.time).atZone(ZoneOffset.ofTotalSeconds(l10.intValue()));
            } else if (this.zone != null) {
                atZone = this.date.atTime(this.time).atZone(this.zone);
            } else {
                return;
            }
            this.fieldValues.put(ChronoField.INSTANT_SECONDS, Long.valueOf(atZone.toEpochSecond()));
        }
    }

    private void resolveInstantFields() {
        if (this.fieldValues.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.zone;
            if (zoneId == null) {
                Long l10 = (Long) this.fieldValues.get(ChronoField.OFFSET_SECONDS);
                if (l10 != null) {
                    zoneId = ZoneOffset.ofTotalSeconds(l10.intValue());
                } else {
                    return;
                }
            }
            resolveInstantFields0(zoneId);
        }
    }

    private void resolveInstantFields0(ZoneId zoneId) {
        Map map = this.fieldValues;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        ChronoZonedDateTime zonedDateTime = this.chrono.zonedDateTime(Instant.ofEpochSecond(((Long) map.remove(chronoField)).longValue()), zoneId);
        updateCheckConflict(zonedDateTime.toLocalDate());
        updateCheckConflict(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf((long) zonedDateTime.toLocalTime().toSecondOfDay()));
    }

    private void resolvePeriod() {
        if (this.date != null && this.time != null && !this.excessDays.isZero()) {
            this.date = this.date.plus(this.excessDays);
            this.excessDays = Period.ZERO;
        }
    }

    private void resolveTime(long j10, long j11, long j12, long j13) {
        LocalTime of2;
        Period period;
        if (this.resolverStyle == ResolverStyle.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j10, 3600000000000L), Math.multiplyExact(j11, 60000000000L)), Math.multiplyExact(j12, 1000000000)), j13);
            of2 = LocalTime.ofNanoOfDay(Math.floorMod(addExact, 86400000000000L));
            period = Period.ofDays((int) Math.floorDiv(addExact, 86400000000000L));
        } else {
            int checkValidIntValue = ChronoField.MINUTE_OF_HOUR.checkValidIntValue(j11);
            int checkValidIntValue2 = ChronoField.NANO_OF_SECOND.checkValidIntValue(j13);
            if (this.resolverStyle == ResolverStyle.SMART && j10 == 24 && checkValidIntValue == 0 && j12 == 0 && checkValidIntValue2 == 0) {
                of2 = LocalTime.MIDNIGHT;
                period = Period.ofDays(1);
            } else {
                of2 = LocalTime.of(ChronoField.HOUR_OF_DAY.checkValidIntValue(j10), checkValidIntValue, ChronoField.SECOND_OF_MINUTE.checkValidIntValue(j12), checkValidIntValue2);
                period = Period.ZERO;
            }
        }
        updateCheckConflict(of2, period);
    }

    private void resolveTimeFields() {
        ChronoField chronoField;
        Long valueOf;
        Map map = this.fieldValues;
        ChronoField chronoField2 = ChronoField.CLOCK_HOUR_OF_DAY;
        long j10 = 0;
        if (map.containsKey(chronoField2)) {
            long longValue = ((Long) this.fieldValues.remove(chronoField2)).longValue();
            ResolverStyle resolverStyle2 = this.resolverStyle;
            if (resolverStyle2 == ResolverStyle.STRICT || (resolverStyle2 == ResolverStyle.SMART && longValue != 0)) {
                chronoField2.checkValidValue(longValue);
            }
            ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            updateCheckConflict(chronoField2, chronoField3, Long.valueOf(longValue));
        }
        Map map2 = this.fieldValues;
        ChronoField chronoField4 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(chronoField4)) {
            long longValue2 = ((Long) this.fieldValues.remove(chronoField4)).longValue();
            ResolverStyle resolverStyle3 = this.resolverStyle;
            if (resolverStyle3 == ResolverStyle.STRICT || (resolverStyle3 == ResolverStyle.SMART && longValue2 != 0)) {
                chronoField4.checkValidValue(longValue2);
            }
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j10 = longValue2;
            }
            updateCheckConflict(chronoField4, chronoField5, Long.valueOf(j10));
        }
        Map map3 = this.fieldValues;
        ChronoField chronoField6 = ChronoField.AMPM_OF_DAY;
        if (map3.containsKey(chronoField6)) {
            Map map4 = this.fieldValues;
            ChronoField chronoField7 = ChronoField.HOUR_OF_AMPM;
            if (map4.containsKey(chronoField7)) {
                long longValue3 = ((Long) this.fieldValues.remove(chronoField6)).longValue();
                long longValue4 = ((Long) this.fieldValues.remove(chronoField7)).longValue();
                if (this.resolverStyle == ResolverStyle.LENIENT) {
                    chronoField = ChronoField.HOUR_OF_DAY;
                    valueOf = Long.valueOf(Math.addExact(Math.multiplyExact(longValue3, (long) 12), longValue4));
                } else {
                    chronoField6.checkValidValue(longValue3);
                    chronoField7.checkValidValue(longValue3);
                    chronoField = ChronoField.HOUR_OF_DAY;
                    valueOf = Long.valueOf((longValue3 * 12) + longValue4);
                }
                updateCheckConflict(chronoField6, chronoField, valueOf);
            }
        }
        Map map5 = this.fieldValues;
        ChronoField chronoField8 = ChronoField.NANO_OF_DAY;
        if (map5.containsKey(chronoField8)) {
            long longValue5 = ((Long) this.fieldValues.remove(chronoField8)).longValue();
            if (this.resolverStyle != ResolverStyle.LENIENT) {
                chronoField8.checkValidValue(longValue5);
            }
            updateCheckConflict(chronoField8, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            updateCheckConflict(chronoField8, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            updateCheckConflict(chronoField8, ChronoField.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            updateCheckConflict(chronoField8, ChronoField.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.fieldValues;
        ChronoField chronoField9 = ChronoField.MICRO_OF_DAY;
        if (map6.containsKey(chronoField9)) {
            long longValue6 = ((Long) this.fieldValues.remove(chronoField9)).longValue();
            if (this.resolverStyle != ResolverStyle.LENIENT) {
                chronoField9.checkValidValue(longValue6);
            }
            updateCheckConflict(chronoField9, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            updateCheckConflict(chronoField9, ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.fieldValues;
        ChronoField chronoField10 = ChronoField.MILLI_OF_DAY;
        if (map7.containsKey(chronoField10)) {
            long longValue7 = ((Long) this.fieldValues.remove(chronoField10)).longValue();
            if (this.resolverStyle != ResolverStyle.LENIENT) {
                chronoField10.checkValidValue(longValue7);
            }
            updateCheckConflict(chronoField10, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            updateCheckConflict(chronoField10, ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.fieldValues;
        ChronoField chronoField11 = ChronoField.SECOND_OF_DAY;
        if (map8.containsKey(chronoField11)) {
            long longValue8 = ((Long) this.fieldValues.remove(chronoField11)).longValue();
            if (this.resolverStyle != ResolverStyle.LENIENT) {
                chronoField11.checkValidValue(longValue8);
            }
            updateCheckConflict(chronoField11, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            updateCheckConflict(chronoField11, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            updateCheckConflict(chronoField11, ChronoField.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.fieldValues;
        ChronoField chronoField12 = ChronoField.MINUTE_OF_DAY;
        if (map9.containsKey(chronoField12)) {
            long longValue9 = ((Long) this.fieldValues.remove(chronoField12)).longValue();
            if (this.resolverStyle != ResolverStyle.LENIENT) {
                chronoField12.checkValidValue(longValue9);
            }
            updateCheckConflict(chronoField12, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            updateCheckConflict(chronoField12, ChronoField.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.fieldValues;
        ChronoField chronoField13 = ChronoField.NANO_OF_SECOND;
        if (map10.containsKey(chronoField13)) {
            long longValue10 = ((Long) this.fieldValues.get(chronoField13)).longValue();
            ResolverStyle resolverStyle4 = this.resolverStyle;
            ResolverStyle resolverStyle5 = ResolverStyle.LENIENT;
            if (resolverStyle4 != resolverStyle5) {
                chronoField13.checkValidValue(longValue10);
            }
            Map map11 = this.fieldValues;
            ChronoField chronoField14 = ChronoField.MICRO_OF_SECOND;
            if (map11.containsKey(chronoField14)) {
                long longValue11 = ((Long) this.fieldValues.remove(chronoField14)).longValue();
                if (this.resolverStyle != resolverStyle5) {
                    chronoField14.checkValidValue(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                updateCheckConflict(chronoField14, chronoField13, Long.valueOf(longValue10));
            }
            Map map12 = this.fieldValues;
            ChronoField chronoField15 = ChronoField.MILLI_OF_SECOND;
            if (map12.containsKey(chronoField15)) {
                long longValue12 = ((Long) this.fieldValues.remove(chronoField15)).longValue();
                if (this.resolverStyle != resolverStyle5) {
                    chronoField15.checkValidValue(longValue12);
                }
                updateCheckConflict(chronoField15, chronoField13, Long.valueOf((longValue12 * 1000000) + (longValue10 % 1000000)));
            }
        }
        Map map13 = this.fieldValues;
        ChronoField chronoField16 = ChronoField.HOUR_OF_DAY;
        if (map13.containsKey(chronoField16)) {
            Map map14 = this.fieldValues;
            ChronoField chronoField17 = ChronoField.MINUTE_OF_HOUR;
            if (map14.containsKey(chronoField17)) {
                Map map15 = this.fieldValues;
                ChronoField chronoField18 = ChronoField.SECOND_OF_MINUTE;
                if (map15.containsKey(chronoField18) && this.fieldValues.containsKey(chronoField13)) {
                    resolveTime(((Long) this.fieldValues.remove(chronoField16)).longValue(), ((Long) this.fieldValues.remove(chronoField17)).longValue(), ((Long) this.fieldValues.remove(chronoField18)).longValue(), ((Long) this.fieldValues.remove(chronoField13)).longValue());
                }
            }
        }
    }

    private void resolveTimeLenient() {
        Map map;
        ChronoField chronoField;
        if (this.time == null) {
            Map map2 = this.fieldValues;
            ChronoField chronoField2 = ChronoField.MILLI_OF_SECOND;
            long j10 = 1000;
            if (map2.containsKey(chronoField2)) {
                long longValue = ((Long) this.fieldValues.remove(chronoField2)).longValue();
                Map map3 = this.fieldValues;
                ChronoField chronoField3 = ChronoField.MICRO_OF_SECOND;
                if (map3.containsKey(chronoField3)) {
                    longValue = (longValue * 1000) + (((Long) this.fieldValues.get(chronoField3)).longValue() % 1000);
                    updateCheckConflict(chronoField2, chronoField3, Long.valueOf(longValue));
                    this.fieldValues.remove(chronoField3);
                    map = this.fieldValues;
                    chronoField = ChronoField.NANO_OF_SECOND;
                } else {
                    map = this.fieldValues;
                    chronoField = ChronoField.NANO_OF_SECOND;
                    j10 = 1000000;
                }
                map.put(chronoField, Long.valueOf(longValue * j10));
            } else {
                Map map4 = this.fieldValues;
                ChronoField chronoField4 = ChronoField.MICRO_OF_SECOND;
                if (map4.containsKey(chronoField4)) {
                    this.fieldValues.put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) this.fieldValues.remove(chronoField4)).longValue() * 1000));
                }
            }
            Map map5 = this.fieldValues;
            ChronoField chronoField5 = ChronoField.HOUR_OF_DAY;
            Long l10 = (Long) map5.get(chronoField5);
            if (l10 != null) {
                Map map6 = this.fieldValues;
                ChronoField chronoField6 = ChronoField.MINUTE_OF_HOUR;
                Long l11 = (Long) map6.get(chronoField6);
                Map map7 = this.fieldValues;
                ChronoField chronoField7 = ChronoField.SECOND_OF_MINUTE;
                Long l12 = (Long) map7.get(chronoField7);
                Map map8 = this.fieldValues;
                ChronoField chronoField8 = ChronoField.NANO_OF_SECOND;
                Long l13 = (Long) map8.get(chronoField8);
                if (l11 == null && (l12 != null || l13 != null)) {
                    return;
                }
                if (l11 == null || l12 != null || l13 == null) {
                    resolveTime(l10.longValue(), l11 != null ? l11.longValue() : 0, l12 != null ? l12.longValue() : 0, l13 != null ? l13.longValue() : 0);
                    this.fieldValues.remove(chronoField5);
                    this.fieldValues.remove(chronoField6);
                    this.fieldValues.remove(chronoField7);
                    this.fieldValues.remove(chronoField8);
                } else {
                    return;
                }
            }
        }
        if (this.resolverStyle != ResolverStyle.LENIENT && this.fieldValues.size() > 0) {
            for (Map.Entry entry : this.fieldValues.entrySet()) {
                TemporalField temporalField = (TemporalField) entry.getKey();
                if ((temporalField instanceof ChronoField) && temporalField.isTimeBased()) {
                    ((ChronoField) temporalField).checkValidValue(((Long) entry.getValue()).longValue());
                }
            }
        }
    }

    private void updateCheckConflict(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.time;
        if (localTime2 == null) {
            this.time = localTime;
        } else if (!localTime2.equals(localTime)) {
            LocalTime localTime3 = this.time;
            throw new DateTimeException("Conflict found: Fields resolved to different times: " + localTime3 + " " + localTime);
        } else if (!this.excessDays.isZero() && !period.isZero() && !this.excessDays.equals(period)) {
            Period period2 = this.excessDays;
            throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + period2 + " " + period);
        }
        this.excessDays = period;
    }

    private void updateCheckConflict(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.date;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate != null && !chronoLocalDate2.equals(chronoLocalDate)) {
                ChronoLocalDate chronoLocalDate3 = this.date;
                throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + chronoLocalDate3 + " " + chronoLocalDate);
            }
        } else if (chronoLocalDate == null) {
        } else {
            if (this.chrono.equals(chronoLocalDate.getChronology())) {
                this.date = chronoLocalDate;
                return;
            }
            Chronology chronology = this.chrono;
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + chronology);
        }
    }

    private void updateCheckConflict(TemporalField temporalField, TemporalField temporalField2, Long l10) {
        Long l11 = (Long) this.fieldValues.put(temporalField2, l10);
        if (l11 != null && l11.longValue() != l10.longValue()) {
            throw new DateTimeException("Conflict found: " + temporalField2 + " " + l11 + " differs from " + temporalField2 + " " + l10 + " while resolving  " + temporalField);
        }
    }

    /* access modifiers changed from: package-private */
    public Parsed copy() {
        Parsed parsed = new Parsed();
        parsed.fieldValues.putAll(this.fieldValues);
        parsed.zone = this.zone;
        parsed.chrono = this.chrono;
        parsed.leapSecond = this.leapSecond;
        return parsed;
    }

    public long getLong(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) this.fieldValues.get(temporalField);
        if (l10 != null) {
            return l10.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.date;
        if (chronoLocalDate != null && chronoLocalDate.isSupported(temporalField)) {
            return this.date.getLong(temporalField);
        }
        LocalTime localTime = this.time;
        if (localTime != null && localTime.isSupported(temporalField)) {
            return this.time.getLong(temporalField);
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
    }

    public boolean isSupported(TemporalField temporalField) {
        if (this.fieldValues.containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.date;
        if (chronoLocalDate != null && chronoLocalDate.isSupported(temporalField)) {
            return true;
        }
        LocalTime localTime = this.time;
        if (localTime == null || !localTime.isSupported(temporalField)) {
            return temporalField != null && !(temporalField instanceof ChronoField) && temporalField.isSupportedBy(this);
        }
        return true;
    }

    public Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.zoneId()) {
            return this.zone;
        }
        if (temporalQuery == TemporalQueries.chronology()) {
            return this.chrono;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            ChronoLocalDate chronoLocalDate = this.date;
            if (chronoLocalDate != null) {
                return LocalDate.from(chronoLocalDate);
            }
            return null;
        } else if (temporalQuery == TemporalQueries.localTime()) {
            return this.time;
        } else {
            if (temporalQuery == TemporalQueries.offset()) {
                Long l10 = (Long) this.fieldValues.get(ChronoField.OFFSET_SECONDS);
                if (l10 != null) {
                    return ZoneOffset.ofTotalSeconds(l10.intValue());
                }
                ZoneId zoneId = this.zone;
                return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
            } else if (temporalQuery == TemporalQueries.zone()) {
                return temporalQuery.queryFrom(this);
            } else {
                if (temporalQuery == TemporalQueries.precision()) {
                    return null;
                }
                return temporalQuery.queryFrom(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public TemporalAccessor resolve(ResolverStyle resolverStyle2, Set set) {
        if (set != null) {
            this.fieldValues.keySet().retainAll(set);
        }
        this.resolverStyle = resolverStyle2;
        resolveFields();
        resolveTimeLenient();
        crossCheck();
        resolvePeriod();
        resolveFractional();
        resolveInstant();
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.fieldValues);
        sb2.append(',');
        sb2.append(this.chrono);
        if (this.zone != null) {
            sb2.append(',');
            sb2.append(this.zone);
        }
        if (!(this.date == null && this.time == null)) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.date;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.time != null) {
                    sb2.append('T');
                }
            }
            sb2.append(this.time);
        }
        return sb2.toString();
    }
}
