package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class e5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19132e;

    public /* synthetic */ e5(VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19132e = vahanSelectServiceScreen;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanSelectServiceScreen.i2(this.f19132e, compoundButton, z10);
    }
}
