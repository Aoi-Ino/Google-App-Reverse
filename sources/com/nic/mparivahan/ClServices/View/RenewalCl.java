package com.nic.mparivahan.ClServices.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.R;
import ld.c;
import ld.f;
import ni.l7;
import p9.g3;
import p9.h3;
import p9.i3;
import p9.j3;
import p9.k3;
import p9.l3;
import p9.m3;
import p9.n3;
import p9.o3;
import p9.p3;
import pl.x;
import v9.e;

public final class RenewalCl extends d {
    public l7 G;
    public Context H;
    public c I;
    public ProgressDialog J;
    public t9.a K;
    public ClInter L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public f V;
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalCl f8016e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RenewalCl renewalCl) {
            super(1);
            this.f8016e = renewalCl;
        }

        public final void b(ServiceSubmitResponse serviceSubmitResponse) {
            RenewalCl renewalCl;
            c H1;
            this.f8016e.D1().dismiss();
            try {
                if (p.o(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        renewalCl = this.f8016e;
                        H1 = renewalCl.H1();
                    } else {
                        try {
                            Intent intent = new Intent(this.f8016e, ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", this.f8016e.u1());
                            intent.putExtra("dobValue", this.f8016e.v1());
                            intent.putExtra("fatherName", this.f8016e.w1());
                            intent.putExtra("clName", this.f8016e.r1());
                            intent.putExtra("clPhoto", this.f8016e.s1());
                            intent.putExtra("stateCode", this.f8016e.I1());
                            intent.putExtra("rtoCode", this.f8016e.E1());
                            intent.putExtra("rtoName", this.f8016e.F1());
                            intent.putExtra("Mobile_no", this.f8016e.B1());
                            intent.putExtra("address", this.f8016e.q1()).toString();
                            intent.putExtra("issuing_authority", this.f8016e.x1()).toString();
                            intent.putExtra("validity", this.f8016e.J1()).toString();
                            intent.putExtra("cl_Status", this.f8016e.t1()).toString();
                            this.f8016e.startActivity(intent);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                } else if (p.o(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    this.f8016e.W1(serviceSubmitResponse.getStatus_desc());
                    return;
                } else {
                    renewalCl = this.f8016e;
                    H1 = renewalCl.H1();
                }
                renewalCl.W1(H1.b("service_is_not_present", "Something went wrong, Try after some time"));
            } catch (Exception unused2) {
                RenewalCl renewalCl2 = this.f8016e;
                renewalCl2.W1(renewalCl2.H1().b("service_is_not_present", "Something went wrong, Try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ServiceSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8017a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f8017a = lVar;
        }

        public final pl.c a() {
            return this.f8017a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8017a.invoke(obj);
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

    private final void K1() {
        f2(this);
        m2(new c(A1()));
        l2(new f(A1()));
        i2(new ProgressDialog(A1()));
        D1().setMessage(H1().b("label_challan_please_wait", getString(R.string.please_wait)));
        D1().setCancelable(false);
        D1().setCanceledOnTouchOutside(false);
        try {
            b2(String.valueOf(getIntent().getStringExtra("dobValue")));
            a2(String.valueOf(getIntent().getStringExtra("dlValue")));
            c2(String.valueOf(getIntent().getStringExtra("fatherName")));
            Y1(String.valueOf(getIntent().getStringExtra("clName")));
            Z1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            j2(String.valueOf(getIntent().getStringExtra("rtoCode")));
            k2(String.valueOf(getIntent().getStringExtra("rtoName")));
            n2(String.valueOf(getIntent().getStringExtra("stateCode")));
            g2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            TextView textView = C1().E;
            textView.setText(H1().b("CL_NO", "CL No.") + ' ' + u1());
            C1().A.f25961g.setText(G1().i());
            this.W = String.valueOf(getIntent().getStringExtra("address"));
            this.X = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.Y = String.valueOf(getIntent().getStringExtra("validity"));
            this.Z = String.valueOf(getIntent().getStringExtra("cl_Status"));
            String s12 = s1();
            if (s12 != null) {
                if (s12.length() != 0) {
                    C1().A.f25960f.setVisibility(0);
                    C1().A.f25956b.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(s1()));
                    e2(ClInter.f7830a.a(A1()));
                    d2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(z1()))).a(t9.a.class));
                    y1().l().g(this, new n3(this));
                    y1().s().g(this, new b(new a(this)));
                }
            }
            C1().A.f25960f.setVisibility(8);
        } catch (Exception unused) {
        }
        e2(ClInter.f7830a.a(A1()));
        d2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(z1()))).a(t9.a.class));
        y1().l().g(this, new n3(this));
        y1().s().g(this, new b(new a(this)));
    }

    /* access modifiers changed from: private */
    public static final void L1(RenewalCl renewalCl, String str) {
        cm.l.f(renewalCl, "this$0");
        renewalCl.D1().dismiss();
        String b10 = renewalCl.H1().b("label_unable_details", renewalCl.getString(R.string.unable_to_get_details));
        cm.l.c(b10);
        renewalCl.W1(b10);
    }

    private final void M1() {
        C1().B.f29580g.setText(G1().i());
        C1().B.f29581h.setPaintFlags(C1().B.f29581h.getPaintFlags() | 8);
        TextView textView = C1().B.f29581h;
        String u12 = u1();
        cm.l.c(u12);
        textView.setText(q.B0(u12).toString());
        C1().B.f29581h.setOnClickListener(new o3(this));
    }

    /* access modifiers changed from: private */
    public static final void N1(RenewalCl renewalCl, View view) {
        cm.l.f(renewalCl, "this$0");
        try {
            Intent intent = new Intent(renewalCl, ClDetailsTop.class);
            intent.putExtra("dlValue", renewalCl.u1());
            intent.putExtra("dobValue", renewalCl.v1());
            intent.putExtra("fatherName", renewalCl.w1());
            intent.putExtra("clName", renewalCl.r1());
            intent.putExtra("clPhoto", renewalCl.s1());
            intent.putExtra("address", renewalCl.W).toString();
            intent.putExtra("issuing_authority", renewalCl.X).toString();
            intent.putExtra("validity", renewalCl.Y).toString();
            intent.putExtra("cl_Status", renewalCl.Z).toString();
            renewalCl.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(RenewalCl renewalCl, View view) {
        cm.l.f(renewalCl, "this$0");
        renewalCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void P1(RenewalCl renewalCl, View view) {
        cm.l.f(renewalCl, "this$0");
        renewalCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void Q1(RenewalCl renewalCl, View view) {
        cm.l.f(renewalCl, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(renewalCl)) {
            renewalCl.T1(renewalCl.A1(), renewalCl.H1().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
        } else {
            Toast.makeText(renewalCl.A1(), "Please Check Your Internet connection", 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(RenewalCl renewalCl, View view) {
        cm.l.f(renewalCl, "this$0");
        renewalCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void S1(RenewalCl renewalCl, View view) {
        cm.l.f(renewalCl, "this$0");
        Intent intent = new Intent(renewalCl, ClDetailsTop.class);
        intent.putExtra("dlValue", renewalCl.u1());
        intent.putExtra("dobValue", renewalCl.v1());
        intent.putExtra("fatherName", renewalCl.w1());
        intent.putExtra("clName", renewalCl.r1());
        intent.putExtra("clPhoto", renewalCl.s1());
        intent.putExtra("address", renewalCl.W).toString();
        intent.putExtra("issuing_authority", renewalCl.X).toString();
        intent.putExtra("validity", renewalCl.Y).toString();
        intent.putExtra("cl_Status", renewalCl.Z).toString();
        renewalCl.startActivity(intent);
        renewalCl.finish();
    }

    private final void T1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(H1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(H1().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(H1().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new l3(dialog));
        textView.setOnClickListener(new m3(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void V1(Dialog dialog, RenewalCl renewalCl, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(renewalCl, "this$0");
        dialog.dismiss();
        renewalCl.D1().show();
        renewalCl.y1().v(renewalCl, renewalCl.I1(), renewalCl.E1(), "552", renewalCl.u1(), renewalCl.v1());
    }

    /* access modifiers changed from: private */
    public final void W1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(H1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(H1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(H1().b("btn_ok", "OK"));
        textView.setOnClickListener(new p3(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void X1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final Context A1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final String B1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("Mobile_no");
        return null;
    }

    public final l7 C1() {
        l7 l7Var = this.G;
        if (l7Var != null) {
            return l7Var;
        }
        cm.l.v("msBinding");
        return null;
    }

    public final ProgressDialog D1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String E1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final String F1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final f G1() {
        f fVar = this.V;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final c H1() {
        c cVar = this.I;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final String I1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    public final String J1() {
        return this.Y;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void a2(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void b2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void d2(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.K = aVar;
    }

    public final void e2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.L = clInter;
    }

    public final void f2(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void h2(l7 l7Var) {
        cm.l.f(l7Var, "<set-?>");
        this.G = l7Var;
    }

    public final void i2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void j2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void k2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void l2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.V = fVar;
    }

    public final void m2(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.I = cVar;
    }

    public final void n2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_renewal_cl);
        l7 x10 = l7.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        h2(x10);
        setContentView(C1().m());
        K1();
        e.f17509a.D1(this, C1());
        C1().A.f25959e.setOnClickListener(new g3(this));
        C1().B.f29577d.setOnClickListener(new h3(this));
        C1().f27278y.setOnClickListener(new i3(this));
        C1().f27277x.setOnClickListener(new j3(this));
        C1().H.setOnClickListener(new k3(this));
        M1();
    }

    public final String q1() {
        return this.W;
    }

    public final String r1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("clName");
        return null;
    }

    public final String s1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("clPhoto");
        return null;
    }

    public final String t1() {
        return this.Z;
    }

    public final String u1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final String v1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final String w1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("fatherName");
        return null;
    }

    public final String x1() {
        return this.X;
    }

    public final t9.a y1() {
        t9.a aVar = this.K;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final ClInter z1() {
        ClInter clInter = this.L;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }
}
