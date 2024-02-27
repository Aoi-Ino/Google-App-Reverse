package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class ValueRange implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long maxLargest;
    private final long maxSmallest;
    private final long minLargest;
    private final long minSmallest;

    private ValueRange(long j10, long j11, long j12, long j13) {
        this.minSmallest = j10;
        this.minLargest = j11;
        this.maxSmallest = j12;
        this.maxLargest = j13;
    }

    private String genInvalidFieldMessage(TemporalField temporalField, long j10) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    public static ValueRange of(long j10, long j11) {
        if (j10 <= j11) {
            return new ValueRange(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static ValueRange of(long j10, long j11, long j12) {
        return of(j10, j10, j11, j12);
    }

    public static ValueRange of(long j10, long j11, long j12, long j13) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j12 > j13) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j11 <= j13) {
            return new ValueRange(j10, j11, j12, j13);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j10 = this.minSmallest;
        long j11 = this.minLargest;
        if (j10 <= j11) {
            long j12 = this.maxSmallest;
            long j13 = this.maxLargest;
            if (j12 > j13) {
                throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
            } else if (j11 > j13) {
                throw new InvalidObjectException("Minimum value must be less than maximum value");
            }
        } else {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
    }

    public int checkValidIntValue(long j10, TemporalField temporalField) {
        if (isValidIntValue(j10)) {
            return (int) j10;
        }
        throw new DateTimeException(genInvalidFieldMessage(temporalField, j10));
    }

    public long checkValidValue(long j10, TemporalField temporalField) {
        if (isValidValue(j10)) {
            return j10;
        }
        throw new DateTimeException(genInvalidFieldMessage(temporalField, j10));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueRange)) {
            return false;
        }
        ValueRange valueRange = (ValueRange) obj;
        return this.minSmallest == valueRange.minSmallest && this.minLargest == valueRange.minLargest && this.maxSmallest == valueRange.maxSmallest && this.maxLargest == valueRange.maxLargest;
    }

    public long getMaximum() {
        return this.maxLargest;
    }

    public long getMinimum() {
        return this.minSmallest;
    }

    public long getSmallestMaximum() {
        return this.maxSmallest;
    }

    public int hashCode() {
        long j10 = this.minSmallest;
        long j11 = this.minLargest;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.maxSmallest;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.maxLargest;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public boolean isFixed() {
        return this.minSmallest == this.minLargest && this.maxSmallest == this.maxLargest;
    }

    public boolean isIntValue() {
        return getMinimum() >= -2147483648L && getMaximum() <= 2147483647L;
    }

    public boolean isValidIntValue(long j10) {
        return isIntValue() && isValidValue(j10);
    }

    public boolean isValidValue(long j10) {
        return j10 >= getMinimum() && j10 <= getMaximum();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.minSmallest);
        if (this.minSmallest != this.minLargest) {
            sb2.append('/');
            sb2.append(this.minLargest);
        }
        sb2.append(" - ");
        sb2.append(this.maxSmallest);
        if (this.maxSmallest != this.maxLargest) {
            sb2.append('/');
            sb2.append(this.maxLargest);
        }
        return sb2.toString();
    }
}
