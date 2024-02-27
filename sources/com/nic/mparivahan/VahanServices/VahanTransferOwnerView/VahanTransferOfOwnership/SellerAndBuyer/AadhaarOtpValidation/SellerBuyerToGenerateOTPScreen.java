package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation;

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
import ch.k;
import ch.n;
import ch.o;
import ch.p;
import ch.q;
import ch.r;
import ch.s;
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
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.TOMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import ni.z8;
import pl.x;

public final class SellerBuyerToGenerateOTPScreen extends androidx.appcompat.app.d {
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
    public LinearLayout f21300a0;

    /* renamed from: b0  reason: collision with root package name */
    public TextView f21301b0;

    /* renamed from: c0  reason: collision with root package name */
    public EditText f21302c0;

    /* renamed from: d0  reason: collision with root package name */
    public ImageView f21303d0;

    /* renamed from: e0  reason: collision with root package name */
    public MyTextView f21304e0;

    /* renamed from: f0  reason: collision with root package name */
    public MyTextView f21305f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f21306g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f21307h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f21308i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f21309j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f21310k0;

    /* renamed from: l0  reason: collision with root package name */
    public bi.h f21311l0;

    /* renamed from: m0  reason: collision with root package name */
    public VahanProService f21312m0;

    /* renamed from: n0  reason: collision with root package name */
    public bi.j f21313n0;

    /* renamed from: o0  reason: collision with root package name */
    public VahanServiceConnection f21314o0;

    /* renamed from: p0  reason: collision with root package name */
    private String f21315p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f21316q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f21317r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    public z8 f21318s0;

    /* renamed from: t0  reason: collision with root package name */
    public ld.c f21319t0;

    /* renamed from: u0  reason: collision with root package name */
    private ArrayList f21320u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    private boolean f21321v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f21322w0;

    /* renamed from: x0  reason: collision with root package name */
    public String f21323x0;

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SellerBuyerToGenerateOTPScreen f21324a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
            super(30000, 1000);
            this.f21324a = sellerBuyerToGenerateOTPScreen;
        }

        public void onFinish() {
            this.f21324a.L1().setVisibility(0);
            this.f21324a.T1().setText("0");
            this.f21324a.T1().setVisibility(8);
        }

        public void onTick(long j10) {
            MyTextView T1 = this.f21324a.T1();
            T1.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21324a.L1().setVisibility(8);
            this.f21324a.T1().setVisibility(0);
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerBuyerToGenerateOTPScreen f21325e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
            super(1);
            this.f21325e = sellerBuyerToGenerateOTPScreen;
        }

        public final void b(ResendOtp resendOtp) {
            SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    this.f21325e.H1().dismiss();
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen2 = this.f21325e;
                    sellerBuyerToGenerateOTPScreen2.o2(sellerBuyerToGenerateOTPScreen2, sellerBuyerToGenerateOTPScreen2.P1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                    return;
                }
                if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    sellerBuyerToGenerateOTPScreen = this.f21325e;
                } else {
                    this.f21325e.H1().dismiss();
                    sellerBuyerToGenerateOTPScreen = this.f21325e;
                }
                sellerBuyerToGenerateOTPScreen.o2(sellerBuyerToGenerateOTPScreen, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                this.f21325e.H1().dismiss();
                SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen3 = this.f21325e;
                sellerBuyerToGenerateOTPScreen3.o2(sellerBuyerToGenerateOTPScreen3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerBuyerToGenerateOTPScreen f21326e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
            super(1);
            this.f21326e = sellerBuyerToGenerateOTPScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    if (this.f21326e.H1().isShowing()) {
                        this.f21326e.H1().dismiss();
                    }
                    this.f21326e.setIntent(new Intent(this.f21326e, TOMultiSelectionScreen.class));
                    this.f21326e.getIntent().putExtra("RC", this.f21326e.J1());
                    this.f21326e.getIntent().putExtra("RcDetails", this.f21326e.K1());
                    this.f21326e.getIntent().putExtra("map", this.f21326e.O1());
                    this.f21326e.getIntent().putExtra("off_code", this.f21326e.G1());
                    this.f21326e.getIntent().putExtra(VContant.NEXGEN_isFACELESS, this.f21326e.a2());
                    this.f21326e.getIntent().putExtra(VContant.NEXGEN_addahar_name, "NA");
                    this.f21326e.getIntent().putExtra(VContant.NEXGEN_addahar_address, "NA");
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = this.f21326e;
                    sellerBuyerToGenerateOTPScreen.startActivity(sellerBuyerToGenerateOTPScreen.getIntent());
                    this.f21326e.finish();
                    return;
                }
                if (this.f21326e.H1().isShowing()) {
                    this.f21326e.H1().dismiss();
                }
                SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen2 = this.f21326e;
                sellerBuyerToGenerateOTPScreen2.o2(sellerBuyerToGenerateOTPScreen2, otpVerifyResult.getStatusDesc());
            } catch (Exception e10) {
                if (this.f21326e.H1().isShowing()) {
                    this.f21326e.H1().dismiss();
                }
                e10.printStackTrace();
                SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen3 = this.f21326e;
                sellerBuyerToGenerateOTPScreen3.o2(sellerBuyerToGenerateOTPScreen3, sellerBuyerToGenerateOTPScreen3.P1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerBuyerToGenerateOTPScreen f21327e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
            super(1);
            this.f21327e = sellerBuyerToGenerateOTPScreen;
        }

        public final void b(String str) {
            this.f21327e.H1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerBuyerToGenerateOTPScreen f21328e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
            super(1);
            this.f21328e = sellerBuyerToGenerateOTPScreen;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            try {
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    this.f21328e.Z1().m(this.f21328e, String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzMobile()), String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzRecordId()));
                } else if (p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    this.f21328e.H1().dismiss();
                } else {
                    this.f21328e.H1().dismiss();
                    Toast.makeText(this.f21328e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f21328e.H1().dismiss();
                Toast.makeText(this.f21328e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerBuyerToGenerateOTPScreen f21329e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
            super(1);
            this.f21329e = sellerBuyerToGenerateOTPScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            Toast makeText;
            try {
                this.f21329e.H1().dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = this.f21329e;
                    sellerBuyerToGenerateOTPScreen.g3(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.A1().getText().toString());
                    this.f21329e.F2(String.valueOf(sendOtpResult.getRecordId()));
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen2 = this.f21329e;
                    sellerBuyerToGenerateOTPScreen2.I2(sellerBuyerToGenerateOTPScreen2.U1().getText().toString());
                    return;
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL022", true)) {
                    makeText = Toast.makeText(this.f21329e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL014", true)) {
                    makeText = Toast.makeText(this.f21329e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    makeText = Toast.makeText(this.f21329e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1);
                } else {
                    Toast.makeText(this.f21329e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    x xVar = x.f30437a;
                    return;
                }
                makeText.show();
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(this.f21329e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SellerBuyerToGenerateOTPScreen f21330e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
            super(1);
            this.f21330e = sellerBuyerToGenerateOTPScreen;
        }

        public final void b(String str) {
            this.f21330e.H1().dismiss();
            SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = this.f21330e;
            sellerBuyerToGenerateOTPScreen.e3(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21331a;

        h(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21331a = lVar;
        }

        public final pl.c a() {
            return this.f21331a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21331a.invoke(obj);
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
        final /* synthetic */ TextView f21332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f21333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f21334c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f21335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, u uVar, Context context, TextView textView2) {
            super(30000, 1000);
            this.f21332a = textView;
            this.f21333b = uVar;
            this.f21334c = context;
            this.f21335d = textView2;
        }

        public void onFinish() {
            this.f21335d.setVisibility(0);
            this.f21332a.setText("0");
            this.f21332a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21332a;
            textView.setText(((ld.c) this.f21333b.f20234e).b("time_remaining", this.f21334c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21335d.setVisibility(8);
            this.f21332a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f21337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f21338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f21339d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, u uVar, Context context, TextView textView2) {
            super(30000, 1000);
            this.f21336a = textView;
            this.f21337b = uVar;
            this.f21338c = context;
            this.f21339d = textView2;
        }

        public void onFinish() {
            this.f21339d.setVisibility(0);
            this.f21336a.setText("0");
            this.f21336a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21336a;
            textView.setText(((ld.c) this.f21337b.f20234e).b("time_remaining", this.f21338c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f21339d.setVisibility(8);
            this.f21336a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        sellerBuyerToGenerateOTPScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        sellerBuyerToGenerateOTPScreen.n2();
    }

    /* access modifiers changed from: private */
    public static final void d2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        EditText B1;
        TransformationMethod instance;
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        if (sellerBuyerToGenerateOTPScreen.B1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            sellerBuyerToGenerateOTPScreen.Q1().setImageResource(R.drawable.pass_visible);
            B1 = sellerBuyerToGenerateOTPScreen.B1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            sellerBuyerToGenerateOTPScreen.Q1().setImageResource(R.drawable.mvvm_visibility);
            B1 = sellerBuyerToGenerateOTPScreen.B1();
            instance = PasswordTransformationMethod.getInstance();
        }
        B1.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void e2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        ld.c P1;
        String str;
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        String obj = sellerBuyerToGenerateOTPScreen.B1().getText().toString();
        if (obj.length() == 0) {
            P1 = sellerBuyerToGenerateOTPScreen.P1();
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            P1 = sellerBuyerToGenerateOTPScreen.P1();
            str = "Please enter the valid OTP";
        } else {
            if (sellerBuyerToGenerateOTPScreen.H1().isShowing()) {
                sellerBuyerToGenerateOTPScreen.H1().dismiss();
            }
            sellerBuyerToGenerateOTPScreen.H1().show();
            sellerBuyerToGenerateOTPScreen.Y1().l(sellerBuyerToGenerateOTPScreen, obj, sellerBuyerToGenerateOTPScreen.f21315p0);
            return;
        }
        sellerBuyerToGenerateOTPScreen.o2(sellerBuyerToGenerateOTPScreen, P1.b("label_log_entr_otp", str));
    }

    /* access modifiers changed from: private */
    public static final void f2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        sellerBuyerToGenerateOTPScreen.B1().setText("");
    }

    /* access modifiers changed from: private */
    public static final void f3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void g2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        String obj = q.B0(sellerBuyerToGenerateOTPScreen.A1().getText().toString()).toString();
        if (obj.length() < 10) {
            Toast.makeText(sellerBuyerToGenerateOTPScreen, "Invalid mobile number", 0).show();
            return;
        }
        sellerBuyerToGenerateOTPScreen.H1().show();
        sellerBuyerToGenerateOTPScreen.Z1().m(sellerBuyerToGenerateOTPScreen, obj, new ld.g(sellerBuyerToGenerateOTPScreen).k());
    }

    /* access modifiers changed from: private */
    public static final void h2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        if (sellerBuyerToGenerateOTPScreen.S1().isChecked()) {
            sellerBuyerToGenerateOTPScreen.S1().setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void h3(EditText editText, ImageView imageView, View view) {
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
    public static final void i2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        sellerBuyerToGenerateOTPScreen.startActivity(new Intent(sellerBuyerToGenerateOTPScreen, VahanUpdateMobileActivity.class));
        sellerBuyerToGenerateOTPScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void i3(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, TextView textView, u uVar, Context context, TextView textView2, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(uVar, "$langSession");
        cm.l.f(context, "$context");
        cm.l.f(textView2, "$resendOtp");
        sellerBuyerToGenerateOTPScreen.H1().show();
        new j(textView, uVar, context, textView2).start();
        sellerBuyerToGenerateOTPScreen.Y1().j(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.f21315p0);
    }

    /* access modifiers changed from: private */
    public static final void j2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, CompoundButton compoundButton, boolean z10) {
        AppCompatButton C1;
        float f10;
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        if (z10) {
            sellerBuyerToGenerateOTPScreen.C1().setEnabled(true);
            C1 = sellerBuyerToGenerateOTPScreen.C1();
            f10 = 1.0f;
        } else if (!z10) {
            sellerBuyerToGenerateOTPScreen.C1().setEnabled(false);
            C1 = sellerBuyerToGenerateOTPScreen.C1();
            f10 = 0.5f;
        } else {
            return;
        }
        C1.setAlpha(f10);
    }

    /* access modifiers changed from: private */
    public static final void j3(EditText editText, Context context, u uVar, SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        String b10;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(context, "$context");
        cm.l.f(uVar, "$langSession");
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            b10 = ((ld.c) uVar.f20234e).b("label_log_entr_otp", context.getString(R.string.pls_enter_otp));
        } else if (obj.length() < 6) {
            b10 = ((ld.c) uVar.f20234e).b("label_log_entr_val_otp", "Please enter the valid OTP");
        } else {
            if (sellerBuyerToGenerateOTPScreen.H1().isShowing()) {
                sellerBuyerToGenerateOTPScreen.H1().dismiss();
            }
            sellerBuyerToGenerateOTPScreen.H1().show();
            sellerBuyerToGenerateOTPScreen.Y1().l(sellerBuyerToGenerateOTPScreen, obj, sellerBuyerToGenerateOTPScreen.f21315p0);
            return;
        }
        Toast.makeText(context, b10, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void k2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        Dialog dialog = new Dialog(sellerBuyerToGenerateOTPScreen);
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
        ((ImageView) findViewById).setOnClickListener(new ch.i(dialog));
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + sellerBuyerToGenerateOTPScreen.P1().d() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void k3(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void l2(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void l3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void m2(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, View view) {
        cm.l.f(sellerBuyerToGenerateOTPScreen, "this$0");
        sellerBuyerToGenerateOTPScreen.H1().show();
        new a(sellerBuyerToGenerateOTPScreen).start();
        sellerBuyerToGenerateOTPScreen.Y1().j(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.f21315p0);
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

    public final TextView A1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("edit_mobile_number");
        return null;
    }

    public final void A2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final EditText B1() {
        EditText editText = this.f21302c0;
        if (editText != null) {
            return editText;
        }
        cm.l.v("enterOtp");
        return null;
    }

    public final void B2(AppCompatImageView appCompatImageView) {
        cm.l.f(appCompatImageView, "<set-?>");
        this.M = appCompatImageView;
    }

    public final AppCompatButton C1() {
        AppCompatButton appCompatButton = this.H;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        cm.l.v("generateOtp");
        return null;
    }

    public final void C2(RelativeLayout relativeLayout) {
        cm.l.f(relativeLayout, "<set-?>");
        this.N = relativeLayout;
    }

    public final String D1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("mobile_number");
        return null;
    }

    public final void D2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21310k0 = textView;
    }

    public final AppCompatImageView E1() {
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        cm.l.v("mvvm_back");
        return null;
    }

    public final void E2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final RelativeLayout F1() {
        RelativeLayout relativeLayout = this.N;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        cm.l.v("nexGenHolder");
        return null;
    }

    public final void F2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21315p0 = str;
    }

    public final String G1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final void G2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final ProgressDialog H1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void H2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f21312m0 = vahanProService;
    }

    public final VahanProService I1() {
        VahanProService vahanProService = this.f21312m0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("proservice");
        return null;
    }

    public final void I2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21316q0 = str;
    }

    public final String J1() {
        return this.f21317r0;
    }

    public final void J2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.W = nrvDetails;
    }

    public final NrvDetails K1() {
        NrvDetails nrvDetails = this.W;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final void K2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.f21305f0 = myTextView;
    }

    public final MyTextView L1() {
        MyTextView myTextView = this.f21305f0;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("resendOtp");
        return null;
    }

    public final void L2(AppCompatButton appCompatButton) {
        cm.l.f(appCompatButton, "<set-?>");
        this.I = appCompatButton;
    }

    public final AppCompatButton M1() {
        AppCompatButton appCompatButton = this.I;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        cm.l.v("reset");
        return null;
    }

    public final void M2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.Q = vahanServiceConnection;
    }

    public final VahanServiceConnection N1() {
        VahanServiceConnection vahanServiceConnection = this.Q;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final void N2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.V = textView;
    }

    public final HashMap O1() {
        return this.T;
    }

    public final void O2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21319t0 = cVar;
    }

    public final ld.c P1() {
        ld.c cVar = this.f21319t0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void P2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.S = gVar;
    }

    public final ImageView Q1() {
        ImageView imageView = this.f21303d0;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("shownPin");
        return null;
    }

    public final void Q2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.f21303d0 = imageView;
    }

    public final TextView R1() {
        TextView textView = this.f21307h0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("submitOtp");
        return null;
    }

    public final void R2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21307h0 = textView;
    }

    public final CheckBox S1() {
        CheckBox checkBox = this.K;
        if (checkBox != null) {
            return checkBox;
        }
        cm.l.v("term_condition");
        return null;
    }

    public final void S2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.Z = linearLayout;
    }

    public final MyTextView T1() {
        MyTextView myTextView = this.f21304e0;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("time_text");
        return null;
    }

    public final void T2(CheckBox checkBox) {
        cm.l.f(checkBox, "<set-?>");
        this.K = checkBox;
    }

    public final TextView U1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtVehicleNumber");
        return null;
    }

    public final void U2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.f21304e0 = myTextView;
    }

    public final TextView V1() {
        TextView textView = this.f21308i0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final void V2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final TextView W1() {
        TextView textView = this.f21309j0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("update_mob");
        return null;
    }

    public final void W2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21308i0 = textView;
    }

    public final VahanServiceConnection X1() {
        VahanServiceConnection vahanServiceConnection = this.f21314o0;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("verifyOtpRetrofitService");
        return null;
    }

    public final void X2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21309j0 = textView;
    }

    public final bi.j Y1() {
        bi.j jVar = this.f21313n0;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("verifyOtpViewModel");
        return null;
    }

    public final void Y2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f21306g0 = linearLayout;
    }

    public final l Z1() {
        l lVar = this.P;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void Z2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f21300a0 = linearLayout;
    }

    public final boolean a2() {
        return this.f21321v0;
    }

    public final void a3(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.f21314o0 = vahanServiceConnection;
    }

    public final void b3(bi.j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.f21313n0 = jVar;
    }

    public final void c3(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.P = lVar;
    }

    public final void d3(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f21311l0 = hVar;
    }

    public final void e3(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new ch.h(dialog));
        dialog.show();
    }

    public final void g3(Context context, String str) {
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
        imageView.setOnClickListener(new ch.c(editText, imageView));
        textView.setOnClickListener(new ch.d(this, textView3, uVar, context, textView));
        textView2.setOnClickListener(new ch.e(editText, context2, uVar, this));
        textView4.setOnClickListener(new ch.f(editText));
        imageView2.setOnClickListener(new ch.g(dialog));
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
        ((TextView) findViewById).setText(P1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P1().b("btn_ok", "OK"));
        textView.setOnClickListener(new ch.j(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        if (H1().isShowing()) {
            H1().dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView A1;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_generate_o_t_p_screen);
        z8 c10 = z8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        t2(c10);
        setContentView((View) z1().b());
        getWindow().addFlags(128);
        O2(new ld.c(this));
        View findViewById = findViewById(R.id.bottom);
        cm.l.e(findViewById, "findViewById(...)");
        u2((CoordinatorLayout) findViewById);
        View findViewById2 = findViewById(R.id.generate_otp);
        cm.l.e(findViewById2, "findViewById(...)");
        z2((AppCompatButton) findViewById2);
        View findViewById3 = findViewById(R.id.reset_button);
        cm.l.e(findViewById3, "findViewById(...)");
        L2((AppCompatButton) findViewById3);
        v9.e.f17509a.I2(this, z1(), M1(), C1());
        View findViewById4 = findViewById(R.id.txt_vehicle_number);
        cm.l.e(findViewById4, "findViewById(...)");
        V2((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.term_condition);
        cm.l.e(findViewById5, "findViewById(...)");
        T2((CheckBox) findViewById5);
        View findViewById6 = findViewById(R.id.edit_mobile_number);
        cm.l.e(findViewById6, "findViewById(...)");
        w2((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById7, "findViewById(...)");
        B2((AppCompatImageView) findViewById7);
        View findViewById8 = findViewById(R.id.nexGenHolder);
        cm.l.e(findViewById8, "findViewById(...)");
        C2((RelativeLayout) findViewById8);
        View findViewById9 = findViewById(R.id.agreeTermCond);
        cm.l.e(findViewById9, "findViewById(...)");
        s2((MyTextView) findViewById9);
        View findViewById10 = findViewById(R.id.selectedServiceTv);
        cm.l.e(findViewById10, "findViewById(...)");
        N2((TextView) findViewById10);
        View findViewById11 = findViewById(R.id.note_text);
        cm.l.e(findViewById11, "findViewById(...)");
        D2((TextView) findViewById11);
        H2(VahanProService.f21196b.b(this));
        d3((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(I1()))).a(bi.h.class));
        VahanServiceConnection.a aVar = VahanServiceConnection.f21199a;
        M2(aVar.b(this));
        a3(aVar.b(this));
        View findViewById12 = findViewById(R.id.enterMobileTv);
        cm.l.e(findViewById12, "findViewById(...)");
        x2((TextView) findViewById12);
        View findViewById13 = findViewById(R.id.termCndLl);
        cm.l.e(findViewById13, "findViewById(...)");
        S2((LinearLayout) findViewById13);
        View findViewById14 = findViewById(R.id.verifyOtpLl);
        cm.l.e(findViewById14, "findViewById(...)");
        Z2((LinearLayout) findViewById14);
        View findViewById15 = findViewById(R.id.disPlay);
        cm.l.e(findViewById15, "findViewById(...)");
        v2((TextView) findViewById15);
        View findViewById16 = findViewById(R.id.enterOtp);
        cm.l.e(findViewById16, "findViewById(...)");
        y2((EditText) findViewById16);
        View findViewById17 = findViewById(R.id.showmpin);
        cm.l.e(findViewById17, "findViewById(...)");
        Q2((ImageView) findViewById17);
        View findViewById18 = findViewById(R.id.time_text);
        cm.l.e(findViewById18, "findViewById(...)");
        U2((MyTextView) findViewById18);
        View findViewById19 = findViewById(R.id.resendOtp);
        cm.l.e(findViewById19, "findViewById(...)");
        K2((MyTextView) findViewById19);
        View findViewById20 = findViewById(R.id.verifyOtpBtn);
        cm.l.e(findViewById20, "findViewById(...)");
        Y2((LinearLayout) findViewById20);
        View findViewById21 = findViewById(R.id.submitOtp);
        cm.l.e(findViewById21, "findViewById(...)");
        R2((TextView) findViewById21);
        View findViewById22 = findViewById(R.id.txt_reset);
        cm.l.e(findViewById22, "findViewById(...)");
        W2((TextView) findViewById22);
        View findViewById23 = findViewById(R.id.update_mob);
        cm.l.e(findViewById23, "findViewById(...)");
        X2((TextView) findViewById23);
        C1().setEnabled(false);
        C1().setAlpha(0.5f);
        G2(new ProgressDialog(this));
        H1().setMessage("Please wait...");
        H1().setCancelable(false);
        H1().setCanceledOnTouchOutside(false);
        P2(new ld.g(this));
        b3((bi.j) new u0((x0) this, (u0.b) new bi.i(new wg.e(X1()))).a(bi.j.class));
        c3((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(N1()))).a(l.class));
        E2(String.valueOf(getIntent().getStringExtra("off_code")));
        r2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        q2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        J2((NrvDetails) serializableExtra);
        this.f21321v0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        A2(String.valueOf(getIntent().getStringExtra("MobNo")));
        z1().f29727o.f28308i.setText(String.valueOf(new ld.c(this).b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        HashMap hashMap = (HashMap) getIntent().getSerializableExtra("map");
        cm.l.c(hashMap);
        this.T = hashMap;
        this.f21317r0 = String.valueOf(K1().getRc_regn_no());
        String D1 = D1();
        if (D1 == null || D1.length() == 0 || p.o(D1(), "null", true)) {
            A1 = A1();
            str = "NA";
        } else {
            A1 = A1();
            str = D1();
        }
        A1.setText(str);
        String str2 = this.f21317r0;
        if (!(str2 == null || str2.length() == 0)) {
            U1().setText(this.f21317r0.toString());
        }
        E1().setOnClickListener(new ch.a(this));
        F1().setOnClickListener(new ch.l(this));
        C1().setOnClickListener(new ch.m(this));
        M1().setOnClickListener(new n(this));
        W1().setOnClickListener(new o(this));
        S1().setOnCheckedChangeListener(new p(this));
        Z1().h().g(this, new h(new e(this)));
        Z1().i().g(this, new h(new f(this)));
        Z1().g().g(this, new h(new g(this)));
        y1().setOnClickListener(new q(this));
        L1().setOnClickListener(new r(this));
        Q1().setOnClickListener(new s(this));
        Y1().i().g(this, new h(new b(this)));
        R1().setOnClickListener(new ch.b(this));
        Y1().k().g(this, new h(new c(this)));
        Z1().g().g(this, new h(new d(this)));
        V1().setOnClickListener(new k(this));
    }

    public final void q2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21323x0 = str;
    }

    public final void r2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21322w0 = str;
    }

    public final void s2(MyTextView myTextView) {
        cm.l.f(myTextView, "<set-?>");
        this.R = myTextView;
    }

    public final void t2(z8 z8Var) {
        cm.l.f(z8Var, "<set-?>");
        this.f21318s0 = z8Var;
    }

    public final void u2(CoordinatorLayout coordinatorLayout) {
        cm.l.f(coordinatorLayout, "<set-?>");
        this.G = coordinatorLayout;
    }

    public final void v2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f21301b0 = textView;
    }

    public final void w2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void x2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Y = textView;
    }

    public final MyTextView y1() {
        MyTextView myTextView = this.R;
        if (myTextView != null) {
            return myTextView;
        }
        cm.l.v("agreeTermCond");
        return null;
    }

    public final void y2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.f21302c0 = editText;
    }

    public final z8 z1() {
        z8 z8Var = this.f21318s0;
        if (z8Var != null) {
            return z8Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void z2(AppCompatButton appCompatButton) {
        cm.l.f(appCompatButton, "<set-?>");
        this.H = appCompatButton;
    }
}
