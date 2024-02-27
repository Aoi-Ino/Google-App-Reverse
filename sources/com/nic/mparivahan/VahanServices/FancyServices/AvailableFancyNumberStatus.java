package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
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
import bi.g;
import bi.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyService.AvailableFancyService;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import ni.t;
import og.z;
import pl.x;
import ye.s;
import ye.u;
import ye.v;
import ye.w;

public final class AvailableFancyNumberStatus extends androidx.appcompat.app.d {
    public t G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    public ImageView K;
    private String L = "0";
    public ld.c M;
    private AvailableFancyService N;
    private gf.a O;
    public String P;
    public String Q;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvailableFancyNumberStatus f20620e;

        a(AvailableFancyNumberStatus availableFancyNumberStatus) {
            this.f20620e = availableFancyNumberStatus;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f20620e.n1().f28601g.getSelectedItemPosition() != 0) {
                this.f20620e.p1().show();
                Object selectedItem = this.f20620e.n1().f28601g.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
                Toast.makeText(this.f20620e, vahanStateModleSubList.toString(), 1).show();
                this.f20620e.t1().K0(((String) vahanStateModleSubList.get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvailableFancyNumberStatus f20621e;

        b(AvailableFancyNumberStatus availableFancyNumberStatus) {
            this.f20621e = availableFancyNumberStatus;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f20621e.n1().f28599e.getSelectedItemPosition() != 0) {
                Object selectedItem = this.f20621e.n1().f28599e.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem");
                this.f20621e.D1(((RtoNameModleItem) selectedItem).getOff_cd());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvailableFancyNumberStatus f20622e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AvailableFancyNumberStatus availableFancyNumberStatus) {
            super(1);
            this.f20622e = availableFancyNumberStatus;
        }

        public final void b(String str) {
            if (str.equals("SUCCESS")) {
                Intent intent = new Intent(this.f20622e, AvailableFancyNumberList.class);
                intent.putExtra("stateCode", this.f20622e.s1());
                intent.putExtra("rtoCode", this.f20622e.r1());
                this.f20622e.startActivity(intent);
                return;
            }
            this.f20622e.G1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AvailableFancyNumberStatus f20623e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AvailableFancyNumberStatus availableFancyNumberStatus) {
            super(1);
            this.f20623e = availableFancyNumberStatus;
        }

        public final void b(String str) {
            this.f20623e.p1().show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20624a;

        e(bm.l lVar) {
            l.f(lVar, "function");
            this.f20624a = lVar;
        }

        public final pl.c a() {
            return this.f20624a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20624a.invoke(obj);
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
    public final void G1(String str) {
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
        textView.setText(o1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new w(dialog));
        textView2.setOnClickListener(new ye.x(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean J1() {
        ld.c o12;
        String string;
        String str;
        if (n1().f28601g.getSelectedItemPosition() == 0) {
            o12 = o1();
            string = getString(R.string.please_selecr_State);
            str = "label_log_sel_state";
        } else if (n1().f28599e.getSelectedItemPosition() != 0) {
            return true;
        } else {
            o12 = o1();
            string = getString(R.string.please_select_rto);
            str = "select_rto";
        }
        Toast.makeText(this, o12.b(str, string), 0).show();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void u1(AvailableFancyNumberStatus availableFancyNumberStatus, View view) {
        l.f(availableFancyNumberStatus, "this$0");
        availableFancyNumberStatus.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(AvailableFancyNumberStatus availableFancyNumberStatus, VahanStateModle vahanStateModle) {
        l.f(availableFancyNumberStatus, "this$0");
        availableFancyNumberStatus.p1().dismiss();
        Log.e("got state", vahanStateModle.toString());
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            availableFancyNumberStatus.n1().f28601g.setAdapter(new og.b0(availableFancyNumberStatus, vahanStateModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void w1(AvailableFancyNumberStatus availableFancyNumberStatus, RtoNameModle rtoNameModle) {
        AvailableFancyNumberStatus availableFancyNumberStatus2 = availableFancyNumberStatus;
        RtoNameModle rtoNameModle2 = rtoNameModle;
        l.f(availableFancyNumberStatus2, "this$0");
        availableFancyNumberStatus.p1().dismiss();
        try {
            RtoNameModleItem rtoNameModleItem = new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select RTO", "0", "0", "0", "0", "0", "0");
            l.c(rtoNameModle);
            rtoNameModle2.add(0, rtoNameModleItem);
            try {
                availableFancyNumberStatus2.E1(new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select RTO", "0", "0", "0", "0", "0", "0").getState_cd());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            availableFancyNumberStatus.n1().f28599e.setAdapter(new z(availableFancyNumberStatus2, rtoNameModle2));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(AvailableFancyNumberStatus availableFancyNumberStatus, View view) {
        ld.c o12;
        String string;
        String str;
        l.f(availableFancyNumberStatus, "this$0");
        if (availableFancyNumberStatus.n1().f28601g.getSelectedItemPosition() == 0) {
            o12 = availableFancyNumberStatus.o1();
            string = availableFancyNumberStatus.getString(R.string.please_selecr_State);
            str = "label_log_sel_state";
        } else if (availableFancyNumberStatus.n1().f28599e.getSelectedItemPosition() == 0) {
            o12 = availableFancyNumberStatus.o1();
            string = availableFancyNumberStatus.getString(R.string.please_select_rto);
            str = "select_rto";
        } else {
            Object selectedItem = availableFancyNumberStatus.n1().f28601g.getSelectedItem();
            l.d(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
            ArrayList arrayList = (ArrayList) selectedItem;
            Object obj = arrayList.get(0);
            l.d(obj, "null cannot be cast to non-null type kotlin.String");
            Log.e("stateInfo2", (String) obj);
            Object obj2 = arrayList.get(0);
            l.d(obj2, "null cannot be cast to non-null type kotlin.String");
            availableFancyNumberStatus.E1((String) obj2);
            Log.e("statertoinfo", availableFancyNumberStatus.s1());
            Log.e("statertoinfor", availableFancyNumberStatus.r1());
            if (availableFancyNumberStatus.J1()) {
                gf.a aVar = availableFancyNumberStatus.O;
                if (aVar == null) {
                    l.v("viewModelfancy");
                    aVar = null;
                }
                aVar.i(availableFancyNumberStatus.s1(), availableFancyNumberStatus.r1(), "10", "1");
                return;
            }
            return;
        }
        Toast.makeText(availableFancyNumberStatus, o12.b(str, string), 1).show();
    }

    public final void A1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void B1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void C1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void F1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final ImageView m1() {
        ImageView imageView = this.K;
        if (imageView != null) {
            return imageView;
        }
        l.v("back_image");
        return null;
    }

    public final t n1() {
        t tVar = this.G;
        if (tVar != null) {
            return tVar;
        }
        l.v("binding");
        return null;
    }

    public final ld.c o1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t c10 = t.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        z1(c10);
        setContentView((View) n1().b());
        C1(VahanProService.f21196b.b(this));
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        y1((ImageView) findViewById);
        A1(new ld.c(this));
        v9.e.f17509a.K(this, n1());
        n1().f28602h.f28308i.setText(getIntent().getStringExtra("ServiceName"));
        B1(new ProgressDialog(this));
        p1().setMessage(o1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        F1((h) new u0((x0) this, (u0.b) new g(new wg.d(q1()))).a(h.class));
        this.N = AvailableFancyService.f20625a.c(this);
        AvailableFancyService availableFancyService = this.N;
        gf.a aVar = null;
        if (availableFancyService == null) {
            l.v("retrofitServicefancy");
            availableFancyService = null;
        }
        this.O = (gf.a) new u0((x0) this, (u0.b) new ef.a(new ef.b(availableFancyService))).a(gf.a.class);
        m1().setOnClickListener(new s(this));
        try {
            p1().show();
            t1().V0(this);
        } catch (Exception unused) {
        }
        t1().U0().g(this, new ye.t(this));
        Spinner spinner = n1().f28601g;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        t1().d0().g(this, new u(this));
        Spinner spinner2 = n1().f28599e;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new b(this));
        }
        gf.a aVar2 = this.O;
        if (aVar2 == null) {
            l.v("viewModelfancy");
        } else {
            aVar = aVar2;
        }
        aVar.h().g(this, new e(new c(this)));
        t1().E().g(this, new e(new d(this)));
        n1().f28596b.setOnClickListener(new v(this));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final VahanProService q1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final String r1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("rtoCode");
        return null;
    }

    public final String s1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("stateCode");
        return null;
    }

    public final h t1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void y1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.K = imageView;
    }

    public final void z1(t tVar) {
        l.f(tVar, "<set-?>");
        this.G = tVar;
    }
}
