package di;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import cm.u;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;

public final /* synthetic */ class y implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f22885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f22886b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VahanUpdateMobileActivity f22887c;

    public /* synthetic */ y(u uVar, u uVar2, VahanUpdateMobileActivity vahanUpdateMobileActivity) {
        this.f22885a = uVar;
        this.f22886b = uVar2;
        this.f22887c = vahanUpdateMobileActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanUpdateMobileActivity.F1(this.f22885a, this.f22886b, this.f22887c, datePicker, i10, i11, i12);
    }
}
