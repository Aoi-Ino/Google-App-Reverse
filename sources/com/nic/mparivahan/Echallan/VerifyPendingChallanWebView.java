package com.nic.mparivahan.Echallan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cb.s0;
import cb.w3;
import cb.x3;
import cb.y3;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import ni.w9;
import org.json.JSONObject;

public final class VerifyPendingChallanWebView extends d {
    private String G = "";
    private s0 H;
    /* access modifiers changed from: private */
    public boolean I;
    private boolean J;
    private String K = "";
    /* access modifiers changed from: private */
    public w9 L;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f8903a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8904b;

        public a(Context context, String str) {
            l.f(context, "ctx");
            l.f(str, "fromActivity");
            this.f8903a = context;
            this.f8904b = str;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            Context context;
            Intent intent;
            l.c(str);
            Log.e("Result-->", str);
            try {
                if (new JSONObject(str).has("challan_no")) {
                    if (p.o(this.f8904b, "verifyPayment", true)) {
                        context = this.f8903a;
                        intent = new Intent(this.f8903a, VerifyPaymentChallan.class);
                    } else {
                        context = this.f8903a;
                        intent = new Intent(this.f8903a, PaymentSearchChallan.class);
                    }
                    context.startActivity(intent);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerifyPendingChallanWebView f8905a;

        b(VerifyPendingChallanWebView verifyPendingChallanWebView) {
            this.f8905a = verifyPendingChallanWebView;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f8905a.I = true;
            this.f8905a.p1(false);
            w9 i12 = this.f8905a.L;
            w9 w9Var = null;
            if (i12 == null) {
                l.v("binding");
                i12 = null;
            }
            i12.f29221c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            w9 i13 = this.f8905a.L;
            if (i13 == null) {
                l.v("binding");
            } else {
                w9Var = i13;
            }
            w9Var.f29221c.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f8905a.p1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f8905a.I = false;
            this.f8905a.p1(false);
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

    private final void l1() {
        w9 w9Var = this.L;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        w9Var.f29220b.f28305f.setOnClickListener(new x3(this));
        w9 w9Var3 = this.L;
        if (w9Var3 == null) {
            l.v("binding");
            w9Var3 = null;
        }
        w9Var3.f29220b.f28306g.setOnClickListener(new y3(this));
        w9 w9Var4 = this.L;
        if (w9Var4 == null) {
            l.v("binding");
            w9Var4 = null;
        }
        w9Var4.f29221c.getSettings().setBuiltInZoomControls(true);
        w9 w9Var5 = this.L;
        if (w9Var5 == null) {
            l.v("binding");
            w9Var5 = null;
        }
        w9Var5.f29221c.getSettings().setSupportZoom(true);
        w9 w9Var6 = this.L;
        if (w9Var6 == null) {
            l.v("binding");
            w9Var6 = null;
        }
        w9Var6.f29221c.setVerticalScrollBarEnabled(true);
        w9 w9Var7 = this.L;
        if (w9Var7 == null) {
            l.v("binding");
            w9Var7 = null;
        }
        w9Var7.f29221c.getSettings().setJavaScriptEnabled(true);
        w9 w9Var8 = this.L;
        if (w9Var8 == null) {
            l.v("binding");
            w9Var8 = null;
        }
        w9Var8.f29221c.loadUrl(this.G);
        w9 w9Var9 = this.L;
        if (w9Var9 == null) {
            l.v("binding");
            w9Var9 = null;
        }
        w9Var9.f29221c.addJavascriptInterface(new a(this, this.K), "HtmlViewer");
        w9 w9Var10 = this.L;
        if (w9Var10 == null) {
            l.v("binding");
        } else {
            w9Var2 = w9Var10;
        }
        w9Var2.f29221c.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void m1(VerifyPendingChallanWebView verifyPendingChallanWebView, View view) {
        l.f(verifyPendingChallanWebView, "this$0");
        w9 w9Var = verifyPendingChallanWebView.L;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        if (w9Var.f29221c.canGoBack()) {
            w9 w9Var3 = verifyPendingChallanWebView.L;
            if (w9Var3 == null) {
                l.v("binding");
            } else {
                w9Var2 = w9Var3;
            }
            w9Var2.f29221c.goBack();
            return;
        }
        verifyPendingChallanWebView.q1();
    }

    /* access modifiers changed from: private */
    public static final void n1(VerifyPendingChallanWebView verifyPendingChallanWebView, View view) {
        l.f(verifyPendingChallanWebView, "this$0");
        verifyPendingChallanWebView.o1();
    }

    private final void o1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void p1(boolean z10) {
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

    private final void q1() {
        if (this.J) {
            onBackPressed();
            return;
        }
        this.J = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new w3(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void r1(VerifyPendingChallanWebView verifyPendingChallanWebView) {
        l.f(verifyPendingChallanWebView, "this$0");
        verifyPendingChallanWebView.J = false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.challan_payment_webview);
        w9 c10 = w9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.L = c10;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("pgiUrl");
            l.c(stringExtra);
            this.G = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("fromActivity");
            l.c(stringExtra2);
            this.K = stringExtra2;
        }
        l1();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        w9 w9Var = this.L;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        if (w9Var.f29221c.canGoBack()) {
            onBackPressed();
            return true;
        }
        q1();
        return true;
    }
}
