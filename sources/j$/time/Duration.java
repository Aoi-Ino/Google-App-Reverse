package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(1000000000);
    public static final Duration ZERO = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;

    private Duration(long j10, int i10) {
        this.seconds = j10;
        this.nanos = i10;
    }

    private static Duration create(long j10, int i10) {
        return (((long) i10) | j10) == 0 ? ZERO : new Duration(j10, i10);
    }

    public static Duration ofMillis(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return create(j11, i10 * 1000000);
    }

    public static Duration ofNanos(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (((long) i10) + 1000000000);
            j11--;
        }
        return create(j11, i10);
    }

    public static Duration ofSeconds(long j10) {
        return create(j10, 0);
    }

    public static Duration ofSeconds(long j10, long j11) {
        return create(Math.addExact(j10, Math.floorDiv(j11, 1000000000)), (int) Math.floorMod(j11, 1000000000));
    }

    static Duration readExternal(DataInput dataInput) {
        return ofSeconds(dataInput.readLong(), (long) dataInput.readInt());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    public Temporal addTo(Temporal temporal) {
        long j10 = this.seconds;
        if (j10 != 0) {
            temporal = temporal.plus(j10, ChronoUnit.SECONDS);
        }
        int i10 = this.nanos;
        return i10 != 0 ? temporal.plus((long) i10, ChronoUnit.NANOS) : temporal;
    }

    public int compareTo(Duration duration) {
        int compare = Long.compare(this.seconds, duration.seconds);
        return compare != 0 ? compare : this.nanos - duration.nanos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.seconds == duration.seconds && this.nanos == duration.nanos;
    }

    public int getNano() {
        return this.nanos;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j10 = this.seconds;
        return ((int) (j10 ^ (j10 >>> 32))) + (this.nanos * 51);
    }

    public long toMillis() {
        long j10 = this.seconds;
        long j11 = (long) this.nanos;
        if (j10 < 0) {
            j10++;
            j11 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j10, (long) 1000), j11 / 1000000);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j10 = this.seconds;
        if (j10 < 0 && this.nanos > 0) {
            j10++;
        }
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.nanos == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.seconds >= 0 || this.nanos <= 0 || i11 != 0) {
            sb2.append(i11);
        } else {
            sb2.append("-0");
        }
        if (this.nanos > 0) {
            int length = sb2.length();
            if (this.seconds < 0) {
                sb2.append(2000000000 - ((long) this.nanos));
            } else {
                sb2.append(((long) this.nanos) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }
}
