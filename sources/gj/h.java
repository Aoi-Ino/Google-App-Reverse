package gj;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.dlservices.ui.appcancel.VerifyMobileScreen;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VerifyMobileScreen f23734e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f23735f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f23736g;

    public /* synthetic */ h(VerifyMobileScreen verifyMobileScreen, TextView textView, TextView textView2) {
        this.f23734e = verifyMobileScreen;
        this.f23735f = textView;
        this.f23736g = textView2;
    }

    public final void onClick(View view) {
        VerifyMobileScreen.T1(this.f23734e, this.f23735f, this.f23736g, view);
    }
}
