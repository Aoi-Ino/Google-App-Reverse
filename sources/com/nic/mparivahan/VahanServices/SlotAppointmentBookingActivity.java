package com.nic.mparivahan.VahanServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.m;
import com.kizitonwose.calendarview.CalendarView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SaveSlotBookingModel;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentByDateResponse;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentRequest;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotCounterResponseDetails;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotPaymaentStatusResponse;
import com.nic.mparivahan.VahanServices.a;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import j$.time.LocalDate;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ka.c;
import ni.xd;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;
import wd.m0;
import wd.n0;
import wd.o0;
import wd.p0;
import wd.q0;
import wd.r0;
import wd.s0;
import wd.t0;

public final class SlotAppointmentBookingActivity extends androidx.appcompat.app.d implements a.C0271a {
    public xd G;
    /* access modifiers changed from: private */
    public LocalDate H;
    /* access modifiers changed from: private */
    public LocalDate I;
    private LocalDate J = LocalDate.now();
    public a K;
    public RecyclerView.p L;
    private List M = new ArrayList();
    public bi.h N;
    public VahanProService O;
    private String P = "";
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private int V;
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z;

    /* renamed from: a0  reason: collision with root package name */
    public ProgressDialog f20736a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f20737b0;

    /* renamed from: c0  reason: collision with root package name */
    public NrvDetails f20738c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f20739d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f20740e0;

    /* renamed from: f0  reason: collision with root package name */
    private ArrayList f20741f0 = new ArrayList();

    /* renamed from: g0  reason: collision with root package name */
    private ArrayList f20742g0 = new ArrayList();

    /* renamed from: h0  reason: collision with root package name */
    private ArrayList f20743h0 = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    private ArrayList f20744i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public ld.c f20745j0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20746e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20746e = slotAppointmentBookingActivity;
        }

        public final void b(String str) {
            if (this.f20746e.A1().isShowing()) {
                this.f20746e.A1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20747e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20747e = slotAppointmentBookingActivity;
        }

        public final void b(SlotAppointmentByDateResponse slotAppointmentByDateResponse) {
            a aVar;
            if (this.f20747e.A1().isShowing()) {
                this.f20747e.A1().dismiss();
            }
            this.f20747e.g2(slotAppointmentByDateResponse);
            if (this.f20747e.H1() != null) {
                this.f20747e.w1().f29422j.setVisibility(0);
                this.f20747e.w1().f29420h.setVisibility(8);
                SlotAppointmentBookingActivity slotAppointmentBookingActivity = this.f20747e;
                List H1 = slotAppointmentBookingActivity.H1();
                if (H1 != null) {
                    SlotAppointmentBookingActivity slotAppointmentBookingActivity2 = this.f20747e;
                    aVar = new a(H1, slotAppointmentBookingActivity2, slotAppointmentBookingActivity2.y1());
                } else {
                    aVar = null;
                }
                cm.l.c(aVar);
                slotAppointmentBookingActivity.f2(aVar);
                this.f20747e.w1().f29422j.setAdapter(this.f20747e.F1());
                this.f20747e.w1().f29422j.setLayoutManager(this.f20747e.I1());
                this.f20747e.F1().j();
                List H12 = this.f20747e.H1();
                cm.l.c(H12);
                if (H12.isEmpty()) {
                    this.f20747e.w1().f29415c.setVisibility(8);
                } else {
                    this.f20747e.w1().f29415c.setVisibility(0);
                }
                LocalDate n12 = this.f20747e.H;
                if (n12 != null) {
                    CalendarView calendarView = this.f20747e.w1().f29414b;
                    cm.l.e(calendarView, "calendarView");
                    CalendarView.F1(calendarView, n12, (i8.d) null, 2, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotAppointmentByDateResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20748e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20748e = slotAppointmentBookingActivity;
        }

        public final void b(SlotCounterResponseDetails slotCounterResponseDetails) {
            if (this.f20748e.A1().isShowing()) {
                this.f20748e.A1().dismiss();
            }
            this.f20748e.Y1(slotCounterResponseDetails.getValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotCounterResponseDetails) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20749e = slotAppointmentBookingActivity;
        }

        public final void b(String str) {
            if (this.f20749e.A1().isShowing()) {
                this.f20749e.A1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20750e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20750e = slotAppointmentBookingActivity;
        }

        public final void b(String str) {
            if (this.f20750e.A1().isShowing()) {
                this.f20750e.A1().dismiss();
            }
            if (!p.o(str, "Network Issue", true)) {
                this.f20750e.w1().f29422j.setVisibility(8);
                this.f20750e.w1().f29420h.setVisibility(0);
                this.f20750e.w1().f29420h.setText(str);
            }
            SlotAppointmentBookingActivity slotAppointmentBookingActivity = this.f20750e;
            slotAppointmentBookingActivity.I = slotAppointmentBookingActivity.H;
            this.f20750e.H = null;
            LocalDate o12 = this.f20750e.I;
            if (o12 != null) {
                CalendarView calendarView = this.f20750e.w1().f29414b;
                cm.l.e(calendarView, "calendarView");
                CalendarView.F1(calendarView, o12, (i8.d) null, 2, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20751e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20751e = slotAppointmentBookingActivity;
        }

        public final void b(SaveSlotBookingModel saveSlotBookingModel) {
            if (this.f20751e.A1().isShowing()) {
                this.f20751e.A1().dismiss();
            }
            c.a aVar = ka.c.f13158a;
            if (!aVar.m(saveSlotBookingModel.getValue())) {
                Intent intent = new Intent(this.f20751e, SlotSuccessfulBookedActivity.class);
                intent.putExtra("appNo", this.f20751e.v1());
                intent.putExtra("apptId", saveSlotBookingModel.getValue());
                intent.putExtra("stateCd", this.f20751e.J1());
                intent.putExtra("offCd", this.f20751e.z1());
                this.f20751e.startActivity(intent);
                this.f20751e.finish();
            } else if (aVar.m(saveSlotBookingModel.getValue())) {
                this.f20751e.m2("Unable to book the appointment, Please try after some time  ");
            } else {
                this.f20751e.m2(saveSlotBookingModel.getValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SaveSlotBookingModel) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20752e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20752e = slotAppointmentBookingActivity;
        }

        public final void b(String str) {
            if (this.f20752e.A1().isShowing()) {
                this.f20752e.A1().dismiss();
            }
            if (p.o(str, "Error", true)) {
                SlotAppointmentBookingActivity slotAppointmentBookingActivity = this.f20752e;
                Toast.makeText(slotAppointmentBookingActivity, slotAppointmentBookingActivity.getString(R.string.no_internet), 0).show();
                return;
            }
            this.f20752e.m2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SlotAppointmentBookingActivity f20753e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SlotAppointmentBookingActivity slotAppointmentBookingActivity) {
            super(1);
            this.f20753e = slotAppointmentBookingActivity;
        }

        public final void b(SlotPaymaentStatusResponse slotPaymaentStatusResponse) {
            if (this.f20753e.A1().isShowing()) {
                this.f20753e.A1().dismiss();
            }
            this.f20753e.b2(slotPaymaentStatusResponse.getValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotPaymaentStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20754a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f20754a = lVar;
        }

        public final pl.c a() {
            return this.f20754a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20754a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void B1() {
        try {
            if (A1().isShowing()) {
                A1().dismiss();
            }
            A1().dismiss();
            K1().k(this, this.P, this.S);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void L1() {
        i2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(E1()))).a(bi.h.class));
        x1();
        B1();
        Calendar instance = Calendar.getInstance();
        instance.add(5, 0);
        Date time = instance.getTime();
        Calendar.getInstance().add(5, 0);
        String format = new SimpleDateFormat("dd-MM-yyyy").format(time);
        w1().f29426n.setText(format);
        w1().f29425m.f28305f.setOnClickListener(new n0(this));
        w1().f29425m.f28306g.setOnClickListener(new o0(this));
        h2(new LinearLayoutManager(this, 1, false));
        K1().L0().g(this, new i(new b(this)));
        cm.l.c(format);
        G1(format);
        K1().Q0().g(this, new i(new c(this)));
        K1().R0().g(this, new i(new d(this)));
        K1().M0().g(this, new i(new e(this)));
        K1().P0().g(this, new i(new f(this)));
        K1().O0().g(this, new i(new g(this)));
        K1().A().g(this, new i(new h(this)));
        K1().M().g(this, new i(new a(this)));
    }

    /* access modifiers changed from: private */
    public static final void M1(SlotAppointmentBookingActivity slotAppointmentBookingActivity, View view) {
        cm.l.f(slotAppointmentBookingActivity, "this$0");
        VUtility.Companion.v(slotAppointmentBookingActivity, slotAppointmentBookingActivity.y1().b("are_you_sure_you_want_to_leave", slotAppointmentBookingActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void N1(SlotAppointmentBookingActivity slotAppointmentBookingActivity, View view) {
        cm.l.f(slotAppointmentBookingActivity, "this$0");
        slotAppointmentBookingActivity.Q1();
    }

    private final void O1(String str) {
        if (this.f20741f0.size() > 0) {
            int size = this.f20741f0.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (cm.l.a(str, this.f20741f0.get(i10))) {
                    w1().f29426n.setText(str);
                    G1(str);
                    return;
                }
            }
        }
        Toast.makeText(this, y1().b("slot_booking_not_available", "Booking not available on this date"), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void P1(SlotAppointmentBookingActivity slotAppointmentBookingActivity, View view) {
        cm.l.f(slotAppointmentBookingActivity, "this$0");
        Intent intent = new Intent(slotAppointmentBookingActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", slotAppointmentBookingActivity.C1());
        intent.putExtra("RcDetails", slotAppointmentBookingActivity.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, false);
        intent.putExtra(VContant.NEXGEN_addahar_name, slotAppointmentBookingActivity.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, slotAppointmentBookingActivity.t1());
        slotAppointmentBookingActivity.startActivity(intent);
    }

    private final void Q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void S1(int i10) {
        try {
            List list = this.M;
            cm.l.c(list);
            if (list.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state_cd", (Object) this.Q);
                jSONObject.put("off_cd", (Object) this.R);
                jSONObject.put("appt_id", (Object) "");
                List list2 = this.M;
                cm.l.c(list2);
                jSONObject.put("day_of_week", (Object) ((SlotAppointmentModel) list2.get(i10)).getDay_ofWeek());
                List list3 = this.M;
                cm.l.c(list3);
                jSONObject.put("slot_id", (Object) String.valueOf(((SlotAppointmentModel) list3.get(i10)).getSlot_id()));
                List list4 = this.M;
                cm.l.c(list4);
                jSONObject.put("service_id", (Object) ((SlotAppointmentModel) list4.get(i10)).getSlot__service_Id());
                jSONObject.put("counter_id", (Object) this.Z);
                jSONObject.put("appl_no", (Object) this.P);
                jSONObject.put("regn_no", (Object) this.T);
                List list5 = this.M;
                cm.l.c(list5);
                jSONObject.put("appointment_dt", (Object) ((SlotAppointmentModel) list5.get(i10)).getSelectApptDate());
                List list6 = this.M;
                cm.l.c(list6);
                jSONObject.put("op_date", (Object) ((SlotAppointmentModel) list6.get(i10)).getSelectApptDate());
                jSONObject.put("count_reschedule", (Object) "1");
                jSONObject.put("book_status", (Object) "N");
                jSONObject.put("service_descr", (Object) "");
                jSONObject.put("fit_officer", (Object) "");
                jSONObject.put("mobile_no", (Object) "0");
                jSONObject.put("paymemt_status", (Object) this.U);
                jSONObject.put("op_dateas_date", (Object) "");
                jSONObject.put("op_date_release", (Object) "");
                jSONObject.put("new_appl_no", (Object) "");
                jSONObject.put("new_appointment_dt", (Object) "");
                jSONObject.put("vh_class", (Object) String.valueOf(this.V));
                jSONObject.put("vch_catg", (Object) this.W);
                jSONObject.put("owner_name", (Object) this.X);
                jSONObject.put("vh_class_desc", (Object) this.Y);
                jSONObject.put("old_appointment_dt", (Object) "");
                jSONObject.put("shift_day_of_week", (Object) "");
                jSONObject.put("shift_slot_id", (Object) "");
                JSONArray jSONArray = new JSONArray();
                jSONArray.put((Object) jSONObject);
                if (A1().isShowing()) {
                    A1().dismiss();
                }
                A1().show();
                K1().k1(this, jSONArray);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void W1() {
        ViewParent parent = w1().f29416d.getParent();
        cm.l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(w1().f29416d);
        w1().f29418f.removeAllViews();
        w1().f29418f.setOrientation(1);
        gi.c cVar = new gi.c(this, this.f20744i0);
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        w1().f29418f.addView(cVar);
        ExpandableHeightGridView calendarGridView = cVar.getCalendarGridView();
        if (calendarGridView != null) {
            calendarGridView.setOnItemClickListener(new p0(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void X1(SlotAppointmentBookingActivity slotAppointmentBookingActivity, AdapterView adapterView, View view, int i10, long j10) {
        cm.l.f(slotAppointmentBookingActivity, "this$0");
        if (adapterView != null) {
            int i11 = (int) j10;
            if (adapterView.getAdapter().getView(i11, view, adapterView).getAlpha() != 0.4f) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(new Date());
                Calendar instance2 = Calendar.getInstance();
                Object item = adapterView.getAdapter().getItem(i11);
                cm.l.d(item, "null cannot be cast to non-null type java.util.Date");
                instance2.setTime((Date) item);
                boolean z10 = instance.get(6) == instance2.get(6);
                if (instance.after(instance2) && !z10) {
                    Toast.makeText(slotAppointmentBookingActivity, slotAppointmentBookingActivity.y1().b("select_previous_slot_date", "You can't select the previous date."), 0).show();
                }
                try {
                    String format = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(instance2.getTimeInMillis()));
                    cm.l.c(format);
                    slotAppointmentBookingActivity.O1(format);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private final void j2(int i10) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.new_slot_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView.setText(y1().b("button_cancel", "Cancel"));
        textView2.setText(y1().b("button_proceed", "Proceed"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView2.setBackground(androidx.core.content.a.e(this, R.drawable.green_shape_appoin));
        textView2.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(y1().b("proceed_slot_booking", "Are you sure of proceeding future to book slot?"));
        textView.setOnClickListener(new s0(dialog));
        textView2.setOnClickListener(new t0(dialog, this, i10));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void k2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void l2(Dialog dialog, SlotAppointmentBookingActivity slotAppointmentBookingActivity, int i10, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(slotAppointmentBookingActivity, "this$0");
        dialog.dismiss();
        slotAppointmentBookingActivity.S1(i10);
    }

    /* access modifiers changed from: private */
    public final void m2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(y1().b("btn_ok", "Ok"));
        ((TextView) findViewById4).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new q0(dialog));
        textView2.setOnClickListener(new r0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void n2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void o2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void x1() {
        if (A1().isShowing()) {
            A1().dismiss();
        }
        A1().show();
        K1().C(this, this.Q, this.R, this.S);
    }

    public final ProgressDialog A1() {
        ProgressDialog progressDialog = this.f20736a0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String C1() {
        String str = this.f20737b0;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails D1() {
        NrvDetails nrvDetails = this.f20738c0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService E1() {
        VahanProService vahanProService = this.O;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final a F1() {
        a aVar = this.K;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("slotAdapter");
        return null;
    }

    public final void G1(String str) {
        cm.l.f(str, "selectedDate");
        A1().show();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.S);
        K1().N0(this, new SlotAppointmentRequest(this.T, this.P, this.Q, this.R, str, arrayList));
    }

    public final List H1() {
        return this.M;
    }

    public final RecyclerView.p I1() {
        RecyclerView.p pVar = this.L;
        if (pVar != null) {
            return pVar;
        }
        cm.l.v("slotManager");
        return null;
    }

    public final String J1() {
        return this.Q;
    }

    public final bi.h K1() {
        bi.h hVar = this.N;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void R1() {
        wd.a aVar;
        wd.a aVar2;
        wd.a aVar3;
        try {
            this.f20744i0.clear();
            if (this.f20741f0.size() > 0) {
                int size = this.f20741f0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = this.f20741f0.get(i10);
                    cm.l.e(obj, "get(...)");
                    Date s12 = s1((String) obj, "dd-MM-yyyy", "yyyy/MM/dd");
                    if (s12 != null) {
                        Drawable drawable = getResources().getDrawable(R.drawable.dl_slots_green);
                        cm.l.e(drawable, "getDrawable(...)");
                        aVar3 = new wd.a(s12, drawable);
                    } else {
                        aVar3 = null;
                    }
                    if (aVar3 != null) {
                        this.f20744i0.add(aVar3);
                    }
                }
            }
            if (this.f20742g0.size() > 0) {
                int size2 = this.f20742g0.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj2 = this.f20742g0.get(i11);
                    cm.l.e(obj2, "get(...)");
                    Date s13 = s1((String) obj2, "dd-MM-yyyy", "yyyy/MM/dd");
                    if (s13 != null) {
                        Drawable drawable2 = getResources().getDrawable(R.drawable.dl_slots_red);
                        cm.l.e(drawable2, "getDrawable(...)");
                        aVar2 = new wd.a(s13, drawable2);
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        this.f20744i0.add(aVar2);
                    }
                }
            }
            if (this.f20743h0.size() > 0) {
                int size3 = this.f20743h0.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj3 = this.f20743h0.get(i12);
                    cm.l.e(obj3, "get(...)");
                    Date s14 = s1((String) obj3, "dd-MM-yyyy", "yyyy/MM/dd");
                    if (s14 != null) {
                        Drawable drawable3 = getResources().getDrawable(R.drawable.dl_slots_blue);
                        cm.l.e(drawable3, "getDrawable(...)");
                        aVar = new wd.a(s14, drawable3);
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        this.f20744i0.add(aVar);
                    }
                }
            }
            W1();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20740e0 = str;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20739d0 = str;
    }

    public final void V1(xd xdVar) {
        cm.l.f(xdVar, "<set-?>");
        this.G = xdVar;
    }

    public final void Y1(String str) {
        this.Z = str;
    }

    public final void Z1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f20745j0 = cVar;
    }

    public final void a2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f20736a0 = progressDialog;
    }

    public final void b2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20737b0 = str;
    }

    public final void d2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f20738c0 = nrvDetails;
    }

    public final void e2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.O = vahanProService;
    }

    public final void f2(a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.K = aVar;
    }

    public final void g2(List list) {
        this.M = list;
    }

    public final void h2(RecyclerView.p pVar) {
        cm.l.f(pVar, "<set-?>");
        this.L = pVar;
    }

    public final void i2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.N = hVar;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, y1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_slot_booking);
        xd c10 = xd.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        V1(c10);
        setContentView((View) w1().b());
        v9.e.f17509a.R1(this, w1());
        Z1(new ld.c(this));
        e2(VahanProService.f21196b.b(this));
        a2(new ProgressDialog(this));
        A1().setMessage(y1().b("label_challan_please_wait", "Please wait..."));
        A1().setCancelable(false);
        A1().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            if (getIntent().hasExtra("appl_no")) {
                String stringExtra = getIntent().getStringExtra("appl_no");
                cm.l.c(stringExtra);
                this.P = stringExtra;
            }
            if (getIntent().hasExtra("stateCd")) {
                String stringExtra2 = getIntent().getStringExtra("stateCd");
                cm.l.c(stringExtra2);
                this.Q = stringExtra2;
            }
            if (getIntent().hasExtra("offCd")) {
                String stringExtra3 = getIntent().getStringExtra("offCd");
                cm.l.c(stringExtra3);
                this.R = stringExtra3;
            }
            if (getIntent().hasExtra("purCd")) {
                String stringExtra4 = getIntent().getStringExtra("purCd");
                cm.l.c(stringExtra4);
                this.S = stringExtra4;
            }
            if (getIntent().hasExtra("rcNo")) {
                String stringExtra5 = getIntent().getStringExtra("rcNo");
                cm.l.c(stringExtra5);
                this.T = stringExtra5;
            }
            if (getIntent().hasExtra("vehicleClass")) {
                this.V = getIntent().getIntExtra("vehicleClass", 0);
            }
            if (getIntent().hasExtra("vehicleCat")) {
                String stringExtra6 = getIntent().getStringExtra("vehicleCat");
                cm.l.c(stringExtra6);
                this.W = stringExtra6;
            }
            if (getIntent().hasExtra("ownerName")) {
                String stringExtra7 = getIntent().getStringExtra("ownerName");
                cm.l.c(stringExtra7);
                this.X = stringExtra7;
            }
            if (getIntent().hasExtra("vehicleClassDes")) {
                String stringExtra8 = getIntent().getStringExtra("vehicleClassDes");
                cm.l.c(stringExtra8);
                this.Y = stringExtra8;
            }
            if (getIntent().hasExtra("availableDates")) {
                ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("availableDates");
                cm.l.c(stringArrayListExtra);
                this.f20741f0 = stringArrayListExtra;
            }
            if (getIntent().hasExtra("alreadyBookedDates")) {
                ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("alreadyBookedDates");
                cm.l.c(stringArrayListExtra2);
                this.f20742g0 = stringArrayListExtra2;
            }
            if (getIntent().hasExtra("holidayDeclareDates")) {
                ArrayList<String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("holidayDeclareDates");
                cm.l.c(stringArrayListExtra3);
                this.f20743h0 = stringArrayListExtra3;
            }
            U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
            T1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
            c2(String.valueOf(getIntent().getStringExtra("RC")));
            if (getIntent().hasExtra("RcDetails")) {
                Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
                d2((NrvDetails) serializableExtra);
            }
            w1().f29428p.setText(y1().b("view_vehicle_details", "View Vehicle Details"));
            TextView textView = w1().f29427o;
            textView.setText(y1().b("vehicle_number", "Vehicle No. ") + ':' + C1());
            w1().f29421i.setText(VContant.Companion.I(this, this.S));
            w1().f29428p.setPaintFlags(w1().f29428p.getPaintFlags() | 8);
            w1().f29428p.setOnClickListener(new m0(this));
            R1();
        }
        L1();
    }

    public final Date s1(String str, String str2, String str3) {
        cm.l.f(str, "dateToFormat");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date parse = new SimpleDateFormat(str2).parse(str);
            String format = parse != null ? new SimpleDateFormat(str3).format(parse) : null;
            if (format != null) {
                return simpleDateFormat.parse(format);
            }
            return null;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String t1() {
        String str = this.f20740e0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String u1() {
        String str = this.f20739d0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final String v1() {
        return this.P;
    }

    public final xd w1() {
        xd xdVar = this.G;
        if (xdVar != null) {
            return xdVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final ld.c y1() {
        ld.c cVar = this.f20745j0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public void z(int i10, boolean z10) {
        j2(i10);
    }

    public final String z1() {
        return this.R;
    }
}
