package oo;

import ap.f;
import oo.o;

final class j extends o {

    /* renamed from: e  reason: collision with root package name */
    private final int f30254e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30255f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30256g;

    protected static class b extends o.a {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f30257e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f30258f = 0;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f30259g = 0;

        protected b() {
            super(0);
        }

        /* access modifiers changed from: protected */
        public o l() {
            return new j(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public b e() {
            return this;
        }

        /* access modifiers changed from: protected */
        public b n(int i10) {
            this.f30258f = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        public b o(int i10) {
            this.f30259g = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        public b p(int i10) {
            this.f30257e = i10;
            return this;
        }
    }

    private j(b bVar) {
        super(bVar);
        this.f30254e = bVar.f30257e;
        this.f30255f = bVar.f30258f;
        this.f30256g = bVar.f30259g;
    }

    /* access modifiers changed from: protected */
    public byte[] d() {
        byte[] d10 = super.d();
        f.c(this.f30254e, d10, 16);
        f.c(this.f30255f, d10, 20);
        f.c(this.f30256g, d10, 24);
        return d10;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return this.f30255f;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return this.f30256g;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return this.f30254e;
    }
}
