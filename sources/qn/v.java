package qn;

import ap.h;
import bp.f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class v extends z implements w {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f31007f = new a(v.class, 4);

    /* renamed from: g  reason: collision with root package name */
    static final byte[] f31008g = new byte[0];

    /* renamed from: e  reason: collision with root package name */
    byte[] f31009e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z c(c0 c0Var) {
            return c0Var.p0();
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return q1Var;
        }
    }

    public v(byte[] bArr) {
        if (bArr != null) {
            this.f31009e = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    static v i0(byte[] bArr) {
        return new q1(bArr);
    }

    public static v j0(Object obj) {
        if (obj == null || (obj instanceof v)) {
            return (v) obj;
        }
        if (obj instanceof f) {
            z n10 = ((f) obj).n();
            if (n10 instanceof v) {
                return (v) n10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (v) f31007f.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static v k0(h0 h0Var, boolean z10) {
        return (v) f31007f.e(h0Var, z10);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return new q1(this.f31009e);
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return new q1(this.f31009e);
    }

    public int hashCode() {
        return ap.a.j(l0());
    }

    public InputStream l() {
        return new ByteArrayInputStream(this.f31009e);
    }

    public byte[] l0() {
        return this.f31009e;
    }

    public z r() {
        return n();
    }

    public String toString() {
        return "#" + h.b(f.a(this.f31009e));
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof v)) {
            return false;
        }
        return ap.a.a(this.f31009e, ((v) zVar).f31009e);
    }
}
