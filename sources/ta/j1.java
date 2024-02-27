package ta;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dashboard.ui.Home.HomeFragment;

public final /* synthetic */ class j1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16662e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f16663f;

    public /* synthetic */ j1(Dialog dialog, HomeFragment homeFragment) {
        this.f16662e = dialog;
        this.f16663f = homeFragment;
    }

    public final void onClick(View view) {
        HomeFragment.G7(this.f16662e, this.f16663f, view);
    }
}
