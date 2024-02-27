package ma;

import android.view.View;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13880e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f13881f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Enabledservice f13882g;

    public /* synthetic */ a(int i10, b bVar, Enabledservice enabledservice) {
        this.f13880e = i10;
        this.f13881f = bVar;
        this.f13882g = enabledservice;
    }

    public final void onClick(View view) {
        b.C(this.f13880e, this.f13881f, this.f13882g, view);
    }
}
