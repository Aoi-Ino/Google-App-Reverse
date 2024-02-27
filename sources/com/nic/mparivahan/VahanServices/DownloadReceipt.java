package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ni.cd;
import wd.v;

public final class DownloadReceipt extends d {
    public cd G;
    private String H = "";
    private String I = "";
    private String J = "";

    public static final class a extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            l.f(webView, "view");
            l.f(str, "Url");
            Log.e("URL: -->", str);
            webView.loadUrl(str);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static final void h1(DownloadReceipt downloadReceipt, String str, String str2, String str3, String str4, long j10) {
        l.f(downloadReceipt, "this$0");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType(str4);
        request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str2);
        request.setDescription("Downloading file...");
        request.setTitle(URLUtil.guessFileName(str, str3, str4));
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalFilesDir(downloadReceipt, Environment.DIRECTORY_DOWNLOADS, ".pdf");
        Object systemService = downloadReceipt.getSystemService("download");
        l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        ((DownloadManager) systemService).enqueue(request);
        Toast.makeText(downloadReceipt.getApplicationContext(), "Downloading File", 1).show();
    }

    public final cd g1() {
        cd cdVar = this.G;
        if (cdVar != null) {
            return cdVar;
        }
        l.v("binding");
        return null;
    }

    public final void i1(cd cdVar) {
        l.f(cdVar, "<set-?>");
        this.G = cdVar;
    }

    public void onBackPressed() {
        if (g1().f25787e.canGoBack()) {
            g1().f25787e.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.slot_receipt_activity);
        cd c10 = cd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        i1(c10);
        setContentView((View) g1().b());
        if (getIntent() != null) {
            if (getIntent().hasExtra("vahanReceiptUrl")) {
                String stringExtra = getIntent().getStringExtra("vahanReceiptUrl");
                l.c(stringExtra);
                this.H = stringExtra;
            }
            if (getIntent().hasExtra("apptId")) {
                String stringExtra2 = getIntent().getStringExtra("apptId");
                l.c(stringExtra2);
                this.J = stringExtra2;
            }
        }
        String str = this.H;
        this.I = str;
        this.H = q.B0(str).toString();
        g1().f25787e.loadUrl(this.H);
        g1().f25787e.setWebViewClient(new a());
        g1().f25787e.setDownloadListener(new v(this));
    }
}
