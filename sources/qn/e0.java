package qn;

import java.io.IOException;
import java.io.InputStream;

public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f30906a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30907b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[][] f30908c;

    e0(InputStream inputStream, int i10, byte[][] bArr) {
        this.f30906a = inputStream;
        this.f30907b = i10;
        this.f30908c = bArr;
    }

    private void i(boolean z10) {
        InputStream inputStream = this.f30906a;
        if (inputStream instanceof q2) {
            ((q2) inputStream).g(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public f a(int i10) {
        boolean z10 = false;
        i(false);
        int y10 = o.y(this.f30906a, i10);
        int o10 = o.o(this.f30906a, this.f30907b, y10 == 3 || y10 == 4 || y10 == 16 || y10 == 17 || y10 == 8);
        if (o10 >= 0) {
            o2 o2Var = new o2(this.f30906a, o10, this.f30907b);
            if ((i10 & 224) == 0) {
                return f(y10, o2Var);
            }
            e0 e0Var = new e0(o2Var, o2Var.c(), this.f30908c);
            int i11 = i10 & 192;
            if (i11 == 0) {
                return e0Var.d(y10);
            }
            if ((i10 & 32) != 0) {
                z10 = true;
            }
            return 64 == i11 ? (c2) e0Var.b(i11, y10, z10) : new n2(i11, y10, z10, e0Var);
        } else if ((i10 & 32) != 0) {
            e0 e0Var2 = new e0(new q2(this.f30906a, this.f30907b), this.f30907b, this.f30908c);
            int i12 = i10 & 192;
            if (i12 != 0) {
                return 64 == i12 ? new r0(y10, e0Var2) : new c1(i12, y10, e0Var2);
            }
            return e0Var2.e(y10);
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* access modifiers changed from: package-private */
    public z b(int i10, int i11, boolean z10) {
        return !z10 ? h0.l0(i10, i11, ((o2) this.f30906a).h()) : h0.j0(i10, i11, h());
    }

    /* access modifiers changed from: package-private */
    public z c(int i10, int i11) {
        return h0.k0(i10, i11, h());
    }

    /* access modifiers changed from: package-private */
    public f d(int i10) {
        if (i10 == 3) {
            return new t0(this);
        }
        if (i10 == 4) {
            return new w0(this);
        }
        if (i10 == 8) {
            return new j1(this);
        }
        if (i10 == 16) {
            return new j2(this);
        }
        if (i10 == 17) {
            return new l2(this);
        }
        throw new i("unknown DL object encountered: 0x" + Integer.toHexString(i10));
    }

    /* access modifiers changed from: package-private */
    public f e(int i10) {
        if (i10 == 3) {
            return new t0(this);
        }
        if (i10 == 4) {
            return new w0(this);
        }
        if (i10 == 8) {
            return new j1(this);
        }
        if (i10 == 16) {
            return new y0(this);
        }
        if (i10 == 17) {
            return new a1(this);
        }
        throw new i("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    /* access modifiers changed from: package-private */
    public f f(int i10, o2 o2Var) {
        if (i10 == 3) {
            return new e2(o2Var);
        }
        if (i10 == 4) {
            return new r1(o2Var);
        }
        if (i10 == 8) {
            throw new i("externals must use constructed encoding (see X.690 8.18)");
        } else if (i10 == 16) {
            throw new i("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        } else if (i10 != 17) {
            try {
                return o.g(i10, o2Var, this.f30908c);
            } catch (IllegalArgumentException e10) {
                throw new i("corrupted stream detected", e10);
            }
        } else {
            throw new i("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
    }

    public f g() {
        int read = this.f30906a.read();
        if (read < 0) {
            return null;
        }
        return a(read);
    }

    /* access modifiers changed from: package-private */
    public g h() {
        int read = this.f30906a.read();
        if (read < 0) {
            return new g(0);
        }
        g gVar = new g();
        do {
            f a10 = a(read);
            gVar.a(a10 instanceof p2 ? ((p2) a10).r() : a10.n());
            read = this.f30906a.read();
        } while (read >= 0);
        return gVar;
    }
}
