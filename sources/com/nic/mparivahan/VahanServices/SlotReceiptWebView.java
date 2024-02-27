package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ni.cd;
import wd.u0;
import wd.v0;
import wd.w0;
import wd.x0;
import wd.y0;
import wd.z0;

public final class SlotReceiptWebView extends d {
    private final int G = 10210;
    public cd H;
    private String I = "";
    private String J = "";
    private boolean K;
    private String L = "";
    private final ExecutorService M = Executors.newSingleThreadExecutor();
    private final Handler N = new Handler(Looper.getMainLooper());
    public ProgressDialog O;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        private boolean f20755a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlotReceiptWebView f20756b;

        a(SlotReceiptWebView slotReceiptWebView) {
            this.f20756b = slotReceiptWebView;
        }

        public void onPageFinished(WebView webView, String str) {
            if (this.f20755a) {
                this.f20756b.q1().dismiss();
                try {
                    this.f20756b.o1();
                } catch (Exception unused) {
                }
            } else {
                this.f20756b.x1();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f20755a = true;
            Log.e("test", String.valueOf(str));
        }
    }

    private final void B1() {
        if (this.K) {
            onBackPressed();
            return;
        }
        this.K = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new u0(this), 2000);
    }

    /* access modifiers changed from: private */
    public static final void C1(SlotReceiptWebView slotReceiptWebView) {
        l.f(slotReceiptWebView, "this$0");
        slotReceiptWebView.K = false;
    }

    private final void n1() {
        if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this.G);
        } else {
            x1();
        }
    }

    /* access modifiers changed from: private */
    public final void o1() {
        try {
            Object systemService = getSystemService("download");
            l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.J));
            request.setNotificationVisibility(1);
            request.setDestinationInExternalFilesDir(getApplicationContext(), Environment.DIRECTORY_DOWNLOADS, "");
            request.setTitle(this.L);
            ((DownloadManager) systemService).enqueue(request);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void r1() {
        p1().f25784b.f28305f.setOnClickListener(new v0(this));
        p1().f25784b.f28306g.setOnClickListener(new w0(this));
        p1().f25787e.getSettings().setJavaScriptEnabled(true);
        Log.v("Url", this.I);
        p1().f25785c.setOnClickListener(new x0(this));
    }

    /* access modifiers changed from: private */
    public static final void s1(SlotReceiptWebView slotReceiptWebView, View view) {
        l.f(slotReceiptWebView, "this$0");
        if (slotReceiptWebView.p1().f25787e.canGoBack()) {
            slotReceiptWebView.p1().f25787e.goBack();
        } else {
            slotReceiptWebView.B1();
        }
    }

    /* access modifiers changed from: private */
    public static final void t1(SlotReceiptWebView slotReceiptWebView, View view) {
        l.f(slotReceiptWebView, "this$0");
        slotReceiptWebView.y1();
    }

    /* access modifiers changed from: private */
    public static final void u1(SlotReceiptWebView slotReceiptWebView, View view) {
        l.f(slotReceiptWebView, "this$0");
        slotReceiptWebView.M.execute(new y0(slotReceiptWebView));
    }

    /* access modifiers changed from: private */
    public static final void v1(SlotReceiptWebView slotReceiptWebView) {
        l.f(slotReceiptWebView, "this$0");
        String str = slotReceiptWebView.J;
        String str2 = slotReceiptWebView.L;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan/", "Slot");
        if (!file.exists()) {
            file.mkdir();
        }
        zh.a.f33193a.a(str, new File(file.getPath() + '/' + str2 + ".pdf"));
        slotReceiptWebView.N.post(new z0(slotReceiptWebView));
    }

    /* access modifiers changed from: private */
    public static final void w1(SlotReceiptWebView slotReceiptWebView) {
        l.f(slotReceiptWebView, "this$0");
        Toast.makeText(slotReceiptWebView, "File Downloaded", 0).show();
    }

    /* access modifiers changed from: private */
    public final void x1() {
        try {
            q1().show();
            p1().f25787e.invalidate();
            p1().f25787e.getSettings().setJavaScriptEnabled(true);
            p1().f25787e.getSettings().setSupportZoom(true);
            WebView webView = p1().f25787e;
            webView.loadUrl("http://docs.google.com/gview?embedded=true&url=" + this.I);
            p1().f25787e.setWebViewClient(new a(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void y1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.slot_receipt_activity);
        cd c10 = cd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        z1(c10);
        setContentView((View) p1().b());
        A1(new ProgressDialog(this));
        q1().setMessage("Please wait...");
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            if (getIntent().hasExtra("receiptUrl")) {
                String stringExtra = getIntent().getStringExtra("receiptUrl");
                l.c(stringExtra);
                this.I = stringExtra;
            }
            if (getIntent().hasExtra("apptId")) {
                String stringExtra2 = getIntent().getStringExtra("apptId");
                l.c(stringExtra2);
                this.L = stringExtra2;
            }
        }
        this.J = this.I;
        n1();
        r1();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (p1().f25787e.canGoBack()) {
            p1().f25787e.goBack();
            return true;
        }
        B1();
        return true;
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.G) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
            } else {
                x1();
            }
        }
    }

    public final cd p1() {
        cd cdVar = this.H;
        if (cdVar != null) {
            return cdVar;
        }
        l.v("binding");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final void z1(cd cdVar) {
        l.f(cdVar, "<set-?>");
        this.H = cdVar;
    }
}
