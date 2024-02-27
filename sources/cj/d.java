package cj;

import android.view.View;
import cj.m;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f20115e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f20116f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m.b f20117g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f20118h;

    public /* synthetic */ d(DocumentListItem documentListItem, m mVar, m.b bVar, int i10) {
        this.f20115e = documentListItem;
        this.f20116f = mVar;
        this.f20117g = bVar;
        this.f20118h = i10;
    }

    public final void onClick(View view) {
        m.T(this.f20115e, this.f20116f, this.f20117g, this.f20118h, view);
    }
}
