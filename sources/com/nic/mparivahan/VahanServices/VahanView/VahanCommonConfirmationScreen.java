package com.nic.mparivahan.VahanServices.VahanView;

import ai.b0;
import ai.c0;
import ai.d0;
import ai.e0;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.io.Serializable;
import ld.c;
import ni.f0;
import v9.e;

public final class VahanCommonConfirmationScreen extends d {
    public f0 G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public HptTerResponse M;
    public HPAResModle N;
    public dulicateRcResponseModle O;
    public DuplicateFitessDraft P;
    public Data Q;
    public com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data R;
    public DuplicatePermitDraft S;
    public com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data T;
    public com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data U;
    public NocDraftResponse V;
    public com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data W;
    public com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data X;
    public com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data Y;
    public com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data Z;

    /* renamed from: a0  reason: collision with root package name */
    public com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data f21459a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f21460b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f21461c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f21462d0;

    /* renamed from: e0  reason: collision with root package name */
    public NrvDetails f21463e0;

    /* renamed from: f0  reason: collision with root package name */
    public c f21464f0;

    /* access modifiers changed from: private */
    public static final void M1(VahanCommonConfirmationScreen vahanCommonConfirmationScreen, View view) {
        l.f(vahanCommonConfirmationScreen, "this$0");
        vahanCommonConfirmationScreen.k1(vahanCommonConfirmationScreen, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: private */
    public static final void N1(VahanCommonConfirmationScreen vahanCommonConfirmationScreen, View view) {
        l.f(vahanCommonConfirmationScreen, "this$0");
        vahanCommonConfirmationScreen.P1();
    }

    /* access modifiers changed from: private */
    public static final void O1(VahanCommonConfirmationScreen vahanCommonConfirmationScreen, View view) {
        VahanCommonConfirmationScreen vahanCommonConfirmationScreen2 = vahanCommonConfirmationScreen;
        String str = VContant.UPDATE_MOBILE_CODE;
        String str2 = VContant.ALTERATION_CODE;
        l.f(vahanCommonConfirmationScreen2, "this$0");
        try {
            String str3 = VContant.PERMIT_RENEWAL_CODE;
            Intent intent = new Intent(vahanCommonConfirmationScreen2, FeesDetailsScreen.class);
            boolean o10 = p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHICATION_TERMINATION_CODE, true);
            String str4 = VContant.TRANFER_OF_OWNERSHIP_CODE;
            String str5 = VContant.TEMPERMIT_CODE;
            String str6 = VContant.NP_CODE;
            String str7 = VContant.RC_RELEASE_CODE;
            if (o10) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHICATION_TERMINATION_CODE);
                intent.putExtra(VContant.HYPOTHICATION_TERMINATION_CODE, vahanCommonConfirmationScreen.w1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Hypothecation Termination");
            }
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_ADDITION_CODE);
                intent.putExtra(VContant.HYPOTHECATION_ADDITION_CODE, vahanCommonConfirmationScreen.v1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Hypothecation Addition");
            }
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_RC_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_RC_CODE);
                intent.putExtra(VContant.DUPLICATE_RC_CODE, vahanCommonConfirmationScreen.u1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Issue of Duplicate RC");
            }
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NOC_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.NOC_CODE);
                intent.putExtra(VContant.NOC_CODE, vahanCommonConfirmationScreen.z1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "No Objection Certificate (NOC)");
            }
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_FITNESS_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_FITNESS_CODE);
                intent.putExtra(VContant.DUPLICATE_FITNESS_CODE, vahanCommonConfirmationScreen.s1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Duplicate Fitness Certificate");
            }
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_CANCELLATION_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_CANCELLATION_CODE);
                intent.putExtra(VContant.RC_CANCELLATION_CODE, vahanCommonConfirmationScreen.E1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "RC Cancellation");
            }
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_SURRENDER_RC_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_SURRENDER_RC_CODE);
                intent.putExtra(VContant.RC_SURRENDER_RC_CODE, vahanCommonConfirmationScreen.G1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "RC Surrender");
            }
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_PERMIT_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_PERMIT_CODE);
                intent.putExtra(VContant.DUPLICATE_PERMIT_CODE, vahanCommonConfirmationScreen.t1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Duplicate Permit Certificate");
            }
            String str8 = str7;
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), str8, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, str8);
                intent.putExtra(str8, vahanCommonConfirmationScreen.F1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "RC Release");
            }
            String str9 = str6;
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), str9, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, str9);
                intent.putExtra(str9, vahanCommonConfirmationScreen.A1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Renewal of NP Authorization Permit");
            }
            String str10 = str5;
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), str10, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, str10);
                intent.putExtra(str10, vahanCommonConfirmationScreen.K1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Temporary Permit");
            }
            String str11 = str4;
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), str11, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, str11);
                intent.putExtra(str11, vahanCommonConfirmationScreen.L1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Transfer of Ownership");
            }
            String str12 = str3;
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), str12, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, str12);
                intent.putExtra(str12, vahanCommonConfirmationScreen.C1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Permit Renewal");
            }
            String str13 = str2;
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), str13, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, str13);
                intent.putExtra(str13, vahanCommonConfirmationScreen.p1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Alteration of Vehicle");
            }
            String str14 = str;
            if (p.o(vahanCommonConfirmationScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), str14, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, str14);
                intent.putExtra(str14, vahanCommonConfirmationScreen.y1());
                intent.putExtra(VContant.APP_NO, vahanCommonConfirmationScreen.q1());
                intent.putExtra("state_code", vahanCommonConfirmationScreen.J1());
                intent.putExtra("rc_number", vahanCommonConfirmationScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, vahanCommonConfirmationScreen.D1());
                intent.putExtra(VContant.SERVICE_NAME, "Update Mobile Number");
            }
            intent.putExtra("off_code", vahanCommonConfirmationScreen.B1());
            VahanCommonConfirmationScreen vahanCommonConfirmationScreen3 = vahanCommonConfirmationScreen;
            intent.putExtra(VContant.NEXGEN_isFACELESS, vahanCommonConfirmationScreen3.f21460b0);
            intent.putExtra(VContant.NEXGEN_addahar_name, vahanCommonConfirmationScreen.o1());
            intent.putExtra(VContant.NEXGEN_addahar_address, vahanCommonConfirmationScreen.n1());
            intent.putExtra("RC", vahanCommonConfirmationScreen.H1());
            intent.putExtra("RcDetails", vahanCommonConfirmationScreen.I1());
            vahanCommonConfirmationScreen3.startActivity(intent);
            vahanCommonConfirmationScreen.finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void P1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void l1(Dialog dialog, VahanCommonConfirmationScreen vahanCommonConfirmationScreen, View view) {
        l.f(dialog, "$d");
        l.f(vahanCommonConfirmationScreen, "this$0");
        dialog.dismiss();
        vahanCommonConfirmationScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void m1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data A1() {
        com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data data = this.U;
        if (data != null) {
            return data;
        }
        l.v("npAuthPermit");
        return null;
    }

    public final String B1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data C1() {
        com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data = this.Y;
        if (data != null) {
            return data;
        }
        l.v("permitRenewalDraft");
        return null;
    }

    public final String D1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final Data E1() {
        Data data = this.Q;
        if (data != null) {
            return data;
        }
        l.v("rcCancellation");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data F1() {
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data = this.T;
        if (data != null) {
            return data;
        }
        l.v("rcRelease");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data G1() {
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data = this.R;
        if (data != null) {
            return data;
        }
        l.v("rcSurrender");
        return null;
    }

    public final String H1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails I1() {
        NrvDetails nrvDetails = this.f21463e0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final String J1() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        l.v("state_code");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data K1() {
        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data = this.W;
        if (data != null) {
            return data;
        }
        l.v("temPermitDraft");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data L1() {
        com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data data = this.X;
        if (data != null) {
            return data;
        }
        l.v("transferOfOwnerDraft");
        return null;
    }

    public final void Q1(String str) {
        l.f(str, "<set-?>");
        this.f21462d0 = str;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.f21461c0 = str;
    }

    public final void S1(com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data data) {
        l.f(data, "<set-?>");
        this.Z = data;
    }

    public final void T1(String str) {
        l.f(str, "<set-?>");
        this.H = str;
    }

    public final void U1(f0 f0Var) {
        l.f(f0Var, "<set-?>");
        this.G = f0Var;
    }

    public final void V1(DuplicateFitessDraft duplicateFitessDraft) {
        l.f(duplicateFitessDraft, "<set-?>");
        this.P = duplicateFitessDraft;
    }

    public final void W1(DuplicatePermitDraft duplicatePermitDraft) {
        l.f(duplicatePermitDraft, "<set-?>");
        this.S = duplicatePermitDraft;
    }

    public final void X1(dulicateRcResponseModle dulicatercresponsemodle) {
        l.f(dulicatercresponsemodle, "<set-?>");
        this.O = dulicatercresponsemodle;
    }

    public final void Y1(HPAResModle hPAResModle) {
        l.f(hPAResModle, "<set-?>");
        this.N = hPAResModle;
    }

    public final void Z1(HptTerResponse hptTerResponse) {
        l.f(hptTerResponse, "<set-?>");
        this.M = hptTerResponse;
    }

    public final void a2(c cVar) {
        l.f(cVar, "<set-?>");
        this.f21464f0 = cVar;
    }

    public final void b2(com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data data) {
        l.f(data, "<set-?>");
        this.f21459a0 = data;
    }

    public final void c2(NocDraftResponse nocDraftResponse) {
        l.f(nocDraftResponse, "<set-?>");
        this.V = nocDraftResponse;
    }

    public final void d2(com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data data) {
        l.f(data, "<set-?>");
        this.U = data;
    }

    public final void e2(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void f2(com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data) {
        l.f(data, "<set-?>");
        this.Y = data;
    }

    public final void g2(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void h2(Data data) {
        l.f(data, "<set-?>");
        this.Q = data;
    }

    public final void i2(com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data) {
        l.f(data, "<set-?>");
        this.T = data;
    }

    public final void j2(com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data) {
        l.f(data, "<set-?>");
        this.R = data;
    }

    public final void k1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new b0(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new c0(dialog));
        dialog.show();
    }

    public final void k2(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void l2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.f21463e0 = nrvDetails;
    }

    public final void m2(String str) {
        l.f(str, "<set-?>");
        this.I = str;
    }

    public final String n1() {
        String str = this.f21462d0;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final void n2(com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data) {
        l.f(data, "<set-?>");
        this.W = data;
    }

    public final String o1() {
        String str = this.f21461c0;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final void o2(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data data) {
        l.f(data, "<set-?>");
        this.X = data;
    }

    public void onBackPressed() {
        k1(this, x1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_change_of_address_confirmation);
        f0 c10 = f0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        U1(c10);
        setContentView((View) r1().b());
        e.f17509a.u2(this, r1());
        a2(new c(this));
        m2(String.valueOf(getIntent().getStringExtra("state_code")));
        k2(String.valueOf(getIntent().getStringExtra("rc_number")));
        T1(String.valueOf(getIntent().getStringExtra(VContant.APP_NO)));
        g2(String.valueOf(getIntent().getStringExtra(VContant.PURPOSE_CODE)));
        e2(String.valueOf(getIntent().getStringExtra("off_code")));
        this.f21460b0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        l2((NrvDetails) serializableExtra);
        R1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        r1().f26173d.f28308i.setText(VContant.Companion.I(this, D1()));
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
            Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.HYPOTHICATION_TERMINATION_CODE);
            l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse");
            Z1((HptTerResponse) serializableExtra2);
            TextView textView = r1().f26171b;
            textView.setText(x1().b("HPT_Confirm", "Application for Hypothecation Termination saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
            Serializable serializableExtra3 = getIntent().getSerializableExtra(VContant.HYPOTHECATION_ADDITION_CODE);
            l.d(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPA.HPAResModle");
            Y1((HPAResModle) serializableExtra3);
            TextView textView2 = r1().f26171b;
            textView2.setText(x1().b("HPA_Confirm", "Application for Hypothecation Addition saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_RC_CODE, true)) {
            Serializable serializableExtra4 = getIntent().getSerializableExtra(VContant.DUPLICATE_RC_CODE);
            l.d(serializableExtra4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle");
            X1((dulicateRcResponseModle) serializableExtra4);
            TextView textView3 = r1().f26171b;
            textView3.setText(x1().b("duplicate_Confirm", "Application for Issue of Duplicate RC saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NOC_CODE, true)) {
            Serializable serializableExtra5 = getIntent().getSerializableExtra(VContant.NOC_CODE);
            l.d(serializableExtra5, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse");
            c2((NocDraftResponse) serializableExtra5);
            TextView textView4 = r1().f26171b;
            textView4.setText(x1().b("noc_Confirm", "Application for No Objection Certificate (NOC) saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_FITNESS_CODE, true)) {
            Serializable serializableExtra6 = getIntent().getSerializableExtra(VContant.DUPLICATE_FITNESS_CODE);
            l.d(serializableExtra6, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft");
            V1((DuplicateFitessDraft) serializableExtra6);
            TextView textView5 = r1().f26171b;
            textView5.setText(x1().b("duplicate_FitnessCert_Confirm", "Application for Duplicate Fitness Certificate saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_CANCELLATION_CODE, true)) {
            Serializable serializableExtra7 = getIntent().getSerializableExtra(VContant.RC_CANCELLATION_CODE);
            l.d(serializableExtra7, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data");
            h2((Data) serializableExtra7);
            TextView textView6 = r1().f26171b;
            textView6.setText(x1().b("rc_cancellation_Confirm", "Application for RC Cancellation saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_SURRENDER_RC_CODE, true)) {
            Serializable serializableExtra8 = getIntent().getSerializableExtra(VContant.RC_SURRENDER_RC_CODE);
            l.d(serializableExtra8, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data");
            j2((com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) serializableExtra8);
            TextView textView7 = r1().f26171b;
            textView7.setText(x1().b("rc_Surrender_Confirm", "Application for RC Surrender saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_PERMIT_CODE, true)) {
            Serializable serializableExtra9 = getIntent().getSerializableExtra(VContant.DUPLICATE_PERMIT_CODE);
            l.d(serializableExtra9, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft");
            W1((DuplicatePermitDraft) serializableExtra9);
            TextView textView8 = r1().f26171b;
            textView8.setText(x1().b("duplicate_Permit_Confirm", "Application for Duplicate Permit saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_RELEASE_CODE, true)) {
            Serializable serializableExtra10 = getIntent().getSerializableExtra(VContant.RC_RELEASE_CODE);
            l.d(serializableExtra10, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data");
            i2((com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) serializableExtra10);
            TextView textView9 = r1().f26171b;
            textView9.setText(x1().b("rc_release_Confirm", "Application for RC Release saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NP_CODE, true)) {
            Serializable serializableExtra11 = getIntent().getSerializableExtra(VContant.NP_CODE);
            l.d(serializableExtra11, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data");
            d2((com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) serializableExtra11);
            TextView textView10 = r1().f26171b;
            textView10.setText(x1().b("renewalNpAuthorization_Permit_Confirm", "Application for Renewal of NP Authorization Permit saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TEMPERMIT_CODE, true)) {
            Serializable serializableExtra12 = getIntent().getSerializableExtra(VContant.TEMPERMIT_CODE);
            l.d(serializableExtra12, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data");
            n2((com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) serializableExtra12);
            TextView textView11 = r1().f26171b;
            textView11.setText(x1().b("temporary_permit_Confirm", "Application for Temporary Permit saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
            Serializable serializableExtra13 = getIntent().getSerializableExtra(VContant.TRANFER_OF_OWNERSHIP_CODE);
            l.d(serializableExtra13, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data");
            o2((com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data) serializableExtra13);
            TextView textView12 = r1().f26171b;
            textView12.setText(x1().b("to_Confirm", "Application for Transfer of Ownership saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.PERMIT_RENEWAL_CODE, true)) {
            Serializable serializableExtra14 = getIntent().getSerializableExtra(VContant.PERMIT_RENEWAL_CODE);
            l.d(serializableExtra14, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data");
            f2((com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) serializableExtra14);
            TextView textView13 = r1().f26171b;
            textView13.setText(x1().b("renewPermit_Confirm", "Application for Permit Renewal saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.ALTERATION_CODE, true)) {
            Serializable serializableExtra15 = getIntent().getSerializableExtra(VContant.ALTERATION_CODE);
            l.d(serializableExtra15, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data");
            S1((com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data) serializableExtra15);
            TextView textView14 = r1().f26171b;
            textView14.setText(x1().b("altVh_Confirm", "Application for Alteration of Vehicle saved successfully in draft with application no.") + ' ' + q1());
        }
        if (p.o(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.UPDATE_MOBILE_CODE, true)) {
            Serializable serializableExtra16 = getIntent().getSerializableExtra(VContant.UPDATE_MOBILE_CODE);
            l.d(serializableExtra16, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data");
            b2((com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data) serializableExtra16);
            TextView textView15 = r1().f26171b;
            textView15.setText(x1().b("updateMobileNumber", "Application for Update Mobile Number saved successfully in draft with application no.") + ' ' + q1());
        }
        r1().f26173d.f28305f.setOnClickListener(new d0(this));
        r1().f26173d.f28306g.setOnClickListener(new e0(this));
        r1().f26172c.setOnClickListener(new ai.f0(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, x1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            SaveVahanlog.a aVar = SaveVahanlog.f20959k;
            NrvDetails I1 = I1();
            boolean z10 = this.f21460b0;
            String q12 = q1();
            String D1 = D1();
            String substring = H1().substring(0, 4);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            aVar.a(this, I1, z10, q12, D1, substring);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data p1() {
        com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data data = this.Z;
        if (data != null) {
            return data;
        }
        l.v("alterDraft");
        return null;
    }

    public final String q1() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        l.v("application");
        return null;
    }

    public final f0 r1() {
        f0 f0Var = this.G;
        if (f0Var != null) {
            return f0Var;
        }
        l.v("binding");
        return null;
    }

    public final DuplicateFitessDraft s1() {
        DuplicateFitessDraft duplicateFitessDraft = this.P;
        if (duplicateFitessDraft != null) {
            return duplicateFitessDraft;
        }
        l.v("duplicate_FC");
        return null;
    }

    public final DuplicatePermitDraft t1() {
        DuplicatePermitDraft duplicatePermitDraft = this.S;
        if (duplicatePermitDraft != null) {
            return duplicatePermitDraft;
        }
        l.v("duplicate_Permit");
        return null;
    }

    public final dulicateRcResponseModle u1() {
        dulicateRcResponseModle dulicatercresponsemodle = this.O;
        if (dulicatercresponsemodle != null) {
            return dulicatercresponsemodle;
        }
        l.v("duplicate_RC");
        return null;
    }

    public final HPAResModle v1() {
        HPAResModle hPAResModle = this.N;
        if (hPAResModle != null) {
            return hPAResModle;
        }
        l.v("hpaObject");
        return null;
    }

    public final HptTerResponse w1() {
        HptTerResponse hptTerResponse = this.M;
        if (hptTerResponse != null) {
            return hptTerResponse;
        }
        l.v("hptObject");
        return null;
    }

    public final c x1() {
        c cVar = this.f21464f0;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data y1() {
        com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data data = this.f21459a0;
        if (data != null) {
            return data;
        }
        l.v("mobileNoUpdateDraft");
        return null;
    }

    public final NocDraftResponse z1() {
        NocDraftResponse nocDraftResponse = this.V;
        if (nocDraftResponse != null) {
            return nocDraftResponse;
        }
        l.v("noc_draft");
        return null;
    }
}
