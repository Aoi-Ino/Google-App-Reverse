package db;

import android.view.View;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f9884e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DPTNoticeDataModel f9885f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f9886g;

    public /* synthetic */ a(b bVar, DPTNoticeDataModel dPTNoticeDataModel, int i10) {
        this.f9884e = bVar;
        this.f9885f = dPTNoticeDataModel;
        this.f9886g = i10;
    }

    public final void onClick(View view) {
        b.D(this.f9884e, this.f9885f, this.f9886g, view);
    }
}
