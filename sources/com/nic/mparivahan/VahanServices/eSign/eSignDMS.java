package com.nic.mparivahan.VahanServices.eSign;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cb.s0;
import cm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.DocUpdateLogs;
import com.nic.mparivahan.VahanServices.VahanLog.VahanLogUpdateDoc;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanFaceLessConfirmation;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import ni.ta;
import org.json.JSONObject;
import pl.x;
import v9.d;

public final class eSignDMS extends androidx.appcompat.app.d {

    /* renamed from: g0  reason: collision with root package name */
    public static final a f21594g0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public s0 G;
    /* access modifiers changed from: private */
    public boolean H;
    public ProgressDialog I;
    public VahanProService J;
    public bi.h K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public je.c Q;
    public DMSService R;
    public BeforePaymentRequest S;
    public ta T;
    private int U = -1;
    private boolean V;
    public String W;
    public NrvDetails X;
    public String Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    private String f21595a0 = " ";

    /* renamed from: b0  reason: collision with root package name */
    private double f21596b0;

    /* renamed from: c0  reason: collision with root package name */
    private String f21597c0 = " ";

    /* renamed from: d0  reason: collision with root package name */
    private String f21598d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    public ld.c f21599e0;

    /* renamed from: f0  reason: collision with root package name */
    private ValueCallback f21600f0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final eSignDMS f21601a;

        public b(eSignDMS esigndms) {
            l.f(esigndms, "ctx");
            this.f21601a = esigndms;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            JSONObject jSONObject;
            String string;
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.has("respCode") && (string = jSONObject.getString("respCode")) != null) {
                if (string.length() != 0) {
                    if (p.o(string, "1", true)) {
                        this.f21601a.r1();
                    }
                }
            }
        }
    }

    public static final class c extends WebChromeClient {
        c() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public static final class d extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ eSignDMS f21602a;

        d(eSignDMS esigndms) {
            this.f21602a = esigndms;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f21602a.H = true;
            this.f21602a.g2(false);
            this.f21602a.x1().f28724d.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s0 n12 = this.f21602a.G;
            if (n12 != null) {
                n12.b();
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            l.f(webView, "view");
            l.f(webResourceRequest, "request");
            l.f(webResourceError, "error");
            this.f21602a.H = false;
            this.f21602a.g2(false);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView == null) {
                return true;
            }
            webView.loadUrl(valueOf);
            return true;
        }
    }

    public static final class e extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ eSignDMS f21603a;

        e(eSignDMS esigndms) {
            this.f21603a = esigndms;
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            l.f(webView, "mWebView");
            l.f(valueCallback, "filePathCallback");
            l.f(fileChooserParams, "fileChooserParams");
            if (this.f21603a.K1() != null) {
                ValueCallback K1 = this.f21603a.K1();
                l.c(K1);
                K1.onReceiveValue((Object) null);
                this.f21603a.o2((ValueCallback) null);
            }
            this.f21603a.o2(valueCallback);
            Intent createIntent = fileChooserParams.createIntent();
            try {
                eSignDMS esigndms = this.f21603a;
                l.c(createIntent);
                esigndms.startActivityForResult(createIntent, 100);
                return true;
            } catch (ActivityNotFoundException unused) {
                this.f21603a.o2((ValueCallback) null);
                return false;
            }
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ eSignDMS f21604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(eSignDMS esigndms) {
            super(1);
            this.f21604e = esigndms;
        }

        public final void b(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            eSignDMS esigndms;
            ld.c z12;
            if (finalRequestSubmitResponse != null) {
                try {
                    if (!finalRequestSubmitResponse.getApplication_status()) {
                        if (this.f21604e.B1().isShowing()) {
                            this.f21604e.B1().dismiss();
                        }
                        esigndms = this.f21604e;
                        z12 = esigndms.z1();
                    } else if (this.f21604e.N1()) {
                        Intent intent = new Intent(this.f21604e, VahanFaceLessConfirmation.class);
                        intent.putExtra("state_code", this.f21604e.J1());
                        intent.putExtra("rc_number", this.f21604e.E1());
                        intent.putExtra(VContant.APP_NO, this.f21604e.w1());
                        intent.putExtra(VContant.PURPOSE_CODE, this.f21604e.D1());
                        this.f21604e.startActivity(intent);
                        this.f21604e.finish();
                        return;
                    } else {
                        this.f21604e.s1();
                        return;
                    }
                } catch (Exception unused) {
                    if (this.f21604e.B1().isShowing()) {
                        this.f21604e.B1().dismiss();
                        eSignDMS esigndms2 = this.f21604e;
                        esigndms2.U1(esigndms2, esigndms2.z1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                        return;
                    }
                    return;
                }
            } else {
                if (this.f21604e.B1().isShowing()) {
                    this.f21604e.B1().dismiss();
                }
                esigndms = this.f21604e;
                z12 = esigndms.z1();
            }
            esigndms.U1(esigndms, z12.b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FinalRequestSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ eSignDMS f21605e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(eSignDMS esigndms) {
            super(1);
            this.f21605e = esigndms;
        }

        public final void b(String str) {
            if (this.f21605e.B1().isShowing()) {
                this.f21605e.B1().dismiss();
                eSignDMS esigndms = this.f21605e;
                esigndms.U1(esigndms, esigndms.z1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ eSignDMS f21606e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(eSignDMS esigndms) {
            super(1);
            this.f21606e = esigndms;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f21606e.B1().isShowing()) {
                    this.f21606e.B1().dismiss();
                }
                Intent intent = new Intent(this.f21606e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f21606e.D1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", this.f21606e.F1());
                intent.putExtra("RcDetails", this.f21606e.G1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21606e.N1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21606e.v1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21606e.u1());
                this.f21606e.startActivity(intent);
                this.f21606e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotUserDataModel) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ eSignDMS f21607e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(eSignDMS esigndms) {
            super(1);
            this.f21607e = esigndms;
        }

        public final void b(String str) {
            try {
                if (this.f21607e.B1().isShowing()) {
                    this.f21607e.B1().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    eSignDMS esigndms = this.f21607e;
                    Toast.makeText(esigndms, esigndms.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null) {
                    if (!p.q(str)) {
                        eSignDMS esigndms2 = this.f21607e;
                        esigndms2.R1(esigndms2, str);
                        return;
                    }
                }
                eSignDMS esigndms3 = this.f21607e;
                esigndms3.R1(esigndms3, esigndms3.getString(R.string.service_unavable_please_try));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21608a;

        j(bm.l lVar) {
            l.f(lVar, "function");
            this.f21608a = lVar;
        }

        public final pl.c a() {
            return this.f21608a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21608a.invoke(obj);
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

    private final void L1() {
        WebView webView;
        b bVar;
        x1().f28722b.f25959e.setOnClickListener(new ci.d(this));
        x1().f28724d.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        x1().f28724d.getSettings().setAllowFileAccess(true);
        x1().f28724d.getSettings().setAllowContentAccess(true);
        x1().f28724d.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        x1().f28724d.getSettings().setJavaScriptEnabled(true);
        x1().f28724d.getSettings().setDomStorageEnabled(true);
        x1().f28724d.getSettings().setUseWideViewPort(true);
        x1().f28724d.getSettings().setLoadWithOverviewMode(true);
        x1().f28724d.getSettings().setBuiltInZoomControls(true);
        x1().f28724d.getSettings().setSupportMultipleWindows(true);
        x1().f28724d.clearCache(true);
        x1().f28724d.reload();
        x1().f28724d.requestFocus(130);
        String str = this.f21598d0;
        CookieManager.getInstance().setAcceptCookie(true);
        Log.e("URL", str);
        x1().f28724d.getSettings().setJavaScriptEnabled(true);
        x1().f28724d.loadUrl(str);
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            webView = x1().f28724d;
            bVar = new b(this);
        } else {
            webView = x1().f28724d;
            bVar = new b(this);
        }
        webView.addJavascriptInterface(bVar, "HtmlViewer");
        x1().f28724d.setWebChromeClient(new c());
        x1().f28724d.setWebViewClient(new d(this));
        x1().f28724d.setWebChromeClient(new e(this));
    }

    /* access modifiers changed from: private */
    public static final void M1(eSignDMS esigndms, View view) {
        l.f(esigndms, "this$0");
        if (esigndms.x1().f28724d.canGoBack()) {
            esigndms.x1().f28724d.goBack();
        } else {
            esigndms.p2();
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(eSignDMS esigndms, View view) {
        l.f(esigndms, "this$0");
        Intent intent = new Intent(esigndms, VahanVehicleDetailsService.class);
        intent.putExtra("RC", esigndms.F1());
        intent.putExtra("RcDetails", esigndms.G1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, esigndms.V);
        intent.putExtra(VContant.NEXGEN_addahar_name, esigndms.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, esigndms.u1());
        esigndms.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void P1(eSignDMS esigndms, View view) {
        l.f(esigndms, "this$0");
        VUtility.Companion.v(esigndms, esigndms.z1().b("are_you_sure_you_want_to_leave", esigndms.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void Q1(eSignDMS esigndms, View view) {
        l.f(esigndms, "this$0");
        Intent intent = new Intent(esigndms, VahanVehicleDetailsService.class);
        intent.putExtra("RC", esigndms.F1());
        intent.putExtra("RcDetails", esigndms.G1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, esigndms.V);
        intent.putExtra(VContant.NEXGEN_addahar_name, esigndms.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, esigndms.u1());
        esigndms.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public final void R1(Context context, String str) {
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
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ci.f(dialog));
        textView2.setOnClickListener(new ci.g(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void S1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void V1(Dialog dialog, eSignDMS esigndms, View view) {
        l.f(dialog, "$d");
        l.f(esigndms, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(esigndms, eSignDMS.class);
        intent.putExtra("state_code", esigndms.J1());
        intent.putExtra(VContant.APP_NO, esigndms.w1());
        intent.putExtra("rc_number", esigndms.E1());
        intent.putExtra(VContant.PURPOSE_CODE, esigndms.D1());
        intent.putExtra("off_code", esigndms.A1());
        intent.putExtra(VContant.FINAL_SUBMIT, esigndms.C1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, esigndms.V);
        intent.putExtra("RC", esigndms.F1());
        intent.putExtra("RcDetails", esigndms.G1());
        intent.putExtra("vahlogReptDate", esigndms.f21595a0);
        intent.putExtra("vahlogFeeAmt", esigndms.f21596b0);
        intent.putExtra("vahlogReptNo", esigndms.f21597c0);
        intent.putExtra(VContant.NEXGEN_addahar_name, esigndms.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, esigndms.u1());
        esigndms.startActivity(intent);
        esigndms.finish();
    }

    /* access modifiers changed from: private */
    public final void g2(boolean z10) {
        if (!z10) {
            try {
                s0 s0Var = this.G;
                if (s0Var != null) {
                    s0Var.a();
                }
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                Log.e("Error", x.f30437a.toString());
            }
        }
    }

    private final void p2() {
        VUtility.Companion.v(this, z1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public final void s1() {
        try {
            I1().l(this, w1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void t1() {
        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
        if (checkSelfPermission(str) == -1) {
            requestPermissions(new String[]{str}, 5001);
        }
    }

    public final String A1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("offCd");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final BeforePaymentRequest C1() {
        BeforePaymentRequest beforePaymentRequest = this.S;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        l.v("paymentRequest");
        return null;
    }

    public final String D1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final String E1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("rc_no");
        return null;
    }

    public final String F1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails G1() {
        NrvDetails nrvDetails = this.X;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService H1() {
        VahanProService vahanProService = this.J;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("slotService");
        return null;
    }

    public final bi.h I1() {
        bi.h hVar = this.K;
        if (hVar != null) {
            return hVar;
        }
        l.v("slotViewModel");
        return null;
    }

    public final String J1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("state_code");
        return null;
    }

    public final ValueCallback K1() {
        return this.f21600f0;
    }

    public final boolean N1() {
        return this.V;
    }

    public final void U1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new ci.e(dialog, this));
        dialog.show();
    }

    public final void W1(String str) {
        l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void X1(String str) {
        l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void Y1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void Z1(ta taVar) {
        l.f(taVar, "<set-?>");
        this.T = taVar;
    }

    public final void a2(DMSService dMSService) {
        l.f(dMSService, "<set-?>");
        this.R = dMSService;
    }

    public final void b2(je.c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void c2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f21599e0 = cVar;
    }

    public final void d2(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void e2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void f2(BeforePaymentRequest beforePaymentRequest) {
        l.f(beforePaymentRequest, "<set-?>");
        this.S = beforePaymentRequest;
    }

    public final void h2(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void i2(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void j2(String str) {
        l.f(str, "<set-?>");
        this.W = str;
    }

    public final void k2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.X = nrvDetails;
    }

    public final void l2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.J = vahanProService;
    }

    public final void m2(bi.h hVar) {
        l.f(hVar, "<set-?>");
        this.K = hVar;
    }

    public final void n2(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void o2(ValueCallback valueCallback) {
        this.f21600f0 = valueCallback;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        ValueCallback valueCallback;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 && (valueCallback = this.f21600f0) != null) {
            l.c(valueCallback);
            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i11, intent));
            this.f21600f0 = null;
        }
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, z1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.esign_dms);
        ta c10 = ta.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        Z1(c10);
        setContentView((View) x1().b());
        c2(new ld.c(this));
        l2(VahanProService.f21196b.b(this));
        a2(DMSService.f20571a.b(this));
        this.f21598d0 = String.valueOf(getIntent().getStringExtra("URL"));
        String stringExtra = getIntent().getStringExtra("state_code");
        l.c(stringExtra);
        n2(stringExtra);
        String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
        l.c(stringExtra2);
        Y1(stringExtra2);
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
        this.V = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        X1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        W1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        j2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        k2((NrvDetails) serializableExtra2);
        this.f21595a0 = String.valueOf(getIntent().getStringExtra("vahlogReptDate"));
        this.f21596b0 = getIntent().getDoubleExtra("vahlogFeeAmt", 0.0d);
        this.f21597c0 = String.valueOf(getIntent().getStringExtra("vahlogReptNo"));
        e2(new ProgressDialog(this));
        B1().setMessage("Please wait...");
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        L1();
        TextView textView = x1().f28725e;
        textView.setText(z1().b("vehicle_no", "Vehicle No.:") + ' ' + F1());
        x1().f28726f.setText(z1().b("view_vehicle_details", "View Vehicle Details"));
        x1().f28726f.setPaintFlags(x1().f28726f.getPaintFlags() | 8);
        x1().f28726f.setOnClickListener(new ci.a(this));
        x1().f28722b.f25959e.setOnClickListener(new ci.b(this));
        m2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(H1()))).a(bi.h.class));
        b2((je.c) new u0((x0) this, (u0.b) new je.b(new je.a(y1()))).a(je.c.class));
        try {
            x1().f28722b.f25961g.setText(VContant.Companion.I(this, D1()));
            x1().f28726f.setText(z1().b("view_vehicle_details", "View Vehicle Details"));
            x1().f28726f.setPaintFlags(x1().f28726f.getPaintFlags() | 8);
            x1().f28726f.setOnClickListener(new ci.c(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        I1().Q().g(this, new j(new f(this)));
        I1().R().g(this, new j(new g(this)));
        I1().T0().g(this, new j(new h(this)));
        I1().S0().g(this, new j(new i(this)));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (x1().f28724d.canGoBack()) {
            onBackPressed();
            return true;
        }
        p2();
        return true;
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 5001) {
            if ((!(iArr.length == 0)) && iArr[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
                t1();
            }
        }
    }

    public final void r1() {
        try {
            String.valueOf(System.currentTimeMillis());
            String str = this.f21595a0;
            String str2 = this.f21597c0;
            double d10 = this.f21596b0;
            String w12 = w1();
            String F1 = F1();
            d.a aVar = v9.d.f17494a;
            VahanLogUpdateDoc.f20968k.a(this, new DocUpdateLogs(str, str, str2, d10, w12, F1, aVar.m(), aVar.m()));
        } catch (Exception e10) {
            e10.toString();
        }
        B1().show();
        BeforePaymentRequestfinal beforePaymentRequestfinal = r2;
        BeforePaymentRequestfinal beforePaymentRequestfinal2 = new BeforePaymentRequestfinal(C1().getAadharauth(), w1(), C1().getChanngeOfAdressDto(), C1().getComp_cd(), C1().getDurcdto(), C1().getFir_dt(), C1().getFir_no(), C1().getHpaDto(), C1().getHptDto(), C1().getIdv(), String.valueOf(C1().getIns_from()), C1().getIns_type(), String.valueOf(C1().getIns_upto()), C1().getMsg().toString(), C1().getNocDto(), C1().getOff_cd().toString(), C1().getOp_dt().toString(), C1().getPolice_station().toString(), C1().getPolicy_no().toString(), C1().getPur_cd().toString(), this.f21595a0, this.f21597c0, String.valueOf(this.f21596b0), C1().getReason(), C1().getRegn_no().toString(), C1().getState_cd().toString(), C1().getState_header().toString(), C1().getStatus().toString(), C1().getTax_mode().toString(), C1().getVh_class());
        I1().o1(beforePaymentRequestfinal);
    }

    public final String u1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String v1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final String w1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("appl_no");
        return null;
    }

    public final ta x1() {
        ta taVar = this.T;
        if (taVar != null) {
            return taVar;
        }
        l.v("binding");
        return null;
    }

    public final DMSService y1() {
        DMSService dMSService = this.R;
        if (dMSService != null) {
            return dMSService;
        }
        l.v("dmsService");
        return null;
    }

    public final ld.c z1() {
        ld.c cVar = this.f21599e0;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }
}
