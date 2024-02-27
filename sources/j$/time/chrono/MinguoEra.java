package j$.time.chrono;

import j$.time.DateTimeException;

public enum MinguoEra implements Era {
    BEFORE_ROC,
    ROC;

    public static MinguoEra of(int i10) {
        if (i10 == 0) {
            return BEFORE_ROC;
        }
        if (i10 == 1) {
            return ROC;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    public int getValue() {
        return ordinal();
    }
}
