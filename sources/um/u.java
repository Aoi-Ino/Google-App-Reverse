package um;

import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pl.o;
import pl.t;

public final class u implements Iterable, dm.a {

    /* renamed from: f  reason: collision with root package name */
    public static final b f32130f = new b((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String[] f32131e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f32132a = new ArrayList(20);

        public final a a(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "value");
            b bVar = u.f32130f;
            bVar.d(str);
            bVar.e(str2, str);
            d(str, str2);
            return this;
        }

        public final a b(u uVar) {
            l.f(uVar, "headers");
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(uVar.n(i10), uVar.s(i10));
            }
            return this;
        }

        public final a c(String str) {
            l.f(str, "line");
            int P = q.P(str, ':', 1, false, 4, (Object) null);
            if (P != -1) {
                String substring = str.substring(0, P);
                l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(P + 1);
                l.e(substring2, "(this as java.lang.String).substring(startIndex)");
                d(substring, substring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    l.e(str, "(this as java.lang.String).substring(startIndex)");
                }
                d("", str);
            }
            return this;
        }

        public final a d(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "value");
            this.f32132a.add(str);
            this.f32132a.add(q.B0(str2).toString());
            return this;
        }

        public final u e() {
            Object[] array = this.f32132a.toArray(new String[0]);
            if (array != null) {
                return new u((String[]) array, (g) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final List f() {
            return this.f32132a;
        }

        public final a g(String str) {
            l.f(str, "name");
            int i10 = 0;
            while (i10 < this.f32132a.size()) {
                if (p.o(str, (String) this.f32132a.get(i10), true)) {
                    this.f32132a.remove(i10);
                    this.f32132a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a h(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "value");
            b bVar = u.f32130f;
            bVar.d(str);
            bVar.e(str2, str);
            g(str);
            d(str, str2);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i10 = 0;
                while (i10 < length) {
                    char charAt = str.charAt(i10);
                    if ('!' <= charAt && '~' >= charAt) {
                        i10++;
                    } else {
                        throw new IllegalArgumentException(vm.b.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        public final void e(String str, String str2) {
            String str3;
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!(charAt == 9 || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(vm.b.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i10), str2));
                    if (vm.b.D(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb2.append(str3);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            hm.a h10 = f.h(f.g(strArr.length - 2, 0), 2);
            int l10 = h10.l();
            int n10 = h10.n();
            int o10 = h10.o();
            if (o10 >= 0) {
                if (l10 > n10) {
                    return null;
                }
            } else if (l10 < n10) {
                return null;
            }
            while (!p.o(str, strArr[l10], true)) {
                if (l10 == n10) {
                    return null;
                }
                l10 += o10;
            }
            return strArr[l10 + 1];
        }

        public final u g(String... strArr) {
            l.f(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    int i10 = 0;
                    while (i10 < length) {
                        String str = strArr2[i10];
                        if (!(str != null)) {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        } else if (str != null) {
                            strArr2[i10] = q.B0(str).toString();
                            i10++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    hm.a h10 = f.h(m.w(strArr2), 2);
                    int l10 = h10.l();
                    int n10 = h10.n();
                    int o10 = h10.o();
                    if (o10 < 0 ? l10 >= n10 : l10 <= n10) {
                        while (true) {
                            String str2 = strArr2[l10];
                            String str3 = strArr2[l10 + 1];
                            d(str2);
                            e(str3, str2);
                            if (l10 == n10) {
                                break;
                            }
                            l10 += o10;
                        }
                    }
                    return new u(strArr2, (g) null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private u(String[] strArr) {
        this.f32131e = strArr;
    }

    public static final u r(String... strArr) {
        return f32130f.g(strArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Arrays.equals(this.f32131e, ((u) obj).f32131e);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f32131e);
    }

    public Iterator iterator() {
        int size = size();
        o[] oVarArr = new o[size];
        for (int i10 = 0; i10 < size; i10++) {
            oVarArr[i10] = t.a(n(i10), s(i10));
        }
        return cm.b.a(oVarArr);
    }

    public final String l(String str) {
        l.f(str, "name");
        return f32130f.f(this.f32131e, str);
    }

    public final String n(int i10) {
        return this.f32131e[i10 * 2];
    }

    public final a o() {
        a aVar = new a();
        boolean unused = v.w(aVar.f(), this.f32131e);
        return aVar;
    }

    public final String s(int i10) {
        return this.f32131e[(i10 * 2) + 1];
    }

    public final int size() {
        return this.f32131e.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String n10 = n(i10);
            String s10 = s(i10);
            sb2.append(n10);
            sb2.append(": ");
            if (vm.b.D(n10)) {
                s10 = "██";
            }
            sb2.append(s10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final List v(String str) {
        l.f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (p.o(str, n(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(s(i10));
            }
        }
        if (arrayList == null) {
            return q.i();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        l.e(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public /* synthetic */ u(String[] strArr, g gVar) {
        this(strArr);
    }
}
