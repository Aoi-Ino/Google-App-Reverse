package ub;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen;

public final /* synthetic */ class v implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditLearnerAppScreen f17249a;

    public /* synthetic */ v(EditLearnerAppScreen editLearnerAppScreen) {
        this.f17249a = editLearnerAppScreen;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        EditLearnerAppScreen.p1(this.f17249a, datePicker, i10, i11, i12);
    }
}
