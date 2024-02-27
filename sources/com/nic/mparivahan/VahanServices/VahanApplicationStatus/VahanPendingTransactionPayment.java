package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cb.s0;
import cm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreen;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import ni.v4;
import org.json.JSONObject;
import pl.x;

public final class VahanPendingTransactionPayment extends androidx.appcompat.app.d {
    public v4 G;
    private s0 H;
    /* access modifiers changed from: private */
    public boolean I;
    private boolean J;
    public String K;
    public String L;
    private String M = " ";
    public String N;
    public String O;
    public BeforePaymentRequest P;
    private boolean Q;
    public String R;
    public NrvDetails S;
    public String T;
    public String U;
    public ProgressDialog V;
    private h W;
    private VahanProService X;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final VahanPendingTransactionPayment f20813a;

        public a(VahanPendingTransactionPayment vahanPendingTransactionPayment) {
            l.f(vahanPendingTransactionPayment, "ctx");
            this.f20813a = vahanPendingTransactionPayment;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject(String.valueOf(str));
                if (jSONObject.has("response") && (string = jSONObject.getString("response")) != null && string.length() != 0) {
                    try {
                        Intent intent = new Intent(this.f20813a, VahanPaymentStatusScreen.class);
                        intent.putExtra("EncString", string);
                        intent.putExtra(VContant.FINAL_SUBMIT, this.f20813a.o1());
                        intent.putExtra(VContant.NEXGEN_isFACELESS, this.f20813a.v1());
                        intent.putExtra("RC", this.f20813a.q1());
                        intent.putExtra("RcDetails", this.f20813a.r1());
                        intent.putExtra(VContant.NEXGEN_addahar_name, this.f20813a.l1());
                        intent.putExtra(VContant.NEXGEN_addahar_address, this.f20813a.k1());
                        intent.putExtra("isPaymentPending", true);
                        this.f20813a.startActivity(intent);
                        VahanPendingTransactionPayment vahanPendingTransactionPayment = this.f20813a;
                        l.d(vahanPendingTransactionPayment, "null cannot be cast to non-null type android.app.Activity");
                        vahanPendingTransactionPayment.finish();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanPendingTransactionPayment f20814a;

        b(VahanPendingTransactionPayment vahanPendingTransactionPayment) {
            this.f20814a = vahanPendingTransactionPayment;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f20814a.I = true;
            this.f20814a.D1(false);
            this.f20814a.m1().f28980e.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            this.f20814a.m1().f28980e.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f20814a.D1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f20814a.I = false;
            Toast.makeText(this.f20814a, "Got Error! " + webResourceError, 0).show();
            this.f20814a.D1(false);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                webView.loadUrl(valueOf);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPendingTransactionPayment f20815e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanPendingTransactionPayment vahanPendingTransactionPayment) {
            super(1);
            this.f20815e = vahanPendingTransactionPayment;
        }

        public final void b(RequireDataForBePaymet requireDataForBePaymet) {
            this.f20815e.n1().dismiss();
            if (requireDataForBePaymet != null) {
                try {
                    Log.v("Before Payment", requireDataForBePaymet.getResponse_code());
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (this.f20815e.n1().isShowing()) {
                        this.f20815e.n1().dismiss();
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RequireDataForBePaymet) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPendingTransactionPayment f20816e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanPendingTransactionPayment vahanPendingTransactionPayment) {
            super(1);
            this.f20816e = vahanPendingTransactionPayment;
        }

        public final void b(String str) {
            if (this.f20816e.n1().isShowing()) {
                this.f20816e.n1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20817a;

        e(bm.l lVar) {
            l.f(lVar, "function");
            this.f20817a = lVar;
        }

        public final pl.c a() {
            return this.f20817a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20817a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public final void D1(boolean z10) {
        if (z10) {
            try {
                this.H = new s0(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException unused) {
                return;
            }
        }
        s0 s0Var = this.H;
        if (s0Var == null) {
            return;
        }
        if (z10) {
            s0Var.b();
        } else {
            s0Var.a();
        }
    }

    private final void J1() {
        if (this.J) {
            onBackPressed();
            return;
        }
        this.J = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new j1(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanPendingTransactionPayment vahanPendingTransactionPayment) {
        l.f(vahanPendingTransactionPayment, "this$0");
        vahanPendingTransactionPayment.J = false;
    }

    private final void s1() {
        WebView webView;
        a aVar;
        VahanProService vahanProService = this.X;
        if (vahanProService == null) {
            l.v("retrofitServiceBeforePayment");
            vahanProService = null;
        }
        this.W = (h) new u0((x0) this, (u0.b) new g(new wg.d(vahanProService))).a(h.class);
        m1().f28977b.f28305f.setOnClickListener(new k1(this));
        m1().f28977b.f28306g.setOnClickListener(new l1(this));
        m1().f28980e.getSettings().setJavaScriptEnabled(true);
        m1().f28980e.getSettings().setDomStorageEnabled(true);
        m1().f28980e.getSettings().setUseWideViewPort(true);
        m1().f28980e.getSettings().setLoadWithOverviewMode(true);
        m1().f28980e.getSettings().setBuiltInZoomControls(true);
        m1().f28980e.clearCache(true);
        m1().f28980e.reload();
        m1().f28980e.requestFocus(130);
        String p12 = p1();
        CookieManager.getInstance().setAcceptCookie(true);
        m1().f28980e.loadUrl(p12);
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            webView = m1().f28980e;
            aVar = new a(this);
        } else {
            webView = m1().f28980e;
            aVar = new a(this);
        }
        webView.addJavascriptInterface(aVar, "HtmlViewer");
        m1().f28980e.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void t1(VahanPendingTransactionPayment vahanPendingTransactionPayment, View view) {
        l.f(vahanPendingTransactionPayment, "this$0");
        if (vahanPendingTransactionPayment.m1().f28980e.canGoBack()) {
            vahanPendingTransactionPayment.m1().f28980e.goBack();
        } else {
            vahanPendingTransactionPayment.J1();
        }
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanPendingTransactionPayment vahanPendingTransactionPayment, View view) {
        l.f(vahanPendingTransactionPayment, "this$0");
        vahanPendingTransactionPayment.w1();
    }

    private final void w1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.V = progressDialog;
    }

    public final void B1(BeforePaymentRequest beforePaymentRequest) {
        l.f(beforePaymentRequest, "<set-?>");
        this.P = beforePaymentRequest;
    }

    public final void C1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void F1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void H1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.S = nrvDetails;
    }

    public final void I1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final String k1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String l1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final v4 m1() {
        v4 v4Var = this.G;
        if (v4Var != null) {
            return v4Var;
        }
        l.v("binding");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.V;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final BeforePaymentRequest o1() {
        BeforePaymentRequest beforePaymentRequest = this.P;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        l.v("paymentRequest");
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = "001"
            super.onCreate(r5)
            r5 = 2131558549(0x7f0d0095, float:1.8742417E38)
            r4.setContentView((int) r5)
            android.view.LayoutInflater r5 = r4.getLayoutInflater()
            ni.v4 r5 = ni.v4.c(r5)
            java.lang.String r1 = "inflate(...)"
            cm.l.e(r5, r1)
            r4.z1(r5)
            ni.v4 r5 = r4.m1()
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = r5.b()
            r4.setContentView((android.view.View) r5)
            r5 = 0
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            r1.getStringExtra(r0)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "URL"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0109 }
            r4.C1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "state_code"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0109 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0109 }
            r4.I1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "rc_number"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0109 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0109 }
            r4.F1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "purpose_code"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0109 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0109 }
            r4.E1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "Final_Submit"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest"
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x0109 }
            com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest r1 = (com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest) r1     // Catch:{ Exception -> 0x0109 }
            r4.B1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "Face_Less_Staus"
            boolean r1 = r1.getBooleanExtra(r2, r5)     // Catch:{ Exception -> 0x0109 }
            r4.Q = r1     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "aadhaarName"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0109 }
            r4.y1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "aadhaarAddress"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0109 }
            r4.x1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "RC"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0109 }
            r4.G1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "RcDetails"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails"
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x0109 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = (com.nic.mparivahan.VahanServices.VahanModel.NrvDetails) r1     // Catch:{ Exception -> 0x0109 }
            r4.H1(r1)     // Catch:{ Exception -> 0x0109 }
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = r1.getStringExtra(r0)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r2 = "RCP001"
            r3 = 1
            boolean r1 = km.p.o(r1, r2, r3)     // Catch:{ Exception -> 0x0109 }
            if (r1 != 0) goto L_0x010b
            android.content.Intent r1 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r0 = r1.getStringExtra(r0)     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = "HPC001"
            boolean r0 = km.p.o(r0, r1, r3)     // Catch:{ Exception -> 0x0109 }
            if (r0 == 0) goto L_0x00f8
            goto L_0x010b
        L_0x00f8:
            android.content.Intent r0 = r4.getIntent()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r1 = "App_no"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x0109 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0109 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            goto L_0x0110
        L_0x010b:
            java.lang.String r0 = " "
        L_0x010d:
            r4.M = r0     // Catch:{ Exception -> 0x0109 }
            goto L_0x0113
        L_0x0110:
            r0.printStackTrace()
        L_0x0113:
            com.nic.mparivahan.VahanServices.VahanService.VahanProService$a r0 = com.nic.mparivahan.VahanServices.VahanService.VahanProService.f21196b
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r0 = r0.b(r4)
            r4.X = r0
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r4)
            r4.A1(r0)
            android.app.ProgressDialog r0 = r4.n1()
            java.lang.String r1 = "Please wait..."
            r0.setMessage(r1)
            android.app.ProgressDialog r0 = r4.n1()
            r0.setCancelable(r5)
            android.app.ProgressDialog r0 = r4.n1()
            r0.setCanceledOnTouchOutside(r5)
            r4.s1()
            bi.h r5 = r4.W
            r0 = 0
            java.lang.String r1 = "viewModelBeforePayment"
            if (r5 != 0) goto L_0x0148
            cm.l.v(r1)
            r5 = r0
        L_0x0148:
            androidx.lifecycle.a0 r5 = r5.T()
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$c r2 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$c
            r2.<init>(r4)
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$e r3 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$e
            r3.<init>(r2)
            r5.g(r4, r3)
            bi.h r5 = r4.W
            if (r5 != 0) goto L_0x0161
            cm.l.v(r1)
            goto L_0x0162
        L_0x0161:
            r0 = r5
        L_0x0162:
            androidx.lifecycle.a0 r5 = r0.W()
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$d r0 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$d
            r0.<init>(r4)
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$e r1 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment$e
            r1.<init>(r0)
            r5.g(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (m1().f28980e.canGoBack()) {
            onBackPressed();
            return true;
        }
        J1();
        return true;
    }

    public final String p1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("paymentUrl");
        return null;
    }

    public final String q1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails r1() {
        NrvDetails nrvDetails = this.S;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final boolean v1() {
        return this.Q;
    }

    public final void x1(String str) {
        l.f(str, "<set-?>");
        this.U = str;
    }

    public final void y1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void z1(v4 v4Var) {
        l.f(v4Var, "<set-?>");
        this.G = v4Var;
    }
}
