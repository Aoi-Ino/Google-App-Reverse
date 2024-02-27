package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.LlPhotoSignature;

public final /* synthetic */ class d2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16738e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlPhotoSignature f16739f;

    public /* synthetic */ d2(Dialog dialog, LlPhotoSignature llPhotoSignature) {
        this.f16738e = dialog;
        this.f16739f = llPhotoSignature;
    }

    public final void onClick(View view) {
        LlPhotoSignature.E2(this.f16738e, this.f16739f, view);
    }
}
