package qb;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.LLMainScreen.LLMain;

public final /* synthetic */ class c implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LLMain f15303a;

    public /* synthetic */ c(LLMain lLMain) {
        this.f15303a = lLMain;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        LLMain.x1(this.f15303a, datePicker, i10, i11, i12);
    }
}
