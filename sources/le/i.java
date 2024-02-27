package le;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f24807e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f24808f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f24809g;

    public /* synthetic */ i(Dialog dialog, k kVar, String str) {
        this.f24807e = dialog;
        this.f24808f = kVar;
        this.f24809g = str;
    }

    public final void onClick(View view) {
        k.L(this.f24807e, this.f24808f, this.f24809g, view);
    }
}
