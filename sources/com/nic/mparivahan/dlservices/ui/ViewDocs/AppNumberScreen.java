package com.nic.mparivahan.dlservices.ui.ViewDocs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.format.DateFormat;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.m;
import cm.u;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseBody;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseMessage;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import ej.k;
import ej.n;
import ej.o;
import ej.p;
import ej.r;
import ej.s;
import fj.q;
import java.util.Calendar;
import ni.l;
import pl.x;

public final class AppNumberScreen extends oi.g {
    public l J;
    private Calendar K;
    private String L;
    private String M;
    private String N;
    private hd.a O;
    public GetApplStatusService P;
    public ld.f Q;
    private String R;
    private q S;
    public Context T;
    public ld.c U;
    public ld.f V;
    public ba.b W;
    public DlServiceInt X;
    public ld.g Y;
    private String Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f21874a0;

    /* renamed from: b0  reason: collision with root package name */
    private String f21875b0;
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public ProgressDialog f21876c0;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AppNumberScreen f21877e;

        /* renamed from: com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen$a$a  reason: collision with other inner class name */
        static final class C0272a extends m implements bm.l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0272a f21878e = new C0272a();

            C0272a() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AppNumberScreen appNumberScreen) {
            super(1);
            this.f21877e = appNumberScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            ProgressDialog Q1 = this.f21877e.f21876c0;
            if (Q1 == null) {
                cm.l.v("dialog");
                Q1 = null;
            }
            Q1.dismiss();
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f21877e.t2(String.valueOf(sendOtpResult.getRecordId()));
                    AppNumberScreen appNumberScreen = this.f21877e;
                    appNumberScreen.z2(appNumberScreen, q.B0(appNumberScreen.a2()).toString());
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f21877e, sendOtpResult.getStatusDesc());
                } else {
                    AppNumberScreen appNumberScreen2 = this.f21877e;
                    String b10 = appNumberScreen2.X1().b("nex_parivahan", this.f21877e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String b11 = this.f21877e.X1().b("btn_ok", this.f21877e.getString(R.string.ok_txt));
                    cm.l.c(b11);
                    oi.g.n1(appNumberScreen2, b10, statusDesc, 1, b11, (String) null, C0272a.f21878e, 16, (Object) null);
                }
            } catch (Exception unused) {
                AppNumberScreen appNumberScreen3 = this.f21877e;
                Context Z1 = appNumberScreen3.Z1();
                String b12 = this.f21877e.X1().b("label_went_wrong", this.f21877e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b12);
                appNumberScreen3.l2(Z1, b12);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f21879e = new b();

        b() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final c f21880e = new c();

        c() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final d f21881e = new d();

        d() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final e f21882e = new e();

        e() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final f f21883e = new f();

        f() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AppNumberScreen f21884e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AppNumberScreen appNumberScreen) {
            super(1);
            this.f21884e = appNumberScreen;
        }

        public final void b(GetApplInfoResponse getApplInfoResponse) {
            ProgressDialog Q1 = this.f21884e.f21876c0;
            String str = null;
            if (Q1 == null) {
                cm.l.v("dialog");
                Q1 = null;
            }
            Q1.dismiss();
            try {
                ResponseMessage responseMessage = getApplInfoResponse.getResponseMessage();
                if (responseMessage != null) {
                    Integer statusCode = responseMessage.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            AppNumberScreen appNumberScreen = this.f21884e;
                            ResponseBody responseBody = getApplInfoResponse.getResponseBody();
                            cm.l.c(responseBody);
                            appNumberScreen.y2(responseBody.getApdStateCd());
                            ResponseBody responseBody2 = getApplInfoResponse.getResponseBody();
                            cm.l.c(responseBody2);
                            if (responseBody2.getApdMobileNo() == null) {
                                this.f21884e.s2("NA");
                            } else {
                                AppNumberScreen appNumberScreen2 = this.f21884e;
                                ResponseBody responseBody3 = getApplInfoResponse.getResponseBody();
                                cm.l.c(responseBody3);
                                appNumberScreen2.s2(String.valueOf(responseBody3.getApdMobileNo()));
                            }
                            ba.b W1 = this.f21884e.W1();
                            AppNumberScreen appNumberScreen3 = this.f21884e;
                            W1.F(appNumberScreen3, appNumberScreen3.a2(), this.f21884e.e2().k());
                            return;
                        }
                    }
                }
                AppNumberScreen appNumberScreen4 = this.f21884e;
                Context Z1 = appNumberScreen4.Z1();
                ResponseMessage responseMessage2 = getApplInfoResponse.getResponseMessage();
                if (responseMessage2 != null) {
                    str = responseMessage2.getDeveloperMessage();
                }
                appNumberScreen4.l2(Z1, str);
            } catch (Exception unused) {
                AppNumberScreen appNumberScreen5 = this.f21884e;
                appNumberScreen5.l2(appNumberScreen5.Z1(), this.f21884e.X1().b("service_is_not_present", this.f21884e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetApplInfoResponse) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21885a;

        h(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21885a = lVar;
        }

        public final pl.c a() {
            return this.f21885a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21885a.invoke(obj);
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
        final /* synthetic */ TextView f21886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppNumberScreen f21887b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f21888c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, AppNumberScreen appNumberScreen, u uVar) {
            super(30000, 1000);
            this.f21886a = textView;
            this.f21887b = appNumberScreen;
            this.f21888c = uVar;
        }

        public void onFinish() {
            ((TextView) this.f21888c.f20234e).setVisibility(0);
            this.f21886a.setText("0");
            this.f21886a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f21886a;
            textView.setText(this.f21887b.X1().b("time_remaining", this.f21887b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            ((TextView) this.f21888c.f20234e).setVisibility(8);
            this.f21886a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppNumberScreen f21890b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f21891c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, AppNumberScreen appNumberScreen, u uVar) {
            super(30000, 1000);
            this.f21889a = textView;
            this.f21890b = appNumberScreen;
            this.f21891c = uVar;
        }

        public void onFinish() {
            ((TextView) this.f21891c.f20234e).setVisibility(0);
            this.f21889a.setText("0");
            this.f21889a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21889a;
            textView.setText(this.f21890b.X1().b("time_remaining", this.f21890b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            ((TextView) this.f21891c.f20234e).setVisibility(8);
            this.f21889a.setVisibility(0);
        }
    }

    public AppNumberScreen() {
        Calendar instance = Calendar.getInstance();
        cm.l.e(instance, "getInstance(...)");
        this.K = instance;
    }

    /* access modifiers changed from: private */
    public static final void A2(EditText editText, ImageView imageView, View view) {
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
    public static final void B2(AppNumberScreen appNumberScreen, TextView textView, u uVar, View view) {
        cm.l.f(appNumberScreen, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(uVar, "$resendOtp");
        ProgressDialog progressDialog = appNumberScreen.f21876c0;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        appNumberScreen.W1().D(appNumberScreen, String.valueOf(appNumberScreen.Z));
        new j(textView, appNumberScreen, uVar).start();
    }

    /* access modifiers changed from: private */
    public static final void C2(AppNumberScreen appNumberScreen, EditText editText, View view) {
        Toast makeText;
        ld.c X1;
        String string;
        String str;
        cm.l.f(appNumberScreen, "this$0");
        cm.l.f(editText, "$enterOtp");
        if (com.nic.mparivahan.a.f9624a.a(appNumberScreen)) {
            Editable text = editText.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                X1 = appNumberScreen.X1();
                string = appNumberScreen.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                cm.l.c(text2);
                if (text2.length() < 6) {
                    X1 = appNumberScreen.X1();
                    string = appNumberScreen.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    ProgressDialog progressDialog = appNumberScreen.f21876c0;
                    if (progressDialog == null) {
                        cm.l.v("dialog");
                        progressDialog = null;
                    }
                    progressDialog.show();
                    ba.b W1 = appNumberScreen.W1();
                    String obj = editText.getText().toString();
                    String str2 = appNumberScreen.Z;
                    cm.l.c(str2);
                    W1.G(appNumberScreen, obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(appNumberScreen, X1.b(str, string), 0);
        } else {
            makeText = Toast.makeText(appNumberScreen.getApplicationContext(), appNumberScreen.X1().b("label_log_check_internet", appNumberScreen.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void D2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void E2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void L1() {
        W1().u().g(this, new h(new a(this)));
        W1().t().g(this, new n(this));
        W1().E().g(this, new o(this));
        W1().w().g(this, new p(this));
        W1().v().g(this, new ej.q(this));
    }

    /* access modifiers changed from: private */
    public static final void M1(AppNumberScreen appNumberScreen, String str) {
        cm.l.f(appNumberScreen, "this$0");
        ProgressDialog progressDialog = appNumberScreen.f21876c0;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        Context Z1 = appNumberScreen.Z1();
        String b10 = appNumberScreen.X1().b("label_went_wrong", appNumberScreen.getString(R.string.something_please_try_after_some_time));
        cm.l.c(b10);
        appNumberScreen.l2(Z1, b10);
    }

    /* access modifiers changed from: private */
    public static final void N1(AppNumberScreen appNumberScreen, OtpVerifyResult otpVerifyResult) {
        cm.l.f(appNumberScreen, "this$0");
        ProgressDialog progressDialog = appNumberScreen.f21876c0;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        try {
            if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                Intent intent = new Intent(appNumberScreen, AppDetailsScreen.class);
                String str = appNumberScreen.M;
                if (str == null) {
                    cm.l.v("appNo");
                    str = null;
                }
                intent.putExtra("app_no", str);
                String str2 = appNumberScreen.N;
                if (str2 == null) {
                    cm.l.v("dob");
                    str2 = null;
                }
                intent.putExtra("dob", str2);
                intent.putExtra("stateCode", appNumberScreen.f21875b0);
                appNumberScreen.startActivity(intent);
                appNumberScreen.finish();
                return;
            }
            appNumberScreen.l2(appNumberScreen.Z1(), otpVerifyResult.getStatusDesc());
        } catch (Exception unused) {
            ProgressDialog progressDialog3 = appNumberScreen.f21876c0;
            if (progressDialog3 == null) {
                cm.l.v("dialog");
            } else {
                progressDialog2 = progressDialog3;
            }
            progressDialog2.dismiss();
            Context Z1 = appNumberScreen.Z1();
            String b10 = appNumberScreen.X1().b("label_went_wrong", appNumberScreen.getString(R.string.something_please_try_after_some_time));
            cm.l.c(b10);
            appNumberScreen.l2(Z1, b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(AppNumberScreen appNumberScreen, ResendOtp resendOtp) {
        String b10;
        String statusDesc;
        int i10;
        String b11;
        String str;
        bm.l lVar;
        cm.l.f(appNumberScreen, "this$0");
        ProgressDialog progressDialog = appNumberScreen.f21876c0;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        try {
            if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                b10 = appNumberScreen.X1().b("nex_parivahan", appNumberScreen.getString(R.string.app_name));
                cm.l.c(b10);
                statusDesc = appNumberScreen.X1().b("otp_resent", appNumberScreen.getString(R.string.otp_resent));
                cm.l.c(statusDesc);
                i10 = 1;
                b11 = appNumberScreen.X1().b("btn_ok", appNumberScreen.getString(R.string.ok_txt));
                cm.l.c(b11);
                str = null;
                lVar = b.f21879e;
            } else if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                b10 = appNumberScreen.X1().b("nex_parivahan", appNumberScreen.getString(R.string.app_name));
                cm.l.c(b10);
                statusDesc = resendOtp.getStatusDesc();
                i10 = 1;
                b11 = appNumberScreen.X1().b("btn_ok", appNumberScreen.getString(R.string.ok_txt));
                cm.l.c(b11);
                str = null;
                lVar = c.f21880e;
            } else {
                b10 = appNumberScreen.X1().b("nex_parivahan", appNumberScreen.getString(R.string.app_name));
                cm.l.c(b10);
                statusDesc = resendOtp.getStatusDesc();
                i10 = 1;
                b11 = appNumberScreen.X1().b("btn_ok", appNumberScreen.getString(R.string.ok_txt));
                cm.l.c(b11);
                str = null;
                lVar = d.f21881e;
            }
            oi.g.n1(appNumberScreen, b10, statusDesc, i10, b11, str, lVar, 16, (Object) null);
        } catch (Exception unused) {
            String b12 = appNumberScreen.X1().b("nex_parivahan", appNumberScreen.getString(R.string.app_name));
            cm.l.c(b12);
            String b13 = appNumberScreen.X1().b("label_log_unbl_veri_otp", appNumberScreen.getString(R.string.unable_verifiy_otp));
            cm.l.c(b13);
            String b14 = appNumberScreen.X1().b("btn_ok", appNumberScreen.getString(R.string.ok_txt));
            cm.l.c(b14);
            oi.g.n1(appNumberScreen, b12, b13, 1, b14, (String) null, e.f21882e, 16, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void P1(AppNumberScreen appNumberScreen, String str) {
        cm.l.f(appNumberScreen, "this$0");
        ProgressDialog progressDialog = appNumberScreen.f21876c0;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        String b10 = appNumberScreen.X1().b("nex_parivahan", appNumberScreen.getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = appNumberScreen.X1().b("label_log_unbl_veri_otp", appNumberScreen.getString(R.string.unable_verifiy_otp));
        cm.l.c(b11);
        String b12 = appNumberScreen.X1().b("btn_ok", appNumberScreen.getString(R.string.ok_txt));
        cm.l.c(b12);
        oi.g.n1(appNumberScreen, b10, b11, 1, b12, (String) null, f.f21883e, 16, (Object) null);
    }

    private final void R1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new s(this), this.K.get(1), this.K.get(2), this.K.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void S1(AppNumberScreen appNumberScreen, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(appNumberScreen, "this$0");
        appNumberScreen.K.set(1, i10);
        appNumberScreen.K.set(2, i11);
        appNumberScreen.K.set(5, i12);
        CharSequence format = DateFormat.format("dd", appNumberScreen.K.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", appNumberScreen.K.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", appNumberScreen.K.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str = ((String) format) + '-' + ((String) format2) + '-' + ((String) format3);
        appNumberScreen.L = str;
        String str2 = null;
        if (str == null) {
            cm.l.v("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        TextView textView = appNumberScreen.Y1().f27207b;
        String str3 = appNumberScreen.L;
        if (str3 == null) {
            cm.l.v("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void U1() {
        hd.a aVar = this.O;
        hd.a aVar2 = null;
        if (aVar == null) {
            cm.l.v("appStatusVM");
            aVar = null;
        }
        aVar.j().g(this, new h(new g(this)));
        hd.a aVar3 = this.O;
        if (aVar3 == null) {
            cm.l.v("appStatusVM");
        } else {
            aVar2 = aVar3;
        }
        aVar2.i().g(this, new r(this));
    }

    /* access modifiers changed from: private */
    public static final void V1(AppNumberScreen appNumberScreen, String str) {
        cm.l.f(appNumberScreen, "this$0");
        ProgressDialog progressDialog = appNumberScreen.f21876c0;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        appNumberScreen.l2(appNumberScreen.Z1(), appNumberScreen.X1().b("service_is_not_present", appNumberScreen.getString(R.string.unable_to_get_details)));
    }

    private final void f2() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f21876c0 = progressDialog;
        progressDialog.setMessage(X1().b("label_challan_please_wait", "Please wait..."));
        ProgressDialog progressDialog2 = this.f21876c0;
        ProgressDialog progressDialog3 = null;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.f21876c0;
        if (progressDialog4 == null) {
            cm.l.v("dialog");
        } else {
            progressDialog3 = progressDialog4;
        }
        progressDialog3.setCancelable(false);
        Y1().f27212g.f28452f.setText(c2().i());
        Y1().f27212g.f28448b.setOnClickListener(new ej.m(this));
        this.O = (hd.a) new u0((x0) this, (u0.b) new hd.b(new ed.a(T1()))).a(hd.a.class);
        w2(new ld.f(this));
        this.R = d2().i();
        U1();
    }

    /* access modifiers changed from: private */
    public static final void g2(AppNumberScreen appNumberScreen, View view) {
        cm.l.f(appNumberScreen, "this$0");
        VUtility.Companion.v(appNumberScreen, appNumberScreen.X1().b("are_you_sure_you_want_to_leave", appNumberScreen.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    private final void h2() {
        Y1().f27210e.setOnClickListener(new ej.d(this));
        Y1().f27217l.setOnClickListener(new k(this));
        Y1().f27209d.setOnClickListener(new ej.l(this));
    }

    /* access modifiers changed from: private */
    public static final void i2(AppNumberScreen appNumberScreen, View view) {
        cm.l.f(appNumberScreen, "this$0");
        appNumberScreen.R1();
    }

    /* access modifiers changed from: private */
    public static final void j2(AppNumberScreen appNumberScreen, View view) {
        ld.c X1;
        String string;
        String str;
        String b10;
        cm.l.f(appNumberScreen, "this$0");
        appNumberScreen.M = appNumberScreen.Y1().f27208c.getText().toString();
        appNumberScreen.N = appNumberScreen.Y1().f27207b.getText().toString();
        String str2 = appNumberScreen.M;
        String str3 = null;
        if (str2 == null) {
            cm.l.v("appNo");
            str2 = null;
        }
        if (cm.l.a(str2, "")) {
            b10 = appNumberScreen.X1().b(v9.f.f17510a.E(), appNumberScreen.getString(R.string.enter_application_no));
        } else {
            String str4 = appNumberScreen.N;
            if (str4 == null) {
                cm.l.v("dob");
                str4 = null;
            }
            if (cm.l.a(str4, "")) {
                X1 = appNumberScreen.X1();
                string = appNumberScreen.getString(R.string.enter_dob);
                str = "edit_dl_serv_dob";
            } else if (dd.a.f9964a.a(appNumberScreen)) {
                ProgressDialog progressDialog = appNumberScreen.f21876c0;
                if (progressDialog == null) {
                    cm.l.v("dialog");
                    progressDialog = null;
                }
                progressDialog.show();
                hd.a aVar = appNumberScreen.O;
                if (aVar == null) {
                    cm.l.v("appStatusVM");
                    aVar = null;
                }
                String str5 = appNumberScreen.M;
                if (str5 == null) {
                    cm.l.v("appNo");
                    str5 = null;
                }
                String str6 = appNumberScreen.N;
                if (str6 == null) {
                    cm.l.v("dob");
                } else {
                    str3 = str6;
                }
                aVar.g(appNumberScreen, str5, str3);
                return;
            } else {
                X1 = appNumberScreen.X1();
                string = appNumberScreen.getString(R.string.kindly_check_your_internet_connection);
                str = "label_log_check_internet";
            }
            b10 = X1.b(str, string);
        }
        Toast.makeText(appNumberScreen, b10, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void k2(AppNumberScreen appNumberScreen, View view) {
        cm.l.f(appNumberScreen, "this$0");
        appNumberScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void m2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final GetApplStatusService T1() {
        GetApplStatusService getApplStatusService = this.P;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        cm.l.v("appInfoService");
        return null;
    }

    public final ba.b W1() {
        ba.b bVar = this.W;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final ld.c X1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final l Y1() {
        l lVar = this.J;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context Z1() {
        Context context = this.T;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final String a2() {
        String str = this.f21874a0;
        if (str != null) {
            return str;
        }
        cm.l.v("mobileNumber");
        return null;
    }

    public final DlServiceInt b2() {
        DlServiceInt dlServiceInt = this.X;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ld.f c2() {
        ld.f fVar = this.V;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.f d2() {
        ld.f fVar = this.Q;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final ld.g e2() {
        ld.g gVar = this.Y;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void l2(Context context, String str) {
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
        ((TextView) findViewById3).setText(X1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(X1().b("btn_ok", "OK"));
        textView.setOnClickListener(new ej.e(dialog));
        dialog.show();
    }

    public final void n2(GetApplStatusService getApplStatusService) {
        cm.l.f(getApplStatusService, "<set-?>");
        this.P = getApplStatusService;
    }

    public final void o2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.W = bVar;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l c10 = l.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        q2(c10);
        setContentView((View) Y1().b());
        r2(this);
        v2(new ld.f(Z1()));
        x2(new ld.g(Z1()));
        v9.e.f17509a.m(this, Y1());
        p2(new ld.c(this));
        n2(GetApplStatusService.f9545a.a(Z1()));
        this.S = (q) new u0(this).a(q.class);
        u2(DlServiceInt.f21675a.a(Z1()));
        o2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(b2(), this))).a(ba.b.class));
        f2();
        h2();
        L1();
    }

    public final void p2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void q2(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.J = lVar;
    }

    public final void r2(Context context) {
        cm.l.f(context, "<set-?>");
        this.T = context;
    }

    public final void s2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21874a0 = str;
    }

    public final void t2(String str) {
        this.Z = str;
    }

    public final void u2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.X = dlServiceInt;
    }

    public final void v2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.V = fVar;
    }

    public final void w2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Q = fVar;
    }

    public final void x2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.Y = gVar;
    }

    public final void y2(String str) {
        this.f21875b0 = str;
    }

    public final void z2(Context context, String str) {
        String b10;
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
        u uVar = new u();
        View findViewById2 = dialog.findViewById(R.id.resendOtp);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        uVar.f20234e = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.showmpin);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.submitOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.disPlay);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ImageView imageView2 = (ImageView) findViewById;
        ((TextView) findViewById9).setText(X1().b("otp_verification", getString(R.string.otp_verification)));
        textView.setText(X1().b("vahan_btn_submit", getString(R.string.submit)));
        textView3.setText(X1().b("btn_reset", getString(R.string.reset)));
        ((TextView) uVar.f20234e).setText(X1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(X1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) findViewById10).setText(X1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(X1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str2.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                b10 = X1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView4.setText(b10);
        } catch (Exception unused) {
            textView4.setText(X1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new i(textView2, this, uVar).start();
        imageView.setOnClickListener(new ej.f(editText, imageView));
        ((TextView) uVar.f20234e).setOnClickListener(new ej.g(this, textView2, uVar));
        textView.setOnClickListener(new ej.h(this, editText));
        textView3.setOnClickListener(new ej.i(editText));
        imageView2.setOnClickListener(new ej.j(dialog));
        dialog.show();
    }
}
