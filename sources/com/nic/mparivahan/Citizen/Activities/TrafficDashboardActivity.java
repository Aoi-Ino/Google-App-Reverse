package com.nic.mparivahan.Citizen.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetDashboardPojo;
import com.nic.mparivahan.Citizen.Models.GetLastViolation;
import d9.q0;
import d9.r0;
import d9.s0;
import d9.t0;
import d9.u0;
import e9.f;
import ld.g;
import ni.o8;
import pl.x;
import v9.e;

public final class TrafficDashboardActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public o8 G;
    public k9.b H;
    private OffenceInterface I;
    public Context J;
    public g K;
    public ld.c L;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficDashboardActivity f7778e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TrafficDashboardActivity trafficDashboardActivity) {
            super(1);
            this.f7778e = trafficDashboardActivity;
        }

        public final void b(GetLastViolation getLastViolation) {
            TextView textView;
            String str;
            TextView textView2;
            String str2;
            o8 k12 = this.f7778e.G;
            o8 o8Var = null;
            if (k12 == null) {
                cm.l.v("binding");
                k12 = null;
            }
            k12.f27804s.setVisibility(8);
            try {
                Log.e("last_viol_resp", getLastViolation.toString());
                String statusCode = getLastViolation.getStatusCode();
                if (cm.l.a(statusCode, "TRV001")) {
                    o8 k13 = this.f7778e.G;
                    if (k13 == null) {
                        cm.l.v("binding");
                        k13 = null;
                    }
                    k13.f27805t.setVisibility(8);
                    o8 k14 = this.f7778e.G;
                    if (k14 == null) {
                        cm.l.v("binding");
                        k14 = null;
                    }
                    k14.f27806u.setVisibility(8);
                    o8 k15 = this.f7778e.G;
                    if (k15 == null) {
                        cm.l.v("binding");
                        k15 = null;
                    }
                    k15.f27790e.setVisibility(0);
                    o8 k16 = this.f7778e.G;
                    if (k16 == null) {
                        cm.l.v("binding");
                        k16 = null;
                    }
                    k16.f27807v.setText(getLastViolation.getCitizenViolation().getViolRegnNo());
                    o8 k17 = this.f7778e.G;
                    if (k17 == null) {
                        cm.l.v("binding");
                        k17 = null;
                    }
                    k17.f27810y.setText(String.valueOf(getLastViolation.getCitizenViolation().getViolRecordId()));
                    if (getLastViolation.getCitizenViolation().getViolSubmittedAt().length() > 8) {
                        o8 k18 = this.f7778e.G;
                        if (k18 == null) {
                            cm.l.v("binding");
                            k18 = null;
                        }
                        textView = k18.f27809x;
                        str = getLastViolation.getCitizenViolation().getViolSubmittedAt();
                    } else {
                        o8 k19 = this.f7778e.G;
                        if (k19 == null) {
                            cm.l.v("binding");
                            k19 = null;
                        }
                        textView = k19.f27809x;
                        str = "Not Available";
                    }
                    textView.setText(str);
                    if (getLastViolation.getCitizenViolation().getViolStatus() == 0) {
                        o8 k110 = this.f7778e.G;
                        if (k110 == null) {
                            cm.l.v("binding");
                            k110 = null;
                        }
                        textView2 = k110.A;
                        str2 = "Pending";
                    } else {
                        o8 k111 = this.f7778e.G;
                        if (k111 == null) {
                            cm.l.v("binding");
                            k111 = null;
                        }
                        textView2 = k111.A;
                        str2 = "Active";
                    }
                    textView2.setText(str2);
                    o8 k112 = this.f7778e.G;
                    if (k112 == null) {
                        cm.l.v("binding");
                        k112 = null;
                    }
                    k112.f27811z.setText(getLastViolation.getCitizenViolation().getViolLocation());
                } else if (cm.l.a(statusCode, "TRV099")) {
                    o8 k113 = this.f7778e.G;
                    if (k113 == null) {
                        cm.l.v("binding");
                        k113 = null;
                    }
                    k113.f27790e.setVisibility(8);
                    o8 k114 = this.f7778e.G;
                    if (k114 == null) {
                        cm.l.v("binding");
                        k114 = null;
                    }
                    k114.f27805t.setVisibility(0);
                    o8 k115 = this.f7778e.G;
                    if (k115 == null) {
                        cm.l.v("binding");
                        k115 = null;
                    }
                    k115.f27806u.setVisibility(0);
                } else {
                    o8 k116 = this.f7778e.G;
                    if (k116 == null) {
                        cm.l.v("binding");
                        k116 = null;
                    }
                    k116.f27790e.setVisibility(8);
                    o8 k117 = this.f7778e.G;
                    if (k117 == null) {
                        cm.l.v("binding");
                        k117 = null;
                    }
                    k117.f27805t.setVisibility(0);
                    o8 k118 = this.f7778e.G;
                    if (k118 == null) {
                        cm.l.v("binding");
                        k118 = null;
                    }
                    k118.f27806u.setVisibility(0);
                    o8 k119 = this.f7778e.G;
                    if (k119 == null) {
                        cm.l.v("binding");
                        k119 = null;
                    }
                    k119.f27804s.setVisibility(8);
                }
            } catch (Exception unused) {
                o8 k120 = this.f7778e.G;
                if (k120 == null) {
                    cm.l.v("binding");
                    k120 = null;
                }
                k120.f27804s.setVisibility(8);
                o8 k121 = this.f7778e.G;
                if (k121 == null) {
                    cm.l.v("binding");
                    k121 = null;
                }
                k121.f27790e.setVisibility(8);
                o8 k122 = this.f7778e.G;
                if (k122 == null) {
                    cm.l.v("binding");
                    k122 = null;
                }
                k122.f27805t.setVisibility(0);
                o8 k123 = this.f7778e.G;
                if (k123 == null) {
                    cm.l.v("binding");
                } else {
                    o8Var = k123;
                }
                o8Var.f27806u.setVisibility(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetLastViolation) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficDashboardActivity f7779e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TrafficDashboardActivity trafficDashboardActivity) {
            super(1);
            this.f7779e = trafficDashboardActivity;
        }

        public final void b(String str) {
            o8 k12 = this.f7779e.G;
            o8 o8Var = null;
            if (k12 == null) {
                cm.l.v("binding");
                k12 = null;
            }
            k12.f27804s.setVisibility(8);
            o8 k13 = this.f7779e.G;
            if (k13 == null) {
                cm.l.v("binding");
            } else {
                o8Var = k13;
            }
            o8Var.f27790e.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficDashboardActivity f7780e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TrafficDashboardActivity trafficDashboardActivity) {
            super(1);
            this.f7780e = trafficDashboardActivity;
        }

        public final void b(GetDashboardPojo getDashboardPojo) {
            o8 k12;
            o8 o8Var = null;
            try {
                o8 k13 = this.f7780e.G;
                if (k13 == null) {
                    cm.l.v("binding");
                    k13 = null;
                }
                k13.f27804s.setVisibility(8);
                Log.e("last_resp", getDashboardPojo.toString());
                String statusCode = getDashboardPojo.getStatusCode();
                if (cm.l.a(statusCode, "TRV001")) {
                    o8 k14 = this.f7780e.G;
                    if (k14 == null) {
                        cm.l.v("binding");
                        k14 = null;
                    }
                    k14.f27792g.setVisibility(0);
                    o8 k15 = this.f7780e.G;
                    if (k15 == null) {
                        cm.l.v("binding");
                        k15 = null;
                    }
                    k15.f27796k.setLayoutManager(new LinearLayoutManager(this.f7780e));
                    f fVar = new f(getDashboardPojo.getContents(), this.f7780e.l1());
                    o8 k16 = this.f7780e.G;
                    if (k16 == null) {
                        cm.l.v("binding");
                        k16 = null;
                    }
                    k16.f27796k.setAdapter(fVar);
                    return;
                }
                if (cm.l.a(statusCode, "TRV099")) {
                    o8 k17 = this.f7780e.G;
                    if (k17 == null) {
                        cm.l.v("binding");
                        k17 = null;
                    }
                    k17.f27804s.setVisibility(8);
                    k12 = this.f7780e.G;
                    if (k12 == null) {
                        cm.l.v("binding");
                        k12 = null;
                    }
                } else {
                    o8 k18 = this.f7780e.G;
                    if (k18 == null) {
                        cm.l.v("binding");
                        k18 = null;
                    }
                    k18.f27804s.setVisibility(8);
                    k12 = this.f7780e.G;
                    if (k12 == null) {
                        cm.l.v("binding");
                        k12 = null;
                    }
                }
                k12.f27792g.setVisibility(8);
            } catch (Exception unused) {
                o8 k19 = this.f7780e.G;
                if (k19 == null) {
                    cm.l.v("binding");
                    k19 = null;
                }
                k19.f27804s.setVisibility(8);
                o8 k110 = this.f7780e.G;
                if (k110 == null) {
                    cm.l.v("binding");
                } else {
                    o8Var = k110;
                }
                o8Var.f27792g.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetDashboardPojo) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficDashboardActivity f7781e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TrafficDashboardActivity trafficDashboardActivity) {
            super(1);
            this.f7781e = trafficDashboardActivity;
        }

        public final void b(String str) {
            o8 k12 = this.f7781e.G;
            o8 o8Var = null;
            if (k12 == null) {
                cm.l.v("binding");
                k12 = null;
            }
            k12.f27804s.setVisibility(8);
            o8 k13 = this.f7781e.G;
            if (k13 == null) {
                cm.l.v("binding");
            } else {
                o8Var = k13;
            }
            o8Var.f27792g.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7782a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f7782a = lVar;
        }

        public final pl.c a() {
            return this.f7782a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7782a.invoke(obj);
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
    public static final void p1(TrafficDashboardActivity trafficDashboardActivity, View view) {
        cm.l.f(trafficDashboardActivity, "this$0");
        trafficDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void q1(TrafficDashboardActivity trafficDashboardActivity, View view) {
        cm.l.f(trafficDashboardActivity, "this$0");
        trafficDashboardActivity.startActivity(new Intent(trafficDashboardActivity, TrafficReportVioActivity.class));
        trafficDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void r1(TrafficDashboardActivity trafficDashboardActivity, View view) {
        cm.l.f(trafficDashboardActivity, "this$0");
        trafficDashboardActivity.startActivity(new Intent(trafficDashboardActivity, TrafficReportVioActivity.class));
        trafficDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void s1(TrafficDashboardActivity trafficDashboardActivity, View view) {
        cm.l.f(trafficDashboardActivity, "this$0");
        trafficDashboardActivity.startActivity(new Intent(trafficDashboardActivity, TrafficHistoryActivity.class));
        trafficDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(TrafficDashboardActivity trafficDashboardActivity, View view) {
        cm.l.f(trafficDashboardActivity, "this$0");
        Intent intent = new Intent(trafficDashboardActivity, ViewComplaintDetails.class);
        o8 o8Var = trafficDashboardActivity.G;
        o8 o8Var2 = null;
        if (o8Var == null) {
            cm.l.v("binding");
            o8Var = null;
        }
        CharSequence text = o8Var.f27811z.getText();
        cm.l.e(text, "getText(...)");
        intent.putExtra("location", q.B0(text));
        o8 o8Var3 = trafficDashboardActivity.G;
        if (o8Var3 == null) {
            cm.l.v("binding");
            o8Var3 = null;
        }
        intent.putExtra("status", cm.l.a(o8Var3.A.getText(), "Active") ? "1" : "0");
        o8 o8Var4 = trafficDashboardActivity.G;
        if (o8Var4 == null) {
            cm.l.v("binding");
            o8Var4 = null;
        }
        CharSequence text2 = o8Var4.f27807v.getText();
        cm.l.e(text2, "getText(...)");
        intent.putExtra("vehicleNumber", q.B0(text2));
        o8 o8Var5 = trafficDashboardActivity.G;
        if (o8Var5 == null) {
            cm.l.v("binding");
        } else {
            o8Var2 = o8Var5;
        }
        CharSequence text3 = o8Var2.f27810y.getText();
        cm.l.e(text3, "getText(...)");
        intent.putExtra("violOffenceId", q.B0(text3));
        trafficDashboardActivity.startActivity(intent);
    }

    public final Context l1() {
        Context context = this.J;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final k9.b m1() {
        k9.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ld.c n1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final g o1() {
        g gVar = this.K;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o8 c10 = o8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        OffenceInterface offenceInterface = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        u1(this);
        x1(new g(this));
        w1(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        o8 o8Var = this.G;
        if (o8Var == null) {
            cm.l.v("binding");
            o8Var = null;
        }
        aVar.f(this, o8Var);
        o8 o8Var2 = this.G;
        if (o8Var2 == null) {
            cm.l.v("binding");
            o8Var2 = null;
        }
        o8Var2.f27787b.f25961g.setText(n1().b("report_traffic_violation", "Report Traffic Violation"));
        this.I = OffenceInterface.f7826a.b(this);
        o8 o8Var3 = this.G;
        if (o8Var3 == null) {
            cm.l.v("binding");
            o8Var3 = null;
        }
        o8Var3.f27787b.f25959e.setOnClickListener(new q0(this));
        o8 o8Var4 = this.G;
        if (o8Var4 == null) {
            cm.l.v("binding");
            o8Var4 = null;
        }
        o8Var4.f27791f.setOnClickListener(new r0(this));
        o8 o8Var5 = this.G;
        if (o8Var5 == null) {
            cm.l.v("binding");
            o8Var5 = null;
        }
        o8Var5.f27806u.setOnClickListener(new s0(this));
        o8 o8Var6 = this.G;
        if (o8Var6 == null) {
            cm.l.v("binding");
            o8Var6 = null;
        }
        o8Var6.f27788c.setOnClickListener(new t0(this));
        o8 o8Var7 = this.G;
        if (o8Var7 == null) {
            cm.l.v("binding");
            o8Var7 = null;
        }
        o8Var7.f27808w.setOnClickListener(new u0(this));
        o8 o8Var8 = this.G;
        if (o8Var8 == null) {
            cm.l.v("binding");
            o8Var8 = null;
        }
        o8Var8.f27804s.setVisibility(0);
        OffenceInterface offenceInterface2 = this.I;
        if (offenceInterface2 == null) {
            cm.l.v("mOffenceInterface");
        } else {
            offenceInterface = offenceInterface2;
        }
        v1((k9.b) new androidx.lifecycle.u0((x0) this, (u0.b) new k9.a(new i9.a(offenceInterface))).a(k9.b.class));
        m1().D(o1().k());
        m1().y().g(this, new e(new a(this)));
        m1().o().g(this, new e(new b(this)));
        m1().k(o1().k());
        m1().w().g(this, new e(new c(this)));
        m1().o().g(this, new e(new d(this)));
    }

    public final void u1(Context context) {
        cm.l.f(context, "<set-?>");
        this.J = context;
    }

    public final void v1(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void w1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void x1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.K = gVar;
    }
}
