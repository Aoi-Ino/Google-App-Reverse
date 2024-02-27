package com.nic.mparivahan.VahanServices.VahanView;

import ai.p0;
import ai.q0;
import ai.r0;
import ai.t0;
import ai.u0;
import ai.v0;
import ai.w0;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.n;
import bi.o;
import cb.s0;
import cm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DmsUrlModle;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanXmlService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONObject;
import pl.x;

public final class VahanDms extends androidx.appcompat.app.d {

    /* renamed from: e0  reason: collision with root package name */
    public static final a f21465e0 = new a((cm.g) null);
    private String G;
    /* access modifiers changed from: private */
    public WebView H;
    private s0 I;
    /* access modifiers changed from: private */
    public boolean J;
    private AppCompatImageView K;
    private RelativeLayout L;
    public o M;
    private final VahanXmlService N = VahanXmlService.f21202a.a();
    public ProgressDialog O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public ChaangeOfAddressStatus U;
    public HptTerResponse V;
    public HPAResModle W;
    public dulicateRcResponseModle X;
    public bi.h Y;
    public VahanProService Z;

    /* renamed from: a0  reason: collision with root package name */
    public LinearLayout f21466a0;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public ValueCallback f21467b0;

    /* renamed from: c0  reason: collision with root package name */
    public BeforePaymentRequest f21468c0;

    /* renamed from: d0  reason: collision with root package name */
    private d.c f21469d0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final VahanDms f21470a;

        public b(VahanDms vahanDms) {
            l.f(vahanDms, "ctx");
            this.f21470a = vahanDms;
        }

        /* access modifiers changed from: private */
        public static final void b(b bVar) {
            l.f(bVar, "this$0");
            bVar.f21470a.u1();
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject(String.valueOf(str));
                if (jSONObject.has("applNo") && (string = jSONObject.getString("applNo")) != null && string.length() != 0) {
                    try {
                        this.f21470a.runOnUiThread(new a(this));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static final class c extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanDms f21471a;

        c(VahanDms vahanDms) {
            this.f21471a = vahanDms;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f21471a.J = true;
            this.f21471a.g2(false);
            WebView p12 = this.f21471a.H;
            WebView webView2 = null;
            if (p12 == null) {
                l.v("webView");
                p12 = null;
            }
            p12.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            WebView p13 = this.f21471a.H;
            if (p13 == null) {
                l.v("webView");
            } else {
                webView2 = p13;
            }
            webView2.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f21471a.g2(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f21471a.J = false;
            Objects.toString(webResourceError);
            this.f21471a.g2(false);
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

    public static final class d extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VahanDms f21472a;

        d(VahanDms vahanDms) {
            this.f21472a = vahanDms;
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            l.f(webView, "webView");
            l.f(valueCallback, "filePathCallback");
            l.f(fileChooserParams, "fileChooserParams");
            this.f21472a.f21467b0 = valueCallback;
            this.f21472a.B1().a(fileChooserParams.createIntent());
            return true;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDms f21473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanDms vahanDms) {
            super(1);
            this.f21473e = vahanDms;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f21473e.F1().isShowing()) {
                    this.f21473e.F1().dismiss();
                }
                Intent intent = new Intent(this.f21473e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f21473e.H1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                this.f21473e.startActivity(intent);
                this.f21473e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotUserDataModel) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDms f21474e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanDms vahanDms) {
            super(1);
            this.f21474e = vahanDms;
        }

        public final void b(String str) {
            try {
                if (this.f21474e.F1().isShowing()) {
                    this.f21474e.F1().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    VahanDms vahanDms = this.f21474e;
                    Toast.makeText(vahanDms, vahanDms.getString(R.string.no_internet), 0).show();
                    return;
                }
                this.f21474e.V1(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDms f21475e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanDms vahanDms) {
            super(1);
            this.f21475e = vahanDms;
        }

        public final void b(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            if (finalRequestSubmitResponse != null) {
                try {
                    if (finalRequestSubmitResponse.getApplication_status()) {
                        this.f21475e.v1();
                        return;
                    } else if (this.f21475e.F1().isShowing()) {
                        this.f21475e.F1().dismiss();
                    }
                } catch (Exception unused) {
                    if (this.f21475e.F1().isShowing()) {
                        this.f21475e.F1().dismiss();
                        VahanDms vahanDms = this.f21475e;
                        vahanDms.Y1(vahanDms, "Please Upload all the Required Documents then You will be able to do Final Submission of Application.");
                        return;
                    }
                    return;
                }
            } else if (this.f21475e.F1().isShowing()) {
                this.f21475e.F1().dismiss();
            }
            VahanDms vahanDms2 = this.f21475e;
            vahanDms2.Y1(vahanDms2, "Please Upload all the Required Documents then You will be able to do Final Submission of Application.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FinalRequestSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDms f21476e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VahanDms vahanDms) {
            super(1);
            this.f21476e = vahanDms;
        }

        public final void b(String str) {
            if (this.f21476e.F1().isShowing()) {
                this.f21476e.F1().dismiss();
                VahanDms vahanDms = this.f21476e;
                vahanDms.Y1(vahanDms, "Please Upload all the Required Documents then You will be able to do Final Submission of Application.");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21477a;

        i(bm.l lVar) {
            l.f(lVar, "function");
            this.f21477a = lVar;
        }

        public final pl.c a() {
            return this.f21477a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21477a.invoke(obj);
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

    public VahanDms() {
        d.c y02 = y0(new e.d(), new p0(this));
        l.e(y02, "registerForActivityResult(...)");
        this.f21469d0 = y02;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r4 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1(com.nic.mparivahan.VahanServices.VahanView.VahanDms r4, d.a r5) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r4, r0)
            int r0 = r5.d()
            r1 = -1
            java.lang.String r2 = "fileCallbackUri"
            r3 = 0
            if (r0 != r1) goto L_0x003a
            android.content.Intent r5 = r5.c()
            if (r5 == 0) goto L_0x001a
            android.net.Uri r5 = r5.getData()
            goto L_0x001b
        L_0x001a:
            r5 = r3
        L_0x001b:
            android.webkit.ValueCallback r4 = r4.f21467b0
            if (r5 == 0) goto L_0x0030
            if (r4 != 0) goto L_0x0025
            cm.l.v(r2)
            goto L_0x0026
        L_0x0025:
            r3 = r4
        L_0x0026:
            r4 = 1
            android.net.Uri[] r4 = new android.net.Uri[r4]
            r0 = 0
            r4[r0] = r5
            r3.onReceiveValue(r4)
            goto L_0x0048
        L_0x0030:
            if (r4 != 0) goto L_0x0036
        L_0x0032:
            cm.l.v(r2)
            r4 = r3
        L_0x0036:
            r4.onReceiveValue(r3)
            goto L_0x0048
        L_0x003a:
            int r5 = r5.d()
            android.webkit.ValueCallback r4 = r4.f21467b0
            if (r5 != 0) goto L_0x0045
            if (r4 != 0) goto L_0x0036
            goto L_0x0032
        L_0x0045:
            if (r4 != 0) goto L_0x0036
            goto L_0x0032
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDms.A1(com.nic.mparivahan.VahanServices.VahanView.VahanDms, d.a):void");
    }

    private final void N1() {
        WebView webView = this.H;
        WebView webView2 = null;
        if (webView == null) {
            l.v("webView");
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.H;
        if (webView3 == null) {
            l.v("webView");
            webView3 = null;
        }
        webView3.getSettings().setLoadWithOverviewMode(true);
        WebView webView4 = this.H;
        if (webView4 == null) {
            l.v("webView");
            webView4 = null;
        }
        webView4.getSettings().setUseWideViewPort(true);
        WebView webView5 = this.H;
        if (webView5 == null) {
            l.v("webView");
            webView5 = null;
        }
        webView5.getSettings().setDomStorageEnabled(true);
        WebView webView6 = this.H;
        if (webView6 == null) {
            l.v("webView");
            webView6 = null;
        }
        webView6.getSettings().setAllowFileAccess(true);
        WebView webView7 = this.H;
        if (webView7 == null) {
            l.v("webView");
            webView7 = null;
        }
        webView7.getSettings().setAllowContentAccess(true);
        WebView webView8 = this.H;
        if (webView8 == null) {
            l.v("webView");
            webView8 = null;
        }
        webView8.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebView webView9 = this.H;
        if (webView9 == null) {
            l.v("webView");
            webView9 = null;
        }
        webView9.requestFocus(130);
        WebView webView10 = this.H;
        if (webView10 == null) {
            l.v("webView");
            webView10 = null;
        }
        webView10.reload();
        WebView webView11 = this.H;
        if (webView11 == null) {
            l.v("webView");
        } else {
            webView2 = webView11;
        }
        webView2.setInitialScale(1);
        if (O1() && O1() && !this.J) {
            P1();
        }
    }

    private final boolean O1() {
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

    private final void P1() {
        WebView webView = this.H;
        WebView webView2 = null;
        if (webView == null) {
            l.v("webView");
            webView = null;
        }
        String str = this.G;
        if (str == null) {
            l.v("printUrl");
            str = null;
        }
        webView.loadUrl(str);
        WebView webView3 = this.H;
        if (webView3 == null) {
            l.v("webView");
            webView3 = null;
        }
        webView3.addJavascriptInterface(new b(this), "HtmlViewer");
        WebView webView4 = this.H;
        if (webView4 == null) {
            l.v("webView");
            webView4 = null;
        }
        webView4.setWebViewClient(new c(this));
        WebView webView5 = this.H;
        if (webView5 == null) {
            l.v("webView");
        } else {
            webView2 = webView5;
        }
        webView2.setWebChromeClient(new d(this));
    }

    /* access modifiers changed from: private */
    public static final void Q1(VahanDms vahanDms, DmsUrlModle dmsUrlModle) {
        l.f(vahanDms, "this$0");
        vahanDms.F1().dismiss();
        vahanDms.G = q.B0(dmsUrlModle.getUrlDocUpload().toString()).toString();
        vahanDms.N1();
    }

    /* access modifiers changed from: private */
    public static final void R1(VahanDms vahanDms, String str) {
        l.f(vahanDms, "this$0");
        vahanDms.F1().dismiss();
        vahanDms.a2();
    }

    /* access modifiers changed from: private */
    public static final void S1(VahanDms vahanDms, View view) {
        l.f(vahanDms, "this$0");
        VUtility.Companion.v(vahanDms, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: private */
    public static final void T1(VahanDms vahanDms, View view) {
        l.f(vahanDms, "this$0");
        vahanDms.U1();
    }

    private final void U1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void V1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new v0(dialog));
        textView2.setOnClickListener(new w0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void X1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, VahanDms vahanDms, View view) {
        l.f(dialog, "$d");
        l.f(vahanDms, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(vahanDms, VahanDms.class);
        intent.putExtra("state_code", vahanDms.L1());
        intent.putExtra(VContant.APP_NO, vahanDms.x1());
        intent.putExtra("rc_number", vahanDms.I1());
        intent.putExtra(VContant.PURPOSE_CODE, vahanDms.H1());
        intent.putExtra("off_code", vahanDms.E1());
        intent.putExtra(VContant.FINAL_SUBMIT, vahanDms.G1());
        vahanDms.startActivity(intent);
        vahanDms.finish();
    }

    /* access modifiers changed from: private */
    public final void g2(boolean z10) {
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

    /* access modifiers changed from: private */
    public final void u1() {
        try {
            if (F1().isShowing()) {
                F1().dismiss();
            }
            F1().show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void v1() {
        try {
            K1().l(this, x1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void w1() {
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5001);
        }
    }

    public final d.c B1() {
        return this.f21469d0;
    }

    public final HPAResModle C1() {
        HPAResModle hPAResModle = this.W;
        if (hPAResModle != null) {
            return hPAResModle;
        }
        l.v("hpaObject");
        return null;
    }

    public final HptTerResponse D1() {
        HptTerResponse hptTerResponse = this.V;
        if (hptTerResponse != null) {
            return hptTerResponse;
        }
        l.v("hptObject");
        return null;
    }

    public final String E1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("offCd");
        return null;
    }

    public final ProgressDialog F1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final BeforePaymentRequest G1() {
        BeforePaymentRequest beforePaymentRequest = this.f21468c0;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        l.v("paymentRequest");
        return null;
    }

    public final String H1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final String I1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("rc_no");
        return null;
    }

    public final VahanProService J1() {
        VahanProService vahanProService = this.Z;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("slotService");
        return null;
    }

    public final bi.h K1() {
        bi.h hVar = this.Y;
        if (hVar != null) {
            return hVar;
        }
        l.v("slotViewModel");
        return null;
    }

    public final String L1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("state_code");
        return null;
    }

    public final o M1() {
        o oVar = this.M;
        if (oVar != null) {
            return oVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void Y1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validate_pop_up_for_document);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new u0(dialog, this));
        dialog.show();
    }

    public final void a2() {
        Intent intent = new Intent(this, FeesDetailsScreen.class);
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHICATION_TERMINATION_CODE);
            intent.putExtra(VContant.HYPOTHICATION_TERMINATION_CODE, D1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_ADDITION_CODE);
            intent.putExtra(VContant.HYPOTHECATION_ADDITION_CODE, C1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_RC_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_RC_CODE);
            intent.putExtra(VContant.DUPLICATE_RC_CODE, z1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.CHANGE_OF_ADDRESS_CODE);
            intent.putExtra("COV", y1());
        }
        intent.putExtra(VContant.APP_NO, x1());
        intent.putExtra("state_code", L1());
        intent.putExtra("rc_number", I1());
        intent.putExtra(VContant.PURPOSE_CODE, H1());
        startActivity(intent);
        finish();
    }

    public final void b2(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void c2(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f21466a0 = linearLayout;
    }

    public final void d2(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void e2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final void f2(BeforePaymentRequest beforePaymentRequest) {
        l.f(beforePaymentRequest, "<set-?>");
        this.f21468c0 = beforePaymentRequest;
    }

    public final void h2(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void i2(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void j2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.Z = vahanProService;
    }

    public final void k2(bi.h hVar) {
        l.f(hVar, "<set-?>");
        this.Y = hVar;
    }

    public final void l2(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void m2(o oVar) {
        l.f(oVar, "<set-?>");
        this.M = oVar;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_informational_web_view);
        View findViewById = findViewById(R.id.paymentWv);
        l.e(findViewById, "findViewById(...)");
        this.H = (WebView) findViewById;
        View findViewById2 = findViewById(R.id.next_button);
        l.e(findViewById2, "findViewById(...)");
        c2((LinearLayout) findViewById2);
        e2(new ProgressDialog(this));
        F1().setMessage("Please wait...");
        F1().setCancelable(false);
        F1().setCanceledOnTouchOutside(false);
        j2(VahanProService.f21196b.b(this));
        k2((bi.h) new androidx.lifecycle.u0((x0) this, (u0.b) new bi.g(new wg.d(J1()))).a(bi.h.class));
        m2((o) new androidx.lifecycle.u0((x0) this, (u0.b) new n(new wg.f(this.N))).a(o.class));
        w1();
        try {
            String stringExtra = getIntent().getStringExtra("state_code");
            l.c(stringExtra);
            l2(stringExtra);
            String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
            l.c(stringExtra2);
            b2(stringExtra2);
            String stringExtra3 = getIntent().getStringExtra("rc_number");
            l.c(stringExtra3);
            i2(stringExtra3);
            String stringExtra4 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
            l.c(stringExtra4);
            h2(stringExtra4);
            String stringExtra5 = getIntent().getStringExtra("off_code");
            l.c(stringExtra5);
            d2(stringExtra5);
            Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
            l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
            f2((BeforePaymentRequest) serializableExtra);
            F1().show();
            M1().g(L1(), x1(), I1(), H1());
            M1().i().g(this, new q0(this));
            M1().h().g(this, new r0(this));
            K1().T0().g(this, new i(new e(this)));
            K1().S0().g(this, new i(new f(this)));
            K1().Q().g(this, new i(new g(this)));
            K1().R().g(this, new i(new h(this)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        View findViewById3 = findViewById(R.id.mvvm_back);
        l.e(findViewById3, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById3;
        this.K = appCompatImageView;
        RelativeLayout relativeLayout = null;
        if (appCompatImageView == null) {
            l.v("mvvm_back");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new ai.s0(this));
        View findViewById4 = findViewById(R.id.nexGenHolder);
        l.e(findViewById4, "findViewById(...)");
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById4;
        this.L = relativeLayout2;
        if (relativeLayout2 == null) {
            l.v("nexGenHolder");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new t0(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 5001) {
            if ((!(iArr.length == 0)) && iArr[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
                w1();
            }
        }
    }

    public final String x1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("appl_no");
        return null;
    }

    public final ChaangeOfAddressStatus y1() {
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.U;
        if (chaangeOfAddressStatus != null) {
            return chaangeOfAddressStatus;
        }
        l.v("confirm_details");
        return null;
    }

    public final dulicateRcResponseModle z1() {
        dulicateRcResponseModle dulicatercresponsemodle = this.X;
        if (dulicatercresponsemodle != null) {
            return dulicatercresponsemodle;
        }
        l.v("duplicate_RC");
        return null;
    }
}
