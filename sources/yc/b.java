package yc;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import yc.i;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f18667e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f18668f;

    public /* synthetic */ b(Dialog dialog, Context context) {
        this.f18667e = dialog;
        this.f18668f = context;
    }

    public final void onClick(View view) {
        i.a.k(this.f18667e, this.f18668f, view);
    }
}
