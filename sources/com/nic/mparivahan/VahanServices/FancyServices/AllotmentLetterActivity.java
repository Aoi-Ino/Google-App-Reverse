package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
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
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterServices.AllotmentLetterRetrofitServices;
import java.io.File;
import java.lang.reflect.Method;
import ni.j;
import pl.x;
import v9.e;
import ye.e;
import ye.f;
import ye.g;

public final class AllotmentLetterActivity extends d {
    private j G;
    public ProgressDialog H;
    public AllotmentLetterRetrofitServices I;
    public af.a J;
    private final String K = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public ImageView L;
    public ld.c M;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AllotmentLetterActivity f20604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AllotmentLetterActivity allotmentLetterActivity) {
            super(1);
            this.f20604e = allotmentLetterActivity;
        }

        public final void b(String str) {
            try {
                this.f20604e.s1().dismiss();
                if (!ka.c.f13158a.m(str)) {
                    this.f20604e.o1(q.B0(str.toString()).toString());
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
        final /* synthetic */ AllotmentLetterActivity f20605e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AllotmentLetterActivity allotmentLetterActivity) {
            super(1);
            this.f20605e = allotmentLetterActivity;
        }

        public final void b(String str) {
            this.f20605e.s1().dismiss();
            if (!p.o(str, "Error", true)) {
                this.f20605e.G1(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20606a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20606a = lVar;
        }

        public final pl.c a() {
            return this.f20606a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20606a.invoke(obj);
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

    private final void A1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
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
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ye.c(dialog));
        textView2.setOnClickListener(new ye.d(dialog));
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

    private final boolean J1() {
        s1().show();
        j jVar = this.G;
        j jVar2 = null;
        if (jVar == null) {
            cm.l.v("binding");
            jVar = null;
        }
        Editable text = jVar.f26893h.getText();
        cm.l.c(text);
        if (text.length() == 0) {
            j jVar3 = this.G;
            if (jVar3 == null) {
                cm.l.v("binding");
                jVar3 = null;
            }
            jVar3.f26893h.setError(r1().b("PLEASE_ENTER_APPLICATION", "Please enter valid Receipt Number"));
            j jVar4 = this.G;
            if (jVar4 == null) {
                cm.l.v("binding");
            } else {
                jVar2 = jVar4;
            }
            jVar2.f26893h.requestFocus();
            s1().dismiss();
            return false;
        }
        af.a p12 = p1();
        j jVar5 = this.G;
        if (jVar5 == null) {
            cm.l.v("binding");
        } else {
            jVar2 = jVar5;
        }
        Editable text2 = jVar2.f26893h.getText();
        cm.l.c(text2);
        p12.j(text2.toString());
        return true;
    }

    /* access modifiers changed from: private */
    public final void o1(String str) {
        Log.e("callentered", "entered tp call");
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            cm.l.e(method, "getMethod(...)");
            method.invoke((Object) null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Log.e("pdftest", "entered tp pdf");
        String str2 = str + ".pdf";
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), '/' + str2);
        Log.e("tesfile2", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + str2);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "pdf not found", 1).show();
        }
    }

    private final void u1() {
        try {
            getIntent();
        } catch (Exception unused) {
        }
        j jVar = this.G;
        j jVar2 = null;
        if (jVar == null) {
            cm.l.v("binding");
            jVar = null;
        }
        jVar.f26888c.f28306g.setOnClickListener(new e(this));
        j jVar3 = this.G;
        if (jVar3 == null) {
            cm.l.v("binding");
            jVar3 = null;
        }
        jVar3.f26888c.f28305f.setOnClickListener(new f(this));
        j jVar4 = this.G;
        if (jVar4 == null) {
            cm.l.v("binding");
            jVar4 = null;
        }
        jVar4.f26891f.setOnClickListener(new g(this));
        j jVar5 = this.G;
        if (jVar5 == null) {
            cm.l.v("binding");
            jVar5 = null;
        }
        jVar5.f26889d.setOnClickListener(new ye.h(this));
        j jVar6 = this.G;
        if (jVar6 == null) {
            cm.l.v("binding");
            jVar6 = null;
        }
        jVar6.f26893h.setKeyListener(DigitsKeyListener.getInstance(this.K));
        j jVar7 = this.G;
        if (jVar7 == null) {
            cm.l.v("binding");
        } else {
            jVar2 = jVar7;
        }
        jVar2.f26893h.setRawInputType(4096);
    }

    /* access modifiers changed from: private */
    public static final void v1(AllotmentLetterActivity allotmentLetterActivity, View view) {
        cm.l.f(allotmentLetterActivity, "this$0");
        allotmentLetterActivity.A1();
    }

    /* access modifiers changed from: private */
    public static final void w1(AllotmentLetterActivity allotmentLetterActivity, View view) {
        cm.l.f(allotmentLetterActivity, "this$0");
        allotmentLetterActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void x1(AllotmentLetterActivity allotmentLetterActivity, View view) {
        cm.l.f(allotmentLetterActivity, "this$0");
        if (allotmentLetterActivity.J1()) {
            allotmentLetterActivity.s1().show();
            af.a p12 = allotmentLetterActivity.p1();
            j jVar = allotmentLetterActivity.G;
            if (jVar == null) {
                cm.l.v("binding");
                jVar = null;
            }
            p12.j(String.valueOf(jVar.f26893h.getText()));
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(AllotmentLetterActivity allotmentLetterActivity, View view) {
        cm.l.f(allotmentLetterActivity, "this$0");
        allotmentLetterActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void z1(AllotmentLetterActivity allotmentLetterActivity, View view) {
        cm.l.f(allotmentLetterActivity, "this$0");
        allotmentLetterActivity.finish();
    }

    public final void B1(af.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.J = aVar;
    }

    public final void C1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.L = imageView;
    }

    public final void D1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void E1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }

    public final void F1(AllotmentLetterRetrofitServices allotmentLetterRetrofitServices) {
        cm.l.f(allotmentLetterRetrofitServices, "<set-?>");
        this.I = allotmentLetterRetrofitServices;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j c10 = j.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        j jVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        D1(new ld.c(this));
        View findViewById = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById, "findViewById(...)");
        C1((ImageView) findViewById);
        e.a aVar = v9.e.f17509a;
        j jVar2 = this.G;
        if (jVar2 == null) {
            cm.l.v("binding");
            jVar2 = null;
        }
        aVar.B(this, jVar2);
        j jVar3 = this.G;
        if (jVar3 == null) {
            cm.l.v("binding");
        } else {
            jVar = jVar3;
        }
        jVar.f26888c.f28308i.setText(getIntent().getStringExtra("ServiceName"));
        E1(new ProgressDialog(this));
        s1().setMessage(r1().b("label_challan_please_wait", "Please wait..."));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        F1(AllotmentLetterRetrofitServices.f20607a.b(this));
        B1((af.a) new u0((x0) this, (u0.b) new ze.a(new ze.b(t1()))).a(af.a.class));
        u1();
        q1().setOnClickListener(new ye.b(this));
        p1().i().g(this, new c(new a(this)));
        p1().h().g(this, new c(new b(this)));
    }

    public final af.a p1() {
        af.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("auctionViewModle");
        return null;
    }

    public final ImageView q1() {
        ImageView imageView = this.L;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("back_image");
        return null;
    }

    public final ld.c r1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final AllotmentLetterRetrofitServices t1() {
        AllotmentLetterRetrofitServices allotmentLetterRetrofitServices = this.I;
        if (allotmentLetterRetrofitServices != null) {
            return allotmentLetterRetrofitServices;
        }
        cm.l.v("retrofitService");
        return null;
    }
}
