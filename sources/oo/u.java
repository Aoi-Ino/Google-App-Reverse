package oo;

import java.io.Serializable;

public final class u implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final int f30315e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f30316f;

    protected u(int i10, byte[] bArr) {
        this.f30315e = i10;
        this.f30316f = bArr;
    }

    public int a() {
        return this.f30315e;
    }

    public byte[] b() {
        return a0.c(this.f30316f);
    }
}
