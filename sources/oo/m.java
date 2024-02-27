package oo;

import qn.u;
import xn.a;

final class m {

    /* renamed from: a  reason: collision with root package name */
    private final w f30267a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30268b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30269c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30270d;

    /* renamed from: e  reason: collision with root package name */
    private final int f30271e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30272f;

    /* renamed from: g  reason: collision with root package name */
    private final u f30273g;

    protected m(u uVar) {
        if (uVar != null) {
            this.f30273g = uVar;
            a a10 = f.a(uVar);
            int h10 = a0.h(a10);
            this.f30268b = h10;
            this.f30269c = 16;
            int ceil = (int) Math.ceil(((double) (h10 * 8)) / ((double) a0.o(16)));
            this.f30271e = ceil;
            int floor = ((int) Math.floor((double) (a0.o((16 - 1) * ceil) / a0.o(16)))) + 1;
            this.f30272f = floor;
            int i10 = ceil + floor;
            this.f30270d = i10;
            l c10 = l.c(a10.b(), h10, 16, i10);
            this.f30267a = c10;
            if (c10 == null) {
                throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a10.b());
            }
            return;
        }
        throw new NullPointerException("treeDigest == null");
    }

    /* access modifiers changed from: protected */
    public int a() {
        return this.f30270d;
    }

    public u b() {
        return this.f30273g;
    }

    /* access modifiers changed from: protected */
    public int c() {
        return this.f30268b;
    }

    /* access modifiers changed from: protected */
    public int d() {
        return this.f30269c;
    }
}
