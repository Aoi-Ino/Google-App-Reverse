package pl;

import cm.g;
import cm.l;
import java.io.Serializable;

public abstract class p implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f30426e = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        public final Throwable f30427e;

        public b(Throwable th2) {
            l.f(th2, "exception");
            this.f30427e = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && l.a(this.f30427e, ((b) obj).f30427e);
        }

        public int hashCode() {
            return this.f30427e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f30427e + ')';
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f30427e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
