package x8;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.AddCov.View.CovList;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f18240e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CovList f18241f;

    public /* synthetic */ y(Dialog dialog, CovList covList) {
        this.f18240e = dialog;
        this.f18241f = covList;
    }

    public final void onClick(View view) {
        CovList.z1(this.f18240e, this.f18241f, view);
    }
}
