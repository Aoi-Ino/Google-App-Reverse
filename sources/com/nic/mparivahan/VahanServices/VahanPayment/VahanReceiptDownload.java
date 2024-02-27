package com.nic.mparivahan.VahanServices.VahanPayment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cb.s0;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ni.cd;
import vg.p;
import vg.q;
import vg.r;
import vg.s;

public final class VahanReceiptDownload extends d {
    private final int G = 10210;
    public cd H;
    private String I = "";
    private String J = "";
    private s0 K;
    /* access modifiers changed from: private */
    public boolean L;
    private boolean M;
    private String N = "";
    private final ExecutorService O = Executors.newSingleThreadExecutor();
    private final Handler P = new Handler(Looper.getMainLooper());

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanReceiptDownload f21180a;

        a(VahanReceiptDownload vahanReceiptDownload) {
            this.f21180a = vahanReceiptDownload;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f21180a.L = true;
            this.f21180a.u1(false);
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f21180a.u1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f21180a.L = false;
            Toast.makeText(this.f21180a, "Got Error! " + webResourceError, 0).show();
            this.f21180a.u1(false);
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

    private final void l1() {
        if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this.G);
        } else {
            r1();
        }
    }

    private final void n1() {
        m1().f25784b.f28305f.setOnClickListener(new q(this));
        m1().f25784b.f28306g.setOnClickListener(new r(this));
        m1().f25787e.getSettings().setJavaScriptEnabled(true);
        Log.v("Url", this.I);
        m1().f25785c.setOnClickListener(new s());
    }

    /* access modifiers changed from: private */
    public static final void o1(VahanReceiptDownload vahanReceiptDownload, View view) {
        l.f(vahanReceiptDownload, "this$0");
        if (vahanReceiptDownload.m1().f25787e.canGoBack()) {
            vahanReceiptDownload.m1().f25787e.goBack();
        } else {
            vahanReceiptDownload.v1();
        }
    }

    /* access modifiers changed from: private */
    public static final void p1(VahanReceiptDownload vahanReceiptDownload, View view) {
        l.f(vahanReceiptDownload, "this$0");
        vahanReceiptDownload.s1();
    }

    /* access modifiers changed from: private */
    public static final void q1(View view) {
    }

    private final void r1() {
        m1().f25787e.loadUrl(this.I);
        m1().f25787e.setWebViewClient(new a(this));
    }

    private final void s1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void u1(boolean z10) {
        if (z10) {
            try {
                this.K = new s0(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException unused) {
                return;
            }
        }
        s0 s0Var = this.K;
        if (s0Var == null) {
            return;
        }
        if (z10) {
            s0Var.b();
        } else {
            s0Var.a();
        }
    }

    private final void v1() {
        if (this.M) {
            onBackPressed();
            return;
        }
        this.M = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new p(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanReceiptDownload vahanReceiptDownload) {
        l.f(vahanReceiptDownload, "this$0");
        vahanReceiptDownload.M = false;
    }

    public final cd m1() {
        cd cdVar = this.H;
        if (cdVar != null) {
            return cdVar;
        }
        l.v("binding");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.slot_receipt_activity);
        cd c10 = cd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        t1(c10);
        setContentView((View) m1().b());
        if (getIntent() != null) {
            if (getIntent().hasExtra("vahanReceiptUrl")) {
                String stringExtra = getIntent().getStringExtra("vahanReceiptUrl");
                l.c(stringExtra);
                this.I = stringExtra;
            }
            if (getIntent().hasExtra("apptId")) {
                String stringExtra2 = getIntent().getStringExtra("apptId");
                l.c(stringExtra2);
                this.N = stringExtra2;
            }
        }
        this.J = this.I;
        this.I = "https://docs.google.com/gview?embedded=true&url=" + q.B0(this.I).toString();
        l1();
        n1();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (m1().f25787e.canGoBack()) {
            m1().f25787e.goBack();
            return true;
        }
        v1();
        return true;
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.G) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
            } else {
                r1();
            }
        }
    }

    public final void t1(cd cdVar) {
        l.f(cdVar, "<set-?>");
        this.H = cdVar;
    }
}
