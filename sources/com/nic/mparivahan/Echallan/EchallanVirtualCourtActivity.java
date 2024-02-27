package com.nic.mparivahan.Echallan;

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
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cb.j;
import cb.k;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.VirtualChallanDetailsModel;
import com.nic.mparivahan.Echallan.Model.VirtualChallanProceedingModel;
import com.nic.mparivahan.Echallan.Model.VirtualChallanResultModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.R;
import fb.a;
import ni.j4;
import pl.x;

public final class EchallanVirtualCourtActivity extends d {
    private String G = "";
    private j4 H;
    /* access modifiers changed from: private */
    public ProgressDialog I;
    private SearchChallanService J;
    private jb.c K;
    public ld.c L;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EchallanVirtualCourtActivity f8747e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(EchallanVirtualCourtActivity echallanVirtualCourtActivity) {
            super(1);
            this.f8747e = echallanVirtualCourtActivity;
        }

        public final void b(VirtualChallanDetailsModel virtualChallanDetailsModel) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog j12 = this.f8747e.I;
                if (j12 == null) {
                    cm.l.v("dialog");
                    j12 = null;
                }
                if (j12.isShowing()) {
                    ProgressDialog j13 = this.f8747e.I;
                    if (j13 == null) {
                        cm.l.v("dialog");
                        j13 = null;
                    }
                    j13.dismiss();
                }
                if (!com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanDetailsModel.getStatus()) || !p.o(virtualChallanDetailsModel.getStatus(), "200", true)) {
                    EchallanVirtualCourtActivity echallanVirtualCourtActivity = this.f8747e;
                    echallanVirtualCourtActivity.l1(echallanVirtualCourtActivity, echallanVirtualCourtActivity.o1().b("error_msg_record_not_found", this.f8747e.getString(R.string.service_unavable_please_try)));
                    return;
                }
                cm.l.c(virtualChallanDetailsModel);
                this.f8747e.u1(virtualChallanDetailsModel.getResult());
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog j14 = this.f8747e.I;
                if (j14 == null) {
                    cm.l.v("dialog");
                    j14 = null;
                }
                if (j14.isShowing()) {
                    ProgressDialog j15 = this.f8747e.I;
                    if (j15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = j15;
                    }
                    progressDialog.dismiss();
                }
                EchallanVirtualCourtActivity echallanVirtualCourtActivity2 = this.f8747e;
                echallanVirtualCourtActivity2.l1(echallanVirtualCourtActivity2, echallanVirtualCourtActivity2.o1().b("error_msg_record_not_found", this.f8747e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VirtualChallanDetailsModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EchallanVirtualCourtActivity f8748e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(EchallanVirtualCourtActivity echallanVirtualCourtActivity) {
            super(1);
            this.f8748e = echallanVirtualCourtActivity;
        }

        public final void b(String str) {
            ProgressDialog j12 = this.f8748e.I;
            ProgressDialog progressDialog = null;
            if (j12 == null) {
                cm.l.v("dialog");
                j12 = null;
            }
            if (j12.isShowing()) {
                ProgressDialog j13 = this.f8748e.I;
                if (j13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = j13;
                }
                progressDialog.dismiss();
            }
            EchallanVirtualCourtActivity echallanVirtualCourtActivity = this.f8748e;
            echallanVirtualCourtActivity.l1(echallanVirtualCourtActivity, echallanVirtualCourtActivity.o1().b("error_msg_record_not_found", this.f8748e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8749a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8749a = lVar;
        }

        public final pl.c a() {
            return this.f8749a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8749a.invoke(obj);
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
    public static final void m1(Dialog dialog, EchallanVirtualCourtActivity echallanVirtualCourtActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(echallanVirtualCourtActivity, "this$0");
        dialog.dismiss();
        echallanVirtualCourtActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void n1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void p1() {
        ProgressDialog progressDialog = null;
        try {
            ProgressDialog progressDialog2 = this.I;
            if (progressDialog2 == null) {
                cm.l.v("dialog");
                progressDialog2 = null;
            }
            if (progressDialog2.isShowing()) {
                ProgressDialog progressDialog3 = this.I;
                if (progressDialog3 == null) {
                    cm.l.v("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
            }
            ProgressDialog progressDialog4 = this.I;
            if (progressDialog4 == null) {
                cm.l.v("dialog");
                progressDialog4 = null;
            }
            progressDialog4.show();
            jb.c cVar = this.K;
            if (cVar == null) {
                cm.l.v("viewModel");
                cVar = null;
            }
            cVar.o(this.G);
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressDialog progressDialog5 = this.I;
            if (progressDialog5 == null) {
                cm.l.v("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = this.I;
                if (progressDialog6 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    private final void q1() {
        SearchChallanService searchChallanService = this.J;
        j4 j4Var = null;
        if (searchChallanService == null) {
            cm.l.v("retrofitService");
            searchChallanService = null;
        }
        this.K = (jb.c) new u0((x0) this, (u0.b) new jb.b(new jb.a(searchChallanService))).a(jb.c.class);
        j4 j4Var2 = this.H;
        if (j4Var2 == null) {
            cm.l.v("binding");
            j4Var2 = null;
        }
        j4Var2.f26951t.f28305f.setOnClickListener(new j(this));
        j4 j4Var3 = this.H;
        if (j4Var3 == null) {
            cm.l.v("binding");
        } else {
            j4Var = j4Var3;
        }
        j4Var.f26951t.f28306g.setOnClickListener(new k(this));
    }

    /* access modifiers changed from: private */
    public static final void r1(EchallanVirtualCourtActivity echallanVirtualCourtActivity, View view) {
        cm.l.f(echallanVirtualCourtActivity, "this$0");
        echallanVirtualCourtActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void s1(EchallanVirtualCourtActivity echallanVirtualCourtActivity, View view) {
        cm.l.f(echallanVirtualCourtActivity, "this$0");
        echallanVirtualCourtActivity.t1();
    }

    private final void t1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void u1(VirtualChallanResultModel virtualChallanResultModel) {
        j4 j4Var = null;
        if (com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getChallan_no())) {
            j4 j4Var2 = this.H;
            if (j4Var2 == null) {
                cm.l.v("binding");
                j4Var2 = null;
            }
            j4Var2.f26934c.setText(virtualChallanResultModel.getChallan_no());
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getAmount())) {
            j4 j4Var3 = this.H;
            if (j4Var3 == null) {
                cm.l.v("binding");
                j4Var3 = null;
            }
            j4Var3.f26933b.setText(virtualChallanResultModel.getAmount());
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getCourt_address())) {
            j4 j4Var4 = this.H;
            if (j4Var4 == null) {
                cm.l.v("binding");
                j4Var4 = null;
            }
            j4Var4.f26941j.setText(virtualChallanResultModel.getCourt_address());
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getCourt_name())) {
            j4 j4Var5 = this.H;
            if (j4Var5 == null) {
                cm.l.v("binding");
                j4Var5 = null;
            }
            j4Var5.f26942k.setText(virtualChallanResultModel.getCourt_name());
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getForword_date())) {
            j4 j4Var6 = this.H;
            if (j4Var6 == null) {
                cm.l.v("binding");
                j4Var6 = null;
            }
            j4Var6.f26949r.setText(virtualChallanResultModel.getForword_date());
        }
        if (!com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getProceeding_data()) || !com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getProceeding_data().getDate_of_proceeding())) {
            j4 j4Var7 = this.H;
            if (j4Var7 == null) {
                cm.l.v("binding");
                j4Var7 = null;
            }
            j4Var7.f26947p.setVisibility(8);
            j4 j4Var8 = this.H;
            if (j4Var8 == null) {
                cm.l.v("binding");
                j4Var8 = null;
            }
            j4Var8.N.setVisibility(8);
            j4 j4Var9 = this.H;
            if (j4Var9 == null) {
                cm.l.v("binding");
                j4Var9 = null;
            }
            j4Var9.P.setVisibility(8);
            j4 j4Var10 = this.H;
            if (j4Var10 == null) {
                cm.l.v("binding");
                j4Var10 = null;
            }
            j4Var10.f26945n.setVisibility(8);
            j4 j4Var11 = this.H;
            if (j4Var11 == null) {
                cm.l.v("binding");
                j4Var11 = null;
            }
            j4Var11.f26943l.setVisibility(8);
        } else {
            j4 j4Var12 = this.H;
            if (j4Var12 == null) {
                cm.l.v("binding");
                j4Var12 = null;
            }
            j4Var12.f26947p.setVisibility(0);
            j4 j4Var13 = this.H;
            if (j4Var13 == null) {
                cm.l.v("binding");
                j4Var13 = null;
            }
            j4Var13.N.setVisibility(0);
            j4 j4Var14 = this.H;
            if (j4Var14 == null) {
                cm.l.v("binding");
                j4Var14 = null;
            }
            j4Var14.P.setVisibility(0);
            j4 j4Var15 = this.H;
            if (j4Var15 == null) {
                cm.l.v("binding");
                j4Var15 = null;
            }
            j4Var15.f26945n.setVisibility(0);
            j4 j4Var16 = this.H;
            if (j4Var16 == null) {
                cm.l.v("binding");
                j4Var16 = null;
            }
            j4Var16.f26943l.setVisibility(0);
            VirtualChallanProceedingModel proceeding_data = virtualChallanResultModel.getProceeding_data();
            if (com.nic.mparivahan.dlservices.utilities.d.d(proceeding_data.getDate_of_proceeding())) {
                j4 j4Var17 = this.H;
                if (j4Var17 == null) {
                    cm.l.v("binding");
                    j4Var17 = null;
                }
                j4Var17.f26948q.setText(proceeding_data.getDate_of_proceeding());
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(proceeding_data.getFine_imposed())) {
                j4 j4Var18 = this.H;
                if (j4Var18 == null) {
                    cm.l.v("binding");
                    j4Var18 = null;
                }
                j4Var18.f26944m.setText(proceeding_data.getFine_imposed());
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(proceeding_data.getParty_name())) {
                j4 j4Var19 = this.H;
                if (j4Var19 == null) {
                    cm.l.v("binding");
                    j4Var19 = null;
                }
                j4Var19.f26946o.setText(proceeding_data.getParty_name());
            }
        }
        if (!com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getContested_data()) || !com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getContested_data().getChallan_no())) {
            j4 j4Var20 = this.H;
            if (j4Var20 == null) {
                cm.l.v("binding");
                j4Var20 = null;
            }
            j4Var20.f26938g.setVisibility(8);
        } else {
            j4 j4Var21 = this.H;
            if (j4Var21 == null) {
                cm.l.v("binding");
                j4Var21 = null;
            }
            j4Var21.f26938g.setVisibility(0);
        }
        if (!com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getTransferred_to_court_data()) || !com.nic.mparivahan.dlservices.utilities.d.d(virtualChallanResultModel.getTransferred_to_court_data().getChallan_no())) {
            j4 j4Var22 = this.H;
            if (j4Var22 == null) {
                cm.l.v("binding");
            } else {
                j4Var = j4Var22;
            }
            j4Var.f26955x.setVisibility(8);
            return;
        }
        j4 j4Var23 = this.H;
        if (j4Var23 == null) {
            cm.l.v("binding");
        } else {
            j4Var = j4Var23;
        }
        j4Var.f26955x.setVisibility(0);
    }

    public final void l1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById4;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new cb.l(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new cb.m(dialog));
        dialog.show();
    }

    public final ld.c o1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_echallan_virtual_court);
        j4 c10 = j4.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.H = c10;
        jb.c cVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        v1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        j4 j4Var = this.H;
        if (j4Var == null) {
            cm.l.v("binding");
            j4Var = null;
        }
        aVar.m(this, j4Var);
        this.J = SearchChallanService.f8750a.d(this);
        if (getIntent() != null && getIntent().hasExtra("challanNo")) {
            String stringExtra = getIntent().getStringExtra("challanNo");
            cm.l.c(stringExtra);
            this.G = stringExtra;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.I = progressDialog;
        progressDialog.setMessage(o1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.I;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.I;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        q1();
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.G)) {
            p1();
        }
        jb.c cVar2 = this.K;
        if (cVar2 == null) {
            cm.l.v("viewModel");
            cVar2 = null;
        }
        cVar2.w().g(this, new c(new a(this)));
        jb.c cVar3 = this.K;
        if (cVar3 == null) {
            cm.l.v("viewModel");
        } else {
            cVar = cVar3;
        }
        cVar.v().g(this, new c(new b(this)));
    }

    public final void v1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }
}
