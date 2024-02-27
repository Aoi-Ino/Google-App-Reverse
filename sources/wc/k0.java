package wc;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f18070e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l0 f18071f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f18072g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f18073h;

    public /* synthetic */ k0(Dialog dialog, l0 l0Var, String str, int i10) {
        this.f18070e = dialog;
        this.f18071f = l0Var;
        this.f18072g = str;
        this.f18073h = i10;
    }

    public final void onClick(View view) {
        l0.X(this.f18070e, this.f18071f, this.f18072g, this.f18073h, view);
    }
}
