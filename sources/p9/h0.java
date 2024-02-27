package p9;

import android.view.View;
import com.nic.mparivahan.ClServices.View.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class h0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f14798e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f14799f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a.b f14800g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f14801h;

    public /* synthetic */ h0(DocumentListItem documentListItem, a aVar, a.b bVar, int i10) {
        this.f14798e = documentListItem;
        this.f14799f = aVar;
        this.f14800g = bVar;
        this.f14801h = i10;
    }

    public final void onClick(View view) {
        a.T(this.f14798e, this.f14799f, this.f14800g, this.f14801h, view);
    }
}
