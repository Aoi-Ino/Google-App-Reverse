package e8;

import a8.v;

public class t1 extends b0 {

    /* renamed from: h  reason: collision with root package name */
    private float f11025h;

    /* renamed from: i  reason: collision with root package name */
    private float f11026i;

    /* renamed from: j  reason: collision with root package name */
    private float f11027j;

    /* renamed from: k  reason: collision with root package name */
    private float f11028k;

    public t1(float f10, float f11, float f12, float f13) {
        this(f10, f11, f12, f13, 0);
    }

    public boolean m(i1 i1Var) {
        return false;
    }

    public boolean n(float[] fArr) {
        return false;
    }

    public boolean o(int[] iArr) {
        return false;
    }

    public float u() {
        return this.f11026i;
    }

    public float v() {
        return this.f11025h;
    }

    public float w() {
        return this.f11027j;
    }

    public float x() {
        return this.f11028k;
    }

    public t1(float f10, float f11, float f12, float f13, int i10) {
        this.f11025h = 0.0f;
        this.f11026i = 0.0f;
        this.f11027j = 0.0f;
        this.f11028k = 0.0f;
        if (i10 == 90 || i10 == 270) {
            this.f11025h = f11;
            this.f11026i = f10;
            this.f11027j = f13;
            this.f11028k = f12;
        } else {
            this.f11025h = f10;
            this.f11026i = f11;
            this.f11027j = f12;
            this.f11028k = f13;
        }
        super.m(new f1(this.f11025h));
        super.m(new f1(this.f11026i));
        super.m(new f1(this.f11027j));
        super.m(new f1(this.f11028k));
    }

    public t1(v vVar) {
        this(vVar.p(), vVar.m(), vVar.s(), vVar.w(), 0);
    }

    public t1(v vVar, int i10) {
        this(vVar.p(), vVar.m(), vVar.s(), vVar.w(), i10);
    }
}
