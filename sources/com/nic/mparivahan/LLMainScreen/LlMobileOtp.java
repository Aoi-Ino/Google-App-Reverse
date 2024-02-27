package com.nic.mparivahan.LLMainScreen;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.b0;
import cm.h;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;
import com.nic.mparivahan.LLServices.UI.ChangeNameLL;
import com.nic.mparivahan.LLServices.UI.DuplicateLL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import ld.f;
import ld.g;
import ni.q5;
import pl.x;
import qb.f0;
import qb.g0;
import qb.h0;
import qb.i0;
import qb.j0;
import qb.k0;
import qb.l0;
import qb.m0;
import qb.n0;
import qb.o0;
import qb.p0;
import qb.q0;
import qb.r0;
import t8.c;
import v9.e;

public final class LlMobileOtp extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public q5 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public f K;
    public ba.b L;
    public DlServiceInt M;
    public g N;
    private String O;
    private String P = "";
    public TextView Q;
    public TextView R;
    public FetchLlDetails S;

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlMobileOtp f8966e;

        a(LlMobileOtp llMobileOtp) {
            this.f8966e = llMobileOtp;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            AppCompatButton appCompatButton;
            float f10;
            l.f(charSequence, "s");
            q5 q5Var = null;
            if (charSequence.length() >= 10) {
                q5 s12 = this.f8966e.G;
                if (s12 == null) {
                    l.v("mbBinding");
                } else {
                    q5Var = s12;
                }
                appCompatButton = q5Var.f28142d;
                f10 = 1.0f;
            } else {
                q5 s13 = this.f8966e.G;
                if (s13 == null) {
                    l.v("mbBinding");
                } else {
                    q5Var = s13;
                }
                appCompatButton = q5Var.f28142d;
                f10 = 0.6f;
            }
            appCompatButton.setAlpha(f10);
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlMobileOtp f8967e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LlMobileOtp llMobileOtp) {
            super(1);
            this.f8967e = llMobileOtp;
        }

        public final void b(SendOtpResult sendOtpResult) {
            this.f8967e.z1().dismiss();
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f8967e.U1(String.valueOf(sendOtpResult.getRecordId()));
                    LlMobileOtp llMobileOtp = this.f8967e;
                    q5 s12 = llMobileOtp.G;
                    if (s12 == null) {
                        l.v("mbBinding");
                        s12 = null;
                    }
                    llMobileOtp.a2(llMobileOtp, String.valueOf(s12.f28147i.getText()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f8967e, sendOtpResult.getStatusDesc());
                } else {
                    this.f8967e.N1(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                LlMobileOtp llMobileOtp2 = this.f8967e;
                String b10 = llMobileOtp2.w1().b("label_went_wrong", this.f8967e.getString(R.string.something_please_try_after_some_time));
                l.c(b10);
                llMobileOtp2.N1(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8968a;

        c(bm.l lVar) {
            l.f(lVar, "function");
            this.f8968a = lVar;
        }

        public final pl.c a() {
            return this.f8968a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8968a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final class d extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LlMobileOtp f8970b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f8971c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TextView textView, LlMobileOtp llMobileOtp, u uVar) {
            super(30000, 1000);
            this.f8969a = textView;
            this.f8970b = llMobileOtp;
            this.f8971c = uVar;
        }

        public void onFinish() {
            ((TextView) this.f8971c.f20234e).setVisibility(0);
            this.f8969a.setText("0");
            this.f8969a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f8969a;
            textView.setText(this.f8970b.w1().b("time_remaining", this.f8970b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            ((TextView) this.f8971c.f20234e).setVisibility(8);
            this.f8969a.setVisibility(0);
        }
    }

    public static final class e extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LlMobileOtp f8973b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f8974c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TextView textView, LlMobileOtp llMobileOtp, u uVar) {
            super(30000, 1000);
            this.f8972a = textView;
            this.f8973b = llMobileOtp;
            this.f8974c = uVar;
        }

        public void onFinish() {
            ((TextView) this.f8974c.f20234e).setVisibility(0);
            this.f8972a.setText("0");
            this.f8972a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f8972a;
            textView.setText(this.f8973b.w1().b("time_remaining", this.f8973b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            ((TextView) this.f8974c.f20234e).setVisibility(8);
            this.f8972a.setVisibility(0);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x013e */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0142 A[Catch:{ Exception -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0159 A[Catch:{ Exception -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015d A[Catch:{ Exception -> 0x0167 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void F1() {
        /*
            r7 = this;
            r7.S1(r7)
            ld.c r0 = new ld.c
            android.content.Context r1 = r7.y1()
            r0.<init>(r1)
            r7.Q1(r0)
            ld.g r0 = new ld.g
            android.content.Context r1 = r7.y1()
            r0.<init>(r1)
            r7.X1(r0)
            ld.f r0 = new ld.f
            android.content.Context r1 = r7.y1()
            r0.<init>(r1)
            r7.W1(r0)
            ni.q5 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "mbBinding"
            if (r0 != 0) goto L_0x0032
            cm.l.v(r2)
            r0 = r1
        L_0x0032:
            ni.dc r0 = r0.f28146h
            android.widget.TextView r0 = r0.f25961g
            ld.f r3 = r7.B1()
            java.lang.String r3 = r3.i()
            r0.setText(r3)
            ni.q5 r0 = r7.G
            if (r0 != 0) goto L_0x0049
            cm.l.v(r2)
            r0 = r1
        L_0x0049:
            androidx.appcompat.widget.AppCompatButton r0 = r0.f28142d
            r3 = 1058642330(0x3f19999a, float:0.6)
            r0.setAlpha(r3)
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            android.content.Context r3 = r7.y1()
            r0.<init>(r3)
            r7.T1(r0)
            android.app.ProgressDialog r0 = r7.z1()
            ld.c r3 = r7.w1()
            r4 = 2132018813(0x7f14067d, float:1.9675943E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "label_challan_please_wait"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setMessage(r3)
            android.app.ProgressDialog r0 = r7.z1()
            r3 = 0
            r0.setCancelable(r3)
            android.app.ProgressDialog r0 = r7.z1()
            r0.setCanceledOnTouchOutside(r3)
            com.nic.mparivahan.dlservices.data.network.DlServiceInt$a r0 = com.nic.mparivahan.dlservices.data.network.DlServiceInt.f21675a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r0 = r0.a(r7)
            r7.V1(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            ba.a r4 = new ba.a
            y9.a r5 = new y9.a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r6 = r7.A1()
            r5.<init>(r6, r7)
            r4.<init>(r5)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r4)
            java.lang.Class<ba.b> r4 = ba.b.class
            androidx.lifecycle.t0 r0 = r0.a(r4)
            ba.b r0 = (ba.b) r0
            r7.P1(r0)
            android.content.Intent r0 = r7.getIntent()     // Catch:{ Exception -> 0x013e }
            java.lang.String r4 = "LLDetails"
            java.io.Serializable r0 = r0.getSerializableExtra(r4)     // Catch:{ Exception -> 0x013e }
            java.lang.String r4 = "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails"
            cm.l.d(r0, r4)     // Catch:{ Exception -> 0x013e }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = (com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails) r0     // Catch:{ Exception -> 0x013e }
            r7.R1(r0)     // Catch:{ Exception -> 0x013e }
            ni.q5 r0 = r7.G     // Catch:{ Exception -> 0x013e }
            if (r0 != 0) goto L_0x00c7
            cm.l.v(r2)     // Catch:{ Exception -> 0x013e }
            r0 = r1
        L_0x00c7:
            android.widget.TextView r0 = r0.f28141c     // Catch:{ Exception -> 0x013e }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r4 = r7.x1()     // Catch:{ Exception -> 0x013e }
            java.lang.String r4 = r4.getLearningLicence()     // Catch:{ Exception -> 0x013e }
            java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x013e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x013e }
            r0.setText(r4)     // Catch:{ Exception -> 0x013e }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r7.x1()     // Catch:{ Exception -> 0x013e }
            java.lang.String r0 = r0.getMobileNumber()     // Catch:{ Exception -> 0x013e }
            if (r0 == 0) goto L_0x0130
            int r0 = r0.length()     // Catch:{ Exception -> 0x013e }
            if (r0 != 0) goto L_0x00ed
            goto L_0x0130
        L_0x00ed:
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r7.x1()     // Catch:{ Exception -> 0x013e }
            java.lang.String r0 = r0.getMobileNumber()     // Catch:{ Exception -> 0x013e }
            int r0 = r0.length()     // Catch:{ Exception -> 0x013e }
            r4 = 10
            if (r0 >= r4) goto L_0x00fe
            goto L_0x0130
        L_0x00fe:
            ni.q5 r0 = r7.G     // Catch:{ Exception -> 0x013e }
            if (r0 != 0) goto L_0x0106
            cm.l.v(r2)     // Catch:{ Exception -> 0x013e }
            r0 = r1
        L_0x0106:
            androidx.appcompat.widget.AppCompatButton r0 = r0.f28142d     // Catch:{ Exception -> 0x013e }
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r4)     // Catch:{ Exception -> 0x013e }
            ni.q5 r0 = r7.G     // Catch:{ Exception -> 0x013e }
            if (r0 != 0) goto L_0x0115
            cm.l.v(r2)     // Catch:{ Exception -> 0x013e }
            r0 = r1
        L_0x0115:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28147i     // Catch:{ Exception -> 0x013e }
            r0.setFocusable(r3)     // Catch:{ Exception -> 0x013e }
            ni.q5 r0 = r7.G     // Catch:{ Exception -> 0x013e }
            if (r0 != 0) goto L_0x0122
            cm.l.v(r2)     // Catch:{ Exception -> 0x013e }
            r0 = r1
        L_0x0122:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28147i     // Catch:{ Exception -> 0x013e }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r3 = r7.x1()     // Catch:{ Exception -> 0x013e }
            java.lang.String r3 = r3.getMobileNumber()     // Catch:{ Exception -> 0x013e }
            r0.setText(r3)     // Catch:{ Exception -> 0x013e }
            goto L_0x013e
        L_0x0130:
            ni.q5 r0 = r7.G     // Catch:{ Exception -> 0x013e }
            if (r0 != 0) goto L_0x0138
            cm.l.v(r2)     // Catch:{ Exception -> 0x013e }
            r0 = r1
        L_0x0138:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f28147i     // Catch:{ Exception -> 0x013e }
            r3 = 1
            r0.setFocusable(r3)     // Catch:{ Exception -> 0x013e }
        L_0x013e:
            ni.q5 r0 = r7.G     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x0146
            cm.l.v(r2)     // Catch:{ Exception -> 0x0167 }
            r0 = r1
        L_0x0146:
            ni.dc r0 = r0.f28146h     // Catch:{ Exception -> 0x0167 }
            android.widget.TextView r0 = r0.f25961g     // Catch:{ Exception -> 0x0167 }
            ld.f r3 = r7.B1()     // Catch:{ Exception -> 0x0167 }
            java.lang.String r3 = r3.i()     // Catch:{ Exception -> 0x0167 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0167 }
            ni.q5 r0 = r7.G     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x015d
            cm.l.v(r2)     // Catch:{ Exception -> 0x0167 }
            goto L_0x015e
        L_0x015d:
            r1 = r0
        L_0x015e:
            ni.dc r0 = r1.f28146h     // Catch:{ Exception -> 0x0167 }
            androidx.cardview.widget.CardView r0 = r0.f25960f     // Catch:{ Exception -> 0x0167 }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x0167 }
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLMainScreen.LlMobileOtp.F1():void");
    }

    /* access modifiers changed from: private */
    public static final void G1(LlMobileOtp llMobileOtp, View view) {
        l.f(llMobileOtp, "this$0");
        llMobileOtp.finish();
    }

    /* access modifiers changed from: private */
    public static final void H1(LlMobileOtp llMobileOtp, View view) {
        String b10;
        l.f(llMobileOtp, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(llMobileOtp)) {
            q5 q5Var = llMobileOtp.G;
            q5 q5Var2 = null;
            if (q5Var == null) {
                l.v("mbBinding");
                q5Var = null;
            }
            if (q5Var.f28143e.isChecked()) {
                q5 q5Var3 = llMobileOtp.G;
                if (q5Var3 == null) {
                    l.v("mbBinding");
                    q5Var3 = null;
                }
                if (String.valueOf(q5Var3.f28147i.getText()).length() >= 10) {
                    c.a aVar = t8.c.f16582a;
                    q5 q5Var4 = llMobileOtp.G;
                    if (q5Var4 == null) {
                        l.v("mbBinding");
                        q5Var4 = null;
                    }
                    if (aVar.q(String.valueOf(q5Var4.f28147i.getText()))) {
                        llMobileOtp.z1().show();
                        ba.b v12 = llMobileOtp.v1();
                        q5 q5Var5 = llMobileOtp.G;
                        if (q5Var5 == null) {
                            l.v("mbBinding");
                        } else {
                            q5Var2 = q5Var5;
                        }
                        String valueOf = String.valueOf(q5Var2.f28147i.getText());
                        l.c(valueOf);
                        v12.F(llMobileOtp, valueOf, llMobileOtp.C1().k());
                        return;
                    }
                }
                b10 = llMobileOtp.w1().b("label_log_entr_vali_mobno", llMobileOtp.getString(R.string.enter_mobile_no));
                l.c(b10);
            } else {
                b10 = llMobileOtp.w1().b("plz_accept_term_conditions", llMobileOtp.getString(R.string.pls_enter_term_conditions));
            }
            llMobileOtp.N1(b10);
            return;
        }
        Toast.makeText(llMobileOtp.getApplicationContext(), llMobileOtp.w1().b("label_log_check_internet", llMobileOtp.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void I1(LlMobileOtp llMobileOtp, OtpVerifyResult otpVerifyResult) {
        Intent intent;
        l.f(llMobileOtp, "this$0");
        Log.e("sub", otpVerifyResult.toString());
        try {
            if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                q5 q5Var = null;
                if (l.a(llMobileOtp.B1().b(), "574")) {
                    intent = new Intent(llMobileOtp, ChangeNameLL.class);
                    intent.putExtra("LLDetails", llMobileOtp.x1());
                    q5 q5Var2 = llMobileOtp.G;
                    if (q5Var2 == null) {
                        l.v("mbBinding");
                    } else {
                        q5Var = q5Var2;
                    }
                    intent.putExtra("Mobile_no", q.B0(String.valueOf(q5Var.f28147i.getText())).toString());
                } else if (l.a(llMobileOtp.B1().b(), "504")) {
                    intent = new Intent(llMobileOtp, ChangeAddressLL.class);
                    intent.putExtra("LLDetails", llMobileOtp.x1());
                    q5 q5Var3 = llMobileOtp.G;
                    if (q5Var3 == null) {
                        l.v("mbBinding");
                    } else {
                        q5Var = q5Var3;
                    }
                    intent.putExtra("Mobile_no", q.B0(String.valueOf(q5Var.f28147i.getText())).toString());
                } else if (l.a(llMobileOtp.B1().b(), "502")) {
                    intent = new Intent(llMobileOtp, DuplicateLL.class);
                    intent.putExtra("LLDetails", llMobileOtp.x1());
                    q5 q5Var4 = llMobileOtp.G;
                    if (q5Var4 == null) {
                        l.v("mbBinding");
                    } else {
                        q5Var = q5Var4;
                    }
                    intent.putExtra("Mobile_no", q.B0(String.valueOf(q5Var.f28147i.getText())).toString());
                } else {
                    return;
                }
                llMobileOtp.startActivity(intent);
                llMobileOtp.finish();
                return;
            }
            llMobileOtp.N1(otpVerifyResult.getStatusDesc());
        } catch (Exception unused) {
            String b10 = llMobileOtp.w1().b("label_went_wrong", llMobileOtp.getString(R.string.something_please_try_after_some_time));
            l.c(b10);
            llMobileOtp.N1(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(LlMobileOtp llMobileOtp, View view) {
        l.f(llMobileOtp, "this$0");
        q5 q5Var = llMobileOtp.G;
        q5 q5Var2 = null;
        if (q5Var == null) {
            l.v("mbBinding");
            q5Var = null;
        }
        q5Var.f28147i.setText("");
        q5 q5Var3 = llMobileOtp.G;
        if (q5Var3 == null) {
            l.v("mbBinding");
        } else {
            q5Var2 = q5Var3;
        }
        q5Var2.f28143e.setChecked(false);
    }

    /* access modifiers changed from: private */
    public static final void K1(LlMobileOtp llMobileOtp, View view) {
        l.f(llMobileOtp, "this$0");
        Dialog dialog = new Dialog(llMobileOtp.y1());
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View findViewById = dialog.findViewById(R.id.cancelIv);
        l.e(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.termConditionWv);
        l.e(findViewById2, "findViewById(...)");
        ((ImageView) findViewById).setOnClickListener(new i0(dialog));
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + v9.d.f17494a.j() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, View view) {
        l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void M1(LlMobileOtp llMobileOtp, View view) {
        l.f(llMobileOtp, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(llMobileOtp)) {
            LlMobileUpdateActivity llMobileUpdateActivity = new LlMobileUpdateActivity();
            Log.d("llDetails.DateOfBirth", llMobileOtp.x1().getDateOfBirth());
            llMobileOtp.x1().setDateOfBirth(llMobileOtp.u1(llMobileOtp.x1().getDateOfBirth()));
            llMobileUpdateActivity.L1(llMobileOtp, llMobileOtp.x1());
            return;
        }
        Toast.makeText(llMobileOtp.getApplicationContext(), llMobileOtp.w1().b("label_log_check_internet", llMobileOtp.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public final void N1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(w1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(w1().b("btn_ok", "OK"));
        textView.setOnClickListener(new h0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void O1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void b2(LlMobileOtp llMobileOtp, TextView textView, u uVar, View view) {
        l.f(llMobileOtp, "this$0");
        l.f(textView, "$time_text");
        l.f(uVar, "$resendOtp");
        llMobileOtp.v1().D(llMobileOtp, String.valueOf(llMobileOtp.O));
        new e(textView, llMobileOtp, uVar).start();
    }

    /* access modifiers changed from: private */
    public static final void c2(LlMobileOtp llMobileOtp, EditText editText, View view) {
        Toast makeText;
        ld.c w12;
        String string;
        String str;
        l.f(llMobileOtp, "this$0");
        l.f(editText, "$enterOtp");
        if (com.nic.mparivahan.a.f9624a.a(llMobileOtp)) {
            Editable text = editText.getText();
            l.c(text);
            if (text.length() == 0) {
                w12 = llMobileOtp.w1();
                string = llMobileOtp.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                l.c(text2);
                if (text2.length() < 6) {
                    w12 = llMobileOtp.w1();
                    string = llMobileOtp.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    ba.b v12 = llMobileOtp.v1();
                    String obj = editText.getText().toString();
                    String str2 = llMobileOtp.O;
                    l.c(str2);
                    v12.G(llMobileOtp, obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(llMobileOtp, w12.b(str, string), 0);
        } else {
            makeText = Toast.makeText(llMobileOtp.getApplicationContext(), llMobileOtp.w1().b("label_log_check_internet", llMobileOtp.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void d2(EditText editText, View view) {
        l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void e2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void f2(EditText editText, ImageView imageView, View view) {
        TransformationMethod instance;
        l.f(editText, "$enterOtp");
        l.f(imageView, "$shownPin");
        if (editText.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            imageView.setImageResource(R.drawable.pass_visible);
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            imageView.setImageResource(R.drawable.mvvm_visibility);
            instance = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(instance);
    }

    public final DlServiceInt A1() {
        DlServiceInt dlServiceInt = this.M;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        l.v("retrofitService");
        return null;
    }

    public final f B1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final g C1() {
        g gVar = this.N;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final TextView D1() {
        TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        l.v("submitOtp");
        return null;
    }

    public final TextView E1() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        l.v("txt_reset");
        return null;
    }

    public final void P1(ba.b bVar) {
        l.f(bVar, "<set-?>");
        this.L = bVar;
    }

    public final void Q1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void R1(FetchLlDetails fetchLlDetails) {
        l.f(fetchLlDetails, "<set-?>");
        this.S = fetchLlDetails;
    }

    public final void S1(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    public final void T1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void U1(String str) {
        this.O = str;
    }

    public final void V1(DlServiceInt dlServiceInt) {
        l.f(dlServiceInt, "<set-?>");
        this.M = dlServiceInt;
    }

    public final void W1(f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void X1(g gVar) {
        l.f(gVar, "<set-?>");
        this.N = gVar;
    }

    public final void Y1(TextView textView) {
        l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final void Z1(TextView textView) {
        l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final void a2(Context context, String str) {
        String b10;
        l.f(context, "context");
        l.f(str, "mobile_no");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        u uVar = new u();
        View findViewById2 = dialog.findViewById(R.id.resendOtp);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        uVar.f20234e = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.showmpin);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.submitOtp);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        Y1((TextView) findViewById4);
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        Z1((TextView) findViewById7);
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.disPlay);
        l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById9).setText(w1().b("otp_verification", getString(R.string.otp_verification)));
        D1().setText(w1().b("vahan_btn_submit", getString(R.string.submit)));
        E1().setText(w1().b("btn_reset", getString(R.string.reset)));
        ((TextView) uVar.f20234e).setText(w1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(w1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) findViewById10).setText(w1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str.substring(6, 10);
                l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                b10 = w1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView2.setText(b10);
        } catch (Exception unused) {
            textView2.setText(w1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new d(textView, this, uVar).start();
        imageView2.setOnClickListener(new o0(editText, imageView2));
        ((TextView) uVar.f20234e).setOnClickListener(new p0(this, textView, uVar));
        D1().setOnClickListener(new q0(this, editText));
        E1().setOnClickListener(new r0(editText));
        imageView.setOnClickListener(new g0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q5 c10 = q5.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        q5 q5Var = null;
        if (c10 == null) {
            l.v("mbBinding");
            c10 = null;
        }
        setContentView((View) c10.b());
        F1();
        e.a aVar = v9.e.f17509a;
        q5 q5Var2 = this.G;
        if (q5Var2 == null) {
            l.v("mbBinding");
            q5Var2 = null;
        }
        aVar.f1(this, q5Var2);
        q5 q5Var3 = this.G;
        if (q5Var3 == null) {
            l.v("mbBinding");
            q5Var3 = null;
        }
        q5Var3.f28146h.f25959e.setOnClickListener(new f0(this));
        q5 q5Var4 = this.G;
        if (q5Var4 == null) {
            l.v("mbBinding");
            q5Var4 = null;
        }
        q5Var4.f28147i.addTextChangedListener(new a(this));
        q5 q5Var5 = this.G;
        if (q5Var5 == null) {
            l.v("mbBinding");
            q5Var5 = null;
        }
        q5Var5.f28142d.setOnClickListener(new j0(this));
        v1().u().g(this, new c(new b(this)));
        v1().E().g(this, new k0(this));
        q5 q5Var6 = this.G;
        if (q5Var6 == null) {
            l.v("mbBinding");
            q5Var6 = null;
        }
        q5Var6.f28148j.setOnClickListener(new l0(this));
        q5 q5Var7 = this.G;
        if (q5Var7 == null) {
            l.v("mbBinding");
            q5Var7 = null;
        }
        q5Var7.f28140b.setOnClickListener(new m0(this));
        q5 q5Var8 = this.G;
        if (q5Var8 == null) {
            l.v("mbBinding");
        } else {
            q5Var = q5Var8;
        }
        q5Var.f28155q.setOnClickListener(new n0(this));
    }

    public final String u1(String str) {
        l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            String format = simpleDateFormat2.format(parse);
            l.e(format, "format(...)");
            return format;
        } catch (Exception unused) {
            return str;
        }
    }

    public final ba.b v1() {
        ba.b bVar = this.L;
        if (bVar != null) {
            return bVar;
        }
        l.v("dlServicesViewModel");
        return null;
    }

    public final ld.c w1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final FetchLlDetails x1() {
        FetchLlDetails fetchLlDetails = this.S;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        l.v("llDetails");
        return null;
    }

    public final Context y1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }
}
