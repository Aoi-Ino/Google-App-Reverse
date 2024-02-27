package com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitModel.NPAPermitResponseModel;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPAPermitService;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPARepositorySaveToDraftService;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.ApiMessage;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.RenewalOfPermitSaveToDraftResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.HashMap;
import ni.n7;
import pl.x;
import v9.e;

public final class RenewalOfNPAuthorizationPermit extends androidx.appcompat.app.d {
    public n7 G;
    public eg.a H;
    public RenewalOfNPAPermitService I;
    public ProgressDialog J;
    public eg.b K;
    public RenewalOfNPARepositorySaveToDraftService L;
    public String M;
    public String N;
    public ld.c O;
    private HashMap P = new HashMap();
    public NrvDetails Q;
    public String R;
    public String S;
    public String T;
    private boolean U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfNPAuthorizationPermit f20701e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit) {
            super(1);
            this.f20701e = renewalOfNPAuthorizationPermit;
        }

        public final void b(NPAPermitResponseModel nPAPermitResponseModel) {
            this.f20701e.p1().dismiss();
            try {
                if (nPAPermitResponseModel.getApiMessage().getStatusCode() == 200) {
                    this.f20701e.m1().f27623q.setText(nPAPermitResponseModel.getData().getPreviousPermitNo());
                    this.f20701e.m1().f27625s.setText(nPAPermitResponseModel.getData().getPreviousPermitNo());
                    this.f20701e.m1().f27617k.setText(nPAPermitResponseModel.getData().getPerviousAuthNo());
                    this.f20701e.m1().f27615i.setText(nPAPermitResponseModel.getData().getPreviousAuthFrom());
                    this.f20701e.m1().f27619m.setText(nPAPermitResponseModel.getData().getPreviousAuthUpto());
                    this.f20701e.m1().f27621o.setText(nPAPermitResponseModel.getData().getPreviousIssueDate());
                    this.f20701e.m1().f27611e.setText(nPAPermitResponseModel.getData().getAuthorizationUpto());
                    this.f20701e.m1().f27608b.setText(nPAPermitResponseModel.getData().getAllotmentOffice());
                    return;
                }
                VContant.Companion.K(this.f20701e, nPAPermitResponseModel.getApiMessage().getDeveloperMessage());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((NPAPermitResponseModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfNPAuthorizationPermit f20702e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit) {
            super(1);
            this.f20702e = renewalOfNPAuthorizationPermit;
        }

        public final void b(RenewalOfPermitSaveToDraftResponse renewalOfPermitSaveToDraftResponse) {
            this.f20702e.p1().dismiss();
            Data data = renewalOfPermitSaveToDraftResponse.getData();
            String str = null;
            if (!com.nic.mparivahan.dlservices.utilities.d.d(data != null ? data.getApplNo() : null)) {
                VContant.Companion companion = VContant.Companion;
                RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit = this.f20702e;
                ApiMessage apiMessage = renewalOfPermitSaveToDraftResponse.getApiMessage();
                if (apiMessage != null) {
                    str = apiMessage.getDeveloperMessage();
                }
                companion.K(renewalOfNPAuthorizationPermit, String.valueOf(str));
                return;
            }
            Intent intent = new Intent(this.f20702e, VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.NP_CODE);
            intent.putExtra(VContant.NP_CODE, renewalOfPermitSaveToDraftResponse.getData());
            Data data2 = renewalOfPermitSaveToDraftResponse.getData();
            if (data2 != null) {
                str = data2.getApplNo();
            }
            intent.putExtra(VContant.APP_NO, str);
            intent.putExtra("state_code", this.f20702e.r1().getState_cd());
            intent.putExtra("rc_number", this.f20702e.q1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.DUPLICATE_FITNESS_PURPOSE_CODE);
            intent.putExtra("off_code", this.f20702e.o1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this.f20702e.x1());
            intent.putExtra("RC", this.f20702e.q1());
            intent.putExtra("RcDetails", this.f20702e.r1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this.f20702e.l1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this.f20702e.k1());
            this.f20702e.startActivity(intent);
            this.f20702e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RenewalOfPermitSaveToDraftResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfNPAuthorizationPermit f20703e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit) {
            super(1);
            this.f20703e = renewalOfNPAuthorizationPermit;
        }

        public final void b(String str) {
            this.f20703e.p1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20704a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f20704a = lVar;
        }

        public final pl.c a() {
            return this.f20704a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20704a.invoke(obj);
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
    public static final void A1(RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit, View view) {
        cm.l.f(renewalOfNPAuthorizationPermit, "this$0");
        VUtility.Companion.v(renewalOfNPAuthorizationPermit, renewalOfNPAuthorizationPermit.n1().b("are_you_sure_you_want_to_leave", renewalOfNPAuthorizationPermit.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void B1(RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit, View view) {
        cm.l.f(renewalOfNPAuthorizationPermit, "this$0");
        renewalOfNPAuthorizationPermit.C1();
    }

    private final void C1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit, View view) {
        cm.l.f(renewalOfNPAuthorizationPermit, "this$0");
        Intent intent = new Intent(renewalOfNPAuthorizationPermit, VahanVehicleDetailsService.class);
        intent.putExtra("RC", renewalOfNPAuthorizationPermit.q1());
        intent.putExtra("RcDetails", renewalOfNPAuthorizationPermit.r1());
        intent.putExtra(VContant.NEXGEN_addahar_name, renewalOfNPAuthorizationPermit.l1());
        intent.putExtra(VContant.NEXGEN_addahar_address, renewalOfNPAuthorizationPermit.k1());
        renewalOfNPAuthorizationPermit.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void z1(RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit, View view) {
        cm.l.f(renewalOfNPAuthorizationPermit, "this$0");
        String obj = renewalOfNPAuthorizationPermit.m1().f27608b.getText().toString();
        String obj2 = renewalOfNPAuthorizationPermit.m1().f27611e.getText().toString();
        String rc_off_cd = renewalOfNPAuthorizationPermit.r1().getRc_off_cd();
        cm.l.c(rc_off_cd);
        renewalOfNPAuthorizationPermit.s1().i(new fg.a(obj, "", obj2, "N", 0, "10.02.82.192", Integer.parseInt(rc_off_cd), renewalOfNPAuthorizationPermit.m1().f27615i.getText().toString(), renewalOfNPAuthorizationPermit.m1().f27617k.getText().toString(), renewalOfNPAuthorizationPermit.m1().f27619m.getText().toString(), renewalOfNPAuthorizationPermit.m1().f27621o.getText().toString(), renewalOfNPAuthorizationPermit.m1().f27623q.getText().toString(), Integer.parseInt(VContant.RenewalNpAuthorization_CODE), renewalOfNPAuthorizationPermit.q1(), renewalOfNPAuthorizationPermit.v1()));
    }

    public final void D1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void E1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void F1(n7 n7Var) {
        cm.l.f(n7Var, "<set-?>");
        this.G = n7Var;
    }

    public final void G1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void H1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void I1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void K1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.Q = nrvDetails;
    }

    public final void L1(eg.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.K = bVar;
    }

    public final void M1(RenewalOfNPARepositorySaveToDraftService renewalOfNPARepositorySaveToDraftService) {
        cm.l.f(renewalOfNPARepositorySaveToDraftService, "<set-?>");
        this.L = renewalOfNPARepositorySaveToDraftService;
    }

    public final void N1(RenewalOfNPAPermitService renewalOfNPAPermitService) {
        cm.l.f(renewalOfNPAPermitService, "<set-?>");
        this.I = renewalOfNPAPermitService;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void P1(eg.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final String j1(HashMap hashMap) {
        e.a aVar;
        String str;
        cm.l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            aVar = e.f17509a;
            str = "Issue of Duplicate RC";
        } else if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            return "Transfer of Ownership";
        } else {
            if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
                aVar = e.f17509a;
                str = "Change of Address in RC";
            } else if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
                aVar = e.f17509a;
                str = "Hypothecation Termination";
            } else if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
                aVar = e.f17509a;
                str = "Hypothecation Continuation";
            } else if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
                aVar = e.f17509a;
                str = "Hypothecation Addition";
            } else if (hashMap.containsKey(VContant.RCPARTICULAR)) {
                aVar = e.f17509a;
                str = "RC Particulars against Fee";
            } else if (hashMap.containsKey(VContant.NOC)) {
                aVar = e.f17509a;
                str = "No Objection Certificate (NOC)";
            } else if (hashMap.containsKey(VContant.DUPLICATE_FITNESS)) {
                aVar = e.f17509a;
                str = "Duplicate Fitness Certificate";
            } else if (hashMap.containsKey(VContant.DUPLICATE_PERMIT)) {
                aVar = e.f17509a;
                str = "Duplicate Permit Certificate";
            } else if (hashMap.containsKey(VContant.RC_SURRENDER)) {
                aVar = e.f17509a;
                str = "RC Surrender";
            } else if (hashMap.containsKey(VContant.RC_CANCALATION)) {
                aVar = e.f17509a;
                str = "RC Cancellation";
            } else if (hashMap.containsKey(VContant.PAY_TAX)) {
                aVar = e.f17509a;
                str = "Pay Tax";
            } else if (hashMap.containsKey(VContant.PAY_TAXASS)) {
                aVar = e.f17509a;
                str = "Tax Assessment";
            } else if (hashMap.containsKey(VContant.RC_RELEASE)) {
                aVar = e.f17509a;
                str = "RC Release";
            } else if (hashMap.containsKey(VContant.Temp_Permit)) {
                aVar = e.f17509a;
                str = "Temporary Permit";
            } else if (!hashMap.containsKey(VContant.NP_Permit)) {
                return "";
            } else {
                aVar = e.f17509a;
                str = "Renewal of NP Authorization Permit";
            }
        }
        return aVar.O(this, str);
    }

    public final String k1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String l1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final n7 m1() {
        n7 n7Var = this.G;
        if (n7Var != null) {
            return n7Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final ld.c n1() {
        ld.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final String o1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n7 c10 = n7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        F1(c10);
        setContentView((View) m1().b());
        e.f17509a.N2(this, m1());
        G1(new ld.c(this));
        I1(new ProgressDialog(this));
        p1().setMessage(n1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        H1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.U = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        J1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        K1((NrvDetails) serializableExtra);
        HashMap hashMap = (HashMap) getIntent().getSerializableExtra("map");
        cm.l.c(hashMap);
        this.P = hashMap;
        TextView textView = m1().f27629w;
        textView.setText(n1().b("vehicle_no", "Vehicle No.:") + ' ' + q1());
        O1(String.valueOf(r1().getState_cd()));
        m1().f27628v.f28308i.setText(j1(this.P));
        N1(RenewalOfNPAPermitService.f20695a.b(this));
        M1(RenewalOfNPARepositorySaveToDraftService.f20698a.b(this));
        P1((eg.a) new u0((x0) this, (u0.b) new cg.c(new cg.a(u1()))).a(eg.a.class));
        L1((eg.b) new u0((x0) this, (u0.b) new dg.b(new cg.b(t1()))).a(eg.b.class));
        m1().f27630x.setPaintFlags(m1().f27630x.getPaintFlags() | 8);
        m1().f27630x.setOnClickListener(new bg.a(this));
        try {
            p1().show();
            w1().i(q1(), String.valueOf(r1().getState_cd()), String.valueOf(r1().getRc_off_cd()));
        } catch (Exception unused) {
        }
        w1().h().g(this, new d(new a(this)));
        m1().f27613g.setOnClickListener(new bg.b(this));
        s1().h().g(this, new d(new b(this)));
        s1().g().g(this, new d(new c(this)));
        m1().f27628v.f28305f.setOnClickListener(new bg.c(this));
        m1().f27628v.f28306g.setOnClickListener(new bg.d(this));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String q1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails r1() {
        NrvDetails nrvDetails = this.Q;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final eg.b s1() {
        eg.b bVar = this.K;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("renewalDraftViewModle");
        return null;
    }

    public final RenewalOfNPARepositorySaveToDraftService t1() {
        RenewalOfNPARepositorySaveToDraftService renewalOfNPARepositorySaveToDraftService = this.L;
        if (renewalOfNPARepositorySaveToDraftService != null) {
            return renewalOfNPARepositorySaveToDraftService;
        }
        cm.l.v("renewalService");
        return null;
    }

    public final RenewalOfNPAPermitService u1() {
        RenewalOfNPAPermitService renewalOfNPAPermitService = this.I;
        if (renewalOfNPAPermitService != null) {
            return renewalOfNPAPermitService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final String v1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("statCd");
        return null;
    }

    public final eg.a w1() {
        eg.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean x1() {
        return this.U;
    }
}
