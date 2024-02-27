package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.DuplicateCl;

public final /* synthetic */ class c3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14773e;

    public /* synthetic */ c3(Dialog dialog) {
        this.f14773e = dialog;
    }

    public final void onClick(View view) {
        DuplicateCl.T1(this.f14773e, view);
    }
}
