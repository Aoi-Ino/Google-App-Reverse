package oo;

import qn.u;
import xn.a;
import xn.b;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private final a f30246a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30247b;

    protected h(u uVar, int i10) {
        if (uVar != null) {
            this.f30246a = f.a(uVar);
            this.f30247b = i10;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    private byte[] d(int i10, byte[] bArr, byte[] bArr2) {
        byte[] q10 = a0.q((long) i10, this.f30247b);
        this.f30246a.d(q10, 0, q10.length);
        this.f30246a.d(bArr, 0, bArr.length);
        this.f30246a.d(bArr2, 0, bArr2.length);
        int i11 = this.f30247b;
        byte[] bArr3 = new byte[i11];
        a aVar = this.f30246a;
        if (aVar instanceof b) {
            ((b) aVar).f(bArr3, 0, i11);
        } else {
            aVar.a(bArr3, 0);
        }
        return bArr3;
    }

    /* access modifiers changed from: protected */
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f30247b;
        if (length != i10) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i10) {
            return d(0, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f30247b;
        if (length != i10) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i10 * 2) {
            return d(1, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f30247b) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return d(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }
}
