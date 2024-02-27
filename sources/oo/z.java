package oo;

import ap.c;
import ap.f;

public final class z extends p implements c {

    /* renamed from: g  reason: collision with root package name */
    private final x f30341g;

    /* renamed from: h  reason: collision with root package name */
    private final int f30342h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f30343i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f30344j;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final x f30345a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public byte[] f30346b = null;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public byte[] f30347c = null;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public byte[] f30348d = null;

        public b(x xVar) {
            this.f30345a = xVar;
        }

        public z e() {
            return new z(this);
        }

        public b f(byte[] bArr) {
            this.f30348d = a0.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f30347c = a0.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f30346b = a0.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f30345a.f());
        x a10 = bVar.f30345a;
        this.f30341g = a10;
        if (a10 != null) {
            int h10 = a10.h();
            byte[] b10 = bVar.f30348d;
            if (b10 == null) {
                if (a10.e() != null) {
                    this.f30342h = a10.e().a();
                } else {
                    this.f30342h = 0;
                }
                byte[] c10 = bVar.f30346b;
                if (c10 == null) {
                    this.f30343i = new byte[h10];
                } else if (c10.length == h10) {
                    this.f30343i = c10;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] d10 = bVar.f30347c;
                if (d10 == null) {
                    this.f30344j = new byte[h10];
                } else if (d10.length == h10) {
                    this.f30344j = d10;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (b10.length == h10 + h10) {
                this.f30342h = 0;
                this.f30343i = a0.g(b10, 0, h10);
                this.f30344j = a0.g(b10, h10, h10);
            } else if (b10.length == h10 + 4 + h10) {
                this.f30342h = f.a(b10, 0);
                this.f30343i = a0.g(b10, 4, h10);
                this.f30344j = a0.g(b10, 4 + h10, h10);
            } else {
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public x b() {
        return this.f30341g;
    }

    public byte[] c() {
        return a0.c(this.f30344j);
    }

    public byte[] d() {
        return a0.c(this.f30343i);
    }

    public byte[] e() {
        byte[] bArr;
        int h10 = this.f30341g.h();
        int i10 = this.f30342h;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[(h10 + 4 + h10)];
            f.c(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[(h10 + h10)];
        }
        a0.e(bArr, this.f30343i, i11);
        a0.e(bArr, this.f30344j, i11 + h10);
        return bArr;
    }

    public byte[] getEncoded() {
        return e();
    }
}
