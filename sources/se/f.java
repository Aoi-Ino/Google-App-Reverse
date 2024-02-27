package se;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import cm.u;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;

public final /* synthetic */ class f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f31214e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f31215f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RadioButton f31216g;

    public /* synthetic */ f(u uVar, RadioButton radioButton, RadioButton radioButton2) {
        this.f31214e = uVar;
        this.f31215f = radioButton;
        this.f31216g = radioButton2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        PassangerResultActivity.p1(this.f31214e, this.f31215f, this.f31216g, compoundButton, z10);
    }
}
