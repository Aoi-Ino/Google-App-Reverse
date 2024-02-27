package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

public interface TemporalAccessor {
    int get(TemporalField temporalField) {
        ValueRange range = range(temporalField);
        if (range.isIntValue()) {
            long j10 = getLong(temporalField);
            if (range.isValidValue(j10)) {
                return (int) j10;
            }
            throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + range + "): " + j10);
        }
        throw new UnsupportedTemporalTypeException("Invalid field " + temporalField + " for get() method, use getLong() instead");
    }

    long getLong(TemporalField temporalField);

    boolean isSupported(TemporalField temporalField);

    Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.precision()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.rangeRefinedBy(this);
        } else if (isSupported(temporalField)) {
            return temporalField.range();
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
    }
}
