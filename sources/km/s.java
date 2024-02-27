package km;

import cm.l;
import java.util.NoSuchElementException;

abstract class s extends r {
    public static final String C0(String str, int i10) {
        l.f(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(f.d(i10, str.length()));
            l.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char D0(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(q.K(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String E0(String str, int i10) {
        l.f(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, f.d(i10, str.length()));
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String F0(String str, int i10) {
        l.f(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String substring = str.substring(length - f.d(i10, length));
            l.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
