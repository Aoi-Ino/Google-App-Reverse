package ai;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;

public final /* synthetic */ class b5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanProcessWithAdhar f19107e;

    public /* synthetic */ b5(VahanProcessWithAdhar vahanProcessWithAdhar) {
        this.f19107e = vahanProcessWithAdhar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanProcessWithAdhar.c2(this.f19107e, compoundButton, z10);
    }
}
