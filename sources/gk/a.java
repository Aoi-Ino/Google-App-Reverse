package gk;

import android.view.View;
import com.nic.mparivahan.dlservices.data.model.SlotDet;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f23744e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f23745f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ SlotDet f23746g;

    public /* synthetic */ a(b bVar, int i10, SlotDet slotDet) {
        this.f23744e = bVar;
        this.f23745f = i10;
        this.f23746g = slotDet;
    }

    public final void onClick(View view) {
        b.C(this.f23744e, this.f23745f, this.f23746g, view);
    }
}
