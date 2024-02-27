package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload;

public final /* synthetic */ class z1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19309e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanDmsReupload f19310f;

    public /* synthetic */ z1(Dialog dialog, VahanDmsReupload vahanDmsReupload) {
        this.f19309e = dialog;
        this.f19310f = vahanDmsReupload;
    }

    public final void onClick(View view) {
        VahanDmsReupload.K2(this.f19309e, this.f19310f, view);
    }
}
