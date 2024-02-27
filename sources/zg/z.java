package zg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanTransferOfOwnerShipActivity f33191e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f33192f;

    public /* synthetic */ z(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f33191e = vahanTransferOfOwnerShipActivity;
        this.f33192f = onDateSetListener;
    }

    public final void onClick(View view) {
        VahanTransferOfOwnerShipActivity.H1(this.f33191e, this.f33192f, view);
    }
}
