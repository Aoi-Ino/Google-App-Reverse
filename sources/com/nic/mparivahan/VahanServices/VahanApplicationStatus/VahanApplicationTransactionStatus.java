package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPayment;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreen;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload;
import com.nic.mparivahan.VahanServices.VahanViewModel.PendingTransTaxBreakUpModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.VahanPendingTransBankModel;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import ni.ob;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;
import v9.e;

public final class VahanApplicationTransactionStatus extends androidx.appcompat.app.d {
    private final Context G = this;
    private ob H;
    /* access modifiers changed from: private */
    public String I = "";
    private String J = "";
    /* access modifiers changed from: private */
    public String K = "";
    /* access modifiers changed from: private */
    public String L = "";
    /* access modifiers changed from: private */
    public String M = "";
    public NrvDetails N;
    private String O = "0";
    private ArrayList P = new ArrayList();
    private ApplicationServiceOtp Q;
    private HashMap R = new HashMap();
    private boolean S;
    private boolean T;
    public ProgressDialog U;
    public bi.h V;
    public VahanProService W;
    private RequireDataForBePaymet X;
    private String Y = "0";
    public bi.l Z;

    /* renamed from: a0  reason: collision with root package name */
    public VahanServiceConnection f20782a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f20783b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f20784c0;

    /* renamed from: d0  reason: collision with root package name */
    public VahanProService f20785d0;

    /* renamed from: e0  reason: collision with root package name */
    public bi.h f20786e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f20787f0 = " ";

    /* renamed from: g0  reason: collision with root package name */
    private String f20788g0 = "M";

    /* renamed from: h0  reason: collision with root package name */
    private String f20789h0 = " ";

    /* renamed from: i0  reason: collision with root package name */
    private boolean f20790i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f20791j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f20792k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f20793l0 = true;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f20794m0 = true;

    /* renamed from: n0  reason: collision with root package name */
    public String f20795n0;
    /* access modifiers changed from: private */

    /* renamed from: o0  reason: collision with root package name */
    public bi.b f20796o0;

    /* renamed from: p0  reason: collision with root package name */
    private ApplicationService f20797p0;

    /* renamed from: q0  reason: collision with root package name */
    public BeforePaymentRequest f20798q0;

    /* renamed from: r0  reason: collision with root package name */
    private String f20799r0 = "00000";

    /* renamed from: s0  reason: collision with root package name */
    private String f20800s0 = "00000";

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20801e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20801e = vahanApplicationTransactionStatus;
        }

        public final void b(String str) {
            if (this.f20801e.X1().isShowing()) {
                this.f20801e.X1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20802e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20802e = vahanApplicationTransactionStatus;
        }

        public final void b(String str) {
            if (this.f20802e.X1().isShowing()) {
                this.f20802e.X1().dismiss();
            }
            if (!str.equals("Error")) {
                this.f20802e.V2(str);
            } else {
                this.f20802e.V2("Not able to verify payment from bank. Please try again later");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20803e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20803e = vahanApplicationTransactionStatus;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanApplicationTransactionStatus vahanApplicationTransactionStatus = this.f20803e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanApplicationTransactionStatus.J2(companion.c(ownerDetailPuccPermit));
                        if (!ka.c.f13158a.m(String.valueOf(this.f20803e.V1().getRc_off_cd()))) {
                            VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = this.f20803e;
                            vahanApplicationTransactionStatus2.K2(String.valueOf(vahanApplicationTransactionStatus2.V1().getRc_off_cd()));
                        }
                        bi.h i22 = this.f20803e.i2();
                        VahanApplicationTransactionStatus vahanApplicationTransactionStatus3 = this.f20803e;
                        i22.j1(vahanApplicationTransactionStatus3, vahanApplicationTransactionStatus3.L, q.B0(this.f20803e.K).toString(), q.B0(this.f20803e.b2().toString()).toString());
                        return;
                    }
                }
                this.f20803e.X1().dismiss();
            } catch (Exception e10) {
                this.f20803e.X1().dismiss();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20804e = vahanApplicationTransactionStatus;
        }

        public final void b(String str) {
            this.f20804e.X1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20805e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20805e = vahanApplicationTransactionStatus;
        }

        public final void b(PendingTransTaxBreakUpModel pendingTransTaxBreakUpModel) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("renderChckBtn", pendingTransTaxBreakUpModel.getRenderChckBtn());
                jSONObject.put("renderFeeTable", pendingTransTaxBreakUpModel.getRenderFeeTable());
                jSONObject.put("renderTaxTable", pendingTransTaxBreakUpModel.getRenderTaxTable());
                jSONObject.put("state_cd", (Object) pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getState_cd());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("applNo", (Object) pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getApplNo());
                jSONObject2.put("finalTaxAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getFinalTaxAmount());
                jSONObject2.put("no_adv_units", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getNo_adv_units());
                jSONObject2.put("off_cd", (Object) pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getOff_cd());
                jSONObject2.put("pur_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getPur_cd());
                jSONObject2.put("regnNo", (Object) pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getRegnNo());
                jSONObject2.put("state_cd", (Object) pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getState_cd());
                jSONObject2.put("taxPurcdDesc", (Object) pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTaxPurcdDesc());
                jSONObject2.put("totalAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalAmount());
                jSONObject2.put("totalPaybaleInterest", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleInterest());
                jSONObject2.put("totalPaybalePenalty", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybalePenalty());
                jSONObject2.put("totalPaybaleTax", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax());
                jSONObject2.put("totalPaybaleTax1", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax1());
                jSONObject2.put("totalPaybaleTax2", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax2());
                jSONObject2.put("totalAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalAmount());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put((Object) jSONObject2);
                jSONObject.put("tax_pay_dobj", (Object) jSONArray);
                bi.b K1 = this.f20805e.f20796o0;
                if (K1 == null) {
                    cm.l.v("viewModelPayment");
                    K1 = null;
                }
                K1.F(this.f20805e, jSONObject);
            } catch (Exception e10) {
                if (this.f20805e.X1().isShowing()) {
                    this.f20805e.X1().dismiss();
                }
                this.f20805e.V2("Unable to proceed further, Please try after sometime");
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PendingTransTaxBreakUpModel) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20806e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20806e = vahanApplicationTransactionStatus;
        }

        public final void b(String str) {
            if (this.f20806e.X1().isShowing()) {
                this.f20806e.X1().dismiss();
            }
            if (!str.equals("Error")) {
                this.f20806e.V2(str);
            } else {
                this.f20806e.V2("Unable to proceed further, Please try after sometime");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20807e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20807e = vahanApplicationTransactionStatus;
        }

        public final void b(VahanPendingTransBankModel vahanPendingTransBankModel) {
            String b22;
            this.f20807e.M = vahanPendingTransBankModel.getReturnUrl();
            if (q.F(this.f20807e.b2(), ".0", false, 2, (Object) null)) {
                b22 = this.f20807e.b2().substring(0, this.f20807e.b2().length() - 2);
                cm.l.e(b22, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                b22 = this.f20807e.b2();
            }
            String obj = q.B0(b22).toString();
            this.f20807e.N2(true);
            bi.h h22 = this.f20807e.h2();
            VahanApplicationTransactionStatus vahanApplicationTransactionStatus = this.f20807e;
            h22.A0(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.L, this.f20807e.K, obj, this.f20807e.T1());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanPendingTransBankModel) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20808e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20808e = vahanApplicationTransactionStatus;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            VahanApplicationTransactionStatus vahanApplicationTransactionStatus;
            String obj;
            Serializable serializable;
            OwnerDetailPuccPermit ownerDetailPuccPermit2 = ownerDetailPuccPermit;
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = this.f20808e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanApplicationTransactionStatus2.J2(companion.c(ownerDetailPuccPermit2));
                        if (this.f20808e.Y1().equals(VContant.Tax_PURPOSE_CODE)) {
                            VahanApplicationTransactionStatus vahanApplicationTransactionStatus3 = this.f20808e;
                            vahanApplicationTransactionStatus3.I2(String.valueOf(vahanApplicationTransactionStatus3.V1().getRc_chasi_no()));
                            return;
                        }
                        String str = "";
                        if (this.f20808e.Z1()) {
                            String b22 = this.f20808e.b2();
                            String str2 = VContant.NEXGEN_addahar_address;
                            String str3 = VContant.NEXGEN_addahar_name;
                            if (q.F(b22, ".0", false, 2, (Object) null)) {
                                vahanApplicationTransactionStatus = this.f20808e;
                                String substring = vahanApplicationTransactionStatus.b2().substring(0, this.f20808e.b2().length() - 2);
                                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                obj = q.B0(substring).toString();
                            } else {
                                vahanApplicationTransactionStatus = this.f20808e;
                                obj = q.B0(vahanApplicationTransactionStatus.b2()).toString();
                            }
                            vahanApplicationTransactionStatus.M2(obj);
                            try {
                                String regn_no2 = ownerDetailPuccPermit.getRegn_no();
                                if (regn_no2 != null) {
                                    if (regn_no2.length() != 0) {
                                        this.f20808e.J2(companion.c(ownerDetailPuccPermit2));
                                        String G1 = this.f20808e.I;
                                        String valueOf = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                                        String b23 = this.f20808e.b2();
                                        Double valueOf2 = Double.valueOf(0.0d);
                                        String regn_no3 = ownerDetailPuccPermit.getRegn_no();
                                        String J1 = this.f20808e.K;
                                        String rc_vh_class_cd = this.f20808e.V1().getRc_vh_class_cd();
                                        BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest((String) null, (Boolean) null, "", G1, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, valueOf, " ", " ", " ", b23, "", "", valueOf2, 0, regn_no3, J1, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null);
                                        Intent intent = new Intent(this.f20808e, VahanPendingTransactionPayment.class);
                                        String str4 = str;
                                        intent.putExtra(VContant.NEXGEN_INTENT_CODE, str4);
                                        intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                                        intent.putExtra(VContant.APP_NO, this.f20808e.I);
                                        intent.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                                        intent.putExtra("rc_number", ownerDetailPuccPermit.getRegn_no());
                                        intent.putExtra(VContant.PURPOSE_CODE, this.f20808e.Y1());
                                        intent.putExtra("URL", this.f20808e.M);
                                        intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
                                        intent.putExtra("RC", ownerDetailPuccPermit.getRegn_no());
                                        intent.putExtra("RcDetails", this.f20808e.V1());
                                        intent.putExtra(str3, str4);
                                        intent.putExtra(str2, str4);
                                        this.f20808e.startActivity(intent);
                                        this.f20808e.finish();
                                        return;
                                    }
                                }
                                VahanApplicationTransactionStatus vahanApplicationTransactionStatus4 = this.f20808e;
                                vahanApplicationTransactionStatus4.V2(vahanApplicationTransactionStatus4.getString(R.string.service_unavable_please_try));
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                if (this.f20808e.X1().isShowing()) {
                                    this.f20808e.X1().dismiss();
                                }
                                VahanApplicationTransactionStatus vahanApplicationTransactionStatus5 = this.f20808e;
                                vahanApplicationTransactionStatus5.V2(vahanApplicationTransactionStatus5.getString(R.string.service_unavable_please_try));
                                return;
                            }
                        } else if (this.f20808e.f2()) {
                            VahanApplicationTransactionStatus vahanApplicationTransactionStatus6 = this.f20808e;
                            vahanApplicationTransactionStatus6.O1(vahanApplicationTransactionStatus6.I);
                            return;
                        } else {
                            String G12 = this.f20808e.I;
                            String valueOf3 = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                            String Y1 = this.f20808e.Y1();
                            RequireDataForBePaymet c22 = this.f20808e.c2();
                            String valueOf4 = String.valueOf(c22 != null ? c22.getRcpt_dt() : null);
                            RequireDataForBePaymet c23 = this.f20808e.c2();
                            String valueOf5 = String.valueOf(c23 != null ? c23.getReturn_rcpt_no() : null);
                            RequireDataForBePaymet c24 = this.f20808e.c2();
                            Integer valueOf6 = c24 != null ? Integer.valueOf(c24.getRcpt_amt()) : null;
                            cm.l.c(valueOf6);
                            Double valueOf7 = Double.valueOf((double) valueOf6.intValue());
                            String regn_no4 = ownerDetailPuccPermit.getRegn_no();
                            RequireDataForBePaymet c25 = this.f20808e.c2();
                            String valueOf8 = String.valueOf(c25 != null ? c25.getState_cd() : null);
                            String rc_vh_class_cd2 = this.f20808e.V1().getRc_vh_class_cd();
                            new BeforePaymentRequest((String) null, (Boolean) null, "", G12, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, valueOf3, " ", " ", " ", Y1, valueOf4, valueOf5, valueOf7, 0, regn_no4, valueOf8, " ", " ", " ", rc_vh_class_cd2 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd2)) : null, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null);
                            Intent intent2 = new Intent(this.f20808e, VahanDmsAPI.class);
                            intent2.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                            intent2.putExtra(VContant.APP_NO, this.f20808e.I);
                            intent2.putExtra("rc_number", this.f20808e.L);
                            intent2.putExtra(VContant.PURPOSE_CODE, this.f20808e.Y1().toString());
                            intent2.putExtra("off_code", String.valueOf(ownerDetailPuccPermit.getOff_cd()));
                            intent2.putExtra(VContant.FINAL_SUBMIT, serializable);
                            intent2.putExtra(VContant.NEXGEN_isFACELESS, this.f20808e.U1());
                            intent2.putExtra("RC", this.f20808e.L);
                            intent2.putExtra("RcDetails", this.f20808e.V1());
                            RequireDataForBePaymet c26 = this.f20808e.c2();
                            intent2.putExtra("vahlogReptDate", String.valueOf(c26 != null ? c26.getRcpt_dt() : null));
                            RequireDataForBePaymet c27 = this.f20808e.c2();
                            cm.l.c(c27);
                            intent2.putExtra("vahlogFeeAmt", (double) c27.getRcpt_amt());
                            RequireDataForBePaymet c28 = this.f20808e.c2();
                            cm.l.c(c28);
                            intent2.putExtra("vahlogReptNo", c28.getReturn_rcpt_no());
                            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
                            intent2.putExtra(VContant.NEXGEN_addahar_address, "NA");
                            this.f20808e.startActivity(intent2);
                            this.f20808e.finish();
                            return;
                        }
                    }
                }
                this.f20808e.X1().dismiss();
            } catch (Exception e11) {
                this.f20808e.X1().dismiss();
                e11.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20809e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20809e = vahanApplicationTransactionStatus;
        }

        public final void b(String str) {
            this.f20809e.X1().dismiss();
            VahanApplicationTransactionStatus vahanApplicationTransactionStatus = this.f20809e;
            vahanApplicationTransactionStatus.Y2(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20810e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20810e = vahanApplicationTransactionStatus;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f20810e.X1().isShowing()) {
                    this.f20810e.X1().dismiss();
                }
                Intent intent = new Intent(this.f20810e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f20810e.Y1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", this.f20810e.L);
                intent.putExtra("RcDetails", this.f20810e.V1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                this.f20810e.startActivity(intent);
                this.f20810e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotUserDataModel) obj);
            return x.f30437a;
        }
    }

    static final class k extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplicationTransactionStatus f20811e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
            super(1);
            this.f20811e = vahanApplicationTransactionStatus;
        }

        public final void b(String str) {
            try {
                if (this.f20811e.X1().isShowing()) {
                    this.f20811e.X1().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    VahanApplicationTransactionStatus vahanApplicationTransactionStatus = this.f20811e;
                    Toast.makeText(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null) {
                    if (!p.q(str)) {
                        this.f20811e.C2(str);
                        return;
                    }
                }
                VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = this.f20811e;
                vahanApplicationTransactionStatus2.C2(vahanApplicationTransactionStatus2.getString(R.string.service_unavable_please_try));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class l implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20812a;

        l(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f20812a = lVar;
        }

        public final pl.c a() {
            return this.f20812a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20812a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, String str) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        if (vahanApplicationTransactionStatus.X1().isShowing()) {
            vahanApplicationTransactionStatus.X1().dismiss();
        }
    }

    private final void B2() {
        finish();
    }

    /* access modifiers changed from: private */
    public final void C2(String str) {
        Dialog dialog = new Dialog(this);
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new p0(dialog));
        textView2.setOnClickListener(new q0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void D2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void E2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void F2(String str, Context context) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.redirect_check_pending);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ld.c cVar = new ld.c(context);
        textView.setText(cVar.b("button_proceed", "Procced"));
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str + "\n Click Procced to re-verify");
        textView.setOnClickListener(new u0(dialog, this));
        textView2.setOnClickListener(new v0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void G2(Dialog dialog, VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        dialog.dismiss();
        try {
            vahanApplicationTransactionStatus.X1().show();
            bi.b bVar = vahanApplicationTransactionStatus.f20796o0;
            if (bVar == null) {
                cm.l.v("viewModelPayment");
                bVar = null;
            }
            bVar.A(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.O, vahanApplicationTransactionStatus.I, vahanApplicationTransactionStatus.W1(), vahanApplicationTransactionStatus.K, vahanApplicationTransactionStatus.L);
        } catch (Exception unused) {
            vahanApplicationTransactionStatus.X1().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void H2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void O1(String str) {
        try {
            h2().l(this, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void P1() {
        this.R.put("AN", "Andaman and Nicobar Islands");
        this.R.put("AP", "Andhra Pradesh");
        this.R.put("AR", "Arunachal Pradesh");
        this.R.put("AS", "Assam");
        this.R.put("BR", "Bihar");
        this.R.put("CG", "Chandigarh");
        this.R.put("CH", "Chandigarh");
        this.R.put("DH", "Dadra and Nagar Haveli");
        this.R.put("DD", "Daman and Diu");
        this.R.put("DL", "Delhi");
        this.R.put("GA", "Goa");
        this.R.put("GJ", "Gujarat");
        this.R.put("HR", "Haryana");
        this.R.put("HP", "Himachal Pradesh");
        this.R.put("JK", "Jammu and Kashmir");
        this.R.put("JH", "Jharkhand");
        this.R.put("KA", "Karnataka");
        this.R.put("KL", "Kerala");
        this.R.put("LD", "Lakshadweep");
        this.R.put("MP", "Madhya Pradesh");
        this.R.put("MH", "Maharashtra");
        this.R.put("MN", "Manipur");
        this.R.put("ML", "Meghalaya");
        this.R.put("MZ", "Mizoram");
        this.R.put("NL", "Nagaland");
        this.R.put("OR", "Odisha");
        this.R.put("PY", "Puducherry");
        this.R.put("PB", "Punjab");
        this.R.put("RJ", "Rajasthan");
        this.R.put("SK", "Sikkim");
        this.R.put("TN", "Tamil Nadu");
        this.R.put("TS", "Telangana");
        this.R.put("TR", "Tripura");
        this.R.put("UK", "Uttarakhand");
        this.R.put("UP", "Uttar Pradesh");
        this.R.put("WB", "West Bengal");
    }

    /* access modifiers changed from: private */
    public static final void R1(Dialog dialog, Context context, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(context, "$context");
        dialog.dismiss();
        ((Activity) context).finish();
    }

    /* access modifiers changed from: private */
    public static final void S1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void V2(String str) {
        Dialog dialog = new Dialog(this);
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new w0(dialog));
        textView2.setOnClickListener(new x0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void W2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void X2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z2(Dialog dialog, VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        dialog.dismiss();
        vahanApplicationTransactionStatus.finish();
    }

    /* access modifiers changed from: private */
    public static final void b3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0483, code lost:
        if (r1.f20783b0 == true) goto L_0x0494;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x0c6b A[SYNTHETIC, Splitter:B:624:0x0c6b] */
    /* JADX WARNING: Removed duplicated region for block: B:634:0x0c81 A[SYNTHETIC, Splitter:B:634:0x0c81] */
    /* JADX WARNING: Removed duplicated region for block: B:644:0x0c8f A[Catch:{ Exception -> 0x0ca6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:660:0x0caa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k2() {
        /*
            r22 = this;
            r1 = r22
            ld.c r2 = new ld.c
            r2.<init>(r1)
            ni.ob r3 = r1.H
            java.lang.String r4 = "binding"
            if (r3 != 0) goto L_0x0011
            cm.l.v(r4)
            r3 = 0
        L_0x0011:
            android.widget.LinearLayout r3 = r3.f27855g
            r6 = 8
            r3.setVisibility(r6)
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x0020
            cm.l.v(r4)
            r3 = 0
        L_0x0020:
            ni.qd r3 = r3.f27859k
            androidx.appcompat.widget.AppCompatImageView r3 = r3.f28305f
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.r0 r7 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.r0
            r7.<init>(r1)
            r3.setOnClickListener(r7)
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x0034
            cm.l.v(r4)
            r3 = 0
        L_0x0034:
            ni.qd r3 = r3.f27859k
            android.widget.RelativeLayout r3 = r3.f28306g
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.s0 r7 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.s0
            r7.<init>(r1)
            r3.setOnClickListener(r7)
            java.util.ArrayList r3 = r1.P
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0d21
            java.util.ArrayList r3 = r1.P
            int r3 = r3.size()
            r7 = 0
            java.lang.String r8 = ""
            r9 = r7
        L_0x0052:
            if (r9 >= r3) goto L_0x0cf8
            java.util.ArrayList r10 = r1.P
            java.lang.Object r10 = r10.get(r9)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r10 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r10
            java.util.ArrayList r10 = r10.getCurrentlist()
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0ce7
            java.util.ArrayList r10 = r1.P
            java.lang.Object r10 = r10.get(r7)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r10 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r10
            java.util.ArrayList r10 = r10.getCurrentlist()
            int r11 = r10.size()
            r12 = r7
        L_0x0077:
            if (r12 >= r11) goto L_0x03ea
            java.lang.String r15 = "Pending2"
            java.lang.String r6 = "11"
            android.util.Log.e(r15, r6)
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r6 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            java.lang.Object r15 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r15 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r15
            int r15 = r15.getPurCd()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            boolean r15 = r6.F(r15)
            java.lang.String r5 = "--"
            java.lang.String r13 = ", "
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r14 = "."
            if (r15 == 0) goto L_0x023f
            java.lang.Object r15 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r15 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r15
            boolean r15 = r15.getIsdraftpending()
            r17 = r3
            r3 = 1
            if (r15 != r3) goto L_0x0238
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x00b5
            cm.l.v(r4)
            r3 = 0
        L_0x00b5:
            android.widget.LinearLayout r3 = r3.E
            r6 = 0
            r3.setVisibility(r6)
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.String r3 = r3.getAppl_dt()
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            java.lang.String r6 = r6.getRegno()
            r1.L = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            boolean r6 = r6.getFacelesstransaction()
            r1.S = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            boolean r6 = r6.getIsdocuploadpending()
            r1.f20783b0 = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            boolean r6 = r6.getIsrtorejection()
            r1.f20784c0 = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            java.lang.String r6 = r6.getStatusDesc()
            r1.f20787f0 = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            boolean r6 = r6.getAppointmentpending()
            r1.T = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            boolean r6 = r6.getIsdraftpending()
            r1.f20792k0 = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            boolean r6 = r6.getAppointmentRequired()
            r1.f20793l0 = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            java.lang.String r6 = r6.getAuth_mode()
            java.lang.String r6 = r6.toString()
            r1.f20788g0 = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            boolean r6 = r6.getDocumentsRequired()
            r1.f20794m0 = r6
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            java.lang.String r6 = r6.getPurCdDescr()
            java.lang.Object r8 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r8 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r8
            java.lang.String r8 = r8.getOffName()
            java.lang.Object r15 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r15 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r15
            java.lang.String r15 = r15.getPublicRemark()
            java.lang.Object r16 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r16 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r16
            java.lang.Object r16 = r16.getCurr_off_cd()
            r18 = r3
            java.lang.String r3 = r16.toString()
            r20 = r2
            r21 = r9
            r19 = r11
            r2 = 0
            r9 = 2
            r11 = 0
            boolean r3 = km.q.F(r3, r14, r2, r9, r11)
            if (r3 == 0) goto L_0x0197
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.Object r3 = r3.getCurr_off_cd()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.substring(r2, r9)
            cm.l.e(r3, r7)
            r1.K2(r3)
            goto L_0x01a8
        L_0x0197:
            java.lang.Object r2 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            java.lang.Object r2 = r2.getCurr_off_cd()
            java.lang.String r2 = r2.toString()
            r1.K2(r2)
        L_0x01a8:
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x01b0
            cm.l.v(r4)
            r2 = 0
        L_0x01b0:
            android.widget.TextView r2 = r2.f27860l
            r2.setText(r6)
            ka.c$a r2 = ka.c.f13158a
            boolean r3 = r2.m(r15)
            if (r3 == 0) goto L_0x01cd
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x01c5
            cm.l.v(r4)
            r3 = 0
        L_0x01c5:
            android.widget.TextView r3 = r3.f27848c
            java.lang.String r6 = r1.f20787f0
        L_0x01c9:
            r3.setText(r6)
            goto L_0x01ec
        L_0x01cd:
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x01d5
            cm.l.v(r4)
            r3 = 0
        L_0x01d5:
            android.widget.TextView r3 = r3.f27848c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r1.f20787f0
            r6.append(r7)
            r6.append(r13)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            goto L_0x01c9
        L_0x01ec:
            boolean r2 = r2.m(r8)
            if (r2 == 0) goto L_0x0200
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x01fa
            cm.l.v(r4)
            r2 = 0
        L_0x01fa:
            android.widget.TextView r2 = r2.f27846b
            r2.setText(r5)
            goto L_0x020d
        L_0x0200:
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0208
            cm.l.v(r4)
            r2 = 0
        L_0x0208:
            android.widget.TextView r2 = r2.f27846b
            r2.setText(r8)
        L_0x020d:
            java.lang.Object r2 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            int r2 = r2.getPurCd()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.Y = r2
            java.lang.String r2 = r1.L
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0234
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x022d
            cm.l.v(r4)
            r2 = 0
        L_0x022d:
            android.widget.TextView r2 = r2.G
            java.lang.String r3 = r1.L
            r2.setText(r3)
        L_0x0234:
            r8 = r18
            goto L_0x03db
        L_0x0238:
            r20 = r2
        L_0x023a:
            r21 = r9
            r19 = r11
            goto L_0x0244
        L_0x023f:
            r20 = r2
            r17 = r3
            goto L_0x023a
        L_0x0244:
            java.lang.Object r2 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            int r2 = r2.getPurCd()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r2 = r6.F(r2)
            if (r2 == 0) goto L_0x03db
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0260
            cm.l.v(r4)
            r2 = 0
        L_0x0260:
            android.widget.LinearLayout r2 = r2.E
            r3 = 0
            r2.setVisibility(r3)
            java.lang.Object r2 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            java.lang.String r2 = r2.getAppl_dt()
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.String r3 = r3.getRegno()
            r1.L = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            boolean r3 = r3.getFacelesstransaction()
            r1.S = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            boolean r3 = r3.getIsdocuploadpending()
            r1.f20783b0 = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            boolean r3 = r3.getIsrtorejection()
            r1.f20784c0 = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.String r3 = r3.getStatusDesc()
            r1.f20787f0 = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            boolean r3 = r3.getAppointmentpending()
            r1.T = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            boolean r3 = r3.getAppointmentRequired()
            r1.f20793l0 = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            boolean r3 = r3.getDocumentsRequired()
            r1.f20794m0 = r3
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.String r3 = r3.getPurCdDescr()
            java.lang.Object r6 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r6 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r6
            java.lang.String r6 = r6.getOffName()
            ni.ob r8 = r1.H
            if (r8 != 0) goto L_0x02ec
            cm.l.v(r4)
            r8 = 0
        L_0x02ec:
            android.widget.TextView r8 = r8.f27860l
            r8.setText(r3)
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.String r3 = r3.getPublicRemark()
            ni.ob r8 = r1.H
            if (r8 != 0) goto L_0x0303
            cm.l.v(r4)
            r8 = 0
        L_0x0303:
            android.widget.TextView r8 = r8.f27848c
            java.lang.String r9 = r1.f20787f0
            r8.setText(r9)
            java.lang.Object r8 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r8 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r8
            java.lang.String r8 = r8.getAuth_mode()
            java.lang.String r8 = r8.toString()
            r1.f20788g0 = r8
            ka.c$a r8 = ka.c.f13158a
            boolean r9 = r8.m(r3)
            if (r9 == 0) goto L_0x0332
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x032a
            cm.l.v(r4)
            r3 = 0
        L_0x032a:
            android.widget.TextView r3 = r3.f27848c
            java.lang.String r9 = r1.f20787f0
            r3.setText(r9)
            goto L_0x0353
        L_0x0332:
            ni.ob r9 = r1.H
            if (r9 != 0) goto L_0x033a
            cm.l.v(r4)
            r9 = 0
        L_0x033a:
            android.widget.TextView r9 = r9.f27848c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = r1.f20787f0
            r11.append(r15)
            r11.append(r13)
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            r9.setText(r3)
        L_0x0353:
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.Object r3 = r3.getCurr_off_cd()
            java.lang.String r3 = r3.toString()
            r9 = 0
            r11 = 0
            r13 = 2
            boolean r3 = km.q.F(r3, r14, r11, r13, r9)
            if (r3 == 0) goto L_0x0383
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.Object r3 = r3.getCurr_off_cd()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.substring(r11, r13)
            cm.l.e(r3, r7)
        L_0x037f:
            r1.K2(r3)
            goto L_0x0392
        L_0x0383:
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            java.lang.Object r3 = r3.getCurr_off_cd()
            java.lang.String r3 = r3.toString()
            goto L_0x037f
        L_0x0392:
            boolean r3 = r8.m(r6)
            if (r3 == 0) goto L_0x03a6
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x03a0
            cm.l.v(r4)
            r3 = 0
        L_0x03a0:
            android.widget.TextView r3 = r3.f27846b
            r3.setText(r5)
            goto L_0x03b3
        L_0x03a6:
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x03ae
            cm.l.v(r4)
            r3 = 0
        L_0x03ae:
            android.widget.TextView r3 = r3.f27846b
            r3.setText(r6)
        L_0x03b3:
            java.lang.Object r3 = r10.get(r12)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r3
            int r3 = r3.getPurCd()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.Y = r3
            java.lang.String r3 = r1.L
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x03da
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x03d3
            cm.l.v(r4)
            r3 = 0
        L_0x03d3:
            android.widget.TextView r3 = r3.G
            java.lang.String r5 = r1.L
            r3.setText(r5)
        L_0x03da:
            r8 = r2
        L_0x03db:
            int r12 = r12 + 1
            r3 = r17
            r11 = r19
            r2 = r20
            r9 = r21
            r6 = 8
            r7 = 0
            goto L_0x0077
        L_0x03ea:
            r20 = r2
            r17 = r3
            r21 = r9
            java.util.ArrayList r2 = r1.P     // Catch:{ Exception -> 0x0ccd }
            r7 = r21
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x0cc3 }
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r2     // Catch:{ Exception -> 0x0cc3 }
            java.util.ArrayList r2 = r2.getCurrentlist()     // Catch:{ Exception -> 0x0cc3 }
            if (r2 == 0) goto L_0x0cc7
            java.util.ArrayList r2 = r1.P     // Catch:{ Exception -> 0x0cc3 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x0cc3 }
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r2     // Catch:{ Exception -> 0x0cc3 }
            java.util.ArrayList r2 = r2.getCurrentlist()     // Catch:{ Exception -> 0x0cc3 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0cc3 }
            if (r2 <= 0) goto L_0x0cc7
            java.lang.String r2 = r1.Y     // Catch:{ Exception -> 0x0cc3 }
            java.lang.String r3 = "58"
            r5 = 1
            boolean r2 = km.p.o(r2, r3, r5)     // Catch:{ Exception -> 0x0cc3 }
            java.lang.String r3 = "ONLINE TRANSACTION PENDING"
            java.lang.String r6 = "PENDING IN DRAFT"
            java.lang.String r9 = "TRANSACTION FAILED"
            java.lang.String r10 = "ONLINE TRANSACTION FAIL"
            if (r2 != 0) goto L_0x042f
            java.lang.String r2 = r1.Y     // Catch:{ Exception -> 0x0584 }
            java.lang.String r11 = "58.0"
            boolean r2 = km.p.o(r2, r11, r5)     // Catch:{ Exception -> 0x0584 }
            if (r2 == 0) goto L_0x0433
        L_0x042f:
            r11 = r20
            goto L_0x0c1f
        L_0x0433:
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0584 }
            r5 = 0
            r11 = 0
            r12 = 2
            boolean r2 = km.q.F(r2, r10, r11, r12, r5)     // Catch:{ Exception -> 0x0584 }
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r2 != 0) goto L_0x0448
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0584 }
            boolean r2 = km.q.F(r2, r9, r11, r12, r5)     // Catch:{ Exception -> 0x0584 }
            if (r2 == 0) goto L_0x044c
        L_0x0448:
            r11 = r20
            goto L_0x0bad
        L_0x044c:
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0584 }
            boolean r2 = km.q.F(r2, r6, r11, r12, r5)     // Catch:{ Exception -> 0x0584 }
            if (r2 != 0) goto L_0x045c
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0584 }
            boolean r2 = km.q.F(r2, r3, r11, r12, r5)     // Catch:{ Exception -> 0x0584 }
            if (r2 == 0) goto L_0x0461
        L_0x045c:
            r11 = r20
            r2 = 1
            goto L_0x0b37
        L_0x0461:
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x0584 }
            r3 = 2131100579(0x7f0603a3, float:1.7813543E38)
            r5 = 2131230934(0x7f0800d6, float:1.8077935E38)
            r6 = 2131099809(0x7f0600a1, float:1.7811982E38)
            r9 = 2132017537(0x7f140181, float:1.9673355E38)
            java.lang.String r10 = "lbl_Completed"
            if (r2 == 0) goto L_0x0486
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0584 }
            java.lang.String r11 = "DOCUMENT UPLOAD PENDING AT ONLINE"
            r12 = 0
            r13 = 0
            r14 = 2
            boolean r2 = km.q.F(r2, r11, r13, r14, r12)     // Catch:{ Exception -> 0x0584 }
            if (r2 != 0) goto L_0x0494
            boolean r2 = r1.f20783b0     // Catch:{ Exception -> 0x048a }
            r11 = 1
            if (r2 != r11) goto L_0x0486
            goto L_0x0494
        L_0x0486:
            r11 = r20
            goto L_0x0589
        L_0x048a:
            r0 = move-exception
            r2 = r0
            r11 = r20
        L_0x048e:
            r3 = 0
            r5 = 8
            r9 = 0
            goto L_0x0cd3
        L_0x0494:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0584 }
            if (r2 != 0) goto L_0x049c
            cm.l.v(r4)     // Catch:{ Exception -> 0x048a }
            r2 = 0
        L_0x049c:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x0584 }
            r11 = 0
            r2.setVisibility(r11)     // Catch:{ Exception -> 0x0584 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0584 }
            if (r2 != 0) goto L_0x04aa
            cm.l.v(r4)     // Catch:{ Exception -> 0x048a }
            r2 = 0
        L_0x04aa:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x0584 }
            r11 = 0
            r2.setVisibility(r11)     // Catch:{ Exception -> 0x0584 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0584 }
            if (r2 != 0) goto L_0x04b8
            cm.l.v(r4)     // Catch:{ Exception -> 0x048a }
            r2 = 0
        L_0x04b8:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x0584 }
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x0584 }
            r11 = r20
            java.lang.String r9 = r11.b(r10, r9)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r9)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x04d3
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
            goto L_0x04d3
        L_0x04d0:
            r0 = move-exception
        L_0x04d1:
            r2 = r0
            goto L_0x048e
        L_0x04d3:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x04d0 }
            r9 = 8
            r2.setVisibility(r9)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x04e2
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x04e2:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x04f3
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x04f3:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0504
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0504:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0515
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0515:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0523
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0523:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0531
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0531:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x054a
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0543
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0543:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
        L_0x054a:
            boolean r2 = r1.S     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0577
            boolean r2 = r1.T     // Catch:{ Exception -> 0x04d0 }
            r3 = 1
            if (r2 != r3) goto L_0x0577
            boolean r2 = r1.f20793l0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != r3) goto L_0x0577
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x055f
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x055f:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x056d
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x056d:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
        L_0x0570:
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
        L_0x0573:
            r3 = 0
            r9 = 0
            goto L_0x0c8b
        L_0x0577:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x057f
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x057f:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            goto L_0x0570
        L_0x0584:
            r0 = move-exception
            r11 = r20
            goto L_0x04d1
        L_0x0589:
            boolean r2 = r1.f20783b0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x06d4
            boolean r12 = r1.S     // Catch:{ Exception -> 0x04d0 }
            r13 = 1
            if (r12 != r13) goto L_0x06d4
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x059a
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x059a:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x05a8
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x05a8:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x05b6
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x05b6:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x05c4
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x05c4:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x05d2
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x05d2:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x05e0
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x05e0:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x05ee
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x05ee:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r11.b(r10, r12)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0603
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0603:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0614
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0614:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0625
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0625:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0636
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0636:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x04d0 }
            r12 = 8
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0645
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0645:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r11.b(r10, r9)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r9)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x065a
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x065a:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x066b
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x066b:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x067c
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x067c:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x04d0 }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x068d
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x068d:
            android.widget.ImageView r2 = r2.f27851d0     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x069b
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x069b:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x06b5
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x06ae
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x06ae:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
        L_0x06b5:
            boolean r2 = r1.S     // Catch:{ Exception -> 0x04d0 }
            if (r2 == 0) goto L_0x06c7
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x06c1
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x06c1:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            goto L_0x0570
        L_0x06c7:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x06cf
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x06cf:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            goto L_0x0570
        L_0x06d4:
            if (r2 != 0) goto L_0x081d
            boolean r12 = r1.S     // Catch:{ Exception -> 0x04d0 }
            if (r12 != 0) goto L_0x081d
            boolean r12 = r1.T     // Catch:{ Exception -> 0x04d0 }
            r13 = 1
            if (r12 != r13) goto L_0x081d
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x06e7
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x06e7:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x06f5
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x06f5:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0703
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0703:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0711
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0711:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x071f
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x071f:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x072d
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x072d:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x073b
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x073b:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r11.b(r10, r12)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0750
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0750:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0761
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0761:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0772
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0772:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0783
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0783:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x04d0 }
            r12 = 8
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0792
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0792:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r11.b(r10, r9)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r9)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x07a7
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x07a7:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x07b8
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x07b8:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x07c9
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x07c9:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x04d0 }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x07da
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x07da:
            android.widget.ImageView r2 = r2.f27851d0     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x07e8
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x07e8:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x07f7
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x07f7:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0805
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0805:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0573
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0817
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0817:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            goto L_0x0570
        L_0x081d:
            if (r2 != 0) goto L_0x0999
            boolean r12 = r1.f20784c0     // Catch:{ Exception -> 0x04d0 }
            r13 = 1
            if (r12 != r13) goto L_0x0999
            boolean r12 = r1.T     // Catch:{ Exception -> 0x04d0 }
            if (r12 != 0) goto L_0x0999
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0830
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0830:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x083e
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x083e:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x084c
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x084c:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x085a
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x085a:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0868
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0868:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0876
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0876:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0884
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0884:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r11.b(r10, r12)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0899
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0899:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x08aa
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x08aa:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x08bb
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x08bb:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x08cc
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x08cc:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x04d0 }
            r12 = 8
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x08db
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x08db:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = "lbl_Rejected"
            r13 = 2132018953(0x7f140709, float:1.9676227E38)
            java.lang.String r13 = r1.getString(r13)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r11.b(r12, r13)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x08f5
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x08f5:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0903
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0903:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = "lbl_ReUpload"
            r13 = 2132019004(0x7f14073c, float:1.967633E38)
            java.lang.String r13 = r1.getString(r13)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r11.b(r12, r13)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r12)     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = r1.S     // Catch:{ Exception -> 0x04d0 }
            if (r2 == 0) goto L_0x0927
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0921
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0921:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            goto L_0x0570
        L_0x0927:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x092f
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x092f:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r11.b(r10, r9)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r9)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0944
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0944:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x04d0 }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0955
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0955:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0966
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0966:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x04d0 }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0977
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0977:
            android.widget.ImageView r2 = r2.N     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0985
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0985:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0994
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0994:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            goto L_0x0570
        L_0x0999:
            if (r2 != 0) goto L_0x0573
            boolean r2 = r1.f20784c0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0573
            boolean r2 = r1.T     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0573
            boolean r2 = r1.f20792k0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0573
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x09af
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x09af:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x09bd
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x09bd:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x09cb
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x09cb:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x09d9
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x09d9:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x09e7
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x09e7:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r11.b(r10, r12)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x09fc
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x09fc:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x04d0 }
            r12 = 8
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a0b
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a0b:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a1c
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a1c:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a2d
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a2d:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a3e
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a3e:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r12 = r11.b(r10, r12)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a53
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a53:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a64
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a64:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a75
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a75:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x04d0 }
            int r12 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a86
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a86:
            android.widget.ImageView r2 = r2.f27851d0     // Catch:{ Exception -> 0x04d0 }
            r12 = 0
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0a94
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0a94:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r12 = 8
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0aae
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0aa7
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0aa7:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r12 = 8
            r2.setVisibility(r12)     // Catch:{ Exception -> 0x04d0 }
        L_0x0aae:
            boolean r2 = r1.S     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b29
            boolean r2 = r1.f20793l0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0ab7
            goto L_0x0b29
        L_0x0ab7:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0abf
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0abf:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x04d0 }
            java.lang.String r9 = r11.b(r10, r9)     // Catch:{ Exception -> 0x04d0 }
            r2.setText(r9)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0ad4
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0ad4:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x04d0 }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0ae5
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0ae5:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x04d0 }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0af6
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0af6:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x04d0 }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x04d0 }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b07
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b07:
            android.widget.ImageView r2 = r2.N     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b15
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b15:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b24
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b24:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            goto L_0x0570
        L_0x0b29:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b31
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b31:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            goto L_0x0570
        L_0x0b37:
            r1.f20792k0 = r2     // Catch:{ Exception -> 0x04d0 }
            r1.f20783b0 = r2     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b43
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b43:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b51
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b51:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b5f
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b5f:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b6d
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b6d:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b7b
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b7b:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b89
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b89:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r2.setAlpha(r10)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0b96
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0b96:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r2.setAlpha(r10)     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0573
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0ba7
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0ba7:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            goto L_0x0570
        L_0x0bad:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0bb5
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0bb5:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0bc3
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0bc3:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0bd1
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0bd1:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0bdf
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0bdf:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0bed
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0bed:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0bfb
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0bfb:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x04d0 }
            r2.setAlpha(r10)     // Catch:{ Exception -> 0x04d0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0c08
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0c08:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x04d0 }
            r2.setAlpha(r10)     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0573
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x04d0 }
            if (r2 != 0) goto L_0x0c19
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0c19:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x04d0 }
            r3 = 8
            goto L_0x0570
        L_0x0c1f:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0cb9 }
            if (r2 != 0) goto L_0x0c27
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0c27:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x0cb9 }
            r5 = 8
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x0cc0 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0cb9 }
            if (r2 != 0) goto L_0x0c36
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0c36:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x0cb9 }
            r5 = 8
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x0cc0 }
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0cb9 }
            r5 = 0
            r12 = 0
            r13 = 2
            boolean r2 = km.q.F(r2, r10, r12, r13, r5)     // Catch:{ Exception -> 0x0cbc }
            if (r2 != 0) goto L_0x0c53
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x04d0 }
            boolean r2 = km.q.F(r2, r9, r12, r13, r5)     // Catch:{ Exception -> 0x04d0 }
            if (r2 == 0) goto L_0x0c51
            goto L_0x0c53
        L_0x0c51:
            r5 = 0
            goto L_0x0c61
        L_0x0c53:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0cb9 }
            if (r2 != 0) goto L_0x0c5b
            cm.l.v(r4)     // Catch:{ Exception -> 0x04d0 }
            r2 = 0
        L_0x0c5b:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x0cb9 }
            r5 = 0
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x0cb3 }
        L_0x0c61:
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0cb3 }
            r9 = 0
            r10 = 2
            boolean r2 = km.q.F(r2, r6, r5, r10, r9)     // Catch:{ Exception -> 0x0cb0 }
            if (r2 != 0) goto L_0x0c7d
            java.lang.String r2 = r1.f20787f0     // Catch:{ Exception -> 0x0c76 }
            boolean r2 = km.q.F(r2, r3, r5, r10, r9)     // Catch:{ Exception -> 0x0c76 }
            if (r2 == 0) goto L_0x0c74
            goto L_0x0c7d
        L_0x0c74:
            r3 = 0
            goto L_0x0c8b
        L_0x0c76:
            r0 = move-exception
            r2 = r0
            r3 = 0
        L_0x0c79:
            r5 = 8
            goto L_0x0cd3
        L_0x0c7d:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0cad }
            if (r2 != 0) goto L_0x0c85
            cm.l.v(r4)     // Catch:{ Exception -> 0x0c76 }
            r2 = r9
        L_0x0c85:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x0cad }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x0ca6 }
        L_0x0c8b:
            boolean r2 = r1.f20794m0     // Catch:{ Exception -> 0x0ca6 }
            if (r2 != 0) goto L_0x0caa
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0ca6 }
            if (r2 != 0) goto L_0x0c9b
            cm.l.v(r4)     // Catch:{ Exception -> 0x0c98 }
            r2 = r9
            goto L_0x0c9b
        L_0x0c98:
            r0 = move-exception
            r2 = r0
            goto L_0x0c79
        L_0x0c9b:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x0ca6 }
            r5 = 8
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x0ca3 }
            goto L_0x0cee
        L_0x0ca3:
            r0 = move-exception
        L_0x0ca4:
            r2 = r0
            goto L_0x0cd3
        L_0x0ca6:
            r0 = move-exception
        L_0x0ca7:
            r5 = 8
            goto L_0x0ca4
        L_0x0caa:
            r5 = 8
            goto L_0x0cee
        L_0x0cad:
            r0 = move-exception
            r3 = 0
            goto L_0x0ca7
        L_0x0cb0:
            r0 = move-exception
            r3 = r5
            goto L_0x0ca7
        L_0x0cb3:
            r0 = move-exception
            r3 = r5
        L_0x0cb5:
            r5 = 8
        L_0x0cb7:
            r9 = 0
            goto L_0x0ca4
        L_0x0cb9:
            r0 = move-exception
        L_0x0cba:
            r3 = 0
            goto L_0x0cb5
        L_0x0cbc:
            r0 = move-exception
            r9 = r5
            r3 = r12
            goto L_0x0ca7
        L_0x0cc0:
            r0 = move-exception
            r3 = 0
            goto L_0x0cb7
        L_0x0cc3:
            r0 = move-exception
            r11 = r20
            goto L_0x0cba
        L_0x0cc7:
            r11 = r20
            r3 = 0
            r5 = 8
            goto L_0x0ced
        L_0x0ccd:
            r0 = move-exception
            r11 = r20
            r7 = r21
            goto L_0x0cba
        L_0x0cd3:
            r2.printStackTrace()
            r2 = 2132018526(0x7f14055e, float:1.9675361E38)
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r6 = "no_detail_availbale"
            java.lang.String r2 = r11.b(r6, r2)
            r1.Y2(r1, r2)
            goto L_0x0cee
        L_0x0ce7:
            r11 = r2
            r17 = r3
            r5 = r6
            r3 = r7
            r7 = r9
        L_0x0ced:
            r9 = 0
        L_0x0cee:
            int r2 = r7 + 1
            r9 = r2
            r7 = r3
            r6 = r5
            r2 = r11
            r3 = r17
            goto L_0x0052
        L_0x0cf8:
            r9 = 0
            int r2 = r8.length()
            if (r2 <= 0) goto L_0x0d0c
            ni.ob r11 = r1.H
            if (r11 != 0) goto L_0x0d07
            cm.l.v(r4)
            r11 = r9
        L_0x0d07:
            android.widget.TextView r2 = r11.f27850d
            r2.setText(r8)
        L_0x0d0c:
            android.app.ProgressDialog r2 = r22.X1()
            r2.show()
            bi.h r2 = r22.i2()
            java.lang.String r3 = r1.L
            java.lang.String r5 = r1.K
            java.lang.String r6 = r1.f20799r0
            r2.B0(r1, r3, r5, r6)
            goto L_0x0d22
        L_0x0d21:
            r9 = 0
        L_0x0d22:
            java.lang.String r2 = r1.I
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0d39
            ni.ob r11 = r1.H
            if (r11 != 0) goto L_0x0d32
            cm.l.v(r4)
            r11 = r9
        L_0x0d32:
            android.widget.TextView r2 = r11.f27852e
            java.lang.String r3 = r1.I
            r2.setText(r3)
        L_0x0d39:
            java.lang.String r2 = r1.J
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0d50
            ni.ob r11 = r1.H
            if (r11 != 0) goto L_0x0d49
            cm.l.v(r4)
            r11 = r9
        L_0x0d49:
            android.widget.TextView r2 = r11.f27856h
            java.lang.String r3 = r1.J
            r2.setText(r3)
        L_0x0d50:
            java.lang.String r2 = r1.K
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0da1
            java.util.HashMap r2 = r1.R
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0d62:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0da1
            java.lang.Object r3 = r2.next()
            java.lang.String r5 = "next(...)"
            cm.l.e(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r5 = r1.R
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r1.K
            boolean r3 = cm.l.a(r3, r6)
            if (r3 == 0) goto L_0x0d91
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0d8b
            cm.l.v(r4)
            r2 = r9
        L_0x0d8b:
            android.widget.TextView r2 = r2.Q
            r2.setText(r5)
            return
        L_0x0d91:
            ni.ob r11 = r1.H
            if (r11 != 0) goto L_0x0d99
            cm.l.v(r4)
            r11 = r9
        L_0x0d99:
            android.widget.TextView r3 = r11.Q
            java.lang.String r5 = r1.K
            r3.setText(r5)
            goto L_0x0d62
        L_0x0da1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplicationTransactionStatus.k2():void");
    }

    /* access modifiers changed from: private */
    public static final void l2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        vahanApplicationTransactionStatus.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void m2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        vahanApplicationTransactionStatus.B2();
    }

    /* access modifiers changed from: private */
    public static final void n2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        ob obVar = vahanApplicationTransactionStatus.H;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        obVar.f27872x.setVisibility(8);
        Dialog dialog = new Dialog(vahanApplicationTransactionStatus.G, 16973834);
        dialog.setContentView(R.layout.layout_download_documents);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.id_statusDocumentCancel);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById).setOnClickListener(new o0(dialog, vahanApplicationTransactionStatus));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void o2(Dialog dialog, VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        dialog.dismiss();
        ob obVar = vahanApplicationTransactionStatus.H;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        obVar.f27872x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void p2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, String str) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        vahanApplicationTransactionStatus.X1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void q2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, FeesModle feesModle) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        vahanApplicationTransactionStatus.X1().dismiss();
        try {
            vahanApplicationTransactionStatus.f20789h0 = String.valueOf(((FeesModleItem) feesModle.get(0)).getTotalAmount());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void r2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, String str) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        vahanApplicationTransactionStatus.X1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        try {
            if (vahanApplicationTransactionStatus.f20792k0) {
                vahanApplicationTransactionStatus.V2("Fee payment is pending, Kindly complete fee payment");
            } else if (!vahanApplicationTransactionStatus.f20784c0) {
                vahanApplicationTransactionStatus.X1().show();
                vahanApplicationTransactionStatus.i2().s(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.I);
            } else {
                Intent intent = new Intent(vahanApplicationTransactionStatus, VahanDmsReupload.class);
                intent.putExtra("state_code", vahanApplicationTransactionStatus.K);
                intent.putExtra(VContant.APP_NO, vahanApplicationTransactionStatus.I);
                intent.putExtra("rc_number", vahanApplicationTransactionStatus.L);
                intent.putExtra(VContant.PURPOSE_CODE, vahanApplicationTransactionStatus.Y.toString());
                vahanApplicationTransactionStatus.startActivity(intent);
                vahanApplicationTransactionStatus.finish();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void t2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        String str;
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        try {
            if (vahanApplicationTransactionStatus.f20792k0) {
                str = "Fee payment is pending, Kindly complete fee payment";
            } else if (!vahanApplicationTransactionStatus.f20783b0) {
                vahanApplicationTransactionStatus.f20790i0 = true;
                vahanApplicationTransactionStatus.X1().show();
                vahanApplicationTransactionStatus.i2().s(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.I);
                return;
            } else {
                str = "Document upload is pending, Kindly complete document upload";
            }
            vahanApplicationTransactionStatus.V2(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void u2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, View view) {
        String obj;
        BeforePaymentRequest beforePaymentRequest;
        bi.h i22;
        VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = vahanApplicationTransactionStatus;
        cm.l.f(vahanApplicationTransactionStatus2, "this$0");
        try {
            if (q.F(vahanApplicationTransactionStatus2.Y, ".0", false, 2, (Object) null)) {
                String str = vahanApplicationTransactionStatus2.Y;
                String substring = str.substring(0, str.length() - 2);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                obj = q.B0(substring).toString();
            } else {
                obj = q.B0(vahanApplicationTransactionStatus2.Y).toString();
            }
            vahanApplicationTransactionStatus2.O = obj;
            if (!vahanApplicationTransactionStatus2.f20792k0) {
                if (!q.F(vahanApplicationTransactionStatus2.f20787f0, "ONLINE TRANSACTION FAIL", false, 2, (Object) null)) {
                    vahanApplicationTransactionStatus.X1().show();
                    bi.b bVar = vahanApplicationTransactionStatus2.f20796o0;
                    if (bVar == null) {
                        cm.l.v("viewModelPayment");
                        bVar = null;
                    }
                    bVar.A(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus2.O, vahanApplicationTransactionStatus2.I, vahanApplicationTransactionStatus.W1(), vahanApplicationTransactionStatus2.K, vahanApplicationTransactionStatus2.L);
                    return;
                }
            }
            if (vahanApplicationTransactionStatus2.O.equals(VContant.Tax_PURPOSE_CODE)) {
                vahanApplicationTransactionStatus.X1().show();
                vahanApplicationTransactionStatus.h2().A0(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus2.L, vahanApplicationTransactionStatus2.K, vahanApplicationTransactionStatus2.O, vahanApplicationTransactionStatus2.f20799r0);
            } else if (!ka.c.f13158a.m(vahanApplicationTransactionStatus2.f20788g0)) {
                if (vahanApplicationTransactionStatus2.f20788g0.equals("Mobile")) {
                    vahanApplicationTransactionStatus.X1().show();
                    beforePaymentRequest = new BeforePaymentRequest((String) null, (Boolean) null, "M", vahanApplicationTransactionStatus2.I, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, vahanApplicationTransactionStatus.W1(), " ", " ", " ", vahanApplicationTransactionStatus2.O, "", " ", Double.valueOf(0.0d), 0, vahanApplicationTransactionStatus2.L, vahanApplicationTransactionStatus2.K, " ", " ", " ", 0, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null);
                    i22 = vahanApplicationTransactionStatus.i2();
                } else {
                    vahanApplicationTransactionStatus.X1().show();
                    beforePaymentRequest = new BeforePaymentRequest((String) null, (Boolean) null, "A", vahanApplicationTransactionStatus2.I, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, vahanApplicationTransactionStatus.W1(), " ", " ", " ", vahanApplicationTransactionStatus2.O, "", " ", Double.valueOf(0.0d), 0, vahanApplicationTransactionStatus2.L, vahanApplicationTransactionStatus2.K, " ", " ", " ", 0, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null);
                    i22 = vahanApplicationTransactionStatus.i2();
                }
                i22.v(vahanApplicationTransactionStatus2, beforePaymentRequest);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void v2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        boolean z10;
        boolean z11;
        VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = vahanApplicationTransactionStatus;
        cm.l.f(vahanApplicationTransactionStatus2, "this$0");
        vahanApplicationTransactionStatus.X1().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl != null && returnUrl.length() != 0) {
            try {
                String str = vahanApplicationTransactionStatus2.I;
                String valueOf = String.valueOf(vahanApplicationTransactionStatus.V1().getRc_off_cd());
                String str2 = vahanApplicationTransactionStatus2.O;
                Double valueOf2 = Double.valueOf(0.0d);
                String str3 = vahanApplicationTransactionStatus2.L;
                String str4 = vahanApplicationTransactionStatus2.K;
                String rc_vh_class_cd = vahanApplicationTransactionStatus.V1().getRc_vh_class_cd();
                vahanApplicationTransactionStatus2.O2(new BeforePaymentRequest((String) null, (Boolean) null, "", str, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, valueOf, " ", " ", " ", str2, " ", " ", valueOf2, 0, str3, str4, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null));
                boolean equals = vahanApplicationTransactionStatus2.f20789h0.equals("0");
                String str5 = VContant.NEXGEN_addahar_name;
                String str6 = VContant.NEXGEN_addahar_address;
                if (!equals) {
                    String str7 = str5;
                    if (vahanApplicationTransactionStatus2.f20789h0.equals("0.0")) {
                        str5 = str7;
                    } else {
                        Intent intent = new Intent(vahanApplicationTransactionStatus2, VahanPayment.class);
                        intent.putExtra(VContant.NEXGEN_INTENT_CODE, vahanApplicationTransactionStatus.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
                        if (vahanApplicationTransactionStatus2.f20788g0.equals("Mobile")) {
                            intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                            z11 = true;
                        } else {
                            z11 = true;
                            intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                        }
                        if (!p.o(vahanApplicationTransactionStatus.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, z11)) {
                            if (!p.o(vahanApplicationTransactionStatus.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, z11)) {
                                intent.putExtra(VContant.APP_NO, vahanApplicationTransactionStatus2.I);
                            }
                        }
                        intent.putExtra("state_code", vahanApplicationTransactionStatus2.K);
                        intent.putExtra("rc_number", vahanApplicationTransactionStatus2.L);
                        intent.putExtra(VContant.PURPOSE_CODE, vahanApplicationTransactionStatus2.O);
                        intent.putExtra("URL", paymentBeforeUrlResponse.getReturnUrl());
                        intent.putExtra(VContant.FINAL_SUBMIT, vahanApplicationTransactionStatus.a2());
                        intent.putExtra("RC", vahanApplicationTransactionStatus2.L);
                        intent.putExtra("RcDetails", vahanApplicationTransactionStatus.V1());
                        intent.putExtra(str7, " ");
                        intent.putExtra(str6, " ");
                        vahanApplicationTransactionStatus2.startActivity(intent);
                        vahanApplicationTransactionStatus.finish();
                    }
                }
                String str8 = str5;
                Intent intent2 = new Intent(vahanApplicationTransactionStatus2, VahanPaymentStatusScreen.class);
                intent2.putExtra(VContant.NEXGEN_INTENT_CODE, vahanApplicationTransactionStatus.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
                if (vahanApplicationTransactionStatus2.f20788g0.equals("Mobile")) {
                    intent2.putExtra(VContant.NEXGEN_isFACELESS, false);
                    z10 = true;
                } else {
                    z10 = true;
                    intent2.putExtra(VContant.NEXGEN_isFACELESS, true);
                }
                if (!p.o(vahanApplicationTransactionStatus.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, z10)) {
                    if (!p.o(vahanApplicationTransactionStatus.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, z10)) {
                        intent2.putExtra(VContant.APP_NO, vahanApplicationTransactionStatus2.I);
                    }
                }
                intent2.putExtra("state_code", vahanApplicationTransactionStatus2.K);
                intent2.putExtra("rc_number", vahanApplicationTransactionStatus2.L);
                intent2.putExtra(VContant.PURPOSE_CODE, vahanApplicationTransactionStatus2.O);
                intent2.putExtra("EncString", paymentBeforeUrlResponse.getReturnUrl());
                intent2.putExtra(VContant.FINAL_SUBMIT, vahanApplicationTransactionStatus.a2());
                intent2.putExtra("RC", vahanApplicationTransactionStatus2.L);
                intent2.putExtra("RcDetails", vahanApplicationTransactionStatus.V1());
                intent2.putExtra(str8, " ");
                intent2.putExtra(str6, " ");
                vahanApplicationTransactionStatus2.startActivity(intent2);
                vahanApplicationTransactionStatus.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void w2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, String str) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        vahanApplicationTransactionStatus.X1().dismiss();
        if (str.equals("Error")) {
            vahanApplicationTransactionStatus.Y2(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.getString(R.string.service_unavable_please_try));
            return;
        }
        cm.l.c(str);
        if (q.F(str, "re-verify", false, 2, (Object) null)) {
            vahanApplicationTransactionStatus.F2(str, vahanApplicationTransactionStatus);
        } else {
            vahanApplicationTransactionStatus.a3(vahanApplicationTransactionStatus, str);
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, RequireDataForBePaymet requireDataForBePaymet) {
        String str;
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        if (requireDataForBePaymet != null) {
            vahanApplicationTransactionStatus.X = requireDataForBePaymet;
            if (q.F(vahanApplicationTransactionStatus.Y, ".0", false, 2, (Object) null)) {
                String str2 = vahanApplicationTransactionStatus.Y;
                str = str2.substring(0, str2.length() - 2);
                cm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = vahanApplicationTransactionStatus.Y;
            }
            vahanApplicationTransactionStatus.O = q.B0(str).toString();
            vahanApplicationTransactionStatus.h2().A0(vahanApplicationTransactionStatus, requireDataForBePaymet.getRegn_no(), requireDataForBePaymet.getState_cd(), vahanApplicationTransactionStatus.O, vahanApplicationTransactionStatus.f20799r0);
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, String str) {
        cm.l.f(vahanApplicationTransactionStatus, "this$0");
        vahanApplicationTransactionStatus.X1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z2(VahanApplicationTransactionStatus vahanApplicationTransactionStatus, RequireDataForBePaymet requireDataForBePaymet) {
        VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = vahanApplicationTransactionStatus;
        RequireDataForBePaymet requireDataForBePaymet2 = requireDataForBePaymet;
        cm.l.f(vahanApplicationTransactionStatus2, "this$0");
        vahanApplicationTransactionStatus.X1().dismiss();
        if (requireDataForBePaymet2 != null) {
            try {
                vahanApplicationTransactionStatus2.X = requireDataForBePaymet2;
                vahanApplicationTransactionStatus2.f20789h0 = String.valueOf(requireDataForBePaymet.getRcpt_amt());
                String str = vahanApplicationTransactionStatus2.I;
                String valueOf = String.valueOf(requireDataForBePaymet.getOff_cd());
                String str2 = vahanApplicationTransactionStatus2.O;
                RequireDataForBePaymet requireDataForBePaymet3 = vahanApplicationTransactionStatus2.X;
                String valueOf2 = String.valueOf(requireDataForBePaymet3 != null ? requireDataForBePaymet3.getRcpt_dt() : null);
                RequireDataForBePaymet requireDataForBePaymet4 = vahanApplicationTransactionStatus2.X;
                String valueOf3 = String.valueOf(requireDataForBePaymet4 != null ? requireDataForBePaymet4.getReturn_rcpt_no() : null);
                RequireDataForBePaymet requireDataForBePaymet5 = vahanApplicationTransactionStatus2.X;
                Integer valueOf4 = requireDataForBePaymet5 != null ? Integer.valueOf(requireDataForBePaymet5.getRcpt_amt()) : null;
                cm.l.c(valueOf4);
                Double valueOf5 = Double.valueOf((double) valueOf4.intValue());
                String regn_no = requireDataForBePaymet.getRegn_no();
                RequireDataForBePaymet requireDataForBePaymet6 = vahanApplicationTransactionStatus2.X;
                String valueOf6 = String.valueOf(requireDataForBePaymet6 != null ? requireDataForBePaymet6.getState_cd() : null);
                String rc_vh_class_cd = vahanApplicationTransactionStatus.V1().getRc_vh_class_cd();
                vahanApplicationTransactionStatus2.O2(new BeforePaymentRequest((String) null, (Boolean) null, "", str, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, valueOf, " ", " ", " ", str2, valueOf2, valueOf3, valueOf5, 0, regn_no, valueOf6, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null));
            } catch (Exception unused) {
            }
        }
    }

    public final void I2(String str) {
        cm.l.f(str, "rc_chasi_no");
        HashMap hashMap = new HashMap();
        hashMap.put(VContant.PAY_TAX, VContant.PAY_TAX_CODE);
        setIntent(new Intent(this, PayTaxActivity.class));
        getIntent().putExtra("RC", this.L);
        getIntent().putExtra("State", this.K);
        getIntent().putExtra("map", hashMap);
        getIntent().putExtra("off_code", W1());
        Intent intent = getIntent();
        String substring = str.substring(str.toString().length() - 5);
        cm.l.e(substring, "this as java.lang.String).substring(startIndex)");
        intent.putExtra("chassis_no", substring);
        getIntent().putExtra(VContant.NEXGEN_isFACELESS, false);
        getIntent().putExtra(VContant.NEXGEN_addahar_name, "NA");
        getIntent().putExtra(VContant.NEXGEN_addahar_address, "NA");
        startActivity(getIntent());
        finish();
    }

    public final void J2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.N = nrvDetails;
    }

    public final void K2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20795n0 = str;
    }

    public final void L2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.U = progressDialog;
    }

    public final void M2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void N2(boolean z10) {
        this.f20791j0 = z10;
    }

    public final void O2(BeforePaymentRequest beforePaymentRequest) {
        cm.l.f(beforePaymentRequest, "<set-?>");
        this.f20798q0 = beforePaymentRequest;
    }

    public final void P2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.W = vahanProService;
    }

    public final void Q1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new i0(dialog, context));
        textView2.setOnClickListener(new t0(dialog));
        dialog.show();
    }

    public final void Q2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.f20782a0 = vahanServiceConnection;
    }

    public final void R2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f20785d0 = vahanProService;
    }

    public final void S2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f20786e0 = hVar;
    }

    public final String T1() {
        return this.f20799r0;
    }

    public final void T2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.V = hVar;
    }

    public final boolean U1() {
        return this.S;
    }

    public final void U2(bi.l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.Z = lVar;
    }

    public final NrvDetails V1() {
        NrvDetails nrvDetails = this.N;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
        return null;
    }

    public final String W1() {
        String str = this.f20795n0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog X1() {
        ProgressDialog progressDialog = this.U;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String Y1() {
        return this.O;
    }

    public final void Y2(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new z0(dialog, this));
        dialog.show();
    }

    public final boolean Z1() {
        return this.f20791j0;
    }

    public final BeforePaymentRequest a2() {
        BeforePaymentRequest beforePaymentRequest = this.f20798q0;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        cm.l.v("paymentRequest");
        return null;
    }

    public final void a3(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new y0(dialog));
        dialog.show();
    }

    public final String b2() {
        return this.Y;
    }

    public final RequireDataForBePaymet c2() {
        return this.X;
    }

    public final VahanProService d2() {
        VahanProService vahanProService = this.W;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanServiceConnection e2() {
        VahanServiceConnection vahanServiceConnection = this.f20782a0;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService1");
        return null;
    }

    public final boolean f2() {
        return this.f20790i0;
    }

    public final VahanProService g2() {
        VahanProService vahanProService = this.f20785d0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("slotService");
        return null;
    }

    public final bi.h h2() {
        bi.h hVar = this.f20786e0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("slotViewModel");
        return null;
    }

    public final bi.h i2() {
        bi.h hVar = this.V;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final bi.l j2() {
        bi.l lVar = this.Z;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel1");
        return null;
    }

    public void onBackPressed() {
        Q1(this, new ld.c(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout_aplication_transaction_status);
        ob c10 = ob.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.H = c10;
        bi.b bVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        VahanProService.a aVar = VahanProService.f21196b;
        R2(aVar.b(this));
        this.Q = ApplicationServiceOtp.f21184a.b(this);
        this.f20797p0 = ApplicationService.f21181a.b(this);
        Class<bi.h> cls = bi.h.class;
        S2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(g2()))).a(cls));
        ApplicationService applicationService = this.f20797p0;
        if (applicationService == null) {
            cm.l.v("paymentService");
            applicationService = null;
        }
        this.f20796o0 = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        L2(new ProgressDialog(this));
        X1().setMessage("Please wait...");
        X1().setCancelable(false);
        X1().setCanceledOnTouchOutside(false);
        P2(aVar.b(this));
        Q2(VahanServiceConnection.f21199a.b(this));
        U2((bi.l) new u0((x0) this, (u0.b) new bi.m(new wg.e(e2()))).a(bi.l.class));
        T2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(d2()))).a(cls));
        e.a aVar2 = v9.e.f17509a;
        ob obVar = this.H;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        aVar2.Z1(this, obVar);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("applicationNo");
            cm.l.c(stringExtra);
            this.I = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("ownerName");
            cm.l.c(stringExtra2);
            this.J = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("stateCd");
            cm.l.c(stringExtra3);
            this.K = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("regNo");
            cm.l.c(stringExtra4);
            this.L = stringExtra4;
            Type type = new VahanApplicationTransactionStatus$onCreate$type$1().getType();
            cm.l.e(type, "getType(...)");
            Object k10 = new i7.d().k(getIntent().getStringExtra("transList"), type);
            cm.l.d(k10, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel> }");
            this.P = (ArrayList) k10;
        }
        if (!ka.c.f13158a.m(((ApplStatusTransListModel) this.P.get(0)).getCurrentlist().get(0).getChassisNo())) {
            String chassisNo = ((ApplStatusTransListModel) this.P.get(0)).getCurrentlist().get(0).getChassisNo();
            this.f20800s0 = chassisNo;
            cm.l.c(chassisNo);
            String str = this.f20800s0;
            Integer valueOf = str != null ? Integer.valueOf(str.length()) : null;
            cm.l.c(valueOf);
            String str2 = this.f20800s0;
            cm.l.c(str2);
            String substring = chassisNo.substring(valueOf.intValue() - 5, str2.length());
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.f20799r0 = substring;
        }
        P1();
        k2();
        bi.b bVar2 = this.f20796o0;
        if (bVar2 == null) {
            cm.l.v("viewModelPayment");
            bVar2 = null;
        }
        bVar2.z().g(this, new l(new e(this)));
        bi.b bVar3 = this.f20796o0;
        if (bVar3 == null) {
            cm.l.v("viewModelPayment");
            bVar3 = null;
        }
        bVar3.y().g(this, new l(new f(this)));
        ob obVar2 = this.H;
        if (obVar2 == null) {
            cm.l.v("binding");
            obVar2 = null;
        }
        obVar2.f27872x.setOnClickListener(new a1(this));
        ob obVar3 = this.H;
        if (obVar3 == null) {
            cm.l.v("binding");
            obVar3 = null;
        }
        obVar3.Z.setOnClickListener(new d1(this));
        ob obVar4 = this.H;
        if (obVar4 == null) {
            cm.l.v("binding");
            obVar4 = null;
        }
        obVar4.L.setOnClickListener(new e1(this));
        ob obVar5 = this.H;
        if (obVar5 == null) {
            cm.l.v("binding");
            obVar5 = null;
        }
        obVar5.f27865q.setOnClickListener(new f1(this));
        i2().y0().g(this, new g1(this));
        i2().z0().g(this, new h1(this));
        bi.b bVar4 = this.f20796o0;
        if (bVar4 == null) {
            cm.l.v("viewModelPayment");
            bVar4 = null;
        }
        bVar4.C().g(this, new l(new g(this)));
        h2().C0().g(this, new l(new a(this)));
        bi.b bVar5 = this.f20796o0;
        if (bVar5 == null) {
            cm.l.v("viewModelPayment");
        } else {
            bVar = bVar5;
        }
        bVar.B().g(this, new l(new b(this)));
        i2().T().g(this, new j0(this));
        i2().W().g(this, new k0(this));
        i2().U().g(this, new l0(this));
        i2().V().g(this, new m0(this));
        i2().E0().g(this, new l(new c(this)));
        j2().k().g(this, new l(new d(this)));
        i2().O().g(this, new b1(this));
        i2().P().g(this, new c1(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        h2().D0().g(this, new l(new h(this)));
        j2().k().g(this, new l(new i(this)));
        h2().T0().g(this, new l(new j(this)));
        h2().S0().g(this, new l(new k(this)));
        h2().F0().g(this, new n0(this));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }
}
