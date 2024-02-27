package e8;

public class k0 extends b0 {

    /* renamed from: h  reason: collision with root package name */
    private boolean f10858h = false;

    public k0(int i10, float f10, float f11, float f12) {
        super((i1) c1.Cb);
        if (f10 < 0.0f) {
            m(e1.f10628g);
        } else {
            m(new f1(f10));
        }
        m(f11 < 0.0f ? e1.f10628g : new f1(f11));
        m(new f1(f12));
    }

    public boolean u(x0 x0Var) {
        if (this.f10858h) {
            return false;
        }
        p(x0Var);
        this.f10858h = true;
        return true;
    }

    public boolean v() {
        return this.f10858h;
    }
}
