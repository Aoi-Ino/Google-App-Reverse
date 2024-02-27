package ma;

import android.view.View;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13984e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z f13985f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Enabledservice f13986g;

    public /* synthetic */ y(int i10, z zVar, Enabledservice enabledservice) {
        this.f13984e = i10;
        this.f13985f = zVar;
        this.f13986g = enabledservice;
    }

    public final void onClick(View view) {
        z.C(this.f13984e, this.f13985f, this.f13986g, view);
    }
}
