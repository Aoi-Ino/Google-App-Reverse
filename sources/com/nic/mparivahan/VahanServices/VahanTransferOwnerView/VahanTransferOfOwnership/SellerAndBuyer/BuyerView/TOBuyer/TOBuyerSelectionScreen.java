package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.a;
import com.nic.mparivahan.VahanServices.VahanMultiService.b;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import dh.e1;
import dh.f1;
import dh.g1;
import dh.h1;
import dh.i1;
import dh.j1;
import dh.k1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import ld.c;
import ni.bc;
import sg.g;

public final class TOBuyerSelectionScreen extends d implements a {
    public String G;
    public NrvDetails H;
    public bc I;
    public ProgressDialog J;
    private Calendar K = Calendar.getInstance();
    private String L;
    public String M;
    public String N;
    public String O;
    private String P = "";
    private boolean Q;
    public c R;
    public MultiSelectionViewModel S;
    public MultiService T;
    private final ArrayList U = new ArrayList();
    private String V = "0";
    private int W;
    public g X;
    private TOFetchApplicationDetails Y;
    private DoAadhaarResponse Z;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r8 = r2.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen r23, android.view.View r24) {
        /*
            r0 = r23
            java.lang.String r1 = "this$0"
            cm.l.f(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x007b }
            r1.<init>()     // Catch:{ Exception -> 0x007b }
            java.util.ArrayList r2 = r0.U     // Catch:{ Exception -> 0x007b }
            int r2 = r2.size()     // Catch:{ Exception -> 0x007b }
            r4 = 0
        L_0x0013:
            java.lang.String r5 = "3"
            if (r4 >= r2) goto L_0x0095
            java.util.ArrayList r6 = r0.U     // Catch:{ Exception -> 0x007b }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x007b }
            rg.a r6 = (rg.a) r6     // Catch:{ Exception -> 0x007b }
            boolean r6 = r6.b()     // Catch:{ Exception -> 0x007b }
            r7 = 1
            if (r6 != r7) goto L_0x0091
            java.lang.String r6 = "6"
            java.util.ArrayList r8 = r0.U     // Catch:{ Exception -> 0x007b }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x007b }
            rg.a r8 = (rg.a) r8     // Catch:{ Exception -> 0x007b }
            int r8 = r8.a()     // Catch:{ Exception -> 0x007b }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x007b }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x007b }
            if (r6 != 0) goto L_0x007e
            java.lang.String r6 = "5"
            java.util.ArrayList r8 = r0.U     // Catch:{ Exception -> 0x007b }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x007b }
            rg.a r8 = (rg.a) r8     // Catch:{ Exception -> 0x007b }
            int r8 = r8.a()     // Catch:{ Exception -> 0x007b }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x007b }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x007b }
            if (r6 != 0) goto L_0x007e
            java.util.ArrayList r6 = r0.U     // Catch:{ Exception -> 0x007b }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x007b }
            rg.a r6 = (rg.a) r6     // Catch:{ Exception -> 0x007b }
            int r6 = r6.a()     // Catch:{ Exception -> 0x007b }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x007b }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x007b }
            if (r5 == 0) goto L_0x0091
            java.util.ArrayList r5 = r0.U     // Catch:{ Exception -> 0x007b }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x007b }
            rg.a r5 = (rg.a) r5     // Catch:{ Exception -> 0x007b }
            boolean r5 = r5.c()     // Catch:{ Exception -> 0x007b }
            if (r5 != r7) goto L_0x0091
            goto L_0x007e
        L_0x007b:
            r0 = move-exception
            goto L_0x0273
        L_0x007e:
            java.util.ArrayList r5 = r0.U     // Catch:{ Exception -> 0x007b }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x007b }
            rg.a r5 = (rg.a) r5     // Catch:{ Exception -> 0x007b }
            int r5 = r5.a()     // Catch:{ Exception -> 0x007b }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x007b }
            r1.add(r5)     // Catch:{ Exception -> 0x007b }
        L_0x0091:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0095:
            int r2 = r1.size()     // Catch:{ Exception -> 0x007b }
            if (r2 <= 0) goto L_0x0276
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails r2 = r0.Y     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r4 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO     // Catch:{ Exception -> 0x007b }
            java.lang.String r7 = r0.P     // Catch:{ Exception -> 0x007b }
            r6 = 0
            if (r2 == 0) goto L_0x00af
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r8 = r2.getData()     // Catch:{ Exception -> 0x007b }
            if (r8 == 0) goto L_0x00af
            java.lang.String r8 = r8.getAuthMode()     // Catch:{ Exception -> 0x007b }
            goto L_0x00b0
        L_0x00af:
            r8 = r6
        L_0x00b0:
            r9 = 0
            java.lang.String r10 = ""
            r11 = 0
            if (r2 == 0) goto L_0x00c1
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r12 = r2.getData()     // Catch:{ Exception -> 0x007b }
            if (r12 == 0) goto L_0x00c1
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto r12 = r12.getDurcdto()     // Catch:{ Exception -> 0x007b }
            goto L_0x00c2
        L_0x00c1:
            r12 = r6
        L_0x00c2:
            r13 = 0
            if (r2 == 0) goto L_0x00d0
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r14 = r2.getData()     // Catch:{ Exception -> 0x007b }
            if (r14 == 0) goto L_0x00d0
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r14 = r14.getHptDto()     // Catch:{ Exception -> 0x007b }
            goto L_0x00d1
        L_0x00d0:
            r14 = r6
        L_0x00d1:
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r15 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r15 = r15.getRc_off_cd()     // Catch:{ Exception -> 0x007b }
            cm.l.c(r15)     // Catch:{ Exception -> 0x007b }
            int r15 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x007b }
            r16 = 0
            if (r2 == 0) goto L_0x00ef
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r17 = r2.getData()     // Catch:{ Exception -> 0x007b }
            if (r17 == 0) goto L_0x00ef
            java.util.ArrayList r17 = r17.getPurposeCode()     // Catch:{ Exception -> 0x007b }
            goto L_0x00f1
        L_0x00ef:
            r17 = r6
        L_0x00f1:
            cm.l.c(r17)     // Catch:{ Exception -> 0x007b }
            java.lang.String r18 = r23.u1()     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r19 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r19 = r19.getState_cd()     // Catch:{ Exception -> 0x007b }
            java.lang.String r20 = "B"
            if (r2 == 0) goto L_0x0111
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r2 = r2.getData()     // Catch:{ Exception -> 0x007b }
            if (r2 == 0) goto L_0x0111
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()     // Catch:{ Exception -> 0x007b }
            r21 = r2
            goto L_0x0113
        L_0x0111:
            r21 = r6
        L_0x0113:
            r22 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x007b }
            java.util.ArrayList r2 = r4.getPurposeCode()     // Catch:{ Exception -> 0x007b }
            int r6 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x007b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x007b }
            boolean r2 = r2.contains(r6)     // Catch:{ Exception -> 0x007b }
            java.lang.String r6 = "7"
            java.lang.String r7 = "aadhaarAddress"
            java.lang.String r8 = "aadhaarName"
            java.lang.String r9 = "Face_Less_Staus"
            java.lang.String r10 = "off_code"
            java.lang.String r11 = "RcDetails"
            java.lang.String r12 = "RC"
            java.lang.String r13 = "AadhaarDetails"
            java.lang.String r14 = "MULTIDRAFT"
            java.lang.String r15 = "MULTIARRAY"
            if (r2 != 0) goto L_0x0151
            java.util.ArrayList r2 = r4.getPurposeCode()     // Catch:{ Exception -> 0x007b }
            int r16 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x007b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x007b }
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x007b }
            if (r2 == 0) goto L_0x0153
        L_0x0151:
            r3 = r7
            goto L_0x01c8
        L_0x0153:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x007b }
            r2.<init>()     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r3.<init>()     // Catch:{ Exception -> 0x007b }
            java.lang.String r5 = "com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer."
            r3.append(r5)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r5 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion     // Catch:{ Exception -> 0x007b }
            r6 = 0
            java.lang.Object r6 = r1.get(r6)     // Catch:{ Exception -> 0x007b }
            r24 = r7
            java.lang.String r7 = "get(...)"
            cm.l.e(r6, r7)     // Catch:{ Exception -> 0x007b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x007b }
            java.lang.String r7 = "B"
            java.lang.String r5 = r5.q(r6, r7)     // Catch:{ Exception -> 0x007b }
            r3.append(r5)     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x007b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x007b }
            r2.setClass(r0, r3)     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r15, r1)     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r14, r4)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r1 = r0.Z     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r13, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.getRc_regn_no()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r12, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r11, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.getRc_off_cd()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r10, r1)     // Catch:{ Exception -> 0x007b }
            boolean r1 = r0.Q     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r9, r1)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r23.q1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r8, r1)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r23.p1()     // Catch:{ Exception -> 0x007b }
            r3 = r24
            r2.putExtra(r3, r1)     // Catch:{ Exception -> 0x007b }
        L_0x01c3:
            r0.startActivity(r2)     // Catch:{ Exception -> 0x007b }
            goto L_0x0276
        L_0x01c8:
            java.util.ArrayList r2 = r4.getPurposeCode()     // Catch:{ Exception -> 0x007b }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x007b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x007b }
            boolean r2 = r2.contains(r5)     // Catch:{ Exception -> 0x007b }
            if (r2 == 0) goto L_0x021d
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x007b }
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.IssueOfDuplicateDetailView> r5 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.IssueOfDuplicateDetailView.class
            r2.<init>(r0, r5)     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r15, r1)     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r14, r4)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r1 = r0.Z     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r13, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.getRc_regn_no()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r12, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r11, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.getRc_off_cd()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r10, r1)     // Catch:{ Exception -> 0x007b }
            boolean r1 = r0.Q     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r9, r1)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r23.q1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r8, r1)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r23.p1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r3, r1)     // Catch:{ Exception -> 0x007b }
            goto L_0x01c3
        L_0x021d:
            java.util.ArrayList r2 = r4.getPurposeCode()     // Catch:{ Exception -> 0x007b }
            int r5 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x007b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x007b }
            boolean r2 = r2.contains(r5)     // Catch:{ Exception -> 0x007b }
            if (r2 == 0) goto L_0x0276
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x007b }
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.HypothecationTerminationViewDetails> r5 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.HypothecationTerminationViewDetails.class
            r2.<init>(r0, r5)     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r15, r1)     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r14, r4)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r1 = r0.Z     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r13, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.getRc_regn_no()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r12, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r11, r1)     // Catch:{ Exception -> 0x007b }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r23.v1()     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.getRc_off_cd()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r10, r1)     // Catch:{ Exception -> 0x007b }
            boolean r1 = r0.Q     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r9, r1)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r23.q1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r8, r1)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r23.p1()     // Catch:{ Exception -> 0x007b }
            r2.putExtra(r3, r1)     // Catch:{ Exception -> 0x007b }
            goto L_0x01c3
        L_0x0273:
            r0.printStackTrace()
        L_0x0276:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen.A1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void B1(TOBuyerSelectionScreen tOBuyerSelectionScreen, View view) {
        l.f(tOBuyerSelectionScreen, "this$0");
        tOBuyerSelectionScreen.U.clear();
        tOBuyerSelectionScreen.y1();
        tOBuyerSelectionScreen.x1().j();
    }

    /* access modifiers changed from: private */
    public static final void C1(TOBuyerSelectionScreen tOBuyerSelectionScreen, View view) {
        l.f(tOBuyerSelectionScreen, "this$0");
        tOBuyerSelectionScreen.m1(tOBuyerSelectionScreen, tOBuyerSelectionScreen.s1().b("are_you_sure_you_want_to_leave", tOBuyerSelectionScreen.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void D1(TOBuyerSelectionScreen tOBuyerSelectionScreen, View view) {
        l.f(tOBuyerSelectionScreen, "this$0");
        tOBuyerSelectionScreen.E1();
    }

    private final void E1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void n1(Dialog dialog, TOBuyerSelectionScreen tOBuyerSelectionScreen, View view) {
        l.f(dialog, "$d");
        l.f(tOBuyerSelectionScreen, "this$0");
        dialog.dismiss();
        tOBuyerSelectionScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z1(TOBuyerSelectionScreen tOBuyerSelectionScreen, View view) {
        l.f(tOBuyerSelectionScreen, "this$0");
        Intent intent = new Intent(tOBuyerSelectionScreen, VahanVehicleDetailsService.class);
        intent.putExtra("RC", tOBuyerSelectionScreen.u1());
        intent.putExtra("RcDetails", tOBuyerSelectionScreen.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, tOBuyerSelectionScreen.Q);
        intent.putExtra(VContant.NEXGEN_addahar_name, tOBuyerSelectionScreen.q1());
        intent.putExtra(VContant.NEXGEN_addahar_address, tOBuyerSelectionScreen.p1());
        tOBuyerSelectionScreen.startActivity(intent);
    }

    public final void F1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void G0() {
        y1();
        O1(new g(this.U, this, this));
        r1().f25562g.setAdapter(x1());
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void H1(bc bcVar) {
        l.f(bcVar, "<set-?>");
        this.I = bcVar;
    }

    public final void I1(c cVar) {
        l.f(cVar, "<set-?>");
        this.R = cVar;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    public final void M1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.H = nrvDetails;
    }

    public final void N1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.T = multiService;
    }

    public final void O1(g gVar) {
        l.f(gVar, "<set-?>");
        this.X = gVar;
    }

    public final void P1(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.S = multiSelectionViewModel;
    }

    public void Q(String str, int i10) {
        l.c(str);
        this.V = str;
        this.W = i10;
        ArrayList arrayList = new ArrayList();
        if (this.U.size() > 0) {
            int size = this.U.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((rg.a) this.U.get(i11)).b()) {
                    arrayList.add(String.valueOf(((rg.a) this.U.get(i11)).a()));
                }
            }
            if (arrayList.size() == 0) {
                arrayList.add(this.V);
            }
            arrayList.add(this.V);
            HashSet hashSet = new HashSet(arrayList);
            arrayList.clear();
            arrayList.addAll(hashSet);
        } else {
            arrayList.add(this.V);
        }
        int indexOf = this.U.indexOf(new rg.a(Integer.parseInt(this.V), false, true));
        rg.a aVar = new rg.a(Integer.parseInt(this.V), true, true);
        this.U.remove(indexOf);
        this.U.add(indexOf, aVar);
        x1().j();
    }

    public void Z(String str, int i10) {
        l.c(str);
        this.U.set(this.U.indexOf(new rg.a(Integer.parseInt(str), true, true)), new rg.a(Integer.parseInt(str), false, true));
        x1().j();
    }

    public final void m1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new e1(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new f1(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        m1(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.multiservicelayout);
        bc c10 = bc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        H1(c10);
        setContentView((View) r1().b());
        getWindow().addFlags(128);
        I1(new c(this));
        N1(MultiService.f21070a.b(this));
        P1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(w1()))).a(MultiSelectionViewModel.class));
        K1(new ProgressDialog(this));
        t1().setMessage("Please wait...");
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        this.P = String.valueOf(getIntent().getStringExtra("applNo"));
        Serializable serializableExtra = getIntent().getSerializableExtra("Buyerdetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails");
        this.Y = (TOFetchApplicationDetails) serializableExtra;
        L1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        M1((NrvDetails) serializableExtra2);
        J1(String.valueOf(getIntent().getStringExtra("off_code")));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.Q = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        L1(String.valueOf(v1().getRc_regn_no()));
        try {
            Serializable serializableExtra3 = getIntent().getSerializableExtra("AadhaarDetails");
            l.d(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse");
            this.Z = (DoAadhaarResponse) serializableExtra3;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        I1(new c(this));
        this.L = v1().getState_cd();
        r1().f25561f.f28304e.setVisibility(0);
        SpannableString spannableString = new SpannableString(u1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        r1().f25561f.f28308i.setText(String.valueOf(s1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        r1().f25561f.f28304e.setText(spannableString);
        r1().f25562g.setLayoutManager(new GridLayoutManager(this, 3));
        r1().f25561f.f28304e.setOnClickListener(new g1(this));
        if (this.Y != null) {
            G0();
        }
        r1().f25559d.setOnClickListener(new h1(this));
        r1().f25558c.setOnClickListener(new i1(this));
        r1().f25561f.f28305f.setOnClickListener(new j1(this));
        r1().f25561f.f28306g.setOnClickListener(new k1(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        m1(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final String p1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String q1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final bc r1() {
        bc bcVar = this.I;
        if (bcVar != null) {
            return bcVar;
        }
        l.v("binding");
        return null;
    }

    public final c s1() {
        c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.H;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final MultiService w1() {
        MultiService multiService = this.T;
        if (multiService != null) {
            return multiService;
        }
        l.v("retrofitService");
        return null;
    }

    public final g x1() {
        g gVar = this.X;
        if (gVar != null) {
            return gVar;
        }
        l.v("selectionAdapter");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r7 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r0.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y1() {
        /*
            r12 = this;
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails r0 = r12.Y
            java.lang.String r1 = "3"
            java.lang.String r2 = "5"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0076
            r5 = 0
            if (r0 == 0) goto L_0x0018
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r0 = r0.getData()
            if (r0 == 0) goto L_0x0018
            java.util.ArrayList r0 = r0.getPurposeCode()
            goto L_0x0019
        L_0x0018:
            r0 = r5
        L_0x0019:
            if (r0 == 0) goto L_0x001f
            hm.c r5 = ql.q.j(r0)
        L_0x001f:
            cm.l.c(r5)
            int r6 = r5.l()
            int r5 = r5.n()
            if (r6 > r5) goto L_0x0076
            r7 = r4
        L_0x002d:
            java.lang.Object r8 = r0.get(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x006f
            java.util.ArrayList r8 = r12.U
            rg.a r9 = new rg.a
            java.lang.Object r10 = r0.get(r6)
            java.lang.String r11 = "get(...)"
            cm.l.e(r10, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r9.<init>(r10, r3, r4)
            r8.add(r9)
            java.lang.Object r8 = r0.get(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x006f
            r7 = r3
        L_0x006f:
            if (r6 == r5) goto L_0x0074
            int r6 = r6 + 1
            goto L_0x002d
        L_0x0074:
            if (r7 != 0) goto L_0x0084
        L_0x0076:
            java.util.ArrayList r0 = r12.U
            rg.a r5 = new rg.a
            int r1 = java.lang.Integer.parseInt(r1)
            r5.<init>(r1, r4, r3)
            r0.add(r5)
        L_0x0084:
            java.util.ArrayList r0 = r12.U
            rg.a r1 = new rg.a
            java.lang.String r5 = "6"
            int r5 = java.lang.Integer.parseInt(r5)
            r1.<init>(r5, r4, r3)
            r0.add(r1)
            java.util.ArrayList r0 = r12.U
            rg.a r1 = new rg.a
            int r2 = java.lang.Integer.parseInt(r2)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen.y1():void");
    }
}
