package oc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14471e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ UserDetails f14472f;

    public /* synthetic */ m(Dialog dialog, UserDetails userDetails) {
        this.f14471e = dialog;
        this.f14472f = userDetails;
    }

    public final void onClick(View view) {
        UserDetails.N2(this.f14471e, this.f14472f, view);
    }
}
