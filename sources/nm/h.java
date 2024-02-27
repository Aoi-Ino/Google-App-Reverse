package nm;

import cm.g;
import cm.l;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final b f29956b = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f29957c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f29958a;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f29959a;

        public a(Throwable th2) {
            this.f29959a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && l.a(this.f29959a, ((a) obj).f29959a);
        }

        public int hashCode() {
            Throwable th2 = this.f29959a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f29959a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final Object a(Throwable th2) {
            return h.c(new a(th2));
        }

        public final Object b() {
            return h.c(h.f29957c);
        }

        public final Object c(Object obj) {
            return h.c(obj);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f29958a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof h) && l.a(obj, ((h) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f29959a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f29958a, obj);
    }

    public int hashCode() {
        return g(this.f29958a);
    }

    public final /* synthetic */ Object k() {
        return this.f29958a;
    }

    public String toString() {
        return j(this.f29958a);
    }
}
