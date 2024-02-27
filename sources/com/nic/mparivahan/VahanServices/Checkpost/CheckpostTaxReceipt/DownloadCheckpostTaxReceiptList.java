package com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownload;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptServices.CheckpostTaxReceiptServices;
import java.util.ArrayList;
import java.util.List;
import ni.y3;
import pl.c;
import pl.x;
import v9.e;

public final class DownloadCheckpostTaxReceiptList extends d {
    public y3 G;
    private ArrayList H = new ArrayList();
    public fe.b I;
    public ProgressDialog J;
    public String K;
    public String L;
    private CheckpostTaxReceiptServices M;
    private ee.a N;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadCheckpostTaxReceiptList f20560e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DownloadCheckpostTaxReceiptList downloadCheckpostTaxReceiptList) {
            super(1);
            this.f20560e = downloadCheckpostTaxReceiptList;
        }

        public final void b(CheckpostTaxReceiptDownload checkpostTaxReceiptDownload) {
            try {
                DownloadCheckpostTaxReceiptList downloadCheckpostTaxReceiptList = this.f20560e;
                cm.l.d(checkpostTaxReceiptDownload, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownloadItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownloadItem> }");
                downloadCheckpostTaxReceiptList.v1(checkpostTaxReceiptDownload);
                if (this.f20560e.k1().size() > 0) {
                    Log.e("chekTaxc", this.f20560e.k1().toString());
                    DownloadCheckpostTaxReceiptList downloadCheckpostTaxReceiptList2 = this.f20560e;
                    downloadCheckpostTaxReceiptList2.s1(downloadCheckpostTaxReceiptList2.k1());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f20560e.l1().isShowing()) {
                    this.f20560e.l1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckpostTaxReceiptDownload) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20561a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f20561a = lVar;
        }

        public final c a() {
            return this.f20561a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20561a.invoke(obj);
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

    private final void o1() {
        this.M = CheckpostTaxReceiptServices.f20557a.c(this);
        CheckpostTaxReceiptServices checkpostTaxReceiptServices = this.M;
        ee.a aVar = null;
        if (checkpostTaxReceiptServices == null) {
            cm.l.v("retrofitServicetax");
            checkpostTaxReceiptServices = null;
        }
        this.N = (ee.a) new u0((x0) this, (u0.b) new de.a(new ce.a(checkpostTaxReceiptServices))).a(ee.a.class);
        j1().f29443e.f28305f.setOnClickListener(new be.a(this));
        j1().f29443e.f28306g.setOnClickListener(new be.b(this));
        j1().f29441c.setLayoutManager(new LinearLayoutManager(this));
        t1(new fe.b(this, new ArrayList()));
        j1().f29441c.setAdapter(i1());
        try {
            l1().show();
            ee.a aVar2 = this.N;
            if (aVar2 == null) {
                cm.l.v("viewModeltax");
            } else {
                aVar = aVar2;
            }
            aVar.i(n1(), m1());
        } catch (Exception e10) {
            e10.printStackTrace();
            if (l1().isShowing()) {
                l1().dismiss();
            }
        }
        j1().f29441c.setAdapter(i1());
        if (l1().isShowing()) {
            l1().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void p1(DownloadCheckpostTaxReceiptList downloadCheckpostTaxReceiptList, View view) {
        cm.l.f(downloadCheckpostTaxReceiptList, "this$0");
        downloadCheckpostTaxReceiptList.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void q1(DownloadCheckpostTaxReceiptList downloadCheckpostTaxReceiptList, View view) {
        cm.l.f(downloadCheckpostTaxReceiptList, "this$0");
        downloadCheckpostTaxReceiptList.r1();
    }

    private final void r1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void s1(List list) {
        fe.b i12 = i1();
        i12.B(list);
        i12.j();
    }

    public final fe.b i1() {
        fe.b bVar = this.I;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("adapter");
        return null;
    }

    public final y3 j1() {
        y3 y3Var = this.G;
        if (y3Var != null) {
            return y3Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final ArrayList k1() {
        return this.H;
    }

    public final ProgressDialog l1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("progressDialog");
        return null;
    }

    public final String m1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("regNo");
        return null;
    }

    public final String n1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y3 c10 = y3.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        u1(c10);
        setContentView((View) j1().b());
        e.f17509a.B0(this, j1());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("stateCode", "HR");
            cm.l.e(string, "getString(...)");
            y1(string);
            String string2 = extras.getString("regNo", "0");
            cm.l.e(string2, "getString(...)");
            x1(string2);
            Log.e("stateInfo", n1().toString());
            Log.e("stateInfo", m1().toString());
        }
        j1().f29443e.f28308i.setText("Download Checkpost Tax Receipt");
        w1(new ProgressDialog(this));
        l1().setCancelable(false);
        l1().setCanceledOnTouchOutside(false);
        o1();
        ee.a aVar = this.N;
        if (aVar == null) {
            cm.l.v("viewModeltax");
            aVar = null;
        }
        aVar.g().g(this, new b(new a(this)));
    }

    public final void t1(fe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.I = bVar;
    }

    public final void u1(y3 y3Var) {
        cm.l.f(y3Var, "<set-?>");
        this.G = y3Var;
    }

    public final void v1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.H = arrayList;
    }

    public final void w1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void x1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void y1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }
}
