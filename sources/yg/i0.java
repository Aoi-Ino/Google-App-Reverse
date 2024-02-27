package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;

public final /* synthetic */ class i0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RCReleaseActivity f32905e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32906f;

    public /* synthetic */ i0(RCReleaseActivity rCReleaseActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32905e = rCReleaseActivity;
        this.f32906f = onDateSetListener;
    }

    public final void onClick(View view) {
        RCReleaseActivity.y1(this.f32905e, this.f32906f, view);
    }
}
