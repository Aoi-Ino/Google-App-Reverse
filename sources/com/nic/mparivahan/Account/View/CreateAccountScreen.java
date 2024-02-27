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
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.Account.CreateAccountServices;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Account.Model.UserRegisterResult;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import ni.hc;
import pl.x;
import t8.c;
import u8.n;
import u8.o;
import u8.p;
import v9.e;

public final class CreateAccountScreen extends androidx.appcompat.app.d {
    private hc G;
    public TextView H;
    public LinearLayout I;
    public EditText J;
    public EditText K;
    public EditText L;
    public EditText M;
    public EditText N;
    public v8.b O;
    public CreateAccountServices P;
    public ProgressDialog Q;
    public ImageView R;
    public ImageView S;
    public ImageView T;
    public Spinner U;
    public TextView V;
    public v8.j W;
    public ld.c X;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7654e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7654e = createAccountScreen;
        }

        public final void b(UserRegisterResult userRegisterResult) {
            try {
                if (p.o(userRegisterResult.getStatusCode(), "CTZN001", true)) {
                    this.f7654e.F1().h(this.f7654e.w1().getText().toString());
                    return;
                }
                this.f7654e.y1().dismiss();
                CreateAccountScreen createAccountScreen = this.f7654e;
                createAccountScreen.O1(createAccountScreen, createAccountScreen.v1().b(v9.f.f17510a.L0(), "Unable to register the user. Please try after some time"));
            } catch (Exception unused) {
                this.f7654e.y1().dismiss();
                CreateAccountScreen createAccountScreen2 = this.f7654e;
                createAccountScreen2.O1(createAccountScreen2, createAccountScreen2.v1().b(v9.f.f17510a.L0(), "Unable to register the user. Please try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UserRegisterResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7655e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7655e = createAccountScreen;
        }

        public final void b(String str) {
            this.f7655e.y1().dismiss();
            CreateAccountScreen createAccountScreen = this.f7655e;
            createAccountScreen.O1(createAccountScreen, createAccountScreen.v1().b(v9.f.f17510a.L0(), "Unable to register the user. Please try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7656e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7656e = createAccountScreen;
        }

        public final void b(StateMaster stateMaster) {
            q8.a aVar;
            Spinner B1;
            try {
                if (p.o(stateMaster.getStatusCode(), "MSTR001", true)) {
                    this.f7656e.y1().dismiss();
                    ArrayList<State> states = stateMaster.getStates();
                    cm.l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
                    states.add(0, new State(String.valueOf(this.f7656e.v1().b("edit_dl_serv_selc_state", "Select State")), "0", false, false, 0));
                    aVar = new q8.a(this.f7656e, states);
                    B1 = this.f7656e.B1();
                } else {
                    this.f7656e.y1().dismiss();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(0, new State(String.valueOf(this.f7656e.v1().b("edit_dl_serv_selc_state", "Select State")), "0", false, false, 0));
                    aVar = new q8.a(this.f7656e, arrayList);
                    B1 = this.f7656e.B1();
                }
                B1.setAdapter(aVar);
            } catch (Exception e10) {
                this.f7656e.y1().dismiss();
                e10.printStackTrace();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(0, new State("Select State", "0", false, false, 0));
                this.f7656e.B1().setAdapter(new q8.a(this.f7656e, arrayList2));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateMaster) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7657e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7657e = createAccountScreen;
        }

        public final void b(String str) {
            this.f7657e.y1().dismiss();
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new State("Select State", "0", false, false, 0));
            this.f7657e.B1().setAdapter(new q8.a(this.f7657e, arrayList));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7658e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7658e = createAccountScreen;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            try {
                if (!p.o(getCitizenDetails.getStatusCode(), "CTZN001", true) && !p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    this.f7658e.y1().dismiss();
                    Toast.makeText(this.f7658e.getApplicationContext(), this.f7658e.v1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
                }
            } catch (Exception e10) {
                this.f7658e.y1().dismiss();
                e10.printStackTrace();
                Toast.makeText(this.f7658e.getApplicationContext(), this.f7658e.v1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7659e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7659e = createAccountScreen;
        }

        public final void b(String str) {
            this.f7659e.y1().dismiss();
            Toast.makeText(this.f7659e.getApplicationContext(), this.f7659e.v1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7660e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7660e = createAccountScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            try {
                this.f7660e.y1().dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    String obj = this.f7660e.u1().getText().toString();
                    String obj2 = this.f7660e.w1().getText().toString();
                    String obj3 = this.f7660e.x1().getText().toString();
                    String obj4 = this.f7660e.t1().getText().toString();
                    Object selectedItem = this.f7660e.B1().getSelectedItem();
                    cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                    Intent intent = new Intent(this.f7660e, VerifyMobileNumberUserRegister.class);
                    intent.putExtra("Param", sendOtpResult.getParam());
                    intent.putExtra("FullName", obj);
                    intent.putExtra("MobileNo", obj2);
                    intent.putExtra("MPIN", obj3);
                    intent.putExtra("Email", obj4);
                    intent.putExtra("StateCode", ((State) selectedItem).getStateCode().toString());
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    this.f7660e.startActivity(intent);
                    return;
                }
                (!ka.c.f13158a.m(sendOtpResult.getStatusDesc()) ? Toast.makeText(this.f7660e.getApplicationContext(), sendOtpResult.getStatusDesc(), 1) : Toast.makeText(this.f7660e.getApplicationContext(), this.f7660e.v1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1)).show();
            } catch (Exception unused) {
                Toast.makeText(this.f7660e.getApplicationContext(), this.f7660e.v1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7661e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7661e = createAccountScreen;
        }

        public final void b(String str) {
            this.f7661e.y1().dismiss();
            Toast.makeText(this.f7661e.getApplicationContext(), this.f7661e.v1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7662e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7662e = createAccountScreen;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            Toast makeText;
            try {
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    this.f7662e.y1().dismiss();
                    CreateAccountScreen createAccountScreen = this.f7662e;
                    createAccountScreen.o1(createAccountScreen, "User already registered, Please Sign In");
                } else if (p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    try {
                        this.f7662e.u1().getText().toString();
                        this.f7662e.w1().getText().toString();
                        this.f7662e.x1().getText().toString();
                        this.f7662e.t1().getText().toString();
                        Object selectedItem = this.f7662e.B1().getSelectedItem();
                        cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                        State state = (State) selectedItem;
                        this.f7662e.F1().o(this.f7662e.w1().getText().toString(), 101);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    if (!ka.c.f13158a.m(getCitizenDetails.getStatusDesc())) {
                        makeText = Toast.makeText(this.f7662e.getApplicationContext(), getCitizenDetails.getStatusDesc(), 1);
                    } else {
                        this.f7662e.y1().dismiss();
                        makeText = Toast.makeText(this.f7662e.getApplicationContext(), this.f7662e.v1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1);
                    }
                    makeText.show();
                }
            } catch (Exception e11) {
                this.f7662e.y1().dismiss();
                e11.printStackTrace();
                Toast.makeText(this.f7662e.getApplicationContext(), this.f7662e.v1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateAccountScreen f7663e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(CreateAccountScreen createAccountScreen) {
            super(1);
            this.f7663e = createAccountScreen;
        }

        public final void b(String str) {
            this.f7663e.y1().dismiss();
            Toast.makeText(this.f7663e.getApplicationContext(), this.f7663e.v1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class k implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7664a;

        k(l lVar) {
            cm.l.f(lVar, "function");
            this.f7664a = lVar;
        }

        public final pl.c a() {
            return this.f7664a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7664a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void H1(CreateAccountScreen createAccountScreen, View view) {
        EditText x12;
        TransformationMethod instance;
        cm.l.f(createAccountScreen, "this$0");
        if (createAccountScreen.x1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            createAccountScreen.C1().setImageResource(R.drawable.pass_visible);
            x12 = createAccountScreen.x1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            createAccountScreen.C1().setImageResource(R.drawable.mvvm_visibility);
            x12 = createAccountScreen.x1();
            instance = PasswordTransformationMethod.getInstance();
        }
        x12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void I1(CreateAccountScreen createAccountScreen, View view) {
        EditText r12;
        TransformationMethod instance;
        cm.l.f(createAccountScreen, "this$0");
        if (createAccountScreen.r1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            createAccountScreen.s1().setImageResource(R.drawable.pass_visible);
            r12 = createAccountScreen.r1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            createAccountScreen.s1().setImageResource(R.drawable.mvvm_visibility);
            r12 = createAccountScreen.r1();
            instance = PasswordTransformationMethod.getInstance();
        }
        r12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void J1(CreateAccountScreen createAccountScreen, View view) {
        cm.l.f(createAccountScreen, "this$0");
        createAccountScreen.startActivity(new Intent(createAccountScreen, SignInScreen.class));
        createAccountScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void K1(CreateAccountScreen createAccountScreen, View view) {
        cm.l.f(createAccountScreen, "this$0");
        createAccountScreen.startActivity(new Intent(createAccountScreen, SignInScreen.class));
        createAccountScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void L1(CreateAccountScreen createAccountScreen, View view) {
        Toast makeText;
        Context applicationContext;
        ld.c v12;
        String str;
        String str2;
        String b10;
        cm.l.f(createAccountScreen, "this$0");
        String obj = createAccountScreen.u1().getText().toString();
        String obj2 = createAccountScreen.w1().getText().toString();
        String obj3 = createAccountScreen.x1().getText().toString();
        String obj4 = createAccountScreen.r1().getText().toString();
        String obj5 = createAccountScreen.t1().getText().toString();
        if (createAccountScreen.B1().getSelectedItemPosition() == 0) {
            applicationContext = createAccountScreen.getApplicationContext();
            v12 = createAccountScreen.v1();
            str = "label_log_sel_state";
            str2 = "Please select state";
        } else if (obj.length() < 3) {
            applicationContext = createAccountScreen.getApplicationContext();
            v12 = createAccountScreen.v1();
            str = "label_log_entr_name";
            str2 = "Please enter the full name";
        } else {
            if (!(obj2 == null || obj2.length() == 0 || obj2.length() < 10)) {
                if (obj3.length() < 6 || obj4.length() < 6) {
                    applicationContext = createAccountScreen.getApplicationContext();
                    b10 = createAccountScreen.v1().b("label_log_entr_valid_dig_pin", "Please enter valid 6 digit MPIN");
                    makeText = Toast.makeText(applicationContext, b10, 1);
                    makeText.show();
                } else if (!cm.l.a(obj3, obj4)) {
                    applicationContext = createAccountScreen.getApplicationContext();
                    v12 = createAccountScreen.v1();
                    str = v9.f.f17510a.I();
                    str2 = "MPIN & confirm MPIN should be same";
                } else if (obj5 == null || obj5.length() == 0) {
                    applicationContext = createAccountScreen.getApplicationContext();
                    v12 = createAccountScreen.v1();
                    str = "label_log_entr_emaiid";
                    str2 = "Please enter the email Id";
                } else {
                    c.a aVar = t8.c.f16582a;
                    if (!aVar.r(obj5)) {
                        applicationContext = createAccountScreen.getApplicationContext();
                        v12 = createAccountScreen.v1();
                        str = "label_log_entr_valid_email";
                        str2 = "Please enter the valid email Id";
                    } else if (aVar.q(obj2)) {
                        createAccountScreen.y1().show();
                        createAccountScreen.F1().g(obj2);
                        return;
                    }
                }
            }
            makeText = Toast.makeText(createAccountScreen.getApplicationContext(), createAccountScreen.v1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number"), 1);
            makeText.show();
        }
        b10 = v12.b(str, str2);
        makeText = Toast.makeText(applicationContext, b10, 1);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void M1(CreateAccountScreen createAccountScreen, View view) {
        cm.l.f(createAccountScreen, "this$0");
        Dialog dialog = new Dialog(createAccountScreen);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View findViewById = dialog.findViewById(R.id.cancelIv);
        cm.l.e(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.termConditionWv);
        cm.l.e(findViewById2, "findViewById(...)");
        WebView webView = (WebView) findViewById2;
        ((ImageView) findViewById).setOnClickListener(new p(dialog));
        webView.loadUrl(hc.a.f12073a.g() + createAccountScreen.v1().d() + "/mparivahan-info-terms-of-use.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void P1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void p1(Dialog dialog, CreateAccountScreen createAccountScreen, View view) {
        cm.l.f(dialog, "$dialog");
        cm.l.f(createAccountScreen, "this$0");
        dialog.dismiss();
        createAccountScreen.startActivity(new Intent(createAccountScreen, SignInScreen.class));
        createAccountScreen.finish();
    }

    public final CreateAccountServices A1() {
        CreateAccountServices createAccountServices = this.P;
        if (createAccountServices != null) {
            return createAccountServices;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final Spinner B1() {
        Spinner spinner = this.U;
        if (spinner != null) {
            return spinner;
        }
        cm.l.v("select_spinner");
        return null;
    }

    public final ImageView C1() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("showmpin");
        return null;
    }

    public final TextView D1() {
        TextView textView = this.V;
        if (textView != null) {
            return textView;
        }
        cm.l.v("signUpTermCond");
        return null;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("submit");
        return null;
    }

    public final v8.b F1() {
        v8.b bVar = this.O;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final v8.j G1() {
        v8.j jVar = this.W;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("viewModelReg");
        return null;
    }

    public final void O1(Context context, String str) {
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
        textView.setOnClickListener(new n(dialog));
        dialog.show();
    }

    public final void Q1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.R = imageView;
    }

    public final void R1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.M = editText;
    }

    public final void S1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.T = imageView;
    }

    public final void T1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.N = editText;
    }

    public final void U1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.J = editText;
    }

    public final void V1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void W1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.K = editText;
    }

    public final void X1(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.L = editText;
    }

    public final void Y1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.Q = progressDialog;
    }

    public final void Z1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void a2(CreateAccountServices createAccountServices) {
        cm.l.f(createAccountServices, "<set-?>");
        this.P = createAccountServices;
    }

    public final void b2(Spinner spinner) {
        cm.l.f(spinner, "<set-?>");
        this.U = spinner;
    }

    public final void c2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.S = imageView;
    }

    public final void d2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.V = textView;
    }

    public final void e2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.I = linearLayout;
    }

    public final void f2(v8.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.O = bVar;
    }

    public final void g2(v8.j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.W = jVar;
    }

    public final void o1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new o(dialog, this));
        dialog.show();
    }

    public void onBackPressed() {
        startActivity(new Intent(this, SignInScreen.class));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hc c10 = hc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        hc hcVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        hc hcVar2 = this.G;
        if (hcVar2 == null) {
            cm.l.v("binding");
        } else {
            hcVar = hcVar2;
        }
        aVar.k0(this, hcVar);
        V1(new ld.c(this));
        View findViewById = findViewById(R.id.sign_in);
        cm.l.e(findViewById, "findViewById(...)");
        Z1((TextView) findViewById);
        View findViewById2 = findViewById(R.id.submit);
        cm.l.e(findViewById2, "findViewById(...)");
        e2((LinearLayout) findViewById2);
        View findViewById3 = findViewById(R.id.full_name);
        cm.l.e(findViewById3, "findViewById(...)");
        U1((EditText) findViewById3);
        View findViewById4 = findViewById(R.id.mobile_number);
        cm.l.e(findViewById4, "findViewById(...)");
        W1((EditText) findViewById4);
        View findViewById5 = findViewById(R.id.mpin);
        cm.l.e(findViewById5, "findViewById(...)");
        X1((EditText) findViewById5);
        View findViewById6 = findViewById(R.id.confirmMpin);
        cm.l.e(findViewById6, "findViewById(...)");
        R1((EditText) findViewById6);
        View findViewById7 = findViewById(R.id.email);
        cm.l.e(findViewById7, "findViewById(...)");
        T1((EditText) findViewById7);
        View findViewById8 = findViewById(R.id.showmpin);
        cm.l.e(findViewById8, "findViewById(...)");
        c2((ImageView) findViewById8);
        View findViewById9 = findViewById(R.id.confirmShowMpin);
        cm.l.e(findViewById9, "findViewById(...)");
        S1((ImageView) findViewById9);
        View findViewById10 = findViewById(R.id.select_spinner);
        cm.l.e(findViewById10, "findViewById(...)");
        b2((Spinner) findViewById10);
        View findViewById11 = findViewById(R.id.signUpTermCond);
        cm.l.e(findViewById11, "findViewById(...)");
        d2((TextView) findViewById11);
        a2(CreateAccountServices.f7640a.c(this));
        f2((v8.b) new u0((x0) this, (u0.b) new v8.a(new s8.a(A1()))).a(v8.b.class));
        g2((v8.j) new u0((x0) this, (u0.b) new v8.i(new s8.a(A1()))).a(v8.j.class));
        C1().setOnClickListener(new u8.h(this));
        s1().setOnClickListener(new u8.i(this));
        View findViewById12 = findViewById(R.id.backButton);
        cm.l.e(findViewById12, "findViewById(...)");
        Q1((ImageView) findViewById12);
        q1().setOnClickListener(new u8.j(this));
        Y1(new ProgressDialog(this));
        y1().setMessage(v1().b("label_challan_please_wait", "Please wait..."));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        boolean equals = new ld.e(this).f().equals("0");
        y1().show();
        F1().r();
        F1().n().g(this, new k(new g(this)));
        F1().i().g(this, new k(new h(this)));
        z1().setOnClickListener(new u8.k(this));
        E1().setOnClickListener(new u8.l(this));
        F1().m().g(this, new k(new i(this)));
        F1().l().g(this, new k(new j(this)));
        G1().n().g(this, new k(new a(this)));
        G1().m().g(this, new k(new b(this)));
        F1().p().g(this, new k(new c(this)));
        F1().s().g(this, new k(new d(this)));
        F1().k().g(this, new k(new e(this)));
        F1().j().g(this, new k(new f(this)));
        D1().setOnClickListener(new u8.m(this));
    }

    public final ImageView q1() {
        ImageView imageView = this.R;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("backButton");
        return null;
    }

    public final EditText r1() {
        EditText editText = this.M;
        if (editText != null) {
            return editText;
        }
        cm.l.v("confirmMpin");
        return null;
    }

    public final ImageView s1() {
        ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("confirmShowMpin");
        return null;
    }

    public final EditText t1() {
        EditText editText = this.N;
        if (editText != null) {
            return editText;
        }
        cm.l.v("email");
        return null;
    }

    public final EditText u1() {
        EditText editText = this.J;
        if (editText != null) {
            return editText;
        }
        cm.l.v("fullname");
        return null;
    }

    public final ld.c v1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final EditText w1() {
        EditText editText = this.K;
        if (editText != null) {
            return editText;
        }
        cm.l.v("mobile_number");
        return null;
    }

    public final EditText x1() {
        EditText editText = this.L;
        if (editText != null) {
            return editText;
        }
        cm.l.v("mpin");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.Q;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final TextView z1() {
        TextView textView = this.H;
        if (textView != null) {
            return textView;
        }
        cm.l.v("redirectToSignScreen");
        return null;
    }
}
