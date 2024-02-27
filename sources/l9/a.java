package l9;

import android.view.View;
import com.nic.mparivahan.ClServices.Pojo.ClApplFlowStatus;
import l9.b;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b.a f13446e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f13447f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ClApplFlowStatus f13448g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f13449h;

    public /* synthetic */ a(b.a aVar, b bVar, ClApplFlowStatus clApplFlowStatus, int i10) {
        this.f13446e = aVar;
        this.f13447f = bVar;
        this.f13448g = clApplFlowStatus;
        this.f13449h = i10;
    }

    public final void onClick(View view) {
        b.C(this.f13446e, this.f13447f, this.f13448g, this.f13449h, view);
    }
}
