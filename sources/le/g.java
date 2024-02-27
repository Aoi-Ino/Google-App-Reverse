package le;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f24802e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f24803f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f24804g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f24805h;

    public /* synthetic */ g(Dialog dialog, k kVar, Context context, String str) {
        this.f24802e = dialog;
        this.f24803f = kVar;
        this.f24804g = context;
        this.f24805h = str;
    }

    public final void onClick(View view) {
        k.I(this.f24802e, this.f24803f, this.f24804g, this.f24805h, view);
    }
}
