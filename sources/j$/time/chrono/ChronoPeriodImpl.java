package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

final class ChronoPeriodImpl implements TemporalAmount, Serializable {
    private static final List SUPPORTED_UNITS = Duration$DurationUnits$$ExternalSyntheticBackport1.m(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    private static final long serialVersionUID = 57387258289L;
    private final Chronology chrono;
    final int days;
    final int months;
    final int years;

    ChronoPeriodImpl(Chronology chronology, int i10, int i11, int i12) {
        Objects.requireNonNull(chronology, "chrono");
        this.chrono = chronology;
        this.years = i10;
        this.months = i11;
        this.days = i12;
    }

    private long monthRange() {
        ValueRange range = this.chrono.range(ChronoField.MONTH_OF_YEAR);
        if (!range.isFixed() || !range.isIntValue()) {
            return -1;
        }
        return (range.getMaximum() - range.getMinimum()) + 1;
    }

    static ChronoPeriodImpl readExternal(DataInput dataInput) {
        return new ChronoPeriodImpl(Chronology.of(dataInput.readUTF()), dataInput.readInt(), dataInput.readInt(), dataInput.readInt());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private void validateChrono(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        if (chronology != null && !this.chrono.equals(chronology)) {
            String id2 = this.chrono.getId();
            String id3 = chronology.getId();
            throw new DateTimeException("Chronology mismatch, expected: " + id2 + ", actual: " + id3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.temporal.Temporal addTo(j$.time.temporal.Temporal r5) {
        /*
            r4 = this;
            r4.validateChrono(r5)
            int r0 = r4.months
            if (r0 != 0) goto L_0x0013
            int r0 = r4.years
            if (r0 == 0) goto L_0x003d
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.YEARS
        L_0x000e:
            j$.time.temporal.Temporal r5 = r5.plus(r0, r2)
            goto L_0x003d
        L_0x0013:
            long r0 = r4.monthRange()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x002c
            int r2 = r4.years
            long r2 = (long) r2
            long r2 = r2 * r0
            int r0 = r4.months
            long r0 = (long) r0
            long r2 = r2 + r0
            j$.time.temporal.ChronoUnit r0 = j$.time.temporal.ChronoUnit.MONTHS
            j$.time.temporal.Temporal r5 = r5.plus(r2, r0)
            goto L_0x003d
        L_0x002c:
            int r0 = r4.years
            if (r0 == 0) goto L_0x0037
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.YEARS
            j$.time.temporal.Temporal r5 = r5.plus(r0, r2)
        L_0x0037:
            int r0 = r4.months
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.MONTHS
            goto L_0x000e
        L_0x003d:
            int r0 = r4.days
            if (r0 == 0) goto L_0x0048
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.DAYS
            j$.time.temporal.Temporal r5 = r5.plus(r0, r2)
        L_0x0048:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.ChronoPeriodImpl.addTo(j$.time.temporal.Temporal):j$.time.temporal.Temporal");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChronoPeriodImpl)) {
            return false;
        }
        ChronoPeriodImpl chronoPeriodImpl = (ChronoPeriodImpl) obj;
        return this.years == chronoPeriodImpl.years && this.months == chronoPeriodImpl.months && this.days == chronoPeriodImpl.days && this.chrono.equals(chronoPeriodImpl.chrono);
    }

    public Chronology getChronology() {
        return this.chrono;
    }

    public int hashCode() {
        return ((this.years + Integer.rotateLeft(this.months, 8)) + Integer.rotateLeft(this.days, 16)) ^ this.chrono.hashCode();
    }

    public boolean isZero() {
        return this.years == 0 && this.months == 0 && this.days == 0;
    }

    public String toString() {
        if (isZero()) {
            String chronology = getChronology().toString();
            return chronology + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getChronology().toString());
        sb2.append(' ');
        sb2.append('P');
        int i10 = this.years;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.months;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.days;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeUTF(this.chrono.getId());
        dataOutput.writeInt(this.years);
        dataOutput.writeInt(this.months);
        dataOutput.writeInt(this.days);
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return new Ser((byte) 9, this);
    }
}
