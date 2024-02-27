package com.nic.mparivahan.VahanServices.DownloadAppoinForms;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadFormsActivity;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import me.g;
import ni.oa;
import pl.x;
import v9.e;

public final class DownloadFormHomeScreen extends d {
    /* access modifiers changed from: private */
    public oa G;
    private bi.b H;
    private bi.a I;
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
        final /* synthetic */ DownloadFormHomeScreen f20582e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DownloadFormHomeScreen downloadFormHomeScreen) {
            super(1);
            this.f20582e = downloadFormHomeScreen;
        }

        public final void b(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            String str;
            if (this.f20582e.p1().isShowing()) {
                this.f20582e.p1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().size() > 0) {
                    ApplStatusCurrentListModel applStatusCurrentListModel = applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().get(0);
                    cm.l.e(applStatusCurrentListModel, "get(...)");
                    ApplStatusCurrentListModel applStatusCurrentListModel2 = applStatusCurrentListModel;
                    String regno = applStatusCurrentListModel2.getRegno();
                    oa oaVar = null;
                    if (q.F(applStatusCurrentListModel2.getCurr_off_cd().toString(), ".", false, 2, (Object) null)) {
                        str = applStatusCurrentListModel2.getCurr_off_cd().toString().substring(0, 2);
                        cm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str = applStatusCurrentListModel2.getCurr_off_cd().toString();
                    }
                    try {
                        Intent intent = new Intent(this.f20582e, DownloadFormsActivity.class);
                        oa l12 = this.f20582e.G;
                        if (l12 == null) {
                            cm.l.v("binding");
                            l12 = null;
                        }
                        Editable text = l12.f27839n.getText();
                        intent.putExtra("state_code", text != null ? text.subSequence(0, 2).toString() : null);
                        intent.putExtra("off_code", str.toString());
                        intent.putExtra("rc_number", regno.toString());
                        oa l13 = this.f20582e.G;
                        if (l13 == null) {
                            cm.l.v("binding");
                        } else {
                            oaVar = l13;
                        }
                        intent.putExtra("appl_no", String.valueOf(oaVar.f27839n.getText()));
                        this.f20582e.startActivity(intent);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    DownloadFormHomeScreen downloadFormHomeScreen = this.f20582e;
                    downloadFormHomeScreen.y1(downloadFormHomeScreen, downloadFormHomeScreen.o1().b("no_application_status", "No application status found for this application no."));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                DownloadFormHomeScreen downloadFormHomeScreen2 = this.f20582e;
                downloadFormHomeScreen2.y1(downloadFormHomeScreen2, downloadFormHomeScreen2.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ApplicationStatusSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadFormHomeScreen f20583e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DownloadFormHomeScreen downloadFormHomeScreen) {
            super(1);
            this.f20583e = downloadFormHomeScreen;
        }

        public final void b(String str) {
            if (this.f20583e.p1().isShowing()) {
                this.f20583e.p1().dismiss();
            }
            DownloadFormHomeScreen downloadFormHomeScreen = this.f20583e;
            downloadFormHomeScreen.y1(downloadFormHomeScreen, downloadFormHomeScreen.o1().b("no_application_status", "No application status found for this application no."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20584a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20584a = lVar;
        }

        public final pl.c a() {
            return this.f20584a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20584a.invoke(obj);
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
    public static final void A1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void n1(String str, String str2) {
        p1().show();
        bi.a aVar = this.I;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.o(this, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q1() {
        /*
            r9 = this;
            java.lang.String r0 = "service_name"
            java.lang.String r1 = "binding"
            r2 = 0
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x005c }
            java.lang.String r4 = "View Form(s)"
            java.lang.String r5 = "View_Forms"
            if (r3 == 0) goto L_0x004d
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x005c }
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x005c }
            java.lang.String r6 = "View Forms"
            r7 = 0
            r8 = 2
            boolean r3 = km.p.p(r3, r6, r7, r8, r2)     // Catch:{ Exception -> 0x005c }
            if (r3 == 0) goto L_0x0037
            ni.oa r0 = r9.G     // Catch:{ Exception -> 0x005c }
            if (r0 != 0) goto L_0x0029
            cm.l.v(r1)     // Catch:{ Exception -> 0x005c }
            r0 = r2
        L_0x0029:
            com.nic.mparivahan.MyTextView r0 = r0.f27833h     // Catch:{ Exception -> 0x005c }
            ld.c r3 = r9.o1()     // Catch:{ Exception -> 0x005c }
        L_0x002f:
            java.lang.String r3 = r3.b(r5, r4)     // Catch:{ Exception -> 0x005c }
            r0.setText(r3)     // Catch:{ Exception -> 0x005c }
            goto L_0x005c
        L_0x0037:
            ni.oa r3 = r9.G     // Catch:{ Exception -> 0x005c }
            if (r3 != 0) goto L_0x003f
            cm.l.v(r1)     // Catch:{ Exception -> 0x005c }
            r3 = r2
        L_0x003f:
            com.nic.mparivahan.MyTextView r3 = r3.f27833h     // Catch:{ Exception -> 0x005c }
            android.content.Intent r4 = r9.getIntent()     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = r4.getStringExtra(r0)     // Catch:{ Exception -> 0x005c }
            r3.setText(r0)     // Catch:{ Exception -> 0x005c }
            goto L_0x005c
        L_0x004d:
            ni.oa r0 = r9.G     // Catch:{ Exception -> 0x005c }
            if (r0 != 0) goto L_0x0055
            cm.l.v(r1)     // Catch:{ Exception -> 0x005c }
            r0 = r2
        L_0x0055:
            com.nic.mparivahan.MyTextView r0 = r0.f27833h     // Catch:{ Exception -> 0x005c }
            ld.c r3 = r9.o1()     // Catch:{ Exception -> 0x005c }
            goto L_0x002f
        L_0x005c:
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            bi.f r3 = new bi.f
            wg.b r4 = new wg.b
            com.nic.mparivahan.VahanServices.VahanService.ApplicationService r5 = r9.J
            if (r5 != 0) goto L_0x006c
            java.lang.String r5 = "retrofitService"
            cm.l.v(r5)
            r5 = r2
        L_0x006c:
            r4.<init>(r5)
            r3.<init>(r4)
            r0.<init>((androidx.lifecycle.x0) r9, (androidx.lifecycle.u0.b) r3)
            java.lang.Class<bi.b> r3 = bi.b.class
            androidx.lifecycle.t0 r0 = r0.a(r3)
            bi.b r0 = (bi.b) r0
            r9.H = r0
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            bi.e r3 = new bi.e
            wg.a r4 = new wg.a
            com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp r5 = r9.K
            if (r5 != 0) goto L_0x008f
            java.lang.String r5 = "otpRetrofitService"
            cm.l.v(r5)
            r5 = r2
        L_0x008f:
            r4.<init>(r5)
            r3.<init>(r4)
            r0.<init>((androidx.lifecycle.x0) r9, (androidx.lifecycle.u0.b) r3)
            java.lang.Class<bi.a> r3 = bi.a.class
            androidx.lifecycle.t0 r0 = r0.a(r3)
            bi.a r0 = (bi.a) r0
            r9.I = r0
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x00aa
            cm.l.v(r1)
            r0 = r2
        L_0x00aa:
            ni.qd r0 = r0.f27830e
            android.widget.RelativeLayout r0 = r0.f28306g
            me.i r3 = new me.i
            r3.<init>(r9)
            r0.setOnClickListener(r3)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x00be
            cm.l.v(r1)
            r0 = r2
        L_0x00be:
            ni.qd r0 = r0.f27830e
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f28305f
            me.j r3 = new me.j
            r3.<init>(r9)
            r0.setOnClickListener(r3)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x00d2
            cm.l.v(r1)
            r0 = r2
        L_0x00d2:
            androidx.appcompat.widget.AppCompatButton r0 = r0.f27834i
            me.k r3 = new me.k
            r3.<init>(r9)
            r0.setOnClickListener(r3)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x00e4
            cm.l.v(r1)
            r0 = r2
        L_0x00e4:
            androidx.appcompat.widget.AppCompatButton r0 = r0.f27832g
            me.l r3 = new me.l
            r3.<init>(r9)
            r0.setOnClickListener(r3)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x00f6
            cm.l.v(r1)
            r0 = r2
        L_0x00f6:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27841p
            java.lang.String r3 = r9.M
            android.text.method.DigitsKeyListener r3 = android.text.method.DigitsKeyListener.getInstance(r3)
            r0.setKeyListener(r3)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x0109
            cm.l.v(r1)
            r0 = r2
        L_0x0109:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27841p
            r3 = 4096(0x1000, float:5.74E-42)
            r0.setRawInputType(r3)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x0118
            cm.l.v(r1)
            r0 = r2
        L_0x0118:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27840o
            java.lang.String r4 = r9.M
            android.text.method.DigitsKeyListener r4 = android.text.method.DigitsKeyListener.getInstance(r4)
            r0.setKeyListener(r4)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x012b
            cm.l.v(r1)
            r0 = r2
        L_0x012b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27840o
            r0.setRawInputType(r3)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x0138
            cm.l.v(r1)
            r0 = r2
        L_0x0138:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27839n
            java.lang.String r4 = r9.M
            android.text.method.DigitsKeyListener r4 = android.text.method.DigitsKeyListener.getInstance(r4)
            r0.setKeyListener(r4)
            ni.oa r0 = r9.G
            if (r0 != 0) goto L_0x014b
            cm.l.v(r1)
            goto L_0x014c
        L_0x014b:
            r2 = r0
        L_0x014c:
            androidx.appcompat.widget.AppCompatEditText r0 = r2.f27839n
            r0.setRawInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadFormHomeScreen.q1():void");
    }

    /* access modifiers changed from: private */
    public static final void r1(DownloadFormHomeScreen downloadFormHomeScreen, View view) {
        cm.l.f(downloadFormHomeScreen, "this$0");
        downloadFormHomeScreen.v1();
    }

    /* access modifiers changed from: private */
    public static final void s1(DownloadFormHomeScreen downloadFormHomeScreen, View view) {
        cm.l.f(downloadFormHomeScreen, "this$0");
        downloadFormHomeScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(DownloadFormHomeScreen downloadFormHomeScreen, View view) {
        cm.l.f(downloadFormHomeScreen, "this$0");
        oa oaVar = downloadFormHomeScreen.G;
        oa oaVar2 = null;
        if (oaVar == null) {
            cm.l.v("binding");
            oaVar = null;
        }
        Editable text = oaVar.f27839n.getText();
        cm.l.c(text);
        if (text.length() < 10) {
            Toast.makeText(downloadFormHomeScreen, downloadFormHomeScreen.o1().b("PLEASE_ENTER_APPLICATION", "Please enter the valid Application No"), 0).show();
            return;
        }
        oa oaVar3 = downloadFormHomeScreen.G;
        if (oaVar3 == null) {
            cm.l.v("binding");
            oaVar3 = null;
        }
        String valueOf = String.valueOf(oaVar3.f27839n.getText());
        oa oaVar4 = downloadFormHomeScreen.G;
        if (oaVar4 == null) {
            cm.l.v("binding");
        } else {
            oaVar2 = oaVar4;
        }
        String substring = String.valueOf(oaVar2.f27839n.getText()).substring(0, 2);
        cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        downloadFormHomeScreen.n1(valueOf, substring);
    }

    /* access modifiers changed from: private */
    public static final void u1(DownloadFormHomeScreen downloadFormHomeScreen, View view) {
        cm.l.f(downloadFormHomeScreen, "this$0");
        downloadFormHomeScreen.finish();
    }

    private final void v1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void y1(Context context, String str) {
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
        textView.setOnClickListener(new g(dialog));
        textView2.setOnClickListener(new me.h(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void z1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final ld.c o1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
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
        e.a aVar2 = e.f17509a;
        oa oaVar = this.G;
        if (oaVar == null) {
            cm.l.v("binding");
            oaVar = null;
        }
        aVar2.e2(this, oaVar);
        w1(new ld.c(this));
        this.J = ApplicationService.f21181a.b(this);
        this.K = ApplicationServiceOtp.f21184a.b(this);
        x1(new ProgressDialog(this));
        p1().setMessage("Please wait...");
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        q1();
        bi.a aVar3 = this.I;
        if (aVar3 == null) {
            cm.l.v("otpViewModel");
            aVar3 = null;
        }
        aVar3.n().g(this, new c(new a(this)));
        bi.a aVar4 = this.I;
        if (aVar4 == null) {
            cm.l.v("otpViewModel");
        } else {
            aVar = aVar4;
        }
        aVar.k().g(this, new c(new b(this)));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void w1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void x1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }
}
