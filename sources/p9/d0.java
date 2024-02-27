package p9;

import android.widget.CompoundButton;
import com.nic.mparivahan.ClServices.View.ChangeOfAddressCl;

public final /* synthetic */ class d0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ChangeOfAddressCl f14775e;

    public /* synthetic */ d0(ChangeOfAddressCl changeOfAddressCl) {
        this.f14775e = changeOfAddressCl;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ChangeOfAddressCl.K2(this.f14775e, compoundButton, z10);
    }
}
