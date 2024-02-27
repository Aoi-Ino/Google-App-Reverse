package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneId$$ExternalSyntheticBackport0;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.Era;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeTextProvider;
import j$.time.temporal.ChronoField;
import j$.time.temporal.IsoFields;
import j$.time.temporal.JulianFields;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.ValueRange;
import j$.time.temporal.WeekFields;
import j$.time.zone.ZoneRulesProvider;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class DateTimeFormatterBuilder {
    private static final Map FIELD_MAP;
    static final Comparator LENGTH_SORT = new Comparator() {
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    };
    private static final TemporalQuery QUERY_REGION_ONLY = new DateTimeFormatterBuilder$$ExternalSyntheticLambda0();
    private DateTimeFormatterBuilder active;
    private final boolean optional;
    private char padNextChar;
    private int padNextWidth;
    private final DateTimeFormatterBuilder parent;
    private final List printerParsers;
    private int valueParserIndex;

    /* renamed from: j$.time.format.DateTimeFormatterBuilder$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$java$time$format$SignStyle;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                j$.time.format.SignStyle[] r0 = j$.time.format.SignStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$java$time$format$SignStyle = r0
                j$.time.format.SignStyle r1 = j$.time.format.SignStyle.EXCEEDS_PAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$java$time$format$SignStyle     // Catch:{ NoSuchFieldError -> 0x001d }
                j$.time.format.SignStyle r1 = j$.time.format.SignStyle.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$java$time$format$SignStyle     // Catch:{ NoSuchFieldError -> 0x0028 }
                j$.time.format.SignStyle r1 = j$.time.format.SignStyle.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$java$time$format$SignStyle     // Catch:{ NoSuchFieldError -> 0x0033 }
                j$.time.format.SignStyle r1 = j$.time.format.SignStyle.NOT_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.AnonymousClass3.<clinit>():void");
        }
    }

    static final class CharLiteralPrinterParser implements DateTimePrinterParser {
        private final char literal;

        CharLiteralPrinterParser(char c10) {
            this.literal = c10;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            sb2.append(this.literal);
            return true;
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            if (i10 == charSequence.length()) {
                return ~i10;
            }
            char charAt = charSequence.charAt(i10);
            return (charAt == this.literal || (!dateTimeParseContext.isCaseSensitive() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.literal) || Character.toLowerCase(charAt) == Character.toLowerCase(this.literal)))) ? i10 + 1 : ~i10;
        }

        public String toString() {
            char c10 = this.literal;
            if (c10 == '\'') {
                return "''";
            }
            return "'" + c10 + "'";
        }
    }

    static final class CompositePrinterParser implements DateTimePrinterParser {
        private final boolean optional;
        private final DateTimePrinterParser[] printerParsers;

        CompositePrinterParser(List list, boolean z10) {
            this((DateTimePrinterParser[]) list.toArray(new DateTimePrinterParser[list.size()]), z10);
        }

        CompositePrinterParser(DateTimePrinterParser[] dateTimePrinterParserArr, boolean z10) {
            this.printerParsers = dateTimePrinterParserArr;
            this.optional = z10;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            int length = sb2.length();
            if (this.optional) {
                dateTimePrintContext.startOptional();
            }
            try {
                for (DateTimePrinterParser format : this.printerParsers) {
                    if (!format.format(dateTimePrintContext, sb2)) {
                        sb2.setLength(length);
                        return true;
                    }
                }
                if (this.optional) {
                    dateTimePrintContext.endOptional();
                }
                return true;
            } finally {
                if (this.optional) {
                    dateTimePrintContext.endOptional();
                }
            }
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            if (this.optional) {
                dateTimeParseContext.startOptional();
                int i11 = i10;
                for (DateTimePrinterParser parse : this.printerParsers) {
                    i11 = parse.parse(dateTimeParseContext, charSequence, i11);
                    if (i11 < 0) {
                        dateTimeParseContext.endOptional(false);
                        return i10;
                    }
                }
                dateTimeParseContext.endOptional(true);
                return i11;
            }
            for (DateTimePrinterParser parse2 : this.printerParsers) {
                i10 = parse2.parse(dateTimeParseContext, charSequence, i10);
                if (i10 < 0) {
                    break;
                }
            }
            return i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.printerParsers != null) {
                sb2.append(this.optional ? "[" : "(");
                for (DateTimePrinterParser append : this.printerParsers) {
                    sb2.append(append);
                }
                sb2.append(this.optional ? "]" : ")");
            }
            return sb2.toString();
        }

        public CompositePrinterParser withOptional(boolean z10) {
            return z10 == this.optional ? this : new CompositePrinterParser(this.printerParsers, z10);
        }
    }

    interface DateTimePrinterParser {
        boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2);

        int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10);
    }

    static final class FractionPrinterParser extends NumberPrinterParser {
        private final boolean decimalPoint;

        FractionPrinterParser(TemporalField temporalField, int i10, int i11, boolean z10) {
            this(temporalField, i10, i11, z10, 0);
            Objects.requireNonNull(temporalField, "field");
            if (!temporalField.range().isFixed()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + temporalField);
            } else if (i10 < 0 || i10 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
            } else if (i11 < 1 || i11 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
            } else if (i11 < i10) {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
            }
        }

        FractionPrinterParser(TemporalField temporalField, int i10, int i11, boolean z10, int i12) {
            super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i12);
            this.decimalPoint = z10;
        }

        private long convertFromFraction(BigDecimal bigDecimal) {
            ValueRange range = this.field.range();
            BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
            return bigDecimal.multiply(BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        private BigDecimal convertToFraction(long j10) {
            ValueRange range = this.field.range();
            range.checkValidValue(j10, this.field);
            BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
            BigDecimal divide = BigDecimal.valueOf(j10).subtract(valueOf).divide(BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return divide.compareTo(bigDecimal) == 0 ? bigDecimal : divide.stripTrailingZeros();
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue(this.field);
            if (value == null) {
                return false;
            }
            DecimalStyle decimalStyle = dateTimePrintContext.getDecimalStyle();
            BigDecimal convertToFraction = convertToFraction(value.longValue());
            if (convertToFraction.scale() != 0) {
                String convertNumberToI18N = decimalStyle.convertNumberToI18N(convertToFraction.setScale(Math.min(Math.max(convertToFraction.scale(), this.minWidth), this.maxWidth), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.decimalPoint) {
                    sb2.append(decimalStyle.getDecimalSeparator());
                }
                sb2.append(convertNumberToI18N);
                return true;
            } else if (this.minWidth <= 0) {
                return true;
            } else {
                if (this.decimalPoint) {
                    sb2.append(decimalStyle.getDecimalSeparator());
                }
                for (int i10 = 0; i10 < this.minWidth; i10++) {
                    sb2.append(decimalStyle.getZeroDigit());
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isFixedWidth(DateTimeParseContext dateTimeParseContext) {
            return dateTimeParseContext.isStrict() && this.minWidth == this.maxWidth && !this.decimalPoint;
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int i11 = 0;
            int i12 = (dateTimeParseContext.isStrict() || isFixedWidth(dateTimeParseContext)) ? this.minWidth : 0;
            int i13 = (dateTimeParseContext.isStrict() || isFixedWidth(dateTimeParseContext)) ? this.maxWidth : 9;
            int length = charSequence.length();
            if (i10 == length) {
                return i12 > 0 ? ~i10 : i10;
            }
            if (this.decimalPoint) {
                if (charSequence.charAt(i10) != dateTimeParseContext.getDecimalStyle().getDecimalSeparator()) {
                    return i12 > 0 ? ~i10 : i10;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = i12 + i14;
            if (i15 > length) {
                return ~i14;
            }
            int min = Math.min(i13 + i14, length);
            int i16 = i14;
            while (true) {
                if (i16 >= min) {
                    break;
                }
                int i17 = i16 + 1;
                int convertToDigit = dateTimeParseContext.getDecimalStyle().convertToDigit(charSequence.charAt(i16));
                if (convertToDigit >= 0) {
                    i11 = (i11 * 10) + convertToDigit;
                    i16 = i17;
                } else if (i17 < i15) {
                    return ~i14;
                }
            }
            return dateTimeParseContext.setParsedField(this.field, convertFromFraction(new BigDecimal(i11).movePointLeft(i16 - i14)), i14, i16);
        }

        public String toString() {
            String str = this.decimalPoint ? ",DecimalPoint" : "";
            TemporalField temporalField = this.field;
            int i10 = this.minWidth;
            int i11 = this.maxWidth;
            return "Fraction(" + temporalField + "," + i10 + "," + i11 + str + ")";
        }

        /* access modifiers changed from: package-private */
        public FractionPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new FractionPrinterParser(this.field, this.minWidth, this.maxWidth, this.decimalPoint, -1);
        }

        /* access modifiers changed from: package-private */
        public FractionPrinterParser withSubsequentWidth(int i10) {
            return new FractionPrinterParser(this.field, this.minWidth, this.maxWidth, this.decimalPoint, this.subsequentWidth + i10);
        }
    }

    static final class InstantPrinterParser implements DateTimePrinterParser {
        private final int fractionalDigits;

        InstantPrinterParser(int i10) {
            this.fractionalDigits = i10;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            Long value = dateTimePrintContext.getValue((TemporalField) ChronoField.INSTANT_SECONDS);
            TemporalAccessor temporal = dateTimePrintContext.getTemporal();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            Long valueOf = temporal.isSupported(chronoField) ? Long.valueOf(dateTimePrintContext.getTemporal().getLong(chronoField)) : null;
            int i10 = 0;
            if (value == null) {
                return false;
            }
            long longValue = value.longValue();
            int checkValidIntValue = chronoField.checkValidIntValue(valueOf != null ? valueOf.longValue() : 0);
            if (longValue >= -62167219200L) {
                long j10 = longValue - 253402300800L;
                long floorDiv = 1 + Math.floorDiv(j10, 315569520000L);
                LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(Math.floorMod(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                if (floorDiv > 0) {
                    sb3.append('+');
                    sb3.append(floorDiv);
                }
                sb3.append(ofEpochSecond);
                if (ofEpochSecond.getSecond() == 0) {
                    sb3.append(":00");
                }
            } else {
                long j11 = longValue + 62167219200L;
                long j12 = j11 / 315569520000L;
                long j13 = j11 % 315569520000L;
                LocalDateTime ofEpochSecond2 = LocalDateTime.ofEpochSecond(j13 - 62167219200L, 0, ZoneOffset.UTC);
                int length = sb2.length();
                sb3.append(ofEpochSecond2);
                if (ofEpochSecond2.getSecond() == 0) {
                    sb3.append(":00");
                }
                if (j12 < 0) {
                    if (ofEpochSecond2.getYear() == -10000) {
                        sb3.replace(length, length + 2, Long.toString(j12 - 1));
                    } else if (j13 == 0) {
                        sb3.insert(length, j12);
                    } else {
                        sb3.insert(length + 1, Math.abs(j12));
                    }
                }
            }
            int i11 = this.fractionalDigits;
            if ((i11 < 0 && checkValidIntValue > 0) || i11 > 0) {
                sb3.append('.');
                int i12 = 100000000;
                while (true) {
                    int i13 = this.fractionalDigits;
                    if ((i13 != -1 || checkValidIntValue <= 0) && ((i13 != -2 || (checkValidIntValue <= 0 && i10 % 3 == 0)) && i10 >= i13)) {
                        break;
                    }
                    int i14 = checkValidIntValue / i12;
                    sb3.append((char) (i14 + 48));
                    checkValidIntValue -= i14 * i12;
                    i12 /= 10;
                    i10++;
                }
            }
            sb3.append('Z');
            return true;
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            int i13 = i10;
            int i14 = this.fractionalDigits;
            int i15 = 0;
            int i16 = i14 < 0 ? 0 : i14;
            if (i14 < 0) {
                i14 = 9;
            }
            DateTimeFormatterBuilder appendLiteral = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T');
            ChronoField chronoField = ChronoField.HOUR_OF_DAY;
            DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField, 2).appendLiteral(':');
            ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
            DateTimeFormatterBuilder appendLiteral3 = appendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
            ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
            DateTimeFormatterBuilder appendValue = appendLiteral3.appendValue(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
            CompositePrinterParser printerParser = appendValue.appendFraction(chronoField4, i16, i14, true).appendLiteral('Z').toFormatter().toPrinterParser(false);
            DateTimeParseContext copy = dateTimeParseContext.copy();
            int parse = printerParser.parse(copy, charSequence, i13);
            if (parse < 0) {
                return parse;
            }
            long longValue = copy.getParsed(ChronoField.YEAR).longValue();
            int intValue = copy.getParsed(ChronoField.MONTH_OF_YEAR).intValue();
            int intValue2 = copy.getParsed(ChronoField.DAY_OF_MONTH).intValue();
            int intValue3 = copy.getParsed(chronoField).intValue();
            int intValue4 = copy.getParsed(chronoField2).intValue();
            Long parsed = copy.getParsed(chronoField3);
            Long parsed2 = copy.getParsed(chronoField4);
            int intValue5 = parsed != null ? parsed.intValue() : 0;
            int intValue6 = parsed2 != null ? parsed2.intValue() : 0;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i12 = 0;
                i11 = intValue5;
                i15 = 1;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                dateTimeParseContext.setParsedLeapSecond();
                i12 = intValue3;
                i11 = 59;
            } else {
                i12 = intValue3;
                i11 = intValue5;
            }
            try {
                DateTimeParseContext dateTimeParseContext2 = dateTimeParseContext;
                int i17 = i10;
                return dateTimeParseContext2.setParsedField(chronoField4, (long) intValue6, i17, dateTimeParseContext2.setParsedField(ChronoField.INSTANT_SECONDS, Math.multiplyExact(longValue / 10000, 315569520000L) + LocalDateTime.of(((int) longValue) % 10000, intValue, intValue2, i12, intValue4, i11, 0).plusDays((long) i15).toEpochSecond(ZoneOffset.UTC), i17, parse));
            } catch (RuntimeException unused) {
                return ~i13;
            }
        }

        public String toString() {
            return "Instant()";
        }
    }

    static final class LocalizedOffsetIdPrinterParser implements DateTimePrinterParser {
        private final TextStyle style;

        LocalizedOffsetIdPrinterParser(TextStyle textStyle) {
            this.style = textStyle;
        }

        private static StringBuilder appendHMS(StringBuilder sb2, int i10) {
            sb2.append((char) ((i10 / 10) + 48));
            sb2.append((char) ((i10 % 10) + 48));
            return sb2;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue((TemporalField) ChronoField.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            sb2.append("GMT");
            int intExact = Math.toIntExact(value.longValue());
            if (intExact == 0) {
                return true;
            }
            int abs = Math.abs((intExact / 3600) % 100);
            int abs2 = Math.abs((intExact / 60) % 60);
            int abs3 = Math.abs(intExact % 60);
            sb2.append(intExact < 0 ? "-" : "+");
            if (this.style == TextStyle.FULL) {
                appendHMS(sb2, abs);
                sb2.append(':');
                appendHMS(sb2, abs2);
                if (abs3 == 0) {
                    return true;
                }
            } else {
                if (abs >= 10) {
                    sb2.append((char) ((abs / 10) + 48));
                }
                sb2.append((char) ((abs % 10) + 48));
                if (abs2 == 0 && abs3 == 0) {
                    return true;
                }
                sb2.append(':');
                appendHMS(sb2, abs2);
                if (abs3 == 0) {
                    return true;
                }
            }
            sb2.append(':');
            appendHMS(sb2, abs3);
            return true;
        }

        /* access modifiers changed from: package-private */
        public int getDigit(CharSequence charSequence, int i10) {
            char charAt = charSequence.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return -1;
            }
            return charAt - '0';
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int length = charSequence.length();
            if (!dateTimeParseContext.subSequenceEquals(charSequence, i10, "GMT", 0, 3)) {
                return ~i10;
            }
            int i17 = i10 + 3;
            if (i17 == length) {
                return dateTimeParseContext.setParsedField(ChronoField.OFFSET_SECONDS, 0, i10, i17);
            }
            char charAt = charSequence.charAt(i17);
            if (charAt == '+') {
                i11 = 1;
            } else if (charAt == '-') {
                i11 = -1;
            } else {
                return dateTimeParseContext.setParsedField(ChronoField.OFFSET_SECONDS, 0, i10, i17);
            }
            int i18 = i10 + 4;
            int i19 = 0;
            if (this.style == TextStyle.FULL) {
                int digit = getDigit(charSequence, i18);
                int i20 = i10 + 6;
                int digit2 = getDigit(charSequence, i10 + 5);
                if (digit >= 0 && digit2 >= 0) {
                    int i21 = i10 + 7;
                    if (charSequence.charAt(i20) == ':') {
                        i14 = (digit * 10) + digit2;
                        int digit3 = getDigit(charSequence, i21);
                        i16 = i10 + 9;
                        int digit4 = getDigit(charSequence, i10 + 8);
                        if (digit3 < 0 || digit4 < 0) {
                            return ~i10;
                        }
                        i15 = (digit3 * 10) + digit4;
                        int i22 = i10 + 11;
                        if (i22 < length && charSequence.charAt(i16) == ':') {
                            int digit5 = getDigit(charSequence, i10 + 10);
                            int digit6 = getDigit(charSequence, i22);
                            if (digit5 >= 0 && digit6 >= 0) {
                                i19 = (digit5 * 10) + digit6;
                                i16 = i10 + 12;
                            }
                        }
                    }
                }
                return ~i10;
            }
            int i23 = i10 + 5;
            i14 = getDigit(charSequence, i18);
            if (i14 < 0) {
                return ~i10;
            }
            if (i23 < length) {
                int digit7 = getDigit(charSequence, i23);
                if (digit7 >= 0) {
                    i14 = (i14 * 10) + digit7;
                    i23 = i10 + 6;
                }
                int i24 = i23 + 2;
                if (i24 < length && charSequence.charAt(i23) == ':' && i24 < length && charSequence.charAt(i23) == ':') {
                    int digit8 = getDigit(charSequence, i23 + 1);
                    int digit9 = getDigit(charSequence, i24);
                    if (digit8 >= 0 && digit9 >= 0) {
                        i15 = (digit8 * 10) + digit9;
                        int i25 = i23 + 3;
                        int i26 = i23 + 5;
                        if (i26 < length && charSequence.charAt(i25) == ':') {
                            int digit10 = getDigit(charSequence, i23 + 4);
                            int digit11 = getDigit(charSequence, i26);
                            if (digit10 >= 0 && digit11 >= 0) {
                                i19 = (digit10 * 10) + digit11;
                                i16 = i23 + 6;
                            }
                        }
                        i13 = i25;
                        i12 = 0;
                        i19 = i15;
                        return dateTimeParseContext.setParsedField(ChronoField.OFFSET_SECONDS, ((long) i11) * ((((long) i14) * 3600) + (((long) i19) * 60) + ((long) i12)), i10, i13);
                    }
                }
            }
            i12 = 0;
            i13 = i23;
            return dateTimeParseContext.setParsedField(ChronoField.OFFSET_SECONDS, ((long) i11) * ((((long) i14) * 3600) + (((long) i19) * 60) + ((long) i12)), i10, i13);
            i12 = i19;
            i13 = i16;
            i19 = i15;
            return dateTimeParseContext.setParsedField(ChronoField.OFFSET_SECONDS, ((long) i11) * ((((long) i14) * 3600) + (((long) i19) * 60) + ((long) i12)), i10, i13);
        }

        public String toString() {
            TextStyle textStyle = this.style;
            return "LocalizedOffset(" + textStyle + ")";
        }
    }

    static class NumberPrinterParser implements DateTimePrinterParser {
        static final long[] EXCEED_POINTS = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
        final TemporalField field;
        final int maxWidth;
        final int minWidth;
        /* access modifiers changed from: private */
        public final SignStyle signStyle;
        final int subsequentWidth;

        NumberPrinterParser(TemporalField temporalField, int i10, int i11, SignStyle signStyle2) {
            this.field = temporalField;
            this.minWidth = i10;
            this.maxWidth = i11;
            this.signStyle = signStyle2;
            this.subsequentWidth = 0;
        }

        protected NumberPrinterParser(TemporalField temporalField, int i10, int i11, SignStyle signStyle2, int i12) {
            this.field = temporalField;
            this.minWidth = i10;
            this.maxWidth = i11;
            this.signStyle = signStyle2;
            this.subsequentWidth = i12;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[LOOP:0: B:30:0x00a1->B:32:0x00aa, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean format(j$.time.format.DateTimePrintContext r11, java.lang.StringBuilder r12) {
            /*
                r10 = this;
                j$.time.temporal.TemporalField r0 = r10.field
                java.lang.Long r0 = r11.getValue((j$.time.temporal.TemporalField) r0)
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                long r2 = r0.longValue()
                long r2 = r10.getValue(r11, r2)
                j$.time.format.DecimalStyle r11 = r11.getDecimalStyle()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x001f
                java.lang.String r0 = "9223372036854775808"
                goto L_0x0027
            L_0x001f:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L_0x0027:
                int r4 = r0.length()
                int r5 = r10.maxWidth
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto L_0x00b8
                java.lang.String r0 = r11.convertNumberToI18N(r0)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 2
                r8 = 1
                if (r4 < 0) goto L_0x0065
                int[] r4 = j$.time.format.DateTimeFormatterBuilder.AnonymousClass3.$SwitchMap$java$time$format$SignStyle
                j$.time.format.SignStyle r6 = r10.signStyle
                int r6 = r6.ordinal()
                r4 = r4[r6]
                if (r4 == r8) goto L_0x0056
                if (r4 == r5) goto L_0x004e
                goto L_0x00a1
            L_0x004e:
                char r2 = r11.getPositiveSign()
            L_0x0052:
                r12.append(r2)
                goto L_0x00a1
            L_0x0056:
                int r4 = r10.minWidth
                r5 = 19
                if (r4 >= r5) goto L_0x00a1
                long[] r5 = EXCEED_POINTS
                r4 = r5[r4]
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x00a1
                goto L_0x004e
            L_0x0065:
                int[] r4 = j$.time.format.DateTimeFormatterBuilder.AnonymousClass3.$SwitchMap$java$time$format$SignStyle
                j$.time.format.SignStyle r9 = r10.signStyle
                int r9 = r9.ordinal()
                r4 = r4[r9]
                if (r4 == r8) goto L_0x009c
                if (r4 == r5) goto L_0x009c
                r5 = 3
                if (r4 == r5) goto L_0x009c
                r5 = 4
                if (r4 == r5) goto L_0x007a
                goto L_0x00a1
            L_0x007a:
                j$.time.DateTimeException r11 = new j$.time.DateTimeException
                j$.time.temporal.TemporalField r12 = r10.field
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r12)
                r0.append(r6)
                r0.append(r2)
                java.lang.String r12 = " cannot be negative according to the SignStyle"
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                r11.<init>(r12)
                throw r11
            L_0x009c:
                char r2 = r11.getNegativeSign()
                goto L_0x0052
            L_0x00a1:
                int r2 = r10.minWidth
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto L_0x00b4
                char r2 = r11.getZeroDigit()
                r12.append(r2)
                int r1 = r1 + 1
                goto L_0x00a1
            L_0x00b4:
                r12.append(r0)
                return r8
            L_0x00b8:
                j$.time.DateTimeException r11 = new j$.time.DateTimeException
                j$.time.temporal.TemporalField r12 = r10.field
                int r0 = r10.maxWidth
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r7)
                r1.append(r12)
                r1.append(r6)
                r1.append(r2)
                java.lang.String r12 = " exceeds the maximum print width of "
                r1.append(r12)
                r1.append(r0)
                java.lang.String r12 = r1.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser.format(j$.time.format.DateTimePrintContext, java.lang.StringBuilder):boolean");
        }

        /* access modifiers changed from: package-private */
        public long getValue(DateTimePrintContext dateTimePrintContext, long j10) {
            return j10;
        }

        /* access modifiers changed from: package-private */
        public boolean isFixedWidth(DateTimeParseContext dateTimeParseContext) {
            int i10 = this.subsequentWidth;
            return i10 == -1 || (i10 > 0 && this.minWidth == this.maxWidth && this.signStyle == SignStyle.NOT_NEGATIVE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x017d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parse(j$.time.format.DateTimeParseContext r20, java.lang.CharSequence r21, int r22) {
            /*
                r19 = this;
                r6 = r19
                r0 = r22
                int r1 = r21.length()
                if (r0 != r1) goto L_0x000c
                int r0 = ~r0
                return r0
            L_0x000c:
                char r2 = r21.charAt(r22)
                j$.time.format.DecimalStyle r3 = r20.getDecimalStyle()
                char r3 = r3.getPositiveSign()
                r4 = 0
                r5 = 1
                if (r2 != r3) goto L_0x0039
                j$.time.format.SignStyle r2 = r6.signStyle
                boolean r3 = r20.isStrict()
                int r7 = r6.minWidth
                int r8 = r6.maxWidth
                if (r7 != r8) goto L_0x002a
                r7 = r5
                goto L_0x002b
            L_0x002a:
                r7 = r4
            L_0x002b:
                boolean r2 = r2.parse(r5, r3, r7)
                if (r2 != 0) goto L_0x0033
                int r0 = ~r0
                return r0
            L_0x0033:
                int r0 = r0 + 1
                r7 = r0
                r0 = r4
                r2 = r5
                goto L_0x0071
            L_0x0039:
                j$.time.format.DecimalStyle r3 = r20.getDecimalStyle()
                char r3 = r3.getNegativeSign()
                if (r2 != r3) goto L_0x0060
                j$.time.format.SignStyle r2 = r6.signStyle
                boolean r3 = r20.isStrict()
                int r7 = r6.minWidth
                int r8 = r6.maxWidth
                if (r7 != r8) goto L_0x0051
                r7 = r5
                goto L_0x0052
            L_0x0051:
                r7 = r4
            L_0x0052:
                boolean r2 = r2.parse(r4, r3, r7)
                if (r2 != 0) goto L_0x005a
                int r0 = ~r0
                return r0
            L_0x005a:
                int r0 = r0 + 1
                r7 = r0
                r2 = r4
                r0 = r5
                goto L_0x0071
            L_0x0060:
                j$.time.format.SignStyle r2 = r6.signStyle
                j$.time.format.SignStyle r3 = j$.time.format.SignStyle.ALWAYS
                if (r2 != r3) goto L_0x006e
                boolean r2 = r20.isStrict()
                if (r2 == 0) goto L_0x006e
                int r0 = ~r0
                return r0
            L_0x006e:
                r7 = r0
                r0 = r4
                r2 = r0
            L_0x0071:
                boolean r3 = r20.isStrict()
                if (r3 != 0) goto L_0x0080
                boolean r3 = r19.isFixedWidth(r20)
                if (r3 == 0) goto L_0x007e
                goto L_0x0080
            L_0x007e:
                r3 = r5
                goto L_0x0082
            L_0x0080:
                int r3 = r6.minWidth
            L_0x0082:
                int r8 = r7 + r3
                if (r8 <= r1) goto L_0x0088
                int r0 = ~r7
                return r0
            L_0x0088:
                boolean r9 = r20.isStrict()
                if (r9 != 0) goto L_0x0098
                boolean r9 = r19.isFixedWidth(r20)
                if (r9 == 0) goto L_0x0095
                goto L_0x0098
            L_0x0095:
                r9 = 9
                goto L_0x009a
            L_0x0098:
                int r9 = r6.maxWidth
            L_0x009a:
                int r10 = r6.subsequentWidth
                int r10 = java.lang.Math.max(r10, r4)
                int r9 = r9 + r10
            L_0x00a1:
                r10 = 2
                r13 = 0
                if (r4 >= r10) goto L_0x010f
                int r9 = r9 + r7
                int r9 = java.lang.Math.min(r9, r1)
                r10 = r7
                r14 = 0
            L_0x00ad:
                if (r10 >= r9) goto L_0x00f8
                int r16 = r10 + 1
                r11 = r21
                char r12 = r11.charAt(r10)
                j$.time.format.DecimalStyle r5 = r20.getDecimalStyle()
                int r5 = r5.convertToDigit(r12)
                if (r5 >= 0) goto L_0x00c8
                if (r10 >= r8) goto L_0x00c5
                int r0 = ~r7
                return r0
            L_0x00c5:
                r22 = r8
                goto L_0x00fb
            L_0x00c8:
                int r10 = r16 - r7
                r12 = 18
                if (r10 <= r12) goto L_0x00e8
                if (r13 != 0) goto L_0x00d4
                java.math.BigInteger r13 = java.math.BigInteger.valueOf(r14)
            L_0x00d4:
                java.math.BigInteger r10 = java.math.BigInteger.TEN
                java.math.BigInteger r10 = r13.multiply(r10)
                long r12 = (long) r5
                java.math.BigInteger r5 = java.math.BigInteger.valueOf(r12)
                java.math.BigInteger r5 = r10.add(r5)
                r13 = r5
                r22 = r8
                r12 = r9
                goto L_0x00f1
            L_0x00e8:
                r17 = 10
                long r14 = r14 * r17
                r22 = r8
                r12 = r9
                long r8 = (long) r5
                long r14 = r14 + r8
            L_0x00f1:
                r8 = r22
                r9 = r12
                r10 = r16
                r5 = 1
                goto L_0x00ad
            L_0x00f8:
                r11 = r21
                goto L_0x00c5
            L_0x00fb:
                int r5 = r6.subsequentWidth
                if (r5 <= 0) goto L_0x010d
                if (r4 != 0) goto L_0x010d
                int r10 = r10 - r7
                int r10 = r10 - r5
                int r9 = java.lang.Math.max(r3, r10)
                int r4 = r4 + 1
                r8 = r22
                r5 = 1
                goto L_0x00a1
            L_0x010d:
                r5 = r10
                goto L_0x0112
            L_0x010f:
                r5 = r7
                r14 = 0
            L_0x0112:
                if (r0 == 0) goto L_0x0141
                if (r13 == 0) goto L_0x012e
                java.math.BigInteger r0 = java.math.BigInteger.ZERO
                boolean r0 = r13.equals(r0)
                if (r0 == 0) goto L_0x0128
                boolean r0 = r20.isStrict()
                if (r0 == 0) goto L_0x0128
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0128:
                java.math.BigInteger r13 = r13.negate()
            L_0x012c:
                r2 = r14
                goto L_0x015d
            L_0x012e:
                r0 = 1
                r1 = 0
                int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r1 != 0) goto L_0x013e
                boolean r1 = r20.isStrict()
                if (r1 == 0) goto L_0x013e
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x013e:
                long r0 = -r14
                r2 = r0
                goto L_0x015d
            L_0x0141:
                j$.time.format.SignStyle r0 = r6.signStyle
                j$.time.format.SignStyle r1 = j$.time.format.SignStyle.EXCEEDS_PAD
                if (r0 != r1) goto L_0x012c
                boolean r0 = r20.isStrict()
                if (r0 == 0) goto L_0x012c
                int r0 = r5 - r7
                int r1 = r6.minWidth
                if (r2 == 0) goto L_0x0159
                if (r0 > r1) goto L_0x012c
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0159:
                if (r0 <= r1) goto L_0x012c
                int r0 = ~r7
                return r0
            L_0x015d:
                if (r13 == 0) goto L_0x017d
                int r0 = r13.bitLength()
                r1 = 63
                if (r0 <= r1) goto L_0x016f
                java.math.BigInteger r0 = java.math.BigInteger.TEN
                java.math.BigInteger r13 = r13.divide(r0)
                int r5 = r5 + -1
            L_0x016f:
                long r2 = r13.longValue()
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.setValue(r1, r2, r4, r5)
                return r0
            L_0x017d:
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.setValue(r1, r2, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser.parse(j$.time.format.DateTimeParseContext, java.lang.CharSequence, int):int");
        }

        /* access modifiers changed from: package-private */
        public int setValue(DateTimeParseContext dateTimeParseContext, long j10, int i10, int i11) {
            return dateTimeParseContext.setParsedField(this.field, j10, i10, i11);
        }

        public String toString() {
            int i10 = this.minWidth;
            if (i10 == 1 && this.maxWidth == 19 && this.signStyle == SignStyle.NORMAL) {
                TemporalField temporalField = this.field;
                return "Value(" + temporalField + ")";
            }
            int i11 = this.maxWidth;
            if (i10 == i11 && this.signStyle == SignStyle.NOT_NEGATIVE) {
                TemporalField temporalField2 = this.field;
                return "Value(" + temporalField2 + "," + i10 + ")";
            }
            TemporalField temporalField3 = this.field;
            SignStyle signStyle2 = this.signStyle;
            return "Value(" + temporalField3 + "," + i10 + "," + i11 + "," + signStyle2 + ")";
        }

        /* access modifiers changed from: package-private */
        public NumberPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new NumberPrinterParser(this.field, this.minWidth, this.maxWidth, this.signStyle, -1);
        }

        /* access modifiers changed from: package-private */
        public NumberPrinterParser withSubsequentWidth(int i10) {
            return new NumberPrinterParser(this.field, this.minWidth, this.maxWidth, this.signStyle, this.subsequentWidth + i10);
        }
    }

    static final class OffsetIdPrinterParser implements DateTimePrinterParser {
        static final OffsetIdPrinterParser INSTANCE_ID_Z = new OffsetIdPrinterParser("+HH:MM:ss", "Z");
        static final OffsetIdPrinterParser INSTANCE_ID_ZERO = new OffsetIdPrinterParser("+HH:MM:ss", "0");
        static final String[] PATTERNS = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
        private final String noOffsetText;
        private final int style;
        private final int type;

        OffsetIdPrinterParser(String str, String str2) {
            Objects.requireNonNull(str, "pattern");
            Objects.requireNonNull(str2, "noOffsetText");
            int checkPattern = checkPattern(str);
            this.type = checkPattern;
            this.style = checkPattern % 11;
            this.noOffsetText = str2;
        }

        private int checkPattern(String str) {
            int i10 = 0;
            while (true) {
                String[] strArr = PATTERNS;
                if (i10 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i10].equals(str)) {
                    return i10;
                } else {
                    i10++;
                }
            }
        }

        private void formatZeroPad(boolean z10, int i10, StringBuilder sb2) {
            sb2.append(z10 ? ":" : "");
            sb2.append((char) ((i10 / 10) + 48));
            sb2.append((char) ((i10 % 10) + 48));
        }

        private boolean isColon() {
            int i10 = this.style;
            return i10 > 0 && i10 % 2 == 0;
        }

        private boolean isPaddedHour() {
            return this.type < 11;
        }

        private boolean parseDigits(CharSequence charSequence, boolean z10, int i10, int[] iArr) {
            int i11;
            int i12 = iArr[0];
            if (i12 < 0) {
                return true;
            }
            if (z10 && i10 != 1) {
                int i13 = i12 + 1;
                if (i13 > charSequence.length() || charSequence.charAt(i12) != ':') {
                    return false;
                }
                i12 = i13;
            }
            if (i12 + 2 > charSequence.length()) {
                return false;
            }
            int i14 = i12 + 1;
            char charAt = charSequence.charAt(i12);
            int i15 = i12 + 2;
            char charAt2 = charSequence.charAt(i14);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i11 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i11 > 59) {
                return false;
            }
            iArr[i10] = i11;
            iArr[0] = i15;
            return true;
        }

        private void parseHour(CharSequence charSequence, boolean z10, int[] iArr) {
            if (!z10) {
                parseVariableWidthDigits(charSequence, 1, 2, iArr);
            } else if (!parseDigits(charSequence, false, 1, iArr)) {
                iArr[0] = ~iArr[0];
            }
        }

        private void parseMinute(CharSequence charSequence, boolean z10, boolean z11, int[] iArr) {
            if (!parseDigits(charSequence, z10, 2, iArr) && z11) {
                iArr[0] = ~iArr[0];
            }
        }

        private void parseOptionalMinuteSecond(CharSequence charSequence, boolean z10, int[] iArr) {
            if (parseDigits(charSequence, z10, 2, iArr)) {
                parseDigits(charSequence, z10, 3, iArr);
            }
        }

        private void parseSecond(CharSequence charSequence, boolean z10, boolean z11, int[] iArr) {
            if (!parseDigits(charSequence, z10, 3, iArr) && z11) {
                iArr[0] = ~iArr[0];
            }
        }

        private void parseVariableWidthDigits(CharSequence charSequence, int i10, int i11, int[] iArr) {
            int i12;
            char charAt;
            int i13 = iArr[0];
            char[] cArr = new char[i11];
            int i14 = 0;
            int i15 = 0;
            while (i14 < i11 && (i12 = i13 + 1) <= charSequence.length() && (charAt = charSequence.charAt(i13)) >= '0' && charAt <= '9') {
                cArr[i14] = charAt;
                i15++;
                i14++;
                i13 = i12;
            }
            if (i15 < i10) {
                iArr[0] = ~iArr[0];
                return;
            }
            switch (i15) {
                case 1:
                    iArr[1] = cArr[0] - '0';
                    break;
                case 2:
                    iArr[1] = ((cArr[0] - '0') * 10) + (cArr[1] - '0');
                    break;
                case 3:
                    iArr[1] = cArr[0] - '0';
                    iArr[2] = ((cArr[1] - '0') * 10) + (cArr[2] - '0');
                    break;
                case 4:
                    iArr[1] = ((cArr[0] - '0') * 10) + (cArr[1] - '0');
                    iArr[2] = ((cArr[2] - '0') * 10) + (cArr[3] - '0');
                    break;
                case 5:
                    iArr[1] = cArr[0] - '0';
                    iArr[2] = ((cArr[1] - '0') * 10) + (cArr[2] - '0');
                    iArr[3] = ((cArr[3] - '0') * 10) + (cArr[4] - '0');
                    break;
                case 6:
                    iArr[1] = ((cArr[0] - '0') * 10) + (cArr[1] - '0');
                    iArr[2] = ((cArr[2] - '0') * 10) + (cArr[3] - '0');
                    iArr[3] = ((cArr[4] - '0') * 10) + (cArr[5] - '0');
                    break;
            }
            iArr[0] = i13;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue((TemporalField) ChronoField.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            int intExact = Math.toIntExact(value.longValue());
            if (intExact != 0) {
                int abs = Math.abs((intExact / 3600) % 100);
                int abs2 = Math.abs((intExact / 60) % 60);
                int abs3 = Math.abs(intExact % 60);
                int length = sb2.length();
                sb2.append(intExact < 0 ? "-" : "+");
                if (isPaddedHour() || abs >= 10) {
                    formatZeroPad(false, abs, sb2);
                } else {
                    sb2.append((char) (abs + 48));
                }
                int i10 = this.style;
                if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && abs3 > 0) || (i10 >= 1 && abs2 > 0))) {
                    formatZeroPad(isColon(), abs2, sb2);
                    abs += abs2;
                    int i11 = this.style;
                    if (i11 == 7 || i11 == 8 || (i11 >= 5 && abs3 > 0)) {
                        formatZeroPad(isColon(), abs3, sb2);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb2.setLength(length);
                }
                return true;
            }
            sb2.append(this.noOffsetText);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
            if (r8 == r9) goto L_0x0013;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parse(j$.time.format.DateTimeParseContext r16, java.lang.CharSequence r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r7 = r17
                r8 = r18
                int r9 = r17.length()
                java.lang.String r1 = r0.noOffsetText
                int r10 = r1.length()
                if (r10 != 0) goto L_0x0022
                if (r8 != r9) goto L_0x0041
            L_0x0013:
                j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.OFFSET_SECONDS
                r3 = 0
                r1 = r16
                r5 = r18
                r6 = r18
            L_0x001d:
                int r1 = r1.setParsedField(r2, r3, r5, r6)
                return r1
            L_0x0022:
                if (r8 != r9) goto L_0x0026
                int r1 = ~r8
                return r1
            L_0x0026:
                java.lang.String r4 = r0.noOffsetText
                r5 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                r6 = r10
                boolean r1 = r1.subSequenceEquals(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x0041
                j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r10
                r1 = r16
                r5 = r18
                goto L_0x001d
            L_0x0041:
                char r1 = r17.charAt(r18)
                r2 = 43
                r3 = 45
                if (r1 == r2) goto L_0x004d
                if (r1 != r3) goto L_0x011f
            L_0x004d:
                r2 = 1
                if (r1 != r3) goto L_0x0052
                r1 = -1
                goto L_0x0053
            L_0x0052:
                r1 = r2
            L_0x0053:
                boolean r3 = r15.isColon()
                boolean r4 = r15.isPaddedHour()
                r5 = 4
                int[] r6 = new int[r5]
                int r11 = r8 + 1
                r12 = 0
                r6[r12] = r11
                int r11 = r0.type
                boolean r13 = r16.isStrict()
                if (r13 != 0) goto L_0x00a4
                r13 = 58
                if (r4 == 0) goto L_0x0085
                if (r3 != 0) goto L_0x0081
                if (r11 != 0) goto L_0x007e
                int r11 = r8 + 3
                if (r9 <= r11) goto L_0x007e
                char r9 = r7.charAt(r11)
                if (r9 != r13) goto L_0x007e
                goto L_0x0081
            L_0x007e:
                r11 = 9
                goto L_0x00a4
            L_0x0081:
                r11 = 10
            L_0x0083:
                r3 = r2
                goto L_0x00a4
            L_0x0085:
                if (r3 != 0) goto L_0x00a1
                r14 = 11
                if (r11 != r14) goto L_0x009e
                int r11 = r8 + 3
                if (r9 <= r11) goto L_0x009e
                int r9 = r8 + 2
                char r9 = r7.charAt(r9)
                if (r9 == r13) goto L_0x00a1
                char r9 = r7.charAt(r11)
                if (r9 != r13) goto L_0x009e
                goto L_0x00a1
            L_0x009e:
                r11 = 20
                goto L_0x00a4
            L_0x00a1:
                r11 = 21
                goto L_0x0083
            L_0x00a4:
                r9 = 6
                r13 = 3
                switch(r11) {
                    case 0: goto L_0x00e8;
                    case 1: goto L_0x00e1;
                    case 2: goto L_0x00e1;
                    case 3: goto L_0x00da;
                    case 4: goto L_0x00da;
                    case 5: goto L_0x00d0;
                    case 6: goto L_0x00d0;
                    case 7: goto L_0x00c6;
                    case 8: goto L_0x00c6;
                    case 9: goto L_0x00bf;
                    case 10: goto L_0x00bf;
                    case 11: goto L_0x00e8;
                    case 12: goto L_0x00bb;
                    case 13: goto L_0x00e1;
                    case 14: goto L_0x00b7;
                    case 15: goto L_0x00da;
                    case 16: goto L_0x00b3;
                    case 17: goto L_0x00d0;
                    case 18: goto L_0x00ae;
                    case 19: goto L_0x00c6;
                    case 20: goto L_0x00aa;
                    case 21: goto L_0x00bf;
                    default: goto L_0x00a9;
                }
            L_0x00a9:
                goto L_0x00eb
            L_0x00aa:
                r15.parseVariableWidthDigits(r7, r2, r9, r6)
                goto L_0x00eb
            L_0x00ae:
                r3 = 5
                r15.parseVariableWidthDigits(r7, r3, r9, r6)
                goto L_0x00eb
            L_0x00b3:
                r15.parseVariableWidthDigits(r7, r13, r9, r6)
                goto L_0x00eb
            L_0x00b7:
                r15.parseVariableWidthDigits(r7, r13, r5, r6)
                goto L_0x00eb
            L_0x00bb:
                r15.parseVariableWidthDigits(r7, r2, r5, r6)
                goto L_0x00eb
            L_0x00bf:
                r15.parseHour(r7, r4, r6)
                r15.parseOptionalMinuteSecond(r7, r3, r6)
                goto L_0x00eb
            L_0x00c6:
                r15.parseHour(r7, r4, r6)
                r15.parseMinute(r7, r3, r2, r6)
                r15.parseSecond(r7, r3, r2, r6)
                goto L_0x00eb
            L_0x00d0:
                r15.parseHour(r7, r4, r6)
                r15.parseMinute(r7, r3, r2, r6)
                r15.parseSecond(r7, r3, r12, r6)
                goto L_0x00eb
            L_0x00da:
                r15.parseHour(r7, r4, r6)
                r15.parseMinute(r7, r3, r2, r6)
                goto L_0x00eb
            L_0x00e1:
                r15.parseHour(r7, r4, r6)
                r15.parseMinute(r7, r3, r12, r6)
                goto L_0x00eb
            L_0x00e8:
                r15.parseHour(r7, r4, r6)
            L_0x00eb:
                r7 = r6[r12]
                if (r7 <= 0) goto L_0x011f
                r2 = r6[r2]
                r3 = 23
                if (r2 > r3) goto L_0x0117
                r3 = 2
                r3 = r6[r3]
                r4 = 59
                if (r3 > r4) goto L_0x0117
                r5 = r6[r13]
                if (r5 > r4) goto L_0x0117
                long r9 = (long) r1
                long r1 = (long) r2
                r11 = 3600(0xe10, double:1.7786E-320)
                long r1 = r1 * r11
                long r3 = (long) r3
                r11 = 60
                long r3 = r3 * r11
                long r1 = r1 + r3
                long r3 = (long) r5
                long r1 = r1 + r3
                long r3 = r9 * r1
                j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.OFFSET_SECONDS
                r1 = r16
                r5 = r18
                r6 = r7
                goto L_0x001d
            L_0x0117:
                j$.time.DateTimeException r1 = new j$.time.DateTimeException
                java.lang.String r2 = "Value out of range: Hour[0-23], Minute[0-59], Second[0-59]"
                r1.<init>(r2)
                throw r1
            L_0x011f:
                if (r10 != 0) goto L_0x0123
                goto L_0x0013
            L_0x0123:
                int r1 = ~r8
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.parse(j$.time.format.DateTimeParseContext, java.lang.CharSequence, int):int");
        }

        public String toString() {
            String replace = this.noOffsetText.replace("'", "''");
            String str = PATTERNS[this.type];
            return "Offset(" + str + ",'" + replace + "')";
        }
    }

    static final class PadPrinterParserDecorator implements DateTimePrinterParser {
        private final char padChar;
        private final int padWidth;
        private final DateTimePrinterParser printerParser;

        PadPrinterParserDecorator(DateTimePrinterParser dateTimePrinterParser, int i10, char c10) {
            this.printerParser = dateTimePrinterParser;
            this.padWidth = i10;
            this.padChar = c10;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            int length = sb2.length();
            if (!this.printerParser.format(dateTimePrintContext, sb2)) {
                return false;
            }
            int length2 = sb2.length() - length;
            if (length2 <= this.padWidth) {
                for (int i10 = 0; i10 < this.padWidth - length2; i10++) {
                    sb2.insert(length, this.padChar);
                }
                return true;
            }
            int i11 = this.padWidth;
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i11);
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            boolean isStrict = dateTimeParseContext.isStrict();
            if (i10 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i10 == charSequence.length()) {
                return ~i10;
            } else {
                int i11 = this.padWidth + i10;
                if (i11 > charSequence.length()) {
                    if (isStrict) {
                        return ~i10;
                    }
                    i11 = charSequence.length();
                }
                int i12 = i10;
                while (i12 < i11 && dateTimeParseContext.charEquals(charSequence.charAt(i12), this.padChar)) {
                    i12++;
                }
                int parse = this.printerParser.parse(dateTimeParseContext, charSequence.subSequence(0, i11), i12);
                return (parse == i11 || !isStrict) ? parse : ~(i10 + i12);
            }
        }

        public String toString() {
            String str;
            DateTimePrinterParser dateTimePrinterParser = this.printerParser;
            int i10 = this.padWidth;
            char c10 = this.padChar;
            if (c10 == ' ') {
                str = ")";
            } else {
                str = ",'" + c10 + "')";
            }
            return "Pad(" + dateTimePrinterParser + "," + i10 + str;
        }
    }

    static class PrefixTree {

        /* renamed from: c0  reason: collision with root package name */
        protected char f19031c0;
        protected PrefixTree child;
        protected String key;
        protected PrefixTree sibling;
        protected String value;

        private static class CI extends PrefixTree {
            private CI(String str, String str2, PrefixTree prefixTree) {
                super(str, str2, prefixTree);
            }

            /* access modifiers changed from: protected */
            public boolean isEqual(char c10, char c11) {
                return DateTimeParseContext.charEqualsIgnoreCase(c10, c11);
            }

            /* access modifiers changed from: protected */
            public CI newNode(String str, String str2, PrefixTree prefixTree) {
                return new CI(str, str2, prefixTree);
            }

            /* access modifiers changed from: protected */
            public boolean prefixOf(CharSequence charSequence, int i10, int i11) {
                int length = this.key.length();
                if (length > i11 - i10) {
                    return false;
                }
                int i12 = 0;
                while (true) {
                    int i13 = length - 1;
                    if (length <= 0) {
                        return true;
                    }
                    int i14 = i12 + 1;
                    int i15 = i10 + 1;
                    if (!isEqual(this.key.charAt(i12), charSequence.charAt(i10))) {
                        return false;
                    }
                    i10 = i15;
                    length = i13;
                    i12 = i14;
                }
            }
        }

        private PrefixTree(String str, String str2, PrefixTree prefixTree) {
            this.key = str;
            this.value = str2;
            this.child = prefixTree;
            this.f19031c0 = str.isEmpty() ? 65535 : this.key.charAt(0);
        }

        private boolean add0(String str, String str2) {
            String key2 = toKey(str);
            int prefixLength = prefixLength(key2);
            if (prefixLength != this.key.length()) {
                PrefixTree newNode = newNode(this.key.substring(prefixLength), this.value, this.child);
                this.key = key2.substring(0, prefixLength);
                this.child = newNode;
                if (prefixLength < key2.length()) {
                    this.child.sibling = newNode(key2.substring(prefixLength), str2, (PrefixTree) null);
                    this.value = null;
                } else {
                    this.value = str2;
                }
                return true;
            } else if (prefixLength < key2.length()) {
                String substring = key2.substring(prefixLength);
                for (PrefixTree prefixTree = this.child; prefixTree != null; prefixTree = prefixTree.sibling) {
                    if (isEqual(prefixTree.f19031c0, substring.charAt(0))) {
                        return prefixTree.add0(substring, str2);
                    }
                }
                PrefixTree newNode2 = newNode(substring, str2, (PrefixTree) null);
                newNode2.sibling = this.child;
                this.child = newNode2;
                return true;
            } else {
                this.value = str2;
                return true;
            }
        }

        public static PrefixTree newTree(DateTimeParseContext dateTimeParseContext) {
            return dateTimeParseContext.isCaseSensitive() ? new PrefixTree("", (String) null, (PrefixTree) null) : new CI("", (String) null, (PrefixTree) null);
        }

        public static PrefixTree newTree(Set set, DateTimeParseContext dateTimeParseContext) {
            PrefixTree newTree = newTree(dateTimeParseContext);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                newTree.add0(str, str);
            }
            return newTree;
        }

        private int prefixLength(String str) {
            int i10 = 0;
            while (i10 < str.length() && i10 < this.key.length() && isEqual(str.charAt(i10), this.key.charAt(i10))) {
                i10++;
            }
            return i10;
        }

        public boolean add(String str, String str2) {
            return add0(str, str2);
        }

        /* access modifiers changed from: protected */
        public boolean isEqual(char c10, char c11) {
            return c10 == c11;
        }

        public String match(CharSequence charSequence, ParsePosition parsePosition) {
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            if (!prefixOf(charSequence, index, length)) {
                return null;
            }
            int length2 = index + this.key.length();
            PrefixTree prefixTree = this.child;
            if (prefixTree != null && length2 != length) {
                while (true) {
                    if (!isEqual(prefixTree.f19031c0, charSequence.charAt(length2))) {
                        prefixTree = prefixTree.sibling;
                        if (prefixTree == null) {
                            break;
                        }
                    } else {
                        parsePosition.setIndex(length2);
                        String match = prefixTree.match(charSequence, parsePosition);
                        if (match != null) {
                            return match;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.value;
        }

        /* access modifiers changed from: protected */
        public PrefixTree newNode(String str, String str2, PrefixTree prefixTree) {
            return new PrefixTree(str, str2, prefixTree);
        }

        /* access modifiers changed from: protected */
        public boolean prefixOf(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof String) {
                return ((String) charSequence).startsWith(this.key, i10);
            }
            int length = this.key.length();
            if (length > i11 - i10) {
                return false;
            }
            int i12 = 0;
            while (true) {
                int i13 = length - 1;
                if (length <= 0) {
                    return true;
                }
                int i14 = i12 + 1;
                int i15 = i10 + 1;
                if (!isEqual(this.key.charAt(i12), charSequence.charAt(i10))) {
                    return false;
                }
                i10 = i15;
                length = i13;
                i12 = i14;
            }
        }

        /* access modifiers changed from: protected */
        public String toKey(String str) {
            return str;
        }
    }

    static final class ReducedPrinterParser extends NumberPrinterParser {
        static final LocalDate BASE_DATE = LocalDate.of(2000, 1, 1);
        private final ChronoLocalDate baseDate;
        private final int baseValue;

        ReducedPrinterParser(TemporalField temporalField, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate) {
            this(temporalField, i10, i11, i12, chronoLocalDate, 0);
            if (i10 < 1 || i10 > 10) {
                throw new IllegalArgumentException("The minWidth must be from 1 to 10 inclusive but was " + i10);
            } else if (i11 < 1 || i11 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i10);
            } else if (i11 < i10) {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
            } else if (chronoLocalDate == null) {
                long j10 = (long) i12;
                if (!temporalField.range().isValidValue(j10)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                } else if (j10 + NumberPrinterParser.EXCEED_POINTS[i11] > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
        }

        private ReducedPrinterParser(TemporalField temporalField, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
            super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i13);
            this.baseValue = i12;
            this.baseDate = chronoLocalDate;
        }

        /* access modifiers changed from: package-private */
        public long getValue(DateTimePrintContext dateTimePrintContext, long j10) {
            long abs = Math.abs(j10);
            int i10 = this.baseValue;
            if (this.baseDate != null) {
                i10 = Chronology.from(dateTimePrintContext.getTemporal()).date(this.baseDate).get(this.field);
            }
            long j11 = (long) i10;
            if (j10 >= j11) {
                long j12 = NumberPrinterParser.EXCEED_POINTS[this.minWidth];
                if (j10 < j11 + j12) {
                    return abs % j12;
                }
            }
            return abs % NumberPrinterParser.EXCEED_POINTS[this.maxWidth];
        }

        /* access modifiers changed from: package-private */
        public boolean isFixedWidth(DateTimeParseContext dateTimeParseContext) {
            if (!dateTimeParseContext.isStrict()) {
                return false;
            }
            return super.isFixedWidth(dateTimeParseContext);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$setValue$0$java-time-format-DateTimeFormatterBuilder$ReducedPrinterParser  reason: not valid java name */
        public /* synthetic */ void m1lambda$setValue$0$javatimeformatDateTimeFormatterBuilder$ReducedPrinterParser(DateTimeParseContext dateTimeParseContext, long j10, int i10, int i11, Chronology chronology) {
            setValue(dateTimeParseContext, j10, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public int setValue(DateTimeParseContext dateTimeParseContext, long j10, int i10, int i11) {
            int i12 = this.baseValue;
            if (this.baseDate != null) {
                i12 = dateTimeParseContext.getEffectiveChronology().date(this.baseDate).get(this.field);
                dateTimeParseContext.addChronoChangedListener(new DateTimeFormatterBuilder$ReducedPrinterParser$$ExternalSyntheticLambda0(this, dateTimeParseContext, j10, i10, i11));
            }
            int i13 = i11 - i10;
            int i14 = this.minWidth;
            if (i13 == i14 && j10 >= 0) {
                long j11 = NumberPrinterParser.EXCEED_POINTS[i14];
                long j12 = (long) i12;
                long j13 = j12 - (j12 % j11);
                j10 = i12 > 0 ? j13 + j10 : j13 - j10;
                if (j10 < j12) {
                    j10 += j11;
                }
            }
            return dateTimeParseContext.setParsedField(this.field, j10, i10, i11);
        }

        public String toString() {
            TemporalField temporalField = this.field;
            int i10 = this.minWidth;
            int i11 = this.maxWidth;
            Object m10 = ZoneId$$ExternalSyntheticBackport0.m(this.baseDate, Integer.valueOf(this.baseValue));
            return "ReducedValue(" + temporalField + "," + i10 + "," + i11 + "," + m10 + ")";
        }

        /* access modifiers changed from: package-private */
        public ReducedPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new ReducedPrinterParser(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, -1);
        }

        /* access modifiers changed from: package-private */
        public ReducedPrinterParser withSubsequentWidth(int i10) {
            return new ReducedPrinterParser(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, this.subsequentWidth + i10);
        }
    }

    enum SettingsParser implements DateTimePrinterParser {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            return true;
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dateTimeParseContext.setCaseSensitive(true);
            } else if (ordinal == 1) {
                dateTimeParseContext.setCaseSensitive(false);
            } else if (ordinal == 2) {
                dateTimeParseContext.setStrict(true);
            } else if (ordinal == 3) {
                dateTimeParseContext.setStrict(false);
            }
            return i10;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class StringLiteralPrinterParser implements DateTimePrinterParser {
        private final String literal;

        StringLiteralPrinterParser(String str) {
            this.literal = str;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            sb2.append(this.literal);
            return true;
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            if (i10 > charSequence.length() || i10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.literal;
            return !dateTimeParseContext.subSequenceEquals(charSequence, i10, str, 0, str.length()) ? ~i10 : i10 + this.literal.length();
        }

        public String toString() {
            String replace = this.literal.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    static final class TextPrinterParser implements DateTimePrinterParser {
        private final TemporalField field;
        private volatile NumberPrinterParser numberPrinterParser;
        private final DateTimeTextProvider provider;
        private final TextStyle textStyle;

        TextPrinterParser(TemporalField temporalField, TextStyle textStyle2, DateTimeTextProvider dateTimeTextProvider) {
            this.field = temporalField;
            this.textStyle = textStyle2;
            this.provider = dateTimeTextProvider;
        }

        private NumberPrinterParser numberPrinterParser() {
            if (this.numberPrinterParser == null) {
                this.numberPrinterParser = new NumberPrinterParser(this.field, 1, 19, SignStyle.NORMAL);
            }
            return this.numberPrinterParser;
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue(this.field);
            if (value == null) {
                return false;
            }
            Chronology chronology = (Chronology) dateTimePrintContext.getTemporal().query(TemporalQueries.chronology());
            String text = (chronology == null || chronology == IsoChronology.INSTANCE) ? this.provider.getText(this.field, value.longValue(), this.textStyle, dateTimePrintContext.getLocale()) : this.provider.getText(chronology, this.field, value.longValue(), this.textStyle, dateTimePrintContext.getLocale());
            if (text == null) {
                return numberPrinterParser().format(dateTimePrintContext, sb2);
            }
            sb2.append(text);
            return true;
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int length = charSequence.length();
            if (i10 < 0 || i10 > length) {
                throw new IndexOutOfBoundsException();
            }
            TextStyle textStyle2 = dateTimeParseContext.isStrict() ? this.textStyle : null;
            Chronology effectiveChronology = dateTimeParseContext.getEffectiveChronology();
            Iterator textIterator = (effectiveChronology == null || effectiveChronology == IsoChronology.INSTANCE) ? this.provider.getTextIterator(this.field, textStyle2, dateTimeParseContext.getLocale()) : this.provider.getTextIterator(effectiveChronology, this.field, textStyle2, dateTimeParseContext.getLocale());
            if (textIterator != null) {
                while (textIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) textIterator.next();
                    String str = (String) entry.getKey();
                    if (dateTimeParseContext.subSequenceEquals(str, 0, charSequence, i10, str.length())) {
                        return dateTimeParseContext.setParsedField(this.field, ((Long) entry.getValue()).longValue(), i10, i10 + str.length());
                    }
                }
                if (this.field == ChronoField.ERA && !dateTimeParseContext.isStrict()) {
                    for (Era era : effectiveChronology.eras()) {
                        String obj = era.toString();
                        if (dateTimeParseContext.subSequenceEquals(obj, 0, charSequence, i10, obj.length())) {
                            return dateTimeParseContext.setParsedField(this.field, (long) era.getValue(), i10, i10 + obj.length());
                        }
                    }
                }
                if (dateTimeParseContext.isStrict()) {
                    return ~i10;
                }
            }
            return numberPrinterParser().parse(dateTimeParseContext, charSequence, i10);
        }

        public String toString() {
            TextStyle textStyle2 = this.textStyle;
            if (textStyle2 == TextStyle.FULL) {
                TemporalField temporalField = this.field;
                return "Text(" + temporalField + ")";
            }
            TemporalField temporalField2 = this.field;
            return "Text(" + temporalField2 + "," + textStyle2 + ")";
        }
    }

    static final class WeekBasedFieldPrinterParser extends NumberPrinterParser {
        private char chr;
        private int count;

        WeekBasedFieldPrinterParser(char c10, int i10, int i11, int i12) {
            this(c10, i10, i11, i12, 0);
        }

        WeekBasedFieldPrinterParser(char c10, int i10, int i11, int i12, int i13) {
            super((TemporalField) null, i11, i12, SignStyle.NOT_NEGATIVE, i13);
            this.chr = c10;
            this.count = i10;
        }

        private DateTimePrinterParser printerParser(Locale locale) {
            TemporalField weekOfMonth;
            WeekFields of2 = WeekFields.of(locale);
            char c10 = this.chr;
            if (c10 == 'W') {
                weekOfMonth = of2.weekOfMonth();
            } else if (c10 == 'Y') {
                TemporalField weekBasedYear = of2.weekBasedYear();
                int i10 = this.count;
                if (i10 == 2) {
                    return new ReducedPrinterParser(weekBasedYear, 2, 2, 0, ReducedPrinterParser.BASE_DATE, this.subsequentWidth);
                }
                return new NumberPrinterParser(weekBasedYear, i10, 19, i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.subsequentWidth);
            } else if (c10 == 'c' || c10 == 'e') {
                weekOfMonth = of2.dayOfWeek();
            } else if (c10 == 'w') {
                weekOfMonth = of2.weekOfWeekBasedYear();
            } else {
                throw new IllegalStateException("unreachable");
            }
            return new NumberPrinterParser(weekOfMonth, this.minWidth, this.maxWidth, SignStyle.NOT_NEGATIVE, this.subsequentWidth);
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            return printerParser(dateTimePrintContext.getLocale()).format(dateTimePrintContext, sb2);
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            return printerParser(dateTimeParseContext.getLocale()).parse(dateTimeParseContext, charSequence, i10);
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Localized(");
            char c10 = this.chr;
            if (c10 == 'Y') {
                int i10 = this.count;
                if (i10 == 1) {
                    str2 = "WeekBasedYear";
                } else if (i10 == 2) {
                    str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
                } else {
                    sb2.append("WeekBasedYear,");
                    sb2.append(this.count);
                    sb2.append(",");
                    sb2.append(19);
                    sb2.append(",");
                    sb2.append(this.count < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
                sb2.append(str2);
            } else {
                if (c10 == 'W') {
                    str = "WeekOfMonth";
                } else if (c10 == 'c' || c10 == 'e') {
                    str = "DayOfWeek";
                } else {
                    if (c10 == 'w') {
                        str = "WeekOfWeekBasedYear";
                    }
                    sb2.append(",");
                    sb2.append(this.count);
                }
                sb2.append(str);
                sb2.append(",");
                sb2.append(this.count);
            }
            sb2.append(")");
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public WeekBasedFieldPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new WeekBasedFieldPrinterParser(this.chr, this.count, this.minWidth, this.maxWidth, -1);
        }

        /* access modifiers changed from: package-private */
        public WeekBasedFieldPrinterParser withSubsequentWidth(int i10) {
            return new WeekBasedFieldPrinterParser(this.chr, this.count, this.minWidth, this.maxWidth, this.subsequentWidth + i10);
        }
    }

    static class ZoneIdPrinterParser implements DateTimePrinterParser {
        private static volatile Map.Entry cachedPrefixTree;
        private static volatile Map.Entry cachedPrefixTreeCI;
        private final String description;
        private final TemporalQuery query;

        ZoneIdPrinterParser(TemporalQuery temporalQuery, String str) {
            this.query = temporalQuery;
            this.description = str;
        }

        private int parseOffsetBased(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10, int i11, OffsetIdPrinterParser offsetIdPrinterParser) {
            String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
            if (i11 < charSequence.length() && charSequence.charAt(i11) != '0' && !dateTimeParseContext.charEquals(charSequence.charAt(i11), 'Z')) {
                DateTimeParseContext copy = dateTimeParseContext.copy();
                int parse = offsetIdPrinterParser.parse(copy, charSequence, i11);
                if (parse < 0) {
                    try {
                        if (offsetIdPrinterParser == OffsetIdPrinterParser.INSTANCE_ID_Z) {
                            return ~i10;
                        }
                        dateTimeParseContext.setParsed(ZoneId.of(upperCase));
                        return i11;
                    } catch (DateTimeException unused) {
                        return ~i10;
                    }
                } else {
                    dateTimeParseContext.setParsed(ZoneId.ofOffset(upperCase, ZoneOffset.ofTotalSeconds((int) copy.getParsed(ChronoField.OFFSET_SECONDS).longValue())));
                    return parse;
                }
            } else {
                dateTimeParseContext.setParsed(ZoneId.of(upperCase));
                return i11;
            }
        }

        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            ZoneId zoneId = (ZoneId) dateTimePrintContext.getValue(this.query);
            if (zoneId == null) {
                return false;
            }
            sb2.append(zoneId.getId());
            return true;
        }

        /* access modifiers changed from: protected */
        public PrefixTree getTree(DateTimeParseContext dateTimeParseContext) {
            Set availableZoneIds = ZoneRulesProvider.getAvailableZoneIds();
            int size = availableZoneIds.size();
            Map.Entry entry = dateTimeParseContext.isCaseSensitive() ? cachedPrefixTree : cachedPrefixTreeCI;
            if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                synchronized (this) {
                    try {
                        Map.Entry entry2 = dateTimeParseContext.isCaseSensitive() ? cachedPrefixTree : cachedPrefixTreeCI;
                        if (entry2 == null || ((Integer) entry2.getKey()).intValue() != size) {
                            entry2 = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), PrefixTree.newTree(availableZoneIds, dateTimeParseContext));
                            if (dateTimeParseContext.isCaseSensitive()) {
                                cachedPrefixTree = entry2;
                            } else {
                                cachedPrefixTreeCI = entry2;
                            }
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
            }
            return (PrefixTree) entry.getValue();
        }

        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int i11;
            int length = charSequence.length();
            if (i10 > length) {
                throw new IndexOutOfBoundsException();
            } else if (i10 == length) {
                return ~i10;
            } else {
                char charAt = charSequence.charAt(i10);
                if (charAt == '+' || charAt == '-') {
                    return parseOffsetBased(dateTimeParseContext, charSequence, i10, i10, OffsetIdPrinterParser.INSTANCE_ID_Z);
                }
                int i12 = i10 + 2;
                if (length >= i12) {
                    char charAt2 = charSequence.charAt(i10 + 1);
                    if (dateTimeParseContext.charEquals(charAt, 'U') && dateTimeParseContext.charEquals(charAt2, 'T')) {
                        int i13 = i10 + 3;
                        if (length < i13 || !dateTimeParseContext.charEquals(charSequence.charAt(i12), 'C')) {
                            return parseOffsetBased(dateTimeParseContext, charSequence, i10, i12, OffsetIdPrinterParser.INSTANCE_ID_ZERO);
                        }
                        return parseOffsetBased(dateTimeParseContext, charSequence, i10, i13, OffsetIdPrinterParser.INSTANCE_ID_ZERO);
                    } else if (dateTimeParseContext.charEquals(charAt, 'G') && length >= (i11 = i10 + 3) && dateTimeParseContext.charEquals(charAt2, 'M') && dateTimeParseContext.charEquals(charSequence.charAt(i12), 'T')) {
                        int i14 = i10 + 4;
                        if (length < i14 || !dateTimeParseContext.charEquals(charSequence.charAt(i11), '0')) {
                            return parseOffsetBased(dateTimeParseContext, charSequence, i10, i11, OffsetIdPrinterParser.INSTANCE_ID_ZERO);
                        }
                        dateTimeParseContext.setParsed(ZoneId.of("GMT0"));
                        return i14;
                    }
                }
                PrefixTree tree = getTree(dateTimeParseContext);
                ParsePosition parsePosition = new ParsePosition(i10);
                String match = tree.match(charSequence, parsePosition);
                if (match != null) {
                    dateTimeParseContext.setParsed(ZoneId.of(match));
                    return parsePosition.getIndex();
                } else if (!dateTimeParseContext.charEquals(charAt, 'Z')) {
                    return ~i10;
                } else {
                    dateTimeParseContext.setParsed(ZoneOffset.UTC);
                    return i10 + 1;
                }
            }
        }

        public String toString() {
            return this.description;
        }
    }

    static final class ZoneTextPrinterParser extends ZoneIdPrinterParser {
        private static final Map cache = new ConcurrentHashMap();
        private final Map cachedTree = new HashMap();
        private final Map cachedTreeCI = new HashMap();
        private final boolean isGeneric;
        private Set preferredZones;
        private final TextStyle textStyle;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        ZoneTextPrinterParser(j$.time.format.TextStyle r4, java.util.Set r5, boolean r6) {
            /*
                r3 = this;
                j$.time.temporal.TemporalQuery r0 = j$.time.temporal.TemporalQueries.zone()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ZoneText("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r3.<init>(r0, r1)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.cachedTree = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.cachedTreeCI = r0
                java.lang.String r0 = "textStyle"
                java.util.Objects.requireNonNull(r4, r0)
                r3.textStyle = r4
                r3.isGeneric = r6
                if (r5 == 0) goto L_0x005d
                int r4 = r5.size()
                if (r4 == 0) goto L_0x005d
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>()
                r3.preferredZones = r4
                java.util.Iterator r4 = r5.iterator()
            L_0x0047:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x005d
                java.lang.Object r5 = r4.next()
                j$.time.ZoneId r5 = (j$.time.ZoneId) r5
                java.util.Set r6 = r3.preferredZones
                java.lang.String r5 = r5.getId()
                r6.add(r5)
                goto L_0x0047
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.ZoneTextPrinterParser.<init>(j$.time.format.TextStyle, java.util.Set, boolean):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.Map} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String getDisplayName(java.lang.String r13, int r14, java.util.Locale r15) {
            /*
                r12 = this;
                j$.time.format.TextStyle r0 = r12.textStyle
                j$.time.format.TextStyle r1 = j$.time.format.TextStyle.NARROW
                r2 = 0
                if (r0 != r1) goto L_0x0008
                return r2
            L_0x0008:
                java.util.Map r0 = cache
                java.lang.Object r1 = r0.get(r13)
                java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                r3 = 1
                if (r1 == 0) goto L_0x0024
                java.lang.Object r1 = r1.get()
                r2 = r1
                java.util.Map r2 = (java.util.Map) r2
                if (r2 == 0) goto L_0x0024
                java.lang.Object r1 = r2.get(r15)
                java.lang.String[] r1 = (java.lang.String[]) r1
                if (r1 != 0) goto L_0x0052
            L_0x0024:
                java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r13)
                r4 = 0
                java.lang.String r6 = r1.getDisplayName(r4, r3, r15)
                java.lang.String r7 = r1.getDisplayName(r4, r4, r15)
                java.lang.String r8 = r1.getDisplayName(r3, r3, r15)
                java.lang.String r9 = r1.getDisplayName(r3, r4, r15)
                r5 = r13
                r10 = r13
                r11 = r13
                java.lang.String[] r1 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11}
                if (r2 != 0) goto L_0x0047
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
                r2.<init>()
            L_0x0047:
                r2.put(r15, r1)
                java.lang.ref.SoftReference r15 = new java.lang.ref.SoftReference
                r15.<init>(r2)
                r0.put(r13, r15)
            L_0x0052:
                j$.time.format.TextStyle r13 = r12.textStyle
                int r13 = r13.zoneNameStyleIndex()
                if (r14 == 0) goto L_0x0066
                if (r14 == r3) goto L_0x0061
                int r13 = r13 + 5
                r13 = r1[r13]
                return r13
            L_0x0061:
                int r13 = r13 + 3
                r13 = r1[r13]
                return r13
            L_0x0066:
                int r13 = r13 + r3
                r13 = r1[r13]
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.ZoneTextPrinterParser.getDisplayName(java.lang.String, int, java.util.Locale):java.lang.String");
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean format(j$.time.format.DateTimePrintContext r8, java.lang.StringBuilder r9) {
            /*
                r7 = this;
                j$.time.temporal.TemporalQuery r0 = j$.time.temporal.TemporalQueries.zoneId()
                java.lang.Object r0 = r8.getValue((j$.time.temporal.TemporalQuery) r0)
                j$.time.ZoneId r0 = (j$.time.ZoneId) r0
                if (r0 != 0) goto L_0x000e
                r8 = 0
                return r8
            L_0x000e:
                java.lang.String r1 = r0.getId()
                boolean r2 = r0 instanceof j$.time.ZoneOffset
                if (r2 != 0) goto L_0x007e
                j$.time.temporal.TemporalAccessor r2 = r8.getTemporal()
                boolean r3 = r7.isGeneric
                if (r3 != 0) goto L_0x0072
                j$.time.temporal.ChronoField r3 = j$.time.temporal.ChronoField.INSTANT_SECONDS
                boolean r3 = r2.isSupported(r3)
                if (r3 == 0) goto L_0x0033
                j$.time.zone.ZoneRules r0 = r0.getRules()
                j$.time.Instant r2 = j$.time.Instant.from(r2)
                boolean r0 = r0.isDaylightSavings(r2)
                goto L_0x0073
            L_0x0033:
                j$.time.temporal.ChronoField r3 = j$.time.temporal.ChronoField.EPOCH_DAY
                boolean r4 = r2.isSupported(r3)
                if (r4 == 0) goto L_0x0072
                j$.time.temporal.ChronoField r4 = j$.time.temporal.ChronoField.NANO_OF_DAY
                boolean r5 = r2.isSupported(r4)
                if (r5 == 0) goto L_0x0072
                long r5 = r2.getLong(r3)
                j$.time.LocalDate r3 = j$.time.LocalDate.ofEpochDay(r5)
                long r4 = r2.getLong(r4)
                j$.time.LocalTime r2 = j$.time.LocalTime.ofNanoOfDay(r4)
                j$.time.LocalDateTime r2 = r3.atTime((j$.time.LocalTime) r2)
                j$.time.zone.ZoneRules r3 = r0.getRules()
                j$.time.zone.ZoneOffsetTransition r3 = r3.getTransition(r2)
                if (r3 != 0) goto L_0x0072
                j$.time.zone.ZoneRules r3 = r0.getRules()
                j$.time.ZonedDateTime r0 = r2.atZone((j$.time.ZoneId) r0)
                j$.time.Instant r0 = r0.toInstant()
                boolean r0 = r3.isDaylightSavings(r0)
                goto L_0x0073
            L_0x0072:
                r0 = 2
            L_0x0073:
                java.util.Locale r8 = r8.getLocale()
                java.lang.String r8 = r7.getDisplayName(r1, r0, r8)
                if (r8 == 0) goto L_0x007e
                r1 = r8
            L_0x007e:
                r9.append(r1)
                r8 = 1
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.ZoneTextPrinterParser.format(j$.time.format.DateTimePrintContext, java.lang.StringBuilder):boolean");
        }

        /* access modifiers changed from: protected */
        public PrefixTree getTree(DateTimeParseContext dateTimeParseContext) {
            PrefixTree prefixTree;
            if (this.textStyle == TextStyle.NARROW) {
                return super.getTree(dateTimeParseContext);
            }
            Locale locale = dateTimeParseContext.getLocale();
            boolean isCaseSensitive = dateTimeParseContext.isCaseSensitive();
            Set availableZoneIds = ZoneRulesProvider.getAvailableZoneIds();
            int size = availableZoneIds.size();
            Map map = isCaseSensitive ? this.cachedTree : this.cachedTreeCI;
            Map.Entry entry = (Map.Entry) map.get(locale);
            if (entry == null || ((Integer) entry.getKey()).intValue() != size || (prefixTree = (PrefixTree) ((SoftReference) entry.getValue()).get()) == null) {
                prefixTree = PrefixTree.newTree(dateTimeParseContext);
                String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
                int length = zoneStrings.length;
                int i10 = 0;
                while (true) {
                    int i11 = 2;
                    if (i10 >= length) {
                        break;
                    }
                    String[] strArr = zoneStrings[i10];
                    String str = strArr[0];
                    if (availableZoneIds.contains(str)) {
                        prefixTree.add(str, str);
                        String zid = ZoneName.toZid(str, locale);
                        if (this.textStyle == TextStyle.FULL) {
                            i11 = 1;
                        }
                        while (i11 < strArr.length) {
                            prefixTree.add(strArr[i11], zid);
                            i11 += 2;
                        }
                    }
                    i10++;
                }
                if (this.preferredZones != null) {
                    for (String[] strArr2 : zoneStrings) {
                        String str2 = strArr2[0];
                        if (this.preferredZones.contains(str2) && availableZoneIds.contains(str2)) {
                            for (int i12 = this.textStyle == TextStyle.FULL ? 1 : 2; i12 < strArr2.length; i12 += 2) {
                                prefixTree.add(strArr2[i12], str2);
                            }
                        }
                    }
                }
                map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(prefixTree)));
            }
            return prefixTree;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        FIELD_MAP = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        TemporalField temporalField = IsoFields.QUARTER_OF_YEAR;
        hashMap.put('Q', temporalField);
        hashMap.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
        hashMap.put('g', JulianFields.MODIFIED_JULIAN_DAY);
    }

    public DateTimeFormatterBuilder() {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = null;
        this.optional = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z10) {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = dateTimeFormatterBuilder;
        this.optional = z10;
    }

    private int appendInternal(DateTimePrinterParser dateTimePrinterParser) {
        Objects.requireNonNull(dateTimePrinterParser, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        int i10 = dateTimeFormatterBuilder.padNextWidth;
        if (i10 > 0) {
            PadPrinterParserDecorator padPrinterParserDecorator = new PadPrinterParserDecorator(dateTimePrinterParser, i10, dateTimeFormatterBuilder.padNextChar);
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.active;
            dateTimeFormatterBuilder2.padNextWidth = 0;
            dateTimeFormatterBuilder2.padNextChar = 0;
            dateTimePrinterParser = padPrinterParserDecorator;
        }
        this.active.printerParsers.add(dateTimePrinterParser);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = this.active;
        dateTimeFormatterBuilder3.valueParserIndex = -1;
        return dateTimeFormatterBuilder3.printerParsers.size() - 1;
    }

    private DateTimeFormatterBuilder appendValue(NumberPrinterParser numberPrinterParser) {
        NumberPrinterParser numberPrinterParser2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        int i10 = dateTimeFormatterBuilder.valueParserIndex;
        if (i10 >= 0) {
            NumberPrinterParser numberPrinterParser3 = (NumberPrinterParser) dateTimeFormatterBuilder.printerParsers.get(i10);
            if (numberPrinterParser.minWidth == numberPrinterParser.maxWidth && numberPrinterParser.signStyle == SignStyle.NOT_NEGATIVE) {
                numberPrinterParser2 = numberPrinterParser3.withSubsequentWidth(numberPrinterParser.maxWidth);
                appendInternal(numberPrinterParser.withFixedWidth());
                this.active.valueParserIndex = i10;
            } else {
                numberPrinterParser2 = numberPrinterParser3.withFixedWidth();
                this.active.valueParserIndex = appendInternal(numberPrinterParser);
            }
            this.active.printerParsers.set(i10, numberPrinterParser2);
        } else {
            dateTimeFormatterBuilder.valueParserIndex = appendInternal(numberPrinterParser);
        }
        return this;
    }

    static /* synthetic */ ZoneId lambda$static$0(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        if (r11 == 1) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseField(char r10, int r11, j$.time.temporal.TemporalField r12) {
        /*
            r9 = this;
            r0 = 65
            r1 = 19
            if (r10 == r0) goto L_0x0170
            r0 = 81
            r2 = 5
            r3 = 4
            r4 = 3
            java.lang.String r5 = "Too many pattern letters: "
            r6 = 2
            r7 = 1
            r8 = 0
            if (r10 == r0) goto L_0x0126
            r0 = 83
            if (r10 == r0) goto L_0x0120
            r0 = 97
            if (r10 == r0) goto L_0x0108
            r0 = 107(0x6b, float:1.5E-43)
            if (r10 == r0) goto L_0x00eb
            r0 = 113(0x71, float:1.58E-43)
            if (r10 == r0) goto L_0x00e9
            r0 = 115(0x73, float:1.61E-43)
            if (r10 == r0) goto L_0x00eb
            r0 = 117(0x75, float:1.64E-43)
            if (r10 == r0) goto L_0x00da
            r0 = 121(0x79, float:1.7E-43)
            if (r10 == r0) goto L_0x00da
            r0 = 103(0x67, float:1.44E-43)
            if (r10 == r0) goto L_0x00d3
            r0 = 104(0x68, float:1.46E-43)
            if (r10 == r0) goto L_0x00eb
            r0 = 109(0x6d, float:1.53E-43)
            if (r10 == r0) goto L_0x00eb
            r0 = 110(0x6e, float:1.54E-43)
            if (r10 == r0) goto L_0x0170
            switch(r10) {
                case 68: goto L_0x00af;
                case 69: goto L_0x0126;
                case 70: goto L_0x0097;
                case 71: goto L_0x006b;
                case 72: goto L_0x00eb;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r10) {
                case 75: goto L_0x00eb;
                case 76: goto L_0x00e9;
                case 77: goto L_0x0126;
                case 78: goto L_0x0170;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r10) {
                case 99: goto L_0x0053;
                case 100: goto L_0x00eb;
                case 101: goto L_0x0126;
                default: goto L_0x0047;
            }
        L_0x0047:
            if (r11 != r7) goto L_0x004e
        L_0x0049:
            r9.appendValue((j$.time.temporal.TemporalField) r12)
            goto L_0x0174
        L_0x004e:
            r9.appendValue(r12, r11)
            goto L_0x0174
        L_0x0053:
            if (r11 != r7) goto L_0x005f
            j$.time.format.DateTimeFormatterBuilder$WeekBasedFieldPrinterParser r12 = new j$.time.format.DateTimeFormatterBuilder$WeekBasedFieldPrinterParser
            r12.<init>(r10, r11, r11, r11)
        L_0x005a:
            r9.appendValue((j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser) r12)
            goto L_0x0174
        L_0x005f:
            if (r11 == r6) goto L_0x0063
            goto L_0x00e9
        L_0x0063:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid pattern \"cc\""
            r10.<init>(r11)
            throw r10
        L_0x006b:
            if (r11 == r7) goto L_0x0094
            if (r11 == r6) goto L_0x0094
            if (r11 == r4) goto L_0x0094
            if (r11 == r3) goto L_0x0091
            if (r11 != r2) goto L_0x007c
        L_0x0075:
            j$.time.format.TextStyle r10 = j$.time.format.TextStyle.NARROW
        L_0x0077:
            r9.appendText((j$.time.temporal.TemporalField) r12, (j$.time.format.TextStyle) r10)
            goto L_0x0174
        L_0x007c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0091:
            j$.time.format.TextStyle r10 = j$.time.format.TextStyle.FULL
            goto L_0x0077
        L_0x0094:
            j$.time.format.TextStyle r10 = j$.time.format.TextStyle.SHORT
            goto L_0x0077
        L_0x0097:
            if (r11 != r7) goto L_0x009a
            goto L_0x0049
        L_0x009a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x00af:
            if (r11 != r7) goto L_0x00b2
            goto L_0x0049
        L_0x00b2:
            if (r11 == r6) goto L_0x00cc
            if (r11 != r4) goto L_0x00b7
            goto L_0x00cc
        L_0x00b7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x00cc:
            j$.time.format.SignStyle r10 = j$.time.format.SignStyle.NOT_NEGATIVE
            r9.appendValue(r12, r11, r4, r10)
            goto L_0x0174
        L_0x00d3:
            j$.time.format.SignStyle r10 = j$.time.format.SignStyle.NORMAL
        L_0x00d5:
            r9.appendValue(r12, r11, r1, r10)
            goto L_0x0174
        L_0x00da:
            if (r11 != r6) goto L_0x00e3
            j$.time.LocalDate r10 = j$.time.format.DateTimeFormatterBuilder.ReducedPrinterParser.BASE_DATE
            r9.appendValueReduced(r12, r6, r6, r10)
            goto L_0x0174
        L_0x00e3:
            if (r11 >= r3) goto L_0x00e6
            goto L_0x00d3
        L_0x00e6:
            j$.time.format.SignStyle r10 = j$.time.format.SignStyle.EXCEEDS_PAD
            goto L_0x00d5
        L_0x00e9:
            r8 = r7
            goto L_0x0126
        L_0x00eb:
            if (r11 != r7) goto L_0x00ef
            goto L_0x0049
        L_0x00ef:
            if (r11 != r6) goto L_0x00f3
            goto L_0x004e
        L_0x00f3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0108:
            if (r11 != r7) goto L_0x010b
            goto L_0x0094
        L_0x010b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0120:
            j$.time.temporal.ChronoField r10 = j$.time.temporal.ChronoField.NANO_OF_SECOND
            r9.appendFraction(r10, r11, r11, r8)
            goto L_0x0174
        L_0x0126:
            if (r11 == r7) goto L_0x0157
            if (r11 == r6) goto L_0x0157
            if (r11 == r4) goto L_0x0151
            if (r11 == r3) goto L_0x014b
            if (r11 != r2) goto L_0x0136
            if (r8 == 0) goto L_0x0075
            j$.time.format.TextStyle r10 = j$.time.format.TextStyle.NARROW_STANDALONE
            goto L_0x0077
        L_0x0136:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x014b:
            if (r8 == 0) goto L_0x0091
            j$.time.format.TextStyle r10 = j$.time.format.TextStyle.FULL_STANDALONE
            goto L_0x0077
        L_0x0151:
            if (r8 == 0) goto L_0x0094
            j$.time.format.TextStyle r10 = j$.time.format.TextStyle.SHORT_STANDALONE
            goto L_0x0077
        L_0x0157:
            r0 = 101(0x65, float:1.42E-43)
            if (r10 != r0) goto L_0x0162
            j$.time.format.DateTimeFormatterBuilder$WeekBasedFieldPrinterParser r12 = new j$.time.format.DateTimeFormatterBuilder$WeekBasedFieldPrinterParser
            r12.<init>(r10, r11, r11, r11)
            goto L_0x005a
        L_0x0162:
            r0 = 69
            if (r10 != r0) goto L_0x0168
            goto L_0x0094
        L_0x0168:
            if (r11 != r7) goto L_0x016c
            goto L_0x0049
        L_0x016c:
            r9.appendValue(r12, r6)
            goto L_0x0174
        L_0x0170:
            j$.time.format.SignStyle r10 = j$.time.format.SignStyle.NOT_NEGATIVE
            goto L_0x00d5
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.parseField(char, int, j$.time.temporal.TemporalField):void");
    }

    private void parsePattern(String str) {
        WeekBasedFieldPrinterParser weekBasedFieldPrinterParser;
        String str2;
        String str3;
        TextStyle textStyle;
        TextStyle textStyle2;
        int i10;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i12 = i11 + 1;
                while (i12 < str.length() && str.charAt(i12) == charAt) {
                    i12++;
                }
                int i13 = i12 - i11;
                if (charAt == 'p') {
                    if (i12 >= str.length() || (((charAt = str.charAt(i12)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i10 = i13;
                        i13 = 0;
                    } else {
                        int i14 = i12 + 1;
                        while (i14 < str.length() && str.charAt(i14) == charAt) {
                            i14++;
                        }
                        i10 = i14 - i12;
                        i12 = i14;
                    }
                    if (i13 != 0) {
                        padNext(i13);
                        i13 = i10;
                    } else {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                }
                TemporalField temporalField = (TemporalField) FIELD_MAP.get(Character.valueOf(charAt));
                if (temporalField != null) {
                    parseField(charAt, i13, temporalField);
                } else if (charAt == 'z') {
                    if (i13 <= 4) {
                        appendZoneText(i13 == 4 ? TextStyle.FULL : TextStyle.SHORT);
                    } else {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                } else if (charAt == 'V') {
                    if (i13 == 2) {
                        appendZoneId();
                    } else {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                    }
                } else if (charAt == 'v') {
                    if (i13 == 1) {
                        textStyle2 = TextStyle.SHORT;
                    } else if (i13 == 4) {
                        textStyle2 = TextStyle.FULL;
                    } else {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + charAt);
                    }
                    appendGenericZoneText(textStyle2);
                } else {
                    String str4 = "+0000";
                    if (charAt == 'Z') {
                        if (i13 < 4) {
                            str2 = "+HHMM";
                        } else {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    str3 = "+HH:MM:ss";
                                    appendOffset(str3, "Z");
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                            }
                            textStyle = TextStyle.FULL;
                            appendLocalizedOffset(textStyle);
                        }
                    } else if (charAt == 'O') {
                        if (i13 == 1) {
                            textStyle = TextStyle.SHORT;
                            appendLocalizedOffset(textStyle);
                        } else {
                            if (i13 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                            }
                            textStyle = TextStyle.FULL;
                            appendLocalizedOffset(textStyle);
                        }
                    } else if (charAt == 'X') {
                        if (i13 <= 5) {
                            str3 = OffsetIdPrinterParser.PATTERNS[i13 + (i13 == 1 ? 0 : 1)];
                            appendOffset(str3, "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt != 'x') {
                        if (charAt == 'W') {
                            if (i13 <= 1) {
                                weekBasedFieldPrinterParser = new WeekBasedFieldPrinterParser(charAt, i13, i13, i13);
                            } else {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                        } else if (charAt == 'w') {
                            if (i13 <= 2) {
                                weekBasedFieldPrinterParser = new WeekBasedFieldPrinterParser(charAt, i13, i13, 2);
                            } else {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                        } else if (charAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                        } else if (i13 != 2) {
                            weekBasedFieldPrinterParser = new WeekBasedFieldPrinterParser(charAt, i13, i13, 19);
                        }
                        appendValue((NumberPrinterParser) weekBasedFieldPrinterParser);
                    } else if (i13 <= 5) {
                        if (i13 == 1) {
                            str4 = "+00";
                        } else if (i13 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = OffsetIdPrinterParser.PATTERNS[i13 + (i13 == 1 ? 0 : 1)];
                    } else {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                    appendOffset(str2, str4);
                }
                i11 = i12 - 1;
            } else if (charAt == '\'') {
                int i15 = i11 + 1;
                int i16 = i15;
                while (i16 < str.length()) {
                    if (str.charAt(i16) == '\'') {
                        int i17 = i16 + 1;
                        if (i17 >= str.length() || str.charAt(i17) != '\'') {
                            break;
                        }
                        i16 = i17;
                    }
                    i16++;
                }
                if (i16 < str.length()) {
                    String substring = str.substring(i15, i16);
                    if (substring.isEmpty()) {
                        appendLiteral('\'');
                    } else {
                        appendLiteral(substring.replace("''", "'"));
                    }
                    i11 = i16;
                } else {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
            } else if (charAt == '[') {
                optionalStart();
            } else if (charAt == ']') {
                if (this.active.parent != null) {
                    optionalEnd();
                } else {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            } else {
                appendLiteral(charAt);
            }
            i11++;
        }
    }

    private DateTimeFormatter toFormatter(Locale locale, ResolverStyle resolverStyle, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.active.parent != null) {
            optionalEnd();
        }
        return new DateTimeFormatter(new CompositePrinterParser(this.printerParsers, false), locale, DecimalStyle.STANDARD, resolverStyle, (Set) null, chronology, (ZoneId) null);
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        appendInternal(dateTimeFormatter.toPrinterParser(false));
        return this;
    }

    public DateTimeFormatterBuilder appendFraction(TemporalField temporalField, int i10, int i11, boolean z10) {
        if (i10 != i11 || z10) {
            appendInternal(new FractionPrinterParser(temporalField, i10, i11, z10));
        } else {
            appendValue((NumberPrinterParser) new FractionPrinterParser(temporalField, i10, i11, z10));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendGenericZoneText(TextStyle textStyle) {
        appendInternal(new ZoneTextPrinterParser(textStyle, (Set) null, true));
        return this;
    }

    public DateTimeFormatterBuilder appendInstant() {
        appendInternal(new InstantPrinterParser(-2));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(char c10) {
        appendInternal(new CharLiteralPrinterParser(c10));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            appendInternal(str.length() == 1 ? new CharLiteralPrinterParser(str.charAt(0)) : new StringLiteralPrinterParser(str));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            appendInternal(new LocalizedOffsetIdPrinterParser(textStyle));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        appendInternal(new OffsetIdPrinterParser(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        appendInternal(OffsetIdPrinterParser.INSTANCE_ID_Z);
        return this;
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        Objects.requireNonNull(str, "pattern");
        parsePattern(str);
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        appendInternal(new TextPrinterParser(temporalField, textStyle, DateTimeTextProvider.getInstance()));
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, Map map) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        final DateTimeTextProvider.LocaleStore localeStore = new DateTimeTextProvider.LocaleStore(Collections.singletonMap(textStyle, linkedHashMap));
        appendInternal(new TextPrinterParser(temporalField, textStyle, new DateTimeTextProvider() {
            public String getText(Chronology chronology, TemporalField temporalField, long j10, TextStyle textStyle, Locale locale) {
                return localeStore.getText(j10, textStyle);
            }

            public String getText(TemporalField temporalField, long j10, TextStyle textStyle, Locale locale) {
                return localeStore.getText(j10, textStyle);
            }

            public Iterator getTextIterator(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
                return localeStore.getTextIterator(textStyle);
            }

            public Iterator getTextIterator(TemporalField temporalField, TextStyle textStyle, Locale locale) {
                return localeStore.getTextIterator(textStyle);
            }
        }));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        appendValue(new NumberPrinterParser(temporalField, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10) {
        Objects.requireNonNull(temporalField, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        appendValue(new NumberPrinterParser(temporalField, i10, i10, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        if (i10 == i11 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i11);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        } else if (i11 >= i10) {
            appendValue(new NumberPrinterParser(temporalField, i10, i11, signStyle));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    public DateTimeFormatterBuilder appendValueReduced(TemporalField temporalField, int i10, int i11, ChronoLocalDate chronoLocalDate) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(chronoLocalDate, "baseDate");
        appendValue((NumberPrinterParser) new ReducedPrinterParser(temporalField, i10, i11, 0, chronoLocalDate));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneId() {
        appendInternal(new ZoneIdPrinterParser(TemporalQueries.zoneId(), "ZoneId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneRegionId() {
        appendInternal(new ZoneIdPrinterParser(QUERY_REGION_ONLY, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) {
        appendInternal(new ZoneTextPrinterParser(textStyle, (Set) null, false));
        return this;
    }

    public DateTimeFormatterBuilder optionalEnd() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        if (dateTimeFormatterBuilder.parent != null) {
            if (dateTimeFormatterBuilder.printerParsers.size() > 0) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.active;
                CompositePrinterParser compositePrinterParser = new CompositePrinterParser(dateTimeFormatterBuilder2.printerParsers, dateTimeFormatterBuilder2.optional);
                this.active = this.active.parent;
                appendInternal(compositePrinterParser);
            } else {
                this.active = this.active.parent;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public DateTimeFormatterBuilder optionalStart() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        dateTimeFormatterBuilder.valueParserIndex = -1;
        this.active = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder padNext(int i10) {
        return padNext(i10, ' ');
    }

    public DateTimeFormatterBuilder padNext(int i10, char c10) {
        if (i10 >= 1) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
            dateTimeFormatterBuilder.padNextWidth = i10;
            dateTimeFormatterBuilder.padNextChar = c10;
            dateTimeFormatterBuilder.valueParserIndex = -1;
            return this;
        }
        throw new IllegalArgumentException("The pad width must be at least one but was " + i10);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        appendInternal(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseCaseSensitive() {
        appendInternal(SettingsParser.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseLenient() {
        appendInternal(SettingsParser.LENIENT);
        return this;
    }

    public DateTimeFormatterBuilder parseStrict() {
        appendInternal(SettingsParser.STRICT);
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    /* access modifiers changed from: package-private */
    public DateTimeFormatter toFormatter(ResolverStyle resolverStyle, Chronology chronology) {
        return toFormatter(Locale.getDefault(), resolverStyle, chronology);
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return toFormatter(locale, ResolverStyle.SMART, (Chronology) null);
    }
}
