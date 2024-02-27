package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlSlots;

public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DlSlots f11811e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f11812f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f11813g;

    public /* synthetic */ q0(DlSlots dlSlots, int i10, Dialog dialog) {
        this.f11811e = dlSlots;
        this.f11812f = i10;
        this.f11813g = dialog;
    }

    public final void onClick(View view) {
        DlSlots.Q1(this.f11811e, this.f11812f, this.f11813g, view);
    }
}
