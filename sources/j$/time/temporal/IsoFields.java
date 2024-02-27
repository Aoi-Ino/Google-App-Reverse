package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Duration;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import java.util.Map;

public abstract class IsoFields {
    public static final TemporalField DAY_OF_QUARTER = Field.DAY_OF_QUARTER;
    public static final TemporalField QUARTER_OF_YEAR = Field.QUARTER_OF_YEAR;
    public static final TemporalUnit QUARTER_YEARS = Unit.QUARTER_YEARS;
    public static final TemporalField WEEK_BASED_YEAR = Field.WEEK_BASED_YEAR;
    public static final TemporalUnit WEEK_BASED_YEARS = Unit.WEEK_BASED_YEARS;
    public static final TemporalField WEEK_OF_WEEK_BASED_YEAR = Field.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: j$.time.temporal.IsoFields$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$IsoFields$Unit;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                j$.time.temporal.IsoFields$Unit[] r0 = j$.time.temporal.IsoFields.Unit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$java$time$temporal$IsoFields$Unit = r0
                j$.time.temporal.IsoFields$Unit r1 = j$.time.temporal.IsoFields.Unit.WEEK_BASED_YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$java$time$temporal$IsoFields$Unit     // Catch:{ NoSuchFieldError -> 0x001d }
                j$.time.temporal.IsoFields$Unit r1 = j$.time.temporal.IsoFields.Unit.QUARTER_YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.temporal.IsoFields.AnonymousClass1.<clinit>():void");
        }
    }

    private enum Field implements TemporalField {
        DAY_OF_QUARTER((String) null) {
            public Temporal adjustInto(Temporal temporal, long j10) {
                long from = getFrom(temporal);
                range().checkValidValue(j10, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.with(chronoField, temporal.getLong(chronoField) + (j10 - from));
            }

            public long getFrom(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return (long) (temporalAccessor.get(ChronoField.DAY_OF_YEAR) - Field.QUARTER_DAYS[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? 4 : 0)]);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR) && temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && temporalAccessor.isSupported(ChronoField.YEAR) && IsoFields.isIso(temporalAccessor);
            }

            public ValueRange range() {
                return ValueRange.of(1, 90, 92);
            }

            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    long j10 = temporalAccessor.getLong(Field.QUARTER_OF_YEAR);
                    if (j10 != 1) {
                        return j10 == 2 ? ValueRange.of(1, 91) : (j10 == 3 || j10 == 4) ? ValueRange.of(1, 92) : range();
                    }
                    return IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? ValueRange.of(1, 91) : ValueRange.of(1, 90);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            public ChronoLocalDate resolve(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
                LocalDate localDate;
                long j10;
                ChronoField chronoField = ChronoField.YEAR;
                Long l10 = (Long) map.get(chronoField);
                Field field = Field.QUARTER_OF_YEAR;
                Long l11 = (Long) map.get(field);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int checkValidIntValue = chronoField.checkValidIntValue(l10.longValue());
                long longValue = ((Long) map.get(Field.DAY_OF_QUARTER)).longValue();
                Field.ensureIso(temporalAccessor);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    localDate = LocalDate.of(checkValidIntValue, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l11.longValue(), 1), (long) 3));
                    j10 = Math.subtractExact(longValue, 1);
                } else {
                    localDate = LocalDate.of(checkValidIntValue, ((field.range().checkValidIntValue(l11.longValue(), field) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        (resolverStyle == ResolverStyle.STRICT ? rangeRefinedBy(localDate) : range()).checkValidValue(longValue, this);
                    }
                    j10 = longValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(field);
                return localDate.plusDays(j10);
            }

            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR((String) null) {
            public Temporal adjustInto(Temporal temporal, long j10) {
                long from = getFrom(temporal);
                range().checkValidValue(j10, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.with(chronoField, temporal.getLong(chronoField) + ((j10 - from) * 3));
            }

            public long getFrom(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return (temporalAccessor.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && IsoFields.isIso(temporalAccessor);
            }

            public ValueRange range() {
                return ValueRange.of(1, 4);
            }

            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return super.rangeRefinedBy(temporalAccessor);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR((String) null) {
            public Temporal adjustInto(Temporal temporal, long j10) {
                range().checkValidValue(j10, this);
                return temporal.plus(Math.subtractExact(j10, getFrom(temporal)), ChronoUnit.WEEKS);
            }

            public long getFrom(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return (long) Field.getWeek(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && IsoFields.isIso(temporalAccessor);
            }

            public ValueRange range() {
                return ValueRange.of(1, 52, 53);
            }

            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return Field.getWeekRange(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public ChronoLocalDate resolve(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
                LocalDate localDate;
                long j10;
                long j11;
                Map map2 = map;
                ResolverStyle resolverStyle2 = resolverStyle;
                Field field = Field.WEEK_BASED_YEAR;
                Long l10 = (Long) map2.get(field);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l11 = (Long) map2.get(chronoField);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int checkValidIntValue = field.range().checkValidIntValue(l10.longValue(), field);
                long longValue = ((Long) map2.get(Field.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                Field.ensureIso(temporalAccessor);
                LocalDate of2 = LocalDate.of(checkValidIntValue, 1, 4);
                if (resolverStyle2 == ResolverStyle.LENIENT) {
                    long longValue2 = l11.longValue();
                    if (longValue2 > 7) {
                        j11 = longValue2 - 1;
                        of2 = of2.plusWeeks(j11 / 7);
                    } else {
                        j10 = 1;
                        if (longValue2 < 1) {
                            of2 = of2.plusWeeks(Math.subtractExact(longValue2, 7) / 7);
                            j11 = longValue2 + 6;
                        }
                        localDate = of2.plusWeeks(Math.subtractExact(longValue, j10)).with((TemporalField) chronoField, longValue2);
                    }
                    j10 = 1;
                    longValue2 = (j11 % 7) + 1;
                    localDate = of2.plusWeeks(Math.subtractExact(longValue, j10)).with((TemporalField) chronoField, longValue2);
                } else {
                    int checkValidIntValue2 = chronoField.checkValidIntValue(l11.longValue());
                    if (longValue < 1 || longValue > 52) {
                        (resolverStyle2 == ResolverStyle.STRICT ? Field.getWeekRange(of2) : range()).checkValidValue(longValue, this);
                    }
                    localDate = of2.plusWeeks(longValue - 1).with((TemporalField) chronoField, (long) checkValidIntValue2);
                }
                map2.remove(this);
                map2.remove(field);
                map2.remove(chronoField);
                return localDate;
            }

            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR((String) null) {
            public Temporal adjustInto(Temporal temporal, long j10) {
                if (isSupportedBy(temporal)) {
                    int checkValidIntValue = range().checkValidIntValue(j10, Field.WEEK_BASED_YEAR);
                    LocalDate from = LocalDate.from(temporal);
                    ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                    int i10 = from.get(chronoField);
                    int r72 = Field.getWeek(from);
                    if (r72 == 53 && Field.getWeekRange(checkValidIntValue) == 52) {
                        r72 = 52;
                    }
                    LocalDate of2 = LocalDate.of(checkValidIntValue, 1, 4);
                    return temporal.with(of2.plusDays((long) ((i10 - of2.get(chronoField)) + ((r72 - 1) * 7))));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public long getFrom(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return (long) Field.getWeekBasedYear(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && IsoFields.isIso(temporalAccessor);
            }

            public ValueRange range() {
                return ChronoField.YEAR.range();
            }

            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return super.rangeRefinedBy(temporalAccessor);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public String toString() {
                return "WeekBasedYear";
            }
        };
        
        /* access modifiers changed from: private */
        public static final int[] QUARTER_DAYS = null;

        static {
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        /* access modifiers changed from: private */
        public static void ensureIso(TemporalAccessor temporalAccessor) {
            if (!IsoFields.isIso(temporalAccessor)) {
                throw new DateTimeException("Resolve requires IsoChronology");
            }
        }

        /* access modifiers changed from: private */
        public static int getWeek(LocalDate localDate) {
            int ordinal = localDate.getDayOfWeek().ordinal();
            int dayOfYear = localDate.getDayOfYear() - 1;
            int i10 = (3 - ordinal) + dayOfYear;
            int i11 = i10 - ((i10 / 7) * 7);
            int i12 = i11 - 3;
            if (i12 < -3) {
                i12 = i11 + 4;
            }
            if (dayOfYear < i12) {
                return (int) getWeekRange(localDate.withDayOfYear(180).minusYears(1)).getMaximum();
            }
            int i13 = ((dayOfYear - i12) / 7) + 1;
            if (i13 != 53 || i12 == -3 || (i12 == -2 && localDate.isLeapYear())) {
                return i13;
            }
            return 1;
        }

        /* access modifiers changed from: private */
        public static int getWeekBasedYear(LocalDate localDate) {
            int year = localDate.getYear();
            int dayOfYear = localDate.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
            }
            if (dayOfYear < 363) {
                return year;
            }
            return ((dayOfYear - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }

        /* access modifiers changed from: private */
        public static int getWeekRange(int i10) {
            LocalDate of2 = LocalDate.of(i10, 1, 1);
            if (of2.getDayOfWeek() != DayOfWeek.THURSDAY) {
                return (of2.getDayOfWeek() != DayOfWeek.WEDNESDAY || !of2.isLeapYear()) ? 52 : 53;
            }
            return 53;
        }

        /* access modifiers changed from: private */
        public static ValueRange getWeekRange(LocalDate localDate) {
            return ValueRange.of(1, (long) getWeekRange(getWeekBasedYear(localDate)));
        }

        public boolean isDateBased() {
            return true;
        }

        public boolean isTimeBased() {
            return false;
        }

        public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
            return range();
        }
    }

    private enum Unit implements TemporalUnit {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));
        
        private final Duration duration;
        private final String name;

        private Unit(String str, Duration duration2) {
            this.name = str;
            this.duration = duration2;
        }

        public Temporal addTo(Temporal temporal, long j10) {
            int i10 = AnonymousClass1.$SwitchMap$java$time$temporal$IsoFields$Unit[ordinal()];
            if (i10 == 1) {
                TemporalField temporalField = IsoFields.WEEK_BASED_YEAR;
                return temporal.with(temporalField, Math.addExact((long) temporal.get(temporalField), j10));
            } else if (i10 == 2) {
                return temporal.plus(j10 / 4, ChronoUnit.YEARS).plus((j10 % 4) * 3, ChronoUnit.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public boolean isDateBased() {
            return true;
        }

        public String toString() {
            return this.name;
        }
    }

    static boolean isIso(TemporalAccessor temporalAccessor) {
        return Chronology.from(temporalAccessor).equals(IsoChronology.INSTANCE);
    }
}
