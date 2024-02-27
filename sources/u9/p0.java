package u9;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.ClServicesMainScreens.MobileOtpScreen;

public final /* synthetic */ class p0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f17053e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f17054f;

    public /* synthetic */ p0(EditText editText, ImageView imageView) {
        this.f17053e = editText;
        this.f17054f = imageView;
    }

    public final void onClick(View view) {
        MobileOtpScreen.w2(this.f17053e, this.f17054f, view);
    }
}
