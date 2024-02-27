package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.LlDocumentUpload;

public final /* synthetic */ class t0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16827e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlDocumentUpload f16828f;

    public /* synthetic */ t0(Dialog dialog, LlDocumentUpload llDocumentUpload) {
        this.f16827e = dialog;
        this.f16828f = llDocumentUpload;
    }

    public final void onClick(View view) {
        LlDocumentUpload.l2(this.f16827e, this.f16828f, view);
    }
}
