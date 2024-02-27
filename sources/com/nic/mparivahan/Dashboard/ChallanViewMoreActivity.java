package com.nic.mparivahan.Dashboard;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.Echallan.SearchPrintChallanActivity;
import com.nic.mparivahan.Echallan.SearchPrintReceiptActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.R;
import ia.e;
import ia.f;
import ia.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ka.c;
import pl.x;

public final class ChallanViewMoreActivity extends d {
    private LinearLayout G;
    private LinearLayout H;
    private LinearLayout I;
    private LinearLayout J;
    private LinearLayout K;
    private AppCompatImageView L;
    private RelativeLayout M;
    /* access modifiers changed from: private */
    public RecyclerView N;
    private TextView O;
    private TextView P;
    public qa.b Q;
    private ESInterface R;
    public ProgressDialog S;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChallanViewMoreActivity f8375e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChallanViewMoreActivity challanViewMoreActivity) {
            super(1);
            this.f8375e = challanViewMoreActivity;
        }

        public final void b(EnableServiceResponse enableServiceResponse) {
            RecyclerView m12;
            ma.d dVar;
            RecyclerView recyclerView = null;
            try {
                if (this.f8375e.o1().isShowing()) {
                    this.f8375e.o1().dismiss();
                }
                if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                    RecyclerView m13 = this.f8375e.N;
                    if (m13 == null) {
                        cm.l.v("challan_recyclerView");
                        m13 = null;
                    }
                    m13.setVisibility(0);
                    RecyclerView m14 = this.f8375e.N;
                    if (m14 == null) {
                        cm.l.v("challan_recyclerView");
                        m14 = null;
                    }
                    m14.setLayoutManager(new GridLayoutManager(this.f8375e, 4));
                    ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                    Collections.sort(enabledservice);
                    if (enabledservice.size() > 0) {
                        c.a aVar = ka.c.f13158a;
                        if (!aVar.g(enabledservice, "2001")) {
                            ChallanViewMoreActivity challanViewMoreActivity = this.f8375e;
                            dVar = new ma.d(enabledservice, challanViewMoreActivity, String.valueOf(challanViewMoreActivity.getIntent().getStringExtra("state_code")));
                            RecyclerView m15 = this.f8375e.N;
                            if (m15 == null) {
                                cm.l.v("challan_recyclerView");
                                m15 = null;
                            }
                            m15.setAdapter(dVar);
                        } else if (aVar.i(enabledservice, "2001") > -1) {
                            List<Enabledservice> subList = enabledservice.subList(0, aVar.i(enabledservice, "2001"));
                            cm.l.e(subList, "subList(...)");
                            List t02 = y.t0(subList);
                            ChallanViewMoreActivity challanViewMoreActivity2 = this.f8375e;
                            dVar = new ma.d(t02, challanViewMoreActivity2, String.valueOf(challanViewMoreActivity2.getIntent().getStringExtra("state_code")));
                            RecyclerView m16 = this.f8375e.N;
                            if (m16 == null) {
                                cm.l.v("challan_recyclerView");
                                m16 = null;
                            }
                            m16.setAdapter(dVar);
                        } else {
                            return;
                        }
                        dVar.j();
                        return;
                    }
                    m12 = this.f8375e.N;
                    if (m12 == null) {
                        cm.l.v("challan_recyclerView");
                        m12 = null;
                    }
                } else {
                    m12 = this.f8375e.N;
                    if (m12 == null) {
                        cm.l.v("challan_recyclerView");
                        m12 = null;
                    }
                }
                m12.setVisibility(8);
            } catch (Exception e10) {
                e10.printStackTrace();
                RecyclerView m17 = this.f8375e.N;
                if (m17 == null) {
                    cm.l.v("challan_recyclerView");
                } else {
                    recyclerView = m17;
                }
                recyclerView.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((EnableServiceResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f8376e = new b();

        b() {
            super(1);
        }

        public final void b(String str) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8377a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8377a = lVar;
        }

        public final pl.c a() {
            return this.f8377a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8377a.invoke(obj);
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

    private final void p1() {
        View findViewById = findViewById(R.id.printReceiptLl);
        cm.l.e(findViewById, "findViewById(...)");
        this.G = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.challan_status_linear);
        cm.l.e(findViewById2, "findViewById(...)");
        this.H = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.challan_payment);
        cm.l.e(findViewById3, "findViewById(...)");
        this.I = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.verify_payment_linear);
        cm.l.e(findViewById4, "findViewById(...)");
        this.J = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.printChallanLl);
        cm.l.e(findViewById5, "findViewById(...)");
        this.K = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(R.id.mvvm_back);
        cm.l.e(findViewById6, "findViewById(...)");
        this.L = (AppCompatImageView) findViewById6;
        View findViewById7 = findViewById(R.id.nexGenHolder);
        cm.l.e(findViewById7, "findViewById(...)");
        this.M = (RelativeLayout) findViewById7;
        View findViewById8 = findViewById(R.id.challan_recyclerView);
        cm.l.e(findViewById8, "findViewById(...)");
        this.N = (RecyclerView) findViewById8;
        View findViewById9 = findViewById(R.id.challan_title);
        cm.l.e(findViewById9, "findViewById(...)");
        this.O = (TextView) findViewById9;
        View findViewById10 = findViewById(R.id.vahan_service_lable);
        cm.l.e(findViewById10, "findViewById(...)");
        this.P = (TextView) findViewById10;
        ld.c cVar = new ld.c(this);
        TextView textView = this.P;
        LinearLayout linearLayout = null;
        if (textView == null) {
            cm.l.v("vahan_service_lable");
            textView = null;
        }
        textView.setText(cVar.b("label_challan_related", getString(R.string.challan_related_service)));
        AppCompatImageView appCompatImageView = this.L;
        if (appCompatImageView == null) {
            cm.l.v("backIv");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new ia.a(this));
        RelativeLayout relativeLayout = this.M;
        if (relativeLayout == null) {
            cm.l.v("topHolder");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new ia.b(this));
        LinearLayout linearLayout2 = this.G;
        if (linearLayout2 == null) {
            cm.l.v("printReceiptLl");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(new ia.c(this));
        LinearLayout linearLayout3 = this.H;
        if (linearLayout3 == null) {
            cm.l.v("challanStatusLl");
            linearLayout3 = null;
        }
        linearLayout3.setOnClickListener(new ia.d(this));
        LinearLayout linearLayout4 = this.I;
        if (linearLayout4 == null) {
            cm.l.v("challanPayment");
            linearLayout4 = null;
        }
        linearLayout4.setOnClickListener(new e(this));
        LinearLayout linearLayout5 = this.J;
        if (linearLayout5 == null) {
            cm.l.v("verifyChallanPayment");
            linearLayout5 = null;
        }
        linearLayout5.setOnClickListener(new f(this));
        LinearLayout linearLayout6 = this.K;
        if (linearLayout6 == null) {
            cm.l.v("printChallan");
        } else {
            linearLayout = linearLayout6;
        }
        linearLayout.setOnClickListener(new g(this));
        n1().o().g(this, new c(new a(this)));
        n1().p().g(this, new c(b.f8376e));
    }

    /* access modifiers changed from: private */
    public static final void q1(ChallanViewMoreActivity challanViewMoreActivity, View view) {
        cm.l.f(challanViewMoreActivity, "this$0");
        challanViewMoreActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void r1(ChallanViewMoreActivity challanViewMoreActivity, View view) {
        cm.l.f(challanViewMoreActivity, "this$0");
        challanViewMoreActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void s1(ChallanViewMoreActivity challanViewMoreActivity, View view) {
        cm.l.f(challanViewMoreActivity, "this$0");
        challanViewMoreActivity.startActivity(new Intent(challanViewMoreActivity, SearchPrintReceiptActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void t1(ChallanViewMoreActivity challanViewMoreActivity, View view) {
        cm.l.f(challanViewMoreActivity, "this$0");
        challanViewMoreActivity.startActivity(new Intent(challanViewMoreActivity, SearchChallanOnlineActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void u1(ChallanViewMoreActivity challanViewMoreActivity, View view) {
        cm.l.f(challanViewMoreActivity, "this$0");
        challanViewMoreActivity.startActivity(new Intent(challanViewMoreActivity, PaymentSearchChallan.class));
    }

    /* access modifiers changed from: private */
    public static final void v1(ChallanViewMoreActivity challanViewMoreActivity, View view) {
        cm.l.f(challanViewMoreActivity, "this$0");
        challanViewMoreActivity.startActivity(new Intent(challanViewMoreActivity, VerifyPaymentChallan.class));
    }

    /* access modifiers changed from: private */
    public static final void w1(ChallanViewMoreActivity challanViewMoreActivity, View view) {
        cm.l.f(challanViewMoreActivity, "this$0");
        challanViewMoreActivity.startActivity(new Intent(challanViewMoreActivity, SearchPrintChallanActivity.class));
    }

    public final qa.b n1() {
        qa.b bVar = this.Q;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mESViewModel");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.S;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_challan_view_more);
        y1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        this.R = ESInterface.f8381a.c(this);
        ESInterface eSInterface = this.R;
        if (eSInterface == null) {
            cm.l.v("mESInterface");
            eSInterface = null;
        }
        x1((qa.b) new u0((x0) this, (u0.b) new qa.a(new oa.a(eSInterface))).a(qa.b.class));
        n1().k(String.valueOf(getIntent().getStringExtra("state_code")));
        p1();
    }

    public final void x1(qa.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.Q = bVar;
    }

    public final void y1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.S = progressDialog;
    }
}
