package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.RcInterface.RcService;
import ia.j;
import ia.k;
import ka.c;
import ld.g;
import ni.ca;
import pl.x;
import v9.e;
import v9.f;
import yc.i;

public final class DashBoardAlertViewDetails extends d {
    /* access modifiers changed from: private */
    public ca G;
    public DatabaseHelper H;
    public NrvDetails I;
    public ImageView J;
    public ProgressDialog K;
    public cd.c L;
    public RcService M;
    public cd.a N;
    private RcImpoundService O;
    public ld.c P;
    public g Q;
    public String R;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DashBoardAlertViewDetails f8378e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DashBoardAlertViewDetails dashBoardAlertViewDetails) {
            super(1);
            this.f8378e = dashBoardAlertViewDetails;
        }

        public final void b(RcModelsDet rcModelsDet) {
            DashBoardAlertViewDetails dashBoardAlertViewDetails;
            String b10;
            this.f8378e.o1().dismiss();
            try {
                if (p.o(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    try {
                        if (i.f18692a.l(this.f8378e, rcModelsDet.getNrvDetails()) > 0) {
                            DashBoardAlertViewDetails dashBoardAlertViewDetails2 = this.f8378e;
                            ca j12 = dashBoardAlertViewDetails2.G;
                            if (j12 == null) {
                                cm.l.v("binding");
                                j12 = null;
                            }
                            NrvDetails C0 = this.f8378e.l1().C0(rcModelsDet.getNrvDetails().getRc_regn_no());
                            cm.l.e(C0, "getRCDetails(...)");
                            dashBoardAlertViewDetails2.A1(j12, C0);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    dashBoardAlertViewDetails = this.f8378e;
                    b10 = dashBoardAlertViewDetails.r1().b(f.f17510a.R0(), "Vehicle alert successfully updated");
                } else {
                    dashBoardAlertViewDetails = this.f8378e;
                    b10 = dashBoardAlertViewDetails.r1().b(f.f17510a.P0(), "Unable to Update the  Vehicle alert, Please try after some times");
                }
                dashBoardAlertViewDetails.G1(dashBoardAlertViewDetails, b10);
            } catch (Exception unused) {
                this.f8378e.o1().dismiss();
                DashBoardAlertViewDetails dashBoardAlertViewDetails3 = this.f8378e;
                dashBoardAlertViewDetails3.G1(dashBoardAlertViewDetails3, dashBoardAlertViewDetails3.r1().b(f.f17510a.P0(), "Unable to Update the  Vehicle alert, Please try after some times"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcModelsDet) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DashBoardAlertViewDetails f8379e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DashBoardAlertViewDetails dashBoardAlertViewDetails) {
            super(1);
            this.f8379e = dashBoardAlertViewDetails;
        }

        public final void b(String str) {
            this.f8379e.o1().dismiss();
            DashBoardAlertViewDetails dashBoardAlertViewDetails = this.f8379e;
            dashBoardAlertViewDetails.G1(dashBoardAlertViewDetails, dashBoardAlertViewDetails.r1().b(f.f17510a.P0(), "Unable to Update the  Vehicle alert, Please try after some times"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8380a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f8380a = lVar;
        }

        public final pl.c a() {
            return this.f8380a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8380a.invoke(obj);
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
    public static final void H1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s1(DashBoardAlertViewDetails dashBoardAlertViewDetails, View view) {
        cm.l.f(dashBoardAlertViewDetails, "this$0");
        dashBoardAlertViewDetails.startActivity(new Intent(dashBoardAlertViewDetails, DashBoard.class));
        dashBoardAlertViewDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(DashBoardAlertViewDetails dashBoardAlertViewDetails, View view) {
        cm.l.f(dashBoardAlertViewDetails, "this$0");
        dashBoardAlertViewDetails.startActivity(new Intent(dashBoardAlertViewDetails, DashBoard.class));
        dashBoardAlertViewDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void u1(DashBoardAlertViewDetails dashBoardAlertViewDetails, View view) {
        cm.l.f(dashBoardAlertViewDetails, "this$0");
        if (dashBoardAlertViewDetails.l1().s0(dashBoardAlertViewDetails.p1()) != null) {
            dashBoardAlertViewDetails.o1().show();
            dashBoardAlertViewDetails.n1().l(dashBoardAlertViewDetails.p1(), dashBoardAlertViewDetails);
        }
    }

    public final void A1(ca caVar, NrvDetails nrvDetails) {
        cm.l.f(caVar, "binding");
        cm.l.f(nrvDetails, "rcdetails");
        try {
            caVar.D.setText(nrvDetails.getRc_owner_name());
            caVar.S.setText(nrvDetails.getRc_f_name());
            caVar.f25690d.setText(nrvDetails.getRc_chasi_no());
            caVar.f25698h.setText(nrvDetails.getRc_eng_no());
            caVar.K.setText(nrvDetails.getRc_maker_desc());
            c.a aVar = ka.c.f13158a;
            if (aVar.m(nrvDetails.getRc_tax_upto())) {
                caVar.f25691d0.setVisibility(8);
            } else if (!aVar.n(nrvDetails.getRc_tax_upto()) || !aVar.f(String.valueOf(nrvDetails.getRc_tax_upto()))) {
                caVar.f25689c0.setText(nrvDetails.getRc_tax_upto());
            } else {
                String d10 = aVar.d(this, String.valueOf(nrvDetails.getRc_tax_upto()), " ");
                caVar.f25689c0.setText(d10);
                MyTextView myTextView = caVar.f25689c0;
                cm.l.e(myTextView, "taxValidUpTo");
                k1(d10, myTextView);
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(nrvDetails.getRc_maker_model())) {
                caVar.M.setText(nrvDetails.getRc_maker_model());
            } else {
                caVar.M.setText("NA");
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(nrvDetails.getRc_insurance_comp())) {
                caVar.f25716q.setText(nrvDetails.getRc_insurance_comp());
            } else {
                caVar.f25716q.setText("NA");
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(nrvDetails.getRc_insurance_policy_no())) {
                caVar.f25718r.setText(nrvDetails.getRc_insurance_policy_no());
            } else {
                caVar.f25718r.setText("NA");
            }
            caVar.f25729w0.setText(nrvDetails.getRc_vch_catg());
            caVar.f25733y0.setText(nrvDetails.getRc_vh_class_desc());
            caVar.f25710n.setText(nrvDetails.getRc_fuel_desc());
            caVar.f25694f.setText(nrvDetails.getRc_color());
            caVar.X.setText(nrvDetails.getRc_seat_cap());
            caVar.f25685a0.setText(nrvDetails.getRc_stand_cap());
            if (aVar.m(String.valueOf(nrvDetails.getRc_financer()))) {
                caVar.f25702j.setText("NA");
            } else {
                caVar.f25702j.setText(nrvDetails.getRc_financer());
            }
            if (!aVar.n(nrvDetails.getRc_insurance_upto()) || !aVar.f(String.valueOf(nrvDetails.getRc_insurance_upto()))) {
                caVar.f25722t.setText(nrvDetails.getRc_insurance_upto());
            } else {
                String d11 = aVar.d(this, String.valueOf(nrvDetails.getRc_insurance_upto()), " ");
                caVar.f25722t.setText(d11);
                MyTextView myTextView2 = caVar.f25722t;
                cm.l.e(myTextView2, "insuranceUptoTxt");
                k1(d11, myTextView2);
            }
            if (!aVar.n(nrvDetails.getRc_fit_upto()) || !aVar.f(String.valueOf(nrvDetails.getRc_fit_upto()))) {
                caVar.f25706l.setText(nrvDetails.getRc_fit_upto());
            } else {
                String d12 = aVar.d(this, String.valueOf(nrvDetails.getRc_fit_upto()), " ");
                caVar.f25706l.setText(d12);
                MyTextView myTextView3 = caVar.f25706l;
                cm.l.e(myTextView3, "fitnessupto");
                k1(d12, myTextView3);
            }
            if (aVar.m(nrvDetails.getRc_pucc_upto())) {
                caVar.H.setVisibility(8);
                caVar.I.setVisibility(8);
            } else if (!aVar.n(nrvDetails.getRc_pucc_upto()) || !aVar.f(String.valueOf(nrvDetails.getRc_pucc_upto()))) {
                caVar.I.setText(nrvDetails.getRc_pucc_upto());
            } else {
                String d13 = aVar.d(this, String.valueOf(nrvDetails.getRc_pucc_upto()), " ");
                caVar.I.setText(d13);
                MyTextView myTextView4 = caVar.I;
                cm.l.e(myTextView4, "puccValidatityTxt");
                k1(d13, myTextView4);
            }
            caVar.U.setText(nrvDetails.getRc_registered_at());
            caVar.f25715p0.setText(nrvDetails.getRc_blacklist_status());
            (cm.l.a(nrvDetails.getRc_blacklist_status(), "NA") ? caVar.f25724u : caVar.f25724u).setVisibility(8);
            caVar.f25693e0.setVisibility(8);
            caVar.f25709m0.setText(nrvDetails.getRc_np_no());
            CharSequence text = caVar.f25709m0.getText();
            cm.l.e(text, "getText(...)");
            (text.length() == 0 ? caVar.f25726v : caVar.f25726v).setVisibility(8);
            if (!aVar.n(nrvDetails.getRc_np_upto()) || !aVar.f(String.valueOf(nrvDetails.getRc_np_upto()))) {
                caVar.f25711n0.setText(nrvDetails.getRc_np_upto());
            } else {
                String d14 = aVar.d(this, String.valueOf(nrvDetails.getRc_np_upto()), " ");
                caVar.f25711n0.setText(d14);
                MyTextView myTextView5 = caVar.f25711n0;
                cm.l.e(myTextView5, "txtPermitNumberValid");
                k1(d14, myTextView5);
            }
            CharSequence text2 = caVar.f25711n0.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                caVar.f25728w.setVisibility(8);
            } else {
                caVar.f25728w.setVisibility(0);
            }
            caVar.f25713o0.setText(nrvDetails.getRc_permit_valid_upto());
            if (!aVar.n(nrvDetails.getRc_permit_valid_upto()) || !aVar.f(String.valueOf(nrvDetails.getRc_permit_valid_upto()))) {
                caVar.f25713o0.setText(nrvDetails.getRc_permit_valid_upto());
            } else {
                String d15 = aVar.d(this, String.valueOf(nrvDetails.getRc_permit_valid_upto()), " ");
                caVar.f25713o0.setText(d15);
                MyTextView myTextView6 = caVar.f25713o0;
                cm.l.e(myTextView6, "txtPermitNumberValidTwo");
                k1(d15, myTextView6);
            }
            CharSequence text3 = caVar.f25713o0.getText();
            cm.l.e(text3, "getText(...)");
            if (text3.length() == 0) {
                caVar.f25730x.setVisibility(8);
            } else {
                caVar.f25730x.setVisibility(0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void B1(cd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.N = aVar;
    }

    public final void C1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void D1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.I = nrvDetails;
    }

    public final void E1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void F1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.Q = gVar;
    }

    public final void G1(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new k(dialog));
        dialog.show();
    }

    public final void k1(String str, TextView textView) {
        cm.l.f(str, "change_color");
        cm.l.f(textView, "textView");
        if (q.D(str, "Expired", true)) {
            textView.setTextColor(androidx.core.content.a.c(this, R.color.danger));
        }
        if (q.D(str, "Expiring", true)) {
            textView.setTextColor(androidx.core.content.a.c(this, R.color.vehicle_fit));
        }
    }

    public final DatabaseHelper l1() {
        DatabaseHelper databaseHelper = this.H;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final RcService m1() {
        RcService rcService = this.M;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c n1() {
        cd.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ca c10 = ca.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        RcImpoundService rcImpoundService = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        ca caVar = this.G;
        if (caVar == null) {
            cm.l.v("binding");
            caVar = null;
        }
        aVar.z(this, caVar);
        this.O = RcImpoundService.f9481a.b(this);
        w1(RcService.f9484a.c(this));
        F1(new g(this));
        E1(new ld.c(this));
        View findViewById = findViewById(R.id.rc_qr_img);
        cm.l.e(findViewById, "findViewById(...)");
        z1((ImageView) findViewById);
        y1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        try {
            C1(String.valueOf(getIntent().getStringExtra("RcNumber")));
            DatabaseHelper A0 = DatabaseHelper.A0(this);
            cm.l.e(A0, "getInstance(...)");
            v1(A0);
            NrvDetails C0 = l1().C0(p1());
            cm.l.e(C0, "getRCDetails(...)");
            D1(C0);
            if (p1() != null) {
                ca caVar2 = this.G;
                if (caVar2 == null) {
                    cm.l.v("binding");
                    caVar2 = null;
                }
                caVar2.N.setText(p1());
                ca caVar3 = this.G;
                if (caVar3 == null) {
                    cm.l.v("binding");
                    caVar3 = null;
                }
                A1(caVar3, q1());
            }
            ca caVar4 = this.G;
            if (caVar4 == null) {
                cm.l.v("binding");
                caVar4 = null;
            }
            caVar4.V.setOnClickListener(new ia.h(this));
            ca caVar5 = this.G;
            if (caVar5 == null) {
                cm.l.v("binding");
                caVar5 = null;
            }
            caVar5.f25732y.setOnClickListener(new ia.i(this));
            ca caVar6 = this.G;
            if (caVar6 == null) {
                cm.l.v("binding");
                caVar6 = null;
            }
            caVar6.P.setOnClickListener(new j(this));
        } catch (Error e10) {
            e10.printStackTrace();
            Log.e("error", x.f30437a.toString());
        }
        x1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(m1()))).a(cd.c.class));
        RcImpoundService rcImpoundService2 = this.O;
        if (rcImpoundService2 == null) {
            cm.l.v("rcImpoundService");
        } else {
            rcImpoundService = rcImpoundService2;
        }
        B1((cd.a) new u0((x0) this, (u0.b) new cd.b(new bd.a(rcImpoundService))).a(cd.a.class));
        n1().p().g(this, new c(new a(this)));
        n1().S().g(this, new c(new b(this)));
    }

    public final String p1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails q1() {
        NrvDetails nrvDetails = this.I;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final ld.c r1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void v1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void w1(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.M = rcService;
    }

    public final void x1(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void y1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public final void z1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.J = imageView;
    }
}
