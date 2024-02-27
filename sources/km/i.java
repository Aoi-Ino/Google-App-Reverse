package km;

import bm.l;
import cm.m;
import f.j;
import java.util.ArrayList;
import java.util.List;

abstract class i extends h {

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final a f24760e = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(String str) {
            cm.l.f(str, "line");
            return str;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f24761e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f24761e = str;
        }

        /* renamed from: b */
        public final String invoke(String str) {
            cm.l.f(str, "line");
            return this.f24761e + str;
        }
    }

    private static final l b(String str) {
        return str.length() == 0 ? a.f24760e : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!b.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String str2) {
        String str3;
        cm.l.f(str, "<this>");
        cm.l.f(str2, "newIndent");
        List Y = q.Y(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : Y) {
            if (!p.q((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.s(arrayList, 10));
        for (String c10 : arrayList) {
            arrayList2.add(Integer.valueOf(c(c10)));
        }
        Integer num = (Integer) y.h0(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * Y.size());
        l b10 = b(str2);
        int k10 = q.k(Y);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : Y) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.r();
            }
            String str4 = (String) next2;
            if ((i10 == 0 || i10 == k10) && p.q(str4)) {
                str4 = null;
            } else {
                String C0 = s.C0(str4, intValue);
                if (!(C0 == null || (str3 = (String) b10.invoke(C0)) == null)) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i10 = i11;
        }
        String sb2 = ((StringBuilder) y.b0(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, j.K0, (Object) null)).toString();
        cm.l.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static final String e(String str, String str2, String str3) {
        int i10;
        String str4;
        cm.l.f(str, "<this>");
        cm.l.f(str2, "newIndent");
        cm.l.f(str3, "marginPrefix");
        if (!p.q(str3)) {
            List Y = q.Y(str);
            int length = str.length() + (str2.length() * Y.size());
            l b10 = b(str2);
            int k10 = q.k(Y);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object next : Y) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    q.r();
                }
                String str5 = (String) next;
                String str6 = null;
                if ((i11 == 0 || i11 == k10) && p.q(str5)) {
                    str5 = null;
                } else {
                    int length2 = str5.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length2) {
                            i10 = -1;
                            break;
                        } else if (!b.c(str5.charAt(i13))) {
                            i10 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i10 != -1) {
                        int i14 = i10;
                        if (p.z(str5, str3, i10, false, 4, (Object) null)) {
                            cm.l.d(str5, "null cannot be cast to non-null type java.lang.String");
                            str6 = str5.substring(i14 + str3.length());
                            cm.l.e(str6, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str6 == null || (str4 = (String) b10.invoke(str6)) == null)) {
                        str5 = str4;
                    }
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
                i11 = i12;
            }
            String sb2 = ((StringBuilder) y.b0(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, j.K0, (Object) null)).toString();
            cm.l.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static String f(String str) {
        cm.l.f(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        cm.l.f(str, "<this>");
        cm.l.f(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
