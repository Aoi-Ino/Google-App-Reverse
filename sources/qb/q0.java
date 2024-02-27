package qb;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.LLMainScreen.LlMobileOtp;

public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LlMobileOtp f15339e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f15340f;

    public /* synthetic */ q0(LlMobileOtp llMobileOtp, EditText editText) {
        this.f15339e = llMobileOtp;
        this.f15340f = editText;
    }

    public final void onClick(View view) {
        LlMobileOtp.c2(this.f15339e, this.f15340f, view);
    }
}
