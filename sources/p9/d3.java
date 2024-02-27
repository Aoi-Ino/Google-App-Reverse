package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.DuplicateCl;

public final /* synthetic */ class d3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14778e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DuplicateCl f14779f;

    public /* synthetic */ d3(Dialog dialog, DuplicateCl duplicateCl) {
        this.f14778e = dialog;
        this.f14779f = duplicateCl;
    }

    public final void onClick(View view) {
        DuplicateCl.U1(this.f14778e, this.f14779f, view);
    }
}
