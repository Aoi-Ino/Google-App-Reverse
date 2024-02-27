package com.nic.mparivahan.Tax.payment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.databinding.f;
import androidx.databinding.h;
import androidx.lifecycle.u0;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import fj.q;
import java.io.Serializable;
import ni.dd;
import org.json.JSONObject;
import ud.k;
import ud.m;
import ud.n;

public final class TaxPaymentActivity extends d {
    private String G = "";
    /* access modifiers changed from: private */
    public dd H;
    private q I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    public NrvDetails L;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TaxPaymentActivity f20513a;

        public a(TaxPaymentActivity taxPaymentActivity) {
            l.f(taxPaymentActivity, "context");
            this.f20513a = taxPaymentActivity;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("response")) {
                    String string = jSONObject.getString("response");
                    Log.e("dl-print", string);
                    Intent intent = new Intent(this.f20513a, PayTaxPaymentStatusScreen.class);
                    intent.putExtra("EncString", string);
                    intent.putExtra("RcDetails", this.f20513a.l1());
                    this.f20513a.startActivity(intent);
                    TaxPaymentActivity taxPaymentActivity = this.f20513a;
                    l.d(taxPaymentActivity, "null cannot be cast to non-null type android.app.Activity");
                    taxPaymentActivity.finish();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaxPaymentActivity f20514a;

        b(TaxPaymentActivity taxPaymentActivity) {
            this.f20514a = taxPaymentActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f20514a.J = true;
            dd j12 = this.f20514a.H;
            dd ddVar = null;
            if (j12 == null) {
                l.v("mBinding");
                j12 = null;
            }
            j12.C.p();
            dd j13 = this.f20514a.H;
            if (j13 == null) {
                l.v("mBinding");
                j13 = null;
            }
            j13.C.setVisibility(8);
            dd j14 = this.f20514a.H;
            if (j14 == null) {
                l.v("mBinding");
                j14 = null;
            }
            j14.B.setVisibility(0);
            dd j15 = this.f20514a.H;
            if (j15 == null) {
                l.v("mBinding");
                j15 = null;
            }
            j15.B.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            dd j16 = this.f20514a.H;
            if (j16 == null) {
                l.v("mBinding");
            } else {
                ddVar = j16;
            }
            ddVar.B.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            dd j12 = this.f20514a.H;
            if (j12 == null) {
                l.v("mBinding");
                j12 = null;
            }
            j12.C.o();
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f20514a.J = false;
            Log.e("dl-js", ("Got Error! " + webResourceError).toString());
            this.f20514a.finish();
            dd j12 = this.f20514a.H;
            dd ddVar = null;
            if (j12 == null) {
                l.v("mBinding");
                j12 = null;
            }
            j12.C.p();
            dd j13 = this.f20514a.H;
            if (j13 == null) {
                l.v("mBinding");
            } else {
                ddVar = j13;
            }
            ddVar.C.setVisibility(8);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            l.f(sslErrorHandler, "handler");
            l.f(sslError, "error");
            int primaryError = sslError.getPrimaryError();
            Log.e("dl-ssl", primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? "SSL Certificate error." : "The certificate authority is not trusted." : "The certificate Hostname mismatch." : "The certificate has expired." : "The certificate is not yet valid.");
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                webView.loadUrl(valueOf);
            }
            Log.e("dl-url_finish", valueOf);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static final void n1(TaxPaymentActivity taxPaymentActivity, View view) {
        l.f(taxPaymentActivity, "this$0");
        taxPaymentActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void p1() {
        dd ddVar = this.H;
        Object obj = null;
        if (ddVar == null) {
            l.v("mBinding");
            ddVar = null;
        }
        ddVar.f25963x.f25959e.setOnClickListener(new k(this));
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                obj = extras.get("url");
            }
            this.G = String.valueOf(obj);
            Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
            l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
            r1((NrvDetails) serializableExtra);
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(TaxPaymentActivity taxPaymentActivity, View view) {
        l.f(taxPaymentActivity, "this$0");
        taxPaymentActivity.m1("Are you sure want to go back?");
    }

    private final void s1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new ud.l(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void t1(TaxPaymentActivity taxPaymentActivity) {
        l.f(taxPaymentActivity, "this$0");
        taxPaymentActivity.K = false;
    }

    private final void u1() {
        dd ddVar = this.H;
        dd ddVar2 = null;
        if (ddVar == null) {
            l.v("mBinding");
            ddVar = null;
        }
        ddVar.B.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        dd ddVar3 = this.H;
        if (ddVar3 == null) {
            l.v("mBinding");
            ddVar3 = null;
        }
        ddVar3.B.getSettings().setAllowFileAccess(true);
        dd ddVar4 = this.H;
        if (ddVar4 == null) {
            l.v("mBinding");
            ddVar4 = null;
        }
        ddVar4.B.getSettings().setAllowContentAccess(true);
        dd ddVar5 = this.H;
        if (ddVar5 == null) {
            l.v("mBinding");
            ddVar5 = null;
        }
        ddVar5.B.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        dd ddVar6 = this.H;
        if (ddVar6 == null) {
            l.v("mBinding");
            ddVar6 = null;
        }
        ddVar6.B.getSettings().setSupportMultipleWindows(true);
        dd ddVar7 = this.H;
        if (ddVar7 == null) {
            l.v("mBinding");
            ddVar7 = null;
        }
        ddVar7.B.getSettings().setJavaScriptEnabled(true);
        dd ddVar8 = this.H;
        if (ddVar8 == null) {
            l.v("mBinding");
            ddVar8 = null;
        }
        ddVar8.B.getSettings().setDomStorageEnabled(true);
        dd ddVar9 = this.H;
        if (ddVar9 == null) {
            l.v("mBinding");
            ddVar9 = null;
        }
        ddVar9.B.getSettings().setUseWideViewPort(true);
        dd ddVar10 = this.H;
        if (ddVar10 == null) {
            l.v("mBinding");
            ddVar10 = null;
        }
        ddVar10.B.getSettings().setLoadWithOverviewMode(true);
        dd ddVar11 = this.H;
        if (ddVar11 == null) {
            l.v("mBinding");
            ddVar11 = null;
        }
        ddVar11.B.getSettings().setBuiltInZoomControls(true);
        dd ddVar12 = this.H;
        if (ddVar12 == null) {
            l.v("mBinding");
            ddVar12 = null;
        }
        ddVar12.B.clearCache(true);
        dd ddVar13 = this.H;
        if (ddVar13 == null) {
            l.v("mBinding");
            ddVar13 = null;
        }
        ddVar13.B.reload();
        dd ddVar14 = this.H;
        if (ddVar14 == null) {
            l.v("mBinding");
            ddVar14 = null;
        }
        ddVar14.B.requestFocus(130);
        Log.d("url_new", this.G.toString());
        CookieManager.getInstance().setAcceptCookie(true);
        dd ddVar15 = this.H;
        if (ddVar15 == null) {
            l.v("mBinding");
            ddVar15 = null;
        }
        ddVar15.B.loadUrl(this.G);
        dd ddVar16 = this.H;
        if (ddVar16 == null) {
            l.v("mBinding");
            ddVar16 = null;
        }
        ddVar16.B.addJavascriptInterface(new a(this), "HtmlViewer");
        dd ddVar17 = this.H;
        if (ddVar17 == null) {
            l.v("mBinding");
        } else {
            ddVar2 = ddVar17;
        }
        ddVar2.B.setWebViewClient(new b(this));
    }

    public final NrvDetails l1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final void m1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText("OK");
        textView.setOnClickListener(new m(this));
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setOnClickListener(new n(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h f10 = f.f(this, R.layout.taxpaymentscreen);
        l.e(f10, "setContentView(...)");
        this.H = (dd) f10;
        this.I = (q) new u0(this).a(q.class);
        ld.h hVar = new ld.h(this);
        dd ddVar = this.H;
        if (ddVar == null) {
            l.v("mBinding");
            ddVar = null;
        }
        ddVar.f25963x.f25961g.setText(VContant.Companion.l(this, hVar));
        p1();
        u1();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        dd ddVar = this.H;
        if (ddVar == null) {
            l.v("mBinding");
            ddVar = null;
        }
        if (ddVar.B.canGoBack()) {
            onBackPressed();
            return true;
        }
        s1();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        dd ddVar = this.H;
        dd ddVar2 = null;
        if (ddVar == null) {
            l.v("mBinding");
            ddVar = null;
        }
        ddVar.A.onPause();
        dd ddVar3 = this.H;
        if (ddVar3 == null) {
            l.v("mBinding");
        } else {
            ddVar2 = ddVar3;
        }
        ddVar2.A.pauseTimers();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        dd ddVar = this.H;
        dd ddVar2 = null;
        if (ddVar == null) {
            l.v("mBinding");
            ddVar = null;
        }
        ddVar.A.onResume();
        dd ddVar3 = this.H;
        if (ddVar3 == null) {
            l.v("mBinding");
        } else {
            ddVar2 = ddVar3;
        }
        ddVar2.A.resumeTimers();
    }

    public final void r1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }
}
