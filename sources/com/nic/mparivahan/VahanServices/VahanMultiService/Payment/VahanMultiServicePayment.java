package com.nic.mparivahan.VahanServices.VahanMultiService.Payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
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
import android.widget.TextView;
import androidx.appcompat.app.d;
import cb.s0;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.io.Serializable;
import java.util.ArrayList;
import ni.v4;
import org.json.JSONObject;
import pg.g;
import pl.x;

public final class VahanMultiServicePayment extends d {
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
    public MultiServiceBeforePaymentRequest O;
    private boolean P;
    public String Q;
    public NrvDetails R;
    public String S;
    public String T;
    public ld.c U;
    private ArrayList V = new ArrayList();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final VahanMultiServicePayment f21081a;

        public a(VahanMultiServicePayment vahanMultiServicePayment) {
            l.f(vahanMultiServicePayment, "ctx");
            this.f21081a = vahanMultiServicePayment;
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
                    Intent intent = new Intent(this.f21081a, VahanPaymentMultiServiceStatusScreen.class);
                    intent.putExtra("EncString", string);
                    intent.putExtra(VContant.FINAL_SUBMIT, this.f21081a.q1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21081a.y1());
                    intent.putExtra("RC", this.f21081a.t1());
                    intent.putExtra("RcDetails", this.f21081a.u1());
                    intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this.f21081a.p1());
                    intent.putExtra(VContant.NEXGEN_addahar_name, this.f21081a.m1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, this.f21081a.l1());
                    intent.putExtra("isPaymentPending", true);
                    this.f21081a.startActivity(intent);
                    VahanMultiServicePayment vahanMultiServicePayment = this.f21081a;
                    l.d(vahanMultiServicePayment, "null cannot be cast to non-null type android.app.Activity");
                    vahanMultiServicePayment.finish();
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
        final /* synthetic */ VahanMultiServicePayment f21082a;

        c(VahanMultiServicePayment vahanMultiServicePayment) {
            this.f21082a = vahanMultiServicePayment;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f21082a.I = true;
            this.f21082a.H1(false);
            this.f21082a.n1().f28980e.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s0 i12 = this.f21082a.H;
            if (i12 != null) {
                i12.b();
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f21082a.I = false;
            this.f21082a.H1(false);
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

    private final void A1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void H1(boolean z10) {
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

    private final void N1() {
        VUtility.Companion.v(this, o1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    private final void v1() {
        WebView webView;
        a aVar;
        n1().f28977b.f28305f.setOnClickListener(new ug.b(this));
        n1().f28977b.f28306g.setOnClickListener(new ug.c(this));
        n1().f28980e.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        n1().f28980e.getSettings().setAllowFileAccess(true);
        n1().f28980e.getSettings().setAllowContentAccess(true);
        n1().f28980e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        n1().f28980e.getSettings().setJavaScriptEnabled(true);
        n1().f28980e.getSettings().setDomStorageEnabled(true);
        n1().f28980e.getSettings().setUseWideViewPort(true);
        n1().f28980e.getSettings().setLoadWithOverviewMode(true);
        n1().f28980e.getSettings().setBuiltInZoomControls(true);
        n1().f28980e.getSettings().setSupportMultipleWindows(true);
        n1().f28980e.clearCache(true);
        n1().f28980e.reload();
        n1().f28980e.requestFocus(130);
        String r12 = r1();
        CookieManager.getInstance().setAcceptCookie(true);
        n1().f28980e.loadUrl(r12);
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            webView = n1().f28980e;
            aVar = new a(this);
        } else {
            webView = n1().f28980e;
            aVar = new a(this);
        }
        webView.addJavascriptInterface(aVar, "HtmlViewer");
        n1().f28980e.setWebChromeClient(new b());
        n1().f28980e.setWebViewClient(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanMultiServicePayment vahanMultiServicePayment, View view) {
        l.f(vahanMultiServicePayment, "this$0");
        if (vahanMultiServicePayment.n1().f28980e.canGoBack()) {
            vahanMultiServicePayment.n1().f28980e.goBack();
        } else {
            vahanMultiServicePayment.N1();
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanMultiServicePayment vahanMultiServicePayment, View view) {
        l.f(vahanMultiServicePayment, "this$0");
        vahanMultiServicePayment.A1();
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanMultiServicePayment vahanMultiServicePayment, View view) {
        l.f(vahanMultiServicePayment, "this$0");
        try {
            g.f30363a.e(vahanMultiServicePayment, vahanMultiServicePayment.V);
        } catch (Exception unused) {
        }
    }

    public final void B1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void C1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void D1(v4 v4Var) {
        l.f(v4Var, "<set-?>");
        this.G = v4Var;
    }

    public final void E1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void F1(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        l.f(multiServiceBeforePaymentRequest, "<set-?>");
        this.O = multiServiceBeforePaymentRequest;
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void I1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void K1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void L1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.R = nrvDetails;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final String l1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final v4 n1() {
        v4 v4Var = this.G;
        if (v4Var != null) {
            return v4Var;
        }
        l.v("binding");
        return null;
    }

    public final ld.c o1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public void onBackPressed() {
        N1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_informational_web_view);
        v4 c10 = v4.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        D1(c10);
        setContentView((View) n1().b());
        E1(new ld.c(this));
        this.H = new s0(this, R.string.please_wait, true);
        getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE);
        G1(String.valueOf(getIntent().getStringExtra("URL")));
        String stringExtra = getIntent().getStringExtra("state_code");
        l.c(stringExtra);
        M1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("rc_number");
        l.c(stringExtra2);
        J1(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
        l.c(stringExtra3);
        I1(stringExtra3);
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest");
        F1((MultiServiceBeforePaymentRequest) serializableExtra);
        this.P = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        C1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        B1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        K1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L1((NrvDetails) serializableExtra2);
        this.V = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        n1().f28977b.f28308i.setText(VContant.Companion.I(this, s1()));
        this.L = q1().getAppl_no();
        String str = "RC Services";
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        n1().f28977b.f28308i.setText(spannableString);
        ArrayList arrayList = this.V;
        if (arrayList == null || !arrayList.contains(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            textView = n1().f28977b.f28308i;
        } else {
            textView = n1().f28977b.f28308i;
            str = "Transfer of OwnerShip \n(Buyer)";
        }
        textView.setText(str);
        n1().f28977b.f28304e.setVisibility(0);
        n1().f28977b.f28304e.setText(t1());
        SpannableString spannableString2 = new SpannableString(t1());
        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
        n1().f28977b.f28304e.setText(spannableString2);
        v1();
        n1().f28977b.f28308i.setOnClickListener(new ug.a(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (n1().f28980e.canGoBack()) {
            onBackPressed();
            return true;
        }
        N1();
        return true;
    }

    public final ArrayList p1() {
        return this.V;
    }

    public final MultiServiceBeforePaymentRequest q1() {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = this.O;
        if (multiServiceBeforePaymentRequest != null) {
            return multiServiceBeforePaymentRequest;
        }
        l.v("paymentRequest");
        return null;
    }

    public final String r1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("paymentUrl");
        return null;
    }

    public final String s1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final String t1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.R;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final boolean y1() {
        return this.P;
    }
}
