package com.nic.mparivahan.PdfViewer;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.Toast;
import cm.l;
import cm.t;
import cm.u;
import e2.f;
import java.io.File;
import ni.d7;
import oi.g;

public final class PdfViewActivity extends g {
    public static final a N = new a((cm.g) null);
    /* access modifiers changed from: private */
    public d7 J;
    public ld.g K;
    /* access modifiers changed from: private */
    public File L;
    private String M = "";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    public static final class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f9365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadManager f9366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PdfViewActivity f9367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u f9368d;

        b(t tVar, DownloadManager downloadManager, PdfViewActivity pdfViewActivity, u uVar) {
            this.f9365a = tVar;
            this.f9366b = downloadManager;
            this.f9367c = pdfViewActivity;
            this.f9368d = uVar;
        }

        public void onReceive(Context context, Intent intent) {
            Toast makeText;
            String str;
            l.f(intent, "intent");
            long longExtra = intent.getLongExtra("extra_download_id", -1);
            if (longExtra == this.f9365a.f20233e) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(new long[]{longExtra});
                Cursor query2 = this.f9366b.query(query);
                l.e(query2, "query(...)");
                query2.moveToFirst();
                int i10 = query2.getInt(query2.getColumnIndex("status"));
                int i11 = query2.getInt(query2.getColumnIndex("reason"));
                if (i10 == 8) {
                    PdfViewActivity pdfViewActivity = this.f9367c;
                    makeText = Toast.makeText(pdfViewActivity, ((String) this.f9368d.f20234e) + " successfully saved in storage.", 0);
                } else if (i10 == 16) {
                    switch (i11) {
                        case 1000:
                            str = "ERROR_UNKNOWN";
                            break;
                        case 1001:
                            str = "ERROR_FILE_ERROR";
                            break;
                        case 1002:
                            str = "ERROR_UNHANDLED_HTTP_CODE";
                            break;
                        case 1004:
                            str = "ERROR_HTTP_DATA_ERROR";
                            break;
                        case 1005:
                            str = "ERROR_TOO_MANY_REDIRECTS";
                            break;
                        case 1006:
                            str = "ERROR_INSUFFICIENT_SPACE";
                            break;
                        case 1007:
                            str = "ERROR_DEVICE_NOT_FOUND";
                            break;
                        case 1008:
                            str = "ERROR_CANNOT_RESUME";
                            break;
                        case 1009:
                            str = "ERROR_FILE_ALREADY_EXISTS";
                            break;
                        default:
                            str = "";
                            break;
                    }
                    PdfViewActivity pdfViewActivity2 = this.f9367c;
                    makeText = Toast.makeText(pdfViewActivity2, "Download failed because " + str, 0);
                } else {
                    return;
                }
                makeText.show();
            }
        }
    }

    public static final class c implements e2.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PdfViewActivity f9369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9371c;

        c(PdfViewActivity pdfViewActivity, String str, String str2) {
            this.f9369a = pdfViewActivity;
            this.f9370b = str;
            this.f9371c = str2;
        }

        public void a(e2.a aVar) {
            d7 y12 = this.f9369a.J;
            if (y12 == null) {
                l.v("mBinding");
                y12 = null;
            }
            y12.f25877y.setVisibility(8);
            PdfViewActivity pdfViewActivity = this.f9369a;
            Toast.makeText(pdfViewActivity, "Error in Downloading File : " + aVar, 1).show();
        }

        public void b() {
            this.f9369a.L = new File(this.f9370b, this.f9371c);
            d7 y12 = this.f9369a.J;
            File file = null;
            if (y12 == null) {
                l.v("mBinding");
                y12 = null;
            }
            y12.f25877y.setVisibility(8);
            PdfViewActivity pdfViewActivity = this.f9369a;
            File x12 = pdfViewActivity.L;
            if (x12 == null) {
                l.v("downloadedFile");
            } else {
                file = x12;
            }
            pdfViewActivity.J1(file);
        }
    }

    private final void B1(String str) {
        d7 d7Var = this.J;
        if (d7Var == null) {
            l.v("mBinding");
            d7Var = null;
        }
        d7Var.f25877y.setVisibility(0);
        D1(str, E1(this), "myFile.pdf");
    }

    private final void C1() {
        try {
            String str = this.M;
            ld.g gVar = new ld.g(this);
            String cookie = CookieManager.getInstance().getCookie(str);
            Object systemService = getSystemService("download");
            l.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager downloadManager = (DownloadManager) systemService;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.addRequestHeader("Cookie", cookie);
            request.addRequestHeader("Content-Type", "application/pdf");
            request.addRequestHeader("Authorization", "Bearer " + gVar.r());
            request.setNotificationVisibility(1);
            String str2 = Environment.DIRECTORY_DOWNLOADS;
            request.setDestinationInExternalPublicDir(str2, getIntent().getStringExtra("formType") + '_' + getIntent().getStringExtra("applNo") + '_' + System.currentTimeMillis() + ".pdf");
            request.setTitle(getIntent().getStringExtra("formType"));
            u uVar = new u();
            uVar.f20234e = getIntent().getStringExtra("formType");
            t tVar = new t();
            tVar.f20233e = downloadManager.enqueue(request);
            registerReceiver(new b(tVar, downloadManager, this, uVar), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void D1(String str, String str2, String str3) {
        k2.b b10 = f.b(str, str2, str3);
        b10.b("Authorization", "Bearer " + F1().r()).a().G(new c(this, str2, str3));
    }

    private final void G0() {
        I1(new ld.g(this));
        f.c(getApplicationContext());
        B1(this.M);
        d7 d7Var = this.J;
        if (d7Var == null) {
            l.v("mBinding");
            d7Var = null;
        }
        d7Var.f25878z.setOnClickListener(new jc.b(this));
    }

    /* access modifiers changed from: private */
    public static final void G1(PdfViewActivity pdfViewActivity, View view) {
        l.f(pdfViewActivity, "this$0");
        Toast.makeText(pdfViewActivity, "Error in Downloading File : ", 1);
        File file = pdfViewActivity.L;
        File file2 = null;
        if (file == null) {
            l.v("downloadedFile");
            file = null;
        }
        if (file.exists()) {
            File file3 = pdfViewActivity.L;
            if (file3 == null) {
                l.v("downloadedFile");
            } else {
                file2 = file3;
            }
            Uri parse = Uri.parse(file2.getPath());
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("application/pdf");
            intent.putExtra("android.intent.extra.STREAM", parse);
            pdfViewActivity.startActivity(Intent.createChooser(intent, "Share Via"));
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(PdfViewActivity pdfViewActivity, View view) {
        l.f(pdfViewActivity, "this$0");
        pdfViewActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void J1(File file) {
        d7 d7Var = this.J;
        if (d7Var == null) {
            l.v("mBinding");
            d7Var = null;
        }
        d7Var.f25876x.U0(file).V0();
    }

    private final void K1(Uri uri) {
        if (uri != null) {
            d7 d7Var = this.J;
            if (d7Var == null) {
                l.v("mBinding");
                d7Var = null;
            }
            d7Var.f25876x.U0(androidx.core.net.b.a(uri)).V0();
        }
    }

    public final String E1(Context context) {
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

    public final ld.g F1() {
        ld.g gVar = this.K;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final void I1(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.K = gVar;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 99 && i11 == -1 && intent != null) {
            K1(intent.getData());
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 2131558597(0x7f0d00c5, float:1.8742514E38)
            r7.setContentView((int) r8)
            androidx.databinding.h r8 = androidx.databinding.f.f(r7, r8)
            java.lang.String r0 = "setContentView(...)"
            cm.l.e(r8, r0)
            ni.d7 r8 = (ni.d7) r8
            r7.J = r8
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "url"
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.M = r8
            ld.c r8 = new ld.c
            r8.<init>(r7)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "formType"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r2 = "RC Particular Certificate"
            r3 = 1
            boolean r0 = km.p.o(r0, r2, r3)
            r4 = 0
            java.lang.String r5 = "mBinding"
            if (r0 == 0) goto L_0x0058
            ni.d7 r0 = r7.J
            if (r0 != 0) goto L_0x0049
            cm.l.v(r5)
            r0 = r4
        L_0x0049:
            ni.qd r0 = r0.f25875w
            android.widget.TextView r0 = r0.f28308i
            java.lang.String r1 = "print_rc_particular"
        L_0x004f:
            java.lang.String r8 = r8.b(r1, r2)
        L_0x0053:
            r0.setText(r8)
            goto L_0x011d
        L_0x0058:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r2 = "Fee Receipt"
            boolean r0 = km.p.o(r0, r2, r3)
            if (r0 == 0) goto L_0x0077
            ni.d7 r0 = r7.J
            if (r0 != 0) goto L_0x0070
            cm.l.v(r5)
            r0 = r4
        L_0x0070:
            ni.qd r0 = r0.f25875w
            android.widget.TextView r0 = r0.f28308i
            java.lang.String r1 = "label_fee_receipt"
            goto L_0x004f
        L_0x0077:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            cm.l.c(r0)
            java.lang.String r2 = "Form"
            boolean r0 = km.q.D(r0, r2, r3)
            if (r0 == 0) goto L_0x00b6
            ni.d7 r0 = r7.J
            if (r0 != 0) goto L_0x0092
            cm.l.v(r5)
            r0 = r4
        L_0x0092:
            ni.qd r0 = r0.f25875w
            android.widget.TextView r0 = r0.f28308i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Download "
            r2.append(r3)
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r1 = r3.getStringExtra(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "download_forms"
        L_0x00b1:
            java.lang.String r8 = r8.b(r2, r1)
            goto L_0x0053
        L_0x00b6:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            cm.l.c(r0)
            java.lang.String r2 = "Appointment Receipt"
            boolean r0 = km.q.D(r0, r2, r3)
            java.lang.String r2 = "download_appointment_receipt"
            if (r0 == 0) goto L_0x00da
            ni.d7 r0 = r7.J
            if (r0 != 0) goto L_0x00d3
            cm.l.v(r5)
            r0 = r4
        L_0x00d3:
            ni.qd r0 = r0.f25875w
            android.widget.TextView r0 = r0.f28308i
            java.lang.String r1 = "Download Appointment Receipt"
            goto L_0x00b1
        L_0x00da:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            cm.l.c(r0)
            java.lang.String r6 = "NOC"
            boolean r0 = km.q.D(r0, r6, r3)
            if (r0 == 0) goto L_0x00fc
            ni.d7 r0 = r7.J
            if (r0 != 0) goto L_0x00f5
            cm.l.v(r5)
            r0 = r4
        L_0x00f5:
            ni.qd r0 = r0.f25875w
            android.widget.TextView r0 = r0.f28308i
            java.lang.String r1 = "Download NOC Certificate"
            goto L_0x00b1
        L_0x00fc:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r1)
            java.lang.String r0 = "Tax Receipt"
            boolean r8 = km.p.o(r8, r0, r3)
            if (r8 == 0) goto L_0x011d
            ni.d7 r8 = r7.J
            if (r8 != 0) goto L_0x0114
            cm.l.v(r5)
            r8 = r4
        L_0x0114:
            ni.qd r8 = r8.f25875w
            android.widget.TextView r8 = r8.f28308i
            java.lang.String r0 = "Download Checkpost Tax Receipt"
            r8.setText(r0)
        L_0x011d:
            ni.d7 r8 = r7.J
            if (r8 != 0) goto L_0x0125
            cm.l.v(r5)
            goto L_0x0126
        L_0x0125:
            r4 = r8
        L_0x0126:
            ni.qd r8 = r4.f25875w
            androidx.appcompat.widget.AppCompatImageView r8 = r8.f28305f
            jc.a r0 = new jc.a
            r0.<init>(r7)
            r8.setOnClickListener(r0)
            r7.G0()
            r7.C1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.PdfViewer.PdfViewActivity.onCreate(android.os.Bundle):void");
    }
}
