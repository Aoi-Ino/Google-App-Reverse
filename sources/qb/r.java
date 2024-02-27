package qb;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.nic.mparivahan.LLMainScreen.LlAdharOtp;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f15341e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlAdharOtp f15342f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f15343g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ImageView f15344h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Dialog f15345i;

    public /* synthetic */ r(EditText editText, LlAdharOtp llAdharOtp, TextView textView, ImageView imageView, Dialog dialog) {
        this.f15341e = editText;
        this.f15342f = llAdharOtp;
        this.f15343g = textView;
        this.f15344h = imageView;
        this.f15345i = dialog;
    }

    public final void onClick(View view) {
        LlAdharOtp.x2(this.f15341e, this.f15342f, this.f15343g, this.f15344h, this.f15345i, view);
    }
}
