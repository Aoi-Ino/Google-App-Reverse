package com.nic.mparivahan.ClServices.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
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
import ni.b4;
import p9.a3;
import p9.b3;
import p9.c3;
import p9.d3;
import p9.e3;
import p9.f3;
import p9.w2;
import p9.x2;
import p9.y2;
import p9.z2;
import pl.x;
import v9.e;

public final class DuplicateCl extends d {
    private b4 G;
    public Context H;
    public ProgressDialog I;
    public c J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public f T;
    public t9.a U;
    public ClInter V;
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateCl f7944e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DuplicateCl duplicateCl) {
            super(1);
            this.f7944e = duplicateCl;
        }

        public final void b(ServiceSubmitResponse serviceSubmitResponse) {
            DuplicateCl duplicateCl;
            c G1;
            this.f7944e.C1().dismiss();
            try {
                if (p.o(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        duplicateCl = this.f7944e;
                        G1 = duplicateCl.G1();
                    } else {
                        try {
                            Intent intent = new Intent(this.f7944e, ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", this.f7944e.u1());
                            intent.putExtra("dobValue", this.f7944e.v1());
                            intent.putExtra("fatherName", this.f7944e.w1());
                            intent.putExtra("clName", this.f7944e.r1());
                            intent.putExtra("clPhoto", this.f7944e.s1());
                            intent.putExtra("stateCode", this.f7944e.H1());
                            intent.putExtra("rtoCode", this.f7944e.D1());
                            intent.putExtra("rtoName", this.f7944e.E1());
                            intent.putExtra("Mobile_no", this.f7944e.B1());
                            intent.putExtra("address", this.f7944e.q1()).toString();
                            intent.putExtra("issuing_authority", this.f7944e.x1()).toString();
                            intent.putExtra("validity", this.f7944e.I1()).toString();
                            intent.putExtra("cl_Status", this.f7944e.t1()).toString();
                            this.f7944e.startActivity(intent);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                } else if (p.o(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    this.f7944e.V1(serviceSubmitResponse.getStatus_desc());
                    return;
                } else {
                    duplicateCl = this.f7944e;
                    G1 = duplicateCl.G1();
                }
                duplicateCl.V1(G1.b("service_is_not_present", "Something went wrong, Try after some time"));
            } catch (Exception unused2) {
                DuplicateCl duplicateCl2 = this.f7944e;
                duplicateCl2.V1(duplicateCl2.G1().b("service_is_not_present", "Something went wrong, Try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ServiceSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7945a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f7945a = lVar;
        }

        public final pl.c a() {
            return this.f7945a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7945a.invoke(obj);
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

    private final void J1() {
        e2(this);
        k2(new c(A1()));
        j2(new f(A1()));
        g2(new ProgressDialog(A1()));
        C1().setMessage(G1().b("label_challan_please_wait", getString(R.string.please_wait)));
        C1().setCancelable(false);
        C1().setCanceledOnTouchOutside(false);
        try {
            a2(String.valueOf(getIntent().getStringExtra("dobValue")));
            Z1(String.valueOf(getIntent().getStringExtra("dlValue")));
            b2(String.valueOf(getIntent().getStringExtra("fatherName")));
            X1(String.valueOf(getIntent().getStringExtra("clName")));
            Y1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            h2(String.valueOf(getIntent().getStringExtra("rtoCode")));
            i2(String.valueOf(getIntent().getStringExtra("rtoName")));
            l2(String.valueOf(getIntent().getStringExtra("stateCode")));
            f2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            this.W = String.valueOf(getIntent().getStringExtra("address"));
            this.X = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.Y = String.valueOf(getIntent().getStringExtra("validity"));
            this.Z = String.valueOf(getIntent().getStringExtra("cl_Status"));
            b4 b4Var = this.G;
            b4 b4Var2 = null;
            if (b4Var == null) {
                cm.l.v("duplicateClBinding");
                b4Var = null;
            }
            b4Var.A.f25961g.setText(F1().i());
            b4 b4Var3 = this.G;
            if (b4Var3 == null) {
                cm.l.v("duplicateClBinding");
                b4Var3 = null;
            }
            b4Var3.F.setText(G1().b("CL_NO", "CL No.") + ' ' + u1());
            String s12 = s1();
            if (s12 != null) {
                if (s12.length() != 0) {
                    b4 b4Var4 = this.G;
                    if (b4Var4 == null) {
                        cm.l.v("duplicateClBinding");
                        b4Var4 = null;
                    }
                    b4Var4.A.f25960f.setVisibility(0);
                    b4 b4Var5 = this.G;
                    if (b4Var5 == null) {
                        cm.l.v("duplicateClBinding");
                    } else {
                        b4Var2 = b4Var5;
                    }
                    b4Var2.A.f25956b.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(s1()));
                    d2(ClInter.f7830a.a(A1()));
                    c2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(z1()))).a(t9.a.class));
                }
            }
            b4 b4Var6 = this.G;
            if (b4Var6 == null) {
                cm.l.v("duplicateClBinding");
            } else {
                b4Var2 = b4Var6;
            }
            b4Var2.A.f25960f.setVisibility(8);
        } catch (Exception unused) {
        }
        d2(ClInter.f7830a.a(A1()));
        c2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(z1()))).a(t9.a.class));
    }

    private final void K1() {
        b4 b4Var = this.G;
        b4 b4Var2 = null;
        if (b4Var == null) {
            cm.l.v("duplicateClBinding");
            b4Var = null;
        }
        b4Var.B.f29581h.setText(q.B0(u1()).toString());
        b4 b4Var3 = this.G;
        if (b4Var3 == null) {
            cm.l.v("duplicateClBinding");
            b4Var3 = null;
        }
        TextView textView = b4Var3.B.f29581h;
        b4 b4Var4 = this.G;
        if (b4Var4 == null) {
            cm.l.v("duplicateClBinding");
            b4Var4 = null;
        }
        textView.setPaintFlags(b4Var4.B.f29581h.getPaintFlags() | 8);
        b4 b4Var5 = this.G;
        if (b4Var5 == null) {
            cm.l.v("duplicateClBinding");
            b4Var5 = null;
        }
        b4Var5.B.f29580g.setText(F1().i());
        b4 b4Var6 = this.G;
        if (b4Var6 == null) {
            cm.l.v("duplicateClBinding");
        } else {
            b4Var2 = b4Var6;
        }
        b4Var2.B.f29581h.setOnClickListener(new e3(this));
    }

    /* access modifiers changed from: private */
    public static final void L1(DuplicateCl duplicateCl, View view) {
        cm.l.f(duplicateCl, "this$0");
        try {
            Intent intent = new Intent(duplicateCl, ClDetailsTop.class);
            intent.putExtra("dlValue", duplicateCl.u1());
            intent.putExtra("dobValue", duplicateCl.v1());
            intent.putExtra("fatherName", duplicateCl.w1());
            intent.putExtra("clName", duplicateCl.r1());
            intent.putExtra("clPhoto", duplicateCl.s1());
            intent.putExtra("address", duplicateCl.W).toString();
            intent.putExtra("issuing_authority", duplicateCl.X).toString();
            intent.putExtra("validity", duplicateCl.Y).toString();
            intent.putExtra("cl_Status", duplicateCl.Z).toString();
            duplicateCl.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void M1(DuplicateCl duplicateCl, View view) {
        cm.l.f(duplicateCl, "this$0");
        duplicateCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void N1(DuplicateCl duplicateCl, View view) {
        cm.l.f(duplicateCl, "this$0");
        duplicateCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void O1(DuplicateCl duplicateCl, View view) {
        cm.l.f(duplicateCl, "this$0");
        duplicateCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void P1(DuplicateCl duplicateCl, View view) {
        cm.l.f(duplicateCl, "this$0");
        b4 b4Var = duplicateCl.G;
        if (b4Var == null) {
            cm.l.v("duplicateClBinding");
            b4Var = null;
        }
        Editable text = b4Var.f25446w.getText();
        if (text == null || text.length() == 0) {
            duplicateCl.V1(duplicateCl.G1().b("label_dl_serv_enter_reas_manul", duplicateCl.getString(R.string.enter_Reason)));
        } else if (com.nic.mparivahan.a.f9624a.a(duplicateCl)) {
            duplicateCl.S1(duplicateCl.A1(), duplicateCl.G1().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
        } else {
            Toast.makeText(duplicateCl.A1(), "Please Check Your Internet connection", 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(DuplicateCl duplicateCl, String str) {
        cm.l.f(duplicateCl, "this$0");
        duplicateCl.C1().dismiss();
        String b10 = duplicateCl.G1().b("label_unable_details", duplicateCl.getString(R.string.unable_to_get_details));
        cm.l.c(b10);
        duplicateCl.V1(b10);
    }

    /* access modifiers changed from: private */
    public static final void R1(DuplicateCl duplicateCl, View view) {
        cm.l.f(duplicateCl, "this$0");
        Intent intent = new Intent(duplicateCl, ClDetailsTop.class);
        intent.putExtra("dlValue", duplicateCl.u1());
        intent.putExtra("dobValue", duplicateCl.v1());
        intent.putExtra("fatherName", duplicateCl.w1());
        intent.putExtra("clName", duplicateCl.r1());
        intent.putExtra("clPhoto", duplicateCl.s1());
        intent.putExtra("address", duplicateCl.W).toString();
        intent.putExtra("issuing_authority", duplicateCl.X).toString();
        intent.putExtra("validity", duplicateCl.Y).toString();
        intent.putExtra("cl_Status", duplicateCl.Z).toString();
        duplicateCl.startActivity(intent);
        duplicateCl.finish();
    }

    private final void S1(Context context, String str) {
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
        ((TextView) findViewById4).setText(G1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(G1().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(G1().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new c3(dialog));
        textView.setOnClickListener(new d3(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, DuplicateCl duplicateCl, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(duplicateCl, "this$0");
        dialog.dismiss();
        if (com.nic.mparivahan.a.f9624a.a(duplicateCl)) {
            duplicateCl.C1().show();
            duplicateCl.y1().v(duplicateCl, duplicateCl.H1(), duplicateCl.D1(), "554", duplicateCl.u1(), duplicateCl.v1());
            return;
        }
        Toast.makeText(duplicateCl.A1(), duplicateCl.G1().b("label_log_check_internet", duplicateCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public final void V1(String str) {
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
        textView.setText(G1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(G1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(G1().b("btn_ok", "OK"));
        textView.setOnClickListener(new f3(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, View view) {
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
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("Mobile_no");
        return null;
    }

    public final ProgressDialog C1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String D1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final String E1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final f F1() {
        f fVar = this.T;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final c G1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final String H1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    public final String I1() {
        return this.Y;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void a2(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void b2(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void c2(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.U = aVar;
    }

    public final void d2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.V = clInter;
    }

    public final void e2(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void g2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void h2(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void i2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void j2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.T = fVar;
    }

    public final void k2(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void l2(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b4 x10 = b4.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        b4 b4Var = null;
        if (x10 == null) {
            cm.l.v("duplicateClBinding");
            x10 = null;
        }
        setContentView(x10.m());
        J1();
        e.a aVar = e.f17509a;
        b4 b4Var2 = this.G;
        if (b4Var2 == null) {
            cm.l.v("duplicateClBinding");
            b4Var2 = null;
        }
        aVar.D0(this, b4Var2);
        b4 b4Var3 = this.G;
        if (b4Var3 == null) {
            cm.l.v("duplicateClBinding");
            b4Var3 = null;
        }
        b4Var3.B.f29577d.setOnClickListener(new w2(this));
        b4 b4Var4 = this.G;
        if (b4Var4 == null) {
            cm.l.v("duplicateClBinding");
            b4Var4 = null;
        }
        b4Var4.C.setOnClickListener(new x2(this));
        b4 b4Var5 = this.G;
        if (b4Var5 == null) {
            cm.l.v("duplicateClBinding");
            b4Var5 = null;
        }
        b4Var5.A.f25959e.setOnClickListener(new y2(this));
        b4 b4Var6 = this.G;
        if (b4Var6 == null) {
            cm.l.v("duplicateClBinding");
            b4Var6 = null;
        }
        b4Var6.f25448y.setOnClickListener(new z2(this));
        y1().l().g(this, new a3(this));
        y1().s().g(this, new b(new a(this)));
        b4 b4Var7 = this.G;
        if (b4Var7 == null) {
            cm.l.v("duplicateClBinding");
        } else {
            b4Var = b4Var7;
        }
        b4Var.I.setOnClickListener(new b3(this));
        K1();
    }

    public final String q1() {
        return this.W;
    }

    public final String r1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("clName");
        return null;
    }

    public final String s1() {
        String str = this.O;
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
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final String v1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final String w1() {
        String str = this.M;
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
        t9.a aVar = this.U;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final ClInter z1() {
        ClInter clInter = this.V;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }
}
