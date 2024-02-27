package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import p4.j;
import r3.t;

public final class d0 extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public final c.a f5282c;

    public d0(c.a aVar, j jVar) {
        super(4, jVar);
        this.f5282c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(j jVar, boolean z10) {
    }

    public final boolean f(q qVar) {
        t tVar = (t) qVar.w().get(this.f5282c);
        return tVar != null && tVar.f15575a.f();
    }

    public final p3.c[] g(q qVar) {
        t tVar = (t) qVar.w().get(this.f5282c);
        if (tVar == null) {
            return null;
        }
        return tVar.f15575a.c();
    }

    public final void h(q qVar) {
        t tVar = (t) qVar.w().remove(this.f5282c);
        if (tVar != null) {
            tVar.f15576b.b(qVar.u(), this.f5251b);
            tVar.f15575a.a();
            return;
        }
        this.f5251b.e(Boolean.FALSE);
    }
}
