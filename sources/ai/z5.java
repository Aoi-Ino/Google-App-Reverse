package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class z5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19315e;

    public /* synthetic */ z5(VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19315e = vahanSelectServiceScreen;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanSelectServiceScreen.d2(this.f19315e, compoundButton, z10);
    }
}
