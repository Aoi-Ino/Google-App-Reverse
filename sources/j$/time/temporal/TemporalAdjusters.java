package j$.time.temporal;

import j$.time.DayOfWeek;

public abstract class TemporalAdjusters {
    static /* synthetic */ Temporal lambda$nextOrSame$10(int i10, Temporal temporal) {
        int i11 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i11 == i10) {
            return temporal;
        }
        int i12 = i11 - i10;
        return temporal.plus((long) (i12 >= 0 ? 7 - i12 : -i12), ChronoUnit.DAYS);
    }

    static /* synthetic */ Temporal lambda$previousOrSame$12(int i10, Temporal temporal) {
        int i11 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i11 == i10) {
            return temporal;
        }
        int i12 = i10 - i11;
        return temporal.minus((long) (i12 >= 0 ? 7 - i12 : -i12), ChronoUnit.DAYS);
    }

    public static TemporalAdjuster lastDayOfMonth() {
        return new TemporalAdjusters$$ExternalSyntheticLambda12();
    }

    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        return new TemporalAdjusters$$ExternalSyntheticLambda11(dayOfWeek.getValue());
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        return new TemporalAdjusters$$ExternalSyntheticLambda3(dayOfWeek.getValue());
    }
}
