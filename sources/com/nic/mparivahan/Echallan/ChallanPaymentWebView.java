package com.nic.mparivahan.Echallan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import cb.s0;
import cm.l;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.R;
import ld.c;
import ld.g;
import ni.w9;
import org.json.JSONObject;

public final class ChallanPaymentWebView extends d {
    private SearchChallanResultModel G;
    private String H = "";
    /* access modifiers changed from: private */
    public s0 I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    /* access modifiers changed from: private */
    public w9 L;
    public c M;
    private String N = "";

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f8726a;

        /* renamed from: b  reason: collision with root package name */
        private final SearchChallanResultModel f8727b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8728c;

        /* renamed from: d  reason: collision with root package name */
        private final String f8729d;

        public a(Context context, SearchChallanResultModel searchChallanResultModel, String str, String str2) {
            l.f(context, "ctx");
            l.f(searchChallanResultModel, "selectedChallan");
            l.f(str, "searchType");
            l.f(str2, "paymentType");
            this.f8726a = context;
            this.f8727b = searchChallanResultModel;
            this.f8728c = str;
            this.f8729d = str2;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            JSONObject jSONObject;
            String str2;
            String str3;
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
                Intent intent = new Intent(this.f8726a, ResponsePaymentActivity.class);
                String str4 = "";
                String str5 = jSONObject.getInt("respCode") == 0 ? "Pending" : jSONObject.getInt("respCode") == 1 ? "Success" : jSONObject.getInt("respCode") == 2 ? "Failed" : jSONObject.getInt("respCode") == 3 ? "Cancelled" : str4;
                if (jSONObject.has("ecodedata")) {
                    str2 = jSONObject.getString("ecodedata");
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
                intent.putExtra("vehicleNo", jSONObject.getString("rcNo"));
                intent.putExtra("transactionId", jSONObject.getString("transId"));
                intent.putExtra("challanPdfUrl", str2);
                intent.putExtra("amount", jSONObject.getString("challan_amt"));
                intent.putExtra("paymentDate", str3);
                intent.putExtra("receiptNo", str4);
                intent.putExtra("dptCd", this.f8727b.getDptCd());
                intent.putExtra("rtoCd", this.f8727b.getRtoCd());
                intent.putExtra("challanDate", this.f8727b.getDateTime());
                intent.putExtra("stateCd", this.f8727b.getStateCd());
                intent.putExtra("searchType", this.f8728c);
                intent.putExtra("paymentType", this.f8729d);
                this.f8726a.startActivity(intent);
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChallanPaymentWebView f8730a;

        b(ChallanPaymentWebView challanPaymentWebView) {
            this.f8730a = challanPaymentWebView;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f8730a.J = true;
            this.f8730a.s1(false);
            w9 i12 = this.f8730a.L;
            if (i12 == null) {
                l.v("binding");
                i12 = null;
            }
            i12.f29221c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s0 j12 = this.f8730a.I;
            if (j12 != null) {
                j12.b();
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f8730a.J = false;
            this.f8730a.s1(false);
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
        w9 w9Var = this.L;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        w9Var.f29220b.f28305f.setOnClickListener(new cb.a(this));
        w9 w9Var3 = this.L;
        if (w9Var3 == null) {
            l.v("binding");
            w9Var3 = null;
        }
        w9Var3.f29220b.f28306g.setOnClickListener(new cb.b(this));
        w9 w9Var4 = this.L;
        if (w9Var4 == null) {
            l.v("binding");
            w9Var4 = null;
        }
        w9Var4.f29221c.getSettings().setJavaScriptEnabled(true);
        w9 w9Var5 = this.L;
        if (w9Var5 == null) {
            l.v("binding");
            w9Var5 = null;
        }
        w9Var5.f29221c.getSettings().setDomStorageEnabled(true);
        w9 w9Var6 = this.L;
        if (w9Var6 == null) {
            l.v("binding");
            w9Var6 = null;
        }
        w9Var6.f29221c.getSettings().setUseWideViewPort(true);
        w9 w9Var7 = this.L;
        if (w9Var7 == null) {
            l.v("binding");
            w9Var7 = null;
        }
        w9Var7.f29221c.getSettings().setLoadWithOverviewMode(true);
        w9 w9Var8 = this.L;
        if (w9Var8 == null) {
            l.v("binding");
            w9Var8 = null;
        }
        w9Var8.f29221c.getSettings().setBuiltInZoomControls(true);
        w9 w9Var9 = this.L;
        if (w9Var9 == null) {
            l.v("binding");
            w9Var9 = null;
        }
        w9Var9.f29221c.clearCache(true);
        w9 w9Var10 = this.L;
        if (w9Var10 == null) {
            l.v("binding");
            w9Var10 = null;
        }
        w9Var10.f29221c.reload();
        w9 w9Var11 = this.L;
        if (w9Var11 == null) {
            l.v("binding");
            w9Var11 = null;
        }
        w9Var11.f29221c.requestFocus(130);
        g gVar = new g(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(APIController.a().echallanPaymentPro());
        sb2.append("challan_no=");
        SearchChallanResultModel searchChallanResultModel = this.G;
        sb2.append(searchChallanResultModel != null ? searchChallanResultModel.getChallanNo() : null);
        sb2.append("&mobile_no=");
        sb2.append(gVar.l());
        String sb3 = sb2.toString();
        CookieManager.getInstance().setAcceptCookie(true);
        w9 w9Var12 = this.L;
        if (w9Var12 == null) {
            l.v("binding");
            w9Var12 = null;
        }
        w9Var12.f29221c.loadUrl(sb3);
        w9 w9Var13 = this.L;
        if (w9Var13 == null) {
            l.v("binding");
            w9Var13 = null;
        }
        WebView webView = w9Var13.f29221c;
        SearchChallanResultModel searchChallanResultModel2 = this.G;
        l.c(searchChallanResultModel2);
        webView.addJavascriptInterface(new a(this, searchChallanResultModel2, this.H, this.N), "HtmlViewer");
        w9 w9Var14 = this.L;
        if (w9Var14 == null) {
            l.v("binding");
        } else {
            w9Var2 = w9Var14;
        }
        w9Var2.f29221c.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void o1(ChallanPaymentWebView challanPaymentWebView, View view) {
        l.f(challanPaymentWebView, "this$0");
        w9 w9Var = challanPaymentWebView.L;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        if (w9Var.f29221c.canGoBack()) {
            w9 w9Var3 = challanPaymentWebView.L;
            if (w9Var3 == null) {
                l.v("binding");
            } else {
                w9Var2 = w9Var3;
            }
            w9Var2.f29221c.goBack();
            return;
        }
        challanPaymentWebView.t1();
    }

    /* access modifiers changed from: private */
    public static final void p1(ChallanPaymentWebView challanPaymentWebView, View view) {
        l.f(challanPaymentWebView, "this$0");
        challanPaymentWebView.q1();
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
                if (s0Var != null) {
                    s0Var.a();
                }
            } catch (WindowManager.BadTokenException unused) {
            }
        }
    }

    private final void t1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Toast.makeText(this, m1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new cb.c(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void u1(ChallanPaymentWebView challanPaymentWebView) {
        l.f(challanPaymentWebView, "this$0");
        challanPaymentWebView.K = false;
    }

    public final c m1() {
        c cVar = this.M;
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
        this.L = c10;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        r1(new c(this));
        this.I = new s0(this, R.string.blank, true);
        this.G = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        if (getIntent().hasExtra("type")) {
            String stringExtra = getIntent().getStringExtra("type");
            l.c(stringExtra);
            this.H = stringExtra;
        }
        String stringExtra2 = getIntent().getStringExtra("paymentType");
        l.c(stringExtra2);
        this.N = stringExtra2;
        n1();
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
        t1();
        return true;
    }

    public final void r1(c cVar) {
        l.f(cVar, "<set-?>");
        this.M = cVar;
    }
}
