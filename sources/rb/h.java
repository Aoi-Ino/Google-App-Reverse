package rb;

import android.view.View;
import android.widget.ProgressBar;
import com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlOtpMobile;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProgressBar f15626e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlOtpMobile f15627f;

    public /* synthetic */ h(ProgressBar progressBar, LlOtpMobile llOtpMobile) {
        this.f15626e = progressBar;
        this.f15627f = llOtpMobile;
    }

    public final void onClick(View view) {
        LlOtpMobile.W1(this.f15626e, this.f15627f, view);
    }
}
