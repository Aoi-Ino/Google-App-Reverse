package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.MainActivity;

public final /* synthetic */ class n0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9830e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9831f;

    public /* synthetic */ n0(Dialog dialog, MainActivity mainActivity) {
        this.f9830e = dialog;
        this.f9831f = mainActivity;
    }

    public final void onClick(View view) {
        MainActivity.o1(this.f9830e, this.f9831f, view);
    }
}
