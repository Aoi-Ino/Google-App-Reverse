package le;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f24810e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f24811f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f24812g;

    public /* synthetic */ j(Dialog dialog, k kVar, String str) {
        this.f24810e = dialog;
        this.f24811f = kVar;
        this.f24812g = str;
    }

    public final void onClick(View view) {
        k.M(this.f24810e, this.f24811f, this.f24812g, view);
    }
}
