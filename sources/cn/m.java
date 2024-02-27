package cn;

import cm.g;
import cm.l;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final a f20457c = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private int f20458a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f20459b = new int[10];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public final int a(int i10) {
        return this.f20459b[i10];
    }

    public final int b() {
        if ((this.f20458a & 2) != 0) {
            return this.f20459b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f20458a & 128) != 0) {
            return this.f20459b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f20458a & 16) != 0) {
            return this.f20459b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f20458a & 32) != 0 ? this.f20459b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f20458a) != 0;
    }

    public final void g(m mVar) {
        l.f(mVar, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.f(i10)) {
                h(i10, mVar.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f20459b;
            if (i10 < iArr.length) {
                this.f20458a = (1 << i10) | this.f20458a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f20458a);
    }
}
