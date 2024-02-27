package com.google.android.play.core.assetpacks;

import java.util.Arrays;

final class g2 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f6717a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private int f6718b;

    /* renamed from: c  reason: collision with root package name */
    private long f6719c;

    /* renamed from: d  reason: collision with root package name */
    private long f6720d;

    /* renamed from: e  reason: collision with root package name */
    private int f6721e;

    /* renamed from: f  reason: collision with root package name */
    private int f6722f;

    /* renamed from: g  reason: collision with root package name */
    private int f6723g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6724h;

    /* renamed from: i  reason: collision with root package name */
    private String f6725i;

    public g2() {
        d();
    }

    private final int e(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f6718b;
        if (i13 >= i10) {
            return 0;
        }
        int min = Math.min(i12, i10 - i13);
        System.arraycopy(bArr, i11, this.f6717a, this.f6718b, min);
        int i14 = this.f6718b + min;
        this.f6718b = i14;
        if (i14 < i10) {
            return -1;
        }
        return min;
    }

    public final int a() {
        return this.f6722f;
    }

    public final int b(byte[] bArr, int i10, int i11) {
        int e10 = e(30, bArr, i10, i11);
        if (e10 == -1) {
            return -1;
        }
        if (this.f6719c == -1) {
            long b10 = n0.b(this.f6717a, 0);
            this.f6719c = b10;
            if (b10 == 67324752) {
                this.f6724h = false;
                this.f6720d = n0.b(this.f6717a, 18);
                this.f6723g = n0.a(this.f6717a, 8);
                this.f6721e = n0.a(this.f6717a, 26);
                int a10 = this.f6721e + 30 + n0.a(this.f6717a, 28);
                this.f6722f = a10;
                int length = this.f6717a.length;
                if (length < a10) {
                    do {
                        length += length;
                    } while (length < a10);
                    this.f6717a = Arrays.copyOf(this.f6717a, length);
                }
            } else {
                this.f6724h = true;
            }
        }
        int e11 = e(this.f6722f, bArr, i10 + e10, i11 - e10);
        if (e11 == -1) {
            return -1;
        }
        int i12 = e10 + e11;
        if (!this.f6724h && this.f6725i == null) {
            this.f6725i = new String(this.f6717a, 30, this.f6721e);
        }
        return i12;
    }

    public final h3 c() {
        int i10 = this.f6718b;
        int i11 = this.f6722f;
        if (i10 < i11) {
            return new m0(this.f6725i, this.f6720d, this.f6723g, true, this.f6724h, Arrays.copyOf(this.f6717a, i10));
        }
        m0 m0Var = new m0(this.f6725i, this.f6720d, this.f6723g, false, this.f6724h, Arrays.copyOf(this.f6717a, i11));
        d();
        return m0Var;
    }

    public final void d() {
        this.f6718b = 0;
        this.f6721e = -1;
        this.f6719c = -1;
        this.f6724h = false;
        this.f6722f = 30;
        this.f6720d = -1;
        this.f6723g = -1;
        this.f6725i = null;
    }
}
