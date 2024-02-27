package wc;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f18131e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f18132f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f18133g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f18134h;

    public /* synthetic */ t(Dialog dialog, u uVar, String str, int i10) {
        this.f18131e = dialog;
        this.f18132f = uVar;
        this.f18133g = str;
        this.f18134h = i10;
    }

    public final void onClick(View view) {
        u.N(this.f18131e, this.f18132f, this.f18133g, this.f18134h, view);
    }
}
