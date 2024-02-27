package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;

public final /* synthetic */ class i1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanDuplicateRcActivity f32907e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32908f;

    public /* synthetic */ i1(VahanDuplicateRcActivity vahanDuplicateRcActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32907e = vahanDuplicateRcActivity;
        this.f32908f = onDateSetListener;
    }

    public final void onClick(View view) {
        VahanDuplicateRcActivity.y1(this.f32907e, this.f32908f, view);
    }
}
