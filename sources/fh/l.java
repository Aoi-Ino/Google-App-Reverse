package fh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.HypothecationTerminationActivityMultiServiceTO;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ HypothecationTerminationActivityMultiServiceTO f23490e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f23491f;

    public /* synthetic */ l(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f23490e = hypothecationTerminationActivityMultiServiceTO;
        this.f23491f = onDateSetListener;
    }

    public final void onClick(View view) {
        HypothecationTerminationActivityMultiServiceTO.F1(this.f23490e, this.f23491f, view);
    }
}
