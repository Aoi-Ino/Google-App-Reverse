package com.nic.mparivahan.LLMainScreen;

import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import ld.f;
import ni.m5;

public final class LlDetails extends d {
    public m5 G;
    public FetchLlDetails H;
    public f I;
    private String J = "";

    /* access modifiers changed from: private */
    public static final void q1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void r1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void s1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.o1().N.setVisibility(8);
        llDetails.o1().O.setVisibility(0);
        llDetails.o1().J.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void t1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.o1().N.setVisibility(0);
        llDetails.o1().O.setVisibility(8);
        llDetails.o1().J.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void u1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.o1().f27433z.setVisibility(8);
        llDetails.o1().C.setVisibility(0);
        llDetails.o1().I.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void v1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.o1().C.setVisibility(8);
        llDetails.o1().f27433z.setVisibility(0);
        llDetails.o1().I.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void w1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.o1().f27428w0.setVisibility(8);
        llDetails.o1().f27430x0.setVisibility(0);
        llDetails.o1().K.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void x1(LlDetails llDetails, View view) {
        l.f(llDetails, "this$0");
        llDetails.o1().f27428w0.setVisibility(0);
        llDetails.o1().f27430x0.setVisibility(8);
        llDetails.o1().K.setVisibility(8);
    }

    public final void A1(f fVar) {
        l.f(fVar, "<set-?>");
        this.I = fVar;
    }

    public final FetchLlDetails n1() {
        FetchLlDetails fetchLlDetails = this.H;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        l.v("llDetails");
        return null;
    }

    public final m5 o1() {
        m5 m5Var = this.G;
        if (m5Var != null) {
            return m5Var;
        }
        l.v("mBinding");
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|(1:6)|11|7|8|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0132 A[Catch:{ Exception -> 0x016d }, LOOP:0: B:5:0x0130->B:6:0x0132, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.view.LayoutInflater r4 = r3.getLayoutInflater()
            ni.m5 r4 = ni.m5.x(r4)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r4, r0)
            r3.z1(r4)
            ni.m5 r4 = r3.o1()
            android.view.View r4 = r4.m()
            r3.setContentView((android.view.View) r4)
            ld.f r4 = new ld.f
            r4.<init>(r3)
            r3.A1(r4)
            v9.e$a r4 = v9.e.f17509a
            ni.m5 r0 = r3.o1()
            r4.e1(r3, r0)
            android.content.Intent r4 = r3.getIntent()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = "LLDetails"
            java.io.Serializable r4 = r4.getSerializableExtra(r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails"
            cm.l.d(r4, r0)     // Catch:{ Exception -> 0x0043 }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r4 = (com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails) r4     // Catch:{ Exception -> 0x0043 }
            r3.y1(r4)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            ni.dc r4 = r4.f27426v0     // Catch:{ Exception -> 0x016d }
            android.widget.TextView r4 = r4.f25961g     // Catch:{ Exception -> 0x016d }
            ld.f r0 = r3.p1()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.i()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            android.widget.TextView r4 = r4.f27424t0     // Catch:{ Exception -> 0x016d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016d }
            r0.<init>()     // Catch:{ Exception -> 0x016d }
            java.lang.String r1 = "LL No. : "
            r0.append(r1)     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r1 = r3.n1()     // Catch:{ Exception -> 0x016d }
            java.lang.String r1 = r1.getLearningLicence()     // Catch:{ Exception -> 0x016d }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x016d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x016d }
            r0.append(r1)     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27420p0     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r3.n1()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.getFullName()     // Catch:{ Exception -> 0x016d }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27418n0     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r3.n1()     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.ApplicantAddress r0 = r0.getApplicantAddress()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.getSwdFullName()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27419o0     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r3.n1()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.getDateOfBirth()     // Catch:{ Exception -> 0x016d }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27417m0     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r3.n1()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.getBloodgroup()     // Catch:{ Exception -> 0x016d }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27421q0     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r3.n1()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.getDateOfIssue()     // Catch:{ Exception -> 0x016d }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27423s0     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r3.n1()     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.State r0 = r0.getState()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.getStateName()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27422r0     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = r3.n1()     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.RTO r0 = r0.getRTO()     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.getRTOName()     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r4 = r3.n1()     // Catch:{ Exception -> 0x016d }
            java.util.List r4 = r4.getCovobj()     // Catch:{ Exception -> 0x016d }
            int r4 = r4.size()     // Catch:{ Exception -> 0x016d }
            r0 = 0
        L_0x0130:
            if (r0 >= r4) goto L_0x0162
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016d }
            r1.<init>()     // Catch:{ Exception -> 0x016d }
            java.lang.String r2 = r3.J     // Catch:{ Exception -> 0x016d }
            r1.append(r2)     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r2 = r3.n1()     // Catch:{ Exception -> 0x016d }
            java.util.List r2 = r2.getCovobj()     // Catch:{ Exception -> 0x016d }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x016d }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.Covobj r2 = (com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.Covobj) r2     // Catch:{ Exception -> 0x016d }
            java.lang.String r2 = r2.getCovAbbr()     // Catch:{ Exception -> 0x016d }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x016d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x016d }
            r1.append(r2)     // Catch:{ Exception -> 0x016d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x016d }
            r3.J = r1     // Catch:{ Exception -> 0x016d }
            int r0 = r0 + 1
            goto L_0x0130
        L_0x0162:
            ni.m5 r4 = r3.o1()     // Catch:{ Exception -> 0x016d }
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f27415k0     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r3.J     // Catch:{ Exception -> 0x016d }
            r4.setText(r0)     // Catch:{ Exception -> 0x016d }
        L_0x016d:
            ni.m5 r4 = r3.o1()
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = r4.M
            qb.x r0 = new qb.x
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.m5 r4 = r3.o1()
            android.widget.ImageView r4 = r4.G
            qb.y r0 = new qb.y
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.m5 r4 = r3.o1()
            android.widget.ImageView r4 = r4.N
            qb.z r0 = new qb.z
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.m5 r4 = r3.o1()
            android.widget.ImageView r4 = r4.O
            qb.a0 r0 = new qb.a0
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.m5 r4 = r3.o1()
            android.widget.ImageView r4 = r4.f27433z
            qb.b0 r0 = new qb.b0
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.m5 r4 = r3.o1()
            android.widget.ImageView r4 = r4.C
            qb.c0 r0 = new qb.c0
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.m5 r4 = r3.o1()
            android.widget.ImageView r4 = r4.f27428w0
            qb.d0 r0 = new qb.d0
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            ni.m5 r4 = r3.o1()
            android.widget.ImageView r4 = r4.f27430x0
            qb.e0 r0 = new qb.e0
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLMainScreen.LlDetails.onCreate(android.os.Bundle):void");
    }

    public final f p1() {
        f fVar = this.I;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarathiSession");
        return null;
    }

    public final void y1(FetchLlDetails fetchLlDetails) {
        l.f(fetchLlDetails, "<set-?>");
        this.H = fetchLlDetails;
    }

    public final void z1(m5 m5Var) {
        l.f(m5Var, "<set-?>");
        this.G = m5Var;
    }
}
