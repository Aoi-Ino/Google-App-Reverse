package ej;

import android.view.View;
import android.widget.TextView;
import cm.u;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppNumberScreen f23015e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f23016f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f23017g;

    public /* synthetic */ g(AppNumberScreen appNumberScreen, TextView textView, u uVar) {
        this.f23015e = appNumberScreen;
        this.f23016f = textView;
        this.f23017g = uVar;
    }

    public final void onClick(View view) {
        AppNumberScreen.B2(this.f23015e, this.f23016f, this.f23017g, view);
    }
}
