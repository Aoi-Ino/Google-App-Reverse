package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService.TOBuyerApplicationService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import dh.a1;
import dh.b1;
import dh.c1;
import dh.d1;
import java.io.Serializable;
import java.util.ArrayList;
import ld.c;
import ni.n8;
import pl.x;

public final class TOBuyerMainActivity extends d {
    public n8 G;
    public lh.a H;
    public TOBuyerApplicationService I;
    public NrvDetails J;
    private boolean K;
    public String L;
    public String M;
    public String N;
    public c O;
    public ProgressDialog P;
    public String Q;
    private TOFetchApplicationDetails R;
    private DoAadhaarResponse S;
    private ArrayList T = new ArrayList();
    private MultiServiceDraftTO U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TOBuyerMainActivity f21374e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TOBuyerMainActivity tOBuyerMainActivity) {
            super(1);
            this.f21374e = tOBuyerMainActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
            r2 = r2.getTransferOwnershipDto();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails r7) {
            /*
                r6 = this;
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                r0.I1(r7)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27642l     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                r3 = 0
                if (r2 == 0) goto L_0x0024
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0024
                java.lang.String r2 = r2.getReason()     // Catch:{ Exception -> 0x0021 }
                goto L_0x0025
            L_0x0021:
                r7 = move-exception
                goto L_0x0192
            L_0x0024:
                r2 = r3
            L_0x0025:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27644n     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x004b
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x004b
                java.lang.String r2 = r2.getOwnerCodeDesc()     // Catch:{ Exception -> 0x0021 }
                goto L_0x004c
            L_0x004b:
                r2 = r3
            L_0x004c:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27638h     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0072
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0072
                java.lang.String r2 = r2.getOwnerCategoryDesc()     // Catch:{ Exception -> 0x0021 }
                goto L_0x0073
            L_0x0072:
                r2 = r3
            L_0x0073:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27640j     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0099
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0099
                java.lang.String r2 = r2.getOwnerName()     // Catch:{ Exception -> 0x0021 }
                goto L_0x009a
            L_0x0099:
                r2 = r3
            L_0x009a:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27634d     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x00c0
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x00c0
                java.lang.String r2 = r2.getFatherName()     // Catch:{ Exception -> 0x0021 }
                goto L_0x00c1
            L_0x00c0:
                r2 = r3
            L_0x00c1:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27651u     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x00eb
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x00eb
                long r4 = r2.getSaleAmmount()     // Catch:{ Exception -> 0x0021 }
                java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0021 }
                goto L_0x00ec
            L_0x00eb:
                r2 = r3
            L_0x00ec:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27653w     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0112
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0112
                java.lang.String r2 = r2.getSaleDate()     // Catch:{ Exception -> 0x0021 }
                goto L_0x0113
            L_0x0112:
                r2 = r3
            L_0x0113:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.TextView r0 = r0.f27636f     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0139
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0139
                java.lang.String r2 = r2.getMobileNo()     // Catch:{ Exception -> 0x0021 }
                goto L_0x013a
            L_0x0139:
                r2 = r3
            L_0x013a:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.EditText r0 = r0.f27646p     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0160
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r2 == 0) goto L_0x0160
                java.lang.String r2 = r2.getPanNo()     // Catch:{ Exception -> 0x0021 }
                goto L_0x0161
            L_0x0160:
                r2 = r3
            L_0x0161:
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r1 = r1.k1(r2)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r1)     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r0 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                ni.n8 r0 = r0.o1()     // Catch:{ Exception -> 0x0021 }
                android.widget.EditText r0 = r0.f27632b     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity r1 = r6.f21374e     // Catch:{ Exception -> 0x0021 }
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r7 = r7.getData()     // Catch:{ Exception -> 0x0021 }
                if (r7 == 0) goto L_0x0186
                com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r7 = r7.getTransferOwnershipDto()     // Catch:{ Exception -> 0x0021 }
                if (r7 == 0) goto L_0x0186
                java.lang.String r3 = r7.getEmailId()     // Catch:{ Exception -> 0x0021 }
            L_0x0186:
                java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0021 }
                java.lang.String r7 = r1.k1(r7)     // Catch:{ Exception -> 0x0021 }
                r0.setText(r7)     // Catch:{ Exception -> 0x0021 }
                goto L_0x0195
            L_0x0192:
                r7.printStackTrace()
            L_0x0195:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity.a.b(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TOFetchApplicationDetails) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21375a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f21375a = lVar;
        }

        public final pl.c a() {
            return this.f21375a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21375a.invoke(obj);
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
    public final String k1(String str) {
        return (str.equals("null") || str.equals("nul") || ka.c.f13158a.m(str)) ? "" : str;
    }

    /* access modifiers changed from: private */
    public static final void v1(TOBuyerMainActivity tOBuyerMainActivity, View view) {
        cm.l.f(tOBuyerMainActivity, "this$0");
        Intent intent = new Intent(tOBuyerMainActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", tOBuyerMainActivity.r1());
        intent.putExtra("RcDetails", tOBuyerMainActivity.s1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, tOBuyerMainActivity.K);
        intent.putExtra(VContant.NEXGEN_addahar_name, tOBuyerMainActivity.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, tOBuyerMainActivity.l1());
        tOBuyerMainActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void w1(TOBuyerMainActivity tOBuyerMainActivity, View view) {
        cm.l.f(tOBuyerMainActivity, "this$0");
        VUtility.Companion.v(tOBuyerMainActivity, tOBuyerMainActivity.p1().b("are_you_sure_you_want_to_leave", tOBuyerMainActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void x1(TOBuyerMainActivity tOBuyerMainActivity, View view) {
        Intent intent;
        cm.l.f(tOBuyerMainActivity, "this$0");
        if (tOBuyerMainActivity.o1().f27632b.length() <= 0 || t8.c.f16582a.r(tOBuyerMainActivity.o1().f27632b.getText().toString())) {
            if (tOBuyerMainActivity.K) {
                new yh.a(tOBuyerMainActivity).d(tOBuyerMainActivity.o1(), tOBuyerMainActivity.n1(), "A", tOBuyerMainActivity.R);
                intent = new Intent(tOBuyerMainActivity, AadhaarAddressTO.class);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, tOBuyerMainActivity.T);
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, tOBuyerMainActivity.U);
                intent.putExtra("stateCd", tOBuyerMainActivity.s1().getState_cd());
                intent.putExtra("off_code", tOBuyerMainActivity.s1().getRc_off_cd());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra("RcDetails", tOBuyerMainActivity.s1());
                intent.putExtra(VContant.NEXGEN_addahar_name, tOBuyerMainActivity.m1());
                intent.putExtra(VContant.NEXGEN_addahar_address, tOBuyerMainActivity.l1());
                intent.putExtra("AadhaarDetails", tOBuyerMainActivity.S);
            } else {
                new yh.a(tOBuyerMainActivity).g(tOBuyerMainActivity.o1(), tOBuyerMainActivity.n1(), "M", tOBuyerMainActivity.R);
                intent = new Intent(tOBuyerMainActivity, AddressDetailToBuyer.class);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, tOBuyerMainActivity.T);
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, tOBuyerMainActivity.U);
                intent.putExtra("stateCd", tOBuyerMainActivity.s1().getState_cd());
                intent.putExtra("off_code", tOBuyerMainActivity.s1().getRc_off_cd());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra("RcDetails", tOBuyerMainActivity.s1());
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            }
            tOBuyerMainActivity.startActivity(intent);
            return;
        }
        Toast.makeText(tOBuyerMainActivity, tOBuyerMainActivity.p1().b("label_log_entr_valid_email", tOBuyerMainActivity.getString(R.string.label_log_entr_valid_email)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void y1(TOBuyerMainActivity tOBuyerMainActivity, View view) {
        cm.l.f(tOBuyerMainActivity, "this$0");
        tOBuyerMainActivity.o1().f27640j.setText("");
        tOBuyerMainActivity.o1().f27634d.setText("");
        tOBuyerMainActivity.o1().f27651u.setText("");
        tOBuyerMainActivity.o1().f27646p.setText("");
        tOBuyerMainActivity.o1().f27632b.setText("");
        tOBuyerMainActivity.o1().f27636f.setText("");
    }

    public final void A1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void B1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void C1(n8 n8Var) {
        cm.l.f(n8Var, "<set-?>");
        this.G = n8Var;
    }

    public final void D1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void E1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.P = progressDialog;
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void G1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.J = nrvDetails;
    }

    public final void H1(TOBuyerApplicationService tOBuyerApplicationService) {
        cm.l.f(tOBuyerApplicationService, "<set-?>");
        this.I = tOBuyerApplicationService;
    }

    public final void I1(TOFetchApplicationDetails tOFetchApplicationDetails) {
        this.R = tOFetchApplicationDetails;
    }

    public final void J1(lh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final String l1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final String n1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("applNo");
        return null;
    }

    public final n8 o1() {
        n8 n8Var = this.G;
        if (n8Var != null) {
            return n8Var;
        }
        cm.l.v("binding");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, p1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n8 c10 = n8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        C1(c10);
        setContentView((View) o1().b());
        H1(TOBuyerApplicationService.f21413a.b(this));
        D1(new c(this));
        A1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        z1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        G1((NrvDetails) serializableExtra);
        this.K = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        cm.l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.U = (MultiServiceDraftTO) serializableExtra2;
        this.T = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        MultiServiceDraftTO multiServiceDraftTO = this.U;
        B1(String.valueOf(multiServiceDraftTO != null ? multiServiceDraftTO.getApplNo() : null));
        F1(String.valueOf(s1().getRc_regn_no()));
        try {
            this.S = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        o1().f27655y.f28308i.setText(String.valueOf(p1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        o1().f27655y.f28304e.setVisibility(0);
        o1().f27655y.f28304e.setText(r1());
        SpannableString spannableString = new SpannableString(r1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        o1().f27655y.f28304e.setText(spannableString);
        o1().f27655y.f28304e.setOnClickListener(new a1(this));
        D1(new c(this));
        if (new ld.h(this).b()) {
            o1().f27649s.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.K;
        LinearLayout linearLayout = o1().f27649s.f27159b;
        cm.l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        E1(new ProgressDialog(this));
        q1().setMessage(p1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        J1((lh.a) new u0((x0) this, (u0.b) new kh.b(new jh.a(t1()))).a(lh.a.class));
        try {
            u1().g(n1(), false, "", "");
        } catch (Exception unused) {
        }
        o1().f27655y.f28305f.setOnClickListener(new b1(this));
        u1().h().g(this, new b(new a(this)));
        o1().f27643m.setOnClickListener(new c1(this));
        o1().f27650t.setOnClickListener(new d1(this));
    }

    public final c p1() {
        c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.P;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String r1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails s1() {
        NrvDetails nrvDetails = this.J;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final TOBuyerApplicationService t1() {
        TOBuyerApplicationService tOBuyerApplicationService = this.I;
        if (tOBuyerApplicationService != null) {
            return tOBuyerApplicationService;
        }
        cm.l.v("retrofitServicePurposeTO");
        return null;
    }

    public final lh.a u1() {
        lh.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModelPurposeTO");
        return null;
    }

    public final void z1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }
}
