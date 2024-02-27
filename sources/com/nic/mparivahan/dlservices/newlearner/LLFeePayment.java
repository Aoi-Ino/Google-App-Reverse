package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bj.c0;
import bj.d0;
import bj.e0;
import bj.f0;
import bj.g0;
import bj.h0;
import cm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import fj.q;
import java.util.List;
import ni.n2;
import pl.x;

public final class LLFeePayment extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public n2 G;
    /* access modifiers changed from: private */
    public String H;
    /* access modifiers changed from: private */
    public String I;
    /* access modifiers changed from: private */
    public boolean J;
    private boolean K;
    /* access modifiers changed from: private */
    public q L;
    private String M = "";
    private String N = "";
    private String O = "";
    private String P = "";
    private String Q = "";
    public ld.g R;
    /* access modifiers changed from: private */
    public String S = "";
    private final BroadcastReceiver T = new e(this);

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f21698a;

        public a(Context context) {
            l.f(context, "context");
            this.f21698a = context;
        }

        private final void a(String str, String str2) {
            Log.d("sender", "Broadcasting message");
            Intent intent = new Intent("success-payment-event");
            intent.putExtra("applNum", str);
            intent.putExtra("respCode", str2);
            s0.a.b(this.f21698a).d(intent);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[Catch:{ Exception -> 0x001b }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void showHTML(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "receipt_no"
                java.lang.String r1 = "applNum"
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x001b }
                cm.l.c(r5)     // Catch:{ Exception -> 0x001b }
                r2.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x001b }
                boolean r5 = r2.has(r1)     // Catch:{ Exception -> 0x001b }
                java.lang.String r3 = "respCode"
                if (r5 != 0) goto L_0x001d
                boolean r5 = r2.has(r3)     // Catch:{ Exception -> 0x001b }
                if (r5 == 0) goto L_0x002e
                goto L_0x001d
            L_0x001b:
                r5 = move-exception
                goto L_0x0038
            L_0x001d:
                java.lang.String r5 = r2.getString(r1)     // Catch:{ Exception -> 0x001b }
                java.lang.String r1 = r2.getString(r3)     // Catch:{ Exception -> 0x001b }
                cm.l.c(r5)     // Catch:{ Exception -> 0x001b }
                cm.l.c(r1)     // Catch:{ Exception -> 0x001b }
                r4.a(r5, r1)     // Catch:{ Exception -> 0x001b }
            L_0x002e:
                boolean r5 = r2.has(r0)     // Catch:{ Exception -> 0x001b }
                if (r5 == 0) goto L_0x003b
                r2.getString(r0)     // Catch:{ Exception -> 0x001b }
                goto L_0x003b
            L_0x0038:
                r5.printStackTrace()
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LLFeePayment.a.showHTML(java.lang.String):void");
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
        final /* synthetic */ LLFeePayment f21699a;

        c(LLFeePayment lLFeePayment) {
            this.f21699a = lLFeePayment;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Log.e("url_app", String.valueOf(str));
            if (str != null) {
                String str2 = null;
                if (q.F(str, "callback/sarathiPGResponse", false, 2, (Object) null)) {
                    q q12 = this.f21699a.L;
                    if (q12 == null) {
                        l.v("viewModel");
                        q12 = null;
                    }
                    String m12 = this.f21699a.S;
                    String o12 = this.f21699a.I;
                    if (o12 == null) {
                        l.v("mApplDob");
                    } else {
                        str2 = o12;
                    }
                    q12.h(m12, str2);
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
        final /* synthetic */ LLFeePayment f21700e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LLFeePayment lLFeePayment) {
            super(1);
            this.f21700e = lLFeePayment;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f21700e.G1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    public static final class e extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LLFeePayment f21701a;

        e(LLFeePayment lLFeePayment) {
            this.f21701a = lLFeePayment;
        }

        public void onReceive(Context context, Intent intent) {
            n2 n2Var = null;
            this.f21701a.S = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (this.f21701a.S.length() > 0 && stringExtra != null && stringExtra.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(hc.a.f12073a.x());
                sb2.append("PrintConformMob.jsp?applno=");
                String p12 = this.f21701a.H;
                if (p12 == null) {
                    l.v("mApplNo");
                    p12 = null;
                }
                sb2.append(p12);
                sb2.append("&dob=");
                String o12 = this.f21701a.I;
                if (o12 == null) {
                    l.v("mApplDob");
                    o12 = null;
                }
                sb2.append(o12);
                String sb3 = sb2.toString();
                n2 n12 = this.f21701a.G;
                if (n12 == null) {
                    l.v("cBinding");
                } else {
                    n2Var = n12;
                }
                n2Var.B.setVisibility(8);
                this.f21701a.x1(sb3);
            }
            Log.d("receiver", "Got message: " + stringExtra);
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21702a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f21702a = lVar;
        }

        public final pl.c a() {
            return this.f21702a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21702a.invoke(obj);
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
        final /* synthetic */ LLFeePayment f21703a;

        h(LLFeePayment lLFeePayment) {
            this.f21703a = lLFeePayment;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f21703a.J = true;
            n2 n12 = this.f21703a.G;
            n2 n2Var = null;
            if (n12 == null) {
                l.v("cBinding");
                n12 = null;
            }
            n12.C.p();
            n2 n13 = this.f21703a.G;
            if (n13 == null) {
                l.v("cBinding");
                n13 = null;
            }
            n13.C.setVisibility(8);
            n2 n14 = this.f21703a.G;
            if (n14 == null) {
                l.v("cBinding");
                n14 = null;
            }
            n14.B.setVisibility(0);
            n2 n15 = this.f21703a.G;
            if (n15 == null) {
                l.v("cBinding");
                n15 = null;
            }
            n15.B.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            n2 n16 = this.f21703a.G;
            if (n16 == null) {
                l.v("cBinding");
            } else {
                n2Var = n16;
            }
            n2Var.B.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            n2 n12 = this.f21703a.G;
            if (n12 == null) {
                l.v("cBinding");
                n12 = null;
            }
            n12.C.o();
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f21703a.J = false;
            Log.e("dl-js", ("Got Error! " + webResourceError).toString());
            n2 n12 = this.f21703a.G;
            n2 n2Var = null;
            if (n12 == null) {
                l.v("cBinding");
                n12 = null;
            }
            n12.C.p();
            n2 n13 = this.f21703a.G;
            if (n13 == null) {
                l.v("cBinding");
            } else {
                n2Var = n13;
            }
            n2Var.C.setVisibility(8);
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

    private final void A1() {
        q qVar = this.L;
        if (qVar == null) {
            l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new f(new d(this)));
    }

    private final void B1() {
        ld.f fVar = new ld.f(this);
        s0.a.b(this).c(this.T, new IntentFilter("success-payment-event"));
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            n2 n2Var = null;
            this.H = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.I = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            this.M = String.valueOf(getIntent().getStringExtra("dob"));
            this.N = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
            l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.O = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("aadharPhoto");
            l.c(stringExtra2);
            this.Q = stringExtra2;
            n2 n2Var2 = this.G;
            if (n2Var2 == null) {
                l.v("cBinding");
            } else {
                n2Var = n2Var2;
            }
            n2Var.f27544x.f25961g.setText(fVar.i());
        }
    }

    private final void D1(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new c0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void E1(Dialog dialog, LLFeePayment lLFeePayment, View view) {
        l.f(dialog, "$d");
        l.f(lLFeePayment, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(lLFeePayment, DashBoard.class);
        intent.setFlags(67108864);
        lLFeePayment.startActivity(intent);
        lLFeePayment.finish();
    }

    /* access modifiers changed from: private */
    public final void G1(List list) {
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
                Integer acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd != null && acCd.intValue() == 455) {
                }
            }
            i10++;
        }
        Object obj3 = list.get(i10);
        l.c(obj3);
        num = ((ApplFlowStatusListItem) obj3).getAcCd();
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
            int parseInt = Integer.parseInt(z1().k());
            String str5 = this.M;
            l.c(str5);
            String str6 = this.I;
            if (str6 == null) {
                l.v("mApplDob");
                str2 = null;
            } else {
                str2 = str6;
            }
            aVar.a(this, str, parseLong, parseInt, str5, "", str2, this.P);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        C1(num);
    }

    private final void H1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new d0(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void I1(LLFeePayment lLFeePayment) {
        l.f(lLFeePayment, "this$0");
        lLFeePayment.K = false;
    }

    private final void J1() {
        Intent intent = new Intent(this, LLDocUpload.class);
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
        intent.putExtra("dob", this.M);
        intent.putExtra("Mobile_no", this.N);
        intent.putExtra("lastEndorsedRTO", this.O);
        intent.putExtra("lastEndorsedRTOCode", this.P);
        intent.putExtra("aadharPhoto", this.Q);
        startActivity(intent);
        finish();
    }

    private final void K1() {
        Intent intent = new Intent(this, LLFeePayment.class);
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
        intent.putExtra("dob", this.M);
        intent.putExtra("Mobile_no", this.N);
        intent.putExtra("lastEndorsedRTO", this.O);
        intent.putExtra("lastEndorsedRTOCode", this.P);
        intent.putExtra("aadharPhoto", this.Q);
        startActivity(intent);
        finish();
    }

    private final void L1() {
        Intent intent = new Intent(this, LLPhotoSign.class);
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
        intent.putExtra("dob", this.M);
        intent.putExtra("Mobile_no", this.N);
        intent.putExtra("lastEndorsedRTO", this.O);
        intent.putExtra("lastEndorsedRTOCode", this.P);
        intent.putExtra("aadharPhoto", this.Q);
        startActivity(intent);
        finish();
    }

    private final void M1() {
        Intent intent = new Intent(this, LLSlots.class);
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
        intent.putExtra("dob", this.M);
        intent.putExtra("Mobile_no", this.N);
        intent.putExtra("lastEndorsedRTO", this.O);
        intent.putExtra("lastEndorsedRTOCode", this.P);
        intent.putExtra("aadharPhoto", this.Q);
        startActivity(intent);
        finish();
    }

    private final void N1() {
        n2 n2Var = this.G;
        n2 n2Var2 = null;
        if (n2Var == null) {
            l.v("cBinding");
            n2Var = null;
        }
        n2Var.B.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        n2 n2Var3 = this.G;
        if (n2Var3 == null) {
            l.v("cBinding");
            n2Var3 = null;
        }
        n2Var3.B.getSettings().setAllowFileAccess(true);
        n2 n2Var4 = this.G;
        if (n2Var4 == null) {
            l.v("cBinding");
            n2Var4 = null;
        }
        n2Var4.B.getSettings().setAllowContentAccess(true);
        n2 n2Var5 = this.G;
        if (n2Var5 == null) {
            l.v("cBinding");
            n2Var5 = null;
        }
        n2Var5.B.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        n2 n2Var6 = this.G;
        if (n2Var6 == null) {
            l.v("cBinding");
            n2Var6 = null;
        }
        n2Var6.B.getSettings().setSupportMultipleWindows(true);
        n2 n2Var7 = this.G;
        if (n2Var7 == null) {
            l.v("cBinding");
            n2Var7 = null;
        }
        n2Var7.B.getSettings().setJavaScriptEnabled(true);
        n2 n2Var8 = this.G;
        if (n2Var8 == null) {
            l.v("cBinding");
            n2Var8 = null;
        }
        n2Var8.B.getSettings().setDomStorageEnabled(true);
        n2 n2Var9 = this.G;
        if (n2Var9 == null) {
            l.v("cBinding");
            n2Var9 = null;
        }
        n2Var9.B.getSettings().setUseWideViewPort(true);
        n2 n2Var10 = this.G;
        if (n2Var10 == null) {
            l.v("cBinding");
            n2Var10 = null;
        }
        n2Var10.B.getSettings().setLoadWithOverviewMode(true);
        n2 n2Var11 = this.G;
        if (n2Var11 == null) {
            l.v("cBinding");
            n2Var11 = null;
        }
        n2Var11.B.getSettings().setBuiltInZoomControls(true);
        n2 n2Var12 = this.G;
        if (n2Var12 == null) {
            l.v("cBinding");
            n2Var12 = null;
        }
        n2Var12.B.clearCache(true);
        n2 n2Var13 = this.G;
        if (n2Var13 == null) {
            l.v("cBinding");
            n2Var13 = null;
        }
        n2Var13.B.reload();
        n2 n2Var14 = this.G;
        if (n2Var14 == null) {
            l.v("cBinding");
            n2Var14 = null;
        }
        n2Var14.B.requestFocus(130);
        n2 n2Var15 = this.G;
        if (n2Var15 == null) {
            l.v("cBinding");
            n2Var15 = null;
        }
        n2Var15.B.setDownloadListener(new e0(this));
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
        CookieManager.getInstance().setAcceptCookie(true);
        n2 n2Var16 = this.G;
        if (n2Var16 == null) {
            l.v("cBinding");
            n2Var16 = null;
        }
        n2Var16.B.loadUrl(sb3);
        n2 n2Var17 = this.G;
        if (n2Var17 == null) {
            l.v("cBinding");
            n2Var17 = null;
        }
        n2Var17.B.addJavascriptInterface(new a(this), "HtmlViewer");
        n2 n2Var18 = this.G;
        if (n2Var18 == null) {
            l.v("cBinding");
            n2Var18 = null;
        }
        n2Var18.B.setWebChromeClient(new g());
        n2 n2Var19 = this.G;
        if (n2Var19 == null) {
            l.v("cBinding");
        } else {
            n2Var2 = n2Var19;
        }
        n2Var2.B.setWebViewClient(new h(this));
    }

    /* access modifiers changed from: private */
    public static final void O1(LLFeePayment lLFeePayment, String str, String str2, String str3, String str4, long j10) {
        l.f(lLFeePayment, "this$0");
        if (lLFeePayment.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            androidx.core.app.b.s(lLFeePayment, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    /* access modifiers changed from: private */
    public static final void v1(String str, String str2, LLFeePayment lLFeePayment, Dialog dialog, View view) {
        l.f(str, "$url");
        l.f(str2, "$userAgent");
        l.f(lLFeePayment, "this$0");
        l.f(dialog, "$screen16");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str2);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = lLFeePayment.getSystemService("download");
        l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PayReceipt");
        String str4 = lLFeePayment.H;
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
    public static final void w1(Dialog dialog, View view) {
        l.f(dialog, "$screen16");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void x1(String str) {
        n2 n2Var = this.G;
        n2 n2Var2 = null;
        if (n2Var == null) {
            l.v("cBinding");
            n2Var = null;
        }
        n2Var.A.setVisibility(0);
        n2 n2Var3 = this.G;
        if (n2Var3 == null) {
            l.v("cBinding");
            n2Var3 = null;
        }
        n2Var3.A.loadUrl(str);
        n2 n2Var4 = this.G;
        if (n2Var4 == null) {
            l.v("cBinding");
            n2Var4 = null;
        }
        n2Var4.A.getSettings().setJavaScriptEnabled(true);
        n2 n2Var5 = this.G;
        if (n2Var5 == null) {
            l.v("cBinding");
            n2Var5 = null;
        }
        n2Var5.A.setDownloadListener(new f0(this));
        n2 n2Var6 = this.G;
        if (n2Var6 == null) {
            l.v("cBinding");
            n2Var6 = null;
        }
        n2Var6.A.setWebChromeClient(new b());
        n2 n2Var7 = this.G;
        if (n2Var7 == null) {
            l.v("cBinding");
        } else {
            n2Var2 = n2Var7;
        }
        n2Var2.A.setWebViewClient(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void y1(LLFeePayment lLFeePayment, String str, String str2, String str3, String str4, long j10) {
        l.f(lLFeePayment, "this$0");
        if (lLFeePayment.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            l.c(str);
            l.c(str2);
            l.c(str3);
            l.c(str4);
            lLFeePayment.u1(str, str2, str3, str4);
            return;
        }
        androidx.core.app.b.s(lLFeePayment, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    public final void C1(Integer num) {
        if (num != null && num.intValue() == 135) {
            L1();
        } else if (num != null && num.intValue() == 134) {
            K1();
        } else if (num != null && num.intValue() == 123) {
            J1();
        } else if ((num != null && num.intValue() == 371) || (num != null && num.intValue() == 132)) {
            M1();
        } else if (num != null && num.intValue() == 455) {
            D1("Next process is E-Sign Document");
        }
    }

    public final void F1(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.R = gVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n2 x10 = n2.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        if (x10 == null) {
            l.v("cBinding");
            x10 = null;
        }
        setContentView(x10.m());
        F1(new ld.g(this));
        this.L = (q) new u0(this).a(q.class);
        B1();
        A1();
        N1();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        s0.a.b(this).e(this.T);
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        n2 n2Var = this.G;
        if (n2Var == null) {
            l.v("cBinding");
            n2Var = null;
        }
        if (n2Var.B.canGoBack()) {
            onBackPressed();
            return true;
        }
        H1();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        n2 n2Var = this.G;
        n2 n2Var2 = null;
        if (n2Var == null) {
            l.v("cBinding");
            n2Var = null;
        }
        n2Var.A.onPause();
        n2 n2Var3 = this.G;
        if (n2Var3 == null) {
            l.v("cBinding");
        } else {
            n2Var2 = n2Var3;
        }
        n2Var2.A.pauseTimers();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        n2 n2Var = this.G;
        n2 n2Var2 = null;
        if (n2Var == null) {
            l.v("cBinding");
            n2Var = null;
        }
        n2Var.A.onResume();
        n2 n2Var3 = this.G;
        if (n2Var3 == null) {
            l.v("cBinding");
        } else {
            n2Var2 = n2Var3;
        }
        n2Var2.A.resumeTimers();
    }

    public final void u1(String str, String str2, String str3, String str4) {
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
        ((TextView) findViewById3).setOnClickListener(new g0(sb3, str2, this, dialog));
        ((TextView) findViewById4).setOnClickListener(new h0(dialog));
        dialog.show();
    }

    public final ld.g z1() {
        ld.g gVar = this.R;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }
}
