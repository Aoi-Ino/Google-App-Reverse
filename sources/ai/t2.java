package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanFaceLessConfirmation;

public final /* synthetic */ class t2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19264e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanFaceLessConfirmation f19265f;

    public /* synthetic */ t2(Dialog dialog, VahanFaceLessConfirmation vahanFaceLessConfirmation) {
        this.f19264e = dialog;
        this.f19265f = vahanFaceLessConfirmation;
    }

    public final void onClick(View view) {
        VahanFaceLessConfirmation.n1(this.f19264e, this.f19265f, view);
    }
}
