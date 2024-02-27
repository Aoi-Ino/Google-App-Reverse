package p9;

import android.view.View;
import cm.u;
import com.nic.mparivahan.ClServices.View.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f14816e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.b f14817f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f14818g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f14819h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f14820i;

    public /* synthetic */ k0(DocumentListItem documentListItem, a.b bVar, a aVar, u uVar, int i10) {
        this.f14816e = documentListItem;
        this.f14817f = bVar;
        this.f14818g = aVar;
        this.f14819h = uVar;
        this.f14820i = i10;
    }

    public final void onClick(View view) {
        a.W(this.f14816e, this.f14817f, this.f14818g, this.f14819h, this.f14820i, view);
    }
}
