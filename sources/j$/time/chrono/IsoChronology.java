package j$.time.chrono;

import j$.time.Clock;
import j$.time.DesugarLocalTime$$ExternalSyntheticBackport0;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.Year;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class IsoChronology extends AbstractChronology implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    private IsoChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public LocalDate date(int i10, int i11, int i12) {
        return LocalDate.of(i10, i11, i12);
    }

    public LocalDate date(TemporalAccessor temporalAccessor) {
        return LocalDate.from(temporalAccessor);
    }

    public LocalDate dateEpochDay(long j10) {
        return LocalDate.ofEpochDay(j10);
    }

    public LocalDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    public LocalDate dateNow(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        return date((TemporalAccessor) LocalDate.now(clock));
    }

    public LocalDate dateYearDay(int i10, int i11) {
        return LocalDate.ofYearDay(i10, i11);
    }

    public IsoEra eraOf(int i10) {
        return IsoEra.of(i10);
    }

    public List eras() {
        return Duration$DurationUnits$$ExternalSyntheticBackport1.m(IsoEra.values());
    }

    public String getCalendarType() {
        return "iso8601";
    }

    public String getId() {
        return "ISO";
    }

    public boolean isLeapYear(long j10) {
        return (3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0);
    }

    public LocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return LocalDateTime.from(temporalAccessor);
    }

    public int prolepticYear(Era era, int i10) {
        if (era instanceof IsoEra) {
            return era == IsoEra.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public ValueRange range(ChronoField chronoField) {
        return chronoField.range();
    }

    public LocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (LocalDate) super.resolveDate(map, resolverStyle);
    }

    /* access modifiers changed from: package-private */
    public void resolveProlepticMonth(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l10.longValue());
            }
            addFieldValue(map, ChronoField.MONTH_OF_YEAR, (long) (DesugarLocalTime$$ExternalSyntheticBackport0.m(l10.longValue(), 12) + 1));
            addFieldValue(map, ChronoField.YEAR, Math.floorDiv(l10.longValue(), (long) 12));
        }
    }

    /* access modifiers changed from: package-private */
    public LocalDate resolveYMD(Map map, ResolverStyle resolverStyle) {
        int i10;
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = chronoField.checkValidIntValue(((Long) map.remove(chronoField)).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1);
            return LocalDate.of(checkValidIntValue, 1, 1).plusMonths(subtractExact).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int checkValidIntValue2 = chronoField2.checkValidIntValue(((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int checkValidIntValue3 = chronoField3.checkValidIntValue(((Long) map.remove(chronoField3)).longValue());
        if (resolverStyle == ResolverStyle.SMART) {
            if (checkValidIntValue2 == 4 || checkValidIntValue2 == 6 || checkValidIntValue2 == 9 || checkValidIntValue2 == 11) {
                i10 = 30;
            } else if (checkValidIntValue2 == 2) {
                i10 = Month.FEBRUARY.length(Year.isLeap((long) checkValidIntValue));
            }
            checkValidIntValue3 = Math.min(checkValidIntValue3, i10);
        }
        return LocalDate.of(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r11 > 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.LocalDate resolveYearOfEra(java.util.Map r10, j$.time.format.ResolverStyle r11) {
        /*
            r9 = this;
            j$.time.temporal.ChronoField r0 = j$.time.temporal.ChronoField.YEAR_OF_ERA
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x009b
            j$.time.format.ResolverStyle r2 = j$.time.format.ResolverStyle.LENIENT
            if (r11 == r2) goto L_0x0015
            long r2 = r1.longValue()
            r0.checkValidValue(r2)
        L_0x0015:
            j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.ERA
            java.lang.Object r2 = r10.remove(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L_0x005f
            j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.YEAR
            java.lang.Object r7 = r10.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            j$.time.format.ResolverStyle r8 = j$.time.format.ResolverStyle.STRICT
            if (r11 != r8) goto L_0x004a
            if (r7 == 0) goto L_0x0046
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            long r0 = r1.longValue()
            if (r11 <= 0) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            long r0 = java.lang.Math.subtractExact(r5, r0)
        L_0x0042:
            r9.addFieldValue(r10, r2, r0)
            goto L_0x00b0
        L_0x0046:
            r10.put(r0, r1)
            goto L_0x00b0
        L_0x004a:
            if (r7 == 0) goto L_0x005a
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            long r0 = r1.longValue()
            goto L_0x003e
        L_0x005a:
            long r0 = r1.longValue()
            goto L_0x0042
        L_0x005f:
            long r7 = r2.longValue()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0071
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.YEAR
            long r0 = r1.longValue()
        L_0x006d:
            r9.addFieldValue(r10, r11, r0)
            goto L_0x00b0
        L_0x0071:
            long r7 = r2.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0084
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.YEAR
            long r0 = r1.longValue()
            long r0 = java.lang.Math.subtractExact(r5, r0)
            goto L_0x006d
        L_0x0084:
            j$.time.DateTimeException r10 = new j$.time.DateTimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid value for era: "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x009b:
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.ERA
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r10 = r10.get(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            r11.checkValidValue(r0)
        L_0x00b0:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.IsoChronology.resolveYearOfEra(java.util.Map, j$.time.format.ResolverStyle):j$.time.LocalDate");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return super.writeReplace();
    }

    public ZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }
}
