package og;

import android.widget.CompoundButton;

public final /* synthetic */ class e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f30029e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f30030f;

    public /* synthetic */ e(f fVar, int i10) {
        this.f30029e = fVar;
        this.f30030f = i10;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        f.C(this.f30029e, this.f30030f, compoundButton, z10);
    }
}
