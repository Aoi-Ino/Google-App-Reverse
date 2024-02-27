package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class v5 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19284e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19285f;

    public /* synthetic */ v5(Dialog dialog, VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19284e = dialog;
        this.f19285f = vahanSelectServiceScreen;
    }

    public final void onClick(View view) {
        VahanSelectServiceScreen.K1(this.f19284e, this.f19285f, view);
    }
}
