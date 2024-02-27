package nk;

import android.widget.CompoundButton;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class u implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MobUpdateAdhar f29894e;

    public /* synthetic */ u(MobUpdateAdhar mobUpdateAdhar) {
        this.f29894e = mobUpdateAdhar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        MobUpdateAdhar.v2(this.f29894e, compoundButton, z10);
    }
}
