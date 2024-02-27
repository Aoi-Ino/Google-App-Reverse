package nk;

import android.widget.CompoundButton;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class t implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MobUpdateAdhar f29893e;

    public /* synthetic */ t(MobUpdateAdhar mobUpdateAdhar) {
        this.f29893e = mobUpdateAdhar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        MobUpdateAdhar.u2(this.f29893e, compoundButton, z10);
    }
}
