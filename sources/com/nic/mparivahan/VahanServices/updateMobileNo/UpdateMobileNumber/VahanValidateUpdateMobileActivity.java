package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber;

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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.l;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileUpdated;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.AadharrValidateForMobileRes;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.ApiMessage;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.ApiMessageX;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.UpdateRegisterResponse;
import ei.n;
import ei.o;
import ei.p;
import ei.q;
import ei.r;
import ei.s;
import ei.t;
import ei.u;
import ei.v;
import ei.w;
import ei.y;
import ei.z;
import java.io.Serializable;
import ni.x8;
import org.json.JSONObject;
import pl.x;
import t8.c;
import v9.e;

public final class VahanValidateUpdateMobileActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public x8 G;
    private boolean H;
    /* access modifiers changed from: private */
    public String I = "";
    private String J = "";
    private String K = "";
    private String L = "";
    private String M = "";
    private String N = "";
    private String O = "";
    private String P = "";
    private String Q = "";
    public fi.b R;
    public UpdateMobileUpdated S;
    /* access modifiers changed from: private */
    public ProgressDialog T;
    public bi.j U;
    public VahanServiceConnection V;
    public l W;
    public VahanServiceConnection X;
    public Dialog Y;
    public ld.c Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f21614a0;

    /* renamed from: b0  reason: collision with root package name */
    public NrvDetails f21615b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f21616c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f21617d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f21618e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f21619f0;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanValidateUpdateMobileActivity f21620e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
            super(1);
            this.f21620e = vahanValidateUpdateMobileActivity;
        }

        public final void b(String str) {
            ProgressDialog w12 = this.f21620e.T;
            ProgressDialog progressDialog = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21620e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = w13;
                }
                progressDialog.dismiss();
            }
            this.f21620e.r2(str, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanValidateUpdateMobileActivity f21621e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
            super(1);
            this.f21621e = vahanValidateUpdateMobileActivity;
        }

        public final void b(AadharrValidateForMobileRes aadharrValidateForMobileRes) {
            ProgressDialog w12 = this.f21621e.T;
            x8 x8Var = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21621e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                    w13 = null;
                }
                w13.dismiss();
            }
            ApiMessage apiMessage = aadharrValidateForMobileRes.getApiMessage();
            if (apiMessage != null && apiMessage.getStatusCode() == 200) {
                x8 v12 = this.f21621e.G;
                if (v12 == null) {
                    cm.l.v("binding");
                    v12 = null;
                }
                v12.f29371f.setFocusable(0);
                x8 v13 = this.f21621e.G;
                if (v13 == null) {
                    cm.l.v("binding");
                    v13 = null;
                }
                v13.f29378m.setFocusable(0);
                x8 v14 = this.f21621e.G;
                if (v14 == null) {
                    cm.l.v("binding");
                    v14 = null;
                }
                v14.f29367b.setFocusable(0);
                x8 v15 = this.f21621e.G;
                if (v15 == null) {
                    cm.l.v("binding");
                    v15 = null;
                }
                v15.f29373h.setVisibility(8);
                x8 v16 = this.f21621e.G;
                if (v16 == null) {
                    cm.l.v("binding");
                    v16 = null;
                }
                v16.f29372g.setVisibility(8);
                x8 v17 = this.f21621e.G;
                if (v17 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var = v17;
                }
                x8Var.f29379n.setVisibility(0);
                this.f21621e.z1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AadharrValidateForMobileRes) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanValidateUpdateMobileActivity f21622e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
            super(1);
            this.f21622e = vahanValidateUpdateMobileActivity;
        }

        public final void b(String str) {
            ProgressDialog w12 = this.f21622e.T;
            ProgressDialog progressDialog = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21622e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = w13;
                }
                progressDialog.dismiss();
            }
            this.f21622e.r2(str, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanValidateUpdateMobileActivity f21623e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
            super(1);
            this.f21623e = vahanValidateUpdateMobileActivity;
        }

        public final void b(SendOtpResult sendOtpResult) {
            Toast makeText;
            try {
                ProgressDialog w12 = this.f21623e.T;
                x8 x8Var = null;
                if (w12 == null) {
                    cm.l.v("dialog");
                    w12 = null;
                }
                w12.dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = this.f21623e;
                    x8 v12 = vahanValidateUpdateMobileActivity.G;
                    if (v12 == null) {
                        cm.l.v("binding");
                    } else {
                        x8Var = v12;
                    }
                    vahanValidateUpdateMobileActivity.x2(vahanValidateUpdateMobileActivity, String.valueOf(x8Var.f29372g.getText()));
                    this.f21623e.h2(String.valueOf(sendOtpResult.getRecordId()));
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = this.f21623e;
                    vahanValidateUpdateMobileActivity2.i2(vahanValidateUpdateMobileActivity2.I);
                    return;
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL022", true)) {
                    makeText = Toast.makeText(this.f21623e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL014", true)) {
                    makeText = Toast.makeText(this.f21623e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    makeText = Toast.makeText(this.f21623e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1);
                } else {
                    Toast.makeText(this.f21623e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    x xVar = x.f30437a;
                    return;
                }
                makeText.show();
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(this.f21623e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanValidateUpdateMobileActivity f21624e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
            super(1);
            this.f21624e = vahanValidateUpdateMobileActivity;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            ProgressDialog progressDialog = null;
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ProgressDialog w12 = this.f21624e.T;
                    if (w12 == null) {
                        cm.l.v("dialog");
                        w12 = null;
                    }
                    if (w12.isShowing()) {
                        ProgressDialog w13 = this.f21624e.T;
                        if (w13 == null) {
                            cm.l.v("dialog");
                            w13 = null;
                        }
                        w13.dismiss();
                    }
                    if (this.f21624e.D1().isShowing()) {
                        this.f21624e.D1().dismiss();
                    }
                    this.f21624e.z1();
                    return;
                }
                ProgressDialog w14 = this.f21624e.T;
                if (w14 == null) {
                    cm.l.v("dialog");
                    w14 = null;
                }
                if (w14.isShowing()) {
                    ProgressDialog w15 = this.f21624e.T;
                    if (w15 == null) {
                        cm.l.v("dialog");
                        w15 = null;
                    }
                    w15.dismiss();
                }
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = this.f21624e;
                vahanValidateUpdateMobileActivity.Z1(vahanValidateUpdateMobileActivity, otpVerifyResult.getStatusDesc());
            } catch (Exception unused) {
                ProgressDialog w16 = this.f21624e.T;
                if (w16 == null) {
                    cm.l.v("dialog");
                    w16 = null;
                }
                if (w16.isShowing()) {
                    ProgressDialog w17 = this.f21624e.T;
                    if (w17 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = w17;
                    }
                    progressDialog.dismiss();
                }
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = this.f21624e;
                vahanValidateUpdateMobileActivity2.Z1(vahanValidateUpdateMobileActivity2, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanValidateUpdateMobileActivity f21625e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
            super(1);
            this.f21625e = vahanValidateUpdateMobileActivity;
        }

        public final void b(ResendOtp resendOtp) {
            VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity;
            ProgressDialog progressDialog = null;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    ProgressDialog w12 = this.f21625e.T;
                    if (w12 == null) {
                        cm.l.v("dialog");
                        w12 = null;
                    }
                    w12.dismiss();
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = this.f21625e;
                    vahanValidateUpdateMobileActivity2.Z1(vahanValidateUpdateMobileActivity2, "We have resent the OTP to your Mobile Number");
                    return;
                }
                if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    vahanValidateUpdateMobileActivity = this.f21625e;
                } else {
                    ProgressDialog w13 = this.f21625e.T;
                    if (w13 == null) {
                        cm.l.v("dialog");
                        w13 = null;
                    }
                    w13.dismiss();
                    vahanValidateUpdateMobileActivity = this.f21625e;
                }
                vahanValidateUpdateMobileActivity.Z1(vahanValidateUpdateMobileActivity, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                ProgressDialog w14 = this.f21625e.T;
                if (w14 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = w14;
                }
                progressDialog.dismiss();
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity3 = this.f21625e;
                vahanValidateUpdateMobileActivity3.Z1(vahanValidateUpdateMobileActivity3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanValidateUpdateMobileActivity f21626e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
            super(1);
            this.f21626e = vahanValidateUpdateMobileActivity;
        }

        public final void b(UpdateRegisterResponse updateRegisterResponse) {
            ProgressDialog w12 = this.f21626e.T;
            String str = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21626e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                    w13 = null;
                }
                w13.dismiss();
            }
            ApiMessageX apiMessage = updateRegisterResponse.getApiMessage();
            if (apiMessage != null && apiMessage.getStatusCode() == 200) {
                if (this.f21626e.X1()) {
                    Intent intent = new Intent(this.f21626e, VahanCommonConfirmationScreen.class);
                    intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.UPDATE_MOBILE_CODE);
                    intent.putExtra(VContant.UPDATE_MOBILE_CODE, updateRegisterResponse.getData());
                    Data data = updateRegisterResponse.getData();
                    if (data != null) {
                        str = data.getApplNo();
                    }
                    intent.putExtra(VContant.APP_NO, str);
                    intent.putExtra("state_code", this.f21626e.I1().getState_cd());
                    intent.putExtra("rc_number", this.f21626e.H1());
                    intent.putExtra(VContant.PURPOSE_CODE, VContant.UPDATE_MOBILE_PURPOSE_CODE);
                    intent.putExtra("off_code", this.f21626e.G1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21626e.X1());
                    intent.putExtra("RC", this.f21626e.H1());
                    intent.putExtra("RcDetails", this.f21626e.I1());
                    intent.putExtra(VContant.NEXGEN_addahar_name, this.f21626e.C1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, this.f21626e.B1());
                    this.f21626e.startActivity(intent);
                    this.f21626e.finish();
                    return;
                }
                this.f21626e.r2(updateRegisterResponse.getApiMessage().getDeveloperMessage(), 1);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateRegisterResponse) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21627a;

        h(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21627a = lVar;
        }

        public final pl.c a() {
            return this.f21627a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21627a.invoke(obj);
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
        final /* synthetic */ TextView f21628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21629b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21628a = textView;
            this.f21629b = textView2;
        }

        public void onFinish() {
            this.f21629b.setVisibility(0);
            this.f21628a.setText("0");
            this.f21628a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21628a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21629b.setVisibility(8);
            this.f21628a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21631b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21630a = textView;
            this.f21631b = textView2;
        }

        public void onFinish() {
            this.f21631b.setVisibility(0);
            this.f21630a.setText("0");
            this.f21630a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21630a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21631b.setVisibility(8);
            this.f21630a.setVisibility(0);
        }
    }

    private final void A1(String str) {
        try {
            ProgressDialog progressDialog = this.T;
            x8 x8Var = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.T;
                if (progressDialog2 == null) {
                    cm.l.v("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.T;
            if (progressDialog3 == null) {
                cm.l.v("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            JSONObject jSONObject = new JSONObject();
            x8 x8Var2 = this.G;
            if (x8Var2 == null) {
                cm.l.v("binding");
                x8Var2 = null;
            }
            jSONObject.put("aadharNo", (Object) String.valueOf(x8Var2.f29367b.getText()));
            jSONObject.put("mobileNo", (Object) str);
            jSONObject.put("regnNo", (Object) this.I);
            jSONObject.put("stateCode", (Object) this.J);
            x8 x8Var3 = this.G;
            if (x8Var3 == null) {
                cm.l.v("binding");
            } else {
                x8Var = x8Var3;
            }
            jSONObject.put("nameAsAadhae", (Object) String.valueOf(x8Var.f29378m.getText()));
            jSONObject.put("officeCode", (Object) G1());
            jSONObject.put("purposeCode", (Object) VContant.UPDATE_MOBILE_PURPOSE_CODE);
            N1().o(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(EditText editText, VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        String str;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            str = "Please enter the valid OTP";
        } else {
            ProgressDialog progressDialog = vahanValidateUpdateMobileActivity.T;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = vahanValidateUpdateMobileActivity.T;
                if (progressDialog3 == null) {
                    cm.l.v("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
            }
            ProgressDialog progressDialog4 = vahanValidateUpdateMobileActivity.T;
            if (progressDialog4 == null) {
                cm.l.v("dialog");
            } else {
                progressDialog2 = progressDialog4;
            }
            progressDialog2.show();
            vahanValidateUpdateMobileActivity.M1().l(vahanValidateUpdateMobileActivity, obj, vahanValidateUpdateMobileActivity.P);
            return;
        }
        Toast.makeText(vahanValidateUpdateMobileActivity, str, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void B2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void C2(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        vahanValidateUpdateMobileActivity.D1().dismiss();
    }

    private final void E1() {
        if (getIntent() != null) {
            this.H = getIntent().getBooleanExtra("isAadharEnable", false);
            if (getIntent().hasExtra("regNo")) {
                String stringExtra = getIntent().getStringExtra("regNo");
                cm.l.c(stringExtra);
                this.I = stringExtra;
                x8 x8Var = this.G;
                if (x8Var == null) {
                    cm.l.v("binding");
                    x8Var = null;
                }
                MyTextView myTextView = x8Var.f29384s;
                myTextView.setText(F1().b("vehicle_no", "Vehicle No.:") + ' ' + this.I);
            }
            if (getIntent().hasExtra("stateCd")) {
                String stringExtra2 = getIntent().getStringExtra("stateCd");
                cm.l.c(stringExtra2);
                this.J = stringExtra2;
            }
            if (getIntent().hasExtra("stateName")) {
                String stringExtra3 = getIntent().getStringExtra("stateName");
                cm.l.c(stringExtra3);
                this.K = stringExtra3;
            }
            if (getIntent().hasExtra("ownerName")) {
                String stringExtra4 = getIntent().getStringExtra("ownerName");
                cm.l.c(stringExtra4);
                this.L = stringExtra4;
            }
            if (getIntent().hasExtra("mobileNo")) {
                String stringExtra5 = getIntent().getStringExtra("mobileNo");
                cm.l.c(stringExtra5);
                this.M = stringExtra5;
            }
            if (getIntent().hasExtra("aadharNo")) {
                String stringExtra6 = getIntent().getStringExtra("aadharNo");
                cm.l.c(stringExtra6);
                this.N = stringExtra6;
            }
            if (getIntent().hasExtra("emailId")) {
                String stringExtra7 = getIntent().getStringExtra("emailId");
                cm.l.c(stringExtra7);
                this.O = stringExtra7;
            }
            e2();
        }
    }

    private final void P1() {
        AppCompatButton appCompatButton;
        String str;
        O1().i().g(this, new h(new d(this)));
        M1().k().g(this, new h(new e(this)));
        M1().i().g(this, new h(new f(this)));
        x8 x8Var = this.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        x8Var.f29369d.setOnClickListener(new ei.l(this));
        p2((fi.b) new u0((x0) this, (u0.b) new bi.d(new fi.a(J1()))).a(fi.b.class));
        x8 x8Var3 = this.G;
        if (x8Var3 == null) {
            cm.l.v("binding");
            x8Var3 = null;
        }
        x8Var3.f29381p.f28305f.setOnClickListener(new r(this));
        x8 x8Var4 = this.G;
        if (x8Var4 == null) {
            cm.l.v("binding");
            x8Var4 = null;
        }
        x8Var4.f29381p.f28306g.setOnClickListener(new s(this));
        x8 x8Var5 = this.G;
        if (x8Var5 == null) {
            cm.l.v("binding");
            x8Var5 = null;
        }
        x8Var5.f29370e.setOnClickListener(new t(this));
        x8 x8Var6 = this.G;
        if (x8Var6 == null) {
            cm.l.v("binding");
            x8Var6 = null;
        }
        x8Var6.f29368c.setVisibility(8);
        x8 x8Var7 = this.G;
        if (x8Var7 == null) {
            cm.l.v("binding");
            x8Var7 = null;
        }
        x8Var7.f29367b.setVisibility(8);
        if (this.H) {
            x8 x8Var8 = this.G;
            if (x8Var8 == null) {
                cm.l.v("binding");
                x8Var8 = null;
            }
            x8Var8.f29368c.setVisibility(0);
            x8 x8Var9 = this.G;
            if (x8Var9 == null) {
                cm.l.v("binding");
                x8Var9 = null;
            }
            x8Var9.f29367b.setVisibility(0);
            x8 x8Var10 = this.G;
            if (x8Var10 == null) {
                cm.l.v("binding");
                x8Var10 = null;
            }
            x8Var10.f29373h.setVisibility(8);
            x8 x8Var11 = this.G;
            if (x8Var11 == null) {
                cm.l.v("binding");
                x8Var11 = null;
            }
            x8Var11.f29372g.setVisibility(8);
            x8 x8Var12 = this.G;
            if (x8Var12 == null) {
                cm.l.v("binding");
                x8Var12 = null;
            }
            x8Var12.f29379n.setVisibility(0);
            x8 x8Var13 = this.G;
            if (x8Var13 == null) {
                cm.l.v("binding");
                x8Var13 = null;
            }
            x8Var13.f29375j.setVisibility(8);
            x8 x8Var14 = this.G;
            if (x8Var14 == null) {
                cm.l.v("binding");
                x8Var14 = null;
            }
            x8Var14.f29374i.setVisibility(8);
            x8 x8Var15 = this.G;
            if (x8Var15 == null) {
                cm.l.v("binding");
                x8Var15 = null;
            }
            appCompatButton = x8Var15.f29383r;
            str = "Validate with Aadhaar";
        } else {
            x8 x8Var16 = this.G;
            if (x8Var16 == null) {
                cm.l.v("binding");
                x8Var16 = null;
            }
            x8Var16.f29371f.setFocusable(0);
            x8 x8Var17 = this.G;
            if (x8Var17 == null) {
                cm.l.v("binding");
                x8Var17 = null;
            }
            x8Var17.f29378m.setFocusable(0);
            x8 x8Var18 = this.G;
            if (x8Var18 == null) {
                cm.l.v("binding");
                x8Var18 = null;
            }
            x8Var18.f29368c.setVisibility(8);
            x8 x8Var19 = this.G;
            if (x8Var19 == null) {
                cm.l.v("binding");
                x8Var19 = null;
            }
            x8Var19.f29367b.setVisibility(8);
            x8 x8Var20 = this.G;
            if (x8Var20 == null) {
                cm.l.v("binding");
                x8Var20 = null;
            }
            x8Var20.f29373h.setVisibility(0);
            x8 x8Var21 = this.G;
            if (x8Var21 == null) {
                cm.l.v("binding");
                x8Var21 = null;
            }
            x8Var21.f29372g.setVisibility(0);
            x8 x8Var22 = this.G;
            if (x8Var22 == null) {
                cm.l.v("binding");
                x8Var22 = null;
            }
            x8Var22.f29379n.setVisibility(0);
            x8 x8Var23 = this.G;
            if (x8Var23 == null) {
                cm.l.v("binding");
                x8Var23 = null;
            }
            x8Var23.f29376k.setText("Owner Name (As per Vahan)");
            x8 x8Var24 = this.G;
            if (x8Var24 == null) {
                cm.l.v("binding");
                x8Var24 = null;
            }
            x8Var24.f29376k.setText(F1().b("label_dl_ownername_as_aadhaar", "Owner Name (As per Vahan)"));
            x8 x8Var25 = this.G;
            if (x8Var25 == null) {
                cm.l.v("binding");
                x8Var25 = null;
            }
            x8Var25.f29377l.setText(F1().b("lbl_owner_Mobile_no_as_per_Aadhaar", "Existing Mobile No (As per Vahan)"));
            x8 x8Var26 = this.G;
            if (x8Var26 == null) {
                cm.l.v("binding");
                x8Var26 = null;
            }
            x8Var26.f29375j.setVisibility(0);
            x8 x8Var27 = this.G;
            if (x8Var27 == null) {
                cm.l.v("binding");
                x8Var27 = null;
            }
            x8Var27.f29374i.setVisibility(0);
            x8 x8Var28 = this.G;
            if (x8Var28 == null) {
                cm.l.v("binding");
                x8Var28 = null;
            }
            appCompatButton = x8Var28.f29383r;
            str = "Update Mobile No.";
        }
        appCompatButton.setText(str);
        x8 x8Var29 = this.G;
        if (x8Var29 == null) {
            cm.l.v("binding");
            x8Var29 = null;
        }
        x8Var29.f29383r.setOnClickListener(new u(this));
        N1().j().g(this, new h(new g(this)));
        N1().i().g(this, new h(new a(this)));
        N1().m().g(this, new h(new b(this)));
        N1().l().g(this, new h(new c(this)));
        x8 x8Var30 = this.G;
        if (x8Var30 == null) {
            cm.l.v("binding");
        } else {
            x8Var2 = x8Var30;
        }
        x8Var2.f29379n.setOnClickListener(new v(this));
    }

    /* access modifiers changed from: private */
    public static final void Q1(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        Dialog dialog = new Dialog(vahanValidateUpdateMobileActivity);
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
        ((ImageView) findViewById).setOnClickListener(new o(dialog));
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + vahanValidateUpdateMobileActivity.F1().d() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void R1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void S1(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        vahanValidateUpdateMobileActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void T1(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        vahanValidateUpdateMobileActivity.Y1();
    }

    /* access modifiers changed from: private */
    public static final void U1(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        vahanValidateUpdateMobileActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void V1(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        x8 x8Var = vahanValidateUpdateMobileActivity.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        if (cm.l.a(x8Var.f29383r.getText().toString(), "Validate with Aadhaar")) {
            if (vahanValidateUpdateMobileActivity.u2()) {
                x8 x8Var3 = vahanValidateUpdateMobileActivity.G;
                if (x8Var3 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var2 = x8Var3;
                }
                String valueOf = String.valueOf(x8Var2.f29371f.getText());
                vahanValidateUpdateMobileActivity.M = valueOf;
                vahanValidateUpdateMobileActivity.A1(valueOf);
            }
        } else if (vahanValidateUpdateMobileActivity.H) {
            if (vahanValidateUpdateMobileActivity.w2()) {
                vahanValidateUpdateMobileActivity.z1();
            }
        } else if (vahanValidateUpdateMobileActivity.v2()) {
            ProgressDialog progressDialog = vahanValidateUpdateMobileActivity.T;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            ld.g gVar = new ld.g(vahanValidateUpdateMobileActivity);
            x8 x8Var4 = vahanValidateUpdateMobileActivity.G;
            if (x8Var4 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var4;
            }
            vahanValidateUpdateMobileActivity.O1().m(vahanValidateUpdateMobileActivity, String.valueOf(x8Var2.f29372g.getText()), gVar.k());
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        x8 x8Var = vahanValidateUpdateMobileActivity.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        CheckBox checkBox = x8Var.f29380o;
        x8 x8Var3 = vahanValidateUpdateMobileActivity.G;
        if (x8Var3 == null) {
            cm.l.v("binding");
        } else {
            x8Var2 = x8Var3;
        }
        checkBox.setChecked(!x8Var2.f29380o.isChecked());
    }

    private final void Y1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void a2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void e2() {
        if (!this.H) {
            x8 x8Var = this.G;
            x8 x8Var2 = null;
            if (x8Var == null) {
                cm.l.v("binding");
                x8Var = null;
            }
            x8Var.f29378m.setText(this.L);
            x8 x8Var3 = this.G;
            if (x8Var3 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var3;
            }
            x8Var2.f29371f.setText(this.M);
        }
        new ld.c(this);
    }

    /* access modifiers changed from: private */
    public final void r2(String str, int i10) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new p(dialog, i10, this));
        textView2.setOnClickListener(new q(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void s2(Dialog dialog, int i10, VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        dialog.dismiss();
        if (i10 == 1) {
            vahanValidateUpdateMobileActivity.Y1();
        }
    }

    /* access modifiers changed from: private */
    public static final void t2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean u2() {
        x8 x8Var = this.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        if (String.valueOf(x8Var.f29367b.getText()).length() == 0) {
            x8 x8Var3 = this.G;
            if (x8Var3 == null) {
                cm.l.v("binding");
                x8Var3 = null;
            }
            x8Var3.f29367b.setError(getString(R.string.enter_aadhar_no));
            x8 x8Var4 = this.G;
            if (x8Var4 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var4;
            }
            x8Var2.f29367b.requestFocus();
            return false;
        }
        x8 x8Var5 = this.G;
        if (x8Var5 == null) {
            cm.l.v("binding");
            x8Var5 = null;
        }
        if (String.valueOf(x8Var5.f29378m.getText()).length() == 0) {
            x8 x8Var6 = this.G;
            if (x8Var6 == null) {
                cm.l.v("binding");
                x8Var6 = null;
            }
            x8Var6.f29378m.setError(getString(R.string.enter_owner_name));
            x8 x8Var7 = this.G;
            if (x8Var7 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var7;
            }
            x8Var2.f29378m.requestFocus();
            return false;
        }
        x8 x8Var8 = this.G;
        if (x8Var8 == null) {
            cm.l.v("binding");
            x8Var8 = null;
        }
        if (String.valueOf(x8Var8.f29371f.getText()).length() == 0) {
            x8 x8Var9 = this.G;
            if (x8Var9 == null) {
                cm.l.v("binding");
                x8Var9 = null;
            }
            x8Var9.f29371f.setError("Please enter the mobile no");
            x8 x8Var10 = this.G;
            if (x8Var10 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var10;
            }
            x8Var2.f29371f.requestFocus();
            return false;
        }
        x8 x8Var11 = this.G;
        if (x8Var11 == null) {
            cm.l.v("binding");
        } else {
            x8Var2 = x8Var11;
        }
        if (x8Var2.f29380o.isChecked()) {
            return true;
        }
        Toast.makeText(this, "Please accept term & Condition", 0).show();
        return false;
    }

    private final boolean v2() {
        x8 x8Var = this.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        if (String.valueOf(x8Var.f29378m.getText()).length() == 0) {
            x8 x8Var3 = this.G;
            if (x8Var3 == null) {
                cm.l.v("binding");
                x8Var3 = null;
            }
            x8Var3.f29378m.setError(getString(R.string.enter_owner_name));
            x8 x8Var4 = this.G;
            if (x8Var4 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var4;
            }
            x8Var2.f29378m.requestFocus();
            return false;
        }
        x8 x8Var5 = this.G;
        if (x8Var5 == null) {
            cm.l.v("binding");
            x8Var5 = null;
        }
        if (String.valueOf(x8Var5.f29372g.getText()).length() == 0) {
            x8 x8Var6 = this.G;
            if (x8Var6 == null) {
                cm.l.v("binding");
                x8Var6 = null;
            }
            x8Var6.f29372g.setError(getString(R.string.enter_mobile_no));
            x8 x8Var7 = this.G;
            if (x8Var7 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var7;
            }
            x8Var2.f29372g.requestFocus();
            return false;
        }
        c.a aVar = t8.c.f16582a;
        x8 x8Var8 = this.G;
        if (x8Var8 == null) {
            cm.l.v("binding");
            x8Var8 = null;
        }
        if (!aVar.q(String.valueOf(x8Var8.f29372g.getText()))) {
            x8 x8Var9 = this.G;
            if (x8Var9 == null) {
                cm.l.v("binding");
                x8Var9 = null;
            }
            x8Var9.f29372g.setError(getString(R.string.enter_mobile_no));
            x8 x8Var10 = this.G;
            if (x8Var10 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var10;
            }
            x8Var2.f29372g.requestFocus();
            return false;
        }
        x8 x8Var11 = this.G;
        if (x8Var11 == null) {
            cm.l.v("binding");
        } else {
            x8Var2 = x8Var11;
        }
        if (x8Var2.f29380o.isChecked()) {
            return true;
        }
        Toast.makeText(this, "Please accept term & Condition", 0).show();
        return false;
    }

    private final boolean w2() {
        x8 x8Var = this.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        if (String.valueOf(x8Var.f29371f.getText()).length() == 0) {
            x8 x8Var3 = this.G;
            if (x8Var3 == null) {
                cm.l.v("binding");
                x8Var3 = null;
            }
            x8Var3.f29372g.setError(getString(R.string.enter_mobile_no));
            x8 x8Var4 = this.G;
            if (x8Var4 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var4;
            }
            x8Var2.f29372g.requestFocus();
            return false;
        }
        x8 x8Var5 = this.G;
        if (x8Var5 == null) {
            cm.l.v("binding");
        } else {
            x8Var2 = x8Var5;
        }
        if (x8Var2.f29380o.isChecked()) {
            return true;
        }
        Toast.makeText(this, "Please accept term & Condition", 0).show();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void y2(EditText editText, ImageView imageView, View view) {
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
    public final void z1() {
        String valueOf;
        try {
            ProgressDialog progressDialog = this.T;
            x8 x8Var = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.T;
                if (progressDialog2 == null) {
                    cm.l.v("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.T;
            if (progressDialog3 == null) {
                cm.l.v("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", (Object) "");
            if (this.H) {
                jSONObject.put("authMode", (Object) "A");
                x8 x8Var2 = this.G;
                if (x8Var2 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var = x8Var2;
                }
                valueOf = String.valueOf(x8Var.f29371f.getText());
            } else {
                jSONObject.put("authMode", (Object) "M");
                x8 x8Var3 = this.G;
                if (x8Var3 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var = x8Var3;
                }
                valueOf = String.valueOf(x8Var.f29372g.getText());
            }
            jSONObject.put("mobileNo", (Object) valueOf);
            jSONObject.put("regnNo", (Object) this.I);
            jSONObject.put("stateCode", (Object) this.J);
            jSONObject.put("officeCode", (Object) G1());
            jSONObject.put("purposeCode", (Object) VContant.UPDATE_MOBILE_PURPOSE_CODE);
            jSONObject.put("openDate", (Object) com.nic.mparivahan.dlservices.utilities.d.b());
            N1().n(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity, TextView textView, TextView textView2, View view) {
        cm.l.f(vahanValidateUpdateMobileActivity, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        ProgressDialog progressDialog = vahanValidateUpdateMobileActivity.T;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        new j(textView, textView2).start();
        vahanValidateUpdateMobileActivity.M1().j(vahanValidateUpdateMobileActivity, vahanValidateUpdateMobileActivity.P);
    }

    public final String B1() {
        String str = this.f21618e0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String C1() {
        String str = this.f21617d0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final Dialog D1() {
        Dialog dialog = this.Y;
        if (dialog != null) {
            return dialog;
        }
        cm.l.v("d");
        return null;
    }

    public final ld.c F1() {
        ld.c cVar = this.Z;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final String G1() {
        String str = this.f21616c0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final String H1() {
        String str = this.f21614a0;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails I1() {
        NrvDetails nrvDetails = this.f21615b0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final UpdateMobileUpdated J1() {
        UpdateMobileUpdated updateMobileUpdated = this.S;
        if (updateMobileUpdated != null) {
            return updateMobileUpdated;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanServiceConnection K1() {
        VahanServiceConnection vahanServiceConnection = this.X;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService1");
        return null;
    }

    public final VahanServiceConnection L1() {
        VahanServiceConnection vahanServiceConnection = this.V;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("verifyOtpRetrofitService");
        return null;
    }

    public final bi.j M1() {
        bi.j jVar = this.U;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("verifyOtpViewModel");
        return null;
    }

    public final fi.b N1() {
        fi.b bVar = this.R;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final l O1() {
        l lVar = this.W;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel1");
        return null;
    }

    public final boolean X1() {
        return this.f21619f0;
    }

    public final void Z1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new w(dialog));
        dialog.show();
    }

    public final void b2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21618e0 = str;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21617d0 = str;
    }

    public final void d2(Dialog dialog) {
        cm.l.f(dialog, "<set-?>");
        this.Y = dialog;
    }

    public final void f2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Z = cVar;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21616c0 = str;
    }

    public final void h2(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void i2(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void j2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21614a0 = str;
    }

    public final void k2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f21615b0 = nrvDetails;
    }

    public final void l2(UpdateMobileUpdated updateMobileUpdated) {
        cm.l.f(updateMobileUpdated, "<set-?>");
        this.S = updateMobileUpdated;
    }

    public final void m2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.X = vahanServiceConnection;
    }

    public final void n2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.V = vahanServiceConnection;
    }

    public final void o2(bi.j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.U = jVar;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, F1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_confirm_update_mobile);
        x8 c10 = x8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        ProgressDialog progressDialog = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        x8 x8Var = this.G;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        aVar.w2(this, x8Var);
        x8 x8Var2 = this.G;
        if (x8Var2 == null) {
            cm.l.v("binding");
            x8Var2 = null;
        }
        x8Var2.f29381p.f28308i.setText(getString(R.string.update_mobile_no));
        f2(new ld.c(this));
        g2(String.valueOf(getIntent().getStringExtra("off_code")));
        this.f21619f0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        c2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        b2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        j2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        k2((NrvDetails) serializableExtra);
        d2(new Dialog(this));
        l2(UpdateMobileUpdated.f21193a.b(this));
        VahanServiceConnection.a aVar2 = VahanServiceConnection.f21199a;
        m2(aVar2.b(this));
        n2(aVar2.b(this));
        o2((bi.j) new u0((x0) this, (u0.b) new bi.i(new wg.e(L1()))).a(bi.j.class));
        q2((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(K1()))).a(l.class));
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.T = progressDialog2;
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.T;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.T;
        if (progressDialog4 == null) {
            cm.l.v("dialog");
        } else {
            progressDialog = progressDialog4;
        }
        progressDialog.setMessage("Please wait...");
        E1();
        P1();
    }

    public final void p2(fi.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.R = bVar;
    }

    public final void q2(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.W = lVar;
    }

    public final void x2(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        D1().setContentView(R.layout.validateotp);
        D1().setCanceledOnTouchOutside(false);
        D1().setCancelable(false);
        Window window = D1().getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = D1().findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = D1().findViewById(R.id.resendOtp);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = D1().findViewById(R.id.showmpin);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) findViewById3;
        View findViewById4 = D1().findViewById(R.id.submitOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = D1().findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = D1().findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById6;
        View findViewById7 = D1().findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = D1().findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById8;
        int length = str.length();
        String str2 = "";
        for (int i10 = 0; i10 < length; i10++) {
            str.charAt(i10);
            str2 = new km.f("\\d(?=\\d{4})").b(new km.f("[^0-9]").b(str, ""), "X");
        }
        textView5.setText("OTP has been sent to your mobile \n+91 " + str2);
        new i(textView3, textView).start();
        imageView2.setOnClickListener(new ei.x(editText, imageView2));
        textView.setOnClickListener(new y(this, textView3, textView));
        textView2.setOnClickListener(new z(editText, this));
        textView4.setOnClickListener(new ei.m(editText));
        imageView.setOnClickListener(new n(this));
        D1().show();
    }
}
