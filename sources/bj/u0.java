package bj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.LLPhotoSign;

public final /* synthetic */ class u0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19908e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LLPhotoSign f19909f;

    public /* synthetic */ u0(Dialog dialog, LLPhotoSign lLPhotoSign) {
        this.f19908e = dialog;
        this.f19909f = lLPhotoSign;
    }

    public final void onClick(View view) {
        LLPhotoSign.w2(this.f19908e, this.f19909f, view);
    }
}
