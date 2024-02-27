package bj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.LLSlots;

public final /* synthetic */ class f1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LLSlots f19786e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f19787f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f19788g;

    public /* synthetic */ f1(LLSlots lLSlots, int i10, Dialog dialog) {
        this.f19786e = lLSlots;
        this.f19787f = i10;
        this.f19788g = dialog;
    }

    public final void onClick(View view) {
        LLSlots.T1(this.f19786e, this.f19787f, this.f19788g, view);
    }
}
