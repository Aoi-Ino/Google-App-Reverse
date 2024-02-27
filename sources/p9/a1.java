package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;

public final /* synthetic */ class a1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14759e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClDocumentsUpload f14760f;

    public /* synthetic */ a1(Dialog dialog, ClDocumentsUpload clDocumentsUpload) {
        this.f14759e = dialog;
        this.f14760f = clDocumentsUpload;
    }

    public final void onClick(View view) {
        ClDocumentsUpload.k2(this.f14759e, this.f14760f, view);
    }
}
