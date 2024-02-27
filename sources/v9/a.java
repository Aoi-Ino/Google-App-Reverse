package v9;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import v9.d;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17489e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17490f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f17491g;

    public /* synthetic */ a(Dialog dialog, int i10, Context context) {
        this.f17489e = dialog;
        this.f17490f = i10;
        this.f17491g = context;
    }

    public final void onClick(View view) {
        d.a.E(this.f17489e, this.f17490f, this.f17491g, view);
    }
}
