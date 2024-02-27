package ah;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19073e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ToGenerateOTPScreenForResult f19074f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f19075g;

    public /* synthetic */ l(Dialog dialog, ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, Context context) {
        this.f19073e = dialog;
        this.f19074f = toGenerateOTPScreenForResult;
        this.f19075g = context;
    }

    public final void onClick(View view) {
        ToGenerateOTPScreenForResult.A1(this.f19073e, this.f19074f, this.f19075g, view);
    }
}
