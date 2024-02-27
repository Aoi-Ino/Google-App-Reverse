package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;

public final /* synthetic */ class x1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14896e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClPhotoSignature f14897f;

    public /* synthetic */ x1(Dialog dialog, ClPhotoSignature clPhotoSignature) {
        this.f14896e = dialog;
        this.f14897f = clPhotoSignature;
    }

    public final void onClick(View view) {
        ClPhotoSignature.D2(this.f14896e, this.f14897f, view);
    }
}
