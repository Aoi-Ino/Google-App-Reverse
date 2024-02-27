package nj;

import android.view.View;
import cm.u;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.ui.dms.a;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f29849e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.b f29850f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f29851g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f29852h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f29853i;

    public /* synthetic */ w(DocumentListItem documentListItem, a.b bVar, a aVar, u uVar, int i10) {
        this.f29849e = documentListItem;
        this.f29850f = bVar;
        this.f29851g = aVar;
        this.f29852h = uVar;
        this.f29853i = i10;
    }

    public final void onClick(View view) {
        a.N(this.f29849e, this.f29850f, this.f29851g, this.f29852h, this.f29853i, view);
    }
}
