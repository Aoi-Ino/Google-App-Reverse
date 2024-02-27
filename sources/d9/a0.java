package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.AccidentReportActivity;

public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9784e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AccidentReportActivity f9785f;

    public /* synthetic */ a0(Dialog dialog, AccidentReportActivity accidentReportActivity) {
        this.f9784e = dialog;
        this.f9785f = accidentReportActivity;
    }

    public final void onClick(View view) {
        AccidentReportActivity.l2(this.f9784e, this.f9785f, view);
    }
}
