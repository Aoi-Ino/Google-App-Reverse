package se;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import cm.u;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;

public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f31208e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f31209f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RadioButton f31210g;

    public /* synthetic */ d(u uVar, RadioButton radioButton, RadioButton radioButton2) {
        this.f31208e = uVar;
        this.f31209f = radioButton;
        this.f31210g = radioButton2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        PassangerResultActivity.n1(this.f31208e, this.f31209f, this.f31210g, compoundButton, z10);
    }
}
