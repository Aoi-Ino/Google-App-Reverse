package m8;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RcSearchHistory;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f13866e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RcSearchHistory f13867f;

    public /* synthetic */ f(Dialog dialog, RcSearchHistory rcSearchHistory) {
        this.f13866e = dialog;
        this.f13867f = rcSearchHistory;
    }

    public final void onClick(View view) {
        RcSearchHistory.t1(this.f13866e, this.f13867f, view);
    }
}
