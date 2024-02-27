package ah;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import cm.u;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ToGenerateOTPScreenForResult f19062e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f19063f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f19064g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f19065h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TextView f19066i;

    public /* synthetic */ h(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, TextView textView, u uVar, Context context, TextView textView2) {
        this.f19062e = toGenerateOTPScreenForResult;
        this.f19063f = textView;
        this.f19064g = uVar;
        this.f19065h = context;
        this.f19066i = textView2;
    }

    public final void onClick(View view) {
        ToGenerateOTPScreenForResult.h3(this.f19062e, this.f19063f, this.f19064g, this.f19065h, this.f19066i, view);
    }
}
