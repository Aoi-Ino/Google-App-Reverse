package com.nic.mparivahan.Echallan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
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
import androidx.appcompat.app.d;
import cb.e;
import cb.f;
import cb.s0;
import cm.l;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import java.nio.charset.Charset;
import ld.c;
import ni.w9;
import org.json.JSONObject;

public final class DTPNoticePaymentWebView extends d {
    private DPTNoticeDataModel G;
    private String H = "";
    /* access modifiers changed from: private */
    public s0 I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    private final String L = "https://staging.parivahan.gov.in/notice/api/pay-notice?";
    /* access modifiers changed from: private */
    public w9 M;
    public c N;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f8731a;

        /* renamed from: b  reason: collision with root package name */
        private final DPTNoticeDataModel f8732b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8733c;

        public a(Context context, DPTNoticeDataModel dPTNoticeDataModel, String str) {
            l.f(context, "ctx");
            l.f(dPTNoticeDataModel, "selectedChallan");
            l.f(str, "searchType");
            this.f8731a = context;
            this.f8732b = dPTNoticeDataModel;
            this.f8733c = str;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            JSONObject jSONObject;
            String str2;
            String str3;
            String str4;
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
            if (jSONObject != null && jSONObject.has("transId")) {
                Intent intent = new Intent(this.f8731a, ResponsePaymentActivity.class);
                String str5 = "";
                String str6 = jSONObject.getInt("respCode") == 0 ? "Pending" : jSONObject.getInt("respCode") == 1 ? "Success" : jSONObject.getInt("respCode") == 2 ? "Failed" : jSONObject.getInt("respCode") == 3 ? "Cancelled" : str5;
                if (jSONObject.has("ecodedata")) {
                    str2 = jSONObject.getString("ecodedata");
                    l.e(str2, "getString(...)");
                } else {
                    str2 = str5;
                }
                if (jSONObject.has("receipt_base_url")) {
                    str3 = jSONObject.getString("receipt_base_url");
                    l.e(str3, "getString(...)");
                } else {
                    str3 = str5;
                }
                if (str2.length() > 0) {
                    byte[] decode = Base64.decode(str2, 0);
                    l.c(decode);
                    Charset forName = Charset.forName("UTF-8");
                    l.e(forName, "forName(charsetName)");
                    str4 = str3 + '=' + new String(decode, forName);
                } else {
                    str4 = str5;
                }
                if (jSONObject.has("payment_date")) {
                    str5 = jSONObject.getString("payment_date");
                    l.e(str5, "getString(...)");
                }
                if (jSONObject.has("receipt_no")) {
                    l.e(jSONObject.getString("receipt_no"), "getString(...)");
                }
                intent.putExtra("status", str6);
                intent.putExtra("challanNo", jSONObject.getString("challan_no"));
                intent.putExtra("vehicleNo", jSONObject.getString("rcNo"));
                intent.putExtra("transactionId", jSONObject.getString("transId"));
                intent.putExtra("challanPdfUrl", str4);
                intent.putExtra("amount", jSONObject.getString("challan_amt"));
                intent.putExtra("paymentDate", str5);
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DTPNoticePaymentWebView f8734a;

        b(DTPNoticePaymentWebView dTPNoticePaymentWebView) {
            this.f8734a = dTPNoticePaymentWebView;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f8734a.J = true;
            this.f8734a.s1(false);
            w9 i12 = this.f8734a.M;
            if (i12 == null) {
                l.v("binding");
                i12 = null;
            }
            i12.f29221c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s0 j12 = this.f8734a.I;
            if (j12 != null) {
                j12.b();
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f8734a.J = false;
            this.f8734a.s1(false);
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

    private final void n1() {
        w9 w9Var = this.M;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        w9Var.f29220b.f28305f.setOnClickListener(new e(this));
        w9 w9Var3 = this.M;
        if (w9Var3 == null) {
            l.v("binding");
            w9Var3 = null;
        }
        w9Var3.f29220b.f28306g.setOnClickListener(new f(this));
        w9 w9Var4 = this.M;
        if (w9Var4 == null) {
            l.v("binding");
            w9Var4 = null;
        }
        w9Var4.f29221c.getSettings().setJavaScriptEnabled(true);
        w9 w9Var5 = this.M;
        if (w9Var5 == null) {
            l.v("binding");
            w9Var5 = null;
        }
        w9Var5.f29221c.getSettings().setDomStorageEnabled(true);
        w9 w9Var6 = this.M;
        if (w9Var6 == null) {
            l.v("binding");
            w9Var6 = null;
        }
        w9Var6.f29221c.getSettings().setUseWideViewPort(true);
        w9 w9Var7 = this.M;
        if (w9Var7 == null) {
            l.v("binding");
            w9Var7 = null;
        }
        w9Var7.f29221c.getSettings().setLoadWithOverviewMode(true);
        w9 w9Var8 = this.M;
        if (w9Var8 == null) {
            l.v("binding");
            w9Var8 = null;
        }
        w9Var8.f29221c.getSettings().setBuiltInZoomControls(true);
        w9 w9Var9 = this.M;
        if (w9Var9 == null) {
            l.v("binding");
            w9Var9 = null;
        }
        w9Var9.f29221c.clearCache(true);
        w9 w9Var10 = this.M;
        if (w9Var10 == null) {
            l.v("binding");
            w9Var10 = null;
        }
        w9Var10.f29221c.reload();
        w9 w9Var11 = this.M;
        if (w9Var11 == null) {
            l.v("binding");
            w9Var11 = null;
        }
        w9Var11.f29221c.requestFocus(130);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.L);
        sb2.append("notice_no=");
        DPTNoticeDataModel dPTNoticeDataModel = this.G;
        sb2.append(dPTNoticeDataModel != null ? Integer.valueOf(dPTNoticeDataModel.getChallan_no()) : null);
        String sb3 = sb2.toString();
        CookieManager.getInstance().setAcceptCookie(true);
        w9 w9Var12 = this.M;
        if (w9Var12 == null) {
            l.v("binding");
            w9Var12 = null;
        }
        w9Var12.f29221c.loadUrl(sb3);
        w9 w9Var13 = this.M;
        if (w9Var13 == null) {
            l.v("binding");
            w9Var13 = null;
        }
        WebView webView = w9Var13.f29221c;
        DPTNoticeDataModel dPTNoticeDataModel2 = this.G;
        l.c(dPTNoticeDataModel2);
        webView.addJavascriptInterface(new a(this, dPTNoticeDataModel2, this.H), "HtmlViewer");
        w9 w9Var14 = this.M;
        if (w9Var14 == null) {
            l.v("binding");
        } else {
            w9Var2 = w9Var14;
        }
        w9Var2.f29221c.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void o1(DTPNoticePaymentWebView dTPNoticePaymentWebView, View view) {
        l.f(dTPNoticePaymentWebView, "this$0");
        w9 w9Var = dTPNoticePaymentWebView.M;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        if (w9Var.f29221c.canGoBack()) {
            w9 w9Var3 = dTPNoticePaymentWebView.M;
            if (w9Var3 == null) {
                l.v("binding");
            } else {
                w9Var2 = w9Var3;
            }
            w9Var2.f29221c.goBack();
            return;
        }
        dTPNoticePaymentWebView.t1();
    }

    /* access modifiers changed from: private */
    public static final void p1(DTPNoticePaymentWebView dTPNoticePaymentWebView, View view) {
        l.f(dTPNoticePaymentWebView, "this$0");
        dTPNoticePaymentWebView.q1();
    }

    private final void q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void s1(boolean z10) {
        if (!z10) {
            try {
                s0 s0Var = this.I;
                l.c(s0Var);
                s0Var.a();
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
            }
        }
    }

    private final void t1() {
        if (this.K) {
            s1(false);
            onBackPressed();
            return;
        }
        this.K = true;
        Toast.makeText(this, m1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new cb.d(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void u1(DTPNoticePaymentWebView dTPNoticePaymentWebView) {
        l.f(dTPNoticePaymentWebView, "this$0");
        dTPNoticePaymentWebView.K = false;
    }

    public final c m1() {
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
        setContentView((int) R.layout.challan_payment_webview);
        w9 c10 = w9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.M = c10;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        r1(new c(this));
        this.I = new s0(this, R.string.blank, true);
        this.G = (DPTNoticeDataModel) getIntent().getParcelableExtra("selectedData");
        if (getIntent().hasExtra("type")) {
            String stringExtra = getIntent().getStringExtra("type");
            l.c(stringExtra);
            this.H = stringExtra;
        }
        n1();
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
        t1();
        return true;
    }

    public final void r1(c cVar) {
        l.f(cVar, "<set-?>");
        this.N = cVar;
    }
}
