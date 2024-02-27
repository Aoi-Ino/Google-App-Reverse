package oo;

import ap.c;
import ap.f;

public final class t extends q implements c {

    /* renamed from: g  reason: collision with root package name */
    private final r f30307g;

    /* renamed from: h  reason: collision with root package name */
    private final int f30308h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f30309i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f30310j;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final r f30311a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public byte[] f30312b = null;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public byte[] f30313c = null;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public byte[] f30314d = null;

        public b(r rVar) {
            this.f30311a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f30314d = a0.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f30313c = a0.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f30312b = a0.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f30311a.e());
        r a10 = bVar.f30311a;
        this.f30307g = a10;
        if (a10 != null) {
            int f10 = a10.f();
            byte[] b10 = bVar.f30314d;
            if (b10 == null) {
                if (a10.d() != null) {
                    this.f30308h = a10.d().a();
                } else {
                    this.f30308h = 0;
                }
                byte[] c10 = bVar.f30312b;
                if (c10 == null) {
                    this.f30309i = new byte[f10];
                } else if (c10.length == f10) {
                    this.f30309i = c10;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] d10 = bVar.f30313c;
                if (d10 == null) {
                    this.f30310j = new byte[f10];
                } else if (d10.length == f10) {
                    this.f30310j = d10;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (b10.length == f10 + f10) {
                this.f30308h = 0;
                this.f30309i = a0.g(b10, 0, f10);
                this.f30310j = a0.g(b10, f10, f10);
            } else if (b10.length == f10 + 4 + f10) {
                this.f30308h = f.a(b10, 0);
                this.f30309i = a0.g(b10, 4, f10);
                this.f30310j = a0.g(b10, 4 + f10, f10);
            } else {
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public r b() {
        return this.f30307g;
    }

    public byte[] c() {
        return a0.c(this.f30310j);
    }

    public byte[] d() {
        return a0.c(this.f30309i);
    }

    public byte[] e() {
        byte[] bArr;
        int f10 = this.f30307g.f();
        int i10 = this.f30308h;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[(f10 + 4 + f10)];
            f.c(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[(f10 + f10)];
        }
        a0.e(bArr, this.f30309i, i11);
        a0.e(bArr, this.f30310j, i11 + f10);
        return bArr;
    }

    public byte[] getEncoded() {
        return e();
    }
}
