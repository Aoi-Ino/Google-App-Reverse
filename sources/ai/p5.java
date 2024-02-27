package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class p5 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19222e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19223f;

    public /* synthetic */ p5(Dialog dialog, VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19222e = dialog;
        this.f19223f = vahanSelectServiceScreen;
    }

    public final void onClick(View view) {
        VahanSelectServiceScreen.C2(this.f19222e, this.f19223f, view);
    }
}
