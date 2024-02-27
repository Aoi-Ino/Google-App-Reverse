package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class d6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19124e;

    public /* synthetic */ d6(VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19124e = vahanSelectServiceScreen;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanSelectServiceScreen.h2(this.f19124e, compoundButton, z10);
    }
}
