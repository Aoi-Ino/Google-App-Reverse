package tb;

import android.widget.RadioGroup;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;

public final /* synthetic */ class p implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChangeAddressLL f16809a;

    public /* synthetic */ p(ChangeAddressLL changeAddressLL) {
        this.f16809a = changeAddressLL;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        ChangeAddressLL.B2(this.f16809a, radioGroup, i10);
    }
}
