package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11793e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlDocUpload f11794f;

    public /* synthetic */ i(Dialog dialog, DlDocUpload dlDocUpload) {
        this.f11793e = dialog;
        this.f11794f = dlDocUpload;
    }

    public final void onClick(View view) {
        DlDocUpload.c2(this.f11793e, this.f11794f, view);
    }
}
