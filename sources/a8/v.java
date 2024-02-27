package a8;

import java.util.ArrayList;

public class v implements h {

    /* renamed from: e  reason: collision with root package name */
    protected float f361e;

    /* renamed from: f  reason: collision with root package name */
    protected float f362f;

    /* renamed from: g  reason: collision with root package name */
    protected float f363g;

    /* renamed from: h  reason: collision with root package name */
    protected float f364h;

    /* renamed from: i  reason: collision with root package name */
    protected int f365i;

    /* renamed from: j  reason: collision with root package name */
    protected b f366j;

    /* renamed from: k  reason: collision with root package name */
    protected int f367k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f368l;

    /* renamed from: m  reason: collision with root package name */
    protected float f369m;

    /* renamed from: n  reason: collision with root package name */
    protected float f370n;

    /* renamed from: o  reason: collision with root package name */
    protected float f371o;

    /* renamed from: p  reason: collision with root package name */
    protected float f372p;

    /* renamed from: q  reason: collision with root package name */
    protected float f373q;

    /* renamed from: r  reason: collision with root package name */
    protected b f374r;

    /* renamed from: s  reason: collision with root package name */
    protected b f375s;

    /* renamed from: t  reason: collision with root package name */
    protected b f376t;

    /* renamed from: u  reason: collision with root package name */
    protected b f377u;

    /* renamed from: v  reason: collision with root package name */
    protected b f378v;

    public v(float f10, float f11) {
        this(0.0f, 0.0f, f10, f11);
    }

    private float y(float f10, int i10) {
        if ((i10 & this.f367k) != 0) {
            return f10 != -1.0f ? f10 : this.f369m;
        }
        return 0.0f;
    }

    public boolean A(int i10) {
        int i11 = this.f367k;
        return i11 != -1 && (i11 & i10) == i10;
    }

    public boolean B() {
        int i10 = this.f367k;
        if (i10 == -1 || i10 == 0) {
            return false;
        }
        return this.f369m > 0.0f || this.f370n > 0.0f || this.f371o > 0.0f || this.f372p > 0.0f || this.f373q > 0.0f;
    }

    public boolean C() {
        return this.f368l;
    }

    public void D(b bVar) {
        this.f366j = bVar;
    }

    public void E(int i10) {
        this.f367k = i10;
    }

    public int F() {
        return 30;
    }

    public void G(b bVar) {
        this.f374r = bVar;
    }

    public void H(float f10) {
        this.f362f = f10;
    }

    public void I(float f10) {
        this.f361e = f10;
    }

    public void J(float f10) {
        this.f363g = f10;
    }

    public void K(int i10) {
        int i11 = i10 % 360;
        this.f365i = i11;
        if (i11 != 90 && i11 != 180 && i11 != 270) {
            this.f365i = 0;
        }
    }

    public void L(float f10) {
        this.f364h = f10;
    }

    public boolean T() {
        return true;
    }

    public void a(v vVar) {
        this.f365i = vVar.f365i;
        this.f366j = vVar.f366j;
        this.f367k = vVar.f367k;
        this.f368l = vVar.f368l;
        this.f369m = vVar.f369m;
        this.f370n = vVar.f370n;
        this.f371o = vVar.f371o;
        this.f372p = vVar.f372p;
        this.f373q = vVar.f373q;
        this.f374r = vVar.f374r;
        this.f375s = vVar.f375s;
        this.f376t = vVar.f376t;
        this.f377u = vVar.f377u;
        this.f378v = vVar.f378v;
    }

    public b b() {
        return this.f366j;
    }

    public b c() {
        return this.f374r;
    }

    public b d() {
        b bVar = this.f378v;
        return bVar == null ? this.f374r : bVar;
    }

    public b e() {
        b bVar = this.f375s;
        return bVar == null ? this.f374r : bVar;
    }

    public ArrayList e0() {
        return new ArrayList();
    }

    public b f() {
        b bVar = this.f376t;
        return bVar == null ? this.f374r : bVar;
    }

    public b g() {
        b bVar = this.f377u;
        return bVar == null ? this.f374r : bVar;
    }

    public float h() {
        return this.f369m;
    }

    public float i() {
        return y(this.f373q, 2);
    }

    public float j() {
        return y(this.f370n, 4);
    }

    public float k() {
        return y(this.f371o, 8);
    }

    public float l() {
        return y(this.f372p, 1);
    }

    public float m() {
        return this.f362f;
    }

    public float n(float f10) {
        return this.f362f + f10;
    }

    public float o() {
        return this.f364h - this.f362f;
    }

    public float p() {
        return this.f361e;
    }

    public float q(float f10) {
        return this.f361e + f10;
    }

    public boolean r(i iVar) {
        try {
            return iVar.b(this);
        } catch (g unused) {
            return false;
        }
    }

    public float s() {
        return this.f363g;
    }

    public float t(float f10) {
        return this.f363g - f10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Rectangle: ");
        stringBuffer.append(z());
        stringBuffer.append('x');
        stringBuffer.append(o());
        stringBuffer.append(" (rot: ");
        stringBuffer.append(this.f365i);
        stringBuffer.append(" degrees)");
        return stringBuffer.toString();
    }

    public int u() {
        return this.f365i;
    }

    public float w() {
        return this.f364h;
    }

    public float x(float f10) {
        return this.f364h - f10;
    }

    public float z() {
        return this.f363g - this.f361e;
    }

    public v(float f10, float f11, float f12, float f13) {
        this.f365i = 0;
        this.f366j = null;
        this.f367k = -1;
        this.f368l = false;
        this.f369m = -1.0f;
        this.f370n = -1.0f;
        this.f371o = -1.0f;
        this.f372p = -1.0f;
        this.f373q = -1.0f;
        this.f374r = null;
        this.f375s = null;
        this.f376t = null;
        this.f377u = null;
        this.f378v = null;
        this.f361e = f10;
        this.f362f = f11;
        this.f363g = f12;
        this.f364h = f13;
    }

    public v(v vVar) {
        this(vVar.f361e, vVar.f362f, vVar.f363g, vVar.f364h);
        a(vVar);
    }
}
