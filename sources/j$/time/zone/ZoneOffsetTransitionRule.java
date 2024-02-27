package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class ZoneOffsetTransitionRule implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final byte dom;
    private final DayOfWeek dow;
    private final Month month;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final ZoneOffset standardOffset;
    private final LocalTime time;
    private final TimeDefinition timeDefinition;
    private final boolean timeEndOfDay;

    /* renamed from: j$.time.zone.ZoneOffsetTransitionRule$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                j$.time.zone.ZoneOffsetTransitionRule$TimeDefinition[] r0 = j$.time.zone.ZoneOffsetTransitionRule.TimeDefinition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition = r0
                j$.time.zone.ZoneOffsetTransitionRule$TimeDefinition r1 = j$.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition     // Catch:{ NoSuchFieldError -> 0x001d }
                j$.time.zone.ZoneOffsetTransitionRule$TimeDefinition r1 = j$.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneOffsetTransitionRule.AnonymousClass1.<clinit>():void");
        }
    }

    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public LocalDateTime createDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
            long totalSeconds;
            int i10 = AnonymousClass1.$SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition[ordinal()];
            if (i10 == 1) {
                totalSeconds = (long) (zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i10 != 2) {
                return localDateTime;
            } else {
                totalSeconds = (long) (zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            return localDateTime.plusSeconds(totalSeconds);
        }
    }

    ZoneOffsetTransitionRule(Month month2, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10, TimeDefinition timeDefinition2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.month = month2;
        this.dom = (byte) i10;
        this.dow = dayOfWeek;
        this.time = localTime;
        this.timeEndOfDay = z10;
        this.timeDefinition = timeDefinition2;
        this.standardOffset = zoneOffset;
        this.offsetBefore = zoneOffset2;
        this.offsetAfter = zoneOffset3;
    }

    public static ZoneOffsetTransitionRule of(Month month2, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10, TimeDefinition timeDefinition2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        int i11 = i10;
        LocalTime localTime2 = localTime;
        Month month3 = month2;
        Objects.requireNonNull(month2, "month");
        Objects.requireNonNull(localTime, "time");
        Objects.requireNonNull(timeDefinition2, "timeDefnition");
        Objects.requireNonNull(zoneOffset, "standardOffset");
        Objects.requireNonNull(zoneOffset2, "offsetBefore");
        Objects.requireNonNull(zoneOffset3, "offsetAfter");
        if (i11 < -28 || i11 > 31 || i11 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } else if (z10 && !localTime.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        } else if (localTime.getNano() == 0) {
            return new ZoneOffsetTransitionRule(month2, i10, dayOfWeek, localTime, z10, timeDefinition2, zoneOffset, zoneOffset2, zoneOffset3);
        } else {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
    }

    static ZoneOffsetTransitionRule readExternal(DataInput dataInput) {
        int readInt = dataInput.readInt();
        Month of2 = Month.of(readInt >>> 28);
        int i10 = ((264241152 & readInt) >>> 22) - 32;
        int i11 = (3670016 & readInt) >>> 19;
        DayOfWeek of3 = i11 == 0 ? null : DayOfWeek.of(i11);
        int i12 = (507904 & readInt) >>> 14;
        TimeDefinition timeDefinition2 = TimeDefinition.values()[(readInt & 12288) >>> 12];
        int i13 = (readInt & 4080) >>> 4;
        int i14 = (readInt & 12) >>> 2;
        int i15 = readInt & 3;
        LocalTime ofSecondOfDay = i12 == 31 ? LocalTime.ofSecondOfDay((long) dataInput.readInt()) : LocalTime.of(i12 % 24, 0);
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(i13 == 255 ? dataInput.readInt() : (i13 - 128) * 900);
        return of(of2, i10, of3, ofSecondOfDay, i12 == 24, timeDefinition2, ofTotalSeconds, ZoneOffset.ofTotalSeconds(i14 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i14 * 1800)), ZoneOffset.ofTotalSeconds(i15 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i15 * 1800)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.zone.ZoneOffsetTransition createTransition(int r5) {
        /*
            r4 = this;
            byte r0 = r4.dom
            if (r0 >= 0) goto L_0x0027
            j$.time.Month r0 = r4.month
            j$.time.chrono.IsoChronology r1 = j$.time.chrono.IsoChronology.INSTANCE
            long r2 = (long) r5
            boolean r1 = r1.isLeapYear(r2)
            int r1 = r0.length(r1)
            int r1 = r1 + 1
            byte r2 = r4.dom
            int r1 = r1 + r2
            j$.time.LocalDate r5 = j$.time.LocalDate.of((int) r5, (j$.time.Month) r0, (int) r1)
            j$.time.DayOfWeek r0 = r4.dow
            if (r0 == 0) goto L_0x0036
            j$.time.temporal.TemporalAdjuster r0 = j$.time.temporal.TemporalAdjusters.previousOrSame(r0)
        L_0x0022:
            j$.time.LocalDate r5 = r5.with((j$.time.temporal.TemporalAdjuster) r0)
            goto L_0x0036
        L_0x0027:
            j$.time.Month r1 = r4.month
            j$.time.LocalDate r5 = j$.time.LocalDate.of((int) r5, (j$.time.Month) r1, (int) r0)
            j$.time.DayOfWeek r0 = r4.dow
            if (r0 == 0) goto L_0x0036
            j$.time.temporal.TemporalAdjuster r0 = j$.time.temporal.TemporalAdjusters.nextOrSame(r0)
            goto L_0x0022
        L_0x0036:
            boolean r0 = r4.timeEndOfDay
            if (r0 == 0) goto L_0x0040
            r0 = 1
            j$.time.LocalDate r5 = r5.plusDays(r0)
        L_0x0040:
            j$.time.LocalTime r0 = r4.time
            j$.time.LocalDateTime r5 = j$.time.LocalDateTime.of(r5, r0)
            j$.time.zone.ZoneOffsetTransitionRule$TimeDefinition r0 = r4.timeDefinition
            j$.time.ZoneOffset r1 = r4.standardOffset
            j$.time.ZoneOffset r2 = r4.offsetBefore
            j$.time.LocalDateTime r5 = r0.createDateTime(r5, r1, r2)
            j$.time.zone.ZoneOffsetTransition r0 = new j$.time.zone.ZoneOffsetTransition
            j$.time.ZoneOffset r1 = r4.offsetBefore
            j$.time.ZoneOffset r2 = r4.offsetAfter
            r0.<init>((j$.time.LocalDateTime) r5, (j$.time.ZoneOffset) r1, (j$.time.ZoneOffset) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneOffsetTransitionRule.createTransition(int):j$.time.zone.ZoneOffsetTransition");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransitionRule)) {
            return false;
        }
        ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
        return this.month == zoneOffsetTransitionRule.month && this.dom == zoneOffsetTransitionRule.dom && this.dow == zoneOffsetTransitionRule.dow && this.timeDefinition == zoneOffsetTransitionRule.timeDefinition && this.time.equals(zoneOffsetTransitionRule.time) && this.timeEndOfDay == zoneOffsetTransitionRule.timeEndOfDay && this.standardOffset.equals(zoneOffsetTransitionRule.standardOffset) && this.offsetBefore.equals(zoneOffsetTransitionRule.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransitionRule.offsetAfter);
    }

    public int hashCode() {
        int secondOfDay = ((this.time.toSecondOfDay() + (this.timeEndOfDay ? 1 : 0)) << 15) + (this.month.ordinal() << 11) + ((this.dom + 32) << 5);
        DayOfWeek dayOfWeek = this.dow;
        return ((((secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)) + this.timeDefinition.ordinal()) ^ this.standardOffset.hashCode()) ^ this.offsetBefore.hashCode()) ^ this.offsetAfter.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransitionRule["
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.offsetBefore
            j$.time.ZoneOffset r2 = r5.offsetAfter
            int r1 = r1.compareTo((j$.time.ZoneOffset) r2)
            if (r1 <= 0) goto L_0x0017
            java.lang.String r1 = "Gap "
            goto L_0x0019
        L_0x0017:
            java.lang.String r1 = "Overlap "
        L_0x0019:
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.offsetBefore
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.offsetAfter
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            j$.time.DayOfWeek r1 = r5.dow
            r2 = 32
            if (r1 == 0) goto L_0x0068
            byte r3 = r5.dom
            r4 = -1
            java.lang.String r1 = r1.name()
            r0.append(r1)
            if (r3 != r4) goto L_0x0051
            java.lang.String r1 = " on or before last day of "
        L_0x0044:
            r0.append(r1)
            j$.time.Month r1 = r5.month
            java.lang.String r1 = r1.name()
            r0.append(r1)
            goto L_0x0079
        L_0x0051:
            if (r3 >= 0) goto L_0x0063
            java.lang.String r1 = " on or before last day minus "
            r0.append(r1)
            byte r1 = r5.dom
            int r1 = -r1
            int r1 = r1 + -1
            r0.append(r1)
            java.lang.String r1 = " of "
            goto L_0x0044
        L_0x0063:
            java.lang.String r1 = " on or after "
            r0.append(r1)
        L_0x0068:
            j$.time.Month r1 = r5.month
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.append(r2)
            byte r1 = r5.dom
            r0.append(r1)
        L_0x0079:
            java.lang.String r1 = " at "
            r0.append(r1)
            boolean r1 = r5.timeEndOfDay
            if (r1 == 0) goto L_0x0085
            java.lang.String r1 = "24:00"
            goto L_0x008b
        L_0x0085:
            j$.time.LocalTime r1 = r5.time
            java.lang.String r1 = r1.toString()
        L_0x008b:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            j$.time.zone.ZoneOffsetTransitionRule$TimeDefinition r1 = r5.timeDefinition
            r0.append(r1)
            java.lang.String r1 = ", standard offset "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.standardOffset
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneOffsetTransitionRule.toString():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        int secondOfDay = this.timeEndOfDay ? 86400 : this.time.toSecondOfDay();
        int totalSeconds = this.standardOffset.getTotalSeconds();
        int totalSeconds2 = this.offsetBefore.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.offsetAfter.getTotalSeconds() - totalSeconds;
        int hour = secondOfDay % 3600 == 0 ? this.timeEndOfDay ? 24 : this.time.getHour() : 31;
        int i10 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i11 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i12 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.dow;
        dataOutput.writeInt((this.month.getValue() << 28) + ((this.dom + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.timeDefinition.ordinal() << 12) + (i10 << 4) + (i11 << 2) + i12);
        if (hour == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i10 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i11 == 3) {
            dataOutput.writeInt(this.offsetBefore.getTotalSeconds());
        }
        if (i12 == 3) {
            dataOutput.writeInt(this.offsetAfter.getTotalSeconds());
        }
    }
}
