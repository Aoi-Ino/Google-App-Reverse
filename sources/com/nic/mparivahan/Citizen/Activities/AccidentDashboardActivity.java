package com.nic.mparivahan.Citizen.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.nic.mparivahan.Citizen.Models.GetLastAccident;
import java.util.HashMap;
import ld.g;
import pl.x;
import v9.e;

public final class AccidentDashboardActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public ni.d G;
    public Context H;
    public g I;
    public k9.b J;
    private OffenceInterface K;
    private HashMap L = new HashMap();
    public ld.c M;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentDashboardActivity f7754e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AccidentDashboardActivity accidentDashboardActivity) {
            super(1);
            this.f7754e = accidentDashboardActivity;
        }

        public final void b(String str) {
            ni.d k12 = this.f7754e.G;
            ni.d dVar = null;
            if (k12 == null) {
                cm.l.v("binding");
                k12 = null;
            }
            k12.f25795b.setVisibility(8);
            ni.d k13 = this.f7754e.G;
            if (k13 == null) {
                cm.l.v("binding");
            } else {
                dVar = k13;
            }
            dVar.f25803j.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentDashboardActivity f7755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AccidentDashboardActivity accidentDashboardActivity) {
            super(1);
            this.f7755e = accidentDashboardActivity;
        }

        public final void b(GetLastAccident getLastAccident) {
            TextView textView;
            String str;
            TextView textView2;
            String str2;
            ni.d dVar = null;
            try {
                ni.d k12 = this.f7755e.G;
                if (k12 == null) {
                    cm.l.v("binding");
                    k12 = null;
                }
                k12.f25795b.setVisibility(8);
                String statusDesc = getLastAccident.getStatusDesc();
                if (cm.l.a(statusDesc, "Success")) {
                    ni.d k13 = this.f7755e.G;
                    if (k13 == null) {
                        cm.l.v("binding");
                        k13 = null;
                    }
                    k13.f25815v.setVisibility(8);
                    ni.d k14 = this.f7755e.G;
                    if (k14 == null) {
                        cm.l.v("binding");
                        k14 = null;
                    }
                    k14.f25817x.setVisibility(8);
                    ni.d k15 = this.f7755e.G;
                    if (k15 == null) {
                        cm.l.v("binding");
                        k15 = null;
                    }
                    k15.f25801h.setVisibility(0);
                    ni.d k16 = this.f7755e.G;
                    if (k16 == null) {
                        cm.l.v("binding");
                        k16 = null;
                    }
                    k16.f25818y.setText(getLastAccident.getMparCitizenAccident().getAccdRegnNo());
                    ni.d k17 = this.f7755e.G;
                    if (k17 == null) {
                        cm.l.v("binding");
                        k17 = null;
                    }
                    k17.f25816w.setText(String.valueOf(getLastAccident.getMparCitizenAccident().getAccdRecordId()));
                    if (getLastAccident.getMparCitizenAccident().getAccdSubmittedAt().length() > 8) {
                        ni.d k18 = this.f7755e.G;
                        if (k18 == null) {
                            cm.l.v("binding");
                            k18 = null;
                        }
                        textView = k18.A;
                        str = getLastAccident.getMparCitizenAccident().getAccdSubmittedAt();
                    } else {
                        ni.d k19 = this.f7755e.G;
                        if (k19 == null) {
                            cm.l.v("binding");
                            k19 = null;
                        }
                        textView = k19.A;
                        str = "Not Available";
                    }
                    textView.setText(str);
                    if (getLastAccident.getMparCitizenAccident().getAccdStatus() == 0) {
                        ni.d k110 = this.f7755e.G;
                        if (k110 == null) {
                            cm.l.v("binding");
                            k110 = null;
                        }
                        textView2 = k110.C;
                        str2 = "Pending";
                    } else {
                        ni.d k111 = this.f7755e.G;
                        if (k111 == null) {
                            cm.l.v("binding");
                            k111 = null;
                        }
                        textView2 = k111.C;
                        str2 = "Active";
                    }
                    textView2.setText(str2);
                    ni.d k112 = this.f7755e.G;
                    if (k112 == null) {
                        cm.l.v("binding");
                        k112 = null;
                    }
                    k112.B.setText(getLastAccident.getMparCitizenAccident().getAccdLocation());
                } else if (cm.l.a(statusDesc, "No Record(s) Found.")) {
                    ni.d k113 = this.f7755e.G;
                    if (k113 == null) {
                        cm.l.v("binding");
                        k113 = null;
                    }
                    k113.f25801h.setVisibility(8);
                    ni.d k114 = this.f7755e.G;
                    if (k114 == null) {
                        cm.l.v("binding");
                        k114 = null;
                    }
                    k114.f25815v.setVisibility(0);
                    ni.d k115 = this.f7755e.G;
                    if (k115 == null) {
                        cm.l.v("binding");
                        k115 = null;
                    }
                    k115.f25817x.setVisibility(0);
                } else {
                    ni.d k116 = this.f7755e.G;
                    if (k116 == null) {
                        cm.l.v("binding");
                        k116 = null;
                    }
                    k116.f25801h.setVisibility(8);
                    ni.d k117 = this.f7755e.G;
                    if (k117 == null) {
                        cm.l.v("binding");
                        k117 = null;
                    }
                    k117.f25815v.setVisibility(0);
                    ni.d k118 = this.f7755e.G;
                    if (k118 == null) {
                        cm.l.v("binding");
                        k118 = null;
                    }
                    k118.f25817x.setVisibility(0);
                    ni.d k119 = this.f7755e.G;
                    if (k119 == null) {
                        cm.l.v("binding");
                        k119 = null;
                    }
                    k119.f25795b.setVisibility(8);
                }
            } catch (Exception unused) {
                ni.d k120 = this.f7755e.G;
                if (k120 == null) {
                    cm.l.v("binding");
                    k120 = null;
                }
                k120.f25795b.setVisibility(8);
                ni.d k121 = this.f7755e.G;
                if (k121 == null) {
                    cm.l.v("binding");
                    k121 = null;
                }
                k121.f25801h.setVisibility(8);
                ni.d k122 = this.f7755e.G;
                if (k122 == null) {
                    cm.l.v("binding");
                    k122 = null;
                }
                k122.f25815v.setVisibility(0);
                ni.d k123 = this.f7755e.G;
                if (k123 == null) {
                    cm.l.v("binding");
                } else {
                    dVar = k123;
                }
                dVar.f25817x.setVisibility(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetLastAccident) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentDashboardActivity f7756e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AccidentDashboardActivity accidentDashboardActivity) {
            super(1);
            this.f7756e = accidentDashboardActivity;
        }

        public final void b(String str) {
            ni.d k12 = this.f7756e.G;
            ni.d dVar = null;
            if (k12 == null) {
                cm.l.v("binding");
                k12 = null;
            }
            k12.f25795b.setVisibility(8);
            ni.d k13 = this.f7756e.G;
            if (k13 == null) {
                cm.l.v("binding");
                k13 = null;
            }
            k13.f25795b.setVisibility(8);
            ni.d k14 = this.f7756e.G;
            if (k14 == null) {
                cm.l.v("binding");
                k14 = null;
            }
            k14.f25801h.setVisibility(8);
            ni.d k15 = this.f7756e.G;
            if (k15 == null) {
                cm.l.v("binding");
                k15 = null;
            }
            k15.f25815v.setVisibility(0);
            ni.d k16 = this.f7756e.G;
            if (k16 == null) {
                cm.l.v("binding");
            } else {
                dVar = k16;
            }
            dVar.f25817x.setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentDashboardActivity f7757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AccidentDashboardActivity accidentDashboardActivity) {
            super(1);
            this.f7757e = accidentDashboardActivity;
        }

        public final void b(String str) {
            ni.d k12 = this.f7757e.G;
            ni.d dVar = null;
            if (k12 == null) {
                cm.l.v("binding");
                k12 = null;
            }
            k12.f25795b.setVisibility(8);
            ni.d k13 = this.f7757e.G;
            if (k13 == null) {
                cm.l.v("binding");
                k13 = null;
            }
            k13.f25795b.setVisibility(8);
            ni.d k14 = this.f7757e.G;
            if (k14 == null) {
                cm.l.v("binding");
                k14 = null;
            }
            k14.f25801h.setVisibility(8);
            ni.d k15 = this.f7757e.G;
            if (k15 == null) {
                cm.l.v("binding");
                k15 = null;
            }
            k15.f25815v.setVisibility(0);
            ni.d k16 = this.f7757e.G;
            if (k16 == null) {
                cm.l.v("binding");
            } else {
                dVar = k16;
            }
            dVar.f25817x.setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentDashboardActivity f7758e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AccidentDashboardActivity accidentDashboardActivity) {
            super(1);
            this.f7758e = accidentDashboardActivity;
        }

        public final void b(GetDashboardPojo getDashboardPojo) {
            ni.d k12;
            ni.d dVar = null;
            try {
                ni.d k13 = this.f7758e.G;
                if (k13 == null) {
                    cm.l.v("binding");
                    k13 = null;
                }
                k13.f25795b.setVisibility(8);
                String statusCode = getDashboardPojo.getStatusCode();
                if (cm.l.a(statusCode, "ACCD001")) {
                    ni.d k14 = this.f7758e.G;
                    if (k14 == null) {
                        cm.l.v("binding");
                        k14 = null;
                    }
                    k14.f25803j.setVisibility(0);
                    ni.d k15 = this.f7758e.G;
                    if (k15 == null) {
                        cm.l.v("binding");
                        k15 = null;
                    }
                    k15.f25807n.setLayoutManager(new LinearLayoutManager(this.f7758e));
                    e9.f fVar = new e9.f(getDashboardPojo.getContents(), this.f7758e.l1());
                    ni.d k16 = this.f7758e.G;
                    if (k16 == null) {
                        cm.l.v("binding");
                        k16 = null;
                    }
                    k16.f25807n.setAdapter(fVar);
                    return;
                }
                if (cm.l.a(statusCode, "ACCD099")) {
                    ni.d k17 = this.f7758e.G;
                    if (k17 == null) {
                        cm.l.v("binding");
                        k17 = null;
                    }
                    k17.f25795b.setVisibility(8);
                    k12 = this.f7758e.G;
                    if (k12 == null) {
                        cm.l.v("binding");
                        k12 = null;
                    }
                } else {
                    ni.d k18 = this.f7758e.G;
                    if (k18 == null) {
                        cm.l.v("binding");
                        k18 = null;
                    }
                    k18.f25795b.setVisibility(8);
                    k12 = this.f7758e.G;
                    if (k12 == null) {
                        cm.l.v("binding");
                        k12 = null;
                    }
                }
                k12.f25803j.setVisibility(8);
            } catch (Exception unused) {
                ni.d k19 = this.f7758e.G;
                if (k19 == null) {
                    cm.l.v("binding");
                    k19 = null;
                }
                k19.f25795b.setVisibility(8);
                ni.d k110 = this.f7758e.G;
                if (k110 == null) {
                    cm.l.v("binding");
                } else {
                    dVar = k110;
                }
                dVar.f25803j.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetDashboardPojo) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7759a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f7759a = lVar;
        }

        public final pl.c a() {
            return this.f7759a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7759a.invoke(obj);
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
    public static final void p1(AccidentDashboardActivity accidentDashboardActivity, View view) {
        cm.l.f(accidentDashboardActivity, "this$0");
        accidentDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void q1(AccidentDashboardActivity accidentDashboardActivity, View view) {
        cm.l.f(accidentDashboardActivity, "this$0");
        accidentDashboardActivity.startActivity(new Intent(accidentDashboardActivity, AccidentReportActivity.class));
        accidentDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void r1(AccidentDashboardActivity accidentDashboardActivity, View view) {
        cm.l.f(accidentDashboardActivity, "this$0");
        accidentDashboardActivity.startActivity(new Intent(accidentDashboardActivity, AccidentReportActivity.class));
        accidentDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void s1(AccidentDashboardActivity accidentDashboardActivity, View view) {
        cm.l.f(accidentDashboardActivity, "this$0");
        accidentDashboardActivity.startActivity(new Intent(accidentDashboardActivity, AccidentHistoryActivity.class));
        accidentDashboardActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(AccidentDashboardActivity accidentDashboardActivity, View view) {
        cm.l.f(accidentDashboardActivity, "this$0");
        Intent intent = new Intent(accidentDashboardActivity, ViewAccidentDetails.class);
        ni.d dVar = accidentDashboardActivity.G;
        ni.d dVar2 = null;
        if (dVar == null) {
            cm.l.v("binding");
            dVar = null;
        }
        CharSequence text = dVar.B.getText();
        cm.l.e(text, "getText(...)");
        intent.putExtra("location", q.B0(text));
        ni.d dVar3 = accidentDashboardActivity.G;
        if (dVar3 == null) {
            cm.l.v("binding");
            dVar3 = null;
        }
        intent.putExtra("status", cm.l.a(dVar3.C.getText(), "Active") ? "1" : "0");
        ni.d dVar4 = accidentDashboardActivity.G;
        if (dVar4 == null) {
            cm.l.v("binding");
            dVar4 = null;
        }
        CharSequence text2 = dVar4.f25818y.getText();
        cm.l.e(text2, "getText(...)");
        intent.putExtra("vehicleNumber", q.B0(text2));
        ni.d dVar5 = accidentDashboardActivity.G;
        if (dVar5 == null) {
            cm.l.v("binding");
        } else {
            dVar2 = dVar5;
        }
        CharSequence text3 = dVar2.f25816w.getText();
        cm.l.e(text3, "getText(...)");
        intent.putExtra("accRecordId", q.B0(text3));
        accidentDashboardActivity.startActivity(intent);
    }

    public final Context l1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final k9.b m1() {
        k9.b bVar = this.J;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ld.c n1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final g o1() {
        g gVar = this.I;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ni.d c10 = ni.d.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        OffenceInterface offenceInterface = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        w1(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        ni.d dVar = this.G;
        if (dVar == null) {
            cm.l.v("binding");
            dVar = null;
        }
        aVar.a(this, dVar);
        ni.d dVar2 = this.G;
        if (dVar2 == null) {
            cm.l.v("binding");
            dVar2 = null;
        }
        dVar2.f25798e.f25961g.setText(n1().b("report_accident", "Report Accident"));
        ni.d dVar3 = this.G;
        if (dVar3 == null) {
            cm.l.v("binding");
            dVar3 = null;
        }
        dVar3.f25798e.f25959e.setOnClickListener(new d9.a(this));
        u1(this);
        x1(new g(this));
        this.K = OffenceInterface.f7826a.b(this);
        ni.d dVar4 = this.G;
        if (dVar4 == null) {
            cm.l.v("binding");
            dVar4 = null;
        }
        dVar4.f25817x.setOnClickListener(new d9.b(this));
        ni.d dVar5 = this.G;
        if (dVar5 == null) {
            cm.l.v("binding");
            dVar5 = null;
        }
        dVar5.f25802i.setOnClickListener(new d9.c(this));
        ni.d dVar6 = this.G;
        if (dVar6 == null) {
            cm.l.v("binding");
            dVar6 = null;
        }
        dVar6.f25799f.setOnClickListener(new d9.d(this));
        ni.d dVar7 = this.G;
        if (dVar7 == null) {
            cm.l.v("binding");
            dVar7 = null;
        }
        dVar7.f25819z.setOnClickListener(new d9.e(this));
        ni.d dVar8 = this.G;
        if (dVar8 == null) {
            cm.l.v("binding");
            dVar8 = null;
        }
        dVar8.f25795b.setVisibility(0);
        OffenceInterface offenceInterface2 = this.K;
        if (offenceInterface2 == null) {
            cm.l.v("mOffenceInterface");
        } else {
            offenceInterface = offenceInterface2;
        }
        v1((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(offenceInterface))).a(k9.b.class));
        m1().C(o1().k());
        m1().x().g(this, new f(new b(this)));
        m1().q().g(this, new f(new c(this)));
        m1().p().g(this, new f(new d(this)));
        m1().g(o1().k());
        m1().u().g(this, new f(new e(this)));
        m1().l().g(this, new f(new a(this)));
    }

    public final void u1(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void v1(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.J = bVar;
    }

    public final void w1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void x1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.I = gVar;
    }
}
