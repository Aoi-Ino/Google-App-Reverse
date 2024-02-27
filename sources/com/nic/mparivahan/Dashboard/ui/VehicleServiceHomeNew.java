package com.nic.mparivahan.Dashboard.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
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
import ma.w;
import qa.a;
import qa.b;
import sa.b0;
import sa.c0;
import sa.d0;

public final class VehicleServiceHomeNew extends d {
    public TextView G;
    public LinearLayout H;
    public ProgressDialog I;
    public RecyclerView J;
    public g K;
    public b L;
    private ESInterface M;

    /* access modifiers changed from: private */
    public static final void n1(VehicleServiceHomeNew vehicleServiceHomeNew, View view) {
        l.f(vehicleServiceHomeNew, "this$0");
        vehicleServiceHomeNew.finish();
    }

    /* access modifiers changed from: private */
    public static final void o1(VehicleServiceHomeNew vehicleServiceHomeNew, EnableServiceResponse enableServiceResponse) {
        l.f(vehicleServiceHomeNew, "this$0");
        try {
            vehicleServiceHomeNew.l1().dismiss();
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            vehicleServiceHomeNew.m1().setLayoutManager(new GridLayoutManager(vehicleServiceHomeNew, 4));
            vehicleServiceHomeNew.m1().setAdapter(new w(enabledservice, vehicleServiceHomeNew, String.valueOf(vehicleServiceHomeNew.getIntent().getStringExtra("state_code"))));
        } catch (Exception unused) {
            vehicleServiceHomeNew.l1().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void p1(VehicleServiceHomeNew vehicleServiceHomeNew, String str) {
        l.f(vehicleServiceHomeNew, "this$0");
        try {
            vehicleServiceHomeNew.l1().dismiss();
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
        setContentView((int) R.layout.vehicle_service_home_new);
        this.M = ESInterface.f8381a.c(this);
        View findViewById = findViewById(R.id.nexgenarrow);
        l.e(findViewById, "findViewById(...)");
        s1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.lableService);
        l.e(findViewById2, "findViewById(...)");
        q1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.vehicle_title);
        l.e(findViewById3, "findViewById(...)");
        TextView textView = (TextView) findViewById3;
        i1().setText(new c(this).b("label_vehicle_related", getString(R.string.vehicle_related_service)));
        View findViewById4 = findViewById(R.id.es_vahan_recyclerView);
        l.e(findViewById4, "findViewById(...)");
        u1((RecyclerView) findViewById4);
        t1(new ProgressDialog(this));
        l1().setMessage("Please wait...");
        l1().setCancelable(false);
        l1().setCanceledOnTouchOutside(false);
        v1(new g(this));
        k1().setOnClickListener(new b0(this));
        ESInterface eSInterface = this.M;
        if (eSInterface == null) {
            l.v("mESInterface");
            eSInterface = null;
        }
        r1((b) new u0((x0) this, (u0.b) new a(new oa.a(eSInterface))).a(b.class));
        l1().show();
        j1().i(String.valueOf(getIntent().getStringExtra("state_code")));
        j1().t().g(this, new c0(this));
        j1().w().g(this, new d0(this));
    }

    public final void q1(TextView textView) {
        l.f(textView, "<set-?>");
        this.G = textView;
    }

    public final void r1(b bVar) {
        l.f(bVar, "<set-?>");
        this.L = bVar;
    }

    public final void s1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.H = linearLayout;
    }

    public final void t1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void u1(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.J = recyclerView;
    }

    public final void v1(g gVar) {
        l.f(gVar, "<set-?>");
        this.K = gVar;
    }
}
