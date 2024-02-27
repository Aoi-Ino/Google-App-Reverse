package com.google.android.gms.maps;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import j4.e;
import k4.h;
import l4.f;
import s3.o;
import z3.d;

final class c implements z3.c {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f5449a;

    /* renamed from: b  reason: collision with root package name */
    private final k4.c f5450b;

    /* renamed from: c  reason: collision with root package name */
    private View f5451c;

    public c(ViewGroup viewGroup, k4.c cVar) {
        this.f5450b = (k4.c) o.i(cVar);
        this.f5449a = (ViewGroup) o.i(viewGroup);
    }

    public final void a(e eVar) {
        try {
            this.f5450b.J(new b(this, eVar));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            h.b(bundle, bundle2);
            this.f5450b.i(bundle2);
            h.b(bundle2, bundle);
            this.f5451c = (View) d.j(this.f5450b.G());
            this.f5449a.removeAllViews();
            this.f5449a.addView(this.f5451c);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
