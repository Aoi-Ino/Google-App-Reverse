package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity;

public final /* synthetic */ class p1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9840e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TrafficReportVioActivity f9841f;

    public /* synthetic */ p1(Dialog dialog, TrafficReportVioActivity trafficReportVioActivity) {
        this.f9840e = dialog;
        this.f9841f = trafficReportVioActivity;
    }

    public final void onClick(View view) {
        TrafficReportVioActivity.H1(this.f9840e, this.f9841f, view);
    }
}
