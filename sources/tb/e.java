package tb;

import android.widget.RadioGroup;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;

public final /* synthetic */ class e implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChangeAddressLL f16740a;

    public /* synthetic */ e(ChangeAddressLL changeAddressLL) {
        this.f16740a = changeAddressLL;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        ChangeAddressLL.t2(this.f16740a, radioGroup, i10);
    }
}
