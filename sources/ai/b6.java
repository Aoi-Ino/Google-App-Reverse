package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class b6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19108e;

    public /* synthetic */ b6(VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19108e = vahanSelectServiceScreen;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanSelectServiceScreen.f2(this.f19108e, compoundButton, z10);
    }
}
