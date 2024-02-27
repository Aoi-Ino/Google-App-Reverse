package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cm.l;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.snackbar.Snackbar;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import ue.g;
import ue.h;

public final class PDFViewInternalAcitvity extends d {
    public String G;
    public CoordinatorLayout H;
    public TextView I;

    public static final class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PDFViewInternalAcitvity f20603e;

        a(PDFViewInternalAcitvity pDFViewInternalAcitvity) {
            this.f20603e = pDFViewInternalAcitvity;
        }

        public void onClick(View view) {
            this.f20603e.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
        }
    }

    /* access modifiers changed from: private */
    public static final void l1(PDFViewInternalAcitvity pDFViewInternalAcitvity, View view) {
        l.f(pDFViewInternalAcitvity, "this$0");
        pDFViewInternalAcitvity.h1();
    }

    /* access modifiers changed from: private */
    public static final void m1(PDFViewInternalAcitvity pDFViewInternalAcitvity, View view) {
        l.f(pDFViewInternalAcitvity, "this$0");
        pDFViewInternalAcitvity.finish();
    }

    private final void q1() {
        Snackbar n02 = Snackbar.l0(i1(), "Download successful", 5000).n0("Open", new a(this));
        l.e(n02, "setAction(...)");
        n02.W();
    }

    public final void h1() {
        File file = new File(getFilesDir(), "fitness_pdf_file.pdf");
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + File.separator + j1() + ".pdf");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    fileInputStream.close();
                    Log.e("fileDown", "success");
                    q1();
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final CoordinatorLayout i1() {
        CoordinatorLayout coordinatorLayout = this.H;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        l.v("mainLayout");
        return null;
    }

    public final String j1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("namePDF");
        return null;
    }

    public final TextView k1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        l.v("vahan_service_lable");
        return null;
    }

    public final void n1(CoordinatorLayout coordinatorLayout) {
        l.f(coordinatorLayout, "<set-?>");
        this.H = coordinatorLayout;
    }

    public final void o1(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pdfview_internal_acitvity);
        View findViewById = findViewById(R.id.layout_main);
        l.e(findViewById, "findViewById(...)");
        n1((CoordinatorLayout) findViewById);
        View findViewById2 = findViewById(R.id.vahan_service_lable);
        l.e(findViewById2, "findViewById(...)");
        p1((TextView) findViewById2);
        o1(String.valueOf(getIntent().getStringExtra("pdfname")));
        k1().setText(String.valueOf(getIntent().getStringExtra("HeaderName")));
        ((PDFView) findViewById(R.id.pdfView)).A(new File(getFilesDir(), "fitness_pdf_file.pdf")).f(true).h(false).g();
        ((CustomWegetLayout) findViewById(R.id.downloadpdf)).setOnClickListener(new g(this));
        ((AppCompatImageView) findViewById(R.id.mvvm_back)).setOnClickListener(new h(this));
    }

    public final void p1(TextView textView) {
        l.f(textView, "<set-?>");
        this.I = textView;
    }
}
