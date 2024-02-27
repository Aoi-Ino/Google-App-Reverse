package com.nic.mparivahan.ClServicesMainScreens;

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
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.b0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.ClServices.View.ChangeNameCl;
import com.nic.mparivahan.ClServices.View.ChangeOfAddressCl;
import com.nic.mparivahan.ClServices.View.DuplicateCl;
import com.nic.mparivahan.ClServices.View.RenewalCl;
import com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import ld.f;
import ld.g;
import ni.f6;
import pl.x;
import t8.c;
import u9.g0;
import u9.h0;
import u9.i0;
import u9.j0;
import u9.k0;
import u9.l0;
import u9.m0;
import u9.n0;
import u9.o0;
import u9.p0;
import u9.q0;
import u9.r0;
import v9.e;

public final class MobileOtpScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public f6 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public f K;
    public ba.b L;
    public DlServiceInt M;
    public g N;
    private String O;
    public TextView P;
    public TextView Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f8073a0;

    /* renamed from: b0  reason: collision with root package name */
    private String f8074b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f8075c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f8076d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f8077e0 = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MobileOtpScreen f8078e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MobileOtpScreen mobileOtpScreen) {
            super(1);
            this.f8078e = mobileOtpScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            this.f8078e.E1().dismiss();
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f8078e.i2(String.valueOf(sendOtpResult.getRecordId()));
                    MobileOtpScreen mobileOtpScreen = this.f8078e;
                    f6 r12 = mobileOtpScreen.G;
                    if (r12 == null) {
                        cm.l.v("mbBinding");
                        r12 = null;
                    }
                    mobileOtpScreen.s2(mobileOtpScreen, String.valueOf(r12.f26258i.getText()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f8078e, sendOtpResult.getStatusDesc());
                } else {
                    this.f8078e.W1(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                MobileOtpScreen mobileOtpScreen2 = this.f8078e;
                String b10 = mobileOtpScreen2.B1().b("label_went_wrong", this.f8078e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b10);
                mobileOtpScreen2.W1(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MobileOtpScreen f8079e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MobileOtpScreen mobileOtpScreen) {
            super(1);
            this.f8079e = mobileOtpScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            Log.e("sub", otpVerifyResult.toString());
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    this.f8079e.P1(cm.l.a(this.f8079e.I1().b(), "559") ? new Intent(this.f8079e, ChangeNameCl.class) : cm.l.a(this.f8079e.I1().b(), "552") ? new Intent(this.f8079e, RenewalCl.class) : cm.l.a(this.f8079e.I1().b(), "553") ? new Intent(this.f8079e, ChangeOfAddressCl.class) : new Intent(this.f8079e, DuplicateCl.class));
                } else {
                    this.f8079e.W1(otpVerifyResult.getStatusDesc());
                }
            } catch (Exception unused) {
                MobileOtpScreen mobileOtpScreen = this.f8079e;
                String b10 = mobileOtpScreen.B1().b("label_went_wrong", this.f8079e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b10);
                mobileOtpScreen.W1(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8080a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8080a = lVar;
        }

        public final pl.c a() {
            return this.f8080a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8080a.invoke(obj);
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

    public static final class d extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MobileOtpScreen f8082b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f8083c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TextView textView, MobileOtpScreen mobileOtpScreen, TextView textView2) {
            super(30000, 1000);
            this.f8081a = textView;
            this.f8082b = mobileOtpScreen;
            this.f8083c = textView2;
        }

        public void onFinish() {
            this.f8083c.setVisibility(0);
            this.f8081a.setText("0");
            this.f8081a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f8081a;
            textView.setText(this.f8082b.B1().b("time_remaining", this.f8082b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f8083c.setVisibility(8);
            this.f8081a.setVisibility(0);
        }
    }

    public static final class e extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MobileOtpScreen f8085b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f8086c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TextView textView, MobileOtpScreen mobileOtpScreen, TextView textView2) {
            super(30000, 1000);
            this.f8084a = textView;
            this.f8085b = mobileOtpScreen;
            this.f8086c = textView2;
        }

        public void onFinish() {
            this.f8086c.setVisibility(0);
            this.f8084a.setText("0");
            this.f8084a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f8084a;
            textView.setText(this.f8085b.B1().b("time_remaining", this.f8085b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f8086c.setVisibility(8);
            this.f8084a.setVisibility(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void O1() {
        /*
            r6 = this;
            java.lang.String r0 = "mbBinding"
            r6.f2(r6)
            ld.c r1 = new ld.c
            android.content.Context r2 = r6.C1()
            r1.<init>(r2)
            r6.e2(r1)
            ld.g r1 = new ld.g
            android.content.Context r2 = r6.C1()
            r1.<init>(r2)
            r6.n2(r1)
            ld.f r1 = new ld.f
            android.content.Context r2 = r6.C1()
            r1.<init>(r2)
            r6.m2(r1)
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            android.content.Context r2 = r6.C1()
            r1.<init>(r2)
            r6.h2(r1)
            android.app.ProgressDialog r1 = r6.E1()
            ld.c r2 = r6.B1()
            r3 = 2132018813(0x7f14067d, float:1.9675943E38)
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = "label_challan_please_wait"
            java.lang.String r2 = r2.b(r4, r3)
            r1.setMessage(r2)
            android.app.ProgressDialog r1 = r6.E1()
            r2 = 0
            r1.setCancelable(r2)
            android.app.ProgressDialog r1 = r6.E1()
            r1.setCanceledOnTouchOutside(r2)
            com.nic.mparivahan.dlservices.data.network.DlServiceInt$a r1 = com.nic.mparivahan.dlservices.data.network.DlServiceInt.f21675a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r1 = r1.a(r6)
            r6.j2(r1)
            androidx.lifecycle.u0 r1 = new androidx.lifecycle.u0
            ba.a r3 = new ba.a
            y9.a r4 = new y9.a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r5 = r6.F1()
            r4.<init>(r5, r6)
            r3.<init>(r4)
            r1.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r3)
            java.lang.Class<ba.b> r3 = ba.b.class
            androidx.lifecycle.t0 r1 = r1.a(r3)
            ba.b r1 = (ba.b) r1
            r6.a2(r1)
            r1 = 0
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "dobValue"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.c2(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "dlValue"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.b2(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "fatherName"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.d2(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "clName"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.Y1(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "clPhoto"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.Z1(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "rtoCode"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.k2(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "rtoName"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.l2(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "stateCode"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.o2(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "stateName"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.p2(r3)     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r3 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "mobileNumber"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0137 }
            r6.g2(r3)     // Catch:{ Exception -> 0x0137 }
            ni.f6 r3 = r6.G     // Catch:{ Exception -> 0x0137 }
            if (r3 != 0) goto L_0x013a
            cm.l.v(r0)     // Catch:{ Exception -> 0x0137 }
            r3 = r1
            goto L_0x013a
        L_0x0137:
            r2 = move-exception
            goto L_0x020a
        L_0x013a:
            android.widget.TextView r3 = r3.f26252c     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = r6.y1()     // Catch:{ Exception -> 0x0137 }
            java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0137 }
            r3.setText(r4)     // Catch:{ Exception -> 0x0137 }
            ni.f6 r3 = r6.G     // Catch:{ Exception -> 0x0137 }
            if (r3 != 0) goto L_0x0153
            cm.l.v(r0)     // Catch:{ Exception -> 0x0137 }
            r3 = r1
        L_0x0153:
            android.widget.TextView r3 = r3.f26263n     // Catch:{ Exception -> 0x0137 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0137 }
            r4.<init>()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r5 = "CL No : "
            r4.append(r5)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r5 = r6.y1()     // Catch:{ Exception -> 0x0137 }
            r4.append(r5)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0137 }
            r3.setText(r4)     // Catch:{ Exception -> 0x0137 }
            ni.f6 r3 = r6.G     // Catch:{ Exception -> 0x0137 }
            if (r3 != 0) goto L_0x0175
            cm.l.v(r0)     // Catch:{ Exception -> 0x0137 }
            r3 = r1
        L_0x0175:
            ni.dc r3 = r3.f26257h     // Catch:{ Exception -> 0x0137 }
            android.widget.TextView r3 = r3.f25961g     // Catch:{ Exception -> 0x0137 }
            ld.f r4 = r6.I1()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = r4.i()     // Catch:{ Exception -> 0x0137 }
            r3.setText(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = r6.w1()     // Catch:{ Exception -> 0x0137 }
            if (r3 == 0) goto L_0x01b8
            int r3 = r3.length()     // Catch:{ Exception -> 0x0137 }
            if (r3 != 0) goto L_0x0191
            goto L_0x01b8
        L_0x0191:
            ni.f6 r3 = r6.G     // Catch:{ Exception -> 0x0137 }
            if (r3 != 0) goto L_0x0199
            cm.l.v(r0)     // Catch:{ Exception -> 0x0137 }
            r3 = r1
        L_0x0199:
            ni.dc r3 = r3.f26257h     // Catch:{ Exception -> 0x0137 }
            androidx.cardview.widget.CardView r3 = r3.f25960f     // Catch:{ Exception -> 0x0137 }
            r3.setVisibility(r2)     // Catch:{ Exception -> 0x0137 }
            ni.f6 r2 = r6.G     // Catch:{ Exception -> 0x0137 }
            if (r2 != 0) goto L_0x01a8
            cm.l.v(r0)     // Catch:{ Exception -> 0x0137 }
            r2 = r1
        L_0x01a8:
            ni.dc r2 = r2.f26257h     // Catch:{ Exception -> 0x0137 }
            android.widget.ImageView r2 = r2.f25956b     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = r6.w1()     // Catch:{ Exception -> 0x0137 }
            android.graphics.Bitmap r3 = com.nic.mparivahan.dlservices.utilities.d.a(r3)     // Catch:{ Exception -> 0x0137 }
            r2.setImageBitmap(r3)     // Catch:{ Exception -> 0x0137 }
            goto L_0x01c9
        L_0x01b8:
            ni.f6 r2 = r6.G     // Catch:{ Exception -> 0x0137 }
            if (r2 != 0) goto L_0x01c0
            cm.l.v(r0)     // Catch:{ Exception -> 0x0137 }
            r2 = r1
        L_0x01c0:
            ni.dc r2 = r2.f26257h     // Catch:{ Exception -> 0x0137 }
            androidx.cardview.widget.CardView r2 = r2.f25960f     // Catch:{ Exception -> 0x0137 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x0137 }
        L_0x01c9:
            android.content.Intent r2 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = "address"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0137 }
            r6.f8074b0 = r2     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r2 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = "validity"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0137 }
            r6.f8076d0 = r2     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r2 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = "issuing_authority"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0137 }
            r6.f8075c0 = r2     // Catch:{ Exception -> 0x0137 }
            android.content.Intent r2 = r6.getIntent()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r3 = "cl_Status"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0137 }
            r6.f8077e0 = r2     // Catch:{ Exception -> 0x0137 }
            goto L_0x020d
        L_0x020a:
            r2.printStackTrace()
        L_0x020d:
            java.lang.String r2 = r6.D1()
            if (r2 == 0) goto L_0x022c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x021a
            goto L_0x022c
        L_0x021a:
            ni.f6 r2 = r6.G
            if (r2 != 0) goto L_0x0222
            cm.l.v(r0)
            goto L_0x0223
        L_0x0222:
            r1 = r2
        L_0x0223:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26258i
            java.lang.String r1 = r6.D1()
            r0.setText(r1)
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServicesMainScreens.MobileOtpScreen.O1():void");
    }

    /* access modifiers changed from: private */
    public final void P1(Intent intent) {
        intent.putExtra("dlValue", y1());
        intent.putExtra("dobValue", z1());
        intent.putExtra("fatherName", A1());
        intent.putExtra("clName", v1());
        intent.putExtra("clPhoto", w1());
        intent.putExtra("stateCode", K1());
        intent.putExtra("rtoCode", G1());
        intent.putExtra("rtoName", H1());
        intent.putExtra("stateName", L1());
        f6 f6Var = this.G;
        if (f6Var == null) {
            cm.l.v("mbBinding");
            f6Var = null;
        }
        intent.putExtra("Mobile_no", q.B0(String.valueOf(f6Var.f26258i.getText())).toString());
        intent.putExtra("address", this.f8074b0);
        intent.putExtra("validity", this.f8076d0);
        intent.putExtra("issuing_authority", this.f8075c0);
        intent.putExtra("cl_Status", this.f8077e0);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void Q1(MobileOtpScreen mobileOtpScreen, View view) {
        cm.l.f(mobileOtpScreen, "this$0");
        mobileOtpScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void R1(MobileOtpScreen mobileOtpScreen, View view) {
        String b10;
        cm.l.f(mobileOtpScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(mobileOtpScreen)) {
            f6 f6Var = mobileOtpScreen.G;
            f6 f6Var2 = null;
            if (f6Var == null) {
                cm.l.v("mbBinding");
                f6Var = null;
            }
            if (f6Var.f26254e.isChecked()) {
                f6 f6Var3 = mobileOtpScreen.G;
                if (f6Var3 == null) {
                    cm.l.v("mbBinding");
                    f6Var3 = null;
                }
                if (String.valueOf(f6Var3.f26258i.getText()).length() >= 10) {
                    c.a aVar = t8.c.f16582a;
                    f6 f6Var4 = mobileOtpScreen.G;
                    if (f6Var4 == null) {
                        cm.l.v("mbBinding");
                        f6Var4 = null;
                    }
                    if (aVar.q(String.valueOf(f6Var4.f26258i.getText()))) {
                        mobileOtpScreen.E1().show();
                        ba.b x12 = mobileOtpScreen.x1();
                        f6 f6Var5 = mobileOtpScreen.G;
                        if (f6Var5 == null) {
                            cm.l.v("mbBinding");
                        } else {
                            f6Var2 = f6Var5;
                        }
                        x12.F(mobileOtpScreen, String.valueOf(f6Var2.f26258i.getText()), mobileOtpScreen.J1().k());
                        return;
                    }
                }
                b10 = mobileOtpScreen.B1().b("label_log_entr_vali_mobno", mobileOtpScreen.getString(R.string.enter_mobile_no));
                cm.l.c(b10);
            } else {
                b10 = mobileOtpScreen.B1().b("plz_accept_term_conditions", mobileOtpScreen.getString(R.string.pls_enter_term_conditions));
            }
            mobileOtpScreen.W1(b10);
            return;
        }
        Toast.makeText(mobileOtpScreen.getApplicationContext(), mobileOtpScreen.B1().b("label_log_check_internet", mobileOtpScreen.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void S1(MobileOtpScreen mobileOtpScreen, View view) {
        cm.l.f(mobileOtpScreen, "this$0");
        f6 f6Var = mobileOtpScreen.G;
        f6 f6Var2 = null;
        if (f6Var == null) {
            cm.l.v("mbBinding");
            f6Var = null;
        }
        f6Var.f26258i.setText("");
        f6 f6Var3 = mobileOtpScreen.G;
        if (f6Var3 == null) {
            cm.l.v("mbBinding");
        } else {
            f6Var2 = f6Var3;
        }
        f6Var2.f26254e.setChecked(false);
    }

    /* access modifiers changed from: private */
    public static final void T1(MobileOtpScreen mobileOtpScreen, View view) {
        cm.l.f(mobileOtpScreen, "this$0");
        Dialog dialog = new Dialog(mobileOtpScreen.C1());
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
        ((ImageView) findViewById).setOnClickListener(new o0(dialog));
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + v9.d.f17494a.j() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void V1(MobileOtpScreen mobileOtpScreen, View view) {
        cm.l.f(mobileOtpScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(mobileOtpScreen)) {
            new ClMobileUpdateActivity().L1(mobileOtpScreen, mobileOtpScreen.y1(), mobileOtpScreen.u1(mobileOtpScreen.z1()), mobileOtpScreen.G1(), mobileOtpScreen.D1());
            return;
        }
        Toast.makeText(mobileOtpScreen.getApplicationContext(), mobileOtpScreen.B1().b("label_log_check_internet", mobileOtpScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public final void W1(String str) {
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
        ((TextView) findViewById3).setText(B1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(B1().b("btn_ok", "OK"));
        textView.setOnClickListener(new n0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void X1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void t2(MobileOtpScreen mobileOtpScreen, EditText editText, View view) {
        Toast makeText;
        ld.c B1;
        String string;
        String str;
        cm.l.f(mobileOtpScreen, "this$0");
        cm.l.f(editText, "$enterOtp");
        if (com.nic.mparivahan.a.f9624a.a(mobileOtpScreen)) {
            Editable text = editText.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                B1 = mobileOtpScreen.B1();
                string = mobileOtpScreen.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                cm.l.c(text2);
                if (text2.length() < 6) {
                    B1 = mobileOtpScreen.B1();
                    string = mobileOtpScreen.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    ba.b x12 = mobileOtpScreen.x1();
                    String obj = editText.getText().toString();
                    String str2 = mobileOtpScreen.O;
                    cm.l.c(str2);
                    x12.G(mobileOtpScreen, obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(mobileOtpScreen, B1.b(str, string), 0);
        } else {
            makeText = Toast.makeText(mobileOtpScreen.getApplicationContext(), mobileOtpScreen.B1().b("label_log_check_internet", mobileOtpScreen.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void u2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void v2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w2(EditText editText, ImageView imageView, View view) {
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
    public static final void x2(MobileOtpScreen mobileOtpScreen, TextView textView, TextView textView2, View view) {
        cm.l.f(mobileOtpScreen, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        mobileOtpScreen.x1().D(mobileOtpScreen, String.valueOf(mobileOtpScreen.O));
        new e(textView, mobileOtpScreen, textView2).start();
    }

    public final String A1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("fatherName");
        return null;
    }

    public final ld.c B1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final Context C1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final String D1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("mobileNumber");
        return null;
    }

    public final ProgressDialog E1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlServiceInt F1() {
        DlServiceInt dlServiceInt = this.M;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final String G1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final String H1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final f I1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final g J1() {
        g gVar = this.N;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final String K1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    public final String L1() {
        String str = this.f8073a0;
        if (str != null) {
            return str;
        }
        cm.l.v("stateName");
        return null;
    }

    public final TextView M1() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        cm.l.v("submitOtp");
        return null;
    }

    public final TextView N1() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void a2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.L = bVar;
    }

    public final void b2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void d2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void e2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void f2(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void h2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void i2(String str) {
        this.O = str;
    }

    public final void j2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.M = dlServiceInt;
    }

    public final void k2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void l2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void m2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void n2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.N = gVar;
    }

    public final void o2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f6 c10 = f6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        f6 f6Var = null;
        if (c10 == null) {
            cm.l.v("mbBinding");
            c10 = null;
        }
        setContentView((View) c10.b());
        O1();
        e.a aVar = v9.e.f17509a;
        f6 f6Var2 = this.G;
        if (f6Var2 == null) {
            cm.l.v("mbBinding");
            f6Var2 = null;
        }
        aVar.a0(this, f6Var2);
        f6 f6Var3 = this.G;
        if (f6Var3 == null) {
            cm.l.v("mbBinding");
            f6Var3 = null;
        }
        f6Var3.f26257h.f25959e.setOnClickListener(new g0(this));
        f6 f6Var4 = this.G;
        if (f6Var4 == null) {
            cm.l.v("mbBinding");
            f6Var4 = null;
        }
        f6Var4.f26253d.setOnClickListener(new j0(this));
        x1().u().g(this, new c(new a(this)));
        x1().E().g(this, new c(new b(this)));
        f6 f6Var5 = this.G;
        if (f6Var5 == null) {
            cm.l.v("mbBinding");
            f6Var5 = null;
        }
        f6Var5.f26259j.setOnClickListener(new k0(this));
        f6 f6Var6 = this.G;
        if (f6Var6 == null) {
            cm.l.v("mbBinding");
            f6Var6 = null;
        }
        f6Var6.f26251b.setOnClickListener(new l0(this));
        f6 f6Var7 = this.G;
        if (f6Var7 == null) {
            cm.l.v("mbBinding");
            f6Var7 = null;
        }
        AppCompatEditText appCompatEditText = f6Var7.f26258i;
        f6 f6Var8 = this.G;
        if (f6Var8 == null) {
            cm.l.v("mbBinding");
            f6Var8 = null;
        }
        appCompatEditText.setFocusable(String.valueOf(f6Var8.f26258i.getText()).length() <= 5);
        f6 f6Var9 = this.G;
        if (f6Var9 == null) {
            cm.l.v("mbBinding");
        } else {
            f6Var = f6Var9;
        }
        f6Var.f26266q.setOnClickListener(new m0(this));
    }

    public final void p2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8073a0 = str;
    }

    public final void q2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final void r2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final void s2(Context context, String str) {
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
        q2((TextView) findViewById4);
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        r2((TextView) findViewById7);
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.disPlay);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById9).setText(B1().b("otp_verification", getString(R.string.otp_verification)));
        M1().setText(B1().b("vahan_btn_submit", getString(R.string.submit)));
        N1().setText(B1().b("btn_reset", getString(R.string.reset)));
        textView.setText(B1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(B1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) findViewById10).setText(B1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(B1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                b10 = B1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView3.setText(b10);
        } catch (Exception unused) {
            textView3.setText(B1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new d(textView2, this, textView).start();
        imageView2.setOnClickListener(new p0(editText, imageView2));
        textView.setOnClickListener(new q0(this, textView2, textView));
        M1().setOnClickListener(new r0(this, editText));
        N1().setOnClickListener(new h0(editText));
        imageView.setOnClickListener(new i0(dialog));
        dialog.show();
    }

    public final String u1(String str) {
        cm.l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.c(parse);
            String format = simpleDateFormat2.format(parse);
            cm.l.e(format, "format(...)");
            return format;
        } catch (Exception unused) {
            return str;
        }
    }

    public final String v1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("clName");
        return null;
    }

    public final String w1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("clPhoto");
        return null;
    }

    public final ba.b x1() {
        ba.b bVar = this.L;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final String y1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final String z1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }
}
