package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.AccidentFeedback;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9810e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AccidentFeedback f9811f;

    public /* synthetic */ h(Dialog dialog, AccidentFeedback accidentFeedback) {
        this.f9810e = dialog;
        this.f9811f = accidentFeedback;
    }

    public final void onClick(View view) {
        AccidentFeedback.y1(this.f9810e, this.f9811f, view);
    }
}
