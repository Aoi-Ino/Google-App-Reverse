package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import j4.d;
import java.util.ArrayList;
import java.util.List;
import k4.c;
import k4.i;
import l4.f;
import p3.k;
import z3.a;
import z3.e;

final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f5452e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f5453f;

    /* renamed from: g  reason: collision with root package name */
    protected e f5454g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleMapOptions f5455h;

    /* renamed from: i  reason: collision with root package name */
    private final List f5456i = new ArrayList();

    d(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f5452e = viewGroup;
        this.f5453f = context;
        this.f5455h = googleMapOptions;
    }

    /* access modifiers changed from: protected */
    public final void a(e eVar) {
        this.f5454g = eVar;
        j();
    }

    public final void j() {
        if (this.f5454g != null && b() == null) {
            try {
                j4.d.a(this.f5453f);
                c q10 = i.a(this.f5453f, (d.a) null).q(z3.d.l0(this.f5453f), this.f5455h);
                if (q10 != null) {
                    this.f5454g.a(new c(this.f5452e, q10));
                    for (j4.e a10 : this.f5456i) {
                        ((c) b()).a(a10);
                    }
                    this.f5456i.clear();
                }
            } catch (RemoteException e10) {
                throw new f(e10);
            } catch (k unused) {
            }
        }
    }
}
