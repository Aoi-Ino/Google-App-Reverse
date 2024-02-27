package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;

public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable {
    Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.EPOCH_DAY, toEpochDay());
    }

    ChronoLocalDateTime atTime(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.of(this, localTime);
    }

    int compareTo(ChronoLocalDate chronoLocalDate) {
        int compare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        return compare == 0 ? getChronology().compareTo(chronoLocalDate.getChronology()) : compare;
    }

    boolean equals(Object obj);

    Chronology getChronology();

    Era getEra() {
        return getChronology().eraOf(get(ChronoField.ERA));
    }

    int hashCode();

    boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    boolean isLeapYear() {
        return getChronology().isLeapYear(getLong(ChronoField.YEAR));
    }

    boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.isDateBased() : temporalField != null && temporalField.isSupportedBy(this);
    }

    int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    ChronoLocalDate minus(long j10, TemporalUnit temporalUnit) {
        return ChronoLocalDateImpl.ensureValid(getChronology(), super.minus(j10, temporalUnit));
    }

    ChronoLocalDate plus(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return ChronoLocalDateImpl.ensureValid(getChronology(), temporalUnit.addTo(this, j10));
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
    }

    ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return ChronoLocalDateImpl.ensureValid(getChronology(), super.plus(temporalAmount));
    }

    Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.localTime()) {
            return null;
        }
        return temporalQuery == TemporalQueries.chronology() ? getChronology() : temporalQuery == TemporalQueries.precision() ? ChronoUnit.DAYS : temporalQuery.queryFrom(this);
    }

    long toEpochDay() {
        return getLong(ChronoField.EPOCH_DAY);
    }

    String toString();

    ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return ChronoLocalDateImpl.ensureValid(getChronology(), super.with(temporalAdjuster));
    }

    ChronoLocalDate with(TemporalField temporalField, long j10) {
        if (!(temporalField instanceof ChronoField)) {
            return ChronoLocalDateImpl.ensureValid(getChronology(), temporalField.adjustInto(this, j10));
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
    }
}
