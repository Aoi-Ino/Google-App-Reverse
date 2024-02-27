package com.nic.mparivahan.VahanServices.VahanPayment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.d;
import cb.s0;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.io.Serializable;
import java.util.HashMap;
import ni.v4;
import org.json.JSONObject;
import pl.x;

public final class VahanPayment extends d {
    public v4 G;
    /* access modifiers changed from: private */
    public s0 H;
    /* access modifiers changed from: private */
    public boolean I;
    public String J;
    public String K;
    private String L = " ";
    public String M;
    public String N;
    public BeforePaymentRequest O;
    private boolean P;
    public String Q;
    public NrvDetails R;
    public String S;
    public String T;
    public ld.c U;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final VahanPayment f21162a;

        public a(VahanPayment vahanPayment) {
            l.f(vahanPayment, "ctx");
            this.f21162a = vahanPayment;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            JSONObject jSONObject;
            String string;
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.has("response") && (string = jSONObject.getString("response")) != null && string.length() != 0) {
                try {
                    Intent intent = new Intent(this.f21162a, VahanPaymentStatusScreen.class);
                    intent.putExtra("EncString", string);
                    intent.putExtra(VContant.FINAL_SUBMIT, this.f21162a.o1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21162a.w1());
                    intent.putExtra("RC", this.f21162a.r1());
                    intent.putExtra("RcDetails", this.f21162a.s1());
                    intent.putExtra(VContant.NEXGEN_addahar_name, this.f21162a.l1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, this.f21162a.k1());
                    intent.putExtra("isPaymentPending", true);
                    this.f21162a.startActivity(intent);
                    VahanPayment vahanPayment = this.f21162a;
                    l.d(vahanPayment, "null cannot be cast to non-null type android.app.Activity");
                    vahanPayment.finish();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public static final class b extends WebChromeClient {
        b() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Log.e("dl-js1", String.valueOf(jsResult));
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public static final class c extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanPayment f21163a;

        c(VahanPayment vahanPayment) {
            this.f21163a = vahanPayment;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f21163a.I = true;
            this.f21163a.E1(false);
            this.f21163a.m1().f28980e.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s0 h12 = this.f21163a.H;
            if (h12 != null) {
                h12.b();
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f21163a.I = false;
            this.f21163a.E1(false);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView == null) {
                return true;
            }
            webView.loadUrl(valueOf);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void E1(boolean z10) {
        if (!z10) {
            try {
                s0 s0Var = this.H;
                if (s0Var != null) {
                    s0Var.a();
                }
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                Log.e("Error", x.f30437a.toString());
            }
        }
    }

    private final void K1() {
        VUtility.Companion.y(this, n1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    private final void t1() {
        WebView webView;
        a aVar;
        m1().f28977b.f28305f.setOnClickListener(new vg.c(this));
        m1().f28977b.f28306g.setOnClickListener(new vg.d(this));
        m1().f28980e.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        m1().f28980e.getSettings().setAllowFileAccess(true);
        m1().f28980e.getSettings().setAllowContentAccess(true);
        m1().f28980e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        m1().f28980e.getSettings().setJavaScriptEnabled(true);
        m1().f28980e.getSettings().setDomStorageEnabled(true);
        m1().f28980e.getSettings().setUseWideViewPort(true);
        m1().f28980e.getSettings().setLoadWithOverviewMode(true);
        m1().f28980e.getSettings().setBuiltInZoomControls(true);
        m1().f28980e.getSettings().setSupportMultipleWindows(true);
        m1().f28980e.clearCache(true);
        m1().f28980e.reload();
        m1().f28980e.requestFocus(130);
        String p12 = p1();
        CookieManager.getInstance().setAcceptCookie(true);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "NextGen mParivahan");
        m1().f28980e.loadUrl(p12, hashMap);
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            webView = m1().f28980e;
            aVar = new a(this);
        } else {
            webView = m1().f28980e;
            aVar = new a(this);
        }
        webView.addJavascriptInterface(aVar, "HtmlViewer");
        m1().f28980e.setWebChromeClient(new b());
        m1().f28980e.setWebViewClient(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanPayment vahanPayment, View view) {
        l.f(vahanPayment, "this$0");
        if (vahanPayment.m1().f28980e.canGoBack()) {
            vahanPayment.m1().f28980e.goBack();
        } else {
            vahanPayment.K1();
        }
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanPayment vahanPayment, View view) {
        l.f(vahanPayment, "this$0");
        vahanPayment.x1();
    }

    private final void x1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(v4 v4Var) {
        l.f(v4Var, "<set-?>");
        this.G = v4Var;
    }

    public final void B1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void C1(BeforePaymentRequest beforePaymentRequest) {
        l.f(beforePaymentRequest, "<set-?>");
        this.O = beforePaymentRequest;
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void F1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void I1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.R = nrvDetails;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final String k1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String l1() {
        String str = this.S;
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

    public final ld.c n1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final BeforePaymentRequest o1() {
        BeforePaymentRequest beforePaymentRequest = this.O;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        l.v("paymentRequest");
        return null;
    }

    public void onBackPressed() {
        K1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_informational_web_view);
        v4 c10 = v4.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        A1(c10);
        setContentView((View) m1().b());
        B1(new ld.c(this));
        this.H = new s0(this, R.string.please_wait, true);
        getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE);
        D1(String.valueOf(getIntent().getStringExtra("URL")));
        String stringExtra = getIntent().getStringExtra("state_code");
        l.c(stringExtra);
        J1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("rc_number");
        l.c(stringExtra2);
        G1(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
        l.c(stringExtra3);
        F1(stringExtra3);
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
        C1((BeforePaymentRequest) serializableExtra);
        this.P = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        z1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        y1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        H1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        I1((NrvDetails) serializableExtra2);
        m1().f28977b.f28308i.setText(VContant.Companion.I(this, q1()));
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            str = " ";
        } else {
            str = getIntent().getStringExtra(VContant.APP_NO);
            l.c(str);
        }
        this.L = str;
        t1();
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
        K1();
        return true;
    }

    public final String p1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("paymentUrl");
        return null;
    }

    public final String q1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final String r1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails s1() {
        NrvDetails nrvDetails = this.R;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final boolean w1() {
        return this.P;
    }

    public final void y1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void z1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }
}
