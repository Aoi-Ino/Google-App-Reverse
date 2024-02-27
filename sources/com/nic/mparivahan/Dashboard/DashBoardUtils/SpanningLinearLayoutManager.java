package com.nic.mparivahan.Dashboard.DashBoardUtils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;

public final class SpanningLinearLayoutManager extends LinearLayoutManager {
    private final RecyclerView.q R2(RecyclerView.q qVar) {
        if (r2() == 0) {
            qVar.width = (int) Math.round(((double) P2()) / ((double) e()));
        } else if (r2() == 1) {
            qVar.height = (int) Math.round(((double) Q2()) / ((double) e()));
        }
        return qVar;
    }

    public RecyclerView.q I() {
        RecyclerView.q I = super.I();
        l.e(I, "generateDefaultLayoutParams(...)");
        RecyclerView.q R2 = R2(I);
        l.c(R2);
        return R2;
    }

    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        l.f(context, "c");
        l.f(attributeSet, "attrs");
        RecyclerView.q J = super.J(context, attributeSet);
        l.e(J, "generateLayoutParams(...)");
        RecyclerView.q R2 = R2(J);
        l.c(R2);
        return R2;
    }

    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        l.f(layoutParams, "lp");
        RecyclerView.q K = super.K(layoutParams);
        l.e(K, "generateLayoutParams(...)");
        RecyclerView.q R2 = R2(K);
        l.c(R2);
        return R2;
    }

    public final int P2() {
        return (u0() - k0()) - j0();
    }

    public final int Q2() {
        return (b0() - h0()) - m0();
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r(RecyclerView.q qVar) {
        l.f(qVar, "lp");
        return super.r(qVar);
    }
}
