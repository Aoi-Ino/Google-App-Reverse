package u9;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen;

public final /* synthetic */ class x implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClServicesMainScreen f17072a;

    public /* synthetic */ x(ClServicesMainScreen clServicesMainScreen) {
        this.f17072a = clServicesMainScreen;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        ClServicesMainScreen.u1(this.f17072a, datePicker, i10, i11, i12);
    }
}
