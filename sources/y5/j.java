package y5;

import f6.a0;
import f6.c0;
import f6.i0;
import f6.y;
import f6.z;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final c0.b f18514a;

    private j(c0.b bVar) {
        this.f18514a = bVar;
    }

    private synchronized boolean d(int i10) {
        for (c0.c R : this.f18514a.C()) {
            if (R.R() == i10) {
                return true;
            }
        }
        return false;
    }

    private synchronized c0.c e(a0 a0Var) {
        y p10;
        int f10;
        i0 Q;
        try {
            p10 = r.p(a0Var);
            f10 = f();
            Q = a0Var.Q();
            if (Q == i0.UNKNOWN_PREFIX) {
                Q = i0.TINK;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (c0.c) c0.c.V().x(p10).z(f10).C(z.ENABLED).A(Q).k();
    }

    private synchronized int f() {
        int g10;
        do {
            g10 = g();
        } while (d(g10));
        return g10;
    }

    private static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    public static j i() {
        return new j(c0.U());
    }

    public static j j(i iVar) {
        return new j((c0.b) iVar.f().c());
    }

    public synchronized j a(g gVar) {
        b(gVar.b(), false);
        return this;
    }

    public synchronized int b(a0 a0Var, boolean z10) {
        c0.c e10;
        try {
            e10 = e(a0Var);
            this.f18514a.x(e10);
            if (z10) {
                this.f18514a.D(e10.R());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e10.R();
    }

    public synchronized i c() {
        return i.e((c0) this.f18514a.k());
    }

    public synchronized j h(int i10) {
        int i11 = 0;
        while (i11 < this.f18514a.A()) {
            c0.c z10 = this.f18514a.z(i11);
            if (z10.R() != i10) {
                i11++;
            } else if (z10.T().equals(z.ENABLED)) {
                this.f18514a.D(i10);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
