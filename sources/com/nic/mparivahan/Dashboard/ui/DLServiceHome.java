package com.nic.mparivahan.Dashboard.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen;
import com.nic.mparivahan.Dashboard.a;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.Welcome.VersionService;
import ji.c;
import ld.f;
import li.b;
import li.e;
import ni.s1;
import sa.g;
import sa.h;
import sa.i;
import sa.j;
import sa.k;
import sa.m;
import sa.n;
import sa.o;

public final class DLServiceHome extends d {
    public e G;
    private VersionService H;
    public ProgressDialog I;

    /* access modifiers changed from: private */
    public static final void A1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        dLServiceHome.K1(dLServiceHome);
    }

    /* access modifiers changed from: private */
    public static final void B1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, DlServicesMainScreen.class);
        new f(dLServiceHome).r("Update Mobile Number", "10");
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void C1(DLServiceHome dLServiceHome, String str) {
        l.f(dLServiceHome, "this$0");
        dLServiceHome.u1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void D1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        dLServiceHome.finish();
    }

    /* access modifiers changed from: private */
    public static final void E1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, DlServicesMainScreen.class);
        new f(dLServiceHome).r("Renewal of DL", "1");
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void F1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, DlServicesMainScreen.class);
        new f(dLServiceHome).r("Issue of Duplicate DL", "2");
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void G1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, DlServicesMainScreen.class);
        new f(dLServiceHome).r("Change of Address in DL", VContant.DUPLICATE_RC_PURPOSE_CODE);
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void H1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, DlServicesMainScreen.class);
        new f(dLServiceHome).r("International Driving Permit", VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE);
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, DlServicesMainScreen.class);
        new f(dLServiceHome).r("DL Extract", VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void J1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, DlServicesMainScreen.class);
        new f(dLServiceHome).r("Replacement of DL", VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        dLServiceHome.u1().show();
        e v12 = dLServiceHome.v1();
        String jSONObject = a.f8403a.b().toString();
        l.e(jSONObject, "toString(...)");
        v12.j(jSONObject);
    }

    /* access modifiers changed from: private */
    public static final void x1(DLServiceHome dLServiceHome, GetEnableStateModel getEnableStateModel) {
        l.f(dLServiceHome, "this$0");
        dLServiceHome.u1().dismiss();
        if (p.o(getEnableStateModel.getStatusCode(), "MSTR001", true)) {
            a.f8403a.d(dLServiceHome, getEnableStateModel.getStates());
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        Intent intent = new Intent(dLServiceHome, ApplicationStatusActivity.class);
        new f(dLServiceHome).r("Application Status", VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
        dLServiceHome.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void z1(DLServiceHome dLServiceHome, View view) {
        l.f(dLServiceHome, "this$0");
        dLServiceHome.K1(dLServiceHome);
    }

    public final void K1(Context context) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText("Available Soon\n(Under Development)");
        ((TextView) findViewById2).setOnClickListener(new sa.f(dialog));
        dialog.show();
    }

    public final void M1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void N1(e eVar) {
        l.f(eVar, "<set-?>");
        this.G = eVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_d_l_service_home);
        this.H = VersionService.f21650a.c(this);
        M1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        VersionService versionService = this.H;
        if (versionService == null) {
            l.v("retrofitService");
            versionService = null;
        }
        N1((e) new u0((x0) this, (u0.b) new b(new c(versionService))).a(e.class));
        s1 c10 = s1.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        setContentView((View) c10.b());
        c10.f28493h.setText("Enrolled States");
        TextView textView = c10.f28493h;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        c10.f28493h.setOnClickListener(new sa.a(this));
        v1().l().g(this, new k(this));
        v1().m().g(this, new sa.l(this));
        c10.f28496k.setOnClickListener(new m(this));
        c10.f28498m.setOnClickListener(new n(this));
        c10.f28492g.setOnClickListener(new o(this));
        c10.f28488c.setOnClickListener(new sa.b(this));
        c10.f28494i.setOnClickListener(new sa.c(this));
        c10.f28490e.setOnClickListener(new sa.d(this));
        c10.f28491f.setOnClickListener(new sa.e(this));
        c10.f28487b.setOnClickListener(new g(this));
        c10.f28489d.setOnClickListener(new h(this));
        c10.f28499n.setOnClickListener(new i(this));
        c10.f28495j.setOnClickListener(new j(this));
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final e v1() {
        e eVar = this.G;
        if (eVar != null) {
            return eVar;
        }
        l.v("viewModel");
        return null;
    }
}
