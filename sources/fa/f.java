package fa;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.DPTNotice.NoticeDetailsActivity;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11562e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ NoticeDetailsActivity f11563f;

    public /* synthetic */ f(Dialog dialog, NoticeDetailsActivity noticeDetailsActivity) {
        this.f11562e = dialog;
        this.f11563f = noticeDetailsActivity;
    }

    public final void onClick(View view) {
        NoticeDetailsActivity.x1(this.f11562e, this.f11563f, view);
    }
}
