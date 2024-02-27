package com.nic.mparivahan;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.d;

public class TestPaymentGatwayActivity extends d {
    /* access modifiers changed from: private */
    public WebView G;
    ProgressDialog H;
    String I = "";
    String J = "";

    class a extends WebViewClient {
        a() {
        }

        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog = TestPaymentGatwayActivity.this.H;
            if (progressDialog != null) {
                progressDialog.dismiss();
                TestPaymentGatwayActivity.this.H = null;
            }
            TestPaymentGatwayActivity.this.G.loadUrl("javascript:HtmlViewer");
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            TestPaymentGatwayActivity testPaymentGatwayActivity = TestPaymentGatwayActivity.this;
            if (testPaymentGatwayActivity.H == null) {
                testPaymentGatwayActivity.H = new ProgressDialog(TestPaymentGatwayActivity.this);
                TestPaymentGatwayActivity testPaymentGatwayActivity2 = TestPaymentGatwayActivity.this;
                testPaymentGatwayActivity2.H.setMessage(testPaymentGatwayActivity2.getResources().getString(R.string.loading_msg));
                TestPaymentGatwayActivity.this.H.setCancelable(false);
                TestPaymentGatwayActivity.this.H.show();
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl("javascript:");
            return true;
        }
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f9622a;

        b(Context context) {
            this.f9622a = context;
        }

        @JavascriptInterface
        public void showHTML(String str) {
        }
    }

    private void g1() {
        this.G = (WebView) findViewById(R.id.paymentWv);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_informational_web_view);
        g1();
        this.G.getSettings().setJavaScriptEnabled(true);
        this.G.getSettings().setDomStorageEnabled(true);
        this.G.getSettings().setUseWideViewPort(true);
        this.G.getSettings().setLoadWithOverviewMode(true);
        this.G.getSettings().setBuiltInZoomControls(true);
        this.G.clearCache(true);
        this.G.clearView();
        this.G.reload();
        this.G.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        this.G.addJavascriptInterface(new b(this), "HtmlViewer");
        this.G.setWebViewClient(new a());
        this.G.loadUrl("20476f95b0033147aaf5d55e11b1f4eea5b90a8020ea6ebee381bffd6ba7cf434e%203fd271323fece51582d5d62b4fc14f84");
    }
}
