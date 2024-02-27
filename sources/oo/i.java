package oo;

import ap.f;
import oo.o;

final class i extends o {

    /* renamed from: e  reason: collision with root package name */
    private final int f30248e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30249f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30250g;

    protected static class b extends o.a {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f30251e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f30252f = 0;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f30253g = 0;

        protected b() {
            super(1);
        }

        /* access modifiers changed from: protected */
        public o l() {
            return new i(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public b e() {
            return this;
        }

        /* access modifiers changed from: protected */
        public b n(int i10) {
            this.f30251e = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        public b o(int i10) {
            this.f30252f = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        public b p(int i10) {
            this.f30253g = i10;
            return this;
        }
    }

    private i(b bVar) {
        super(bVar);
        this.f30248e = bVar.f30251e;
        this.f30249f = bVar.f30252f;
        this.f30250g = bVar.f30253g;
    }

    /* access modifiers changed from: protected */
    public byte[] d() {
        byte[] d10 = super.d();
        f.c(this.f30248e, d10, 16);
        f.c(this.f30249f, d10, 20);
        f.c(this.f30250g, d10, 24);
        return d10;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return this.f30248e;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return this.f30249f;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return this.f30250g;
    }
}
