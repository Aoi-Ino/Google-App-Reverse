package com.nic.mparivahan.ServiceWithdrawnScreen.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
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
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.ServiceWithdrawn;
import jd.i;
import jd.j;
import jd.k;
import jd.n;
import jd.o;
import jd.p;
import ni.ad;
import pl.x;
import t8.c;
import v9.e;

public final class OtpVerification extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public ad G;
    /* access modifiers changed from: private */
    public ProgressDialog H;
    private Context I;
    public ld.f J;
    public ld.c K;
    private rj.d L;
    private ServiceWithdrawn M;
    public ld.g N;
    private String O;
    private String P = "";
    /* access modifiers changed from: private */
    public String Q = "";
    /* access modifiers changed from: private */
    public String R = "";
    /* access modifiers changed from: private */
    public String S = "";
    private String T = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerification f9586e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OtpVerification otpVerification) {
            super(1);
            this.f9586e = otpVerification;
        }

        public final void b(SendOtpResult sendOtpResult) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog s12 = this.f9586e.H;
                if (s12 == null) {
                    cm.l.v("dialog");
                    s12 = null;
                }
                if (s12.isShowing()) {
                    ProgressDialog s13 = this.f9586e.H;
                    if (s13 == null) {
                        cm.l.v("dialog");
                        s13 = null;
                    }
                    s13.dismiss();
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f9586e.F1(String.valueOf(sendOtpResult.getRecordId()));
                    OtpVerification otpVerification = this.f9586e;
                    ad r12 = otpVerification.G;
                    if (r12 == null) {
                        cm.l.v("binding");
                        r12 = null;
                    }
                    otpVerification.I1(otpVerification, r12.f25356f.getText().toString());
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f9586e, sendOtpResult.getStatusDesc());
                } else {
                    this.f9586e.C1(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                ProgressDialog s14 = this.f9586e.H;
                if (s14 == null) {
                    cm.l.v("dialog");
                    s14 = null;
                }
                if (s14.isShowing()) {
                    ProgressDialog s15 = this.f9586e.H;
                    if (s15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = s15;
                    }
                    progressDialog.dismiss();
                }
                OtpVerification otpVerification2 = this.f9586e;
                String b10 = otpVerification2.v1().b("label_went_wrong", this.f9586e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b10);
                otpVerification2.C1(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerification f9587e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OtpVerification otpVerification) {
            super(1);
            this.f9587e = otpVerification;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ProgressDialog s12 = this.f9587e.H;
                    ProgressDialog progressDialog = null;
                    if (s12 == null) {
                        cm.l.v("dialog");
                        s12 = null;
                    }
                    if (s12.isShowing()) {
                        ProgressDialog s13 = this.f9587e.H;
                        if (s13 == null) {
                            cm.l.v("dialog");
                        } else {
                            progressDialog = s13;
                        }
                        progressDialog.dismiss();
                    }
                    Intent intent = new Intent(this.f9587e, SelectedWithdrawnList.class);
                    intent.putExtra("applNo", this.f9587e.Q);
                    intent.putExtra("applicantFullName", this.f9587e.R);
                    intent.putExtra("applicantDob", this.f9587e.S);
                    this.f9587e.startActivity(intent);
                    return;
                }
                this.f9587e.C1(otpVerifyResult.getStatusDesc());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerification f9588e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OtpVerification otpVerification) {
            super(1);
            this.f9588e = otpVerification;
        }

        public final void b(String str) {
            ProgressDialog s12 = this.f9588e.H;
            ProgressDialog progressDialog = null;
            if (s12 == null) {
                cm.l.v("dialog");
                s12 = null;
            }
            if (s12.isShowing()) {
                ProgressDialog s13 = this.f9588e.H;
                if (s13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = s13;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OtpVerification f9589e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(OtpVerification otpVerification) {
            super(1);
            this.f9589e = otpVerification;
        }

        public final void b(String str) {
            ProgressDialog s12 = this.f9589e.H;
            ProgressDialog progressDialog = null;
            if (s12 == null) {
                cm.l.v("dialog");
                s12 = null;
            }
            if (s12.isShowing()) {
                ProgressDialog s13 = this.f9589e.H;
                if (s13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = s13;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9590a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f9590a = lVar;
        }

        public final pl.c a() {
            return this.f9590a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9590a.invoke(obj);
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

    public static final class f extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f9591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OtpVerification f9592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f9593c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TextView textView, OtpVerification otpVerification, TextView textView2) {
            super(30000, 1000);
            this.f9591a = textView;
            this.f9592b = otpVerification;
            this.f9593c = textView2;
        }

        public void onFinish() {
            this.f9593c.setVisibility(0);
            this.f9591a.setText("0");
            this.f9591a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f9591a;
            textView.setText(this.f9592b.v1().b("time_remaining", this.f9592b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f9593c.setVisibility(8);
            this.f9591a.setVisibility(0);
        }
    }

    public static final class g extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f9594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OtpVerification f9595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f9596c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TextView textView, OtpVerification otpVerification, TextView textView2) {
            super(30000, 1000);
            this.f9594a = textView;
            this.f9595b = otpVerification;
            this.f9596c = textView2;
        }

        public void onFinish() {
            this.f9596c.setVisibility(0);
            this.f9594a.setText("0");
            this.f9594a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f9594a;
            textView.setText(this.f9595b.v1().b("time_remaining", this.f9595b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f9596c.setVisibility(8);
            this.f9594a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(OtpVerification otpVerification, View view) {
        Toast makeText;
        cm.l.f(otpVerification, "this$0");
        ProgressDialog progressDialog = null;
        try {
            ad adVar = otpVerification.G;
            if (adVar == null) {
                cm.l.v("binding");
                adVar = null;
            }
            if (adVar.f25356f.getText().toString().length() < 10) {
                makeText = Toast.makeText(otpVerification, otpVerification.v1().b("label_log_entr_vali_mobno", otpVerification.getString(R.string.enter_mobile_no)), 0);
            } else {
                c.a aVar = t8.c.f16582a;
                ad adVar2 = otpVerification.G;
                if (adVar2 == null) {
                    cm.l.v("binding");
                    adVar2 = null;
                }
                if (!aVar.q(adVar2.f25356f.getText().toString())) {
                    makeText = Toast.makeText(otpVerification, otpVerification.v1().b("label_log_entr_vali_mobno", otpVerification.getString(R.string.enter_mobile_no)), 0);
                } else {
                    ProgressDialog progressDialog2 = otpVerification.H;
                    if (progressDialog2 == null) {
                        cm.l.v("dialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.show();
                    rj.d dVar = otpVerification.L;
                    if (dVar == null) {
                        cm.l.v("viewModal");
                        dVar = null;
                    }
                    ad adVar3 = otpVerification.G;
                    if (adVar3 == null) {
                        cm.l.v("binding");
                        adVar3 = null;
                    }
                    dVar.u(adVar3.f25356f.getText().toString(), otpVerification.x1().k());
                    return;
                }
            }
            makeText.show();
        } catch (Exception e10) {
            ProgressDialog progressDialog3 = otpVerification.H;
            if (progressDialog3 == null) {
                cm.l.v("dialog");
                progressDialog3 = null;
            }
            if (progressDialog3.isShowing()) {
                ProgressDialog progressDialog4 = otpVerification.H;
                if (progressDialog4 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = progressDialog4;
                }
                progressDialog.dismiss();
            }
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(OtpVerification otpVerification, View view) {
        cm.l.f(otpVerification, "this$0");
        ad adVar = otpVerification.G;
        if (adVar == null) {
            cm.l.v("binding");
            adVar = null;
        }
        adVar.f25356f.setText("");
    }

    /* access modifiers changed from: private */
    public final void C1(String str) {
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
        ((TextView) findViewById3).setText(v1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(v1().b("btn_ok", "OK"));
        textView.setOnClickListener(new jd.h(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void D1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J1(EditText editText, ImageView imageView, View view) {
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
    public static final void K1(OtpVerification otpVerification, TextView textView, TextView textView2, View view) {
        cm.l.f(otpVerification, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        rj.d dVar = otpVerification.L;
        if (dVar == null) {
            cm.l.v("viewModal");
            dVar = null;
        }
        dVar.q(String.valueOf(otpVerification.O));
        new g(textView, otpVerification, textView2).start();
    }

    /* access modifiers changed from: private */
    public static final void L1(OtpVerification otpVerification, EditText editText, Dialog dialog, View view) {
        Toast makeText;
        ld.c v12;
        String string;
        String str;
        cm.l.f(otpVerification, "this$0");
        cm.l.f(editText, "$enterOtp");
        cm.l.f(dialog, "$d");
        if (com.nic.mparivahan.a.f9624a.a(otpVerification)) {
            Editable text = editText.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                v12 = otpVerification.v1();
                string = otpVerification.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                cm.l.c(text2);
                if (text2.length() < 6) {
                    v12 = otpVerification.v1();
                    string = otpVerification.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    dialog.dismiss();
                    rj.d dVar = otpVerification.L;
                    if (dVar == null) {
                        cm.l.v("viewModal");
                        dVar = null;
                    }
                    String obj = editText.getText().toString();
                    String str2 = otpVerification.O;
                    cm.l.c(str2);
                    dVar.x(obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(otpVerification, v12.b(str, string), 0);
        } else {
            makeText = Toast.makeText(otpVerification.getApplicationContext(), otpVerification.v1().b("label_log_check_internet", otpVerification.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void M1(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void u1() {
        String stringExtra = getIntent().getStringExtra("mobileNo");
        cm.l.c(stringExtra);
        this.P = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("applNo");
        cm.l.c(stringExtra2);
        this.Q = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("fullName");
        cm.l.c(stringExtra3);
        this.R = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("fatherName");
        cm.l.c(stringExtra4);
        this.T = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("dob");
        cm.l.c(stringExtra5);
        this.S = stringExtra5;
        ad adVar = null;
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.P)) {
            ad adVar2 = this.G;
            if (adVar2 == null) {
                cm.l.v("binding");
                adVar2 = null;
            }
            adVar2.f25356f.setText(this.P);
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.Q)) {
            ad adVar3 = this.G;
            if (adVar3 == null) {
                cm.l.v("binding");
            } else {
                adVar = adVar3;
            }
            adVar.f25352b.setText(this.Q);
        }
    }

    private final void y1() {
        this.I = this;
        H1(new ld.g(this));
        Context context = this.I;
        ad adVar = null;
        if (context == null) {
            cm.l.v("mContext");
            context = null;
        }
        G1(new ld.f(context));
        Context context2 = this.I;
        if (context2 == null) {
            cm.l.v("mContext");
            context2 = null;
        }
        E1(new ld.c(context2));
        ServiceWithdrawn.a aVar = ServiceWithdrawn.f22143a;
        Context context3 = this.I;
        if (context3 == null) {
            cm.l.v("mContext");
            context3 = null;
        }
        this.M = aVar.b(context3);
        ad adVar2 = this.G;
        if (adVar2 == null) {
            cm.l.v("binding");
            adVar2 = null;
        }
        adVar2.f25355e.f28452f.setText(w1().i());
        ad adVar3 = this.G;
        if (adVar3 == null) {
            cm.l.v("binding");
            adVar3 = null;
        }
        adVar3.f25355e.f28448b.setOnClickListener(new i(this));
        ServiceWithdrawn serviceWithdrawn = this.M;
        if (serviceWithdrawn == null) {
            cm.l.v("service");
            serviceWithdrawn = null;
        }
        this.L = (rj.d) new u0((x0) this, (u0.b) new sj.b(new rj.c(serviceWithdrawn))).a(rj.d.class);
        ad adVar4 = this.G;
        if (adVar4 == null) {
            cm.l.v("binding");
            adVar4 = null;
        }
        adVar4.f25353c.setOnClickListener(new j(this));
        ad adVar5 = this.G;
        if (adVar5 == null) {
            cm.l.v("binding");
        } else {
            adVar = adVar5;
        }
        adVar.f25357g.setOnClickListener(new k(this));
    }

    /* access modifiers changed from: private */
    public static final void z1(OtpVerification otpVerification, View view) {
        cm.l.f(otpVerification, "this$0");
        otpVerification.finish();
    }

    public final void E1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final void F1(String str) {
        this.O = str;
    }

    public final void G1(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.J = fVar;
    }

    public final void H1(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.N = gVar;
    }

    public final void I1(Context context, String str) {
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
        View findViewById9 = dialog.findViewById(R.id.disPlay);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ImageView imageView2 = (ImageView) findViewById;
        ((TextView) findViewById9).setText(v1().b("otp_verification", getString(R.string.otp_verification)));
        textView2.setText(v1().b("vahan_btn_submit", getString(R.string.submit)));
        textView4.setText(v1().b("btn_reset", getString(R.string.reset)));
        textView.setText(v1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(v1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) findViewById10).setText(v1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str2.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                b10 = v1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView5.setText(b10);
        } catch (Exception unused) {
            textView5.setText(v1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new f(textView3, this, textView).start();
        imageView.setOnClickListener(new jd.l(editText, imageView));
        textView.setOnClickListener(new jd.m(this, textView3, textView));
        textView2.setOnClickListener(new n(this, editText, dialog));
        textView4.setOnClickListener(new o(editText));
        imageView2.setOnClickListener(new p(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ad c10 = ad.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        rj.d dVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        E1(new ld.c(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.H = progressDialog;
        progressDialog.setMessage(v1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.H;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.H;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        u1();
        y1();
        e.a aVar = v9.e.f17509a;
        ad adVar = this.G;
        if (adVar == null) {
            cm.l.v("binding");
            adVar = null;
        }
        aVar.q(this, adVar);
        rj.d dVar2 = this.L;
        if (dVar2 == null) {
            cm.l.v("viewModal");
            dVar2 = null;
        }
        dVar2.n().g(this, new e(new a(this)));
        rj.d dVar3 = this.L;
        if (dVar3 == null) {
            cm.l.v("viewModal");
            dVar3 = null;
        }
        dVar3.r().g(this, new e(new b(this)));
        rj.d dVar4 = this.L;
        if (dVar4 == null) {
            cm.l.v("viewModal");
            dVar4 = null;
        }
        dVar4.m().g(this, new e(new c(this)));
        rj.d dVar5 = this.L;
        if (dVar5 == null) {
            cm.l.v("viewModal");
        } else {
            dVar = dVar5;
        }
        dVar.o().g(this, new e(new d(this)));
    }

    public final ld.c v1() {
        ld.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.f w1() {
        ld.f fVar = this.J;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.g x1() {
        ld.g gVar = this.N;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }
}
