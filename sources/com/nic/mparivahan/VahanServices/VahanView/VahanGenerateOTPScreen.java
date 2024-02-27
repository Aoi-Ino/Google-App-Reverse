package com.nic.mparivahan.VahanServices.VahanView;

import ai.a3;
import ai.b3;
import ai.c3;
import ai.d3;
import ai.e3;
import ai.f3;
import ai.g3;
import ai.h3;
import ai.i3;
import ai.j3;
import ai.k3;
import ai.l3;
import ai.m3;
import ai.n3;
import ai.v2;
import ai.w2;
import ai.x2;
import ai.y2;
import ai.z2;
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
import android.util.Log;
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
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.VahanAlterationOfVehicle;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundingFeeActivity;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment;
import com.nic.mparivahan.VahanServices.Nominee.NomineeActivity;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAuthorizationPermit;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcSurrenderActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import java.io.Serializable;
import java.util.HashMap;
import ni.z8;
import pl.x;
import v9.e;

public final class VahanGenerateOTPScreen extends androidx.appcompat.app.d {
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
    public LinearLayout f21514a0;

    /* renamed from: b0  reason: collision with root package name */
    public TextView f21515b0;

    /* renamed from: c0  reason: collision with root package name */
    public EditText f21516c0;

    /* renamed from: d0  reason: collision with root package name */
    public ImageView f21517d0;

    /* renamed from: e0  reason: collision with root package name */
    public MyTextView f21518e0;

    /* renamed from: f0  reason: collision with root package name */
    public MyTextView f21519f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f21520g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f21521h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f21522i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f21523j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f21524k0;

    /* renamed from: l0  reason: collision with root package name */
    public bi.h f21525l0;

    /* renamed from: m0  reason: collision with root package name */
    public VahanProService f21526m0;

    /* renamed from: n0  reason: collision with root package name */
    public bi.j f21527n0;

    /* renamed from: o0  reason: collision with root package name */
    public VahanServiceConnection f21528o0;

    /* renamed from: p0  reason: collision with root package name */
    private String f21529p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f21530q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f21531r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    public z8 f21532s0;

    /* renamed from: t0  reason: collision with root package name */
    public ld.c f21533t0;

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanGenerateOTPScreen f21534a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanGenerateOTPScreen vahanGenerateOTPScreen) {
            super(30000, 1000);
            this.f21534a = vahanGenerateOTPScreen;
        }

        public void onFinish() {
            this.f21534a.M1().setVisibility(0);
            this.f21534a.U1().setText("0");
            this.f21534a.U1().setVisibility(8);
        }

        public void onTick(long j10) {
            MyTextView U1 = this.f21534a.U1();
            U1.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21534a.M1().setVisibility(8);
            this.f21534a.U1().setVisibility(0);
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanGenerateOTPScreen f21535e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanGenerateOTPScreen vahanGenerateOTPScreen) {
            super(1);
            this.f21535e = vahanGenerateOTPScreen;
        }

        public final void b(ResendOtp resendOtp) {
            VahanGenerateOTPScreen vahanGenerateOTPScreen;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f21535e.I1().dismiss();
                    VahanGenerateOTPScreen vahanGenerateOTPScreen2 = this.f21535e;
                    vahanGenerateOTPScreen2.o2(vahanGenerateOTPScreen2, vahanGenerateOTPScreen2.Q1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                    return;
                }
                if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    vahanGenerateOTPScreen = this.f21535e;
                } else {
                    this.f21535e.I1().dismiss();
                    vahanGenerateOTPScreen = this.f21535e;
                }
                vahanGenerateOTPScreen.o2(vahanGenerateOTPScreen, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                this.f21535e.I1().dismiss();
                VahanGenerateOTPScreen vahanGenerateOTPScreen3 = this.f21535e;
                vahanGenerateOTPScreen3.o2(vahanGenerateOTPScreen3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanGenerateOTPScreen f21536e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanGenerateOTPScreen vahanGenerateOTPScreen) {
            super(1);
            this.f21536e = vahanGenerateOTPScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            Log.e("if---TEST", otpVerifyResult.toString());
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    if (this.f21536e.I1().isShowing()) {
                        this.f21536e.I1().dismiss();
                    }
                    VahanGenerateOTPScreen vahanGenerateOTPScreen = this.f21536e;
                    vahanGenerateOTPScreen.q2(vahanGenerateOTPScreen.K1(), this.f21536e.P1(), false);
                    return;
                }
                if (this.f21536e.I1().isShowing()) {
                    this.f21536e.I1().dismiss();
                }
                VahanGenerateOTPScreen vahanGenerateOTPScreen2 = this.f21536e;
                vahanGenerateOTPScreen2.o2(vahanGenerateOTPScreen2, otpVerifyResult.getStatusDesc());
            } catch (Exception e10) {
                if (this.f21536e.I1().isShowing()) {
                    this.f21536e.I1().dismiss();
                }
                e10.printStackTrace();
                VahanGenerateOTPScreen vahanGenerateOTPScreen3 = this.f21536e;
                vahanGenerateOTPScreen3.o2(vahanGenerateOTPScreen3, vahanGenerateOTPScreen3.Q1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanGenerateOTPScreen f21537e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanGenerateOTPScreen vahanGenerateOTPScreen) {
            super(1);
            this.f21537e = vahanGenerateOTPScreen;
        }

        public final void b(String str) {
            this.f21537e.I1().dismiss();
            VahanGenerateOTPScreen vahanGenerateOTPScreen = this.f21537e;
            vahanGenerateOTPScreen.o2(vahanGenerateOTPScreen, vahanGenerateOTPScreen.Q1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanGenerateOTPScreen f21538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanGenerateOTPScreen vahanGenerateOTPScreen) {
            super(1);
            this.f21538e = vahanGenerateOTPScreen;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            try {
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    this.f21538e.a2().m(this.f21538e, String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzMobile()), String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzRecordId()));
                } else if (p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    this.f21538e.I1().dismiss();
                } else {
                    this.f21538e.I1().dismiss();
                    Toast.makeText(this.f21538e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f21538e.I1().dismiss();
                Toast.makeText(this.f21538e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanGenerateOTPScreen f21539e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanGenerateOTPScreen vahanGenerateOTPScreen) {
            super(1);
            this.f21539e = vahanGenerateOTPScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            Toast makeText;
            try {
                this.f21539e.I1().dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    VahanGenerateOTPScreen vahanGenerateOTPScreen = this.f21539e;
                    vahanGenerateOTPScreen.f3(vahanGenerateOTPScreen, vahanGenerateOTPScreen.B1().getText().toString());
                    this.f21539e.E2(String.valueOf(sendOtpResult.getRecordId()));
                    VahanGenerateOTPScreen vahanGenerateOTPScreen2 = this.f21539e;
                    vahanGenerateOTPScreen2.H2(vahanGenerateOTPScreen2.V1().getText().toString());
                    return;
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL022", true)) {
                    makeText = Toast.makeText(this.f21539e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL014", true)) {
                    makeText = Toast.makeText(this.f21539e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    makeText = Toast.makeText(this.f21539e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1);
                } else {
                    Toast.makeText(this.f21539e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    x xVar = x.f30437a;
                    return;
                }
                makeText.show();
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(this.f21539e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanGenerateOTPScreen f21540e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanGenerateOTPScreen vahanGenerateOTPScreen) {
            super(1);
            this.f21540e = vahanGenerateOTPScreen;
        }

        public final void b(String str) {
            this.f21540e.I1().dismiss();
            VahanGenerateOTPScreen vahanGenerateOTPScreen = this.f21540e;
            vahanGenerateOTPScreen.d3(vahanGenerateOTPScreen, vahanGenerateOTPScreen.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21541a;

        h(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21541a = lVar;
        }

        public final pl.c a() {
            return this.f21541a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21541a.invoke(obj);
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
        final /* synthetic */ TextView f21542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f21543b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f21544c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f21545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, u uVar, Context context, TextView textView2) {
            super(30000, 1000);
            this.f21542a = textView;
            this.f21543b = uVar;
            this.f21544c = context;
            this.f21545d = textView2;
        }

        public void onFinish() {
            this.f21545d.setVisibility(0);
            this.f21542a.setText("0");
            this.f21542a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21542a;
            textView.setText(((ld.c) this.f21543b.f20234e).b("time_remaining", this.f21544c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21545d.setVisibility(8);
            this.f21542a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f21547b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f21548c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f21549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, u uVar, Context context, TextView textView2) {
            super(30000, 1000);
            this.f21546a = textView;
            this.f21547b = uVar;
            this.f21548c = context;
            this.f21549d = textView2;
        }

        public void onFinish() {
            this.f21549d.setVisibility(0);
            this.f21546a.setText("0");
            this.f21546a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21546a;
            textView.setText(((ld.c) this.f21547b.f20234e).b("time_remaining", this.f21548c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21549d.setVisibility(8);
            this.f21546a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        vahanGenerateOTPScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        vahanGenerateOTPScreen.n2();
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        EditText C1;
        TransformationMethod instance;
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        if (vahanGenerateOTPScreen.C1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            vahanGenerateOTPScreen.R1().setImageResource(R.drawable.pass_visible);
            C1 = vahanGenerateOTPScreen.C1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            vahanGenerateOTPScreen.R1().setImageResource(R.drawable.mvvm_visibility);
            C1 = vahanGenerateOTPScreen.C1();
            instance = PasswordTransformationMethod.getInstance();
        }
        C1.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void e2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        ld.c Q1;
        String str;
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        String obj = vahanGenerateOTPScreen.C1().getText().toString();
        if (obj.length() == 0) {
            Q1 = vahanGenerateOTPScreen.Q1();
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            Q1 = vahanGenerateOTPScreen.Q1();
            str = "Please enter the valid OTP";
        } else {
            if (vahanGenerateOTPScreen.I1().isShowing()) {
                vahanGenerateOTPScreen.I1().dismiss();
            }
            vahanGenerateOTPScreen.I1().show();
            vahanGenerateOTPScreen.Z1().l(vahanGenerateOTPScreen, obj, vahanGenerateOTPScreen.f21529p0);
            return;
        }
        vahanGenerateOTPScreen.o2(vahanGenerateOTPScreen, Q1.b("label_log_entr_otp", str));
    }

    /* access modifiers changed from: private */
    public static final void e3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void f2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        vahanGenerateOTPScreen.C1().setText("");
    }

    /* access modifiers changed from: private */
    public static final void g2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        String obj = q.B0(vahanGenerateOTPScreen.B1().getText().toString()).toString();
        if (obj.length() < 10) {
            Toast.makeText(vahanGenerateOTPScreen, "Invalid mobile number", 0).show();
            return;
        }
        vahanGenerateOTPScreen.I1().show();
        vahanGenerateOTPScreen.a2().m(vahanGenerateOTPScreen, obj, new ld.g(vahanGenerateOTPScreen).k());
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
    public static final void h2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        if (vahanGenerateOTPScreen.T1().isChecked()) {
            vahanGenerateOTPScreen.T1().setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void h3(VahanGenerateOTPScreen vahanGenerateOTPScreen, TextView textView, u uVar, Context context, TextView textView2, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(uVar, "$langSession");
        cm.l.f(context, "$context");
        cm.l.f(textView2, "$resendOtp");
        vahanGenerateOTPScreen.I1().show();
        new j(textView, uVar, context, textView2).start();
        vahanGenerateOTPScreen.Z1().j(vahanGenerateOTPScreen, vahanGenerateOTPScreen.f21529p0);
    }

    /* access modifiers changed from: private */
    public static final void i2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        vahanGenerateOTPScreen.startActivity(new Intent(vahanGenerateOTPScreen, VahanUpdateMobileActivity.class));
        vahanGenerateOTPScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void i3(EditText editText, Context context, u uVar, VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        String b10;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(context, "$context");
        cm.l.f(uVar, "$langSession");
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            b10 = ((ld.c) uVar.f20234e).b("label_log_entr_otp", context.getString(R.string.pls_enter_otp));
        } else if (obj.length() < 6) {
            b10 = ((ld.c) uVar.f20234e).b("label_log_entr_val_otp", "Please enter the valid OTP");
        } else {
            if (vahanGenerateOTPScreen.I1().isShowing()) {
                vahanGenerateOTPScreen.I1().dismiss();
            }
            vahanGenerateOTPScreen.I1().show();
            vahanGenerateOTPScreen.Z1().l(vahanGenerateOTPScreen, obj, vahanGenerateOTPScreen.f21529p0);
            return;
        }
        Toast.makeText(context, b10, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void j2(VahanGenerateOTPScreen vahanGenerateOTPScreen, CompoundButton compoundButton, boolean z10) {
        AppCompatButton D1;
        float f10;
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        if (z10) {
            vahanGenerateOTPScreen.D1().setEnabled(true);
            D1 = vahanGenerateOTPScreen.D1();
            f10 = 1.0f;
        } else if (!z10) {
            vahanGenerateOTPScreen.D1().setEnabled(false);
            D1 = vahanGenerateOTPScreen.D1();
            f10 = 0.5f;
        } else {
            return;
        }
        D1.setAlpha(f10);
    }

    /* access modifiers changed from: private */
    public static final void j3(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void k2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        Dialog dialog = new Dialog(vahanGenerateOTPScreen);
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
        ((ImageView) findViewById).setOnClickListener(new x2(dialog));
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + vahanGenerateOTPScreen.Q1().d() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void k3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void l2(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void m2(VahanGenerateOTPScreen vahanGenerateOTPScreen, View view) {
        cm.l.f(vahanGenerateOTPScreen, "this$0");
        vahanGenerateOTPScreen.I1().show();
        new a(vahanGenerateOTPScreen).start();
        vahanGenerateOTPScreen.Z1().j(vahanGenerateOTPScreen, vahanGenerateOTPScreen.f21529p0);
    }

    private final void n2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void p2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final z8 A1() {
        z8 z8Var = this.f21532s0;
        if (z8Var != null) {
            return z8Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void A2(AppCompatImageView appCompatImageView) {
        cm.l.f(appCompatImageView, "<set-?>");
        this.M = appCompatImageView;
    }

    public final TextView B1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("edit_mobile_number");
        return null;
    }

    public final void B2(RelativeLayout relativeLayout) {
        cm.l.f(relativeLayout, "<set-?>");
        this.N = relativeLayout;
    }

    public final EditText C1() {
        EditText editText = this.f21516c0;
        if (editText != null) {
            return editText;
        }
        cm.l.v("enterOtp");
        return null;
    }

    public final void C2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21524k0 = textView;
    }

    public final AppCompatButton D1() {
        AppCompatButton appCompatButton = this.H;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        cm.l.v("generateOtp");
        return null;
    }

    public final void D2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final String E1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("mobile_number");
        return null;
    }

    public final void E2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21529p0 = str;
    }

    public final AppCompatImageView F1() {
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        cm.l.v("mvvm_back");
        return null;
    }

    public final void F2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final RelativeLayout G1() {
        RelativeLayout relativeLayout = this.N;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        cm.l.v("nexGenHolder");
        return null;
    }

    public final void G2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f21526m0 = vahanProService;
    }

    public final String H1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final void H2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21530q0 = str;
    }

    public final ProgressDialog I1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void I2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.W = nrvDetails;
    }

    public final VahanProService J1() {
        VahanProService vahanProService = this.f21526m0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("proservice");
        return null;
    }

    public final void J2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.f21519f0 = myTextView;
    }

    public final String K1() {
        return this.f21530q0;
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
        MyTextView myTextView = this.f21519f0;
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
        this.f21533t0 = cVar;
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

    public final HashMap P1() {
        return this.T;
    }

    public final void P2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.f21517d0 = imageView;
    }

    public final ld.c Q1() {
        ld.c cVar = this.f21533t0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void Q2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21521h0 = textView;
    }

    public final ImageView R1() {
        ImageView imageView = this.f21517d0;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("shownPin");
        return null;
    }

    public final void R2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.Z = linearLayout;
    }

    public final TextView S1() {
        TextView textView = this.f21521h0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("submitOtp");
        return null;
    }

    public final void S2(CheckBox checkBox) {
        cm.l.f(checkBox, "<set-?>");
        this.K = checkBox;
    }

    public final CheckBox T1() {
        CheckBox checkBox = this.K;
        if (checkBox != null) {
            return checkBox;
        }
        cm.l.v("term_condition");
        return null;
    }

    public final void T2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.f21518e0 = myTextView;
    }

    public final MyTextView U1() {
        MyTextView myTextView = this.f21518e0;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("time_text");
        return null;
    }

    public final void U2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final TextView V1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtVehicleNumber");
        return null;
    }

    public final void V2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21522i0 = textView;
    }

    public final TextView W1() {
        TextView textView = this.f21522i0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final void W2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21523j0 = textView;
    }

    public final TextView X1() {
        TextView textView = this.f21523j0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("update_mob");
        return null;
    }

    public final void X2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f21520g0 = linearLayout;
    }

    public final VahanServiceConnection Y1() {
        VahanServiceConnection vahanServiceConnection = this.f21528o0;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("verifyOtpRetrofitService");
        return null;
    }

    public final void Y2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f21514a0 = linearLayout;
    }

    public final bi.j Z1() {
        bi.j jVar = this.f21527n0;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("verifyOtpViewModel");
        return null;
    }

    public final void Z2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.f21528o0 = vahanServiceConnection;
    }

    public final l a2() {
        l lVar = this.P;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void a3(bi.j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.f21527n0 = jVar;
    }

    public final void b3(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.P = lVar;
    }

    public final void c3(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f21525l0 = hVar;
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
        ((TextView) findViewById2).setOnClickListener(new e3(dialog));
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
        imageView.setOnClickListener(new z2(editText, imageView));
        textView.setOnClickListener(new a3(this, textView3, uVar, context, textView));
        textView2.setOnClickListener(new b3(editText, context2, uVar, this));
        textView4.setOnClickListener(new c3(editText));
        imageView2.setOnClickListener(new d3(dialog));
        dialog.show();
    }

    public final void o2(Context context, String str) {
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
        ((TextView) findViewById).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new y2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView B1;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_generate_o_t_p_screen);
        z8 c10 = z8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        s2(c10);
        setContentView((View) A1().b());
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
        v9.e.f17509a.I2(this, A1(), N1(), D1());
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
        c3((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(J1()))).a(bi.h.class));
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
        D1().setEnabled(false);
        D1().setAlpha(0.5f);
        F2(new ProgressDialog(this));
        I1().setMessage("Please wait...");
        I1().setCancelable(false);
        I1().setCanceledOnTouchOutside(false);
        O2(new ld.g(this));
        a3((bi.j) new u0((x0) this, (u0.b) new bi.i(new wg.e(Y1()))).a(bi.j.class));
        b3((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(O1()))).a(l.class));
        this.f21531r0 = String.valueOf(getIntent().getStringExtra("RC"));
        z2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        I2((NrvDetails) serializableExtra);
        HashMap hashMap = (HashMap) getIntent().getSerializableExtra("map");
        cm.l.c(hashMap);
        this.T = hashMap;
        D2(String.valueOf(getIntent().getStringExtra("off_code")));
        if (this.T.size() > 0) {
            A1().f29727o.f28308i.setText(y1(this.T));
        }
        if (this.T.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            A1().f29727o.f28304e.setVisibility(8);
        }
        String E1 = E1();
        if (E1 == null || E1.length() == 0 || p.o(E1(), "null", true)) {
            B1 = B1();
            str = "NA";
        } else {
            B1 = B1();
            str = E1();
        }
        B1.setText(str);
        String str2 = this.f21531r0;
        if (!(str2 == null || str2.length() == 0)) {
            V1().setText(this.f21531r0.toString());
        }
        F1().setOnClickListener(new v2(this));
        G1().setOnClickListener(new g3(this));
        D1().setOnClickListener(new h3(this));
        N1().setOnClickListener(new i3(this));
        X1().setOnClickListener(new j3(this));
        T1().setOnCheckedChangeListener(new k3(this));
        a2().h().g(this, new h(new e(this)));
        a2().i().g(this, new h(new f(this)));
        a2().g().g(this, new h(new g(this)));
        z1().setOnClickListener(new l3(this));
        M1().setOnClickListener(new m3(this));
        R1().setOnClickListener(new n3(this));
        Z1().i().g(this, new h(new b(this)));
        S1().setOnClickListener(new w2(this));
        Z1().k().g(this, new h(new c(this)));
        Z1().g().g(this, new h(new d(this)));
        W1().setOnClickListener(new f3(this));
    }

    public final void q2(String str, HashMap hashMap, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = str;
        HashMap hashMap2 = hashMap;
        boolean z11 = z10;
        cm.l.f(str8, "rc_number");
        cm.l.f(hashMap2, "serviceSelection_HashMap");
        if (hashMap2.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, VahanDuplicateRcActivity.class);
            intent.putExtra("RC", str8);
            intent.putExtra("RcDetails", L1());
            intent.putExtra("map", hashMap2);
            intent.putExtra("off_code", H1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent);
            finish();
        }
        if (hashMap2.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent2 = new Intent(this, VahanChangeOfAddress.class);
            intent2.putExtra("RC", str8);
            intent2.putExtra("RcDetails", L1());
            intent2.putExtra("map", hashMap2);
            intent2.putExtra("off_code", H1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent2.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent2);
            finish();
        }
        if (hashMap2.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent3 = new Intent(this, HypothecationTerminationActivity.class);
            intent3.putExtra("RC", str8);
            intent3.putExtra("RcDetails", L1());
            intent3.putExtra("map", hashMap2);
            intent3.putExtra("off_code", H1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent3.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent3.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent3);
            finish();
        }
        Class<HypothecationContinuationActivity> cls = HypothecationContinuationActivity.class;
        if (hashMap2.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent4 = new Intent(this, cls);
            intent4.putExtra("RC", str8);
            intent4.putExtra("RcDetails", L1());
            intent4.putExtra("map", hashMap2);
            intent4.putExtra("off_code", H1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent4.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent4.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent4);
            finish();
        }
        if (hashMap2.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent5 = new Intent(this, HypothecationAdditionActivity.class);
            intent5.putExtra("RC", str8);
            intent5.putExtra("RcDetails", L1());
            intent5.putExtra("map", hashMap2);
            intent5.putExtra("off_code", H1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent5.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent5.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent5);
            finish();
        }
        if (hashMap2.containsKey(VContant.RCPARTICULAR)) {
            Intent intent6 = new Intent(this, VahanDetailsForRcParticulara.class);
            intent6.putExtra("RcDetails", L1());
            intent6.putExtra("RC", str8);
            intent6.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent6.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent6.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent6);
            finish();
        }
        if (hashMap2.containsKey(VContant.NOC)) {
            Intent intent7 = new Intent(this, VahanNocActivity.class);
            intent7.putExtra("RC", str8);
            intent7.putExtra("RcDetails", L1());
            intent7.putExtra("map", hashMap2);
            intent7.putExtra("off_code", H1());
            intent7.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent7.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent7.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent7);
            finish();
        }
        if (hashMap2.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent8 = new Intent(this, cls);
            intent8.putExtra("RC", str8);
            intent8.putExtra("RcDetails", L1());
            intent8.putExtra("map", hashMap2);
            intent8.putExtra("off_code", H1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent8.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent8.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent8);
            finish();
        }
        if (hashMap2.containsKey(VContant.DUPLICATE_FITNESS)) {
            Intent intent9 = new Intent(this, VahanDuplicateFitnessActivity.class);
            intent9.putExtra("RC", str8);
            intent9.putExtra("RcDetails", L1());
            intent9.putExtra("map", hashMap2);
            intent9.putExtra("off_code", H1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent9.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent9.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent9);
            finish();
        }
        if (hashMap2.containsKey(VContant.RC_CANCALATION)) {
            Intent intent10 = new Intent(this, VahanRcCancellationActivity.class);
            intent10.putExtra("RC", str8);
            intent10.putExtra("RcDetails", L1());
            intent10.putExtra("map", hashMap2);
            intent10.putExtra("off_code", H1());
            intent10.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent10.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent10.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent10);
            finish();
        }
        if (hashMap2.containsKey(VContant.RC_SURRENDER)) {
            Intent intent11 = new Intent(this, VahanRcSurrenderActivity.class);
            intent11.putExtra("RC", str8);
            intent11.putExtra("RcDetails", L1());
            intent11.putExtra("map", hashMap2);
            intent11.putExtra("off_code", H1());
            intent11.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent11.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent11.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent11);
            finish();
        }
        if (hashMap2.containsKey(VContant.DUPLICATE_PERMIT)) {
            Intent intent12 = new Intent(this, VahanDuplicatePermitActivity.class);
            intent12.putExtra("RC", str8);
            intent12.putExtra("RcDetails", L1());
            intent12.putExtra("map", hashMap2);
            intent12.putExtra("off_code", H1());
            intent12.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent12.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent12.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent12);
            finish();
        }
        String str9 = "RcDetails";
        Class<PayTaxActivity> cls2 = PayTaxActivity.class;
        if (hashMap2.containsKey(VContant.PAY_TAX)) {
            Intent intent13 = new Intent(this, cls2);
            intent13.putExtra("RC", str8);
            intent13.putExtra("State", q.B0(String.valueOf(L1().getState_cd())).toString());
            intent13.putExtra("map", hashMap2);
            intent13.putExtra("off_code", H1());
            String rc_chasi_no = L1().getRc_chasi_no();
            if (rc_chasi_no != null) {
                str2 = "off_code";
                str7 = rc_chasi_no.substring(String.valueOf(L1().getRc_chasi_no()).length() - 5);
                cm.l.e(str7, "this as java.lang.String).substring(startIndex)");
            } else {
                str2 = "off_code";
                str7 = null;
            }
            intent13.putExtra("chassis_no", str7);
            intent13.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent13.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent13.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent13);
            finish();
        } else {
            str2 = "off_code";
        }
        if (hashMap2.containsKey(VContant.PAY_TAXASS)) {
            Intent intent14 = new Intent(this, cls2);
            str4 = str;
            intent14.putExtra("RC", str4);
            intent14.putExtra("State", q.B0(String.valueOf(L1().getState_cd())).toString());
            intent14.putExtra("map", hashMap2);
            str3 = str2;
            intent14.putExtra(str3, H1());
            String rc_chasi_no2 = L1().getRc_chasi_no();
            if (rc_chasi_no2 != null) {
                str6 = rc_chasi_no2.substring(String.valueOf(L1().getRc_chasi_no()).length() - 5);
                cm.l.e(str6, "this as java.lang.String).substring(startIndex)");
            } else {
                str6 = null;
            }
            intent14.putExtra("chassis_no", str6);
            intent14.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent14.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent14.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent14);
            finish();
        } else {
            str4 = str;
            str3 = str2;
        }
        if (hashMap2.containsKey(VContant.RC_RELEASE)) {
            Intent intent15 = new Intent(this, RCReleaseActivity.class);
            intent15.putExtra("RC", str4);
            str5 = str9;
            intent15.putExtra(str5, L1());
            intent15.putExtra("map", hashMap2);
            intent15.putExtra(str3, H1());
            intent15.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent15.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent15.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent15);
            finish();
        } else {
            str5 = str9;
        }
        if (hashMap2.containsKey(VContant.Temp_Permit)) {
            Intent intent16 = new Intent(this, TemporaryPermitActivity.class);
            intent16.putExtra("RC", str4);
            intent16.putExtra(str5, L1());
            intent16.putExtra("map", hashMap2);
            intent16.putExtra(str3, H1());
            intent16.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent16.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent16.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent16);
            finish();
        }
        if (hashMap2.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent17 = new Intent(this, VahanTransferOfOwnerShipActivity.class);
            intent17.putExtra("RC", str4);
            intent17.putExtra(str5, L1());
            intent17.putExtra("map", hashMap2);
            intent17.putExtra(str3, H1());
            intent17.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent17.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent17.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent17);
            finish();
        }
        if (hashMap2.containsKey(VContant.NP_Permit)) {
            Intent intent18 = new Intent(this, RenewalOfNPAuthorizationPermit.class);
            intent18.putExtra("RC", str4);
            intent18.putExtra(str5, L1());
            intent18.putExtra("map", hashMap2);
            intent18.putExtra(str3, H1());
            intent18.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent18.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent18.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent18);
            finish();
        }
        if (hashMap2.containsKey(VContant.PERMIT_RENEWAL)) {
            Intent intent19 = new Intent(this, RenewalOfPermitMainScreen.class);
            intent19.putExtra("RC", str4);
            intent19.putExtra(str5, L1());
            intent19.putExtra("map", hashMap2);
            intent19.putExtra(str3, H1());
            intent19.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent19.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent19.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent19);
            finish();
        }
        if (hashMap2.containsKey(VContant.COMPOUND_FEE)) {
            Intent intent20 = new Intent(this, CompoundingFeeActivity.class);
            intent20.putExtra("RC", str4);
            intent20.putExtra(str5, L1());
            intent20.putExtra("map", hashMap2);
            intent20.putExtra(str3, H1());
            intent20.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent20.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent20.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent20);
            finish();
        }
        if (hashMap2.containsKey(VContant.Nominee_Addition)) {
            Intent intent21 = new Intent(this, NomineeActivity.class);
            intent21.putExtra("RC", str4);
            intent21.putExtra(str5, L1());
            intent21.putExtra("map", hashMap2);
            intent21.putExtra(str3, H1());
            intent21.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent21.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent21.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent21);
            finish();
        }
        if (hashMap2.containsKey(VContant.MISELL_PAYMENT)) {
            Intent intent22 = new Intent(this, MiscellaneousFeePayment.class);
            intent22.putExtra("RC", str4);
            intent22.putExtra(str5, L1());
            intent22.putExtra("map", hashMap2);
            intent22.putExtra(str3, H1());
            intent22.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent22.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent22.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent22);
            finish();
        }
        if (hashMap2.containsKey(VContant.ALTERATION)) {
            Intent intent23 = new Intent(this, VahanAlterationOfVehicle.class);
            intent23.putExtra("RC", str4);
            intent23.putExtra(str5, L1());
            intent23.putExtra("map", hashMap2);
            intent23.putExtra(str3, H1());
            intent23.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent23.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent23.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent23);
            finish();
        }
        if (hashMap2.containsKey(VContant.UPDATE_MOBILE)) {
            Intent intent24 = new Intent(this, VahanUpdateMobiActivity.class);
            intent24.putExtra("RC", str4);
            intent24.putExtra(str5, L1());
            intent24.putExtra("map", hashMap2);
            intent24.putExtra(str3, H1());
            intent24.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent24.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent24.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent24);
            finish();
        }
        if (hashMap2.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            Intent intent25 = new Intent(this, VahanMultiSelectionScreen.class);
            intent25.putExtra("RC", str4);
            intent25.putExtra(str5, L1());
            intent25.putExtra("map", hashMap2);
            intent25.putExtra(str3, H1());
            intent25.putExtra(VContant.NEXGEN_isFACELESS, z11);
            intent25.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent25.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent25);
            finish();
        }
    }

    public final void r2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.R = myTextView;
    }

    public final void s2(z8 z8Var) {
        cm.l.f(z8Var, "<set-?>");
        this.f21532s0 = z8Var;
    }

    public final void t2(CoordinatorLayout coordinatorLayout) {
        cm.l.f(coordinatorLayout, "<set-?>");
        this.G = coordinatorLayout;
    }

    public final void u2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21515b0 = textView;
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
        this.f21516c0 = editText;
    }

    public final String y1(HashMap hashMap) {
        e.a aVar;
        String str;
        cm.l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            aVar = v9.e.f17509a;
            str = "Issue of Duplicate RC";
        } else if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            aVar = v9.e.f17509a;
            str = "Transfer of Ownership";
        } else if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            aVar = v9.e.f17509a;
            str = "Change of Address in RC";
        } else if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            aVar = v9.e.f17509a;
            str = "Hypothecation Termination";
        } else if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            aVar = v9.e.f17509a;
            str = "Hypothecation Continuation";
        } else if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            aVar = v9.e.f17509a;
            str = "Hypothecation Addition";
        } else if (hashMap.containsKey(VContant.RCPARTICULAR)) {
            aVar = v9.e.f17509a;
            str = "RC Particulars against Fee";
        } else if (hashMap.containsKey(VContant.NOC)) {
            aVar = v9.e.f17509a;
            str = "No Objection Certificate (NOC)";
        } else if (hashMap.containsKey(VContant.DUPLICATE_FITNESS)) {
            aVar = v9.e.f17509a;
            str = "Duplicate Fitness Certificate";
        } else if (hashMap.containsKey(VContant.DUPLICATE_PERMIT)) {
            aVar = v9.e.f17509a;
            str = "Duplicate Permit Certificate";
        } else if (hashMap.containsKey(VContant.RC_SURRENDER)) {
            aVar = v9.e.f17509a;
            str = "RC Surrender";
        } else if (hashMap.containsKey(VContant.RC_CANCALATION)) {
            aVar = v9.e.f17509a;
            str = "RC Cancellation";
        } else if (hashMap.containsKey(VContant.PAY_TAX)) {
            aVar = v9.e.f17509a;
            str = "Pay Tax";
        } else if (hashMap.containsKey(VContant.PAY_TAXASS)) {
            aVar = v9.e.f17509a;
            str = "Tax Assessment";
        } else if (hashMap.containsKey(VContant.RC_RELEASE)) {
            aVar = v9.e.f17509a;
            str = "RC Release";
        } else if (hashMap.containsKey(VContant.Temp_Permit)) {
            aVar = v9.e.f17509a;
            str = "Temporary Permit";
        } else if (hashMap.containsKey(VContant.NP_Permit)) {
            aVar = v9.e.f17509a;
            str = "Renewal of NP Authorization Permit";
        } else if (hashMap.containsKey(VContant.PERMIT_RENEWAL)) {
            aVar = v9.e.f17509a;
            str = "Permit Renewal";
        } else if (hashMap.containsKey(VContant.Nominee_Addition)) {
            aVar = v9.e.f17509a;
            str = "Addition of Nominee";
        } else if (hashMap.containsKey(VContant.COMPOUND_FEE)) {
            aVar = v9.e.f17509a;
            str = "Compounding Fee Payment";
        } else if (hashMap.containsKey(VContant.MISELL_PAYMENT)) {
            aVar = v9.e.f17509a;
            str = "Miscellaneous Fee Payment";
        } else if (hashMap.containsKey(VContant.ALTERATION)) {
            aVar = v9.e.f17509a;
            str = "Alteration of Vehicle";
        } else if (!hashMap.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            return "";
        } else {
            aVar = v9.e.f17509a;
            str = "RC Services";
        }
        return aVar.O(this, str);
    }

    public final void y2(AppCompatButton appCompatButton) {
        cm.l.f(appCompatButton, "<set-?>");
        this.H = appCompatButton;
    }

    public final MyTextView z1() {
        MyTextView myTextView = this.R;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("agreeTermCond");
        return null;
    }

    public final void z2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }
}
