package q9;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.NewCl.NewClOne;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NewClOne f15248e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f15249f;

    public /* synthetic */ g(NewClOne newClOne, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f15248e = newClOne;
        this.f15249f = onDateSetListener;
    }

    public final void onClick(View view) {
        NewClOne.S1(this.f15248e, this.f15249f, view);
    }
}
