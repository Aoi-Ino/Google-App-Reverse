package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.b;
import cb.s0;
import cm.l;
import com.nic.mparivahan.R;
import gd.b0;
import gd.c0;
import gd.d0;
import gd.e0;
import gd.f0;
import ni.w3;
import oi.g;

public final class DownloadApplicationActivity extends g {
    private w3 J;
    private String K;
    private String L;
    public AppCompatImageView M;
    private s0 N;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadApplicationActivity f9580a;

        a(DownloadApplicationActivity downloadApplicationActivity) {
            this.f9580a = downloadApplicationActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f9580a.L1(false);
            super.onPageFinished(webView, str);
            if (str != null && q.F(str, "sarathiPGResponse", false, 2, (Object) null)) {
                this.f9580a.finish();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f9580a.L1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            l.f(webView, "view");
            l.f(str, "Url");
            webView.loadUrl(str);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(String str, String str2, String str3, DownloadApplicationActivity downloadApplicationActivity, Dialog dialog, View view) {
        l.f(str, "$url");
        l.f(str2, "$mimetype");
        l.f(str3, "$userAgent");
        l.f(downloadApplicationActivity, "this$0");
        l.f(dialog, "$d");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType(str2);
        request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str3);
        request.setDescription("Downloading file...");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fee_Receipt_");
        String str4 = downloadApplicationActivity.K;
        String str5 = null;
        if (str4 == null) {
            l.v("app_no");
            str4 = null;
        }
        sb2.append(str4);
        request.setTitle(sb2.toString());
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        String str6 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("PayReceipt");
        String str7 = downloadApplicationActivity.K;
        if (str7 == null) {
            l.v("app_no");
        } else {
            str5 = str7;
        }
        sb3.append(str5);
        sb3.append(".pdf");
        request.setDestinationInExternalPublicDir(str6, sb3.toString());
        Object systemService = downloadApplicationActivity.getSystemService("download");
        l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        ((DownloadManager) systemService).enqueue(request);
        Toast.makeText(downloadApplicationActivity.getApplicationContext(), "Downloading File", 1).show();
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void D1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void F1() {
        String stringExtra = getIntent().getStringExtra("app_no");
        l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
        this.K = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("dob");
        l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
        this.L = stringExtra2;
        w3 w3Var = this.J;
        w3 w3Var2 = null;
        if (w3Var == null) {
            l.v("mBinding");
            w3Var = null;
        }
        WebView webView = w3Var.f29146c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hc.a.f12073a.x());
        sb2.append("PrintConformMob.jsp?applno=");
        String str = this.K;
        if (str == null) {
            l.v("app_no");
            str = null;
        }
        sb2.append(str);
        sb2.append("&dob=");
        String str2 = this.L;
        if (str2 == null) {
            l.v("dob");
            str2 = null;
        }
        sb2.append(str2);
        webView.loadUrl(sb2.toString());
        w3 w3Var3 = this.J;
        if (w3Var3 == null) {
            l.v("mBinding");
            w3Var3 = null;
        }
        w3Var3.f29146c.getSettings().setJavaScriptEnabled(true);
        w3 w3Var4 = this.J;
        if (w3Var4 == null) {
            l.v("mBinding");
            w3Var4 = null;
        }
        w3Var4.f29146c.setWebViewClient(new a(this));
        w3 w3Var5 = this.J;
        if (w3Var5 == null) {
            l.v("mBinding");
        } else {
            w3Var2 = w3Var5;
        }
        w3Var2.f29146c.setDownloadListener(new c0(this));
    }

    /* access modifiers changed from: private */
    public static final void G1(DownloadApplicationActivity downloadApplicationActivity, String str, String str2, String str3, String str4, long j10) {
        l.f(downloadApplicationActivity, "this$0");
        if (downloadApplicationActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            l.c(str);
            l.c(str2);
            l.c(str3);
            l.c(str4);
            downloadApplicationActivity.B1(str, str2, str3, str4, j10);
            return;
        }
        b.s(downloadApplicationActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    private final void H1() {
        w3 w3Var = this.J;
        if (w3Var == null) {
            l.v("mBinding");
            w3Var = null;
        }
        w3Var.f29145b.f28448b.setOnClickListener(new d0(this));
    }

    /* access modifiers changed from: private */
    public static final void I1(DownloadApplicationActivity downloadApplicationActivity, View view) {
        l.f(downloadApplicationActivity, "this$0");
        w3 w3Var = downloadApplicationActivity.J;
        String str = null;
        if (w3Var == null) {
            l.v("mBinding");
            w3Var = null;
        }
        w3Var.f29146c.destroy();
        Intent intent = new Intent();
        intent.setClass(downloadApplicationActivity, ApplicationDetailsActivity.class);
        String str2 = downloadApplicationActivity.K;
        if (str2 == null) {
            l.v("app_no");
            str2 = null;
        }
        intent.putExtra("app_no", str2);
        String str3 = downloadApplicationActivity.L;
        if (str3 == null) {
            l.v("dob");
        } else {
            str = str3;
        }
        intent.putExtra("dob", str);
        intent.setFlags(67108864);
        downloadApplicationActivity.startActivity(intent);
        downloadApplicationActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void J1(DownloadApplicationActivity downloadApplicationActivity, View view) {
        l.f(downloadApplicationActivity, "this$0");
        w3 w3Var = downloadApplicationActivity.J;
        String str = null;
        if (w3Var == null) {
            l.v("mBinding");
            w3Var = null;
        }
        w3Var.f29146c.destroy();
        Intent intent = new Intent();
        intent.setClass(downloadApplicationActivity, ApplicationDetailsActivity.class);
        String str2 = downloadApplicationActivity.K;
        if (str2 == null) {
            l.v("app_no");
            str2 = null;
        }
        intent.putExtra("app_no", str2);
        String str3 = downloadApplicationActivity.L;
        if (str3 == null) {
            l.v("dob");
        } else {
            str = str3;
        }
        intent.putExtra("dob", str);
        intent.setFlags(67108864);
        downloadApplicationActivity.startActivity(intent);
        downloadApplicationActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void L1(boolean z10) {
        if (z10) {
            try {
                this.N = new s0(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        s0 s0Var = this.N;
        if (s0Var == null) {
            return;
        }
        if (z10) {
            s0Var.b();
        } else {
            s0Var.a();
        }
    }

    public final void B1(String str, String str2, String str3, String str4, long j10) {
        l.f(str, "url");
        l.f(str2, "userAgent");
        l.f(str3, "contentDisposition");
        l.f(str4, "mimetype");
        Log.d("File Name", URLUtil.guessFileName(str, str3, str4));
        Log.d("Content Length", String.valueOf(j10));
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_download_file);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.msg_title);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.msg_body);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_ok);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById4;
        dialog.show();
        ((TextView) findViewById).setText(getString(R.string.download_rcpt));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.string.do_you_want));
        sb2.append("Fee_Receipt_");
        String str5 = this.K;
        if (str5 == null) {
            l.v("app_no");
            str5 = null;
        }
        sb2.append(str5);
        textView.setText(sb2.toString());
        textView2.setText(getString(R.string.ok_text));
        textView2.setOnClickListener(new e0(str, str4, str2, this, dialog));
        textView3.setOnClickListener(new f0(dialog));
    }

    public final AppCompatImageView E1() {
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        l.v("back_icon");
        return null;
    }

    public final void K1(AppCompatImageView appCompatImageView) {
        l.f(appCompatImageView, "<set-?>");
        this.M = appCompatImageView;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w3 c10 = w3.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.J = c10;
        if (c10 == null) {
            l.v("mBinding");
            c10 = null;
        }
        setContentView((View) c10.b());
        View findViewById = findViewById(R.id.back_icon);
        l.e(findViewById, "findViewById(...)");
        K1((AppCompatImageView) findViewById);
        E1().setOnClickListener(new b0(this));
        F1();
        H1();
    }
}
