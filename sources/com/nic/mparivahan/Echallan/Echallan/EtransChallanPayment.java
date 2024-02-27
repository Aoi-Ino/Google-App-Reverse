package com.nic.mparivahan.Echallan.Echallan;

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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.ResponsePaymentActivity;
import com.nic.mparivahan.R;
import ld.c;
import ni.w9;
import org.json.JSONObject;

public final class EtransChallanPayment extends d {
    /* access modifiers changed from: private */
    public w9 G;
    public c H;
    /* access modifiers changed from: private */
    public s0 I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    private String L = "";
    private String M = "";
    private SearchChallanResultModel N;
    private String O = "";
    private String P = "";
    private String Q = "";

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f8738a;

        /* renamed from: b  reason: collision with root package name */
        private final SearchChallanResultModel f8739b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8740c;

        /* renamed from: d  reason: collision with root package name */
        private final String f8741d;

        /* renamed from: e  reason: collision with root package name */
        private final String f8742e;

        public a(Context context, SearchChallanResultModel searchChallanResultModel, String str, String str2, String str3) {
            l.f(context, "ctx");
            l.f(searchChallanResultModel, "selectedChallan");
            l.f(str, "searchType");
            l.f(str2, "paymentType");
            l.f(str3, "fromActivity");
            this.f8738a = context;
            this.f8739b = searchChallanResultModel;
            this.f8740c = str;
            this.f8741d = str2;
            this.f8742e = str3;
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
                Intent intent = new Intent(this.f8738a, ResponsePaymentActivity.class);
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
                intent.putExtra("dptCd", this.f8739b.getDptCd());
                intent.putExtra("rtoCd", this.f8739b.getRtoCd());
                intent.putExtra("challanDate", this.f8739b.getDateTime());
                intent.putExtra("stateCd", this.f8739b.getStateCd());
                intent.putExtra("searchType", this.f8740c);
                intent.putExtra("paymentType", this.f8741d);
                intent.putExtra("fromActivity", this.f8742e);
                this.f8738a.startActivity(intent);
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EtransChallanPayment f8743a;

        b(EtransChallanPayment etransChallanPayment) {
            this.f8743a = etransChallanPayment;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f8743a.J = true;
            this.f8743a.s1(false);
            w9 i12 = this.f8743a.G;
            if (i12 == null) {
                l.v("binding");
                i12 = null;
            }
            i12.f29221c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s0 j12 = this.f8743a.I;
            if (j12 != null) {
                j12.b();
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f8743a.J = false;
            this.f8743a.s1(false);
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
        w9 w9Var = this.G;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        w9Var.f29220b.f28305f.setOnClickListener(new eb.b(this));
        w9 w9Var3 = this.G;
        if (w9Var3 == null) {
            l.v("binding");
            w9Var3 = null;
        }
        w9Var3.f29220b.f28306g.setOnClickListener(new eb.c(this));
        w9 w9Var4 = this.G;
        if (w9Var4 == null) {
            l.v("binding");
            w9Var4 = null;
        }
        w9Var4.f29221c.getSettings().setJavaScriptEnabled(true);
        w9 w9Var5 = this.G;
        if (w9Var5 == null) {
            l.v("binding");
            w9Var5 = null;
        }
        w9Var5.f29221c.getSettings().setDomStorageEnabled(true);
        w9 w9Var6 = this.G;
        if (w9Var6 == null) {
            l.v("binding");
            w9Var6 = null;
        }
        w9Var6.f29221c.getSettings().setUseWideViewPort(true);
        w9 w9Var7 = this.G;
        if (w9Var7 == null) {
            l.v("binding");
            w9Var7 = null;
        }
        w9Var7.f29221c.getSettings().setLoadWithOverviewMode(true);
        w9 w9Var8 = this.G;
        if (w9Var8 == null) {
            l.v("binding");
            w9Var8 = null;
        }
        w9Var8.f29221c.getSettings().setBuiltInZoomControls(true);
        w9 w9Var9 = this.G;
        if (w9Var9 == null) {
            l.v("binding");
            w9Var9 = null;
        }
        w9Var9.f29221c.clearCache(true);
        w9 w9Var10 = this.G;
        if (w9Var10 == null) {
            l.v("binding");
            w9Var10 = null;
        }
        w9Var10.f29221c.reload();
        w9 w9Var11 = this.G;
        if (w9Var11 == null) {
            l.v("binding");
            w9Var11 = null;
        }
        w9Var11.f29221c.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        String str = "encryptedData=" + this.M + "&encdata=" + this.M;
        w9 w9Var12 = this.G;
        if (w9Var12 == null) {
            l.v("binding");
            w9Var12 = null;
        }
        w9Var12.f29221c.postUrl(this.L, o6.b.a(str, "base64"));
        w9 w9Var13 = this.G;
        if (w9Var13 == null) {
            l.v("binding");
            w9Var13 = null;
        }
        WebView webView = w9Var13.f29221c;
        SearchChallanResultModel searchChallanResultModel = this.N;
        l.c(searchChallanResultModel);
        webView.addJavascriptInterface(new a(this, searchChallanResultModel, this.O, this.P, this.Q), "HtmlViewer");
        w9 w9Var14 = this.G;
        if (w9Var14 == null) {
            l.v("binding");
        } else {
            w9Var2 = w9Var14;
        }
        w9Var2.f29221c.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void o1(EtransChallanPayment etransChallanPayment, View view) {
        l.f(etransChallanPayment, "this$0");
        w9 w9Var = etransChallanPayment.G;
        w9 w9Var2 = null;
        if (w9Var == null) {
            l.v("binding");
            w9Var = null;
        }
        if (w9Var.f29221c.canGoBack()) {
            w9 w9Var3 = etransChallanPayment.G;
            if (w9Var3 == null) {
                l.v("binding");
            } else {
                w9Var2 = w9Var3;
            }
            w9Var2.f29221c.goBack();
            return;
        }
        etransChallanPayment.t1();
    }

    /* access modifiers changed from: private */
    public static final void p1(EtransChallanPayment etransChallanPayment, View view) {
        l.f(etransChallanPayment, "this$0");
        etransChallanPayment.q1();
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
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
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
        new Handler(myLooper).postDelayed(new eb.a(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void u1(EtransChallanPayment etransChallanPayment) {
        l.f(etransChallanPayment, "this$0");
        etransChallanPayment.K = false;
    }

    public final c m1() {
        c cVar = this.H;
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
        this.G = c10;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        r1(new c(this));
        this.I = new s0(this, R.string.blank, true);
        String stringExtra = getIntent().getStringExtra("requestUrl");
        l.c(stringExtra);
        this.L = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("requestData");
        l.c(stringExtra2);
        this.M = stringExtra2;
        this.N = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        if (getIntent().hasExtra("type")) {
            String stringExtra3 = getIntent().getStringExtra("type");
            l.c(stringExtra3);
            this.O = stringExtra3;
        }
        String stringExtra4 = getIntent().getStringExtra("paymentType");
        l.c(stringExtra4);
        this.P = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("fromActivity");
        l.c(stringExtra5);
        this.Q = stringExtra5;
        n1();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        w9 w9Var = this.G;
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
        this.H = cVar;
    }
}
