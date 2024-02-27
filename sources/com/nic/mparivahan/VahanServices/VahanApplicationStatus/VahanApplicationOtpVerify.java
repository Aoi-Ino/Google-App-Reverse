package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import ni.pb;
import pl.x;

public final class VahanApplicationOtpVerify extends androidx.appcompat.app.d {
    private pb G;
    /* access modifiers changed from: private */
    public String H = "";
    private String I = "";
    private String J = "";
    /* access modifiers changed from: private */
    public String K = "";
    private String L = "";
    private String M = "";
    /* access modifiers changed from: private */
    public String N = "";
    /* access modifiers changed from: private */
    public String O = "";
    private String P = "";
    private String Q = "";
    private bi.b R;
    private ApplicationService S;
    private bi.a T;
    private ApplicationServiceOtp U;
    public ProgressDialog V;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationOtpVerify f20775e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanApplicationOtpVerify vahanApplicationOtpVerify) {
            super(1);
            this.f20775e = vahanApplicationOtpVerify;
        }

        public final void b(ResendOtp resendOtp) {
            if (this.f20775e.r1().isShowing()) {
                this.f20775e.r1().dismiss();
            }
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    VahanApplicationOtpVerify vahanApplicationOtpVerify = this.f20775e;
                    vahanApplicationOtpVerify.z1(vahanApplicationOtpVerify, "We have resent the OTP to your Mobile Number");
                    return;
                }
                VahanApplicationOtpVerify vahanApplicationOtpVerify2 = p.o(resendOtp.getStatusCode(), "AL002", true) ? this.f20775e : this.f20775e;
                vahanApplicationOtpVerify2.z1(vahanApplicationOtpVerify2, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                VahanApplicationOtpVerify vahanApplicationOtpVerify3 = this.f20775e;
                vahanApplicationOtpVerify3.z1(vahanApplicationOtpVerify3, "Unable to resent the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationOtpVerify f20776e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanApplicationOtpVerify vahanApplicationOtpVerify) {
            super(1);
            this.f20776e = vahanApplicationOtpVerify;
        }

        public final void b(String str) {
            if (this.f20776e.r1().isShowing()) {
                this.f20776e.r1().dismiss();
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify = this.f20776e;
            vahanApplicationOtpVerify.z1(vahanApplicationOtpVerify, "Unable to resent the OTP, Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationOtpVerify f20777e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanApplicationOtpVerify vahanApplicationOtpVerify) {
            super(1);
            this.f20777e = vahanApplicationOtpVerify;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                VahanApplicationOtpVerify vahanApplicationOtpVerify = this.f20777e;
                vahanApplicationOtpVerify.q1(vahanApplicationOtpVerify.H, this.f20777e.O);
                return;
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify2 = this.f20777e;
            vahanApplicationOtpVerify2.z1(vahanApplicationOtpVerify2, otpVerifyResult.getStatusDesc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationOtpVerify f20778e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanApplicationOtpVerify vahanApplicationOtpVerify) {
            super(1);
            this.f20778e = vahanApplicationOtpVerify;
        }

        public final void b(String str) {
            if (this.f20778e.r1().isShowing()) {
                this.f20778e.r1().dismiss();
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify = this.f20778e;
            vahanApplicationOtpVerify.z1(vahanApplicationOtpVerify, "Unable to Verify the OTP, Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationOtpVerify f20779e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanApplicationOtpVerify vahanApplicationOtpVerify) {
            super(1);
            this.f20779e = vahanApplicationOtpVerify;
        }

        public final void b(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (this.f20779e.r1().isShowing()) {
                this.f20779e.r1().dismiss();
            }
            Log.e("Application Status", applicationStatusSuccessModel.toString());
            if (applicationStatusSuccessModel.getTransList().size() > 0) {
                Intent intent = new Intent(this.f20779e, VahanApplicationTransactionStatus.class);
                intent.putExtra("transList", new i7.d().t(applicationStatusSuccessModel.getTransList()));
                intent.putExtra("applicationNo", this.f20779e.H);
                intent.putExtra("ownerName", this.f20779e.N);
                intent.putExtra("stateCd", this.f20779e.O);
                intent.putExtra("regNo", this.f20779e.K);
                this.f20779e.startActivity(intent);
                this.f20779e.finish();
                return;
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify = this.f20779e;
            vahanApplicationOtpVerify.z1(vahanApplicationOtpVerify, "No application status found for this application no.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ApplicationStatusSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationOtpVerify f20780e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanApplicationOtpVerify vahanApplicationOtpVerify) {
            super(1);
            this.f20780e = vahanApplicationOtpVerify;
        }

        public final void b(String str) {
            if (this.f20780e.r1().isShowing()) {
                this.f20780e.r1().dismiss();
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify = this.f20780e;
            vahanApplicationOtpVerify.z1(vahanApplicationOtpVerify, "No application status found for this application no.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20781a;

        g(l lVar) {
            cm.l.f(lVar, "function");
            this.f20781a = lVar;
        }

        public final pl.c a() {
            return this.f20781a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20781a.invoke(obj);
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
    public static final void A1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void q1(String str, String str2) {
        bi.a aVar = this.T;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.o(this, str, str2);
    }

    private final void s1() {
        ApplicationService applicationService = this.S;
        pb pbVar = null;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.R = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        ApplicationServiceOtp applicationServiceOtp = this.U;
        if (applicationServiceOtp == null) {
            cm.l.v("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.T = (bi.a) new u0((x0) this, (u0.b) new bi.e(new wg.a(applicationServiceOtp))).a(bi.a.class);
        if (this.H.length() > 0) {
            pb pbVar2 = this.G;
            if (pbVar2 == null) {
                cm.l.v("binding");
                pbVar2 = null;
            }
            pbVar2.f28022j.setText(this.H);
        }
        if (this.I.length() > 0) {
            pb pbVar3 = this.G;
            if (pbVar3 == null) {
                cm.l.v("binding");
                pbVar3 = null;
            }
            pbVar3.f28023k.setText(this.I);
        }
        if (this.K.length() > 0) {
            pb pbVar4 = this.G;
            if (pbVar4 == null) {
                cm.l.v("binding");
                pbVar4 = null;
            }
            pbVar4.f28024l.setText(this.K);
        }
        if (this.P.length() > 0) {
            pb pbVar5 = this.G;
            if (pbVar5 == null) {
                cm.l.v("binding");
                pbVar5 = null;
            }
            pbVar5.f28017e.setText(this.P);
        }
        pb pbVar6 = this.G;
        if (pbVar6 == null) {
            cm.l.v("binding");
            pbVar6 = null;
        }
        pbVar6.f28014b.f28306g.setOnClickListener(new d0(this));
        pb pbVar7 = this.G;
        if (pbVar7 == null) {
            cm.l.v("binding");
            pbVar7 = null;
        }
        pbVar7.f28014b.f28305f.setOnClickListener(new e0(this));
        pb pbVar8 = this.G;
        if (pbVar8 == null) {
            cm.l.v("binding");
            pbVar8 = null;
        }
        pbVar8.f28015c.setOnClickListener(new f0(this));
        pb pbVar9 = this.G;
        if (pbVar9 == null) {
            cm.l.v("binding");
            pbVar9 = null;
        }
        pbVar9.f28016d.setOnClickListener(new g0(this));
        pb pbVar10 = this.G;
        if (pbVar10 == null) {
            cm.l.v("binding");
        } else {
            pbVar = pbVar10;
        }
        pbVar.f28025m.setOnClickListener(new h0(this));
    }

    /* access modifiers changed from: private */
    public static final void t1(VahanApplicationOtpVerify vahanApplicationOtpVerify, View view) {
        cm.l.f(vahanApplicationOtpVerify, "this$0");
        vahanApplicationOtpVerify.y1();
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanApplicationOtpVerify vahanApplicationOtpVerify, View view) {
        cm.l.f(vahanApplicationOtpVerify, "this$0");
        vahanApplicationOtpVerify.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanApplicationOtpVerify vahanApplicationOtpVerify, View view) {
        cm.l.f(vahanApplicationOtpVerify, "this$0");
        vahanApplicationOtpVerify.finish();
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanApplicationOtpVerify vahanApplicationOtpVerify, View view) {
        Boolean bool;
        cm.l.f(vahanApplicationOtpVerify, "this$0");
        pb pbVar = vahanApplicationOtpVerify.G;
        pb pbVar2 = null;
        if (pbVar == null) {
            cm.l.v("binding");
            pbVar = null;
        }
        Editable text = pbVar.f28018f.getText();
        if (text != null) {
            bool = Boolean.valueOf(text.length() > 0);
        } else {
            bool = null;
        }
        cm.l.c(bool);
        if (bool.booleanValue()) {
            if (vahanApplicationOtpVerify.r1().isShowing()) {
                vahanApplicationOtpVerify.r1().dismiss();
            }
            vahanApplicationOtpVerify.r1().show();
            bi.a aVar = vahanApplicationOtpVerify.T;
            if (aVar == null) {
                cm.l.v("otpViewModel");
                aVar = null;
            }
            pb pbVar3 = vahanApplicationOtpVerify.G;
            if (pbVar3 == null) {
                cm.l.v("binding");
            } else {
                pbVar2 = pbVar3;
            }
            aVar.v(vahanApplicationOtpVerify, q.B0(String.valueOf(pbVar2.f28018f.getText())).toString(), vahanApplicationOtpVerify.Q);
            return;
        }
        vahanApplicationOtpVerify.z1(vahanApplicationOtpVerify, "Please enter the OTP");
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanApplicationOtpVerify vahanApplicationOtpVerify, View view) {
        cm.l.f(vahanApplicationOtpVerify, "this$0");
        if (vahanApplicationOtpVerify.r1().isShowing()) {
            vahanApplicationOtpVerify.r1().dismiss();
        }
        vahanApplicationOtpVerify.r1().show();
        bi.a aVar = vahanApplicationOtpVerify.T;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.s(vahanApplicationOtpVerify, vahanApplicationOtpVerify.Q);
    }

    private final void y1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void B1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.V = progressDialog;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout_application_otp_verify_vahan_services);
        pb c10 = pb.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        bi.a aVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        this.S = ApplicationService.f21181a.b(this);
        this.U = ApplicationServiceOtp.f21184a.b(this);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("applicationNo");
            cm.l.c(stringExtra);
            this.H = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("chassisNo");
            cm.l.c(stringExtra2);
            this.I = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("engineNo");
            cm.l.c(stringExtra3);
            this.J = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("regNo");
            cm.l.c(stringExtra4);
            this.K = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("mobileNo");
            cm.l.c(stringExtra5);
            this.L = stringExtra5;
            String stringExtra6 = getIntent().getStringExtra("ownerName");
            cm.l.c(stringExtra6);
            this.N = stringExtra6;
            String stringExtra7 = getIntent().getStringExtra("stateCd");
            cm.l.c(stringExtra7);
            this.O = stringExtra7;
            String stringExtra8 = getIntent().getStringExtra("Param");
            cm.l.c(stringExtra8);
            this.P = stringExtra8;
            String stringExtra9 = getIntent().getStringExtra("otpId");
            cm.l.c(stringExtra9);
            this.Q = stringExtra9;
        }
        B1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        s1();
        bi.a aVar2 = this.T;
        if (aVar2 == null) {
            cm.l.v("otpViewModel");
            aVar2 = null;
        }
        aVar2.r().g(this, new g(new a(this)));
        bi.a aVar3 = this.T;
        if (aVar3 == null) {
            cm.l.v("otpViewModel");
            aVar3 = null;
        }
        aVar3.q().g(this, new g(new b(this)));
        bi.a aVar4 = this.T;
        if (aVar4 == null) {
            cm.l.v("otpViewModel");
            aVar4 = null;
        }
        aVar4.u().g(this, new g(new c(this)));
        bi.a aVar5 = this.T;
        if (aVar5 == null) {
            cm.l.v("otpViewModel");
            aVar5 = null;
        }
        aVar5.t().g(this, new g(new d(this)));
        bi.a aVar6 = this.T;
        if (aVar6 == null) {
            cm.l.v("otpViewModel");
            aVar6 = null;
        }
        aVar6.n().g(this, new g(new e(this)));
        bi.a aVar7 = this.T;
        if (aVar7 == null) {
            cm.l.v("otpViewModel");
        } else {
            aVar = aVar7;
        }
        aVar.k().g(this, new g(new f(this)));
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.V;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void z1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new c0(dialog));
        dialog.show();
    }
}
