package com.nic.mparivahan.VahanServices.DownloadAppoinForms;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.e;
import bi.f;
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.PDFViewInternalAcitvity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.io.File;
import java.lang.reflect.Method;
import me.n;
import me.o;
import me.p;
import ni.oa;
import pl.x;
import v9.e;

public final class DownloadNocHomeScreen extends d {
    private oa G;
    private bi.b H;
    private bi.a I;
    private ApplicationService J;
    private ApplicationServiceOtp K;
    public ProgressDialog L;
    public h M;
    public VahanProService N;
    private final String O = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public ld.c P;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadNocHomeScreen f20585e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DownloadNocHomeScreen downloadNocHomeScreen) {
            super(1);
            this.f20585e = downloadNocHomeScreen;
        }

        public final void b(String str) {
            this.f20585e.l1().dismiss();
            if (!ka.c.f13158a.m(str)) {
                DownloadNocHomeScreen downloadNocHomeScreen = this.f20585e;
                cm.l.c(str);
                downloadNocHomeScreen.u1(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadNocHomeScreen f20586e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DownloadNocHomeScreen downloadNocHomeScreen) {
            super(1);
            this.f20586e = downloadNocHomeScreen;
        }

        public final void b(String str) {
            this.f20586e.l1().dismiss();
            if (!p.o(str.toString(), "Error", true)) {
                VContant.Companion.M(this.f20586e, str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20587a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20587a = lVar;
        }

        public final pl.c a() {
            return this.f20587a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20587a.invoke(obj);
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

    private final void o1() {
        ApplicationService applicationService = this.J;
        oa oaVar = null;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.H = (bi.b) new u0((x0) this, (u0.b) new f(new wg.b(applicationService))).a(bi.b.class);
        ApplicationServiceOtp applicationServiceOtp = this.K;
        if (applicationServiceOtp == null) {
            cm.l.v("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.I = (bi.a) new u0((x0) this, (u0.b) new e(new wg.a(applicationServiceOtp))).a(bi.a.class);
        oa oaVar2 = this.G;
        if (oaVar2 == null) {
            cm.l.v("binding");
            oaVar2 = null;
        }
        oaVar2.f27830e.f28306g.setOnClickListener(new me.m(this));
        oa oaVar3 = this.G;
        if (oaVar3 == null) {
            cm.l.v("binding");
            oaVar3 = null;
        }
        oaVar3.f27830e.f28305f.setOnClickListener(new n(this));
        oa oaVar4 = this.G;
        if (oaVar4 == null) {
            cm.l.v("binding");
            oaVar4 = null;
        }
        oaVar4.f27834i.setOnClickListener(new o(this));
        oa oaVar5 = this.G;
        if (oaVar5 == null) {
            cm.l.v("binding");
            oaVar5 = null;
        }
        oaVar5.f27832g.setOnClickListener(new p(this));
        oa oaVar6 = this.G;
        if (oaVar6 == null) {
            cm.l.v("binding");
            oaVar6 = null;
        }
        oaVar6.f27841p.setKeyListener(DigitsKeyListener.getInstance(this.O));
        oa oaVar7 = this.G;
        if (oaVar7 == null) {
            cm.l.v("binding");
            oaVar7 = null;
        }
        oaVar7.f27841p.setRawInputType(4096);
        oa oaVar8 = this.G;
        if (oaVar8 == null) {
            cm.l.v("binding");
            oaVar8 = null;
        }
        oaVar8.f27840o.setKeyListener(DigitsKeyListener.getInstance(this.O));
        oa oaVar9 = this.G;
        if (oaVar9 == null) {
            cm.l.v("binding");
            oaVar9 = null;
        }
        oaVar9.f27840o.setRawInputType(4096);
        oa oaVar10 = this.G;
        if (oaVar10 == null) {
            cm.l.v("binding");
            oaVar10 = null;
        }
        oaVar10.f27839n.setKeyListener(DigitsKeyListener.getInstance(this.O));
        oa oaVar11 = this.G;
        if (oaVar11 == null) {
            cm.l.v("binding");
        } else {
            oaVar = oaVar11;
        }
        oaVar.f27839n.setRawInputType(4096);
    }

    /* access modifiers changed from: private */
    public static final void p1(DownloadNocHomeScreen downloadNocHomeScreen, View view) {
        cm.l.f(downloadNocHomeScreen, "this$0");
        downloadNocHomeScreen.t1();
    }

    /* access modifiers changed from: private */
    public static final void q1(DownloadNocHomeScreen downloadNocHomeScreen, View view) {
        cm.l.f(downloadNocHomeScreen, "this$0");
        downloadNocHomeScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void r1(DownloadNocHomeScreen downloadNocHomeScreen, View view) {
        cm.l.f(downloadNocHomeScreen, "this$0");
        oa oaVar = downloadNocHomeScreen.G;
        oa oaVar2 = null;
        if (oaVar == null) {
            cm.l.v("binding");
            oaVar = null;
        }
        Editable text = oaVar.f27839n.getText();
        cm.l.c(text);
        if (text.length() < 10) {
            Toast.makeText(downloadNocHomeScreen, downloadNocHomeScreen.k1().b("PLEASE_ENTER_APPLICATION", "Please enter the valid Application No"), 0).show();
            return;
        }
        downloadNocHomeScreen.l1().show();
        h n12 = downloadNocHomeScreen.n1();
        oa oaVar3 = downloadNocHomeScreen.G;
        if (oaVar3 == null) {
            cm.l.v("binding");
        } else {
            oaVar2 = oaVar3;
        }
        n12.o(downloadNocHomeScreen, String.valueOf(oaVar2.f27839n.getText()), downloadNocHomeScreen);
    }

    /* access modifiers changed from: private */
    public static final void s1(DownloadNocHomeScreen downloadNocHomeScreen, View view) {
        cm.l.f(downloadNocHomeScreen, "this$0");
        downloadNocHomeScreen.finish();
    }

    private final void t1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void u1(String str) {
        oa oaVar = null;
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            cm.l.e(method, "getMethod(...)");
            method.invoke((Object) null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String str2 = str + ".pdf";
        new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), '/' + str2);
        Log.e("tesfile2", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + str2);
        try {
            Intent intent = new Intent(this, PDFViewInternalAcitvity.class);
            intent.putExtra("HeaderName", "Download NOC Certificate");
            oa oaVar2 = this.G;
            if (oaVar2 == null) {
                cm.l.v("binding");
            } else {
                oaVar = oaVar2;
            }
            intent.putExtra("pdfname", String.valueOf(oaVar.f27839n.getText()));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "File not found", 1).show();
        }
    }

    public final ld.c k1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog l1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final VahanProService m1() {
        VahanProService vahanProService = this.N;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanProService");
        return null;
    }

    public final h n1() {
        h hVar = this.M;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanProViewModle");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.download_forms_liera);
        oa c10 = oa.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        oa oaVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        e.a aVar = v9.e.f17509a;
        oa oaVar2 = this.G;
        if (oaVar2 == null) {
            cm.l.v("binding");
        } else {
            oaVar = oaVar2;
        }
        aVar.h2(this, oaVar);
        v1(new ld.c(this));
        this.J = ApplicationService.f21181a.b(this);
        this.K = ApplicationServiceOtp.f21184a.b(this);
        w1(new ProgressDialog(this));
        l1().setMessage("Please wait...");
        l1().setCancelable(false);
        l1().setCanceledOnTouchOutside(false);
        x1(VahanProService.f21196b.b(this));
        y1((h) new u0((x0) this, (u0.b) new g(new wg.d(m1()))).a(h.class));
        o1();
        n1().n0().g(this, new c(new a(this)));
        n1().o0().g(this, new c(new b(this)));
    }

    public final void v1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void w1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void x1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.N = vahanProService;
    }

    public final void y1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.M = hVar;
    }
}
