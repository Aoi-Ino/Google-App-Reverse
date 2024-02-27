package e8;

import a8.n;

class s0 implements Comparable {

    /* renamed from: e  reason: collision with root package name */
    private c f11016e;

    /* renamed from: f  reason: collision with root package name */
    private float f11017f;

    /* renamed from: g  reason: collision with root package name */
    protected float f11018g = 1.0f;

    s0(c cVar, float f10) {
        this.f11017f = f10;
        this.f11016e = cVar;
    }

    /* renamed from: a */
    public int compareTo(s0 s0Var) {
        if (s0Var == null) {
            return -1;
        }
        try {
            if (this.f11016e != s0Var.f11016e) {
                return 1;
            }
            return e() != s0Var.e() ? 2 : 0;
        } catch (ClassCastException unused) {
            return -2;
        }
    }

    /* access modifiers changed from: package-private */
    public c b() {
        return this.f11016e;
    }

    /* access modifiers changed from: package-private */
    public void c(float f10) {
        this.f11018g = f10;
    }

    /* access modifiers changed from: package-private */
    public void d(n nVar) {
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f11017f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return g(32);
    }

    /* access modifiers changed from: package-private */
    public float g(int i10) {
        return this.f11016e.w(i10, this.f11017f) * this.f11018g;
    }

    /* access modifiers changed from: package-private */
    public float h(String str) {
        return this.f11016e.x(str, this.f11017f) * this.f11018g;
    }
}
