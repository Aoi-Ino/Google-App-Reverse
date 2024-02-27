package nj;

import android.view.View;
import cm.u;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.ui.dms.a;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f29844e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.b f29845f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f29846g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f29847h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f29848i;

    public /* synthetic */ v(DocumentListItem documentListItem, a.b bVar, a aVar, u uVar, int i10) {
        this.f29844e = documentListItem;
        this.f29845f = bVar;
        this.f29846g = aVar;
        this.f29847h = uVar;
        this.f29848i = i10;
    }

    public final void onClick(View view) {
        a.W(this.f29844e, this.f29845f, this.f29846g, this.f29847h, this.f29848i, view);
    }
}
