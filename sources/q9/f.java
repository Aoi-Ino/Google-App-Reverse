package q9;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.ClServices.View.NewCl.NewClOne;

public final /* synthetic */ class f implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NewClOne f15246a;

    public /* synthetic */ f(NewClOne newClOne) {
        this.f15246a = newClOne;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NewClOne.R1(this.f15246a, datePicker, i10, i11, i12);
    }
}
