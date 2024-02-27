package oc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14462e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ UserDetails f14463f;

    public /* synthetic */ b(Dialog dialog, UserDetails userDetails) {
        this.f14462e = dialog;
        this.f14463f = userDetails;
    }

    public final void onClick(View view) {
        UserDetails.L2(this.f14462e, this.f14463f, view);
    }
}
