package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class c6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19116e;

    public /* synthetic */ c6(VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19116e = vahanSelectServiceScreen;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanSelectServiceScreen.g2(this.f19116e, compoundButton, z10);
    }
}
