package ej;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppNumberScreen f23018e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f23019f;

    public /* synthetic */ h(AppNumberScreen appNumberScreen, EditText editText) {
        this.f23018e = appNumberScreen;
        this.f23019f = editText;
    }

    public final void onClick(View view) {
        AppNumberScreen.C2(this.f23018e, this.f23019f, view);
    }
}
