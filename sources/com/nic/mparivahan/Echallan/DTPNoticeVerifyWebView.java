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
import cb.g;
import cb.h;
import cb.i;
import cb.s0;
import cm.l;
import com.nic.mparivahan.DPTNotice.VerifyNoticePaymentResponseScreen;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import ld.c;
import ni.w9;
import org.json.JSONObject;

public final class DTPNoticeVerifyWebView extends d {
    private String G = "";
    private s0 H;
    /* access modifiers changed from: private */
    public boolean I;
    private boolean J;
    private String K = "";
    private String L = "";
    /* access modifiers changed from: private */
    public w9 M;
    public c N;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f8735a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8736b;

        public a(Context context, String str) {
            l.f(context, "ctx");
            l.f(str, "serviceName");
            this.f8735a = context;
            this.f8736b = str;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            String str2;
            String str3;
            l.c(str);
            Log.e("Result-->", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("challan_no")) {
                    Intent intent = new Intent(this.f8735a, VerifyNoticePaymentResponseScreen.class);
                    String str4 = "";
                    String str5 = jSONObject.getInt("respCode") == 0 ? "Pending" : jSONObject.getInt("respCode") == 1 ? "Success" : jSONObject.getInt("respCode") == 2 ? "Failed" : jSONObject.getInt("respCode") == 3 ? "Cancelled" : str4;
                    if (jSONObject.has("receipt_base_url")) {
                        str2 = jSONObject.getString("receipt_base_url");
                        l.e(str2, "getString(...)");
                    } else {
                        str2 = str4;
                    }
                    if (jSONObject.has("payment_date")) {
                        str3 = jSONObject.getString("payment_date");
                        l.e(str3, "getString(...)");
                    } else {
                        str3 = str4;
                    }
                    if (jSONObject.has("receipt_no")) {
                        str4 = jSONObject.getString("receipt_no");
                        l.e(str4, "getString(...)");
                    }
                    intent.putExtra("status", str5);
                    intent.putExtra("challanNo", jSONObject.getString("challan_no"));
                    intent.putExtra("vehicleNo", jSONObject.getString("rc_no"));
                    intent.putExtra("transactionId", jSONObject.getString("transId"));
                    intent.putExtra("challanPdfUrl", str2);
                    intent.putExtra("amount", jSONObject.getString("challan_amt"));
                    intent.putExtra("paymentDate", str3);
                    intent.putExtra("receiptNo", str4);
                    intent.putExtra("serviceName", this.f8736b);
                    this.f8735a.startActivity(intent);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DTPNoticeVerifyWebView f8737a;

        b(DTPNoticeVerifyWebView dTPNoticeVerifyWebView) {
            this.f8737a = dTPNoticeVerifyWebView;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f8737a.I = true;
            this.f8737a.r1(false);
            w9 i12 = this.f8737a.M;
            w9 w9Var = null;
            if (i12 == null) {
                l.v("binding");
                i12 = null;
            }
            i12.f29221c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            w9 i13 = this.f8737a.M;
            if (i13 == null) {
                l.v("binding");
            } else {
                w9Var = i13;
            }
            w9Var.f29221c.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f8737a.r1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f8737a.I = false;
            this.f8737a.r1(false);
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

    private final void m1() {
        w9 w9Var = this.M;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        w9Var.f29220b.f28305f.setOnClickListener(new h(this));
        w9 w9Var3 = this.M;
        if (w9Var3 == null) {
            l.v("binding");
            w9Var3 = null;
        }
        w9Var3.f29220b.f28306g.setOnClickListener(new i(this));
        w9 w9Var4 = this.M;
        if (w9Var4 == null) {
            l.v("binding");
            w9Var4 = null;
        }
        w9Var4.f29221c.getSettings().setBuiltInZoomControls(true);
        w9 w9Var5 = this.M;
        if (w9Var5 == null) {
            l.v("binding");
            w9Var5 = null;
        }
        w9Var5.f29221c.getSettings().setSupportZoom(true);
        w9 w9Var6 = this.M;
        if (w9Var6 == null) {
            l.v("binding");
            w9Var6 = null;
        }
        w9Var6.f29221c.setVerticalScrollBarEnabled(true);
        w9 w9Var7 = this.M;
        if (w9Var7 == null) {
            l.v("binding");
            w9Var7 = null;
        }
        w9Var7.f29221c.getSettings().setJavaScriptEnabled(true);
        w9 w9Var8 = this.M;
        if (w9Var8 == null) {
            l.v("binding");
            w9Var8 = null;
        }
        w9Var8.f29221c.loadUrl(this.G);
        w9 w9Var9 = this.M;
        if (w9Var9 == null) {
            l.v("binding");
            w9Var9 = null;
        }
        w9Var9.f29221c.addJavascriptInterface(new a(this, this.L), "HtmlViewer");
        w9 w9Var10 = this.M;
        if (w9Var10 == null) {
            l.v("binding");
        } else {
            w9Var2 = w9Var10;
        }
        w9Var2.f29221c.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void n1(DTPNoticeVerifyWebView dTPNoticeVerifyWebView, View view) {
        l.f(dTPNoticeVerifyWebView, "this$0");
        w9 w9Var = dTPNoticeVerifyWebView.M;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        if (w9Var.f29221c.canGoBack()) {
            w9 w9Var3 = dTPNoticeVerifyWebView.M;
            if (w9Var3 == null) {
                l.v("binding");
            } else {
                w9Var2 = w9Var3;
            }
            w9Var2.f29221c.goBack();
            return;
        }
        dTPNoticeVerifyWebView.s1();
    }

    /* access modifiers changed from: private */
    public static final void o1(DTPNoticeVerifyWebView dTPNoticeVerifyWebView, View view) {
        l.f(dTPNoticeVerifyWebView, "this$0");
        dTPNoticeVerifyWebView.p1();
    }

    private final void p1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void r1(boolean z10) {
        if (z10) {
            try {
                this.H = new s0(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
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

    private final void s1() {
        if (this.J) {
            onBackPressed();
            return;
        }
        this.J = true;
        Toast.makeText(this, l1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new g(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void t1(DTPNoticeVerifyWebView dTPNoticeVerifyWebView) {
        l.f(dTPNoticeVerifyWebView, "this$0");
        dTPNoticeVerifyWebView.J = false;
    }

    public final c l1() {
        c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w9 c10 = w9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.M = c10;
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
            String stringExtra3 = getIntent().getStringExtra("searchType");
            l.c(stringExtra3);
            this.L = stringExtra3;
        }
        q1(new c(this));
        m1();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        w9 w9Var = this.M;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        if (w9Var.f29221c.canGoBack()) {
            onBackPressed();
            return true;
        }
        s1();
        return true;
    }

    public final void q1(c cVar) {
        l.f(cVar, "<set-?>");
        this.N = cVar;
    }
}
