package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ChangeNameCl;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14763e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ChangeNameCl f14764f;

    public /* synthetic */ b(Dialog dialog, ChangeNameCl changeNameCl) {
        this.f14763e = dialog;
        this.f14764f = changeNameCl;
    }

    public final void onClick(View view) {
        ChangeNameCl.b2(this.f14763e, this.f14764f, view);
    }
}
