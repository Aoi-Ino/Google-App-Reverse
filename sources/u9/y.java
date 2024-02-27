package u9;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ClServicesMainScreen f17074e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f17075f;

    public /* synthetic */ y(ClServicesMainScreen clServicesMainScreen, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f17074e = clServicesMainScreen;
        this.f17075f = onDateSetListener;
    }

    public final void onClick(View view) {
        ClServicesMainScreen.v1(this.f17074e, this.f17075f, view);
    }
}
