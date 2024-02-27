package tj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ HillReligion f31661e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f31662f;

    public /* synthetic */ f(HillReligion hillReligion, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f31661e = hillReligion;
        this.f31662f = onDateSetListener;
    }

    public final void onClick(View view) {
        HillReligion.n2(this.f31661e, this.f31662f, view);
    }
}
