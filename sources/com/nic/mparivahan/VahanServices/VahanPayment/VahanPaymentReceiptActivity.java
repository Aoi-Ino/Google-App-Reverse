package com.nic.mparivahan.VahanServices.VahanPayment;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ni.wd;

public final class VahanPaymentReceiptActivity extends d {
    private wd G;
    private String H = "";
    private String I;
    public ProgressDialog J;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        private boolean f21164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VahanPaymentReceiptActivity f21165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f21166c;

        a(VahanPaymentReceiptActivity vahanPaymentReceiptActivity, String str) {
            this.f21165b = vahanPaymentReceiptActivity;
            this.f21166c = str;
        }

        public void onPageFinished(WebView webView, String str) {
            l.f(webView, "view");
            l.f(str, "url");
            if (this.f21164a) {
                this.f21165b.g1().dismiss();
            } else {
                this.f21165b.i1(this.f21166c);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            l.f(webView, "view");
            l.f(str, "url");
            l.f(bitmap, "favicon");
            this.f21164a = true;
        }
    }

    /* access modifiers changed from: private */
    public final void i1(String str) {
        g1().show();
        wd wdVar = this.G;
        wd wdVar2 = null;
        if (wdVar == null) {
            l.v("binding");
            wdVar = null;
        }
        wdVar.f29247c.invalidate();
        wd wdVar3 = this.G;
        if (wdVar3 == null) {
            l.v("binding");
            wdVar3 = null;
        }
        wdVar3.f29247c.getSettings().setJavaScriptEnabled(true);
        wd wdVar4 = this.G;
        if (wdVar4 == null) {
            l.v("binding");
            wdVar4 = null;
        }
        wdVar4.f29247c.getSettings().setSupportZoom(true);
        wd wdVar5 = this.G;
        if (wdVar5 == null) {
            l.v("binding");
            wdVar5 = null;
        }
        wdVar5.f29247c.loadUrl("https://docs.google.com/gview?embedded=true&url=" + str);
        wd wdVar6 = this.G;
        if (wdVar6 == null) {
            l.v("binding");
        } else {
            wdVar2 = wdVar6;
        }
        wdVar2.f29247c.setWebViewClient(new a(this, str));
    }

    public final ProgressDialog g1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final void h1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_payment_receipt);
        wd c10 = wd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        String str = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        h1(new ProgressDialog(this));
        g1().setMessage("Please wait...");
        g1().setCancelable(false);
        g1().setCanceledOnTouchOutside(false);
        String stringExtra = getIntent().getStringExtra("vahanReceiptUrl");
        l.c(stringExtra);
        this.I = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("receiptNo");
        l.c(stringExtra2);
        this.H = stringExtra2;
        String str2 = this.I;
        if (str2 == null) {
            l.v("url");
        } else {
            str = str2;
        }
        i1(q.B0(str).toString());
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        finish();
        return true;
    }
}
