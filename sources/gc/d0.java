package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlPhotoSign;

public final /* synthetic */ class d0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11776e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlPhotoSign f11777f;

    public /* synthetic */ d0(Dialog dialog, DlPhotoSign dlPhotoSign) {
        this.f11776e = dialog;
        this.f11777f = dlPhotoSign;
    }

    public final void onClick(View view) {
        DlPhotoSign.x2(this.f11776e, this.f11777f, view);
    }
}
