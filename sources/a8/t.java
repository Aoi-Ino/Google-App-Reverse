package a8;

import java.util.ArrayList;

public class t extends u {

    /* renamed from: g  reason: collision with root package name */
    protected int f350g = -1;

    /* renamed from: h  reason: collision with root package name */
    protected float f351h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    protected float f352i;

    /* renamed from: j  reason: collision with root package name */
    protected float f353j;

    /* renamed from: k  reason: collision with root package name */
    private float f354k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    protected float f355l;

    /* renamed from: m  reason: collision with root package name */
    protected float f356m;

    /* renamed from: n  reason: collision with root package name */
    private float f357n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f358o = false;

    public t() {
    }

    public void A0(int i10) {
        this.f350g = i10;
    }

    public void B0(float f10) {
        this.f357n = f10;
    }

    public void C0(float f10) {
        this.f354k = f10;
    }

    public void D0(float f10) {
        this.f352i = f10;
    }

    public void E0(float f10) {
        this.f353j = f10;
    }

    public int F() {
        return 12;
    }

    public void F0(float f10) {
        this.f359e = f10;
        this.f351h = 0.0f;
    }

    public void G0(float f10, float f11) {
        this.f359e = f10;
        this.f351h = f11;
    }

    public void H0(float f10) {
        this.f356m = f10;
    }

    public void I0(float f10) {
        this.f355l = f10;
    }

    public float J0() {
        return this.f356m;
    }

    public float K0() {
        return y0();
    }

    /* renamed from: h0 */
    public boolean add(h hVar) {
        if (hVar instanceof p) {
            p pVar = (p) hVar;
            pVar.g(pVar.b() + this.f352i);
            pVar.h(this.f353j);
            return super.add(pVar);
        } else if (!(hVar instanceof t)) {
            return super.add(hVar);
        } else {
            super.add(hVar);
            ArrayList e02 = e0();
            if (!e02.isEmpty()) {
                super.add(new c("\n", ((c) e02.get(e02.size() - 1)).d()));
            } else {
                super.add(c.f254h);
            }
            return true;
        }
    }

    public int q0() {
        return this.f350g;
    }

    public float r0() {
        return this.f357n;
    }

    public float s0() {
        return this.f354k;
    }

    public float t0() {
        return this.f352i;
    }

    public float u0() {
        return this.f353j;
    }

    public boolean v0() {
        return this.f358o;
    }

    public float w0() {
        return this.f351h;
    }

    public float x0() {
        return this.f356m;
    }

    public float y0() {
        return this.f355l;
    }

    public float z0() {
        k kVar = this.f360f;
        float e10 = kVar == null ? this.f351h * 12.0f : kVar.e(this.f351h);
        return (e10 <= 0.0f || o0()) ? n0() + e10 : e10;
    }

    public t(c cVar) {
        super(cVar);
    }

    public t(u uVar) {
        super(uVar);
        if (uVar instanceof t) {
            t tVar = (t) uVar;
            A0(tVar.f350g);
            G0(uVar.n0(), tVar.f351h);
            D0(tVar.t0());
            E0(tVar.u0());
            C0(tVar.s0());
            H0(tVar.J0());
            I0(tVar.K0());
            B0(tVar.r0());
        }
    }

    public t(String str) {
        super(str);
    }

    public t(String str, k kVar) {
        super(str, kVar);
    }
}
