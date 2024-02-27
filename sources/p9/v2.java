package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ClSots;

public final /* synthetic */ class v2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ClSots f14887e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f14888f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f14889g;

    public /* synthetic */ v2(ClSots clSots, int i10, Dialog dialog) {
        this.f14887e = clSots;
        this.f14888f = i10;
        this.f14889g = dialog;
    }

    public final void onClick(View view) {
        ClSots.Y1(this.f14887e, this.f14888f, this.f14889g, view);
    }
}
