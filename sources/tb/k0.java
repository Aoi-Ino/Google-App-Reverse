package tb;

import android.view.View;
import cm.u;
import com.nic.mparivahan.LLServices.UI.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f16772e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.b f16773f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f16774g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f16775h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f16776i;

    public /* synthetic */ k0(DocumentListItem documentListItem, a.b bVar, a aVar, u uVar, int i10) {
        this.f16772e = documentListItem;
        this.f16773f = bVar;
        this.f16774g = aVar;
        this.f16775h = uVar;
        this.f16776i = i10;
    }

    public final void onClick(View view) {
        a.W(this.f16772e, this.f16773f, this.f16774g, this.f16775h, this.f16776i, view);
    }
}
