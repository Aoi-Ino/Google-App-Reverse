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
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import bi.k;
import cm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeesRepository.FancyFeesServices;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import ni.r4;
import pl.x;
import v9.e;
import ye.a0;
import ye.c0;
import ye.d0;
import ye.e0;
import ye.f0;
import ye.y;
import ye.z;

public final class FancyFeeReceipt extends androidx.appcompat.app.d {
    public r4 G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    public ImageView K;
    public String L;
    public p001if.a M;
    public FancyFeesServices N;
    public ld.c O;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FancyFeeReceipt f20628e;

        a(FancyFeeReceipt fancyFeeReceipt) {
            this.f20628e = fancyFeeReceipt;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f20628e.r1().f28375f.getSelectedItemPosition() != 0) {
                Object selectedItem = this.f20628e.r1().f28375f.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                FancyFeeReceipt fancyFeeReceipt = this.f20628e;
                Object obj = ((ArrayList) selectedItem).get(0);
                l.d(obj, "null cannot be cast to non-null type kotlin.String");
                fancyFeeReceipt.O1((String) obj);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FancyFeeReceipt f20629e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FancyFeeReceipt fancyFeeReceipt) {
            super(1);
            this.f20629e = fancyFeeReceipt;
        }

        public final void b(String str) {
            try {
                this.f20629e.t1().dismiss();
                if (!ka.c.f13158a.m(str)) {
                    FancyFeeReceipt fancyFeeReceipt = this.f20629e;
                    l.c(str);
                    fancyFeeReceipt.p1(q.B0(str).toString());
                    return;
                }
                this.f20629e.Q1("Unable to download the receipt");
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FancyFeeReceipt f20630e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FancyFeeReceipt fancyFeeReceipt) {
            super(1);
            this.f20630e = fancyFeeReceipt;
        }

        public final void b(String str) {
            this.f20630e.t1().dismiss();
            if (p.o(str, "Error", true)) {
                this.f20630e.Q1("Unable to download the receipt");
            } else {
                this.f20630e.Q1(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20631a;

        d(bm.l lVar) {
            l.f(lVar, "function");
            this.f20631a = lVar;
        }

        public final pl.c a() {
            return this.f20631a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20631a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(FancyFeeReceipt fancyFeeReceipt, View view) {
        l.f(fancyFeeReceipt, "this$0");
        fancyFeeReceipt.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void B1(FancyFeeReceipt fancyFeeReceipt, View view) {
        l.f(fancyFeeReceipt, "this$0");
        fancyFeeReceipt.G1();
    }

    /* access modifiers changed from: private */
    public static final void C1(FancyFeeReceipt fancyFeeReceipt, View view) {
        l.f(fancyFeeReceipt, "this$0");
        Object selectedItem = fancyFeeReceipt.r1().f28375f.getSelectedItem();
        l.d(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
        Object obj = ((ArrayList) selectedItem).get(0);
        l.d(obj, "null cannot be cast to non-null type kotlin.String");
        fancyFeeReceipt.O1((String) obj);
        if (fancyFeeReceipt.T1()) {
            fancyFeeReceipt.t1().show();
            fancyFeeReceipt.u1().j(fancyFeeReceipt.x1(), String.valueOf(fancyFeeReceipt.r1().f28377h.getText()));
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(FancyFeeReceipt fancyFeeReceipt, View view) {
        l.f(fancyFeeReceipt, "this$0");
        fancyFeeReceipt.finish();
    }

    /* access modifiers changed from: private */
    public static final void E1(FancyFeeReceipt fancyFeeReceipt, String str) {
        l.f(fancyFeeReceipt, "this$0");
        fancyFeeReceipt.t1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F1(FancyFeeReceipt fancyFeeReceipt, VahanStateModle vahanStateModle) {
        l.f(fancyFeeReceipt, "this$0");
        fancyFeeReceipt.t1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            fancyFeeReceipt.r1().f28375f.setAdapter(new og.b0(fancyFeeReceipt, vahanStateModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void G1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void Q1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText(s1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ye.b0(dialog));
        textView2.setOnClickListener(new c0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void R1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void S1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean T1() {
        if (r1().f28375f.getSelectedItemPosition() == 0) {
            Toast.makeText(this, s1().b("label_log_sel_state", getString(R.string.please_selecr_State)), 0).show();
            return false;
        } else if (String.valueOf(r1().f28377h.getText()).length() >= 4) {
            return true;
        } else {
            r1().f28377h.setError(s1().b("please_enter_valid_recpt_no", getString(R.string.please_enter_valid_recpt_no)));
            r1().f28377h.requestFocus();
            t1().dismiss();
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void p1(String str) {
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            l.e(method, "getMethod(...)");
            method.invoke((Object) null, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(externalStoragePublicDirectory, '/' + (str + ".pdf"));
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, s1().b("pdf_not_found", getString(R.string.pdf_not_found)), 1).show();
        }
    }

    private final void z1() {
        r1().f28376g.f28305f.setOnClickListener(new d0(this));
        r1().f28376g.f28306g.setOnClickListener(new e0(this));
        r1().f28372c.setOnClickListener(new f0(this));
    }

    public final void H1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.K = imageView;
    }

    public final void I1(r4 r4Var) {
        l.f(r4Var, "<set-?>");
        this.G = r4Var;
    }

    public final void J1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void L1(p001if.a aVar) {
        l.f(aVar, "<set-?>");
        this.M = aVar;
    }

    public final void M1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void N1(FancyFeesServices fancyFeesServices) {
        l.f(fancyFeesServices, "<set-?>");
        this.N = fancyFeesServices;
    }

    public final void O1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void P1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r4 c10 = r4.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        I1(c10);
        setContentView((View) r1().b());
        M1(VahanProService.f21196b.b(this));
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        H1((ImageView) findViewById);
        e.f17509a.N0(this, r1());
        r1().f28376g.f28308i.setText(getIntent().getStringExtra("ServiceName"));
        J1(new ld.c(this));
        K1(new ProgressDialog(this));
        t1().setMessage(s1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        P1((h) new u0((x0) this, (u0.b) new k(new wg.d(v1()))).a(h.class));
        N1(FancyFeesServices.f20632a.b(this));
        L1((p001if.a) new u0((x0) this, (u0.b) new hf.a(new hf.b(w1()))).a(p001if.a.class));
        z1();
        q1().setOnClickListener(new y(this));
        try {
            t1().show();
            y1().V0(this);
        } catch (Exception unused) {
        }
        y1().W0().g(this, new z(this));
        y1().U0().g(this, new a0(this));
        Spinner spinner = r1().f28375f;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        u1().h().g(this, new d(new b(this)));
        u1().i().g(this, new d(new c(this)));
    }

    public final ImageView q1() {
        ImageView imageView = this.K;
        if (imageView != null) {
            return imageView;
        }
        l.v("back_image");
        return null;
    }

    public final r4 r1() {
        r4 r4Var = this.G;
        if (r4Var != null) {
            return r4Var;
        }
        l.v("binding");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final p001if.a u1() {
        p001if.a aVar = this.M;
        if (aVar != null) {
            return aVar;
        }
        l.v("receiptViewModle");
        return null;
    }

    public final VahanProService v1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final FancyFeesServices w1() {
        FancyFeesServices fancyFeesServices = this.N;
        if (fancyFeesServices != null) {
            return fancyFeesServices;
        }
        l.v("retrofitServiceFees");
        return null;
    }

    public final String x1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("stateCode");
        return null;
    }

    public final h y1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
