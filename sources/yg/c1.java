package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;

public final /* synthetic */ class c1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanDuplicatePermitActivity f32880e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32881f;

    public /* synthetic */ c1(VahanDuplicatePermitActivity vahanDuplicatePermitActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32880e = vahanDuplicatePermitActivity;
        this.f32881f = onDateSetListener;
    }

    public final void onClick(View view) {
        VahanDuplicatePermitActivity.B1(this.f32880e, this.f32881f, view);
    }
}
