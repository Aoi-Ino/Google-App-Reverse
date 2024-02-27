package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService.DFCServices;
import java.lang.reflect.Method;
import ni.g4;
import pl.x;
import ue.e;
import ue.f;

public final class DuplicateFitnessCertificateDownload extends d {
    public g4 G;
    public ProgressDialog H;
    public ImageView I;
    public xe.a J;
    public DFCServices K;
    public ld.c L;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateFitnessCertificateDownload f20600e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) {
            super(1);
            this.f20600e = duplicateFitnessCertificateDownload;
        }

        public final void b(String str) {
            try {
                this.f20600e.t1().dismiss();
                DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload = this.f20600e;
                cm.l.c(str);
                duplicateFitnessCertificateDownload.n1(q.B0(str).toString());
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuplicateFitnessCertificateDownload f20601e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) {
            super(1);
            this.f20601e = duplicateFitnessCertificateDownload;
        }

        public final void b(String str) {
            this.f20601e.t1().dismiss();
            if (p.o(str, "Error", true)) {
                this.f20601e.G1("Error");
            } else {
                this.f20601e.G1(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20602a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20602a = lVar;
        }

        public final pl.c a() {
            return this.f20602a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20602a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public final void G1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText(s1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new e(dialog));
        textView2.setOnClickListener(new f(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void n1(String str) {
        Log.e("callentered", "entered tp call");
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            cm.l.e(method, "getMethod(...)");
            method.invoke((Object) null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Intent intent = new Intent(this, PDFViewInternalAcitvity.class);
        intent.putExtra("HeaderName", "Download Duplicate Fitness Certificate");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p1().f26473b.getText());
        sb2.append(System.currentTimeMillis());
        intent.putExtra("pdfname", sb2.toString());
        startActivity(intent);
    }

    private final void u1() {
        p1().f26475d.f28305f.setOnClickListener(new ue.b(this));
        p1().f26475d.f28306g.setOnClickListener(new ue.c(this));
        p1().f26474c.setOnClickListener(new ue.d(this));
        r1().h().g(this, new c(new a(this)));
        r1().i().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void v1(DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload, View view) {
        cm.l.f(duplicateFitnessCertificateDownload, "this$0");
        duplicateFitnessCertificateDownload.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void w1(DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload, View view) {
        cm.l.f(duplicateFitnessCertificateDownload, "this$0");
        duplicateFitnessCertificateDownload.z1();
    }

    /* access modifiers changed from: private */
    public static final void x1(DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload, View view) {
        cm.l.f(duplicateFitnessCertificateDownload, "this$0");
        Editable text = duplicateFitnessCertificateDownload.p1().f26473b.getText();
        cm.l.c(text);
        if (text.length() < 2) {
            Toast.makeText(duplicateFitnessCertificateDownload, "Please enter application No.", 1).show();
            return;
        }
        duplicateFitnessCertificateDownload.r1().j(q.B0(String.valueOf(duplicateFitnessCertificateDownload.p1().f26473b.getText())).toString(), duplicateFitnessCertificateDownload);
        duplicateFitnessCertificateDownload.t1().show();
    }

    /* access modifiers changed from: private */
    public static final void y1(DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload, View view) {
        cm.l.f(duplicateFitnessCertificateDownload, "this$0");
        duplicateFitnessCertificateDownload.finish();
    }

    private final void z1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.I = imageView;
    }

    public final void B1(g4 g4Var) {
        cm.l.f(g4Var, "<set-?>");
        this.G = g4Var;
    }

    public final void C1(DFCServices dFCServices) {
        cm.l.f(dFCServices, "<set-?>");
        this.K = dFCServices;
    }

    public final void D1(xe.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.J = aVar;
    }

    public final void E1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void F1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }

    public final ImageView o1() {
        ImageView imageView = this.I;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("back_image");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g4 c10 = g4.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        B1(c10);
        setContentView((View) p1().b());
        View findViewById = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById, "findViewById(...)");
        A1((ImageView) findViewById);
        E1(new ld.c(this));
        p1().f26475d.f28308i.setText("Download Duplicate Fitness Certificate");
        F1(new ProgressDialog(this));
        t1().setMessage(s1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        C1(DFCServices.f20597a.b(this));
        D1((xe.a) new u0((x0) this, (u0.b) new we.a(new ve.a(q1()))).a(xe.a.class));
        u1();
        o1().setOnClickListener(new ue.a(this));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public final g4 p1() {
        g4 g4Var = this.G;
        if (g4Var != null) {
            return g4Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final DFCServices q1() {
        DFCServices dFCServices = this.K;
        if (dFCServices != null) {
            return dFCServices;
        }
        cm.l.v("dfcServices");
        return null;
    }

    public final xe.a r1() {
        xe.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("dfcViewModel");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }
}
