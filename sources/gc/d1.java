package gc;

import android.view.View;
import cm.u;
import com.nic.mparivahan.NewDlScreen.DlAcknow.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class d1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f11778e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f11779f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f11780g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f11781h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a.b f11782i;

    public /* synthetic */ d1(DocumentListItem documentListItem, a aVar, int i10, u uVar, a.b bVar) {
        this.f11778e = documentListItem;
        this.f11779f = aVar;
        this.f11780g = i10;
        this.f11781h = uVar;
        this.f11782i = bVar;
    }

    public final void onClick(View view) {
        a.P(this.f11778e, this.f11779f, this.f11780g, this.f11781h, this.f11782i, view);
    }
}
