package com.nic.mparivahan.Checkpost;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptServices.CheckpostTaxReceiptServices;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.DownloadCheckpostTaxReceiptList;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import ld.c;
import ni.x3;
import pl.x;
import v9.e;
import z8.n;
import z8.o;
import z8.p;
import z8.q;

public final class DownloadCheckPostReceipt2 extends d {
    public x3 G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    private String K = "0";
    public String L;
    private CheckpostTaxReceiptServices M;
    private ee.a N;
    public c O;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadCheckPostReceipt2 f7752e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DownloadCheckPostReceipt2 downloadCheckPostReceipt2) {
            super(1);
            this.f7752e = downloadCheckPostReceipt2;
        }

        public final void b(String str) {
            if (str.equals("SUCCESS")) {
                Intent intent = new Intent(this.f7752e, DownloadCheckpostTaxReceiptList.class);
                intent.putExtra("stateCode", this.f7752e.p1());
                intent.putExtra("regNo", String.valueOf(this.f7752e.l1().f29301k.getText()));
                this.f7752e.startActivity(intent);
                return;
            }
            this.f7752e.A1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7753a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f7753a = lVar;
        }

        public final pl.c a() {
            return this.f7753a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7753a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public final void A1(String str) {
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
        textView.setText(m1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new p(dialog));
        textView2.setOnClickListener(new q(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void C1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r1(DownloadCheckPostReceipt2 downloadCheckPostReceipt2, View view) {
        cm.l.f(downloadCheckPostReceipt2, "this$0");
        downloadCheckPostReceipt2.finish();
    }

    /* access modifiers changed from: private */
    public static final void s1(DownloadCheckPostReceipt2 downloadCheckPostReceipt2, VahanStateModle vahanStateModle) {
        cm.l.f(downloadCheckPostReceipt2, "this$0");
        downloadCheckPostReceipt2.n1().dismiss();
        Log.e("got state", vahanStateModle.toString());
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            cm.l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            downloadCheckPostReceipt2.l1().f29299i.setAdapter(new og.b0(downloadCheckPostReceipt2, vahanStateModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void t1(DownloadCheckPostReceipt2 downloadCheckPostReceipt2, View view) {
        c m12;
        String string;
        String str;
        cm.l.f(downloadCheckPostReceipt2, "this$0");
        if (downloadCheckPostReceipt2.l1().f29299i.getSelectedItemPosition() == 0) {
            m12 = downloadCheckPostReceipt2.m1();
            string = downloadCheckPostReceipt2.getString(R.string.please_selecr_State);
            str = "label_log_sel_state";
        } else {
            Editable text = downloadCheckPostReceipt2.l1().f29301k.getText();
            cm.l.c(text);
            if (text.length() < 2) {
                m12 = downloadCheckPostReceipt2.m1();
                string = downloadCheckPostReceipt2.getString(R.string.please_enter_vehicle_no);
                str = "label_challan_please_enter_vehicle_no";
            } else {
                Object selectedItem = downloadCheckPostReceipt2.l1().f29299i.getSelectedItem();
                cm.l.d(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                ArrayList arrayList = (ArrayList) selectedItem;
                Object obj = arrayList.get(0);
                cm.l.d(obj, "null cannot be cast to non-null type kotlin.String");
                Log.e("stateInfo2", (String) obj);
                Object obj2 = arrayList.get(0);
                cm.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
                downloadCheckPostReceipt2.y1((String) obj2);
                Log.e("statertoinfo", downloadCheckPostReceipt2.p1());
                ee.a aVar = downloadCheckPostReceipt2.N;
                if (aVar == null) {
                    cm.l.v("viewModeltax");
                    aVar = null;
                }
                aVar.i(downloadCheckPostReceipt2.p1(), String.valueOf(downloadCheckPostReceipt2.l1().f29301k.getText()));
                return;
            }
        }
        Toast.makeText(downloadCheckPostReceipt2, m12.b(str, string), 1).show();
    }

    public final x3 l1() {
        x3 x3Var = this.G;
        if (x3Var != null) {
            return x3Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final c m1() {
        c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final VahanProService o1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x3 c10 = x3.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        u1(c10);
        setContentView((View) l1().b());
        l1().f29292b.f28308i.setText("Download Checkpost Tax Receipt");
        x1(VahanProService.f21196b.b(this));
        v1(new c(this));
        e.f17509a.A0(this, l1());
        w1(new ProgressDialog(this));
        n1().setMessage("Please wait...");
        n1().setCancelable(false);
        n1().setCanceledOnTouchOutside(false);
        l1().f29292b.f28305f.setOnClickListener(new z8.m(this));
        z1((h) new u0((x0) this, (u0.b) new g(new wg.d(o1()))).a(h.class));
        this.M = CheckpostTaxReceiptServices.f20557a.c(this);
        CheckpostTaxReceiptServices checkpostTaxReceiptServices = this.M;
        ee.a aVar = null;
        if (checkpostTaxReceiptServices == null) {
            cm.l.v("retrofitServicetax");
            checkpostTaxReceiptServices = null;
        }
        this.N = (ee.a) new u0((x0) this, (u0.b) new de.a(new ce.a(checkpostTaxReceiptServices))).a(ee.a.class);
        try {
            n1().show();
            q1().V0(this);
        } catch (Exception unused) {
        }
        q1().U0().g(this, new n(this));
        ee.a aVar2 = this.N;
        if (aVar2 == null) {
            cm.l.v("viewModeltax");
        } else {
            aVar = aVar2;
        }
        aVar.h().g(this, new b(new a(this)));
        l1().f29294d.setOnClickListener(new o(this));
    }

    public final String p1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    public final h q1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void u1(x3 x3Var) {
        cm.l.f(x3Var, "<set-?>");
        this.G = x3Var;
    }

    public final void v1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void w1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void x1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void y1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void z1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }
}
