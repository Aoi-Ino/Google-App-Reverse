package q9;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.ClServices.View.NewCl.NewClThree;

public final /* synthetic */ class r implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NewClThree f15263a;

    public /* synthetic */ r(NewClThree newClThree) {
        this.f15263a = newClThree;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NewClThree.K1(this.f15263a, datePicker, i10, i11, i12);
    }
}
