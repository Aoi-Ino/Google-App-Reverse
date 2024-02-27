package k6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f12950a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f12951b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f12952c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12953d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12954e;

    /* renamed from: f  reason: collision with root package name */
    private final g f12955f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f12956g;

    private c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f12950a = str;
        this.f12951b = Collections.unmodifiableSet(set);
        this.f12952c = Collections.unmodifiableSet(set2);
        this.f12953d = i10;
        this.f12954e = i11;
        this.f12955f = gVar;
        this.f12956g = Collections.unmodifiableSet(set3);
    }

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(d0 d0Var) {
        return new b(d0Var, new d0[0]);
    }

    public static b f(d0 d0Var, d0... d0VarArr) {
        return new b(d0Var, d0VarArr);
    }

    public static c l(Object obj, Class cls) {
        return m(cls).e(new a(obj)).d();
    }

    public static b m(Class cls) {
        return c(cls).f();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, d dVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, d dVar) {
        return obj;
    }

    public static c s(Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).e(new b(obj)).d();
    }

    public Set g() {
        return this.f12952c;
    }

    public g h() {
        return this.f12955f;
    }

    public String i() {
        return this.f12950a;
    }

    public Set j() {
        return this.f12951b;
    }

    public Set k() {
        return this.f12956g;
    }

    public boolean n() {
        return this.f12953d == 1;
    }

    public boolean o() {
        return this.f12953d == 2;
    }

    public boolean p() {
        return this.f12954e == 0;
    }

    public c t(g gVar) {
        return new c(this.f12950a, this.f12951b, this.f12952c, this.f12953d, this.f12954e, gVar, this.f12956g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f12951b.toArray()) + ">{" + this.f12953d + ", type=" + this.f12954e + ", deps=" + Arrays.toString(this.f12952c.toArray()) + "}";
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f12957a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f12958b;

        /* renamed from: c  reason: collision with root package name */
        private final Set f12959c;

        /* renamed from: d  reason: collision with root package name */
        private int f12960d;

        /* renamed from: e  reason: collision with root package name */
        private int f12961e;

        /* renamed from: f  reason: collision with root package name */
        private g f12962f;

        /* renamed from: g  reason: collision with root package name */
        private final Set f12963g;

        private b(Class cls, Class... clsArr) {
            this.f12957a = null;
            HashSet hashSet = new HashSet();
            this.f12958b = hashSet;
            this.f12959c = new HashSet();
            this.f12960d = 0;
            this.f12961e = 0;
            this.f12963g = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(d0.b(cls));
            for (Class cls2 : clsArr) {
                c0.c(cls2, "Null interface");
                this.f12958b.add(d0.b(cls2));
            }
        }

        /* access modifiers changed from: private */
        public b f() {
            this.f12961e = 1;
            return this;
        }

        private b h(int i10) {
            c0.d(this.f12960d == 0, "Instantiation type has already been set.");
            this.f12960d = i10;
            return this;
        }

        private void i(d0 d0Var) {
            c0.a(!this.f12958b.contains(d0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            c0.c(qVar, "Null dependency");
            i(qVar.b());
            this.f12959c.add(qVar);
            return this;
        }

        public b c() {
            return h(1);
        }

        public c d() {
            c0.d(this.f12962f != null, "Missing required property: factory.");
            return new c(this.f12957a, new HashSet(this.f12958b), new HashSet(this.f12959c), this.f12960d, this.f12961e, this.f12962f, this.f12963g);
        }

        public b e(g gVar) {
            this.f12962f = (g) c0.c(gVar, "Null factory");
            return this;
        }

        public b g(String str) {
            this.f12957a = str;
            return this;
        }

        private b(d0 d0Var, d0... d0VarArr) {
            this.f12957a = null;
            HashSet hashSet = new HashSet();
            this.f12958b = hashSet;
            this.f12959c = new HashSet();
            this.f12960d = 0;
            this.f12961e = 0;
            this.f12963g = new HashSet();
            c0.c(d0Var, "Null interface");
            hashSet.add(d0Var);
            for (d0 c10 : d0VarArr) {
                c0.c(c10, "Null interface");
            }
            Collections.addAll(this.f12958b, d0VarArr);
        }
    }
}
