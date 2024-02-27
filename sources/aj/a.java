package aj;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f19316e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Dialog f19317f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f19318g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f19319h;

    public /* synthetic */ a(b bVar, Dialog dialog, Context context, String str) {
        this.f19316e = bVar;
        this.f19317f = dialog;
        this.f19318g = context;
        this.f19319h = str;
    }

    public final void onClick(View view) {
        this.f19316e.d(this.f19317f, this.f19318g, this.f19319h, view);
    }
}
