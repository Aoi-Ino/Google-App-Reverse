package com.nic.mparivahan.Citizen.Activities;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.AccidentReportDetails;
import com.nic.mparivahan.R;
import d9.i;
import d9.j;
import d9.k;
import d9.n;
import d9.o;
import d9.p;
import d9.q;
import java.util.ArrayList;
import java.util.Calendar;
import ld.g;
import ni.f;
import pl.x;
import v9.e;

public final class AccidentHistoryActivity extends d {
    /* access modifiers changed from: private */
    public f G;
    public Context H;
    public g I;
    public k9.b J;
    private OffenceInterface K;
    public ArrayList L;
    public String M;
    public String N;
    public String O;
    public String P;
    public ld.c Q;
    private String R = "";
    private String S = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentHistoryActivity f7763e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AccidentHistoryActivity accidentHistoryActivity) {
            super(1);
            this.f7763e = accidentHistoryActivity;
        }

        public final void b(AccidentReportDetails accidentReportDetails) {
            f fVar = null;
            try {
                f o12 = this.f7763e.G;
                if (o12 == null) {
                    cm.l.v("binding");
                    o12 = null;
                }
                o12.f26155b.setVisibility(8);
                if (cm.l.a(accidentReportDetails.getStatusDesc(), "Success")) {
                    f o13 = this.f7763e.G;
                    if (o13 == null) {
                        cm.l.v("binding");
                        o13 = null;
                    }
                    o13.f26167n.setLayoutManager(new LinearLayoutManager(this.f7763e));
                    f o14 = this.f7763e.G;
                    if (o14 == null) {
                        cm.l.v("binding");
                        o14 = null;
                    }
                    o14.f26167n.setAdapter((RecyclerView.h) null);
                    this.f7763e.N1(accidentReportDetails.getMparCitizenAccidents());
                    x.N(this.f7763e.u1());
                    e9.b bVar = new e9.b(this.f7763e.u1(), this.f7763e.t1());
                    f o15 = this.f7763e.G;
                    if (o15 == null) {
                        cm.l.v("binding");
                        o15 = null;
                    }
                    o15.f26167n.setAdapter(bVar);
                    return;
                }
                f o16 = this.f7763e.G;
                if (o16 == null) {
                    cm.l.v("binding");
                    o16 = null;
                }
                o16.f26155b.setVisibility(8);
                f o17 = this.f7763e.G;
                if (o17 == null) {
                    cm.l.v("binding");
                    o17 = null;
                }
                o17.f26167n.setAdapter((RecyclerView.h) null);
                AccidentHistoryActivity accidentHistoryActivity = this.f7763e;
                accidentHistoryActivity.G1(accidentHistoryActivity, accidentReportDetails.getStatusDesc());
            } catch (Exception unused) {
                f o18 = this.f7763e.G;
                if (o18 == null) {
                    cm.l.v("binding");
                } else {
                    fVar = o18;
                }
                fVar.f26155b.setVisibility(8);
                AccidentHistoryActivity accidentHistoryActivity2 = this.f7763e;
                accidentHistoryActivity2.G1(accidentHistoryActivity2, accidentHistoryActivity2.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AccidentReportDetails) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentHistoryActivity f7764e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AccidentHistoryActivity accidentHistoryActivity) {
            super(1);
            this.f7764e = accidentHistoryActivity;
        }

        public final void b(String str) {
            f o12 = this.f7764e.G;
            if (o12 == null) {
                cm.l.v("binding");
                o12 = null;
            }
            o12.f26155b.setVisibility(8);
            AccidentHistoryActivity accidentHistoryActivity = this.f7764e;
            accidentHistoryActivity.G1(accidentHistoryActivity, accidentHistoryActivity.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7765a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f7765a = lVar;
        }

        public final pl.c a() {
            return this.f7765a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7765a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(AccidentHistoryActivity accidentHistoryActivity, View view) {
        cm.l.f(accidentHistoryActivity, "this$0");
        accidentHistoryActivity.startActivity(new Intent(accidentHistoryActivity, AccidentDashboardActivity.class));
        accidentHistoryActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void B1(AccidentHistoryActivity accidentHistoryActivity, View view) {
        cm.l.f(accidentHistoryActivity, "this$0");
        Calendar instance = Calendar.getInstance();
        AccidentHistoryActivity accidentHistoryActivity2 = accidentHistoryActivity;
        DatePickerDialog datePickerDialog = new DatePickerDialog(accidentHistoryActivity2, new o(accidentHistoryActivity), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(-16777216);
        datePickerDialog.getButton(-2).setTextColor(-16777216);
    }

    /* access modifiers changed from: private */
    public static final void C1(AccidentHistoryActivity accidentHistoryActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        cm.l.f(accidentHistoryActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        accidentHistoryActivity.L1(str);
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        accidentHistoryActivity.K1(str2);
        f fVar = accidentHistoryActivity.G;
        if (fVar == null) {
            cm.l.v("binding");
            fVar = null;
        }
        TextView textView = fVar.f26159f;
        textView.setText(accidentHistoryActivity.s1() + '-' + accidentHistoryActivity.r1() + '-' + i10);
        accidentHistoryActivity.R = i10 + '-' + accidentHistoryActivity.r1() + '-' + accidentHistoryActivity.s1();
    }

    /* access modifiers changed from: private */
    public static final void D1(AccidentHistoryActivity accidentHistoryActivity, View view) {
        cm.l.f(accidentHistoryActivity, "this$0");
        Calendar instance = Calendar.getInstance();
        AccidentHistoryActivity accidentHistoryActivity2 = accidentHistoryActivity;
        DatePickerDialog datePickerDialog = new DatePickerDialog(accidentHistoryActivity2, new q(accidentHistoryActivity), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(-16777216);
        datePickerDialog.getButton(-2).setTextColor(-16777216);
    }

    /* access modifiers changed from: private */
    public static final void E1(AccidentHistoryActivity accidentHistoryActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        cm.l.f(accidentHistoryActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        accidentHistoryActivity.J1(str);
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        accidentHistoryActivity.I1(str2);
        f fVar = accidentHistoryActivity.G;
        if (fVar == null) {
            cm.l.v("binding");
            fVar = null;
        }
        TextView textView = fVar.f26158e;
        textView.setText(accidentHistoryActivity.q1() + '-' + accidentHistoryActivity.p1() + '-' + i10);
        accidentHistoryActivity.S = i10 + '-' + accidentHistoryActivity.p1() + '-' + accidentHistoryActivity.q1();
    }

    /* access modifiers changed from: private */
    public static final void F1(AccidentHistoryActivity accidentHistoryActivity, View view) {
        Context t12;
        ld.c w12;
        String str;
        String str2;
        cm.l.f(accidentHistoryActivity, "this$0");
        f fVar = accidentHistoryActivity.G;
        f fVar2 = null;
        if (fVar == null) {
            cm.l.v("binding");
            fVar = null;
        }
        CharSequence text = fVar.f26159f.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            t12 = accidentHistoryActivity.t1();
            w12 = accidentHistoryActivity.w1();
            str = "enter_Start_date";
            str2 = "Please enter start date";
        } else {
            f fVar3 = accidentHistoryActivity.G;
            if (fVar3 == null) {
                cm.l.v("binding");
                fVar3 = null;
            }
            CharSequence text2 = fVar3.f26158e.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                t12 = accidentHistoryActivity.t1();
                w12 = accidentHistoryActivity.w1();
                str = "enter_end_date";
                str2 = "Please enter end date";
            } else {
                f fVar4 = accidentHistoryActivity.G;
                if (fVar4 == null) {
                    cm.l.v("binding");
                } else {
                    fVar2 = fVar4;
                }
                fVar2.f26155b.setVisibility(0);
                accidentHistoryActivity.v1().h(accidentHistoryActivity.x1().k(), accidentHistoryActivity.R, accidentHistoryActivity.S);
                return;
            }
        }
        accidentHistoryActivity.G1(t12, w12.b(str, str2));
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y1(AccidentHistoryActivity accidentHistoryActivity, View view) {
        cm.l.f(accidentHistoryActivity, "this$0");
        accidentHistoryActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void z1(AccidentHistoryActivity accidentHistoryActivity, View view) {
        cm.l.f(accidentHistoryActivity, "this$0");
        accidentHistoryActivity.startActivity(new Intent(accidentHistoryActivity, AccidentReportActivity.class));
        accidentHistoryActivity.finish();
    }

    public final void G1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new p(dialog));
        dialog.show();
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void M1(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void N1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.L = arrayList;
    }

    public final void O1(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.J = bVar;
    }

    public final void P1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void Q1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.I = gVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f c10 = f.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        f fVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        M1(this);
        Q1(new g(this));
        this.K = OffenceInterface.f7826a.b(this);
        P1(new ld.c(this));
        e.a aVar = e.f17509a;
        Context t12 = t1();
        f fVar2 = this.G;
        if (fVar2 == null) {
            cm.l.v("binding");
            fVar2 = null;
        }
        aVar.c(t12, fVar2);
        f fVar3 = this.G;
        if (fVar3 == null) {
            cm.l.v("binding");
            fVar3 = null;
        }
        fVar3.f26160g.f25961g.setText(w1().b("report_accident", "Report Accident"));
        f fVar4 = this.G;
        if (fVar4 == null) {
            cm.l.v("binding");
            fVar4 = null;
        }
        fVar4.f26160g.f25959e.setOnClickListener(new i(this));
        f fVar5 = this.G;
        if (fVar5 == null) {
            cm.l.v("binding");
            fVar5 = null;
        }
        fVar5.f26163j.setOnClickListener(new j(this));
        f fVar6 = this.G;
        if (fVar6 == null) {
            cm.l.v("binding");
            fVar6 = null;
        }
        fVar6.f26162i.setOnClickListener(new k(this));
        OffenceInterface offenceInterface = this.K;
        if (offenceInterface == null) {
            cm.l.v("mOffenceInterface");
            offenceInterface = null;
        }
        O1((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(offenceInterface))).a(k9.b.class));
        f fVar7 = this.G;
        if (fVar7 == null) {
            cm.l.v("binding");
            fVar7 = null;
        }
        fVar7.f26159f.setOnClickListener(new d9.l(this));
        f fVar8 = this.G;
        if (fVar8 == null) {
            cm.l.v("binding");
            fVar8 = null;
        }
        fVar8.f26158e.setOnClickListener(new d9.m(this));
        f fVar9 = this.G;
        if (fVar9 == null) {
            cm.l.v("binding");
        } else {
            fVar = fVar9;
        }
        fVar.f26169p.setOnClickListener(new n(this));
        v1().E().g(this, new c(new a(this)));
        v1().q().g(this, new c(new b(this)));
    }

    public final String p1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("dayEndMonth");
        return null;
    }

    public final String q1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("dayEndString");
        return null;
    }

    public final String r1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("dayStartMonth");
        return null;
    }

    public final String s1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("dayStartString");
        return null;
    }

    public final Context t1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ArrayList u1() {
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mListVal");
        return null;
    }

    public final k9.b v1() {
        k9.b bVar = this.J;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ld.c w1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final g x1() {
        g gVar = this.I;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }
}
