package com.nic.mparivahan.ClServices.View.NewCl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import cm.u;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo;
import com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import ni.h6;
import q9.g;
import q9.h;
import q9.i;
import q9.j;
import q9.k;

public final class NewClOne extends androidx.appcompat.app.d {
    public h6 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public ld.f K;
    private Calendar L = Calendar.getInstance();
    public ArrayList M;
    public ArrayList N;
    public ba.b O;
    public DlServiceInt P;
    private String Q = "0";
    public String R;
    private String S = "0";
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    private String Y = "1";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClOne f7946e;

        a(NewClOne newClOne) {
            this.f7946e = newClOne;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            NewClOne newClOne = this.f7946e;
            newClOne.k2(((StateMaster) newClOne.F1().get(i10)).getState_code());
            NewClOne newClOne2 = this.f7946e;
            newClOne2.m2(((StateMaster) newClOne2.F1().get(i10)).getState_name());
            ba.b s12 = this.f7946e.s1();
            NewClOne newClOne3 = this.f7946e;
            s12.h(newClOne3, newClOne3.E1());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClOne f7947e;

        b(NewClOne newClOne) {
            this.f7947e = newClOne;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            String rto_code;
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            NewClOne newClOne = this.f7947e;
            if (i10 == 0) {
                rto_code = "0";
            } else {
                newClOne.h2(((RtosMaster) newClOne.w1().get(i10)).getRto_name());
                newClOne = this.f7947e;
                rto_code = ((RtosMaster) newClOne.w1().get(i10)).getRto_code();
            }
            newClOne.g2(rto_code);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClOne f7948e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f7949f;

        c(NewClOne newClOne, u uVar) {
            this.f7948e = newClOne;
            this.f7949f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            this.f7948e.d2(((SpinnerPojo) ((ArrayList) this.f7949f.f20234e).get(i10)).getCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClOne f7950e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f7951f;

        d(NewClOne newClOne, u uVar) {
            this.f7950e = newClOne;
            this.f7951f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            this.f7950e.e2(((SpinnerPojo) ((ArrayList) this.f7951f.f20234e).get(i10)).getCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClOne f7952e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f7953f;

        e(NewClOne newClOne, u uVar) {
            this.f7952e = newClOne;
            this.f7953f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            this.f7952e.Y1(((SpinnerPojo) ((ArrayList) this.f7953f.f20234e).get(i10)).getCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClOne f7954e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f7955f;

        f(NewClOne newClOne, u uVar) {
            this.f7954e = newClOne;
            this.f7955f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            this.f7954e.W1(((SpinnerPojo) ((ArrayList) this.f7955f.f20234e).get(i10)).getCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    private final void G1() {
        a2(this);
        j2(new ld.c(v1()));
        i2(new ld.f(v1()));
        c2(new ProgressDialog(v1()));
        x1().setMessage(D1().b("label_challan_please_wait", getString(R.string.please_wait)));
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        f2(DlServiceInt.f21675a.a(v1()));
        X1((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(A1(), this))).a(ba.b.class));
        x1().show();
        u1().M.f25961g.setText(C1().i());
        s1().i(this);
        u1().f26629w.setOnClickListener(new i(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d1 A[SYNTHETIC, Splitter:B:18:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0133 A[SYNTHETIC, Splitter:B:27:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0165 A[SYNTHETIC, Splitter:B:36:0x0165] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0237 A[SYNTHETIC, Splitter:B:45:0x0237] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0269 A[SYNTHETIC, Splitter:B:55:0x0269] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H1(com.nic.mparivahan.ClServices.View.NewCl.NewClOne r4, android.view.View r5) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            boolean r5 = r4.I1()
            if (r5 == 0) goto L_0x02a0
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r0 = "dd-MM-yyyy"
            r5.<init>(r0)
            ni.h6 r0 = r4.u1()
            android.widget.TextView r0 = r0.f26632z
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.util.Date r5 = r5.parse(r0)
            java.lang.String r0 = "parse(...)"
            cm.l.e(r5, r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r2 = r5.getTime()
            long r0 = r0 - r2
            r5 = 86400000(0x5265c00, float:7.82218E-36)
            long r2 = (long) r5
            long r0 = r0 / r2
            int r5 = (int) r0
            r0 = 6570(0x19aa, float:9.207E-42)
            if (r5 >= r0) goto L_0x0052
            r5 = 2132017273(0x7f140079, float:1.967282E38)
            java.lang.String r5 = r4.getString(r5)
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r0)
            r4.show()
            goto L_0x02a0
        L_0x0052:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x02a0 }
            java.lang.Class<com.nic.mparivahan.ClServices.View.NewCl.NewClTwo> r0 = com.nic.mparivahan.ClServices.View.NewCl.NewClTwo.class
            r5.<init>(r4, r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "state_code"
            java.lang.String r1 = r4.Q     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "rto_code"
            java.lang.String r1 = r4.S     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "rto_name"
            java.lang.String r1 = r4.B1()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "clFirstName"
            ni.h6 r1 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r1 = r1.B     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.D     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = "clMiddleName"
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.length()     // Catch:{ Exception -> 0x02a0 }
            if (r0 != 0) goto L_0x00a6
            goto L_0x00c0
        L_0x00a6:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.D     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x00c3
        L_0x00c0:
            r5.putExtra(r1, r2)     // Catch:{ Exception -> 0x02a0 }
        L_0x00c3:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.C     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = "clLastName"
            if (r0 == 0) goto L_0x00f2
            int r0 = r0.length()     // Catch:{ Exception -> 0x02a0 }
            if (r0 != 0) goto L_0x00d8
            goto L_0x00f2
        L_0x00d8:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.C     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x00f5
        L_0x00f2:
            r5.putExtra(r1, r2)     // Catch:{ Exception -> 0x02a0 }
        L_0x00f5:
            java.lang.String r0 = "clRelation"
            java.lang.String r1 = r4.y1()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "relFirstName"
            ni.h6 r1 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r1 = r1.f26624o0     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.f26628s0     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = "relMiddleName"
            if (r0 == 0) goto L_0x0154
            int r0 = r0.length()     // Catch:{ Exception -> 0x02a0 }
            if (r0 != 0) goto L_0x013a
            goto L_0x0154
        L_0x013a:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.f26628s0     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x0157
        L_0x0154:
            r5.putExtra(r1, r2)     // Catch:{ Exception -> 0x02a0 }
        L_0x0157:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.f26626q0     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = "relLastName"
            if (r0 == 0) goto L_0x0186
            int r0 = r0.length()     // Catch:{ Exception -> 0x02a0 }
            if (r0 != 0) goto L_0x016c
            goto L_0x0186
        L_0x016c:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.f26626q0     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x0189
        L_0x0186:
            r5.putExtra(r1, r2)     // Catch:{ Exception -> 0x02a0 }
        L_0x0189:
            java.lang.String r0 = "appGender"
            java.lang.String r1 = r4.Y     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "appDob"
            ni.h6 r1 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.TextView r1 = r1.f26632z     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "clEdu"
            java.lang.String r1 = r4.t1()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "clBlood"
            java.lang.String r1 = r4.r1()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "clPhone"
            ni.h6 r1 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r1 = r1.J     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "clEmail"
            ni.h6 r1 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r1 = r1.F     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "clMobile"
            ni.h6 r1 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r1 = r1.I     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = "clAlterMobile"
            ni.h6 r1 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r1 = r1.A     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r0, r1)     // Catch:{ Exception -> 0x02a0 }
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.G     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = "mark1"
            if (r0 == 0) goto L_0x0258
            int r0 = r0.length()     // Catch:{ Exception -> 0x02a0 }
            if (r0 != 0) goto L_0x023e
            goto L_0x0258
        L_0x023e:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.G     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
        L_0x0254:
            r5.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x025b
        L_0x0258:
            java.lang.String r0 = "NA"
            goto L_0x0254
        L_0x025b:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.H     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r1 = "mark2"
            if (r0 == 0) goto L_0x028a
            int r0 = r0.length()     // Catch:{ Exception -> 0x02a0 }
            if (r0 != 0) goto L_0x0270
            goto L_0x028a
        L_0x0270:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.H     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
        L_0x0282:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            r5.putExtra(r1, r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x029d
        L_0x028a:
            ni.h6 r0 = r4.u1()     // Catch:{ Exception -> 0x02a0 }
            android.widget.EditText r0 = r0.H     // Catch:{ Exception -> 0x02a0 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a0 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x0282
        L_0x029d:
            r4.startActivity(r5)     // Catch:{ Exception -> 0x02a0 }
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.NewCl.NewClOne.H1(com.nic.mparivahan.ClServices.View.NewCl.NewClOne, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a1, code lost:
        if (r0.length() > 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        r0 = D1().b("enter_valid_rel_3_last_name", getString(com.nic.mparivahan.R.string.enter_valid_rel_3_last_name));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012c, code lost:
        if (r0.length() > 0) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean I1() {
        /*
            r7 = this;
            java.lang.String r0 = r7.Q
            java.lang.String r1 = "0"
            boolean r0 = cm.l.a(r0, r1)
            r2 = 0
            if (r0 == 0) goto L_0x001f
            ld.c r0 = r7.D1()
            java.lang.String r1 = "label_log_sel_state"
            java.lang.String r3 = "Please select state"
            java.lang.String r0 = r0.b(r1, r3)
        L_0x0017:
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r2)
        L_0x001b:
            r0.show()
            return r2
        L_0x001f:
            java.lang.String r0 = r7.S
            boolean r0 = cm.l.a(r0, r1)
            if (r0 == 0) goto L_0x0039
            ld.c r0 = r7.D1()
            r1 = 2132018801(0x7f140671, float:1.9675919E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "select_rto"
        L_0x0034:
            java.lang.String r0 = r0.b(r3, r1)
            goto L_0x0017
        L_0x0039:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.B
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = "getText(...)"
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005c
            ld.c r0 = r7.D1()
            r1 = 2132017829(0x7f1402a5, float:1.9673947E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "PLEASE_ENTER_FIRST_NAME"
            goto L_0x0034
        L_0x005c:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.B
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r4 = 3
            if (r0 >= r4) goto L_0x007b
            ld.c r0 = r7.D1()
            r1 = 2132017925(0x7f140305, float:1.9674142E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "enter_valid_3_first_name"
            goto L_0x0034
        L_0x007b:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.C
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r5 = 2132017939(0x7f140313, float:1.967417E38)
            java.lang.String r6 = "enter_valid_rel_3_last_name"
            if (r0 >= r4) goto L_0x00b1
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.C
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00b1
        L_0x00a3:
            ld.c r0 = r7.D1()
            java.lang.String r1 = r7.getString(r5)
            java.lang.String r0 = r0.b(r6, r1)
            goto L_0x0017
        L_0x00b1:
            java.lang.String r0 = r7.y1()
            boolean r0 = cm.l.a(r0, r1)
            if (r0 == 0) goto L_0x00ca
            ld.c r0 = r7.D1()
            r1 = 2132019087(0x7f14078f, float:1.9676499E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "PLEASE_SELECT_RELATION"
            goto L_0x0034
        L_0x00ca:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.f26624o0
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ec
            ld.c r0 = r7.D1()
            r1 = 2132018955(0x7f14070b, float:1.9676231E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "PLEASE_ENTER_REL_FIRST_NAME"
            goto L_0x0034
        L_0x00ec:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.f26624o0
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 >= r4) goto L_0x010b
            ld.c r0 = r7.D1()
            r1 = 2132017938(0x7f140312, float:1.9674169E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "enter_valid_rel_3_first_name"
            goto L_0x0034
        L_0x010b:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.f26626q0
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 >= r4) goto L_0x0130
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.f26626q0
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0130
            goto L_0x00a3
        L_0x0130:
            ni.h6 r0 = r7.u1()
            android.widget.TextView r0 = r0.f26632z
            java.lang.CharSequence r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0152
            ld.c r0 = r7.D1()
            r1 = 2132018722(0x7f140622, float:1.9675759E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "please_enter_bd"
            goto L_0x0034
        L_0x0152:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.E
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0174
            ld.c r0 = r7.D1()
            r1 = 2132017798(0x7f140286, float:1.9673885E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "edit_dl_serv_enter_birth_plac"
            goto L_0x0034
        L_0x0174:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.E
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 >= r4) goto L_0x0193
            ld.c r0 = r7.D1()
            r1 = 2132019444(0x7f1408f4, float:1.9677223E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "PLEASE_ENTER_VALID_PLACE"
            goto L_0x0034
        L_0x0193:
            java.lang.String r0 = r7.z1()
            boolean r0 = cm.l.a(r0, r1)
            if (r0 == 0) goto L_0x01ac
            ld.c r0 = r7.D1()
            r1 = 2132019089(0x7f140791, float:1.9676503E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "PLEASE_SELECT_REGION"
            goto L_0x0034
        L_0x01ac:
            java.lang.String r0 = r7.t1()
            java.lang.String r1 = "22"
            boolean r0 = cm.l.a(r0, r1)
            if (r0 == 0) goto L_0x01c7
            ld.c r0 = r7.D1()
            r1 = 2132019076(0x7f140784, float:1.9676477E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "PLEASE_SELECT_EDUCATION"
            goto L_0x0034
        L_0x01c7:
            java.lang.String r0 = r7.r1()
            java.lang.String r1 = "Select Blood Group"
            boolean r0 = cm.l.a(r0, r1)
            if (r0 == 0) goto L_0x01e2
            ld.c r0 = r7.D1()
            r1 = 2132019066(0x7f14077a, float:1.9676456E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "PLEASE_SELECT_BG"
            goto L_0x0034
        L_0x01e2:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.I
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0204
            ld.c r0 = r7.D1()
            r1 = 2132017856(0x7f1402c0, float:1.9674002E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "label_mb"
            goto L_0x0034
        L_0x0204:
            ni.h6 r0 = r7.u1()
            android.widget.EditText r0 = r0.I
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r1 = 10
            r3 = 1
            if (r0 >= r1) goto L_0x022e
            ld.c r0 = r7.D1()
            r1 = 2132017854(0x7f1402be, float:1.9673998E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r4 = "lbl_enter_valid_number"
            java.lang.String r0 = r0.b(r4, r1)
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r3)
            goto L_0x001b
        L_0x022e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.NewCl.NewClOne.I1():boolean");
    }

    private final void J1() {
        s1().z().g(this, new j(this));
        s1().B().g(this, new k(this));
        s1().y().g(this, new q9.l(this));
        s1().A().g(this, new q9.b(this));
    }

    /* access modifiers changed from: private */
    public static final void K1(NewClOne newClOne, String str) {
        l.f(newClOne, "this$0");
        newClOne.x1().dismiss();
        newClOne.U1(newClOne.D1().b("service_is_not_present", newClOne.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void L1(NewClOne newClOne, SarathiStatePojo sarathiStatePojo) {
        r9.c cVar;
        h6 u12;
        l.f(newClOne, "this$0");
        try {
            if (p.o(sarathiStatePojo.getStatus_code(), "00", true)) {
                List<StateMaster> stateMaster = sarathiStatePojo.getStateMaster();
                l.d(stateMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster>");
                newClOne.l2((ArrayList) stateMaster);
                newClOne.F1().add(0, new StateMaster("Select State", "0"));
                cVar = new r9.c(newClOne, newClOne.F1());
                u12 = newClOne.u1();
            } else {
                newClOne.l2(new ArrayList());
                newClOne.F1().add(0, new StateMaster("Select State", "0"));
                cVar = new r9.c(newClOne, newClOne.F1());
                u12 = newClOne.u1();
            }
            u12.f26631y.setAdapter(cVar);
        } catch (Exception unused) {
            newClOne.x1().dismiss();
            Toast.makeText(newClOne.getApplicationContext(), newClOne.D1().b("service_is_not_present", newClOne.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void M1(NewClOne newClOne, String str) {
        l.f(newClOne, "this$0");
        newClOne.x1().dismiss();
        Toast.makeText(newClOne.getApplicationContext(), newClOne.D1().b("service_is_not_present", newClOne.getString(R.string.unable_to_get_details)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void N1(NewClOne newClOne, CurrentRTO currentRTO) {
        l.f(newClOne, "this$0");
        newClOne.x1().dismiss();
        try {
            if (p.o(currentRTO.getStatus_code(), "00", true)) {
                List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                l.d(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
                newClOne.b2((ArrayList) rtosMaster);
                ArrayList w12 = newClOne.w1();
                String string = newClOne.getString(R.string.please_select_rto);
                l.e(string, "getString(...)");
                w12.add(0, new RtosMaster(string, "0"));
                newClOne.u1().f26630x.setAdapter(new r9.b(newClOne, newClOne.w1()));
                newClOne.u1().f26630x.setEnabled(true);
                newClOne.u1().f26630x.setClickable(true);
                return;
            }
            List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
            l.d(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
            newClOne.b2((ArrayList) rtosMaster2);
            ArrayList w13 = newClOne.w1();
            String b10 = newClOne.D1().b("select_rto", newClOne.getString(R.string.please_select_rto));
            l.c(b10);
            w13.add(0, new RtosMaster(b10, "0"));
            newClOne.u1().f26630x.setAdapter(new r9.b(newClOne, newClOne.w1()));
        } catch (Exception unused) {
            newClOne.U1(newClOne.D1().b("service_is_not_present", newClOne.getString(R.string.unable_to_get_details)));
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(NewClOne newClOne, View view) {
        l.f(newClOne, "this$0");
        newClOne.Y = "1";
    }

    /* access modifiers changed from: private */
    public static final void P1(NewClOne newClOne, View view) {
        l.f(newClOne, "this$0");
        newClOne.Y = "2";
    }

    /* access modifiers changed from: private */
    public static final void Q1(NewClOne newClOne, View view) {
        l.f(newClOne, "this$0");
        newClOne.Y = VContant.DUPLICATE_RC_PURPOSE_CODE;
    }

    /* access modifiers changed from: private */
    public static final void R1(NewClOne newClOne, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(newClOne, "this$0");
        newClOne.L.set(1, i10);
        newClOne.L.set(2, i11);
        newClOne.L.set(5, i12);
        CharSequence format = DateFormat.format("dd", newClOne.L.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", newClOne.L.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", newClOne.L.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        TextView textView = newClOne.u1().f26632z;
        textView.setText(((String) format) + '-' + ((String) format2) + '-' + ((String) format3));
    }

    /* access modifiers changed from: private */
    public static final void S1(NewClOne newClOne, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(newClOne, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(newClOne, onDateSetListener, newClOne.L.get(1), newClOne.L.get(2), newClOne.L.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void T1(NewClOne newClOne, View view) {
        l.f(newClOne, "this$0");
        newClOne.finish();
    }

    private final void U1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(D1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(D1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(D1().b("btn_ok", "OK"));
        textView.setOnClickListener(new q9.c(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void V1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void n2() {
        u uVar = new u();
        ArrayList arrayList = new ArrayList();
        uVar.f20234e = arrayList;
        arrayList.add(0, new SpinnerPojo("0", "Select Religion"));
        ((ArrayList) uVar.f20234e).add(1, new SpinnerPojo("G", "Hindu"));
        ((ArrayList) uVar.f20234e).add(2, new SpinnerPojo("R", "Muslim"));
        ((ArrayList) uVar.f20234e).add(3, new SpinnerPojo("T", "Sikh"));
        ((ArrayList) uVar.f20234e).add(4, new SpinnerPojo("X", "Christian"));
        ((ArrayList) uVar.f20234e).add(5, new SpinnerPojo("F", "Other"));
        u1().R.setAdapter(new r9.a(this, (ArrayList) uVar.f20234e));
        u uVar2 = new u();
        ArrayList arrayList2 = new ArrayList();
        uVar2.f20234e = arrayList2;
        arrayList2.add(0, new SpinnerPojo("22", "Select Education Qualification"));
        ((ArrayList) uVar2.f20234e).add(1, new SpinnerPojo(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "10+2 or Equivalent"));
        ((ArrayList) uVar2.f20234e).add(2, new SpinnerPojo(VContant.DUPLICATE_RC_PURPOSE_CODE, "10th Standard or Equivalent"));
        ((ArrayList) uVar2.f20234e).add(3, new SpinnerPojo(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, "Diploma in any Discipline"));
        ((ArrayList) uVar2.f20234e).add(4, new SpinnerPojo(VContant.RCPARTICULAR_PURPOSE_CODE, "Doctorate in any Discipline"));
        ((ArrayList) uVar2.f20234e).add(5, new SpinnerPojo(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, "Graduate in Non Medical Sciences"));
        ((ArrayList) uVar2.f20234e).add(6, new SpinnerPojo(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, "Graduate in any Medical Sciences"));
        ((ArrayList) uVar2.f20234e).add(7, new SpinnerPojo(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, "ITI/Certificate Course"));
        ((ArrayList) uVar2.f20234e).add(8, new SpinnerPojo("12", "M.Phil. in any Discipline"));
        ((ArrayList) uVar2.f20234e).add(9, new SpinnerPojo("10", "Post Graduate Diploma in any Discipline"));
        ((ArrayList) uVar2.f20234e).add(10, new SpinnerPojo(VContant.NOC_PURPOSE_CODE, "Post Graduate in Non Medical Sciences"));
        ((ArrayList) uVar2.f20234e).add(11, new SpinnerPojo("11", "Post Graduate in any Medical Science"));
        u1().P.setAdapter(new r9.a(this, (ArrayList) uVar2.f20234e));
        u uVar3 = new u();
        ArrayList arrayList3 = new ArrayList();
        uVar3.f20234e = arrayList3;
        arrayList3.add(0, new SpinnerPojo("0", "Select Relation"));
        ((ArrayList) uVar3.f20234e).add(1, new SpinnerPojo("F", "Father Name"));
        ((ArrayList) uVar3.f20234e).add(2, new SpinnerPojo("M", "Mother Name"));
        ((ArrayList) uVar3.f20234e).add(3, new SpinnerPojo("H", "Husband Name"));
        ((ArrayList) uVar3.f20234e).add(3, new SpinnerPojo("G", "Guardian Name"));
        u1().Q.setAdapter(new r9.a(this, (ArrayList) uVar3.f20234e));
        u uVar4 = new u();
        ArrayList arrayList4 = new ArrayList();
        uVar4.f20234e = arrayList4;
        arrayList4.add(0, new SpinnerPojo("Select Blood Group", "Select Blood Group"));
        ((ArrayList) uVar4.f20234e).add(1, new SpinnerPojo("A+", "A+"));
        ((ArrayList) uVar4.f20234e).add(2, new SpinnerPojo("A-", "A-"));
        ((ArrayList) uVar4.f20234e).add(3, new SpinnerPojo("A1+", "A1+"));
        ((ArrayList) uVar4.f20234e).add(4, new SpinnerPojo("A1B", "A1B"));
        ((ArrayList) uVar4.f20234e).add(5, new SpinnerPojo("A2B", "A2B"));
        ((ArrayList) uVar4.f20234e).add(6, new SpinnerPojo("AB+", "AB+"));
        ((ArrayList) uVar4.f20234e).add(7, new SpinnerPojo("AB-", "AB-"));
        ((ArrayList) uVar4.f20234e).add(8, new SpinnerPojo("B+", "B+"));
        ((ArrayList) uVar4.f20234e).add(9, new SpinnerPojo("B-", "B-"));
        ((ArrayList) uVar4.f20234e).add(10, new SpinnerPojo("O+", "O+"));
        ((ArrayList) uVar4.f20234e).add(11, new SpinnerPojo("O-", "O-"));
        u1().O.setAdapter(new r9.a(this, (ArrayList) uVar4.f20234e));
        u1().Q.setOnItemSelectedListener(new c(this, uVar3));
        u1().R.setOnItemSelectedListener(new d(this, uVar));
        u1().P.setOnItemSelectedListener(new e(this, uVar2));
        u1().O.setOnItemSelectedListener(new f(this, uVar4));
    }

    public final DlServiceInt A1() {
        DlServiceInt dlServiceInt = this.P;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        l.v("retrofitService");
        return null;
    }

    public final String B1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("rto_name");
        return null;
    }

    public final ld.f C1() {
        ld.f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarathiSession");
        return null;
    }

    public final ld.c D1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final String E1() {
        return this.Q;
    }

    public final ArrayList F1() {
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("state_list");
        return null;
    }

    public final void W1(String str) {
        l.f(str, "<set-?>");
        this.X = str;
    }

    public final void X1(ba.b bVar) {
        l.f(bVar, "<set-?>");
        this.O = bVar;
    }

    public final void Y1(String str) {
        l.f(str, "<set-?>");
        this.V = str;
    }

    public final void Z1(h6 h6Var) {
        l.f(h6Var, "<set-?>");
        this.G = h6Var;
    }

    public final void a2(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    public final void b2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.N = arrayList;
    }

    public final void c2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void d2(String str) {
        l.f(str, "<set-?>");
        this.W = str;
    }

    public final void e2(String str) {
        l.f(str, "<set-?>");
        this.U = str;
    }

    public final void f2(DlServiceInt dlServiceInt) {
        l.f(dlServiceInt, "<set-?>");
        this.P = dlServiceInt;
    }

    public final void g2(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void h2(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void i2(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void j2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void k2(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void l2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.M = arrayList;
    }

    public final void m2(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h6 x10 = h6.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        Z1(x10);
        setContentView(u1().m());
        G1();
        J1();
        n2();
        v9.e.f17509a.s1(this, u1());
        u1().N.setOnClickListener(new q9.a(this));
        u1().K.setOnClickListener(new q9.d(this));
        u1().T.setOnClickListener(new q9.e(this));
        u1().f26632z.setOnClickListener(new g(this, new q9.f(this)));
        u1().f26631y.setOnItemSelectedListener(new a(this));
        u1().M.f25959e.setOnClickListener(new h(this));
        u1().f26630x.setOnItemSelectedListener(new b(this));
    }

    public final String r1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        l.v("bloodGrp");
        return null;
    }

    public final ba.b s1() {
        ba.b bVar = this.O;
        if (bVar != null) {
            return bVar;
        }
        l.v("dlServicesViewModel");
        return null;
    }

    public final String t1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        l.v("eduCode");
        return null;
    }

    public final h6 u1() {
        h6 h6Var = this.G;
        if (h6Var != null) {
            return h6Var;
        }
        l.v("mBinding");
        return null;
    }

    public final Context v1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final ArrayList w1() {
        ArrayList arrayList = this.N;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("mRtosMaster");
        return null;
    }

    public final ProgressDialog x1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String y1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        l.v("relationCode");
        return null;
    }

    public final String z1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        l.v("religionCode");
        return null;
    }
}
