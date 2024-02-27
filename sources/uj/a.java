package uj;

import android.widget.CompoundButton;
import com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ com.nic.mparivahan.dlservices.ui.idp.a f31810e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f31811f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ IdpcovgradesItem f31812g;

    public /* synthetic */ a(com.nic.mparivahan.dlservices.ui.idp.a aVar, int i10, IdpcovgradesItem idpcovgradesItem) {
        this.f31810e = aVar;
        this.f31811f = i10;
        this.f31812g = idpcovgradesItem;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        com.nic.mparivahan.dlservices.ui.idp.a.C(this.f31810e, this.f31811f, this.f31812g, compoundButton, z10);
    }
}
