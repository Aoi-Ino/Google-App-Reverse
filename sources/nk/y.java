package nk;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f29898e;

    public /* synthetic */ y(Dialog dialog) {
        this.f29898e = dialog;
    }

    public final void onClick(View view) {
        MobUpdateAdhar.x2(this.f29898e, view);
    }
}
