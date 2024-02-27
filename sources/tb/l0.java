package tb;

import android.view.View;
import cm.u;
import com.nic.mparivahan.LLServices.UI.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class l0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f16780e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.b f16781f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f16782g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f16783h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f16784i;

    public /* synthetic */ l0(DocumentListItem documentListItem, a.b bVar, a aVar, u uVar, int i10) {
        this.f16780e = documentListItem;
        this.f16781f = bVar;
        this.f16782g = aVar;
        this.f16783h = uVar;
        this.f16784i = i10;
    }

    public final void onClick(View view) {
        a.N(this.f16780e, this.f16781f, this.f16782g, this.f16783h, this.f16784i, view);
    }
}
