package gj;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.dlservices.ui.appcancel.VerifyMobileScreen;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f23732e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f23733f;

    public /* synthetic */ g(EditText editText, ImageView imageView) {
        this.f23732e = editText;
        this.f23733f = imageView;
    }

    public final void onClick(View view) {
        VerifyMobileScreen.S1(this.f23732e, this.f23733f, view);
    }
}
