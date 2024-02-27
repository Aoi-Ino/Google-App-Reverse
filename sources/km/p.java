package km;

import cm.l;
import hm.c;
import java.util.Collection;
import java.util.Iterator;
import ql.e0;

abstract class p extends o {
    public static /* synthetic */ boolean A(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return y(str, str2, z10);
    }

    public static final boolean m(String str, String str2, boolean z10) {
        l.f(str, "<this>");
        l.f(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return r(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean n(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m(str, str2, z10);
    }

    public static boolean o(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean p(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return o(str, str2, z10);
    }

    public static boolean q(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            c J = q.J(charSequence);
            if (!(J instanceof Collection) || !((Collection) J).isEmpty()) {
                Iterator it = J.iterator();
                while (it.hasNext()) {
                    if (!b.c(charSequence.charAt(((e0) it).a()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean r(String str, int i10, String str2, int i11, int i12, boolean z10) {
        l.f(str, "<this>");
        l.f(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String s(CharSequence charSequence, int i10) {
        l.f(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 == 0) {
            return "";
        } else {
            if (i10 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                e0 r10 = new c(1, i10).iterator();
                while (r10.hasNext()) {
                    r10.a();
                    sb2.append(charSequence);
                }
                String sb3 = sb2.toString();
                l.e(sb3, "{\n                    va…tring()\n                }");
                return sb3;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String t(String str, char c10, char c11, boolean z10) {
        String sb2;
        String str2;
        l.f(str, "<this>");
        if (!z10) {
            sb2 = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (c.d(charAt, c10, z10)) {
                    charAt = c11;
                }
                sb3.append(charAt);
            }
            sb2 = sb3.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        l.e(sb2, str2);
        return sb2;
    }

    public static final String u(String str, String str2, String str3, boolean z10) {
        l.f(str, "<this>");
        l.f(str2, "oldValue");
        l.f(str3, "newValue");
        int i10 = 0;
        int M = q.M(str, str2, 0, z10);
        if (M < 0) {
            return str;
        }
        int length = str2.length();
        int b10 = f.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append(str, i10, M);
                sb2.append(str3);
                i10 = M + length;
                if (M >= str.length() || (M = q.M(str, str2, M + b10, z10)) <= 0) {
                    sb2.append(str, i10, str.length());
                    String sb3 = sb2.toString();
                    l.e(sb3, "stringBuilder.append(this, i, length).toString()");
                }
                sb2.append(str, i10, M);
                sb2.append(str3);
                i10 = M + length;
                break;
            } while ((M = q.M(str, str2, M + b10, z10)) <= 0);
            sb2.append(str, i10, str.length());
            String sb32 = sb2.toString();
            l.e(sb32, "stringBuilder.append(this, i, length).toString()");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String v(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return t(str, c10, c11, z10);
    }

    public static /* synthetic */ String w(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return u(str, str2, str3, z10);
    }

    public static boolean x(String str, String str2, int i10, boolean z10) {
        l.f(str, "<this>");
        l.f(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return r(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean y(String str, String str2, boolean z10) {
        l.f(str, "<this>");
        l.f(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return r(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean z(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return x(str, str2, i10, z10);
    }
}
