package m8;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RcSearchHistory;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f13869e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RcSearchHistory f13870f;

    public /* synthetic */ h(Dialog dialog, RcSearchHistory rcSearchHistory) {
        this.f13869e = dialog;
        this.f13870f = rcSearchHistory;
    }

    public final void onClick(View view) {
        RcSearchHistory.w1(this.f13869e, this.f13870f, view);
    }
}
