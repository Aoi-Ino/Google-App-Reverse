package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.k1;
import androidx.core.view.x0;
import java.util.Iterator;
import java.util.List;

class a extends x0.b {

    /* renamed from: c  reason: collision with root package name */
    private final View f5654c;

    /* renamed from: d  reason: collision with root package name */
    private int f5655d;

    /* renamed from: e  reason: collision with root package name */
    private int f5656e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f5657f = new int[2];

    public a(View view) {
        super(0);
        this.f5654c = view;
    }

    public void b(x0 x0Var) {
        this.f5654c.setTranslationY(0.0f);
    }

    public void c(x0 x0Var) {
        this.f5654c.getLocationOnScreen(this.f5657f);
        this.f5655d = this.f5657f[1];
    }

    public k1 d(k1 k1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            x0 x0Var = (x0) it.next();
            if ((x0Var.c() & k1.m.a()) != 0) {
                this.f5654c.setTranslationY((float) r4.a.c(this.f5656e, 0, x0Var.b()));
                break;
            }
        }
        return k1Var;
    }

    public x0.a e(x0 x0Var, x0.a aVar) {
        this.f5654c.getLocationOnScreen(this.f5657f);
        int i10 = this.f5655d - this.f5657f[1];
        this.f5656e = i10;
        this.f5654c.setTranslationY((float) i10);
        return aVar;
    }
}
