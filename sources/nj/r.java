package nj;

import android.view.View;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.ui.dms.a;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f29835e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f29836f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a.b f29837g;

    public /* synthetic */ r(DocumentListItem documentListItem, a aVar, a.b bVar) {
        this.f29835e = documentListItem;
        this.f29836f = aVar;
        this.f29837g = bVar;
    }

    public final void onClick(View view) {
        a.R(this.f29835e, this.f29836f, this.f29837g, view);
    }
}
