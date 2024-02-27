package ec;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity;
import java.util.ArrayList;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11155e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LLNoCheckActivity f11156f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f11157g;

    public /* synthetic */ o(Dialog dialog, LLNoCheckActivity lLNoCheckActivity, ArrayList arrayList) {
        this.f11155e = dialog;
        this.f11156f = lLNoCheckActivity;
        this.f11157g = arrayList;
    }

    public final void onClick(View view) {
        LLNoCheckActivity.A1(this.f11155e, this.f11156f, this.f11157g, view);
    }
}
