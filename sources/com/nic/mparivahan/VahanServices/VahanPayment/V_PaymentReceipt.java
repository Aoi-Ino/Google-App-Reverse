package com.nic.mparivahan.VahanServices.VahanPayment;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import java.util.HashMap;
import ld.g;
import ni.u8;
import vg.b;

public final class V_PaymentReceipt extends d {
    private u8 G;
    private String H = "";
    private String I;
    public ProgressDialog J;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        private boolean f21159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ V_PaymentReceipt f21160b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f21161c;

        a(V_PaymentReceipt v_PaymentReceipt, String str) {
            this.f21160b = v_PaymentReceipt;
            this.f21161c = str;
        }

        public void onPageFinished(WebView webView, String str) {
            if (this.f21159a) {
                this.f21160b.j1().dismiss();
                this.f21160b.i1();
                return;
            }
            this.f21160b.n1(this.f21161c);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f21159a = true;
            Log.e("test", String.valueOf(str));
        }
    }

    /* access modifiers changed from: private */
    public final void i1() {
        try {
            g gVar = new g(this);
            CookieManager instance = CookieManager.getInstance();
            String str = this.I;
            String str2 = null;
            if (str == null) {
                l.v("url");
                str = null;
            }
            String cookie = instance.getCookie(str);
            Object systemService = getSystemService("download");
            l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager downloadManager = (DownloadManager) systemService;
            String str3 = this.I;
            if (str3 == null) {
                l.v("url");
            } else {
                str2 = str3;
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
            request.addRequestHeader("Cookie", cookie);
            request.addRequestHeader("Content-Type", "application/pdf");
            request.addRequestHeader("Authorization", "Bearer " + gVar.r());
            request.setNotificationVisibility(1);
            request.setDestinationInExternalFilesDir(getApplicationContext(), Environment.DIRECTORY_DOWNLOADS, "");
            request.setTitle(this.H);
            downloadManager.enqueue(request);
            Toast.makeText(this, "Receipt successfully saved in storage.", 1).show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void k1(V_PaymentReceipt v_PaymentReceipt, View view) {
        l.f(v_PaymentReceipt, "this$0");
        v_PaymentReceipt.finish();
    }

    /* access modifiers changed from: private */
    public static final void l1(View view) {
    }

    public final ProgressDialog j1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final void m1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void n1(String str) {
        l.f(str, "imageString");
        try {
            j1().show();
            g gVar = new g(this);
            HashMap hashMap = new HashMap();
            hashMap.put("Authorization", "Bearer " + gVar.r());
            u8 u8Var = this.G;
            u8 u8Var2 = null;
            if (u8Var == null) {
                l.v("binding");
                u8Var = null;
            }
            u8Var.f28857e.invalidate();
            u8 u8Var3 = this.G;
            if (u8Var3 == null) {
                l.v("binding");
                u8Var3 = null;
            }
            u8Var3.f28857e.getSettings().setJavaScriptEnabled(true);
            u8 u8Var4 = this.G;
            if (u8Var4 == null) {
                l.v("binding");
                u8Var4 = null;
            }
            u8Var4.f28857e.getSettings().setSupportZoom(true);
            u8 u8Var5 = this.G;
            if (u8Var5 == null) {
                l.v("binding");
                u8Var5 = null;
            }
            u8Var5.f28857e.loadUrl(str, hashMap);
            u8 u8Var6 = this.G;
            if (u8Var6 == null) {
                l.v("binding");
            } else {
                u8Var2 = u8Var6;
            }
            u8Var2.f28857e.setWebViewClient(new a(this, str));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_v__payment_receipt);
        u8 c10 = u8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        u8 u8Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        m1(new ProgressDialog(this));
        j1().setMessage("Please wait...");
        j1().setCancelable(false);
        j1().setCanceledOnTouchOutside(false);
        String stringExtra = getIntent().getStringExtra("vahanReceiptUrl");
        l.c(stringExtra);
        this.I = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("receiptNo");
        l.c(stringExtra2);
        this.H = stringExtra2;
        String str = this.I;
        if (str == null) {
            l.v("url");
            str = null;
        }
        n1(q.B0(str).toString());
        u8 u8Var2 = this.G;
        if (u8Var2 == null) {
            l.v("binding");
            u8Var2 = null;
        }
        u8Var2.f28856d.f28305f.setOnClickListener(new vg.a(this));
        u8 u8Var3 = this.G;
        if (u8Var3 == null) {
            l.v("binding");
        } else {
            u8Var = u8Var3;
        }
        u8Var.f28854b.setOnClickListener(new b());
    }
}
