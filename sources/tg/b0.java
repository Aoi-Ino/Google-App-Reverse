package tg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationAdditionActivityMultiService;

public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ HypothecationAdditionActivityMultiService f31343e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f31344f;

    public /* synthetic */ b0(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f31343e = hypothecationAdditionActivityMultiService;
        this.f31344f = onDateSetListener;
    }

    public final void onClick(View view) {
        HypothecationAdditionActivityMultiService.J1(this.f31343e, this.f31344f, view);
    }
}
