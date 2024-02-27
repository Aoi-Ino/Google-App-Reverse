package yc;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import yc.i;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f18690e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f18691f;

    public /* synthetic */ h(Dialog dialog, Context context) {
        this.f18690e = dialog;
        this.f18691f = context;
    }

    public final void onClick(View view) {
        i.a.s(this.f18690e, this.f18691f, view);
    }
}
