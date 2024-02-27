package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.R;
import ni.cc;
import pl.x;
import u8.a0;
import u8.y;
import u8.z;
import v9.e;

public final class ForgotMpinScreen extends androidx.appcompat.app.d {
    public LinearLayout G;
    public TextView H;
    public EditText I;
    public String J;
    public String K;
    public v8.d L;
    public SignService M;
    public TextView N;
    public ProgressDialog O;
    public ImageView P;
    public ImageView Q;
    public TextView R;
    public ld.c S;
    /* access modifiers changed from: private */
    public cc T;

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ForgotMpinScreen f7665a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ForgotMpinScreen forgotMpinScreen) {
            super(30000, 1000);
            this.f7665a = forgotMpinScreen;
        }

        public void onFinish() {
            cc k12 = this.f7665a.T;
            cc ccVar = null;
            if (k12 == null) {
                l.v("binding");
                k12 = null;
            }
            k12.f25768g.setVisibility(0);
            cc k13 = this.f7665a.T;
            if (k13 == null) {
                l.v("binding");
                k13 = null;
            }
            k13.f25774m.setText("0");
            cc k14 = this.f7665a.T;
            if (k14 == null) {
                l.v("binding");
            } else {
                ccVar = k14;
            }
            ccVar.f25774m.setVisibility(8);
        }

        public void onTick(long j10) {
            cc k12 = this.f7665a.T;
            cc ccVar = null;
            if (k12 == null) {
                l.v("binding");
                k12 = null;
            }
            k12.f25774m.setText(this.f7665a.s1().b("time_remaining", "Time remaining") + ' ' + (j10 / ((long) 1000)));
            cc k13 = this.f7665a.T;
            if (k13 == null) {
                l.v("binding");
                k13 = null;
            }
            k13.f25768g.setVisibility(8);
            cc k14 = this.f7665a.T;
            if (k14 == null) {
                l.v("binding");
            } else {
                ccVar = k14;
            }
            ccVar.f25774m.setVisibility(0);
        }
    }

    public static final class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ForgotMpinScreen f7666a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ForgotMpinScreen forgotMpinScreen) {
            super(30000, 1000);
            this.f7666a = forgotMpinScreen;
        }

        public void onFinish() {
            cc k12 = this.f7666a.T;
            cc ccVar = null;
            if (k12 == null) {
                l.v("binding");
                k12 = null;
            }
            k12.f25768g.setVisibility(0);
            cc k13 = this.f7666a.T;
            if (k13 == null) {
                l.v("binding");
                k13 = null;
            }
            k13.f25774m.setText("0");
            cc k14 = this.f7666a.T;
            if (k14 == null) {
                l.v("binding");
            } else {
                ccVar = k14;
            }
            ccVar.f25774m.setVisibility(8);
        }

        public void onTick(long j10) {
            cc k12 = this.f7666a.T;
            cc ccVar = null;
            if (k12 == null) {
                l.v("binding");
                k12 = null;
            }
            k12.f25774m.setText(this.f7666a.s1().b("time_remaining", "Time remaining") + ' ' + (j10 / ((long) 1000)));
            cc k13 = this.f7666a.T;
            if (k13 == null) {
                l.v("binding");
                k13 = null;
            }
            k13.f25768g.setVisibility(8);
            cc k14 = this.f7666a.T;
            if (k14 == null) {
                l.v("binding");
            } else {
                ccVar = k14;
            }
            ccVar.f25774m.setVisibility(0);
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ForgotMpinScreen f7667e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ForgotMpinScreen forgotMpinScreen) {
            super(1);
            this.f7667e = forgotMpinScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                this.f7667e.p1().dismiss();
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    String t10 = new i7.d().t(otpVerifyResult.getMparCitizenUser());
                    Intent intent = new Intent(this.f7667e, CreateNewMPIN.class);
                    intent.putExtra("Mobile_no", this.f7667e.n1());
                    intent.putExtra("OTP", t10);
                    intent.putExtra("otpId", this.f7667e.o1());
                    this.f7667e.startActivity(intent);
                    this.f7667e.finish();
                    return;
                }
                ForgotMpinScreen forgotMpinScreen = this.f7667e;
                forgotMpinScreen.A1(forgotMpinScreen, String.valueOf(otpVerifyResult.getStatusDesc()));
            } catch (Exception unused) {
                ForgotMpinScreen forgotMpinScreen2 = this.f7667e;
                forgotMpinScreen2.A1(forgotMpinScreen2, forgotMpinScreen2.s1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ForgotMpinScreen f7668e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ForgotMpinScreen forgotMpinScreen) {
            super(1);
            this.f7668e = forgotMpinScreen;
        }

        public final void b(String str) {
            this.f7668e.p1().dismiss();
            ForgotMpinScreen forgotMpinScreen = this.f7668e;
            forgotMpinScreen.A1(forgotMpinScreen, forgotMpinScreen.s1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ForgotMpinScreen f7669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ForgotMpinScreen forgotMpinScreen) {
            super(1);
            this.f7669e = forgotMpinScreen;
        }

        public final void b(ResendOtp resendOtp) {
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f7669e.p1().dismiss();
                    ForgotMpinScreen forgotMpinScreen = this.f7669e;
                    forgotMpinScreen.A1(forgotMpinScreen, forgotMpinScreen.s1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (!ka.c.f13158a.m(resendOtp.getStatusDesc())) {
                    this.f7669e.p1().dismiss();
                    ForgotMpinScreen forgotMpinScreen2 = this.f7669e;
                    forgotMpinScreen2.A1(forgotMpinScreen2, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                this.f7669e.p1().dismiss();
                ForgotMpinScreen forgotMpinScreen3 = this.f7669e;
                forgotMpinScreen3.A1(forgotMpinScreen3, forgotMpinScreen3.s1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ForgotMpinScreen f7670e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ForgotMpinScreen forgotMpinScreen) {
            super(1);
            this.f7670e = forgotMpinScreen;
        }

        public final void b(String str) {
            this.f7670e.p1().dismiss();
            ForgotMpinScreen forgotMpinScreen = this.f7670e;
            forgotMpinScreen.A1(forgotMpinScreen, forgotMpinScreen.s1().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7671a;

        g(bm.l lVar) {
            l.f(lVar, "function");
            this.f7671a = lVar;
        }

        public final pl.c a() {
            return this.f7671a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7671a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w1(ForgotMpinScreen forgotMpinScreen, View view) {
        l.f(forgotMpinScreen, "this$0");
        forgotMpinScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void x1(ForgotMpinScreen forgotMpinScreen, View view) {
        EditText m12;
        TransformationMethod instance;
        l.f(forgotMpinScreen, "this$0");
        if (forgotMpinScreen.m1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            forgotMpinScreen.t1().setImageResource(R.drawable.pass_visible);
            m12 = forgotMpinScreen.m1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            forgotMpinScreen.t1().setImageResource(R.drawable.mvvm_visibility);
            m12 = forgotMpinScreen.m1();
            instance = PasswordTransformationMethod.getInstance();
        }
        m12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void y1(ForgotMpinScreen forgotMpinScreen, View view) {
        l.f(forgotMpinScreen, "this$0");
        new b(forgotMpinScreen).start();
        forgotMpinScreen.p1().show();
        forgotMpinScreen.v1().j(forgotMpinScreen.o1());
    }

    /* access modifiers changed from: private */
    public static final void z1(ForgotMpinScreen forgotMpinScreen, View view) {
        ld.c s12;
        String str;
        l.f(forgotMpinScreen, "this$0");
        String obj = forgotMpinScreen.m1().getText().toString();
        if (obj == null || obj.length() == 0) {
            s12 = forgotMpinScreen.s1();
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            s12 = forgotMpinScreen.s1();
            str = "Please enter the valid OTP";
        } else {
            forgotMpinScreen.p1().show();
            forgotMpinScreen.v1().l(obj, forgotMpinScreen.o1(), forgotMpinScreen.n1(), forgotMpinScreen);
            return;
        }
        forgotMpinScreen.A1(forgotMpinScreen, s12.b("label_log_entr_otp", str));
    }

    public final void A1(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(s1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(s1().b("btn_ok", "OK"));
        textView.setOnClickListener(new u8.b0(dialog));
        dialog.show();
    }

    public final void C1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.P = imageView;
    }

    public final void D1(TextView textView) {
        l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void E1(TextView textView) {
        l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final void F1(EditText editText) {
        l.f(editText, "<set-?>");
        this.I = editText;
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void I1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final void J1(TextView textView) {
        l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final void K1(SignService signService) {
        l.f(signService, "<set-?>");
        this.M = signService;
    }

    public final void L1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void M1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.Q = imageView;
    }

    public final void N1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.G = linearLayout;
    }

    public final void O1(v8.d dVar) {
        l.f(dVar, "<set-?>");
        this.L = dVar;
    }

    public final ImageView l1() {
        ImageView imageView = this.P;
        if (imageView != null) {
            return imageView;
        }
        l.v("backButton");
        return null;
    }

    public final EditText m1() {
        EditText editText = this.I;
        if (editText != null) {
            return editText;
        }
        l.v("enterOtp");
        return null;
    }

    public final String n1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("mobile_number");
        return null;
    }

    public final String o1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("otpId");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cc c10 = cc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.T = c10;
        cc ccVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        cc ccVar2 = this.T;
        if (ccVar2 == null) {
            l.v("binding");
            ccVar2 = null;
        }
        aVar.L0(this, ccVar2);
        L1(new ld.c(this));
        K1(SignService.f7644a.c(this));
        View findViewById = findViewById(R.id.submit);
        l.e(findViewById, "findViewById(...)");
        N1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.enterOtp);
        l.e(findViewById2, "findViewById(...)");
        F1((EditText) findViewById2);
        View findViewById3 = findViewById(R.id.disPlay);
        l.e(findViewById3, "findViewById(...)");
        E1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.default_otp);
        l.e(findViewById4, "findViewById(...)");
        D1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.showmpin);
        l.e(findViewById5, "findViewById(...)");
        M1((ImageView) findViewById5);
        View findViewById6 = findViewById(R.id.resendOtp);
        l.e(findViewById6, "findViewById(...)");
        J1((TextView) findViewById6);
        I1(new ProgressDialog(this));
        p1().setMessage(s1().b("label_challan_please_wait", "Please wait..."));
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        View findViewById7 = findViewById(R.id.backButton);
        l.e(findViewById7, "findViewById(...)");
        C1((ImageView) findViewById7);
        l1().setOnClickListener(new u8.x(this));
        t1().setOnClickListener(new y(this));
        Intent intent = getIntent();
        if (intent != null) {
            try {
                cc ccVar3 = this.T;
                if (ccVar3 == null) {
                    l.v("binding");
                    ccVar3 = null;
                }
                ccVar3.f25775n.setText(intent.getStringExtra("title"));
                H1(String.valueOf(intent.getStringExtra("otpId")));
                G1(String.valueOf(intent.getStringExtra("MobileNumber")));
                String n12 = n1();
                int length = n12.length();
                String str = "";
                for (int i10 = 0; i10 < length; i10++) {
                    n12.charAt(i10);
                    str = new km.f("\\d(?=\\d{4})").b(new km.f("[^0-9]").b(n1(), ""), "X");
                }
                cc ccVar4 = this.T;
                if (ccVar4 == null) {
                    l.v("binding");
                } else {
                    ccVar = ccVar4;
                }
                ccVar.f25779r.setText(s1().b("label_otp_sent_to_mobile", "OTP has been sent to your registered mobile +91") + str);
                new a(this).start();
            } catch (Exception unused) {
            }
        }
        q1().setOnClickListener(new z(this));
        u1().setOnClickListener(new a0(this));
        O1((v8.d) new u0((x0) this, (u0.b) new v8.c(new s8.b(r1()))).a(v8.d.class));
        v1().k().g(this, new g(new c(this)));
        v1().g().g(this, new g(new d(this)));
        v1().i().g(this, new g(new e(this)));
        v1().h().g(this, new g(new f(this)));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final TextView q1() {
        TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        l.v("resendOtp");
        return null;
    }

    public final SignService r1() {
        SignService signService = this.M;
        if (signService != null) {
            return signService;
        }
        l.v("retrofitService");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final ImageView t1() {
        ImageView imageView = this.Q;
        if (imageView != null) {
            return imageView;
        }
        l.v("showmpin");
        return null;
    }

    public final LinearLayout u1() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("submit");
        return null;
    }

    public final v8.d v1() {
        v8.d dVar = this.L;
        if (dVar != null) {
            return dVar;
        }
        l.v("viewModel");
        return null;
    }
}
