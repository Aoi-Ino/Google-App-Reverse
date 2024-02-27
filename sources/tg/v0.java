package tg;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationTerminationActivityMultiService;

public final /* synthetic */ class v0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31409e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ HypothecationTerminationActivityMultiService f31410f;

    public /* synthetic */ v0(Dialog dialog, HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService) {
        this.f31409e = dialog;
        this.f31410f = hypothecationTerminationActivityMultiService;
    }

    public final void onClick(View view) {
        HypothecationTerminationActivityMultiService.g2(this.f31409e, this.f31410f, view);
    }
}
