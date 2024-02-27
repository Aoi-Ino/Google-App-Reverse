package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.RcSurrenderResModel;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCSurrenderModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.Calendar;
import ni.d9;
import pl.x;
import v9.e;
import yg.m2;
import yg.n2;
import yg.o2;
import yg.p2;
import yg.q2;
import yg.r2;
import yg.s2;
import yg.t2;

public final class VahanRcSurrenderActivity extends d {
    public d9 G;
    public qe.b H;
    public DuplicateFitnessService I;
    public ProgressDialog J;
    public String K;
    public NrvDetails L;
    public String M;
    public String N;
    public String O;
    private Calendar P = Calendar.getInstance();
    private boolean Q;
    public ld.c R;
    private String S = "0";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanRcSurrenderActivity f21248e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanRcSurrenderActivity vahanRcSurrenderActivity) {
            super(1);
            this.f21248e = vahanRcSurrenderActivity;
        }

        public final void b(String str) {
            this.f21248e.u1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanRcSurrenderActivity f21249e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanRcSurrenderActivity vahanRcSurrenderActivity) {
            super(1);
            this.f21249e = vahanRcSurrenderActivity;
        }

        public final void b(RcSurrenderResModel rcSurrenderResModel) {
            this.f21249e.u1().dismiss();
            if (rcSurrenderResModel.getApiMessage().getStatusCode() == 200) {
                Intent intent = new Intent(this.f21249e, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_SURRENDER_RC_CODE);
                intent.putExtra(VContant.RC_SURRENDER_RC_CODE, rcSurrenderResModel.getData());
                intent.putExtra(VContant.APP_NO, rcSurrenderResModel.getData().getApplNo());
                intent.putExtra("state_code", this.f21249e.w1().getState_cd());
                intent.putExtra("rc_number", this.f21249e.v1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_SURRENDER_PURPOSE_CODE);
                intent.putExtra("off_code", this.f21249e.t1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21249e.x1());
                intent.putExtra("RC", this.f21249e.v1());
                intent.putExtra("RcDetails", this.f21249e.w1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21249e.o1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21249e.n1());
                this.f21249e.startActivity(intent);
                this.f21249e.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcSurrenderResModel) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21250a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21250a = lVar;
        }

        public final pl.c a() {
            return this.f21250a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21250a.invoke(obj);
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
    public static final void A1(VahanRcSurrenderActivity vahanRcSurrenderActivity, CompoundButton compoundButton, boolean z10) {
        cm.l.f(vahanRcSurrenderActivity, "this$0");
        vahanRcSurrenderActivity.p1().f25910f.setVisibility(z10 ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public static final void B1(VahanRcSurrenderActivity vahanRcSurrenderActivity, CompoundButton compoundButton, boolean z10) {
        cm.l.f(vahanRcSurrenderActivity, "this$0");
        vahanRcSurrenderActivity.p1().f25908d.setVisibility(z10 ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public static final void C1(VahanRcSurrenderActivity vahanRcSurrenderActivity, CompoundButton compoundButton, boolean z10) {
        cm.l.f(vahanRcSurrenderActivity, "this$0");
        vahanRcSurrenderActivity.p1().f25909e.setVisibility(z10 ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public static final void D1(VahanRcSurrenderActivity vahanRcSurrenderActivity, CompoundButton compoundButton, boolean z10) {
        cm.l.f(vahanRcSurrenderActivity, "this$0");
        if (z10) {
            vahanRcSurrenderActivity.p1().f25918n.setChecked(false);
            vahanRcSurrenderActivity.S = "N";
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(VahanRcSurrenderActivity vahanRcSurrenderActivity, CompoundButton compoundButton, boolean z10) {
        cm.l.f(vahanRcSurrenderActivity, "this$0");
        if (z10) {
            vahanRcSurrenderActivity.p1().f25917m.setChecked(false);
            vahanRcSurrenderActivity.S = "Y";
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(VahanRcSurrenderActivity vahanRcSurrenderActivity, View view) {
        ld.c s12;
        String string;
        String str;
        VahanRcSurrenderActivity vahanRcSurrenderActivity2 = vahanRcSurrenderActivity;
        cm.l.f(vahanRcSurrenderActivity2, "this$0");
        String obj = vahanRcSurrenderActivity.p1().f25915k.getText().toString();
        String obj2 = vahanRcSurrenderActivity.p1().f25910f.getText().toString();
        String obj3 = vahanRcSurrenderActivity.p1().f25908d.getText().toString();
        String obj4 = vahanRcSurrenderActivity.p1().f25909e.getText().toString();
        if (obj.length() < 4) {
            s12 = vahanRcSurrenderActivity.s1();
            string = vahanRcSurrenderActivity2.getString(R.string.please_enter_reason);
            str = "please_enter_reason";
        } else if (vahanRcSurrenderActivity.p1().f25916l.isChecked() && obj2.length() < 2) {
            s12 = vahanRcSurrenderActivity.s1();
            string = vahanRcSurrenderActivity2.getString(R.string.please_enter_rc_serial_no);
            str = "please_enter_rc_serial_no";
        } else if (vahanRcSurrenderActivity.p1().f25911g.isChecked() && obj3.length() < 2) {
            s12 = vahanRcSurrenderActivity.s1();
            string = vahanRcSurrenderActivity2.getString(R.string.please_enter_fitness_certificate_no);
            str = "please_enter_fitness_certificate_no";
        } else if (vahanRcSurrenderActivity.p1().f25913i.isChecked() && obj4.length() < 2) {
            s12 = vahanRcSurrenderActivity.s1();
            string = vahanRcSurrenderActivity2.getString(R.string.please_enter_permit_no);
            str = "please_enter_permit_no";
        } else if (vahanRcSurrenderActivity2.S.equals("0")) {
            s12 = vahanRcSurrenderActivity.s1();
            string = vahanRcSurrenderActivity2.getString(R.string.please_select_tax_exemption);
            str = "please_select_tax_exemption";
        } else {
            vahanRcSurrenderActivity.u1().show();
            vahanRcSurrenderActivity.q1().M(vahanRcSurrenderActivity2, new RCSurrenderModle("", Integer.parseInt(vahanRcSurrenderActivity.t1()), Integer.parseInt(VContant.RC_SURRENDER_PURPOSE_CODE), vahanRcSurrenderActivity.v1(), String.valueOf(vahanRcSurrenderActivity.w1().getState_cd()), "", "", "", obj, "", obj2, "", obj4, "", obj3, "", "", "", "", ""));
            return;
        }
        Toast.makeText(vahanRcSurrenderActivity2, s12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanRcSurrenderActivity vahanRcSurrenderActivity, View view) {
        cm.l.f(vahanRcSurrenderActivity, "this$0");
        Intent intent = new Intent(vahanRcSurrenderActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanRcSurrenderActivity.v1());
        intent.putExtra("RcDetails", vahanRcSurrenderActivity.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanRcSurrenderActivity.Q);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanRcSurrenderActivity.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanRcSurrenderActivity.n1());
        vahanRcSurrenderActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanRcSurrenderActivity vahanRcSurrenderActivity, View view) {
        cm.l.f(vahanRcSurrenderActivity, "this$0");
        VUtility.Companion.v(vahanRcSurrenderActivity, vahanRcSurrenderActivity.s1().b("are_you_sure_you_want_to_leave", vahanRcSurrenderActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void H1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void I1(d9 d9Var) {
        cm.l.f(d9Var, "<set-?>");
        this.G = d9Var;
    }

    public final void J1(qe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void K1(DuplicateFitnessService duplicateFitnessService) {
        cm.l.f(duplicateFitnessService, "<set-?>");
        this.I = duplicateFitnessService;
    }

    public final void L1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.R = cVar;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void N1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void P1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final String n1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_rc_surrender);
        d9 c10 = d9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        I1(c10);
        setContentView((View) p1().b());
        e.f17509a.M2(this, p1());
        L1(new ld.c(this));
        N1(new ProgressDialog(this));
        u1().setMessage(s1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        K1(DuplicateFitnessService.f20591a.b(this));
        J1((qe.b) new u0((x0) this, (u0.b) new qe.a(new pe.a(r1()))).a(qe.b.class));
        M1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.Q = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        P1((NrvDetails) serializableExtra);
        L1(new ld.c(this));
        TextView textView = p1().f25923s;
        textView.setText(s1().b("vehicle_no", "Vehicle No.:") + ' ' + v1());
        p1().f25924t.setText(s1().b("view_vehicle_details", "View Vehicle Details"));
        p1().f25924t.setPaintFlags(p1().f25924t.getPaintFlags() | 8);
        p1().f25924t.setOnClickListener(new m2(this));
        p1().f25920p.f28305f.setOnClickListener(new n2(this));
        p1().f25916l.setOnCheckedChangeListener(new o2(this));
        p1().f25911g.setOnCheckedChangeListener(new p2(this));
        p1().f25913i.setOnCheckedChangeListener(new q2(this));
        p1().f25917m.setOnCheckedChangeListener(new r2(this));
        p1().f25918n.setOnCheckedChangeListener(new s2(this));
        p1().f25907c.setOnClickListener(new t2(this));
        q1().B().g(this, new c(new b(this)));
        q1().C().g(this, new c(new a(this)));
    }

    public final d9 p1() {
        d9 d9Var = this.G;
        if (d9Var != null) {
            return d9Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final qe.b q1() {
        qe.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService r1() {
        DuplicateFitnessService duplicateFitnessService = this.I;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        cm.l.v("fitnessService");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final String t1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String v1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final boolean x1() {
        return this.Q;
    }
}
