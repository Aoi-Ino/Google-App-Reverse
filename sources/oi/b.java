package oi;

import android.app.Dialog;
import android.view.View;
import bm.l;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f30100e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f30101f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f30102g;

    public /* synthetic */ b(l lVar, g gVar, Dialog dialog) {
        this.f30100e = lVar;
        this.f30101f = gVar;
        this.f30102g = dialog;
    }

    public final void onClick(View view) {
        g.o1(this.f30100e, this.f30101f, this.f30102g, view);
    }
}
