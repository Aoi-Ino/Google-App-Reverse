package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity;

public final /* synthetic */ class k1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9821e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TrafficReportVioActivity f9822f;

    public /* synthetic */ k1(Dialog dialog, TrafficReportVioActivity trafficReportVioActivity) {
        this.f9821e = dialog;
        this.f9822f = trafficReportVioActivity;
    }

    public final void onClick(View view) {
        TrafficReportVioActivity.B2(this.f9821e, this.f9822f, view);
    }
}
