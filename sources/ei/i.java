package ei;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import cm.u;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;

public final /* synthetic */ class i implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f22979a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f22980b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VahanUpdateMobiActivity f22981c;

    public /* synthetic */ i(u uVar, u uVar2, VahanUpdateMobiActivity vahanUpdateMobiActivity) {
        this.f22979a = uVar;
        this.f22980b = uVar2;
        this.f22981c = vahanUpdateMobiActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanUpdateMobiActivity.K1(this.f22979a, this.f22980b, this.f22981c, datePicker, i10, i11, i12);
    }
}
