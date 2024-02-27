package fa;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.DPTNotice.NoticeDetailsActivity;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11567e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f11568f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ NoticeDetailsActivity f11569g;

    public /* synthetic */ j(Dialog dialog, int i10, NoticeDetailsActivity noticeDetailsActivity) {
        this.f11567e = dialog;
        this.f11568f = i10;
        this.f11569g = noticeDetailsActivity;
    }

    public final void onClick(View view) {
        NoticeDetailsActivity.p1(this.f11567e, this.f11568f, this.f11569g, view);
    }
}
