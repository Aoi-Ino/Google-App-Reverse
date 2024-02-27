package ak;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19343e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlPhotoAndSignatureActivity f19344f;

    public /* synthetic */ q(Dialog dialog, DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity) {
        this.f19343e = dialog;
        this.f19344f = dlPhotoAndSignatureActivity;
    }

    public final void onClick(View view) {
        DlPhotoAndSignatureActivity.g3(this.f19343e, this.f19344f, view);
    }
}
