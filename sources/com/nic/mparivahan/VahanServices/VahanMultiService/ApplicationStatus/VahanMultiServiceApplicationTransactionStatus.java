package com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus;

import android.app.Activity;
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
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment;
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
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.Feelist;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.Fees;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiBeforePaymentResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanMultiServicePayment;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload;
import com.nic.mparivahan.VahanServices.VahanViewModel.PendingTransTaxBreakUpModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.VahanPendingTransBankModel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ni.ob;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;
import v9.e;

public final class VahanMultiServiceApplicationTransactionStatus extends androidx.appcompat.app.d {
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
    public VahanServiceConnection f20980a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f20981b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f20982c0;

    /* renamed from: d0  reason: collision with root package name */
    public VahanProService f20983d0;

    /* renamed from: e0  reason: collision with root package name */
    public bi.h f20984e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f20985f0 = " ";

    /* renamed from: g0  reason: collision with root package name */
    private String f20986g0 = "M";

    /* renamed from: h0  reason: collision with root package name */
    public String f20987h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f20988i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f20989j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f20990k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f20991l0 = true;

    /* renamed from: m0  reason: collision with root package name */
    public String f20992m0;
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public bi.b f20993n0;

    /* renamed from: o0  reason: collision with root package name */
    private ApplicationService f20994o0;

    /* renamed from: p0  reason: collision with root package name */
    public BeforePaymentRequest f20995p0;

    /* renamed from: q0  reason: collision with root package name */
    private MultiServiceBeforePaymentRequest f20996q0;

    /* renamed from: r0  reason: collision with root package name */
    public MultiSelectionViewModel f20997r0;

    /* renamed from: s0  reason: collision with root package name */
    public MultiService f20998s0;

    /* renamed from: t0  reason: collision with root package name */
    private ArrayList f20999t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    private String f21000u0 = " ";

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21001e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21001e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(String str) {
            if (this.f21001e.a2().isShowing()) {
                this.f21001e.a2().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21002e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21002e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(String str) {
            if (this.f21002e.a2().isShowing()) {
                this.f21002e.a2().dismiss();
            }
            if (!str.equals("Error")) {
                this.f21002e.c3(str);
            } else {
                this.f21002e.c3("Not able to verify payment from bank. Please try again later");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21003e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21003e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = this.f21003e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanMultiServiceApplicationTransactionStatus.O2(companion.c(ownerDetailPuccPermit));
                        if (!ka.c.f13158a.m(String.valueOf(this.f21003e.Y1().getRc_off_cd()))) {
                            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = this.f21003e;
                            vahanMultiServiceApplicationTransactionStatus2.P2(String.valueOf(vahanMultiServiceApplicationTransactionStatus2.Y1().getRc_off_cd()));
                        }
                        bi.h k22 = this.f21003e.k2();
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus3 = this.f21003e;
                        k22.j1(vahanMultiServiceApplicationTransactionStatus3, vahanMultiServiceApplicationTransactionStatus3.L, q.B0(this.f21003e.K).toString(), q.B0(this.f21003e.d2().toString()).toString());
                        return;
                    }
                }
                this.f21003e.a2().dismiss();
            } catch (Exception e10) {
                this.f21003e.a2().dismiss();
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
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21004e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21004e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(String str) {
            this.f21004e.a2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21005e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21005e = vahanMultiServiceApplicationTransactionStatus;
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
                bi.b K1 = this.f21005e.f20993n0;
                if (K1 == null) {
                    cm.l.v("viewModelPayment");
                    K1 = null;
                }
                K1.F(this.f21005e, jSONObject);
            } catch (Exception e10) {
                if (this.f21005e.a2().isShowing()) {
                    this.f21005e.a2().dismiss();
                }
                this.f21005e.c3("Unable to proceed further, Please try after sometime");
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
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21006e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21006e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(String str) {
            if (this.f21006e.a2().isShowing()) {
                this.f21006e.a2().dismiss();
            }
            if (!str.equals("Error")) {
                this.f21006e.c3(str);
            } else {
                this.f21006e.c3("Unable to proceed further, Please try after sometime");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21007e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21007e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(VahanPendingTransBankModel vahanPendingTransBankModel) {
            String d22;
            this.f21007e.M = vahanPendingTransBankModel.getReturnUrl();
            if (q.F(this.f21007e.d2(), ".0", false, 2, (Object) null)) {
                d22 = this.f21007e.d2().substring(0, this.f21007e.d2().length() - 2);
                cm.l.e(d22, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                d22 = this.f21007e.d2();
            }
            String obj = q.B0(d22).toString();
            this.f21007e.S2(true);
            bi.h j22 = this.f21007e.j2();
            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = this.f21007e;
            j22.A0(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.L, this.f21007e.K, obj, this.f21007e.U1());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanPendingTransBankModel) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21008e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21008e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            boolean z10;
            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus;
            String obj;
            String str;
            OwnerDetailPuccPermit ownerDetailPuccPermit2 = ownerDetailPuccPermit;
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = this.f21008e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanMultiServiceApplicationTransactionStatus2.O2(companion.c(ownerDetailPuccPermit2));
                        if (this.f21008e.b2().equals(VContant.Tax_PURPOSE_CODE)) {
                            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus3 = this.f21008e;
                            vahanMultiServiceApplicationTransactionStatus3.L2(String.valueOf(vahanMultiServiceApplicationTransactionStatus3.Y1().getRc_chasi_no()));
                            return;
                        }
                        String str2 = "";
                        if (this.f21008e.c2()) {
                            String str3 = VContant.NEXGEN_addahar_address;
                            Integer num = null;
                            if (q.F(this.f21008e.d2(), ".0", false, 2, (Object) null)) {
                                vahanMultiServiceApplicationTransactionStatus = this.f21008e;
                                z10 = false;
                                String substring = vahanMultiServiceApplicationTransactionStatus.d2().substring(0, this.f21008e.d2().length() - 2);
                                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                obj = q.B0(substring).toString();
                            } else {
                                z10 = false;
                                vahanMultiServiceApplicationTransactionStatus = this.f21008e;
                                obj = q.B0(vahanMultiServiceApplicationTransactionStatus.d2()).toString();
                            }
                            vahanMultiServiceApplicationTransactionStatus.R2(obj);
                            try {
                                String regn_no2 = ownerDetailPuccPermit.getRegn_no();
                                if (regn_no2 != null) {
                                    if (regn_no2.length() != 0) {
                                        boolean z11 = z10;
                                        this.f21008e.O2(companion.c(ownerDetailPuccPermit));
                                        String G1 = this.f21008e.I;
                                        String valueOf = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                                        String d22 = this.f21008e.d2();
                                        Double valueOf2 = Double.valueOf(0.0d);
                                        String regn_no3 = ownerDetailPuccPermit.getRegn_no();
                                        String J1 = this.f21008e.K;
                                        String rc_vh_class_cd = this.f21008e.Y1().getRc_vh_class_cd();
                                        if (rc_vh_class_cd != null) {
                                            num = Integer.valueOf(Integer.parseInt(rc_vh_class_cd));
                                        }
                                        BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest((String) null, (Boolean) null, "", G1, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, valueOf, " ", " ", " ", d22, "", "", valueOf2, 0, regn_no3, J1, " ", " ", " ", num, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null);
                                        Intent intent = new Intent(this.f21008e, VahanPendingTransactionPayment.class);
                                        String str4 = str2;
                                        intent.putExtra(VContant.NEXGEN_INTENT_CODE, str4);
                                        intent.putExtra(VContant.NEXGEN_isFACELESS, z11);
                                        intent.putExtra(VContant.APP_NO, this.f21008e.I);
                                        intent.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                                        intent.putExtra("rc_number", ownerDetailPuccPermit.getRegn_no());
                                        intent.putExtra(VContant.PURPOSE_CODE, this.f21008e.b2());
                                        intent.putExtra("URL", this.f21008e.M);
                                        intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
                                        intent.putExtra("RC", ownerDetailPuccPermit.getRegn_no());
                                        intent.putExtra("RcDetails", this.f21008e.Y1());
                                        intent.putExtra(VContant.NEXGEN_addahar_name, str4);
                                        intent.putExtra(str3, str4);
                                        this.f21008e.startActivity(intent);
                                        this.f21008e.finish();
                                        return;
                                    }
                                }
                                VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus4 = this.f21008e;
                                vahanMultiServiceApplicationTransactionStatus4.c3(vahanMultiServiceApplicationTransactionStatus4.getString(R.string.service_unavable_please_try));
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                if (this.f21008e.a2().isShowing()) {
                                    this.f21008e.a2().dismiss();
                                }
                                VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus5 = this.f21008e;
                                vahanMultiServiceApplicationTransactionStatus5.c3(vahanMultiServiceApplicationTransactionStatus5.getString(R.string.service_unavable_please_try));
                                return;
                            }
                        } else if (this.f21008e.h2()) {
                            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus6 = this.f21008e;
                            vahanMultiServiceApplicationTransactionStatus6.O1(vahanMultiServiceApplicationTransactionStatus6.I);
                            return;
                        } else {
                            MultiServiceDto multiServiceDto = new MultiServiceDto((ArrayList<ArrayList<Fees>>) null, companion.j(this.f21008e.W1()), this.f21008e.L, this.f21008e.K, 0);
                            if (p.o(this.f21008e.T1(), "Mobile", true)) {
                                VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus7 = this.f21008e;
                                String G12 = vahanMultiServiceApplicationTransactionStatus7.I;
                                str = VContant.NEXGEN_addahar_address;
                                int parseInt = Integer.parseInt(this.f21008e.Z1());
                                String m10 = v9.d.f17494a.m();
                                ArrayList j10 = companion.j(this.f21008e.W1());
                                int parseInt2 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
                                RequireDataForBePaymet e22 = this.f21008e.e2();
                                String valueOf3 = String.valueOf(e22 != null ? e22.getRcpt_dt() : null);
                                RequireDataForBePaymet e23 = this.f21008e.e2();
                                String valueOf4 = String.valueOf(e23 != null ? e23.getReturn_rcpt_no() : null);
                                RequireDataForBePaymet e24 = this.f21008e.e2();
                                Integer valueOf5 = e24 != null ? Integer.valueOf(e24.getRcpt_amt()) : null;
                                cm.l.c(valueOf5);
                                vahanMultiServiceApplicationTransactionStatus7.N2(new MultiServiceBeforePaymentRequest(" ", "M", G12, true, (ChanngeOfAdressDto) null, " ", 22, (Durcdto) null, (List<Feelist>) null, "", "", false, (HpaDto) null, (HptDto) null, 0, "", 1, "", false, "", multiServiceDto, false, parseInt, m10, "", "", j10, parseInt2, valueOf3, valueOf4, valueOf5.intValue(), 0, this.f21008e.L, 0, this.f21008e.K, "", "", "L", (TransferOwnershipDto) null, 1));
                            } else {
                                str = VContant.NEXGEN_addahar_address;
                                VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus8 = this.f21008e;
                                String G13 = vahanMultiServiceApplicationTransactionStatus8.I;
                                int parseInt3 = Integer.parseInt(this.f21008e.Z1());
                                String m11 = v9.d.f17494a.m();
                                ArrayList j11 = companion.j(this.f21008e.W1());
                                int parseInt4 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
                                RequireDataForBePaymet e25 = this.f21008e.e2();
                                String valueOf6 = String.valueOf(e25 != null ? e25.getRcpt_dt() : null);
                                RequireDataForBePaymet e26 = this.f21008e.e2();
                                String valueOf7 = String.valueOf(e26 != null ? e26.getReturn_rcpt_no() : null);
                                RequireDataForBePaymet e27 = this.f21008e.e2();
                                Integer valueOf8 = e27 != null ? Integer.valueOf(e27.getRcpt_amt()) : null;
                                cm.l.c(valueOf8);
                                vahanMultiServiceApplicationTransactionStatus8.N2(new MultiServiceBeforePaymentRequest(" ", "A", G13, true, (ChanngeOfAdressDto) null, " ", 22, (Durcdto) null, (List<Feelist>) null, "", "", false, (HpaDto) null, (HptDto) null, 0, "", 1, "", false, "", multiServiceDto, false, parseInt3, m11, "", "", j11, parseInt4, valueOf6, valueOf7, valueOf8.intValue(), 0, this.f21008e.L, 0, this.f21008e.K, "", "", "L", (TransferOwnershipDto) null, 1));
                            }
                            Intent intent2 = new Intent(this.f21008e, VahanMultiDmsAPI.class);
                            intent2.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                            intent2.putExtra(VContant.APP_NO, this.f21008e.I);
                            intent2.putExtra("rc_number", this.f21008e.L);
                            intent2.putExtra(VContant.PURPOSE_CODE, this.f21008e.b2().toString());
                            intent2.putExtra("off_code", String.valueOf(ownerDetailPuccPermit.getOff_cd()));
                            intent2.putExtra(VContant.FINAL_SUBMIT, this.f21008e.X1());
                            if (this.f21008e.T1().equals("Mobile")) {
                                intent2.putExtra(VContant.NEXGEN_isFACELESS, false);
                            } else {
                                intent2.putExtra(VContant.NEXGEN_isFACELESS, true);
                            }
                            intent2.putExtra("RC", this.f21008e.L);
                            intent2.putExtra("RcDetails", this.f21008e.Y1());
                            RequireDataForBePaymet e28 = this.f21008e.e2();
                            intent2.putExtra("vahlogReptDate", String.valueOf(e28 != null ? e28.getRcpt_dt() : null));
                            RequireDataForBePaymet e29 = this.f21008e.e2();
                            cm.l.c(e29);
                            intent2.putExtra("vahlogFeeAmt", (double) e29.getRcpt_amt());
                            RequireDataForBePaymet e210 = this.f21008e.e2();
                            cm.l.c(e210);
                            intent2.putExtra("vahlogReptNo", e210.getReturn_rcpt_no());
                            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
                            intent2.putExtra(str, "NA");
                            intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this.f21008e.W1());
                            this.f21008e.startActivity(intent2);
                            this.f21008e.finish();
                            return;
                        }
                    }
                }
                this.f21008e.a2().dismiss();
            } catch (Exception e11) {
                this.f21008e.a2().dismiss();
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
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21009e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21009e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(String str) {
            this.f21009e.a2().dismiss();
            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = this.f21009e;
            vahanMultiServiceApplicationTransactionStatus.f3(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21010e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21010e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f21010e.a2().isShowing()) {
                    this.f21010e.a2().dismiss();
                }
                Intent intent = new Intent(this.f21010e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f21010e.b2());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", this.f21010e.L);
                intent.putExtra("RcDetails", this.f21010e.Y1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                this.f21010e.startActivity(intent);
                this.f21010e.finish();
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
        final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21011e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
            super(1);
            this.f21011e = vahanMultiServiceApplicationTransactionStatus;
        }

        public final void b(String str) {
            try {
                if (this.f21011e.a2().isShowing()) {
                    this.f21011e.a2().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = this.f21011e;
                    Toast.makeText(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null) {
                    if (!p.q(str)) {
                        this.f21011e.F2(str);
                        return;
                    }
                }
                VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = this.f21011e;
                vahanMultiServiceApplicationTransactionStatus2.F2(vahanMultiServiceApplicationTransactionStatus2.getString(R.string.service_unavable_please_try));
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
        private final /* synthetic */ bm.l f21012a;

        l(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21012a = lVar;
        }

        public final pl.c a() {
            return this.f21012a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21012a.invoke(obj);
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
    public static final void A2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, RequireDataForBePaymet requireDataForBePaymet) {
        String str;
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        if (requireDataForBePaymet != null) {
            vahanMultiServiceApplicationTransactionStatus.X = requireDataForBePaymet;
            if (q.F(vahanMultiServiceApplicationTransactionStatus.Y, ".0", false, 2, (Object) null)) {
                String str2 = vahanMultiServiceApplicationTransactionStatus.Y;
                str = str2.substring(0, str2.length() - 2);
                cm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = vahanMultiServiceApplicationTransactionStatus.Y;
            }
            vahanMultiServiceApplicationTransactionStatus.O = q.B0(str).toString();
            vahanMultiServiceApplicationTransactionStatus.j2().A0(vahanMultiServiceApplicationTransactionStatus, requireDataForBePaymet.getRegn_no(), requireDataForBePaymet.getState_cd(), vahanMultiServiceApplicationTransactionStatus.O, vahanMultiServiceApplicationTransactionStatus.f21000u0);
        }
    }

    /* access modifiers changed from: private */
    public static final void B2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, String str) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void C2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, RequireDataForBePaymet requireDataForBePaymet) {
        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = vahanMultiServiceApplicationTransactionStatus;
        RequireDataForBePaymet requireDataForBePaymet2 = requireDataForBePaymet;
        cm.l.f(vahanMultiServiceApplicationTransactionStatus2, "this$0");
        vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
        if (requireDataForBePaymet2 != null) {
            try {
                vahanMultiServiceApplicationTransactionStatus2.X = requireDataForBePaymet2;
                vahanMultiServiceApplicationTransactionStatus2.Y2(String.valueOf(requireDataForBePaymet.getRcpt_amt()));
                String str = vahanMultiServiceApplicationTransactionStatus2.I;
                String valueOf = String.valueOf(requireDataForBePaymet.getOff_cd());
                String str2 = vahanMultiServiceApplicationTransactionStatus2.O;
                RequireDataForBePaymet requireDataForBePaymet3 = vahanMultiServiceApplicationTransactionStatus2.X;
                String valueOf2 = String.valueOf(requireDataForBePaymet3 != null ? requireDataForBePaymet3.getRcpt_dt() : null);
                RequireDataForBePaymet requireDataForBePaymet4 = vahanMultiServiceApplicationTransactionStatus2.X;
                String valueOf3 = String.valueOf(requireDataForBePaymet4 != null ? requireDataForBePaymet4.getReturn_rcpt_no() : null);
                RequireDataForBePaymet requireDataForBePaymet5 = vahanMultiServiceApplicationTransactionStatus2.X;
                Integer valueOf4 = requireDataForBePaymet5 != null ? Integer.valueOf(requireDataForBePaymet5.getRcpt_amt()) : null;
                cm.l.c(valueOf4);
                Double valueOf5 = Double.valueOf((double) valueOf4.intValue());
                String regn_no = requireDataForBePaymet.getRegn_no();
                RequireDataForBePaymet requireDataForBePaymet6 = vahanMultiServiceApplicationTransactionStatus2.X;
                String valueOf6 = String.valueOf(requireDataForBePaymet6 != null ? requireDataForBePaymet6.getState_cd() : null);
                String rc_vh_class_cd = vahanMultiServiceApplicationTransactionStatus.Y1().getRc_vh_class_cd();
                vahanMultiServiceApplicationTransactionStatus2.T2(new BeforePaymentRequest((String) null, (Boolean) null, "", str, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, " ", " ", (NocDraftResponse) null, valueOf, " ", " ", " ", str2, valueOf2, valueOf3, valueOf5, 0, regn_no, valueOf6, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null));
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void D2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, String str) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        if (vahanMultiServiceApplicationTransactionStatus.a2().isShowing()) {
            vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
        }
    }

    private final void E2() {
        finish();
    }

    /* access modifiers changed from: private */
    public final void F2(String str) {
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
        textView.setOnClickListener(new j(dialog));
        textView2.setOnClickListener(new k(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void G2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void H2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void I2(String str, Context context) {
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
        textView.setOnClickListener(new g(dialog, this));
        textView2.setOnClickListener(new h(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void J2(Dialog dialog, VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        dialog.dismiss();
        try {
            vahanMultiServiceApplicationTransactionStatus.a2().show();
            bi.b bVar = vahanMultiServiceApplicationTransactionStatus.f20993n0;
            if (bVar == null) {
                cm.l.v("viewModelPayment");
                bVar = null;
            }
            bVar.A(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.O, vahanMultiServiceApplicationTransactionStatus.I, vahanMultiServiceApplicationTransactionStatus.Z1(), vahanMultiServiceApplicationTransactionStatus.K, vahanMultiServiceApplicationTransactionStatus.L);
        } catch (Exception unused) {
            vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void K2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void O1(String str) {
        try {
            j2().l(this, str);
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
    public final void c3(String str) {
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
        textView.setOnClickListener(new n(dialog));
        textView2.setOnClickListener(new o(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void d3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void e3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void g3(Dialog dialog, VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        dialog.dismiss();
        vahanMultiServiceApplicationTransactionStatus.finish();
    }

    /* access modifiers changed from: private */
    public static final void i3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: ld.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x0c62 A[SYNTHETIC, Splitter:B:604:0x0c62] */
    /* JADX WARNING: Removed duplicated region for block: B:613:0x0c75 A[SYNTHETIC, Splitter:B:613:0x0c75] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0294  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void n2() {
        /*
            r28 = this;
            r1 = r28
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
            com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.q r7 = new com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.q
            r7.<init>(r1)
            r3.setOnClickListener(r7)
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x0034
            cm.l.v(r4)
            r3 = 0
        L_0x0034:
            ni.qd r3 = r3.f27859k
            android.widget.RelativeLayout r3 = r3.f28306g
            com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.r r7 = new com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.r
            r7.<init>(r1)
            r3.setOnClickListener(r7)
            java.util.ArrayList r3 = r1.P
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0cf7
            java.util.ArrayList r3 = r1.P
            int r3 = r3.size()
            r7 = 0
            java.lang.String r8 = ""
            r9 = r7
        L_0x0052:
            if (r9 >= r3) goto L_0x0cce
            java.util.ArrayList r10 = r1.P
            java.lang.Object r10 = r10.get(r9)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r10 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r10
            java.util.ArrayList r10 = r10.getCurrentlist()
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0cbd
            java.util.ArrayList r10 = r1.P
            java.lang.Object r10 = r10.get(r7)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r10 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r10
            java.util.ArrayList r10 = r10.getCurrentlist()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r14 = r10.size()
            r13 = r7
        L_0x0081:
            if (r13 >= r14) goto L_0x0450
            java.lang.String r5 = "Pending2"
            java.lang.String r12 = "11"
            android.util.Log.e(r5, r12)
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r5 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            int r12 = r12.getPurCd()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            boolean r12 = r5.F(r12)
            java.lang.String r7 = "--"
            java.lang.String r6 = ", "
            r21 = r3
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            r18 = r8
            java.lang.String r8 = "."
            if (r12 == 0) goto L_0x0277
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getIsdraftpending()
            r19 = r14
            r14 = 1
            if (r12 != r14) goto L_0x026d
            ni.ob r5 = r1.H
            if (r5 != 0) goto L_0x00c3
            cm.l.v(r4)
            r5 = 0
        L_0x00c3:
            android.widget.LinearLayout r5 = r5.E
            r12 = 0
            r5.setVisibility(r12)
            java.lang.Object r5 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r5 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r5
            java.lang.String r5 = r5.getAppl_dt()
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            java.lang.String r12 = r12.getRegno()
            r1.L = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getFacelesstransaction()
            r1.S = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getIsdocuploadpending()
            r1.f20981b0 = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getIsrtorejection()
            r1.f20982c0 = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            java.lang.String r12 = r12.getStatusDesc()
            r1.f20985f0 = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getAppointmentpending()
            r1.T = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getIsdraftpending()
            r1.f20990k0 = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getAppointmentRequired()
            r1.f20991l0 = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            java.lang.String r12 = r12.getAuth_mode()
            java.lang.String r12 = r12.toString()
            r1.f20986g0 = r12
            java.lang.Object r12 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            java.lang.String r12 = r12.getPurCdDescr()
            java.lang.Object r14 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r14 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r14
            java.lang.String r14 = r14.getOffName()
            java.lang.Object r17 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r17 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r17
            r22 = r5
            java.lang.String r5 = r17.getPublicRemark()
            java.lang.Object r17 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r17 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r17
            java.lang.Object r17 = r17.getCurr_off_cd()
            r23 = r2
            java.lang.String r2 = r17.toString()
            r24 = r9
            r25 = r11
            r16 = r12
            r9 = 0
            r11 = 0
            r12 = 2
            boolean r2 = km.q.F(r2, r8, r11, r12, r9)
            if (r2 == 0) goto L_0x019b
            java.lang.Object r2 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            java.lang.Object r2 = r2.getCurr_off_cd()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.substring(r11, r12)
            cm.l.e(r2, r3)
        L_0x0197:
            r1.P2(r2)
            goto L_0x01aa
        L_0x019b:
            java.lang.Object r2 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            java.lang.Object r2 = r2.getCurr_off_cd()
            java.lang.String r2 = r2.toString()
            goto L_0x0197
        L_0x01aa:
            ka.c$a r2 = ka.c.f13158a
            boolean r3 = r2.m(r5)
            if (r3 == 0) goto L_0x01c2
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x01ba
            cm.l.v(r4)
            r3 = 0
        L_0x01ba:
            android.widget.TextView r3 = r3.f27848c
            java.lang.String r5 = r1.f20985f0
        L_0x01be:
            r3.setText(r5)
            goto L_0x01e1
        L_0x01c2:
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x01ca
            cm.l.v(r4)
            r3 = 0
        L_0x01ca:
            android.widget.TextView r3 = r3.f27848c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r1.f20985f0
            r8.append(r9)
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            goto L_0x01be
        L_0x01e1:
            boolean r2 = r2.m(r14)
            if (r2 == 0) goto L_0x01f5
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x01ef
            cm.l.v(r4)
            r2 = 0
        L_0x01ef:
            android.widget.TextView r2 = r2.f27846b
            r2.setText(r7)
            goto L_0x0202
        L_0x01f5:
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x01fd
            cm.l.v(r4)
            r2 = 0
        L_0x01fd:
            android.widget.TextView r2 = r2.f27846b
            r2.setText(r14)
        L_0x0202:
            java.lang.Object r2 = r10.get(r13)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            int r2 = r2.getPurCd()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.Y = r2
            java.lang.String r2 = r1.L
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0229
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0222
            cm.l.v(r4)
            r2 = 0
        L_0x0222:
            android.widget.TextView r2 = r2.G
            java.lang.String r3 = r1.L
            r2.setText(r3)
        L_0x0229:
            r2 = r16
            r15.add(r2)
            java.lang.String r2 = r1.Y
            r9 = r25
            r9.add(r2)
            java.util.ArrayList r2 = r1.f20999t0
            cm.l.c(r2)
            java.lang.String r3 = r1.Y
            r2.add(r3)
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0247
            cm.l.v(r4)
            r2 = 0
        L_0x0247:
            android.widget.TextView r2 = r2.f27860l
            java.lang.String r3 = ", "
            r14 = 0
            r5 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = 62
            r20 = 0
            r12 = r15
            r11 = r13
            r13 = r3
            r25 = r19
            r3 = r15
            r15 = r5
            r19 = r6
            java.lang.String r5 = ql.y.d0(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2.setText(r5)
            r2 = r3
            r5 = r9
        L_0x0269:
            r8 = r22
            goto L_0x043f
        L_0x026d:
            r23 = r2
            r24 = r9
            r9 = r11
            r11 = r13
            r2 = r15
            r25 = r19
            goto L_0x0280
        L_0x0277:
            r23 = r2
            r24 = r9
            r9 = r11
            r11 = r13
            r25 = r14
            r2 = r15
        L_0x0280:
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            int r12 = r12.getPurCd()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            boolean r5 = r5.F(r12)
            if (r5 == 0) goto L_0x043c
            ni.ob r5 = r1.H
            if (r5 != 0) goto L_0x029c
            cm.l.v(r4)
            r5 = 0
        L_0x029c:
            android.widget.LinearLayout r5 = r5.E
            r12 = 0
            r5.setVisibility(r12)
            java.lang.Object r5 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r5 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r5
            java.lang.String r5 = r5.getAppl_dt()
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            java.lang.String r12 = r12.getRegno()
            r1.L = r12
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getFacelesstransaction()
            r1.S = r12
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getIsdocuploadpending()
            r1.f20981b0 = r12
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getIsrtorejection()
            r1.f20982c0 = r12
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            java.lang.String r12 = r12.getStatusDesc()
            r1.f20985f0 = r12
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getAppointmentpending()
            r1.T = r12
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            boolean r12 = r12.getAppointmentRequired()
            r1.f20991l0 = r12
            java.lang.Object r12 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r12 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r12
            java.lang.String r12 = r12.getPurCdDescr()
            java.lang.Object r13 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r13 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r13
            java.lang.String r13 = r13.getOffName()
            ni.ob r14 = r1.H
            if (r14 != 0) goto L_0x031c
            cm.l.v(r4)
            r14 = 0
        L_0x031c:
            android.widget.TextView r14 = r14.f27860l
            r14.setText(r12)
            java.lang.Object r14 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r14 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r14
            java.lang.String r14 = r14.getPublicRemark()
            ni.ob r15 = r1.H
            if (r15 != 0) goto L_0x0333
            cm.l.v(r4)
            r15 = 0
        L_0x0333:
            android.widget.TextView r15 = r15.f27848c
            r22 = r5
            java.lang.String r5 = r1.f20985f0
            r15.setText(r5)
            ka.c$a r5 = ka.c.f13158a
            boolean r15 = r5.m(r14)
            if (r15 == 0) goto L_0x0358
            ni.ob r6 = r1.H
            if (r6 != 0) goto L_0x034c
            cm.l.v(r4)
            r6 = 0
        L_0x034c:
            android.widget.TextView r6 = r6.f27848c
            java.lang.String r14 = r1.f20985f0
            r6.setText(r14)
            r27 = r2
            r26 = r9
            goto L_0x037d
        L_0x0358:
            ni.ob r15 = r1.H
            if (r15 != 0) goto L_0x0360
            cm.l.v(r4)
            r15 = 0
        L_0x0360:
            android.widget.TextView r15 = r15.f27848c
            r26 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r27 = r2
            java.lang.String r2 = r1.f20985f0
            r9.append(r2)
            r9.append(r6)
            r9.append(r14)
            java.lang.String r2 = r9.toString()
            r15.setText(r2)
        L_0x037d:
            java.lang.Object r2 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            java.lang.Object r2 = r2.getCurr_off_cd()
            java.lang.String r2 = r2.toString()
            r6 = 0
            r9 = 0
            r14 = 2
            boolean r2 = km.q.F(r2, r8, r9, r14, r6)
            if (r2 == 0) goto L_0x03ad
            java.lang.Object r2 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            java.lang.Object r2 = r2.getCurr_off_cd()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.substring(r9, r14)
            cm.l.e(r2, r3)
        L_0x03a9:
            r1.P2(r2)
            goto L_0x03bc
        L_0x03ad:
            java.lang.Object r2 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            java.lang.Object r2 = r2.getCurr_off_cd()
            java.lang.String r2 = r2.toString()
            goto L_0x03a9
        L_0x03bc:
            boolean r2 = r5.m(r13)
            if (r2 == 0) goto L_0x03d0
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x03ca
            cm.l.v(r4)
            r2 = 0
        L_0x03ca:
            android.widget.TextView r2 = r2.f27846b
            r2.setText(r7)
            goto L_0x03dd
        L_0x03d0:
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x03d8
            cm.l.v(r4)
            r2 = 0
        L_0x03d8:
            android.widget.TextView r2 = r2.f27846b
            r2.setText(r13)
        L_0x03dd:
            java.lang.Object r2 = r10.get(r11)
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel) r2
            int r2 = r2.getPurCd()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.Y = r2
            java.lang.String r2 = r1.L
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0404
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x03fd
            cm.l.v(r4)
            r2 = 0
        L_0x03fd:
            android.widget.TextView r2 = r2.G
            java.lang.String r3 = r1.L
            r2.setText(r3)
        L_0x0404:
            r2 = r27
            r2.add(r12)
            java.lang.String r3 = r1.Y
            r5 = r26
            r5.add(r3)
            java.util.ArrayList r3 = r1.f20999t0
            cm.l.c(r3)
            java.lang.String r6 = r1.Y
            r3.add(r6)
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x0422
            cm.l.v(r4)
            r3 = 0
        L_0x0422:
            android.widget.TextView r3 = r3.f27860l
            java.lang.String r13 = ", "
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 62
            r20 = 0
            r12 = r2
            java.lang.String r6 = ql.y.d0(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.setText(r6)
            goto L_0x0269
        L_0x043c:
            r5 = r9
            r8 = r18
        L_0x043f:
            int r13 = r11 + 1
            r15 = r2
            r11 = r5
            r3 = r21
            r2 = r23
            r9 = r24
            r14 = r25
            r6 = 8
            r7 = 0
            goto L_0x0081
        L_0x0450:
            r23 = r2
            r21 = r3
            r18 = r8
            r24 = r9
            java.util.ArrayList r2 = r1.P     // Catch:{ Exception -> 0x0ca1 }
            r7 = r24
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x0c99 }
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r2     // Catch:{ Exception -> 0x0c99 }
            java.util.ArrayList r2 = r2.getCurrentlist()     // Catch:{ Exception -> 0x0c99 }
            if (r2 == 0) goto L_0x0c9d
            java.util.ArrayList r2 = r1.P     // Catch:{ Exception -> 0x0c99 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x0c99 }
            com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel r2 = (com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel) r2     // Catch:{ Exception -> 0x0c99 }
            java.util.ArrayList r2 = r2.getCurrentlist()     // Catch:{ Exception -> 0x0c99 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0c99 }
            if (r2 <= 0) goto L_0x0c9d
            java.lang.String r2 = r1.Y     // Catch:{ Exception -> 0x0c99 }
            java.lang.String r3 = "58"
            r5 = 1
            boolean r2 = km.p.o(r2, r3, r5)     // Catch:{ Exception -> 0x0c99 }
            java.lang.String r3 = "ONLINE TRANSACTION PENDING"
            java.lang.String r6 = "PENDING IN DRAFT"
            java.lang.String r8 = "TRANSACTION FAILED"
            java.lang.String r9 = "ONLINE TRANSACTION FAIL"
            if (r2 != 0) goto L_0x0497
            java.lang.String r2 = r1.Y     // Catch:{ Exception -> 0x0636 }
            java.lang.String r10 = "58.0"
            boolean r2 = km.p.o(r2, r10, r5)     // Catch:{ Exception -> 0x0636 }
            if (r2 == 0) goto L_0x049b
        L_0x0497:
            r11 = r23
            goto L_0x0c11
        L_0x049b:
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0636 }
            r5 = 0
            r10 = 0
            r11 = 2
            boolean r2 = km.q.F(r2, r9, r10, r11, r5)     // Catch:{ Exception -> 0x0636 }
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r2 != 0) goto L_0x04b0
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0636 }
            boolean r2 = km.q.F(r2, r8, r10, r11, r5)     // Catch:{ Exception -> 0x0636 }
            if (r2 == 0) goto L_0x04b4
        L_0x04b0:
            r11 = r23
            goto L_0x0bb3
        L_0x04b4:
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0636 }
            boolean r2 = km.q.F(r2, r6, r10, r11, r5)     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x04c4
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0636 }
            boolean r2 = km.q.F(r2, r3, r10, r11, r5)     // Catch:{ Exception -> 0x0636 }
            if (r2 == 0) goto L_0x04c9
        L_0x04c4:
            r11 = r23
            r2 = 1
            goto L_0x0b4d
        L_0x04c9:
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0636 }
            java.lang.String r3 = "DOCUMENT UPLOAD PENDING AT ONLINE"
            boolean r2 = km.q.F(r2, r3, r10, r11, r5)     // Catch:{ Exception -> 0x0636 }
            r3 = 2131100579(0x7f0603a3, float:1.7813543E38)
            r5 = 2131230934(0x7f0800d6, float:1.8077935E38)
            r6 = 2131099809(0x7f0600a1, float:1.7811982E38)
            r8 = 2132017537(0x7f140181, float:1.9673355E38)
            java.lang.String r9 = "lbl_Completed"
            if (r2 != 0) goto L_0x04e6
            boolean r2 = r1.f20981b0     // Catch:{ Exception -> 0x0636 }
            r10 = 1
            if (r2 != r10) goto L_0x04ea
        L_0x04e6:
            r11 = r23
            goto L_0x0a7a
        L_0x04ea:
            if (r2 != 0) goto L_0x063b
            boolean r11 = r1.S     // Catch:{ Exception -> 0x0636 }
            if (r11 != r10) goto L_0x063b
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x0503
            cm.l.v(r4)     // Catch:{ Exception -> 0x04f9 }
            r2 = 0
            goto L_0x0503
        L_0x04f9:
            r0 = move-exception
            r2 = r0
            r11 = r23
        L_0x04fd:
            r3 = 0
            r5 = 8
        L_0x0500:
            r9 = 0
            goto L_0x0ca7
        L_0x0503:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x0636 }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x0636 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x0511
            cm.l.v(r4)     // Catch:{ Exception -> 0x04f9 }
            r2 = 0
        L_0x0511:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x0636 }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x0636 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x051f
            cm.l.v(r4)     // Catch:{ Exception -> 0x04f9 }
            r2 = 0
        L_0x051f:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x0636 }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x0636 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x052d
            cm.l.v(r4)     // Catch:{ Exception -> 0x04f9 }
            r2 = 0
        L_0x052d:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x0636 }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x0636 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x053b
            cm.l.v(r4)     // Catch:{ Exception -> 0x04f9 }
            r2 = 0
        L_0x053b:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x0636 }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x0636 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x0549
            cm.l.v(r4)     // Catch:{ Exception -> 0x04f9 }
            r2 = 0
        L_0x0549:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x0636 }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x0636 }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0636 }
            if (r2 != 0) goto L_0x0557
            cm.l.v(r4)     // Catch:{ Exception -> 0x04f9 }
            r2 = 0
        L_0x0557:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x0636 }
            java.lang.String r10 = r1.getString(r8)     // Catch:{ Exception -> 0x0636 }
            r11 = r23
            java.lang.String r10 = r11.b(r9, r10)     // Catch:{ Exception -> 0x056f }
            r2.setText(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0572
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
            goto L_0x0572
        L_0x056f:
            r0 = move-exception
        L_0x0570:
            r2 = r0
            goto L_0x04fd
        L_0x0572:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0583
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0583:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0594
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0594:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x05a5
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x05a5:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x056f }
            r10 = 8
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x05b4
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x05b4:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r11.b(r9, r8)     // Catch:{ Exception -> 0x056f }
            r2.setText(r8)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x05c9
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x05c9:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x05da
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x05da:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x05eb
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x05eb:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x056f }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x05fc
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x05fc:
            android.widget.ImageView r2 = r2.f27851d0     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x060a
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x060a:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            boolean r2 = r1.S     // Catch:{ Exception -> 0x056f }
            if (r2 == 0) goto L_0x062a
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x061d
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x061d:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 8
        L_0x0621:
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
        L_0x0624:
            r3 = 0
            r5 = 8
            r9 = 0
            goto L_0x0cba
        L_0x062a:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0632
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0632:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 0
            goto L_0x0621
        L_0x0636:
            r0 = move-exception
            r11 = r23
            goto L_0x0570
        L_0x063b:
            r11 = r23
            if (r2 != 0) goto L_0x0773
            boolean r10 = r1.S     // Catch:{ Exception -> 0x056f }
            if (r10 != 0) goto L_0x0773
            boolean r10 = r1.T     // Catch:{ Exception -> 0x056f }
            r12 = 1
            if (r10 != r12) goto L_0x0773
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0650
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0650:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x065e
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x065e:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x066c
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x066c:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x067a
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x067a:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0688
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0688:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0696
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0696:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x06a4
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x06a4:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r11.b(r9, r10)     // Catch:{ Exception -> 0x056f }
            r2.setText(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x06b9
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x06b9:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x06ca
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x06ca:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x06db
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x06db:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x06ec
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x06ec:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x056f }
            r10 = 8
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x06fb
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x06fb:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r11.b(r9, r8)     // Catch:{ Exception -> 0x056f }
            r2.setText(r8)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0710
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0710:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0721
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0721:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0732
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0732:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x056f }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0743
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0743:
            android.widget.ImageView r2 = r2.f27851d0     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0751
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0751:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0760
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0760:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x076e
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x076e:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
            r3 = 0
            goto L_0x0621
        L_0x0773:
            if (r2 != 0) goto L_0x08ef
            boolean r10 = r1.f20982c0     // Catch:{ Exception -> 0x056f }
            r12 = 1
            if (r10 != r12) goto L_0x08ef
            boolean r10 = r1.T     // Catch:{ Exception -> 0x056f }
            if (r10 != 0) goto L_0x08ef
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0786
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0786:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0794
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0794:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x07a2
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x07a2:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x07b0
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x07b0:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x07be
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x07be:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x07cc
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x07cc:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x07da
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x07da:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r11.b(r9, r10)     // Catch:{ Exception -> 0x056f }
            r2.setText(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x07ef
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x07ef:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0800
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0800:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0811
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0811:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0822
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0822:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x056f }
            r10 = 8
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0831
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0831:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = "lbl_Rejected"
            r12 = 2132018953(0x7f140709, float:1.9676227E38)
            java.lang.String r12 = r1.getString(r12)     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r11.b(r10, r12)     // Catch:{ Exception -> 0x056f }
            r2.setText(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x084b
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x084b:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0859
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0859:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = "lbl_ReUpload"
            r12 = 2132019004(0x7f14073c, float:1.967633E38)
            java.lang.String r12 = r1.getString(r12)     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r11.b(r10, r12)     // Catch:{ Exception -> 0x056f }
            r2.setText(r10)     // Catch:{ Exception -> 0x056f }
            boolean r2 = r1.S     // Catch:{ Exception -> 0x056f }
            if (r2 == 0) goto L_0x087d
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0877
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0877:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 8
            goto L_0x0621
        L_0x087d:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0885
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0885:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r11.b(r9, r8)     // Catch:{ Exception -> 0x056f }
            r2.setText(r8)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x089a
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x089a:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x056f }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x08ab
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x08ab:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x08bc
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x08bc:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x056f }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x08cd
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x08cd:
            android.widget.ImageView r2 = r2.N     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x08db
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x08db:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x08ea
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x08ea:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 0
            goto L_0x0621
        L_0x08ef:
            if (r2 != 0) goto L_0x0624
            boolean r2 = r1.f20982c0     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0624
            boolean r2 = r1.T     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0624
            boolean r2 = r1.f20990k0     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0624
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0905
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0905:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0913
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0913:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0921
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0921:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x092f
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x092f:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x093d
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x093d:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r11.b(r9, r10)     // Catch:{ Exception -> 0x056f }
            r2.setText(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0952
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0952:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x056f }
            r10 = 8
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0961
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0961:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0972
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0972:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0983
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0983:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0994
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0994:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r10 = r11.b(r9, r10)     // Catch:{ Exception -> 0x056f }
            r2.setText(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x09a9
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x09a9:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x09ba
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x09ba:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x09cb
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x09cb:
            android.widget.TextView r2 = r2.f27863o     // Catch:{ Exception -> 0x056f }
            int r10 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x09dc
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x09dc:
            android.widget.ImageView r2 = r2.f27851d0     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x09ea
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x09ea:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r10 = 8
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            boolean r2 = r1.S     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a6c
            boolean r2 = r1.f20991l0     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x09fa
            goto L_0x0a6c
        L_0x09fa:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a02
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a02:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r11.b(r9, r8)     // Catch:{ Exception -> 0x056f }
            r2.setText(r8)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a17
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a17:
            android.widget.TextView r2 = r2.O     // Catch:{ Exception -> 0x056f }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a28
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a28:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a39
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a39:
            android.widget.TextView r2 = r2.f27862n     // Catch:{ Exception -> 0x056f }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a4a
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a4a:
            android.widget.ImageView r2 = r2.N     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a58
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a58:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a67
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a67:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 0
            goto L_0x0621
        L_0x0a6c:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a74
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a74:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 8
            goto L_0x0621
        L_0x0a7a:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a82
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a82:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a90
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a90:
            android.widget.ImageView r2 = r2.f27868t     // Catch:{ Exception -> 0x056f }
            r10 = 0
            r2.setVisibility(r10)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0a9e
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0a9e:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r1.getString(r8)     // Catch:{ Exception -> 0x056f }
            java.lang.String r8 = r11.b(r9, r8)     // Catch:{ Exception -> 0x056f }
            r2.setText(r8)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0ab3
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0ab3:
            android.widget.TextView r2 = r2.f27865q     // Catch:{ Exception -> 0x056f }
            r8 = 8
            r2.setVisibility(r8)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0ac2
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0ac2:
            android.widget.TextView r2 = r2.f27869u     // Catch:{ Exception -> 0x056f }
            int r6 = r1.getColor(r6)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r6)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0ad3
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0ad3:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)     // Catch:{ Exception -> 0x056f }
            r2.setBackgroundDrawable(r5)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0ae4
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0ae4:
            android.widget.TextView r2 = r2.f27861m     // Catch:{ Exception -> 0x056f }
            int r3 = r1.getColor(r3)     // Catch:{ Exception -> 0x056f }
            r2.setTextColor(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0af5
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0af5:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b03
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b03:
            android.widget.TextView r2 = r2.f27853e0     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b11
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b11:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            boolean r2 = r1.S     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b3f
            boolean r2 = r1.T     // Catch:{ Exception -> 0x056f }
            r3 = 1
            if (r2 != r3) goto L_0x0b3f
            boolean r2 = r1.f20991l0     // Catch:{ Exception -> 0x056f }
            if (r2 != r3) goto L_0x0b3f
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b2c
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b2c:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b3a
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b3a:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
            r3 = 0
            goto L_0x0621
        L_0x0b3f:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b47
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b47:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 8
            goto L_0x0621
        L_0x0b4d:
            r1.f20990k0 = r2     // Catch:{ Exception -> 0x056f }
            r1.f20981b0 = r2     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b59
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b59:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b67
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b67:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b75
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b75:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b83
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b83:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b91
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b91:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0b9f
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0b9f:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r2.setAlpha(r9)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0bac
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0bac:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
        L_0x0bae:
            r2.setAlpha(r9)     // Catch:{ Exception -> 0x056f }
            goto L_0x0624
        L_0x0bb3:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0bbb
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0bbb:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0bc9
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0bc9:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0bd7
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0bd7:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0be5
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0be5:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0bf3
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0bf3:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
            r3 = 0
            r2.setEnabled(r3)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0c01
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0c01:
            android.widget.TextView r2 = r2.Z     // Catch:{ Exception -> 0x056f }
            r2.setAlpha(r9)     // Catch:{ Exception -> 0x056f }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x056f }
            if (r2 != 0) goto L_0x0c0e
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0c0e:
            android.widget.TextView r2 = r2.L     // Catch:{ Exception -> 0x056f }
            goto L_0x0bae
        L_0x0c11:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0c94 }
            if (r2 != 0) goto L_0x0c19
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0c19:
            android.widget.LinearLayout r2 = r2.f27849c0     // Catch:{ Exception -> 0x0c94 }
            r5 = 8
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x0c8d }
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0c94 }
            if (r2 != 0) goto L_0x0c28
            cm.l.v(r4)     // Catch:{ Exception -> 0x056f }
            r2 = 0
        L_0x0c28:
            android.widget.LinearLayout r2 = r2.M     // Catch:{ Exception -> 0x0c94 }
            r5 = 8
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x0c8d }
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0c8d }
            r10 = 0
            r12 = 0
            r13 = 2
            boolean r2 = km.q.F(r2, r9, r12, r13, r10)     // Catch:{ Exception -> 0x0c90 }
            if (r2 != 0) goto L_0x0c4a
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0c45 }
            boolean r2 = km.q.F(r2, r8, r12, r13, r10)     // Catch:{ Exception -> 0x0c45 }
            if (r2 == 0) goto L_0x0c43
            goto L_0x0c4a
        L_0x0c43:
            r8 = 0
            goto L_0x0c58
        L_0x0c45:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x0500
        L_0x0c4a:
            ni.ob r9 = r1.H     // Catch:{ Exception -> 0x0c8d }
            if (r9 != 0) goto L_0x0c52
            cm.l.v(r4)     // Catch:{ Exception -> 0x0c45 }
            r9 = 0
        L_0x0c52:
            android.widget.LinearLayout r2 = r9.f27864p     // Catch:{ Exception -> 0x0c8d }
            r8 = 0
            r2.setVisibility(r8)     // Catch:{ Exception -> 0x0c89 }
        L_0x0c58:
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0c89 }
            r9 = 0
            r10 = 2
            boolean r2 = km.q.F(r2, r6, r8, r10, r9)     // Catch:{ Exception -> 0x0c86 }
            if (r2 != 0) goto L_0x0c71
            java.lang.String r2 = r1.f20985f0     // Catch:{ Exception -> 0x0c6d }
            boolean r2 = km.q.F(r2, r3, r8, r10, r9)     // Catch:{ Exception -> 0x0c6d }
            if (r2 == 0) goto L_0x0c6b
            goto L_0x0c71
        L_0x0c6b:
            r3 = 0
            goto L_0x0cba
        L_0x0c6d:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x0ca7
        L_0x0c71:
            ni.ob r2 = r1.H     // Catch:{ Exception -> 0x0c83 }
            if (r2 != 0) goto L_0x0c79
            cm.l.v(r4)     // Catch:{ Exception -> 0x0c6d }
            r2 = r9
        L_0x0c79:
            android.widget.LinearLayout r2 = r2.f27864p     // Catch:{ Exception -> 0x0c83 }
            r3 = 0
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x0c80 }
            goto L_0x0cba
        L_0x0c80:
            r0 = move-exception
        L_0x0c81:
            r2 = r0
            goto L_0x0ca7
        L_0x0c83:
            r0 = move-exception
            r3 = 0
            goto L_0x0c81
        L_0x0c86:
            r0 = move-exception
            r3 = r8
            goto L_0x0c81
        L_0x0c89:
            r0 = move-exception
            r3 = r8
        L_0x0c8b:
            r9 = 0
            goto L_0x0c81
        L_0x0c8d:
            r0 = move-exception
            r3 = 0
            goto L_0x0c8b
        L_0x0c90:
            r0 = move-exception
            r9 = r10
            r3 = r12
            goto L_0x0c81
        L_0x0c94:
            r0 = move-exception
        L_0x0c95:
            r3 = 0
            r5 = 8
            goto L_0x0c8b
        L_0x0c99:
            r0 = move-exception
            r11 = r23
            goto L_0x0c95
        L_0x0c9d:
            r11 = r23
            goto L_0x0624
        L_0x0ca1:
            r0 = move-exception
            r11 = r23
            r7 = r24
            goto L_0x0c95
        L_0x0ca7:
            r2.printStackTrace()
            r2 = 2132018526(0x7f14055e, float:1.9675361E38)
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r6 = "no_detail_availbale"
            java.lang.String r2 = r11.b(r6, r2)
            r1.f3(r1, r2)
        L_0x0cba:
            r8 = r18
            goto L_0x0cc4
        L_0x0cbd:
            r11 = r2
            r21 = r3
            r5 = r6
            r3 = r7
            r7 = r9
            r9 = 0
        L_0x0cc4:
            int r2 = r7 + 1
            r9 = r2
            r7 = r3
            r6 = r5
            r2 = r11
            r3 = r21
            goto L_0x0052
        L_0x0cce:
            r9 = 0
            int r2 = r8.length()
            if (r2 <= 0) goto L_0x0ce2
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0cdd
            cm.l.v(r4)
            r2 = r9
        L_0x0cdd:
            android.widget.TextView r2 = r2.f27850d
            r2.setText(r8)
        L_0x0ce2:
            android.app.ProgressDialog r2 = r28.a2()
            r2.show()
            bi.h r2 = r28.k2()
            java.lang.String r3 = r1.L
            java.lang.String r5 = r1.K
            java.lang.String r6 = r1.f21000u0
            r2.B0(r1, r3, r5, r6)
            goto L_0x0cf8
        L_0x0cf7:
            r9 = 0
        L_0x0cf8:
            java.lang.String r2 = r1.I
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0d0f
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0d08
            cm.l.v(r4)
            r2 = r9
        L_0x0d08:
            android.widget.TextView r2 = r2.f27852e
            java.lang.String r3 = r1.I
            r2.setText(r3)
        L_0x0d0f:
            java.lang.String r2 = r1.J
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0d26
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0d1f
            cm.l.v(r4)
            r2 = r9
        L_0x0d1f:
            android.widget.TextView r2 = r2.f27856h
            java.lang.String r3 = r1.J
            r2.setText(r3)
        L_0x0d26:
            java.lang.String r2 = r1.K
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0d77
            java.util.HashMap r2 = r1.R
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0d38:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0d77
            java.lang.Object r3 = r2.next()
            java.lang.String r5 = "next(...)"
            cm.l.e(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r5 = r1.R
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r1.K
            boolean r3 = cm.l.a(r3, r6)
            if (r3 == 0) goto L_0x0d67
            ni.ob r2 = r1.H
            if (r2 != 0) goto L_0x0d61
            cm.l.v(r4)
            r2 = r9
        L_0x0d61:
            android.widget.TextView r2 = r2.Q
            r2.setText(r5)
            return
        L_0x0d67:
            ni.ob r3 = r1.H
            if (r3 != 0) goto L_0x0d6f
            cm.l.v(r4)
            r3 = r9
        L_0x0d6f:
            android.widget.TextView r3 = r3.Q
            java.lang.String r5 = r1.K
            r3.setText(r5)
            goto L_0x0d38
        L_0x0d77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.VahanMultiServiceApplicationTransactionStatus.n2():void");
    }

    /* access modifiers changed from: private */
    public static final void o2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void p2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.E2();
    }

    /* access modifiers changed from: private */
    public static final void q2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        ob obVar = vahanMultiServiceApplicationTransactionStatus.H;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        obVar.f27872x.setVisibility(8);
        Dialog dialog = new Dialog(vahanMultiServiceApplicationTransactionStatus.G, 16973834);
        dialog.setContentView(R.layout.layout_download_documents);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.id_statusDocumentCancel);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById).setOnClickListener(new p(dialog, vahanMultiServiceApplicationTransactionStatus));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void r2(Dialog dialog, VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        dialog.dismiss();
        ob obVar = vahanMultiServiceApplicationTransactionStatus.H;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        obVar.f27872x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void s2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, String str) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void t2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, FeesModle feesModle) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
        try {
            vahanMultiServiceApplicationTransactionStatus.Y2(String.valueOf(((FeesModleItem) feesModle.get(0)).getTotalAmount()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void u2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, String str) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void v2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        try {
            if (vahanMultiServiceApplicationTransactionStatus.f20990k0) {
                vahanMultiServiceApplicationTransactionStatus.c3("Fee payment is pending, Kindly complete fee payment");
            } else if (!vahanMultiServiceApplicationTransactionStatus.f20982c0) {
                vahanMultiServiceApplicationTransactionStatus.a2().show();
                vahanMultiServiceApplicationTransactionStatus.k2().s(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.I);
            } else {
                Intent intent = new Intent(vahanMultiServiceApplicationTransactionStatus, VahanDmsReupload.class);
                intent.putExtra("state_code", vahanMultiServiceApplicationTransactionStatus.K);
                intent.putExtra(VContant.APP_NO, vahanMultiServiceApplicationTransactionStatus.I);
                intent.putExtra("rc_number", vahanMultiServiceApplicationTransactionStatus.L);
                intent.putExtra(VContant.PURPOSE_CODE, vahanMultiServiceApplicationTransactionStatus.Y.toString());
                intent.putExtra("chassiNo", vahanMultiServiceApplicationTransactionStatus.f21000u0);
                vahanMultiServiceApplicationTransactionStatus.startActivity(intent);
                vahanMultiServiceApplicationTransactionStatus.finish();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void w2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        String str;
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        try {
            if (vahanMultiServiceApplicationTransactionStatus.f20990k0) {
                str = "Fee payment is pending, Kindly complete fee payment";
            } else if (!vahanMultiServiceApplicationTransactionStatus.f20981b0) {
                vahanMultiServiceApplicationTransactionStatus.f20988i0 = true;
                vahanMultiServiceApplicationTransactionStatus.a2().show();
                vahanMultiServiceApplicationTransactionStatus.k2().s(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.I);
                return;
            } else {
                str = "Document upload is pending, Kindly complete document upload";
            }
            vahanMultiServiceApplicationTransactionStatus.c3(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, View view) {
        String obj;
        MultiSelectionViewModel m22;
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest;
        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = vahanMultiServiceApplicationTransactionStatus;
        cm.l.f(vahanMultiServiceApplicationTransactionStatus2, "this$0");
        try {
            if (q.F(vahanMultiServiceApplicationTransactionStatus2.Y, ".0", false, 2, (Object) null)) {
                String str = vahanMultiServiceApplicationTransactionStatus2.Y;
                String substring = str.substring(0, str.length() - 2);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                obj = q.B0(substring).toString();
            } else {
                obj = q.B0(vahanMultiServiceApplicationTransactionStatus2.Y).toString();
            }
            vahanMultiServiceApplicationTransactionStatus2.O = obj;
            if (!vahanMultiServiceApplicationTransactionStatus2.f20990k0) {
                if (!q.F(vahanMultiServiceApplicationTransactionStatus2.f20985f0, "ONLINE TRANSACTION FAIL", false, 2, (Object) null)) {
                    vahanMultiServiceApplicationTransactionStatus.a2().show();
                    bi.b bVar = vahanMultiServiceApplicationTransactionStatus2.f20993n0;
                    if (bVar == null) {
                        cm.l.v("viewModelPayment");
                        bVar = null;
                    }
                    bVar.A(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus2.O, vahanMultiServiceApplicationTransactionStatus2.I, vahanMultiServiceApplicationTransactionStatus.Z1(), vahanMultiServiceApplicationTransactionStatus2.K, vahanMultiServiceApplicationTransactionStatus2.L);
                    return;
                }
            }
            Log.e("Calling --15-06", "1-test");
            if (vahanMultiServiceApplicationTransactionStatus2.O.equals(VContant.Tax_PURPOSE_CODE)) {
                vahanMultiServiceApplicationTransactionStatus.a2().show();
                vahanMultiServiceApplicationTransactionStatus.j2().A0(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus2.L, vahanMultiServiceApplicationTransactionStatus2.K, vahanMultiServiceApplicationTransactionStatus2.O, vahanMultiServiceApplicationTransactionStatus2.f21000u0);
            } else if (!ka.c.f13158a.m(vahanMultiServiceApplicationTransactionStatus2.f20986g0)) {
                if (vahanMultiServiceApplicationTransactionStatus2.f20986g0.equals("Mobile")) {
                    vahanMultiServiceApplicationTransactionStatus.a2().show();
                    VContant.Companion companion = VContant.Companion;
                    MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest2 = r4;
                    MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest3 = new MultiServiceBeforePaymentRequest(" ", "M", vahanMultiServiceApplicationTransactionStatus2.I, true, (ChanngeOfAdressDto) null, " ", 22, (Durcdto) null, (List<Feelist>) null, "", "", false, (HpaDto) null, (HptDto) null, 0, "", 1, "", false, "", new MultiServiceDto((ArrayList<ArrayList<Fees>>) null, companion.j(vahanMultiServiceApplicationTransactionStatus2.f20999t0), vahanMultiServiceApplicationTransactionStatus2.L, vahanMultiServiceApplicationTransactionStatus2.K, 0), false, Integer.parseInt(vahanMultiServiceApplicationTransactionStatus.Z1()), v9.d.f17494a.m(), "", "", companion.j(vahanMultiServiceApplicationTransactionStatus2.f20999t0), Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE), "", "", 0, 0, vahanMultiServiceApplicationTransactionStatus2.L, 0, vahanMultiServiceApplicationTransactionStatus2.K, "", "", "L", (TransferOwnershipDto) null, 1);
                    vahanMultiServiceApplicationTransactionStatus2.f20996q0 = multiServiceBeforePaymentRequest2;
                    m22 = vahanMultiServiceApplicationTransactionStatus.m2();
                    multiServiceBeforePaymentRequest = vahanMultiServiceApplicationTransactionStatus2.f20996q0;
                    cm.l.c(multiServiceBeforePaymentRequest);
                } else {
                    vahanMultiServiceApplicationTransactionStatus.a2().show();
                    VContant.Companion companion2 = VContant.Companion;
                    MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest4 = r4;
                    MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest5 = new MultiServiceBeforePaymentRequest(" ", "M", vahanMultiServiceApplicationTransactionStatus2.I, true, (ChanngeOfAdressDto) null, " ", 22, (Durcdto) null, (List<Feelist>) null, "", "", false, (HpaDto) null, (HptDto) null, 0, "", 1, "", false, "", new MultiServiceDto((ArrayList<ArrayList<Fees>>) null, companion2.j(vahanMultiServiceApplicationTransactionStatus2.f20999t0), vahanMultiServiceApplicationTransactionStatus2.L, vahanMultiServiceApplicationTransactionStatus2.K, 0), false, Integer.parseInt(vahanMultiServiceApplicationTransactionStatus.Z1()), v9.d.f17494a.m(), "", "", companion2.j(vahanMultiServiceApplicationTransactionStatus2.f20999t0), Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE), "", "", 0, 0, vahanMultiServiceApplicationTransactionStatus2.L, 0, vahanMultiServiceApplicationTransactionStatus2.K, "", "", "L", (TransferOwnershipDto) null, 1);
                    vahanMultiServiceApplicationTransactionStatus2.f20996q0 = multiServiceBeforePaymentRequest4;
                    m22 = vahanMultiServiceApplicationTransactionStatus.m2();
                    multiServiceBeforePaymentRequest = vahanMultiServiceApplicationTransactionStatus2.f20996q0;
                    cm.l.c(multiServiceBeforePaymentRequest);
                }
                m22.g(multiServiceBeforePaymentRequest);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, MultiBeforePaymentResponse multiBeforePaymentResponse) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
        String returnUrl = multiBeforePaymentResponse.getReturnUrl();
        if (returnUrl != null && returnUrl.length() != 0) {
            try {
                Intent intent = new Intent(vahanMultiServiceApplicationTransactionStatus, VahanMultiServicePayment.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, vahanMultiServiceApplicationTransactionStatus.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
                if (vahanMultiServiceApplicationTransactionStatus.f20986g0.equals("Mobile")) {
                    intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                } else {
                    intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                }
                intent.putExtra("state_code", vahanMultiServiceApplicationTransactionStatus.K);
                intent.putExtra("rc_number", vahanMultiServiceApplicationTransactionStatus.L);
                intent.putExtra(VContant.PURPOSE_CODE, VContant.MULTISERVICE_PURPOSE_CODE);
                intent.putExtra("URL", multiBeforePaymentResponse.getReturnUrl());
                intent.putExtra(VContant.FINAL_SUBMIT, vahanMultiServiceApplicationTransactionStatus.f20996q0);
                intent.putExtra("RC", vahanMultiServiceApplicationTransactionStatus.L);
                intent.putExtra("RcDetails", vahanMultiServiceApplicationTransactionStatus.Y1());
                intent.putExtra(VContant.NEXGEN_addahar_name, " ");
                intent.putExtra(VContant.NEXGEN_addahar_address, " ");
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, vahanMultiServiceApplicationTransactionStatus.f20999t0);
                vahanMultiServiceApplicationTransactionStatus.startActivity(intent);
                vahanMultiServiceApplicationTransactionStatus.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus, String str) {
        cm.l.f(vahanMultiServiceApplicationTransactionStatus, "this$0");
        vahanMultiServiceApplicationTransactionStatus.a2().dismiss();
        if (str.equals("Error")) {
            vahanMultiServiceApplicationTransactionStatus.f3(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.getString(R.string.service_unavable_please_try));
            return;
        }
        cm.l.c(str);
        if (q.F(str, "re-verify", false, 2, (Object) null)) {
            vahanMultiServiceApplicationTransactionStatus.I2(str, vahanMultiServiceApplicationTransactionStatus);
        } else {
            vahanMultiServiceApplicationTransactionStatus.h3(vahanMultiServiceApplicationTransactionStatus, str);
        }
    }

    public final void L2(String str) {
        cm.l.f(str, "rc_chasi_no");
        HashMap hashMap = new HashMap();
        hashMap.put(VContant.PAY_TAX, VContant.PAY_TAX_CODE);
        setIntent(new Intent(this, PayTaxActivity.class));
        getIntent().putExtra("RC", this.L);
        getIntent().putExtra("State", this.K);
        getIntent().putExtra("map", hashMap);
        getIntent().putExtra("off_code", Z1());
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

    public final void M2(MultiService multiService) {
        cm.l.f(multiService, "<set-?>");
        this.f20998s0 = multiService;
    }

    public final void N2(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        this.f20996q0 = multiServiceBeforePaymentRequest;
    }

    public final void O2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.N = nrvDetails;
    }

    public final void P2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20992m0 = str;
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
        textView.setOnClickListener(new d(dialog, context));
        textView2.setOnClickListener(new e(dialog));
        dialog.show();
    }

    public final void Q2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.U = progressDialog;
    }

    public final void R2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void S2(boolean z10) {
        this.f20989j0 = z10;
    }

    public final String T1() {
        return this.f20986g0;
    }

    public final void T2(BeforePaymentRequest beforePaymentRequest) {
        cm.l.f(beforePaymentRequest, "<set-?>");
        this.f20995p0 = beforePaymentRequest;
    }

    public final String U1() {
        return this.f21000u0;
    }

    public final void U2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.W = vahanProService;
    }

    public final MultiService V1() {
        MultiService multiService = this.f20998s0;
        if (multiService != null) {
            return multiService;
        }
        cm.l.v("multiService");
        return null;
    }

    public final void V2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.f20980a0 = vahanServiceConnection;
    }

    public final ArrayList W1() {
        return this.f20999t0;
    }

    public final void W2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f20983d0 = vahanProService;
    }

    public final MultiServiceBeforePaymentRequest X1() {
        return this.f20996q0;
    }

    public final void X2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f20984e0 = hVar;
    }

    public final NrvDetails Y1() {
        NrvDetails nrvDetails = this.N;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
        return null;
    }

    public final void Y2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20987h0 = str;
    }

    public final String Z1() {
        String str = this.f20992m0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final void Z2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.V = hVar;
    }

    public final ProgressDialog a2() {
        ProgressDialog progressDialog = this.U;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void a3(bi.l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.Z = lVar;
    }

    public final String b2() {
        return this.O;
    }

    public final void b3(MultiSelectionViewModel multiSelectionViewModel) {
        cm.l.f(multiSelectionViewModel, "<set-?>");
        this.f20997r0 = multiSelectionViewModel;
    }

    public final boolean c2() {
        return this.f20989j0;
    }

    public final String d2() {
        return this.Y;
    }

    public final RequireDataForBePaymet e2() {
        return this.X;
    }

    public final VahanProService f2() {
        VahanProService vahanProService = this.W;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final void f3(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new m(dialog, this));
        dialog.show();
    }

    public final VahanServiceConnection g2() {
        VahanServiceConnection vahanServiceConnection = this.f20980a0;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService1");
        return null;
    }

    public final boolean h2() {
        return this.f20988i0;
    }

    public final void h3(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new i(dialog));
        dialog.show();
    }

    public final VahanProService i2() {
        VahanProService vahanProService = this.f20983d0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("slotService");
        return null;
    }

    public final bi.h j2() {
        bi.h hVar = this.f20984e0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("slotViewModel");
        return null;
    }

    public final bi.h k2() {
        bi.h hVar = this.V;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final bi.l l2() {
        bi.l lVar = this.Z;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel1");
        return null;
    }

    public final MultiSelectionViewModel m2() {
        MultiSelectionViewModel multiSelectionViewModel = this.f20997r0;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        cm.l.v("viewModelMulti");
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
        W2(aVar.b(this));
        this.Q = ApplicationServiceOtp.f21184a.b(this);
        this.f20994o0 = ApplicationService.f21181a.b(this);
        Class<bi.h> cls = bi.h.class;
        X2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(i2()))).a(cls));
        ApplicationService applicationService = this.f20994o0;
        if (applicationService == null) {
            cm.l.v("paymentService");
            applicationService = null;
        }
        this.f20993n0 = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        M2(MultiService.f21070a.b(this));
        b3((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new com.nic.mparivahan.VahanServices.VahanMultiService.b(V1()))).a(MultiSelectionViewModel.class));
        Q2(new ProgressDialog(this));
        a2().setMessage("Please wait...");
        a2().setCancelable(false);
        a2().setCanceledOnTouchOutside(false);
        U2(aVar.b(this));
        V2(VahanServiceConnection.f21199a.b(this));
        a3((bi.l) new u0((x0) this, (u0.b) new bi.m(new wg.e(g2()))).a(bi.l.class));
        Z2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(f2()))).a(cls));
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
            Type type = new VahanMultiServiceApplicationTransactionStatus$onCreate$type$1().getType();
            cm.l.e(type, "getType(...)");
            Object k10 = new i7.d().k(getIntent().getStringExtra("transList"), type);
            cm.l.d(k10, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel> }");
            ArrayList arrayList = (ArrayList) k10;
            this.P = arrayList;
            String chassisNo = ((ApplStatusTransListModel) arrayList.get(0)).getCurrentlist().get(0).getChassisNo();
            cm.l.c(chassisNo);
            String substring = chassisNo.substring(chassisNo.length() - 5, chassisNo.length());
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.f21000u0 = substring;
        }
        P1();
        n2();
        bi.b bVar2 = this.f20993n0;
        if (bVar2 == null) {
            cm.l.v("viewModelPayment");
            bVar2 = null;
        }
        bVar2.z().g(this, new l(new e(this)));
        bi.b bVar3 = this.f20993n0;
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
        obVar2.f27872x.setOnClickListener(new a(this));
        ob obVar3 = this.H;
        if (obVar3 == null) {
            cm.l.v("binding");
            obVar3 = null;
        }
        obVar3.Z.setOnClickListener(new t(this));
        ob obVar4 = this.H;
        if (obVar4 == null) {
            cm.l.v("binding");
            obVar4 = null;
        }
        obVar4.L.setOnClickListener(new u(this));
        ob obVar5 = this.H;
        if (obVar5 == null) {
            cm.l.v("binding");
            obVar5 = null;
        }
        obVar5.f27865q.setOnClickListener(new v(this));
        m2().p().g(this, new w(this));
        k2().z0().g(this, new x(this));
        bi.b bVar4 = this.f20993n0;
        if (bVar4 == null) {
            cm.l.v("viewModelPayment");
            bVar4 = null;
        }
        bVar4.C().g(this, new l(new g(this)));
        j2().C0().g(this, new l(new a(this)));
        bi.b bVar5 = this.f20993n0;
        if (bVar5 == null) {
            cm.l.v("viewModelPayment");
        } else {
            bVar = bVar5;
        }
        bVar.B().g(this, new l(new b(this)));
        k2().T().g(this, new y(this));
        k2().W().g(this, new z(this));
        k2().U().g(this, new b(this));
        k2().V().g(this, new c(this));
        k2().E0().g(this, new l(new c(this)));
        l2().k().g(this, new l(new d(this)));
        k2().O().g(this, new l(this));
        k2().P().g(this, new s(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        j2().D0().g(this, new l(new h(this)));
        l2().k().g(this, new l(new i(this)));
        j2().T0().g(this, new l(new j(this)));
        j2().S0().g(this, new l(new k(this)));
        j2().F0().g(this, new f(this));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }
}
