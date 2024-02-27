package cj;

import android.view.View;
import cj.m;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f20112e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f20113f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m.b f20114g;

    public /* synthetic */ c(DocumentListItem documentListItem, m mVar, m.b bVar) {
        this.f20112e = documentListItem;
        this.f20113f = mVar;
        this.f20114g = bVar;
    }

    public final void onClick(View view) {
        m.R(this.f20112e, this.f20113f, this.f20114g, view);
    }
}
