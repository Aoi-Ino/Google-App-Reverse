package in;

import cm.l;
import java.nio.ByteBuffer;

public final class t implements f {

    /* renamed from: e  reason: collision with root package name */
    public final e f24491e = new e();

    /* renamed from: f  reason: collision with root package name */
    public boolean f24492f;

    /* renamed from: g  reason: collision with root package name */
    public final y f24493g;

    public t(y yVar) {
        l.f(yVar, "sink");
        this.f24493g = yVar;
    }

    public f N(h hVar) {
        l.f(hVar, "byteString");
        if (!this.f24492f) {
            this.f24491e.N(hVar);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f Q(int i10) {
        if (!this.f24492f) {
            this.f24491e.Q(i10);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f W(byte[] bArr) {
        l.f(bArr, "source");
        if (!this.f24492f) {
            this.f24491e.W(bArr);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f a(byte[] bArr, int i10, int i11) {
        l.f(bArr, "source");
        if (!this.f24492f) {
            this.f24491e.a(bArr, i10, i11);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void b0(e eVar, long j10) {
        l.f(eVar, "source");
        if (!this.f24492f) {
            this.f24491e.b0(eVar, j10);
            c();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f c() {
        if (!this.f24492f) {
            long f10 = this.f24491e.f();
            if (f10 > 0) {
                this.f24493g.b0(this.f24491e, f10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f24492f) {
            try {
                if (this.f24491e.H0() > 0) {
                    y yVar = this.f24493g;
                    e eVar = this.f24491e;
                    yVar.b0(eVar, eVar.H0());
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f24493g.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f24492f = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public e d() {
        return this.f24491e;
    }

    public void flush() {
        if (!this.f24492f) {
            if (this.f24491e.H0() > 0) {
                y yVar = this.f24493g;
                e eVar = this.f24491e;
                yVar.b0(eVar, eVar.H0());
            }
            this.f24493g.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f24492f;
    }

    public f q(long j10) {
        if (!this.f24492f) {
            this.f24491e.q(j10);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public long q0(a0 a0Var) {
        l.f(a0Var, "source");
        long j10 = 0;
        while (true) {
            long read = a0Var.read(this.f24491e, (long) 8192);
            if (read == -1) {
                return j10;
            }
            j10 += read;
            c();
        }
    }

    public f r0(String str) {
        l.f(str, "string");
        if (!this.f24492f) {
            this.f24491e.r0(str);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f t0(long j10) {
        if (!this.f24492f) {
            this.f24491e.t0(j10);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public b0 timeout() {
        return this.f24493g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f24493g + ')';
    }

    public int write(ByteBuffer byteBuffer) {
        l.f(byteBuffer, "source");
        if (!this.f24492f) {
            int write = this.f24491e.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f writeInt(int i10) {
        if (!this.f24492f) {
            this.f24491e.writeInt(i10);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f z(int i10) {
        if (!this.f24492f) {
            this.f24491e.z(i10);
            return c();
        }
        throw new IllegalStateException("closed".toString());
    }
}
