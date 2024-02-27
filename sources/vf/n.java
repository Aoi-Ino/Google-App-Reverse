package vf;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import cm.u;
import com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen;

public final /* synthetic */ class n implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f32286a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f32287b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NomineeMainViewScreen f32288c;

    public /* synthetic */ n(u uVar, u uVar2, NomineeMainViewScreen nomineeMainViewScreen) {
        this.f32286a = uVar;
        this.f32287b = uVar2;
        this.f32288c = nomineeMainViewScreen;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NomineeMainViewScreen.X1(this.f32286a, this.f32287b, this.f32288c, datePicker, i10, i11, i12);
    }
}
