package a1;

import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final b f25e = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f26a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f27b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f28c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f29d;

    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0001a f30h = new C0001a((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f31a;

        /* renamed from: b  reason: collision with root package name */
        public final String f32b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f33c;

        /* renamed from: d  reason: collision with root package name */
        public final int f34d;

        /* renamed from: e  reason: collision with root package name */
        public final String f35e;

        /* renamed from: f  reason: collision with root package name */
        public final int f36f;

        /* renamed from: g  reason: collision with root package name */
        public final int f37g;

        /* renamed from: a1.d$a$a  reason: collision with other inner class name */
        public static final class C0001a {
            private C0001a() {
            }

            public /* synthetic */ C0001a(g gVar) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String str, String str2) {
                l.f(str, "current");
                if (l.a(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return l.a(q.B0(substring).toString(), str2);
            }
        }

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            l.f(str, "name");
            l.f(str2, "type");
            this.f31a = str;
            this.f32b = str2;
            this.f33c = z10;
            this.f34d = i10;
            this.f35e = str3;
            this.f36f = i11;
            this.f37g = a(str2);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            l.e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (q.F(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (q.F(upperCase, "CHAR", false, 2, (Object) null) || q.F(upperCase, "CLOB", false, 2, (Object) null) || q.F(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (q.F(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (q.F(upperCase, "REAL", false, 2, (Object) null) || q.F(upperCase, "FLOA", false, 2, (Object) null) || q.F(upperCase, "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f34d != ((a) obj).f34d) {
                return false;
            }
            a aVar = (a) obj;
            if (!l.a(this.f31a, aVar.f31a) || this.f33c != aVar.f33c) {
                return false;
            }
            if (this.f36f == 1 && aVar.f36f == 2 && (str3 = this.f35e) != null && !f30h.b(str3, aVar.f35e)) {
                return false;
            }
            if (this.f36f == 2 && aVar.f36f == 1 && (str2 = aVar.f35e) != null && !f30h.b(str2, this.f35e)) {
                return false;
            }
            int i10 = this.f36f;
            if (i10 == 0 || i10 != aVar.f36f || ((str = this.f35e) == null ? aVar.f35e == null : f30h.b(str, aVar.f35e))) {
                return this.f37g == aVar.f37g;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f31a.hashCode() * 31) + this.f37g) * 31) + (this.f33c ? 1231 : 1237)) * 31) + this.f34d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f31a);
            sb2.append("', type='");
            sb2.append(this.f32b);
            sb2.append("', affinity='");
            sb2.append(this.f37g);
            sb2.append("', notNull=");
            sb2.append(this.f33c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f34d);
            sb2.append(", defaultValue='");
            String str = this.f35e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final d a(d1.g gVar, String str) {
            l.f(gVar, "database");
            l.f(str, "tableName");
            return e.f(gVar, str);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f38a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39b;

        /* renamed from: c  reason: collision with root package name */
        public final String f40c;

        /* renamed from: d  reason: collision with root package name */
        public final List f41d;

        /* renamed from: e  reason: collision with root package name */
        public final List f42e;

        public c(String str, String str2, String str3, List list, List list2) {
            l.f(str, "referenceTable");
            l.f(str2, "onDelete");
            l.f(str3, "onUpdate");
            l.f(list, "columnNames");
            l.f(list2, "referenceColumnNames");
            this.f38a = str;
            this.f39b = str2;
            this.f40c = str3;
            this.f41d = list;
            this.f42e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (l.a(this.f38a, cVar.f38a) && l.a(this.f39b, cVar.f39b) && l.a(this.f40c, cVar.f40c) && l.a(this.f41d, cVar.f41d)) {
                return l.a(this.f42e, cVar.f42e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f38a.hashCode() * 31) + this.f39b.hashCode()) * 31) + this.f40c.hashCode()) * 31) + this.f41d.hashCode()) * 31) + this.f42e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f38a + "', onDelete='" + this.f39b + " +', onUpdate='" + this.f40c + "', columnNames=" + this.f41d + ", referenceColumnNames=" + this.f42e + '}';
        }
    }

    /* renamed from: a1.d$d  reason: collision with other inner class name */
    public static final class C0002d implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final int f43e;

        /* renamed from: f  reason: collision with root package name */
        private final int f44f;

        /* renamed from: g  reason: collision with root package name */
        private final String f45g;

        /* renamed from: h  reason: collision with root package name */
        private final String f46h;

        public C0002d(int i10, int i11, String str, String str2) {
            l.f(str, "from");
            l.f(str2, "to");
            this.f43e = i10;
            this.f44f = i11;
            this.f45g = str;
            this.f46h = str2;
        }

        /* renamed from: a */
        public int compareTo(C0002d dVar) {
            l.f(dVar, "other");
            int i10 = this.f43e - dVar.f43e;
            return i10 == 0 ? this.f44f - dVar.f44f : i10;
        }

        public final String b() {
            return this.f45g;
        }

        public final int c() {
            return this.f43e;
        }

        public final String d() {
            return this.f46h;
        }
    }

    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        public static final a f47e = new a((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f48a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f49b;

        /* renamed from: c  reason: collision with root package name */
        public final List f50c;

        /* renamed from: d  reason: collision with root package name */
        public List f51d;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }

        public e(String str, boolean z10, List list, List list2) {
            l.f(str, "name");
            l.f(list, "columns");
            l.f(list2, "orders");
            this.f48a = str;
            this.f49b = z10;
            this.f50c = list;
            this.f51d = list2;
            Collection collection = list2;
            boolean isEmpty = collection.isEmpty();
            ArrayList arrayList = collection;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(y0.l.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f51d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f49b == eVar.f49b && l.a(this.f50c, eVar.f50c) && l.a(this.f51d, eVar.f51d)) {
                return p.A(this.f48a, "index_", false, 2, (Object) null) ? p.A(eVar.f48a, "index_", false, 2, (Object) null) : l.a(this.f48a, eVar.f48a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((p.A(this.f48a, "index_", false, 2, (Object) null) ? -1184239155 : this.f48a.hashCode()) * 31) + (this.f49b ? 1 : 0)) * 31) + this.f50c.hashCode()) * 31) + this.f51d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f48a + "', unique=" + this.f49b + ", columns=" + this.f50c + ", orders=" + this.f51d + "'}";
        }
    }

    public d(String str, Map map, Set set, Set set2) {
        l.f(str, "name");
        l.f(map, "columns");
        l.f(set, "foreignKeys");
        this.f26a = str;
        this.f27b = map;
        this.f28c = set;
        this.f29d = set2;
    }

    public static final d a(d1.g gVar, String str) {
        return f25e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!l.a(this.f26a, dVar.f26a) || !l.a(this.f27b, dVar.f27b) || !l.a(this.f28c, dVar.f28c)) {
            return false;
        }
        Set set2 = this.f29d;
        if (set2 == null || (set = dVar.f29d) == null) {
            return true;
        }
        return l.a(set2, set);
    }

    public int hashCode() {
        return (((this.f26a.hashCode() * 31) + this.f27b.hashCode()) * 31) + this.f28c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f26a + "', columns=" + this.f27b + ", foreignKeys=" + this.f28c + ", indices=" + this.f29d + '}';
    }
}
