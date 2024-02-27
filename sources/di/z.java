package di;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import cm.u;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;

public final /* synthetic */ class z implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f22888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f22889b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VahanUpdateMobileActivity f22890c;

    public /* synthetic */ z(u uVar, u uVar2, VahanUpdateMobileActivity vahanUpdateMobileActivity) {
        this.f22888a = uVar;
        this.f22889b = uVar2;
        this.f22890c = vahanUpdateMobileActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanUpdateMobileActivity.D1(this.f22888a, this.f22889b, this.f22890c, datePicker, i10, i11, i12);
    }
}
