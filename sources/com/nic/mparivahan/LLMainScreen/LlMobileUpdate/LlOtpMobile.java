package com.nic.mparivahan.LLMainScreen.LlMobileUpdate;

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
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.io.Serializable;
import ni.t5;
import pl.x;

public final class LlOtpMobile extends oi.g {
    public t5 J;
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
    public FetchLlDetails U;
    public ProgressDialog V;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlOtpMobile f8979e;

        /* renamed from: com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlOtpMobile$a$a  reason: collision with other inner class name */
        static final class C0117a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0117a f8980e = new C0117a();

            C0117a() {
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
        a(LlOtpMobile llOtpMobile) {
            super(1);
            this.f8979e = llOtpMobile;
        }

        public final void b(SendOtpResult sendOtpResult) {
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f8979e.f2(String.valueOf(sendOtpResult.getRecordId()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f8979e, sendOtpResult.getStatusDesc());
                } else {
                    LlOtpMobile llOtpMobile = this.f8979e;
                    String b10 = llOtpMobile.F1().b("nex_parivahan", this.f8979e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String b11 = this.f8979e.F1().b("btn_ok", this.f8979e.getString(R.string.ok_txt));
                    cm.l.c(b11);
                    oi.g.n1(llOtpMobile, b10, statusDesc, 1, b11, (String) null, C0117a.f8980e, 16, (Object) null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlOtpMobile f8981e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f8982e = new a();

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
        b(LlOtpMobile llOtpMobile) {
            super(1);
            this.f8981e = llOtpMobile;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    LlOtpMobile llOtpMobile = this.f8981e;
                    String b10 = llOtpMobile.F1().b("label_want_to_proceed", "Are you sure, You want to proceed ?");
                    cm.l.c(b10);
                    llOtpMobile.Y1(b10);
                    return;
                }
                LlOtpMobile llOtpMobile2 = this.f8981e;
                String b11 = llOtpMobile2.F1().b("nex_parivahan", this.f8981e.getString(R.string.app_name));
                cm.l.c(b11);
                String statusDesc = otpVerifyResult.getStatusDesc();
                cm.l.c(statusDesc);
                String b12 = this.f8981e.F1().b("btn_ok", this.f8981e.getString(R.string.ok_txt));
                cm.l.c(b12);
                oi.g.n1(llOtpMobile2, b11, statusDesc, 1, b12, (String) null, a.f8982e, 16, (Object) null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlOtpMobile f8983e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f8984e = new a();

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
        c(LlOtpMobile llOtpMobile) {
            super(1);
            this.f8983e = llOtpMobile;
        }

        public final void b(String str) {
            this.f8983e.K1().dismiss();
            LlOtpMobile llOtpMobile = this.f8983e;
            String b10 = llOtpMobile.F1().b("nex_parivahan", this.f8983e.getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = this.f8983e.F1().b("service_is_not_present", this.f8983e.getString(R.string.unable_to_get_details));
            cm.l.c(b11);
            String b12 = this.f8983e.F1().b("btn_ok", this.f8983e.getString(R.string.ok_txt));
            cm.l.c(b12);
            oi.g.n1(llOtpMobile, b10, b11, 1, b12, (String) null, a.f8984e, 16, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlOtpMobile f8985e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f8986e = new a();

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
            public static final b f8987e = new b();

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
            public static final c f8988e = new c();

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

        /* renamed from: com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlOtpMobile$d$d  reason: collision with other inner class name */
        static final class C0118d extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0118d f8989e = new C0118d();

            C0118d() {
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
        d(LlOtpMobile llOtpMobile) {
            super(1);
            this.f8985e = llOtpMobile;
        }

        public final void b(ResendOtp resendOtp) {
            this.f8985e.K1().dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    LlOtpMobile llOtpMobile = this.f8985e;
                    String b10 = llOtpMobile.F1().b("nex_parivahan", this.f8985e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String b11 = this.f8985e.F1().b("btn_ok", "OK");
                    cm.l.c(b11);
                    oi.g.n1(llOtpMobile, b10, "OTP has been resent successfully.", 1, b11, (String) null, a.f8986e, 16, (Object) null);
                } else if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    LlOtpMobile llOtpMobile2 = this.f8985e;
                    String b12 = llOtpMobile2.F1().b("nex_parivahan", this.f8985e.getString(R.string.app_name));
                    cm.l.c(b12);
                    String statusDesc = resendOtp.getStatusDesc();
                    String b13 = this.f8985e.F1().b("btn_ok", this.f8985e.getString(R.string.ok_txt));
                    cm.l.c(b13);
                    oi.g.n1(llOtpMobile2, b12, statusDesc, 1, b13, (String) null, b.f8987e, 16, (Object) null);
                } else {
                    LlOtpMobile llOtpMobile3 = this.f8985e;
                    String b14 = llOtpMobile3.F1().b("nex_parivahan", this.f8985e.getString(R.string.app_name));
                    cm.l.c(b14);
                    String statusDesc2 = resendOtp.getStatusDesc();
                    String b15 = this.f8985e.F1().b("btn_ok", this.f8985e.getString(R.string.ok_txt));
                    cm.l.c(b15);
                    oi.g.n1(llOtpMobile3, b14, statusDesc2, 1, b15, (String) null, c.f8988e, 16, (Object) null);
                }
            } catch (Exception unused) {
                LlOtpMobile llOtpMobile4 = this.f8985e;
                String b16 = llOtpMobile4.F1().b("nex_parivahan", this.f8985e.getString(R.string.app_name));
                cm.l.c(b16);
                String b17 = this.f8985e.F1().b("service_is_not_present", this.f8985e.getString(R.string.unable_to_get_details));
                cm.l.c(b17);
                String b18 = this.f8985e.F1().b("btn_ok", this.f8985e.getString(R.string.ok_txt));
                cm.l.c(b18);
                oi.g.n1(llOtpMobile4, b16, b17, 1, b18, (String) null, C0118d.f8989e, 16, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlOtpMobile f8990e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LlOtpMobile llOtpMobile) {
            super(1);
            this.f8990e = llOtpMobile;
        }

        public final void b(DlUpdateMobResponse dlUpdateMobResponse) {
            try {
                this.f8990e.C1().M.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null) {
                    if (errno.intValue() == 1) {
                        LlOtpMobile llOtpMobile = this.f8990e;
                        llOtpMobile.V1(llOtpMobile, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                        return;
                    }
                }
                String errmsg = dlUpdateMobResponse.getErrmsg();
                if (errmsg != null) {
                    this.f8990e.X1(errmsg);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlUpdateMobResponse) obj);
            return x.f30437a;
        }
    }

    public static final class f extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LlOtpMobile f8991a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LlOtpMobile llOtpMobile) {
            super(30000, 1000);
            this.f8991a = llOtpMobile;
        }

        public void onFinish() {
            this.f8991a.C1().I.setVisibility(0);
            this.f8991a.C1().N.setText("0");
            this.f8991a.C1().N.setVisibility(8);
        }

        public void onTick(long j10) {
            MyTextView myTextView = this.f8991a.C1().N;
            myTextView.setText(this.f8991a.F1().b("time_remaining", this.f8991a.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f8991a.C1().I.setVisibility(8);
            this.f8991a.C1().N.setVisibility(0);
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f8992e = new g();

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
        public static final h f8993e = new h();

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
        final /* synthetic */ LlOtpMobile f8994e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(LlOtpMobile llOtpMobile) {
            super(1);
            this.f8994e = llOtpMobile;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            this.f8994e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlOtpMobile f8995e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(LlOtpMobile llOtpMobile) {
            super(1);
            this.f8995e = llOtpMobile;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            if (p.o(str, "yes", true)) {
                this.f8995e.C1().M.c(true);
                String J1 = this.f8995e.J1();
                if (J1 != null && J1.length() == 0) {
                    this.f8995e.d2("0");
                }
                vj.a A1 = this.f8995e.L;
                if (A1 == null) {
                    cm.l.v("updateMobVm");
                    A1 = null;
                }
                String E1 = this.f8995e.E1();
                cm.l.c(E1);
                String J12 = this.f8995e.J1();
                cm.l.c(J12);
                String H1 = this.f8995e.H1();
                cm.l.c(H1);
                String I1 = this.f8995e.I1();
                cm.l.c(I1);
                A1.k(E1, "LL", J12, true, H1, I1);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class k implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8996a;

        k(l lVar) {
            cm.l.f(lVar, "function");
            this.f8996a = lVar;
        }

        public final pl.c a() {
            return this.f8996a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8996a.invoke(obj);
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

    private final void N1() {
        try {
            e2(new ProgressDialog(this));
            K1().setMessage(F1().b("label_challan_please_wait", "Please wait..."));
            K1().setCancelable(false);
            K1().setCanceledOnTouchOutside(false);
            this.P = String.valueOf(getIntent().getStringExtra("mobile"));
            this.Q = String.valueOf(getIntent().getStringExtra("old_mobile"));
            C1().G.setText(this.P);
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            c2((FetchLlDetails) serializableExtra);
            this.N = q.B0(G1().getLearningLicence()).toString();
            this.O = q.B0(G1().getDateOfBirth()).toString();
            h2(new ld.g(this));
            C1().L.setText(F1().b("label_dl_serv_update_mob", "Update Mobile Number"));
            C1().f28678z.setText(this.N);
            TextView textView = C1().f28677y;
            textView.setText("LL No. :" + this.N);
            C1().D.f25961g.setText(F1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void O1() {
        a2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(L1(), this))).a(ba.b.class));
        String str = this.P;
        if (str != null) {
            D1().F(this, str, M1().k());
        }
        D1().u().g(this, new k(new a(this)));
        D1().E().g(this, new k(new b(this)));
        D1().v().g(this, new k(new c(this)));
        D1().w().g(this, new k(new d(this)));
    }

    private final void P1() {
        vj.a aVar = (vj.a) new u0(this).a(vj.a.class);
        this.L = aVar;
        if (aVar == null) {
            cm.l.v("updateMobVm");
            aVar = null;
        }
        aVar.i().g(this, new k(new e(this)));
    }

    private final void Q1() {
        C1().D.f25959e.setOnClickListener(new rb.d(this));
        C1().I.setOnClickListener(new rb.e(this));
        C1().M.setOnClickListener(new rb.f(this));
        C1().J.setOnClickListener(new rb.g(this));
    }

    /* access modifiers changed from: private */
    public static final void R1(LlOtpMobile llOtpMobile, View view) {
        cm.l.f(llOtpMobile, "this$0");
        llOtpMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void S1(LlOtpMobile llOtpMobile, View view) {
        cm.l.f(llOtpMobile, "this$0");
        llOtpMobile.K1().show();
        llOtpMobile.D1().D(llOtpMobile, String.valueOf(llOtpMobile.R));
        new f(llOtpMobile).start();
    }

    /* access modifiers changed from: private */
    public static final void T1(LlOtpMobile llOtpMobile, View view) {
        String b10;
        String b11;
        int i10;
        String b12;
        String str;
        l lVar;
        cm.l.f(llOtpMobile, "this$0");
        Editable text = llOtpMobile.C1().A.getText();
        cm.l.c(text);
        if (text.length() == 0) {
            b10 = llOtpMobile.F1().b("nex_parivahan", llOtpMobile.getString(R.string.app_name));
            cm.l.c(b10);
            b11 = llOtpMobile.F1().b("enter_otp", "Please enter OTP");
            cm.l.c(b11);
            i10 = 1;
            b12 = llOtpMobile.F1().b("btn_ok", llOtpMobile.getString(R.string.ok_txt));
            cm.l.c(b12);
            str = null;
            lVar = g.f8992e;
        } else {
            Editable text2 = llOtpMobile.C1().A.getText();
            cm.l.c(text2);
            if (text2.length() < 6) {
                b10 = llOtpMobile.F1().b("nex_parivahan", llOtpMobile.getString(R.string.app_name));
                cm.l.c(b10);
                b11 = llOtpMobile.F1().b("enter_valid_otp", "Please enter the valid OTP");
                cm.l.c(b11);
                i10 = 1;
                b12 = llOtpMobile.F1().b("btn_ok", llOtpMobile.getString(R.string.ok_txt));
                cm.l.c(b12);
                str = null;
                lVar = h.f8993e;
            } else {
                ba.b D1 = llOtpMobile.D1();
                String valueOf = String.valueOf(llOtpMobile.C1().A.getText());
                String str2 = llOtpMobile.R;
                cm.l.c(str2);
                D1.G(llOtpMobile, valueOf, str2);
                return;
            }
        }
        oi.g.n1(llOtpMobile, b10, b11, i10, b12, str, lVar, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void U1(LlOtpMobile llOtpMobile, View view) {
        cm.l.f(llOtpMobile, "this$0");
        llOtpMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void W1(ProgressBar progressBar, LlOtpMobile llOtpMobile, View view) {
        cm.l.f(progressBar, "$pb_otp");
        cm.l.f(llOtpMobile, "this$0");
        progressBar.setVisibility(0);
        Toast.makeText(llOtpMobile.getApplicationContext(), llOtpMobile.F1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
        Intent intent = new Intent(llOtpMobile, DashBoard.class);
        intent.setFlags(67141632);
        llOtpMobile.startActivity(intent);
        llOtpMobile.finish();
    }

    /* access modifiers changed from: private */
    public final void Y1(String str) {
        String b10 = F1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        oi.g.n1(this, b10, str, 0, (String) null, (String) null, new j(this), 24, (Object) null);
    }

    public final t5 C1() {
        t5 t5Var = this.J;
        if (t5Var != null) {
            return t5Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final ba.b D1() {
        ba.b bVar = this.K;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final String E1() {
        return this.O;
    }

    public final ld.c F1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final FetchLlDetails G1() {
        FetchLlDetails fetchLlDetails = this.U;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final String H1() {
        return this.N;
    }

    public final String I1() {
        return this.P;
    }

    public final String J1() {
        return this.Q;
    }

    public final ProgressDialog K1() {
        ProgressDialog progressDialog = this.V;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlServiceInt L1() {
        DlServiceInt dlServiceInt = this.M;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ld.g M1() {
        ld.g gVar = this.S;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void V1(Context context, String str) {
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
        ((TextView) findViewById4).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new rb.h(progressBar, this));
        dialog.show();
    }

    public final void X1(String str) {
        cm.l.f(str, "message");
        String b10 = F1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = F1().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        oi.g.n1(this, b10, str, 1, b11, (String) null, new i(this), 16, (Object) null);
    }

    public final void Z1(t5 t5Var) {
        cm.l.f(t5Var, "<set-?>");
        this.J = t5Var;
    }

    public final void a2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.K = bVar;
    }

    public final void b2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void c2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.U = fetchLlDetails;
    }

    public final void d2(String str) {
        this.Q = str;
    }

    public final void e2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.V = progressDialog;
    }

    public final void f2(String str) {
        this.R = str;
    }

    public final void g2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.M = dlServiceInt;
    }

    public final void h2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.S = gVar;
    }

    public final void i2(Context context, String str, String str2, FetchLlDetails fetchLlDetails) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile");
        cm.l.f(str2, "oldMobile");
        cm.l.f(fetchLlDetails, "llDetails");
        Intent intent = new Intent(context, LlOtpMobile.class);
        intent.putExtra("mobile", str);
        intent.putExtra("old_mobile", str2);
        intent.putExtra("LLDetails", fetchLlDetails);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_ll_otp_mobile);
        cm.l.e(f10, "setContentView(...)");
        Z1((t5) f10);
        g2(DlServiceInt.f21675a.a(this));
        b2(new ld.c(this));
        N1();
        O1();
        P1();
        Q1();
    }
}
