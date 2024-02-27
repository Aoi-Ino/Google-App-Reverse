package u9;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.ClServicesMainScreens.MobileOtpScreen;

public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MobileOtpScreen f17056e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f17057f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f17058g;

    public /* synthetic */ q0(MobileOtpScreen mobileOtpScreen, TextView textView, TextView textView2) {
        this.f17056e = mobileOtpScreen;
        this.f17057f = textView;
        this.f17058g = textView2;
    }

    public final void onClick(View view) {
        MobileOtpScreen.x2(this.f17056e, this.f17057f, this.f17058g, view);
    }
}
