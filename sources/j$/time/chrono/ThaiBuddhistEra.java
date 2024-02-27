package j$.time.chrono;

import j$.time.DateTimeException;

public enum ThaiBuddhistEra implements Era {
    BEFORE_BE,
    BE;

    public static ThaiBuddhistEra of(int i10) {
        if (i10 == 0) {
            return BEFORE_BE;
        }
        if (i10 == 1) {
            return BE;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    public int getValue() {
        return ordinal();
    }
}
