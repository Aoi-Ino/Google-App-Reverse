package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;

public final /* synthetic */ class c5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanProcessWithAdhar f19115e;

    public /* synthetic */ c5(VahanProcessWithAdhar vahanProcessWithAdhar) {
        this.f19115e = vahanProcessWithAdhar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanProcessWithAdhar.d2(this.f19115e, compoundButton, z10);
    }
}
