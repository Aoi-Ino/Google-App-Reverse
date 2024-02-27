package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;

public enum HijrahEra implements Era {
    AH;

    public int getValue() {
        return 1;
    }

    public ValueRange range(TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? ValueRange.of(1, 1) : super.range(temporalField);
    }
}
