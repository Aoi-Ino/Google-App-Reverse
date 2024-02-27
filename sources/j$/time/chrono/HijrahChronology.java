package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class HijrahChronology extends AbstractChronology implements Serializable {
    public static final HijrahChronology INSTANCE;
    private static final long serialVersionUID = 3127340209035924785L;
    private final transient String calendarType;
    private transient int[] hijrahEpochMonthStartDays;
    private transient int hijrahStartEpochMonth;
    private volatile transient boolean initComplete;
    private transient int maxEpochDay;
    private transient int maxMonthLength;
    private transient int maxYearLength;
    private transient int minEpochDay;
    private transient int minMonthLength;
    private transient int minYearLength;
    private final transient String typeId;

    /* renamed from: j$.time.chrono.HijrahChronology$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
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
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.YEAR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x003e }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$java$time$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0049 }
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ERA     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.HijrahChronology.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        HijrahChronology hijrahChronology = new HijrahChronology("Hijrah-umalqura", "islamic-umalqura");
        INSTANCE = hijrahChronology;
        AbstractChronology.registerChrono(hijrahChronology, "Hijrah");
        AbstractChronology.registerChrono(hijrahChronology, "islamic");
    }

    private HijrahChronology(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("calendar id is empty");
        } else if (!str2.isEmpty()) {
            this.typeId = str;
            this.calendarType = str2;
        } else {
            throw new IllegalArgumentException("calendar typeId is empty");
        }
    }

    private void checkCalendarInit() {
        if (!this.initComplete) {
            loadCalendarData();
            this.initComplete = true;
        }
    }

    private int[] createEpochMonths(int i10, int i11, int i12, Map map) {
        int i13 = (((i12 - i11) + 1) * 12) + 1;
        int[] iArr = new int[i13];
        this.minMonthLength = Integer.MAX_VALUE;
        this.maxMonthLength = Integer.MIN_VALUE;
        int i14 = 0;
        for (int i15 = i11; i15 <= i12; i15++) {
            int[] iArr2 = (int[]) map.get(Integer.valueOf(i15));
            int i16 = 0;
            while (i16 < 12) {
                int i17 = iArr2[i16];
                int i18 = i14 + 1;
                iArr[i14] = i10;
                if (i17 < 29 || i17 > 32) {
                    throw new IllegalArgumentException("Invalid month length in year: " + i11);
                }
                i10 += i17;
                this.minMonthLength = Math.min(this.minMonthLength, i17);
                this.maxMonthLength = Math.max(this.maxMonthLength, i17);
                i16++;
                i14 = i18;
            }
        }
        int i19 = i14 + 1;
        iArr[i14] = i10;
        if (i19 == i13) {
            return iArr;
        }
        throw new IllegalStateException("Did not fill epochMonths exactly: ndx = " + i19 + " should be " + i13);
    }

    private int epochDayToEpochMonth(int i10) {
        int binarySearch = Arrays.binarySearch(this.hijrahEpochMonthStartDays, i10);
        return binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
    }

    private int epochMonthLength(int i10) {
        int[] iArr = this.hijrahEpochMonthStartDays;
        return iArr[i10 + 1] - iArr[i10];
    }

    private int epochMonthToEpochDay(int i10) {
        return this.hijrahEpochMonthStartDays[i10];
    }

    private int epochMonthToMonth(int i10) {
        return (i10 + this.hijrahStartEpochMonth) % 12;
    }

    private int epochMonthToYear(int i10) {
        return (i10 + this.hijrahStartEpochMonth) / 12;
    }

    private static int[][] hijrahUmalquraMonthLengths() {
        return new int[][]{new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{29, 30, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 29, 30, 30, 29, 30, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 29}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 30, 29}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 30, 30, 29, 30, 29, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 30, 29, 29}, new int[]{30, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30}, new int[]{29, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 29, 29, 30, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 30, 29, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 29, 30, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 29, 30, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 30, 29, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 29, 30}, new int[]{30, 29, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 29}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 29, 29, 30, 30, 30, 30, 29, 30}, new int[]{30, 29, 29, 30, 29, 29, 29, 30, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 29, 30}, new int[]{30, 29, 30, 30, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 30, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 29, 30, 30, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{29, 30, 30, 29, 30, 30, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 30, 30, 29, 30, 29, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 29, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 29, 30, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 29, 30, 29, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 29, 30, 29, 30, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 30}, new int[]{29, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 29, 30, 29, 30, 29, 29, 30, 30}, new int[]{29, 30, 30, 30, 29, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 30, 29, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 29, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 29, 30, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 29, 30, 29, 30, 30, 30, 30, 29}, new int[]{30, 29, 30, 29, 29, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{29, 30, 30, 29, 30, 29, 30, 30, 30, 29, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 30, 29, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 30, 29, 30, 29, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 29}, new int[]{30, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 29, 30, 29, 30, 29, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 30, 29, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 30, 29, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 30, 29, 29, 30, 29, 29, 29, 30, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 29, 30, 30, 30, 29, 30}};
    }

    private void loadCalendarData() {
        try {
            HashMap hashMap = new HashMap();
            int[][] hijrahUmalquraMonthLengths = hijrahUmalquraMonthLengths();
            int length = hijrahUmalquraMonthLengths.length + 1299;
            int epochDay = (int) LocalDate.of(1882, 11, 12).toEpochDay();
            int i10 = 1300;
            while (i10 <= length) {
                int[] iArr = hijrahUmalquraMonthLengths[i10 - 1300];
                if (iArr.length == 12) {
                    hashMap.put(Integer.valueOf(i10), iArr);
                    i10++;
                } else {
                    throw new IllegalArgumentException("wrong number of months on line: " + Arrays.toString(iArr) + "; count: " + iArr.length);
                }
            }
            if (!getId().equals("Hijrah-umalqura")) {
                throw new IllegalArgumentException("Configuration is for a different calendar: Hijrah-umalqura");
            } else if (!getCalendarType().equals("islamic-umalqura")) {
                throw new IllegalArgumentException("Configuration is for a different calendar type: islamic-umalqura");
            } else if (epochDay != 0) {
                this.hijrahStartEpochMonth = 15600;
                this.minEpochDay = epochDay;
                int[] createEpochMonths = createEpochMonths(epochDay, 1300, length, hashMap);
                this.hijrahEpochMonthStartDays = createEpochMonths;
                this.maxEpochDay = createEpochMonths[createEpochMonths.length - 1];
                for (int i11 = 1300; i11 < length; i11++) {
                    int yearLength = getYearLength(i11);
                    this.minYearLength = Math.min(this.minYearLength, yearLength);
                    this.maxYearLength = Math.max(this.maxYearLength, yearLength);
                }
            } else {
                throw new IllegalArgumentException("Configuration does not contain a ISO start date");
            }
        } catch (Exception e10) {
            throw new DateTimeException("Unable to initialize HijrahCalendar: " + this.typeId, e10);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private int yearMonthToDayOfYear(int i10, int i11) {
        int yearToEpochMonth = yearToEpochMonth(i10);
        return epochMonthToEpochDay(i11 + yearToEpochMonth) - epochMonthToEpochDay(yearToEpochMonth);
    }

    private int yearToEpochMonth(int i10) {
        return (i10 * 12) - this.hijrahStartEpochMonth;
    }

    /* access modifiers changed from: package-private */
    public void checkValidMonth(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new DateTimeException("Invalid Hijrah month: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public int checkValidYear(long j10) {
        if (j10 >= ((long) getMinimumYear()) && j10 <= ((long) getMaximumYear())) {
            return (int) j10;
        }
        throw new DateTimeException("Invalid Hijrah year: " + j10);
    }

    public HijrahDate date(int i10, int i11, int i12) {
        return HijrahDate.of(this, i10, i11, i12);
    }

    public HijrahDate date(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof HijrahDate ? (HijrahDate) temporalAccessor : HijrahDate.ofEpochDay(this, temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    public HijrahDate dateEpochDay(long j10) {
        return HijrahDate.ofEpochDay(this, j10);
    }

    public HijrahDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    public HijrahDate dateNow(Clock clock) {
        return date((TemporalAccessor) LocalDate.now(clock));
    }

    public HijrahDate dateYearDay(int i10, int i11) {
        HijrahDate of2 = HijrahDate.of(this, i10, 1, 1);
        if (i11 <= of2.lengthOfYear()) {
            return of2.plusDays((long) (i11 - 1));
        }
        throw new DateTimeException("Invalid dayOfYear: " + i11);
    }

    public HijrahEra eraOf(int i10) {
        if (i10 == 1) {
            return HijrahEra.AH;
        }
        throw new DateTimeException("invalid Hijrah era");
    }

    public List eras() {
        return Duration$DurationUnits$$ExternalSyntheticBackport1.m(HijrahEra.values());
    }

    public String getCalendarType() {
        return this.calendarType;
    }

    /* access modifiers changed from: package-private */
    public int getDayOfYear(int i10, int i11) {
        return yearMonthToDayOfYear(i10, i11 - 1);
    }

    /* access modifiers changed from: package-private */
    public long getEpochDay(int i10, int i11, int i12) {
        checkCalendarInit();
        checkValidMonth(i11);
        int yearToEpochMonth = yearToEpochMonth(i10) + (i11 - 1);
        if (yearToEpochMonth < 0 || yearToEpochMonth >= this.hijrahEpochMonthStartDays.length) {
            throw new DateTimeException("Invalid Hijrah date, year: " + i10 + ", month: " + i11);
        } else if (i12 >= 1 && i12 <= getMonthLength(i10, i11)) {
            return (long) (epochMonthToEpochDay(yearToEpochMonth) + (i12 - 1));
        } else {
            throw new DateTimeException("Invalid Hijrah day of month: " + i12);
        }
    }

    /* access modifiers changed from: package-private */
    public int[] getHijrahDateInfo(int i10) {
        checkCalendarInit();
        if (i10 < this.minEpochDay || i10 >= this.maxEpochDay) {
            throw new DateTimeException("Hijrah date out of range");
        }
        int epochDayToEpochMonth = epochDayToEpochMonth(i10);
        return new int[]{epochMonthToYear(epochDayToEpochMonth), epochMonthToMonth(epochDayToEpochMonth) + 1, (i10 - epochMonthToEpochDay(epochDayToEpochMonth)) + 1};
    }

    public String getId() {
        return this.typeId;
    }

    /* access modifiers changed from: package-private */
    public int getMaximumDayOfYear() {
        return this.maxYearLength;
    }

    /* access modifiers changed from: package-private */
    public int getMaximumMonthLength() {
        return this.maxMonthLength;
    }

    /* access modifiers changed from: package-private */
    public int getMaximumYear() {
        return epochMonthToYear(this.hijrahEpochMonthStartDays.length - 1) - 1;
    }

    /* access modifiers changed from: package-private */
    public int getMinimumMonthLength() {
        return this.minMonthLength;
    }

    /* access modifiers changed from: package-private */
    public int getMinimumYear() {
        return epochMonthToYear(0);
    }

    /* access modifiers changed from: package-private */
    public int getMonthLength(int i10, int i11) {
        int yearToEpochMonth = yearToEpochMonth(i10) + (i11 - 1);
        if (yearToEpochMonth >= 0 && yearToEpochMonth < this.hijrahEpochMonthStartDays.length) {
            return epochMonthLength(yearToEpochMonth);
        }
        throw new DateTimeException("Invalid Hijrah date, year: " + i10 + ", month: " + i11);
    }

    /* access modifiers changed from: package-private */
    public int getYearLength(int i10) {
        return yearMonthToDayOfYear(i10, 12);
    }

    public boolean isLeapYear(long j10) {
        checkCalendarInit();
        return j10 >= ((long) getMinimumYear()) && j10 <= ((long) getMaximumYear()) && getYearLength((int) j10) > 354;
    }

    public ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    public int prolepticYear(Era era, int i10) {
        if (era instanceof HijrahEra) {
            return i10;
        }
        throw new ClassCastException("Era must be HijrahEra");
    }

    public ValueRange range(ChronoField chronoField) {
        checkCalendarInit();
        if (!(chronoField instanceof ChronoField)) {
            return chronoField.range();
        }
        switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
                return ValueRange.of(1, 1, (long) getMinimumMonthLength(), (long) getMaximumMonthLength());
            case 2:
                return ValueRange.of(1, (long) getMaximumDayOfYear());
            case 3:
                return ValueRange.of(1, 5);
            case 4:
            case 5:
                return ValueRange.of((long) getMinimumYear(), (long) getMaximumYear());
            case 6:
                return ValueRange.of(1, 1);
            default:
                return chronoField.range();
        }
    }

    public HijrahDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (HijrahDate) super.resolveDate(map, resolverStyle);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return super.writeReplace();
    }

    public ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }
}
