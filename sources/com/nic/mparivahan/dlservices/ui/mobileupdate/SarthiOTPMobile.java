package com.nic.mparivahan.dlservices.ui.mobileupdate;

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
import android.widget.ImageView;
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
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.io.Serializable;
import ni.p2;
import pl.x;

public final class SarthiOTPMobile extends oi.g {
    public p2 J;
    public ba.b K;
    /* access modifiers changed from: private */
    public vj.a L;
    public DlServiceInt M;
    private String N;
    private String O;
    private String P;
    private String Q;
    public DldetobjX R;
    private String S;
    public ld.g T;
    public ld.c U;
    public ProgressDialog V;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiOTPMobile f22224e;

        /* renamed from: com.nic.mparivahan.dlservices.ui.mobileupdate.SarthiOTPMobile$a$a  reason: collision with other inner class name */
        static final class C0275a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0275a f22225e = new C0275a();

            C0275a() {
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
        a(SarthiOTPMobile sarthiOTPMobile) {
            super(1);
            this.f22224e = sarthiOTPMobile;
        }

        public final void b(SendOtpResult sendOtpResult) {
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f22224e.f2(String.valueOf(sendOtpResult.getRecordId()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f22224e, sendOtpResult.getStatusDesc());
                } else {
                    SarthiOTPMobile sarthiOTPMobile = this.f22224e;
                    String b10 = sarthiOTPMobile.H1().b("nex_parivahan", this.f22224e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String b11 = this.f22224e.H1().b("btn_ok", this.f22224e.getString(R.string.ok_txt));
                    cm.l.c(b11);
                    oi.g.n1(sarthiOTPMobile, b10, statusDesc, 1, b11, (String) null, C0275a.f22225e, 16, (Object) null);
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
        final /* synthetic */ SarthiOTPMobile f22226e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f22227e = new a();

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
        b(SarthiOTPMobile sarthiOTPMobile) {
            super(1);
            this.f22226e = sarthiOTPMobile;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    SarthiOTPMobile sarthiOTPMobile = this.f22226e;
                    String b10 = sarthiOTPMobile.H1().b("label_want_to_proceed", "Are you sure, You want to proceed ?");
                    cm.l.c(b10);
                    sarthiOTPMobile.Y1(b10);
                    return;
                }
                SarthiOTPMobile sarthiOTPMobile2 = this.f22226e;
                String b11 = sarthiOTPMobile2.H1().b("nex_parivahan", this.f22226e.getString(R.string.app_name));
                cm.l.c(b11);
                String statusDesc = otpVerifyResult.getStatusDesc();
                cm.l.c(statusDesc);
                String b12 = this.f22226e.H1().b("btn_ok", this.f22226e.getString(R.string.ok_txt));
                cm.l.c(b12);
                oi.g.n1(sarthiOTPMobile2, b11, statusDesc, 1, b12, (String) null, a.f22227e, 16, (Object) null);
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
        final /* synthetic */ SarthiOTPMobile f22228e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f22229e = new a();

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
        c(SarthiOTPMobile sarthiOTPMobile) {
            super(1);
            this.f22228e = sarthiOTPMobile;
        }

        public final void b(String str) {
            this.f22228e.K1().dismiss();
            SarthiOTPMobile sarthiOTPMobile = this.f22228e;
            String b10 = sarthiOTPMobile.H1().b("nex_parivahan", this.f22228e.getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = this.f22228e.H1().b("service_is_not_present", this.f22228e.getString(R.string.unable_to_get_details));
            cm.l.c(b11);
            String b12 = this.f22228e.H1().b("btn_ok", this.f22228e.getString(R.string.ok_txt));
            cm.l.c(b12);
            oi.g.n1(sarthiOTPMobile, b10, b11, 1, b12, (String) null, a.f22229e, 16, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiOTPMobile f22230e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f22231e = new a();

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
            public static final b f22232e = new b();

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
            public static final c f22233e = new c();

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

        /* renamed from: com.nic.mparivahan.dlservices.ui.mobileupdate.SarthiOTPMobile$d$d  reason: collision with other inner class name */
        static final class C0276d extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0276d f22234e = new C0276d();

            C0276d() {
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
        d(SarthiOTPMobile sarthiOTPMobile) {
            super(1);
            this.f22230e = sarthiOTPMobile;
        }

        public final void b(ResendOtp resendOtp) {
            this.f22230e.K1().dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    SarthiOTPMobile sarthiOTPMobile = this.f22230e;
                    String b10 = sarthiOTPMobile.H1().b("nex_parivahan", this.f22230e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String b11 = this.f22230e.H1().b("btn_ok", "OK");
                    cm.l.c(b11);
                    oi.g.n1(sarthiOTPMobile, b10, "OTP has been resent successfully.", 1, b11, (String) null, a.f22231e, 16, (Object) null);
                } else if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    SarthiOTPMobile sarthiOTPMobile2 = this.f22230e;
                    String b12 = sarthiOTPMobile2.H1().b("nex_parivahan", this.f22230e.getString(R.string.app_name));
                    cm.l.c(b12);
                    String statusDesc = resendOtp.getStatusDesc();
                    String b13 = this.f22230e.H1().b("btn_ok", this.f22230e.getString(R.string.ok_txt));
                    cm.l.c(b13);
                    oi.g.n1(sarthiOTPMobile2, b12, statusDesc, 1, b13, (String) null, b.f22232e, 16, (Object) null);
                } else {
                    SarthiOTPMobile sarthiOTPMobile3 = this.f22230e;
                    String b14 = sarthiOTPMobile3.H1().b("nex_parivahan", this.f22230e.getString(R.string.app_name));
                    cm.l.c(b14);
                    String statusDesc2 = resendOtp.getStatusDesc();
                    String b15 = this.f22230e.H1().b("btn_ok", this.f22230e.getString(R.string.ok_txt));
                    cm.l.c(b15);
                    oi.g.n1(sarthiOTPMobile3, b14, statusDesc2, 1, b15, (String) null, c.f22233e, 16, (Object) null);
                }
            } catch (Exception unused) {
                SarthiOTPMobile sarthiOTPMobile4 = this.f22230e;
                String b16 = sarthiOTPMobile4.H1().b("nex_parivahan", this.f22230e.getString(R.string.app_name));
                cm.l.c(b16);
                String b17 = this.f22230e.H1().b("service_is_not_present", this.f22230e.getString(R.string.unable_to_get_details));
                cm.l.c(b17);
                String b18 = this.f22230e.H1().b("btn_ok", this.f22230e.getString(R.string.ok_txt));
                cm.l.c(b18);
                oi.g.n1(sarthiOTPMobile4, b16, b17, 1, b18, (String) null, C0276d.f22234e, 16, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiOTPMobile f22235e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SarthiOTPMobile sarthiOTPMobile) {
            super(1);
            this.f22235e = sarthiOTPMobile;
        }

        public final void b(DlUpdateMobResponse dlUpdateMobResponse) {
            try {
                this.f22235e.C1().M.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null) {
                    if (errno.intValue() == 1) {
                        SarthiOTPMobile sarthiOTPMobile = this.f22235e;
                        sarthiOTPMobile.V1(sarthiOTPMobile, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                        return;
                    }
                }
                String errmsg = dlUpdateMobResponse.getErrmsg();
                if (errmsg != null) {
                    this.f22235e.X1(errmsg);
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
        final /* synthetic */ SarthiOTPMobile f22236a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SarthiOTPMobile sarthiOTPMobile) {
            super(30000, 1000);
            this.f22236a = sarthiOTPMobile;
        }

        public void onFinish() {
            this.f22236a.C1().I.setVisibility(0);
            this.f22236a.C1().N.setText("0");
            this.f22236a.C1().N.setVisibility(8);
        }

        public void onTick(long j10) {
            MyTextView myTextView = this.f22236a.C1().N;
            myTextView.setText(this.f22236a.H1().b("time_remaining", this.f22236a.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f22236a.C1().I.setVisibility(8);
            this.f22236a.C1().N.setVisibility(0);
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f22237e = new g();

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
        public static final h f22238e = new h();

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
        final /* synthetic */ SarthiOTPMobile f22239e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SarthiOTPMobile sarthiOTPMobile) {
            super(1);
            this.f22239e = sarthiOTPMobile;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            this.f22239e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiOTPMobile f22240e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SarthiOTPMobile sarthiOTPMobile) {
            super(1);
            this.f22240e = sarthiOTPMobile;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            if (p.o(str, "yes", true)) {
                this.f22240e.C1().M.c(true);
                String J1 = this.f22240e.J1();
                if (J1 != null && J1.length() == 0) {
                    this.f22240e.d2("0");
                }
                vj.a A1 = this.f22240e.L;
                if (A1 == null) {
                    cm.l.v("updateMobVm");
                    A1 = null;
                }
                String G1 = this.f22240e.G1();
                cm.l.c(G1);
                String J12 = this.f22240e.J1();
                cm.l.c(J12);
                String E1 = this.f22240e.E1();
                cm.l.c(E1);
                String I1 = this.f22240e.I1();
                cm.l.c(I1);
                A1.k(G1, "DL", J12, true, E1, I1);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class k implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22241a;

        k(l lVar) {
            cm.l.f(lVar, "function");
            this.f22241a = lVar;
        }

        public final pl.c a() {
            return this.f22241a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22241a.invoke(obj);
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
            K1().setMessage(H1().b("label_challan_please_wait", "Please wait..."));
            K1().setCancelable(false);
            K1().setCanceledOnTouchOutside(false);
            this.P = String.valueOf(getIntent().getStringExtra("mobile"));
            this.Q = String.valueOf(getIntent().getStringExtra("old_mobile"));
            C1().G.setText(this.P);
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            a2((DldetobjX) serializableExtra);
            this.N = D1().getDlobj().getDlLicno();
            this.O = D1().getBioObj().getBioDob();
            h2(new ld.g(this));
            C1().L.setText(H1().b("label_dl_serv_update_mob", "Update Mobile Number"));
            C1().f27919z.setText(this.N);
            TextView textView = C1().f27918y;
            textView.setText(H1().b("dl_no", "DL No. : ") + " : " + this.N);
            C1().D.f25961g.setText(H1().b("label_dl_serv_update_mob", "Update Mobile Number"));
            BioImgObjX bioImgObj = D1().getBioImgObj();
            String str = null;
            String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
            if (biPhoto != null) {
                if (biPhoto.length() != 0) {
                    C1().D.f25960f.setVisibility(0);
                    ImageView imageView = C1().D.f25956b;
                    BioImgObjX bioImgObj2 = D1().getBioImgObj();
                    if (bioImgObj2 != null) {
                        str = bioImgObj2.getBiPhoto();
                    }
                    imageView.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(str));
                    return;
                }
            }
            C1().D.f25960f.setVisibility(4);
        } catch (Exception unused) {
        }
    }

    private final void O1() {
        b2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(L1(), this))).a(ba.b.class));
        String str = this.P;
        if (str != null) {
            F1().F(this, str, M1().k());
        }
        F1().u().g(this, new k(new a(this)));
        F1().E().g(this, new k(new b(this)));
        F1().v().g(this, new k(new c(this)));
        F1().w().g(this, new k(new d(this)));
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
        C1().D.f25959e.setOnClickListener(new vj.g(this));
        C1().I.setOnClickListener(new vj.h(this));
        C1().M.setOnClickListener(new vj.i(this));
        C1().J.setOnClickListener(new vj.j(this));
    }

    /* access modifiers changed from: private */
    public static final void R1(SarthiOTPMobile sarthiOTPMobile, View view) {
        cm.l.f(sarthiOTPMobile, "this$0");
        sarthiOTPMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void S1(SarthiOTPMobile sarthiOTPMobile, View view) {
        cm.l.f(sarthiOTPMobile, "this$0");
        sarthiOTPMobile.K1().show();
        sarthiOTPMobile.F1().D(sarthiOTPMobile, String.valueOf(sarthiOTPMobile.S));
        new f(sarthiOTPMobile).start();
    }

    /* access modifiers changed from: private */
    public static final void T1(SarthiOTPMobile sarthiOTPMobile, View view) {
        String b10;
        String b11;
        int i10;
        String b12;
        String str;
        l lVar;
        cm.l.f(sarthiOTPMobile, "this$0");
        Editable text = sarthiOTPMobile.C1().A.getText();
        cm.l.c(text);
        if (text.length() == 0) {
            b10 = sarthiOTPMobile.H1().b("nex_parivahan", sarthiOTPMobile.getString(R.string.app_name));
            cm.l.c(b10);
            b11 = sarthiOTPMobile.H1().b("enter_otp", "Please enter OTP");
            cm.l.c(b11);
            i10 = 1;
            b12 = sarthiOTPMobile.H1().b("btn_ok", sarthiOTPMobile.getString(R.string.ok_txt));
            cm.l.c(b12);
            str = null;
            lVar = g.f22237e;
        } else {
            Editable text2 = sarthiOTPMobile.C1().A.getText();
            cm.l.c(text2);
            if (text2.length() < 6) {
                b10 = sarthiOTPMobile.H1().b("nex_parivahan", sarthiOTPMobile.getString(R.string.app_name));
                cm.l.c(b10);
                b11 = sarthiOTPMobile.H1().b("enter_valid_otp", "Please enter the valid OTP");
                cm.l.c(b11);
                i10 = 1;
                b12 = sarthiOTPMobile.H1().b("btn_ok", sarthiOTPMobile.getString(R.string.ok_txt));
                cm.l.c(b12);
                str = null;
                lVar = h.f22238e;
            } else {
                ba.b F1 = sarthiOTPMobile.F1();
                String valueOf = String.valueOf(sarthiOTPMobile.C1().A.getText());
                String str2 = sarthiOTPMobile.S;
                cm.l.c(str2);
                F1.G(sarthiOTPMobile, valueOf, str2);
                return;
            }
        }
        oi.g.n1(sarthiOTPMobile, b10, b11, i10, b12, str, lVar, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void U1(SarthiOTPMobile sarthiOTPMobile, View view) {
        cm.l.f(sarthiOTPMobile, "this$0");
        sarthiOTPMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void W1(ProgressBar progressBar, SarthiOTPMobile sarthiOTPMobile, View view) {
        cm.l.f(progressBar, "$pb_otp");
        cm.l.f(sarthiOTPMobile, "this$0");
        progressBar.setVisibility(0);
        Toast.makeText(sarthiOTPMobile.getApplicationContext(), sarthiOTPMobile.H1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
        Intent intent = new Intent(sarthiOTPMobile, DashBoard.class);
        intent.setFlags(67141632);
        sarthiOTPMobile.startActivity(intent);
        sarthiOTPMobile.finish();
    }

    /* access modifiers changed from: private */
    public final void Y1(String str) {
        String b10 = H1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        oi.g.n1(this, b10, str, 0, (String) null, (String) null, new j(this), 24, (Object) null);
    }

    public final p2 C1() {
        p2 p2Var = this.J;
        if (p2Var != null) {
            return p2Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final DldetobjX D1() {
        DldetobjX dldetobjX = this.R;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final String E1() {
        return this.N;
    }

    public final ba.b F1() {
        ba.b bVar = this.K;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final String G1() {
        return this.O;
    }

    public final ld.c H1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
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
        ld.g gVar = this.T;
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
        ((TextView) findViewById4).setText(H1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(H1().b("btn_ok", "OK"));
        textView.setOnClickListener(new vj.f(progressBar, this));
        dialog.show();
    }

    public final void X1(String str) {
        cm.l.f(str, "message");
        String b10 = H1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = H1().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        oi.g.n1(this, b10, str, 1, b11, (String) null, new i(this), 16, (Object) null);
    }

    public final void Z1(p2 p2Var) {
        cm.l.f(p2Var, "<set-?>");
        this.J = p2Var;
    }

    public final void a2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.R = dldetobjX;
    }

    public final void b2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.K = bVar;
    }

    public final void c2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void d2(String str) {
        this.Q = str;
    }

    public final void e2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.V = progressDialog;
    }

    public final void f2(String str) {
        this.S = str;
    }

    public final void g2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.M = dlServiceInt;
    }

    public final void h2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.T = gVar;
    }

    public final void i2(Context context, String str, String str2, DldetobjX dldetobjX) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile");
        cm.l.f(str2, "oldMobile");
        cm.l.f(dldetobjX, "dlDetails");
        Intent intent = new Intent(context, SarthiOTPMobile.class);
        intent.putExtra("mobile", str);
        intent.putExtra("old_mobile", str2);
        intent.putExtra("DLDetails", dldetobjX);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_mob_update_otp);
        cm.l.e(f10, "setContentView(...)");
        Z1((p2) f10);
        g2(DlServiceInt.f21675a.a(this));
        c2(new ld.c(this));
        v9.e.f17509a.n1(this, C1());
        N1();
        O1();
        P1();
        Q1();
    }
}
