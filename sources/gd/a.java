package gd;

import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplFlowStatus;
import gd.b;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b.a f11843e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f11844f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ApplFlowStatus f11845g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f11846h;

    public /* synthetic */ a(b.a aVar, b bVar, ApplFlowStatus applFlowStatus, int i10) {
        this.f11843e = aVar;
        this.f11844f = bVar;
        this.f11845g = applFlowStatus;
        this.f11846h = i10;
    }

    public final void onClick(View view) {
        b.C(this.f11843e, this.f11844f, this.f11845g, this.f11846h, view);
    }
}
