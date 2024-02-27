package f9;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import androidx.fragment.app.q;
import androidx.fragment.app.x;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetOffenceList;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.MparOffence;
import com.nic.mparivahan.Citizen.Models.Name;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.R;
import e9.c;
import j4.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import km.f;
import ld.g;
import ni.za;

public final class p0 extends i implements e {

    /* renamed from: h0  reason: collision with root package name */
    private za f11505h0;

    /* renamed from: i0  reason: collision with root package name */
    private final int f11506i0 = 200;

    /* renamed from: j0  reason: collision with root package name */
    private final int f11507j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public k9.b f11508k0;

    /* renamed from: l0  reason: collision with root package name */
    public OffenceInterface f11509l0;

    /* renamed from: m0  reason: collision with root package name */
    public g f11510m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f11511n0;

    /* renamed from: o0  reason: collision with root package name */
    private Calendar f11512o0 = Calendar.getInstance();

    /* renamed from: p0  reason: collision with root package name */
    public Context f11513p0;

    /* renamed from: q0  reason: collision with root package name */
    private final int f11514q0 = 23;

    /* renamed from: r0  reason: collision with root package name */
    public ProgressDialog f11515r0;

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f11516s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f11517t0;

    /* renamed from: u0  reason: collision with root package name */
    private int f11518u0;

    /* renamed from: v0  reason: collision with root package name */
    public ArrayList f11519v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f11520w0;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p0 f11521e;

        a(p0 p0Var) {
            this.f11521e = p0Var;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f11521e.Q2(i10);
            p0 p0Var = this.f11521e;
            p0Var.R2(((MparOffence) p0Var.q2().get(i10)).getOffenceId());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p0 f11522e;

        b(p0 p0Var) {
            this.f11522e = p0Var;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            p0 p0Var = this.f11522e;
            p0Var.W2(i10 == 0 ? "Select State" : ((Name) p0Var.s2().get(i10)).getStateCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(p0 p0Var, View view) {
        q F0;
        x n10;
        x o10;
        l.f(p0Var, "this$0");
        m mVar = new m();
        j q10 = p0Var.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, mVar)) != null) {
            o10.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void B2(p0 p0Var, View view) {
        q F0;
        x n10;
        x o10;
        l.f(p0Var, "this$0");
        m mVar = new m();
        j q10 = p0Var.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, mVar)) != null) {
            o10.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void C2(p0 p0Var, View view) {
        l.f(p0Var, "this$0");
        Calendar instance = Calendar.getInstance();
        int i10 = instance.get(1);
        int i11 = instance.get(2);
        instance.add(6, 1);
        DatePickerDialog datePickerDialog = new DatePickerDialog(p0Var.m2(), new d0(p0Var), instance.get(5), i11, i10);
        datePickerDialog.getDatePicker().setMinDate(instance.getTimeInMillis());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public static final void D2(p0 p0Var, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(p0Var, "this$0");
        TextView textView = p0Var.l2().f29748h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('-');
        sb2.append(i11 + 1);
        sb2.append('-');
        sb2.append(i10);
        textView.setText(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final void E2(p0 p0Var, View view) {
        String string;
        l.f(p0Var, "this$0");
        if (p0Var.f11517t0 == 0) {
            string = "Please select violation type";
        } else {
            Editable text = p0Var.l2().f29751k.getText();
            l.e(text, "getText(...)");
            if (text.length() != 0 && p0Var.l2().f29751k.getText().length() >= 4) {
                if (new f("[a-zA-Z0-9]*").a(p0Var.l2().f29751k.getText().toString())) {
                    Editable text2 = p0Var.l2().f29749i.getText();
                    l.e(text2, "getText(...)");
                    if (text2.length() == 0) {
                        p0Var.l2().f29749i.requestFocus();
                        string = "Please enter location";
                    } else if (l.a(p0Var.t2(), p0Var.D1().getResources().getString(R.string.select_state))) {
                        string = "Please select state";
                    } else {
                        Editable text3 = p0Var.l2().f29747g.getText();
                        l.e(text3, "getText(...)");
                        if (text3.length() == 0) {
                            string = "Please enter comments";
                        } else {
                            p0Var.T2(new ProgressDialog(p0Var.D1()));
                            p0Var.r2().setMessage("Please wait...");
                            p0Var.r2().setCancelable(false);
                            p0Var.r2().setCanceledOnTouchOutside(false);
                            Object systemService = p0Var.D1().getSystemService("location");
                            l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                                new j9.a(p0Var.D1());
                                if (p0Var.p2() == null || l.a(p0Var.p2(), p0Var.D1().getResources().getString(R.string.location_not_find))) {
                                    string = p0Var.D1().getResources().getString(R.string.location_not_find);
                                } else {
                                    return;
                                }
                            } else {
                                p0Var.L2("Your location is off\nPlease turn on your location");
                                return;
                            }
                        }
                    }
                }
            }
            p0Var.l2().f29751k.requestFocus();
            string = p0Var.D1().getResources().getString(R.string.rc_text);
        }
        p0Var.J2(string);
    }

    /* access modifiers changed from: private */
    public static final void F2(p0 p0Var, SubmitOffenceReport submitOffenceReport) {
        l.f(p0Var, "this$0");
        p0Var.r2().dismiss();
        p0Var.J2(l.a(submitOffenceReport.getStatusCode(), "TRV001") ? "Offence submitted successfully" : submitOffenceReport.getStatusDesc());
    }

    /* access modifiers changed from: private */
    public static final void G2(p0 p0Var, String str) {
        l.f(p0Var, "this$0");
        p0Var.r2().dismiss();
        p0Var.J2("Something went wrong\nPlease try after some time!");
    }

    /* access modifiers changed from: private */
    public static final void H2(p0 p0Var, GetStated getStated) {
        l.f(p0Var, "this$0");
        try {
            if (p.o(getStated.getStatusCode(), "MSTR001", true)) {
                p0Var.r2().dismiss();
                ArrayList<Name> states = getStated.getStates();
                l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Citizen.Models.Name>");
                p0Var.V2(states);
                ArrayList s22 = p0Var.s2();
                String string = p0Var.D1().getResources().getString(R.string.select_state);
                l.e(string, "getString(...)");
                s22.add(0, new Name(string, "0", false));
                p0Var.l2().f29757q.setAdapter((SpinnerAdapter) new c(p0Var.D1(), p0Var.s2()));
                return;
            }
            p0Var.r2().dismiss();
        } catch (Exception e10) {
            p0Var.r2().dismiss();
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void I2(p0 p0Var, String str) {
        l.f(p0Var, "this$0");
        p0Var.r2().dismiss();
    }

    private final void J2(String str) {
        Dialog dialog = new Dialog(D1());
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new e0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void K2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void L2(String str) {
        Dialog dialog = new Dialog(D1());
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new f0(this, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M2(p0 p0Var, Dialog dialog, View view) {
        l.f(p0Var, "this$0");
        l.f(dialog, "$d");
        p0Var.R1(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        dialog.dismiss();
    }

    private final za l2() {
        za zaVar = this.f11505h0;
        l.c(zaVar);
        return zaVar;
    }

    /* access modifiers changed from: private */
    public static final void v2(Calendar calendar, p0 p0Var, TimePicker timePicker, int i10, int i11) {
        l.f(p0Var, "this$0");
        calendar.set(11, i10);
        calendar.set(12, i11);
        p0Var.l2().f29750j.setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void w2(p0 p0Var, TimePickerDialog.OnTimeSetListener onTimeSetListener, Calendar calendar, View view) {
        l.f(p0Var, "this$0");
        l.f(onTimeSetListener, "$timeSetListener");
        new TimePickerDialog(p0Var.E1(), onTimeSetListener, calendar.get(11), calendar.get(12), true).show();
        p0Var.l2().f29750j.setText(calendar.getTime().toString());
    }

    /* access modifiers changed from: private */
    public static final void x2(p0 p0Var, GetOffenceList getOffenceList) {
        l.f(p0Var, "this$0");
        ArrayList<MparOffence> mparOffenceList = getOffenceList.getMparOffenceList();
        l.d(mparOffenceList, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Citizen.Models.MparOffence>");
        p0Var.S2(mparOffenceList);
        p0Var.q2().add(0, new MparOffence("Select violation", 0, 0, "0"));
        p0Var.l2().f29742b.setAdapter((SpinnerAdapter) new e9.e(p0Var.D1(), p0Var.q2()));
    }

    /* access modifiers changed from: private */
    public static final void y2(p0 p0Var, View view) {
        q F0;
        x n10;
        x o10;
        l.f(p0Var, "this$0");
        u0 u0Var = new u0();
        j q10 = p0Var.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, u0Var)) != null) {
            o10.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(p0 p0Var, View view) {
        q F0;
        x n10;
        x o10;
        x g10;
        l.f(p0Var, "this$0");
        u0 u0Var = new u0();
        j q10 = p0Var.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, u0Var)) != null && (g10 = o10.g((String) null)) != null) {
            g10.h();
        }
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        this.f11505h0 = za.c(layoutInflater, viewGroup, false);
        return l2().b();
    }

    public final void N2(Context context) {
        l.f(context, "<set-?>");
        this.f11513p0 = context;
    }

    public final void O2(OffenceInterface offenceInterface) {
        l.f(offenceInterface, "<set-?>");
        this.f11509l0 = offenceInterface;
    }

    public final void P2(k9.b bVar) {
        l.f(bVar, "<set-?>");
        this.f11508k0 = bVar;
    }

    public final void Q2(int i10) {
        this.f11517t0 = i10;
    }

    public final void R2(int i10) {
        this.f11518u0 = i10;
    }

    public final void S2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f11516s0 = arrayList;
    }

    public final void T2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.f11515r0 = progressDialog;
    }

    public final void U2(g gVar) {
        l.f(gVar, "<set-?>");
        this.f11510m0 = gVar;
    }

    public final void V2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f11519v0 = arrayList;
    }

    public final void W2(String str) {
        l.f(str, "<set-?>");
        this.f11520w0 = str;
    }

    public void X0() {
        super.X0();
        new j9.a(D1());
    }

    public void b1(View view, Bundle bundle) {
        l.f(view, "view");
        super.b1(view, bundle);
        j D1 = D1();
        l.e(D1, "requireActivity(...)");
        N2(D1);
        U2(new g(D1()));
        OffenceInterface.a aVar = OffenceInterface.f7826a;
        j D12 = D1();
        l.e(D12, "requireActivity(...)");
        O2(aVar.b(D12));
        l2().f29756p.a(bundle);
        l2().f29748h.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        l2().f29750j.setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        EditText editText = l2().f29750j;
        l.e(editText, "evTimePicker");
        Context E1 = E1();
        l.e(E1, "requireContext(...)");
        u2(editText, E1);
        P2((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(n2()))).a(k9.b.class));
        T2(new ProgressDialog(D1()));
        r2().setMessage("Please wait...");
        r2().setCancelable(false);
        r2().setCanceledOnTouchOutside(false);
        o2().N().g(i0(), new z(this));
        l2().f29742b.setOnItemSelectedListener(new a(this));
        l2().f29757q.setOnItemSelectedListener(new b(this));
        l2().f29754n.setOnClickListener(new h0(this));
        l2().f29744d.setOnClickListener(new i0(this));
        l2().f29748h.setOnClickListener(new j0(this));
        l2().f29743c.setOnClickListener(new k0(this));
        o2().M().g(i0(), new l0(this));
        o2().q().g(i0(), new m0(this));
        o2().R("1");
        o2().z().g(D1(), new n0(this));
        o2().r().g(D1(), new o0(this));
        l2().f29754n.setOnClickListener(new a0(this));
        l2().f29744d.setOnClickListener(new g0(this));
    }

    public void m(j4.c cVar) {
        l.f(cVar, "googleMap");
    }

    public final Context m2() {
        Context context = this.f11513p0;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final OffenceInterface n2() {
        OffenceInterface offenceInterface = this.f11509l0;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        l.v("mOffenceInterface");
        return null;
    }

    public final k9.b o2() {
        k9.b bVar = this.f11508k0;
        if (bVar != null) {
            return bVar;
        }
        l.v("mOffenceViewModel");
        return null;
    }

    public final String p2() {
        String str = this.f11511n0;
        if (str != null) {
            return str;
        }
        l.v("myLocation");
        return null;
    }

    public final ArrayList q2() {
        ArrayList arrayList = this.f11516s0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("offencesList");
        return null;
    }

    public final ProgressDialog r2() {
        ProgressDialog progressDialog = this.f11515r0;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final ArrayList s2() {
        ArrayList arrayList = this.f11519v0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("stateList");
        return null;
    }

    public final String t2() {
        String str = this.f11520w0;
        if (str != null) {
            return str;
        }
        l.v("stateValue");
        return null;
    }

    public final void u2(TextView textView, Context context) {
        l.f(textView, "textView");
        l.f(context, "context");
        Calendar instance = Calendar.getInstance();
        l2().f29750j.setOnClickListener(new c0(this, new b0(instance, this), instance));
    }

    public void x0(int i10, int i11, Intent intent) {
        super.x0(i10, i11, intent);
        if (i10 == this.f11507j0 && i11 == -1 && intent != null) {
            intent.getData();
        }
    }
}
