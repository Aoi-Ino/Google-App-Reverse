package com.nic.mparivahan.dlservices.newlearner;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.app.d;
import bj.a3;
import bj.b3;
import bj.c3;
import cm.l;
import com.nic.mparivahan.R;
import ld.f;
import ni.ub;

public final class LearnerLicenseTestActivity extends d {
    /* access modifiers changed from: private */
    public ub G;
    public f H;
    /* access modifiers changed from: private */
    public boolean I;
    public PermissionRequest J;
    private final int K = 7090;
    private String L = "";

    public static final class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTestActivity f21807a;

        a(LearnerLicenseTestActivity learnerLicenseTestActivity) {
            this.f21807a = learnerLicenseTestActivity;
        }

        /* access modifiers changed from: private */
        public static final void c(LearnerLicenseTestActivity learnerLicenseTestActivity, DialogInterface dialogInterface, int i10) {
            l.f(learnerLicenseTestActivity, "this$0");
            dialogInterface.dismiss();
            learnerLicenseTestActivity.j1().grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        }

        /* access modifiers changed from: private */
        public static final void d(LearnerLicenseTestActivity learnerLicenseTestActivity, DialogInterface dialogInterface, int i10) {
            l.f(learnerLicenseTestActivity, "this$0");
            l.c(dialogInterface);
            dialogInterface.dismiss();
            learnerLicenseTestActivity.j1().deny();
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            l.f(permissionRequest, "request");
            this.f21807a.n1(permissionRequest);
            String[] resources = permissionRequest.getResources();
            l.c(resources);
            for (String equals : resources) {
                if (equals.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    c.a aVar = new c.a(this.f21807a);
                    aVar.o("Allow camera permission");
                    aVar.l("Allow", new b3(this.f21807a));
                    aVar.h("Deny", new c3(this.f21807a));
                    c a10 = aVar.a();
                    l.e(a10, "create(...)");
                    a10.show();
                    a10.i(-1).setTextColor(androidx.core.content.a.c(this.f21807a, R.color.blue_color));
                    a10.i(-2).setTextColor(androidx.core.content.a.c(this.f21807a, R.color.red_new));
                }
            }
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTestActivity f21808a;

        b(LearnerLicenseTestActivity learnerLicenseTestActivity) {
            this.f21808a = learnerLicenseTestActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f21808a.I = true;
            ub g12 = this.f21808a.G;
            ub ubVar = null;
            if (g12 == null) {
                l.v("binding");
                g12 = null;
            }
            g12.B.p();
            ub g13 = this.f21808a.G;
            if (g13 == null) {
                l.v("binding");
                g13 = null;
            }
            g13.B.setVisibility(8);
            ub g14 = this.f21808a.G;
            if (g14 == null) {
                l.v("binding");
                g14 = null;
            }
            g14.A.setVisibility(0);
            ub g15 = this.f21808a.G;
            if (g15 == null) {
                l.v("binding");
                g15 = null;
            }
            g15.A.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            ub g16 = this.f21808a.G;
            if (g16 == null) {
                l.v("binding");
            } else {
                ubVar = g16;
            }
            ubVar.A.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ub g12 = this.f21808a.G;
            if (g12 == null) {
                l.v("binding");
                g12 = null;
            }
            g12.B.o();
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f21808a.I = false;
            Log.e("dl-js", ("Got Error! " + webResourceError).toString());
            Toast.makeText(this.f21808a, "Service is temporary unavailable. Try After some time", 1).show();
            ub g12 = this.f21808a.G;
            ub ubVar = null;
            if (g12 == null) {
                l.v("binding");
                g12 = null;
            }
            g12.B.p();
            ub g13 = this.f21808a.G;
            if (g13 == null) {
                l.v("binding");
            } else {
                ubVar = g13;
            }
            ubVar.B.setVisibility(8);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            l.f(sslErrorHandler, "handler");
            l.f(sslError, "error");
            sslErrorHandler.proceed();
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

    private final void i1() {
        if (checkSelfPermission("android.permission.CAMERA") == -1) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, this.K);
            return;
        }
        ub ubVar = this.G;
        if (ubVar == null) {
            l.v("binding");
            ubVar = null;
        }
        ubVar.A.loadUrl(this.L);
    }

    private final void l1() {
        o1(new f(this));
        ub ubVar = this.G;
        ub ubVar2 = null;
        if (ubVar == null) {
            l.v("binding");
            ubVar = null;
        }
        ubVar.f28862x.f25961g.setText(k1().i());
        ub ubVar3 = this.G;
        if (ubVar3 == null) {
            l.v("binding");
            ubVar3 = null;
        }
        ubVar3.f28862x.f25959e.setOnClickListener(new a3(this));
        ub ubVar4 = this.G;
        if (ubVar4 == null) {
            l.v("binding");
            ubVar4 = null;
        }
        ubVar4.A.getSettings().setAllowFileAccess(true);
        ub ubVar5 = this.G;
        if (ubVar5 == null) {
            l.v("binding");
            ubVar5 = null;
        }
        ubVar5.A.getSettings().setAllowContentAccess(true);
        ub ubVar6 = this.G;
        if (ubVar6 == null) {
            l.v("binding");
            ubVar6 = null;
        }
        ubVar6.A.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        ub ubVar7 = this.G;
        if (ubVar7 == null) {
            l.v("binding");
            ubVar7 = null;
        }
        ubVar7.A.getSettings().setSupportMultipleWindows(true);
        ub ubVar8 = this.G;
        if (ubVar8 == null) {
            l.v("binding");
            ubVar8 = null;
        }
        ubVar8.A.getSettings().setJavaScriptEnabled(true);
        ub ubVar9 = this.G;
        if (ubVar9 == null) {
            l.v("binding");
            ubVar9 = null;
        }
        ubVar9.A.getSettings().setDomStorageEnabled(true);
        ub ubVar10 = this.G;
        if (ubVar10 == null) {
            l.v("binding");
            ubVar10 = null;
        }
        ubVar10.A.getSettings().setUseWideViewPort(true);
        ub ubVar11 = this.G;
        if (ubVar11 == null) {
            l.v("binding");
            ubVar11 = null;
        }
        ubVar11.A.getSettings().setLoadWithOverviewMode(true);
        ub ubVar12 = this.G;
        if (ubVar12 == null) {
            l.v("binding");
            ubVar12 = null;
        }
        ubVar12.A.getSettings().setBuiltInZoomControls(true);
        ub ubVar13 = this.G;
        if (ubVar13 == null) {
            l.v("binding");
            ubVar13 = null;
        }
        ubVar13.A.clearCache(true);
        ub ubVar14 = this.G;
        if (ubVar14 == null) {
            l.v("binding");
            ubVar14 = null;
        }
        ubVar14.A.reload();
        ub ubVar15 = this.G;
        if (ubVar15 == null) {
            l.v("binding");
            ubVar15 = null;
        }
        ubVar15.A.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        i1();
        ub ubVar16 = this.G;
        if (ubVar16 == null) {
            l.v("binding");
            ubVar16 = null;
        }
        ubVar16.A.setWebChromeClient(new a(this));
        ub ubVar17 = this.G;
        if (ubVar17 == null) {
            l.v("binding");
        } else {
            ubVar2 = ubVar17;
        }
        ubVar2.A.setWebViewClient(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void m1(LearnerLicenseTestActivity learnerLicenseTestActivity, View view) {
        l.f(learnerLicenseTestActivity, "this$0");
        learnerLicenseTestActivity.onBackPressed();
    }

    public final PermissionRequest j1() {
        PermissionRequest permissionRequest = this.J;
        if (permissionRequest != null) {
            return permissionRequest;
        }
        l.v("permissionRequest");
        return null;
    }

    public final f k1() {
        f fVar = this.H;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void n1(PermissionRequest permissionRequest) {
        l.f(permissionRequest, "<set-?>");
        this.J = permissionRequest;
    }

    public final void o1(f fVar) {
        l.f(fVar, "<set-?>");
        this.H = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ub x10 = ub.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        this.L = "https://164.100.69.249:8443/sarathiservicemob/authenticationaction.do?authtype=Anumathi";
        l1();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.K) {
            if (!(!(iArr.length == 0)) || iArr[0] == 0) {
                ub ubVar = this.G;
                if (ubVar == null) {
                    l.v("binding");
                    ubVar = null;
                }
                ubVar.A.loadUrl(this.L);
                return;
            }
            Toast.makeText(this, "Please grant permission to proceed", 0).show();
            i1();
        }
    }
}
