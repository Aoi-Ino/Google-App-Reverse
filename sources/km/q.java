package km;

import bm.p;
import cm.l;
import cm.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jm.g;
import org.json.HTTP;
import pl.o;
import pl.t;
import ql.e0;

abstract class q extends p {

    static final class a extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ char[] f24762e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f24763f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f24762e = cArr;
            this.f24763f = z10;
        }

        public final o b(CharSequence charSequence, int i10) {
            l.f(charSequence, "$this$$receiver");
            int R = q.R(charSequence, this.f24762e, i10, this.f24763f);
            if (R < 0) {
                return null;
            }
            return t.a(Integer.valueOf(R), 1);
        }

        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f24764e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f24765f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, boolean z10) {
            super(2);
            this.f24764e = list;
            this.f24765f = z10;
        }

        public final o b(CharSequence charSequence, int i10) {
            l.f(charSequence, "$this$$receiver");
            o B = q.I(charSequence, this.f24764e, i10, this.f24765f, false);
            if (B != null) {
                return t.a(B.c(), Integer.valueOf(((String) B.d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CharSequence f24766e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f24766e = charSequence;
        }

        /* renamed from: b */
        public final String invoke(hm.c cVar) {
            l.f(cVar, "it");
            return q.q0(this.f24766e, cVar);
        }
    }

    public static /* synthetic */ String A0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return y0(str, str2, str3);
    }

    public static CharSequence B0(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = b.c(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean C(CharSequence charSequence, char c10, boolean z10) {
        l.f(charSequence, "<this>");
        return P(charSequence, c10, 0, z10, 2, (Object) null) >= 0;
    }

    public static boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (Q(charSequence, (String) charSequence2, 0, z10, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (O(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, (Object) null) < 0) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean E(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return D(charSequence, charSequence2, z10);
    }

    public static final boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return p.n((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return d0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean H(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return G(charSequence, charSequence2, z10);
    }

    /* access modifiers changed from: private */
    public static final o I(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        int i11;
        Object obj;
        String str;
        Object obj2;
        if (z10 || collection.size() != 1) {
            hm.a cVar = !z11 ? new hm.c(f.b(i10, 0), charSequence.length()) : f.g(f.d(i10, K(charSequence)), 0);
            if (charSequence instanceof String) {
                i11 = cVar.l();
                int n10 = cVar.n();
                int o10 = cVar.o();
                if ((o10 > 0 && i11 <= n10) || (o10 < 0 && n10 <= i11)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (p.r(str2, 0, (String) charSequence, i11, str2.length(), z10)) {
                                break;
                            }
                        }
                        str = (String) obj2;
                        if (str == null) {
                            if (i11 == n10) {
                                break;
                            }
                            i11 += o10;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int l10 = cVar.l();
            int n11 = cVar.n();
            int o11 = cVar.o();
            if ((o11 > 0 && l10 <= n11) || (o11 < 0 && n11 <= l10)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str3 = (String) obj;
                        if (d0(str3, 0, charSequence, i11, str3.length(), z10)) {
                            break;
                        }
                    }
                    str = (String) obj;
                    if (str == null) {
                        if (i11 == n11) {
                            break;
                        }
                        l10 = i11 + o11;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return t.a(Integer.valueOf(i11), str);
        }
        String str4 = (String) y.l0(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i12 = i10;
        int Q = !z11 ? Q(charSequence2, str5, i12, false, 4, (Object) null) : V(charSequence2, str5, i12, false, 4, (Object) null);
        if (Q < 0) {
            return null;
        }
        return t.a(Integer.valueOf(Q), str4);
    }

    public static final hm.c J(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return new hm.c(0, charSequence.length() - 1);
    }

    public static final int K(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int L(CharSequence charSequence, char c10, int i10, boolean z10) {
        l.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return R(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int M(CharSequence charSequence, String str, int i10, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return O(charSequence, str, i10, charSequence.length(), z10, false, 16, (Object) null);
    }

    private static final int N(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        hm.a cVar = !z11 ? new hm.c(f.b(i10, 0), f.d(i11, charSequence.length())) : f.g(f.d(i10, K(charSequence)), f.b(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int l10 = cVar.l();
            int n10 = cVar.n();
            int o10 = cVar.o();
            if ((o10 <= 0 || l10 > n10) && (o10 >= 0 || n10 > l10)) {
                return -1;
            }
            while (true) {
                if (d0(charSequence2, 0, charSequence, l10, charSequence2.length(), z10)) {
                    return l10;
                }
                if (l10 == n10) {
                    return -1;
                }
                l10 += o10;
            }
        } else {
            int l11 = cVar.l();
            int n11 = cVar.n();
            int o11 = cVar.o();
            if ((o11 <= 0 || l11 > n11) && (o11 >= 0 || n11 > l11)) {
                return -1;
            }
            while (true) {
                if (p.r((String) charSequence2, 0, (String) charSequence, l11, charSequence2.length(), z10)) {
                    return l11;
                }
                if (l11 == n11) {
                    return -1;
                }
                l11 += o11;
            }
        }
    }

    static /* synthetic */ int O(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return N(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int P(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return L(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return M(charSequence, str, i10, z10);
    }

    public static final int R(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            e0 r10 = new hm.c(f.b(i10, 0), K(charSequence)).iterator();
            while (r10.hasNext()) {
                int a10 = r10.a();
                char charAt = charSequence.charAt(a10);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (c.d(cArr[i11], charAt, z10)) {
                            return a10;
                        }
                        i11++;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(m.D(cArr), i10);
    }

    public static final int S(CharSequence charSequence, char c10, int i10, boolean z10) {
        l.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return W(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int T(CharSequence charSequence, String str, int i10, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(str, "string");
        return (z10 || !(charSequence instanceof String)) ? N(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int U(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = K(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return S(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = K(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return T(charSequence, str, i10, z10);
    }

    public static final int W(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int d10 = f.d(i10, K(charSequence)); -1 < d10; d10--) {
                char charAt = charSequence.charAt(d10);
                for (char d11 : cArr) {
                    if (c.d(d11, charAt, z10)) {
                        return d10;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(m.D(cArr), i10);
    }

    public static final g X(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return n0(charSequence, new String[]{HTTP.CRLF, "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List Y(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return o.s(X(charSequence));
    }

    private static final g Z(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        g0(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final g a0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        g0(i11);
        return new e(charSequence, i10, i11, new b(l.c(strArr), z10));
    }

    static /* synthetic */ g b0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return Z(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ g c0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return a0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean d0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String e0(String str, CharSequence charSequence) {
        l.f(str, "<this>");
        l.f(charSequence, "prefix");
        if (!p0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        l.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String f0(String str, CharSequence charSequence) {
        l.f(str, "<this>");
        l.f(charSequence, "suffix");
        if (!H(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void g0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    public static final List h0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        l.f(charSequence, "<this>");
        l.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return j0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<hm.c> e10 = o.e(b0(charSequence, cArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(r.s(e10, 10));
        for (hm.c q02 : e10) {
            arrayList.add(q0(charSequence, q02));
        }
        return arrayList;
    }

    public static final List i0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        l.f(charSequence, "<this>");
        l.f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return j0(charSequence, str, z10, i10);
            }
        }
        Iterable<hm.c> e10 = o.e(c0(charSequence, strArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(r.s(e10, 10));
        for (hm.c q02 : e10) {
            arrayList.add(q0(charSequence, q02));
        }
        return arrayList;
    }

    private static final List j0(CharSequence charSequence, String str, boolean z10, int i10) {
        g0(i10);
        int i11 = 0;
        int M = M(charSequence, str, 0, z10);
        if (M == -1 || i10 == 1) {
            return p.d(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = f.d(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, M).toString());
            i11 = str.length() + M;
            if ((z11 && arrayList.size() == i10 - 1) || (M = M(charSequence, str, i11, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, M).toString());
            i11 = str.length() + M;
            break;
        } while ((M = M(charSequence, str, i11, z10)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List k0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List l0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return i0(charSequence, strArr, z10, i10);
    }

    public static final g m0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        l.f(charSequence, "<this>");
        l.f(strArr, "delimiters");
        return o.p(c0(charSequence, strArr, 0, z10, i10, 2, (Object) null), new c(charSequence));
    }

    public static /* synthetic */ g n0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m0(charSequence, strArr, z10, i10);
    }

    public static final boolean o0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return p.A((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return d0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean p0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return o0(charSequence, charSequence2, z10);
    }

    public static final String q0(CharSequence charSequence, hm.c cVar) {
        l.f(charSequence, "<this>");
        l.f(cVar, "range");
        return charSequence.subSequence(cVar.B().intValue(), cVar.y().intValue() + 1).toString();
    }

    public static final String r0(String str, char c10, String str2) {
        l.f(str, "<this>");
        l.f(str2, "missingDelimiterValue");
        int P = P(str, c10, 0, false, 6, (Object) null);
        if (P == -1) {
            return str2;
        }
        String substring = str.substring(P + 1, str.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String s0(String str, String str2, String str3) {
        l.f(str, "<this>");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        int Q = Q(str, str2, 0, false, 6, (Object) null);
        if (Q == -1) {
            return str3;
        }
        String substring = str.substring(Q + str2.length(), str.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String t0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return r0(str, c10, str2);
    }

    public static /* synthetic */ String u0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return s0(str, str2, str3);
    }

    public static final String v0(String str, char c10, String str2) {
        l.f(str, "<this>");
        l.f(str2, "missingDelimiterValue");
        int U = U(str, c10, 0, false, 6, (Object) null);
        if (U == -1) {
            return str2;
        }
        String substring = str.substring(U + 1, str.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String w0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return v0(str, c10, str2);
    }

    public static final String x0(String str, char c10, String str2) {
        l.f(str, "<this>");
        l.f(str2, "missingDelimiterValue");
        int P = P(str, c10, 0, false, 6, (Object) null);
        if (P == -1) {
            return str2;
        }
        String substring = str.substring(0, P);
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String y0(String str, String str2, String str3) {
        l.f(str, "<this>");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        int Q = Q(str, str2, 0, false, 6, (Object) null);
        if (Q == -1) {
            return str3;
        }
        String substring = str.substring(0, Q);
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String z0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return x0(str, c10, str2);
    }
}
