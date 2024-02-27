package nk;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f29877e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MobUpdateAdhar f29878f;

    public /* synthetic */ k(Dialog dialog, MobUpdateAdhar mobUpdateAdhar) {
        this.f29877e = dialog;
        this.f29878f = mobUpdateAdhar;
    }

    public final void onClick(View view) {
        MobUpdateAdhar.S1(this.f29877e, this.f29878f, view);
    }
}
