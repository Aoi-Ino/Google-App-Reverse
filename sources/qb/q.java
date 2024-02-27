package qb;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.LLMainScreen.LlAdharOtp;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LlAdharOtp f15336e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f15337f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f15338g;

    public /* synthetic */ q(LlAdharOtp llAdharOtp, TextView textView, TextView textView2) {
        this.f15336e = llAdharOtp;
        this.f15337f = textView;
        this.f15338g = textView2;
    }

    public final void onClick(View view) {
        LlAdharOtp.B2(this.f15336e, this.f15337f, this.f15338g, view);
    }
}
