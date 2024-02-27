package com.nic.mparivahan.DLServicesAuth.View;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cm.l;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import ld.c;
import ld.f;
import ni.ha;
import oi.g;

public final class DlServiceDetailsActivity extends g {
    public ha J;
    private String K;
    private String L;
    private String M;
    public DldetobjX N;
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    public LinearLayout S;
    private HashMap T = new HashMap();
    public f U;
    public c V;

    /* access modifiers changed from: private */
    public static final void L1(View view) {
    }

    /* access modifiers changed from: private */
    public static final void M1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        ImageView imageView;
        int i10;
        l.f(dlServiceDetailsActivity, "this$0");
        if (dlServiceDetailsActivity.G1().B.getVisibility() == 0) {
            dlServiceDetailsActivity.G1().B.setVisibility(8);
            imageView = dlServiceDetailsActivity.G1().D;
            i10 = R.drawable.ic_arrow_down;
        } else {
            dlServiceDetailsActivity.G1().B.setVisibility(0);
            imageView = dlServiceDetailsActivity.G1().D;
            i10 = R.drawable.ic_arrow_up;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void N1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.G1().N.setVisibility(8);
        dlServiceDetailsActivity.G1().O.setVisibility(0);
        dlServiceDetailsActivity.G1().J.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void O1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.G1().N.setVisibility(0);
        dlServiceDetailsActivity.G1().O.setVisibility(8);
        dlServiceDetailsActivity.G1().J.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void P1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.G1().f26683z.setVisibility(8);
        dlServiceDetailsActivity.G1().C.setVisibility(0);
        dlServiceDetailsActivity.G1().I.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void Q1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.G1().C.setVisibility(8);
        dlServiceDetailsActivity.G1().f26683z.setVisibility(0);
        dlServiceDetailsActivity.G1().I.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void R1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.G1().f26684z0.setVisibility(8);
        dlServiceDetailsActivity.G1().A0.setVisibility(0);
        dlServiceDetailsActivity.G1().K.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void S1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.G1().f26684z0.setVisibility(0);
        dlServiceDetailsActivity.G1().A0.setVisibility(8);
        dlServiceDetailsActivity.G1().K.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void T1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void U1(DlServiceDetailsActivity dlServiceDetailsActivity, View view) {
        l.f(dlServiceDetailsActivity, "this$0");
        dlServiceDetailsActivity.finish();
    }

    public final String F1(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final ha G1() {
        ha haVar = this.J;
        if (haVar != null) {
            return haVar;
        }
        l.v("binding");
        return null;
    }

    public final DldetobjX H1() {
        DldetobjX dldetobjX = this.N;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final c I1() {
        c cVar = this.V;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final LinearLayout J1() {
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("ll_home");
        return null;
    }

    public final f K1() {
        f fVar = this.U;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void V1(ha haVar) {
        l.f(haVar, "<set-?>");
        this.J = haVar;
    }

    public final void W1(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.N = dldetobjX;
    }

    public final void X1(c cVar) {
        l.f(cVar, "<set-?>");
        this.V = cVar;
    }

    public final void Y1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.S = linearLayout;
    }

    public final void Z1(f fVar) {
        l.f(fVar, "<set-?>");
        this.U = fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|5|(3:7|8|(1:10)(39:11|13|(2:15|(1:17)(36:18|20|(2:22|(1:24)(33:25|27|(1:29)(1:30)|31|32|33|34|(3:36|37|(1:39)(25:40|42|(2:44|(1:46)(22:47|49|(2:51|(1:53)(19:54|56|(2:58|(1:60)(16:61|63|(2:65|(1:67)(13:68|70|(2:72|(1:74)(10:75|76|78|(1:80)(1:81)|82|(1:84)(3:85|(1:87)|88)|89|(3:91|(2:93|94)|98)|95|97))|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|62|63|(0)|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|55|56|(0)|62|63|(0)|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|48|49|(0)|55|56|(0)|62|63|(0)|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|41|42|(0)|48|49|(0)|55|56|(0)|62|63|(0)|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|26|27|(0)(0)|31|32|33|34|(0)|41|42|(0)|48|49|(0)|55|56|(0)|62|63|(0)|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|19|20|(0)|26|27|(0)(0)|31|32|33|34|(0)|41|42|(0)|48|49|(0)|55|56|(0)|62|63|(0)|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97))|12|13|(0)|19|20|(0)|26|27|(0)(0)|31|32|33|34|(0)|41|42|(0)|48|49|(0)|55|56|(0)|62|63|(0)|69|70|(0)|77|76|78|(0)(0)|82|(0)(0)|89|(0)|95|97) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x01f4 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0174 A[Catch:{ Exception -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0197 A[Catch:{ Exception -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01ba A[Catch:{ Exception -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01bb A[Catch:{ Exception -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0204 A[SYNTHETIC, Splitter:B:36:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0238 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x026c A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02a0 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02d8 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x030c A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0388 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x038d A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0393 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x03a6 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03e5 A[Catch:{ Exception -> 0x0487 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            super.onCreate(r9)
            android.view.LayoutInflater r9 = r8.getLayoutInflater()
            ni.ha r9 = ni.ha.x(r9)
            java.lang.String r1 = "inflate(...)"
            cm.l.e(r9, r1)
            r8.V1(r9)
            ni.ha r9 = r8.G1()
            android.view.View r9 = r9.m()
            r8.setContentView((android.view.View) r9)
            ld.f r9 = new ld.f
            r9.<init>(r8)
            r8.Z1(r9)
            v9.e$a r9 = v9.e.f17509a
            ni.ha r1 = r8.G1()
            r9.q0(r8, r1)
            ld.c r9 = new ld.c
            r9.<init>(r8)
            r8.X1(r9)
            r9 = 2131363498(0x7f0a06aa, float:1.8346807E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(...)"
            cm.l.e(r9, r1)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r8.Y1(r9)
            android.widget.LinearLayout r9 = r8.J1()
            com.nic.mparivahan.DLServicesAuth.View.g r1 = new com.nic.mparivahan.DLServicesAuth.View.g
            r1.<init>()
            r9.setOnClickListener(r1)
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            ni.dc r9 = r9.f26682y0     // Catch:{ Exception -> 0x0487 }
            android.widget.TextView r9 = r9.f25961g     // Catch:{ Exception -> 0x0487 }
            ld.f r1 = r8.K1()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = r1.i()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r1)     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "DL"
            java.lang.String r9 = r9.getStringExtra(r1)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0487 }
            r8.K = r9     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "dob"
            java.lang.String r9 = r9.getStringExtra(r1)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0487 }
            r8.L = r9     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "Mobile_no"
            java.lang.String r9 = r9.getStringExtra(r1)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0487 }
            r8.M = r9     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "DLDetails"
            java.io.Serializable r9 = r9.getSerializableExtra(r1)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r9, r1)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = (com.nic.mparivahan.Dl.Model.DldetobjX) r9     // Catch:{ Exception -> 0x0487 }
            r8.W1(r9)     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "lastEndorsedRTO"
            java.lang.String r9 = r9.getStringExtra(r1)     // Catch:{ Exception -> 0x0487 }
            cm.l.d(r9, r0)     // Catch:{ Exception -> 0x0487 }
            r8.O = r9     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "lastEndorsedRTOCode"
            java.lang.String r9 = r9.getStringExtra(r1)     // Catch:{ Exception -> 0x0487 }
            cm.l.d(r9, r0)     // Catch:{ Exception -> 0x0487 }
            r8.Q = r9     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "lastEndorsedState"
            java.lang.String r9 = r9.getStringExtra(r1)     // Catch:{ Exception -> 0x0487 }
            cm.l.d(r9, r0)     // Catch:{ Exception -> 0x0487 }
            r8.P = r9     // Catch:{ Exception -> 0x0487 }
            android.content.Intent r9 = r8.getIntent()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "lastEndorseStateCode"
            java.lang.String r9 = r9.getStringExtra(r1)     // Catch:{ Exception -> 0x0487 }
            cm.l.d(r9, r0)     // Catch:{ Exception -> 0x0487 }
            r8.R = r9     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26672r0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.getBioFullName()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26670p0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.getBioSwdFullName()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26671q0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.getBioDob()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r8.F1(r0)     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26669o0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.getBioBloodGroup()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r9 = r9.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r9 = r9.getBioPermAdd1()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = ""
            if (r9 == 0) goto L_0x0165
            int r9 = r9.length()     // Catch:{ Exception -> 0x01f4 }
            if (r9 != 0) goto L_0x0158
            goto L_0x0165
        L_0x0158:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r9 = r9.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r9 = r9.getBioPermAdd1()     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0166
        L_0x0165:
            r9 = r0
        L_0x0166:
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r1 = r1.getBioPermAdd2()     // Catch:{ Exception -> 0x01f4 }
            if (r1 == 0) goto L_0x0188
            int r1 = r1.length()     // Catch:{ Exception -> 0x01f4 }
            if (r1 != 0) goto L_0x017b
            goto L_0x0188
        L_0x017b:
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r1 = r1.getBioPermAdd2()     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0189
        L_0x0188:
            r1 = r0
        L_0x0189:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r2 = r2.getBioPermAdd3()     // Catch:{ Exception -> 0x01f4 }
            if (r2 == 0) goto L_0x01ab
            int r2 = r2.length()     // Catch:{ Exception -> 0x01f4 }
            if (r2 != 0) goto L_0x019e
            goto L_0x01ab
        L_0x019e:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r2 = r2.getBioPermAdd3()     // Catch:{ Exception -> 0x01f4 }
            goto L_0x01ac
        L_0x01ab:
            r2 = r0
        L_0x01ac:
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            int r3 = r3.getBioPermPin()     // Catch:{ Exception -> 0x01f4 }
            if (r3 != 0) goto L_0x01bb
            goto L_0x01cb
        L_0x01bb:
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.H1()     // Catch:{ Exception -> 0x01f4 }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x01f4 }
            int r0 = r0.getBioPermPin()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
        L_0x01cb:
            ni.ha r3 = r8.G1()     // Catch:{ Exception -> 0x01f4 }
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26667m0     // Catch:{ Exception -> 0x01f4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f4 }
            r4.<init>()     // Catch:{ Exception -> 0x01f4 }
            r4.append(r9)     // Catch:{ Exception -> 0x01f4 }
            r9 = 32
            r4.append(r9)     // Catch:{ Exception -> 0x01f4 }
            r4.append(r1)     // Catch:{ Exception -> 0x01f4 }
            r4.append(r9)     // Catch:{ Exception -> 0x01f4 }
            r4.append(r2)     // Catch:{ Exception -> 0x01f4 }
            r4.append(r9)     // Catch:{ Exception -> 0x01f4 }
            r4.append(r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r9 = r4.toString()     // Catch:{ Exception -> 0x01f4 }
            r3.setText(r9)     // Catch:{ Exception -> 0x01f4 }
        L_0x01f4:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = r9.getDlIssuedt()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = "NA"
            if (r9 == 0) goto L_0x0221
            int r9 = r9.length()     // Catch:{ Exception -> 0x0487 }
            if (r9 != 0) goto L_0x020b
            goto L_0x0221
        L_0x020b:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26673s0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = r1.getDlIssuedt()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r1)     // Catch:{ Exception -> 0x0487 }
            goto L_0x022a
        L_0x0221:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26673s0     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
        L_0x022a:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = r9.getOmRtoShortname()     // Catch:{ Exception -> 0x0487 }
            if (r9 == 0) goto L_0x0255
            int r9 = r9.length()     // Catch:{ Exception -> 0x0487 }
            if (r9 != 0) goto L_0x023f
            goto L_0x0255
        L_0x023f:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26668n0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = r1.getOmRtoShortname()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r1)     // Catch:{ Exception -> 0x0487 }
            goto L_0x025e
        L_0x0255:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26668n0     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
        L_0x025e:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = r9.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0487 }
            if (r9 == 0) goto L_0x0289
            int r9 = r9.length()     // Catch:{ Exception -> 0x0487 }
            if (r9 != 0) goto L_0x0273
            goto L_0x0289
        L_0x0273:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26678w0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = r1.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r1)     // Catch:{ Exception -> 0x0487 }
            goto L_0x0292
        L_0x0289:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26678w0     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
        L_0x0292:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = r9.getDlTrValdtoDt()     // Catch:{ Exception -> 0x0487 }
            if (r9 == 0) goto L_0x02c1
            int r9 = r9.length()     // Catch:{ Exception -> 0x0487 }
            if (r9 != 0) goto L_0x02a7
            goto L_0x02c1
        L_0x02a7:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26680x0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = r1.getDlTrValdtoDt()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0487 }
            r9.setText(r1)     // Catch:{ Exception -> 0x0487 }
            goto L_0x02ca
        L_0x02c1:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26680x0     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
        L_0x02ca:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = r9.getStateName()     // Catch:{ Exception -> 0x0487 }
            if (r9 == 0) goto L_0x02f5
            int r9 = r9.length()     // Catch:{ Exception -> 0x0487 }
            if (r9 != 0) goto L_0x02df
            goto L_0x02f5
        L_0x02df:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26675u0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = r1.getStateName()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r1)     // Catch:{ Exception -> 0x0487 }
            goto L_0x02fe
        L_0x02f5:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26675u0     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
        L_0x02fe:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r9 = r9.getStateName()     // Catch:{ Exception -> 0x0487 }
            if (r9 == 0) goto L_0x0329
            int r9 = r9.length()     // Catch:{ Exception -> 0x0487 }
            if (r9 != 0) goto L_0x0313
            goto L_0x0329
        L_0x0313:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26675u0     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.getStateName()     // Catch:{ Exception -> 0x0487 }
        L_0x0325:
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            goto L_0x0330
        L_0x0329:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26675u0     // Catch:{ Exception -> 0x0487 }
            goto L_0x0325
        L_0x0330:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f26674t0     // Catch:{ Exception -> 0x0487 }
            ld.f r0 = r8.K1()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            android.widget.TextView r9 = r9.f26676v0     // Catch:{ Exception -> 0x0487 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0487 }
            r0.<init>()     // Catch:{ Exception -> 0x0487 }
            ld.c r1 = r8.I1()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r2 = "logo_dl_details"
            java.lang.String r3 = "Driving Licence Details"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0487 }
            r0.append(r1)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = "\n\nDL No.: "
            r0.append(r1)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r1 = r8.K     // Catch:{ Exception -> 0x0487 }
            r0.append(r1)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.appcompat.widget.AppCompatTextView r9 = r9.R     // Catch:{ Exception -> 0x0487 }
            ld.f r0 = r8.K1()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r0 = r0.i()     // Catch:{ Exception -> 0x0487 }
            r9.setText(r0)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r9 = r9.getBioImgObj()     // Catch:{ Exception -> 0x0487 }
            r0 = 0
            if (r9 == 0) goto L_0x038d
            java.lang.String r9 = r9.getBiPhoto()     // Catch:{ Exception -> 0x0487 }
            goto L_0x038e
        L_0x038d:
            r9 = r0
        L_0x038e:
            r1 = 8
            r2 = 0
            if (r9 != 0) goto L_0x03a6
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.cardview.widget.CardView r9 = r9.Q     // Catch:{ Exception -> 0x0487 }
            r9.setVisibility(r1)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.cardview.widget.CardView r9 = r9.F     // Catch:{ Exception -> 0x0487 }
            r9.setVisibility(r2)     // Catch:{ Exception -> 0x0487 }
            goto L_0x03d3
        L_0x03a6:
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.cardview.widget.CardView r9 = r9.Q     // Catch:{ Exception -> 0x0487 }
            r9.setVisibility(r2)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            androidx.cardview.widget.CardView r9 = r9.F     // Catch:{ Exception -> 0x0487 }
            r9.setVisibility(r1)     // Catch:{ Exception -> 0x0487 }
            ni.ha r9 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            android.widget.ImageView r9 = r9.H     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r1 = r1.getBioImgObj()     // Catch:{ Exception -> 0x0487 }
            if (r1 == 0) goto L_0x03cc
            java.lang.String r0 = r1.getBiPhoto()     // Catch:{ Exception -> 0x0487 }
        L_0x03cc:
            android.graphics.Bitmap r0 = com.nic.mparivahan.dlservices.utilities.d.a(r0)     // Catch:{ Exception -> 0x0487 }
            r9.setImageBitmap(r0)     // Catch:{ Exception -> 0x0487 }
        L_0x03d3:
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            java.util.List r9 = r9.getDlcovs()     // Catch:{ Exception -> 0x0487 }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x0487 }
            boolean r9 = r9.isEmpty()     // Catch:{ Exception -> 0x0487 }
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x0487
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            java.util.List r9 = r9.getDlcovs()     // Catch:{ Exception -> 0x0487 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x0487 }
            r0 = r2
        L_0x03f2:
            if (r0 >= r9) goto L_0x0487
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x0487 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0487 }
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0487 }
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0487 }
            r1.setLayoutParams(r3)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.dlservices.widget.MyTextView r3 = new com.nic.mparivahan.dlservices.widget.MyTextView     // Catch:{ Exception -> 0x0487 }
            r3.<init>(r8)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = new com.nic.mparivahan.dlservices.widget.MyTextView     // Catch:{ Exception -> 0x0487 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0487 }
            android.widget.TableLayout$LayoutParams r6 = new android.widget.TableLayout$LayoutParams     // Catch:{ Exception -> 0x0487 }
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r5, r5, r7)     // Catch:{ Exception -> 0x0487 }
            r3.setLayoutParams(r6)     // Catch:{ Exception -> 0x0487 }
            android.widget.TableLayout$LayoutParams r6 = new android.widget.TableLayout$LayoutParams     // Catch:{ Exception -> 0x0487 }
            r6.<init>(r5, r5, r7)     // Catch:{ Exception -> 0x0487 }
            r4.setLayoutParams(r6)     // Catch:{ Exception -> 0x0487 }
            r5 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r5)     // Catch:{ Exception -> 0x0487 }
            r5 = 2131099793(0x7f060091, float:1.781195E38)
            int r5 = androidx.core.content.a.c(r8, r5)     // Catch:{ Exception -> 0x0487 }
            r4.setTextColor(r5)     // Catch:{ Exception -> 0x0487 }
            r5 = 2131099696(0x7f060030, float:1.7811752E38)
            int r5 = androidx.core.content.a.c(r8, r5)     // Catch:{ Exception -> 0x0487 }
            r3.setTextColor(r5)     // Catch:{ Exception -> 0x0487 }
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r5)     // Catch:{ Exception -> 0x0487 }
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT     // Catch:{ Exception -> 0x0487 }
            r3.setTypeface(r5)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            java.util.List r5 = r5.getDlcovs()     // Catch:{ Exception -> 0x0487 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.Dlcov r5 = (com.nic.mparivahan.Dl.Model.Dlcov) r5     // Catch:{ Exception -> 0x0487 }
            java.lang.String r5 = r5.getCovdesc()     // Catch:{ Exception -> 0x0487 }
            r3.setText(r5)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r8.H1()     // Catch:{ Exception -> 0x0487 }
            java.util.List r5 = r5.getDlcovs()     // Catch:{ Exception -> 0x0487 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Exception -> 0x0487 }
            com.nic.mparivahan.Dl.Model.Dlcov r5 = (com.nic.mparivahan.Dl.Model.Dlcov) r5     // Catch:{ Exception -> 0x0487 }
            java.lang.String r5 = r5.getCovabbrv()     // Catch:{ Exception -> 0x0487 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0487 }
            r5 = 5
            r3.setPadding(r5, r5, r5, r5)     // Catch:{ Exception -> 0x0487 }
            r4.setPadding(r5, r5, r5, r5)     // Catch:{ Exception -> 0x0487 }
            r1.addView(r3, r2)     // Catch:{ Exception -> 0x0487 }
            r1.addView(r4, r2)     // Catch:{ Exception -> 0x0487 }
            ni.ha r3 = r8.G1()     // Catch:{ Exception -> 0x0487 }
            android.widget.LinearLayout r3 = r3.K     // Catch:{ Exception -> 0x0487 }
            r3.addView(r1)     // Catch:{ Exception -> 0x0487 }
            int r0 = r0 + 1
            goto L_0x03f2
        L_0x0487:
            ni.ha r9 = r8.G1()
            androidx.cardview.widget.CardView r9 = r9.B0
            com.nic.mparivahan.DLServicesAuth.View.h r0 = new com.nic.mparivahan.DLServicesAuth.View.h
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            android.widget.ImageView r9 = r9.N
            com.nic.mparivahan.DLServicesAuth.View.i r0 = new com.nic.mparivahan.DLServicesAuth.View.i
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            android.widget.ImageView r9 = r9.O
            com.nic.mparivahan.DLServicesAuth.View.j r0 = new com.nic.mparivahan.DLServicesAuth.View.j
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            android.widget.ImageView r9 = r9.f26683z
            com.nic.mparivahan.DLServicesAuth.View.k r0 = new com.nic.mparivahan.DLServicesAuth.View.k
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            android.widget.ImageView r9 = r9.C
            com.nic.mparivahan.DLServicesAuth.View.l r0 = new com.nic.mparivahan.DLServicesAuth.View.l
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            android.widget.ImageView r9 = r9.f26684z0
            com.nic.mparivahan.DLServicesAuth.View.m r0 = new com.nic.mparivahan.DLServicesAuth.View.m
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            android.widget.ImageView r9 = r9.A0
            com.nic.mparivahan.DLServicesAuth.View.n r0 = new com.nic.mparivahan.DLServicesAuth.View.n
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r9 = r9.M
            com.nic.mparivahan.DLServicesAuth.View.o r0 = new com.nic.mparivahan.DLServicesAuth.View.o
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            ni.ha r9 = r8.G1()
            android.widget.ImageView r9 = r9.G
            com.nic.mparivahan.DLServicesAuth.View.p r0 = new com.nic.mparivahan.DLServicesAuth.View.p
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity.onCreate(android.os.Bundle):void");
    }
}
