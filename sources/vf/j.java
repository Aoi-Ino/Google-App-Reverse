package vf;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import cm.u;
import com.nic.mparivahan.VahanServices.Nominee.NomineeActivity;

public final /* synthetic */ class j implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f32278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f32279b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NomineeActivity f32280c;

    public /* synthetic */ j(u uVar, u uVar2, NomineeActivity nomineeActivity) {
        this.f32278a = uVar;
        this.f32279b = uVar2;
        this.f32280c = nomineeActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NomineeActivity.J1(this.f32278a, this.f32279b, this.f32280c, datePicker, i10, i11, i12);
    }
}
