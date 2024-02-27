package e8;

import android.support.v4.media.session.b;
import java.util.ArrayList;
import java.util.HashMap;

public class z1 extends l0 {

    /* renamed from: n  reason: collision with root package name */
    private HashMap f11097n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private x0 f11098o;

    /* renamed from: p  reason: collision with root package name */
    private c2 f11099p;

    z1(c2 c2Var) {
        super(c1.f10427r9);
        this.f11099p = c2Var;
        this.f11098o = c2Var.K();
    }

    private void x(l0 l0Var, x0 x0Var) {
        i1 m10 = l0Var.m(c1.Z4);
        if (m10 != null && m10.d()) {
            b0 b0Var = (b0) m10;
            if (!((i1) b0Var.r().get(0)).i()) {
                ArrayList r10 = b0Var.r();
                if (r10.size() > 0) {
                    b.a(r10.get(0));
                    throw null;
                }
            }
        }
        if (x0Var != null) {
            this.f11099p.o(l0Var, x0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        HashMap hashMap = new HashMap();
        for (Integer num : this.f11097n.keySet()) {
            hashMap.put(num, this.f11099p.n((b0) this.f11097n.get(num)).a());
        }
        l0 a10 = g1.a(hashMap, this.f11099p);
        if (a10 != null) {
            r(c1.f10258e7, this.f11099p.n(a10).a());
        }
        x(this, this.f11098o);
    }

    public x0 w() {
        return this.f11098o;
    }
}
