package nj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f29823e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlDocActivity f29824f;

    public /* synthetic */ o(Dialog dialog, DlDocActivity dlDocActivity) {
        this.f29823e = dialog;
        this.f29824f = dlDocActivity;
    }

    public final void onClick(View view) {
        DlDocActivity.H2(this.f29823e, this.f29824f, view);
    }
}
