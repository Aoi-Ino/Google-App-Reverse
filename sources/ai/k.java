package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanChangeOfAddress;

public final /* synthetic */ class k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanChangeOfAddress f19175e;

    public /* synthetic */ k(VahanChangeOfAddress vahanChangeOfAddress) {
        this.f19175e = vahanChangeOfAddress;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanChangeOfAddress.b2(this.f19175e, compoundButton, z10);
    }
}
