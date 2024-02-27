package com.nic.mparivahan.sarathithreeservices.adharmobile;

import android.content.Intent;
import android.view.View;
import cm.l;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import ld.c;
import ld.f;
import ni.r8;
import oi.g;

public final class UserAdharDetails extends g {
    public r8 J;
    public f K;
    public c L;
    private Aadarkyc.DOEkyc M;
    public DldetobjX N;
    private String O;
    private String P;
    private String Q = "";

    /* access modifiers changed from: private */
    public static final void B1(UserAdharDetails userAdharDetails, View view) {
        l.f(userAdharDetails, "this$0");
        userAdharDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(UserAdharDetails userAdharDetails, View view) {
        l.f(userAdharDetails, "this$0");
        userAdharDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void D1(UserAdharDetails userAdharDetails, View view) {
        l.f(userAdharDetails, "this$0");
        try {
            Intent intent = new Intent(userAdharDetails, ConfirmMobNo.class);
            Aadarkyc.DOEkyc dOEkyc = userAdharDetails.M;
            if (dOEkyc == null) {
                l.v("aadharData");
                dOEkyc = null;
            }
            intent.putExtra("aadharData", dOEkyc);
            intent.putExtra("DLDetails", userAdharDetails.z1());
            intent.putExtra("DL", userAdharDetails.O);
            intent.putExtra("dob", userAdharDetails.P);
            intent.putExtra("aadhaarLastFourDigitMobileNo", userAdharDetails.Q);
            userAdharDetails.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final c A1() {
        c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final void E1(r8 r8Var) {
        l.f(r8Var, "<set-?>");
        this.J = r8Var;
    }

    public final void F1(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.N = dldetobjX;
    }

    public final void G1(c cVar) {
        l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void H1(f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e3 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ed A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0322 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x032c A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x035f A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0369 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01a8 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b2 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01e7 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f1 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0226 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0230 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0265 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x026f A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02a4 A[Catch:{ Exception -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02ae A[Catch:{ Exception -> 0x03c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "aadharData"
            super.onCreate(r6)
            android.view.LayoutInflater r6 = r5.getLayoutInflater()
            ni.r8 r6 = ni.r8.x(r6)
            java.lang.String r1 = "inflate(...)"
            cm.l.e(r6, r1)
            r5.E1(r6)
            ni.r8 r6 = r5.y1()
            android.view.View r6 = r6.m()
            r5.setContentView((android.view.View) r6)
            ld.f r6 = new ld.f
            r6.<init>(r5)
            r5.H1(r6)
            ld.c r6 = new ld.c
            r6.<init>(r5)
            r5.G1(r6)
            ni.r8 r6 = r5.y1()
            ni.dc r6 = r6.f28395f0
            android.widget.TextView r6 = r6.f25961g
            ld.c r1 = r5.A1()
            java.lang.String r2 = "label_dl_serv_update_mob"
            java.lang.String r3 = "Update Mobile Number"
            java.lang.String r1 = r1.b(r2, r3)
            r6.setText(r1)
            ni.r8 r6 = r5.y1()
            ni.dc r6 = r6.f28395f0
            android.widget.ImageView r6 = r6.f25959e
            nk.b0 r1 = new nk.b0
            r1.<init>(r5)
            r6.setOnClickListener(r1)
            android.content.Intent r6 = r5.getIntent()     // Catch:{ Exception -> 0x03c3 }
            android.os.Parcelable r6 = r6.getParcelableExtra(r0)     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r6)     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = (com.nic.mparivahan.VahanEkyc.Aadarkyc.DOEkyc) r6     // Catch:{ Exception -> 0x03c3 }
            r5.M = r6     // Catch:{ Exception -> 0x03c3 }
            android.content.Intent r6 = r5.getIntent()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "DLDetails"
            java.io.Serializable r6 = r6.getSerializableExtra(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r6, r1)     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x03c3 }
            r5.F1(r6)     // Catch:{ Exception -> 0x03c3 }
            android.content.Intent r6 = r5.getIntent()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "dob"
            java.lang.String r6 = r6.getStringExtra(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x03c3 }
            r5.P = r6     // Catch:{ Exception -> 0x03c3 }
            android.content.Intent r6 = r5.getIntent()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "DL"
            java.lang.String r6 = r6.getStringExtra(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x03c3 }
            r5.O = r6     // Catch:{ Exception -> 0x03c3 }
            android.content.Intent r6 = r5.getIntent()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "aadhaarLastFourDigitMobileNo"
            java.lang.String r6 = r6.getStringExtra(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x03c3 }
            r5.Q = r6     // Catch:{ Exception -> 0x03c3 }
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            android.widget.TextView r6 = r6.f28390a0     // Catch:{ Exception -> 0x03c3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03c3 }
            r1.<init>()     // Catch:{ Exception -> 0x03c3 }
            ld.c r2 = r5.A1()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = "dl_no"
            java.lang.String r4 = "DL No. : "
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x03c3 }
            r1.append(r2)     // Catch:{ Exception -> 0x03c3 }
            r2 = 32
            r1.append(r2)     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r5.z1()     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r2 = r2.getBioDlno()     // Catch:{ Exception -> 0x03c3 }
            r1.append(r2)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.Z     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = r5.M     // Catch:{ Exception -> 0x03c3 }
            r2 = 0
            if (r1 != 0) goto L_0x00ee
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r1 = r2
        L_0x00ee:
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28392c0     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r1 != 0) goto L_0x010e
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r1 = r2
        L_0x010e:
            java.lang.String r1 = r1.getDob()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28394e0     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r1 != 0) goto L_0x0123
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r1 = r2
        L_0x0123:
            java.lang.String r1 = r1.getCareOf()     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x013a
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x013a:
            java.lang.String r6 = r6.getGender()     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r6 = km.q.B0(r6)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "M"
            boolean r6 = cm.l.a(r6, r1)     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x015a
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28393d0     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "Male"
        L_0x0156:
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x0163
        L_0x015a:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28393d0     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "Female"
            goto L_0x0156
        L_0x0163:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x016b
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x016b:
            java.lang.String r6 = r6.getHouse()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = "NA"
            if (r6 == 0) goto L_0x019b
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x017a
            goto L_0x019b
        L_0x017a:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.L     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r3 != 0) goto L_0x0188
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r3 = r2
        L_0x0188:
            java.lang.String r3 = r3.getHouse()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r3)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x01a4
        L_0x019b:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.L     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
        L_0x01a4:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x01ac
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x01ac:
            java.lang.String r6 = r6.getStreet()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x01da
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x01b9
            goto L_0x01da
        L_0x01b9:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.W     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r3 != 0) goto L_0x01c7
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r3 = r2
        L_0x01c7:
            java.lang.String r3 = r3.getStreet()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r3)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x01e3
        L_0x01da:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.W     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
        L_0x01e3:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x01eb
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x01eb:
            java.lang.String r6 = r6.getLocalityIfAny()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x0219
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x01f8
            goto L_0x0219
        L_0x01f8:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.P     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r3 != 0) goto L_0x0206
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r3 = r2
        L_0x0206:
            java.lang.String r3 = r3.getLocalityIfAny()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r3)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x0222
        L_0x0219:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.P     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
        L_0x0222:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x022a
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x022a:
            java.lang.String r6 = r6.getLandMark()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x0258
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0237
            goto L_0x0258
        L_0x0237:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.N     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r3 != 0) goto L_0x0245
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r3 = r2
        L_0x0245:
            java.lang.String r3 = r3.getLandMark()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r3)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x0261
        L_0x0258:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.N     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
        L_0x0261:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0269
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x0269:
            java.lang.String r6 = r6.getVillageTownCity()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x0297
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0276
            goto L_0x0297
        L_0x0276:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.Y     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r3 != 0) goto L_0x0284
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r3 = r2
        L_0x0284:
            java.lang.String r3 = r3.getVillageTownCity()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r3)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x02a0
        L_0x0297:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.Y     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
        L_0x02a0:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x02a8
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x02a8:
            java.lang.String r6 = r6.getPincode()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x02d6
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x02b5
            goto L_0x02d6
        L_0x02b5:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.S     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r3 != 0) goto L_0x02c3
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r3 = r2
        L_0x02c3:
            java.lang.String r3 = r3.getPincode()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r3)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x02df
        L_0x02d6:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.S     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
        L_0x02df:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x02e7
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x02e7:
            java.lang.String r6 = r6.getDist()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x0315
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x02f4
            goto L_0x0315
        L_0x02f4:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28399j0     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r3 != 0) goto L_0x0302
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r3 = r2
        L_0x0302:
            java.lang.String r3 = r3.getDist()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r3)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x031e
        L_0x0315:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28399j0     // Catch:{ Exception -> 0x03c3 }
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
        L_0x031e:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0326
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x0326:
            java.lang.String r6 = r6.getState()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x0354
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0333
            goto L_0x0354
        L_0x0333:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28400k0     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r1 != 0) goto L_0x0341
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r1 = r2
        L_0x0341:
            java.lang.String r1 = r1.getState()     // Catch:{ Exception -> 0x03c3 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03c3 }
        L_0x0350:
            r6.setText(r1)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x035b
        L_0x0354:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f28400k0     // Catch:{ Exception -> 0x03c3 }
            goto L_0x0350
        L_0x035b:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0363
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x0363:
            java.lang.String r6 = r6.getPht()     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x03aa
            int r6 = r6.length()     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0370
            goto L_0x03aa
        L_0x0370:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r6 != 0) goto L_0x0378
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            r6 = r2
        L_0x0378:
            java.lang.String r6 = r6.getPht()     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r1 = ""
            boolean r6 = cm.l.a(r6, r1)     // Catch:{ Exception -> 0x03c3 }
            if (r6 == 0) goto L_0x0385
            goto L_0x03aa
        L_0x0385:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.cardview.widget.CardView r6 = r6.F     // Catch:{ Exception -> 0x03c3 }
            r1 = 0
            r6.setVisibility(r1)     // Catch:{ Exception -> 0x03c3 }
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            android.widget.ImageView r6 = r6.f28405z     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = r5.M     // Catch:{ Exception -> 0x03c3 }
            if (r1 != 0) goto L_0x039d
            cm.l.v(r0)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x039e
        L_0x039d:
            r2 = r1
        L_0x039e:
            java.lang.String r0 = r2.getPht()     // Catch:{ Exception -> 0x03c3 }
            android.graphics.Bitmap r0 = com.nic.mparivahan.dlservices.utilities.d.a(r0)     // Catch:{ Exception -> 0x03c3 }
            r6.setImageBitmap(r0)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x03b5
        L_0x03aa:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            androidx.cardview.widget.CardView r6 = r6.F     // Catch:{ Exception -> 0x03c3 }
            r0 = 8
            r6.setVisibility(r0)     // Catch:{ Exception -> 0x03c3 }
        L_0x03b5:
            ni.r8 r6 = r5.y1()     // Catch:{ Exception -> 0x03c3 }
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = r6.f28402w     // Catch:{ Exception -> 0x03c3 }
            nk.c0 r0 = new nk.c0     // Catch:{ Exception -> 0x03c3 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x03c3 }
            r6.setOnClickListener(r0)     // Catch:{ Exception -> 0x03c3 }
        L_0x03c3:
            ni.r8 r6 = r5.y1()
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = r6.C
            nk.d0 r0 = new nk.d0
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.sarathithreeservices.adharmobile.UserAdharDetails.onCreate(android.os.Bundle):void");
    }

    public final r8 y1() {
        r8 r8Var = this.J;
        if (r8Var != null) {
            return r8Var;
        }
        l.v("binding");
        return null;
    }

    public final DldetobjX z1() {
        DldetobjX dldetobjX = this.N;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }
}
