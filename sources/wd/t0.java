package wd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;

public final /* synthetic */ class t0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32547e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SlotAppointmentBookingActivity f32548f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f32549g;

    public /* synthetic */ t0(Dialog dialog, SlotAppointmentBookingActivity slotAppointmentBookingActivity, int i10) {
        this.f32547e = dialog;
        this.f32548f = slotAppointmentBookingActivity;
        this.f32549g = i10;
    }

    public final void onClick(View view) {
        SlotAppointmentBookingActivity.l2(this.f32547e, this.f32548f, this.f32549g, view);
    }
}
