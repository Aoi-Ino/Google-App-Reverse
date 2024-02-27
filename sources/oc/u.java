package oc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14480e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ UserDetails f14481f;

    public /* synthetic */ u(Dialog dialog, UserDetails userDetails) {
        this.f14480e = dialog;
        this.f14481f = userDetails;
    }

    public final void onClick(View view) {
        UserDetails.H2(this.f14480e, this.f14481f, view);
    }
}
