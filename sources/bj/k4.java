package bj;

import android.widget.RadioGroup;
import com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen;

public final /* synthetic */ class k4 implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsScreen f19834a;

    public /* synthetic */ k4(PersonalDetailsScreen personalDetailsScreen) {
        this.f19834a = personalDetailsScreen;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        PersonalDetailsScreen.N1(this.f19834a, radioGroup, i10);
    }
}
