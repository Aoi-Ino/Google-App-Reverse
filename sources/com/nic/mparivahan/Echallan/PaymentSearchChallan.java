package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cb.n;
import cb.o;
import cb.p;
import cb.q;
import cb.r;
import cb.s;
import cb.t;
import cb.u;
import cb.v;
import cb.w;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import fb.a;
import gb.a;
import java.util.ArrayList;
import ld.g;
import ni.y7;
import pl.x;
import wc.h;

public final class PaymentSearchChallan extends d {
    private AppCompatImageView G;
    private LinearLayout H;
    private RadioButton I;
    private LinearLayout J;
    private RadioButton K;
    private LinearLayout L;
    private LinearLayout M;
    private RadioButton N;
    /* access modifiers changed from: private */
    public EditText O;
    private AppCompatTextView P;
    private RelativeLayout Q;
    /* access modifiers changed from: private */
    public String R = "RC";
    private final String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private MyTextView T;
    private MyTextView U;
    private MyTextView V;
    private AppCompatImageView W;
    private AppCompatImageView X;
    private AppCompatImageView Y;
    private RelativeLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    private RelativeLayout f8753a0;

    /* renamed from: b0  reason: collision with root package name */
    private RelativeLayout f8754b0;

    /* renamed from: c0  reason: collision with root package name */
    private View f8755c0;

    /* renamed from: d0  reason: collision with root package name */
    private View f8756d0;

    /* renamed from: e0  reason: collision with root package name */
    private CheckedTextView f8757e0;

    /* renamed from: f0  reason: collision with root package name */
    private CheckedTextView f8758f0;

    /* renamed from: g0  reason: collision with root package name */
    private CheckedTextView f8759g0;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public int f8760h0;

    /* renamed from: i0  reason: collision with root package name */
    private y7 f8761i0;

    /* renamed from: j0  reason: collision with root package name */
    public cd.c f8762j0;

    /* renamed from: k0  reason: collision with root package name */
    public RcService f8763k0;

    /* renamed from: l0  reason: collision with root package name */
    public ProgressDialog f8764l0;

    /* renamed from: m0  reason: collision with root package name */
    public g f8765m0;

    /* renamed from: n0  reason: collision with root package name */
    public DatabaseHelper f8766n0;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f8767o0;

    /* renamed from: p0  reason: collision with root package name */
    public h f8768p0;

    /* renamed from: q0  reason: collision with root package name */
    public ld.c f8769q0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallan f8770e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PaymentSearchChallan paymentSearchChallan) {
            super(1);
            this.f8770e = paymentSearchChallan;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
            if (r1 == null) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
            if (r1 == null) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
            if (r1 == null) goto L_0x005b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.RC.Model.ValidateRcSuccess r7) {
            /*
                r6 = this;
                com.nic.mparivahan.Echallan.PaymentSearchChallan r0 = r6.f8770e
                android.app.ProgressDialog r0 = r0.v1()
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0015
                com.nic.mparivahan.Echallan.PaymentSearchChallan r0 = r6.f8770e
                android.app.ProgressDialog r0 = r0.v1()
                r0.dismiss()
            L_0x0015:
                java.lang.String r0 = r7.getStatusCode()
                java.lang.String r1 = "NP001"
                r2 = 1
                boolean r0 = km.p.o(r0, r1, r2)
                r1 = 2
                if (r0 == 0) goto L_0x008d
                com.nic.mparivahan.Echallan.PaymentSearchChallan r7 = r6.f8770e
                int r7 = r7.f8760h0
                java.lang.String r0 = "inputType"
                r3 = 0
                java.lang.String r4 = "inputEt"
                java.lang.String r5 = "inputValue"
                if (r7 == 0) goto L_0x007b
                if (r7 == r2) goto L_0x004a
                if (r7 == r1) goto L_0x0038
                goto L_0x00f8
            L_0x0038:
                android.content.Intent r7 = new android.content.Intent
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                java.lang.Class<com.nic.mparivahan.Echallan.ReprintReceiptActivity> r2 = com.nic.mparivahan.Echallan.ReprintReceiptActivity.class
                r7.<init>(r1, r2)
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                android.widget.EditText r1 = r1.O
                if (r1 != 0) goto L_0x005f
                goto L_0x005b
            L_0x004a:
                android.content.Intent r7 = new android.content.Intent
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                java.lang.Class<com.nic.mparivahan.Echallan.TranscationStatusActivity> r2 = com.nic.mparivahan.Echallan.TranscationStatusActivity.class
                r7.<init>(r1, r2)
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                android.widget.EditText r1 = r1.O
                if (r1 != 0) goto L_0x005f
            L_0x005b:
                cm.l.v(r4)
                goto L_0x0060
            L_0x005f:
                r3 = r1
            L_0x0060:
                android.text.Editable r1 = r3.getText()
                java.lang.String r1 = r1.toString()
                r7.putExtra(r5, r1)
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                java.lang.String r1 = r1.R
                r7.putExtra(r0, r1)
                com.nic.mparivahan.Echallan.PaymentSearchChallan r0 = r6.f8770e
                r0.startActivity(r7)
                goto L_0x00f8
            L_0x007b:
                android.content.Intent r7 = new android.content.Intent
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                java.lang.Class<com.nic.mparivahan.Echallan.PaymentSearchChallanList> r2 = com.nic.mparivahan.Echallan.PaymentSearchChallanList.class
                r7.<init>(r1, r2)
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                android.widget.EditText r1 = r1.O
                if (r1 != 0) goto L_0x005f
                goto L_0x005b
            L_0x008d:
                java.lang.String r0 = r7.getStatusCode()
                java.lang.String r3 = "NP985"
                boolean r0 = km.p.o(r0, r3, r2)
                if (r0 != 0) goto L_0x00ef
                java.lang.String r0 = r7.getStatusCode()
                java.lang.String r3 = "NR005"
                boolean r0 = km.p.o(r0, r3, r2)
                if (r0 == 0) goto L_0x00a6
                goto L_0x00ef
            L_0x00a6:
                java.lang.String r0 = r7.getStatusCode()
                java.lang.String r3 = "NR090"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x00be
                v9.d$a r0 = v9.d.f17494a
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                java.lang.String r7 = r7.getStatusDesc()
                r0.D(r1, r7, r2)
                goto L_0x00f8
            L_0x00be:
                java.lang.String r0 = r7.getStatusCode()
                java.lang.String r2 = "NR091"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x00d6
                v9.d$a r0 = v9.d.f17494a
                com.nic.mparivahan.Echallan.PaymentSearchChallan r2 = r6.f8770e
                java.lang.String r7 = r7.getStatusDesc()
                r0.D(r2, r7, r1)
                goto L_0x00f8
            L_0x00d6:
                com.nic.mparivahan.Echallan.PaymentSearchChallan r7 = r6.f8770e
                ld.c r0 = r7.w1()
                com.nic.mparivahan.Echallan.PaymentSearchChallan r1 = r6.f8770e
                r2 = 2132019106(0x7f1407a2, float:1.9676538E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "error_msg_record_not_found"
                java.lang.String r0 = r0.b(r2, r1)
                r7.Y1(r7, r0)
                goto L_0x00f8
            L_0x00ef:
                com.nic.mparivahan.Echallan.PaymentSearchChallan r0 = r6.f8770e
                java.lang.String r7 = r7.getStatusDesc()
                r0.Y1(r0, r7)
            L_0x00f8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallan.a.b(com.nic.mparivahan.RC.Model.ValidateRcSuccess):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ValidateRcSuccess) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallan f8771e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PaymentSearchChallan paymentSearchChallan) {
            super(1);
            this.f8771e = paymentSearchChallan;
        }

        public final void b(String str) {
            if (this.f8771e.v1().isShowing()) {
                this.f8771e.v1().dismiss();
            }
            PaymentSearchChallan paymentSearchChallan = this.f8771e;
            paymentSearchChallan.Y1(paymentSearchChallan, paymentSearchChallan.w1().b("error_msg_record_not_found", this.f8771e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8772a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8772a = lVar;
        }

        public final pl.c a() {
            return this.f8772a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8772a.invoke(obj);
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

    private final void B1() {
        V1(new g(this));
        S1(RcService.f9484a.c(this));
        T1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(x1()))).a(cd.c.class));
        View findViewById = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById, "findViewById(...)");
        this.G = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(R.id.vehicleDetailsLl);
        cm.l.e(findViewById2, "findViewById(...)");
        this.L = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.challanNoLl);
        cm.l.e(findViewById3, "findViewById(...)");
        this.H = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.challanNoRb);
        cm.l.e(findViewById4, "findViewById(...)");
        this.I = (RadioButton) findViewById4;
        View findViewById5 = findViewById(R.id.vehicleNoLl);
        cm.l.e(findViewById5, "findViewById(...)");
        this.J = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(R.id.vehicleNoRb);
        cm.l.e(findViewById6, "findViewById(...)");
        this.K = (RadioButton) findViewById6;
        View findViewById7 = findViewById(R.id.drivingLicenseLl);
        cm.l.e(findViewById7, "findViewById(...)");
        this.M = (LinearLayout) findViewById7;
        View findViewById8 = findViewById(R.id.dLNoRb);
        cm.l.e(findViewById8, "findViewById(...)");
        this.N = (RadioButton) findViewById8;
        View findViewById9 = findViewById(R.id.inputEt);
        cm.l.e(findViewById9, "findViewById(...)");
        EditText editText = (EditText) findViewById9;
        this.O = editText;
        RelativeLayout relativeLayout = null;
        if (editText == null) {
            cm.l.v("inputEt");
            editText = null;
        }
        EditText editText2 = this.O;
        if (editText2 == null) {
            cm.l.v("inputEt");
            editText2 = null;
        }
        InputFilter[] filters = editText2.getFilters();
        cm.l.e(filters, "getFilters(...)");
        editText.setFilters((InputFilter[]) l.p(filters, new InputFilter.AllCaps()));
        View findViewById10 = findViewById(R.id.getDetailsTv);
        cm.l.e(findViewById10, "findViewById(...)");
        this.P = (AppCompatTextView) findViewById10;
        View findViewById11 = findViewById(R.id.nexGenHolder);
        cm.l.e(findViewById11, "findViewById(...)");
        this.Q = (RelativeLayout) findViewById11;
        View findViewById12 = findViewById(R.id.transcationStatusRl);
        cm.l.e(findViewById12, "findViewById(...)");
        this.Z = (RelativeLayout) findViewById12;
        View findViewById13 = findViewById(R.id.reprintReceiptRl);
        cm.l.e(findViewById13, "findViewById(...)");
        this.f8753a0 = (RelativeLayout) findViewById13;
        View findViewById14 = findViewById(R.id.payChallanRl);
        cm.l.e(findViewById14, "findViewById(...)");
        this.f8754b0 = (RelativeLayout) findViewById14;
        View findViewById15 = findViewById(R.id.payChallanTv);
        cm.l.e(findViewById15, "findViewById(...)");
        this.T = (MyTextView) findViewById15;
        View findViewById16 = findViewById(R.id.transactionTv);
        cm.l.e(findViewById16, "findViewById(...)");
        this.U = (MyTextView) findViewById16;
        View findViewById17 = findViewById(R.id.reprintReceiptTv);
        cm.l.e(findViewById17, "findViewById(...)");
        this.V = (MyTextView) findViewById17;
        View findViewById18 = findViewById(R.id.payChallanIv);
        cm.l.e(findViewById18, "findViewById(...)");
        this.W = (AppCompatImageView) findViewById18;
        View findViewById19 = findViewById(R.id.transStatusIv);
        cm.l.e(findViewById19, "findViewById(...)");
        this.X = (AppCompatImageView) findViewById19;
        View findViewById20 = findViewById(R.id.reprintReceiptIv);
        cm.l.e(findViewById20, "findViewById(...)");
        this.Y = (AppCompatImageView) findViewById20;
        View findViewById21 = findViewById(R.id.paymentView);
        cm.l.e(findViewById21, "findViewById(...)");
        this.f8755c0 = findViewById21;
        View findViewById22 = findViewById(R.id.receiptView);
        cm.l.e(findViewById22, "findViewById(...)");
        this.f8756d0 = findViewById22;
        View findViewById23 = findViewById(R.id.challanDetailsCb);
        cm.l.e(findViewById23, "findViewById(...)");
        this.f8757e0 = (CheckedTextView) findViewById23;
        View findViewById24 = findViewById(R.id.paymentCb);
        cm.l.e(findViewById24, "findViewById(...)");
        this.f8758f0 = (CheckedTextView) findViewById24;
        View findViewById25 = findViewById(R.id.receiptCb);
        cm.l.e(findViewById25, "findViewById(...)");
        this.f8759g0 = (CheckedTextView) findViewById25;
        a.C0153a aVar = gb.a.f11754a;
        y7 y7Var = this.f8761i0;
        if (y7Var == null) {
            cm.l.v("binding");
            y7Var = null;
        }
        EditText editText3 = y7Var.f29488j;
        cm.l.e(editText3, "engineEt");
        aVar.a(this, editText3);
        y7 y7Var2 = this.f8761i0;
        if (y7Var2 == null) {
            cm.l.v("binding");
            y7Var2 = null;
        }
        EditText editText4 = y7Var2.f29491m;
        cm.l.e(editText4, "inputEt");
        aVar.a(this, editText4);
        y7 y7Var3 = this.f8761i0;
        if (y7Var3 == null) {
            cm.l.v("binding");
            y7Var3 = null;
        }
        EditText editText5 = y7Var3.f29484f;
        cm.l.e(editText5, "chasisEt");
        aVar.a(this, editText5);
        RadioButton radioButton = this.I;
        if (radioButton == null) {
            cm.l.v("challanNoRb");
            radioButton = null;
        }
        radioButton.setOnClickListener(new p(this));
        RadioButton radioButton2 = this.K;
        if (radioButton2 == null) {
            cm.l.v("vehicleNoRb");
            radioButton2 = null;
        }
        radioButton2.setOnClickListener(new q(this));
        RadioButton radioButton3 = this.N;
        if (radioButton3 == null) {
            cm.l.v("dlNoRb");
            radioButton3 = null;
        }
        radioButton3.setOnClickListener(new r(this));
        AppCompatTextView appCompatTextView = this.P;
        if (appCompatTextView == null) {
            cm.l.v("getDetails");
            appCompatTextView = null;
        }
        appCompatTextView.setOnClickListener(new s(this));
        y7 y7Var4 = this.f8761i0;
        if (y7Var4 == null) {
            cm.l.v("binding");
            y7Var4 = null;
        }
        y7Var4.P.setOnClickListener(new t(this));
        AppCompatImageView appCompatImageView = this.G;
        if (appCompatImageView == null) {
            cm.l.v("backBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new u(this));
        RelativeLayout relativeLayout2 = this.Q;
        if (relativeLayout2 == null) {
            cm.l.v("nexGenHolder");
            relativeLayout2 = null;
        }
        relativeLayout2.setOnClickListener(new v(this));
        RelativeLayout relativeLayout3 = this.f8754b0;
        if (relativeLayout3 == null) {
            cm.l.v("payChallanRl");
            relativeLayout3 = null;
        }
        relativeLayout3.setOnClickListener(new w(this));
        RelativeLayout relativeLayout4 = this.Z;
        if (relativeLayout4 == null) {
            cm.l.v("transcationStatusRl");
            relativeLayout4 = null;
        }
        relativeLayout4.setOnClickListener(new cb.x(this));
        RelativeLayout relativeLayout5 = this.f8753a0;
        if (relativeLayout5 == null) {
            cm.l.v("reprintReceiptRl");
        } else {
            relativeLayout = relativeLayout5;
        }
        relativeLayout.setOnClickListener(new o(this));
    }

    /* access modifiers changed from: private */
    public static final void C1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        RadioButton radioButton = paymentSearchChallan.I;
        LinearLayout linearLayout = null;
        if (radioButton == null) {
            cm.l.v("challanNoRb");
            radioButton = null;
        }
        if (!radioButton.isSelected()) {
            y7 y7Var = paymentSearchChallan.f8761i0;
            if (y7Var == null) {
                cm.l.v("binding");
                y7Var = null;
            }
            y7Var.f29501w.setVisibility(8);
            y7 y7Var2 = paymentSearchChallan.f8761i0;
            if (y7Var2 == null) {
                cm.l.v("binding");
                y7Var2 = null;
            }
            y7Var2.R.setVisibility(8);
            y7 y7Var3 = paymentSearchChallan.f8761i0;
            if (y7Var3 == null) {
                cm.l.v("binding");
                y7Var3 = null;
            }
            y7Var3.Q.setVisibility(8);
            RadioButton radioButton2 = paymentSearchChallan.I;
            if (radioButton2 == null) {
                cm.l.v("challanNoRb");
                radioButton2 = null;
            }
            radioButton2.setChecked(true);
            RadioButton radioButton3 = paymentSearchChallan.I;
            if (radioButton3 == null) {
                cm.l.v("challanNoRb");
                radioButton3 = null;
            }
            radioButton3.setSelected(true);
            LinearLayout linearLayout2 = paymentSearchChallan.H;
            if (linearLayout2 == null) {
                cm.l.v("challanNoLl");
                linearLayout2 = null;
            }
            linearLayout2.setBackgroundResource(R.drawable.corner_circle_14_selected);
            RadioButton radioButton4 = paymentSearchChallan.K;
            if (radioButton4 == null) {
                cm.l.v("vehicleNoRb");
                radioButton4 = null;
            }
            radioButton4.setChecked(false);
            RadioButton radioButton5 = paymentSearchChallan.K;
            if (radioButton5 == null) {
                cm.l.v("vehicleNoRb");
                radioButton5 = null;
            }
            radioButton5.setSelected(false);
            LinearLayout linearLayout3 = paymentSearchChallan.J;
            if (linearLayout3 == null) {
                cm.l.v("vehicleNoLl");
                linearLayout3 = null;
            }
            linearLayout3.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton6 = paymentSearchChallan.N;
            if (radioButton6 == null) {
                cm.l.v("dlNoRb");
                radioButton6 = null;
            }
            radioButton6.setChecked(false);
            RadioButton radioButton7 = paymentSearchChallan.N;
            if (radioButton7 == null) {
                cm.l.v("dlNoRb");
                radioButton7 = null;
            }
            radioButton7.setSelected(false);
            LinearLayout linearLayout4 = paymentSearchChallan.M;
            if (linearLayout4 == null) {
                cm.l.v("dlNoLl");
                linearLayout4 = null;
            }
            linearLayout4.setBackgroundResource(R.drawable.corner_circle_bg_14);
            EditText editText = paymentSearchChallan.O;
            if (editText == null) {
                cm.l.v("inputEt");
                editText = null;
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText2 = paymentSearchChallan.O;
            if (editText2 == null) {
                cm.l.v("inputEt");
                editText2 = null;
            }
            editText2.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
            EditText editText3 = paymentSearchChallan.O;
            if (editText3 == null) {
                cm.l.v("inputEt");
                editText3 = null;
            }
            editText3.setHint(paymentSearchChallan.w1().b("label_challan_enter_challan_no", paymentSearchChallan.getString(R.string.enter_challan_no)));
            LinearLayout linearLayout5 = paymentSearchChallan.L;
            if (linearLayout5 == null) {
                cm.l.v("vehicleDetailsLl");
                linearLayout5 = null;
            }
            linearLayout5.setVisibility(8);
            paymentSearchChallan.R = "Challan";
            EditText editText4 = paymentSearchChallan.O;
            if (editText4 == null) {
                cm.l.v("inputEt");
                editText4 = null;
            }
            editText4.setError((CharSequence) null);
            return;
        }
        RadioButton radioButton8 = paymentSearchChallan.I;
        if (radioButton8 == null) {
            cm.l.v("challanNoRb");
            radioButton8 = null;
        }
        radioButton8.setChecked(false);
        RadioButton radioButton9 = paymentSearchChallan.I;
        if (radioButton9 == null) {
            cm.l.v("challanNoRb");
            radioButton9 = null;
        }
        radioButton9.setSelected(false);
        paymentSearchChallan.R = "";
        LinearLayout linearLayout6 = paymentSearchChallan.H;
        if (linearLayout6 == null) {
            cm.l.v("challanNoLl");
        } else {
            linearLayout = linearLayout6;
        }
        linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void D1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        RadioButton radioButton = paymentSearchChallan.K;
        y7 y7Var = null;
        if (radioButton == null) {
            cm.l.v("vehicleNoRb");
            radioButton = null;
        }
        if (!radioButton.isSelected()) {
            RadioButton radioButton2 = paymentSearchChallan.I;
            if (radioButton2 == null) {
                cm.l.v("challanNoRb");
                radioButton2 = null;
            }
            radioButton2.setChecked(false);
            RadioButton radioButton3 = paymentSearchChallan.I;
            if (radioButton3 == null) {
                cm.l.v("challanNoRb");
                radioButton3 = null;
            }
            radioButton3.setSelected(false);
            LinearLayout linearLayout = paymentSearchChallan.H;
            if (linearLayout == null) {
                cm.l.v("challanNoLl");
                linearLayout = null;
            }
            linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton4 = paymentSearchChallan.K;
            if (radioButton4 == null) {
                cm.l.v("vehicleNoRb");
                radioButton4 = null;
            }
            radioButton4.setChecked(true);
            RadioButton radioButton5 = paymentSearchChallan.K;
            if (radioButton5 == null) {
                cm.l.v("vehicleNoRb");
                radioButton5 = null;
            }
            radioButton5.setSelected(true);
            LinearLayout linearLayout2 = paymentSearchChallan.J;
            if (linearLayout2 == null) {
                cm.l.v("vehicleNoLl");
                linearLayout2 = null;
            }
            linearLayout2.setBackgroundResource(R.drawable.corner_circle_14_selected);
            RadioButton radioButton6 = paymentSearchChallan.N;
            if (radioButton6 == null) {
                cm.l.v("dlNoRb");
                radioButton6 = null;
            }
            radioButton6.setChecked(false);
            RadioButton radioButton7 = paymentSearchChallan.N;
            if (radioButton7 == null) {
                cm.l.v("dlNoRb");
                radioButton7 = null;
            }
            radioButton7.setSelected(false);
            LinearLayout linearLayout3 = paymentSearchChallan.M;
            if (linearLayout3 == null) {
                cm.l.v("dlNoLl");
                linearLayout3 = null;
            }
            linearLayout3.setBackgroundResource(R.drawable.corner_circle_bg_14);
            EditText editText = paymentSearchChallan.O;
            if (editText == null) {
                cm.l.v("inputEt");
                editText = null;
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText2 = paymentSearchChallan.O;
            if (editText2 == null) {
                cm.l.v("inputEt");
                editText2 = null;
            }
            editText2.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
            EditText editText3 = paymentSearchChallan.O;
            if (editText3 == null) {
                cm.l.v("inputEt");
                editText3 = null;
            }
            editText3.setHint(paymentSearchChallan.w1().b("label_challan_enter_vehicle_no", paymentSearchChallan.getString(R.string.enter_vehicle_number)));
            LinearLayout linearLayout4 = paymentSearchChallan.L;
            if (linearLayout4 == null) {
                cm.l.v("vehicleDetailsLl");
                linearLayout4 = null;
            }
            linearLayout4.setVisibility(0);
            paymentSearchChallan.R = "RC";
            EditText editText4 = paymentSearchChallan.O;
            if (editText4 == null) {
                cm.l.v("inputEt");
                editText4 = null;
            }
            editText4.setError((CharSequence) null);
            y7 y7Var2 = paymentSearchChallan.f8761i0;
            if (y7Var2 == null) {
                cm.l.v("binding");
                y7Var2 = null;
            }
            y7Var2.M.setVisibility(0);
            y7 y7Var3 = paymentSearchChallan.f8761i0;
            if (y7Var3 == null) {
                cm.l.v("binding");
            } else {
                y7Var = y7Var3;
            }
            y7Var.Q.setVisibility(8);
            paymentSearchChallan.W1();
            return;
        }
        RadioButton radioButton8 = paymentSearchChallan.K;
        if (radioButton8 == null) {
            cm.l.v("vehicleNoRb");
            radioButton8 = null;
        }
        radioButton8.setChecked(false);
        RadioButton radioButton9 = paymentSearchChallan.K;
        if (radioButton9 == null) {
            cm.l.v("vehicleNoRb");
            radioButton9 = null;
        }
        radioButton9.setSelected(false);
        paymentSearchChallan.R = "";
        LinearLayout linearLayout5 = paymentSearchChallan.L;
        if (linearLayout5 == null) {
            cm.l.v("vehicleDetailsLl");
            linearLayout5 = null;
        }
        linearLayout5.setVisibility(8);
        LinearLayout linearLayout6 = paymentSearchChallan.J;
        if (linearLayout6 == null) {
            cm.l.v("vehicleNoLl");
            linearLayout6 = null;
        }
        linearLayout6.setBackgroundResource(R.drawable.corner_circle_bg_14);
        y7 y7Var4 = paymentSearchChallan.f8761i0;
        if (y7Var4 == null) {
            cm.l.v("binding");
            y7Var4 = null;
        }
        y7Var4.f29501w.setVisibility(8);
        y7 y7Var5 = paymentSearchChallan.f8761i0;
        if (y7Var5 == null) {
            cm.l.v("binding");
        } else {
            y7Var = y7Var5;
        }
        y7Var.R.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void E1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        RadioButton radioButton = paymentSearchChallan.N;
        y7 y7Var = null;
        if (radioButton == null) {
            cm.l.v("dlNoRb");
            radioButton = null;
        }
        if (!radioButton.isSelected()) {
            y7 y7Var2 = paymentSearchChallan.f8761i0;
            if (y7Var2 == null) {
                cm.l.v("binding");
                y7Var2 = null;
            }
            y7Var2.f29501w.setVisibility(8);
            y7 y7Var3 = paymentSearchChallan.f8761i0;
            if (y7Var3 == null) {
                cm.l.v("binding");
                y7Var3 = null;
            }
            y7Var3.R.setVisibility(8);
            RadioButton radioButton2 = paymentSearchChallan.I;
            if (radioButton2 == null) {
                cm.l.v("challanNoRb");
                radioButton2 = null;
            }
            radioButton2.setChecked(false);
            RadioButton radioButton3 = paymentSearchChallan.I;
            if (radioButton3 == null) {
                cm.l.v("challanNoRb");
                radioButton3 = null;
            }
            radioButton3.setSelected(false);
            LinearLayout linearLayout = paymentSearchChallan.H;
            if (linearLayout == null) {
                cm.l.v("challanNoLl");
                linearLayout = null;
            }
            linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton4 = paymentSearchChallan.K;
            if (radioButton4 == null) {
                cm.l.v("vehicleNoRb");
                radioButton4 = null;
            }
            radioButton4.setChecked(false);
            RadioButton radioButton5 = paymentSearchChallan.K;
            if (radioButton5 == null) {
                cm.l.v("vehicleNoRb");
                radioButton5 = null;
            }
            radioButton5.setSelected(false);
            LinearLayout linearLayout2 = paymentSearchChallan.J;
            if (linearLayout2 == null) {
                cm.l.v("vehicleNoLl");
                linearLayout2 = null;
            }
            linearLayout2.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton6 = paymentSearchChallan.N;
            if (radioButton6 == null) {
                cm.l.v("dlNoRb");
                radioButton6 = null;
            }
            radioButton6.setChecked(true);
            RadioButton radioButton7 = paymentSearchChallan.N;
            if (radioButton7 == null) {
                cm.l.v("dlNoRb");
                radioButton7 = null;
            }
            radioButton7.setSelected(true);
            LinearLayout linearLayout3 = paymentSearchChallan.M;
            if (linearLayout3 == null) {
                cm.l.v("dlNoLl");
                linearLayout3 = null;
            }
            linearLayout3.setBackgroundResource(R.drawable.corner_circle_14_selected);
            EditText editText = paymentSearchChallan.O;
            if (editText == null) {
                cm.l.v("inputEt");
                editText = null;
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText2 = paymentSearchChallan.O;
            if (editText2 == null) {
                cm.l.v("inputEt");
                editText2 = null;
            }
            editText2.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
            LinearLayout linearLayout4 = paymentSearchChallan.L;
            if (linearLayout4 == null) {
                cm.l.v("vehicleDetailsLl");
                linearLayout4 = null;
            }
            linearLayout4.setVisibility(8);
            EditText editText3 = paymentSearchChallan.O;
            if (editText3 == null) {
                cm.l.v("inputEt");
                editText3 = null;
            }
            editText3.setHint(paymentSearchChallan.w1().b("label_challan_enter_dl_no", paymentSearchChallan.getString(R.string.enter_dl_number)));
            paymentSearchChallan.R = "DL";
            EditText editText4 = paymentSearchChallan.O;
            if (editText4 == null) {
                cm.l.v("inputEt");
                editText4 = null;
            }
            editText4.setError((CharSequence) null);
            y7 y7Var4 = paymentSearchChallan.f8761i0;
            if (y7Var4 == null) {
                cm.l.v("binding");
            } else {
                y7Var = y7Var4;
            }
            y7Var.M.setVisibility(8);
            paymentSearchChallan.X1();
            return;
        }
        RadioButton radioButton8 = paymentSearchChallan.N;
        if (radioButton8 == null) {
            cm.l.v("dlNoRb");
            radioButton8 = null;
        }
        radioButton8.setChecked(false);
        RadioButton radioButton9 = paymentSearchChallan.N;
        if (radioButton9 == null) {
            cm.l.v("dlNoRb");
            radioButton9 = null;
        }
        radioButton9.setSelected(false);
        paymentSearchChallan.R = "";
        LinearLayout linearLayout5 = paymentSearchChallan.M;
        if (linearLayout5 == null) {
            cm.l.v("dlNoLl");
            linearLayout5 = null;
        }
        linearLayout5.setBackgroundResource(R.drawable.corner_circle_bg_14);
        y7 y7Var5 = paymentSearchChallan.f8761i0;
        if (y7Var5 == null) {
            cm.l.v("binding");
        } else {
            y7Var = y7Var5;
        }
        y7Var.Q.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r4 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        cm.l.v("inputEt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r7.putExtra("inputValue", r1.getText().toString());
        r7.putExtra("inputType", r6.R);
        r6.startActivity(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r4 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r4 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void F1(com.nic.mparivahan.Echallan.PaymentSearchChallan r6, android.view.View r7) {
        /*
            java.lang.String r7 = "this$0"
            cm.l.f(r6, r7)
            boolean r7 = r6.a2()
            if (r7 != 0) goto L_0x0082
            java.lang.String r7 = r6.R
            boolean r7 = com.nic.mparivahan.dlservices.utilities.d.d(r7)
            if (r7 == 0) goto L_0x0082
            int r7 = r6.f8760h0
            java.lang.String r0 = "inputType"
            r1 = 0
            java.lang.String r2 = "inputEt"
            java.lang.String r3 = "inputValue"
            java.lang.String r4 = "RC"
            if (r7 == 0) goto L_0x006d
            r5 = 1
            if (r7 == r5) goto L_0x0058
            r5 = 2
            if (r7 == r5) goto L_0x0028
            goto L_0x009b
        L_0x0028:
            java.lang.String r7 = r6.R
            boolean r7 = cm.l.a(r7, r4)
            if (r7 == 0) goto L_0x0034
        L_0x0030:
            r6.b2()
            goto L_0x009b
        L_0x0034:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Echallan.ReprintReceiptActivity> r4 = com.nic.mparivahan.Echallan.ReprintReceiptActivity.class
            r7.<init>(r6, r4)
            android.widget.EditText r4 = r6.O
            if (r4 != 0) goto L_0x0043
        L_0x003f:
            cm.l.v(r2)
            goto L_0x0044
        L_0x0043:
            r1 = r4
        L_0x0044:
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r7.putExtra(r3, r1)
            java.lang.String r1 = r6.R
            r7.putExtra(r0, r1)
            r6.startActivity(r7)
            goto L_0x009b
        L_0x0058:
            java.lang.String r7 = r6.R
            boolean r7 = cm.l.a(r7, r4)
            if (r7 == 0) goto L_0x0061
            goto L_0x0030
        L_0x0061:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Echallan.TranscationStatusActivity> r4 = com.nic.mparivahan.Echallan.TranscationStatusActivity.class
            r7.<init>(r6, r4)
            android.widget.EditText r4 = r6.O
            if (r4 != 0) goto L_0x0043
            goto L_0x003f
        L_0x006d:
            java.lang.String r7 = r6.R
            boolean r7 = cm.l.a(r7, r4)
            if (r7 == 0) goto L_0x0076
            goto L_0x0030
        L_0x0076:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Echallan.PaymentSearchChallanList> r4 = com.nic.mparivahan.Echallan.PaymentSearchChallanList.class
            r7.<init>(r6, r4)
            android.widget.EditText r4 = r6.O
            if (r4 != 0) goto L_0x0043
            goto L_0x003f
        L_0x0082:
            java.lang.String r7 = r6.R
            java.lang.String r0 = ""
            boolean r7 = cm.l.a(r7, r0)
            if (r7 == 0) goto L_0x009b
            ld.c r7 = r6.w1()
            java.lang.String r0 = "label_challan_please_select_one_search_type"
            java.lang.String r1 = "Please select one search type"
            java.lang.String r7 = r7.b(r0, r1)
            r6.Y1(r6, r7)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallan.F1(com.nic.mparivahan.Echallan.PaymentSearchChallan, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void G1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        y7 y7Var = null;
        if (paymentSearchChallan.f8760h0 == 0) {
            Intent intent = new Intent(paymentSearchChallan, PaymentSearchChallanList.class);
            y7 y7Var2 = paymentSearchChallan.f8761i0;
            if (y7Var2 == null) {
                cm.l.v("binding");
                y7Var2 = null;
            }
            intent.putExtra("inputValue", y7Var2.f29500v.getText().toString());
            intent.putExtra("inputType", "DL");
            paymentSearchChallan.startActivity(intent);
        }
        if (paymentSearchChallan.f8760h0 == 1) {
            Intent intent2 = new Intent(paymentSearchChallan, TranscationStatusActivity.class);
            y7 y7Var3 = paymentSearchChallan.f8761i0;
            if (y7Var3 == null) {
                cm.l.v("binding");
                y7Var3 = null;
            }
            intent2.putExtra("inputValue", y7Var3.f29500v.getText().toString());
            intent2.putExtra("inputType", "DL");
            paymentSearchChallan.startActivity(intent2);
        }
        if (paymentSearchChallan.f8760h0 == 2) {
            Intent intent3 = new Intent(paymentSearchChallan, ReprintReceiptActivity.class);
            y7 y7Var4 = paymentSearchChallan.f8761i0;
            if (y7Var4 == null) {
                cm.l.v("binding");
            } else {
                y7Var = y7Var4;
            }
            intent3.putExtra("inputValue", y7Var.f29500v.getText().toString());
            intent3.putExtra("inputType", "DL");
            paymentSearchChallan.startActivity(intent3);
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        paymentSearchChallan.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void I1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        paymentSearchChallan.N1();
    }

    /* access modifiers changed from: private */
    public static final void J1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        paymentSearchChallan.f8760h0 = 0;
        paymentSearchChallan.W1();
        y7 y7Var = paymentSearchChallan.f8761i0;
        CheckedTextView checkedTextView = null;
        if (y7Var == null) {
            cm.l.v("binding");
            y7Var = null;
        }
        y7Var.Q.setVisibility(8);
        RadioButton radioButton = paymentSearchChallan.I;
        if (radioButton == null) {
            cm.l.v("challanNoRb");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton2 = paymentSearchChallan.I;
        if (radioButton2 == null) {
            cm.l.v("challanNoRb");
            radioButton2 = null;
        }
        radioButton2.setSelected(false);
        LinearLayout linearLayout = paymentSearchChallan.H;
        if (linearLayout == null) {
            cm.l.v("challanNoLl");
            linearLayout = null;
        }
        linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
        RadioButton radioButton3 = paymentSearchChallan.K;
        if (radioButton3 == null) {
            cm.l.v("vehicleNoRb");
            radioButton3 = null;
        }
        radioButton3.setChecked(true);
        RadioButton radioButton4 = paymentSearchChallan.K;
        if (radioButton4 == null) {
            cm.l.v("vehicleNoRb");
            radioButton4 = null;
        }
        radioButton4.setSelected(true);
        LinearLayout linearLayout2 = paymentSearchChallan.J;
        if (linearLayout2 == null) {
            cm.l.v("vehicleNoLl");
            linearLayout2 = null;
        }
        linearLayout2.setBackgroundResource(R.drawable.corner_circle_14_selected);
        RadioButton radioButton5 = paymentSearchChallan.N;
        if (radioButton5 == null) {
            cm.l.v("dlNoRb");
            radioButton5 = null;
        }
        radioButton5.setChecked(false);
        RadioButton radioButton6 = paymentSearchChallan.N;
        if (radioButton6 == null) {
            cm.l.v("dlNoRb");
            radioButton6 = null;
        }
        radioButton6.setSelected(false);
        EditText editText = paymentSearchChallan.O;
        if (editText == null) {
            cm.l.v("inputEt");
            editText = null;
        }
        editText.setText("");
        LinearLayout linearLayout3 = paymentSearchChallan.M;
        if (linearLayout3 == null) {
            cm.l.v("dlNoLl");
            linearLayout3 = null;
        }
        linearLayout3.setBackgroundResource(R.drawable.corner_circle_bg_14);
        LinearLayout linearLayout4 = paymentSearchChallan.L;
        if (linearLayout4 == null) {
            cm.l.v("vehicleDetailsLl");
            linearLayout4 = null;
        }
        linearLayout4.setVisibility(0);
        EditText editText2 = paymentSearchChallan.O;
        if (editText2 == null) {
            cm.l.v("inputEt");
            editText2 = null;
        }
        editText2.setHint(paymentSearchChallan.w1().b("label_challan_enter_vehicle_no", paymentSearchChallan.getString(R.string.enter_vehicle_number)));
        RelativeLayout relativeLayout = paymentSearchChallan.f8754b0;
        if (relativeLayout == null) {
            cm.l.v("payChallanRl");
            relativeLayout = null;
        }
        relativeLayout.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.corner_rectangle_bg_17));
        RelativeLayout relativeLayout2 = paymentSearchChallan.Z;
        if (relativeLayout2 == null) {
            cm.l.v("transcationStatusRl");
            relativeLayout2 = null;
        }
        relativeLayout2.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.nexgendashboardmenu));
        RelativeLayout relativeLayout3 = paymentSearchChallan.f8753a0;
        if (relativeLayout3 == null) {
            cm.l.v("reprintReceiptRl");
            relativeLayout3 = null;
        }
        relativeLayout3.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.nexgendashboardmenu));
        MyTextView myTextView = paymentSearchChallan.T;
        if (myTextView == null) {
            cm.l.v("payChallanTv");
            myTextView = null;
        }
        myTextView.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.white));
        MyTextView myTextView2 = paymentSearchChallan.U;
        if (myTextView2 == null) {
            cm.l.v("transactionTv");
            myTextView2 = null;
        }
        myTextView2.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.black));
        MyTextView myTextView3 = paymentSearchChallan.V;
        if (myTextView3 == null) {
            cm.l.v("reprintReceiptTv");
            myTextView3 = null;
        }
        myTextView3.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.black));
        AppCompatImageView appCompatImageView = paymentSearchChallan.W;
        if (appCompatImageView == null) {
            cm.l.v("payChallanIv");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(R.drawable.ic_pay_challan);
        AppCompatImageView appCompatImageView2 = paymentSearchChallan.X;
        if (appCompatImageView2 == null) {
            cm.l.v("transStatusIv");
            appCompatImageView2 = null;
        }
        appCompatImageView2.setImageResource(R.drawable.tax_nexgen);
        AppCompatImageView appCompatImageView3 = paymentSearchChallan.Y;
        if (appCompatImageView3 == null) {
            cm.l.v("reprintReceiptIv");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setImageResource(R.drawable.tax_nexgen);
        CheckedTextView checkedTextView2 = paymentSearchChallan.f8757e0;
        if (checkedTextView2 == null) {
            cm.l.v("challanDetailsCb");
            checkedTextView2 = null;
        }
        checkedTextView2.setChecked(true);
        CheckedTextView checkedTextView3 = paymentSearchChallan.f8758f0;
        if (checkedTextView3 == null) {
            cm.l.v("paymentCb");
            checkedTextView3 = null;
        }
        checkedTextView3.setChecked(false);
        CheckedTextView checkedTextView4 = paymentSearchChallan.f8759g0;
        if (checkedTextView4 == null) {
            cm.l.v("receiptCb");
        } else {
            checkedTextView = checkedTextView4;
        }
        checkedTextView.setChecked(false);
    }

    /* access modifiers changed from: private */
    public static final void K1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        paymentSearchChallan.f8760h0 = 1;
        paymentSearchChallan.W1();
        y7 y7Var = paymentSearchChallan.f8761i0;
        CheckedTextView checkedTextView = null;
        if (y7Var == null) {
            cm.l.v("binding");
            y7Var = null;
        }
        y7Var.Q.setVisibility(8);
        RadioButton radioButton = paymentSearchChallan.I;
        if (radioButton == null) {
            cm.l.v("challanNoRb");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton2 = paymentSearchChallan.I;
        if (radioButton2 == null) {
            cm.l.v("challanNoRb");
            radioButton2 = null;
        }
        radioButton2.setSelected(false);
        LinearLayout linearLayout = paymentSearchChallan.H;
        if (linearLayout == null) {
            cm.l.v("challanNoLl");
            linearLayout = null;
        }
        linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
        RadioButton radioButton3 = paymentSearchChallan.K;
        if (radioButton3 == null) {
            cm.l.v("vehicleNoRb");
            radioButton3 = null;
        }
        radioButton3.setChecked(true);
        RadioButton radioButton4 = paymentSearchChallan.K;
        if (radioButton4 == null) {
            cm.l.v("vehicleNoRb");
            radioButton4 = null;
        }
        radioButton4.setSelected(true);
        LinearLayout linearLayout2 = paymentSearchChallan.J;
        if (linearLayout2 == null) {
            cm.l.v("vehicleNoLl");
            linearLayout2 = null;
        }
        linearLayout2.setBackgroundResource(R.drawable.corner_circle_14_selected);
        RadioButton radioButton5 = paymentSearchChallan.N;
        if (radioButton5 == null) {
            cm.l.v("dlNoRb");
            radioButton5 = null;
        }
        radioButton5.setChecked(false);
        RadioButton radioButton6 = paymentSearchChallan.N;
        if (radioButton6 == null) {
            cm.l.v("dlNoRb");
            radioButton6 = null;
        }
        radioButton6.setSelected(false);
        EditText editText = paymentSearchChallan.O;
        if (editText == null) {
            cm.l.v("inputEt");
            editText = null;
        }
        editText.setText("");
        LinearLayout linearLayout3 = paymentSearchChallan.M;
        if (linearLayout3 == null) {
            cm.l.v("dlNoLl");
            linearLayout3 = null;
        }
        linearLayout3.setBackgroundResource(R.drawable.corner_circle_bg_14);
        LinearLayout linearLayout4 = paymentSearchChallan.L;
        if (linearLayout4 == null) {
            cm.l.v("vehicleDetailsLl");
            linearLayout4 = null;
        }
        linearLayout4.setVisibility(0);
        EditText editText2 = paymentSearchChallan.O;
        if (editText2 == null) {
            cm.l.v("inputEt");
            editText2 = null;
        }
        editText2.setHint(paymentSearchChallan.w1().b("label_challan_enter_vehicle_no", paymentSearchChallan.getString(R.string.enter_vehicle_number)));
        RelativeLayout relativeLayout = paymentSearchChallan.f8754b0;
        if (relativeLayout == null) {
            cm.l.v("payChallanRl");
            relativeLayout = null;
        }
        relativeLayout.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.nexgendashboardmenu));
        RelativeLayout relativeLayout2 = paymentSearchChallan.Z;
        if (relativeLayout2 == null) {
            cm.l.v("transcationStatusRl");
            relativeLayout2 = null;
        }
        relativeLayout2.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.corner_rectangle_bg_17));
        RelativeLayout relativeLayout3 = paymentSearchChallan.f8753a0;
        if (relativeLayout3 == null) {
            cm.l.v("reprintReceiptRl");
            relativeLayout3 = null;
        }
        relativeLayout3.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.nexgendashboardmenu));
        MyTextView myTextView = paymentSearchChallan.T;
        if (myTextView == null) {
            cm.l.v("payChallanTv");
            myTextView = null;
        }
        myTextView.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.black));
        MyTextView myTextView2 = paymentSearchChallan.U;
        if (myTextView2 == null) {
            cm.l.v("transactionTv");
            myTextView2 = null;
        }
        myTextView2.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.white));
        MyTextView myTextView3 = paymentSearchChallan.V;
        if (myTextView3 == null) {
            cm.l.v("reprintReceiptTv");
            myTextView3 = null;
        }
        myTextView3.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.black));
        AppCompatImageView appCompatImageView = paymentSearchChallan.W;
        if (appCompatImageView == null) {
            cm.l.v("payChallanIv");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(R.drawable.tax_nexgen);
        AppCompatImageView appCompatImageView2 = paymentSearchChallan.X;
        if (appCompatImageView2 == null) {
            cm.l.v("transStatusIv");
            appCompatImageView2 = null;
        }
        appCompatImageView2.setImageResource(R.drawable.ic_pay_challan);
        AppCompatImageView appCompatImageView3 = paymentSearchChallan.Y;
        if (appCompatImageView3 == null) {
            cm.l.v("reprintReceiptIv");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setImageResource(R.drawable.tax_nexgen);
        CheckedTextView checkedTextView2 = paymentSearchChallan.f8757e0;
        if (checkedTextView2 == null) {
            cm.l.v("challanDetailsCb");
            checkedTextView2 = null;
        }
        checkedTextView2.setChecked(false);
        CheckedTextView checkedTextView3 = paymentSearchChallan.f8758f0;
        if (checkedTextView3 == null) {
            cm.l.v("paymentCb");
            checkedTextView3 = null;
        }
        checkedTextView3.setChecked(true);
        CheckedTextView checkedTextView4 = paymentSearchChallan.f8759g0;
        if (checkedTextView4 == null) {
            cm.l.v("receiptCb");
        } else {
            checkedTextView = checkedTextView4;
        }
        checkedTextView.setChecked(false);
    }

    /* access modifiers changed from: private */
    public static final void L1(PaymentSearchChallan paymentSearchChallan, View view) {
        cm.l.f(paymentSearchChallan, "this$0");
        paymentSearchChallan.f8760h0 = 2;
        paymentSearchChallan.W1();
        y7 y7Var = paymentSearchChallan.f8761i0;
        CheckedTextView checkedTextView = null;
        if (y7Var == null) {
            cm.l.v("binding");
            y7Var = null;
        }
        y7Var.Q.setVisibility(8);
        RadioButton radioButton = paymentSearchChallan.I;
        if (radioButton == null) {
            cm.l.v("challanNoRb");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton2 = paymentSearchChallan.I;
        if (radioButton2 == null) {
            cm.l.v("challanNoRb");
            radioButton2 = null;
        }
        radioButton2.setSelected(false);
        LinearLayout linearLayout = paymentSearchChallan.H;
        if (linearLayout == null) {
            cm.l.v("challanNoLl");
            linearLayout = null;
        }
        linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
        RadioButton radioButton3 = paymentSearchChallan.K;
        if (radioButton3 == null) {
            cm.l.v("vehicleNoRb");
            radioButton3 = null;
        }
        radioButton3.setChecked(true);
        RadioButton radioButton4 = paymentSearchChallan.K;
        if (radioButton4 == null) {
            cm.l.v("vehicleNoRb");
            radioButton4 = null;
        }
        radioButton4.setSelected(true);
        LinearLayout linearLayout2 = paymentSearchChallan.J;
        if (linearLayout2 == null) {
            cm.l.v("vehicleNoLl");
            linearLayout2 = null;
        }
        linearLayout2.setBackgroundResource(R.drawable.corner_circle_14_selected);
        RadioButton radioButton5 = paymentSearchChallan.N;
        if (radioButton5 == null) {
            cm.l.v("dlNoRb");
            radioButton5 = null;
        }
        radioButton5.setChecked(false);
        RadioButton radioButton6 = paymentSearchChallan.N;
        if (radioButton6 == null) {
            cm.l.v("dlNoRb");
            radioButton6 = null;
        }
        radioButton6.setSelected(false);
        EditText editText = paymentSearchChallan.O;
        if (editText == null) {
            cm.l.v("inputEt");
            editText = null;
        }
        editText.setText("");
        LinearLayout linearLayout3 = paymentSearchChallan.M;
        if (linearLayout3 == null) {
            cm.l.v("dlNoLl");
            linearLayout3 = null;
        }
        linearLayout3.setBackgroundResource(R.drawable.corner_circle_bg_14);
        LinearLayout linearLayout4 = paymentSearchChallan.L;
        if (linearLayout4 == null) {
            cm.l.v("vehicleDetailsLl");
            linearLayout4 = null;
        }
        linearLayout4.setVisibility(0);
        EditText editText2 = paymentSearchChallan.O;
        if (editText2 == null) {
            cm.l.v("inputEt");
            editText2 = null;
        }
        editText2.setHint(paymentSearchChallan.w1().b("label_challan_enter_vehicle_no", paymentSearchChallan.getString(R.string.enter_vehicle_number)));
        RelativeLayout relativeLayout = paymentSearchChallan.f8754b0;
        if (relativeLayout == null) {
            cm.l.v("payChallanRl");
            relativeLayout = null;
        }
        relativeLayout.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.nexgendashboardmenu));
        RelativeLayout relativeLayout2 = paymentSearchChallan.Z;
        if (relativeLayout2 == null) {
            cm.l.v("transcationStatusRl");
            relativeLayout2 = null;
        }
        relativeLayout2.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.nexgendashboardmenu));
        RelativeLayout relativeLayout3 = paymentSearchChallan.f8753a0;
        if (relativeLayout3 == null) {
            cm.l.v("reprintReceiptRl");
            relativeLayout3 = null;
        }
        relativeLayout3.setBackground(androidx.core.content.a.e(paymentSearchChallan, R.drawable.corner_rectangle_bg_17));
        MyTextView myTextView = paymentSearchChallan.T;
        if (myTextView == null) {
            cm.l.v("payChallanTv");
            myTextView = null;
        }
        myTextView.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.black));
        MyTextView myTextView2 = paymentSearchChallan.U;
        if (myTextView2 == null) {
            cm.l.v("transactionTv");
            myTextView2 = null;
        }
        myTextView2.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.black));
        MyTextView myTextView3 = paymentSearchChallan.V;
        if (myTextView3 == null) {
            cm.l.v("reprintReceiptTv");
            myTextView3 = null;
        }
        myTextView3.setTextColor(androidx.core.content.a.c(paymentSearchChallan, R.color.white));
        AppCompatImageView appCompatImageView = paymentSearchChallan.W;
        if (appCompatImageView == null) {
            cm.l.v("payChallanIv");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(R.drawable.tax_nexgen);
        AppCompatImageView appCompatImageView2 = paymentSearchChallan.X;
        if (appCompatImageView2 == null) {
            cm.l.v("transStatusIv");
            appCompatImageView2 = null;
        }
        appCompatImageView2.setImageResource(R.drawable.tax_nexgen);
        AppCompatImageView appCompatImageView3 = paymentSearchChallan.Y;
        if (appCompatImageView3 == null) {
            cm.l.v("reprintReceiptIv");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setImageResource(R.drawable.ic_pay_challan);
        CheckedTextView checkedTextView2 = paymentSearchChallan.f8757e0;
        if (checkedTextView2 == null) {
            cm.l.v("challanDetailsCb");
            checkedTextView2 = null;
        }
        checkedTextView2.setChecked(false);
        CheckedTextView checkedTextView3 = paymentSearchChallan.f8758f0;
        if (checkedTextView3 == null) {
            cm.l.v("paymentCb");
            checkedTextView3 = null;
        }
        checkedTextView3.setChecked(false);
        CheckedTextView checkedTextView4 = paymentSearchChallan.f8759g0;
        if (checkedTextView4 == null) {
            cm.l.v("receiptCb");
        } else {
            checkedTextView = checkedTextView4;
        }
        checkedTextView.setChecked(true);
    }

    private final void N1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ni.y7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: ni.y7} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a2() {
        /*
            r8 = this;
            android.widget.EditText r0 = r8.O
            java.lang.String r1 = "inputEt"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            cm.l.v(r1)
            r0 = r2
        L_0x000b:
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            char[] r3 = r0.toCharArray()
            java.lang.String r4 = "this as java.lang.String).toCharArray()"
            cm.l.e(r3, r4)
            int r4 = r0.length()
            r5 = 0
            if (r4 <= 0) goto L_0x0054
            int r4 = r0.length()
            r6 = 2
            if (r4 <= r6) goto L_0x0054
            android.widget.EditText r4 = r8.O
            if (r4 != 0) goto L_0x003a
            cm.l.v(r1)
            r4 = r2
        L_0x003a:
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = km.q.B0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r4, r6)
            goto L_0x0056
        L_0x0054:
            java.lang.String r4 = ""
        L_0x0056:
            java.lang.String r6 = r8.R
            java.lang.String r7 = "Challan"
            boolean r6 = cm.l.a(r6, r7)
            r7 = 1
            if (r6 == 0) goto L_0x0121
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0090
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x006f
            cm.l.v(r1)
            r0 = r2
        L_0x006f:
            ld.c r3 = r8.w1()
            r4 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_challan_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x008b
            cm.l.v(r1)
            goto L_0x008c
        L_0x008b:
            r2 = r0
        L_0x008c:
            r2.requestFocus()
            return r7
        L_0x0090:
            boolean r3 = r8.M1(r4)
            if (r3 != 0) goto L_0x00bf
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x009e
            cm.l.v(r1)
            r0 = r2
        L_0x009e:
            ld.c r3 = r8.w1()
            r4 = 2132018725(0x7f140625, float:1.9675765E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_enter_first_two_char_as_state"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x00ba
            cm.l.v(r1)
            goto L_0x00bb
        L_0x00ba:
            r2 = r0
        L_0x00bb:
            r2.requestFocus()
            return r7
        L_0x00bf:
            int r3 = r0.length()
            r4 = 12
            if (r3 >= r4) goto L_0x00f0
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x00cf
            cm.l.v(r1)
            r0 = r2
        L_0x00cf:
            ld.c r3 = r8.w1()
            r4 = 2132018368(0x7f1404c0, float:1.967504E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x00eb
            cm.l.v(r1)
            goto L_0x00ec
        L_0x00eb:
            r2 = r0
        L_0x00ec:
            r2.requestFocus()
            return r7
        L_0x00f0:
            int r0 = r0.length()
            r3 = 30
            if (r0 <= r3) goto L_0x02d3
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x0100
            cm.l.v(r1)
            r0 = r2
        L_0x0100:
            ld.c r3 = r8.w1()
            r4 = 2132018346(0x7f1404aa, float:1.9674996E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_max_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x011c
            cm.l.v(r1)
            goto L_0x011d
        L_0x011c:
            r2 = r0
        L_0x011d:
            r2.requestFocus()
            return r7
        L_0x0121:
            java.lang.String r4 = r8.R
            java.lang.String r6 = "RC"
            boolean r4 = cm.l.a(r4, r6)
            r6 = 10
            if (r4 == 0) goto L_0x0270
            int r4 = r0.length()
            if (r4 != 0) goto L_0x015c
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x013b
            cm.l.v(r1)
            r0 = r2
        L_0x013b:
            ld.c r3 = r8.w1()
            r4 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x0157
            cm.l.v(r1)
            goto L_0x0158
        L_0x0157:
            r2 = r0
        L_0x0158:
            r2.requestFocus()
            return r7
        L_0x015c:
            int r3 = r3.length
            if (r3 < 0) goto L_0x018b
            r4 = 4
            if (r3 >= r4) goto L_0x018b
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x016a
            cm.l.v(r1)
            r0 = r2
        L_0x016a:
            ld.c r3 = r8.w1()
            r4 = 2132018892(0x7f1406cc, float:1.9676103E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_char_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x0186
            cm.l.v(r1)
            goto L_0x0187
        L_0x0186:
            r2 = r0
        L_0x0187:
            r2.requestFocus()
            return r7
        L_0x018b:
            int r3 = r0.length()
            if (r3 <= r6) goto L_0x01ba
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x0199
            cm.l.v(r1)
            r0 = r2
        L_0x0199:
            ld.c r3 = r8.w1()
            r4 = 2132018908(0x7f1406dc, float:1.9676136E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_rc_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x01b5
            cm.l.v(r1)
            goto L_0x01b6
        L_0x01b5:
            r2 = r0
        L_0x01b6:
            r2.requestFocus()
            return r7
        L_0x01ba:
            km.f r3 = new km.f
            java.lang.String r4 = "[a-zA-Z0-9]*"
            r3.<init>((java.lang.String) r4)
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L_0x01f0
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x01cf
            cm.l.v(r1)
            r0 = r2
        L_0x01cf:
            ld.c r3 = r8.w1()
            r4 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_invalid_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x01eb
            cm.l.v(r1)
            goto L_0x01ec
        L_0x01eb:
            r2 = r0
        L_0x01ec:
            r2.requestFocus()
            return r7
        L_0x01f0:
            ni.y7 r0 = r8.f8761i0
            java.lang.String r1 = "binding"
            if (r0 != 0) goto L_0x01fa
            cm.l.v(r1)
            r0 = r2
        L_0x01fa:
            android.widget.EditText r0 = r0.f29484f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 5
            if (r0 >= r3) goto L_0x0233
            ni.y7 r0 = r8.f8761i0
            if (r0 != 0) goto L_0x0213
            cm.l.v(r1)
            r0 = r2
        L_0x0213:
            android.widget.EditText r0 = r0.f29484f
            ld.c r3 = r8.w1()
            java.lang.String r4 = "label_challan_valid_chassis_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of chassis no."
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.y7 r0 = r8.f8761i0
            if (r0 != 0) goto L_0x022c
            cm.l.v(r1)
            goto L_0x022d
        L_0x022c:
            r2 = r0
        L_0x022d:
            android.widget.EditText r0 = r2.f29484f
        L_0x022f:
            r0.requestFocus()
            return r7
        L_0x0233:
            ni.y7 r0 = r8.f8761i0
            if (r0 != 0) goto L_0x023b
            cm.l.v(r1)
            r0 = r2
        L_0x023b:
            android.widget.EditText r0 = r0.f29488j
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 >= r3) goto L_0x02d3
            ni.y7 r0 = r8.f8761i0
            if (r0 != 0) goto L_0x0253
            cm.l.v(r1)
            r0 = r2
        L_0x0253:
            android.widget.EditText r0 = r0.f29488j
            ld.c r3 = r8.w1()
            java.lang.String r4 = "label_challan_valid_engine_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of engine no"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.y7 r0 = r8.f8761i0
            if (r0 != 0) goto L_0x026c
            cm.l.v(r1)
            goto L_0x026d
        L_0x026c:
            r2 = r0
        L_0x026d:
            android.widget.EditText r0 = r2.f29488j
            goto L_0x022f
        L_0x0270:
            java.lang.String r3 = r8.R
            java.lang.String r4 = "DL"
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x02d3
            int r3 = r0.length()
            if (r3 != 0) goto L_0x02a9
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x0288
            cm.l.v(r1)
            r0 = r2
        L_0x0288:
            ld.c r3 = r8.w1()
            r4 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_valid_dl_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x02a4
            cm.l.v(r1)
            goto L_0x02a5
        L_0x02a4:
            r2 = r0
        L_0x02a5:
            r2.requestFocus()
            return r7
        L_0x02a9:
            int r0 = r0.length()
            if (r0 >= r6) goto L_0x02d3
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x02b7
            cm.l.v(r1)
            r0 = r2
        L_0x02b7:
            ld.c r3 = r8.w1()
            java.lang.String r4 = "label_challan_min_char_dl_validation"
            java.lang.String r5 = "Please enter minimum 10 characters of DL number"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x02ce
            cm.l.v(r1)
            goto L_0x02cf
        L_0x02ce:
            r2 = r0
        L_0x02cf:
            r2.requestFocus()
            return r7
        L_0x02d3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallan.a2():boolean");
    }

    private final void b2() {
        v1().show();
        cd.c y12 = y1();
        EditText editText = this.O;
        y7 y7Var = null;
        if (editText == null) {
            cm.l.v("inputEt");
            editText = null;
        }
        String obj = editText.getText().toString();
        String str = A1().k().toString();
        y7 y7Var2 = this.f8761i0;
        if (y7Var2 == null) {
            cm.l.v("binding");
            y7Var2 = null;
        }
        String obj2 = y7Var2.f29484f.getText().toString();
        y7 y7Var3 = this.f8761i0;
        if (y7Var3 == null) {
            cm.l.v("binding");
        } else {
            y7Var = y7Var3;
        }
        y12.m(obj, str, obj2, y7Var.f29488j.getText().toString(), this, v9.d.f17494a.k());
    }

    public final g A1() {
        g gVar = this.f8765m0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final boolean M1(String str) {
        cm.l.f(str, "string");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (('A' > charAt || charAt >= '[') && ('a' > charAt || charAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    public final void O1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8767o0 = arrayList;
    }

    public final void P1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.f8766n0 = databaseHelper;
    }

    public final void Q1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f8764l0 = progressDialog;
    }

    public final void R1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8769q0 = cVar;
    }

    public final void S1(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.f8763k0 = rcService;
    }

    public final void T1(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8762j0 = cVar;
    }

    public final void U1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f8768p0 = hVar;
    }

    public final void V1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f8765m0 = gVar;
    }

    public final void W1() {
        ArrayList E0 = u1().E0();
        cm.l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        O1(E0);
        y7 y7Var = null;
        if (t1().size() > 0) {
            Log.e("Arraylist", "1---------------->");
            y7 y7Var2 = this.f8761i0;
            if (y7Var2 == null) {
                cm.l.v("binding");
                y7Var2 = null;
            }
            y7Var2.R.setVisibility(0);
            y7 y7Var3 = this.f8761i0;
            if (y7Var3 == null) {
                cm.l.v("binding");
                y7Var3 = null;
            }
            y7Var3.f29501w.setVisibility(0);
            if (this.f8760h0 == 0) {
                h hVar = new h(t1(), this, 10, "");
                cm.l.c(hVar);
                U1(hVar);
            }
            if (this.f8760h0 == 1) {
                h hVar2 = new h(t1(), this, 11, "");
                cm.l.c(hVar2);
                U1(hVar2);
            }
            if (this.f8760h0 == 2) {
                h hVar3 = new h(t1(), this, 12, "");
                cm.l.c(hVar3);
                U1(hVar3);
            }
            y7 y7Var4 = this.f8761i0;
            if (y7Var4 == null) {
                cm.l.v("binding");
            } else {
                y7Var = y7Var4;
            }
            y7Var.f29501w.setAdapter(z1());
            return;
        }
        y7 y7Var5 = this.f8761i0;
        if (y7Var5 == null) {
            cm.l.v("binding");
            y7Var5 = null;
        }
        y7Var5.f29501w.setVisibility(8);
        y7 y7Var6 = this.f8761i0;
        if (y7Var6 == null) {
            cm.l.v("binding");
        } else {
            y7Var = y7Var6;
        }
        y7Var.R.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ni.y7} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X1() {
        /*
            r6 = this;
            int r0 = r6.f8760h0
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 != 0) goto L_0x0025
            ni.y7 r0 = r6.f8761i0
            if (r0 != 0) goto L_0x000f
            cm.l.v(r1)
            r0 = r2
        L_0x000f:
            android.widget.TextView r0 = r0.P
            ld.c r3 = r6.w1()
            r4 = 2132019125(0x7f1407b5, float:1.9676576E38)
            java.lang.String r4 = r6.getString(r4)
            java.lang.String r5 = "label_view_challan"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setText(r3)
        L_0x0025:
            int r0 = r6.f8760h0
            r3 = 1
            if (r0 != r3) goto L_0x0043
            ni.y7 r0 = r6.f8761i0
            if (r0 != 0) goto L_0x0032
            cm.l.v(r1)
            r0 = r2
        L_0x0032:
            android.widget.TextView r0 = r0.P
            ld.c r3 = r6.w1()
            java.lang.String r4 = "label_challan_payment_status"
            java.lang.String r5 = "Transaction Status"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setText(r3)
        L_0x0043:
            int r0 = r6.f8760h0
            r3 = 2
            if (r0 != r3) goto L_0x0061
            ni.y7 r0 = r6.f8761i0
            if (r0 != 0) goto L_0x0050
            cm.l.v(r1)
            r0 = r2
        L_0x0050:
            android.widget.TextView r0 = r0.P
            ld.c r3 = r6.w1()
            java.lang.String r4 = "label_challan_reprint_receipt"
            java.lang.String r5 = "Reprint Receipt"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setText(r3)
        L_0x0061:
            com.nic.mparivahan.DB.DatabaseHelper r0 = r6.u1()
            java.util.ArrayList r0 = r0.c0()
            if (r0 == 0) goto L_0x00bd
            com.nic.mparivahan.DB.DatabaseHelper r0 = r6.u1()     // Catch:{ Exception -> 0x008e }
            java.util.ArrayList r0 = r0.c0()     // Catch:{ Exception -> 0x008e }
            java.lang.String r3 = "getDLDetailsList(...)"
            cm.l.e(r0, r3)     // Catch:{ Exception -> 0x008e }
            r3 = 0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Exception -> 0x008e }
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4     // Catch:{ Exception -> 0x008e }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r4.getDldetails()     // Catch:{ Exception -> 0x008e }
            if (r4 == 0) goto L_0x00cd
            ni.y7 r4 = r6.f8761i0     // Catch:{ Exception -> 0x008e }
            if (r4 != 0) goto L_0x0090
            cm.l.v(r1)     // Catch:{ Exception -> 0x008e }
            r4 = r2
            goto L_0x0090
        L_0x008e:
            r0 = move-exception
            goto L_0x00b9
        L_0x0090:
            android.widget.LinearLayout r4 = r4.Q     // Catch:{ Exception -> 0x008e }
            r4.setVisibility(r3)     // Catch:{ Exception -> 0x008e }
            ni.y7 r4 = r6.f8761i0     // Catch:{ Exception -> 0x008e }
            if (r4 != 0) goto L_0x009d
            cm.l.v(r1)     // Catch:{ Exception -> 0x008e }
            r4 = r2
        L_0x009d:
            android.widget.TextView r1 = r4.f29500v     // Catch:{ Exception -> 0x008e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x008e }
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x008e }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x00b5
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r2 = r0.getDlLicno()     // Catch:{ Exception -> 0x008e }
        L_0x00b5:
            r1.setText(r2)     // Catch:{ Exception -> 0x008e }
            goto L_0x00cd
        L_0x00b9:
            r0.printStackTrace()
            goto L_0x00cd
        L_0x00bd:
            ni.y7 r0 = r6.f8761i0
            if (r0 != 0) goto L_0x00c5
            cm.l.v(r1)
            goto L_0x00c6
        L_0x00c5:
            r2 = r0
        L_0x00c6:
            android.widget.LinearLayout r0 = r2.Q
            r1 = 8
            r0.setVisibility(r1)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallan.X1():void");
    }

    public final void Y1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        textView.setText(w1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(w1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new n(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y7 c10 = y7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f8761i0 = c10;
        y7 y7Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        R1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        y7 y7Var2 = this.f8761i0;
        if (y7Var2 == null) {
            cm.l.v("binding");
            y7Var2 = null;
        }
        aVar.c(this, y7Var2);
        Q1(new ProgressDialog(this));
        v1().setMessage(w1().b("label_challan_please_wait", "Please wait..."));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        P1(A0);
        y7 y7Var3 = this.f8761i0;
        if (y7Var3 == null) {
            cm.l.v("binding");
        } else {
            y7Var = y7Var3;
        }
        y7Var.f29501w.setLayoutManager(new LinearLayoutManager(this, 0, false));
        W1();
        B1();
        y1().V().g(this, new c(new a(this)));
        y1().W().g(this, new c(new b(this)));
    }

    public final ArrayList t1() {
        ArrayList arrayList = this.f8767o0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("arrayList");
        return null;
    }

    public final DatabaseHelper u1() {
        DatabaseHelper databaseHelper = this.f8766n0;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.f8764l0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("dialog");
        return null;
    }

    public final ld.c w1() {
        ld.c cVar = this.f8769q0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final RcService x1() {
        RcService rcService = this.f8763k0;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c y1() {
        cd.c cVar = this.f8762j0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final h z1() {
        h hVar = this.f8768p0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("myRcAdapter");
        return null;
    }
}
