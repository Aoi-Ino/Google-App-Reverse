package gc;

import android.view.View;
import cm.u;
import com.nic.mparivahan.NewDlScreen.DlAcknow.a;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;

public final /* synthetic */ class b1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DocumentListItem f11765e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.b f11766f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f11767g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f11768h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f11769i;

    public /* synthetic */ b1(DocumentListItem documentListItem, a.b bVar, a aVar, u uVar, int i10) {
        this.f11765e = documentListItem;
        this.f11766f = bVar;
        this.f11767g = aVar;
        this.f11768h = uVar;
        this.f11769i = i10;
    }

    public final void onClick(View view) {
        a.N(this.f11765e, this.f11766f, this.f11767g, this.f11768h, this.f11769i, view);
    }
}
