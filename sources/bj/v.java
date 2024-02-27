package bj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.LLDocUpload;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19915e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LLDocUpload f19916f;

    public /* synthetic */ v(Dialog dialog, LLDocUpload lLDocUpload) {
        this.f19915e = dialog;
        this.f19916f = lLDocUpload;
    }

    public final void onClick(View view) {
        LLDocUpload.d2(this.f19915e, this.f19916f, view);
    }
}
