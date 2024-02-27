package e8;

import a8.c;
import a8.q;
import java.util.ArrayList;
import java.util.Iterator;

public class z0 {

    /* renamed from: a  reason: collision with root package name */
    protected ArrayList f11087a;

    /* renamed from: b  reason: collision with root package name */
    protected float f11088b;

    /* renamed from: c  reason: collision with root package name */
    protected float f11089c;

    /* renamed from: d  reason: collision with root package name */
    protected int f11090d;

    /* renamed from: e  reason: collision with root package name */
    protected float f11091e;

    /* renamed from: f  reason: collision with root package name */
    protected c f11092f;

    /* renamed from: g  reason: collision with root package name */
    protected float f11093g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f11094h;

    /* renamed from: i  reason: collision with root package name */
    protected float f11095i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f11096j;

    z0(float f10, float f11, float f12, int i10, boolean z10, ArrayList arrayList, boolean z11) {
        this.f11092f = null;
        this.f11088b = f10;
        this.f11095i = f11;
        this.f11089c = f12;
        this.f11090d = i10;
        this.f11087a = arrayList;
        this.f11094h = z10;
        this.f11096j = z11;
    }

    private void b(e0 e0Var) {
        if (!e0Var.f10627k || !e0Var.n()) {
            this.f11087a.add(e0Var);
        } else {
            e0Var.f();
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public e0 a(e0 e0Var) {
        if (e0Var == null || e0Var.toString().equals("")) {
            return null;
        }
        e0 w10 = e0Var.w(this.f11089c);
        this.f11094h = e0Var.o() || w10 == null;
        if (e0Var.s()) {
            Object[] objArr = (Object[]) e0Var.d("TAB");
            float floatValue = ((Float) objArr[1]).floatValue();
            if (((Boolean) objArr[2]).booleanValue() && floatValue < this.f11095i - this.f11089c) {
                return e0Var;
            }
            this.f11089c = this.f11095i - floatValue;
            e0Var.a(this.f11088b);
        } else if (e0Var.t() > 0 || e0Var.n()) {
            if (w10 != null) {
                e0Var.z();
            }
            this.f11089c -= e0Var.B();
        } else if (this.f11087a.size() < 1) {
            e0 A = w10.A(this.f11089c);
            this.f11089c -= w10.B();
            if (w10.t() > 0) {
                b(w10);
                return A;
            }
            if (A != null) {
                b(A);
            }
            return null;
        } else {
            float f10 = this.f11089c;
            ArrayList arrayList = this.f11087a;
            this.f11089c = f10 + ((e0) arrayList.get(arrayList.size() - 1)).z();
            return w10;
        }
        b(e0Var);
        return w10;
    }

    public float c() {
        float f10 = 0.0f;
        int i10 = 0;
        while (i10 < this.f11087a.size()) {
            e0 e0Var = (e0) this.f11087a.get(i10);
            if (!e0Var.n()) {
                s0 c10 = e0Var.c();
                f10 = Math.max(f10, c10.b().l(1, c10.e()));
                i10++;
            } else {
                e0Var.f();
                throw null;
            }
        }
        return f10;
    }

    public e0 d(int i10) {
        if (i10 < 0 || i10 >= this.f11087a.size()) {
            return null;
        }
        return (e0) this.f11087a.get(i10);
    }

    public float e() {
        float l10;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.f11087a.size(); i10++) {
            e0 e0Var = (e0) this.f11087a.get(i10);
            if (e0Var.n()) {
                l10 = e0Var.g();
            } else {
                s0 c10 = e0Var.c();
                l10 = c10.b().l(3, c10.e());
            }
            f10 = Math.min(f10, l10);
        }
        return f10;
    }

    public int f() {
        int size = this.f11087a.size() - 1;
        while (size >= 0 && !((e0) this.f11087a.get(size)).r()) {
            size--;
        }
        return size;
    }

    public int g() {
        Iterator it = this.f11087a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((e0) it.next()).u();
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public float[] h() {
        float f10 = 0.0f;
        int i10 = 0;
        while (i10 < this.f11087a.size()) {
            e0 e0Var = (e0) this.f11087a.get(i10);
            if (!e0Var.n()) {
                f10 = Math.max(e0Var.c().e(), f10);
                i10++;
            } else {
                e0Var.f();
                throw null;
            }
        }
        return new float[]{f10, -10000.0f};
    }

    public float i() {
        return this.f11095i;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        Iterator it = this.f11087a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (e0Var.s()) {
                return -1;
            }
            if (e0Var.m()) {
                i10++;
            }
        }
        return i10;
    }

    public boolean k() {
        int i10 = this.f11090d;
        return (i10 == 3 || i10 == 8) && this.f11089c != 0.0f;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f11091e;
    }

    /* access modifiers changed from: package-private */
    public float m() {
        if (this.f11096j) {
            int i10 = this.f11090d;
            if (i10 != 0) {
                return i10 != 1 ? this.f11088b : this.f11088b + (this.f11089c / 2.0f);
            }
            return this.f11088b + this.f11089c;
        }
        if (j() <= 0) {
            int i11 = this.f11090d;
            if (i11 == 1) {
                return this.f11088b + (this.f11089c / 2.0f);
            }
            if (i11 == 2) {
                return this.f11088b + this.f11089c;
            }
        }
        return this.f11088b;
    }

    public boolean n() {
        return this.f11094h && this.f11090d != 8;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f11096j;
    }

    public Iterator p() {
        return this.f11087a.iterator();
    }

    public float q() {
        return this.f11093g;
    }

    public c r() {
        return this.f11092f;
    }

    /* access modifiers changed from: package-private */
    public int s() {
        String z0Var = toString();
        int length = z0Var.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (z0Var.charAt(i11) == ' ') {
                i10++;
            }
        }
        return i10;
    }

    public void t() {
        if (this.f11090d == 3) {
            this.f11090d = 0;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.f11087a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((e0) it.next()).toString());
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: package-private */
    public void u(float f10) {
        this.f11088b += f10;
        this.f11089c -= f10;
    }

    public void v(q qVar) {
        this.f11092f = qVar.L0();
        this.f11093g = qVar.t0();
    }

    public int w() {
        return this.f11087a.size();
    }

    /* access modifiers changed from: package-private */
    public float x() {
        return this.f11089c;
    }

    z0(float f10, float f11, int i10, float f12) {
        this.f11092f = null;
        this.f11094h = false;
        this.f11096j = false;
        this.f11088b = f10;
        float f13 = f11 - f10;
        this.f11089c = f13;
        this.f11095i = f13;
        this.f11090d = i10;
        this.f11091e = f12;
        this.f11087a = new ArrayList();
    }
}
