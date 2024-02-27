package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import com.pdfview.PDFView;
import e2.f;
import java.io.File;

public final class DownLoadFormsService extends d {
    public static final a K = new a((g) null);
    private PDFView G;
    /* access modifiers changed from: private */
    public ProgressBar H;
    public ld.g I;
    private String J = "";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements e2.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20575b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownLoadFormsService f20576c;

        b(String str, String str2, DownLoadFormsService downLoadFormsService) {
            this.f20574a = str;
            this.f20575b = str2;
            this.f20576c = downLoadFormsService;
        }

        public void a(e2.a aVar) {
            ProgressBar f12 = this.f20576c.H;
            if (f12 == null) {
                l.v("progressBar");
                f12 = null;
            }
            f12.setVisibility(8);
            DownLoadFormsService downLoadFormsService = this.f20576c;
            Toast.makeText(downLoadFormsService, "Error in Downloading File : " + aVar, 1).show();
        }

        public void b() {
            File file = new File(this.f20574a, this.f20575b);
            ProgressBar f12 = this.f20576c.H;
            if (f12 == null) {
                l.v("progressBar");
                f12 = null;
            }
            f12.setVisibility(8);
            this.f20576c.m1(file);
        }
    }

    private final void G0() {
        View findViewById = findViewById(R.id.pdfView);
        l.e(findViewById, "findViewById(...)");
        this.G = (PDFView) findViewById;
        View findViewById2 = findViewById(R.id.progressBar);
        l.e(findViewById2, "findViewById(...)");
        this.H = (ProgressBar) findViewById2;
        l1(new ld.g(this));
        f.c(getApplicationContext());
        h1(this.J);
        i1(this.J);
    }

    private final void h1(String str) {
        ProgressBar progressBar = this.H;
        if (progressBar == null) {
            l.v("progressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        j1(str, k1(this), getIntent().getStringExtra("formType") + '_' + getIntent().getStringExtra("applNo") + '_' + System.currentTimeMillis() + ".pdf");
    }

    private final void j1(String str, String str2, String str3) {
        f.b(str, str2, str3).b("Authorization", "Bearer AAIgNjYxYmFkN2U3M2Y2ZTM0YmI4NjI1OTc0OTY2YjliNGbDPw9h50HTiW1PisP03GtXP-vNd8HNTbbqd9KnmFLVpJAjBxY9qASruQONFn7QrmYPr72omo-yvgmcuMaZysESOGgxDIcJzqPIdIKNYkaWd8KSfmdidqntIpbwgZPY1gQ").a().G(new b(str2, str3, this));
    }

    /* access modifiers changed from: private */
    public final void m1(File file) {
        PDFView pDFView = this.G;
        if (pDFView == null) {
            l.v("pdfView");
            pDFView = null;
        }
        pDFView.U0(file).V0();
    }

    private final void n1(Uri uri) {
        if (uri != null) {
            PDFView pDFView = this.G;
            if (pDFView == null) {
                l.v("pdfView");
                pDFView = null;
            }
            pDFView.U0(androidx.core.net.b.a(uri)).V0();
        }
    }

    public final void i1(String str) {
        l.f(str, "oldUrl");
        try {
            ld.g gVar = new ld.g(this);
            Toast.makeText(this, getIntent().getStringExtra("formType") + " successfully saved in storage.", 1).show();
            Object systemService = getSystemService("download");
            l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
            request.addRequestHeader("Content-Type", "application/pdf");
            request.addRequestHeader("Authorization", "Bearer " + gVar.r());
            request.allowScanningByMediaScanner();
            request.setTitle(getIntent().getStringExtra("formType"));
            request.setDescription("NextGen mParivahan  " + getIntent().getStringExtra("formType"));
            request.setNotificationVisibility(1);
            String str2 = Environment.DIRECTORY_DOWNLOADS;
            request.setDestinationInExternalPublicDir(str2, getIntent().getStringExtra("formType") + '_' + getIntent().getStringExtra("applNo") + '_' + System.currentTimeMillis() + ".pdf");
            ((DownloadManager) systemService).enqueue(request);
            Toast.makeText(this, "Receipt Saved Successfully in the Storage", 0).show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final String k1(Context context) {
        File filesDir;
        l.f(context, "context");
        boolean a10 = l.a("mounted", Environment.getExternalStorageState());
        Context applicationContext = context.getApplicationContext();
        if (a10) {
            filesDir = androidx.core.content.a.g(applicationContext, (String) null)[0];
            l.e(filesDir, "get(...)");
        } else {
            filesDir = applicationContext.getFilesDir();
        }
        String absolutePath = filesDir.getAbsolutePath();
        l.c(absolutePath);
        return absolutePath;
    }

    public final void l1(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.I = gVar;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 99 && i11 == -1 && intent != null) {
            n1(intent.getData());
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pdf);
        G0();
        try {
            this.J = String.valueOf(getIntent().getStringExtra("url"));
        } catch (Exception unused) {
        }
    }
}
