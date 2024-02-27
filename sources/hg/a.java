package hg;

import android.widget.CompoundButton;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f24088e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f24089f;

    public /* synthetic */ a(b bVar, int i10) {
        this.f24088e = bVar;
        this.f24089f = i10;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        b.C(this.f24088e, this.f24089f, compoundButton, z10);
    }
}
