package tb;

import android.widget.CompoundButton;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;

public final /* synthetic */ class j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ChangeAddressLL f16766e;

    public /* synthetic */ j(ChangeAddressLL changeAddressLL) {
        this.f16766e = changeAddressLL;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ChangeAddressLL.u2(this.f16766e, compoundButton, z10);
    }
}
