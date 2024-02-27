package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdraw;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import com.nic.mparivahan.Welcome.VersionService;
import ia.a1;
import ia.b1;
import ia.c1;
import ia.n0;
import ia.o0;
import ia.p0;
import ia.q0;
import ia.r0;
import ia.s0;
import ia.t0;
import ia.v0;
import ia.w0;
import ia.y0;
import ia.z0;
import li.e;
import pl.x;

public final class VehicleServiceHome extends d {
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public LinearLayout R;
    public LinearLayout S;
    public LinearLayout T;
    public TextView U;
    public e V;
    private VersionService W;
    public ProgressDialog X;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VehicleServiceHome f8400e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VehicleServiceHome vehicleServiceHome) {
            super(1);
            this.f8400e = vehicleServiceHome;
        }

        public final void b(GetEnableStateModel getEnableStateModel) {
            this.f8400e.G1().dismiss();
            if (p.o(getEnableStateModel.getStatusCode(), "MSTR001", true)) {
                a.f8403a.d(this.f8400e, getEnableStateModel.getStates());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetEnableStateModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VehicleServiceHome f8401e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VehicleServiceHome vehicleServiceHome) {
            super(1);
            this.f8401e = vehicleServiceHome;
        }

        public final void b(String str) {
            this.f8401e.G1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8402a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8402a = lVar;
        }

        public final pl.c a() {
            return this.f8402a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8402a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void M1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        vehicleServiceHome.G1().show();
        e L1 = vehicleServiceHome.L1();
        String jSONObject = a.f8403a.c().toString();
        cm.l.e(jSONObject, "toString(...)");
        L1.j(jSONObject);
    }

    /* access modifiers changed from: private */
    public static final void N1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        vehicleServiceHome.b2(vehicleServiceHome);
    }

    /* access modifiers changed from: private */
    public static final void O1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void P1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanApplication.class));
    }

    /* access modifiers changed from: private */
    public static final void Q1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        vehicleServiceHome.b2(vehicleServiceHome);
    }

    /* access modifiers changed from: private */
    public static final void R1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanWithdraw.class));
    }

    /* access modifiers changed from: private */
    public static final void S1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanUpdateMobileActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void T1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        vehicleServiceHome.finish();
    }

    /* access modifiers changed from: private */
    public static final void U1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.NOC, VContant.NOC_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void V1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void W1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void X1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void Y1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void Z1(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void a2(VehicleServiceHome vehicleServiceHome, View view) {
        cm.l.f(vehicleServiceHome, "this$0");
        new ld.h(vehicleServiceHome).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        vehicleServiceHome.startActivity(new Intent(vehicleServiceHome, VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final LinearLayout A1() {
        LinearLayout linearLayout = this.K;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("d_to");
        return null;
    }

    public final LinearLayout B1() {
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("disposeAppLl");
        return null;
    }

    public final TextView C1() {
        TextView textView = this.U;
        if (textView != null) {
            return textView;
        }
        cm.l.v("enrolled_state_vahan");
        return null;
    }

    public final LinearLayout D1() {
        LinearLayout linearLayout = this.N;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("hc");
        return null;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("nexgenarrow");
        return null;
    }

    public final LinearLayout F1() {
        LinearLayout linearLayout = this.O;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("noc");
        return null;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.X;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final LinearLayout H1() {
        LinearLayout linearLayout = this.H;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("pay_your_tax");
        return null;
    }

    public final LinearLayout I1() {
        LinearLayout linearLayout = this.P;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("rc_partucular");
        return null;
    }

    public final LinearLayout J1() {
        LinearLayout linearLayout = this.T;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("updateMobileLl");
        return null;
    }

    public final LinearLayout K1() {
        LinearLayout linearLayout = this.R;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("verifyPaymentLl");
        return null;
    }

    public final e L1() {
        e eVar = this.V;
        if (eVar != null) {
            return eVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void b2(Context context) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText("Available Soon\n(Under Development)");
        ((TextView) findViewById2).setOnClickListener(new t0(dialog));
        dialog.show();
    }

    public final void d2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.Q = linearLayout;
    }

    public final void e2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.L = linearLayout;
    }

    public final void f2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.M = linearLayout;
    }

    public final void g2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.J = linearLayout;
    }

    public final void h2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.I = linearLayout;
    }

    public final void i2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.K = linearLayout;
    }

    public final void j2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.S = linearLayout;
    }

    public final void k2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.U = textView;
    }

    public final void l2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.N = linearLayout;
    }

    public final void m2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.G = linearLayout;
    }

    public final void n2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.O = linearLayout;
    }

    public final void o2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.X = progressDialog;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vehicle_service_home);
        this.W = VersionService.f21650a.c(this);
        View findViewById = findViewById(R.id.nexgenarrow);
        cm.l.e(findViewById, "findViewById(...)");
        m2((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.pay_your_tax);
        cm.l.e(findViewById2, "findViewById(...)");
        p2((LinearLayout) findViewById2);
        View findViewById3 = findViewById(R.id.d_rc);
        cm.l.e(findViewById3, "findViewById(...)");
        h2((LinearLayout) findViewById3);
        View findViewById4 = findViewById(R.id.d_ht);
        cm.l.e(findViewById4, "findViewById(...)");
        g2((LinearLayout) findViewById4);
        View findViewById5 = findViewById(R.id.d_to);
        cm.l.e(findViewById5, "findViewById(...)");
        i2((LinearLayout) findViewById5);
        View findViewById6 = findViewById(R.id.change_of_address);
        cm.l.e(findViewById6, "findViewById(...)");
        e2((LinearLayout) findViewById6);
        View findViewById7 = findViewById(R.id.d_ha);
        cm.l.e(findViewById7, "findViewById(...)");
        f2((LinearLayout) findViewById7);
        View findViewById8 = findViewById(R.id.f19012hc);
        cm.l.e(findViewById8, "findViewById(...)");
        l2((LinearLayout) findViewById8);
        View findViewById9 = findViewById(R.id.noc);
        cm.l.e(findViewById9, "findViewById(...)");
        n2((LinearLayout) findViewById9);
        View findViewById10 = findViewById(R.id.rc_partucular);
        cm.l.e(findViewById10, "findViewById(...)");
        q2((LinearLayout) findViewById10);
        View findViewById11 = findViewById(R.id.applStatusLl);
        cm.l.e(findViewById11, "findViewById(...)");
        d2((LinearLayout) findViewById11);
        View findViewById12 = findViewById(R.id.verifyPaymentLl);
        cm.l.e(findViewById12, "findViewById(...)");
        s2((LinearLayout) findViewById12);
        View findViewById13 = findViewById(R.id.disposeAppLl);
        cm.l.e(findViewById13, "findViewById(...)");
        j2((LinearLayout) findViewById13);
        View findViewById14 = findViewById(R.id.enrolled_state_vahan);
        cm.l.e(findViewById14, "findViewById(...)");
        k2((TextView) findViewById14);
        View findViewById15 = findViewById(R.id.mobile_update_service);
        cm.l.e(findViewById15, "findViewById(...)");
        r2((LinearLayout) findViewById15);
        o2(new ProgressDialog(this));
        G1().setMessage("Please wait...");
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        VersionService versionService = this.W;
        if (versionService == null) {
            cm.l.v("retrofitService");
            versionService = null;
        }
        t2((e) new u0((x0) this, (u0.b) new li.b(new ji.c(versionService))).a(e.class));
        C1().setText("Enrolled States");
        C1().setPaintFlags(C1().getPaintFlags() | 8);
        C1().setOnClickListener(new n0(this));
        L1().l().g(this, new c(new a(this)));
        L1().m().g(this, new c(new b(this)));
        H1().setOnClickListener(new z0(this));
        E1().setOnClickListener(new a1(this));
        F1().setOnClickListener(new b1(this));
        I1().setOnClickListener(new c1(this));
        D1().setOnClickListener(new o0(this));
        x1().setOnClickListener(new p0(this));
        z1().setOnClickListener(new q0(this));
        y1().setOnClickListener(new r0(this));
        A1().setOnClickListener(new s0(this));
        w1().setOnClickListener(new ia.u0(this));
        v1().setOnClickListener(new v0(this));
        K1().setOnClickListener(new w0(this));
        B1().setOnClickListener(new ia.x0(this));
        J1().setOnClickListener(new y0(this));
    }

    public final void p2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.H = linearLayout;
    }

    public final void q2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.P = linearLayout;
    }

    public final void r2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.T = linearLayout;
    }

    public final void s2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.R = linearLayout;
    }

    public final void t2(e eVar) {
        cm.l.f(eVar, "<set-?>");
        this.V = eVar;
    }

    public final LinearLayout v1() {
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("applStatusLl");
        return null;
    }

    public final LinearLayout w1() {
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("change_of_address");
        return null;
    }

    public final LinearLayout x1() {
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("d_ha");
        return null;
    }

    public final LinearLayout y1() {
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("d_ht");
        return null;
    }

    public final LinearLayout z1() {
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("d_rc");
        return null;
    }
}
