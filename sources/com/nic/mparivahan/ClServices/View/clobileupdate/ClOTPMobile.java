package com.nic.mparivahan.ClServices.View.clobileupdate;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import ni.v0;
import pl.x;

public final class ClOTPMobile extends oi.g {
    public v0 J;
    public ba.b K;
    /* access modifiers changed from: private */
    public vj.a L;
    public DlServiceInt M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    public ld.g S;
    public ld.c T;
    public ProgressDialog U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8045e;

        /* renamed from: com.nic.mparivahan.ClServices.View.clobileupdate.ClOTPMobile$a$a  reason: collision with other inner class name */
        static final class C0111a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0111a f8046e = new C0111a();

            C0111a() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClOTPMobile clOTPMobile) {
            super(1);
            this.f8045e = clOTPMobile;
        }

        public final void b(SendOtpResult sendOtpResult) {
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f8045e.d2(String.valueOf(sendOtpResult.getRecordId()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f8045e, sendOtpResult.getStatusDesc());
                } else {
                    ClOTPMobile clOTPMobile = this.f8045e;
                    String b10 = clOTPMobile.G1().b("nex_parivahan", this.f8045e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String b11 = this.f8045e.G1().b("btn_ok", this.f8045e.getString(R.string.ok_txt));
                    cm.l.c(b11);
                    oi.g.n1(clOTPMobile, b10, statusDesc, 1, b11, (String) null, C0111a.f8046e, 16, (Object) null);
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8047e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f8048e = new a();

            a() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ClOTPMobile clOTPMobile) {
            super(1);
            this.f8047e = clOTPMobile;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ClOTPMobile clOTPMobile = this.f8047e;
                    String b10 = clOTPMobile.G1().b("label_want_to_proceed", "Are you sure, You want to proceed ?");
                    cm.l.c(b10);
                    clOTPMobile.X1(b10);
                    return;
                }
                ClOTPMobile clOTPMobile2 = this.f8047e;
                String b11 = clOTPMobile2.G1().b("nex_parivahan", this.f8047e.getString(R.string.app_name));
                cm.l.c(b11);
                String statusDesc = otpVerifyResult.getStatusDesc();
                cm.l.c(statusDesc);
                String b12 = this.f8047e.G1().b("btn_ok", this.f8047e.getString(R.string.ok_txt));
                cm.l.c(b12);
                oi.g.n1(clOTPMobile2, b11, statusDesc, 1, b12, (String) null, a.f8048e, 16, (Object) null);
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8049e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f8050e = new a();

            a() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ClOTPMobile clOTPMobile) {
            super(1);
            this.f8049e = clOTPMobile;
        }

        public final void b(String str) {
            this.f8049e.J1().dismiss();
            ClOTPMobile clOTPMobile = this.f8049e;
            String b10 = clOTPMobile.G1().b("nex_parivahan", this.f8049e.getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = this.f8049e.G1().b("service_is_not_present", this.f8049e.getString(R.string.unable_to_get_details));
            cm.l.c(b11);
            String b12 = this.f8049e.G1().b("btn_ok", this.f8049e.getString(R.string.ok_txt));
            cm.l.c(b12);
            oi.g.n1(clOTPMobile, b10, b11, 1, b12, (String) null, a.f8050e, 16, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8051e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f8052e = new a();

            a() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        static final class b extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final b f8053e = new b();

            b() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        static final class c extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final c f8054e = new c();

            c() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        /* renamed from: com.nic.mparivahan.ClServices.View.clobileupdate.ClOTPMobile$d$d  reason: collision with other inner class name */
        static final class C0112d extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0112d f8055e = new C0112d();

            C0112d() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ClOTPMobile clOTPMobile) {
            super(1);
            this.f8051e = clOTPMobile;
        }

        public final void b(ResendOtp resendOtp) {
            this.f8051e.J1().dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    ClOTPMobile clOTPMobile = this.f8051e;
                    String b10 = clOTPMobile.G1().b("nex_parivahan", this.f8051e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String b11 = this.f8051e.G1().b("btn_ok", "OK");
                    cm.l.c(b11);
                    oi.g.n1(clOTPMobile, b10, "OTP has been resent successfully.", 1, b11, (String) null, a.f8052e, 16, (Object) null);
                } else if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    ClOTPMobile clOTPMobile2 = this.f8051e;
                    String b12 = clOTPMobile2.G1().b("nex_parivahan", this.f8051e.getString(R.string.app_name));
                    cm.l.c(b12);
                    String statusDesc = resendOtp.getStatusDesc();
                    String b13 = this.f8051e.G1().b("btn_ok", this.f8051e.getString(R.string.ok_txt));
                    cm.l.c(b13);
                    oi.g.n1(clOTPMobile2, b12, statusDesc, 1, b13, (String) null, b.f8053e, 16, (Object) null);
                } else {
                    ClOTPMobile clOTPMobile3 = this.f8051e;
                    String b14 = clOTPMobile3.G1().b("nex_parivahan", this.f8051e.getString(R.string.app_name));
                    cm.l.c(b14);
                    String statusDesc2 = resendOtp.getStatusDesc();
                    String b15 = this.f8051e.G1().b("btn_ok", this.f8051e.getString(R.string.ok_txt));
                    cm.l.c(b15);
                    oi.g.n1(clOTPMobile3, b14, statusDesc2, 1, b15, (String) null, c.f8054e, 16, (Object) null);
                }
            } catch (Exception unused) {
                ClOTPMobile clOTPMobile4 = this.f8051e;
                String b16 = clOTPMobile4.G1().b("nex_parivahan", this.f8051e.getString(R.string.app_name));
                cm.l.c(b16);
                String b17 = this.f8051e.G1().b("service_is_not_present", this.f8051e.getString(R.string.unable_to_get_details));
                cm.l.c(b17);
                String b18 = this.f8051e.G1().b("btn_ok", this.f8051e.getString(R.string.ok_txt));
                cm.l.c(b18);
                oi.g.n1(clOTPMobile4, b16, b17, 1, b18, (String) null, C0112d.f8055e, 16, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8056e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ClOTPMobile clOTPMobile) {
            super(1);
            this.f8056e = clOTPMobile;
        }

        public final void b(DlUpdateMobResponse dlUpdateMobResponse) {
            try {
                this.f8056e.C1().M.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null) {
                    if (errno.intValue() == 1) {
                        ClOTPMobile clOTPMobile = this.f8056e;
                        clOTPMobile.U1(clOTPMobile, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                        return;
                    }
                }
                String errmsg = dlUpdateMobResponse.getErrmsg();
                if (errmsg != null) {
                    this.f8056e.W1(errmsg);
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlUpdateMobResponse) obj);
            return x.f30437a;
        }
    }

    public static final class f extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8057a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ClOTPMobile clOTPMobile) {
            super(30000, 1000);
            this.f8057a = clOTPMobile;
        }

        public void onFinish() {
            this.f8057a.C1().I.setVisibility(0);
            this.f8057a.C1().N.setText("0");
            this.f8057a.C1().N.setVisibility(8);
        }

        public void onTick(long j10) {
            MyTextView myTextView = this.f8057a.C1().N;
            myTextView.setText(this.f8057a.G1().b("time_remaining", this.f8057a.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f8057a.C1().I.setVisibility(8);
            this.f8057a.C1().N.setVisibility(0);
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f8058e = new g();

        g() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final h f8059e = new h();

        h() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8060e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ClOTPMobile clOTPMobile) {
            super(1);
            this.f8060e = clOTPMobile;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            this.f8060e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClOTPMobile f8061e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ClOTPMobile clOTPMobile) {
            super(1);
            this.f8061e = clOTPMobile;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            if (p.o(str, "yes", true)) {
                this.f8061e.C1().M.c(true);
                String I1 = this.f8061e.I1();
                if (I1 != null && I1.length() == 0) {
                    this.f8061e.b2("0");
                }
                vj.a A1 = this.f8061e.L;
                if (A1 == null) {
                    cm.l.v("updateMobVm");
                    A1 = null;
                }
                String F1 = this.f8061e.F1();
                cm.l.c(F1);
                String I12 = this.f8061e.I1();
                cm.l.c(I12);
                String D1 = this.f8061e.D1();
                cm.l.c(D1);
                String H1 = this.f8061e.H1();
                cm.l.c(H1);
                A1.k(F1, "CL", I12, true, D1, H1);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class k implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8062a;

        k(l lVar) {
            cm.l.f(lVar, "function");
            this.f8062a = lVar;
        }

        public final pl.c a() {
            return this.f8062a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8062a.invoke(obj);
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

    private final void M1() {
        c2(new ProgressDialog(this));
        J1().setMessage(G1().b("label_challan_please_wait", "Please wait..."));
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        try {
            this.O = String.valueOf(getIntent().getStringExtra("dobValue"));
            this.N = String.valueOf(getIntent().getStringExtra("dlValue"));
            this.P = String.valueOf(getIntent().getStringExtra("mobileNumber"));
            this.Q = String.valueOf(getIntent().getStringExtra("old_mobile"));
            C1().G.setText(this.P);
            f2(new ld.g(this));
            C1().L.setText(G1().b("label_dl_serv_update_mob", "Update Mobile Number"));
            C1().f28948z.setText(this.N);
            TextView textView = C1().f28947y;
            textView.setText(G1().b("CL_NO", "CL No.") + " : " + this.N);
            C1().D.f25961g.setText(G1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        } catch (Exception unused) {
        }
    }

    private final void N1() {
        Z1((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(K1(), this))).a(ba.b.class));
        String str = this.P;
        if (str != null) {
            E1().F(this, str, L1().k());
        }
        E1().u().g(this, new k(new a(this)));
        E1().E().g(this, new k(new b(this)));
        E1().v().g(this, new k(new c(this)));
        E1().w().g(this, new k(new d(this)));
    }

    private final void O1() {
        vj.a aVar = (vj.a) new u0(this).a(vj.a.class);
        this.L = aVar;
        if (aVar == null) {
            cm.l.v("updateMobVm");
            aVar = null;
        }
        aVar.i().g(this, new k(new e(this)));
    }

    private final void P1() {
        C1().D.f25959e.setOnClickListener(new s9.e(this));
        C1().I.setOnClickListener(new s9.f(this));
        C1().M.setOnClickListener(new s9.g(this));
        C1().J.setOnClickListener(new s9.h(this));
    }

    /* access modifiers changed from: private */
    public static final void Q1(ClOTPMobile clOTPMobile, View view) {
        cm.l.f(clOTPMobile, "this$0");
        clOTPMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void R1(ClOTPMobile clOTPMobile, View view) {
        cm.l.f(clOTPMobile, "this$0");
        clOTPMobile.J1().show();
        clOTPMobile.E1().D(clOTPMobile, String.valueOf(clOTPMobile.R));
        new f(clOTPMobile).start();
    }

    /* access modifiers changed from: private */
    public static final void S1(ClOTPMobile clOTPMobile, View view) {
        String b10;
        String b11;
        int i10;
        String b12;
        String str;
        l lVar;
        cm.l.f(clOTPMobile, "this$0");
        Editable text = clOTPMobile.C1().A.getText();
        cm.l.c(text);
        if (text.length() == 0) {
            b10 = clOTPMobile.G1().b("nex_parivahan", clOTPMobile.getString(R.string.app_name));
            cm.l.c(b10);
            b11 = clOTPMobile.G1().b("enter_otp", "Please enter OTP");
            cm.l.c(b11);
            i10 = 1;
            b12 = clOTPMobile.G1().b("btn_ok", clOTPMobile.getString(R.string.ok_txt));
            cm.l.c(b12);
            str = null;
            lVar = g.f8058e;
        } else {
            Editable text2 = clOTPMobile.C1().A.getText();
            cm.l.c(text2);
            if (text2.length() < 6) {
                b10 = clOTPMobile.G1().b("nex_parivahan", clOTPMobile.getString(R.string.app_name));
                cm.l.c(b10);
                b11 = clOTPMobile.G1().b("enter_valid_otp", "Please enter the valid OTP");
                cm.l.c(b11);
                i10 = 1;
                b12 = clOTPMobile.G1().b("btn_ok", clOTPMobile.getString(R.string.ok_txt));
                cm.l.c(b12);
                str = null;
                lVar = h.f8059e;
            } else {
                ba.b E1 = clOTPMobile.E1();
                String valueOf = String.valueOf(clOTPMobile.C1().A.getText());
                String str2 = clOTPMobile.R;
                cm.l.c(str2);
                E1.G(clOTPMobile, valueOf, str2);
                return;
            }
        }
        oi.g.n1(clOTPMobile, b10, b11, i10, b12, str, lVar, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void T1(ClOTPMobile clOTPMobile, View view) {
        cm.l.f(clOTPMobile, "this$0");
        clOTPMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void V1(ProgressBar progressBar, ClOTPMobile clOTPMobile, View view) {
        cm.l.f(progressBar, "$pb_otp");
        cm.l.f(clOTPMobile, "this$0");
        progressBar.setVisibility(0);
        Toast.makeText(clOTPMobile.getApplicationContext(), clOTPMobile.G1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
        Intent intent = new Intent(clOTPMobile, DashBoard.class);
        intent.setFlags(67141632);
        clOTPMobile.startActivity(intent);
        clOTPMobile.finish();
    }

    /* access modifiers changed from: private */
    public final void X1(String str) {
        String b10 = G1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        oi.g.n1(this, b10, str, 0, (String) null, (String) null, new j(this), 24, (Object) null);
    }

    public final v0 C1() {
        v0 v0Var = this.J;
        if (v0Var != null) {
            return v0Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final String D1() {
        return this.N;
    }

    public final ba.b E1() {
        ba.b bVar = this.K;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final String F1() {
        return this.O;
    }

    public final ld.c G1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String H1() {
        return this.P;
    }

    public final String I1() {
        return this.Q;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.U;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlServiceInt K1() {
        DlServiceInt dlServiceInt = this.M;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ld.g L1() {
        ld.g gVar = this.S;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void U1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_otp_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pb_otp);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ProgressBar");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        progressBar.setVisibility(8);
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(G1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(G1().b("btn_ok", "OK"));
        textView.setOnClickListener(new s9.d(progressBar, this));
        dialog.show();
    }

    public final void W1(String str) {
        cm.l.f(str, "message");
        String b10 = G1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = G1().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        oi.g.n1(this, b10, str, 1, b11, (String) null, new i(this), 16, (Object) null);
    }

    public final void Y1(v0 v0Var) {
        cm.l.f(v0Var, "<set-?>");
        this.J = v0Var;
    }

    public final void Z1(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.K = bVar;
    }

    public final void a2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void b2(String str) {
        this.Q = str;
    }

    public final void c2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.U = progressDialog;
    }

    public final void d2(String str) {
        this.R = str;
    }

    public final void e2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.M = dlServiceInt;
    }

    public final void f2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.S = gVar;
    }

    public final void g2(Context context, String str, String str2, String str3, String str4) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile");
        cm.l.f(str2, "oldMobile");
        cm.l.f(str3, "clNo");
        cm.l.f(str4, "dob");
        Intent intent = new Intent(context, ClOTPMobile.class);
        intent.putExtra("mobileNumber", str);
        intent.putExtra("old_mobile", str2);
        intent.putExtra("dlValue", str3);
        intent.putExtra("dobValue", str4);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_cl_otpmobile);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_cl_otpmobile);
        cm.l.e(f10, "setContentView(...)");
        Y1((v0) f10);
        e2(DlServiceInt.f21675a.a(this));
        a2(new ld.c(this));
        M1();
        N1();
        O1();
        P1();
    }
}
