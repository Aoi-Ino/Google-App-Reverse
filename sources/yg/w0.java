package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;

public final /* synthetic */ class w0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanDuplicateFitnessActivity f32965e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32966f;

    public /* synthetic */ w0(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32965e = vahanDuplicateFitnessActivity;
        this.f32966f = onDateSetListener;
    }

    public final void onClick(View view) {
        VahanDuplicateFitnessActivity.A1(this.f32965e, this.f32966f, view);
    }
}
