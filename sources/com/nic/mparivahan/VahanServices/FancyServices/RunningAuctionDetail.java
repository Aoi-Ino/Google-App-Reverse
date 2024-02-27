package com.nic.mparivahan.VahanServices.FancyServices;

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
import com.nic.mparivahan.VahanServices.FancyServices.RunningAuctionRepository.RunningAuctionRetrofitServices;
import java.util.ArrayList;
import ni.u7;
import pl.x;
import ye.m0;
import ye.n0;

public final class RunningAuctionDetail extends d {
    public u7 G;
    private ArrayList H = new ArrayList();
    public jf.a I;
    public ProgressDialog J;
    private RunningAuctionRetrofitServices K;
    private mf.a L;
    public String M;
    public String N;
    private ArrayList O = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RunningAuctionDetail f20639e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RunningAuctionDetail runningAuctionDetail) {
            super(1);
            this.f20639e = runningAuctionDetail;
        }

        public final void b(kf.a aVar) {
            try {
                cm.l.c(aVar);
                throw null;
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f20639e.k1().isShowing()) {
                    this.f20639e.k1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((kf.a) null);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RunningAuctionDetail f20640e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RunningAuctionDetail runningAuctionDetail) {
            super(1);
            this.f20640e = runningAuctionDetail;
        }

        public final void b(String str) {
            if (this.f20640e.k1().isShowing()) {
                this.f20640e.k1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20641a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20641a = lVar;
        }

        public final pl.c a() {
            return this.f20641a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20641a.invoke(obj);
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

    private final void j1() {
        try {
            k1().show();
            mf.a aVar = this.L;
            if (aVar == null) {
                cm.l.v("viewModel");
                aVar = null;
            }
            aVar.i(m1(), l1());
        } catch (Exception e10) {
            e10.printStackTrace();
            if (k1().isShowing()) {
                k1().dismiss();
            }
        }
    }

    private final void n1() {
        RunningAuctionRetrofitServices runningAuctionRetrofitServices = this.K;
        if (runningAuctionRetrofitServices == null) {
            cm.l.v("retrofitService");
            runningAuctionRetrofitServices = null;
        }
        this.L = (mf.a) new u0((x0) this, (u0.b) new lf.a(new lf.b(runningAuctionRetrofitServices))).a(mf.a.class);
        i1().f28851d.f28305f.setOnClickListener(new m0(this));
        i1().f28851d.f28306g.setOnClickListener(new n0(this));
        i1().f28849b.setLayoutManager(new LinearLayoutManager(this));
        r1(new jf.a(this, new ArrayList()));
        i1().f28849b.setAdapter(h1());
        j1();
    }

    /* access modifiers changed from: private */
    public static final void o1(RunningAuctionDetail runningAuctionDetail, View view) {
        cm.l.f(runningAuctionDetail, "this$0");
        runningAuctionDetail.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void p1(RunningAuctionDetail runningAuctionDetail, View view) {
        cm.l.f(runningAuctionDetail, "this$0");
        runningAuctionDetail.q1();
    }

    private final void q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final jf.a h1() {
        jf.a aVar = this.I;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("adapter");
        return null;
    }

    public final u7 i1() {
        u7 u7Var = this.G;
        if (u7Var != null) {
            return u7Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final ProgressDialog k1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("progressDialog");
        return null;
    }

    public final String l1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final String m1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u7 c10 = u7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        s1(c10);
        setContentView((View) i1().b());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("stateCode", "HR");
            cm.l.e(string, "getString(...)");
            v1(string);
            String string2 = extras.getString("rtoCode", "0");
            cm.l.e(string2, "getString(...)");
            u1(string2);
        }
        i1().f28851d.f28308i.setText("Running Auctions");
        t1(new ProgressDialog(this));
        k1().setCancelable(false);
        k1().setCanceledOnTouchOutside(false);
        this.K = RunningAuctionRetrofitServices.f20642a.b(this);
        n1();
        mf.a aVar = this.L;
        mf.a aVar2 = null;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        aVar.h().g(this, new c(new a(this)));
        mf.a aVar3 = this.L;
        if (aVar3 == null) {
            cm.l.v("viewModel");
        } else {
            aVar2 = aVar3;
        }
        aVar2.g().g(this, new c(new b(this)));
    }

    public final void r1(jf.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.I = aVar;
    }

    public final void s1(u7 u7Var) {
        cm.l.f(u7Var, "<set-?>");
        this.G = u7Var;
    }

    public final void t1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void u1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void v1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }
}
