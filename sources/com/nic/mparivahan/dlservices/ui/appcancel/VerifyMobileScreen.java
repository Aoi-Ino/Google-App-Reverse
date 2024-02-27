package com.nic.mparivahan.dlservices.ui.appcancel;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import gj.i;
import gj.j;
import gj.k;
import ld.g;
import ni.m;
import pl.x;
import t8.c;
import v9.e;

public final class VerifyMobileScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public m G;
    /* access modifiers changed from: private */
    public String H = "";
    /* access modifiers changed from: private */
    public String I = "";
    public ld.c J;
    public ProgressDialog K;
    public ba.b L;
    public DlServiceInt M;
    public g N;
    public TextView O;
    public TextView P;
    private String Q;
    public t9.a R;
    public ClInter S;
    public ld.f T;

    static final class a extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyMobileScreen f21907e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VerifyMobileScreen verifyMobileScreen) {
            super(1);
            this.f21907e = verifyMobileScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            try {
                if (this.f21907e.v1().isShowing()) {
                    this.f21907e.v1().dismiss();
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f21907e.L1(String.valueOf(sendOtpResult.getRecordId()));
                    VerifyMobileScreen verifyMobileScreen = this.f21907e;
                    m o12 = verifyMobileScreen.G;
                    if (o12 == null) {
                        cm.l.v("binding");
                        o12 = null;
                    }
                    verifyMobileScreen.R1(verifyMobileScreen, String.valueOf(o12.f27378f.getText()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f21907e, sendOtpResult.getStatusDesc());
                } else {
                    this.f21907e.E1(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                if (this.f21907e.v1().isShowing()) {
                    this.f21907e.v1().dismiss();
                }
                VerifyMobileScreen verifyMobileScreen2 = this.f21907e;
                String b10 = verifyMobileScreen2.s1().b("label_went_wrong", this.f21907e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b10);
                verifyMobileScreen2.E1(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyMobileScreen f21908e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VerifyMobileScreen verifyMobileScreen) {
            super(1);
            this.f21908e = verifyMobileScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    this.f21908e.v1().show();
                    t9.a t12 = this.f21908e.t1();
                    VerifyMobileScreen verifyMobileScreen = this.f21908e;
                    t12.g(verifyMobileScreen, verifyMobileScreen.H, this.f21908e.I);
                    return;
                }
                this.f21908e.E1(otpVerifyResult.getStatusDesc());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyMobileScreen f21909e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VerifyMobileScreen verifyMobileScreen) {
            super(1);
            this.f21909e = verifyMobileScreen;
        }

        public final void b(hj.a aVar) {
            try {
                if (this.f21909e.v1().isShowing()) {
                    this.f21909e.v1().dismiss();
                }
                throw null;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((hj.a) null);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21910a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f21910a = lVar;
        }

        public final pl.c a() {
            return this.f21910a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21910a.invoke(obj);
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

    public static final class e extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerifyMobileScreen f21912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f21913c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TextView textView, VerifyMobileScreen verifyMobileScreen, TextView textView2) {
            super(30000, 1000);
            this.f21911a = textView;
            this.f21912b = verifyMobileScreen;
            this.f21913c = textView2;
        }

        public void onFinish() {
            this.f21913c.setVisibility(0);
            this.f21911a.setText("0");
            this.f21911a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f21911a;
            textView.setText(this.f21912b.s1().b("time_remaining", this.f21912b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21913c.setVisibility(8);
            this.f21911a.setVisibility(0);
        }
    }

    public static final class f extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerifyMobileScreen f21915b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f21916c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TextView textView, VerifyMobileScreen verifyMobileScreen, TextView textView2) {
            super(30000, 1000);
            this.f21914a = textView;
            this.f21915b = verifyMobileScreen;
            this.f21916c = textView2;
        }

        public void onFinish() {
            this.f21916c.setVisibility(0);
            this.f21914a.setText("0");
            this.f21914a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21914a;
            textView.setText(this.f21915b.s1().b("time_remaining", this.f21915b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21916c.setVisibility(8);
            this.f21914a.setVisibility(0);
        }
    }

    private final void B1() {
        O1(new g(this));
        N1(new ld.f(this));
        m mVar = this.G;
        m mVar2 = null;
        if (mVar == null) {
            cm.l.v("binding");
            mVar = null;
        }
        mVar.f27377e.f25961g.setText(x1().i());
        M1(DlServiceInt.f21675a.a(this));
        G1((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(w1(), this))).a(ba.b.class));
        J1(ClInter.f7830a.a(this));
        I1((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(u1()))).a(t9.a.class));
        if (this.H.length() > 0) {
            m mVar3 = this.G;
            if (mVar3 == null) {
                cm.l.v("binding");
                mVar3 = null;
            }
            mVar3.f27374b.setText(this.H);
        }
        m mVar4 = this.G;
        if (mVar4 == null) {
            cm.l.v("binding");
            mVar4 = null;
        }
        mVar4.f27375c.setOnClickListener(new gj.l(this));
        m mVar5 = this.G;
        if (mVar5 == null) {
            cm.l.v("binding");
        } else {
            mVar2 = mVar5;
        }
        mVar2.f27379g.setOnClickListener(new gj.m(this));
    }

    /* access modifiers changed from: private */
    public static final void C1(VerifyMobileScreen verifyMobileScreen, View view) {
        Toast makeText;
        cm.l.f(verifyMobileScreen, "this$0");
        try {
            m mVar = verifyMobileScreen.G;
            m mVar2 = null;
            if (mVar == null) {
                cm.l.v("binding");
                mVar = null;
            }
            if (String.valueOf(mVar.f27378f.getText()).length() < 10) {
                makeText = Toast.makeText(verifyMobileScreen, verifyMobileScreen.s1().b("label_log_entr_vali_mobno", verifyMobileScreen.getString(R.string.enter_mobile_no)), 0);
            } else {
                c.a aVar = t8.c.f16582a;
                m mVar3 = verifyMobileScreen.G;
                if (mVar3 == null) {
                    cm.l.v("binding");
                    mVar3 = null;
                }
                if (!aVar.q(String.valueOf(mVar3.f27378f.getText()))) {
                    makeText = Toast.makeText(verifyMobileScreen, verifyMobileScreen.s1().b("label_log_entr_vali_mobno", verifyMobileScreen.getString(R.string.enter_mobile_no)), 0);
                } else {
                    verifyMobileScreen.v1().show();
                    ba.b r12 = verifyMobileScreen.r1();
                    m mVar4 = verifyMobileScreen.G;
                    if (mVar4 == null) {
                        cm.l.v("binding");
                    } else {
                        mVar2 = mVar4;
                    }
                    r12.F(verifyMobileScreen, String.valueOf(mVar2.f27378f.getText()), verifyMobileScreen.y1().k());
                    return;
                }
            }
            makeText.show();
        } catch (Exception e10) {
            if (verifyMobileScreen.v1().isShowing()) {
                verifyMobileScreen.v1().dismiss();
            }
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(VerifyMobileScreen verifyMobileScreen, View view) {
        cm.l.f(verifyMobileScreen, "this$0");
        m mVar = verifyMobileScreen.G;
        if (mVar == null) {
            cm.l.v("binding");
            mVar = null;
        }
        mVar.f27378f.setText("");
    }

    /* access modifiers changed from: private */
    public final void E1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
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
        textView.setOnClickListener(new gj.f(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void F1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void S1(EditText editText, ImageView imageView, View view) {
        TransformationMethod instance;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(imageView, "$shownPin");
        if (editText.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            imageView.setImageResource(R.drawable.pass_visible);
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            imageView.setImageResource(R.drawable.mvvm_visibility);
            instance = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void T1(VerifyMobileScreen verifyMobileScreen, TextView textView, TextView textView2, View view) {
        cm.l.f(verifyMobileScreen, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        verifyMobileScreen.r1().D(verifyMobileScreen, String.valueOf(verifyMobileScreen.Q));
        new f(textView, verifyMobileScreen, textView2).start();
    }

    /* access modifiers changed from: private */
    public static final void U1(VerifyMobileScreen verifyMobileScreen, EditText editText, Dialog dialog, View view) {
        Toast makeText;
        ld.c s12;
        String string;
        String str;
        cm.l.f(verifyMobileScreen, "this$0");
        cm.l.f(editText, "$enterOtp");
        cm.l.f(dialog, "$d");
        if (com.nic.mparivahan.a.f9624a.a(verifyMobileScreen)) {
            Editable text = editText.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                s12 = verifyMobileScreen.s1();
                string = verifyMobileScreen.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                cm.l.c(text2);
                if (text2.length() < 6) {
                    s12 = verifyMobileScreen.s1();
                    string = verifyMobileScreen.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    dialog.dismiss();
                    ba.b r12 = verifyMobileScreen.r1();
                    String obj = editText.getText().toString();
                    String str2 = verifyMobileScreen.Q;
                    cm.l.c(str2);
                    r12.G(verifyMobileScreen, obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(verifyMobileScreen, s12.b(str, string), 0);
        } else {
            makeText = Toast.makeText(verifyMobileScreen.getApplicationContext(), verifyMobileScreen.s1().b("label_log_check_internet", verifyMobileScreen.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void V1(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final TextView A1() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final void G1(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.L = bVar;
    }

    public final void H1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void I1(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.R = aVar;
    }

    public final void J1(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.S = clInter;
    }

    public final void K1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public final void L1(String str) {
        this.Q = str;
    }

    public final void M1(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.M = dlServiceInt;
    }

    public final void N1(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.T = fVar;
    }

    public final void O1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.N = gVar;
    }

    public final void P1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final void Q1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.O = textView;
    }

    public final void R1(Context context, String str) {
        String b10;
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.resendOtp);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.showmpin);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.submitOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        P1((TextView) findViewById4);
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        Q1((TextView) findViewById7);
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.disPlay);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById9).setText(s1().b("otp_verification", getString(R.string.otp_verification)));
        z1().setText(s1().b("vahan_btn_submit", getString(R.string.submit)));
        A1().setText(s1().b("btn_reset", getString(R.string.reset)));
        textView.setText(s1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(s1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) findViewById10).setText(s1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                b10 = s1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView3.setText(b10);
        } catch (Exception unused) {
            textView3.setText(s1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new e(textView2, this, textView).start();
        imageView2.setOnClickListener(new gj.g(editText, imageView2));
        textView.setOnClickListener(new gj.h(this, textView2, textView));
        z1().setOnClickListener(new i(this, editText, dialog));
        A1().setOnClickListener(new j(editText));
        imageView.setOnClickListener(new k(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m c10 = m.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        m mVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        String stringExtra = getIntent().getStringExtra("applNo");
        cm.l.c(stringExtra);
        this.H = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("dob");
        cm.l.c(stringExtra2);
        this.I = stringExtra2;
        H1(new ld.c(this));
        K1(new ProgressDialog(this));
        v1().setMessage(s1().b("label_challan_please_wait", getString(R.string.please_wait)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        B1();
        e.a aVar = v9.e.f17509a;
        m mVar2 = this.G;
        if (mVar2 == null) {
            cm.l.v("binding");
        } else {
            mVar = mVar2;
        }
        aVar.E(this, mVar);
        r1().u().g(this, new d(new a(this)));
        r1().E().g(this, new d(new b(this)));
        t1().n().g(this, new d(new c(this)));
    }

    public final ba.b r1() {
        ba.b bVar = this.L;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final t9.a t1() {
        t9.a aVar = this.R;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final ClInter u1() {
        ClInter clInter = this.S;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlServiceInt w1() {
        DlServiceInt dlServiceInt = this.M;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ld.f x1() {
        ld.f fVar = this.T;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final g y1() {
        g gVar = this.N;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final TextView z1() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        cm.l.v("submitOtp");
        return null;
    }
}
