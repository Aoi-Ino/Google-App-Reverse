package tb;

import android.view.View;
import com.nic.mparivahan.LLServices.UI.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class g0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f16750e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f16751f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a.b f16752g;

    public /* synthetic */ g0(DocumentListItem documentListItem, a aVar, a.b bVar) {
        this.f16750e = documentListItem;
        this.f16751f = aVar;
        this.f16752g = bVar;
    }

    public final void onClick(View view) {
        a.R(this.f16750e, this.f16751f, this.f16752g, view);
    }
}
