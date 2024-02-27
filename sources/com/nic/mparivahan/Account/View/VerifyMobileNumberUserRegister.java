package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bm.l;
import cm.h;
import cm.m;
import cm.u;
import com.nic.mparivahan.Account.CreateAccountServices;
import com.nic.mparivahan.Account.Model.MparCitizenUserX;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.otpRegistartionResult;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PushNotification.LoginServiceToken;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import ld.g;
import ni.h9;
import pl.x;
import u8.a1;
import u8.b1;
import u8.x0;
import u8.y0;
import u8.z0;
import v8.i;
import v8.j;
import v9.e;

public final class VerifyMobileNumberUserRegister extends androidx.appcompat.app.d {
    public LinearLayout G;
    public String H;
    public String I;
    public String J;
    public String K;
    public TextView L;
    public EditText M;
    public String N;
    public String O;
    public j P;
    public CreateAccountServices Q;
    public ProgressDialog R;
    public TextView S;
    public ImageView T;
    public TextView U;
    public ImageView V;
    private h9 W;
    public ld.c X;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f7701e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ VerifyMobileNumberUserRegister f7702f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, VerifyMobileNumberUserRegister verifyMobileNumberUserRegister) {
            super(1);
            this.f7701e = uVar;
            this.f7702f = verifyMobileNumberUserRegister;
        }

        public final void b(otpRegistartionResult otpregistartionresult) {
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister;
            String statusDesc;
            String statusDesc2;
            try {
                if (p.o(otpregistartionresult.getStatusCode(), "AL001", true)) {
                    if (((g) this.f7701e.f20234e).t()) {
                        ((g) this.f7701e.f20234e).u();
                        DatabaseHelper A0 = DatabaseHelper.A0(this.f7702f);
                        cm.l.e(A0, "getInstance(...)");
                        A0.R();
                        A0.close();
                        new ld.a(this.f7702f).e();
                        NaxpToKenService.f9438k.a(this.f7702f);
                    }
                    this.f7702f.s1().dismiss();
                    g gVar = (g) this.f7701e.f20234e;
                    MparCitizenUserX mparCitizenUser = otpregistartionresult.getMparCitizenUser();
                    String valueOf = String.valueOf(mparCitizenUser != null ? Long.valueOf(mparCitizenUser.getCtzRecordId()) : null);
                    String p12 = this.f7702f.p1();
                    String o12 = this.f7702f.o1();
                    String m12 = this.f7702f.m1();
                    String q12 = this.f7702f.q1();
                    MparCitizenUserX mparCitizenUser2 = otpregistartionresult.getMparCitizenUser();
                    String ctzStateCd = mparCitizenUser2 != null ? mparCitizenUser2.getCtzStateCd() : null;
                    Boolean bool = Boolean.TRUE;
                    MparCitizenUserX mparCitizenUser3 = otpregistartionresult.getMparCitizenUser();
                    gVar.b(valueOf, p12, o12, m12, q12, ctzStateCd, bool, mparCitizenUser3 != null ? Boolean.valueOf(mparCitizenUser3.getCtzMpinStatus()) : null);
                    LoginServiceToken.f9432k.a(this.f7702f);
                    Toast.makeText(this.f7702f.getApplicationContext(), this.f7702f.v1().b(v9.f.f17510a.k0(), "User registered successfully with NextGen mParivahan"), 1).show();
                    this.f7702f.startActivity(new Intent(this.f7702f, DashBoard.class));
                    this.f7702f.finishAffinity();
                    return;
                }
                if (p.o(otpregistartionresult.getStatusCode(), "AL002", true)) {
                    this.f7702f.s1().dismiss();
                    verifyMobileNumberUserRegister = this.f7702f;
                    statusDesc2 = otpregistartionresult.getStatusDesc();
                } else if (p.o(otpregistartionresult.getStatusCode(), "AL003", true)) {
                    this.f7702f.s1().dismiss();
                    verifyMobileNumberUserRegister = this.f7702f;
                    statusDesc2 = otpregistartionresult.getStatusDesc();
                } else if (p.o(otpregistartionresult.getStatusCode(), "AL004", true)) {
                    this.f7702f.s1().dismiss();
                    verifyMobileNumberUserRegister = this.f7702f;
                    statusDesc2 = otpregistartionresult.getStatusDesc();
                } else {
                    this.f7702f.s1().dismiss();
                    if (!ka.c.f13158a.m(otpregistartionresult.getStatusDesc())) {
                        verifyMobileNumberUserRegister = this.f7702f;
                        statusDesc = otpregistartionresult.getStatusDesc();
                        verifyMobileNumberUserRegister.E1(verifyMobileNumberUserRegister, statusDesc);
                    }
                    VerifyMobileNumberUserRegister verifyMobileNumberUserRegister2 = this.f7702f;
                    verifyMobileNumberUserRegister2.E1(verifyMobileNumberUserRegister2, verifyMobileNumberUserRegister2.v1().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                    return;
                }
                statusDesc = statusDesc2.toString();
                verifyMobileNumberUserRegister.E1(verifyMobileNumberUserRegister, statusDesc);
            } catch (Exception unused) {
                this.f7702f.s1().dismiss();
                VerifyMobileNumberUserRegister verifyMobileNumberUserRegister3 = this.f7702f;
                verifyMobileNumberUserRegister3.E1(verifyMobileNumberUserRegister3, verifyMobileNumberUserRegister3.v1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((otpRegistartionResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyMobileNumberUserRegister f7703e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister) {
            super(1);
            this.f7703e = verifyMobileNumberUserRegister;
        }

        public final void b(String str) {
            this.f7703e.s1().dismiss();
            Log.e("error", str.toString());
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = this.f7703e;
            verifyMobileNumberUserRegister.E1(verifyMobileNumberUserRegister, verifyMobileNumberUserRegister.v1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some times"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyMobileNumberUserRegister f7704e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister) {
            super(1);
            this.f7704e = verifyMobileNumberUserRegister;
        }

        public final void b(ResendOtp resendOtp) {
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister;
            ld.c v12;
            String str;
            String str2;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f7704e.s1().dismiss();
                    verifyMobileNumberUserRegister = this.f7704e;
                    v12 = verifyMobileNumberUserRegister.v1();
                    str = "label_log_resend_otp";
                    str2 = "We have resent the OTP Verification to your mobile number";
                } else if (!ka.c.f13158a.m(resendOtp.getStatusDesc())) {
                    VerifyMobileNumberUserRegister verifyMobileNumberUserRegister2 = this.f7704e;
                    verifyMobileNumberUserRegister2.E1(verifyMobileNumberUserRegister2, resendOtp.getStatusDesc());
                    return;
                } else {
                    this.f7704e.s1().dismiss();
                    verifyMobileNumberUserRegister = this.f7704e;
                    v12 = verifyMobileNumberUserRegister.v1();
                    str = "label_log_invalid_otp";
                    str2 = "The OTP you entered is invalid, Please enter the correct OTP";
                }
                verifyMobileNumberUserRegister.E1(verifyMobileNumberUserRegister, v12.b(str, str2));
            } catch (Exception unused) {
                this.f7704e.s1().dismiss();
                VerifyMobileNumberUserRegister verifyMobileNumberUserRegister3 = this.f7704e;
                verifyMobileNumberUserRegister3.E1(verifyMobileNumberUserRegister3, verifyMobileNumberUserRegister3.v1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyMobileNumberUserRegister f7705e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister) {
            super(1);
            this.f7705e = verifyMobileNumberUserRegister;
        }

        public final void b(String str) {
            this.f7705e.s1().dismiss();
            Log.e("error", str.toString());
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = this.f7705e;
            verifyMobileNumberUserRegister.E1(verifyMobileNumberUserRegister, verifyMobileNumberUserRegister.v1().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyMobileNumberUserRegister f7706e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister) {
            super(1);
            this.f7706e = verifyMobileNumberUserRegister;
        }

        public final void b(String str) {
            Log.e("error--", str.toString());
            this.f7706e.s1().dismiss();
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = this.f7706e;
            verifyMobileNumberUserRegister.E1(verifyMobileNumberUserRegister, verifyMobileNumberUserRegister.v1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7707a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f7707a = lVar;
        }

        public final pl.c a() {
            return this.f7707a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7707a.invoke(obj);
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
    public static final void A1(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister, View view) {
        EditText n12;
        TransformationMethod instance;
        cm.l.f(verifyMobileNumberUserRegister, "this$0");
        if (verifyMobileNumberUserRegister.n1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            verifyMobileNumberUserRegister.w1().setImageResource(R.drawable.pass_visible);
            n12 = verifyMobileNumberUserRegister.n1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            verifyMobileNumberUserRegister.w1().setImageResource(R.drawable.mvvm_visibility);
            n12 = verifyMobileNumberUserRegister.n1();
            instance = PasswordTransformationMethod.getInstance();
        }
        n12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void B1(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister, View view) {
        cm.l.f(verifyMobileNumberUserRegister, "this$0");
        verifyMobileNumberUserRegister.finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister, View view) {
        cm.l.f(verifyMobileNumberUserRegister, "this$0");
        verifyMobileNumberUserRegister.s1().show();
        verifyMobileNumberUserRegister.z1().k(verifyMobileNumberUserRegister.r1());
    }

    /* access modifiers changed from: private */
    public static final void D1(VerifyMobileNumberUserRegister verifyMobileNumberUserRegister, View view) {
        ld.c v12;
        String str;
        cm.l.f(verifyMobileNumberUserRegister, "this$0");
        String obj = verifyMobileNumberUserRegister.n1().getText().toString();
        if (obj == null || obj.length() == 0) {
            v12 = verifyMobileNumberUserRegister.v1();
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            v12 = verifyMobileNumberUserRegister.v1();
            str = "Please enter the valid OTP";
        } else {
            verifyMobileNumberUserRegister.s1().show();
            verifyMobileNumberUserRegister.z1().o(obj, verifyMobileNumberUserRegister.r1(), verifyMobileNumberUserRegister.p1(), verifyMobileNumberUserRegister.o1(), verifyMobileNumberUserRegister.m1(), verifyMobileNumberUserRegister.q1(), verifyMobileNumberUserRegister.x1(), verifyMobileNumberUserRegister);
            return;
        }
        verifyMobileNumberUserRegister.E1(verifyMobileNumberUserRegister, v12.b("label_log_entr_otp", str));
    }

    /* access modifiers changed from: private */
    public static final void F1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void E1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(v1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(v1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new b1(dialog));
        dialog.show();
    }

    public final void G1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.T = imageView;
    }

    public final void H1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void I1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.S = textView;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void K1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.M = editText;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.H = str;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.I = str;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void P1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.R = progressDialog;
    }

    public final void Q1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.U = textView;
    }

    public final void R1(CreateAccountServices createAccountServices) {
        cm.l.f(createAccountServices, "<set-?>");
        this.Q = createAccountServices;
    }

    public final void S1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void T1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.V = imageView;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void V1(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.G = linearLayout;
    }

    public final void W1(j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.P = jVar;
    }

    public final ImageView k1() {
        ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("backButton");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        cm.l.v("disPlay");
        return null;
    }

    public final String m1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("email_text");
        return null;
    }

    public final EditText n1() {
        EditText editText = this.M;
        if (editText != null) {
            return editText;
        }
        cm.l.v("enterOtp");
        return null;
    }

    public final String o1() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        cm.l.v("fullname_text");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h9 c10 = h9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.W = c10;
        h9 h9Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        h9 h9Var2 = this.W;
        if (h9Var2 == null) {
            cm.l.v("binding");
        } else {
            h9Var = h9Var2;
        }
        aVar.U2(this, h9Var);
        S1(new ld.c(this));
        View findViewById = findViewById(R.id.verify_user);
        cm.l.e(findViewById, "findViewById(...)");
        V1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.default_otp);
        cm.l.e(findViewById2, "findViewById(...)");
        H1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.enterOtp);
        cm.l.e(findViewById3, "findViewById(...)");
        K1((EditText) findViewById3);
        View findViewById4 = findViewById(R.id.disPlay);
        cm.l.e(findViewById4, "findViewById(...)");
        I1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.resendOtp);
        cm.l.e(findViewById5, "findViewById(...)");
        Q1((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.showmpin);
        cm.l.e(findViewById6, "findViewById(...)");
        T1((ImageView) findViewById6);
        R1(CreateAccountServices.f7640a.c(this));
        w1().setOnClickListener(new x0(this));
        View findViewById7 = findViewById(R.id.backButton);
        cm.l.e(findViewById7, "findViewById(...)");
        G1((ImageView) findViewById7);
        k1().setOnClickListener(new y0(this));
        P1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        u uVar = new u();
        uVar.f20234e = new g(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                L1(String.valueOf(intent.getStringExtra("FullName")));
                M1(String.valueOf(intent.getStringExtra("MobileNo")));
                N1(String.valueOf(intent.getStringExtra("MPIN")));
                J1(String.valueOf(intent.getStringExtra("Email")));
                O1(String.valueOf(intent.getStringExtra("otpId")));
                U1(String.valueOf(intent.getStringExtra("StateCode")));
                String p12 = p1();
                int length = p12.length();
                String str = "";
                for (int i10 = 0; i10 < length; i10++) {
                    p12.charAt(i10);
                    str = new km.f("\\d(?=\\d{4})").b(new km.f("[^0-9]").b(p1(), ""), "X");
                }
                l1().setText("+91 " + str);
            } catch (Exception unused) {
            }
        }
        t1().setOnClickListener(new z0(this));
        W1((j) new u0((androidx.lifecycle.x0) this, (u0.b) new i(new s8.a(u1()))).a(j.class));
        z1().l().g(this, new f(new a(uVar, this)));
        z1().g().g(this, new f(new b(this)));
        y1().setOnClickListener(new a1(this));
        z1().j().g(this, new f(new c(this)));
        z1().i().g(this, new f(new d(this)));
        z1().h().g(this, new f(new e(this)));
    }

    public final String p1() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        cm.l.v("mobile_number_text");
        return null;
    }

    public final String q1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("mpin_text");
        return null;
    }

    public final String r1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("otpId");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.R;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final TextView t1() {
        TextView textView = this.U;
        if (textView != null) {
            return textView;
        }
        cm.l.v("resendOtp");
        return null;
    }

    public final CreateAccountServices u1() {
        CreateAccountServices createAccountServices = this.Q;
        if (createAccountServices != null) {
            return createAccountServices;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ld.c v1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ImageView w1() {
        ImageView imageView = this.V;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("showmpin");
        return null;
    }

    public final String x1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("StateCode");
        return null;
    }

    public final LinearLayout y1() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("verify_user");
        return null;
    }

    public final j z1() {
        j jVar = this.P;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
