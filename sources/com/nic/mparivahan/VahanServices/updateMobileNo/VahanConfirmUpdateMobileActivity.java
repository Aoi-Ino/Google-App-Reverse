package com.nic.mparivahan.VahanServices.updateMobileNo;

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
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileNoService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import di.k;
import di.n;
import di.o;
import di.p;
import ni.x8;
import org.json.JSONObject;
import pl.x;
import t8.c;
import v9.e;

public final class VahanConfirmUpdateMobileActivity extends androidx.appcompat.app.d {
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
    public di.a R;
    public UpdateMobileNoService S;
    /* access modifiers changed from: private */
    public ProgressDialog T;
    public bi.j U;
    public VahanServiceConnection V;
    public l W;
    public VahanServiceConnection X;
    public Dialog Y;
    public ld.c Z;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanConfirmUpdateMobileActivity f21632e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
            super(1);
            this.f21632e = vahanConfirmUpdateMobileActivity;
        }

        public final void b(String str) {
            ProgressDialog w12 = this.f21632e.T;
            ProgressDialog progressDialog = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21632e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = w13;
                }
                progressDialog.dismiss();
            }
            this.f21632e.g2(str, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanConfirmUpdateMobileActivity f21633e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
            super(1);
            this.f21633e = vahanConfirmUpdateMobileActivity;
        }

        public final void b(Boolean bool) {
            ProgressDialog w12 = this.f21633e.T;
            x8 x8Var = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21633e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                    w13 = null;
                }
                w13.dismiss();
            }
            cm.l.c(bool);
            if (bool.booleanValue()) {
                x8 v12 = this.f21633e.G;
                if (v12 == null) {
                    cm.l.v("binding");
                    v12 = null;
                }
                v12.f29371f.setFocusable(0);
                x8 v13 = this.f21633e.G;
                if (v13 == null) {
                    cm.l.v("binding");
                    v13 = null;
                }
                v13.f29378m.setFocusable(0);
                x8 v14 = this.f21633e.G;
                if (v14 == null) {
                    cm.l.v("binding");
                    v14 = null;
                }
                v14.f29367b.setFocusable(0);
                x8 v15 = this.f21633e.G;
                if (v15 == null) {
                    cm.l.v("binding");
                    v15 = null;
                }
                v15.f29373h.setVisibility(8);
                x8 v16 = this.f21633e.G;
                if (v16 == null) {
                    cm.l.v("binding");
                    v16 = null;
                }
                v16.f29372g.setVisibility(8);
                x8 v17 = this.f21633e.G;
                if (v17 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var = v17;
                }
                x8Var.f29379n.setVisibility(0);
                this.f21633e.z1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Boolean) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanConfirmUpdateMobileActivity f21634e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
            super(1);
            this.f21634e = vahanConfirmUpdateMobileActivity;
        }

        public final void b(String str) {
            ProgressDialog w12 = this.f21634e.T;
            ProgressDialog progressDialog = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21634e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = w13;
                }
                progressDialog.dismiss();
            }
            this.f21634e.g2(str, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanConfirmUpdateMobileActivity f21635e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
            super(1);
            this.f21635e = vahanConfirmUpdateMobileActivity;
        }

        public final void b(SendOtpResult sendOtpResult) {
            Toast makeText;
            try {
                ProgressDialog w12 = this.f21635e.T;
                x8 x8Var = null;
                if (w12 == null) {
                    cm.l.v("dialog");
                    w12 = null;
                }
                w12.dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity = this.f21635e;
                    x8 v12 = vahanConfirmUpdateMobileActivity.G;
                    if (v12 == null) {
                        cm.l.v("binding");
                    } else {
                        x8Var = v12;
                    }
                    vahanConfirmUpdateMobileActivity.m2(vahanConfirmUpdateMobileActivity, String.valueOf(x8Var.f29372g.getText()));
                    this.f21635e.Y1(String.valueOf(sendOtpResult.getRecordId()));
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity2 = this.f21635e;
                    vahanConfirmUpdateMobileActivity2.Z1(vahanConfirmUpdateMobileActivity2.I);
                    return;
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL022", true)) {
                    makeText = Toast.makeText(this.f21635e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL014", true)) {
                    makeText = Toast.makeText(this.f21635e.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1);
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    makeText = Toast.makeText(this.f21635e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1);
                } else {
                    Toast.makeText(this.f21635e.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    x xVar = x.f30437a;
                    return;
                }
                makeText.show();
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(this.f21635e.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanConfirmUpdateMobileActivity f21636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
            super(1);
            this.f21636e = vahanConfirmUpdateMobileActivity;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            ProgressDialog progressDialog = null;
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ProgressDialog w12 = this.f21636e.T;
                    if (w12 == null) {
                        cm.l.v("dialog");
                        w12 = null;
                    }
                    if (w12.isShowing()) {
                        ProgressDialog w13 = this.f21636e.T;
                        if (w13 == null) {
                            cm.l.v("dialog");
                            w13 = null;
                        }
                        w13.dismiss();
                    }
                    if (this.f21636e.B1().isShowing()) {
                        this.f21636e.B1().dismiss();
                    }
                    this.f21636e.z1();
                    return;
                }
                ProgressDialog w14 = this.f21636e.T;
                if (w14 == null) {
                    cm.l.v("dialog");
                    w14 = null;
                }
                if (w14.isShowing()) {
                    ProgressDialog w15 = this.f21636e.T;
                    if (w15 == null) {
                        cm.l.v("dialog");
                        w15 = null;
                    }
                    w15.dismiss();
                }
                VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity = this.f21636e;
                vahanConfirmUpdateMobileActivity.T1(vahanConfirmUpdateMobileActivity, otpVerifyResult.getStatusDesc());
            } catch (Exception unused) {
                ProgressDialog w16 = this.f21636e.T;
                if (w16 == null) {
                    cm.l.v("dialog");
                    w16 = null;
                }
                if (w16.isShowing()) {
                    ProgressDialog w17 = this.f21636e.T;
                    if (w17 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = w17;
                    }
                    progressDialog.dismiss();
                }
                VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity2 = this.f21636e;
                vahanConfirmUpdateMobileActivity2.T1(vahanConfirmUpdateMobileActivity2, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanConfirmUpdateMobileActivity f21637e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
            super(1);
            this.f21637e = vahanConfirmUpdateMobileActivity;
        }

        public final void b(ResendOtp resendOtp) {
            VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity;
            ProgressDialog progressDialog = null;
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    ProgressDialog w12 = this.f21637e.T;
                    if (w12 == null) {
                        cm.l.v("dialog");
                        w12 = null;
                    }
                    w12.dismiss();
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity2 = this.f21637e;
                    vahanConfirmUpdateMobileActivity2.T1(vahanConfirmUpdateMobileActivity2, "We have resent the OTP to your Mobile Number");
                    return;
                }
                if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    vahanConfirmUpdateMobileActivity = this.f21637e;
                } else {
                    ProgressDialog w13 = this.f21637e.T;
                    if (w13 == null) {
                        cm.l.v("dialog");
                        w13 = null;
                    }
                    w13.dismiss();
                    vahanConfirmUpdateMobileActivity = this.f21637e;
                }
                vahanConfirmUpdateMobileActivity.T1(vahanConfirmUpdateMobileActivity, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                ProgressDialog w14 = this.f21637e.T;
                if (w14 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = w14;
                }
                progressDialog.dismiss();
                VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity3 = this.f21637e;
                vahanConfirmUpdateMobileActivity3.T1(vahanConfirmUpdateMobileActivity3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanConfirmUpdateMobileActivity f21638e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
            super(1);
            this.f21638e = vahanConfirmUpdateMobileActivity;
        }

        public final void b(String str) {
            ProgressDialog w12 = this.f21638e.T;
            ProgressDialog progressDialog = null;
            if (w12 == null) {
                cm.l.v("dialog");
                w12 = null;
            }
            if (w12.isShowing()) {
                ProgressDialog w13 = this.f21638e.T;
                if (w13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = w13;
                }
                progressDialog.dismiss();
            }
            this.f21638e.g2(str, 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21639a;

        h(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21639a = lVar;
        }

        public final pl.c a() {
            return this.f21639a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21639a.invoke(obj);
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
        final /* synthetic */ TextView f21640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21641b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21640a = textView;
            this.f21641b = textView2;
        }

        public void onFinish() {
            this.f21641b.setVisibility(0);
            this.f21640a.setText("0");
            this.f21640a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21640a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21641b.setVisibility(8);
            this.f21640a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21643b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21642a = textView;
            this.f21643b = textView2;
        }

        public void onFinish() {
            this.f21643b.setVisibility(0);
            this.f21642a.setText("0");
            this.f21642a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21642a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21643b.setVisibility(8);
            this.f21642a.setVisibility(0);
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
            jSONObject.put("mobile_no", (Object) str);
            jSONObject.put("regn_no", (Object) this.I);
            jSONObject.put("state_cd", (Object) this.J);
            x8 x8Var3 = this.G;
            if (x8Var3 == null) {
                cm.l.v("binding");
            } else {
                x8Var = x8Var3;
            }
            jSONObject.put("name", (Object) String.valueOf(x8Var.f29378m.getText()));
            I1().o(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void C1() {
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
                myTextView.setText(D1().b("vehicle_no", "Vehicle No.:") + ' ' + this.I);
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
            W1();
        }
    }

    private final void K1() {
        AppCompatButton appCompatButton;
        String str;
        J1().i().g(this, new h(new d(this)));
        H1().k().g(this, new h(new e(this)));
        H1().i().g(this, new h(new f(this)));
        x8 x8Var = this.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        x8Var.f29369d.setOnClickListener(new di.b(this));
        e2((di.a) new u0((x0) this, (u0.b) new bi.c(new wg.c(E1()))).a(di.a.class));
        x8 x8Var3 = this.G;
        if (x8Var3 == null) {
            cm.l.v("binding");
            x8Var3 = null;
        }
        x8Var3.f29381p.f28305f.setOnClickListener(new di.h(this));
        x8 x8Var4 = this.G;
        if (x8Var4 == null) {
            cm.l.v("binding");
            x8Var4 = null;
        }
        x8Var4.f29381p.f28306g.setOnClickListener(new di.i(this));
        x8 x8Var5 = this.G;
        if (x8Var5 == null) {
            cm.l.v("binding");
            x8Var5 = null;
        }
        x8Var5.f29370e.setOnClickListener(new di.j(this));
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
            x8Var24.f29376k.setText(D1().b("label_dl_ownername_as_aadhaar", "Owner Name (As per Vahan)"));
            x8 x8Var25 = this.G;
            if (x8Var25 == null) {
                cm.l.v("binding");
                x8Var25 = null;
            }
            x8Var25.f29377l.setText(D1().b("lbl_owner_Mobile_no_as_per_Aadhaar", "Existing Mobile No (As per Vahan)"));
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
        x8Var29.f29383r.setOnClickListener(new k(this));
        I1().j().g(this, new h(new g(this)));
        I1().i().g(this, new h(new a(this)));
        I1().m().g(this, new h(new b(this)));
        I1().l().g(this, new h(new c(this)));
        x8 x8Var30 = this.G;
        if (x8Var30 == null) {
            cm.l.v("binding");
        } else {
            x8Var2 = x8Var30;
        }
        x8Var2.f29379n.setOnClickListener(new di.l(this));
    }

    /* access modifiers changed from: private */
    public static final void L1(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        Dialog dialog = new Dialog(vahanConfirmUpdateMobileActivity);
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
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + vahanConfirmUpdateMobileActivity.D1().d() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void N1(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        vahanConfirmUpdateMobileActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void O1(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        vahanConfirmUpdateMobileActivity.S1();
    }

    /* access modifiers changed from: private */
    public static final void P1(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        vahanConfirmUpdateMobileActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void Q1(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        x8 x8Var = vahanConfirmUpdateMobileActivity.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        if (cm.l.a(x8Var.f29383r.getText().toString(), "Validate with Aadhaar")) {
            if (vahanConfirmUpdateMobileActivity.j2()) {
                x8 x8Var3 = vahanConfirmUpdateMobileActivity.G;
                if (x8Var3 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var2 = x8Var3;
                }
                String valueOf = String.valueOf(x8Var2.f29371f.getText());
                vahanConfirmUpdateMobileActivity.M = valueOf;
                vahanConfirmUpdateMobileActivity.A1(valueOf);
            }
        } else if (vahanConfirmUpdateMobileActivity.H) {
            if (vahanConfirmUpdateMobileActivity.l2()) {
                vahanConfirmUpdateMobileActivity.z1();
            }
        } else if (vahanConfirmUpdateMobileActivity.k2()) {
            ProgressDialog progressDialog = vahanConfirmUpdateMobileActivity.T;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            ld.g gVar = new ld.g(vahanConfirmUpdateMobileActivity);
            x8 x8Var4 = vahanConfirmUpdateMobileActivity.G;
            if (x8Var4 == null) {
                cm.l.v("binding");
            } else {
                x8Var2 = x8Var4;
            }
            vahanConfirmUpdateMobileActivity.J1().m(vahanConfirmUpdateMobileActivity, String.valueOf(x8Var2.f29372g.getText()), gVar.k());
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        x8 x8Var = vahanConfirmUpdateMobileActivity.G;
        x8 x8Var2 = null;
        if (x8Var == null) {
            cm.l.v("binding");
            x8Var = null;
        }
        CheckBox checkBox = x8Var.f29380o;
        x8 x8Var3 = vahanConfirmUpdateMobileActivity.G;
        if (x8Var3 == null) {
            cm.l.v("binding");
        } else {
            x8Var2 = x8Var3;
        }
        checkBox.setChecked(!x8Var2.f29380o.isChecked());
    }

    private final void S1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void W1() {
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
    public final void g2(String str, int i10) {
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
        textView.setOnClickListener(new di.m(dialog, i10, this));
        textView2.setOnClickListener(new n(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void h2(Dialog dialog, int i10, VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        dialog.dismiss();
        if (i10 == 1) {
            vahanConfirmUpdateMobileActivity.S1();
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean j2() {
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

    private final boolean k2() {
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

    private final boolean l2() {
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
    public static final void n2(EditText editText, ImageView imageView, View view) {
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
    public static final void o2(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, TextView textView, TextView textView2, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        ProgressDialog progressDialog = vahanConfirmUpdateMobileActivity.T;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        new j(textView, textView2).start();
        vahanConfirmUpdateMobileActivity.H1().j(vahanConfirmUpdateMobileActivity, vahanConfirmUpdateMobileActivity.P);
    }

    /* access modifiers changed from: private */
    public static final void p2(EditText editText, VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        String str;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            str = "Please enter the OTP";
        } else if (obj.length() < 6) {
            str = "Please enter the valid OTP";
        } else {
            ProgressDialog progressDialog = vahanConfirmUpdateMobileActivity.T;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = vahanConfirmUpdateMobileActivity.T;
                if (progressDialog3 == null) {
                    cm.l.v("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
            }
            ProgressDialog progressDialog4 = vahanConfirmUpdateMobileActivity.T;
            if (progressDialog4 == null) {
                cm.l.v("dialog");
            } else {
                progressDialog2 = progressDialog4;
            }
            progressDialog2.show();
            vahanConfirmUpdateMobileActivity.H1().l(vahanConfirmUpdateMobileActivity, obj, vahanConfirmUpdateMobileActivity.P);
            return;
        }
        Toast.makeText(vahanConfirmUpdateMobileActivity, str, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void q2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void r2(VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity, View view) {
        cm.l.f(vahanConfirmUpdateMobileActivity, "this$0");
        vahanConfirmUpdateMobileActivity.B1().dismiss();
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
            new JSONObject();
            jSONObject.put("emailid", (Object) this.O);
            if (this.H) {
                x8 x8Var2 = this.G;
                if (x8Var2 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var = x8Var2;
                }
                valueOf = String.valueOf(x8Var.f29371f.getText());
            } else {
                x8 x8Var3 = this.G;
                if (x8Var3 == null) {
                    cm.l.v("binding");
                } else {
                    x8Var = x8Var3;
                }
                valueOf = String.valueOf(x8Var.f29372g.getText());
            }
            jSONObject.put("mobile", (Object) valueOf);
            jSONObject.put("regn_no", (Object) this.I);
            jSONObject.put("state_cd", (Object) this.J);
            I1().n(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final Dialog B1() {
        Dialog dialog = this.Y;
        if (dialog != null) {
            return dialog;
        }
        cm.l.v("d");
        return null;
    }

    public final ld.c D1() {
        ld.c cVar = this.Z;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final UpdateMobileNoService E1() {
        UpdateMobileNoService updateMobileNoService = this.S;
        if (updateMobileNoService != null) {
            return updateMobileNoService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanServiceConnection F1() {
        VahanServiceConnection vahanServiceConnection = this.X;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService1");
        return null;
    }

    public final VahanServiceConnection G1() {
        VahanServiceConnection vahanServiceConnection = this.V;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("verifyOtpRetrofitService");
        return null;
    }

    public final bi.j H1() {
        bi.j jVar = this.U;
        if (jVar != null) {
            return jVar;
        }
        cm.l.v("verifyOtpViewModel");
        return null;
    }

    public final di.a I1() {
        di.a aVar = this.R;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final l J1() {
        l lVar = this.W;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel1");
        return null;
    }

    public final void T1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new di.g(dialog));
        dialog.show();
    }

    public final void V1(Dialog dialog) {
        cm.l.f(dialog, "<set-?>");
        this.Y = dialog;
    }

    public final void X1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Z = cVar;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void a2(UpdateMobileNoService updateMobileNoService) {
        cm.l.f(updateMobileNoService, "<set-?>");
        this.S = updateMobileNoService;
    }

    public final void b2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.X = vahanServiceConnection;
    }

    public final void c2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.V = vahanServiceConnection;
    }

    public final void d2(bi.j jVar) {
        cm.l.f(jVar, "<set-?>");
        this.U = jVar;
    }

    public final void e2(di.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.R = aVar;
    }

    public final void f2(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.W = lVar;
    }

    public final void m2(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        B1().setContentView(R.layout.validateotp);
        B1().setCanceledOnTouchOutside(false);
        B1().setCancelable(false);
        Window window = B1().getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = B1().findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = B1().findViewById(R.id.resendOtp);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = B1().findViewById(R.id.showmpin);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) findViewById3;
        View findViewById4 = B1().findViewById(R.id.submitOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = B1().findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = B1().findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById6;
        View findViewById7 = B1().findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = B1().findViewById(R.id.disPlay_mobile);
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
        imageView2.setOnClickListener(new p(editText, imageView2));
        textView.setOnClickListener(new di.c(this, textView3, textView));
        textView2.setOnClickListener(new di.d(editText, this));
        textView4.setOnClickListener(new di.e(editText));
        imageView.setOnClickListener(new di.f(this));
        B1().show();
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, D1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
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
        X1(new ld.c(this));
        V1(new Dialog(this));
        a2(UpdateMobileNoService.f21190a.b(this));
        VahanServiceConnection.a aVar2 = VahanServiceConnection.f21199a;
        b2(aVar2.b(this));
        c2(aVar2.b(this));
        d2((bi.j) new u0((x0) this, (u0.b) new bi.i(new wg.e(G1()))).a(bi.j.class));
        f2((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(F1()))).a(l.class));
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
        C1();
        K1();
    }
}
