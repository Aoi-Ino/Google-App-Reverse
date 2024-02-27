package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneId$$ExternalSyntheticBackport0;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.ValueRange;
import java.util.Locale;
import java.util.Objects;

final class DateTimePrintContext {
    private DateTimeFormatter formatter;
    private int optional;
    private TemporalAccessor temporal;

    DateTimePrintContext(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        this.temporal = adjust(temporalAccessor, dateTimeFormatter);
        this.formatter = dateTimeFormatter;
    }

    private static TemporalAccessor adjust(final TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.getChronology();
        ZoneId zone = dateTimeFormatter.getZone();
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        Chronology chronology2 = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        final ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
        final ChronoLocalDate chronoLocalDate = null;
        if (Objects.equals(chronology, chronology2)) {
            chronology = null;
        }
        if (Objects.equals(zone, zoneId)) {
            zone = null;
        }
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        final Chronology chronology3 = chronology != null ? chronology : chronology2;
        if (zone != null) {
            if (temporalAccessor.isSupported(ChronoField.INSTANT_SECONDS)) {
                return ((Chronology) ZoneId$$ExternalSyntheticBackport0.m(chronology3, IsoChronology.INSTANCE)).zonedDateTime(Instant.from(temporalAccessor), zone);
            }
            if (zone.normalized() instanceof ZoneOffset) {
                ChronoField chronoField = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.isSupported(chronoField) && temporalAccessor.get(chronoField) != zone.getRules().getOffset(Instant.EPOCH).getTotalSeconds()) {
                    throw new DateTimeException("Unable to apply override zone '" + zone + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                }
            }
        }
        if (zone != null) {
            zoneId = zone;
        }
        if (chronology != null) {
            if (temporalAccessor.isSupported(ChronoField.EPOCH_DAY)) {
                chronoLocalDate = chronology3.date(temporalAccessor);
            } else if (!(chronology == IsoChronology.INSTANCE && chronology2 == null)) {
                ChronoField[] values = ChronoField.values();
                int length = values.length;
                int i10 = 0;
                while (i10 < length) {
                    ChronoField chronoField2 = values[i10];
                    if (!chronoField2.isDateBased() || !temporalAccessor.isSupported(chronoField2)) {
                        i10++;
                    } else {
                        throw new DateTimeException("Unable to apply override chronology '" + chronology + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                    }
                }
            }
        }
        return new TemporalAccessor() {
            public long getLong(TemporalField temporalField) {
                return ((ChronoLocalDate.this == null || !temporalField.isDateBased()) ? temporalAccessor : ChronoLocalDate.this).getLong(temporalField);
            }

            public boolean isSupported(TemporalField temporalField) {
                return (ChronoLocalDate.this == null || !temporalField.isDateBased()) ? temporalAccessor.isSupported(temporalField) : ChronoLocalDate.this.isSupported(temporalField);
            }

            public Object query(TemporalQuery temporalQuery) {
                return temporalQuery == TemporalQueries.chronology() ? chronology3 : temporalQuery == TemporalQueries.zoneId() ? zoneId : temporalQuery == TemporalQueries.precision() ? temporalAccessor.query(temporalQuery) : temporalQuery.queryFrom(this);
            }

            public ValueRange range(TemporalField temporalField) {
                return ((ChronoLocalDate.this == null || !temporalField.isDateBased()) ? temporalAccessor : ChronoLocalDate.this).range(temporalField);
            }

            public String toString() {
                String str;
                TemporalAccessor temporalAccessor = temporalAccessor;
                Chronology chronology = chronology3;
                String str2 = "";
                if (chronology != null) {
                    str = " with chronology " + chronology;
                } else {
                    str = str2;
                }
                ZoneId zoneId = zoneId;
                if (zoneId != null) {
                    str2 = " with zone " + zoneId;
                }
                return temporalAccessor + str + str2;
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void endOptional() {
        this.optional--;
    }

    /* access modifiers changed from: package-private */
    public DecimalStyle getDecimalStyle() {
        return this.formatter.getDecimalStyle();
    }

    /* access modifiers changed from: package-private */
    public Locale getLocale() {
        return this.formatter.getLocale();
    }

    /* access modifiers changed from: package-private */
    public TemporalAccessor getTemporal() {
        return this.temporal;
    }

    /* access modifiers changed from: package-private */
    public Long getValue(TemporalField temporalField) {
        if (this.optional <= 0 || this.temporal.isSupported(temporalField)) {
            return Long.valueOf(this.temporal.getLong(temporalField));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Object getValue(TemporalQuery temporalQuery) {
        Object query = this.temporal.query(temporalQuery);
        if (query != null || this.optional != 0) {
            return query;
        }
        TemporalAccessor temporalAccessor = this.temporal;
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    /* access modifiers changed from: package-private */
    public void startOptional() {
        this.optional++;
    }

    public String toString() {
        return this.temporal.toString();
    }
}
