package com.nic.mparivahan.ClServices.View;

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
import cm.l;
import cm.m;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import fj.q;
import java.util.List;
import ni.r0;
import p9.e1;
import p9.f1;
import p9.g1;
import p9.h1;
import p9.i1;
import p9.j1;
import p9.k1;
import p9.l1;
import p9.m1;
import pl.x;

public final class ClFeePayment extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public r0 G;
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
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    public ld.g Y;
    public ld.f Z;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public String f7886a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private final BroadcastReceiver f7887b0 = new e(this);

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f7888a;

        public a(Context context) {
            l.f(context, "context");
            this.f7888a = context;
        }

        private final void a(String str, String str2) {
            Log.d("sender", "Broadcasting message");
            Intent intent = new Intent("success-payment-event");
            intent.putExtra("applNum", str);
            intent.putExtra("respCode", str2);
            s0.a.b(this.f7888a).d(intent);
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
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClFeePayment.a.showHTML(java.lang.String):void");
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
        final /* synthetic */ ClFeePayment f7889a;

        c(ClFeePayment clFeePayment) {
            this.f7889a = clFeePayment;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Log.e("url_app", String.valueOf(str));
            if (str != null) {
                String str2 = null;
                if (q.F(str, "callback/sarathiPGResponse", false, 2, (Object) null)) {
                    q t12 = this.f7889a.L;
                    if (t12 == null) {
                        l.v("viewModel");
                        t12 = null;
                    }
                    String p12 = this.f7889a.f7886a0;
                    String r12 = this.f7889a.I;
                    if (r12 == null) {
                        l.v("mApplDob");
                    } else {
                        str2 = r12;
                    }
                    t12.h(p12, str2);
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
        final /* synthetic */ ClFeePayment f7890e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ClFeePayment clFeePayment) {
            super(1);
            this.f7890e = clFeePayment;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f7890e.O1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    public static final class e extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ClFeePayment f7891a;

        e(ClFeePayment clFeePayment) {
            this.f7891a = clFeePayment;
        }

        public void onReceive(Context context, Intent intent) {
            r0 r0Var = null;
            this.f7891a.f7886a0 = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (this.f7891a.f7886a0.length() > 0 && stringExtra != null && stringExtra.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(hc.a.f12073a.x());
                sb2.append("PrintConformMob.jsp?applno=");
                String s12 = this.f7891a.H;
                if (s12 == null) {
                    l.v("mApplNo");
                    s12 = null;
                }
                sb2.append(s12);
                sb2.append("&dob=");
                String r12 = this.f7891a.I;
                if (r12 == null) {
                    l.v("mApplDob");
                    r12 = null;
                }
                sb2.append(r12);
                String sb3 = sb2.toString();
                Log.d("newReceiptUrl", sb3.toString());
                r0 q12 = this.f7891a.G;
                if (q12 == null) {
                    l.v("cBinding");
                } else {
                    r0Var = q12;
                }
                r0Var.C.setVisibility(8);
                this.f7891a.A1(sb3);
            }
            Log.d("receiver", "Got message: " + stringExtra);
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7892a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f7892a = lVar;
        }

        public final pl.c a() {
            return this.f7892a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7892a.invoke(obj);
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
        final /* synthetic */ ClFeePayment f7893a;

        h(ClFeePayment clFeePayment) {
            this.f7893a = clFeePayment;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f7893a.J = true;
            r0 q12 = this.f7893a.G;
            r0 r0Var = null;
            if (q12 == null) {
                l.v("cBinding");
                q12 = null;
            }
            q12.D.p();
            r0 q13 = this.f7893a.G;
            if (q13 == null) {
                l.v("cBinding");
                q13 = null;
            }
            q13.D.setVisibility(8);
            r0 q14 = this.f7893a.G;
            if (q14 == null) {
                l.v("cBinding");
                q14 = null;
            }
            q14.C.setVisibility(0);
            r0 q15 = this.f7893a.G;
            if (q15 == null) {
                l.v("cBinding");
                q15 = null;
            }
            q15.C.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            r0 q16 = this.f7893a.G;
            if (q16 == null) {
                l.v("cBinding");
            } else {
                r0Var = q16;
            }
            r0Var.C.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            r0 q12 = this.f7893a.G;
            if (q12 == null) {
                l.v("cBinding");
                q12 = null;
            }
            q12.D.o();
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f7893a.J = false;
            Log.e("dl-js", ("Got Error! " + webResourceError).toString());
            r0 q12 = this.f7893a.G;
            r0 r0Var = null;
            if (q12 == null) {
                l.v("cBinding");
                q12 = null;
            }
            q12.D.p();
            r0 q13 = this.f7893a.G;
            if (q13 == null) {
                l.v("cBinding");
            } else {
                r0Var = q13;
            }
            r0Var.D.setVisibility(8);
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
    public final void A1(String str) {
        r0 r0Var = this.G;
        r0 r0Var2 = null;
        if (r0Var == null) {
            l.v("cBinding");
            r0Var = null;
        }
        r0Var.B.setVisibility(0);
        r0 r0Var3 = this.G;
        if (r0Var3 == null) {
            l.v("cBinding");
            r0Var3 = null;
        }
        r0Var3.B.loadUrl(str);
        r0 r0Var4 = this.G;
        if (r0Var4 == null) {
            l.v("cBinding");
            r0Var4 = null;
        }
        r0Var4.B.getSettings().setJavaScriptEnabled(true);
        r0 r0Var5 = this.G;
        if (r0Var5 == null) {
            l.v("cBinding");
            r0Var5 = null;
        }
        r0Var5.B.setDownloadListener(new g1(this));
        r0 r0Var6 = this.G;
        if (r0Var6 == null) {
            l.v("cBinding");
            r0Var6 = null;
        }
        r0Var6.B.setWebChromeClient(new b());
        r0 r0Var7 = this.G;
        if (r0Var7 == null) {
            l.v("cBinding");
        } else {
            r0Var2 = r0Var7;
        }
        r0Var2.B.setWebViewClient(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void B1(ClFeePayment clFeePayment, String str, String str2, String str3, String str4, long j10) {
        l.f(clFeePayment, "this$0");
        if (clFeePayment.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            l.c(str);
            l.c(str2);
            l.c(str3);
            l.c(str4);
            clFeePayment.x1(str, str2, str3, str4);
            return;
        }
        androidx.core.app.b.s(clFeePayment, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    private final void E1() {
        q qVar = this.L;
        if (qVar == null) {
            l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new f(new d(this)));
    }

    private final void F1() {
        s0.a.b(this).c(this.f7887b0, new IntentFilter("success-payment-event"));
        if (getIntent() != null) {
            r0 r0Var = null;
            try {
                Bundle extras = getIntent().getExtras();
                this.H = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.I = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                this.M = String.valueOf(getIntent().getStringExtra("DL"));
                this.N = String.valueOf(getIntent().getStringExtra("dob"));
                this.O = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.P = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("clName");
                l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.R = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("fatherName");
                l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.T = stringExtra3;
                this.U = String.valueOf(getIntent().getStringExtra("address"));
                this.W = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                this.X = String.valueOf(getIntent().getStringExtra("validity"));
                this.V = String.valueOf(getIntent().getStringExtra("cl_Status"));
                String stringExtra4 = getIntent().getStringExtra("clPhoto");
                l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.S = stringExtra4;
            } catch (Exception unused) {
            }
            r0 r0Var2 = this.G;
            if (r0Var2 == null) {
                l.v("cBinding");
            } else {
                r0Var = r0Var2;
            }
            r0Var.f28318x.f25961g.setText(D1().i());
        }
    }

    private final void G1() {
        r0 r0Var = this.G;
        r0 r0Var2 = null;
        if (r0Var == null) {
            l.v("cBinding");
            r0Var = null;
        }
        r0Var.f28320z.f29580g.setText(D1().i());
        r0 r0Var3 = this.G;
        if (r0Var3 == null) {
            l.v("cBinding");
            r0Var3 = null;
        }
        TextView textView = r0Var3.f28320z.f29581h;
        r0 r0Var4 = this.G;
        if (r0Var4 == null) {
            l.v("cBinding");
            r0Var4 = null;
        }
        textView.setPaintFlags(r0Var4.f28320z.f29581h.getPaintFlags() | 8);
        r0 r0Var5 = this.G;
        if (r0Var5 == null) {
            l.v("cBinding");
            r0Var5 = null;
        }
        TextView textView2 = r0Var5.f28320z.f29581h;
        String str = this.M;
        l.c(str);
        textView2.setText(q.B0(str).toString());
        if (l.a(D1().b(), "551")) {
            r0 r0Var6 = this.G;
            if (r0Var6 == null) {
                l.v("cBinding");
                r0Var6 = null;
            }
            r0Var6.f28320z.f29581h.setVisibility(8);
        } else {
            r0 r0Var7 = this.G;
            if (r0Var7 == null) {
                l.v("cBinding");
                r0Var7 = null;
            }
            r0Var7.f28320z.f29581h.setVisibility(0);
        }
        r0 r0Var8 = this.G;
        if (r0Var8 == null) {
            l.v("cBinding");
        } else {
            r0Var2 = r0Var8;
        }
        r0Var2.f28320z.f29581h.setOnClickListener(new i1(this));
    }

    /* access modifiers changed from: private */
    public static final void H1(ClFeePayment clFeePayment, View view) {
        l.f(clFeePayment, "this$0");
        if (!l.a(clFeePayment.D1().b(), "551")) {
            try {
                Intent intent = new Intent(clFeePayment, ClDetailsTop.class);
                intent.putExtra("dlValue", q.B0(String.valueOf(clFeePayment.M)).toString());
                intent.putExtra("dobValue", clFeePayment.N);
                intent.putExtra("fatherName", clFeePayment.T);
                intent.putExtra("clName", clFeePayment.R);
                intent.putExtra("clPhoto", clFeePayment.S);
                intent.putExtra("address", clFeePayment.U).toString();
                intent.putExtra("issuing_authority", clFeePayment.W).toString();
                intent.putExtra("validity", clFeePayment.X).toString();
                intent.putExtra("cl_Status", clFeePayment.V).toString();
                clFeePayment.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(ClFeePayment clFeePayment, View view) {
        l.f(clFeePayment, "this$0");
        clFeePayment.finish();
    }

    /* access modifiers changed from: private */
    public static final void K1(ClFeePayment clFeePayment, View view) {
        l.f(clFeePayment, "this$0");
        clFeePayment.finish();
    }

    private final void L1(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new m1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M1(Dialog dialog, ClFeePayment clFeePayment, View view) {
        l.f(dialog, "$d");
        l.f(clFeePayment, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(clFeePayment, DashBoard.class);
        intent.setFlags(67108864);
        clFeePayment.startActivity(intent);
        clFeePayment.finish();
    }

    /* access modifiers changed from: private */
    public final void O1(List list) {
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
            int parseInt = Integer.parseInt(C1().k());
            String str5 = this.N;
            l.c(str5);
            String str6 = this.M;
            l.c(str6);
            String str7 = this.I;
            if (str7 == null) {
                l.v("mApplDob");
                str2 = null;
            } else {
                str2 = str7;
            }
            aVar.a(this, str, parseLong, parseInt, str5, str6, str2, this.Q);
        } catch (Exception unused) {
        }
        I1(num);
    }

    private final void P1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new h1(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void Q1(ClFeePayment clFeePayment) {
        l.f(clFeePayment, "this$0");
        clFeePayment.K = false;
    }

    private final void R1() {
        try {
            Intent intent = new Intent(this, ClDocumentsUpload.class);
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
            intent.putExtra("DL", this.M);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", this.O);
            intent.putExtra("lastEndorsedRTO", this.P);
            intent.putExtra("lastEndorsedRTOCode", this.Q);
            intent.putExtra("fatherName", this.T);
            intent.putExtra("clName", this.R);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.U).toString();
            intent.putExtra("issuing_authority", this.W).toString();
            intent.putExtra("validity", this.X).toString();
            intent.putExtra("cl_Status", this.V).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void S1() {
        try {
            Intent intent = new Intent(this, ClFeePayment.class);
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
            intent.putExtra("DL", this.M);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", this.O);
            intent.putExtra("lastEndorsedRTO", this.P);
            intent.putExtra("lastEndorsedRTOCode", this.Q);
            intent.putExtra("fatherName", this.T);
            intent.putExtra("clName", this.R);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.U).toString();
            intent.putExtra("issuing_authority", this.W).toString();
            intent.putExtra("validity", this.X).toString();
            intent.putExtra("cl_Status", this.V).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void T1() {
        try {
            Intent intent = new Intent(this, ClPhotoSignature.class);
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
            intent.putExtra("DL", this.M);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", this.O);
            intent.putExtra("lastEndorsedRTO", this.P);
            intent.putExtra("lastEndorsedRTOCode", this.Q);
            intent.putExtra("fatherName", this.T);
            intent.putExtra("clName", this.R);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.U).toString();
            intent.putExtra("issuing_authority", this.W).toString();
            intent.putExtra("validity", this.X).toString();
            intent.putExtra("cl_Status", this.V).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void U1() {
        try {
            Intent intent = new Intent(this, ClSots.class);
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
            intent.putExtra("DL", this.M);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", this.O);
            intent.putExtra("lastEndorsedRTO", this.P);
            intent.putExtra("lastEndorsedRTOCode", this.Q);
            intent.putExtra("fatherName", this.T);
            intent.putExtra("clName", this.R);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.U).toString();
            intent.putExtra("issuing_authority", this.W).toString();
            intent.putExtra("validity", this.X).toString();
            intent.putExtra("cl_Status", this.V).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void V1() {
        r0 r0Var = this.G;
        r0 r0Var2 = null;
        if (r0Var == null) {
            l.v("cBinding");
            r0Var = null;
        }
        r0Var.C.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        r0 r0Var3 = this.G;
        if (r0Var3 == null) {
            l.v("cBinding");
            r0Var3 = null;
        }
        r0Var3.C.getSettings().setAllowFileAccess(true);
        r0 r0Var4 = this.G;
        if (r0Var4 == null) {
            l.v("cBinding");
            r0Var4 = null;
        }
        r0Var4.C.getSettings().setAllowContentAccess(true);
        r0 r0Var5 = this.G;
        if (r0Var5 == null) {
            l.v("cBinding");
            r0Var5 = null;
        }
        r0Var5.C.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        r0 r0Var6 = this.G;
        if (r0Var6 == null) {
            l.v("cBinding");
            r0Var6 = null;
        }
        r0Var6.C.getSettings().setSupportMultipleWindows(true);
        r0 r0Var7 = this.G;
        if (r0Var7 == null) {
            l.v("cBinding");
            r0Var7 = null;
        }
        r0Var7.C.getSettings().setJavaScriptEnabled(true);
        r0 r0Var8 = this.G;
        if (r0Var8 == null) {
            l.v("cBinding");
            r0Var8 = null;
        }
        r0Var8.C.getSettings().setDomStorageEnabled(true);
        r0 r0Var9 = this.G;
        if (r0Var9 == null) {
            l.v("cBinding");
            r0Var9 = null;
        }
        r0Var9.C.getSettings().setUseWideViewPort(true);
        r0 r0Var10 = this.G;
        if (r0Var10 == null) {
            l.v("cBinding");
            r0Var10 = null;
        }
        r0Var10.C.getSettings().setLoadWithOverviewMode(true);
        r0 r0Var11 = this.G;
        if (r0Var11 == null) {
            l.v("cBinding");
            r0Var11 = null;
        }
        r0Var11.C.getSettings().setBuiltInZoomControls(true);
        r0 r0Var12 = this.G;
        if (r0Var12 == null) {
            l.v("cBinding");
            r0Var12 = null;
        }
        r0Var12.C.clearCache(true);
        r0 r0Var13 = this.G;
        if (r0Var13 == null) {
            l.v("cBinding");
            r0Var13 = null;
        }
        r0Var13.C.reload();
        r0 r0Var14 = this.G;
        if (r0Var14 == null) {
            l.v("cBinding");
            r0Var14 = null;
        }
        r0Var14.C.requestFocus(130);
        r0 r0Var15 = this.G;
        if (r0Var15 == null) {
            l.v("cBinding");
            r0Var15 = null;
        }
        r0Var15.C.setDownloadListener(new j1(this));
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
        r0 r0Var16 = this.G;
        if (r0Var16 == null) {
            l.v("cBinding");
            r0Var16 = null;
        }
        r0Var16.C.loadUrl(sb3);
        r0 r0Var17 = this.G;
        if (r0Var17 == null) {
            l.v("cBinding");
            r0Var17 = null;
        }
        r0Var17.C.addJavascriptInterface(new a(this), "HtmlViewer");
        r0 r0Var18 = this.G;
        if (r0Var18 == null) {
            l.v("cBinding");
            r0Var18 = null;
        }
        r0Var18.C.setWebChromeClient(new g());
        r0 r0Var19 = this.G;
        if (r0Var19 == null) {
            l.v("cBinding");
        } else {
            r0Var2 = r0Var19;
        }
        r0Var2.C.setWebViewClient(new h(this));
    }

    /* access modifiers changed from: private */
    public static final void W1(ClFeePayment clFeePayment, String str, String str2, String str3, String str4, long j10) {
        l.f(clFeePayment, "this$0");
        if (clFeePayment.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            androidx.core.app.b.s(clFeePayment, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(Dialog dialog, View view) {
        l.f(dialog, "$screen16");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z1(String str, String str2, ClFeePayment clFeePayment, Dialog dialog, View view) {
        l.f(str, "$url");
        l.f(str2, "$userAgent");
        l.f(clFeePayment, "this$0");
        l.f(dialog, "$screen16");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str2);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = clFeePayment.getSystemService("download");
        l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PayReceipt");
        String str4 = clFeePayment.H;
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

    public final ld.g C1() {
        ld.g gVar = this.Y;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final ld.f D1() {
        ld.f fVar = this.Z;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void I1(Integer num) {
        if (num != null && num.intValue() == 135) {
            T1();
        } else if (num != null && num.intValue() == 134) {
            S1();
        } else if (num != null && num.intValue() == 123) {
            R1();
        } else if (num != null && num.intValue() == 371) {
            U1();
        } else if (num != null && num.intValue() == 455) {
            L1("Next process is E-Sign Document");
        }
    }

    public final void N1(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.Z = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r0 x10 = r0.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        r0 r0Var = null;
        if (x10 == null) {
            l.v("cBinding");
            x10 = null;
        }
        setContentView(x10.m());
        N1(new ld.f(this));
        this.L = (q) new u0(this).a(q.class);
        F1();
        E1();
        V1();
        G1();
        r0 r0Var2 = this.G;
        if (r0Var2 == null) {
            l.v("cBinding");
            r0Var2 = null;
        }
        r0Var2.f28320z.f29577d.setOnClickListener(new e1(this));
        r0 r0Var3 = this.G;
        if (r0Var3 == null) {
            l.v("cBinding");
        } else {
            r0Var = r0Var3;
        }
        r0Var.f28318x.f25959e.setOnClickListener(new f1(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        s0.a.b(this).e(this.f7887b0);
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        r0 r0Var = this.G;
        if (r0Var == null) {
            l.v("cBinding");
            r0Var = null;
        }
        if (r0Var.C.canGoBack()) {
            onBackPressed();
            return true;
        }
        P1();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        r0 r0Var = this.G;
        r0 r0Var2 = null;
        if (r0Var == null) {
            l.v("cBinding");
            r0Var = null;
        }
        r0Var.B.onPause();
        r0 r0Var3 = this.G;
        if (r0Var3 == null) {
            l.v("cBinding");
        } else {
            r0Var2 = r0Var3;
        }
        r0Var2.B.pauseTimers();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        r0 r0Var = this.G;
        r0 r0Var2 = null;
        if (r0Var == null) {
            l.v("cBinding");
            r0Var = null;
        }
        r0Var.B.onResume();
        r0 r0Var3 = this.G;
        if (r0Var3 == null) {
            l.v("cBinding");
        } else {
            r0Var2 = r0Var3;
        }
        r0Var2.B.resumeTimers();
    }

    public final void x1(String str, String str2, String str3, String str4) {
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
        ((TextView) findViewById3).setOnClickListener(new k1(sb3, str2, this, dialog));
        ((TextView) findViewById4).setOnClickListener(new l1(dialog));
        dialog.show();
    }
}
