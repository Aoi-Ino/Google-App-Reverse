package d9;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity;

public final /* synthetic */ class x1 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TrafficReportVioActivity f9865a;

    public /* synthetic */ x1(TrafficReportVioActivity trafficReportVioActivity) {
        this.f9865a = trafficReportVioActivity;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return TrafficReportVioActivity.u2(this.f9865a, textView, i10, keyEvent);
    }
}
