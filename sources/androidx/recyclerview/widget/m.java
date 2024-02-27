package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class m extends RecyclerView.m {

    /* renamed from: g  reason: collision with root package name */
    boolean f3903g = true;

    public abstract boolean A(RecyclerView.d0 d0Var);

    public final void B(RecyclerView.d0 d0Var) {
        J(d0Var);
        h(d0Var);
    }

    public final void C(RecyclerView.d0 d0Var) {
        K(d0Var);
    }

    public final void D(RecyclerView.d0 d0Var, boolean z10) {
        L(d0Var, z10);
        h(d0Var);
    }

    public final void E(RecyclerView.d0 d0Var, boolean z10) {
        M(d0Var, z10);
    }

    public final void F(RecyclerView.d0 d0Var) {
        N(d0Var);
        h(d0Var);
    }

    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
    }

    public final void H(RecyclerView.d0 d0Var) {
        P(d0Var);
        h(d0Var);
    }

    public final void I(RecyclerView.d0 d0Var) {
        Q(d0Var);
    }

    public void J(RecyclerView.d0 d0Var) {
    }

    public void K(RecyclerView.d0 d0Var) {
    }

    public void L(RecyclerView.d0 d0Var, boolean z10) {
    }

    public void M(RecyclerView.d0 d0Var, boolean z10) {
    }

    public void N(RecyclerView.d0 d0Var) {
    }

    public void O(RecyclerView.d0 d0Var) {
    }

    public void P(RecyclerView.d0 d0Var) {
    }

    public void Q(RecyclerView.d0 d0Var) {
    }

    public boolean a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        if (cVar == null || ((i10 = cVar.f3657a) == (i11 = cVar2.f3657a) && cVar.f3658b == cVar2.f3658b)) {
            return x(d0Var);
        }
        return z(d0Var, i10, cVar.f3658b, i11, cVar2.f3658b);
    }

    public boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f3657a;
        int i13 = cVar.f3658b;
        if (d0Var2.L()) {
            int i14 = cVar.f3657a;
            i10 = cVar.f3658b;
            i11 = i14;
        } else {
            i11 = cVar2.f3657a;
            i10 = cVar2.f3658b;
        }
        return y(d0Var, d0Var2, i12, i13, i11, i10);
    }

    public boolean c(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f3657a;
        int i11 = cVar.f3658b;
        View view = d0Var.f3622e;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3657a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3658b;
        if (d0Var.x() || (i10 == left && i11 == top)) {
            return A(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(d0Var, i10, i11, left, top);
    }

    public boolean d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f3657a;
        int i11 = cVar2.f3657a;
        if (i10 == i11 && cVar.f3658b == cVar2.f3658b) {
            F(d0Var);
            return false;
        }
        return z(d0Var, i10, cVar.f3658b, i11, cVar2.f3658b);
    }

    public boolean f(RecyclerView.d0 d0Var) {
        return !this.f3903g || d0Var.v();
    }

    public abstract boolean x(RecyclerView.d0 d0Var);

    public abstract boolean y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13);
}
