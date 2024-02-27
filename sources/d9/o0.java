package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.MainActivity;

public final /* synthetic */ class o0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9835e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9836f;

    public /* synthetic */ o0(Dialog dialog, MainActivity mainActivity) {
        this.f9835e = dialog;
        this.f9836f = mainActivity;
    }

    public final void onClick(View view) {
        MainActivity.p1(this.f9835e, this.f9836f, view);
    }
}
