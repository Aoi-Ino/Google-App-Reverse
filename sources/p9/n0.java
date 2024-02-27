package p9;

import android.view.View;
import cm.u;
import com.nic.mparivahan.ClServices.View.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class n0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f14846e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f14847f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f14848g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f14849h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a.b f14850i;

    public /* synthetic */ n0(DocumentListItem documentListItem, a aVar, int i10, u uVar, a.b bVar) {
        this.f14846e = documentListItem;
        this.f14847f = aVar;
        this.f14848g = i10;
        this.f14849h = uVar;
        this.f14850i = bVar;
    }

    public final void onClick(View view) {
        a.P(this.f14846e, this.f14847f, this.f14848g, this.f14849h, this.f14850i, view);
    }
}
