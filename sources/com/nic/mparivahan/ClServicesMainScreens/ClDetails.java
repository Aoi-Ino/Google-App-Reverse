package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.GetClPojo;
import com.nic.mparivahan.R;
import j$.time.LocalDate;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ld.f;
import ni.l0;
import pl.x;
import u9.e;
import u9.g;
import u9.i;
import v9.e;

public final class ClDetails extends d {
    /* access modifiers changed from: private */
    public l0 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public f K;
    public t9.a L;
    public ClInter M;
    public String N;
    public String O;
    private String P = "NA";
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDetails f8063e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClDetails clDetails) {
            super(1);
            this.f8063e = clDetails;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x02e4 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x0301 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x031e A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0339 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0353 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x039f A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x03a3 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0114 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0131 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x014e A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0169 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0183 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01d2 A[Catch:{ Exception -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01d6 A[Catch:{ Exception -> 0x0078 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.ClServices.Pojo.GetClPojo r13) {
            /*
                r12 = this;
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e
                android.app.ProgressDialog r0 = r0.C1()
                r0.dismiss()
                java.lang.String r0 = r13.getCl_No()     // Catch:{ Exception -> 0x0078 }
                r1 = 8
                r2 = 0
                java.lang.String r3 = "mActivityClDetailsBinding"
                if (r0 == 0) goto L_0x0404
                int r0 = r0.length()     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x001c
                goto L_0x0404
            L_0x001c:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getAddress()     // Catch:{ Exception -> 0x0078 }
                r0.S1(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getValidity()     // Catch:{ Exception -> 0x0078 }
                r0.f2(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getIssuing_authority()     // Catch:{ Exception -> 0x0078 }
                r0.X1(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getCl_Status()     // Catch:{ Exception -> 0x0078 }
                r0.U1(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ld.f r0 = r0.D1()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = "552"
                boolean r0 = cm.l.a(r0, r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = " Service is not allowed for your Licence."
                java.lang.String r5 = "cl_service_not_allowed"
                java.lang.String r6 = ""
                java.lang.String r7 = "N.A"
                r8 = 32
                java.lang.String r9 = "NA"
                r10 = 0
                if (r0 != 0) goto L_0x0233
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r11 = r13.getValidity()     // Catch:{ Exception -> 0x0078 }
                boolean r0 = r0.u1(r11)     // Catch:{ Exception -> 0x0078 }
                if (r0 == 0) goto L_0x01e0
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x007b
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
                goto L_0x007b
            L_0x0078:
                r13 = move-exception
                goto L_0x041c
            L_0x007b:
                android.widget.ScrollView r0 = r0.D     // Catch:{ Exception -> 0x0078 }
                r0.setVisibility(r10)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x008c
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x008c:
                android.widget.TextView r0 = r0.f27235q0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getName()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x00a9
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x00a9:
                android.widget.TextView r0 = r0.f27226h0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getFather_Name()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r0 = r13.getMobile_No()     // Catch:{ Exception -> 0x0078 }
                if (r0 == 0) goto L_0x00f6
                int r0 = r0.length()     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x00c7
                goto L_0x00f6
            L_0x00c7:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x00d3
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x00d3:
                android.widget.TextView r0 = r0.f27232n0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getMobile_No()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getMobile_No()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.c2(r4)     // Catch:{ Exception -> 0x0078 }
                goto L_0x010c
            L_0x00f6:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0102
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x0102:
                android.widget.TextView r0 = r0.f27232n0     // Catch:{ Exception -> 0x0078 }
                r0.setText(r9)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                r0.c2(r9)     // Catch:{ Exception -> 0x0078 }
            L_0x010c:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0118
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x0118:
                android.widget.TextView r0 = r0.f27220b0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getAddress()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0135
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x0135:
                android.widget.TextView r0 = r0.f27228j0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getCl_No()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0152
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x0152:
                android.widget.TextView r0 = r0.f27230l0     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r4 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r5 = r13.getValidity()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.t1(r5)     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x016d
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x016d:
                android.widget.TextView r0 = r0.f27223e0     // Catch:{ Exception -> 0x0078 }
                r0.setText(r7)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.getPhoto()     // Catch:{ Exception -> 0x0078 }
                r0.T1(r13)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.v1()     // Catch:{ Exception -> 0x0078 }
                if (r13 == 0) goto L_0x01ca
                int r13 = r13.length()     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x018a
                goto L_0x01ca
            L_0x018a:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.v1()     // Catch:{ Exception -> 0x0078 }
                boolean r13 = cm.l.a(r13, r6)     // Catch:{ Exception -> 0x0078 }
                if (r13 == 0) goto L_0x0197
                goto L_0x01ca
            L_0x0197:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x01a3
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r13 = r2
            L_0x01a3:
                ni.dc r13 = r13.J     // Catch:{ Exception -> 0x0078 }
                androidx.cardview.widget.CardView r13 = r13.f25960f     // Catch:{ Exception -> 0x0078 }
                r13.setVisibility(r10)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x01b6
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                goto L_0x01b7
            L_0x01b6:
                r2 = r13
            L_0x01b7:
                ni.dc r13 = r2.J     // Catch:{ Exception -> 0x0078 }
                android.widget.ImageView r13 = r13.f25956b     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r0 = r0.v1()     // Catch:{ Exception -> 0x0078 }
                android.graphics.Bitmap r0 = com.nic.mparivahan.dlservices.utilities.d.a(r0)     // Catch:{ Exception -> 0x0078 }
            L_0x01c5:
                r13.setImageBitmap(r0)     // Catch:{ Exception -> 0x0078 }
                goto L_0x041f
            L_0x01ca:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x01d6
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                goto L_0x01d7
            L_0x01d6:
                r2 = r13
            L_0x01d7:
                ni.dc r13 = r2.J     // Catch:{ Exception -> 0x0078 }
                androidx.cardview.widget.CardView r13 = r13.f25960f     // Catch:{ Exception -> 0x0078 }
            L_0x01db:
                r13.setVisibility(r1)     // Catch:{ Exception -> 0x0078 }
                goto L_0x041f
            L_0x01e0:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x01ec
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                goto L_0x01ed
            L_0x01ec:
                r2 = r13
            L_0x01ed:
                android.widget.ScrollView r13 = r2.D     // Catch:{ Exception -> 0x0078 }
                r13.setVisibility(r1)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0078 }
                r0.<init>()     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r1 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ld.c r1 = r1.y1()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r2 = "cm_not_eligible"
                java.lang.String r3 = "Your Licence is expired hence"
                java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0078 }
                r0.append(r1)     // Catch:{ Exception -> 0x0078 }
                r0.append(r8)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r1 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ld.f r1 = r1.D1()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r1 = r1.i()     // Catch:{ Exception -> 0x0078 }
                r0.append(r1)     // Catch:{ Exception -> 0x0078 }
                r0.append(r8)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r1 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ld.c r1 = r1.y1()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r1 = r1.b(r5, r4)     // Catch:{ Exception -> 0x0078 }
                r0.append(r1)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0078 }
                r13.N1(r0)     // Catch:{ Exception -> 0x0078 }
                goto L_0x041f
            L_0x0233:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r11 = r13.getValidity()     // Catch:{ Exception -> 0x0078 }
                boolean r0 = r0.R1(r11)     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x03aa
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x024b
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x024b:
                android.widget.ScrollView r0 = r0.D     // Catch:{ Exception -> 0x0078 }
                r0.setVisibility(r10)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x025c
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x025c:
                android.widget.TextView r0 = r0.f27235q0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getName()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0279
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x0279:
                android.widget.TextView r0 = r0.f27226h0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getFather_Name()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r0 = r13.getMobile_No()     // Catch:{ Exception -> 0x0078 }
                if (r0 == 0) goto L_0x02c6
                int r0 = r0.length()     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0297
                goto L_0x02c6
            L_0x0297:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x02a3
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x02a3:
                android.widget.TextView r0 = r0.f27232n0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getMobile_No()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getMobile_No()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.c2(r4)     // Catch:{ Exception -> 0x0078 }
                goto L_0x02dc
            L_0x02c6:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x02d2
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x02d2:
                android.widget.TextView r0 = r0.f27232n0     // Catch:{ Exception -> 0x0078 }
                r0.setText(r9)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                r0.c2(r9)     // Catch:{ Exception -> 0x0078 }
            L_0x02dc:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x02e8
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x02e8:
                android.widget.TextView r0 = r0.f27220b0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getAddress()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0305
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x0305:
                android.widget.TextView r0 = r0.f27228j0     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r13.getCl_No()     // Catch:{ Exception -> 0x0078 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x0322
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x0322:
                android.widget.TextView r0 = r0.f27230l0     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r4 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r5 = r13.getValidity()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = r4.t1(r5)     // Catch:{ Exception -> 0x0078 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x033d
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r0 = r2
            L_0x033d:
                android.widget.TextView r0 = r0.f27223e0     // Catch:{ Exception -> 0x0078 }
                r0.setText(r7)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.getPhoto()     // Catch:{ Exception -> 0x0078 }
                r0.T1(r13)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.v1()     // Catch:{ Exception -> 0x0078 }
                if (r13 == 0) goto L_0x0397
                int r13 = r13.length()     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x035a
                goto L_0x0397
            L_0x035a:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.v1()     // Catch:{ Exception -> 0x0078 }
                boolean r13 = cm.l.a(r13, r6)     // Catch:{ Exception -> 0x0078 }
                if (r13 == 0) goto L_0x0367
                goto L_0x0397
            L_0x0367:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x0373
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                r13 = r2
            L_0x0373:
                ni.dc r13 = r13.J     // Catch:{ Exception -> 0x0078 }
                androidx.cardview.widget.CardView r13 = r13.f25960f     // Catch:{ Exception -> 0x0078 }
                r13.setVisibility(r10)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x0386
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                goto L_0x0387
            L_0x0386:
                r2 = r13
            L_0x0387:
                ni.dc r13 = r2.J     // Catch:{ Exception -> 0x0078 }
                android.widget.ImageView r13 = r13.f25956b     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r0 = r0.v1()     // Catch:{ Exception -> 0x0078 }
                android.graphics.Bitmap r0 = com.nic.mparivahan.dlservices.utilities.d.a(r0)     // Catch:{ Exception -> 0x0078 }
                goto L_0x01c5
            L_0x0397:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x03a3
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                goto L_0x03a4
            L_0x03a3:
                r2 = r13
            L_0x03a4:
                ni.dc r13 = r2.J     // Catch:{ Exception -> 0x0078 }
                androidx.cardview.widget.CardView r13 = r13.f25960f     // Catch:{ Exception -> 0x0078 }
                goto L_0x01db
            L_0x03aa:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r0 = r0.G     // Catch:{ Exception -> 0x0078 }
                if (r0 != 0) goto L_0x03b6
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                goto L_0x03b7
            L_0x03b6:
                r2 = r0
            L_0x03b7:
                android.widget.ScrollView r0 = r2.D     // Catch:{ Exception -> 0x0078 }
                r0.setVisibility(r1)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r0 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ld.c r1 = r0.y1()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r2 = "cl_is_valid_till"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0078 }
                r3.<init>()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r6 = "Your CL is valid till "
                r3.append(r6)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r6 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.getValidity()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r6.t1(r13)     // Catch:{ Exception -> 0x0078 }
                r3.append(r13)     // Catch:{ Exception -> 0x0078 }
                r3.append(r8)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ld.f r13 = r13.D1()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.i()     // Catch:{ Exception -> 0x0078 }
                r3.append(r13)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ld.c r13 = r13.y1()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r13.b(r5, r4)     // Catch:{ Exception -> 0x0078 }
                r3.append(r13)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r3.toString()     // Catch:{ Exception -> 0x0078 }
                java.lang.String r13 = r1.b(r2, r13)     // Catch:{ Exception -> 0x0078 }
                r0.N1(r13)     // Catch:{ Exception -> 0x0078 }
                goto L_0x041f
            L_0x0404:
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                java.lang.String r0 = "Details are not available."
                r13.N1(r0)     // Catch:{ Exception -> 0x0078 }
                com.nic.mparivahan.ClServicesMainScreens.ClDetails r13 = r12.f8063e     // Catch:{ Exception -> 0x0078 }
                ni.l0 r13 = r13.G     // Catch:{ Exception -> 0x0078 }
                if (r13 != 0) goto L_0x0417
                cm.l.v(r3)     // Catch:{ Exception -> 0x0078 }
                goto L_0x0418
            L_0x0417:
                r2 = r13
            L_0x0418:
                android.widget.ScrollView r13 = r2.D     // Catch:{ Exception -> 0x0078 }
                goto L_0x01db
            L_0x041c:
                r13.printStackTrace()
            L_0x041f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServicesMainScreens.ClDetails.a.b(com.nic.mparivahan.ClServices.Pojo.GetClPojo):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetClPojo) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDetails f8064e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ClDetails clDetails) {
            super(1);
            this.f8064e = clDetails;
        }

        public final void b(String str) {
            this.f8064e.C1().dismiss();
            Log.d("mGetClPojo_error", "error");
            this.f8064e.N1("Details are not available.");
            l0 q12 = this.f8064e.G;
            if (q12 == null) {
                cm.l.v("mActivityClDetailsBinding");
                q12 = null;
            }
            q12.D.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8065a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8065a = lVar;
        }

        public final pl.c a() {
            return this.f8065a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8065a.invoke(obj);
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

    private final void E1() {
        b2(this);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_cl_details);
        cm.l.e(f10, "setContentView(...)");
        this.G = (l0) f10;
        Y1(new ld.c(B1()));
        e2(new f(B1()));
        d2(new ProgressDialog(B1()));
        C1().setMessage(y1().b("label_challan_please_wait", getString(R.string.please_wait)));
        C1().setCancelable(false);
        C1().setCanceledOnTouchOutside(false);
        a2(ClInter.f7830a.a(B1()));
        Z1((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(A1()))).a(t9.a.class));
        try {
            W1(String.valueOf(getIntent().getStringExtra("dobValue")));
            V1(String.valueOf(getIntent().getStringExtra("dlValue")));
            l0 l0Var = this.G;
            l0 l0Var2 = null;
            if (l0Var == null) {
                cm.l.v("mActivityClDetailsBinding");
                l0Var = null;
            }
            l0Var.T.setText("CL No. : " + w1());
            l0 l0Var3 = this.G;
            if (l0Var3 == null) {
                cm.l.v("mActivityClDetailsBinding");
            } else {
                l0Var2 = l0Var3;
            }
            l0Var2.J.f25961g.setText(D1().i());
            C1().show();
            String obj = q.B0(w1()).toString();
            Charset forName = Charset.forName("UTF-8");
            cm.l.e(forName, "forName(charsetName)");
            byte[] bytes = obj.getBytes(forName);
            cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            String x12 = x1();
            Charset forName2 = Charset.forName("UTF-8");
            cm.l.e(forName2, "forName(charsetName)");
            byte[] bytes2 = x12.getBytes(forName2);
            cm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
            String encodeToString2 = Base64.encodeToString(bytes2, 0);
            t9.a z12 = z1();
            cm.l.c(encodeToString);
            cm.l.c(encodeToString2);
            z12.j(this, encodeToString, encodeToString2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void F1() {
        l0 l0Var = this.G;
        l0 l0Var2 = null;
        if (l0Var == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var = null;
        }
        l0Var.f27237w.setOnClickListener(new u9.a(this));
        l0 l0Var3 = this.G;
        if (l0Var3 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var3 = null;
        }
        l0Var3.f27239y.setOnClickListener(new u9.b(this));
        l0 l0Var4 = this.G;
        if (l0Var4 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var4 = null;
        }
        l0Var4.f27238x.setOnClickListener(new u9.c(this));
        l0 l0Var5 = this.G;
        if (l0Var5 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var5 = null;
        }
        l0Var5.f27240z.setOnClickListener(new u9.d(this));
        l0 l0Var6 = this.G;
        if (l0Var6 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var6 = null;
        }
        l0Var6.A.setOnClickListener(new e(this));
        l0 l0Var7 = this.G;
        if (l0Var7 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var7 = null;
        }
        l0Var7.J.f25959e.setOnClickListener(new u9.f(this));
        l0 l0Var8 = this.G;
        if (l0Var8 == null) {
            cm.l.v("mActivityClDetailsBinding");
        } else {
            l0Var2 = l0Var8;
        }
        l0Var2.B.setOnClickListener(new g(this));
    }

    /* access modifiers changed from: private */
    public static final void G1(ClDetails clDetails, View view) {
        cm.l.f(clDetails, "this$0");
        l0 l0Var = clDetails.G;
        l0 l0Var2 = null;
        if (l0Var == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var = null;
        }
        l0Var.I.setVisibility(0);
        l0 l0Var3 = clDetails.G;
        if (l0Var3 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var3 = null;
        }
        l0Var3.f27239y.setVisibility(0);
        l0 l0Var4 = clDetails.G;
        if (l0Var4 == null) {
            cm.l.v("mActivityClDetailsBinding");
        } else {
            l0Var2 = l0Var4;
        }
        l0Var2.f27237w.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void H1(ClDetails clDetails, View view) {
        cm.l.f(clDetails, "this$0");
        l0 l0Var = clDetails.G;
        l0 l0Var2 = null;
        if (l0Var == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var = null;
        }
        l0Var.I.setVisibility(8);
        l0 l0Var3 = clDetails.G;
        if (l0Var3 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var3 = null;
        }
        l0Var3.f27239y.setVisibility(8);
        l0 l0Var4 = clDetails.G;
        if (l0Var4 == null) {
            cm.l.v("mActivityClDetailsBinding");
        } else {
            l0Var2 = l0Var4;
        }
        l0Var2.f27237w.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void I1(ClDetails clDetails, View view) {
        cm.l.f(clDetails, "this$0");
        l0 l0Var = clDetails.G;
        l0 l0Var2 = null;
        if (l0Var == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var = null;
        }
        l0Var.H.setVisibility(0);
        l0 l0Var3 = clDetails.G;
        if (l0Var3 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var3 = null;
        }
        l0Var3.f27238x.setVisibility(8);
        l0 l0Var4 = clDetails.G;
        if (l0Var4 == null) {
            cm.l.v("mActivityClDetailsBinding");
        } else {
            l0Var2 = l0Var4;
        }
        l0Var2.f27240z.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void J1(ClDetails clDetails, View view) {
        cm.l.f(clDetails, "this$0");
        l0 l0Var = clDetails.G;
        l0 l0Var2 = null;
        if (l0Var == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var = null;
        }
        l0Var.H.setVisibility(8);
        l0 l0Var3 = clDetails.G;
        if (l0Var3 == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var3 = null;
        }
        l0Var3.f27238x.setVisibility(0);
        l0 l0Var4 = clDetails.G;
        if (l0Var4 == null) {
            cm.l.v("mActivityClDetailsBinding");
        } else {
            l0Var2 = l0Var4;
        }
        l0Var2.f27240z.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void K1(ClDetails clDetails, View view) {
        cm.l.f(clDetails, "this$0");
        clDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void L1(ClDetails clDetails, View view) {
        cm.l.f(clDetails, "this$0");
        clDetails.finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
        if (r2 == null) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0220, code lost:
        if (r2 == null) goto L_0x01cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void M1(com.nic.mparivahan.ClServicesMainScreens.ClDetails r16, android.view.View r17) {
        /*
            r0 = r16
            java.lang.String r1 = "this$0"
            cm.l.f(r0, r1)
            ni.l0 r1 = r0.G
            java.lang.String r3 = "mActivityClDetailsBinding"
            if (r1 != 0) goto L_0x0011
            cm.l.v(r3)
            r1 = 0
        L_0x0011:
            android.widget.EditText r1 = r1.f27236r0
            android.text.Editable r1 = r1.getText()
            r4 = 0
            if (r1 == 0) goto L_0x0237
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0022
            goto L_0x0237
        L_0x0022:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x002a
            cm.l.v(r3)
            r1 = 0
        L_0x002a:
            android.widget.EditText r1 = r1.f27233o0
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x022d
            int r1 = r1.length()
            if (r1 != 0) goto L_0x003a
            goto L_0x022d
        L_0x003a:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x0042
            cm.l.v(r3)
            r1 = 0
        L_0x0042:
            android.widget.EditText r1 = r1.f27233o0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            r5 = 12
            if (r1 <= r5) goto L_0x0069
            ld.c r1 = r16.y1()
            java.lang.String r2 = "duration_month_0_12"
            java.lang.String r3 = "Month duration should be 0 to 12"
        L_0x005c:
            java.lang.String r1 = r1.b(r2, r3)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r4)
            r0.show()
            goto L_0x0241
        L_0x0069:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x0071
            cm.l.v(r3)
            r1 = 0
        L_0x0071:
            android.widget.Spinner r1 = r1.P
            java.lang.Object r1 = r1.getSelectedItem()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "Select Marital Status"
            r6 = 1
            boolean r1 = km.p.o(r1, r5, r6)
            if (r1 == 0) goto L_0x008d
            ld.c r1 = r16.y1()
            java.lang.String r2 = "plz_select_ms"
            java.lang.String r3 = "Please select marital status"
            goto L_0x005c
        L_0x008d:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x0095
            cm.l.v(r3)
            r1 = 0
        L_0x0095:
            android.widget.Spinner r1 = r1.O
            java.lang.Object r1 = r1.getSelectedItem()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "Select Religion"
            boolean r1 = km.p.o(r1, r5, r6)
            if (r1 == 0) goto L_0x00b0
            ld.c r1 = r16.y1()
            java.lang.String r2 = "PLEASE_SELECT_REGION"
            java.lang.String r3 = "Please select religion"
            goto L_0x005c
        L_0x00b0:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x00b8
            cm.l.v(r3)
            r1 = 0
        L_0x00b8:
            android.widget.EditText r1 = r1.F
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            r5 = 3
            if (r1 >= r5) goto L_0x00ce
            ld.c r1 = r16.y1()
            java.lang.String r2 = "edit_dl_serv_enter_birth_plac"
            java.lang.String r3 = "Please enter birth place"
            goto L_0x005c
        L_0x00ce:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x00d6
            cm.l.v(r3)
            r1 = 0
        L_0x00d6:
            android.widget.EditText r1 = r1.G
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0223
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00e6
            goto L_0x0223
        L_0x00e6:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x00ee
            cm.l.v(r3)
            r1 = 0
        L_0x00ee:
            android.widget.EditText r1 = r1.G
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 >= r5) goto L_0x0104
            ld.c r1 = r16.y1()
            java.lang.String r2 = "plz_enter_valid_ps_name"
            java.lang.String r3 = "Please enter valid police station name"
            goto L_0x005c
        L_0x0104:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x010c
            cm.l.v(r3)
            r1 = 0
        L_0x010c:
            android.widget.Spinner r1 = r1.N
            java.lang.Object r1 = r1.getSelectedItem()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "Select Criminal History"
            boolean r1 = km.p.o(r1, r5, r6)
            if (r1 == 0) goto L_0x0128
            ld.c r1 = r16.y1()
            java.lang.String r2 = "pls_select_cm"
            java.lang.String r3 = "Please select criminal history"
            goto L_0x005c
        L_0x0128:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x0130
            cm.l.v(r3)
            r1 = 0
        L_0x0130:
            android.widget.Spinner r1 = r1.N
            java.lang.Object r1 = r1.getSelectedItem()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "Yes"
            boolean r1 = km.p.o(r1, r5, r6)
            if (r1 == 0) goto L_0x0153
            ld.c r1 = r16.y1()
            java.lang.String r2 = "cm_not_eligible"
            java.lang.String r3 = "You are not eligible to apply application because of your criminal history"
            java.lang.String r1 = r1.b(r2, r3)
            r0.P1(r1)
            goto L_0x0241
        L_0x0153:
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x015b
            cm.l.v(r3)
            r1 = 0
        L_0x015b:
            android.widget.EditText r1 = r1.f27236r0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r5 = "cl_Status"
            java.lang.String r7 = "issuing_authority"
            java.lang.String r8 = "validity"
            java.lang.String r9 = "address"
            java.lang.String r10 = "mobileNumber"
            java.lang.String r11 = "clPhoto"
            java.lang.String r12 = "clName"
            java.lang.String r13 = "fatherName"
            java.lang.String r14 = "dobValue"
            java.lang.String r15 = "dlValue"
            java.lang.Class<com.nic.mparivahan.ClServicesMainScreens.ClRtoSelect> r2 = com.nic.mparivahan.ClServicesMainScreens.ClRtoSelect.class
            if (r1 >= r6) goto L_0x01fa
            ni.l0 r1 = r0.G
            if (r1 != 0) goto L_0x0189
            cm.l.v(r3)
            r1 = 0
        L_0x0189:
            android.widget.EditText r1 = r1.f27233o0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            if (r1 >= r6) goto L_0x01a3
            ld.c r1 = r16.y1()
            java.lang.String r2 = "valid_duration_year"
            java.lang.String r3 = "Please enter valid stay of duration"
            goto L_0x005c
        L_0x01a3:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            java.lang.String r2 = r16.w1()
            r1.putExtra(r15, r2)
            java.lang.String r2 = r16.x1()
            r1.putExtra(r14, r2)
            ni.l0 r2 = r0.G
            if (r2 != 0) goto L_0x01be
            cm.l.v(r3)
            r2 = 0
        L_0x01be:
            android.widget.TextView r2 = r2.f27226h0
            java.lang.CharSequence r2 = r2.getText()
            r1.putExtra(r13, r2)
            ni.l0 r2 = r0.G
            if (r2 != 0) goto L_0x01cf
        L_0x01cb:
            cm.l.v(r3)
            r2 = 0
        L_0x01cf:
            android.widget.TextView r2 = r2.f27235q0
            java.lang.CharSequence r2 = r2.getText()
            r1.putExtra(r12, r2)
            java.lang.String r2 = r0.Q
            r1.putExtra(r11, r2)
            java.lang.String r2 = r0.P
            r1.putExtra(r10, r2)
            java.lang.String r2 = r0.R
            r1.putExtra(r9, r2)
            java.lang.String r2 = r0.T
            r1.putExtra(r8, r2)
            java.lang.String r2 = r0.S
            r1.putExtra(r7, r2)
            java.lang.String r2 = r0.U
            r1.putExtra(r5, r2)
            r0.startActivity(r1)
            goto L_0x0241
        L_0x01fa:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            java.lang.String r2 = r16.w1()
            r1.putExtra(r15, r2)
            java.lang.String r2 = r16.x1()
            r1.putExtra(r14, r2)
            ni.l0 r2 = r0.G
            if (r2 != 0) goto L_0x0215
            cm.l.v(r3)
            r2 = 0
        L_0x0215:
            android.widget.TextView r2 = r2.f27226h0
            java.lang.CharSequence r2 = r2.getText()
            r1.putExtra(r13, r2)
            ni.l0 r2 = r0.G
            if (r2 != 0) goto L_0x01cf
            goto L_0x01cb
        L_0x0223:
            ld.c r1 = r16.y1()
            java.lang.String r2 = "plz_enter_ps_name"
            java.lang.String r3 = "Please enter police station name"
            goto L_0x005c
        L_0x022d:
            ld.c r1 = r16.y1()
            java.lang.String r2 = "duration_monht"
            java.lang.String r3 = "Please enter duration month"
            goto L_0x005c
        L_0x0237:
            ld.c r1 = r16.y1()
            java.lang.String r2 = "duration_year"
            java.lang.String r3 = "Please enter duration year"
            goto L_0x005c
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServicesMainScreens.ClDetails.M1(com.nic.mparivahan.ClServicesMainScreens.ClDetails, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public final void N1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(y1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y1().b("btn_ok", "OK"));
        textView.setOnClickListener(new u9.h(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void O1(Dialog dialog, ClDetails clDetails, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(clDetails, "this$0");
        dialog.dismiss();
        clDetails.finish();
    }

    private final void P1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(y1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y1().b("btn_ok", "OK"));
        textView.setOnClickListener(new i(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Q1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final boolean R1(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            cm.l.e(format, "format(...)");
            Date parse = simpleDateFormat.parse(format);
            Log.d("date_date1", parse.toString());
            LocalDate parse2 = LocalDate.parse(str);
            cm.l.e(parse2, "parse(...)");
            Log.d("date_mLocalDate", parse2.toString());
            LocalDate minusDays = parse2.minusDays(0);
            Log.d("date_newCurrentLocalDate", minusDays.toString());
            Date parse3 = simpleDateFormat.parse(minusDays.toString());
            Log.d("date_newCurrentDate", parse3.toString());
            return parse3.compareTo(parse) >= 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    private final void o1() {
        z1().p().g(this, new c(new a(this)));
        z1().l().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public final boolean u1(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            cm.l.e(format, "format(...)");
            return simpleDateFormat.parse(str).compareTo(simpleDateFormat.parse(format)) >= 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    public final ClInter A1() {
        ClInter clInter = this.M;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final Context B1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ProgressDialog C1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final f D1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void Y1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void Z1(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.L = aVar;
    }

    public final void a2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.M = clInter;
    }

    public final void b2(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void d2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void e2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        E1();
        F1();
        o1();
        e.a aVar = v9.e.f17509a;
        l0 l0Var = this.G;
        if (l0Var == null) {
            cm.l.v("mActivityClDetailsBinding");
            l0Var = null;
        }
        aVar.Y(this, l0Var);
    }

    public final String t1(String str) {
        cm.l.f(str, "date");
        try {
            String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
            cm.l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return t1(str);
        }
    }

    public final String v1() {
        return this.Q;
    }

    public final String w1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final String x1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final ld.c y1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final t9.a z1() {
        t9.a aVar = this.L;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }
}
