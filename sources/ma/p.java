package ma;

import android.app.Dialog;
import android.view.View;
import ld.c;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f13944e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r f13945f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f13946g;

    public /* synthetic */ p(Dialog dialog, r rVar, c cVar) {
        this.f13944e = dialog;
        this.f13945f = rVar;
        this.f13946g = cVar;
    }

    public final void onClick(View view) {
        r.H(this.f13944e, this.f13945f, this.f13946g, view);
    }
}
