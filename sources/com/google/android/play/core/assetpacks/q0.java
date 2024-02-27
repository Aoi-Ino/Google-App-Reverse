package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

final class q0 extends FilterInputStream {

    /* renamed from: e  reason: collision with root package name */
    private final g2 f6851e = new g2();

    /* renamed from: f  reason: collision with root package name */
    private byte[] f6852f = new byte[4096];

    /* renamed from: g  reason: collision with root package name */
    private long f6853g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6854h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6855i = false;

    q0(InputStream inputStream) {
        super(inputStream);
    }

    private final int h(byte[] bArr, int i10, int i11) {
        return Math.max(0, super.read(bArr, i10, i11));
    }

    private final boolean l(int i10) {
        int h10 = h(this.f6852f, 0, i10);
        if (h10 != i10) {
            int i11 = i10 - h10;
            if (h(this.f6852f, h10, i11) != i11) {
                this.f6851e.b(this.f6852f, 0, h10);
                return false;
            }
        }
        this.f6851e.b(this.f6852f, 0, i10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return this.f6853g;
    }

    /* access modifiers changed from: package-private */
    public final h3 e() {
        byte[] bArr;
        if (this.f6853g > 0) {
            do {
                bArr = this.f6852f;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f6854h || this.f6855i) {
            return new m0((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!l(30)) {
            this.f6854h = true;
            return this.f6851e.c();
        }
        h3 c10 = this.f6851e.c();
        if (c10.d()) {
            this.f6855i = true;
            return c10;
        } else if (c10.b() != 4294967295L) {
            int a10 = this.f6851e.a() - 30;
            long j10 = (long) a10;
            int length = this.f6852f.length;
            if (j10 > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j10);
                this.f6852f = Arrays.copyOf(this.f6852f, length);
            }
            if (!l(a10)) {
                this.f6854h = true;
                return this.f6851e.c();
            }
            h3 c11 = this.f6851e.c();
            this.f6853g = c11.b();
            return c11;
        } else {
            throw new d1("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.f6855i;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.f6854h;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f6853g;
        if (j10 <= 0 || this.f6854h) {
            return -1;
        }
        int h10 = h(bArr, i10, (int) Math.min(j10, (long) i11));
        this.f6853g -= (long) h10;
        if (h10 != 0) {
            return h10;
        }
        this.f6854h = true;
        return 0;
    }
}
