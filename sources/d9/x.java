package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.AccidentReportActivity;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9861e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AccidentReportActivity f9862f;

    public /* synthetic */ x(Dialog dialog, AccidentReportActivity accidentReportActivity) {
        this.f9861e = dialog;
        this.f9862f = accidentReportActivity;
    }

    public final void onClick(View view) {
        AccidentReportActivity.C1(this.f9861e, this.f9862f, view);
    }
}
