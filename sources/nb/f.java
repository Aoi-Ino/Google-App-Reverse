package nb;

import android.app.Dialog;
import android.view.View;
import cm.s;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14232e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f14233f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s f14234g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f14235h;

    public /* synthetic */ f(Dialog dialog, g gVar, s sVar, int i10) {
        this.f14232e = dialog;
        this.f14233f = gVar;
        this.f14234g = sVar;
        this.f14235h = i10;
    }

    public final void onClick(View view) {
        g.J(this.f14232e, this.f14233f, this.f14234g, this.f14235h, view);
    }
}
