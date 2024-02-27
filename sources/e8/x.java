package e8;

import java.util.HashMap;
import java.util.HashSet;

class x {

    /* renamed from: a  reason: collision with root package name */
    protected l0 f11052a = new l0();

    /* renamed from: b  reason: collision with root package name */
    protected l0 f11053b = new l0();

    /* renamed from: c  reason: collision with root package name */
    protected l0 f11054c = new l0();

    /* renamed from: d  reason: collision with root package name */
    protected l0 f11055d = new l0();

    /* renamed from: e  reason: collision with root package name */
    protected l0 f11056e = new l0();

    /* renamed from: f  reason: collision with root package name */
    protected l0 f11057f = new l0();

    /* renamed from: g  reason: collision with root package name */
    protected l0 f11058g = new l0();

    /* renamed from: h  reason: collision with root package name */
    protected HashSet f11059h;

    /* renamed from: i  reason: collision with root package name */
    protected l0 f11060i;

    /* renamed from: j  reason: collision with root package name */
    protected int[] f11061j = {0};

    /* renamed from: k  reason: collision with root package name */
    protected HashMap f11062k;

    x() {
    }

    /* access modifiers changed from: package-private */
    public void a(l0 l0Var) {
        this.f11054c.q(l0Var);
    }

    /* access modifiers changed from: package-private */
    public c1 b(c1 c1Var, x0 x0Var) {
        c1 d10 = d(c1Var);
        this.f11052a.r(d10, x0Var);
        return d10;
    }

    /* access modifiers changed from: package-private */
    public l0 c() {
        v1 v1Var = new v1();
        l0 l0Var = this.f11060i;
        if (l0Var != null) {
            v1Var.s(l0Var);
        }
        v1Var.r(c1.L7, new a1("[/PDF /Text /ImageB /ImageC /ImageI]"));
        v1Var.v(c1.f10473v3, this.f11052a);
        v1Var.v(c1.f10520yb, this.f11053b);
        v1Var.v(c1.f10228c1, this.f11054c);
        v1Var.v(c1.f10308i7, this.f11055d);
        v1Var.v(c1.O8, this.f11056e);
        v1Var.v(c1.N2, this.f11057f);
        v1Var.v(c1.N7, this.f11058g);
        return v1Var;
    }

    /* access modifiers changed from: package-private */
    public c1 d(c1 c1Var) {
        if (this.f11059h == null) {
            return c1Var;
        }
        c1 c1Var2 = (c1) this.f11062k.get(c1Var);
        if (c1Var2 == null) {
            do {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Xi");
                int[] iArr = this.f11061j;
                int i10 = iArr[0];
                iArr[0] = i10 + 1;
                sb2.append(i10);
                c1Var2 = new c1(sb2.toString());
            } while (this.f11059h.contains(c1Var2));
            this.f11062k.put(c1Var, c1Var2);
        }
        return c1Var2;
    }
}
