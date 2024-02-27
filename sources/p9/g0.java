package p9;

import android.view.View;
import com.nic.mparivahan.ClServices.View.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class g0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f14791e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f14792f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a.b f14793g;

    public /* synthetic */ g0(DocumentListItem documentListItem, a aVar, a.b bVar) {
        this.f14791e = documentListItem;
        this.f14792f = aVar;
        this.f14793g = bVar;
    }

    public final void onClick(View view) {
        a.R(this.f14791e, this.f14792f, this.f14793g, view);
    }
}
