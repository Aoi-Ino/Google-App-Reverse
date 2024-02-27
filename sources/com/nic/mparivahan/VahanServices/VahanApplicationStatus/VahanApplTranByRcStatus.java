package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

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
import bi.g;
import bi.h;
import bi.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.Applnolist;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.Model.VTHypthEntity;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;
import java.io.Serializable;
import java.util.HashMap;
import ni.ob;
import pl.x;

public final class VahanApplTranByRcStatus extends androidx.appcompat.app.d {
    private final Context G = this;
    private ob H;
    /* access modifiers changed from: private */
    public String I = "";
    private String J = "";
    private String K = "";
    /* access modifiers changed from: private */
    public String L = "";
    public NrvDetails M;
    private String N = "0";
    private ApplicationServiceOtp O;
    private HashMap P = new HashMap();
    private boolean Q;
    private boolean R;
    public ProgressDialog S;
    public h T;
    public VahanProService U;
    public RequireDataForBePaymet V;
    private String W = "0";
    public l X;
    public VahanServiceConnection Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f20760a0;

    /* renamed from: b0  reason: collision with root package name */
    public VahanProService f20761b0;

    /* renamed from: c0  reason: collision with root package name */
    public h f20762c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f20763d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f20764e0;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplTranByRcStatus f20765e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanApplTranByRcStatus vahanApplTranByRcStatus) {
            super(1);
            this.f20765e = vahanApplTranByRcStatus;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        String str = ownerDetailPuccPermit.getP_add1() + ", " + ownerDetailPuccPermit.getP_add2() + ',' + ownerDetailPuccPermit.getP_add3();
                        String str2 = ownerDetailPuccPermit.getC_add1() + ", " + ownerDetailPuccPermit.getC_add2() + ',' + ownerDetailPuccPermit.getC_add3();
                        VahanApplTranByRcStatus vahanApplTranByRcStatus = this.f20765e;
                        String fit_upto = ownerDetailPuccPermit.getFit_upto();
                        String norms_descr = ownerDetailPuccPermit.getNorms_descr();
                        String fuel_descr = ownerDetailPuccPermit.getFuel_descr();
                        String regn_dt = ownerDetailPuccPermit.getRegn_dt();
                        String model_name = ownerDetailPuccPermit.getModel_name();
                        String maker_name = ownerDetailPuccPermit.getMaker_name();
                        String valueOf = String.valueOf(ownerDetailPuccPermit.getVch_catg_desc());
                        String vh_class_desc = ownerDetailPuccPermit.getVh_class_desc();
                        String f_name = ownerDetailPuccPermit.getF_name();
                        String owner_name = ownerDetailPuccPermit.getOwner_name();
                        String c_state = ownerDetailPuccPermit.getC_state();
                        String chasi_no = ownerDetailPuccPermit.getChasi_no();
                        String eng_no = ownerDetailPuccPermit.getEng_no();
                        String valueOf2 = String.valueOf(ownerDetailPuccPermit.getMobile_no());
                        String valueOf3 = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                        String valueOf4 = String.valueOf(ownerDetailPuccPermit.getOwner_sr());
                        String regn_no2 = ownerDetailPuccPermit.getRegn_no();
                        String state_cd = ownerDetailPuccPermit.getState_cd();
                        String vch_catg = ownerDetailPuccPermit.getVch_catg();
                        String valueOf5 = String.valueOf(ownerDetailPuccPermit.getVh_class());
                        String vehType = ownerDetailPuccPermit.getVehType();
                        Integer vehTypeAsInt = ownerDetailPuccPermit.getVehTypeAsInt();
                        Integer seat_cap = ownerDetailPuccPermit.getSeat_cap();
                        vahanApplTranByRcStatus.W1(new NrvDetails(fit_upto, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", norms_descr, fuel_descr, regn_dt, model_name, maker_name, valueOf, vh_class_desc, f_name, owner_name, c_state, chasi_no, eng_no, valueOf2, valueOf3, valueOf4, str, str2, regn_no2, state_cd, vch_catg, valueOf5, vehType, vehTypeAsInt, seat_cap != null ? Integer.valueOf(seat_cap.intValue()) : null, 0, "0", "0", "", (VTHypthEntity) null));
                        Intent intent = new Intent(this.f20765e, VahanDmsAPI.class);
                        intent.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                        intent.putExtra(VContant.APP_NO, this.f20765e.I);
                        intent.putExtra("rc_number", this.f20765e.L);
                        intent.putExtra(VContant.PURPOSE_CODE, this.f20765e.z1());
                        String q12 = this.f20765e.I;
                        String valueOf6 = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                        String z12 = this.f20765e.z1();
                        String rcpt_dt = this.f20765e.A1().getRcpt_dt();
                        String return_rcpt_no = this.f20765e.A1().getReturn_rcpt_no();
                        Double valueOf7 = Double.valueOf((double) this.f20765e.A1().getRcpt_amt());
                        String regn_no3 = ownerDetailPuccPermit.getRegn_no();
                        String state_cd2 = this.f20765e.A1().getState_cd();
                        String rc_vh_class_cd = this.f20765e.x1().getRc_vh_class_cd();
                        BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest((String) null, (Boolean) null, "", q12, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, " ", " ", (HPAResModle) null, (HptTerResponse) null, 0, " ", 0, "", "", (NocDraftResponse) null, valueOf6, " ", " ", " ", z12, rcpt_dt, return_rcpt_no, valueOf7, 0, regn_no3, state_cd2, "", "", "", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null);
                        intent.putExtra("off_code", ownerDetailPuccPermit.getOff_cd());
                        intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
                        intent.putExtra(VContant.NEXGEN_isFACELESS, this.f20765e.w1());
                        intent.putExtra("RC", this.f20765e.L);
                        intent.putExtra("RcDetails", this.f20765e.x1());
                        intent.putExtra("vahlogReptDate", this.f20765e.A1().getRcpt_dt());
                        intent.putExtra("vahlogFeeAmt", this.f20765e.A1().getRcpt_amt());
                        intent.putExtra("vahlogReptNo", this.f20765e.A1().getReturn_rcpt_no());
                        intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                        intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                        this.f20765e.startActivity(intent);
                        this.f20765e.finish();
                        return;
                    }
                }
                this.f20765e.y1().dismiss();
            } catch (Exception e10) {
                this.f20765e.y1().dismiss();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplTranByRcStatus f20766e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanApplTranByRcStatus vahanApplTranByRcStatus) {
            super(1);
            this.f20766e = vahanApplTranByRcStatus;
        }

        public final void b(String str) {
            this.f20766e.y1().dismiss();
            VahanApplTranByRcStatus vahanApplTranByRcStatus = this.f20766e;
            vahanApplTranByRcStatus.g2(vahanApplTranByRcStatus, vahanApplTranByRcStatus.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplTranByRcStatus f20767e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanApplTranByRcStatus vahanApplTranByRcStatus) {
            super(1);
            this.f20767e = vahanApplTranByRcStatus;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f20767e.y1().isShowing()) {
                    this.f20767e.y1().dismiss();
                }
                Intent intent = new Intent(this.f20767e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f20767e.z1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", this.f20767e.L);
                intent.putExtra("RcDetails", this.f20767e.x1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                this.f20767e.startActivity(intent);
                this.f20767e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotUserDataModel) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanApplTranByRcStatus f20768e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanApplTranByRcStatus vahanApplTranByRcStatus) {
            super(1);
            this.f20768e = vahanApplTranByRcStatus;
        }

        public final void b(String str) {
            try {
                if (this.f20768e.y1().isShowing()) {
                    this.f20768e.y1().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    VahanApplTranByRcStatus vahanApplTranByRcStatus = this.f20768e;
                    Toast.makeText(vahanApplTranByRcStatus, vahanApplTranByRcStatus.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null) {
                    if (!p.q(str)) {
                        this.f20768e.S1(str);
                        return;
                    }
                }
                VahanApplTranByRcStatus vahanApplTranByRcStatus2 = this.f20768e;
                vahanApplTranByRcStatus2.S1(vahanApplTranByRcStatus2.getString(R.string.service_unavable_please_try));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20769a;

        e(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f20769a = lVar;
        }

        public final pl.c a() {
            return this.f20769a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20769a.invoke(obj);
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

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c6 A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0206 A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0274 A[ADDED_TO_REGION, Catch:{ Exception -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void I1() {
        /*
            r12 = this;
            java.lang.String r0 = "jbbkssk"
            ni.ob r1 = r12.H
            java.lang.String r2 = "binding"
            r3 = 0
            if (r1 != 0) goto L_0x000d
            cm.l.v(r2)
            r1 = r3
        L_0x000d:
            android.widget.LinearLayout r1 = r1.f27855g
            r4 = 8
            r1.setVisibility(r4)
            ni.ob r1 = r12.H
            if (r1 != 0) goto L_0x001c
            cm.l.v(r2)
            r1 = r3
        L_0x001c:
            ni.qd r1 = r1.f27859k
            androidx.appcompat.widget.AppCompatImageView r1 = r1.f28305f
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.o r5 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.o
            r5.<init>(r12)
            r1.setOnClickListener(r5)
            ni.ob r1 = r12.H
            if (r1 != 0) goto L_0x0030
            cm.l.v(r2)
            r1 = r3
        L_0x0030:
            ni.qd r1 = r1.f27859k
            android.widget.RelativeLayout r1 = r1.f28306g
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.f r5 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.f
            r5.<init>(r12)
            r1.setOnClickListener(r5)
            java.lang.String r1 = r12.v1()     // Catch:{ Exception -> 0x005a }
            r12.d2(r1)     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = r12.v1()     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = "PENDING IN DRAFT"
            r6 = 2
            r7 = 0
            boolean r1 = km.q.F(r1, r5, r7, r6, r3)     // Catch:{ Exception -> 0x005a }
            if (r1 == 0) goto L_0x007e
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x005d
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            goto L_0x02d9
        L_0x005d:
            android.widget.LinearLayout r0 = r0.f27864p     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x006a
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x006a:
            android.widget.LinearLayout r0 = r0.f27849c0     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0077
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x0077:
            android.widget.LinearLayout r0 = r0.M     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x02dc
        L_0x007e:
            java.lang.String r1 = "Pending3"
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = r12.F1()     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = "DOCUMENT UPLOAD PENDING AT ONLINE SERVICE"
            boolean r1 = km.q.F(r1, r5, r7, r6, r3)     // Catch:{ Exception -> 0x005a }
            r5 = 2131100579(0x7f0603a3, float:1.7813543E38)
            r6 = 2131230934(0x7f0800d6, float:1.8077935E38)
            r8 = 2131099809(0x7f0600a1, float:1.7811982E38)
            java.lang.String r9 = "Completed"
            r10 = 1
            if (r1 == 0) goto L_0x0107
            boolean r1 = r12.Z     // Catch:{ Exception -> 0x005a }
            if (r1 != r10) goto L_0x0107
            java.lang.String r1 = "Pending311"
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x00ac
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x00ac:
            android.widget.LinearLayout r1 = r1.f27864p     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x00b9
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x00b9:
            android.widget.LinearLayout r1 = r1.f27849c0     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x00c6
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x00c6:
            android.widget.TextView r1 = r1.f27853e0     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x00d3
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x00d3:
            android.widget.TextView r1 = r1.Z     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x00e0
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x00e0:
            android.widget.LinearLayout r1 = r1.M     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            boolean r1 = r12.Q     // Catch:{ Exception -> 0x005a }
            if (r1 == 0) goto L_0x00f8
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x00f1
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x00f1:
            android.widget.LinearLayout r1 = r1.M     // Catch:{ Exception -> 0x005a }
        L_0x00f3:
            r1.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x01c2
        L_0x00f8:
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0100
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0100:
            android.widget.LinearLayout r1 = r1.M     // Catch:{ Exception -> 0x005a }
        L_0x0102:
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            goto L_0x01c2
        L_0x0107:
            boolean r1 = r12.Z     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01c2
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0113
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0113:
            android.widget.LinearLayout r1 = r1.f27864p     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0120
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0120:
            android.widget.LinearLayout r1 = r1.f27849c0     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x012d
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x012d:
            android.widget.TextView r1 = r1.f27853e0     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x013a
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x013a:
            android.widget.TextView r1 = r1.Z     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0147
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0147:
            android.widget.LinearLayout r1 = r1.M     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0154
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0154:
            android.widget.TextView r1 = r1.f27853e0     // Catch:{ Exception -> 0x005a }
            r1.setText(r9)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0161
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0161:
            android.widget.TextView r1 = r1.f27853e0     // Catch:{ Exception -> 0x005a }
            int r11 = r12.getColor(r8)     // Catch:{ Exception -> 0x005a }
            r1.setTextColor(r11)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0172
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0172:
            android.widget.TextView r1 = r1.f27863o     // Catch:{ Exception -> 0x005a }
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r6)     // Catch:{ Exception -> 0x005a }
            r1.setBackgroundDrawable(r11)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0183
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0183:
            android.widget.TextView r1 = r1.f27863o     // Catch:{ Exception -> 0x005a }
            int r11 = r12.getColor(r5)     // Catch:{ Exception -> 0x005a }
            r1.setTextColor(r11)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0194
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x0194:
            android.widget.ImageView r1 = r1.f27851d0     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01a1
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x01a1:
            android.widget.TextView r1 = r1.Z     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            boolean r1 = r12.Q     // Catch:{ Exception -> 0x005a }
            if (r1 == 0) goto L_0x01b6
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01b2
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x01b2:
            android.widget.LinearLayout r1 = r1.M     // Catch:{ Exception -> 0x005a }
            goto L_0x00f3
        L_0x01b6:
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01be
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x01be:
            android.widget.LinearLayout r1 = r1.M     // Catch:{ Exception -> 0x005a }
            goto L_0x0102
        L_0x01c2:
            boolean r1 = r12.f20760a0     // Catch:{ Exception -> 0x005a }
            if (r1 == 0) goto L_0x01fe
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01ce
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x01ce:
            android.widget.LinearLayout r1 = r1.f27849c0     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01db
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x01db:
            android.widget.TextView r1 = r1.Z     // Catch:{ Exception -> 0x005a }
            r1.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01e8
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x01e8:
            android.widget.TextView r1 = r1.f27853e0     // Catch:{ Exception -> 0x005a }
            java.lang.String r11 = "Rejected"
            r1.setText(r11)     // Catch:{ Exception -> 0x005a }
            ni.ob r1 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x01f7
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r1 = r3
        L_0x01f7:
            android.widget.TextView r1 = r1.Z     // Catch:{ Exception -> 0x005a }
            java.lang.String r11 = "Reupload"
            r1.setText(r11)     // Catch:{ Exception -> 0x005a }
        L_0x01fe:
            boolean r1 = r12.Q     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x0274
            boolean r11 = r12.R     // Catch:{ Exception -> 0x005a }
            if (r11 != 0) goto L_0x0274
            java.lang.String r1 = "Pending4"
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0213
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x0213:
            android.widget.LinearLayout r0 = r0.M     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0220
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x0220:
            android.widget.TextView r0 = r0.O     // Catch:{ Exception -> 0x005a }
            r0.setText(r9)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x022d
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x022d:
            android.widget.TextView r0 = r0.O     // Catch:{ Exception -> 0x005a }
            int r1 = r12.getColor(r8)     // Catch:{ Exception -> 0x005a }
            r0.setTextColor(r1)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x023e
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x023e:
            android.widget.TextView r0 = r0.f27862n     // Catch:{ Exception -> 0x005a }
            android.graphics.drawable.Drawable r1 = r12.getDrawable(r6)     // Catch:{ Exception -> 0x005a }
            r0.setBackgroundDrawable(r1)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x024f
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x024f:
            android.widget.TextView r0 = r0.f27862n     // Catch:{ Exception -> 0x005a }
            int r1 = r12.getColor(r5)     // Catch:{ Exception -> 0x005a }
            r0.setTextColor(r1)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0260
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x0260:
            android.widget.TextView r0 = r0.L     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x026d
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x026d:
            android.widget.ImageView r0 = r0.N     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            goto L_0x02dc
        L_0x0274:
            if (r1 != 0) goto L_0x02dc
            boolean r0 = r12.R     // Catch:{ Exception -> 0x005a }
            if (r0 != r10) goto L_0x02dc
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x0282
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x0282:
            android.widget.LinearLayout r0 = r0.M     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x028f
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x028f:
            android.widget.TextView r0 = r0.O     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = "Pending"
            r0.setText(r1)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x029e
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x029e:
            android.widget.TextView r0 = r0.L     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r7)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x02ab
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x02ab:
            android.widget.ImageView r0 = r0.N     // Catch:{ Exception -> 0x005a }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x02b8
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x02b8:
            android.widget.TextView r0 = r0.f27862n     // Catch:{ Exception -> 0x005a }
            r1 = 2131230937(0x7f0800d9, float:1.807794E38)
            android.graphics.drawable.Drawable r1 = r12.getDrawable(r1)     // Catch:{ Exception -> 0x005a }
            r0.setBackgroundDrawable(r1)     // Catch:{ Exception -> 0x005a }
            ni.ob r0 = r12.H     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x02cc
            cm.l.v(r2)     // Catch:{ Exception -> 0x005a }
            r0 = r3
        L_0x02cc:
            android.widget.TextView r0 = r0.f27862n     // Catch:{ Exception -> 0x005a }
            r1 = 2131100581(0x7f0603a5, float:1.7813547E38)
            int r1 = r12.getColor(r1)     // Catch:{ Exception -> 0x005a }
            r0.setTextColor(r1)     // Catch:{ Exception -> 0x005a }
            goto L_0x02dc
        L_0x02d9:
            r0.printStackTrace()
        L_0x02dc:
            java.lang.String r0 = r12.I
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02f3
            ni.ob r0 = r12.H
            if (r0 != 0) goto L_0x02ec
            cm.l.v(r2)
            r0 = r3
        L_0x02ec:
            android.widget.TextView r0 = r0.f27852e
            java.lang.String r1 = r12.I
            r0.setText(r1)
        L_0x02f3:
            java.lang.String r0 = r12.J
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x030a
            ni.ob r0 = r12.H
            if (r0 != 0) goto L_0x0303
            cm.l.v(r2)
            r0 = r3
        L_0x0303:
            android.widget.TextView r0 = r0.f27856h
            java.lang.String r1 = r12.J
            r0.setText(r1)
        L_0x030a:
            java.lang.String r0 = r12.K
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x035c
            java.util.HashMap r0 = r12.P
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x031c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x035c
            java.lang.Object r1 = r0.next()
            java.lang.String r4 = "next(...)"
            cm.l.e(r1, r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r4 = r12.P
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r12.K
            boolean r1 = cm.l.a(r1, r5)
            if (r1 == 0) goto L_0x034c
            ni.ob r0 = r12.H
            if (r0 != 0) goto L_0x0345
            cm.l.v(r2)
            goto L_0x0346
        L_0x0345:
            r3 = r0
        L_0x0346:
            android.widget.TextView r0 = r3.Q
            r0.setText(r4)
            return
        L_0x034c:
            ni.ob r1 = r12.H
            if (r1 != 0) goto L_0x0354
            cm.l.v(r2)
            r1 = r3
        L_0x0354:
            android.widget.TextView r1 = r1.Q
            java.lang.String r4 = r12.K
            r1.setText(r4)
            goto L_0x031c
        L_0x035c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplTranByRcStatus.I1():void");
    }

    /* access modifiers changed from: private */
    public static final void J1(VahanApplTranByRcStatus vahanApplTranByRcStatus, View view) {
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        vahanApplTranByRcStatus.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanApplTranByRcStatus vahanApplTranByRcStatus, View view) {
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        vahanApplTranByRcStatus.R1();
    }

    /* access modifiers changed from: private */
    public static final void L1(VahanApplTranByRcStatus vahanApplTranByRcStatus, View view) {
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        ob obVar = vahanApplTranByRcStatus.H;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        obVar.f27872x.setVisibility(8);
        Dialog dialog = new Dialog(vahanApplTranByRcStatus.G, 16973834);
        dialog.setContentView(R.layout.layout_download_documents);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.id_statusDocumentCancel);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById).setOnClickListener(new n(dialog, vahanApplTranByRcStatus));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M1(Dialog dialog, VahanApplTranByRcStatus vahanApplTranByRcStatus, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        dialog.dismiss();
        ob obVar = vahanApplTranByRcStatus.H;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        obVar.f27872x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void N1(VahanApplTranByRcStatus vahanApplTranByRcStatus, View view) {
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        vahanApplTranByRcStatus.y1().show();
        vahanApplTranByRcStatus.G1().s(vahanApplTranByRcStatus, vahanApplTranByRcStatus.I);
    }

    /* access modifiers changed from: private */
    public static final void O1(VahanApplTranByRcStatus vahanApplTranByRcStatus, View view) {
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        try {
            if (!vahanApplTranByRcStatus.Z) {
                vahanApplTranByRcStatus.y1().show();
                vahanApplTranByRcStatus.t1(vahanApplTranByRcStatus.I);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void P1(VahanApplTranByRcStatus vahanApplTranByRcStatus, RequireDataForBePaymet requireDataForBePaymet) {
        String str;
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        vahanApplTranByRcStatus.y1().dismiss();
        if (requireDataForBePaymet != null) {
            vahanApplTranByRcStatus.Y1(requireDataForBePaymet);
            if (q.F(vahanApplTranByRcStatus.W, ".0", false, 2, (Object) null)) {
                String str2 = vahanApplTranByRcStatus.W;
                str = str2.substring(0, str2.length() - 2);
                cm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = vahanApplTranByRcStatus.W;
            }
            vahanApplTranByRcStatus.N = q.B0(str).toString();
            vahanApplTranByRcStatus.H1().j(vahanApplTranByRcStatus, requireDataForBePaymet.getRegn_no(), requireDataForBePaymet.getState_cd(), vahanApplTranByRcStatus.N, "");
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(VahanApplTranByRcStatus vahanApplTranByRcStatus, String str) {
        cm.l.f(vahanApplTranByRcStatus, "this$0");
        vahanApplTranByRcStatus.y1().dismiss();
    }

    private final void R1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void S1(String str) {
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
        textView.setOnClickListener(new l(dialog));
        textView2.setOnClickListener(new m(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void h2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void t1(String str) {
        try {
            E1().l(this, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void u1() {
        this.P.put("AN", "Andaman and Nicobar Islands");
        this.P.put("AP", "Andhra Pradesh");
        this.P.put("AR", "Arunachal Pradesh");
        this.P.put("AS", "Assam");
        this.P.put("BR", "Bihar");
        this.P.put("CG", "Chandigarh");
        this.P.put("CH", "Chandigarh");
        this.P.put("DH", "Dadra and Nagar Haveli");
        this.P.put("DD", "Daman and Diu");
        this.P.put("DL", "Delhi");
        this.P.put("GA", "Goa");
        this.P.put("GJ", "Gujarat");
        this.P.put("HR", "Haryana");
        this.P.put("HP", "Himachal Pradesh");
        this.P.put("JK", "Jammu and Kashmir");
        this.P.put("JH", "Jharkhand");
        this.P.put("KA", "Karnataka");
        this.P.put("KL", "Kerala");
        this.P.put("LD", "Lakshadweep");
        this.P.put("MP", "Madhya Pradesh");
        this.P.put("MH", "Maharashtra");
        this.P.put("MN", "Manipur");
        this.P.put("ML", "Meghalaya");
        this.P.put("MZ", "Mizoram");
        this.P.put("NL", "Nagaland");
        this.P.put("OR", "Odisha");
        this.P.put("PY", "Puducherry");
        this.P.put("PB", "Punjab");
        this.P.put("RJ", "Rajasthan");
        this.P.put("SK", "Sikkim");
        this.P.put("TN", "Tamil Nadu");
        this.P.put("TS", "Telangana");
        this.P.put("TR", "Tripura");
        this.P.put("UK", "Uttarakhand");
        this.P.put("UP", "Uttar Pradesh");
        this.P.put("WB", "West Bengal");
    }

    public final RequireDataForBePaymet A1() {
        RequireDataForBePaymet requireDataForBePaymet = this.V;
        if (requireDataForBePaymet != null) {
            return requireDataForBePaymet;
        }
        cm.l.v("reqBeforPayment");
        return null;
    }

    public final VahanProService B1() {
        VahanProService vahanProService = this.U;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanServiceConnection C1() {
        VahanServiceConnection vahanServiceConnection = this.Y;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService1");
        return null;
    }

    public final VahanProService D1() {
        VahanProService vahanProService = this.f20761b0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("slotService");
        return null;
    }

    public final h E1() {
        h hVar = this.f20762c0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("slotViewModel");
        return null;
    }

    public final String F1() {
        String str = this.f20764e0;
        if (str != null) {
            return str;
        }
        cm.l.v("status");
        return null;
    }

    public final h G1() {
        h hVar = this.T;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final l H1() {
        l lVar = this.X;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel1");
        return null;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20763d0 = str;
    }

    public final void W1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void X1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.S = progressDialog;
    }

    public final void Y1(RequireDataForBePaymet requireDataForBePaymet) {
        cm.l.f(requireDataForBePaymet, "<set-?>");
        this.V = requireDataForBePaymet;
    }

    public final void Z1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.U = vahanProService;
    }

    public final void a2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.Y = vahanServiceConnection;
    }

    public final void b2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f20761b0 = vahanProService;
    }

    public final void c2(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f20762c0 = hVar;
    }

    public final void d2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20764e0 = str;
    }

    public final void e2(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.T = hVar;
    }

    public final void f2(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.X = lVar;
    }

    public final void g2(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new k(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout_aplication_transaction_status);
        ob c10 = ob.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.H = c10;
        VahanProService.a aVar = VahanProService.f21196b;
        b2(aVar.b(this));
        this.O = ApplicationServiceOtp.f21184a.b(this);
        Class<h> cls = h.class;
        c2((h) new u0((x0) this, (u0.b) new g(new wg.d(D1()))).a(cls));
        X1(new ProgressDialog(this));
        y1().setMessage("Please wait...");
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        Z1(aVar.b(this));
        a2(VahanServiceConnection.f21199a.b(this));
        f2((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(C1()))).a(l.class));
        e2((h) new u0((x0) this, (u0.b) new g(new wg.d(B1()))).a(cls));
        ob obVar = this.H;
        ob obVar2 = null;
        if (obVar == null) {
            cm.l.v("binding");
            obVar = null;
        }
        setContentView((View) obVar.b());
        if (getIntent() != null) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("list");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.ApplicationStatusModel.Applnolist");
                Applnolist applnolist = (Applnolist) serializableExtra;
                if (!ka.c.f13158a.m(applnolist.getAppl_no())) {
                    this.I = applnolist.getAppl_no();
                    String regno = applnolist.getRegno();
                    this.L = regno;
                    String substring = regno.substring(0, 2);
                    cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    this.K = substring;
                    this.N = String.valueOf(applnolist.getPurCd());
                    this.W = String.valueOf(applnolist.getPurCd());
                    ob obVar3 = this.H;
                    if (obVar3 == null) {
                        cm.l.v("binding");
                        obVar3 = null;
                    }
                    obVar3.f27856h.setText("--");
                    ob obVar4 = this.H;
                    if (obVar4 == null) {
                        cm.l.v("binding");
                        obVar4 = null;
                    }
                    obVar4.f27852e.setText(this.I);
                    ob obVar5 = this.H;
                    if (obVar5 == null) {
                        cm.l.v("binding");
                        obVar5 = null;
                    }
                    obVar5.f27850d.setText(applnolist.getAppl_dt());
                    ob obVar6 = this.H;
                    if (obVar6 == null) {
                        cm.l.v("binding");
                        obVar6 = null;
                    }
                    obVar6.G.setText(applnolist.getRegno());
                    ob obVar7 = this.H;
                    if (obVar7 == null) {
                        cm.l.v("binding");
                        obVar7 = null;
                    }
                    obVar7.f27846b.setText(applnolist.getOffName());
                    this.Q = applnolist.getFacelesstransaction();
                    this.Z = applnolist.getIsdocuploadpending();
                    this.f20760a0 = applnolist.getIsrtorejection();
                    V1(applnolist.getStatusDesc());
                    this.R = applnolist.getAppointmentpending();
                    ob obVar8 = this.H;
                    if (obVar8 == null) {
                        cm.l.v("binding");
                        obVar8 = null;
                    }
                    obVar8.f27848c.setText(v1());
                    ob obVar9 = this.H;
                    if (obVar9 == null) {
                        cm.l.v("binding");
                        obVar9 = null;
                    }
                    obVar9.f27860l.setText(applnolist.getPurCdDescr());
                }
            } catch (Exception unused) {
            }
        }
        u1();
        I1();
        ob obVar10 = this.H;
        if (obVar10 == null) {
            cm.l.v("binding");
            obVar10 = null;
        }
        obVar10.f27872x.setOnClickListener(new e(this));
        ob obVar11 = this.H;
        if (obVar11 == null) {
            cm.l.v("binding");
            obVar11 = null;
        }
        obVar11.Z.setOnClickListener(new g(this));
        ob obVar12 = this.H;
        if (obVar12 == null) {
            cm.l.v("binding");
        } else {
            obVar2 = obVar12;
        }
        obVar2.L.setOnClickListener(new h(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        G1().T().g(this, new i(this));
        G1().W().g(this, new j(this));
        H1().l().g(this, new e(new a(this)));
        H1().k().g(this, new e(new b(this)));
        E1().T0().g(this, new e(new c(this)));
        E1().S0().g(this, new e(new d(this)));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    public final String v1() {
        String str = this.f20763d0;
        if (str != null) {
            return str;
        }
        cm.l.v("current_status");
        return null;
    }

    public final boolean w1() {
        return this.Q;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.S;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String z1() {
        return this.N;
    }
}
