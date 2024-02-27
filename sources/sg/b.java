package sg;

import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ServiceList;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ServiceList f31228e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f31229f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f31230g;

    public /* synthetic */ b(ServiceList serviceList, c cVar, int i10) {
        this.f31228e = serviceList;
        this.f31229f = cVar;
        this.f31230g = i10;
    }

    public final void onClick(View view) {
        c.C(this.f31228e, this.f31229f, this.f31230g, view);
    }
}
