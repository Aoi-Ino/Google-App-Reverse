package com.nic.mparivahan.VahanServices.PUCCCertificatesDownload;

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
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.PDFViewInternalAcitvity;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCertificateServices.PUCCertifiateServices;
import java.lang.reflect.Method;
import ni.i7;
import pl.x;
import xf.e;
import xf.f;

public final class PUCCCertificateDownload extends d {
    public i7 G;
    public ProgressDialog H;
    public ImageView I;
    public ag.a J;
    public PUCCertifiateServices K;
    public ld.c L;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PUCCCertificateDownload f20689e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PUCCCertificateDownload pUCCCertificateDownload) {
            super(1);
            this.f20689e = pUCCCertificateDownload;
        }

        public final void b(String str) {
            try {
                this.f20689e.r1().dismiss();
                if (!ka.c.f13158a.m(str)) {
                    PUCCCertificateDownload pUCCCertificateDownload = this.f20689e;
                    cm.l.c(str);
                    pUCCCertificateDownload.n1(q.B0(str).toString());
                }
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
        final /* synthetic */ PUCCCertificateDownload f20690e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PUCCCertificateDownload pUCCCertificateDownload) {
            super(1);
            this.f20690e = pUCCCertificateDownload;
        }

        public final void b(String str) {
            this.f20690e.r1().dismiss();
            if (p.o(str, "Error", true)) {
                this.f20690e.G1("Error");
            } else {
                this.f20690e.G1(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20691a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20691a = lVar;
        }

        public final pl.c a() {
            return this.f20691a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20691a.invoke(obj);
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
        textView.setText(q1().b("btn_ok", getString(R.string.ok_txt)));
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
        intent.putExtra("HeaderName", "Download Pollution Fitness Certificate");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p1().f26814g.getText());
        sb2.append(System.currentTimeMillis());
        intent.putExtra("pdfname", sb2.toString());
        startActivity(intent);
    }

    private final void u1() {
        p1().f26812e.f28305f.setOnClickListener(new xf.b(this));
        p1().f26812e.f28306g.setOnClickListener(new xf.c(this));
        p1().f26809b.setOnClickListener(new xf.d(this));
        t1().h().g(this, new c(new a(this)));
        t1().i().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void v1(PUCCCertificateDownload pUCCCertificateDownload, View view) {
        cm.l.f(pUCCCertificateDownload, "this$0");
        pUCCCertificateDownload.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void w1(PUCCCertificateDownload pUCCCertificateDownload, View view) {
        cm.l.f(pUCCCertificateDownload, "this$0");
        pUCCCertificateDownload.z1();
    }

    /* access modifiers changed from: private */
    public static final void x1(PUCCCertificateDownload pUCCCertificateDownload, View view) {
        ld.c q12;
        String string;
        String str;
        cm.l.f(pUCCCertificateDownload, "this$0");
        Editable text = pUCCCertificateDownload.p1().f26814g.getText();
        cm.l.c(text);
        if (text.length() < 2) {
            q12 = pUCCCertificateDownload.q1();
            string = pUCCCertificateDownload.getString(R.string.please_enter_vehicle_no);
            str = "label_challan_please_enter_vehicle_no";
        } else {
            Editable text2 = pUCCCertificateDownload.p1().f26810c.getText();
            cm.l.c(text2);
            if (text2.length() < 2) {
                q12 = pUCCCertificateDownload.q1();
                string = pUCCCertificateDownload.getString(R.string.please_enter_chassis_no);
                str = "PLEASE_ENTER_CHASSI";
            } else {
                pUCCCertificateDownload.t1().j(q.B0(String.valueOf(pUCCCertificateDownload.p1().f26814g.getText())).toString(), q.B0(String.valueOf(pUCCCertificateDownload.p1().f26810c.getText())).toString(), pUCCCertificateDownload);
                pUCCCertificateDownload.r1().show();
                return;
            }
        }
        Toast.makeText(pUCCCertificateDownload, q12.b(str, string), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void y1(PUCCCertificateDownload pUCCCertificateDownload, View view) {
        cm.l.f(pUCCCertificateDownload, "this$0");
        pUCCCertificateDownload.finish();
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

    public final void B1(i7 i7Var) {
        cm.l.f(i7Var, "<set-?>");
        this.G = i7Var;
    }

    public final void C1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void D1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }

    public final void E1(PUCCertifiateServices pUCCertifiateServices) {
        cm.l.f(pUCCertifiateServices, "<set-?>");
        this.K = pUCCertifiateServices;
    }

    public final void F1(ag.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.J = aVar;
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
        i7 c10 = i7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        B1(c10);
        setContentView((View) p1().b());
        v9.e.f17509a.B1(this, p1());
        View findViewById = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById, "findViewById(...)");
        A1((ImageView) findViewById);
        C1(new ld.c(this));
        p1().f26812e.f28308i.setText(getIntent().getStringExtra("ServiceName"));
        D1(new ProgressDialog(this));
        r1().setMessage(q1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        E1(PUCCertifiateServices.f20692a.b(this));
        F1((ag.a) new u0((x0) this, (u0.b) new zf.b(new yf.a(s1()))).a(ag.a.class));
        u1();
        o1().setOnClickListener(new xf.a(this));
    }

    public final i7 p1() {
        i7 i7Var = this.G;
        if (i7Var != null) {
            return i7Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final ld.c q1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final PUCCertifiateServices s1() {
        PUCCertifiateServices pUCCertifiateServices = this.K;
        if (pUCCertifiateServices != null) {
            return pUCCertifiateServices;
        }
        cm.l.v("pucService");
        return null;
    }

    public final ag.a t1() {
        ag.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("pucViewModel");
        return null;
    }
}
