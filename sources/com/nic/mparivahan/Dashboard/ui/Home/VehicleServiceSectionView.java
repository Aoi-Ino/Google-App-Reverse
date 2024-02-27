package com.nic.mparivahan.Dashboard.ui.Home;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.Collections;
import ld.c;
import ld.g;
import ma.x;
import qa.a;
import qa.b;
import ta.o2;
import ta.p2;
import ta.q2;

public final class VehicleServiceSectionView extends d {
    public TextView G;
    public LinearLayout H;
    public ProgressDialog I;
    public RecyclerView J;
    public g K;
    public b L;
    private ESInterface M;
    private ArrayList N = new ArrayList();
    private ArrayList O = new ArrayList();

    /* access modifiers changed from: private */
    public static final void n1(VehicleServiceSectionView vehicleServiceSectionView, View view) {
        l.f(vehicleServiceSectionView, "this$0");
        vehicleServiceSectionView.finish();
    }

    /* access modifiers changed from: private */
    public static final void o1(VehicleServiceSectionView vehicleServiceSectionView, EnableServiceResponse enableServiceResponse) {
        l.f(vehicleServiceSectionView, "this$0");
        try {
            vehicleServiceSectionView.l1().dismiss();
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            vehicleServiceSectionView.w1(enabledservice);
        } catch (Exception unused) {
            vehicleServiceSectionView.l1().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void p1(VehicleServiceSectionView vehicleServiceSectionView, String str) {
        l.f(vehicleServiceSectionView, "this$0");
        try {
            vehicleServiceSectionView.l1().dismiss();
        } catch (Exception unused) {
        }
    }

    public final TextView i1() {
        TextView textView = this.G;
        if (textView != null) {
            return textView;
        }
        l.v("lable");
        return null;
    }

    public final b j1() {
        b bVar = this.L;
        if (bVar != null) {
            return bVar;
        }
        l.v("mESViewModel");
        return null;
    }

    public final LinearLayout k1() {
        LinearLayout linearLayout = this.H;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("nexgenarrow");
        return null;
    }

    public final ProgressDialog l1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final RecyclerView m1() {
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("recyclerView_vahan");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.sectionview);
        this.M = ESInterface.f8381a.c(this);
        View findViewById = findViewById(R.id.nexgenarrow);
        l.e(findViewById, "findViewById(...)");
        t1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.lableService);
        l.e(findViewById2, "findViewById(...)");
        r1((TextView) findViewById2);
        i1().setText(new c(this).b("label_vehicle_related", getString(R.string.vehicle_related_service)));
        View findViewById3 = findViewById(R.id.es_vahan_recyclerView);
        l.e(findViewById3, "findViewById(...)");
        v1((RecyclerView) findViewById3);
        q1();
        u1(new ProgressDialog(this));
        l1().setMessage("Please wait...");
        l1().setCancelable(false);
        l1().setCanceledOnTouchOutside(false);
        x1(new g(this));
        k1().setOnClickListener(new o2(this));
        ESInterface eSInterface = this.M;
        if (eSInterface == null) {
            l.v("mESInterface");
            eSInterface = null;
        }
        s1((b) new u0((x0) this, (u0.b) new a(new oa.a(eSInterface))).a(b.class));
        l1().show();
        j1().i(String.valueOf(getIntent().getStringExtra("state_code")));
        j1().t().g(this, new p2(this));
        j1().w().g(this, new q2(this));
    }

    public final void q1() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.N.add(Integer.valueOf(i10));
        }
    }

    public final void r1(TextView textView) {
        l.f(textView, "<set-?>");
        this.G = textView;
    }

    public final void s1(b bVar) {
        l.f(bVar, "<set-?>");
        this.L = bVar;
    }

    public final void t1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.H = linearLayout;
    }

    public final void u1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void v1(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.J = recyclerView;
    }

    public final void w1(ArrayList arrayList) {
        l.f(arrayList, "mList");
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.clear();
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Integer num = (Integer) this.N.get(i10);
                int servSection = ((Enabledservice) arrayList.get(i11)).getServSection();
                if (num != null && num.intValue() == servSection) {
                    arrayList2.add(arrayList.get(i11));
                }
            }
            if (arrayList2.size() > 0) {
                this.O.add(arrayList2);
            }
        }
        m1().setLayoutManager(new LinearLayoutManager(this));
        m1().setAdapter(new x(this.O, this, String.valueOf(getIntent().getStringExtra("state_code"))));
    }

    public final void x1(g gVar) {
        l.f(gVar, "<set-?>");
        this.K = gVar;
    }
}
