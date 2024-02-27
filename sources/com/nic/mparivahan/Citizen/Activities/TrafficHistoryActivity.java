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
import com.nic.mparivahan.Citizen.Models.ComplaintList;
import com.nic.mparivahan.R;
import d9.a1;
import d9.b1;
import d9.c1;
import d9.d1;
import d9.e1;
import d9.f1;
import d9.g1;
import d9.y0;
import d9.z0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import ld.g;
import m8.j;
import ni.q8;
import pl.x;
import v9.e;

public final class TrafficHistoryActivity extends d {
    /* access modifiers changed from: private */
    public q8 G;
    public Context H;
    public k9.b I;
    private OffenceInterface J;
    public g K;
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
        final /* synthetic */ TrafficHistoryActivity f7786e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TrafficHistoryActivity trafficHistoryActivity) {
            super(1);
            this.f7786e = trafficHistoryActivity;
        }

        public final void b(ComplaintList complaintList) {
            q8 q8Var = null;
            try {
                q8 o12 = this.f7786e.G;
                if (o12 == null) {
                    cm.l.v("binding");
                    o12 = null;
                }
                o12.f28214m.setVisibility(8);
                if (cm.l.a(complaintList.getStatusDesc(), "Success")) {
                    q8 o13 = this.f7786e.G;
                    if (o13 == null) {
                        cm.l.v("binding");
                        o13 = null;
                    }
                    o13.f28212k.setLayoutManager(new LinearLayoutManager(this.f7786e));
                    q8 o14 = this.f7786e.G;
                    if (o14 == null) {
                        cm.l.v("binding");
                        o14 = null;
                    }
                    o14.f28212k.setAdapter((RecyclerView.h) null);
                    this.f7786e.N1(complaintList.getCitizenViolations());
                    Collections.reverse(this.f7786e.u1());
                    j jVar = new j(this.f7786e.u1(), this.f7786e.t1());
                    q8 o15 = this.f7786e.G;
                    if (o15 == null) {
                        cm.l.v("binding");
                        o15 = null;
                    }
                    o15.f28212k.setAdapter(jVar);
                } else if (cm.l.a(complaintList.getStatusCode(), "ACCD099")) {
                    TrafficHistoryActivity trafficHistoryActivity = this.f7786e;
                    trafficHistoryActivity.G1(trafficHistoryActivity, trafficHistoryActivity.getResources().getString(R.string.traffic_state));
                    q8 o16 = this.f7786e.G;
                    if (o16 == null) {
                        cm.l.v("binding");
                        o16 = null;
                    }
                    o16.f28214m.setVisibility(8);
                } else {
                    q8 o17 = this.f7786e.G;
                    if (o17 == null) {
                        cm.l.v("binding");
                        o17 = null;
                    }
                    o17.f28214m.setVisibility(8);
                    q8 o18 = this.f7786e.G;
                    if (o18 == null) {
                        cm.l.v("binding");
                        o18 = null;
                    }
                    o18.f28212k.setAdapter((RecyclerView.h) null);
                    TrafficHistoryActivity trafficHistoryActivity2 = this.f7786e;
                    trafficHistoryActivity2.G1(trafficHistoryActivity2, complaintList.getStatusDesc());
                }
            } catch (Exception unused) {
                q8 o19 = this.f7786e.G;
                if (o19 == null) {
                    cm.l.v("binding");
                } else {
                    q8Var = o19;
                }
                q8Var.f28214m.setVisibility(8);
                TrafficHistoryActivity trafficHistoryActivity3 = this.f7786e;
                trafficHistoryActivity3.G1(trafficHistoryActivity3, "Something went wrong,Please try after some time!");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ComplaintList) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficHistoryActivity f7787e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TrafficHistoryActivity trafficHistoryActivity) {
            super(1);
            this.f7787e = trafficHistoryActivity;
        }

        public final void b(String str) {
            q8 o12 = this.f7787e.G;
            if (o12 == null) {
                cm.l.v("binding");
                o12 = null;
            }
            o12.f28214m.setVisibility(8);
            TrafficHistoryActivity trafficHistoryActivity = this.f7787e;
            trafficHistoryActivity.G1(trafficHistoryActivity, "Something went wrong,Please try after some time!");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7788a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f7788a = lVar;
        }

        public final pl.c a() {
            return this.f7788a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7788a.invoke(obj);
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
    public static final void A1(TrafficHistoryActivity trafficHistoryActivity, View view) {
        cm.l.f(trafficHistoryActivity, "this$0");
        trafficHistoryActivity.startActivity(new Intent(trafficHistoryActivity, TrafficDashboardActivity.class));
        trafficHistoryActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void B1(TrafficHistoryActivity trafficHistoryActivity, View view) {
        cm.l.f(trafficHistoryActivity, "this$0");
        Calendar instance = Calendar.getInstance();
        TrafficHistoryActivity trafficHistoryActivity2 = trafficHistoryActivity;
        DatePickerDialog datePickerDialog = new DatePickerDialog(trafficHistoryActivity2, new f1(trafficHistoryActivity), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(-16777216);
        datePickerDialog.getButton(-2).setTextColor(-16777216);
    }

    /* access modifiers changed from: private */
    public static final void C1(TrafficHistoryActivity trafficHistoryActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        cm.l.f(trafficHistoryActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        trafficHistoryActivity.L1(str);
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        trafficHistoryActivity.K1(str2);
        q8 q8Var = trafficHistoryActivity.G;
        if (q8Var == null) {
            cm.l.v("binding");
            q8Var = null;
        }
        TextView textView = q8Var.f28204c;
        textView.setText(trafficHistoryActivity.s1() + '-' + trafficHistoryActivity.r1() + '-' + i10);
        trafficHistoryActivity.R = i10 + '-' + trafficHistoryActivity.r1() + '-' + trafficHistoryActivity.s1();
    }

    /* access modifiers changed from: private */
    public static final void D1(TrafficHistoryActivity trafficHistoryActivity, View view) {
        cm.l.f(trafficHistoryActivity, "this$0");
        Calendar instance = Calendar.getInstance();
        TrafficHistoryActivity trafficHistoryActivity2 = trafficHistoryActivity;
        DatePickerDialog datePickerDialog = new DatePickerDialog(trafficHistoryActivity2, new e1(trafficHistoryActivity), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(-16777216);
        datePickerDialog.getButton(-2).setTextColor(-16777216);
    }

    /* access modifiers changed from: private */
    public static final void E1(TrafficHistoryActivity trafficHistoryActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        cm.l.f(trafficHistoryActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        trafficHistoryActivity.J1(str);
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        trafficHistoryActivity.I1(str2);
        q8 q8Var = trafficHistoryActivity.G;
        if (q8Var == null) {
            cm.l.v("binding");
            q8Var = null;
        }
        TextView textView = q8Var.f28203b;
        textView.setText(trafficHistoryActivity.q1() + '-' + trafficHistoryActivity.p1() + '-' + i10);
        trafficHistoryActivity.S = i10 + '-' + trafficHistoryActivity.p1() + '-' + trafficHistoryActivity.q1();
    }

    /* access modifiers changed from: private */
    public static final void F1(TrafficHistoryActivity trafficHistoryActivity, View view) {
        Context t12;
        ld.c w12;
        String str;
        String str2;
        cm.l.f(trafficHistoryActivity, "this$0");
        q8 q8Var = trafficHistoryActivity.G;
        q8 q8Var2 = null;
        if (q8Var == null) {
            cm.l.v("binding");
            q8Var = null;
        }
        CharSequence text = q8Var.f28204c.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            t12 = trafficHistoryActivity.t1();
            w12 = trafficHistoryActivity.w1();
            str = "enter_Start_date";
            str2 = "Please enter start date";
        } else {
            q8 q8Var3 = trafficHistoryActivity.G;
            if (q8Var3 == null) {
                cm.l.v("binding");
                q8Var3 = null;
            }
            CharSequence text2 = q8Var3.f28203b.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                t12 = trafficHistoryActivity.t1();
                w12 = trafficHistoryActivity.w1();
                str = "enter_end_date";
                str2 = "Please enter end date";
            } else {
                q8 q8Var4 = trafficHistoryActivity.G;
                if (q8Var4 == null) {
                    cm.l.v("binding");
                } else {
                    q8Var2 = q8Var4;
                }
                q8Var2.f28214m.setVisibility(0);
                trafficHistoryActivity.v1().V(trafficHistoryActivity.x1().k(), trafficHistoryActivity.R, trafficHistoryActivity.S);
                return;
            }
        }
        trafficHistoryActivity.G1(t12, w12.b(str, str2));
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y1(TrafficHistoryActivity trafficHistoryActivity, View view) {
        cm.l.f(trafficHistoryActivity, "this$0");
        trafficHistoryActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void z1(TrafficHistoryActivity trafficHistoryActivity, View view) {
        cm.l.f(trafficHistoryActivity, "this$0");
        trafficHistoryActivity.startActivity(new Intent(trafficHistoryActivity, TrafficReportVioActivity.class));
        trafficHistoryActivity.finish();
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
        ((TextView) findViewById2).setOnClickListener(new g1(dialog));
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
        this.I = bVar;
    }

    public final void P1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void Q1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.K = gVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q8 c10 = q8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        q8 q8Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        M1(this);
        Q1(new g(this));
        e.a aVar = e.f17509a;
        q8 q8Var2 = this.G;
        if (q8Var2 == null) {
            cm.l.v("binding");
            q8Var2 = null;
        }
        aVar.h(this, q8Var2);
        this.J = OffenceInterface.f7826a.b(this);
        P1(new ld.c(this));
        q8 q8Var3 = this.G;
        if (q8Var3 == null) {
            cm.l.v("binding");
            q8Var3 = null;
        }
        q8Var3.f28205d.f25961g.setText(w1().b("report_traffic_violation", "Report Traffic Violation"));
        q8 q8Var4 = this.G;
        if (q8Var4 == null) {
            cm.l.v("binding");
            q8Var4 = null;
        }
        q8Var4.f28205d.f25959e.setOnClickListener(new y0(this));
        q8 q8Var5 = this.G;
        if (q8Var5 == null) {
            cm.l.v("binding");
            q8Var5 = null;
        }
        q8Var5.f28208g.setOnClickListener(new z0(this));
        q8 q8Var6 = this.G;
        if (q8Var6 == null) {
            cm.l.v("binding");
            q8Var6 = null;
        }
        q8Var6.f28207f.setOnClickListener(new a1(this));
        OffenceInterface offenceInterface = this.J;
        if (offenceInterface == null) {
            cm.l.v("mOffenceInterface");
            offenceInterface = null;
        }
        O1((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(offenceInterface))).a(k9.b.class));
        v1().G().g(this, new c(new a(this)));
        v1().H().g(this, new c(new b(this)));
        q8 q8Var7 = this.G;
        if (q8Var7 == null) {
            cm.l.v("binding");
            q8Var7 = null;
        }
        q8Var7.f28204c.setOnClickListener(new b1(this));
        q8 q8Var8 = this.G;
        if (q8Var8 == null) {
            cm.l.v("binding");
            q8Var8 = null;
        }
        q8Var8.f28203b.setOnClickListener(new c1(this));
        q8 q8Var9 = this.G;
        if (q8Var9 == null) {
            cm.l.v("binding");
        } else {
            q8Var = q8Var9;
        }
        q8Var.f28215n.setOnClickListener(new d1(this));
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
        k9.b bVar = this.I;
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
        g gVar = this.K;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }
}
