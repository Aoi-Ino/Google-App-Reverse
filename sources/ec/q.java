package ec;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LLNoCheckActivity f11159e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f11160f;

    public /* synthetic */ q(LLNoCheckActivity lLNoCheckActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f11159e = lLNoCheckActivity;
        this.f11160f = onDateSetListener;
    }

    public final void onClick(View view) {
        LLNoCheckActivity.s1(this.f11159e, this.f11160f, view);
    }
}
