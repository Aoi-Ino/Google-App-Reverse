package com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import fj.q;
import ld.c;
import ni.wb;
import org.json.JSONObject;

public final class ComPaymentTaxActivity extends d {
    private String G = "";
    /* access modifiers changed from: private */
    public wb H;
    private q I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    public c L;
    private String M = " ";

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f20562a;

        public a(Context context) {
            l.f(context, "context");
            this.f20562a = context;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("response")) {
                    String string = jSONObject.getString("response");
                    Intent intent = new Intent(this.f20562a, CompPaymentStatusScreen.class);
                    intent.putExtra("EncString", string);
                    intent.putExtra("ServiceName", "Payment Status");
                    this.f20562a.startActivity(intent);
                    Context context = this.f20562a;
                    l.d(context, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context).finish();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComPaymentTaxActivity f20563a;

        b(ComPaymentTaxActivity comPaymentTaxActivity) {
            this.f20563a = comPaymentTaxActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f20563a.J = true;
            wb j12 = this.f20563a.H;
            wb wbVar = null;
            if (j12 == null) {
                l.v("mBinding");
                j12 = null;
            }
            j12.C.p();
            wb j13 = this.f20563a.H;
            if (j13 == null) {
                l.v("mBinding");
                j13 = null;
            }
            j13.C.setVisibility(8);
            wb j14 = this.f20563a.H;
            if (j14 == null) {
                l.v("mBinding");
                j14 = null;
            }
            j14.B.setVisibility(0);
            wb j15 = this.f20563a.H;
            if (j15 == null) {
                l.v("mBinding");
                j15 = null;
            }
            j15.B.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            wb j16 = this.f20563a.H;
            if (j16 == null) {
                l.v("mBinding");
            } else {
                wbVar = j16;
            }
            wbVar.B.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            wb j12 = this.f20563a.H;
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
            this.f20563a.J = false;
            Log.e("dl-js", ("Got Error! " + webResourceError).toString());
            this.f20563a.finish();
            wb j12 = this.f20563a.H;
            wb wbVar = null;
            if (j12 == null) {
                l.v("mBinding");
                j12 = null;
            }
            j12.C.p();
            wb j13 = this.f20563a.H;
            if (j13 == null) {
                l.v("mBinding");
            } else {
                wbVar = j13;
            }
            wbVar.C.setVisibility(8);
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
    public static final void n1(ComPaymentTaxActivity comPaymentTaxActivity, View view) {
        l.f(comPaymentTaxActivity, "this$0");
        comPaymentTaxActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void p1() {
        wb wbVar = this.H;
        wb wbVar2 = null;
        if (wbVar == null) {
            l.v("mBinding");
            wbVar = null;
        }
        wbVar.f29228x.f25959e.setOnClickListener(new ie.b(this));
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.G = String.valueOf(extras != null ? extras.get("url") : null);
                Bundle extras2 = getIntent().getExtras();
                this.M = String.valueOf(extras2 != null ? extras2.get("ServiceName") : null);
                wb wbVar3 = this.H;
                if (wbVar3 == null) {
                    l.v("mBinding");
                } else {
                    wbVar2 = wbVar3;
                }
                wbVar2.f29228x.f25961g.setText(this.M.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(ComPaymentTaxActivity comPaymentTaxActivity, View view) {
        l.f(comPaymentTaxActivity, "this$0");
        comPaymentTaxActivity.m1("Are you sure want to go back?");
    }

    private final void s1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new ie.a(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void t1(ComPaymentTaxActivity comPaymentTaxActivity) {
        l.f(comPaymentTaxActivity, "this$0");
        comPaymentTaxActivity.K = false;
    }

    private final void u1() {
        wb wbVar = this.H;
        wb wbVar2 = null;
        if (wbVar == null) {
            l.v("mBinding");
            wbVar = null;
        }
        wbVar.B.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        wb wbVar3 = this.H;
        if (wbVar3 == null) {
            l.v("mBinding");
            wbVar3 = null;
        }
        wbVar3.B.getSettings().setAllowFileAccess(true);
        wb wbVar4 = this.H;
        if (wbVar4 == null) {
            l.v("mBinding");
            wbVar4 = null;
        }
        wbVar4.B.getSettings().setAllowContentAccess(true);
        wb wbVar5 = this.H;
        if (wbVar5 == null) {
            l.v("mBinding");
            wbVar5 = null;
        }
        wbVar5.B.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wb wbVar6 = this.H;
        if (wbVar6 == null) {
            l.v("mBinding");
            wbVar6 = null;
        }
        wbVar6.B.getSettings().setSupportMultipleWindows(true);
        wb wbVar7 = this.H;
        if (wbVar7 == null) {
            l.v("mBinding");
            wbVar7 = null;
        }
        wbVar7.B.getSettings().setJavaScriptEnabled(true);
        wb wbVar8 = this.H;
        if (wbVar8 == null) {
            l.v("mBinding");
            wbVar8 = null;
        }
        wbVar8.B.getSettings().setDomStorageEnabled(true);
        wb wbVar9 = this.H;
        if (wbVar9 == null) {
            l.v("mBinding");
            wbVar9 = null;
        }
        wbVar9.B.getSettings().setUseWideViewPort(true);
        wb wbVar10 = this.H;
        if (wbVar10 == null) {
            l.v("mBinding");
            wbVar10 = null;
        }
        wbVar10.B.getSettings().setLoadWithOverviewMode(true);
        wb wbVar11 = this.H;
        if (wbVar11 == null) {
            l.v("mBinding");
            wbVar11 = null;
        }
        wbVar11.B.getSettings().setBuiltInZoomControls(true);
        wb wbVar12 = this.H;
        if (wbVar12 == null) {
            l.v("mBinding");
            wbVar12 = null;
        }
        wbVar12.B.clearCache(true);
        wb wbVar13 = this.H;
        if (wbVar13 == null) {
            l.v("mBinding");
            wbVar13 = null;
        }
        wbVar13.B.reload();
        wb wbVar14 = this.H;
        if (wbVar14 == null) {
            l.v("mBinding");
            wbVar14 = null;
        }
        wbVar14.B.requestFocus(130);
        Log.d("url_new", this.G.toString());
        CookieManager.getInstance().setAcceptCookie(true);
        wb wbVar15 = this.H;
        if (wbVar15 == null) {
            l.v("mBinding");
            wbVar15 = null;
        }
        wbVar15.B.loadUrl(this.G);
        wb wbVar16 = this.H;
        if (wbVar16 == null) {
            l.v("mBinding");
            wbVar16 = null;
        }
        wbVar16.B.addJavascriptInterface(new a(this), "HtmlViewer");
        wb wbVar17 = this.H;
        if (wbVar17 == null) {
            l.v("mBinding");
        } else {
            wbVar2 = wbVar17;
        }
        wbVar2.B.setWebViewClient(new b(this));
    }

    public final c l1() {
        c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
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
        textView.setOnClickListener(new ie.c(this));
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setOnClickListener(new ie.d(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h f10 = f.f(this, R.layout.mislinessfeepayment);
        l.e(f10, "setContentView(...)");
        this.H = (wb) f10;
        this.I = (q) new u0(this).a(q.class);
        r1(new c(this));
        wb wbVar = this.H;
        if (wbVar == null) {
            l.v("mBinding");
            wbVar = null;
        }
        wbVar.f29228x.f25961g.setText(l1().b("comp_FeePayment", getString(R.string.compoundFee)));
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
        wb wbVar = this.H;
        if (wbVar == null) {
            l.v("mBinding");
            wbVar = null;
        }
        if (wbVar.B.canGoBack()) {
            onBackPressed();
            return true;
        }
        s1();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        wb wbVar = this.H;
        wb wbVar2 = null;
        if (wbVar == null) {
            l.v("mBinding");
            wbVar = null;
        }
        wbVar.A.onPause();
        wb wbVar3 = this.H;
        if (wbVar3 == null) {
            l.v("mBinding");
        } else {
            wbVar2 = wbVar3;
        }
        wbVar2.A.pauseTimers();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        wb wbVar = this.H;
        wb wbVar2 = null;
        if (wbVar == null) {
            l.v("mBinding");
            wbVar = null;
        }
        wbVar.A.onResume();
        wb wbVar3 = this.H;
        if (wbVar3 == null) {
            l.v("mBinding");
        } else {
            wbVar2 = wbVar3;
        }
        wbVar2.A.resumeTimers();
    }

    public final void r1(c cVar) {
        l.f(cVar, "<set-?>");
        this.L = cVar;
    }
}
