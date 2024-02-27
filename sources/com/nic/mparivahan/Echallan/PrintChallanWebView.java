package com.nic.mparivahan.Echallan;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatImageView;
import cb.o0;
import cb.p0;
import cb.q0;
import cb.r0;
import cb.s0;
import cm.l;
import com.google.android.material.snackbar.Snackbar;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import ld.c;

public final class PrintChallanWebView extends d {
    private s0 G;
    /* access modifiers changed from: private */
    public boolean H;
    private boolean I;
    private String J = "";
    private WebView K;
    private LinearLayout L;
    private AppCompatImageView M;
    private String N = "";
    private String O = "";
    private RelativeLayout P;
    public c Q;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PrintChallanWebView f8806a;

        a(PrintChallanWebView printChallanWebView) {
            this.f8806a = printChallanWebView;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f8806a.H = true;
            this.f8806a.v1(false);
            PrintChallanWebView printChallanWebView = this.f8806a;
            l.c(webView);
            printChallanWebView.m1(webView);
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f8806a.v1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f8806a.H = false;
            this.f8806a.v1(false);
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

    /* access modifiers changed from: private */
    public final void m1(WebView webView) {
        Object systemService = getSystemService("print");
        l.d(systemService, "null cannot be cast to non-null type android.print.PrintManager");
        PrintDocumentAdapter createPrintDocumentAdapter = webView.createPrintDocumentAdapter(this.N);
        l.e(createPrintDocumentAdapter, "createPrintDocumentAdapter(...)");
        ((PrintManager) systemService).print(getString(R.string.app_name) + this.N, createPrintDocumentAdapter, new PrintAttributes.Builder().build());
    }

    private final void o1() {
        View findViewById = findViewById(R.id.paymentWv);
        l.e(findViewById, "findViewById(...)");
        this.K = (WebView) findViewById;
        View findViewById2 = findViewById(R.id.rootView);
        l.e(findViewById2, "findViewById(...)");
        this.L = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.mvvm_back);
        l.e(findViewById3, "findViewById(...)");
        this.M = (AppCompatImageView) findViewById3;
        View findViewById4 = findViewById(R.id.nexGenHolder);
        l.e(findViewById4, "findViewById(...)");
        this.P = (RelativeLayout) findViewById4;
        WebView webView = this.K;
        RelativeLayout relativeLayout = null;
        if (webView == null) {
            l.v("webView");
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        if (!r1()) {
            w1();
            return;
        }
        if (r1() && !this.H) {
            s1();
        }
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView == null) {
            l.v("backIv");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new p0(this));
        RelativeLayout relativeLayout2 = this.P;
        if (relativeLayout2 == null) {
            l.v("nexGenHolder");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new q0(this));
    }

    /* access modifiers changed from: private */
    public static final void p1(PrintChallanWebView printChallanWebView, View view) {
        l.f(printChallanWebView, "this$0");
        WebView webView = printChallanWebView.K;
        WebView webView2 = null;
        if (webView == null) {
            l.v("webView");
            webView = null;
        }
        if (!webView.canGoBack()) {
            printChallanWebView.y1();
        } else if (printChallanWebView.O.length() <= 0 || !p.o(printChallanWebView.O, "byPassPayment", true)) {
            WebView webView3 = printChallanWebView.K;
            if (webView3 == null) {
                l.v("webView");
            } else {
                webView2 = webView3;
            }
            webView2.goBack();
        } else {
            Intent intent = new Intent(printChallanWebView, PaymentSearchChallan.class);
            intent.setFlags(67108864);
            printChallanWebView.startActivity(intent);
            printChallanWebView.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(PrintChallanWebView printChallanWebView, View view) {
        l.f(printChallanWebView, "this$0");
        printChallanWebView.t1();
    }

    private final boolean r1() {
        String str;
        Object systemService = getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(0)) {
                str = "NetworkCapabilities.TRANSPORT_CELLULAR";
            } else if (networkCapabilities.hasTransport(1)) {
                str = "NetworkCapabilities.TRANSPORT_WIFI";
            } else if (networkCapabilities.hasTransport(3)) {
                str = "NetworkCapabilities.TRANSPORT_ETHERNET";
            }
            Log.i("Internet", str);
            return true;
        }
        return false;
    }

    private final void s1() {
        WebView webView = this.K;
        WebView webView2 = null;
        if (webView == null) {
            l.v("webView");
            webView = null;
        }
        webView.loadUrl(this.J);
        WebView webView3 = this.K;
        if (webView3 == null) {
            l.v("webView");
        } else {
            webView2 = webView3;
        }
        webView2.setWebViewClient(new a(this));
    }

    private final void t1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void v1(boolean z10) {
        if (z10) {
            try {
                this.G = new s0(this, R.string.blank, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        s0 s0Var = this.G;
        if (s0Var == null) {
            return;
        }
        if (z10) {
            s0Var.b();
        } else {
            s0Var.a();
        }
    }

    private final void w1() {
        LinearLayout linearLayout = this.L;
        if (linearLayout == null) {
            l.v("rootView");
            linearLayout = null;
        }
        String b10 = n1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try));
        l.c(b10);
        Snackbar l02 = Snackbar.l0(linearLayout, b10, -2);
        l.e(l02, "make(...)");
        l02.n0(getString(R.string.settings), new r0(this));
        l02.W();
    }

    /* access modifiers changed from: private */
    public static final void x1(PrintChallanWebView printChallanWebView, View view) {
        l.f(printChallanWebView, "this$0");
        printChallanWebView.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }

    private final void y1() {
        if (!this.I) {
            this.I = true;
            Toast.makeText(this, n1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
            Looper myLooper = Looper.myLooper();
            l.c(myLooper);
            new Handler(myLooper).postDelayed(new o0(this), 2000);
        } else if (this.O.length() <= 0 || !p.o(this.O, "byPassPayment", true)) {
            onBackPressed();
        } else {
            Intent intent = new Intent(this, PaymentSearchChallan.class);
            intent.setFlags(67108864);
            startActivity(intent);
            finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void z1(PrintChallanWebView printChallanWebView) {
        l.f(printChallanWebView, "this$0");
        printChallanWebView.I = false;
    }

    public final c n1() {
        c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.print_challan_web_view);
        u1(new c(this));
        String stringExtra = getIntent().getStringExtra("challanPdfUrl");
        l.c(stringExtra);
        this.J = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("challanNo");
        l.c(stringExtra2);
        this.N = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("fromActivity");
        l.c(stringExtra3);
        this.O = stringExtra3;
        o1();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        WebView webView = this.K;
        WebView webView2 = null;
        if (webView == null) {
            l.v("webView");
            webView = null;
        }
        if (!webView.canGoBack()) {
            y1();
        } else if (this.O.length() <= 0 || !p.o(this.O, "byPassPayment", true)) {
            WebView webView3 = this.K;
            if (webView3 == null) {
                l.v("webView");
            } else {
                webView2 = webView3;
            }
            webView2.goBack();
        } else {
            Intent intent = new Intent(this, PaymentSearchChallan.class);
            intent.setFlags(67108864);
            startActivity(intent);
            finish();
        }
        return true;
    }

    public final void u1(c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }
}
