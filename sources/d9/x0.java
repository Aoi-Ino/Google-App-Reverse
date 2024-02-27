package d9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Citizen.Activities.TrafficFeedback;

public final /* synthetic */ class x0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f9863e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TrafficFeedback f9864f;

    public /* synthetic */ x0(Dialog dialog, TrafficFeedback trafficFeedback) {
        this.f9863e = dialog;
        this.f9864f = trafficFeedback;
    }

    public final void onClick(View view) {
        TrafficFeedback.y1(this.f9863e, this.f9864f, view);
    }
}
