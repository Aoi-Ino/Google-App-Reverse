package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import gd.h0;
import gd.i0;
import gd.j0;
import ld.c;
import ni.r7;

public final class ReprintReceipt extends d {
    private String G;
    private String H;
    private WebView I;
    public c J;
    public r7 K;

    public static final class a extends WebChromeClient {
        a() {
        }

        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
        }

        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            super.onReceivedIcon(webView, bitmap);
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReprintReceipt f9581a;

        b(ReprintReceipt reprintReceipt) {
            this.f9581a = reprintReceipt;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str != null && q.F(str, "sarathiPGResponse", false, 2, (Object) null)) {
                this.f9581a.finish();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.e("url", String.valueOf(str));
            super.onPageStarted(webView, str, bitmap);
        }
    }

    /* access modifiers changed from: private */
    public static final void j1(String str, String str2, ReprintReceipt reprintReceipt, Dialog dialog, View view) {
        l.f(str, "$url");
        l.f(str2, "$userAgent");
        l.f(reprintReceipt, "this$0");
        l.f(dialog, "$screen16");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str2);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = reprintReceipt.getSystemService("download");
        l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PayReceipt");
        String str4 = reprintReceipt.G;
        if (str4 == null) {
            l.v("mApplNo");
            str4 = null;
        }
        sb2.append(str4);
        sb2.append(".pdf");
        request.setDestinationInExternalPublicDir(str3, sb2.toString());
        downloadManager.enqueue(request);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void k1(Dialog dialog, View view) {
        l.f(dialog, "$screen16");
        dialog.dismiss();
    }

    private final void l1(String str) {
        WebView webView = this.I;
        WebView webView2 = null;
        if (webView == null) {
            l.v("reprint_rec");
            webView = null;
        }
        webView.loadUrl(str);
        WebView webView3 = this.I;
        if (webView3 == null) {
            l.v("reprint_rec");
            webView3 = null;
        }
        webView3.getSettings().setJavaScriptEnabled(true);
        WebView webView4 = this.I;
        if (webView4 == null) {
            l.v("reprint_rec");
            webView4 = null;
        }
        webView4.setDownloadListener(new h0(this));
        WebView webView5 = this.I;
        if (webView5 == null) {
            l.v("reprint_rec");
            webView5 = null;
        }
        webView5.setWebChromeClient(new a());
        WebView webView6 = this.I;
        if (webView6 == null) {
            l.v("reprint_rec");
        } else {
            webView2 = webView6;
        }
        webView2.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void m1(ReprintReceipt reprintReceipt, String str, String str2, String str3, String str4, long j10) {
        l.f(reprintReceipt, "this$0");
        if (reprintReceipt.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            l.c(str);
            l.c(str2);
            l.c(str3);
            l.c(str4);
            reprintReceipt.i1(str, str2, str3, str4);
            return;
        }
        androidx.core.app.b.s(reprintReceipt, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    public final void i1(String str, String str2, String str3, String str4) {
        l.f(str, "oldUrl");
        l.f(str2, "userAgent");
        l.f(str3, "contentDisposition");
        l.f(str4, "mimetype");
        Log.e("url", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?applno=");
        String str5 = this.G;
        if (str5 == null) {
            l.v("mApplNo");
            str5 = null;
        }
        sb2.append(str5);
        sb2.append("&vsno=1");
        String sb3 = sb2.toString();
        Log.e("urlnew", sb3);
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.screen_16);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.title_popup);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText("NextGen mParivahan");
        ((TextView) findViewById2).setText("Do you want to save Payment Receipt ?");
        ((TextView) findViewById3).setOnClickListener(new i0(sb3, str2, this, dialog));
        ((TextView) findViewById4).setOnClickListener(new j0(dialog));
        dialog.show();
    }

    public final c n1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final r7 o1() {
        r7 r7Var = this.K;
        if (r7Var != null) {
            return r7Var;
        }
        l.v("mBinding");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_reprint);
        r7 x10 = r7.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        q1(x10);
        setContentView(o1().m());
        p1(new c(this));
        o1().f28387x.f25961g.setText(n1().b("btn_challan_print_receipt", "Print Receipt"));
        View findViewById = findViewById(R.id.reprint_rec);
        l.e(findViewById, "findViewById(...)");
        this.I = (WebView) findViewById;
        if (getIntent() != null) {
            this.G = String.valueOf(getIntent().getStringExtra("app_no"));
            this.H = String.valueOf(getIntent().getStringExtra("app_dob"));
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hc.a.f12073a.x());
            sb2.append("PrintConformMob.jsp?applno=");
            String str = this.G;
            String str2 = null;
            if (str == null) {
                l.v("mApplNo");
                str = null;
            }
            sb2.append(str);
            sb2.append("&dob=");
            String str3 = this.H;
            if (str3 == null) {
                l.v("mApplDob");
            } else {
                str2 = str3;
            }
            sb2.append(str2);
            l1(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public final void p1(c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void q1(r7 r7Var) {
        l.f(r7Var, "<set-?>");
        this.K = r7Var;
    }
}
