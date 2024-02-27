package ub;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditLearnerAppScreen f17250e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f17251f;

    public /* synthetic */ w(EditLearnerAppScreen editLearnerAppScreen, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f17250e = editLearnerAppScreen;
        this.f17251f = onDateSetListener;
    }

    public final void onClick(View view) {
        EditLearnerAppScreen.q1(this.f17250e, this.f17251f, view);
    }
}
