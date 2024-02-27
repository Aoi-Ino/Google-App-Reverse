package tg;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.ChangeOfAddressMultiService;

public final /* synthetic */ class f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ChangeOfAddressMultiService f31355e;

    public /* synthetic */ f(ChangeOfAddressMultiService changeOfAddressMultiService) {
        this.f31355e = changeOfAddressMultiService;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ChangeOfAddressMultiService.e2(this.f31355e, compoundButton, z10);
    }
}
