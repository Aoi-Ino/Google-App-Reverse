package nj;

import android.view.View;
import cm.u;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.ui.dms.a;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f29856e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f29857f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f29858g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f29859h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a.b f29860i;

    public /* synthetic */ y(DocumentListItem documentListItem, a aVar, int i10, u uVar, a.b bVar) {
        this.f29856e = documentListItem;
        this.f29857f = aVar;
        this.f29858g = i10;
        this.f29859h = uVar;
        this.f29860i = bVar;
    }

    public final void onClick(View view) {
        a.P(this.f29856e, this.f29857f, this.f29858g, this.f29859h, this.f29860i, view);
    }
}
