package com.nic.mparivahan.Citizen.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
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
import d9.k0;
import d9.l0;
import d9.m0;
import ld.c;
import ni.ua;

public final class EvidenceVideoPlayActivity extends d {
    private ua G;
    private String H = "";
    private s0 I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    public c L;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EvidenceVideoPlayActivity f7777a;

        a(EvidenceVideoPlayActivity evidenceVideoPlayActivity) {
            this.f7777a = evidenceVideoPlayActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f7777a.J = true;
            this.f7777a.p1(false);
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f7777a.p1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f7777a.J = false;
            this.f7777a.p1(false);
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
        ua uaVar = this.G;
        ua uaVar2 = null;
        if (uaVar == null) {
            l.v("binding");
            uaVar = null;
        }
        uaVar.f28859b.f28305f.setOnClickListener(new k0(this));
        ua uaVar3 = this.G;
        if (uaVar3 == null) {
            l.v("binding");
            uaVar3 = null;
        }
        uaVar3.f28860c.setInitialScale(1);
        ua uaVar4 = this.G;
        if (uaVar4 == null) {
            l.v("binding");
            uaVar4 = null;
        }
        uaVar4.f28860c.getSettings().setJavaScriptEnabled(true);
        ua uaVar5 = this.G;
        if (uaVar5 == null) {
            l.v("binding");
            uaVar5 = null;
        }
        uaVar5.f28860c.getSettings().setDomStorageEnabled(true);
        ua uaVar6 = this.G;
        if (uaVar6 == null) {
            l.v("binding");
            uaVar6 = null;
        }
        uaVar6.f28860c.getSettings().setUseWideViewPort(true);
        ua uaVar7 = this.G;
        if (uaVar7 == null) {
            l.v("binding");
            uaVar7 = null;
        }
        uaVar7.f28860c.getSettings().setLoadWithOverviewMode(true);
        ua uaVar8 = this.G;
        if (uaVar8 == null) {
            l.v("binding");
            uaVar8 = null;
        }
        uaVar8.f28860c.getSettings().setBuiltInZoomControls(true);
        ua uaVar9 = this.G;
        if (uaVar9 == null) {
            l.v("binding");
            uaVar9 = null;
        }
        uaVar9.f28860c.setScrollBarStyle(33554432);
        ua uaVar10 = this.G;
        if (uaVar10 == null) {
            l.v("binding");
            uaVar10 = null;
        }
        uaVar10.f28860c.setScrollbarFadingEnabled(false);
        ua uaVar11 = this.G;
        if (uaVar11 == null) {
            l.v("binding");
            uaVar11 = null;
        }
        uaVar11.f28860c.clearCache(true);
        ua uaVar12 = this.G;
        if (uaVar12 == null) {
            l.v("binding");
            uaVar12 = null;
        }
        uaVar12.f28860c.reload();
        ua uaVar13 = this.G;
        if (uaVar13 == null) {
            l.v("binding");
            uaVar13 = null;
        }
        uaVar13.f28860c.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        ua uaVar14 = this.G;
        if (uaVar14 == null) {
            l.v("binding");
            uaVar14 = null;
        }
        uaVar14.f28860c.loadUrl(this.H);
        ua uaVar15 = this.G;
        if (uaVar15 == null) {
            l.v("binding");
            uaVar15 = null;
        }
        uaVar15.f28860c.setWebViewClient(new a(this));
        ua uaVar16 = this.G;
        if (uaVar16 == null) {
            l.v("binding");
        } else {
            uaVar2 = uaVar16;
        }
        uaVar2.f28859b.f28306g.setOnClickListener(new l0(this));
    }

    /* access modifiers changed from: private */
    public static final void m1(EvidenceVideoPlayActivity evidenceVideoPlayActivity, View view) {
        l.f(evidenceVideoPlayActivity, "this$0");
        ua uaVar = evidenceVideoPlayActivity.G;
        ua uaVar2 = null;
        if (uaVar == null) {
            l.v("binding");
            uaVar = null;
        }
        if (uaVar.f28860c.canGoBack()) {
            ua uaVar3 = evidenceVideoPlayActivity.G;
            if (uaVar3 == null) {
                l.v("binding");
            } else {
                uaVar2 = uaVar3;
            }
            uaVar2.f28860c.goBack();
            return;
        }
        evidenceVideoPlayActivity.r1();
    }

    /* access modifiers changed from: private */
    public static final void n1(EvidenceVideoPlayActivity evidenceVideoPlayActivity, View view) {
        l.f(evidenceVideoPlayActivity, "this$0");
        evidenceVideoPlayActivity.o1();
    }

    private final void o1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void p1(boolean z10) {
        if (z10) {
            try {
                this.I = new s0(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException unused) {
                return;
            }
        }
        s0 s0Var = this.I;
        if (s0Var == null) {
            return;
        }
        if (z10) {
            s0Var.b();
        } else {
            s0Var.a();
        }
    }

    private final void r1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new m0(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void s1(EvidenceVideoPlayActivity evidenceVideoPlayActivity) {
        l.f(evidenceVideoPlayActivity, "this$0");
        evidenceVideoPlayActivity.K = false;
    }

    public final c k1() {
        c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.evidence_video_play);
        ua c10 = ua.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        ua uaVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        String stringExtra = getIntent().getStringExtra("videoUrl");
        l.c(stringExtra);
        this.H = stringExtra;
        l1();
        q1(new c(this));
        ua uaVar2 = this.G;
        if (uaVar2 == null) {
            l.v("binding");
        } else {
            uaVar = uaVar2;
        }
        uaVar.f28859b.f28308i.setText(k1().b("report_accident", "Report Accident"));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        ua uaVar = this.G;
        if (uaVar == null) {
            l.v("binding");
            uaVar = null;
        }
        if (uaVar.f28860c.canGoBack()) {
            onBackPressed();
            return true;
        }
        r1();
        return true;
    }

    public final void q1(c cVar) {
        l.f(cVar, "<set-?>");
        this.L = cVar;
    }
}
