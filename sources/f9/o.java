package f9;

import android.app.TimePickerDialog;
import android.view.View;
import java.util.Calendar;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y f11500e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TimePickerDialog.OnTimeSetListener f11501f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Calendar f11502g;

    public /* synthetic */ o(y yVar, TimePickerDialog.OnTimeSetListener onTimeSetListener, Calendar calendar) {
        this.f11500e = yVar;
        this.f11501f = onTimeSetListener;
        this.f11502g = calendar;
    }

    public final void onClick(View view) {
        y.p2(this.f11500e, this.f11501f, this.f11502g, view);
    }
}
