package ah;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import cm.u;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19067e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19068f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f19069g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ToGenerateOTPScreenForResult f19070h;

    public /* synthetic */ i(EditText editText, Context context, u uVar, ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
        this.f19067e = editText;
        this.f19068f = context;
        this.f19069g = uVar;
        this.f19070h = toGenerateOTPScreenForResult;
    }

    public final void onClick(View view) {
        ToGenerateOTPScreenForResult.i3(this.f19067e, this.f19068f, this.f19069g, this.f19070h, view);
    }
}
