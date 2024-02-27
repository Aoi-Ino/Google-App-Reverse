package ec;

import android.widget.RadioGroup;
import com.nic.mparivahan.NewDlScreen.Activity.NewCovActivity;

public final /* synthetic */ class u implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NewCovActivity f11164a;

    public /* synthetic */ u(NewCovActivity newCovActivity) {
        this.f11164a = newCovActivity;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        NewCovActivity.v1(this.f11164a, radioGroup, i10);
    }
}
