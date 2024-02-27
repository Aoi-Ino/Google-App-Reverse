package z5;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.l;
import f6.m;
import f6.y;
import g6.c;
import g6.u;
import g6.w;
import y5.g;
import y5.h;
import y5.r;

public final class f extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(l lVar) {
            return new c(lVar.O().i0());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public l a(m mVar) {
            return (l) l.Q().x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(mVar.N()))).z(f.this.l()).k();
        }

        /* renamed from: f */
        public m c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return m.P(hVar, p.b());
        }

        /* renamed from: g */
        public void d(m mVar) {
            w.a(mVar.N());
        }
    }

    f() {
        super(l.class, new a(y5.a.class));
    }

    public static final g j() {
        return k(32, g.b.TINK);
    }

    private static g k(int i10, g.b bVar) {
        return g.a(new f().c(), ((m) m.O().x(i10).k()).d(), bVar);
    }

    public static void n(boolean z10) {
        r.q(new f(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public h.a e() {
        return new b(m.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public l g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return l.R(hVar, p.b());
    }

    /* renamed from: o */
    public void i(l lVar) {
        w.c(lVar.P(), l());
        w.a(lVar.O().size());
    }
}
