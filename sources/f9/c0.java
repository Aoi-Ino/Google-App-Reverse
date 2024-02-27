package f9;

import android.app.TimePickerDialog;
import android.view.View;
import java.util.Calendar;

public final /* synthetic */ class c0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p0 f11436e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TimePickerDialog.OnTimeSetListener f11437f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Calendar f11438g;

    public /* synthetic */ c0(p0 p0Var, TimePickerDialog.OnTimeSetListener onTimeSetListener, Calendar calendar) {
        this.f11436e = p0Var;
        this.f11437f = onTimeSetListener;
        this.f11438g = calendar;
    }

    public final void onClick(View view) {
        p0.w2(this.f11436e, this.f11437f, this.f11438g, view);
    }
}
