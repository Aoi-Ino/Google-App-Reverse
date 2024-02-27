package ei;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanValidateUpdateMobileActivity;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanValidateUpdateMobileActivity f23002e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f23003f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f23004g;

    public /* synthetic */ y(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, TextView textView, TextView textView2) {
        this.f23002e = vahanValidateUpdateMobileActivity;
        this.f23003f = textView;
        this.f23004g = textView2;
    }

    public final void onClick(View view) {
        VahanValidateUpdateMobileActivity.z2(this.f23002e, this.f23003f, this.f23004g, view);
    }
}
