package com.nic.mparivahan.ClServicesMainScreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import java.text.SimpleDateFormat;
import ld.c;
import ld.f;
import ni.n0;

public final class ClDetailsTop extends d {
    public n0 G;
    public Context H;
    public c I;
    public f J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";

    /* access modifiers changed from: private */
    public static final void t1(ClDetailsTop clDetailsTop, View view) {
        l.f(clDetailsTop, "this$0");
        clDetailsTop.finish();
    }

    /* access modifiers changed from: private */
    public static final void u1(ClDetailsTop clDetailsTop, View view) {
        l.f(clDetailsTop, "this$0");
        clDetailsTop.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(ClDetailsTop clDetailsTop, View view) {
        l.f(clDetailsTop, "this$0");
        clDetailsTop.q1().O.setVisibility(8);
        clDetailsTop.q1().P.setVisibility(0);
        clDetailsTop.q1().J.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void w1(ClDetailsTop clDetailsTop, View view) {
        l.f(clDetailsTop, "this$0");
        clDetailsTop.q1().O.setVisibility(0);
        clDetailsTop.q1().P.setVisibility(8);
        clDetailsTop.q1().J.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void x1(ClDetailsTop clDetailsTop, View view) {
        l.f(clDetailsTop, "this$0");
        clDetailsTop.q1().f27529z.setVisibility(8);
        clDetailsTop.q1().C.setVisibility(0);
        clDetailsTop.q1().I.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void y1(ClDetailsTop clDetailsTop, View view) {
        l.f(clDetailsTop, "this$0");
        clDetailsTop.q1().C.setVisibility(8);
        clDetailsTop.q1().f27529z.setVisibility(0);
        clDetailsTop.q1().I.setVisibility(8);
    }

    public final void A1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void B1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void C1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void E1(c cVar) {
        l.f(cVar, "<set-?>");
        this.I = cVar;
    }

    public final void F1(n0 n0Var) {
        l.f(n0Var, "<set-?>");
        this.G = n0Var;
    }

    public final void G1(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void I1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void K1(f fVar) {
        l.f(fVar, "<set-?>");
        this.J = fVar;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String l1(String str) {
        l.f(str, "date");
        try {
            String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
            l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public final String m1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("clName");
        return null;
    }

    public final String n1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("dlValue");
        return null;
    }

    public final String o1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("dobValue");
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x016a A[Catch:{ Exception -> 0x01e6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            r2.G1(r2)
            android.view.LayoutInflater r3 = r2.getLayoutInflater()
            ni.n0 r3 = ni.n0.x(r3)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r3, r0)
            r2.F1(r3)
            ni.n0 r3 = r2.q1()
            android.view.View r3 = r3.m()
            r2.setContentView((android.view.View) r3)
            ld.f r3 = new ld.f
            r3.<init>(r2)
            r2.K1(r3)
            ld.c r3 = new ld.c
            android.content.Context r0 = r2.r1()
            r3.<init>(r0)
            r2.E1(r3)
            v9.e$a r3 = v9.e.f17509a
            ni.n0 r0 = r2.q1()
            r3.Z(r2, r0)
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "dobValue"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.C1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "dlValue"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.B1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "fatherName"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.D1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "clName"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.z1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "clPhoto"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.A1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "rtoCode"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.I1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "rtoName"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.J1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "stateCode"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.L1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "Mobile_no"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.H1(r3)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "address"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.T = r3     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "issuing_authority"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.U = r3     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "validity"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.V = r3     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "cl_Status"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01e6 }
            r2.W = r3     // Catch:{ Exception -> 0x01e6 }
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27520m0     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r2.m1()     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27518k0     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r2.p1()     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = r2.o1()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "NA"
            if (r3 == 0) goto L_0x0152
            int r3 = r3.length()     // Catch:{ Exception -> 0x01e6 }
            if (r3 != 0) goto L_0x0140
            goto L_0x0152
        L_0x0140:
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27519l0     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = r2.o1()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = r2.l1(r1)     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r1)     // Catch:{ Exception -> 0x01e6 }
            goto L_0x015b
        L_0x0152:
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27519l0     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
        L_0x015b:
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27517j0     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = r2.T     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r1)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = r2.V     // Catch:{ Exception -> 0x01e6 }
            if (r3 == 0) goto L_0x0181
            int r3 = r3.length()     // Catch:{ Exception -> 0x01e6 }
            if (r3 != 0) goto L_0x0171
            goto L_0x0181
        L_0x0171:
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27523p0     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r2.V     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r2.l1(r0)     // Catch:{ Exception -> 0x01e6 }
        L_0x017d:
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
            goto L_0x0188
        L_0x0181:
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27523p0     // Catch:{ Exception -> 0x01e6 }
            goto L_0x017d
        L_0x0188:
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27516i0     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r2.U     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f27522o0     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r2.W     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            android.widget.TextView r3 = r3.f27521n0     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r0.<init>()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = "CL No. : "
            r0.append(r1)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = r2.n1()     // Catch:{ Exception -> 0x01e6 }
            r0.append(r1)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            ni.yb r3 = r3.L     // Catch:{ Exception -> 0x01e6 }
            android.widget.TextView r3 = r3.f29580g     // Catch:{ Exception -> 0x01e6 }
            ld.f r0 = r2.s1()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r0.i()     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
            ni.n0 r3 = r2.q1()     // Catch:{ Exception -> 0x01e6 }
            ni.yb r3 = r3.L     // Catch:{ Exception -> 0x01e6 }
            android.widget.TextView r3 = r3.f29581h     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r2.n1()     // Catch:{ Exception -> 0x01e6 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01e6 }
            r3.setText(r0)     // Catch:{ Exception -> 0x01e6 }
        L_0x01e6:
            ni.n0 r3 = r2.q1()
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r3 = r3.N
            u9.j r0 = new u9.j
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            ni.n0 r3 = r2.q1()
            ni.yb r3 = r3.L
            android.widget.ImageView r3 = r3.f29577d
            u9.k r0 = new u9.k
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            ni.n0 r3 = r2.q1()
            android.widget.ImageView r3 = r3.O
            u9.l r0 = new u9.l
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            ni.n0 r3 = r2.q1()
            android.widget.ImageView r3 = r3.P
            u9.m r0 = new u9.m
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            ni.n0 r3 = r2.q1()
            android.widget.ImageView r3 = r3.f27529z
            u9.n r0 = new u9.n
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            ni.n0 r3 = r2.q1()
            android.widget.ImageView r3 = r3.C
            u9.o r0 = new u9.o
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop.onCreate(android.os.Bundle):void");
    }

    public final String p1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("fatherName");
        return null;
    }

    public final n0 q1() {
        n0 n0Var = this.G;
        if (n0Var != null) {
            return n0Var;
        }
        l.v("mBinding");
        return null;
    }

    public final Context r1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final f s1() {
        f fVar = this.J;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void z1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }
}
