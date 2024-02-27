package sg;

import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ServiceList;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ServiceList f31236e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f31237f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f31238g;

    public /* synthetic */ d(ServiceList serviceList, e eVar, int i10) {
        this.f31236e = serviceList;
        this.f31237f = eVar;
        this.f31238g = i10;
    }

    public final void onClick(View view) {
        e.C(this.f31236e, this.f31237f, this.f31238g, view);
    }
}
