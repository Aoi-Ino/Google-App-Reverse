package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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
import com.nic.mparivahan.VahanServices.FancyServices.RunningAuctionRepository.RunningAuctionRetrofitServices;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import ni.t7;
import og.z;
import pl.x;
import v9.e;
import ye.g0;
import ye.h0;
import ye.i0;
import ye.j0;
import ye.k0;
import ye.l0;

public final class RunningAuctionActivity extends androidx.appcompat.app.d {
    public t7 G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    public ImageView K;
    private String L = "0";
    private RunningAuctionRetrofitServices M;
    private mf.a N;
    public String O;
    public String P;
    public ld.c Q;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RunningAuctionActivity f20635e;

        a(RunningAuctionActivity runningAuctionActivity) {
            this.f20635e = runningAuctionActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f20635e.n1().f28688g.getSelectedItemPosition() != 0) {
                this.f20635e.p1().show();
                Object selectedItem = this.f20635e.n1().f28688g.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f20635e.t1().K0(((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RunningAuctionActivity f20636e;

        b(RunningAuctionActivity runningAuctionActivity) {
            this.f20636e = runningAuctionActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f20636e.n1().f28686e.getSelectedItemPosition() != 0) {
                Object selectedItem = this.f20636e.n1().f28686e.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem");
                this.f20636e.D1(((RtoNameModleItem) selectedItem).getOff_cd());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RunningAuctionActivity f20637e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RunningAuctionActivity runningAuctionActivity) {
            super(1);
            this.f20637e = runningAuctionActivity;
        }

        public final void b(String str) {
            if (str.equals("SUCCESS")) {
                Intent intent = new Intent(this.f20637e, RunningAuctionDetail.class);
                intent.putExtra("stateCode", this.f20637e.s1());
                intent.putExtra("rtoCode", this.f20637e.r1());
                this.f20637e.startActivity(intent);
                return;
            }
            this.f20637e.G1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20638a;

        d(bm.l lVar) {
            l.f(lVar, "function");
            this.f20638a = lVar;
        }

        public final pl.c a() {
            return this.f20638a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20638a.invoke(obj);
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
        textView.setOnClickListener(new k0(dialog));
        textView2.setOnClickListener(new l0(dialog));
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
        if (n1().f28688g.getSelectedItemPosition() == 0) {
            o12 = o1();
            string = getString(R.string.please_selecr_State);
            str = "label_log_sel_state";
        } else if (n1().f28686e.getSelectedItemPosition() != 0) {
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
    public static final void u1(RunningAuctionActivity runningAuctionActivity, View view) {
        l.f(runningAuctionActivity, "this$0");
        runningAuctionActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(RunningAuctionActivity runningAuctionActivity, VahanStateModle vahanStateModle) {
        l.f(runningAuctionActivity, "this$0");
        runningAuctionActivity.p1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            runningAuctionActivity.n1().f28688g.setAdapter(new og.b0(runningAuctionActivity, vahanStateModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void w1(RunningAuctionActivity runningAuctionActivity, RtoNameModle rtoNameModle) {
        RunningAuctionActivity runningAuctionActivity2 = runningAuctionActivity;
        RtoNameModle rtoNameModle2 = rtoNameModle;
        l.f(runningAuctionActivity2, "this$0");
        runningAuctionActivity.p1().dismiss();
        try {
            RtoNameModleItem rtoNameModleItem = new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select RTO", "0", "0", "0", "0", "0", "0");
            l.c(rtoNameModle);
            rtoNameModle2.add(0, rtoNameModleItem);
            try {
                runningAuctionActivity2.E1(new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select RTO", "0", "0", "0", "0", "0", "0").getState_cd());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            runningAuctionActivity.n1().f28686e.setAdapter(new z(runningAuctionActivity2, rtoNameModle2));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(RunningAuctionActivity runningAuctionActivity, View view) {
        l.f(runningAuctionActivity, "this$0");
        Object selectedItem = runningAuctionActivity.n1().f28688g.getSelectedItem();
        l.d(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
        Object obj = ((ArrayList) selectedItem).get(0);
        l.d(obj, "null cannot be cast to non-null type kotlin.String");
        runningAuctionActivity.E1((String) obj);
        if (runningAuctionActivity.J1()) {
            mf.a aVar = runningAuctionActivity.N;
            if (aVar == null) {
                l.v("viewModelrunningAuction");
                aVar = null;
            }
            aVar.i(runningAuctionActivity.s1(), runningAuctionActivity.r1());
        }
    }

    public final void A1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
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
        this.P = str;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
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

    public final t7 n1() {
        t7 t7Var = this.G;
        if (t7Var != null) {
            return t7Var;
        }
        l.v("binding");
        return null;
    }

    public final ld.c o1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t7 c10 = t7.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        z1(c10);
        setContentView((View) n1().b());
        C1(VahanProService.f21196b.b(this));
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        y1((ImageView) findViewById);
        A1(new ld.c(this));
        n1().f28689h.f28308i.setText("Show Auction Status");
        e.f17509a.G1(this, n1());
        B1(new ProgressDialog(this));
        p1().setMessage(o1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        F1((h) new u0((x0) this, (u0.b) new g(new wg.d(q1()))).a(h.class));
        this.M = RunningAuctionRetrofitServices.f20642a.b(this);
        RunningAuctionRetrofitServices runningAuctionRetrofitServices = this.M;
        mf.a aVar = null;
        if (runningAuctionRetrofitServices == null) {
            l.v("retrofitServicefancy");
            runningAuctionRetrofitServices = null;
        }
        this.N = (mf.a) new u0((x0) this, (u0.b) new lf.a(new lf.b(runningAuctionRetrofitServices))).a(mf.a.class);
        m1().setOnClickListener(new g0(this));
        try {
            p1().show();
            t1().V0(this);
        } catch (Exception unused) {
        }
        t1().U0().g(this, new h0(this));
        Spinner spinner = n1().f28688g;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        t1().d0().g(this, new i0(this));
        Spinner spinner2 = n1().f28686e;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new b(this));
        }
        mf.a aVar2 = this.N;
        if (aVar2 == null) {
            l.v("viewModelrunningAuction");
        } else {
            aVar = aVar2;
        }
        aVar.g().g(this, new d(new c(this)));
        n1().f28683b.setOnClickListener(new j0(this));
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
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("rtoCode");
        return null;
    }

    public final String s1() {
        String str = this.O;
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

    public final void z1(t7 t7Var) {
        l.f(t7Var, "<set-?>");
        this.G = t7Var;
    }
}
