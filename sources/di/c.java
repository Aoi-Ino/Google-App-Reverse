package di;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanConfirmUpdateMobileActivity;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanConfirmUpdateMobileActivity f22857e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f22858f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f22859g;

    public /* synthetic */ c(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, TextView textView, TextView textView2) {
        this.f22857e = vahanConfirmUpdateMobileActivity;
        this.f22858f = textView;
        this.f22859g = textView2;
    }

    public final void onClick(View view) {
        VahanConfirmUpdateMobileActivity.o2(this.f22857e, this.f22858f, this.f22859g, view);
    }
}
