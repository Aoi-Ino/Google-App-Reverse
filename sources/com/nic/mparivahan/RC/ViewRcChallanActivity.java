package com.nic.mparivahan.RC;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import java.util.ArrayList;
import java.util.List;
import ni.ce;
import pl.x;
import v9.e;
import vc.x1;
import vc.y1;
import wc.q0;

public final class ViewRcChallanActivity extends d {
    public ce G;
    private String H = "";
    private String I = "";
    private ArrayList J = new ArrayList();
    public q0 K;
    public ProgressDialog L;
    public ld.c M;
    private SearchChallanService N;
    private jb.c O;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewRcChallanActivity f9535e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewRcChallanActivity viewRcChallanActivity) {
            super(1);
            this.f9535e = viewRcChallanActivity;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            try {
                cm.l.c(searchChallanModel);
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    this.f9535e.v1(searchChallanModel.getResult());
                    this.f9535e.j1().f25790b.setVisibility(0);
                    this.f9535e.j1().f25791c.setVisibility(8);
                    if (this.f9535e.l1().size() > 0) {
                        ViewRcChallanActivity viewRcChallanActivity = this.f9535e;
                        viewRcChallanActivity.s1(viewRcChallanActivity.l1());
                    } else {
                        this.f9535e.j1().f25790b.setVisibility(8);
                        this.f9535e.j1().f25791c.setVisibility(0);
                    }
                    if (this.f9535e.m1().isShowing()) {
                        this.f9535e.m1().dismiss();
                        return;
                    }
                    return;
                }
                if (this.f9535e.m1().isShowing()) {
                    this.f9535e.m1().dismiss();
                }
                this.f9535e.j1().f25790b.setVisibility(8);
                this.f9535e.j1().f25791c.setVisibility(0);
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f9535e.m1().isShowing()) {
                    this.f9535e.m1().dismiss();
                }
                this.f9535e.j1().f25790b.setVisibility(8);
                this.f9535e.j1().f25791c.setVisibility(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewRcChallanActivity f9536e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ViewRcChallanActivity viewRcChallanActivity) {
            super(1);
            this.f9536e = viewRcChallanActivity;
        }

        public final void b(String str) {
            if (this.f9536e.m1().isShowing()) {
                this.f9536e.m1().dismiss();
            }
            this.f9536e.j1().f25790b.setVisibility(8);
            this.f9536e.j1().f25791c.setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9537a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f9537a = lVar;
        }

        public final pl.c a() {
            return this.f9537a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9537a.invoke(obj);
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

    private final void k1() {
        try {
            m1().show();
            jb.c cVar = this.O;
            if (cVar == null) {
                cm.l.v("viewModel");
                cVar = null;
            }
            cVar.s(this.I, this.H, 1, 2);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (m1().isShowing()) {
                m1().dismiss();
            }
        }
    }

    private final void o1() {
        SearchChallanService searchChallanService = this.N;
        if (searchChallanService == null) {
            cm.l.v("retrofitService");
            searchChallanService = null;
        }
        this.O = (jb.c) new u0((x0) this, (u0.b) new jb.b(new jb.a(searchChallanService))).a(jb.c.class);
        j1().f25792d.f28305f.setOnClickListener(new x1(this));
        j1().f25792d.f28306g.setOnClickListener(new y1(this));
        j1().f25790b.setLayoutManager(new LinearLayoutManager(this));
        t1(new q0(this, new ArrayList(), n1()));
        j1().f25790b.setAdapter(i1());
        k1();
    }

    /* access modifiers changed from: private */
    public static final void p1(ViewRcChallanActivity viewRcChallanActivity, View view) {
        cm.l.f(viewRcChallanActivity, "this$0");
        viewRcChallanActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void q1(ViewRcChallanActivity viewRcChallanActivity, View view) {
        cm.l.f(viewRcChallanActivity, "this$0");
        viewRcChallanActivity.r1();
    }

    private final void r1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void s1(List list) {
        q0 i12 = i1();
        i12.A(list);
        i12.j();
    }

    public final q0 i1() {
        q0 q0Var = this.K;
        if (q0Var != null) {
            return q0Var;
        }
        cm.l.v("adapter");
        return null;
    }

    public final ce j1() {
        ce ceVar = this.G;
        if (ceVar != null) {
            return ceVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final ArrayList l1() {
        return this.J;
    }

    public final ProgressDialog m1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("progressDialog");
        return null;
    }

    public final ld.c n1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ce c10 = ce.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        u1(c10);
        setContentView((View) j1().b());
        e.f17509a.V2(this, j1());
        x1(new ld.c(this));
        if (getIntent().hasExtra("rcNo")) {
            String stringExtra = getIntent().getStringExtra("rcNo");
            cm.l.c(stringExtra);
            this.H = stringExtra;
        }
        if (getIntent().hasExtra("type")) {
            String stringExtra2 = getIntent().getStringExtra("type");
            cm.l.c(stringExtra2);
            this.I = stringExtra2;
        }
        w1(new ProgressDialog(this));
        m1().setCancelable(false);
        m1().setCanceledOnTouchOutside(false);
        m1().setMessage(n1().b("label_challan_please_wait", "Please wait..."));
        this.N = SearchChallanService.f8750a.d(this);
        o1();
        jb.c cVar = this.O;
        jb.c cVar2 = null;
        if (cVar == null) {
            cm.l.v("viewModel");
            cVar = null;
        }
        cVar.u().g(this, new c(new a(this)));
        jb.c cVar3 = this.O;
        if (cVar3 == null) {
            cm.l.v("viewModel");
        } else {
            cVar2 = cVar3;
        }
        cVar2.t().g(this, new c(new b(this)));
    }

    public final void t1(q0 q0Var) {
        cm.l.f(q0Var, "<set-?>");
        this.K = q0Var;
    }

    public final void u1(ce ceVar) {
        cm.l.f(ceVar, "<set-?>");
        this.G = ceVar;
    }

    public final void v1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.J = arrayList;
    }

    public final void w1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void x1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }
}
