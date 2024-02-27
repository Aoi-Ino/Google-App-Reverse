package nj;

import android.view.View;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.ui.dms.a;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f29838e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f29839f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a.b f29840g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f29841h;

    public /* synthetic */ s(DocumentListItem documentListItem, a aVar, a.b bVar, int i10) {
        this.f29838e = documentListItem;
        this.f29839f = aVar;
        this.f29840g = bVar;
        this.f29841h = i10;
    }

    public final void onClick(View view) {
        a.T(this.f29838e, this.f29839f, this.f29840g, this.f29841h, view);
    }
}
