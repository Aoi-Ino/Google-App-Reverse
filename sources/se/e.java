package se;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import cm.u;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;

public final /* synthetic */ class e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f31211e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f31212f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RadioButton f31213g;

    public /* synthetic */ e(u uVar, RadioButton radioButton, RadioButton radioButton2) {
        this.f31211e = uVar;
        this.f31212f = radioButton;
        this.f31213g = radioButton2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        PassangerResultActivity.o1(this.f31211e, this.f31212f, this.f31213g, compoundButton, z10);
    }
}
