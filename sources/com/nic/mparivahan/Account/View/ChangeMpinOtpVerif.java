package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.R;
import nc.a;
import ni.cc;
import pl.x;
import v9.e;

public final class ChangeMpinOtpVerif extends androidx.appcompat.app.d {
    public LinearLayout G;
    public TextView H;
    public EditText I;
    public String J;
    public String K;
    public String L;
    public v8.d M;
    public SignService N;
    public TextView O;
    public ProgressDialog P;
    public ImageView Q;
    public ImageView R;
    public TextView S;
    public ld.c T;
    /* access modifiers changed from: private */
    public cc U;
    public qc.b V;
    public UserBloodDetails W;

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeMpinOtpVerif f7647a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChangeMpinOtpVerif changeMpinOtpVerif) {
            super(30000, 1000);
            this.f7647a = changeMpinOtpVerif;
        }

        public void onFinish() {
            cc o12 = this.f7647a.U;
            cc ccVar = null;
            if (o12 == null) {
                l.v("binding");
                o12 = null;
            }
            o12.f25768g.setVisibility(0);
            cc o13 = this.f7647a.U;
            if (o13 == null) {
                l.v("binding");
                o13 = null;
            }
            o13.f25774m.setText("0");
            cc o14 = this.f7647a.U;
            if (o14 == null) {
                l.v("binding");
            } else {
                ccVar = o14;
            }
            ccVar.f25774m.setVisibility(8);
        }

        public void onTick(long j10) {
            cc o12 = this.f7647a.U;
            cc ccVar = null;
            if (o12 == null) {
                l.v("binding");
                o12 = null;
            }
            o12.f25774m.setText(this.f7647a.z1().b("time_remaining", "Time remaining") + ' ' + (j10 / ((long) 1000)));
            cc o13 = this.f7647a.U;
            if (o13 == null) {
                l.v("binding");
                o13 = null;
            }
            o13.f25768g.setVisibility(8);
            cc o14 = this.f7647a.U;
            if (o14 == null) {
                l.v("binding");
            } else {
                ccVar = o14;
            }
            ccVar.f25774m.setVisibility(0);
        }
    }

    public static final class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeMpinOtpVerif f7648a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChangeMpinOtpVerif changeMpinOtpVerif) {
            super(30000, 1000);
            this.f7648a = changeMpinOtpVerif;
        }

        public void onFinish() {
            cc o12 = this.f7648a.U;
            cc ccVar = null;
            if (o12 == null) {
                l.v("binding");
                o12 = null;
            }
            o12.f25768g.setVisibility(0);
            cc o13 = this.f7648a.U;
            if (o13 == null) {
                l.v("binding");
                o13 = null;
            }
            o13.f25774m.setText("0");
            cc o14 = this.f7648a.U;
            if (o14 == null) {
                l.v("binding");
            } else {
                ccVar = o14;
            }
            ccVar.f25774m.setVisibility(8);
        }

        public void onTick(long j10) {
            cc o12 = this.f7648a.U;
            cc ccVar = null;
            if (o12 == null) {
                l.v("binding");
                o12 = null;
            }
            o12.f25774m.setText(this.f7648a.z1().b("time_remaining", "Time remaining") + ' ' + (j10 / ((long) 1000)));
            cc o13 = this.f7648a.U;
            if (o13 == null) {
                l.v("binding");
                o13 = null;
            }
            o13.f25768g.setVisibility(8);
            cc o14 = this.f7648a.U;
            if (o14 == null) {
                l.v("binding");
            } else {
                ccVar = o14;
            }
            ccVar.f25774m.setVisibility(0);
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeMpinOtpVerif f7649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChangeMpinOtpVerif changeMpinOtpVerif) {
            super(1);
            this.f7649e = changeMpinOtpVerif;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ld.g gVar = new ld.g(this.f7649e);
                    String string = Settings.Secure.getString(this.f7649e.getContentResolver(), "android_id");
                    a.C0190a aVar = nc.a.f14255a;
                    long parseLong = Long.parseLong(gVar.k().toString());
                    String t12 = this.f7649e.t1();
                    String n10 = gVar.n();
                    String h10 = gVar.h();
                    String q10 = gVar.q();
                    l.c(string);
                    String jSONObject = aVar.c(parseLong, t12, n10, h10, q10, true, string, gVar.l(), this.f7649e.v1(), this.f7649e.u1()).toString();
                    l.e(jSONObject, "toString(...)");
                    this.f7649e.r1().v(jSONObject, this.f7649e);
                    return;
                }
                this.f7649e.w1().dismiss();
                ChangeMpinOtpVerif changeMpinOtpVerif = this.f7649e;
                changeMpinOtpVerif.I1(changeMpinOtpVerif, String.valueOf(otpVerifyResult.getStatusDesc()));
            } catch (Exception unused) {
                this.f7649e.w1().dismiss();
                ChangeMpinOtpVerif changeMpinOtpVerif2 = this.f7649e;
                changeMpinOtpVerif2.I1(changeMpinOtpVerif2, changeMpinOtpVerif2.z1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeMpinOtpVerif f7650e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ChangeMpinOtpVerif changeMpinOtpVerif) {
            super(1);
            this.f7650e = changeMpinOtpVerif;
        }

        public final void b(String str) {
            this.f7650e.w1().dismiss();
            ChangeMpinOtpVerif changeMpinOtpVerif = this.f7650e;
            changeMpinOtpVerif.I1(changeMpinOtpVerif, changeMpinOtpVerif.z1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeMpinOtpVerif f7651e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ChangeMpinOtpVerif changeMpinOtpVerif) {
            super(1);
            this.f7651e = changeMpinOtpVerif;
        }

        public final void b(ResendOtp resendOtp) {
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f7651e.w1().dismiss();
                    ChangeMpinOtpVerif changeMpinOtpVerif = this.f7651e;
                    changeMpinOtpVerif.I1(changeMpinOtpVerif, changeMpinOtpVerif.z1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (!ka.c.f13158a.m(resendOtp.getStatusDesc())) {
                    this.f7651e.w1().dismiss();
                    ChangeMpinOtpVerif changeMpinOtpVerif2 = this.f7651e;
                    changeMpinOtpVerif2.I1(changeMpinOtpVerif2, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                this.f7651e.w1().dismiss();
                ChangeMpinOtpVerif changeMpinOtpVerif3 = this.f7651e;
                changeMpinOtpVerif3.I1(changeMpinOtpVerif3, changeMpinOtpVerif3.z1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeMpinOtpVerif f7652e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChangeMpinOtpVerif changeMpinOtpVerif) {
            super(1);
            this.f7652e = changeMpinOtpVerif;
        }

        public final void b(String str) {
            this.f7652e.w1().dismiss();
            ChangeMpinOtpVerif changeMpinOtpVerif = this.f7652e;
            changeMpinOtpVerif.I1(changeMpinOtpVerif, changeMpinOtpVerif.z1().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7653a;

        g(bm.l lVar) {
            l.f(lVar, "function");
            this.f7653a = lVar;
        }

        public final pl.c a() {
            return this.f7653a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7653a.invoke(obj);
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
    public static final void D1(ChangeMpinOtpVerif changeMpinOtpVerif, View view) {
        l.f(changeMpinOtpVerif, "this$0");
        changeMpinOtpVerif.finish();
    }

    /* access modifiers changed from: private */
    public static final void E1(ChangeMpinOtpVerif changeMpinOtpVerif, View view) {
        EditText q12;
        TransformationMethod instance;
        l.f(changeMpinOtpVerif, "this$0");
        if (changeMpinOtpVerif.q1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            changeMpinOtpVerif.A1().setImageResource(R.drawable.pass_visible);
            q12 = changeMpinOtpVerif.q1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            changeMpinOtpVerif.A1().setImageResource(R.drawable.mvvm_visibility);
            q12 = changeMpinOtpVerif.q1();
            instance = PasswordTransformationMethod.getInstance();
        }
        q12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void F1(ChangeMpinOtpVerif changeMpinOtpVerif, View view) {
        l.f(changeMpinOtpVerif, "this$0");
        new b(changeMpinOtpVerif).start();
        changeMpinOtpVerif.w1().show();
        changeMpinOtpVerif.C1().j(changeMpinOtpVerif.v1());
    }

    /* access modifiers changed from: private */
    public static final void G1(ChangeMpinOtpVerif changeMpinOtpVerif, View view) {
        ld.c z12;
        String str;
        l.f(changeMpinOtpVerif, "this$0");
        String obj = changeMpinOtpVerif.q1().getText().toString();
        if (obj == null || obj.length() == 0) {
            z12 = changeMpinOtpVerif.z1();
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            z12 = changeMpinOtpVerif.z1();
            str = "Please enter the valid OTP";
        } else {
            changeMpinOtpVerif.w1().show();
            changeMpinOtpVerif.C1().l(obj, changeMpinOtpVerif.v1(), changeMpinOtpVerif.t1(), changeMpinOtpVerif);
            return;
        }
        changeMpinOtpVerif.I1(changeMpinOtpVerif, z12.b("label_log_entr_otp", str));
    }

    /* access modifiers changed from: private */
    public static final void H1(ChangeMpinOtpVerif changeMpinOtpVerif, Integer num) {
        l.f(changeMpinOtpVerif, "this$0");
        changeMpinOtpVerif.w1().dismiss();
        if (num != null && num.intValue() == 1) {
            new ld.g(changeMpinOtpVerif).a(changeMpinOtpVerif.u1());
            String b10 = changeMpinOtpVerif.z1().b("label_log_mpin_rest_succ", "MPIN reset successfully!");
            l.c(b10);
            changeMpinOtpVerif.m1(changeMpinOtpVerif, b10);
            return;
        }
        changeMpinOtpVerif.w1().cancel();
        Toast.makeText(changeMpinOtpVerif.getApplicationContext(), changeMpinOtpVerif.z1().b("label_log_unbl_ctrt_mpin", "Unable to create the MPIN, Please try after some time"), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void J1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void n1(Dialog dialog, ChangeMpinOtpVerif changeMpinOtpVerif, View view) {
        l.f(dialog, "$dialog");
        l.f(changeMpinOtpVerif, "this$0");
        dialog.dismiss();
        changeMpinOtpVerif.startActivity(new Intent(changeMpinOtpVerif, SignInScreen.class));
        changeMpinOtpVerif.finish();
    }

    public final ImageView A1() {
        ImageView imageView = this.R;
        if (imageView != null) {
            return imageView;
        }
        l.v("showmpin");
        return null;
    }

    public final LinearLayout B1() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("submit");
        return null;
    }

    public final v8.d C1() {
        v8.d dVar = this.M;
        if (dVar != null) {
            return dVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void I1(Context context, String str) {
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
        ((TextView) findViewById3).setText(z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(z1().b("btn_ok", "OK"));
        textView.setOnClickListener(new u8.g(dialog));
        dialog.show();
    }

    public final void K1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.Q = imageView;
    }

    public final void L1(TextView textView) {
        l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void M1(TextView textView) {
        l.f(textView, "<set-?>");
        this.O = textView;
    }

    public final void N1(EditText editText) {
        l.f(editText, "<set-?>");
        this.I = editText;
    }

    public final void O1(qc.b bVar) {
        l.f(bVar, "<set-?>");
        this.V = bVar;
    }

    public final void P1(UserBloodDetails userBloodDetails) {
        l.f(userBloodDetails, "<set-?>");
        this.W = userBloodDetails;
    }

    public final void Q1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void T1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.P = progressDialog;
    }

    public final void U1(TextView textView) {
        l.f(textView, "<set-?>");
        this.S = textView;
    }

    public final void V1(SignService signService) {
        l.f(signService, "<set-?>");
        this.N = signService;
    }

    public final void W1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void X1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.R = imageView;
    }

    public final void Y1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.G = linearLayout;
    }

    public final void Z1(v8.d dVar) {
        l.f(dVar, "<set-?>");
        this.M = dVar;
    }

    public final void m1(Context context, String str) {
        l.f(context, "context");
        l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.succes_mpin);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(z1().b("btn_ok", "OK"));
        textView.setOnClickListener(new u8.f(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cc c10 = cc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.U = c10;
        cc ccVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        cc ccVar2 = this.U;
        if (ccVar2 == null) {
            l.v("binding");
            ccVar2 = null;
        }
        aVar.L0(this, ccVar2);
        W1(new ld.c(this));
        V1(SignService.f7644a.c(this));
        P1(UserBloodDetails.f9372a.c(this));
        O1((qc.b) new u0((x0) this, (u0.b) new qc.a(new pc.a(s1()))).a(qc.b.class));
        View findViewById = findViewById(R.id.submit);
        l.e(findViewById, "findViewById(...)");
        Y1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.enterOtp);
        l.e(findViewById2, "findViewById(...)");
        N1((EditText) findViewById2);
        View findViewById3 = findViewById(R.id.disPlay);
        l.e(findViewById3, "findViewById(...)");
        M1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.default_otp);
        l.e(findViewById4, "findViewById(...)");
        L1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.showmpin);
        l.e(findViewById5, "findViewById(...)");
        X1((ImageView) findViewById5);
        View findViewById6 = findViewById(R.id.resendOtp);
        l.e(findViewById6, "findViewById(...)");
        U1((TextView) findViewById6);
        T1(new ProgressDialog(this));
        w1().setMessage(z1().b("label_challan_please_wait", "Please wait..."));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        View findViewById7 = findViewById(R.id.backButton);
        l.e(findViewById7, "findViewById(...)");
        K1((ImageView) findViewById7);
        p1().setOnClickListener(new u8.a(this));
        A1().setOnClickListener(new u8.b(this));
        Intent intent = getIntent();
        if (intent != null) {
            try {
                cc ccVar3 = this.U;
                if (ccVar3 == null) {
                    l.v("binding");
                    ccVar3 = null;
                }
                ccVar3.f25775n.setText(intent.getStringExtra("title"));
                S1(String.valueOf(intent.getStringExtra("otpId")));
                Q1(String.valueOf(intent.getStringExtra("MobileNumber")));
                R1(String.valueOf(intent.getStringExtra("NewMpin")));
                String t12 = t1();
                int length = t12.length();
                String str = "";
                for (int i10 = 0; i10 < length; i10++) {
                    t12.charAt(i10);
                    str = new km.f("\\d(?=\\d{4})").b(new km.f("[^0-9]").b(t1(), ""), "X");
                }
                cc ccVar4 = this.U;
                if (ccVar4 == null) {
                    l.v("binding");
                } else {
                    ccVar = ccVar4;
                }
                ccVar.f25779r.setText(z1().b("label_otp_sent_to_mobile", "OTP has been sent to your registered mobile +91") + str);
                new a(this).start();
            } catch (Exception unused) {
            }
        }
        x1().setOnClickListener(new u8.c(this));
        B1().setOnClickListener(new u8.d(this));
        Z1((v8.d) new u0((x0) this, (u0.b) new v8.c(new s8.b(y1()))).a(v8.d.class));
        C1().k().g(this, new g(new c(this)));
        C1().g().g(this, new g(new d(this)));
        C1().i().g(this, new g(new e(this)));
        C1().h().g(this, new g(new f(this)));
        r1().n().g(this, new u8.e(this));
    }

    public final ImageView p1() {
        ImageView imageView = this.Q;
        if (imageView != null) {
            return imageView;
        }
        l.v("backButton");
        return null;
    }

    public final EditText q1() {
        EditText editText = this.I;
        if (editText != null) {
            return editText;
        }
        l.v("enterOtp");
        return null;
    }

    public final qc.b r1() {
        qc.b bVar = this.V;
        if (bVar != null) {
            return bVar;
        }
        l.v("mUserBloodViewModel");
        return null;
    }

    public final UserBloodDetails s1() {
        UserBloodDetails userBloodDetails = this.W;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        l.v("mUserService");
        return null;
    }

    public final String t1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("mobile_number");
        return null;
    }

    public final String u1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("NewMpin");
        return null;
    }

    public final String v1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("otpId");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.P;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final TextView x1() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        l.v("resendOtp");
        return null;
    }

    public final SignService y1() {
        SignService signService = this.N;
        if (signService != null) {
            return signService;
        }
        l.v("retrofitService");
        return null;
    }

    public final ld.c z1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }
}
