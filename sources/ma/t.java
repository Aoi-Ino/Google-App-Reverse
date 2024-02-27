package ma;

import android.view.View;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13961e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f13962f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Enabledservice f13963g;

    public /* synthetic */ t(int i10, u uVar, Enabledservice enabledservice) {
        this.f13961e = i10;
        this.f13962f = uVar;
        this.f13963g = enabledservice;
    }

    public final void onClick(View view) {
        u.C(this.f13961e, this.f13962f, this.f13963g, view);
    }
}
