package dh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.HypothecationAdditionActivityMultiServiceTO;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ HypothecationAdditionActivityMultiServiceTO f22837e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f22838f;

    public /* synthetic */ y(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f22837e = hypothecationAdditionActivityMultiServiceTO;
        this.f22838f = onDateSetListener;
    }

    public final void onClick(View view) {
        HypothecationAdditionActivityMultiServiceTO.G1(this.f22837e, this.f22838f, view);
    }
}
