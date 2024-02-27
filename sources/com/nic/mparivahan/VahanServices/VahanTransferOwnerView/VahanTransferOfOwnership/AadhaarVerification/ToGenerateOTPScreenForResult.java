package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification;

import ah.k;
import ah.n;
import ah.o;
import ah.p;
import ah.q;
import ah.r;
import ah.s;
import ah.t;
import android.app.Activity;
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
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import ni.z8;
import pl.x;

public final class ToGenerateOTPScreenForResult extends androidx.appcompat.app.d {
    public CoordinatorLayout G;
    public AppCompatButton H;
    public AppCompatButton I;
    public TextView J;
    public CheckBox K;
    public TextView L;
    public AppCompatImageView M;
    public RelativeLayout N;
    public ProgressDialog O;
    public l P;
    public VahanServiceConnection Q;
    public MyTextView R;
    public ld.g S;
    private HashMap T = new HashMap();
    public String U;
    public TextView V;
    public NrvDetails W;
    public String X;
    public TextView Y;
    public LinearLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public LinearLayout f21251a0;

    /* renamed from: b0  reason: collision with root package name */
    public TextView f21252b0;

    /* renamed from: c0  reason: collision with root package name */
    public EditText f21253c0;

    /* renamed from: d0  reason: collision with root package name */
    public ImageView f21254d0;

    /* renamed from: e0  reason: collision with root package name */
    public MyTextView f21255e0;

    /* renamed from: f0  reason: collision with root package name */
    public MyTextView f21256f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f21257g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f21258h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f21259i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f21260j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f21261k0;

    /* renamed from: l0  reason: collision with root package name */
    public bi.h f21262l0;

    /* renamed from: m0  reason: collision with root package name */
    public VahanProService f21263m0;

    /* renamed from: n0  reason: collision with root package name */
    public bi.j f21264n0;

    /* renamed from: o0  reason: collision with root package name */
    public VahanServiceConnection f21265o0;

    /* renamed from: p0  reason: collision with root package name */
    private String f21266p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f21267q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f21268r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    public z8 f21269s0;

    /* renamed from: t0  reason: collision with root package name */
    public ld.c f21270t0;

    /* renamed from: u0  reason: collision with root package name */
    private ArrayList f21271u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    private boolean f21272v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f21273w0;

    /* renamed from: x0  reason: collision with root package name */
    public String f21274x0;

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ToGenerateOTPScreenForResult f21275a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
            super(30000, 1000);
            this.f21275a = toGenerateOTPScreenForResult;
        }

        public void onFinish() {
            this.f21275a.M1().setVisibility(0);
            this.f21275a.T1().setText("0");
            this.f21275a.T1().setVisibility(8);
        }

        public void onTick(long j10) {
            MyTextView T1 = this.f21275a.T1();
            T1.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21275a.M1().setVisibility(8);
            this.f21275a.T1().setVisibility(0);
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ToGenerateOTPScreenForResult f21276e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
            super(1);
            this.f21276e = toGenerateOTPScreenForResult;
        }

        public final void b(ResendOtp resendOtp) {
            ToGenerateOTPScreenForResult toGenerateOTPScreenForResult;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f21276e.J1().dismiss();
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult2 = this.f21276e;
                    toGenerateOTPScreenForResult2.n2(toGenerateOTPScreenForResult2, toGenerateOTPScreenForResult2.P1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                    return;
                }
                if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    toGenerateOTPScreenForResult = this.f21276e;
                } else {
                    this.f21276e.J1().dismiss();
                    toGenerateOTPScreenForResult = this.f21276e;
                }
                toGenerateOTPScreenForResult.n2(toGenerateOTPScreenForResult, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                this.f21276e.J1().dismiss();
                ToGenerateOTPScreenForResult toGenerateOTPScreenForResult3 = this.f21276e;
                toGenerateOTPScreenForResult3.n2(toGenerateOTPScreenForResult3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ToGenerateOTPScreenForResult f21277e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
            super(1);
            this.f21277e = toGenerateOTPScreenForResult;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    if (this.f21277e.J1().isShowing()) {
                        this.f21277e.J1().dismiss();
                    }
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult = this.f21277e;
                    toGenerateOTPScreenForResult.z1(toGenerateOTPScreenForResult, "Mobile No has been successfully verified");
                    return;
                }
                if (this.f21277e.J1().isShowing()) {
                    this.f21277e.J1().dismiss();
                }
                ToGenerateOTPScreenForResult toGenerateOTPScreenForResult2 = this.f21277e;
                toGenerateOTPScreenForResult2.n2(toGenerateOTPScreenForResult2, otpVerifyResult.getStatusDesc());
            } catch (Exception e10) {
                if (this.f21277e.J1().isShowing()) {
                    this.f21277e.J1().dismiss();
                }
                e10.printStackTrace();
                ToGenerateOTPScreenForResult toGenerateOTPScreenForResult3 = this.f21277e;
                toGenerateOTPScreenForResult3.n2(toGenerateOTPScreenForResult3, toGenerateOTPScreenForResult3.P1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ToGenerateOTPScreenForResult f21278e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
            super(1);
            this.f21278e = toGenerateOTPScreenForResult;
        }

        public final void b(String str) {
            this.f21278e.J1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ToGenerateOTPScreenForResult f21279e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
            super(1);
            this.f21279e = toGenerateOTPScreenForResult;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            try {
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    this.f21279e.Z1().m(this.f21279e, String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzMobile()), String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzRecordId()));
                } else if (p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    this.f21279e.J1().dismiss();
                } else {
                    this.f21279e.J1().dismiss();
                    Toast.makeText(this.f21279e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f21279e.J1().dismiss();
                Toast.makeText(this.f21279e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ToGenerateOTPScreenForResult f21280e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
            super(1);
            this.f21280e = toGenerateOTPScreenForResult;
        }

        public final void b(SendOtpResult sendOtpResult) {
            Toast makeText;
            try {
                this.f21280e.J1().dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult = this.f21280e;
                    toGenerateOTPScreenForResult.f3(toGenerateOTPScreenForResult, toGenerateOTPScreenForResult.D1().getText().toString());
                    this.f21280e.E2(String.valueOf(sendOtpResult.getRecordId()));
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult2 = this.f21280e;
                    toGenerateOTPScreenForResult2.H2(toGenerateOTPScreenForResult2.U1().getText().toString());
                    return;
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL022", true)) {
                    makeText = Toast.makeText(this.f21280e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL014", true)) {
                    makeText = Toast.makeText(this.f21280e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    makeText = Toast.makeText(this.f21280e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1);
                } else {
                    Toast.makeText(this.f21280e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    x xVar = x.f30437a;
                    return;
                }
                makeText.show();
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(this.f21280e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ToGenerateOTPScreenForResult f21281e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult) {
            super(1);
            this.f21281e = toGenerateOTPScreenForResult;
        }

        public final void b(String str) {
            ToGenerateOTPScreenForResult toGenerateOTPScreenForResult = this.f21281e;
            toGenerateOTPScreenForResult.d3(toGenerateOTPScreenForResult, toGenerateOTPScreenForResult.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21282a;

        h(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21282a = lVar;
        }

        public final pl.c a() {
            return this.f21282a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21282a.invoke(obj);
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

    public static final class i extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f21284b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f21285c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f21286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, u uVar, Context context, TextView textView2) {
            super(30000, 1000);
            this.f21283a = textView;
            this.f21284b = uVar;
            this.f21285c = context;
            this.f21286d = textView2;
        }

        public void onFinish() {
            this.f21286d.setVisibility(0);
            this.f21283a.setText("0");
            this.f21283a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21283a;
            textView.setText(((ld.c) this.f21284b.f20234e).b("time_remaining", this.f21285c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21286d.setVisibility(8);
            this.f21283a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f21288b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f21289c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f21290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, u uVar, Context context, TextView textView2) {
            super(30000, 1000);
            this.f21287a = textView;
            this.f21288b = uVar;
            this.f21289c = context;
            this.f21290d = textView2;
        }

        public void onFinish() {
            this.f21290d.setVisibility(0);
            this.f21287a.setText("0");
            this.f21287a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21287a;
            textView.setText(((ld.c) this.f21288b.f20234e).b("time_remaining", this.f21289c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21290d.setVisibility(8);
            this.f21287a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(Dialog dialog, ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, Context context, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        cm.l.f(context, "$context");
        dialog.dismiss();
        Intent putExtra = new Intent().putExtra("MESSAGE_CONTRACT", "AL001");
        cm.l.e(putExtra, "putExtra(...)");
        toGenerateOTPScreenForResult.setResult(-1, putExtra);
        ((Activity) context).finish();
    }

    /* access modifiers changed from: private */
    public static final void a2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        toGenerateOTPScreenForResult.finish();
    }

    /* access modifiers changed from: private */
    public static final void b2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        toGenerateOTPScreenForResult.m2();
    }

    /* access modifiers changed from: private */
    public static final void c2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        EditText E1;
        TransformationMethod instance;
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        if (toGenerateOTPScreenForResult.E1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            toGenerateOTPScreenForResult.Q1().setImageResource(R.drawable.pass_visible);
            E1 = toGenerateOTPScreenForResult.E1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            toGenerateOTPScreenForResult.Q1().setImageResource(R.drawable.mvvm_visibility);
            E1 = toGenerateOTPScreenForResult.E1();
            instance = PasswordTransformationMethod.getInstance();
        }
        E1.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void d2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        ld.c P1;
        String str;
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        String obj = toGenerateOTPScreenForResult.E1().getText().toString();
        if (obj.length() == 0) {
            P1 = toGenerateOTPScreenForResult.P1();
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            P1 = toGenerateOTPScreenForResult.P1();
            str = "Please enter the valid OTP";
        } else {
            if (toGenerateOTPScreenForResult.J1().isShowing()) {
                toGenerateOTPScreenForResult.J1().dismiss();
            }
            toGenerateOTPScreenForResult.J1().show();
            toGenerateOTPScreenForResult.Y1().l(toGenerateOTPScreenForResult, obj, toGenerateOTPScreenForResult.f21266p0);
            return;
        }
        toGenerateOTPScreenForResult.n2(toGenerateOTPScreenForResult, P1.b("label_log_entr_otp", str));
    }

    /* access modifiers changed from: private */
    public static final void e2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        toGenerateOTPScreenForResult.E1().setText("");
    }

    /* access modifiers changed from: private */
    public static final void e3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void f2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        String obj = q.B0(toGenerateOTPScreenForResult.D1().getText().toString()).toString();
        if (obj.length() < 10) {
            Toast.makeText(toGenerateOTPScreenForResult, "Invalid mobile number", 0).show();
            return;
        }
        toGenerateOTPScreenForResult.J1().show();
        toGenerateOTPScreenForResult.Z1().m(toGenerateOTPScreenForResult, obj, new ld.g(toGenerateOTPScreenForResult).k());
    }

    /* access modifiers changed from: private */
    public static final void g2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        if (toGenerateOTPScreenForResult.S1().isChecked()) {
            toGenerateOTPScreenForResult.S1().setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void g3(EditText editText, ImageView imageView, View view) {
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
    public static final void h2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        toGenerateOTPScreenForResult.startActivity(new Intent(toGenerateOTPScreenForResult, VahanUpdateMobileActivity.class));
        toGenerateOTPScreenForResult.finish();
    }

    /* access modifiers changed from: private */
    public static final void h3(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, TextView textView, u uVar, Context context, TextView textView2, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(uVar, "$langSession");
        cm.l.f(context, "$context");
        cm.l.f(textView2, "$resendOtp");
        toGenerateOTPScreenForResult.J1().show();
        new j(textView, uVar, context, textView2).start();
        toGenerateOTPScreenForResult.Y1().j(toGenerateOTPScreenForResult, toGenerateOTPScreenForResult.f21266p0);
    }

    /* access modifiers changed from: private */
    public static final void i2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, CompoundButton compoundButton, boolean z10) {
        AppCompatButton F1;
        float f10;
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        if (z10) {
            toGenerateOTPScreenForResult.F1().setEnabled(true);
            F1 = toGenerateOTPScreenForResult.F1();
            f10 = 1.0f;
        } else if (!z10) {
            toGenerateOTPScreenForResult.F1().setEnabled(false);
            F1 = toGenerateOTPScreenForResult.F1();
            f10 = 0.5f;
        } else {
            return;
        }
        F1.setAlpha(f10);
    }

    /* access modifiers changed from: private */
    public static final void i3(EditText editText, Context context, u uVar, ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        String b10;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(context, "$context");
        cm.l.f(uVar, "$langSession");
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            b10 = ((ld.c) uVar.f20234e).b("label_log_entr_otp", context.getString(R.string.pls_enter_otp));
        } else if (obj.length() < 6) {
            b10 = ((ld.c) uVar.f20234e).b("label_log_entr_val_otp", "Please enter the valid OTP");
        } else {
            if (toGenerateOTPScreenForResult.J1().isShowing()) {
                toGenerateOTPScreenForResult.J1().dismiss();
            }
            toGenerateOTPScreenForResult.J1().show();
            toGenerateOTPScreenForResult.Y1().l(toGenerateOTPScreenForResult, obj, toGenerateOTPScreenForResult.f21266p0);
            return;
        }
        Toast.makeText(context, b10, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void j2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        Dialog dialog = new Dialog(toGenerateOTPScreenForResult);
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
        ((ImageView) findViewById).setOnClickListener(new ah.f(dialog));
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + toGenerateOTPScreenForResult.P1().d() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void j3(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void k2(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void k3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void l2(ToGenerateOTPScreenForResult toGenerateOTPScreenForResult, View view) {
        cm.l.f(toGenerateOTPScreenForResult, "this$0");
        toGenerateOTPScreenForResult.J1().show();
        new a(toGenerateOTPScreenForResult).start();
        toGenerateOTPScreenForResult.Y1().j(toGenerateOTPScreenForResult, toGenerateOTPScreenForResult.f21266p0);
    }

    private final void m2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void o2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void A2(AppCompatImageView appCompatImageView) {
        cm.l.f(appCompatImageView, "<set-?>");
        this.M = appCompatImageView;
    }

    public final MyTextView B1() {
        MyTextView myTextView = this.R;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("agreeTermCond");
        return null;
    }

    public final void B2(RelativeLayout relativeLayout) {
        cm.l.f(relativeLayout, "<set-?>");
        this.N = relativeLayout;
    }

    public final z8 C1() {
        z8 z8Var = this.f21269s0;
        if (z8Var != null) {
            return z8Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void C2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21261k0 = textView;
    }

    public final TextView D1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("edit_mobile_number");
        return null;
    }

    public final void D2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final EditText E1() {
        EditText editText = this.f21253c0;
        if (editText != null) {
            return editText;
        }
        cm.l.v("enterOtp");
        return null;
    }

    public final void E2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21266p0 = str;
    }

    public final AppCompatButton F1() {
        AppCompatButton appCompatButton = this.H;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        cm.l.v("generateOtp");
        return null;
    }

    public final void F2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final String G1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("mobile_number");
        return null;
    }

    public final void G2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f21263m0 = vahanProService;
    }

    public final AppCompatImageView H1() {
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        cm.l.v("mvvm_back");
        return null;
    }

    public final void H2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21267q0 = str;
    }

    public final RelativeLayout I1() {
        RelativeLayout relativeLayout = this.N;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        cm.l.v("nexGenHolder");
        return null;
    }

    public final void I2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.W = nrvDetails;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void J2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.f21256f0 = myTextView;
    }

    public final VahanProService K1() {
        VahanProService vahanProService = this.f21263m0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("proservice");
        return null;
    }

    public final void K2(AppCompatButton appCompatButton) {
        cm.l.f(appCompatButton, "<set-?>");
        this.I = appCompatButton;
    }

    public final NrvDetails L1() {
        NrvDetails nrvDetails = this.W;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final void L2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.Q = vahanServiceConnection;
    }

    public final MyTextView M1() {
        MyTextView myTextView = this.f21256f0;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("resendOtp");
        return null;
    }

    public final void M2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.V = textView;
    }

    public final AppCompatButton N1() {
        AppCompatButton appCompatButton = this.I;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        cm.l.v("reset");
        return null;
    }

    public final void N2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21270t0 = cVar;
    }

    public final VahanServiceConnection O1() {
        VahanServiceConnection vahanServiceConnection = this.Q;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final void O2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.S = gVar;
    }

    public final ld.c P1() {
        ld.c cVar = this.f21270t0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void P2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.f21254d0 = imageView;
    }

    public final ImageView Q1() {
        ImageView imageView = this.f21254d0;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("shownPin");
        return null;
    }

    public final void Q2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21258h0 = textView;
    }

    public final TextView R1() {
        TextView textView = this.f21258h0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("submitOtp");
        return null;
    }

    public final void R2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.Z = linearLayout;
    }

    public final CheckBox S1() {
        CheckBox checkBox = this.K;
        if (checkBox != null) {
            return checkBox;
        }
        cm.l.v("term_condition");
        return null;
    }

    public final void S2(CheckBox checkBox) {
        cm.l.f(checkBox, "<set-?>");
        this.K = checkBox;
    }

    public final MyTextView T1() {
        MyTextView myTextView = this.f21255e0;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("time_text");
        return null;
    }

    public final void T2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.f21255e0 = myTextView;
    }

    public final TextView U1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtVehicleNumber");
        return null;
    }

    public final void U2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final TextView V1() {
        TextView textView = this.f21259i0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final void V2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21259i0 = textView;
    }

    public final TextView W1() {
        TextView textView = this.f21260j0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("update_mob");
        return null;
    }

    public final void W2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21260j0 = textView;
    }

    public final VahanServiceConnection X1() {
        VahanServiceConnection vahanServiceConnection = this.f21265o0;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("verifyOtpRetrofitService");
        return null;
    }

    public final void X2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f21257g0 = linearLayout;
    }

    public final bi.j Y1() {
        bi.j jVar = this.f21264n0;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("verifyOtpViewModel");
        return null;
    }

    public final void Y2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f21251a0 = linearLayout;
    }

    public final l Z1() {
        l lVar = this.P;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void Z2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.f21265o0 = vahanServiceConnection;
    }

    public final void a3(bi.j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.f21264n0 = jVar;
    }

    public final void b3(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.P = lVar;
    }

    public final void c3(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f21262l0 = hVar;
    }

    public final void d3(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new ah.d(dialog));
        dialog.show();
    }

    public final void f3(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        cm.l.f(context2, "context");
        cm.l.f(str2, "mobile_no");
        Dialog dialog = new Dialog(context2);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById2 = dialog.findViewById(R.id.resendOtp);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.showmpin);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.submitOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.enter_otp_txt);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById10 = dialog.findViewById(R.id.disPlay);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        u uVar = new u();
        ld.c cVar = new ld.c(context2);
        uVar.f20234e = cVar;
        ImageView imageView2 = (ImageView) findViewById;
        ((TextView) findViewById9).setText(cVar.b("edit_enter_otp", context2.getString(R.string.enter_otp)));
        ((TextView) findViewById10).setText(((ld.c) uVar.f20234e).b("otp_verification", context2.getString(R.string.otp_verification)));
        textView2.setText(((ld.c) uVar.f20234e).b("vahan_btn_submit", context2.getString(R.string.submit)));
        textView4.setText(((ld.c) uVar.f20234e).b("btn_reset", context2.getString(R.string.reset)));
        textView.setText(((ld.c) uVar.f20234e).b("label_resend_otp", context2.getString(R.string.resend_otp)));
        editText.setHint(((ld.c) uVar.f20234e).b("edit_enter_otp", context2.getString(R.string.enter_otp)));
        int length = str.length();
        String str3 = "";
        int i10 = 0;
        while (i10 < length) {
            str2.charAt(i10);
            str3 = new km.f("\\d(?=\\d{4})").b(new km.f("[^0-9]").b(str2, ""), "X");
            i10++;
            str2 = str;
        }
        textView5.setText(((ld.c) uVar.f20234e).b("label_otp_sent_to_mobile", context2.getString(R.string.otp_sent)) + "\n+91 " + str3);
        new i(textView3, uVar, context2, textView).start();
        imageView.setOnClickListener(new ah.g(editText, imageView));
        textView.setOnClickListener(new ah.h(this, textView3, uVar, context, textView));
        textView2.setOnClickListener(new ah.i(editText, context2, uVar, this));
        textView4.setOnClickListener(new ah.j(editText));
        imageView2.setOnClickListener(new k(dialog));
        dialog.show();
    }

    public final void n2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById2).setText(str);
        ((TextView) findViewById).setText(P1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P1().b("btn_ok", "OK"));
        textView.setOnClickListener(new ah.e(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        if (J1().isShowing()) {
            J1().dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView D1;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_generate_o_t_p_screen);
        z8 c10 = z8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        s2(c10);
        setContentView((View) C1().b());
        getWindow().addFlags(128);
        N2(new ld.c(this));
        View findViewById = findViewById(R.id.bottom);
        cm.l.e(findViewById, "findViewById(...)");
        t2((CoordinatorLayout) findViewById);
        View findViewById2 = findViewById(R.id.generate_otp);
        cm.l.e(findViewById2, "findViewById(...)");
        y2((AppCompatButton) findViewById2);
        View findViewById3 = findViewById(R.id.reset_button);
        cm.l.e(findViewById3, "findViewById(...)");
        K2((AppCompatButton) findViewById3);
        v9.e.f17509a.I2(this, C1(), N1(), F1());
        View findViewById4 = findViewById(R.id.txt_vehicle_number);
        cm.l.e(findViewById4, "findViewById(...)");
        U2((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.term_condition);
        cm.l.e(findViewById5, "findViewById(...)");
        S2((CheckBox) findViewById5);
        View findViewById6 = findViewById(R.id.edit_mobile_number);
        cm.l.e(findViewById6, "findViewById(...)");
        v2((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById7, "findViewById(...)");
        A2((AppCompatImageView) findViewById7);
        View findViewById8 = findViewById(R.id.nexGenHolder);
        cm.l.e(findViewById8, "findViewById(...)");
        B2((RelativeLayout) findViewById8);
        View findViewById9 = findViewById(R.id.agreeTermCond);
        cm.l.e(findViewById9, "findViewById(...)");
        r2((MyTextView) findViewById9);
        View findViewById10 = findViewById(R.id.selectedServiceTv);
        cm.l.e(findViewById10, "findViewById(...)");
        M2((TextView) findViewById10);
        View findViewById11 = findViewById(R.id.note_text);
        cm.l.e(findViewById11, "findViewById(...)");
        C2((TextView) findViewById11);
        G2(VahanProService.f21196b.b(this));
        c3((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(K1()))).a(bi.h.class));
        VahanServiceConnection.a aVar = VahanServiceConnection.f21199a;
        L2(aVar.b(this));
        L2(aVar.b(this));
        Z2(aVar.b(this));
        View findViewById12 = findViewById(R.id.enterMobileTv);
        cm.l.e(findViewById12, "findViewById(...)");
        w2((TextView) findViewById12);
        View findViewById13 = findViewById(R.id.termCndLl);
        cm.l.e(findViewById13, "findViewById(...)");
        R2((LinearLayout) findViewById13);
        View findViewById14 = findViewById(R.id.verifyOtpLl);
        cm.l.e(findViewById14, "findViewById(...)");
        Y2((LinearLayout) findViewById14);
        View findViewById15 = findViewById(R.id.disPlay);
        cm.l.e(findViewById15, "findViewById(...)");
        u2((TextView) findViewById15);
        View findViewById16 = findViewById(R.id.enterOtp);
        cm.l.e(findViewById16, "findViewById(...)");
        x2((EditText) findViewById16);
        View findViewById17 = findViewById(R.id.showmpin);
        cm.l.e(findViewById17, "findViewById(...)");
        P2((ImageView) findViewById17);
        View findViewById18 = findViewById(R.id.time_text);
        cm.l.e(findViewById18, "findViewById(...)");
        T2((MyTextView) findViewById18);
        View findViewById19 = findViewById(R.id.resendOtp);
        cm.l.e(findViewById19, "findViewById(...)");
        J2((MyTextView) findViewById19);
        View findViewById20 = findViewById(R.id.verifyOtpBtn);
        cm.l.e(findViewById20, "findViewById(...)");
        X2((LinearLayout) findViewById20);
        View findViewById21 = findViewById(R.id.submitOtp);
        cm.l.e(findViewById21, "findViewById(...)");
        Q2((TextView) findViewById21);
        View findViewById22 = findViewById(R.id.txt_reset);
        cm.l.e(findViewById22, "findViewById(...)");
        V2((TextView) findViewById22);
        View findViewById23 = findViewById(R.id.update_mob);
        cm.l.e(findViewById23, "findViewById(...)");
        W2((TextView) findViewById23);
        F1().setEnabled(false);
        F1().setAlpha(0.5f);
        F2(new ProgressDialog(this));
        J1().setMessage("Please wait...");
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        O2(new ld.g(this));
        W1().setVisibility(8);
        a3((bi.j) new u0((x0) this, (u0.b) new bi.i(new wg.e(X1()))).a(bi.j.class));
        b3((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(O1()))).a(l.class));
        D2(String.valueOf(getIntent().getStringExtra("off_code")));
        q2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        p2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        I2((NrvDetails) serializableExtra);
        this.f21272v0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        z2(String.valueOf(getIntent().getStringExtra("MobNo")));
        try {
            C1().f29727o.f28308i.setText(String.valueOf(getIntent().getStringExtra("ServiceName")));
            C1().f29717e.setText("New Owner(Buyer) Mobile No.");
        } catch (Exception unused) {
            C1().f29727o.f28308i.setText(new ld.c(this).b("toSellerBuyer", getString(R.string.vahan_transfer_of_ownership)));
        }
        this.f21268r0 = String.valueOf(L1().getRc_regn_no());
        String G1 = G1();
        if (G1 == null || G1.length() == 0 || p.o(G1(), "null", true)) {
            D1 = D1();
            str = "NA";
        } else {
            D1 = D1();
            str = G1();
        }
        D1.setText(str);
        String str2 = this.f21268r0;
        if (!(str2 == null || str2.length() == 0)) {
            U1().setText(this.f21268r0.toString());
        }
        H1().setOnClickListener(new ah.b(this));
        I1().setOnClickListener(new n(this));
        F1().setOnClickListener(new o(this));
        N1().setOnClickListener(new p(this));
        W1().setOnClickListener(new q(this));
        S1().setOnCheckedChangeListener(new r(this));
        Z1().h().g(this, new h(new e(this)));
        Z1().i().g(this, new h(new f(this)));
        Z1().g().g(this, new h(new g(this)));
        B1().setOnClickListener(new s(this));
        M1().setOnClickListener(new t(this));
        Q1().setOnClickListener(new ah.u(this));
        Y1().i().g(this, new h(new b(this)));
        R1().setOnClickListener(new ah.c(this));
        Y1().k().g(this, new h(new c(this)));
        Z1().g().g(this, new h(new d(this)));
        V1().setOnClickListener(new ah.m(this));
    }

    public final void p2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21274x0 = str;
    }

    public final void q2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21273w0 = str;
    }

    public final void r2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.R = myTextView;
    }

    public final void s2(z8 z8Var) {
        cm.l.f(z8Var, "<set-?>");
        this.f21269s0 = z8Var;
    }

    public final void t2(CoordinatorLayout coordinatorLayout) {
        cm.l.f(coordinatorLayout, "<set-?>");
        this.G = coordinatorLayout;
    }

    public final void u2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21252b0 = textView;
    }

    public final void v2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void w2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Y = textView;
    }

    public final void x2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.f21253c0 = editText;
    }

    public final void y2(AppCompatButton appCompatButton) {
        cm.l.f(appCompatButton, "<set-?>");
        this.H = appCompatButton;
    }

    public final void z1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new ah.l(dialog, this, context));
        dialog.show();
    }

    public final void z2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }
}
