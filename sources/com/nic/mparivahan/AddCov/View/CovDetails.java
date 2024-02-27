package com.nic.mparivahan.AddCov.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails;
import java.io.Serializable;
import ld.f;
import ni.o1;
import v9.e;
import x8.k;
import x8.m;
import x8.n;
import x8.o;
import x8.p;
import x8.q;
import x8.r;

public final class CovDetails extends d {
    public o1 G;
    public ApplStatusDetails H;
    public String I;
    public String J;
    public f K;

    /* access modifiers changed from: private */
    public static final void A1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        covDetails.finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00f1 A[Catch:{ Exception -> 0x0234 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void G1() {
        /*
            r4 = this;
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.K     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getApplName()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.I0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getRelation()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.N0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getSwdName()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r0 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r0 = r0.getGender()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = "Male"
            boolean r1 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x0234 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0058
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.RadioButton r0 = r0.U     // Catch:{ Exception -> 0x0234 }
            r0.setChecked(r3)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
        L_0x0052:
            android.widget.RadioButton r0 = r0.Q     // Catch:{ Exception -> 0x0234 }
            r0.setChecked(r2)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0081
        L_0x0058:
            java.lang.String r1 = "Female"
            boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x0073
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.RadioButton r0 = r0.U     // Catch:{ Exception -> 0x0234 }
            r0.setChecked(r2)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.RadioButton r0 = r0.Q     // Catch:{ Exception -> 0x0234 }
            r0.setChecked(r3)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0081
        L_0x0073:
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.RadioButton r0 = r0.U     // Catch:{ Exception -> 0x0234 }
            r0.setChecked(r3)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            goto L_0x0052
        L_0x0081:
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.I     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getDob()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.L     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPlaceOfBirth()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.P     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getQualcd_Desc()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.M     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getBloodGroup()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.O     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getMobileNO()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.N     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getEmailId()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r0 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r0 = r0.getAltMobileNumber()     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x010a
            int r0 = r0.length()     // Catch:{ Exception -> 0x0234 }
            if (r0 != 0) goto L_0x00f8
            goto L_0x010a
        L_0x00f8:
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.J     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getAltMobileNumber()     // Catch:{ Exception -> 0x0234 }
        L_0x0106:
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0113
        L_0x010a:
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.J     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = "NA"
            goto L_0x0106
        L_0x0113:
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.f27733h0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getStateCd()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.f27732g0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getRtoCd()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.F     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_State()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.B     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_DISTRICTCODE()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.H     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_SUBDICTCODE()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.C     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_ADD1()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.C     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_ADD1()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.G     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_ADD2()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.D     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_ADD3()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.E     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_PINCODE()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.W     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPERMANENT_State()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.V     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPERMANENT_DISTRICTCODE()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.f27729d0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPERMANENT_SUBDICTCODE()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.Z     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPERMANENT_ADD1()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.f27728c0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_ADD2()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.f27726a0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_ADD3()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
            ni.o1 r0 = r4.x1()     // Catch:{ Exception -> 0x0234 }
            android.widget.TextView r0 = r0.f27727b0     // Catch:{ Exception -> 0x0234 }
            com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails r1 = r4.w1()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r1 = r1.getPRESENT_PINCODE()     // Catch:{ Exception -> 0x0234 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0234 }
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.AddCov.View.CovDetails.G1():void");
    }

    private final void n1() {
        x1().f27754z.setOnClickListener(new x8.l(this));
        x1().f27752y.setOnClickListener(new m(this));
        x1().Y.setOnClickListener(new n(this));
        x1().X.setOnClickListener(new o(this));
        x1().f27731f0.setOnClickListener(new p(this));
        x1().f27730e0.setOnClickListener(new q(this));
        x1().A.setOnClickListener(new r(this));
    }

    /* access modifiers changed from: private */
    public static final void o1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        covDetails.x1().f27754z.setVisibility(8);
        covDetails.x1().f27752y.setVisibility(0);
        covDetails.x1().S.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void p1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        covDetails.x1().f27754z.setVisibility(0);
        covDetails.x1().f27752y.setVisibility(8);
        covDetails.x1().S.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void q1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        covDetails.x1().Y.setVisibility(8);
        covDetails.x1().X.setVisibility(0);
        covDetails.x1().f27748w.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void r1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        covDetails.x1().Y.setVisibility(0);
        covDetails.x1().X.setVisibility(8);
        covDetails.x1().f27748w.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void s1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        covDetails.x1().f27731f0.setVisibility(8);
        covDetails.x1().f27730e0.setVisibility(0);
        covDetails.x1().f27750x.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void t1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        covDetails.x1().f27731f0.setVisibility(0);
        covDetails.x1().f27730e0.setVisibility(8);
        covDetails.x1().f27750x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void u1(CovDetails covDetails, View view) {
        l.f(covDetails, "this$0");
        Intent intent = new Intent(covDetails, CovList.class);
        intent.putExtra("ApplStatusDetails", covDetails.w1());
        intent.putExtra("app_number", covDetails.v1());
        intent.putExtra("newdob", covDetails.y1());
        covDetails.startActivity(intent);
    }

    public final void B1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void C1(ApplStatusDetails applStatusDetails) {
        l.f(applStatusDetails, "<set-?>");
        this.H = applStatusDetails;
    }

    public final void D1(o1 o1Var) {
        l.f(o1Var, "<set-?>");
        this.G = o1Var;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.I = str;
    }

    public final void F1(f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o1 x10 = o1.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        D1(x10);
        setContentView(x1().m());
        F1(new f(this));
        e.f17509a.j0(this, x1());
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("ApplStatusDetails");
            l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails");
            C1((ApplStatusDetails) serializableExtra);
            E1(String.valueOf(getIntent().getStringExtra("newdob")));
            B1(String.valueOf(getIntent().getStringExtra("app_number")));
        }
        n1();
        G1();
        x1().T.f25961g.setText(z1().i());
        x1().T.f25959e.setOnClickListener(new k(this));
    }

    public final String v1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("app");
        return null;
    }

    public final ApplStatusDetails w1() {
        ApplStatusDetails applStatusDetails = this.H;
        if (applStatusDetails != null) {
            return applStatusDetails;
        }
        l.v("mApplStatusDetails");
        return null;
    }

    public final o1 x1() {
        o1 o1Var = this.G;
        if (o1Var != null) {
            return o1Var;
        }
        l.v("mBinding");
        return null;
    }

    public final String y1() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        l.v("newdob");
        return null;
    }

    public final f z1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sahi_session");
        return null;
    }
}
