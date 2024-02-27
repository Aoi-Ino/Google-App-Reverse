package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.view.m0;
import i5.g;
import i5.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q4.f;
import q4.h;
import q4.k;

abstract class d extends ConstraintLayout {
    private final Runnable C = new c(this);
    private int D;
    private g E;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.material_radial_view_group, this);
        m0.u0(this, C());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f15131q5, i10, 0);
        this.D = obtainStyledAttributes.getDimensionPixelSize(k.f15140r5, 0);
        obtainStyledAttributes.recycle();
    }

    private void B(List list, e eVar, int i10) {
        Iterator it = list.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            eVar.g(((View) it.next()).getId(), f.circle_center, i10, f10);
            f10 += 360.0f / ((float) list.size());
        }
    }

    private Drawable C() {
        g gVar = new g();
        this.E = gVar;
        gVar.U(new i(0.5f));
        this.E.W(ColorStateList.valueOf(-1));
        return this.E;
    }

    private static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    private void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.C);
            handler.post(this.C);
        }
    }

    /* access modifiers changed from: package-private */
    public int D(int i10) {
        return i10 == 2 ? Math.round(((float) this.D) * 0.66f) : this.D;
    }

    public int E() {
        return this.D;
    }

    public void F(int i10) {
        this.D = i10;
        H();
    }

    /* access modifiers changed from: protected */
    public void H() {
        e eVar = new e();
        eVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != f.circle_center && !G(childAt)) {
                int i11 = (Integer) childAt.getTag(f.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            B((List) entry.getValue(), eVar, D(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(m0.k());
        }
        I();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    public void setBackgroundColor(int i10) {
        this.E.W(ColorStateList.valueOf(i10));
    }
}
