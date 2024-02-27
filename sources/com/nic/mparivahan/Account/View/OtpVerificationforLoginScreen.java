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
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.RCDownloadService.SaveVirtualRCService;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import ld.g;
import ni.h9;
import pl.x;
import u8.c0;
import u8.d0;
import u8.e0;
import u8.f0;
import u8.g0;
import v9.e;

public final class OtpVerificationforLoginScreen extends androidx.appcompat.app.d {
    public LinearLayout G;
    public TextView H;
    public EditText I;
    public String J;
    public String K;
    public TextView L;
    public v8.f M;
    public TextView N;
    public ProgressDialog O;
    public ImageView P;
    public ImageView Q;
    public DatabaseHelper R;
    public g S;
    private h9 T;
    public ld.c U;
    private int V;
    private SignService W;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerificationforLoginScreen f7672e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OtpVerificationforLoginScreen otpVerificationforLoginScreen) {
            super(1);
            this.f7672e = otpVerificationforLoginScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (!p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    this.f7672e.q1().dismiss();
                    OtpVerificationforLoginScreen otpVerificationforLoginScreen = this.f7672e;
                    otpVerificationforLoginScreen.A1(otpVerificationforLoginScreen, otpVerificationforLoginScreen.s1().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f7672e.q1().dismiss();
                OtpVerificationforLoginScreen otpVerificationforLoginScreen2 = this.f7672e;
                otpVerificationforLoginScreen2.A1(otpVerificationforLoginScreen2, otpVerificationforLoginScreen2.s1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerificationforLoginScreen f7673e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OtpVerificationforLoginScreen otpVerificationforLoginScreen) {
            super(1);
            this.f7673e = otpVerificationforLoginScreen;
        }

        public final void b(String str) {
            this.f7673e.q1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerificationforLoginScreen f7674e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OtpVerificationforLoginScreen otpVerificationforLoginScreen) {
            super(1);
            this.f7674e = otpVerificationforLoginScreen;
        }

        public final void b(ResendOtp resendOtp) {
            OtpVerificationforLoginScreen otpVerificationforLoginScreen;
            ld.c s12;
            String str;
            String str2;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f7674e.q1().dismiss();
                    otpVerificationforLoginScreen = this.f7674e;
                    s12 = otpVerificationforLoginScreen.s1();
                    str = "label_log_resend_otp";
                    str2 = "We have resent the OTP Verification to your mobile number";
                } else if (!p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    this.f7674e.q1().dismiss();
                    otpVerificationforLoginScreen = this.f7674e;
                    s12 = otpVerificationforLoginScreen.s1();
                    str = "label_log_invalid_otp";
                    str2 = "The OTP you entered is invalid, Please enter the correct OTP";
                } else {
                    return;
                }
                otpVerificationforLoginScreen.A1(otpVerificationforLoginScreen, s12.b(str, str2));
            } catch (Exception unused) {
                this.f7674e.q1().dismiss();
                OtpVerificationforLoginScreen otpVerificationforLoginScreen2 = this.f7674e;
                otpVerificationforLoginScreen2.A1(otpVerificationforLoginScreen2, otpVerificationforLoginScreen2.s1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerificationforLoginScreen f7675e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(OtpVerificationforLoginScreen otpVerificationforLoginScreen) {
            super(1);
            this.f7675e = otpVerificationforLoginScreen;
        }

        public final void b(GetVirtualDocDetails getVirtualDocDetails) {
            Intent intent;
            Intent intent2;
            Class<DashBoard> cls = DashBoard.class;
            Class<SearchChallanOnlineActivity> cls2 = SearchChallanOnlineActivity.class;
            if (p.o(getVirtualDocDetails.getStatusCode(), "VTLD005", true)) {
                this.f7675e.q1().dismiss();
                Toast.makeText(this.f7675e.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
                if (this.f7675e.n1() == 1) {
                    intent2 = new Intent(this.f7675e, cls2);
                } else {
                    intent = new Intent(this.f7675e, cls);
                    this.f7675e.startActivity(intent);
                    this.f7675e.finishAffinity();
                    return;
                }
            } else if (p.o(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
                getVirtualDocDetails.getMparCitizenDocInfo();
                SaveVirtualRCService.a aVar = SaveVirtualRCService.f8394k;
                OtpVerificationforLoginScreen otpVerificationforLoginScreen = this.f7675e;
                cm.l.c(getVirtualDocDetails);
                aVar.a(otpVerificationforLoginScreen, getVirtualDocDetails);
                this.f7675e.q1().dismiss();
                Toast.makeText(this.f7675e.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
                if (this.f7675e.n1() == 1) {
                    intent2 = new Intent(this.f7675e, cls2);
                } else {
                    intent = new Intent(this.f7675e, cls);
                    this.f7675e.startActivity(intent);
                    this.f7675e.finishAffinity();
                    return;
                }
            } else {
                this.f7675e.q1().dismiss();
                Toast.makeText(this.f7675e.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
                if (this.f7675e.n1() == 1) {
                    intent2 = new Intent(this.f7675e, cls2);
                } else {
                    intent = new Intent(this.f7675e, cls);
                    this.f7675e.startActivity(intent);
                    this.f7675e.finishAffinity();
                    return;
                }
            }
            this.f7675e.startActivity(intent2);
            this.f7675e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetVirtualDocDetails) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerificationforLoginScreen f7676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(OtpVerificationforLoginScreen otpVerificationforLoginScreen) {
            super(1);
            this.f7676e = otpVerificationforLoginScreen;
        }

        public final void b(String str) {
            this.f7676e.q1().cancel();
            Toast.makeText(this.f7676e.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
            if (this.f7676e.n1() == 1) {
                this.f7676e.startActivity(new Intent(this.f7676e, SearchChallanOnlineActivity.class));
                this.f7676e.finish();
                return;
            }
            this.f7676e.startActivity(new Intent(this.f7676e, DashBoard.class));
            this.f7676e.finishAffinity();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7677a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f7677a = lVar;
        }

        public final pl.c a() {
            return this.f7677a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7677a.invoke(obj);
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
    public static final void B1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w1(OtpVerificationforLoginScreen otpVerificationforLoginScreen, View view) {
        cm.l.f(otpVerificationforLoginScreen, "this$0");
        otpVerificationforLoginScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void x1(OtpVerificationforLoginScreen otpVerificationforLoginScreen, View view) {
        EditText m12;
        TransformationMethod instance;
        cm.l.f(otpVerificationforLoginScreen, "this$0");
        if (otpVerificationforLoginScreen.m1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            otpVerificationforLoginScreen.t1().setImageResource(R.drawable.pass_visible);
            m12 = otpVerificationforLoginScreen.m1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            otpVerificationforLoginScreen.t1().setImageResource(R.drawable.mvvm_visibility);
            m12 = otpVerificationforLoginScreen.m1();
            instance = PasswordTransformationMethod.getInstance();
        }
        m12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void y1(OtpVerificationforLoginScreen otpVerificationforLoginScreen, View view) {
        cm.l.f(otpVerificationforLoginScreen, "this$0");
        otpVerificationforLoginScreen.q1().show();
        otpVerificationforLoginScreen.v1().n(otpVerificationforLoginScreen.p1());
    }

    /* access modifiers changed from: private */
    public static final void z1(OtpVerificationforLoginScreen otpVerificationforLoginScreen, View view) {
        ld.c s12;
        String str;
        String str2;
        cm.l.f(otpVerificationforLoginScreen, "this$0");
        ka.c.f13158a.l(otpVerificationforLoginScreen);
        String obj = otpVerificationforLoginScreen.m1().getText().toString();
        if (obj == null || obj.length() == 0) {
            s12 = otpVerificationforLoginScreen.s1();
            str = "label_log_entr_otp";
            str2 = "Please enter the OTP";
        } else if (obj.length() < 6) {
            s12 = otpVerificationforLoginScreen.s1();
            str = "enter_valid_otp";
            str2 = "Please enter the valid OTP";
        } else {
            otpVerificationforLoginScreen.q1().show();
            otpVerificationforLoginScreen.v1().t(obj, otpVerificationforLoginScreen.p1());
            return;
        }
        otpVerificationforLoginScreen.A1(otpVerificationforLoginScreen, s12.b(str, str2));
    }

    public final void A1(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(s1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(s1().b("btn_ok", "OK"));
        textView.setOnClickListener(new g0(dialog));
        dialog.show();
    }

    public final void C1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.P = imageView;
    }

    public final void D1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.R = databaseHelper;
    }

    public final void E1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void F1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final void G1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.I = editText;
    }

    public final void H1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final void J1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final void K1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void L1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void M1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.Q = imageView;
    }

    public final void N1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.S = gVar;
    }

    public final void O1(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.G = linearLayout;
    }

    public final void P1(v8.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.M = fVar;
    }

    public final ImageView k1() {
        ImageView imageView = this.P;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("backButton");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        cm.l.v("disPlay");
        return null;
    }

    public final EditText m1() {
        EditText editText = this.I;
        if (editText != null) {
            return editText;
        }
        cm.l.v("enterOtp");
        return null;
    }

    public final int n1() {
        return this.V;
    }

    public final String o1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("mobile_number");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h9 c10 = h9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.T = c10;
        SignService signService = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        h9 h9Var = this.T;
        if (h9Var == null) {
            cm.l.v("binding");
            h9Var = null;
        }
        aVar.y1(this, h9Var);
        L1(new ld.c(this));
        this.W = SignService.f7644a.c(this);
        View findViewById = findViewById(R.id.verify_user);
        cm.l.e(findViewById, "findViewById(...)");
        O1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.default_otp);
        cm.l.e(findViewById2, "findViewById(...)");
        E1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.enterOtp);
        cm.l.e(findViewById3, "findViewById(...)");
        G1((EditText) findViewById3);
        View findViewById4 = findViewById(R.id.disPlay);
        cm.l.e(findViewById4, "findViewById(...)");
        F1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.resendOtp);
        cm.l.e(findViewById5, "findViewById(...)");
        K1((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.showmpin);
        cm.l.e(findViewById6, "findViewById(...)");
        M1((ImageView) findViewById6);
        J1(new ProgressDialog(this));
        q1().setMessage(s1().b("label_challan_please_wait", "Please wait..."));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        N1(new g(this));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        D1(A0);
        View findViewById7 = findViewById(R.id.backButton);
        cm.l.e(findViewById7, "findViewById(...)");
        C1((ImageView) findViewById7);
        k1().setOnClickListener(new c0(this));
        t1().setOnClickListener(new d0(this));
        new g(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.V = intent.getIntExtra(v9.d.f17494a.o(), 0);
                I1(String.valueOf(intent.getStringExtra("otpId")));
                H1(String.valueOf(intent.getStringExtra("MobileNumber")));
                String o12 = o1();
                int length = o12.length();
                String str = "";
                for (int i10 = 0; i10 < length; i10++) {
                    o12.charAt(i10);
                    str = new km.f("\\d(?=\\d{4})").b(new km.f("[^0-9]").b(o1(), ""), "X");
                }
                l1().setText("+91 " + str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        r1().setOnClickListener(new e0(this));
        SignService signService2 = this.W;
        if (signService2 == null) {
            cm.l.v("retrofitService");
        } else {
            signService = signService2;
        }
        P1((v8.f) new u0((x0) this, (u0.b) new v8.e(new s8.b(signService))).a(v8.f.class));
        v1().o().g(this, new f(new a(this)));
        v1().i().g(this, new f(new b(this)));
        v1().m().g(this, new f(new c(this)));
        v1().j().g(this, new f(new d(this)));
        v1().k().g(this, new f(new e(this)));
        u1().setOnClickListener(new f0(this));
    }

    public final String p1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("otpId");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final TextView r1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("resendOtp");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ImageView t1() {
        ImageView imageView = this.Q;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("showmpin");
        return null;
    }

    public final LinearLayout u1() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("verify_user");
        return null;
    }

    public final v8.f v1() {
        v8.f fVar = this.M;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
