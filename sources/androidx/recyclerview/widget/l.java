package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

abstract class l {
    static int a(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.O() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1;
        }
        return Math.min(iVar.o(), iVar.d(view2) - iVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        if (pVar.O() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (a0Var.b() - Math.max(pVar.n0(view), pVar.n0(view2))) - 1) : Math.max(0, Math.min(pVar.n0(view), pVar.n0(view2)));
        if (!z10) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(iVar.d(view2) - iVar.g(view))) / ((float) (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1)))) + ((float) (iVar.n() - iVar.g(view))));
    }

    static int c(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.O() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return a0Var.b();
        }
        return (int) ((((float) (iVar.d(view2) - iVar.g(view))) / ((float) (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1))) * ((float) a0Var.b()));
    }
}
