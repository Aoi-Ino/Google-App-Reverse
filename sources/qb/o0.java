package qb;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.LLMainScreen.LlMobileOtp;

public final /* synthetic */ class o0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f15329e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f15330f;

    public /* synthetic */ o0(EditText editText, ImageView imageView) {
        this.f15329e = editText;
        this.f15330f = imageView;
    }

    public final void onClick(View view) {
        LlMobileOtp.f2(this.f15329e, this.f15330f, view);
    }
}
