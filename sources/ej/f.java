package ej;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f23013e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f23014f;

    public /* synthetic */ f(EditText editText, ImageView imageView) {
        this.f23013e = editText;
        this.f23014f = imageView;
    }

    public final void onClick(View view) {
        AppNumberScreen.A2(this.f23013e, this.f23014f, view);
    }
}
