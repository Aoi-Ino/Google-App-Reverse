package oo;

import ap.a;
import oo.j;

final class k {

    /* renamed from: a  reason: collision with root package name */
    private final m f30260a;

    /* renamed from: b  reason: collision with root package name */
    private final h f30261b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f30262c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f30263d;

    k(m mVar) {
        if (mVar != null) {
            this.f30260a = mVar;
            int c10 = mVar.c();
            this.f30261b = new h(mVar.b(), c10);
            this.f30262c = new byte[c10];
            this.f30263d = new byte[c10];
            return;
        }
        throw new NullPointerException("params == null");
    }

    private byte[] a(byte[] bArr, int i10, int i11, j jVar) {
        int c10 = this.f30260a.c();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        } else if (bArr.length != c10) {
            throw new IllegalArgumentException("startHash needs to be " + c10 + "bytes");
        } else if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (jVar.d() != null) {
            int i12 = i10 + i11;
            if (i12 > this.f30260a.d() - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i11 == 0) {
                return bArr;
            } else {
                byte[] a10 = a(bArr, i10, i11 - 1, jVar);
                j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(jVar.e()).o(i12 - 1).f(0)).l();
                byte[] c11 = this.f30261b.c(this.f30263d, jVar2.d());
                byte[] c12 = this.f30261b.c(this.f30263d, ((j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar2.b())).h(jVar2.c())).p(jVar2.g()).n(jVar2.e()).o(jVar2.f()).f(1)).l()).d());
                byte[] bArr2 = new byte[c10];
                for (int i13 = 0; i13 < c10; i13++) {
                    bArr2[i13] = (byte) (a10[i13] ^ c12[i13]);
                }
                return this.f30261b.a(c11, bArr2);
            }
        } else {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
    }

    private byte[] b(int i10) {
        if (i10 >= 0 && i10 < this.f30260a.a()) {
            return this.f30261b.c(this.f30262c, a0.q((long) i10, 32));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* access modifiers changed from: protected */
    public h c() {
        return this.f30261b;
    }

    /* access modifiers changed from: protected */
    public m d() {
        return this.f30260a;
    }

    /* access modifiers changed from: package-private */
    public n e(j jVar) {
        if (jVar != null) {
            byte[][] bArr = new byte[this.f30260a.a()][];
            for (int i10 = 0; i10 < this.f30260a.a(); i10++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(i10).o(jVar.f()).f(jVar.a())).l();
                bArr[i10] = a(b(i10), 0, this.f30260a.d() - 1, jVar);
            }
            return new n(this.f30260a, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* access modifiers changed from: protected */
    public byte[] f() {
        return a.d(this.f30263d);
    }

    /* access modifiers changed from: protected */
    public byte[] g(byte[] bArr, j jVar) {
        return this.f30261b.c(bArr, ((j) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).l()).d());
    }

    /* access modifiers changed from: package-private */
    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        } else if (bArr.length != this.f30260a.c()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        } else if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        } else if (bArr2.length == this.f30260a.c()) {
            this.f30262c = bArr;
            this.f30263d = bArr2;
        } else {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
    }
}
