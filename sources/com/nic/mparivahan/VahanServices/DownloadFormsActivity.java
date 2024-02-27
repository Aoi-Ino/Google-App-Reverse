package com.nic.mparivahan.VahanServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.FormDetailsSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import ni.z3;
import pl.x;
import v9.e;
import wd.i;
import wd.j;
import wd.k;
import wd.n;
import wd.o;
import wd.p;
import wd.q;
import wd.r;
import wd.s;
import wd.t;
import wd.u;

public final class DownloadFormsActivity extends d {
    /* access modifiers changed from: private */
    public z3 G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    private String K = "";
    private String L = "";
    private String M = "";
    private String N = "";
    private String O;
    /* access modifiers changed from: private */
    public int P;
    /* access modifiers changed from: private */
    public String Q = "";
    private ArrayList R = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadFormsActivity f20588e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DownloadFormsActivity downloadFormsActivity) {
            super(1);
            this.f20588e = downloadFormsActivity;
        }

        public final void b(FormDetailsSuccessModel formDetailsSuccessModel) {
            if (this.f20588e.B1().isShowing()) {
                this.f20588e.B1().dismiss();
            }
            z3 u12 = this.f20588e.G;
            if (u12 == null) {
                cm.l.v("binding");
                u12 = null;
            }
            u12.L.setVisibility(8);
            this.f20588e.P = formDetailsSuccessModel.getPur_cd();
            this.f20588e.Q = formDetailsSuccessModel.getRcpt_no();
            this.f20588e.V1(formDetailsSuccessModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FormDetailsSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadFormsActivity f20589e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DownloadFormsActivity downloadFormsActivity) {
            super(1);
            this.f20589e = downloadFormsActivity;
        }

        public final void b(String str) {
            if (this.f20589e.B1().isShowing()) {
                this.f20589e.B1().dismiss();
            }
            z3 u12 = this.f20589e.G;
            if (u12 == null) {
                cm.l.v("binding");
                u12 = null;
            }
            u12.L.setVisibility(0);
            this.f20589e.S1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20590a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20590a = lVar;
        }

        public final pl.c a() {
            return this.f20590a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20590a.invoke(obj);
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

    private final void A1() {
        try {
            B1().show();
            D1().S(this, this.K, this.L, this.N, this.M);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void E1() {
        W1(new ProgressDialog(this));
        B1().setMessage("Please wait...");
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        Y1((h) new u0((x0) this, (u0.b) new g(new wg.d(C1()))).a(h.class));
        z3 z3Var = this.G;
        z3 z3Var2 = null;
        if (z3Var == null) {
            cm.l.v("binding");
            z3Var = null;
        }
        z3Var.A.setVisibility(8);
        z3 z3Var3 = this.G;
        if (z3Var3 == null) {
            cm.l.v("binding");
            z3Var3 = null;
        }
        z3Var3.f29659z.setVisibility(8);
        z3 z3Var4 = this.G;
        if (z3Var4 == null) {
            cm.l.v("binding");
            z3Var4 = null;
        }
        z3Var4.B.setVisibility(8);
        z3 z3Var5 = this.G;
        if (z3Var5 == null) {
            cm.l.v("binding");
            z3Var5 = null;
        }
        z3Var5.C.setVisibility(8);
        z3 z3Var6 = this.G;
        if (z3Var6 == null) {
            cm.l.v("binding");
            z3Var6 = null;
        }
        z3Var6.D.setVisibility(8);
        z3 z3Var7 = this.G;
        if (z3Var7 == null) {
            cm.l.v("binding");
            z3Var7 = null;
        }
        z3Var7.E.setVisibility(8);
        z3 z3Var8 = this.G;
        if (z3Var8 == null) {
            cm.l.v("binding");
            z3Var8 = null;
        }
        z3Var8.F.setVisibility(8);
        z3 z3Var9 = this.G;
        if (z3Var9 == null) {
            cm.l.v("binding");
            z3Var9 = null;
        }
        z3Var9.G.setVisibility(8);
        z3 z3Var10 = this.G;
        if (z3Var10 == null) {
            cm.l.v("binding");
            z3Var10 = null;
        }
        z3Var10.H.setVisibility(8);
        z3 z3Var11 = this.G;
        if (z3Var11 == null) {
            cm.l.v("binding");
            z3Var11 = null;
        }
        z3Var11.I.setVisibility(8);
        z3 z3Var12 = this.G;
        if (z3Var12 == null) {
            cm.l.v("binding");
            z3Var12 = null;
        }
        z3Var12.J.setVisibility(8);
        z3 z3Var13 = this.G;
        if (z3Var13 == null) {
            cm.l.v("binding");
            z3Var13 = null;
        }
        z3Var13.K.setVisibility(8);
        A1();
        z3 z3Var14 = this.G;
        if (z3Var14 == null) {
            cm.l.v("binding");
            z3Var14 = null;
        }
        z3Var14.A.setOnClickListener(new o(this));
        z3 z3Var15 = this.G;
        if (z3Var15 == null) {
            cm.l.v("binding");
            z3Var15 = null;
        }
        z3Var15.f29659z.setOnClickListener(new r(this));
        z3 z3Var16 = this.G;
        if (z3Var16 == null) {
            cm.l.v("binding");
            z3Var16 = null;
        }
        z3Var16.B.setOnClickListener(new s(this));
        z3 z3Var17 = this.G;
        if (z3Var17 == null) {
            cm.l.v("binding");
            z3Var17 = null;
        }
        z3Var17.C.setOnClickListener(new t(this));
        z3 z3Var18 = this.G;
        if (z3Var18 == null) {
            cm.l.v("binding");
            z3Var18 = null;
        }
        z3Var18.D.setOnClickListener(new u(this));
        z3 z3Var19 = this.G;
        if (z3Var19 == null) {
            cm.l.v("binding");
            z3Var19 = null;
        }
        z3Var19.E.setOnClickListener(new wd.h(this));
        z3 z3Var20 = this.G;
        if (z3Var20 == null) {
            cm.l.v("binding");
            z3Var20 = null;
        }
        z3Var20.F.setOnClickListener(new i(this));
        z3 z3Var21 = this.G;
        if (z3Var21 == null) {
            cm.l.v("binding");
            z3Var21 = null;
        }
        z3Var21.G.setOnClickListener(new j(this));
        z3 z3Var22 = this.G;
        if (z3Var22 == null) {
            cm.l.v("binding");
            z3Var22 = null;
        }
        z3Var22.H.setOnClickListener(new k(this));
        z3 z3Var23 = this.G;
        if (z3Var23 == null) {
            cm.l.v("binding");
            z3Var23 = null;
        }
        z3Var23.I.setOnClickListener(new wd.l(this));
        z3 z3Var24 = this.G;
        if (z3Var24 == null) {
            cm.l.v("binding");
            z3Var24 = null;
        }
        z3Var24.J.setOnClickListener(new p(this));
        z3 z3Var25 = this.G;
        if (z3Var25 == null) {
            cm.l.v("binding");
        } else {
            z3Var2 = z3Var25;
        }
        z3Var2.K.setOnClickListener(new q(this));
    }

    /* access modifiers changed from: private */
    public static final void F1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getform_22_Fitness/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form22", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void G1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getForm34HPAReport/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form34", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void H1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getForm35HPTReport/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form35", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void I1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getForm36HPAReport/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form36", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void J1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getForm14Data/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form14", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void K1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getForm26DRCReports/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form26", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void L1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getForm28NOCReport/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form28", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void M1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getFormTO29Report/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form29", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void N1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getFormTO30Report/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form30", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void O1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getFormTO31Report/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form31", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void P1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getform_32_TO_Report/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form32", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void Q1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        StringBuilder sb2 = new StringBuilder();
        String str = downloadFormsActivity.O;
        if (str == null) {
            cm.l.v("baseUrl");
            str = null;
        }
        sb2.append(str);
        sb2.append("getFormCA33Report/");
        String sb3 = sb2.toString();
        downloadFormsActivity.z1(sb3 + downloadFormsActivity.L + '/' + downloadFormsActivity.M + '/' + downloadFormsActivity.N + '/' + downloadFormsActivity.P + '/' + downloadFormsActivity.Q + '/' + downloadFormsActivity.K, "Form33", downloadFormsActivity.N);
    }

    /* access modifiers changed from: private */
    public static final void R1(DownloadFormsActivity downloadFormsActivity, View view) {
        cm.l.f(downloadFormsActivity, "this$0");
        downloadFormsActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void S1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
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
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new wd.m(dialog));
        textView2.setOnClickListener(new n(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void V1(FormDetailsSuccessModel formDetailsSuccessModel) {
        cm.l.c(formDetailsSuccessModel);
        z3 z3Var = null;
        if (formDetailsSuccessModel.getRenForm22()) {
            this.R.add(1);
            z3 z3Var2 = this.G;
            if (z3Var2 == null) {
                cm.l.v("binding");
                z3Var2 = null;
            }
            z3Var2.A.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var3 = this.G;
            if (z3Var3 == null) {
                cm.l.v("binding");
                z3Var3 = null;
            }
            z3Var3.A.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenderForm14()) {
            this.R.add(1);
            z3 z3Var4 = this.G;
            if (z3Var4 == null) {
                cm.l.v("binding");
                z3Var4 = null;
            }
            z3Var4.f29659z.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var5 = this.G;
            if (z3Var5 == null) {
                cm.l.v("binding");
                z3Var5 = null;
            }
            z3Var5.f29659z.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm26()) {
            this.R.add(1);
            z3 z3Var6 = this.G;
            if (z3Var6 == null) {
                cm.l.v("binding");
                z3Var6 = null;
            }
            z3Var6.B.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var7 = this.G;
            if (z3Var7 == null) {
                cm.l.v("binding");
                z3Var7 = null;
            }
            z3Var7.B.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm28()) {
            this.R.add(1);
            z3 z3Var8 = this.G;
            if (z3Var8 == null) {
                cm.l.v("binding");
                z3Var8 = null;
            }
            z3Var8.C.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var9 = this.G;
            if (z3Var9 == null) {
                cm.l.v("binding");
                z3Var9 = null;
            }
            z3Var9.C.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm29()) {
            this.R.add(1);
            z3 z3Var10 = this.G;
            if (z3Var10 == null) {
                cm.l.v("binding");
                z3Var10 = null;
            }
            z3Var10.D.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var11 = this.G;
            if (z3Var11 == null) {
                cm.l.v("binding");
                z3Var11 = null;
            }
            z3Var11.D.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm30()) {
            this.R.add(1);
            z3 z3Var12 = this.G;
            if (z3Var12 == null) {
                cm.l.v("binding");
                z3Var12 = null;
            }
            z3Var12.E.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var13 = this.G;
            if (z3Var13 == null) {
                cm.l.v("binding");
                z3Var13 = null;
            }
            z3Var13.E.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm31()) {
            this.R.add(1);
            z3 z3Var14 = this.G;
            if (z3Var14 == null) {
                cm.l.v("binding");
                z3Var14 = null;
            }
            z3Var14.F.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var15 = this.G;
            if (z3Var15 == null) {
                cm.l.v("binding");
                z3Var15 = null;
            }
            z3Var15.F.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm32()) {
            this.R.add(1);
            z3 z3Var16 = this.G;
            if (z3Var16 == null) {
                cm.l.v("binding");
                z3Var16 = null;
            }
            z3Var16.G.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var17 = this.G;
            if (z3Var17 == null) {
                cm.l.v("binding");
                z3Var17 = null;
            }
            z3Var17.G.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm33()) {
            this.R.add(1);
            z3 z3Var18 = this.G;
            if (z3Var18 == null) {
                cm.l.v("binding");
                z3Var18 = null;
            }
            z3Var18.H.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var19 = this.G;
            if (z3Var19 == null) {
                cm.l.v("binding");
                z3Var19 = null;
            }
            z3Var19.H.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm34()) {
            this.R.add(1);
            z3 z3Var20 = this.G;
            if (z3Var20 == null) {
                cm.l.v("binding");
                z3Var20 = null;
            }
            z3Var20.I.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var21 = this.G;
            if (z3Var21 == null) {
                cm.l.v("binding");
                z3Var21 = null;
            }
            z3Var21.I.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm35()) {
            this.R.add(1);
            z3 z3Var22 = this.G;
            if (z3Var22 == null) {
                cm.l.v("binding");
                z3Var22 = null;
            }
            z3Var22.J.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var23 = this.G;
            if (z3Var23 == null) {
                cm.l.v("binding");
                z3Var23 = null;
            }
            z3Var23.J.setVisibility(8);
        }
        if (formDetailsSuccessModel.getRenForm36()) {
            this.R.add(1);
            z3 z3Var24 = this.G;
            if (z3Var24 == null) {
                cm.l.v("binding");
                z3Var24 = null;
            }
            z3Var24.K.setVisibility(0);
        } else {
            this.R.add(2);
            z3 z3Var25 = this.G;
            if (z3Var25 == null) {
                cm.l.v("binding");
                z3Var25 = null;
            }
            z3Var25.K.setVisibility(8);
        }
        try {
            if (this.R.size() > 0 && !this.R.contains(1)) {
                z3 z3Var26 = this.G;
                if (z3Var26 == null) {
                    cm.l.v("binding");
                } else {
                    z3Var = z3Var26;
                }
                z3Var.L.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    private final void z1(String str, String str2, String str3) {
        Intent intent = new Intent(this, PdfViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("formType", str2);
        intent.putExtra("applNo", str3);
        startActivity(intent);
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final VahanProService C1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final h D1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void W1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void X1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void Y1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_download_forms);
        z3 c10 = z3.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        z3 z3Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        z3 z3Var2 = this.G;
        if (z3Var2 == null) {
            cm.l.v("binding");
            z3Var2 = null;
        }
        aVar.C0(this, z3Var2);
        X1(VahanProService.f21196b.b(this));
        this.O = hc.a.f12073a.i();
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("state_code");
            cm.l.c(stringExtra);
            this.K = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("off_code");
            cm.l.c(stringExtra2);
            this.L = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("rc_number");
            cm.l.c(stringExtra3);
            this.M = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("appl_no");
            cm.l.c(stringExtra4);
            this.N = stringExtra4;
        }
        E1();
        z3 z3Var3 = this.G;
        if (z3Var3 == null) {
            cm.l.v("binding");
        } else {
            z3Var = z3Var3;
        }
        z3Var.M.f28305f.setOnClickListener(new wd.g(this));
        D1().a0().g(this, new c(new a(this)));
        D1().Z().g(this, new c(new b(this)));
    }
}
