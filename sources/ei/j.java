package ei;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import cm.u;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;

public final /* synthetic */ class j implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f22982a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f22983b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VahanUpdateMobiActivity f22984c;

    public /* synthetic */ j(u uVar, u uVar2, VahanUpdateMobiActivity vahanUpdateMobiActivity) {
        this.f22982a = uVar;
        this.f22983b = uVar2;
        this.f22984c = vahanUpdateMobiActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanUpdateMobiActivity.I1(this.f22982a, this.f22983b, this.f22984c, datePicker, i10, i11, i12);
    }
}
