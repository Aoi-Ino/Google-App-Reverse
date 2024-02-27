package oo;

import ap.c;
import ap.f;
import java.io.IOException;
import oo.j;

public final class y extends p implements c {

    /* renamed from: g  reason: collision with root package name */
    private final x f30326g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f30327h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f30328i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f30329j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f30330k;

    /* renamed from: l  reason: collision with root package name */
    private volatile a f30331l;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final x f30332a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f30333b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f30334c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public byte[] f30335d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public byte[] f30336e = null;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public byte[] f30337f = null;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public byte[] f30338g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public a f30339h = null;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public byte[] f30340i = null;

        public b(x xVar) {
            this.f30332a = xVar;
        }

        public y j() {
            return new y(this);
        }

        public b k(a aVar) {
            this.f30339h = aVar;
            return this;
        }

        public b l(int i10) {
            this.f30333b = i10;
            return this;
        }

        public b m(int i10) {
            this.f30334c = i10;
            return this;
        }

        public b n(byte[] bArr) {
            this.f30337f = a0.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f30338g = a0.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f30336e = a0.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f30335d = a0.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f30332a.f());
        x a10 = bVar.f30332a;
        this.f30326g = a10;
        if (a10 != null) {
            int h10 = a10.h();
            byte[] b10 = bVar.f30340i;
            if (b10 != null) {
                int b11 = a10.b();
                int a11 = f.a(b10, 0);
                if (a0.l(b11, (long) a11)) {
                    this.f30327h = a0.g(b10, 4, h10);
                    int i10 = 4 + h10;
                    this.f30328i = a0.g(b10, i10, h10);
                    int i11 = i10 + h10;
                    this.f30329j = a0.g(b10, i11, h10);
                    int i12 = i11 + h10;
                    this.f30330k = a0.g(b10, i12, h10);
                    int i13 = i12 + h10;
                    try {
                        a aVar = (a) a0.f(a0.g(b10, i13, b10.length - i13), a.class);
                        if (aVar.b() == a11) {
                            this.f30331l = aVar.h(bVar.f30332a.g());
                            return;
                        }
                        throw new IllegalStateException("serialized BDS has wrong index");
                    } catch (IOException e10) {
                        throw new IllegalArgumentException(e10.getMessage(), e10);
                    } catch (ClassNotFoundException e11) {
                        throw new IllegalArgumentException(e11.getMessage(), e11);
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                byte[] c10 = bVar.f30335d;
                if (c10 == null) {
                    this.f30327h = new byte[h10];
                } else if (c10.length == h10) {
                    this.f30327h = c10;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] d10 = bVar.f30336e;
                if (d10 == null) {
                    this.f30328i = new byte[h10];
                } else if (d10.length == h10) {
                    this.f30328i = d10;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] e12 = bVar.f30337f;
                if (e12 == null) {
                    this.f30329j = new byte[h10];
                } else if (e12.length == h10) {
                    this.f30329j = e12;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] f10 = bVar.f30338g;
                if (f10 == null) {
                    this.f30330k = new byte[h10];
                } else if (f10.length == h10) {
                    this.f30330k = f10;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                a g10 = bVar.f30339h;
                this.f30331l = g10 == null ? (bVar.f30333b >= (1 << a10.b()) + -2 || e12 == null || c10 == null) ? new a(a10, (1 << a10.b()) - 1, bVar.f30333b) : new a(a10, e12, c10, (j) new j.b().l(), bVar.f30333b) : g10;
                if (bVar.f30334c >= 0 && bVar.f30334c != this.f30331l.c()) {
                    throw new IllegalArgumentException("maxIndex set but not reflected in state");
                }
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public x b() {
        return this.f30326g;
    }

    public byte[] c() {
        byte[] f10;
        synchronized (this) {
            try {
                int h10 = this.f30326g.h();
                byte[] bArr = new byte[(h10 + 4 + h10 + h10 + h10)];
                f.c(this.f30331l.b(), bArr, 0);
                a0.e(bArr, this.f30327h, 4);
                int i10 = 4 + h10;
                a0.e(bArr, this.f30328i, i10);
                int i11 = i10 + h10;
                a0.e(bArr, this.f30329j, i11);
                a0.e(bArr, this.f30330k, i11 + h10);
                f10 = ap.a.f(bArr, a0.p(this.f30331l));
            } catch (IOException e10) {
                throw new RuntimeException("error serializing bds state: " + e10.getMessage());
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
