package qb;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.LLMainScreen.LLMain;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LLMain f15305e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f15306f;

    public /* synthetic */ d(LLMain lLMain, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f15305e = lLMain;
        this.f15306f = onDateSetListener;
    }

    public final void onClick(View view) {
        LLMain.y1(this.f15305e, this.f15306f, view);
    }
}
