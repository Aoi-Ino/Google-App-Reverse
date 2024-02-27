package j$.time.chrono;

import j$.time.DesugarLocalTime$$ExternalSyntheticBackport0;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public final class HijrahDate extends ChronoLocalDateImpl {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient HijrahChronology chrono;
    private final transient int dayOfMonth;
    private final transient int monthOfYear;
    private final transient int prolepticYear;

    /* renamed from: j$.time.chrono.HijrahDate$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                j$.time.temporal.ChronoField[] r0 = j$.time.temporal.ChronoField.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$java$time$temporal$ChronoField = r0
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0028 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0033 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x003e }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0049 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0054 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0060 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x006c }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0078 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0084 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0090 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.YEAR     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x009c }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ERA     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.HijrahDate.AnonymousClass1.<clinit>():void");
        }
    }

    private HijrahDate(HijrahChronology hijrahChronology, int i10, int i11, int i12) {
        hijrahChronology.getEpochDay(i10, i11, i12);
        this.chrono = hijrahChronology;
        this.prolepticYear = i10;
        this.monthOfYear = i11;
        this.dayOfMonth = i12;
    }

    private HijrahDate(HijrahChronology hijrahChronology, long j10) {
        int[] hijrahDateInfo = hijrahChronology.getHijrahDateInfo((int) j10);
        this.chrono = hijrahChronology;
        this.prolepticYear = hijrahDateInfo[0];
        this.monthOfYear = hijrahDateInfo[1];
        this.dayOfMonth = hijrahDateInfo[2];
    }

    private int getDayOfWeek() {
        return DesugarLocalTime$$ExternalSyntheticBackport0.m(toEpochDay() + 3, 7) + 1;
    }

    private int getDayOfYear() {
        return this.chrono.getDayOfYear(this.prolepticYear, this.monthOfYear) + this.dayOfMonth;
    }

    private int getEraValue() {
        return this.prolepticYear > 1 ? 1 : 0;
    }

    private long getProlepticMonth() {
        return ((((long) this.prolepticYear) * 12) + ((long) this.monthOfYear)) - 1;
    }

    static HijrahDate of(HijrahChronology hijrahChronology, int i10, int i11, int i12) {
        return new HijrahDate(hijrahChronology, i10, i11, i12);
    }

    static HijrahDate ofEpochDay(HijrahChronology hijrahChronology, long j10) {
        return new HijrahDate(hijrahChronology, j10);
    }

    static HijrahDate readExternal(ObjectInput objectInput) {
        return ((HijrahChronology) objectInput.readObject()).date(objectInput.readInt(), (int) objectInput.readByte(), (int) objectInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private HijrahDate resolvePreviousValid(int i10, int i11, int i12) {
        int monthLength = this.chrono.getMonthLength(i10, i11);
        if (i12 > monthLength) {
            i12 = monthLength;
        }
        return of(this.chrono, i10, i11, i12);
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    public final ChronoLocalDateTime atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HijrahDate)) {
            return false;
        }
        HijrahDate hijrahDate = (HijrahDate) obj;
        return this.prolepticYear == hijrahDate.prolepticYear && this.monthOfYear == hijrahDate.monthOfYear && this.dayOfMonth == hijrahDate.dayOfMonth && getChronology().equals(hijrahDate.getChronology());
    }

    public HijrahChronology getChronology() {
        return this.chrono;
    }

    public HijrahEra getEra() {
        return HijrahEra.AH;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r4 = (r4 - 1) / 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = (r4 - 1) % 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        return (long) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getLong(j$.time.temporal.TemporalField r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L_0x0066
            int[] r0 = j$.time.chrono.HijrahDate.AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField
            r1 = r4
            j$.time.temporal.ChronoField r1 = (j$.time.temporal.ChronoField) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0063;
                case 2: goto L_0x005e;
                case 3: goto L_0x005b;
                case 4: goto L_0x0056;
                case 5: goto L_0x0053;
                case 6: goto L_0x004a;
                case 7: goto L_0x0045;
                case 8: goto L_0x003a;
                case 9: goto L_0x0037;
                case 10: goto L_0x0032;
                case 11: goto L_0x002f;
                case 12: goto L_0x002f;
                case 13: goto L_0x0029;
                default: goto L_0x0012;
            }
        L_0x0012:
            j$.time.temporal.UnsupportedTemporalTypeException r0 = new j$.time.temporal.UnsupportedTemporalTypeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported field: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0029:
            int r4 = r3.getEraValue()
        L_0x002d:
            long r0 = (long) r4
            return r0
        L_0x002f:
            int r4 = r3.prolepticYear
            goto L_0x002d
        L_0x0032:
            long r0 = r3.getProlepticMonth()
            return r0
        L_0x0037:
            int r4 = r3.monthOfYear
            goto L_0x002d
        L_0x003a:
            int r4 = r3.getDayOfYear()
        L_0x003e:
            int r4 = r4 + -1
            int r4 = r4 / 7
        L_0x0042:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0045:
            long r0 = r3.toEpochDay()
            return r0
        L_0x004a:
            int r4 = r3.getDayOfYear()
        L_0x004e:
            int r4 = r4 + -1
            int r4 = r4 % 7
            goto L_0x0042
        L_0x0053:
            int r4 = r3.dayOfMonth
            goto L_0x004e
        L_0x0056:
            int r4 = r3.getDayOfWeek()
            goto L_0x002d
        L_0x005b:
            int r4 = r3.dayOfMonth
            goto L_0x003e
        L_0x005e:
            int r4 = r3.getDayOfYear()
            goto L_0x002d
        L_0x0063:
            int r4 = r3.dayOfMonth
            goto L_0x002d
        L_0x0066:
            long r0 = r4.getFrom(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.HijrahDate.getLong(j$.time.temporal.TemporalField):long");
    }

    public int hashCode() {
        int i10 = this.prolepticYear;
        int i11 = this.monthOfYear;
        return (((i10 << 11) + (i11 << 6)) + this.dayOfMonth) ^ (getChronology().getId().hashCode() ^ (i10 & -2048));
    }

    public boolean isLeapYear() {
        return this.chrono.isLeapYear((long) this.prolepticYear);
    }

    public int lengthOfMonth() {
        return this.chrono.getMonthLength(this.prolepticYear, this.monthOfYear);
    }

    public int lengthOfYear() {
        return this.chrono.getYearLength(this.prolepticYear);
    }

    public HijrahDate minus(long j10, TemporalUnit temporalUnit) {
        return (HijrahDate) super.minus(j10, temporalUnit);
    }

    public HijrahDate plus(long j10, TemporalUnit temporalUnit) {
        return (HijrahDate) super.plus(j10, temporalUnit);
    }

    public HijrahDate plus(TemporalAmount temporalAmount) {
        return (HijrahDate) super.plus(temporalAmount);
    }

    /* access modifiers changed from: package-private */
    public HijrahDate plusDays(long j10) {
        return new HijrahDate(this.chrono, toEpochDay() + j10);
    }

    /* access modifiers changed from: package-private */
    public HijrahDate plusMonths(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.prolepticYear) * 12) + ((long) (this.monthOfYear - 1)) + j10;
        return resolvePreviousValid(this.chrono.checkValidYear(Math.floorDiv(j11, 12)), ((int) Math.floorMod(j11, 12)) + 1, this.dayOfMonth);
    }

    /* access modifiers changed from: package-private */
    public HijrahDate plusYears(long j10) {
        return j10 == 0 ? this : resolvePreviousValid(Math.addExact(this.prolepticYear, (int) j10), this.monthOfYear, this.dayOfMonth);
    }

    public ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.rangeRefinedBy(this);
        }
        if (isSupported(temporalField)) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? getChronology().range(chronoField) : ValueRange.of(1, 5) : ValueRange.of(1, (long) lengthOfYear()) : ValueRange.of(1, (long) lengthOfMonth());
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
    }

    public long toEpochDay() {
        return this.chrono.getEpochDay(this.prolepticYear, this.monthOfYear, this.dayOfMonth);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public HijrahDate with(TemporalAdjuster temporalAdjuster) {
        return (HijrahDate) super.with(temporalAdjuster);
    }

    public HijrahDate with(TemporalField temporalField, long j10) {
        if (!(temporalField instanceof ChronoField)) {
            return (HijrahDate) super.with(temporalField, j10);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.chrono.range(chronoField).checkValidValue(j10, chronoField);
        int i10 = (int) j10;
        switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
                return resolvePreviousValid(this.prolepticYear, this.monthOfYear, i10);
            case 2:
                return plusDays((long) (Math.min(i10, lengthOfYear()) - getDayOfYear()));
            case 3:
                return plusDays((j10 - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return plusDays(j10 - ((long) getDayOfWeek()));
            case 5:
                return plusDays(j10 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return plusDays(j10 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new HijrahDate(this.chrono, j10);
            case 8:
                return plusDays((j10 - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return resolvePreviousValid(this.prolepticYear, i10, this.dayOfMonth);
            case 10:
                return plusMonths(j10 - getProlepticMonth());
            case 11:
                if (this.prolepticYear < 1) {
                    i10 = 1 - i10;
                }
                return resolvePreviousValid(i10, this.monthOfYear, this.dayOfMonth);
            case 12:
                return resolvePreviousValid(i10, this.monthOfYear, this.dayOfMonth);
            case 13:
                return resolvePreviousValid(1 - this.prolepticYear, this.monthOfYear, this.dayOfMonth);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(getChronology());
        objectOutput.writeInt(get(ChronoField.YEAR));
        objectOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        objectOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }
}
