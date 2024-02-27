package tb;

import android.view.View;
import com.nic.mparivahan.LLServices.UI.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class h0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f16756e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f16757f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a.b f16758g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f16759h;

    public /* synthetic */ h0(DocumentListItem documentListItem, a aVar, a.b bVar, int i10) {
        this.f16756e = documentListItem;
        this.f16757f = aVar;
        this.f16758g = bVar;
        this.f16759h = i10;
    }

    public final void onClick(View view) {
        a.T(this.f16756e, this.f16757f, this.f16758g, this.f16759h, view);
    }
}
