package w4;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Chip f17880e;

    public /* synthetic */ a(Chip chip) {
        this.f17880e = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        this.f17880e.t(compoundButton, z10);
    }
}
