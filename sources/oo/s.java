package oo;

import ap.c;
import java.io.IOException;

public final class s extends q implements c {

    /* renamed from: g  reason: collision with root package name */
    private final r f30290g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f30291h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f30292i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f30293j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f30294k;

    /* renamed from: l  reason: collision with root package name */
    private volatile long f30295l;

    /* renamed from: m  reason: collision with root package name */
    private volatile b f30296m;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final r f30297a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f30298b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f30299c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public byte[] f30300d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public byte[] f30301e = null;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public byte[] f30302f = null;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public byte[] f30303g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public b f30304h = null;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public byte[] f30305i = null;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public x f30306j = null;

        public b(r rVar) {
            this.f30297a = rVar;
        }

        public s k() {
            return new s(this);
        }

        public b l(b bVar) {
            if (bVar.b() == 0) {
                this.f30304h = new b(bVar, (1 << this.f30297a.a()) - 1);
            } else {
                this.f30304h = bVar;
            }
            return this;
        }

        public b m(long j10) {
            this.f30298b = j10;
            return this;
        }

        public b n(long j10) {
            this.f30299c = j10;
            return this;
        }

        public b o(byte[] bArr) {
            this.f30302f = a0.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f30303g = a0.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f30301e = a0.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f30300d = a0.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f30297a.e());
        r a10 = bVar.f30297a;
        this.f30290g = a10;
        if (a10 != null) {
            int f10 = a10.f();
            byte[] b10 = bVar.f30305i;
            if (b10 == null) {
                this.f30295l = bVar.f30298b;
                byte[] e10 = bVar.f30300d;
                if (e10 == null) {
                    this.f30291h = new byte[f10];
                } else if (e10.length == f10) {
                    this.f30291h = e10;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] f11 = bVar.f30301e;
                if (f11 == null) {
                    this.f30292i = new byte[f10];
                } else if (f11.length == f10) {
                    this.f30292i = f11;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] g10 = bVar.f30302f;
                if (g10 == null) {
                    this.f30293j = new byte[f10];
                } else if (g10.length == f10) {
                    this.f30293j = g10;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] h10 = bVar.f30303g;
                if (h10 == null) {
                    this.f30294k = new byte[f10];
                } else if (h10.length == f10) {
                    this.f30294k = h10;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                b i10 = bVar.f30304h;
                if (i10 == null) {
                    i10 = (!a0.l(a10.a(), bVar.f30298b) || g10 == null || e10 == null) ? new b(bVar.f30299c + 1) : new b(a10, bVar.f30298b, g10, e10);
                }
                this.f30296m = i10;
                if (bVar.f30299c >= 0 && bVar.f30299c != this.f30296m.b()) {
                    throw new IllegalArgumentException("maxIndex set but not reflected in state");
                }
            } else if (bVar.f30306j != null) {
                int a11 = a10.a();
                int i11 = (a11 + 7) / 8;
                this.f30295l = a0.a(b10, 0, i11);
                if (a0.l(a11, this.f30295l)) {
                    this.f30291h = a0.g(b10, i11, f10);
                    int i12 = i11 + f10;
                    this.f30292i = a0.g(b10, i12, f10);
                    int i13 = i12 + f10;
                    this.f30293j = a0.g(b10, i13, f10);
                    int i14 = i13 + f10;
                    this.f30294k = a0.g(b10, i14, f10);
                    int i15 = i14 + f10;
                    try {
                        this.f30296m = ((b) a0.f(a0.g(b10, i15, b10.length - i15), b.class)).f(bVar.f30306j.g());
                    } catch (IOException e11) {
                        throw new IllegalArgumentException(e11.getMessage(), e11);
                    } catch (ClassNotFoundException e12) {
                        throw new IllegalArgumentException(e12.getMessage(), e12);
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                throw new NullPointerException("xmss == null");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public r b() {
        return this.f30290g;
    }

    public byte[] c() {
        byte[] f10;
        synchronized (this) {
            try {
                int f11 = this.f30290g.f();
                int a10 = (this.f30290g.a() + 7) / 8;
                byte[] bArr = new byte[(a10 + f11 + f11 + f11 + f11)];
                a0.e(bArr, a0.q(this.f30295l, a10), 0);
                a0.e(bArr, this.f30291h, a10);
                int i10 = a10 + f11;
                a0.e(bArr, this.f30292i, i10);
                int i11 = i10 + f11;
                a0.e(bArr, this.f30293j, i11);
                a0.e(bArr, this.f30294k, i11 + f11);
                f10 = ap.a.f(bArr, a0.p(this.f30296m));
            } catch (IOException e10) {
                throw new IllegalStateException("error serializing bds state: " + e10.getMessage(), e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10;
    }

    public byte[] getEncoded() {
        byte[] c10;
        synchronized (this) {
            c10 = c();
        }
        return c10;
    }
}
