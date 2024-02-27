package d6;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.u;
import f6.v;
import f6.w;
import f6.x;
import f6.y;
import g6.s;
import g6.t;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import y5.h;
import y5.o;
import y5.r;

public final class b extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(v vVar) {
            u N = vVar.R().N();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.Q().i0(), "HMAC");
            int O = vVar.R().O();
            int i10 = c.f9771a[N.ordinal()];
            if (i10 == 1) {
                return new t(new s("HMACSHA1", secretKeySpec), O);
            }
            if (i10 == 2) {
                return new t(new s("HMACSHA256", secretKeySpec), O);
            }
            if (i10 == 3) {
                return new t(new s("HMACSHA512", secretKeySpec), O);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: d6.b$b  reason: collision with other inner class name */
    class C0132b extends h.a {
        C0132b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public v a(w wVar) {
            return (v) v.T().A(b.this.k()).z(wVar.O()).x(com.google.crypto.tink.shaded.protobuf.h.s(g6.u.c(wVar.N()))).k();
        }

        /* renamed from: f */
        public w c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return w.P(hVar, p.b());
        }

        /* renamed from: g */
        public void d(w wVar) {
            if (wVar.N() >= 16) {
                b.o(wVar.O());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9771a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                f6.u[] r0 = f6.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9771a = r0
                f6.u r1 = f6.u.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9771a     // Catch:{ NoSuchFieldError -> 0x001d }
                f6.u r1 = f6.u.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9771a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f6.u r1 = f6.u.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.b.c.<clinit>():void");
        }
    }

    public b() {
        super(v.class, new a(o.class));
    }

    public static void m(boolean z10) {
        r.q(new b(), z10);
    }

    /* access modifiers changed from: private */
    public static void o(x xVar) {
        if (xVar.O() >= 10) {
            int i10 = c.f9771a[xVar.N().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (xVar.O() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xVar.O() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xVar.O() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public h.a e() {
        return new C0132b(w.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public v g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return v.U(hVar, p.b());
    }

    /* renamed from: n */
    public void i(v vVar) {
        g6.w.c(vVar.S(), k());
        if (vVar.Q().size() >= 16) {
            o(vVar.R());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
