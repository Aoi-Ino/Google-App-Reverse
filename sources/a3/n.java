package a3;

import a3.c;
import y2.c;
import y2.d;
import y2.g;

abstract class n {

    public static abstract class a {
        public abstract n a();

        /* access modifiers changed from: package-private */
        public abstract a b(c cVar);

        /* access modifiers changed from: package-private */
        public abstract a c(d dVar);

        /* access modifiers changed from: package-private */
        public abstract a d(g gVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract y2.c b();

    /* access modifiers changed from: package-private */
    public abstract d c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract g e();

    public abstract o f();

    public abstract String g();
}
