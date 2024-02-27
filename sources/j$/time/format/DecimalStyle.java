package j$.time.format;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class DecimalStyle {
    private static final ConcurrentMap CACHE = new ConcurrentHashMap(16, 0.75f, 2);
    public static final DecimalStyle STANDARD = new DecimalStyle('0', '+', '-', '.');
    private final char decimalSeparator;
    private final char negativeSign;
    private final char positiveSign;
    private final char zeroDigit;

    private DecimalStyle(char c10, char c11, char c12, char c13) {
        this.zeroDigit = c10;
        this.positiveSign = c11;
        this.negativeSign = c12;
        this.decimalSeparator = c13;
    }

    /* access modifiers changed from: package-private */
    public String convertNumberToI18N(String str) {
        char c10 = this.zeroDigit;
        if (c10 == '0') {
            return str;
        }
        int i10 = c10 - '0';
        char[] charArray = str.toCharArray();
        for (int i11 = 0; i11 < charArray.length; i11++) {
            charArray[i11] = (char) (charArray[i11] + i10);
        }
        return new String(charArray);
    }

    /* access modifiers changed from: package-private */
    public int convertToDigit(char c10) {
        int i10 = c10 - this.zeroDigit;
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.zeroDigit == decimalStyle.zeroDigit && this.positiveSign == decimalStyle.positiveSign && this.negativeSign == decimalStyle.negativeSign && this.decimalSeparator == decimalStyle.decimalSeparator;
    }

    public char getDecimalSeparator() {
        return this.decimalSeparator;
    }

    public char getNegativeSign() {
        return this.negativeSign;
    }

    public char getPositiveSign() {
        return this.positiveSign;
    }

    public char getZeroDigit() {
        return this.zeroDigit;
    }

    public int hashCode() {
        return this.zeroDigit + this.positiveSign + this.negativeSign + this.decimalSeparator;
    }

    public String toString() {
        char c10 = this.zeroDigit;
        char c11 = this.positiveSign;
        char c12 = this.negativeSign;
        char c13 = this.decimalSeparator;
        return "DecimalStyle[" + c10 + c11 + c12 + c13 + "]";
    }
}
