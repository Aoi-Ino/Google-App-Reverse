package ej;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f23020e;

    public /* synthetic */ i(EditText editText) {
        this.f23020e = editText;
    }

    public final void onClick(View view) {
        AppNumberScreen.D2(this.f23020e, view);
    }
}
