package q9;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.NewCl.NewClThree;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NewClThree f15264e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f15265f;

    public /* synthetic */ s(NewClThree newClThree, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f15264e = newClThree;
        this.f15265f = onDateSetListener;
    }

    public final void onClick(View view) {
        NewClThree.L1(this.f15264e, this.f15265f, view);
    }
}
