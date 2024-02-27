package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import ni.be;
import wd.g1;
import wd.h1;
import wd.i1;

public final class ViewFormsActivity extends d {
    private be G;
    private String H = "";
    private final int I = 10211;
    private boolean J;
    private String K = "";
    private String L = "";
    public ProgressDialog M;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        private boolean f21587a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewFormsActivity f21588b;

        a(ViewFormsActivity viewFormsActivity) {
            this.f21588b = viewFormsActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            if (this.f21587a) {
                this.f21588b.l1().dismiss();
                try {
                    this.f21588b.k1();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f21587a = true;
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            if (this.f21588b.l1().isShowing()) {
                this.f21588b.l1().dismiss();
            }
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

    private final void j1() {
        if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.I);
        } else {
            p1();
        }
    }

    /* access modifiers changed from: private */
    public final void k1() {
        try {
            Object systemService = getSystemService("download");
            l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.H));
            request.setNotificationVisibility(1);
            request.setDestinationInExternalFilesDir(getApplicationContext(), Environment.DIRECTORY_DOWNLOADS, "");
            request.setTitle(this.L + this.K);
            ((DownloadManager) systemService).enqueue(request);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void m1() {
        be beVar = this.G;
        be beVar2 = null;
        if (beVar == null) {
            l.v("binding");
            beVar = null;
        }
        beVar.f25576b.f28305f.setOnClickListener(new h1(this));
        be beVar3 = this.G;
        if (beVar3 == null) {
            l.v("binding");
            beVar3 = null;
        }
        beVar3.f25576b.f28306g.setOnClickListener(new i1(this));
        be beVar4 = this.G;
        if (beVar4 == null) {
            l.v("binding");
        } else {
            beVar2 = beVar4;
        }
        beVar2.f25577c.getSettings().setJavaScriptEnabled(true);
    }

    /* access modifiers changed from: private */
    public static final void n1(ViewFormsActivity viewFormsActivity, View view) {
        l.f(viewFormsActivity, "this$0");
        be beVar = viewFormsActivity.G;
        be beVar2 = null;
        if (beVar == null) {
            l.v("binding");
            beVar = null;
        }
        if (beVar.f25577c.canGoBack()) {
            be beVar3 = viewFormsActivity.G;
            if (beVar3 == null) {
                l.v("binding");
            } else {
                beVar2 = beVar3;
            }
            beVar2.f25577c.goBack();
            return;
        }
        viewFormsActivity.t1();
    }

    /* access modifiers changed from: private */
    public static final void o1(ViewFormsActivity viewFormsActivity, View view) {
        l.f(viewFormsActivity, "this$0");
        viewFormsActivity.q1();
    }

    private final void p1() {
        try {
            l1().show();
            String str = "https://drive.google.com/viewerng/viewer?embedded=true&url=" + this.H;
            be beVar = this.G;
            be beVar2 = null;
            if (beVar == null) {
                l.v("binding");
                beVar = null;
            }
            WebView webView = beVar.f25577c;
            l.e(webView, "paymentWv");
            s1(webView);
            be beVar3 = this.G;
            if (beVar3 == null) {
                l.v("binding");
                beVar3 = null;
            }
            beVar3.f25577c.loadUrl(str);
            Log.e("Form URL ->", str);
            be beVar4 = this.G;
            if (beVar4 == null) {
                l.v("binding");
            } else {
                beVar2 = beVar4;
            }
            beVar2.f25577c.setWebViewClient(new a(this));
        } catch (Exception e10) {
            e10.printStackTrace();
            if (l1().isShowing()) {
                l1().dismiss();
            }
        }
    }

    private final void q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void s1(WebView webView) {
        try {
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setSupportZoom(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setMixedContentMode(0);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setAllowContentAccess(true);
            CookieManager instance = CookieManager.getInstance();
            l.e(instance, "getInstance(...)");
            instance.setAcceptThirdPartyCookies(webView, true);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void t1() {
        if (this.J) {
            finish();
            return;
        }
        this.J = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new g1(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void u1(ViewFormsActivity viewFormsActivity) {
        l.f(viewFormsActivity, "this$0");
        viewFormsActivity.J = false;
    }

    public final ProgressDialog l1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.view_forms);
        be b10 = be.b(getLayoutInflater());
        l.e(b10, "inflate(...)");
        this.G = b10;
        if (b10 == null) {
            l.v("binding");
            b10 = null;
        }
        setContentView((View) b10.f25578d);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("url");
            l.c(stringExtra);
            this.H = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("formType");
            l.c(stringExtra2);
            this.K = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("applNo");
            l.c(stringExtra3);
            this.L = stringExtra3;
        }
        r1(new ProgressDialog(this));
        l1().setMessage("Please wait...");
        l1().setCancelable(false);
        l1().setCanceledOnTouchOutside(false);
        j1();
        m1();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        be beVar = this.G;
        be beVar2 = null;
        if (beVar == null) {
            l.v("binding");
            beVar = null;
        }
        if (beVar.f25577c.canGoBack()) {
            be beVar3 = this.G;
            if (beVar3 == null) {
                l.v("binding");
            } else {
                beVar2 = beVar3;
            }
            beVar2.f25577c.goBack();
            return true;
        }
        t1();
        return true;
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.I) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
            } else {
                p1();
            }
        }
    }

    public final void r1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }
}
