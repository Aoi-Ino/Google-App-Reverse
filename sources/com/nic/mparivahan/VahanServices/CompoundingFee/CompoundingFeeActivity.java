package com.nic.mparivahan.VahanServices.CompoundingFee;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComModle.Fees;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment.ComPaymentTaxActivity;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.ApiMessage;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.BeforePayForCompoundFee;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.CompResponse;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.CompoundRequest;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import ge.f;
import he.a;
import he.b;
import he.c;
import java.io.Serializable;
import java.util.ArrayList;
import ni.j1;
import v9.e;

public final class CompoundingFeeActivity extends d {
    public h G;
    public c H;
    public VahanProService I;
    public CompoundFeeServices J;
    public ProgressDialog K;
    public ld.c L;
    public j1 M;
    public String N;
    public NrvDetails O;
    public String P;
    public String Q;
    public String R;
    private boolean S;

    /* access modifiers changed from: private */
    public static final void A1(CompoundingFeeActivity compoundingFeeActivity, String str) {
        l.f(compoundingFeeActivity, "this$0");
        compoundingFeeActivity.r1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void B1(CompoundingFeeActivity compoundingFeeActivity, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        l.f(compoundingFeeActivity, "this$0");
        compoundingFeeActivity.r1().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl != null && returnUrl.length() != 0) {
            try {
                Intent intent = new Intent(compoundingFeeActivity, ComPaymentTaxActivity.class);
                intent.putExtra("url", paymentBeforeUrlResponse.getReturnUrl());
                intent.putExtra("ServiceName", compoundingFeeActivity.getString(R.string.compoundFee));
                compoundingFeeActivity.startActivity(intent);
                compoundingFeeActivity.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(CompoundingFeeActivity compoundingFeeActivity, String str) {
        l.f(compoundingFeeActivity, "this$0");
        compoundingFeeActivity.r1().dismiss();
        if (str.equals("Error")) {
            VContant.Companion.K(compoundingFeeActivity, compoundingFeeActivity.getString(R.string.service_unavable_please_try));
        } else {
            VContant.Companion.K(compoundingFeeActivity, str);
        }
    }

    /* access modifiers changed from: private */
    public static final void w1(CompoundingFeeActivity compoundingFeeActivity, FeesModle feesModle) {
        l.f(compoundingFeeActivity, "this$0");
        compoundingFeeActivity.r1().dismiss();
        try {
            compoundingFeeActivity.m1().f26913f.setText(String.valueOf(((FeesModleItem) feesModle.get(0)).getFeeAmount()));
            compoundingFeeActivity.m1().f26915h.setText(String.valueOf(((FeesModleItem) feesModle.get(0)).getFineAmount()));
            compoundingFeeActivity.m1().f26919l.setText(String.valueOf(((FeesModleItem) feesModle.get(0)).getTotalAmount()));
            compoundingFeeActivity.m1().f26917j.setEnabled(true);
            compoundingFeeActivity.m1().f26917j.setAlpha(1.0f);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(CompoundingFeeActivity compoundingFeeActivity, String str) {
        l.f(compoundingFeeActivity, "this$0");
        compoundingFeeActivity.r1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y1(CompoundingFeeActivity compoundingFeeActivity, View view) {
        l.f(compoundingFeeActivity, "this$0");
        if (compoundingFeeActivity.m1().f26919l.getText().length() != 0) {
            try {
                compoundingFeeActivity.r1().show();
                if (p.o(compoundingFeeActivity.t1().getState_cd(), "DL", true)) {
                    Double valueOf = Double.valueOf(Double.parseDouble(compoundingFeeActivity.m1().f26919l.getText().toString()));
                    String rc_off_cd = compoundingFeeActivity.t1().getRc_off_cd();
                    l.c(rc_off_cd);
                    CompoundRequest compoundRequest = new CompoundRequest(" ", valueOf, Integer.parseInt(rc_off_cd), Integer.parseInt(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE), compoundingFeeActivity.s1(), "DL");
                    i7.d dVar = new i7.d();
                    c n12 = compoundingFeeActivity.n1();
                    String t10 = dVar.t(compoundRequest);
                    l.e(t10, "toJson(...)");
                    n12.h(t10);
                    return;
                }
                Double valueOf2 = Double.valueOf(Double.parseDouble(compoundingFeeActivity.m1().f26919l.getText().toString()));
                String rc_off_cd2 = compoundingFeeActivity.t1().getRc_off_cd();
                l.c(rc_off_cd2);
                CompoundRequest compoundRequest2 = new CompoundRequest(" ", valueOf2, Integer.parseInt(rc_off_cd2), Integer.parseInt(VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE), compoundingFeeActivity.s1(), "DL");
                i7.d dVar2 = new i7.d();
                c n13 = compoundingFeeActivity.n1();
                String t11 = dVar2.t(compoundRequest2);
                l.e(t11, "toJson(...)");
                n13.i(t11);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void z1(CompoundingFeeActivity compoundingFeeActivity, CompResponse compResponse) {
        h v12;
        String t10;
        CompoundingFeeActivity compoundingFeeActivity2 = compoundingFeeActivity;
        l.f(compoundingFeeActivity2, "this$0");
        Data data = compResponse.getData();
        String str = null;
        if (com.nic.mparivahan.dlservices.utilities.d.d(data != null ? data.getApplNo() : null)) {
            String str2 = p.o(compoundingFeeActivity.t1().getState_cd(), "DL", true) ? VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE : VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE;
            ld.h hVar = new ld.h(compoundingFeeActivity2);
            if (compoundingFeeActivity.m1().f26919l.getText().length() > 0) {
                i7.d dVar = new i7.d();
                Data data2 = compResponse.getData();
                Data copy = data2 != null ? data2.copy((String) null, compoundingFeeActivity.t1().getRc_off_cd(), str2, compoundingFeeActivity.s1(), "DL", String.valueOf((int) Double.parseDouble(compoundingFeeActivity.m1().f26919l.getText().toString())), (ArrayList<Fees>) null) : null;
                if (compoundingFeeActivity2.S) {
                    Boolean bool = Boolean.FALSE;
                    Data data3 = compResponse.getData();
                    String valueOf = String.valueOf(data3 != null ? data3.getApplNo() : null);
                    String q12 = compoundingFeeActivity.q1();
                    String m10 = v9.d.f17494a.m();
                    String s12 = compoundingFeeActivity.s1();
                    String rc_vh_class_cd = compoundingFeeActivity.t1().getRc_vh_class_cd();
                    if (rc_vh_class_cd != null) {
                        str = rc_vh_class_cd;
                    }
                    String a10 = hVar.a();
                    BeforePayForCompoundFee beforePayForCompoundFee = r3;
                    BeforePayForCompoundFee beforePayForCompoundFee2 = new BeforePayForCompoundFee("", bool, "A", valueOf, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, "", "", (HPAResModle) null, (HptTerResponse) null, 0, "", 1, "", "", (NocDraftResponse) null, q12, m10, "", "", str2, "", "", (Integer) null, 0, s12, "DL", "DL", "String", "", str, (DuplicateFitessDraft) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, a10, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, copy, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null, true, 0);
                    v12 = compoundingFeeActivity.v1();
                    t10 = dVar.t(beforePayForCompoundFee);
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    Data data4 = compResponse.getData();
                    String valueOf2 = String.valueOf(data4 != null ? data4.getApplNo() : null);
                    String q13 = compoundingFeeActivity.q1();
                    String m11 = v9.d.f17494a.m();
                    String s13 = compoundingFeeActivity.s1();
                    String rc_vh_class_cd2 = compoundingFeeActivity.t1().getRc_vh_class_cd();
                    if (rc_vh_class_cd2 != null) {
                        str = rc_vh_class_cd2;
                    }
                    BeforePayForCompoundFee beforePayForCompoundFee3 = new BeforePayForCompoundFee("", bool2, "M", valueOf2, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, "", "", (HPAResModle) null, (HptTerResponse) null, 0, "", 1, "", "", (NocDraftResponse) null, q13, m11, "", "", str2, "", "", (Integer) null, 0, s13, "DL", "DL", "String", "", str, (DuplicateFitessDraft) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, "", (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, copy, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null, true, 0);
                    v12 = compoundingFeeActivity.v1();
                    t10 = dVar.t(beforePayForCompoundFee3);
                }
                v12.u(compoundingFeeActivity2, t10.toString());
                return;
            }
            return;
        }
        compoundingFeeActivity.r1().dismiss();
        VUtility.a aVar = VUtility.Companion;
        ApiMessage apiMessage = compResponse.getApiMessage();
        if (apiMessage != null) {
            str = apiMessage.getMessage();
        }
        aVar.h(compoundingFeeActivity2, String.valueOf(str));
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void F1(j1 j1Var) {
        l.f(j1Var, "<set-?>");
        this.M = j1Var;
    }

    public final void G1(c cVar) {
        l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    public final void H1(CompoundFeeServices compoundFeeServices) {
        l.f(compoundFeeServices, "<set-?>");
        this.J = compoundFeeServices;
    }

    public final void I1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void M1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.O = nrvDetails;
    }

    public final void N1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void O1(h hVar) {
        l.f(hVar, "<set-?>");
        this.G = hVar;
    }

    public final j1 m1() {
        j1 j1Var = this.M;
        if (j1Var != null) {
            return j1Var;
        }
        l.v("binding");
        return null;
    }

    public final c n1() {
        c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        l.v("compoundViewModel");
        return null;
    }

    public final CompoundFeeServices o1() {
        CompoundFeeServices compoundFeeServices = this.J;
        if (compoundFeeServices != null) {
            return compoundFeeServices;
        }
        l.v("feeService");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, p1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        h v12;
        String s12;
        String valueOf;
        CharSequence B0;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_compounding_fee2);
        j1 c10 = j1.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        F1(c10);
        setContentView((View) m1().b());
        N1(VahanProService.f21196b.b(this));
        H1(CompoundFeeServices.f20567a.b(this));
        e.f17509a.h0(this, m1());
        O1((h) new u0((x0) this, (u0.b) new g(new wg.d(u1()))).a(h.class));
        G1((c) new u0((x0) this, (u0.b) new a(new b(o1()))).a(c.class));
        I1(new ld.c(this));
        J1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.S = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        L1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        M1((NrvDetails) serializableExtra);
        K1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        m1().f26912e.f28308i.setText(p1().b("comp_FeePayment", getString(R.string.compoundFee)));
        TextView textView = m1().f26922o;
        textView.setText(p1().b("vehicle_no", "Vehicle No.:") + ' ' + s1());
        m1().f26923p.setText(p1().b("view_vehicle_details", "View Vehicle Details"));
        m1().f26923p.setPaintFlags(m1().f26923p.getPaintFlags() | 8);
        try {
            r1().show();
            m1().f26917j.setEnabled(false);
            m1().f26917j.setAlpha(0.5f);
            if (p.o(String.valueOf(t1().getState_cd()), "DL", true)) {
                v12 = v1();
                s12 = s1();
                valueOf = String.valueOf(t1().getState_cd());
                B0 = q.B0(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE);
            } else {
                v12 = v1();
                s12 = s1();
                valueOf = String.valueOf(t1().getState_cd());
                B0 = q.B0(VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE);
            }
            v12.j1(this, s12, valueOf, B0.toString());
        } catch (Exception unused) {
        }
        v1().O().g(this, new ge.b(this));
        v1().P().g(this, new ge.c(this));
        m1().f26917j.setOnClickListener(new ge.d(this));
        n1().j().g(this, new ge.e(this));
        n1().k().g(this, new f(this));
        v1().y0().g(this, new ge.g(this));
        v1().z0().g(this, new ge.h(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, p1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final ld.c p1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String q1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String s1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails t1() {
        NrvDetails nrvDetails = this.O;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService u1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h v1() {
        h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
