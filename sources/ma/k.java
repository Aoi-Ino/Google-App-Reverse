package ma;

import android.app.Dialog;
import android.view.View;
import ld.c;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f13927e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f13928f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f13929g;

    public /* synthetic */ k(Dialog dialog, m mVar, c cVar) {
        this.f13927e = dialog;
        this.f13928f = mVar;
        this.f13929g = cVar;
    }

    public final void onClick(View view) {
        m.H(this.f13927e, this.f13928f, this.f13929g, view);
    }
}
