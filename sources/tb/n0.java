package tb;

import android.view.View;
import cm.u;
import com.nic.mparivahan.LLServices.UI.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class n0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f16796e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f16797f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f16798g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f16799h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a.b f16800i;

    public /* synthetic */ n0(DocumentListItem documentListItem, a aVar, int i10, u uVar, a.b bVar) {
        this.f16796e = documentListItem;
        this.f16797f = aVar;
        this.f16798g = i10;
        this.f16799h = uVar;
        this.f16800i = bVar;
    }

    public final void onClick(View view) {
        a.P(this.f16796e, this.f16797f, this.f16798g, this.f16799h, this.f16800i, view);
    }
}
