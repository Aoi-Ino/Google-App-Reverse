package com.nic.mparivahan.dlservices.ui.payment;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import cm.l;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import fj.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ni.x2;
import pl.x;
import zj.i;
import zj.j;
import zj.k;
import zj.n;

public final class DLRenewalFeePaymentActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public x2 G;
    /* access modifiers changed from: private */
    public String H;
    /* access modifiers changed from: private */
    public String I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    /* access modifiers changed from: private */
    public q L;
    public DldetobjX M;
    private String N = "";
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    public ld.g U;
    public ArrayList V;
    public ArrayList W;
    public ld.f X;
    public ld.c Y;
    /* access modifiers changed from: private */
    public String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private final BroadcastReceiver f22245a0 = new e(this);

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f22246a;

        public a(Context context) {
            l.f(context, "context");
            this.f22246a = context;
        }

        private final void a(String str, String str2) {
            Log.d("sender", "Broadcasting message");
            Intent intent = new Intent("success-payment-event");
            intent.putExtra("applNum", str);
            intent.putExtra("respCode", str2);
            s0.a.b(this.f22246a).d(intent);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[Catch:{ Exception -> 0x0018 }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void showHTML(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "receipt_no"
                java.lang.String r1 = "applNum"
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0018 }
                r2.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x0018 }
                boolean r5 = r2.has(r1)     // Catch:{ Exception -> 0x0018 }
                java.lang.String r3 = "respCode"
                if (r5 != 0) goto L_0x001a
                boolean r5 = r2.has(r3)     // Catch:{ Exception -> 0x0018 }
                if (r5 == 0) goto L_0x002b
                goto L_0x001a
            L_0x0018:
                r5 = move-exception
                goto L_0x0035
            L_0x001a:
                java.lang.String r5 = r2.getString(r1)     // Catch:{ Exception -> 0x0018 }
                java.lang.String r1 = r2.getString(r3)     // Catch:{ Exception -> 0x0018 }
                cm.l.c(r5)     // Catch:{ Exception -> 0x0018 }
                cm.l.c(r1)     // Catch:{ Exception -> 0x0018 }
                r4.a(r5, r1)     // Catch:{ Exception -> 0x0018 }
            L_0x002b:
                boolean r5 = r2.has(r0)     // Catch:{ Exception -> 0x0018 }
                if (r5 == 0) goto L_0x0038
                r2.getString(r0)     // Catch:{ Exception -> 0x0018 }
                goto L_0x0038
            L_0x0035:
                r5.printStackTrace()
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity.a.showHTML(java.lang.String):void");
        }
    }

    public static final class b extends WebChromeClient {
        b() {
        }

        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
        }

        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            super.onReceivedIcon(webView, bitmap);
        }
    }

    public static final class c extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DLRenewalFeePaymentActivity f22247a;

        c(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
            this.f22247a = dLRenewalFeePaymentActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Log.e("url", String.valueOf(str));
            if (str != null) {
                String str2 = null;
                if (q.F(str, "callback/sarathiPGResponse", false, 2, (Object) null)) {
                    q y12 = this.f22247a.L;
                    if (y12 == null) {
                        l.v("viewModel");
                        y12 = null;
                    }
                    String u12 = this.f22247a.Z;
                    String v12 = this.f22247a.I;
                    if (v12 == null) {
                        l.v("mApplDob");
                    } else {
                        str2 = v12;
                    }
                    y12.h(u12, str2);
                }
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.e("url", String.valueOf(str));
            super.onPageStarted(webView, str, bitmap);
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLRenewalFeePaymentActivity f22248e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
            super(1);
            this.f22248e = dLRenewalFeePaymentActivity;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f22248e.f2(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    public static final class e extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DLRenewalFeePaymentActivity f22249a;

        e(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
            this.f22249a = dLRenewalFeePaymentActivity;
        }

        public void onReceive(Context context, Intent intent) {
            x2 x2Var = null;
            this.f22249a.Z = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (this.f22249a.Z.length() > 0 && stringExtra != null && stringExtra.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(hc.a.f12073a.x());
                sb2.append("PrintConformMob.jsp?applno=");
                String w12 = this.f22249a.H;
                if (w12 == null) {
                    l.v("mApplNo");
                    w12 = null;
                }
                sb2.append(w12);
                sb2.append("&dob=");
                String v12 = this.f22249a.I;
                if (v12 == null) {
                    l.v("mApplDob");
                    v12 = null;
                }
                sb2.append(v12);
                String sb3 = sb2.toString();
                Log.d("newReceiptUrl", sb3.toString());
                x2 x12 = this.f22249a.G;
                if (x12 == null) {
                    l.v("mBinding");
                } else {
                    x2Var = x12;
                }
                x2Var.D.setVisibility(8);
                this.f22249a.F1(sb3);
            }
            Log.d("receiver", "Got message: " + stringExtra);
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f22250a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f22250a = lVar;
        }

        public final pl.c a() {
            return this.f22250a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22250a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final class g extends WebChromeClient {
        g() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Log.e("dl-js1", String.valueOf(jsResult));
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public static final class h extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DLRenewalFeePaymentActivity f22251a;

        h(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
            this.f22251a = dLRenewalFeePaymentActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f22251a.J = true;
            x2 x12 = this.f22251a.G;
            x2 x2Var = null;
            if (x12 == null) {
                l.v("mBinding");
                x12 = null;
            }
            x12.E.p();
            x2 x13 = this.f22251a.G;
            if (x13 == null) {
                l.v("mBinding");
                x13 = null;
            }
            x13.E.setVisibility(8);
            x2 x14 = this.f22251a.G;
            if (x14 == null) {
                l.v("mBinding");
                x14 = null;
            }
            x14.D.setVisibility(0);
            x2 x15 = this.f22251a.G;
            if (x15 == null) {
                l.v("mBinding");
                x15 = null;
            }
            x15.D.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            x2 x16 = this.f22251a.G;
            if (x16 == null) {
                l.v("mBinding");
            } else {
                x2Var = x16;
            }
            x2Var.D.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            x2 x12 = this.f22251a.G;
            if (x12 == null) {
                l.v("mBinding");
                x12 = null;
            }
            x12.E.o();
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f22251a.J = false;
            Log.e("dl-js", ("Got Error! " + webResourceError).toString());
            x2 x12 = this.f22251a.G;
            x2 x2Var = null;
            if (x12 == null) {
                l.v("mBinding");
                x12 = null;
            }
            x12.E.p();
            x2 x13 = this.f22251a.G;
            if (x13 == null) {
                l.v("mBinding");
            } else {
                x2Var = x13;
            }
            x2Var.E.setVisibility(8);
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

    /* access modifiers changed from: private */
    public static final void D1(String str, String str2, DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, Dialog dialog, View view) {
        l.f(str, "$url");
        l.f(str2, "$userAgent");
        l.f(dLRenewalFeePaymentActivity, "this$0");
        l.f(dialog, "$screen16");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str2);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = dLRenewalFeePaymentActivity.getSystemService("download");
        l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PayReceipt");
        String str4 = dLRenewalFeePaymentActivity.H;
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
    public static final void E1(Dialog dialog, View view) {
        l.f(dialog, "$screen16");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void F1(String str) {
        x2 x2Var = this.G;
        x2 x2Var2 = null;
        if (x2Var == null) {
            l.v("mBinding");
            x2Var = null;
        }
        x2Var.C.setVisibility(0);
        x2 x2Var3 = this.G;
        if (x2Var3 == null) {
            l.v("mBinding");
            x2Var3 = null;
        }
        x2Var3.C.loadUrl(str);
        x2 x2Var4 = this.G;
        if (x2Var4 == null) {
            l.v("mBinding");
            x2Var4 = null;
        }
        x2Var4.C.getSettings().setJavaScriptEnabled(true);
        x2 x2Var5 = this.G;
        if (x2Var5 == null) {
            l.v("mBinding");
            x2Var5 = null;
        }
        x2Var5.C.setDownloadListener(new i(this));
        x2 x2Var6 = this.G;
        if (x2Var6 == null) {
            l.v("mBinding");
            x2Var6 = null;
        }
        x2Var6.C.setWebChromeClient(new b());
        x2 x2Var7 = this.G;
        if (x2Var7 == null) {
            l.v("mBinding");
        } else {
            x2Var2 = x2Var7;
        }
        x2Var2.C.setWebViewClient(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void G1(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, String str, String str2, String str3, String str4, long j10) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        if (dLRenewalFeePaymentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            l.c(str);
            l.c(str2);
            l.c(str3);
            l.c(str4);
            dLRenewalFeePaymentActivity.C1(str, str2, str3, str4);
            return;
        }
        androidx.core.app.b.s(dLRenewalFeePaymentActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    /* access modifiers changed from: private */
    public static final void O1(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, View view) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        dLRenewalFeePaymentActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void P1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void Q1() {
        q qVar = this.L;
        if (qVar == null) {
            l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new f(new d(this)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [ni.x2] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void R1() {
        /*
            r8 = this;
            s0.a r0 = s0.a.b(r8)
            android.content.BroadcastReceiver r1 = r8.f22245a0
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "success-payment-event"
            r2.<init>(r3)
            r0.c(r1, r2)
            ni.x2 r0 = r8.G
            java.lang.String r1 = "mBinding"
            r2 = 0
            if (r0 != 0) goto L_0x001b
            cm.l.v(r1)
            r0 = r2
        L_0x001b:
            ni.dc r0 = r0.f29288x
            android.widget.ImageView r0 = r0.f25959e
            zj.b r3 = new zj.b
            r3.<init>(r8)
            r0.setOnClickListener(r3)
            ld.f r0 = new ld.f
            r0.<init>(r8)
            android.content.Intent r3 = r8.getIntent()
            if (r3 == 0) goto L_0x016e
            android.content.Intent r3 = r8.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            if (r3 == 0) goto L_0x0043
            java.lang.String r4 = "dl_st_appl_ackno_no"
            java.lang.Object r3 = r3.get(r4)
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.H = r3
            android.content.Intent r3 = r8.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            if (r3 == 0) goto L_0x005b
            java.lang.String r4 = "dl_st_appl_ackno_no_dob"
            java.lang.Object r3 = r3.get(r4)
            goto L_0x005c
        L_0x005b:
            r3 = r2
        L_0x005c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.I = r3
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r4 = "DL"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.N = r3
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r4 = "dob"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.O = r3
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r4 = "Mobile_no"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.P = r3
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r4 = "DLDetails"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.lang.String r5 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r3, r5)
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3
            r8.b2(r3)
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r6 = "lastEndorsedRTO"
            java.lang.String r3 = r3.getStringExtra(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            cm.l.d(r3, r6)
            r8.Q = r3
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r7 = "lastEndorsedState"
            java.lang.String r3 = r3.getStringExtra(r7)
            cm.l.d(r3, r6)
            r8.R = r3
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r7 = "lastEndorseStateCode"
            java.lang.String r3 = r3.getStringExtra(r7)
            cm.l.d(r3, r6)
            r8.S = r3
            android.content.Intent r3 = r8.getIntent()
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            cm.l.d(r3, r5)
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3
            r8.b2(r3)
            android.content.Intent r3 = r8.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            if (r3 == 0) goto L_0x00f6
            java.lang.String r4 = "dl_st_dl_details_obj"
            java.io.Serializable r3 = r3.getSerializable(r4)
            goto L_0x00f7
        L_0x00f6:
            r3 = r2
        L_0x00f7:
            cm.l.d(r3, r5)
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3
            r8.b2(r3)
            ni.x2 r3 = r8.G
            if (r3 != 0) goto L_0x0107
            cm.l.v(r1)
            r3 = r2
        L_0x0107:
            ni.dc r3 = r3.f29288x
            android.widget.TextView r3 = r3.f25961g
            java.lang.String r0 = r0.i()
            r3.setText(r0)
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r8.H1()
            com.nic.mparivahan.Dl.Model.BioImgObjX r0 = r0.getBioImgObj()
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = r0.getBiPhoto()
            goto L_0x0122
        L_0x0121:
            r0 = r2
        L_0x0122:
            if (r0 == 0) goto L_0x015d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x012b
            goto L_0x015d
        L_0x012b:
            ni.x2 r0 = r8.G
            if (r0 != 0) goto L_0x0133
            cm.l.v(r1)
            r0 = r2
        L_0x0133:
            ni.dc r0 = r0.f29288x
            androidx.cardview.widget.CardView r0 = r0.f25960f
            r3 = 0
            r0.setVisibility(r3)
            ni.x2 r0 = r8.G
            if (r0 != 0) goto L_0x0143
            cm.l.v(r1)
            r0 = r2
        L_0x0143:
            ni.dc r0 = r0.f29288x
            android.widget.ImageView r0 = r0.f25956b
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r8.H1()
            com.nic.mparivahan.Dl.Model.BioImgObjX r1 = r1.getBioImgObj()
            if (r1 == 0) goto L_0x0155
            java.lang.String r2 = r1.getBiPhoto()
        L_0x0155:
            android.graphics.Bitmap r1 = com.nic.mparivahan.dlservices.utilities.d.a(r2)
            r0.setImageBitmap(r1)
            goto L_0x016e
        L_0x015d:
            ni.x2 r0 = r8.G
            if (r0 != 0) goto L_0x0165
            cm.l.v(r1)
            goto L_0x0166
        L_0x0165:
            r2 = r0
        L_0x0166:
            ni.dc r0 = r2.f29288x
            androidx.cardview.widget.CardView r0 = r0.f25960f
            r1 = 4
            r0.setVisibility(r1)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity.R1():void");
    }

    /* access modifiers changed from: private */
    public static final void S1(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, View view) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        dLRenewalFeePaymentActivity.N1("Are you sure want to go back?");
    }

    /* access modifiers changed from: private */
    public static final void U1(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, View view) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        dLRenewalFeePaymentActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void V1(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, View view) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        try {
            Intent intent = new Intent(dLRenewalFeePaymentActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dLRenewalFeePaymentActivity.N);
            intent.putExtra("dob", dLRenewalFeePaymentActivity.O);
            intent.putExtra("DLDetails", dLRenewalFeePaymentActivity.H1());
            intent.putExtra("Mobile_no", dLRenewalFeePaymentActivity.P);
            intent.putExtra("lastEndorsedRTO", dLRenewalFeePaymentActivity.Q);
            intent.putExtra("lastEndorsedState", dLRenewalFeePaymentActivity.R);
            intent.putExtra("lastEndorsedRTOCode", dLRenewalFeePaymentActivity.T);
            intent.putExtra("lastEndorseStateCode", dLRenewalFeePaymentActivity.S);
            if (l.a(dLRenewalFeePaymentActivity.M1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", dLRenewalFeePaymentActivity.L1());
            }
            dLRenewalFeePaymentActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, View view) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        try {
            if (l.a(dLRenewalFeePaymentActivity.M1().b(), VContant.MULTISERVICE_PURPOSE_CODE) && dLRenewalFeePaymentActivity.J1().size() > 1) {
                Dialog dialog = new Dialog(dLRenewalFeePaymentActivity);
                dialog.setContentView(R.layout.layout_multi);
                Window window = dialog.getWindow();
                l.c(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                View findViewById = dialog.findViewById(R.id.service_label_cross);
                l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(R.id.service_label_list);
                l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) findViewById3;
                View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) findViewById4;
                ((ImageView) findViewById).setOnClickListener(new zj.m(dialog));
                int size = dLRenewalFeePaymentActivity.J1().size();
                String str = "";
                int i10 = 0;
                String str2 = str;
                while (i10 < size) {
                    str = str + ((String) dLRenewalFeePaymentActivity.J1().get(i10)) + 10;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    i10++;
                    sb2.append(i10);
                    sb2.append(".\n");
                    str2 = sb2.toString();
                }
                textView2.setText(str);
                textView3.setText(str2);
                textView.setOnClickListener(new n(dialog));
                Window window2 = dialog.getWindow();
                l.c(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void X1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Y1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void Z1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new zj.l(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void a2(Dialog dialog, DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, View view) {
        l.f(dialog, "$d");
        l.f(dLRenewalFeePaymentActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dLRenewalFeePaymentActivity, DashBoard.class);
        intent.setFlags(67108864);
        dLRenewalFeePaymentActivity.startActivity(intent);
        dLRenewalFeePaymentActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void f2(List list) {
        Integer num;
        String str;
        String str2;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                num = null;
                break;
            }
            Object obj = list.get(i10);
            l.c(obj);
            if (l.a(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = list.get(i10);
                l.c(obj2);
                num = ((ApplFlowStatusListItem) obj2).getAcCd();
                break;
            }
            i10++;
        }
        if (num == null) {
            new DLServiceFinalSubmitedActivity().D1(this);
            return;
        }
        try {
            DlLogUpdateFee.a aVar = DlLogUpdateFee.f8709k;
            String str3 = this.I;
            if (str3 == null) {
                l.v("mApplDob");
                str = null;
            } else {
                str = str3;
            }
            String str4 = this.H;
            if (str4 == null) {
                l.v("mApplNo");
                str4 = null;
            }
            long parseLong = Long.parseLong(str4);
            int parseInt = Integer.parseInt(K1().k());
            String str5 = this.O;
            l.c(str5);
            String str6 = this.N;
            l.c(str6);
            String str7 = this.I;
            if (str7 == null) {
                l.v("mApplDob");
                str2 = null;
            } else {
                str2 = str7;
            }
            aVar.a(this, str, parseLong, parseInt, str5, str6, str2, this.T);
        } catch (Exception unused) {
        }
        T1(num);
    }

    private final void g2() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new zj.h(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void h2(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        dLRenewalFeePaymentActivity.K = false;
    }

    private final void i2() {
        try {
            Intent intent = new Intent(this, DlDocActivity.class);
            String str = this.H;
            String str2 = null;
            if (str == null) {
                l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.I;
            if (str3 == null) {
                l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", H1());
            intent.putExtra("DL", this.N);
            intent.putExtra("dob", this.O);
            intent.putExtra("DLDetails", H1());
            intent.putExtra("Mobile_no", this.P);
            intent.putExtra("lastEndorsedRTO", this.Q);
            intent.putExtra("lastEndorsedState", this.R);
            intent.putExtra("lastEndorsedRTOCode", this.T);
            intent.putExtra("lastEndorseStateCode", this.S);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void j2() {
        try {
            Intent intent = new Intent(this, DLRenewalFeePaymentActivity.class);
            String str = this.H;
            String str2 = null;
            if (str == null) {
                l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.I;
            if (str3 == null) {
                l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", H1());
            intent.putExtra("DL", this.N);
            intent.putExtra("dob", this.O);
            intent.putExtra("DLDetails", H1());
            intent.putExtra("Mobile_no", this.P);
            intent.putExtra("lastEndorsedRTO", this.Q);
            intent.putExtra("lastEndorsedState", this.R);
            intent.putExtra("lastEndorsedRTOCode", this.T);
            intent.putExtra("lastEndorseStateCode", this.S);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void k2() {
        try {
            Intent intent = new Intent(this, DlPhotoAndSignatureActivity.class);
            String str = this.H;
            String str2 = null;
            if (str == null) {
                l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.I;
            if (str3 == null) {
                l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", H1());
            intent.putExtra("DL", this.N);
            intent.putExtra("dob", this.O);
            intent.putExtra("DLDetails", H1());
            intent.putExtra("Mobile_no", this.P);
            intent.putExtra("lastEndorsedRTO", this.Q);
            intent.putExtra("lastEndorsedState", this.R);
            intent.putExtra("lastEndorsedRTOCode", this.T);
            intent.putExtra("lastEndorseStateCode", this.S);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void l2() {
        try {
            Intent intent = new Intent(this, DlRenewalSlotsActivity.class);
            String str = this.H;
            String str2 = null;
            if (str == null) {
                l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.I;
            if (str3 == null) {
                l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", H1());
            intent.putExtra("DL", this.N);
            intent.putExtra("dob", this.O);
            intent.putExtra("DLDetails", H1());
            intent.putExtra("Mobile_no", this.P);
            intent.putExtra("lastEndorsedRTO", this.Q);
            intent.putExtra("lastEndorsedState", this.R);
            intent.putExtra("lastEndorsedRTOCode", this.T);
            intent.putExtra("lastEndorseStateCode", this.S);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void m2() {
        x2 x2Var = this.G;
        x2 x2Var2 = null;
        if (x2Var == null) {
            l.v("mBinding");
            x2Var = null;
        }
        x2Var.D.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        x2 x2Var3 = this.G;
        if (x2Var3 == null) {
            l.v("mBinding");
            x2Var3 = null;
        }
        x2Var3.D.getSettings().setAllowFileAccess(true);
        x2 x2Var4 = this.G;
        if (x2Var4 == null) {
            l.v("mBinding");
            x2Var4 = null;
        }
        x2Var4.D.getSettings().setAllowContentAccess(true);
        x2 x2Var5 = this.G;
        if (x2Var5 == null) {
            l.v("mBinding");
            x2Var5 = null;
        }
        x2Var5.D.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        x2 x2Var6 = this.G;
        if (x2Var6 == null) {
            l.v("mBinding");
            x2Var6 = null;
        }
        x2Var6.D.getSettings().setSupportMultipleWindows(true);
        x2 x2Var7 = this.G;
        if (x2Var7 == null) {
            l.v("mBinding");
            x2Var7 = null;
        }
        x2Var7.D.getSettings().setJavaScriptEnabled(true);
        x2 x2Var8 = this.G;
        if (x2Var8 == null) {
            l.v("mBinding");
            x2Var8 = null;
        }
        x2Var8.D.getSettings().setDomStorageEnabled(true);
        x2 x2Var9 = this.G;
        if (x2Var9 == null) {
            l.v("mBinding");
            x2Var9 = null;
        }
        x2Var9.D.getSettings().setUseWideViewPort(true);
        x2 x2Var10 = this.G;
        if (x2Var10 == null) {
            l.v("mBinding");
            x2Var10 = null;
        }
        x2Var10.D.getSettings().setLoadWithOverviewMode(true);
        x2 x2Var11 = this.G;
        if (x2Var11 == null) {
            l.v("mBinding");
            x2Var11 = null;
        }
        x2Var11.D.getSettings().setBuiltInZoomControls(true);
        x2 x2Var12 = this.G;
        if (x2Var12 == null) {
            l.v("mBinding");
            x2Var12 = null;
        }
        x2Var12.D.clearCache(true);
        x2 x2Var13 = this.G;
        if (x2Var13 == null) {
            l.v("mBinding");
            x2Var13 = null;
        }
        x2Var13.D.reload();
        x2 x2Var14 = this.G;
        if (x2Var14 == null) {
            l.v("mBinding");
            x2Var14 = null;
        }
        x2Var14.D.requestFocus(130);
        x2 x2Var15 = this.G;
        if (x2Var15 == null) {
            l.v("mBinding");
            x2Var15 = null;
        }
        x2Var15.D.setDownloadListener(new zj.c(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hc.a.f12073a.x());
        sb2.append("ePayment.jsp?applno=");
        String str = this.H;
        if (str == null) {
            l.v("mApplNo");
            str = null;
        }
        sb2.append(str);
        sb2.append("&dob=");
        String str2 = this.I;
        if (str2 == null) {
            l.v("mApplDob");
            str2 = null;
        }
        sb2.append(str2);
        sb2.append("&umang=P");
        String sb3 = sb2.toString();
        Log.d("url_new", sb3.toString());
        CookieManager.getInstance().setAcceptCookie(true);
        x2 x2Var16 = this.G;
        if (x2Var16 == null) {
            l.v("mBinding");
            x2Var16 = null;
        }
        x2Var16.D.loadUrl(sb3);
        x2 x2Var17 = this.G;
        if (x2Var17 == null) {
            l.v("mBinding");
            x2Var17 = null;
        }
        x2Var17.D.addJavascriptInterface(new a(this), "HtmlViewer");
        x2 x2Var18 = this.G;
        if (x2Var18 == null) {
            l.v("mBinding");
            x2Var18 = null;
        }
        x2Var18.D.setWebChromeClient(new g());
        x2 x2Var19 = this.G;
        if (x2Var19 == null) {
            l.v("mBinding");
        } else {
            x2Var2 = x2Var19;
        }
        x2Var2.D.setWebViewClient(new h(this));
    }

    /* access modifiers changed from: private */
    public static final void n2(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, String str, String str2, String str3, String str4, long j10) {
        l.f(dLRenewalFeePaymentActivity, "this$0");
        if (dLRenewalFeePaymentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            androidx.core.app.b.s(dLRenewalFeePaymentActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    public final void C1(String str, String str2, String str3, String str4) {
        l.f(str, "oldUrl");
        l.f(str2, "userAgent");
        l.f(str3, "contentDisposition");
        l.f(str4, "mimetype");
        Log.e("url", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?applno=");
        String str5 = this.H;
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
        ((TextView) findViewById).setText("Download");
        ((TextView) findViewById2).setText("Do you want to save Payment Receipt ?");
        ((TextView) findViewById3).setOnClickListener(new j(sb3, str2, this, dialog));
        ((TextView) findViewById4).setOnClickListener(new k(dialog));
        dialog.show();
    }

    public final DldetobjX H1() {
        DldetobjX dldetobjX = this.M;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final ld.c I1() {
        ld.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final ArrayList J1() {
        ArrayList arrayList = this.W;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final ld.g K1() {
        ld.g gVar = this.U;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final ArrayList L1() {
        ArrayList arrayList = this.V;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final ld.f M1() {
        ld.f fVar = this.X;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void N1(String str) {
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
        textView.setOnClickListener(new zj.d(this));
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setOnClickListener(new zj.e(dialog));
        dialog.show();
    }

    public final void T1(Integer num) {
        if (num != null && num.intValue() == 135) {
            k2();
        } else if (num != null && num.intValue() == 134) {
            j2();
        } else if (num != null && num.intValue() == 123) {
            i2();
        } else if (num != null && num.intValue() == 371) {
            l2();
        } else if (num != null && num.intValue() == 455) {
            Z1("Next process is E-Sign Document");
        }
    }

    public final void b2(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.M = dldetobjX;
    }

    public final void c2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.W = arrayList;
    }

    public final void d2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.V = arrayList;
    }

    public final void e2(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.X = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_renewal_fee_payment);
        l.e(f10, "setContentView(...)");
        this.G = (x2) f10;
        this.L = (q) new u0(this).a(q.class);
        e2(new ld.f(this));
        R1();
        Q1();
        m2();
        x2 x2Var = this.G;
        x2 x2Var2 = null;
        if (x2Var == null) {
            l.v("mBinding");
            x2Var = null;
        }
        x2Var.A.f29577d.setOnClickListener(new zj.a(this));
        if (l.a(M1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                d2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                l.d(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                c2((ArrayList) serializableExtra2);
                if (J1().size() == 1) {
                    x2 x2Var3 = this.G;
                    if (x2Var3 == null) {
                        l.v("mBinding");
                        x2Var3 = null;
                    }
                    x2Var3.A.f29580g.setText((CharSequence) J1().get(0));
                } else {
                    x2 x2Var4 = this.G;
                    if (x2Var4 == null) {
                        l.v("mBinding");
                        x2Var4 = null;
                    }
                    TextView textView = x2Var4.A.f29580g;
                    String b10 = I1().b("dl_services", getString(R.string.dl_services));
                    l.c(b10);
                    textView.setText(b10);
                    x2 x2Var5 = this.G;
                    if (x2Var5 == null) {
                        l.v("mBinding");
                        x2Var5 = null;
                    }
                    TextView textView2 = x2Var5.A.f29580g;
                    x2 x2Var6 = this.G;
                    if (x2Var6 == null) {
                        l.v("mBinding");
                        x2Var6 = null;
                    }
                    textView2.setPaintFlags(x2Var6.A.f29580g.getPaintFlags() | 8);
                }
            } catch (Exception unused) {
            }
        } else {
            x2 x2Var7 = this.G;
            if (x2Var7 == null) {
                l.v("mBinding");
                x2Var7 = null;
            }
            x2Var7.A.f29580g.setText(M1().i());
        }
        x2 x2Var8 = this.G;
        if (x2Var8 == null) {
            l.v("mBinding");
            x2Var8 = null;
        }
        x2Var8.A.f29581h.setVisibility(8);
        x2 x2Var9 = this.G;
        if (x2Var9 == null) {
            l.v("mBinding");
            x2Var9 = null;
        }
        x2Var9.A.f29581h.setOnClickListener(new zj.f(this));
        x2 x2Var10 = this.G;
        if (x2Var10 == null) {
            l.v("mBinding");
        } else {
            x2Var2 = x2Var10;
        }
        x2Var2.A.f29580g.setOnClickListener(new zj.g(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        s0.a.b(this).e(this.f22245a0);
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        x2 x2Var = this.G;
        if (x2Var == null) {
            l.v("mBinding");
            x2Var = null;
        }
        if (x2Var.D.canGoBack()) {
            onBackPressed();
            return true;
        }
        g2();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        x2 x2Var = this.G;
        x2 x2Var2 = null;
        if (x2Var == null) {
            l.v("mBinding");
            x2Var = null;
        }
        x2Var.C.onPause();
        x2 x2Var3 = this.G;
        if (x2Var3 == null) {
            l.v("mBinding");
        } else {
            x2Var2 = x2Var3;
        }
        x2Var2.C.pauseTimers();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        x2 x2Var = this.G;
        x2 x2Var2 = null;
        if (x2Var == null) {
            l.v("mBinding");
            x2Var = null;
        }
        x2Var.C.onResume();
        x2 x2Var3 = this.G;
        if (x2Var3 == null) {
            l.v("mBinding");
        } else {
            x2Var2 = x2Var3;
        }
        x2Var2.C.resumeTimers();
    }
}
