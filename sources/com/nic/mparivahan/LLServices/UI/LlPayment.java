package com.nic.mparivahan.LLServices.UI;

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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import fj.q;
import java.io.Serializable;
import java.util.List;
import ni.v5;
import pl.x;
import tb.e1;
import tb.f1;
import tb.g1;
import tb.h1;
import tb.i1;
import tb.j1;
import tb.k1;
import tb.l1;
import tb.m1;

public final class LlPayment extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public v5 G;
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
    public ld.f S;
    public FetchLlDetails T;
    /* access modifiers changed from: private */
    public String U = "";
    private final BroadcastReceiver V = new e(this);

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f9087a;

        public a(Context context) {
            l.f(context, "context");
            this.f9087a = context;
        }

        private final void a(String str, String str2) {
            Log.d("sender", "Broadcasting message");
            Intent intent = new Intent("success-payment-event");
            intent.putExtra("applNum", str);
            intent.putExtra("respCode", str2);
            s0.a.b(this.f9087a).d(intent);
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
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.LlPayment.a.showHTML(java.lang.String):void");
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
        final /* synthetic */ LlPayment f9088a;

        c(LlPayment llPayment) {
            this.f9088a = llPayment;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Log.e("url_app", String.valueOf(str));
            if (str != null) {
                String str2 = null;
                if (q.F(str, "callback/sarathiPGResponse", false, 2, (Object) null)) {
                    q t12 = this.f9088a.L;
                    if (t12 == null) {
                        l.v("viewModel");
                        t12 = null;
                    }
                    String p12 = this.f9088a.U;
                    String r12 = this.f9088a.I;
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
        final /* synthetic */ LlPayment f9089e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LlPayment llPayment) {
            super(1);
            this.f9089e = llPayment;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                this.f9089e.Q1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    public static final class e extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LlPayment f9090a;

        e(LlPayment llPayment) {
            this.f9090a = llPayment;
        }

        public void onReceive(Context context, Intent intent) {
            v5 v5Var = null;
            this.f9090a.U = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (this.f9090a.U.length() > 0 && stringExtra != null && stringExtra.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(hc.a.f12073a.x());
                sb2.append("PrintConformMob.jsp?applno=");
                String s12 = this.f9090a.H;
                if (s12 == null) {
                    l.v("mApplNo");
                    s12 = null;
                }
                sb2.append(s12);
                sb2.append("&dob=");
                String r12 = this.f9090a.I;
                if (r12 == null) {
                    l.v("mApplDob");
                    r12 = null;
                }
                sb2.append(r12);
                String sb3 = sb2.toString();
                Log.d("newReceiptUrl", sb3.toString());
                v5 q12 = this.f9090a.G;
                if (q12 == null) {
                    l.v("cBinding");
                } else {
                    v5Var = q12;
                }
                v5Var.C.setVisibility(8);
                this.f9090a.A1(sb3);
            }
            Log.d("receiver", "Got message: " + stringExtra);
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9091a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f9091a = lVar;
        }

        public final pl.c a() {
            return this.f9091a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9091a.invoke(obj);
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
        final /* synthetic */ LlPayment f9092a;

        h(LlPayment llPayment) {
            this.f9092a = llPayment;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f9092a.J = true;
            v5 q12 = this.f9092a.G;
            v5 v5Var = null;
            if (q12 == null) {
                l.v("cBinding");
                q12 = null;
            }
            q12.D.p();
            v5 q13 = this.f9092a.G;
            if (q13 == null) {
                l.v("cBinding");
                q13 = null;
            }
            q13.D.setVisibility(8);
            v5 q14 = this.f9092a.G;
            if (q14 == null) {
                l.v("cBinding");
                q14 = null;
            }
            q14.C.setVisibility(0);
            v5 q15 = this.f9092a.G;
            if (q15 == null) {
                l.v("cBinding");
                q15 = null;
            }
            q15.C.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            v5 q16 = this.f9092a.G;
            if (q16 == null) {
                l.v("cBinding");
            } else {
                v5Var = q16;
            }
            v5Var.C.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            v5 q12 = this.f9092a.G;
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
            this.f9092a.J = false;
            Log.e("dl-js", ("Got Error! " + webResourceError).toString());
            v5 q12 = this.f9092a.G;
            v5 v5Var = null;
            if (q12 == null) {
                l.v("cBinding");
                q12 = null;
            }
            q12.D.p();
            v5 q13 = this.f9092a.G;
            if (q13 == null) {
                l.v("cBinding");
            } else {
                v5Var = q13;
            }
            v5Var.D.setVisibility(8);
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
        v5 v5Var = this.G;
        v5 v5Var2 = null;
        if (v5Var == null) {
            l.v("cBinding");
            v5Var = null;
        }
        v5Var.B.setVisibility(0);
        v5 v5Var3 = this.G;
        if (v5Var3 == null) {
            l.v("cBinding");
            v5Var3 = null;
        }
        v5Var3.B.loadUrl(str);
        v5 v5Var4 = this.G;
        if (v5Var4 == null) {
            l.v("cBinding");
            v5Var4 = null;
        }
        v5Var4.B.getSettings().setJavaScriptEnabled(true);
        v5 v5Var5 = this.G;
        if (v5Var5 == null) {
            l.v("cBinding");
            v5Var5 = null;
        }
        v5Var5.B.setDownloadListener(new e1(this));
        v5 v5Var6 = this.G;
        if (v5Var6 == null) {
            l.v("cBinding");
            v5Var6 = null;
        }
        v5Var6.B.setWebChromeClient(new b());
        v5 v5Var7 = this.G;
        if (v5Var7 == null) {
            l.v("cBinding");
        } else {
            v5Var2 = v5Var7;
        }
        v5Var2.B.setWebViewClient(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void B1(LlPayment llPayment, String str, String str2, String str3, String str4, long j10) {
        l.f(llPayment, "this$0");
        if (llPayment.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            l.c(str);
            l.c(str2);
            l.c(str3);
            l.c(str4);
            llPayment.x1(str, str2, str3, str4);
            return;
        }
        androidx.core.app.b.s(llPayment, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    private final void F1() {
        q qVar = this.L;
        if (qVar == null) {
            l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new f(new d(this)));
    }

    private final void G1() {
        ld.f fVar = new ld.f(this);
        s0.a.b(this).c(this.V, new IntentFilter("success-payment-event"));
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            v5 v5Var = null;
            this.H = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.I = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            this.M = String.valueOf(getIntent().getStringExtra("DL"));
            this.N = String.valueOf(getIntent().getStringExtra("dob"));
            this.O = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
            l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.P = stringExtra;
            v5 v5Var2 = this.G;
            if (v5Var2 == null) {
                l.v("cBinding");
            } else {
                v5Var = v5Var2;
            }
            v5Var.f28983x.f25961g.setText(fVar.i());
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            O1((FetchLlDetails) serializableExtra);
        }
    }

    private final void H1() {
        v5 v5Var = this.G;
        v5 v5Var2 = null;
        if (v5Var == null) {
            l.v("cBinding");
            v5Var = null;
        }
        v5Var.f28985z.f29580g.setText(E1().i());
        v5 v5Var3 = this.G;
        if (v5Var3 == null) {
            l.v("cBinding");
            v5Var3 = null;
        }
        TextView textView = v5Var3.f28985z.f29581h;
        v5 v5Var4 = this.G;
        if (v5Var4 == null) {
            l.v("cBinding");
            v5Var4 = null;
        }
        textView.setPaintFlags(v5Var4.f28985z.f29581h.getPaintFlags() | 8);
        v5 v5Var5 = this.G;
        if (v5Var5 == null) {
            l.v("cBinding");
            v5Var5 = null;
        }
        TextView textView2 = v5Var5.f28985z.f29581h;
        String str = this.M;
        l.c(str);
        textView2.setText(q.B0(str).toString());
        v5 v5Var6 = this.G;
        if (v5Var6 == null) {
            l.v("cBinding");
        } else {
            v5Var2 = v5Var6;
        }
        v5Var2.f28985z.f29581h.setOnClickListener(new k1(this));
    }

    /* access modifiers changed from: private */
    public static final void I1(LlPayment llPayment, View view) {
        l.f(llPayment, "this$0");
        try {
            Intent intent = new Intent(llPayment, LlDetails.class);
            intent.putExtra("LLDetails", llPayment.C1());
            llPayment.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void K1(LlPayment llPayment, View view) {
        l.f(llPayment, "this$0");
        llPayment.finish();
    }

    /* access modifiers changed from: private */
    public static final void L1(LlPayment llPayment, View view) {
        l.f(llPayment, "this$0");
        llPayment.finish();
    }

    private final void M1(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new j1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, LlPayment llPayment, View view) {
        l.f(dialog, "$d");
        l.f(llPayment, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(llPayment, DashBoard.class);
        intent.setFlags(67108864);
        llPayment.startActivity(intent);
        llPayment.finish();
    }

    /* access modifiers changed from: private */
    public final void Q1(List list) {
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
            int parseInt = Integer.parseInt(D1().k());
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
        J1(num);
    }

    private final void R1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new f1(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void S1(LlPayment llPayment) {
        l.f(llPayment, "this$0");
        llPayment.K = false;
    }

    private final void T1() {
        try {
            Intent intent = new Intent(this, LlDocumentUpload.class);
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
            intent.putExtra("LLDetails", C1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void U1() {
        try {
            Intent intent = new Intent(this, LlPayment.class);
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
            intent.putExtra("LLDetails", C1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void V1() {
        try {
            Intent intent = new Intent(this, LlPhotoSignature.class);
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
            intent.putExtra("LLDetails", C1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void W1() {
        try {
            Intent intent = new Intent(this, LlSlots.class);
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
            intent.putExtra("LLDetails", C1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void X1() {
        v5 v5Var = this.G;
        v5 v5Var2 = null;
        if (v5Var == null) {
            l.v("cBinding");
            v5Var = null;
        }
        v5Var.C.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        v5 v5Var3 = this.G;
        if (v5Var3 == null) {
            l.v("cBinding");
            v5Var3 = null;
        }
        v5Var3.C.getSettings().setAllowFileAccess(true);
        v5 v5Var4 = this.G;
        if (v5Var4 == null) {
            l.v("cBinding");
            v5Var4 = null;
        }
        v5Var4.C.getSettings().setAllowContentAccess(true);
        v5 v5Var5 = this.G;
        if (v5Var5 == null) {
            l.v("cBinding");
            v5Var5 = null;
        }
        v5Var5.C.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        v5 v5Var6 = this.G;
        if (v5Var6 == null) {
            l.v("cBinding");
            v5Var6 = null;
        }
        v5Var6.C.getSettings().setSupportMultipleWindows(true);
        v5 v5Var7 = this.G;
        if (v5Var7 == null) {
            l.v("cBinding");
            v5Var7 = null;
        }
        v5Var7.C.getSettings().setJavaScriptEnabled(true);
        v5 v5Var8 = this.G;
        if (v5Var8 == null) {
            l.v("cBinding");
            v5Var8 = null;
        }
        v5Var8.C.getSettings().setDomStorageEnabled(true);
        v5 v5Var9 = this.G;
        if (v5Var9 == null) {
            l.v("cBinding");
            v5Var9 = null;
        }
        v5Var9.C.getSettings().setUseWideViewPort(true);
        v5 v5Var10 = this.G;
        if (v5Var10 == null) {
            l.v("cBinding");
            v5Var10 = null;
        }
        v5Var10.C.getSettings().setLoadWithOverviewMode(true);
        v5 v5Var11 = this.G;
        if (v5Var11 == null) {
            l.v("cBinding");
            v5Var11 = null;
        }
        v5Var11.C.getSettings().setBuiltInZoomControls(true);
        v5 v5Var12 = this.G;
        if (v5Var12 == null) {
            l.v("cBinding");
            v5Var12 = null;
        }
        v5Var12.C.clearCache(true);
        v5 v5Var13 = this.G;
        if (v5Var13 == null) {
            l.v("cBinding");
            v5Var13 = null;
        }
        v5Var13.C.reload();
        v5 v5Var14 = this.G;
        if (v5Var14 == null) {
            l.v("cBinding");
            v5Var14 = null;
        }
        v5Var14.C.requestFocus(130);
        v5 v5Var15 = this.G;
        if (v5Var15 == null) {
            l.v("cBinding");
            v5Var15 = null;
        }
        v5Var15.C.setDownloadListener(new i1(this));
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
        v5 v5Var16 = this.G;
        if (v5Var16 == null) {
            l.v("cBinding");
            v5Var16 = null;
        }
        v5Var16.C.loadUrl(sb3);
        v5 v5Var17 = this.G;
        if (v5Var17 == null) {
            l.v("cBinding");
            v5Var17 = null;
        }
        v5Var17.C.addJavascriptInterface(new a(this), "HtmlViewer");
        v5 v5Var18 = this.G;
        if (v5Var18 == null) {
            l.v("cBinding");
            v5Var18 = null;
        }
        v5Var18.C.setWebChromeClient(new g());
        v5 v5Var19 = this.G;
        if (v5Var19 == null) {
            l.v("cBinding");
        } else {
            v5Var2 = v5Var19;
        }
        v5Var2.C.setWebViewClient(new h(this));
    }

    /* access modifiers changed from: private */
    public static final void Y1(LlPayment llPayment, String str, String str2, String str3, String str4, long j10) {
        l.f(llPayment, "this$0");
        if (llPayment.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            androidx.core.app.b.s(llPayment, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(Dialog dialog, View view) {
        l.f(dialog, "$screen16");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z1(String str, String str2, LlPayment llPayment, Dialog dialog, View view) {
        l.f(str, "$url");
        l.f(str2, "$userAgent");
        l.f(llPayment, "this$0");
        l.f(dialog, "$screen16");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str2);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = llPayment.getSystemService("download");
        l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PayReceipt");
        String str4 = llPayment.H;
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

    public final FetchLlDetails C1() {
        FetchLlDetails fetchLlDetails = this.T;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        l.v("llDetails");
        return null;
    }

    public final ld.g D1() {
        ld.g gVar = this.R;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final ld.f E1() {
        ld.f fVar = this.S;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarathiSession");
        return null;
    }

    public final void J1(Integer num) {
        if (num != null && num.intValue() == 135) {
            V1();
        } else if (num != null && num.intValue() == 134) {
            U1();
        } else if (num != null && num.intValue() == 123) {
            T1();
        } else if (num != null && num.intValue() == 371) {
            W1();
        } else if (num != null && num.intValue() == 455) {
            M1("Next process is E-Sign Document");
        }
    }

    public final void O1(FetchLlDetails fetchLlDetails) {
        l.f(fetchLlDetails, "<set-?>");
        this.T = fetchLlDetails;
    }

    public final void P1(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.S = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v5 x10 = v5.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        v5 v5Var = null;
        if (x10 == null) {
            l.v("cBinding");
            x10 = null;
        }
        setContentView(x10.m());
        this.L = (q) new u0(this).a(q.class);
        P1(new ld.f(this));
        G1();
        F1();
        X1();
        H1();
        v5 v5Var2 = this.G;
        if (v5Var2 == null) {
            l.v("cBinding");
            v5Var2 = null;
        }
        v5Var2.f28985z.f29577d.setOnClickListener(new g1(this));
        v5 v5Var3 = this.G;
        if (v5Var3 == null) {
            l.v("cBinding");
        } else {
            v5Var = v5Var3;
        }
        v5Var.f28983x.f25959e.setOnClickListener(new h1(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        s0.a.b(this).e(this.V);
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        v5 v5Var = this.G;
        if (v5Var == null) {
            l.v("cBinding");
            v5Var = null;
        }
        if (v5Var.C.canGoBack()) {
            onBackPressed();
            return true;
        }
        R1();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        v5 v5Var = this.G;
        v5 v5Var2 = null;
        if (v5Var == null) {
            l.v("cBinding");
            v5Var = null;
        }
        v5Var.B.onPause();
        v5 v5Var3 = this.G;
        if (v5Var3 == null) {
            l.v("cBinding");
        } else {
            v5Var2 = v5Var3;
        }
        v5Var2.B.pauseTimers();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        v5 v5Var = this.G;
        v5 v5Var2 = null;
        if (v5Var == null) {
            l.v("cBinding");
            v5Var = null;
        }
        v5Var.B.onResume();
        v5 v5Var3 = this.G;
        if (v5Var3 == null) {
            l.v("cBinding");
        } else {
            v5Var2 = v5Var3;
        }
        v5Var2.B.resumeTimers();
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
        ((TextView) findViewById3).setOnClickListener(new l1(sb3, str2, this, dialog));
        ((TextView) findViewById4).setOnClickListener(new m1(dialog));
        dialog.show();
    }
}
