package qj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f30627e;

    public /* synthetic */ e(Dialog dialog) {
        this.f30627e = dialog;
    }

    public final void onClick(View view) {
        DLDuplicateActivity.q2(this.f30627e, view);
    }
}
