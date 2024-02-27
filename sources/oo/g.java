package oo;

import ap.f;
import oo.o;

final class g extends o {

    /* renamed from: e  reason: collision with root package name */
    private final int f30241e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30242f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30243g;

    protected static class b extends o.a {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f30244e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f30245f = 0;

        protected b() {
            super(2);
        }

        /* access modifiers changed from: protected */
        public o k() {
            return new g(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public b e() {
            return this;
        }

        /* access modifiers changed from: protected */
        public b m(int i10) {
            this.f30244e = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        public b n(int i10) {
            this.f30245f = i10;
            return this;
        }
    }

    private g(b bVar) {
        super(bVar);
        this.f30241e = 0;
        this.f30242f = bVar.f30244e;
        this.f30243g = bVar.f30245f;
    }

    /* access modifiers changed from: protected */
    public byte[] d() {
        byte[] d10 = super.d();
        f.c(this.f30241e, d10, 16);
        f.c(this.f30242f, d10, 20);
        f.c(this.f30243g, d10, 24);
        return d10;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return this.f30242f;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return this.f30243g;
    }
}
