package com.nic.mparivahan.AddCov.View;

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
import bm.l;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.AddCov.AddCovInterface;
import com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails;
import com.nic.mparivahan.AddCov.PojoClass.DataRequestPojo;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import ni.n1;
import org.json.JSONObject;
import pl.x;

public final class CovApplication extends oi.g {
    private w8.b J;
    private AddCovInterface K;
    /* access modifiers changed from: private */
    public ProgressDialog L;
    public ld.c M;
    public Context N;
    public ld.f O;
    public n1 P;
    public ba.b Q;
    public DlServiceInt R;
    public ld.g S;
    private String T;
    private String U;
    public ApplStatusDetails V;
    private Calendar W;
    private String X;
    /* access modifiers changed from: private */
    public String Y;
    private String Z;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public String f7711a0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7712e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CovApplication covApplication) {
            super(1);
            this.f7712e = covApplication;
        }

        public final void b(String str) {
            ProgressDialog H1 = this.f7712e.L;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            try {
                if (q.F(str.toString(), "status_code", false, 2, (Object) null)) {
                    String string = new JSONObject(str).getString("status_desc");
                    CovApplication covApplication = this.f7712e;
                    covApplication.Z1(covApplication.Q1(), string);
                    return;
                }
                CovApplication covApplication2 = this.f7712e;
                covApplication2.Z1(covApplication2.Q1(), this.f7712e.N1().b("error_msg_record_not_found", "Record not found"));
            } catch (Exception unused) {
                CovApplication covApplication3 = this.f7712e;
                covApplication3.Z1(covApplication3.Q1(), this.f7712e.N1().b("error_msg_record_not_found", "Record not found"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7713e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CovApplication covApplication) {
            super(1);
            this.f7713e = covApplication;
        }

        public final void b(String str) {
            ProgressDialog H1 = this.f7713e.L;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            CovApplication covApplication = this.f7713e;
            covApplication.Z1(covApplication.Q1(), "Something went wrong, Try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7714e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CovApplication covApplication) {
            super(1);
            this.f7714e = covApplication;
        }

        public final void b(DataRequestPojo dataRequestPojo) {
            ProgressDialog H1 = this.f7714e.L;
            String str = null;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            try {
                if (cm.l.a(dataRequestPojo.getStatus_code(), "00")) {
                    this.f7714e.d2(dataRequestPojo.getApplStatus_Details());
                    ApplStatusDetails applStatus_Details = dataRequestPojo.getApplStatus_Details();
                    cm.l.c(applStatus_Details);
                    String mobileNO = applStatus_Details.getMobileNO();
                    if (mobileNO != null) {
                        if (mobileNO.length() != 0) {
                            CovApplication covApplication = this.f7714e;
                            ApplStatusDetails applStatus_Details2 = dataRequestPojo.getApplStatus_Details();
                            cm.l.c(applStatus_Details2);
                            covApplication.g2(applStatus_Details2.getMobileNO());
                            ba.b M1 = this.f7714e.M1();
                            CovApplication covApplication2 = this.f7714e;
                            String R1 = covApplication2.R1();
                            cm.l.c(R1);
                            M1.F(covApplication2, R1, this.f7714e.U1().k());
                            return;
                        }
                    }
                    Intent intent = new Intent(this.f7714e, CovDetails.class);
                    intent.putExtra("ApplStatusDetails", this.f7714e.O1());
                    String G1 = this.f7714e.Y;
                    if (G1 == null) {
                        cm.l.v("appNo");
                        G1 = null;
                    }
                    intent.putExtra("app_number", G1);
                    String I1 = this.f7714e.f7711a0;
                    if (I1 == null) {
                        cm.l.v("newdob");
                    } else {
                        str = I1;
                    }
                    intent.putExtra("newdob", str);
                    this.f7714e.startActivity(intent);
                    this.f7714e.finish();
                    return;
                }
                String status_desc = dataRequestPojo.getStatus_desc();
                if (status_desc != null) {
                    if (status_desc.length() != 0) {
                        CovApplication covApplication3 = this.f7714e;
                        covApplication3.Z1(covApplication3.Q1(), dataRequestPojo.getStatus_desc());
                        return;
                    }
                }
                CovApplication covApplication4 = this.f7714e;
                covApplication4.Z1(covApplication4.Q1(), this.f7714e.N1().b("error_msg_record_not_found", "Record not found"));
            } catch (Exception e10) {
                e10.printStackTrace();
                CovApplication covApplication5 = this.f7714e;
                covApplication5.Z1(covApplication5.Q1(), this.f7714e.N1().b("error_msg_record_not_found", "Record not found"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DataRequestPojo) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7715e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f7716e = new a();

            a() {
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
        d(CovApplication covApplication) {
            super(1);
            this.f7715e = covApplication;
        }

        public final void b(SendOtpResult sendOtpResult) {
            ProgressDialog H1 = this.f7715e.L;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f7715e.h2(String.valueOf(sendOtpResult.getRecordId()));
                    CovApplication covApplication = this.f7715e;
                    String R1 = covApplication.R1();
                    cm.l.c(R1);
                    covApplication.l2(covApplication, q.B0(R1).toString());
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f7715e, sendOtpResult.getStatusDesc());
                } else {
                    CovApplication covApplication2 = this.f7715e;
                    String b10 = covApplication2.N1().b("nex_parivahan", this.f7715e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String b11 = this.f7715e.N1().b("btn_ok", this.f7715e.getString(R.string.ok_txt));
                    cm.l.c(b11);
                    oi.g.n1(covApplication2, b10, statusDesc, 1, b11, (String) null, a.f7716e, 16, (Object) null);
                }
            } catch (Exception unused) {
                CovApplication covApplication3 = this.f7715e;
                Context Q1 = covApplication3.Q1();
                String b12 = this.f7715e.N1().b("label_went_wrong", this.f7715e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b12);
                covApplication3.Z1(Q1, b12);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7717e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CovApplication covApplication) {
            super(1);
            this.f7717e = covApplication;
        }

        public final void b(String str) {
            ProgressDialog H1 = this.f7717e.L;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            CovApplication covApplication = this.f7717e;
            Context Q1 = covApplication.Q1();
            String b10 = this.f7717e.N1().b("record_error_msg", "Record not found");
            cm.l.c(b10);
            covApplication.Z1(Q1, b10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7718e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CovApplication covApplication) {
            super(1);
            this.f7718e = covApplication;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            Log.e("sub", otpVerifyResult.toString());
            ProgressDialog H1 = this.f7718e.L;
            ProgressDialog progressDialog = null;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(this.f7718e, CovDetails.class);
                    intent.putExtra("ApplStatusDetails", this.f7718e.O1());
                    String G1 = this.f7718e.Y;
                    if (G1 == null) {
                        cm.l.v("appNo");
                        G1 = null;
                    }
                    intent.putExtra("app_number", G1);
                    String I1 = this.f7718e.f7711a0;
                    if (I1 == null) {
                        cm.l.v("newdob");
                        I1 = null;
                    }
                    intent.putExtra("newdob", I1);
                    this.f7718e.startActivity(intent);
                    this.f7718e.finish();
                    return;
                }
                CovApplication covApplication = this.f7718e;
                covApplication.Z1(covApplication.Q1(), otpVerifyResult.getStatusDesc());
            } catch (Exception unused) {
                ProgressDialog H12 = this.f7718e.L;
                if (H12 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = H12;
                }
                progressDialog.dismiss();
                CovApplication covApplication2 = this.f7718e;
                Context Q1 = covApplication2.Q1();
                String b10 = this.f7718e.N1().b("label_went_wrong", this.f7718e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b10);
                covApplication2.Z1(Q1, b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7719e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f7720e = new a();

            a() {
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

        static final class b extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final b f7721e = new b();

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

        static final class c extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final c f7722e = new c();

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

        static final class d extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final d f7723e = new d();

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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CovApplication covApplication) {
            super(1);
            this.f7719e = covApplication;
        }

        public final void b(ResendOtp resendOtp) {
            ProgressDialog H1 = this.f7719e.L;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    CovApplication covApplication = this.f7719e;
                    String b10 = covApplication.N1().b("nex_parivahan", this.f7719e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String b11 = this.f7719e.N1().b("otp_resent", this.f7719e.getString(R.string.otp_resent));
                    cm.l.c(b11);
                    String b12 = this.f7719e.N1().b("btn_ok", this.f7719e.getString(R.string.ok_txt));
                    cm.l.c(b12);
                    oi.g.n1(covApplication, b10, b11, 1, b12, (String) null, a.f7720e, 16, (Object) null);
                } else if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                    CovApplication covApplication2 = this.f7719e;
                    String b13 = covApplication2.N1().b("nex_parivahan", this.f7719e.getString(R.string.app_name));
                    cm.l.c(b13);
                    String statusDesc = resendOtp.getStatusDesc();
                    String b14 = this.f7719e.N1().b("btn_ok", this.f7719e.getString(R.string.ok_txt));
                    cm.l.c(b14);
                    oi.g.n1(covApplication2, b13, statusDesc, 1, b14, (String) null, b.f7721e, 16, (Object) null);
                } else {
                    CovApplication covApplication3 = this.f7719e;
                    String b15 = covApplication3.N1().b("nex_parivahan", this.f7719e.getString(R.string.app_name));
                    cm.l.c(b15);
                    String statusDesc2 = resendOtp.getStatusDesc();
                    String b16 = this.f7719e.N1().b("btn_ok", this.f7719e.getString(R.string.ok_txt));
                    cm.l.c(b16);
                    oi.g.n1(covApplication3, b15, statusDesc2, 1, b16, (String) null, c.f7722e, 16, (Object) null);
                }
            } catch (Exception unused) {
                CovApplication covApplication4 = this.f7719e;
                String b17 = covApplication4.N1().b("nex_parivahan", this.f7719e.getString(R.string.app_name));
                cm.l.c(b17);
                String b18 = this.f7719e.N1().b("label_log_unbl_veri_otp", this.f7719e.getString(R.string.unable_verifiy_otp));
                cm.l.c(b18);
                String b19 = this.f7719e.N1().b("btn_ok", this.f7719e.getString(R.string.ok_txt));
                cm.l.c(b19);
                oi.g.n1(covApplication4, b17, b18, 1, b19, (String) null, d.f7723e, 16, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CovApplication f7724e;

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f7725e = new a();

            a() {
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
        h(CovApplication covApplication) {
            super(1);
            this.f7724e = covApplication;
        }

        public final void b(String str) {
            ProgressDialog H1 = this.f7724e.L;
            if (H1 == null) {
                cm.l.v("dialog");
                H1 = null;
            }
            H1.dismiss();
            CovApplication covApplication = this.f7724e;
            String b10 = covApplication.N1().b("nex_parivahan", this.f7724e.getString(R.string.app_name));
            cm.l.c(b10);
            String b11 = this.f7724e.N1().b("label_log_unbl_veri_otp", this.f7724e.getString(R.string.unable_verifiy_otp));
            cm.l.c(b11);
            String b12 = this.f7724e.N1().b("btn_ok", this.f7724e.getString(R.string.ok_txt));
            cm.l.c(b12);
            oi.g.n1(covApplication, b10, b11, 1, b12, (String) null, a.f7725e, 16, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7726a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f7726a = lVar;
        }

        public final pl.c a() {
            return this.f7726a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7726a.invoke(obj);
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

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f7727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CovApplication f7728b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f7729c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, CovApplication covApplication, TextView textView2) {
            super(30000, 1000);
            this.f7727a = textView;
            this.f7728b = covApplication;
            this.f7729c = textView2;
        }

        public void onFinish() {
            this.f7729c.setVisibility(0);
            this.f7727a.setText("0");
            this.f7727a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f7727a;
            textView.setText(this.f7728b.N1().b("time_remaining", this.f7728b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f7729c.setVisibility(8);
            this.f7727a.setVisibility(0);
        }
    }

    public static final class k extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f7730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CovApplication f7731b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f7732c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(TextView textView, CovApplication covApplication, TextView textView2) {
            super(30000, 1000);
            this.f7730a = textView;
            this.f7731b = covApplication;
            this.f7732c = textView2;
        }

        public void onFinish() {
            this.f7732c.setVisibility(0);
            this.f7730a.setText("0");
            this.f7730a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f7730a;
            textView.setText(this.f7731b.N1().b("time_remaining", this.f7731b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f7732c.setVisibility(8);
            this.f7730a.setVisibility(0);
        }
    }

    public CovApplication() {
        Calendar instance = Calendar.getInstance();
        cm.l.e(instance, "getInstance(...)");
        this.W = instance;
    }

    private final void F1() {
        w8.b bVar = this.J;
        w8.b bVar2 = null;
        if (bVar == null) {
            cm.l.v("mAddCovModel");
            bVar = null;
        }
        bVar.n().g(this, new i(new a(this)));
        w8.b bVar3 = this.J;
        if (bVar3 == null) {
            cm.l.v("mAddCovModel");
            bVar3 = null;
        }
        bVar3.m().g(this, new i(new b(this)));
        w8.b bVar4 = this.J;
        if (bVar4 == null) {
            cm.l.v("mAddCovModel");
        } else {
            bVar2 = bVar4;
        }
        bVar2.l().g(this, new i(new c(this)));
        M1().u().g(this, new i(new d(this)));
        M1().t().g(this, new i(new e(this)));
        M1().E().g(this, new i(new f(this)));
        M1().w().g(this, new i(new g(this)));
        M1().v().g(this, new i(new h(this)));
    }

    private final void K1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new x8.j(this), this.W.get(1), this.W.get(2), this.W.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void L1(CovApplication covApplication, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(covApplication, "this$0");
        covApplication.W.set(1, i10);
        covApplication.W.set(2, i11);
        covApplication.W.set(5, i12);
        CharSequence format = DateFormat.format("dd", covApplication.W.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", covApplication.W.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", covApplication.W.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str = ((String) format) + '-' + ((String) format2) + '-' + ((String) format3);
        covApplication.X = str;
        String str2 = null;
        if (str == null) {
            cm.l.v("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        TextView textView = covApplication.P1().f27531b;
        String str3 = covApplication.X;
        if (str3 == null) {
            cm.l.v("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void V1() {
        f2(this);
        c2(new ld.c(this));
        j2(new ld.f(Q1()));
        k2(new ld.g(Q1()));
        this.K = AddCovInterface.f7708a.a(Q1());
        AddCovInterface addCovInterface = this.K;
        if (addCovInterface == null) {
            cm.l.v("mAddCovInterface");
            addCovInterface = null;
        }
        this.J = (w8.b) new u0((x0) this, (u0.b) new w8.a(new w8.c(addCovInterface))).a(w8.b.class);
        i2(DlServiceInt.f21675a.a(Q1()));
        b2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(S1(), this))).a(ba.b.class));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.L = progressDialog;
        progressDialog.setMessage(N1().b("label_challan_please_wait", "Please wait..."));
    }

    /* access modifiers changed from: private */
    public static final void W1(CovApplication covApplication, View view) {
        cm.l.f(covApplication, "this$0");
        covApplication.finish();
    }

    /* access modifiers changed from: private */
    public static final void X1(CovApplication covApplication, View view) {
        ld.c N1;
        String string;
        String str;
        String b10;
        cm.l.f(covApplication, "this$0");
        covApplication.Y = covApplication.P1().f27532c.getText().toString();
        covApplication.Z = covApplication.P1().f27531b.getText().toString();
        String str2 = covApplication.Y;
        String str3 = null;
        if (str2 == null) {
            cm.l.v("appNo");
            str2 = null;
        }
        if (cm.l.a(str2, "")) {
            b10 = covApplication.N1().b(v9.f.f17510a.E(), covApplication.getString(R.string.enter_application_no));
        } else {
            String str4 = covApplication.Z;
            if (str4 == null) {
                cm.l.v("dob");
                str4 = null;
            }
            if (cm.l.a(str4, "")) {
                N1 = covApplication.N1();
                string = covApplication.getString(R.string.enter_dob);
                str = "edit_dl_serv_dob";
            } else if (dd.a.f9964a.a(covApplication)) {
                ProgressDialog progressDialog = covApplication.L;
                if (progressDialog == null) {
                    cm.l.v("dialog");
                    progressDialog = null;
                }
                progressDialog.show();
                String str5 = covApplication.Z;
                if (str5 == null) {
                    cm.l.v("dob");
                    str5 = null;
                }
                covApplication.f7711a0 = covApplication.J1(str5);
                w8.b bVar = covApplication.J;
                if (bVar == null) {
                    cm.l.v("mAddCovModel");
                    bVar = null;
                }
                String str6 = covApplication.Y;
                if (str6 == null) {
                    cm.l.v("appNo");
                    str6 = null;
                }
                String str7 = covApplication.Z;
                if (str7 == null) {
                    cm.l.v("dob");
                } else {
                    str3 = str7;
                }
                bVar.g(covApplication, str6, covApplication.J1(str3), covApplication.T1().l());
                return;
            } else {
                N1 = covApplication.N1();
                string = covApplication.getString(R.string.kindly_check_your_internet_connection);
                str = "label_log_check_internet";
            }
            b10 = N1.b(str, string);
        }
        Toast.makeText(covApplication, b10, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void Y1(CovApplication covApplication, View view) {
        cm.l.f(covApplication, "this$0");
        covApplication.K1();
    }

    /* access modifiers changed from: private */
    public static final void a2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void m2(EditText editText, ImageView imageView, View view) {
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
    public static final void n2(CovApplication covApplication, TextView textView, TextView textView2, View view) {
        cm.l.f(covApplication, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        ProgressDialog progressDialog = covApplication.L;
        if (progressDialog == null) {
            cm.l.v("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        covApplication.M1().D(covApplication, String.valueOf(covApplication.T));
        new k(textView, covApplication, textView2).start();
    }

    /* access modifiers changed from: private */
    public static final void o2(CovApplication covApplication, EditText editText, View view) {
        Toast makeText;
        ld.c N1;
        String string;
        String str;
        cm.l.f(covApplication, "this$0");
        cm.l.f(editText, "$enterOtp");
        if (com.nic.mparivahan.a.f9624a.a(covApplication)) {
            Editable text = editText.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                N1 = covApplication.N1();
                string = covApplication.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                cm.l.c(text2);
                if (text2.length() < 6) {
                    N1 = covApplication.N1();
                    string = covApplication.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    ProgressDialog progressDialog = covApplication.L;
                    if (progressDialog == null) {
                        cm.l.v("dialog");
                        progressDialog = null;
                    }
                    progressDialog.show();
                    ba.b M1 = covApplication.M1();
                    String obj = editText.getText().toString();
                    String str2 = covApplication.T;
                    cm.l.c(str2);
                    M1.G(covApplication, obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(covApplication, N1.b(str, string), 0);
        } else {
            makeText = Toast.makeText(covApplication.getApplicationContext(), covApplication.N1().b("label_log_check_internet", covApplication.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void p2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void q2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String J1(String str) {
        cm.l.f(str, "date");
        try {
            String format = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd-MM-yyyy").parse(str));
            cm.l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public final ba.b M1() {
        ba.b bVar = this.Q;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final ld.c N1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ApplStatusDetails O1() {
        ApplStatusDetails applStatusDetails = this.V;
        if (applStatusDetails != null) {
            return applStatusDetails;
        }
        cm.l.v("mApplStatusDetails");
        return null;
    }

    public final n1 P1() {
        n1 n1Var = this.P;
        if (n1Var != null) {
            return n1Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context Q1() {
        Context context = this.N;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final String R1() {
        return this.U;
    }

    public final DlServiceInt S1() {
        DlServiceInt dlServiceInt = this.R;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ld.f T1() {
        ld.f fVar = this.O;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sahi_session");
        return null;
    }

    public final ld.g U1() {
        ld.g gVar = this.S;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
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
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(N1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(N1().b("btn_ok", "OK"));
        textView.setOnClickListener(new x8.i(dialog));
        dialog.show();
    }

    public final void b2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.Q = bVar;
    }

    public final void c2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void d2(ApplStatusDetails applStatusDetails) {
        cm.l.f(applStatusDetails, "<set-?>");
        this.V = applStatusDetails;
    }

    public final void e2(n1 n1Var) {
        cm.l.f(n1Var, "<set-?>");
        this.P = n1Var;
    }

    public final void f2(Context context) {
        cm.l.f(context, "<set-?>");
        this.N = context;
    }

    public final void g2(String str) {
        this.U = str;
    }

    public final void h2(String str) {
        this.T = str;
    }

    public final void i2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.R = dlServiceInt;
    }

    public final void j2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.O = fVar;
    }

    public final void k2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.S = gVar;
    }

    public final void l2(Context context, String str) {
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
        ((TextView) findViewById9).setText(N1().b("otp_verification", getString(R.string.otp_verification)));
        textView2.setText(N1().b("vahan_btn_submit", getString(R.string.submit)));
        textView4.setText(N1().b("btn_reset", getString(R.string.reset)));
        textView.setText(N1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(N1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) findViewById10).setText(N1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(N1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str2.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                b10 = N1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView5.setText(b10);
        } catch (Exception unused) {
            textView5.setText(N1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new j(textView3, this, textView).start();
        imageView.setOnClickListener(new x8.d(editText, imageView));
        textView.setOnClickListener(new x8.e(this, textView3, textView));
        textView2.setOnClickListener(new x8.f(this, editText));
        textView4.setOnClickListener(new x8.g(editText));
        imageView2.setOnClickListener(new x8.h(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n1 c10 = n1.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        e2(c10);
        setContentView((View) P1().b());
        V1();
        v9.e.f17509a.s(this, P1());
        F1();
        P1().f27536g.f28452f.setText(T1().i());
        P1().f27536g.f28448b.setOnClickListener(new x8.a(this));
        P1().f27541l.setOnClickListener(new x8.b(this));
        P1().f27534e.setOnClickListener(new x8.c(this));
    }
}
