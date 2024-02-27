package j$.time.temporal;

public enum ChronoField implements TemporalField {
    NANO_OF_SECOND("NanoOfSecond", r13, r43, ValueRange.of(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r13, r3, ValueRange.of(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r4, r43, ValueRange.of(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r4, r21, ValueRange.of(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r4, r43, ValueRange.of(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r4, r21, ValueRange.of(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r43, r4, ValueRange.of(0, 59), "second"),
    SECOND_OF_DAY("SecondOfDay", r43, r3, ValueRange.of(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r4, r5, ValueRange.of(0, 59), "minute"),
    MINUTE_OF_DAY("MinuteOfDay", r4, r3, ValueRange.of(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r28, r29, ValueRange.of(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r28, r29, ValueRange.of(1, 12)),
    HOUR_OF_DAY("HourOfDay", r5, r3, ValueRange.of(0, 23), "hour"),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r5, r3, ValueRange.of(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r4, r27, ValueRange.of(0, 1), "dayperiod"),
    DAY_OF_WEEK("DayOfWeek", r27, r1, ValueRange.of(1, 7), "weekday"),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r3, r1, ValueRange.of(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r3, r1, ValueRange.of(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r3, r2, ValueRange.of(1, 28, 31), "day"),
    DAY_OF_YEAR("DayOfYear", r3, r4, ValueRange.of(1, 365, 366)),
    EPOCH_DAY("EpochDay", r3, r5, ValueRange.of(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r49, r2, ValueRange.of(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r49, r50, ValueRange.of(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r49, r50, ValueRange.of(1, 12), "month"),
    PROLEPTIC_MONTH("ProlepticMonth", r49, r50, ValueRange.of(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r49, r50, ValueRange.of(1, 999999999, 1000000000)),
    YEAR("Year", r49, r50, ValueRange.of(-999999999, 999999999), "year"),
    ERA("Era", ChronoUnit.ERAS, r50, ValueRange.of(0, 1), "era"),
    INSTANT_SECONDS("InstantSeconds", r43, r5, ValueRange.of(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r43, r5, ValueRange.of(-64800, 64800));
    
    private final TemporalUnit baseUnit;
    private final String displayNameKey;
    private final String name;
    private final ValueRange range;
    private final TemporalUnit rangeUnit;

    private ChronoField(String str, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange) {
        this.name = str;
        this.baseUnit = temporalUnit;
        this.rangeUnit = temporalUnit2;
        this.range = valueRange;
        this.displayNameKey = null;
    }

    private ChronoField(String str, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange, String str2) {
        this.name = str;
        this.baseUnit = temporalUnit;
        this.rangeUnit = temporalUnit2;
        this.range = valueRange;
        this.displayNameKey = str2;
    }

    public Temporal adjustInto(Temporal temporal, long j10) {
        return temporal.with(this, j10);
    }

    public int checkValidIntValue(long j10) {
        return range().checkValidIntValue(j10, this);
    }

    public long checkValidValue(long j10) {
        return range().checkValidValue(j10, this);
    }

    public long getFrom(TemporalAccessor temporalAccessor) {
        return temporalAccessor.getLong(this);
    }

    public boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
        return temporalAccessor.isSupported(this);
    }

    public boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public ValueRange range() {
        return this.range;
    }

    public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
        return temporalAccessor.range(this);
    }

    public String toString() {
        return this.name;
    }
}
