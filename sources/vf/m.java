package vf;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import cm.u;
import com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen;

public final /* synthetic */ class m implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f32283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f32284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NomineeMainViewScreen f32285c;

    public /* synthetic */ m(u uVar, u uVar2, NomineeMainViewScreen nomineeMainViewScreen) {
        this.f32283a = uVar;
        this.f32284b = uVar2;
        this.f32285c = nomineeMainViewScreen;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NomineeMainViewScreen.V1(this.f32283a, this.f32284b, this.f32285c, datePicker, i10, i11, i12);
    }
}
