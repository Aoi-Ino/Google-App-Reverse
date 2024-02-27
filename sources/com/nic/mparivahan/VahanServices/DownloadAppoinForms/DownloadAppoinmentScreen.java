package com.nic.mparivahan.VahanServices.DownloadAppoinForms;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import java.io.File;
import java.lang.reflect.Method;
import me.f;
import ni.oa;
import pl.x;
import v9.e;

public final class DownloadAppoinmentScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public oa G;
    private bi.b H;
    /* access modifiers changed from: private */
    public bi.a I;
    private ApplicationService J;
    private ApplicationServiceOtp K;
    public ProgressDialog L;
    private final String M = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private String N = "";
    private String O = "";
    private String P = "ApplicationNo";
    public ld.c Q;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadAppoinmentScreen f20577e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DownloadAppoinmentScreen downloadAppoinmentScreen) {
            super(1);
            this.f20577e = downloadAppoinmentScreen;
        }

        public final void b(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (this.f20577e.r1().isShowing()) {
                this.f20577e.r1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().size() > 0) {
                    ApplStatusCurrentListModel applStatusCurrentListModel = applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().get(0);
                    cm.l.e(applStatusCurrentListModel, "get(...)");
                    ApplStatusCurrentListModel applStatusCurrentListModel2 = applStatusCurrentListModel;
                    applStatusCurrentListModel2.getRegno();
                    oa oaVar = null;
                    if (q.F(applStatusCurrentListModel2.getCurr_off_cd().toString(), ".", false, 2, (Object) null)) {
                        cm.l.e(applStatusCurrentListModel2.getCurr_off_cd().toString().substring(0, 2), "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        applStatusCurrentListModel2.getCurr_off_cd().toString();
                    }
                    try {
                        this.f20577e.r1().show();
                        bi.a m12 = this.f20577e.I;
                        if (m12 == null) {
                            cm.l.v("otpViewModel");
                            m12 = null;
                        }
                        DownloadAppoinmentScreen downloadAppoinmentScreen = this.f20577e;
                        oa l12 = downloadAppoinmentScreen.G;
                        if (l12 == null) {
                            cm.l.v("binding");
                        } else {
                            oaVar = l12;
                        }
                        m12.h(downloadAppoinmentScreen, String.valueOf(oaVar.f27839n.getText()));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    DownloadAppoinmentScreen downloadAppoinmentScreen2 = this.f20577e;
                    downloadAppoinmentScreen2.B1(downloadAppoinmentScreen2, downloadAppoinmentScreen2.q1().b("no_application_status", "No application status found for this application no."));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                DownloadAppoinmentScreen downloadAppoinmentScreen3 = this.f20577e;
                downloadAppoinmentScreen3.B1(downloadAppoinmentScreen3, downloadAppoinmentScreen3.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ApplicationStatusSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadAppoinmentScreen f20578e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DownloadAppoinmentScreen downloadAppoinmentScreen) {
            super(1);
            this.f20578e = downloadAppoinmentScreen;
        }

        public final void b(String str) {
            if (this.f20578e.r1().isShowing()) {
                this.f20578e.r1().dismiss();
            }
            DownloadAppoinmentScreen downloadAppoinmentScreen = this.f20578e;
            downloadAppoinmentScreen.B1(downloadAppoinmentScreen, downloadAppoinmentScreen.q1().b("no_application_status", "No application status found for this application no."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadAppoinmentScreen f20579e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DownloadAppoinmentScreen downloadAppoinmentScreen) {
            super(1);
            this.f20579e = downloadAppoinmentScreen;
        }

        public final void b(String str) {
            this.f20579e.r1().dismiss();
            Log.e("TestUrl", str.toString());
            if (!ka.c.f13158a.m(str)) {
                DownloadAppoinmentScreen downloadAppoinmentScreen = this.f20579e;
                cm.l.c(str);
                downloadAppoinmentScreen.y1(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadAppoinmentScreen f20580e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DownloadAppoinmentScreen downloadAppoinmentScreen) {
            super(1);
            this.f20580e = downloadAppoinmentScreen;
        }

        public final void b(String str) {
            this.f20580e.r1().dismiss();
            if (!p.o(str.toString(), "Error", true)) {
                VContant.Companion.M(this.f20580e, str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20581a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f20581a = lVar;
        }

        public final pl.c a() {
            return this.f20581a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20581a.invoke(obj);
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

    /* access modifiers changed from: private */
    public final void B1(Context context, String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(cVar.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new me.e(dialog));
        textView2.setOnClickListener(new f(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void C1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void D1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void p1(String str, String str2) {
        r1().show();
        bi.a aVar = this.I;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.o(this, str, str2);
    }

    private final void s1() {
        ApplicationService applicationService = this.J;
        oa oaVar = null;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.H = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        ApplicationServiceOtp applicationServiceOtp = this.K;
        if (applicationServiceOtp == null) {
            cm.l.v("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.I = (bi.a) new u0((x0) this, (u0.b) new bi.e(new wg.a(applicationServiceOtp))).a(bi.a.class);
        oa oaVar2 = this.G;
        if (oaVar2 == null) {
            cm.l.v("binding");
            oaVar2 = null;
        }
        oaVar2.f27830e.f28306g.setOnClickListener(new me.a(this));
        oa oaVar3 = this.G;
        if (oaVar3 == null) {
            cm.l.v("binding");
            oaVar3 = null;
        }
        oaVar3.f27830e.f28305f.setOnClickListener(new me.b(this));
        oa oaVar4 = this.G;
        if (oaVar4 == null) {
            cm.l.v("binding");
            oaVar4 = null;
        }
        oaVar4.f27834i.setOnClickListener(new me.c(this));
        oa oaVar5 = this.G;
        if (oaVar5 == null) {
            cm.l.v("binding");
            oaVar5 = null;
        }
        oaVar5.f27832g.setOnClickListener(new me.d(this));
        oa oaVar6 = this.G;
        if (oaVar6 == null) {
            cm.l.v("binding");
            oaVar6 = null;
        }
        oaVar6.f27841p.setKeyListener(DigitsKeyListener.getInstance(this.M));
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
        oaVar8.f27840o.setKeyListener(DigitsKeyListener.getInstance(this.M));
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
        oaVar10.f27839n.setKeyListener(DigitsKeyListener.getInstance(this.M));
        oa oaVar11 = this.G;
        if (oaVar11 == null) {
            cm.l.v("binding");
        } else {
            oaVar = oaVar11;
        }
        oaVar.f27839n.setRawInputType(4096);
    }

    /* access modifiers changed from: private */
    public static final void t1(DownloadAppoinmentScreen downloadAppoinmentScreen, View view) {
        cm.l.f(downloadAppoinmentScreen, "this$0");
        downloadAppoinmentScreen.x1();
    }

    /* access modifiers changed from: private */
    public static final void u1(DownloadAppoinmentScreen downloadAppoinmentScreen, View view) {
        cm.l.f(downloadAppoinmentScreen, "this$0");
        downloadAppoinmentScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(DownloadAppoinmentScreen downloadAppoinmentScreen, View view) {
        cm.l.f(downloadAppoinmentScreen, "this$0");
        oa oaVar = downloadAppoinmentScreen.G;
        oa oaVar2 = null;
        if (oaVar == null) {
            cm.l.v("binding");
            oaVar = null;
        }
        Editable text = oaVar.f27839n.getText();
        cm.l.c(text);
        if (text.length() < 10) {
            Toast.makeText(downloadAppoinmentScreen, downloadAppoinmentScreen.q1().b("PLEASE_ENTER_APPLICATION", "Please enter the valid Application No"), 0).show();
            return;
        }
        oa oaVar3 = downloadAppoinmentScreen.G;
        if (oaVar3 == null) {
            cm.l.v("binding");
            oaVar3 = null;
        }
        String valueOf = String.valueOf(oaVar3.f27839n.getText());
        oa oaVar4 = downloadAppoinmentScreen.G;
        if (oaVar4 == null) {
            cm.l.v("binding");
        } else {
            oaVar2 = oaVar4;
        }
        String substring = String.valueOf(oaVar2.f27839n.getText()).substring(0, 2);
        cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        downloadAppoinmentScreen.p1(valueOf, substring);
    }

    /* access modifiers changed from: private */
    public static final void w1(DownloadAppoinmentScreen downloadAppoinmentScreen, View view) {
        cm.l.f(downloadAppoinmentScreen, "this$0");
        downloadAppoinmentScreen.finish();
    }

    private final void x1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void y1(String str) {
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            cm.l.e(method, "getMethod(...)");
            method.invoke((Object) null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String str2 = str + ".pdf";
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), '/' + str2);
        Log.e("tesfile2", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + str2);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
            intent.addFlags(67108864);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "File not found", 1).show();
        }
    }

    public final void A1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.download_forms_liera);
        oa c10 = oa.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        bi.a aVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar2 = v9.e.f17509a;
        oa oaVar = this.G;
        if (oaVar == null) {
            cm.l.v("binding");
            oaVar = null;
        }
        aVar2.a2(this, oaVar);
        z1(new ld.c(this));
        this.J = ApplicationService.f21181a.b(this);
        this.K = ApplicationServiceOtp.f21184a.b(this);
        A1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        s1();
        bi.a aVar3 = this.I;
        if (aVar3 == null) {
            cm.l.v("otpViewModel");
            aVar3 = null;
        }
        aVar3.n().g(this, new e(new a(this)));
        bi.a aVar4 = this.I;
        if (aVar4 == null) {
            cm.l.v("otpViewModel");
            aVar4 = null;
        }
        aVar4.k().g(this, new e(new b(this)));
        bi.a aVar5 = this.I;
        if (aVar5 == null) {
            cm.l.v("otpViewModel");
            aVar5 = null;
        }
        aVar5.i().g(this, new e(new c(this)));
        bi.a aVar6 = this.I;
        if (aVar6 == null) {
            cm.l.v("otpViewModel");
        } else {
            aVar = aVar6;
        }
        aVar.j().g(this, new e(new d(this)));
    }

    public final ld.c q1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void z1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }
}
