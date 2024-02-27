package j$.time.chrono;

import j$.time.DateTimeException;

public enum IsoEra implements Era {
    BCE,
    CE;

    public static IsoEra of(int i10) {
        if (i10 == 0) {
            return BCE;
        }
        if (i10 == 1) {
            return CE;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    public int getValue() {
        return ordinal();
    }
}
