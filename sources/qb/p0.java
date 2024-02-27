package qb;

import android.view.View;
import android.widget.TextView;
import cm.u;
import com.nic.mparivahan.LLMainScreen.LlMobileOtp;

public final /* synthetic */ class p0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LlMobileOtp f15333e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f15334f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f15335g;

    public /* synthetic */ p0(LlMobileOtp llMobileOtp, TextView textView, u uVar) {
        this.f15333e = llMobileOtp;
        this.f15334f = textView;
        this.f15335g = uVar;
    }

    public final void onClick(View view) {
        LlMobileOtp.b2(this.f15333e, this.f15334f, this.f15335g, view);
    }
}
