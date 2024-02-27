package e8;

import a8.b;

public abstract class n extends b {

    /* renamed from: o  reason: collision with root package name */
    protected int f10939o;

    public n(int i10, float f10, float f11, float f12) {
        super(h(f10), h(f11), h(f12));
        this.f10939o = i10;
    }

    public static int g(b bVar) {
        if (bVar instanceof n) {
            return ((n) bVar).f();
        }
        return 0;
    }

    static final float h(float f10) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public int f() {
        return this.f10939o;
    }
}
