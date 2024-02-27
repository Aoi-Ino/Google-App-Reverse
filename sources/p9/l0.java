package p9;

import android.view.View;
import cm.u;
import com.nic.mparivahan.ClServices.View.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class l0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f14828e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.b f14829f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f14830g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f14831h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f14832i;

    public /* synthetic */ l0(DocumentListItem documentListItem, a.b bVar, a aVar, u uVar, int i10) {
        this.f14828e = documentListItem;
        this.f14829f = bVar;
        this.f14830g = aVar;
        this.f14831h = uVar;
        this.f14832i = i10;
    }

    public final void onClick(View view) {
        a.N(this.f14828e, this.f14829f, this.f14830g, this.f14831h, this.f14832i, view);
    }
}
