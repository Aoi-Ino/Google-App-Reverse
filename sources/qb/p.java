package qb;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.LLMainScreen.LlAdharOtp;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f15331e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f15332f;

    public /* synthetic */ p(EditText editText, ImageView imageView) {
        this.f15331e = editText;
        this.f15332f = imageView;
    }

    public final void onClick(View view) {
        LlAdharOtp.A2(this.f15331e, this.f15332f, view);
    }
}
