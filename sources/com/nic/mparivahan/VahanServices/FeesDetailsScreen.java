package com.nic.mparivahan.VahanServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPayment;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import ld.c;
import ni.s4;
import qe.b;
import wd.a0;
import wd.b0;
import wd.x;
import wd.y;
import wd.z;

public final class FeesDetailsScreen extends d {
    public h G;
    public VahanProService H;
    public ProgressDialog I;
    private ChaangeOfAddressStatus J;
    public s4 K;
    private HptTerResponse L;
    private HPAResModle M;
    private dulicateRcResponseModle N;
    private DuplicateFitessDraft O;
    private Data P;
    private com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data Q;
    private DuplicatePermitDraft R;
    private com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data S;
    private com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data T;
    private com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data U;
    private com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data V;
    public String W;
    private String X = " ";
    public String Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f20645a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f20646b0;

    /* renamed from: c0  reason: collision with root package name */
    private NocDraftResponse f20647c0;

    /* renamed from: d0  reason: collision with root package name */
    public BeforePaymentRequest f20648d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f20649e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f20650f0 = "0.0";

    /* renamed from: g0  reason: collision with root package name */
    private com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data f20651g0;

    /* renamed from: h0  reason: collision with root package name */
    private com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data f20652h0;

    /* renamed from: i0  reason: collision with root package name */
    private String f20653i0;

    /* renamed from: j0  reason: collision with root package name */
    private Boolean f20654j0;

    /* renamed from: k0  reason: collision with root package name */
    private com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data f20655k0;

    /* renamed from: l0  reason: collision with root package name */
    private com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data f20656l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f20657m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f20658n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f20659o0;

    /* renamed from: p0  reason: collision with root package name */
    public NrvDetails f20660p0;

    /* renamed from: q0  reason: collision with root package name */
    public c f20661q0;

    /* renamed from: r0  reason: collision with root package name */
    public DuplicateFitnessService f20662r0;

    /* renamed from: s0  reason: collision with root package name */
    public b f20663s0;

    /* access modifiers changed from: private */
    public static final void O1(FeesDetailsScreen feesDetailsScreen, View view) {
        l.f(feesDetailsScreen, "this$0");
        Intent intent = new Intent(feesDetailsScreen, VahanVehicleDetailsService.class);
        intent.putExtra("RC", feesDetailsScreen.I1());
        intent.putExtra("RcDetails", feesDetailsScreen.J1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, feesDetailsScreen.f20649e0);
        intent.putExtra(VContant.NEXGEN_addahar_name, feesDetailsScreen.y1());
        intent.putExtra(VContant.NEXGEN_addahar_address, feesDetailsScreen.x1());
        feesDetailsScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void P1(FeesDetailsScreen feesDetailsScreen, View view) {
        l.f(feesDetailsScreen, "this$0");
        feesDetailsScreen.u1(feesDetailsScreen, feesDetailsScreen.A1().b("are_you_sure_you_want_to_leave", feesDetailsScreen.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void Q1(FeesDetailsScreen feesDetailsScreen, View view) {
        l.f(feesDetailsScreen, "this$0");
        feesDetailsScreen.Z1();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r27.z1().f28524v.setText("0.0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0218 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R1(com.nic.mparivahan.VahanServices.FeesDetailsScreen r27, com.nic.mparivahan.VahanServices.VahanModel.FeesModle r28) {
        /*
            r1 = r27
            r0 = r28
            java.lang.String r2 = "this$0"
            cm.l.f(r1, r2)
            android.app.ProgressDialog r2 = r27.C1()
            r2.dismiss()
            r2 = 8
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.LinearLayout r3 = r3.f28515m     // Catch:{ Exception -> 0x00ba }
            r4 = 0
            r3.setVisibility(r4)     // Catch:{ Exception -> 0x00ba }
            int r3 = r28.size()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = "0.0"
            r6 = 1
            if (r3 <= r6) goto L_0x0139
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ba }
            r3.<init>()     // Catch:{ Exception -> 0x00ba }
            r3.clear()     // Catch:{ Exception -> 0x00ba }
            cm.l.c(r28)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.LinearLayout r3 = r3.f28523u     // Catch:{ Exception -> 0x00ba }
            r3.setVisibility(r4)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.LinearLayout r3 = r3.f28512j     // Catch:{ Exception -> 0x00ba }
            r3.setVisibility(r4)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r3 = r3.f28526x     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r7 = r0.get(r4)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r7 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r7     // Catch:{ Exception -> 0x00ba }
            java.lang.String r7 = r7.getFeeHeadDescr()     // Catch:{ Exception -> 0x00ba }
            r3.setText(r7)     // Catch:{ Exception -> 0x00ba }
            int r3 = r28.size()     // Catch:{ Exception -> 0x00ba }
            r7 = r4
        L_0x005a:
            if (r7 >= r3) goto L_0x0112
            java.lang.Object r8 = r0.get(r7)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r8 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r8     // Catch:{ Exception -> 0x00ba }
            int r8 = r8.getPurCd()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r27.G1()     // Catch:{ Exception -> 0x00ba }
            boolean r8 = km.p.o(r8, r9, r6)     // Catch:{ Exception -> 0x00ba }
            if (r8 == 0) goto L_0x010e
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r8 = new com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r9 = r0.get(r7)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r9 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r9     // Catch:{ Exception -> 0x00ba }
            double r9 = r9.getFineAmount()     // Catch:{ Exception -> 0x00ba }
            int r10 = (int) r9     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = "Fine Amount"
            java.lang.String r12 = "0.0"
            r13 = 0
            r15 = 0
            r16 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r15, r16)     // Catch:{ Exception -> 0x00ba }
            r0.add(r8)     // Catch:{ Exception -> 0x00ba }
            ka.c$a r8 = ka.c.f13158a     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r9 = r0.get(r7)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r9 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r9     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r9.getServicecharge()     // Catch:{ Exception -> 0x00ba }
            boolean r8 = r8.m(r9)     // Catch:{ Exception -> 0x00ba }
            if (r8 != 0) goto L_0x00d6
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r8 = new com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r9 = r0.get(r7)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r9 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r9     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r9.getServicecharge()     // Catch:{ Exception -> 0x00ba }
            if (r9 == 0) goto L_0x00bd
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x00ba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00be
        L_0x00ba:
            r0 = move-exception
            goto L_0x0222
        L_0x00bd:
            r9 = 0
        L_0x00be:
            cm.l.c(r9)     // Catch:{ Exception -> 0x00ba }
            int r10 = r9.intValue()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = "Service Charge"
            java.lang.String r12 = "0.0"
            r13 = 0
            r15 = 0
            r16 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r15, r16)     // Catch:{ Exception -> 0x00ba }
        L_0x00d2:
            r0.add(r8)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00ea
        L_0x00d6:
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r8 = new com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem     // Catch:{ Exception -> 0x00ba }
            r19 = 0
            java.lang.String r20 = "Service Charge"
            java.lang.String r21 = "0.0"
            r22 = 0
            r24 = 0
            r25 = 0
            r18 = r8
            r18.<init>(r19, r20, r21, r22, r24, r25)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00d2
        L_0x00ea:
            java.lang.Object r8 = r0.get(r7)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = "get(...)"
            cm.l.e(r8, r9)     // Catch:{ Exception -> 0x00ba }
            r10 = r8
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r10 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r10     // Catch:{ Exception -> 0x00ba }
            r11 = 0
            java.lang.String r12 = "Fee Amount"
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = 61
            r20 = 0
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r8 = com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem.copy$default(r10, r11, r12, r13, r14, r16, r17, r19, r20)     // Catch:{ Exception -> 0x00ba }
            r0.remove(r4)     // Catch:{ Exception -> 0x00ba }
            r0.add(r4, r8)     // Catch:{ Exception -> 0x00ba }
        L_0x010e:
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0112:
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r3 = r3.D     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r6 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r6     // Catch:{ Exception -> 0x00ba }
            double r6 = r6.getTotalAmount()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ba }
            r3.setText(r6)     // Catch:{ Exception -> 0x00ba }
            zb.a r3 = new zb.a     // Catch:{ Exception -> 0x00ba }
            r3.<init>(r0, r1)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r6 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            androidx.recyclerview.widget.RecyclerView r6 = r6.f28511i     // Catch:{ Exception -> 0x00ba }
            r6.setAdapter(r3)     // Catch:{ Exception -> 0x00ba }
            goto L_0x01e0
        L_0x0139:
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.LinearLayout r3 = r3.f28523u     // Catch:{ Exception -> 0x00ba }
            r3.setVisibility(r2)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.LinearLayout r3 = r3.f28512j     // Catch:{ Exception -> 0x00ba }
            r3.setVisibility(r2)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.LinearLayout r3 = r3.f28515m     // Catch:{ Exception -> 0x00ba }
            r3.setVisibility(r4)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.LinearLayout r3 = r3.f28510h     // Catch:{ Exception -> 0x00ba }
            r3.setVisibility(r4)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r3 = r3.f28526x     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r6 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r6     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = r6.getFeeHeadDescr()     // Catch:{ Exception -> 0x00ba }
            r3.setText(r6)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r3 = r3.f28507e     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r6 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r6     // Catch:{ Exception -> 0x00ba }
            int r6 = r6.getFeeAmount()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ba }
            r3.setText(r6)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r3 = r3.f28513k     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r6 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r6     // Catch:{ Exception -> 0x00ba }
            double r6 = r6.getFineAmount()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ba }
            r3.setText(r6)     // Catch:{ Exception -> 0x00ba }
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r3 = r3.C     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r6 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r6     // Catch:{ Exception -> 0x00ba }
            double r6 = r6.getTotalAmount()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ba }
            r3.setText(r6)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r3 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r3     // Catch:{ Exception -> 0x00ba }
            double r6 = r3.getTotalAmount()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ba }
            r1.f20650f0 = r3     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = "0"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x00ba }
            if (r3 != 0) goto L_0x01d5
            java.lang.String r3 = r1.f20650f0     // Catch:{ Exception -> 0x00ba }
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x01e0
        L_0x01d5:
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r3 = r3.A     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = "Proceed"
            r3.setText(r6)     // Catch:{ Exception -> 0x00ba }
        L_0x01e0:
            java.lang.Object r3 = r0.get(r4)     // Catch:{ Exception -> 0x0218 }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r3 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r3     // Catch:{ Exception -> 0x0218 }
            java.lang.String r3 = r3.getServicecharge()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0218 }
            ka.c$a r6 = ka.c.f13158a     // Catch:{ Exception -> 0x0218 }
            boolean r3 = r6.m(r3)     // Catch:{ Exception -> 0x0218 }
            if (r3 != 0) goto L_0x020e
            ni.s4 r3 = r27.z1()     // Catch:{ Exception -> 0x0218 }
            android.widget.TextView r3 = r3.f28524v     // Catch:{ Exception -> 0x0218 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0218 }
            com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem r0 = (com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem) r0     // Catch:{ Exception -> 0x0218 }
            java.lang.String r0 = r0.getServicecharge()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0218 }
            r3.setText(r0)     // Catch:{ Exception -> 0x0218 }
            goto L_0x0233
        L_0x020e:
            ni.s4 r0 = r27.z1()     // Catch:{ Exception -> 0x0218 }
            android.widget.TextView r0 = r0.f28524v     // Catch:{ Exception -> 0x0218 }
            r0.setText(r5)     // Catch:{ Exception -> 0x0218 }
            goto L_0x0233
        L_0x0218:
            ni.s4 r0 = r27.z1()     // Catch:{ Exception -> 0x00ba }
            android.widget.TextView r0 = r0.f28524v     // Catch:{ Exception -> 0x00ba }
            r0.setText(r5)     // Catch:{ Exception -> 0x00ba }
            goto L_0x0233
        L_0x0222:
            r0.printStackTrace()
            ni.s4 r0 = r27.z1()
            android.widget.LinearLayout r0 = r0.f28515m
            r0.setVisibility(r2)
            java.lang.String r0 = "Unable to get the fee details, Please try after some time!"
            r1.t2(r1, r0)
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.FeesDetailsScreen.R1(com.nic.mparivahan.VahanServices.FeesDetailsScreen, com.nic.mparivahan.VahanServices.VahanModel.FeesModle):void");
    }

    /* access modifiers changed from: private */
    public static final void S1(FeesDetailsScreen feesDetailsScreen, String str) {
        l.f(feesDetailsScreen, "this$0");
        feesDetailsScreen.C1().dismiss();
        feesDetailsScreen.t2(feesDetailsScreen, "Unable to get the fee details, Please try after some time!");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(21:1|2|(1:4)(1:7)|8|(1:10)(1:11)|(1:13)(1:14)|15|(1:(3:17|(3:19|(1:26)(1:25)|27)|(1:29)(1:49)))(0)|30|(1:32)(1:33)|34|(1:36)|37|38|(2:40|41)|43|44|45|46|47|52) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0144, code lost:
        if (r1.f20650f0.equals("0.0") != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x015b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void T1(com.nic.mparivahan.VahanServices.FeesDetailsScreen r21, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.PermitFee r22) {
        /*
            r1 = r21
            java.lang.String r0 = "this$0"
            cm.l.f(r1, r0)
            android.app.ProgressDialog r0 = r21.C1()
            r0.dismiss()
            r2 = 8
            ni.s4 r0 = r21.z1()     // Catch:{ Exception -> 0x0038 }
            android.widget.LinearLayout r0 = r0.f28515m     // Catch:{ Exception -> 0x0038 }
            r3 = 0
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x0038 }
            ni.s4 r0 = r21.z1()     // Catch:{ Exception -> 0x0038 }
            android.widget.LinearLayout r0 = r0.f28523u     // Catch:{ Exception -> 0x0038 }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x0038 }
            ni.s4 r0 = r21.z1()     // Catch:{ Exception -> 0x0038 }
            android.widget.LinearLayout r0 = r0.f28512j     // Catch:{ Exception -> 0x0038 }
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data r0 = r22.getData()     // Catch:{ Exception -> 0x0038 }
            r4 = 0
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r0.getSumOfFee()     // Catch:{ Exception -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            goto L_0x0165
        L_0x003b:
            r0 = r4
        L_0x003c:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0038 }
            r1.f20650f0 = r0     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data r0 = r22.getData()     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x004d
            java.util.ArrayList r0 = r0.getFeeDobj()     // Catch:{ Exception -> 0x0038 }
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            if (r0 == 0) goto L_0x0055
            hm.c r5 = ql.q.j(r0)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0056
        L_0x0055:
            r5 = r4
        L_0x0056:
            cm.l.c(r5)     // Catch:{ Exception -> 0x0038 }
            int r6 = r5.l()     // Catch:{ Exception -> 0x0038 }
            int r5 = r5.n()     // Catch:{ Exception -> 0x0038 }
            if (r6 > r5) goto L_0x00e2
        L_0x0063:
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r7 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r8 = r0.get(r6)     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj) r8     // Catch:{ Exception -> 0x0038 }
            java.lang.Integer r8 = r8.getPurCd()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0038 }
            boolean r7 = r7.e(r8)     // Catch:{ Exception -> 0x0038 }
            if (r7 == 0) goto L_0x00dd
            ni.s4 r7 = r21.z1()     // Catch:{ Exception -> 0x0038 }
            android.widget.TextView r7 = r7.f28526x     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data r8 = r22.getData()     // Catch:{ Exception -> 0x0038 }
            if (r8 == 0) goto L_0x0098
            java.util.ArrayList r8 = r8.getFeeDobj()     // Catch:{ Exception -> 0x0038 }
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj) r8     // Catch:{ Exception -> 0x0038 }
            if (r8 == 0) goto L_0x0098
            java.lang.String r8 = r8.getFeeHeadDescr()     // Catch:{ Exception -> 0x0038 }
            goto L_0x0099
        L_0x0098:
            r8 = r4
        L_0x0099:
            r7.setText(r8)     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r7 = new com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r8 = r0.get(r6)     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj) r8     // Catch:{ Exception -> 0x0038 }
            java.lang.String r10 = r8.getServicecharge()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r11 = "Service Charge"
            java.lang.String r12 = "0"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r14 = "0"
            java.lang.String r15 = "0"
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r8 = r0.get(r6)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r9 = "get(...)"
            cm.l.e(r8, r9)     // Catch:{ Exception -> 0x0038 }
            r10 = r8
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r10 = (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj) r10     // Catch:{ Exception -> 0x0038 }
            r11 = 0
            java.lang.String r12 = "Fee Amount"
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 61
            r18 = 0
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r8 = com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0038 }
            r0.remove(r6)     // Catch:{ Exception -> 0x0038 }
            r0.add(r6, r8)     // Catch:{ Exception -> 0x0038 }
            r0.add(r7)     // Catch:{ Exception -> 0x0038 }
        L_0x00dd:
            if (r6 == r5) goto L_0x00e2
            int r6 = r6 + 1
            goto L_0x0063
        L_0x00e2:
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r5 = new com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data r6 = r22.getData()     // Catch:{ Exception -> 0x0038 }
            if (r6 == 0) goto L_0x00f0
            java.lang.String r6 = r6.getSumOfFine()     // Catch:{ Exception -> 0x0038 }
            r8 = r6
            goto L_0x00f1
        L_0x00f0:
            r8 = r4
        L_0x00f1:
            java.lang.String r9 = "Fine Amount"
            java.lang.String r10 = "0"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r12 = "0"
            java.lang.String r13 = "0"
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj r6 = new com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj     // Catch:{ Exception -> 0x0038 }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data r7 = r22.getData()     // Catch:{ Exception -> 0x0038 }
            if (r7 == 0) goto L_0x010d
            java.lang.String r4 = r7.getSumOfTotal()     // Catch:{ Exception -> 0x0038 }
        L_0x010d:
            r15 = r4
            java.lang.String r16 = "Total Amount"
            java.lang.String r17 = "0"
            java.lang.Integer r18 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r19 = "0"
            java.lang.String r20 = "0"
            r14 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0038 }
            r0.add(r5)     // Catch:{ Exception -> 0x0038 }
            r0.add(r6)     // Catch:{ Exception -> 0x0038 }
            zb.b r3 = new zb.b     // Catch:{ Exception -> 0x0038 }
            r3.<init>(r0, r1)     // Catch:{ Exception -> 0x0038 }
            ni.s4 r0 = r21.z1()     // Catch:{ Exception -> 0x0038 }
            androidx.recyclerview.widget.RecyclerView r0 = r0.f28511i     // Catch:{ Exception -> 0x0038 }
            r0.setAdapter(r3)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = r1.f20650f0     // Catch:{ Exception -> 0x0038 }
            java.lang.String r3 = "0"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r3 = "0.0"
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = r1.f20650f0     // Catch:{ Exception -> 0x0038 }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0151
        L_0x0146:
            ni.s4 r0 = r21.z1()     // Catch:{ Exception -> 0x0038 }
            android.widget.TextView r0 = r0.A     // Catch:{ Exception -> 0x0038 }
            java.lang.String r4 = "Proceed"
            r0.setText(r4)     // Catch:{ Exception -> 0x0038 }
        L_0x0151:
            ni.s4 r0 = r21.z1()     // Catch:{ Exception -> 0x015b }
            android.widget.TextView r0 = r0.f28524v     // Catch:{ Exception -> 0x015b }
            r0.setText(r3)     // Catch:{ Exception -> 0x015b }
            goto L_0x0176
        L_0x015b:
            ni.s4 r0 = r21.z1()     // Catch:{ Exception -> 0x0038 }
            android.widget.TextView r0 = r0.f28524v     // Catch:{ Exception -> 0x0038 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0176
        L_0x0165:
            r0.printStackTrace()
            ni.s4 r0 = r21.z1()
            android.widget.LinearLayout r0 = r0.f28515m
            r0.setVisibility(r2)
            java.lang.String r0 = "Unable to get the fee details, Please try after some time!"
            r1.t2(r1, r0)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.FeesDetailsScreen.T1(com.nic.mparivahan.VahanServices.FeesDetailsScreen, com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.PermitFee):void");
    }

    /* access modifiers changed from: private */
    public static final void U1(FeesDetailsScreen feesDetailsScreen, String str) {
        l.f(feesDetailsScreen, "this$0");
        feesDetailsScreen.C1().dismiss();
        feesDetailsScreen.t2(feesDetailsScreen, "Unable to get the fee details, Please try after some time!");
    }

    /* access modifiers changed from: private */
    public static final void V1(FeesDetailsScreen feesDetailsScreen, View view) {
        h N1;
        BeforePaymentRequest D1;
        FeesDetailsScreen feesDetailsScreen2 = feesDetailsScreen;
        l.f(feesDetailsScreen2, "this$0");
        try {
            ld.h hVar = new ld.h(feesDetailsScreen2);
            if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true)) {
                if (feesDetailsScreen2.f20649e0) {
                    String str = feesDetailsScreen2.f20653i0;
                    Boolean bool = feesDetailsScreen2.f20654j0;
                    String str2 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle = feesDetailsScreen2.N;
                    HPAResModle hPAResModle = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse = feesDetailsScreen2.f20647c0;
                    String B1 = feesDetailsScreen.B1();
                    String m10 = v9.d.f17494a.m();
                    String G1 = feesDetailsScreen.G1();
                    Double valueOf = Double.valueOf(0.0d);
                    String H1 = feesDetailsScreen.H1();
                    String M1 = feesDetailsScreen.M1();
                    String rc_vh_class_cd = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str, bool, "A", str2, chaangeOfAddressStatus, 22, dulicatercresponsemodle, "", "", hPAResModle, hptTerResponse, 0, "", 0, "", "", nocDraftResponse, B1, m10, "", "", G1, "", "", valueOf, 0, H1, M1, "", "", "", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str3 = feesDetailsScreen2.f20653i0;
                    Boolean bool2 = feesDetailsScreen2.f20654j0;
                    String str4 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus2 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle2 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle2 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse2 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse2 = feesDetailsScreen2.f20647c0;
                    String B12 = feesDetailsScreen.B1();
                    String m11 = v9.d.f17494a.m();
                    String G12 = feesDetailsScreen.G1();
                    Double valueOf2 = Double.valueOf(0.0d);
                    String H12 = feesDetailsScreen.H1();
                    String M12 = feesDetailsScreen.M1();
                    String rc_vh_class_cd2 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str3, bool2, "M", str4, chaangeOfAddressStatus2, 22, dulicatercresponsemodle2, "", "", hPAResModle2, hptTerResponse2, 0, "", 0, "", "", nocDraftResponse2, B12, m11, "", "", G12, "", "", valueOf2, 0, H12, M12, "", "", "", rc_vh_class_cd2 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd2)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                feesDetailsScreen.C1().show();
                if (feesDetailsScreen2.f20649e0) {
                    String str5 = feesDetailsScreen2.f20653i0;
                    Boolean bool3 = feesDetailsScreen2.f20654j0;
                    String str6 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus3 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle3 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle3 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse3 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse3 = feesDetailsScreen2.f20647c0;
                    String B13 = feesDetailsScreen.B1();
                    String m12 = v9.d.f17494a.m();
                    String G13 = feesDetailsScreen.G1();
                    Double valueOf3 = Double.valueOf(0.0d);
                    String H13 = feesDetailsScreen.H1();
                    String M13 = feesDetailsScreen.M1();
                    String rc_vh_class_cd3 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str5, bool3, "A", str6, chaangeOfAddressStatus3, 22, dulicatercresponsemodle3, "", "", hPAResModle3, hptTerResponse3, 0, "", 0, "", "", nocDraftResponse3, B13, m12, "", "", G13, "", "", valueOf3, 0, H13, M13, "", "", "", rc_vh_class_cd3 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd3)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str7 = feesDetailsScreen2.f20653i0;
                    Boolean bool4 = feesDetailsScreen2.f20654j0;
                    String str8 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus4 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle4 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle4 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse4 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse4 = feesDetailsScreen2.f20647c0;
                    String B14 = feesDetailsScreen.B1();
                    String m13 = v9.d.f17494a.m();
                    String G14 = feesDetailsScreen.G1();
                    Double valueOf4 = Double.valueOf(0.0d);
                    String H14 = feesDetailsScreen.H1();
                    String M14 = feesDetailsScreen.M1();
                    String rc_vh_class_cd4 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str7, bool4, "M", str8, chaangeOfAddressStatus4, 22, dulicatercresponsemodle4, "", "", hPAResModle4, hptTerResponse4, 0, "", 0, "", "", nocDraftResponse4, B14, m13, "", "", G14, "", "", valueOf4, 0, H14, M14, "", "", "", rc_vh_class_cd4 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd4)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_FITNESS_CODE, true)) {
                feesDetailsScreen.C1().show();
                if (feesDetailsScreen2.f20649e0) {
                    String str9 = feesDetailsScreen2.f20653i0;
                    Boolean bool5 = feesDetailsScreen2.f20654j0;
                    String str10 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus5 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle5 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle5 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse5 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse5 = feesDetailsScreen2.f20647c0;
                    String B15 = feesDetailsScreen.B1();
                    String m14 = v9.d.f17494a.m();
                    String G15 = feesDetailsScreen.G1();
                    Double valueOf5 = Double.valueOf(0.0d);
                    String H15 = feesDetailsScreen.H1();
                    String M15 = feesDetailsScreen.M1();
                    String rc_vh_class_cd5 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str9, bool5, "A", str10, chaangeOfAddressStatus5, 22, dulicatercresponsemodle5, "", "", hPAResModle5, hptTerResponse5, 0, "", 0, "", "", nocDraftResponse5, B15, m14, "", "", G15, "", "", valueOf5, 0, H15, M15, "", "", "", rc_vh_class_cd5 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd5)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str11 = feesDetailsScreen2.f20653i0;
                    Boolean bool6 = feesDetailsScreen2.f20654j0;
                    String str12 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus6 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle6 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle6 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse6 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse6 = feesDetailsScreen2.f20647c0;
                    String B16 = feesDetailsScreen.B1();
                    String m15 = v9.d.f17494a.m();
                    String G16 = feesDetailsScreen.G1();
                    Double valueOf6 = Double.valueOf(0.0d);
                    String H16 = feesDetailsScreen.H1();
                    String M16 = feesDetailsScreen.M1();
                    String rc_vh_class_cd6 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str11, bool6, "M", str12, chaangeOfAddressStatus6, 22, dulicatercresponsemodle6, "", "", hPAResModle6, hptTerResponse6, 0, "", 0, "", "", nocDraftResponse6, B16, m15, "", "", G16, "", "", valueOf6, 0, H16, M16, "", "", "", rc_vh_class_cd6 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd6)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_CANCELLATION_CODE, true)) {
                feesDetailsScreen.C1().show();
                if (feesDetailsScreen2.f20649e0) {
                    String str13 = feesDetailsScreen2.f20653i0;
                    Boolean bool7 = feesDetailsScreen2.f20654j0;
                    String str14 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus7 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle7 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle7 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse7 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse7 = feesDetailsScreen2.f20647c0;
                    String B17 = feesDetailsScreen.B1();
                    String m16 = v9.d.f17494a.m();
                    String G17 = feesDetailsScreen.G1();
                    Double valueOf7 = Double.valueOf(0.0d);
                    String H17 = feesDetailsScreen.H1();
                    String M17 = feesDetailsScreen.M1();
                    String rc_vh_class_cd7 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str13, bool7, "A", str14, chaangeOfAddressStatus7, 22, dulicatercresponsemodle7, "", "", hPAResModle7, hptTerResponse7, 0, "", 0, "", "", nocDraftResponse7, B17, m16, "", "", G17, "", "", valueOf7, 0, H17, M17, "", "", "", rc_vh_class_cd7 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd7)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str15 = feesDetailsScreen2.f20653i0;
                    Boolean bool8 = feesDetailsScreen2.f20654j0;
                    String str16 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus8 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle8 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle8 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse8 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse8 = feesDetailsScreen2.f20647c0;
                    String B18 = feesDetailsScreen.B1();
                    String m17 = v9.d.f17494a.m();
                    String G18 = feesDetailsScreen.G1();
                    Double valueOf8 = Double.valueOf(0.0d);
                    String H18 = feesDetailsScreen.H1();
                    String M18 = feesDetailsScreen.M1();
                    String rc_vh_class_cd8 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str15, bool8, "M", str16, chaangeOfAddressStatus8, 22, dulicatercresponsemodle8, "", "", hPAResModle8, hptTerResponse8, 0, "", 0, "", "", nocDraftResponse8, B18, m17, "", "", G18, "", "", valueOf8, 0, H18, M18, "", "", "", rc_vh_class_cd8 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd8)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_SURRENDER_RC_CODE, true)) {
                feesDetailsScreen.C1().show();
                if (feesDetailsScreen2.f20649e0) {
                    String str17 = feesDetailsScreen2.f20653i0;
                    Boolean bool9 = feesDetailsScreen2.f20654j0;
                    String str18 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus9 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle9 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle9 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse9 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse9 = feesDetailsScreen2.f20647c0;
                    String B19 = feesDetailsScreen.B1();
                    String m18 = v9.d.f17494a.m();
                    String G19 = feesDetailsScreen.G1();
                    Double valueOf9 = Double.valueOf(0.0d);
                    String H19 = feesDetailsScreen.H1();
                    String M19 = feesDetailsScreen.M1();
                    String rc_vh_class_cd9 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str17, bool9, "A", str18, chaangeOfAddressStatus9, 22, dulicatercresponsemodle9, "", "", hPAResModle9, hptTerResponse9, 0, "", 0, "", "", nocDraftResponse9, B19, m18, "", "", G19, "", "", valueOf9, 0, H19, M19, "", "", "", rc_vh_class_cd9 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd9)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str19 = feesDetailsScreen2.f20653i0;
                    Boolean bool10 = feesDetailsScreen2.f20654j0;
                    String str20 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus10 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle10 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle10 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse10 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse10 = feesDetailsScreen2.f20647c0;
                    String B110 = feesDetailsScreen.B1();
                    String m19 = v9.d.f17494a.m();
                    String G110 = feesDetailsScreen.G1();
                    Double valueOf10 = Double.valueOf(0.0d);
                    String H110 = feesDetailsScreen.H1();
                    String M110 = feesDetailsScreen.M1();
                    String rc_vh_class_cd10 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str19, bool10, "M", str20, chaangeOfAddressStatus10, 22, dulicatercresponsemodle10, "", "", hPAResModle10, hptTerResponse10, 0, "", 0, "", "", nocDraftResponse10, B110, m19, "", "", G110, "", "", valueOf10, 0, H110, M110, "", "", "", rc_vh_class_cd10 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd10)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_PERMIT_CODE, true)) {
                feesDetailsScreen.C1().show();
                if (feesDetailsScreen2.f20649e0) {
                    String str21 = feesDetailsScreen2.f20653i0;
                    Boolean bool11 = feesDetailsScreen2.f20654j0;
                    String str22 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus11 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle11 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle11 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse11 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse11 = feesDetailsScreen2.f20647c0;
                    String B111 = feesDetailsScreen.B1();
                    String m20 = v9.d.f17494a.m();
                    String G111 = feesDetailsScreen.G1();
                    Double valueOf11 = Double.valueOf(0.0d);
                    String H111 = feesDetailsScreen.H1();
                    String M111 = feesDetailsScreen.M1();
                    String rc_vh_class_cd11 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    Integer valueOf12 = rc_vh_class_cd11 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd11)) : null;
                    DuplicateFitessDraft duplicateFitessDraft = feesDetailsScreen2.O;
                    Data data = feesDetailsScreen2.P;
                    com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2 = feesDetailsScreen2.Q;
                    DuplicatePermitDraft duplicatePermitDraft = feesDetailsScreen2.R;
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str21, bool11, "A", str22, chaangeOfAddressStatus11, 22, dulicatercresponsemodle11, "", "", hPAResModle11, hptTerResponse11, 0, "", 0, "", "", nocDraftResponse11, B111, m20, "", "", G111, "", "", valueOf11, 0, H111, M111, "", "", "", valueOf12, duplicateFitessDraft, data, data2, duplicatePermitDraft != null ? duplicatePermitDraft.getData() : null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str23 = feesDetailsScreen2.f20653i0;
                    Boolean bool12 = feesDetailsScreen2.f20654j0;
                    String str24 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus12 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle12 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle12 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse12 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse12 = feesDetailsScreen2.f20647c0;
                    String B112 = feesDetailsScreen.B1();
                    String m21 = v9.d.f17494a.m();
                    String G112 = feesDetailsScreen.G1();
                    Double valueOf13 = Double.valueOf(0.0d);
                    String H112 = feesDetailsScreen.H1();
                    String M112 = feesDetailsScreen.M1();
                    String rc_vh_class_cd12 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    Integer valueOf14 = rc_vh_class_cd12 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd12)) : null;
                    DuplicateFitessDraft duplicateFitessDraft2 = feesDetailsScreen2.O;
                    Data data3 = feesDetailsScreen2.P;
                    com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data4 = feesDetailsScreen2.Q;
                    NocDraftResponse nocDraftResponse13 = nocDraftResponse12;
                    DuplicatePermitDraft duplicatePermitDraft2 = feesDetailsScreen2.R;
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str23, bool12, "M", str24, chaangeOfAddressStatus12, 22, dulicatercresponsemodle12, "", "", hPAResModle12, hptTerResponse12, 0, "", 0, "", "", nocDraftResponse13, B112, m21, "", "", G112, "", "", valueOf13, 0, H112, M112, "", "", "", valueOf14, duplicateFitessDraft2, data3, data4, duplicatePermitDraft2 != null ? duplicatePermitDraft2.getData() : null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_RELEASE_CODE, true)) {
                feesDetailsScreen.C1().show();
                if (feesDetailsScreen2.f20649e0) {
                    String str25 = feesDetailsScreen2.f20653i0;
                    Boolean bool13 = feesDetailsScreen2.f20654j0;
                    String str26 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus13 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle13 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle13 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse13 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse14 = feesDetailsScreen2.f20647c0;
                    String B113 = feesDetailsScreen.B1();
                    String m22 = v9.d.f17494a.m();
                    String G113 = feesDetailsScreen.G1();
                    Double valueOf15 = Double.valueOf(0.0d);
                    String H113 = feesDetailsScreen.H1();
                    String M113 = feesDetailsScreen.M1();
                    String rc_vh_class_cd13 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str25, bool13, "A", str26, chaangeOfAddressStatus13, 22, dulicatercresponsemodle13, "", "", hPAResModle13, hptTerResponse13, 0, "", 0, "", "", nocDraftResponse14, B113, m22, "", "", G113, "", "", valueOf15, 0, H113, M113, "", "", "", rc_vh_class_cd13 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd13)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str27 = feesDetailsScreen2.f20653i0;
                    Boolean bool14 = feesDetailsScreen2.f20654j0;
                    String str28 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus14 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle14 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle14 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse14 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse15 = feesDetailsScreen2.f20647c0;
                    String B114 = feesDetailsScreen.B1();
                    String m23 = v9.d.f17494a.m();
                    String G114 = feesDetailsScreen.G1();
                    Double valueOf16 = Double.valueOf(0.0d);
                    String H114 = feesDetailsScreen.H1();
                    String M114 = feesDetailsScreen.M1();
                    String rc_vh_class_cd14 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str27, bool14, "M", str28, chaangeOfAddressStatus14, 22, dulicatercresponsemodle14, "", "", hPAResModle14, hptTerResponse14, 0, "", 0, "", "", nocDraftResponse15, B114, m23, "", "", G114, "", "", valueOf16, 0, H114, M114, "", "", "", rc_vh_class_cd14 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd14)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else if (p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.ALTERATION_CODE, true)) {
                feesDetailsScreen.C1().show();
                new i7.d();
                if (feesDetailsScreen2.f20649e0) {
                    String str29 = feesDetailsScreen2.f20653i0;
                    Boolean bool15 = feesDetailsScreen2.f20654j0;
                    String str30 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus15 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle15 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle15 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse15 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse16 = feesDetailsScreen2.f20647c0;
                    String B115 = feesDetailsScreen.B1();
                    String m24 = v9.d.f17494a.m();
                    String G115 = feesDetailsScreen.G1();
                    Double valueOf17 = Double.valueOf(0.0d);
                    String H115 = feesDetailsScreen.H1();
                    String M115 = feesDetailsScreen.M1();
                    String rc_vh_class_cd15 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str29, bool15, "A", str30, chaangeOfAddressStatus15, 22, dulicatercresponsemodle15, "", "", hPAResModle15, hptTerResponse15, 0, "", 0, "", "", nocDraftResponse16, B115, m24, "", "", G115, "", "", valueOf17, 0, H115, M115, "", "", "", rc_vh_class_cd15 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd15)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    feesDetailsScreen.C1().show();
                    String str31 = feesDetailsScreen2.f20653i0;
                    Boolean bool16 = feesDetailsScreen2.f20654j0;
                    String str32 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus16 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle16 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle16 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse16 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse17 = feesDetailsScreen2.f20647c0;
                    String B116 = feesDetailsScreen.B1();
                    String m25 = v9.d.f17494a.m();
                    String G116 = feesDetailsScreen.G1();
                    Double valueOf18 = Double.valueOf(0.0d);
                    String H116 = feesDetailsScreen.H1();
                    String M116 = feesDetailsScreen.M1();
                    String rc_vh_class_cd16 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str31, bool16, "M", str32, chaangeOfAddressStatus16, 22, dulicatercresponsemodle16, "", "", hPAResModle16, hptTerResponse16, 0, "", 0, "", "", nocDraftResponse17, B116, m25, "", "", G116, "", "", valueOf18, 0, H116, M116, "", "", "", rc_vh_class_cd16 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd16)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            } else {
                feesDetailsScreen.C1().show();
                if (feesDetailsScreen2.f20649e0) {
                    String str33 = feesDetailsScreen2.f20653i0;
                    Boolean bool17 = feesDetailsScreen2.f20654j0;
                    String str34 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus17 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle17 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle17 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse17 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse18 = feesDetailsScreen2.f20647c0;
                    String B117 = feesDetailsScreen.B1();
                    String m26 = v9.d.f17494a.m();
                    String G117 = feesDetailsScreen.G1();
                    Double valueOf19 = Double.valueOf(0.0d);
                    String H117 = feesDetailsScreen.H1();
                    String M117 = feesDetailsScreen.M1();
                    String rc_vh_class_cd17 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str33, bool17, "A", str34, chaangeOfAddressStatus17, 22, dulicatercresponsemodle17, "", "", hPAResModle17, hptTerResponse17, 0, "", 0, "", "", nocDraftResponse18, B117, m26, "", "", G117, "", "", valueOf19, 0, H117, M117, "", "", "", rc_vh_class_cd17 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd17)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                } else {
                    String str35 = feesDetailsScreen2.f20653i0;
                    Boolean bool18 = feesDetailsScreen2.f20654j0;
                    String str36 = feesDetailsScreen2.X;
                    ChaangeOfAddressStatus chaangeOfAddressStatus18 = feesDetailsScreen2.J;
                    dulicateRcResponseModle dulicatercresponsemodle18 = feesDetailsScreen2.N;
                    HPAResModle hPAResModle18 = feesDetailsScreen2.M;
                    HptTerResponse hptTerResponse18 = feesDetailsScreen2.L;
                    NocDraftResponse nocDraftResponse19 = feesDetailsScreen2.f20647c0;
                    String B118 = feesDetailsScreen.B1();
                    String m27 = v9.d.f17494a.m();
                    String G118 = feesDetailsScreen.G1();
                    Double valueOf20 = Double.valueOf(0.0d);
                    String H118 = feesDetailsScreen.H1();
                    String M118 = feesDetailsScreen.M1();
                    String rc_vh_class_cd18 = feesDetailsScreen.J1().getRc_vh_class_cd();
                    feesDetailsScreen2.g2(new BeforePaymentRequest(str35, bool18, "M", str36, chaangeOfAddressStatus18, 22, dulicatercresponsemodle18, "", "", hPAResModle18, hptTerResponse18, 0, "", 0, "", "", nocDraftResponse19, B118, m27, "", "", G118, "", "", valueOf20, 0, H118, M118, "", "", "", rc_vh_class_cd18 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd18)) : null, feesDetailsScreen2.O, feesDetailsScreen2.P, feesDetailsScreen2.Q, (DataX) null, feesDetailsScreen2.S, feesDetailsScreen2.T, hVar.a(), feesDetailsScreen2.U, feesDetailsScreen2.f20651g0, feesDetailsScreen2.f20652h0));
                    N1 = feesDetailsScreen.N1();
                    D1 = feesDetailsScreen.D1();
                }
            }
            N1.v(feesDetailsScreen2, D1);
        } catch (Exception e10) {
            Exception exc = e10;
            feesDetailsScreen.C1().dismiss();
            exc.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(FeesDetailsScreen feesDetailsScreen, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        l.f(feesDetailsScreen, "this$0");
        feesDetailsScreen.C1().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl != null && returnUrl.length() != 0) {
            try {
                Intent intent = new Intent(feesDetailsScreen, VahanPayment.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
                intent.putExtra(VContant.NEXGEN_isFACELESS, feesDetailsScreen.f20649e0);
                if (!p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true)) {
                    if (!p.o(feesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                        intent.putExtra(VContant.APP_NO, feesDetailsScreen.X);
                    }
                }
                intent.putExtra("state_code", feesDetailsScreen.M1());
                intent.putExtra("rc_number", feesDetailsScreen.H1());
                intent.putExtra(VContant.PURPOSE_CODE, feesDetailsScreen.G1());
                intent.putExtra("URL", paymentBeforeUrlResponse.getReturnUrl());
                intent.putExtra(VContant.FINAL_SUBMIT, feesDetailsScreen.D1());
                intent.putExtra("RC", feesDetailsScreen.I1());
                intent.putExtra("RcDetails", feesDetailsScreen.J1());
                intent.putExtra(VContant.NEXGEN_addahar_name, feesDetailsScreen.y1());
                intent.putExtra(VContant.NEXGEN_addahar_address, feesDetailsScreen.x1());
                feesDetailsScreen.startActivity(intent);
                feesDetailsScreen.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void X1(FeesDetailsScreen feesDetailsScreen, String str) {
        l.f(feesDetailsScreen, "this$0");
        feesDetailsScreen.C1().dismiss();
        if (str.equals("Error")) {
            str = feesDetailsScreen.getString(R.string.service_unavable_please_try);
        }
        feesDetailsScreen.r2(feesDetailsScreen, str);
    }

    /* access modifiers changed from: private */
    public static final void Y1(FeesDetailsScreen feesDetailsScreen, DistictModle distictModle) {
        l.f(feesDetailsScreen, "this$0");
        feesDetailsScreen.C1().dismiss();
        try {
            l.c(distictModle);
            int size = distictModle.size();
            for (int i10 = 0; i10 < size; i10++) {
                String valueOf = String.valueOf(((DistictModleItem) distictModle.get(i10)).getDist_cd());
                ChaangeOfAddressStatus chaangeOfAddressStatus = feesDetailsScreen.J;
                l.c(chaangeOfAddressStatus);
                if (p.o(valueOf, chaangeOfAddressStatus.getC_district().toString(), true)) {
                    StringBuilder sb2 = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus2 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus2);
                    sb2.append(chaangeOfAddressStatus2.getC_add1());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus3 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus3);
                    sb2.append(chaangeOfAddressStatus3.getC_add2());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus4 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus4);
                    sb2.append(chaangeOfAddressStatus4.getC_add3());
                    sb2.append(", ");
                    sb2.append(((DistictModleItem) distictModle.get(i10)).getDescr());
                    sb2.append(", ");
                    VContant.Companion companion = VContant.Companion;
                    sb2.append(companion.k(String.valueOf(feesDetailsScreen.J1().getRc_c_state())));
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus5 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus5);
                    sb2.append(chaangeOfAddressStatus5.getC_pincode());
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus6 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus6);
                    sb4.append(chaangeOfAddressStatus6.getP_add1());
                    sb4.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus7 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus7);
                    sb4.append(chaangeOfAddressStatus7.getP_add2());
                    sb4.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus8 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus8);
                    sb4.append(chaangeOfAddressStatus8.getP_add3());
                    sb4.append(", ");
                    sb4.append(((DistictModleItem) distictModle.get(i10)).getDescr());
                    sb4.append(", ");
                    sb4.append(companion.k(String.valueOf(feesDetailsScreen.J1().getRc_c_state())));
                    sb4.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus9 = feesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus9);
                    sb4.append(chaangeOfAddressStatus9.getP_pincode());
                    String sb5 = sb4.toString();
                    feesDetailsScreen.z1().f28505c.setText(sb3.toString());
                    feesDetailsScreen.z1().f28518p.setText(sb5.toString());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            StringBuilder sb6 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus10 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus10);
            sb6.append(chaangeOfAddressStatus10.getC_add1());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus11 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus11);
            sb6.append(chaangeOfAddressStatus11.getC_add2());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus12 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus12);
            sb6.append(chaangeOfAddressStatus12.getC_add3());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus13 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus13);
            sb6.append(chaangeOfAddressStatus13.getC_district());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus14 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus14);
            sb6.append(chaangeOfAddressStatus14.getC_state());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus15 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus15);
            sb6.append(chaangeOfAddressStatus15.getC_pincode());
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus16 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus16);
            sb8.append(chaangeOfAddressStatus16.getP_add1());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus17 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus17);
            sb8.append(chaangeOfAddressStatus17.getP_add2());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus18 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus18);
            sb8.append(chaangeOfAddressStatus18.getP_add3());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus19 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus19);
            sb8.append(chaangeOfAddressStatus19.getP_district());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus20 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus20);
            sb8.append(chaangeOfAddressStatus20.getP_state());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus21 = feesDetailsScreen.J;
            l.c(chaangeOfAddressStatus21);
            sb8.append(chaangeOfAddressStatus21.getP_pincode());
            String sb9 = sb8.toString();
            feesDetailsScreen.z1().f28505c.setText(sb7.toString());
            feesDetailsScreen.z1().f28518p.setText(sb9.toString());
        }
    }

    private final void Z1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void s2(Dialog dialog, FeesDetailsScreen feesDetailsScreen, View view) {
        l.f(dialog, "$d");
        l.f(feesDetailsScreen, "this$0");
        dialog.dismiss();
        feesDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void u2(Dialog dialog, FeesDetailsScreen feesDetailsScreen, View view) {
        l.f(dialog, "$dialog");
        l.f(feesDetailsScreen, "this$0");
        dialog.dismiss();
        feesDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(Dialog dialog, FeesDetailsScreen feesDetailsScreen, View view) {
        l.f(dialog, "$d");
        l.f(feesDetailsScreen, "this$0");
        dialog.dismiss();
        feesDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void w1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final c A1() {
        c cVar = this.f20661q0;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String B1() {
        String str = this.f20646b0;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog C1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final BeforePaymentRequest D1() {
        BeforePaymentRequest beforePaymentRequest = this.f20648d0;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        l.v("paymentRequest");
        return null;
    }

    public final DuplicateFitnessService E1() {
        DuplicateFitnessService duplicateFitnessService = this.f20662r0;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        l.v("permitService");
        return null;
    }

    public final b F1() {
        b bVar = this.f20663s0;
        if (bVar != null) {
            return bVar;
        }
        l.v("permitViewModle");
        return null;
    }

    public final String G1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final String H1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        l.v("rc_no");
        return null;
    }

    public final String I1() {
        String str = this.f20659o0;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails J1() {
        NrvDetails nrvDetails = this.f20660p0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService K1() {
        VahanProService vahanProService = this.H;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final String L1() {
        String str = this.f20645a0;
        if (str != null) {
            return str;
        }
        l.v("service_name");
        return null;
    }

    public final String M1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        l.v("state_code");
        return null;
    }

    public final h N1() {
        h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void a2(String str) {
        l.f(str, "<set-?>");
        this.f20658n0 = str;
    }

    public final void b2(String str) {
        l.f(str, "<set-?>");
        this.f20657m0 = str;
    }

    public final void c2(s4 s4Var) {
        l.f(s4Var, "<set-?>");
        this.K = s4Var;
    }

    public final void d2(c cVar) {
        l.f(cVar, "<set-?>");
        this.f20661q0 = cVar;
    }

    public final void e2(String str) {
        l.f(str, "<set-?>");
        this.f20646b0 = str;
    }

    public final void f2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void g2(BeforePaymentRequest beforePaymentRequest) {
        l.f(beforePaymentRequest, "<set-?>");
        this.f20648d0 = beforePaymentRequest;
    }

    public final void h2(DuplicateFitnessService duplicateFitnessService) {
        l.f(duplicateFitnessService, "<set-?>");
        this.f20662r0 = duplicateFitnessService;
    }

    public final void i2(b bVar) {
        l.f(bVar, "<set-?>");
        this.f20663s0 = bVar;
    }

    public final void j2(String str) {
        l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void k2(String str) {
        l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void l2(String str) {
        l.f(str, "<set-?>");
        this.f20659o0 = str;
    }

    public final void m2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.f20660p0 = nrvDetails;
    }

    public final void n2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final void o2(String str) {
        l.f(str, "<set-?>");
        this.f20645a0 = str;
    }

    public void onBackPressed() {
        u1(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [java.lang.Object, java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 2131558545(0x7f0d0091, float:1.8742409E38)
            r7.setContentView((int) r8)
            android.view.LayoutInflater r8 = r7.getLayoutInflater()
            ni.s4 r8 = ni.s4.c(r8)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r8, r0)
            r7.c2(r8)
            ni.s4 r8 = r7.z1()
            android.widget.LinearLayout r8 = r8.b()
            r7.setContentView((android.view.View) r8)
            v9.e$a r8 = v9.e.f17509a
            ni.s4 r0 = r7.z1()
            r8.O0(r7, r0)
            ld.c r0 = new ld.c
            r0.<init>(r7)
            r7.d2(r0)
            com.nic.mparivahan.VahanServices.VahanService.VahanProService$a r0 = com.nic.mparivahan.VahanServices.VahanService.VahanProService.f21196b
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r0 = r0.b(r7)
            r7.n2(r0)
            com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService$a r0 = com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService.f20591a
            com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService r0 = r0.b(r7)
            r7.h2(r0)
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r7)
            r7.f2(r0)
            android.app.ProgressDialog r0 = r7.C1()
            java.lang.String r1 = "Please wait..."
            r0.setMessage(r1)
            android.app.ProgressDialog r0 = r7.C1()
            r1 = 0
            r0.setCancelable(r1)
            android.app.ProgressDialog r0 = r7.C1()
            r0.setCanceledOnTouchOutside(r1)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            bi.g r2 = new bi.g
            wg.d r3 = new wg.d
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r4 = r7.K1()
            r3.<init>(r4)
            r2.<init>(r3)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r2)
            java.lang.Class<bi.h> r2 = bi.h.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            bi.h r0 = (bi.h) r0
            r7.q2(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            qe.a r2 = new qe.a
            pe.a r3 = new pe.a
            com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService r4 = r7.E1()
            r3.<init>(r4)
            r2.<init>(r3)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r2)
            java.lang.Class<qe.b> r2 = qe.b.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            qe.b r0 = (qe.b) r0
            r7.i2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "state_code"
            java.lang.String r0 = r0.getStringExtra(r2)
            cm.l.c(r0)
            r7.p2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "rc_number"
            java.lang.String r0 = r0.getStringExtra(r2)
            cm.l.c(r0)
            r7.k2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "purpose_code"
            java.lang.String r0 = r0.getStringExtra(r2)
            cm.l.c(r0)
            r7.j2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "Service_Name"
            java.lang.String r0 = r0.getStringExtra(r2)
            cm.l.c(r0)
            r7.o2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "off_code"
            java.lang.String r0 = r0.getStringExtra(r2)
            cm.l.c(r0)
            r7.e2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "Face_Less_Staus"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            r7.f20649e0 = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "aadhaarName"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.b2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "aadhaarAddress"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.a2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "RC"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.l2(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "RcDetails"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails"
            cm.l.d(r0, r2)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = (com.nic.mparivahan.VahanServices.VahanModel.NrvDetails) r0
            r7.m2(r0)
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r2 = 2
            r0.<init>(r7, r2)
            ni.s4 r2 = r7.z1()
            androidx.recyclerview.widget.RecyclerView r2 = r2.f28511i
            r2.setLayoutManager(r0)
            ni.s4 r0 = r7.z1()
            androidx.recyclerview.widget.RecyclerView r0 = r0.f28511i
            r2 = 1
            r0.setHasFixedSize(r2)
            boolean r0 = r7.f20649e0
            if (r0 == 0) goto L_0x0170
            ni.s4 r0 = r7.z1()
            ni.gb r0 = r0.f28522t
            android.widget.LinearLayout r0 = r0.f26532e
            r3 = 1077936128(0x40400000, float:3.0)
            r0.setWeightSum(r3)
        L_0x0170:
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r0 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            boolean r3 = r7.f20649e0
            ni.s4 r4 = r7.z1()
            ni.gb r4 = r4.f28522t
            android.widget.LinearLayout r4 = r4.f26529b
            java.lang.String r5 = "appMent"
            cm.l.e(r4, r5)
            r0.J(r3, r4)
            ni.s4 r0 = r7.z1()     // Catch:{ Exception -> 0x0201 }
            android.widget.TextView r0 = r0.I     // Catch:{ Exception -> 0x0201 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0201 }
            r3.<init>()     // Catch:{ Exception -> 0x0201 }
            ld.c r4 = r7.A1()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r5 = "vehicle_no"
            java.lang.String r6 = "Vehicle No.:"
            java.lang.String r4 = r4.b(r5, r6)     // Catch:{ Exception -> 0x0201 }
            r3.append(r4)     // Catch:{ Exception -> 0x0201 }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r4 = r7.H1()     // Catch:{ Exception -> 0x0201 }
            r3.append(r4)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0201 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0201 }
            ni.s4 r0 = r7.z1()     // Catch:{ Exception -> 0x0201 }
            ni.qd r0 = r0.B     // Catch:{ Exception -> 0x0201 }
            android.widget.TextView r0 = r0.f28308i     // Catch:{ Exception -> 0x0201 }
            java.lang.String r3 = r7.L1()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = r8.O(r7, r3)     // Catch:{ Exception -> 0x0201 }
            r0.setText(r8)     // Catch:{ Exception -> 0x0201 }
            ni.s4 r8 = r7.z1()     // Catch:{ Exception -> 0x0201 }
            android.widget.TextView r8 = r8.J     // Catch:{ Exception -> 0x0201 }
            ld.c r0 = r7.A1()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r3 = "view_vehicle_details"
            java.lang.String r4 = "View Vehicle Details"
            java.lang.String r0 = r0.b(r3, r4)     // Catch:{ Exception -> 0x0201 }
            r8.setText(r0)     // Catch:{ Exception -> 0x0201 }
            ni.s4 r8 = r7.z1()     // Catch:{ Exception -> 0x0201 }
            android.widget.TextView r8 = r8.J     // Catch:{ Exception -> 0x0201 }
            ni.s4 r0 = r7.z1()     // Catch:{ Exception -> 0x0201 }
            android.widget.TextView r0 = r0.J     // Catch:{ Exception -> 0x0201 }
            int r0 = r0.getPaintFlags()     // Catch:{ Exception -> 0x0201 }
            r0 = r0 | 8
            r8.setPaintFlags(r0)     // Catch:{ Exception -> 0x0201 }
            ni.s4 r8 = r7.z1()     // Catch:{ Exception -> 0x0201 }
            android.widget.TextView r8 = r8.J     // Catch:{ Exception -> 0x0201 }
            wd.w r0 = new wd.w     // Catch:{ Exception -> 0x0201 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0201 }
            r8.setOnClickListener(r0)     // Catch:{ Exception -> 0x0201 }
            goto L_0x0205
        L_0x0201:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0205:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "001"
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r3 = "HT001"
            boolean r8 = km.p.o(r8, r3, r2)
            java.lang.String r4 = "App_no"
            if (r8 == 0) goto L_0x0237
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse"
            cm.l.d(r8, r3)
            com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse r8 = (com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse) r8
            r7.L = r8
        L_0x0237:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r3 = "HPA001"
            boolean r8 = km.p.o(r8, r3, r2)
            if (r8 == 0) goto L_0x0265
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPA.HPAResModle"
            cm.l.d(r8, r3)
            com.nic.mparivahan.VahanServices.HPA.HPAResModle r8 = (com.nic.mparivahan.VahanServices.HPA.HPAResModle) r8
            r7.M = r8
        L_0x0265:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r3 = "DRC001"
            boolean r8 = km.p.o(r8, r3, r2)
            if (r8 == 0) goto L_0x0293
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle"
            cm.l.d(r8, r3)
            com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle r8 = (com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle) r8
            r7.N = r8
        L_0x0293:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r3 = "NC001"
            boolean r8 = km.p.o(r8, r3, r2)
            if (r8 == 0) goto L_0x02c1
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse"
            cm.l.d(r8, r3)
            com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse r8 = (com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse) r8
            r7.f20647c0 = r8
        L_0x02c1:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r3 = "COD001"
            boolean r8 = km.p.o(r8, r3, r2)
            if (r8 == 0) goto L_0x030c
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r3 = "COV"
            java.io.Serializable r8 = r8.getSerializableExtra(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus"
            cm.l.d(r8, r3)
            com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus r8 = (com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus) r8
            r7.J = r8
            ni.s4 r8 = r7.z1()     // Catch:{ Exception -> 0x030c }
            android.widget.LinearLayout r8 = r8.f28504b     // Catch:{ Exception -> 0x030c }
            r8.setVisibility(r1)     // Catch:{ Exception -> 0x030c }
            android.app.ProgressDialog r8 = r7.C1()     // Catch:{ Exception -> 0x030c }
            r8.show()     // Catch:{ Exception -> 0x030c }
            bi.h r8 = r7.N1()     // Catch:{ Exception -> 0x030c }
            java.lang.String r1 = r7.M1()     // Catch:{ Exception -> 0x030c }
            r8.i1(r7, r1)     // Catch:{ Exception -> 0x030c }
        L_0x030c:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "RCP001"
            boolean unused = km.p.o(r8, r1, r2)
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "DFC001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x0347
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft) r8
            r7.O = r8
        L_0x0347:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "RCC001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x0375
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data) r8
            r7.P = r8
        L_0x0375:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "RCS001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x03a3
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) r8
            r7.Q = r8
        L_0x03a3:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "DP001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x03d1
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft) r8
            r7.R = r8
        L_0x03d1:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "RCR001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x03ff
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) r8
            r7.S = r8
        L_0x03ff:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "NPP001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x0428
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data r8 = (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) r8
            r7.T = r8
        L_0x0428:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "TEMP001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x0456
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data r8 = (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) r8
            r7.U = r8
        L_0x0456:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "TO001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x0484
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data r8 = (com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data) r8
            r7.V = r8
        L_0x0484:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "PR001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x04b2
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data r8 = (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) r8
            r7.f20652h0 = r8
        L_0x04b2:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r1 = "ALT001"
            boolean r8 = km.p.o(r8, r1, r2)
            if (r8 == 0) goto L_0x04e0
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data"
            cm.l.d(r8, r1)
            com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data r8 = (com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data) r8
            r7.f20655k0 = r8
        L_0x04e0:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            java.lang.String r0 = "UMN001"
            boolean r8 = km.p.o(r8, r0, r2)
            if (r8 == 0) goto L_0x050e
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r4)
            cm.l.c(r8)
            r7.X = r8
            android.content.Intent r8 = r7.getIntent()
            java.io.Serializable r8 = r8.getSerializableExtra(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data"
            cm.l.d(r8, r0)
            com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data r8 = (com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data) r8
            r7.f20656l0 = r8
        L_0x050e:
            ni.s4 r8 = r7.z1()
            ni.qd r8 = r8.B
            androidx.appcompat.widget.AppCompatImageView r8 = r8.f28305f
            wd.c0 r0 = new wd.c0
            r0.<init>(r7)
            r8.setOnClickListener(r0)
            ni.s4 r8 = r7.z1()
            ni.qd r8 = r8.B
            android.widget.RelativeLayout r8 = r8.f28306g
            wd.d0 r0 = new wd.d0
            r0.<init>(r7)
            r8.setOnClickListener(r0)
            android.app.ProgressDialog r8 = r7.C1()
            r8.show()
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r8 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            java.lang.String r0 = r7.G1()
            boolean r8 = r8.e(r0)
            if (r8 == 0) goto L_0x05e3
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r8 = r7.J1()
            java.lang.String r8 = r8.getRc_chasi_no()
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            r1 = 0
            if (r8 == 0) goto L_0x0573
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r2 = r7.J1()
            java.lang.String r2 = r2.getRc_chasi_no()
            if (r2 == 0) goto L_0x0561
            int r2 = r2.length()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0562
        L_0x0561:
            r2 = r1
        L_0x0562:
            cm.l.c(r2)
            int r2 = r2.intValue()
            int r2 = r2 + -5
            java.lang.String r8 = r8.substring(r2)
            cm.l.e(r8, r0)
            goto L_0x0574
        L_0x0573:
            r8 = r1
        L_0x0574:
            r7.f20653i0 = r8
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.f20654j0 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "purposeCode"
            java.lang.String r4 = r7.G1()
            r2.put(r3, r4)
            v9.d$a r3 = v9.d.f17494a
            java.lang.String r3 = r3.m()
            java.lang.String r4 = "upTodate"
            r2.put(r4, r3)
            r8.add(r2)
            qe.b r2 = r7.F1()
            com.nic.mparivahan.VahanServices.VahanUtils.VUtility$a r3 = com.nic.mparivahan.VahanServices.VahanUtils.VUtility.Companion
            java.lang.String r4 = r7.X
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r5 = r7.J1()
            java.lang.String r5 = r5.getRc_chasi_no()
            if (r5 == 0) goto L_0x05cf
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r6 = r7.J1()
            java.lang.String r6 = r6.getRc_chasi_no()
            if (r6 == 0) goto L_0x05bf
            int r1 = r6.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x05bf:
            cm.l.c(r1)
            int r1 = r1.intValue()
            int r1 = r1 + -5
            java.lang.String r1 = r5.substring(r1)
            cm.l.e(r1, r0)
        L_0x05cf:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r7.H1()
            java.lang.String r8 = r3.I(r4, r0, r1, r8)
            java.lang.String r8 = r8.toString()
            r2.u(r7, r8)
            goto L_0x060a
        L_0x05e3:
            bi.h r8 = r7.N1()
            java.lang.String r0 = r7.H1()
            java.lang.String r1 = r7.M1()
            java.lang.CharSequence r1 = km.q.B0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r7.G1()
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = km.q.B0(r2)
            java.lang.String r2 = r2.toString()
            r8.j1(r7, r0, r1, r2)
        L_0x060a:
            bi.h r8 = r7.N1()
            androidx.lifecycle.a0 r8 = r8.O()
            wd.e0 r0 = new wd.e0
            r0.<init>(r7)
            r8.g(r7, r0)
            bi.h r8 = r7.N1()
            androidx.lifecycle.a0 r8 = r8.P()
            wd.f0 r0 = new wd.f0
            r0.<init>(r7)
            r8.g(r7, r0)
            qe.b r8 = r7.F1()
            androidx.lifecycle.a0 r8 = r8.v()
            wd.g0 r0 = new wd.g0
            r0.<init>(r7)
            r8.g(r7, r0)
            qe.b r8 = r7.F1()
            androidx.lifecycle.a0 r8 = r8.w()
            wd.h0 r0 = new wd.h0
            r0.<init>(r7)
            r8.g(r7, r0)
            ni.s4 r8 = r7.z1()
            android.widget.TextView r8 = r8.A
            wd.i0 r0 = new wd.i0
            r0.<init>(r7)
            r8.setOnClickListener(r0)
            bi.h r8 = r7.N1()
            androidx.lifecycle.a0 r8 = r8.y0()
            wd.j0 r0 = new wd.j0
            r0.<init>(r7)
            r8.g(r7, r0)
            bi.h r8 = r7.N1()
            androidx.lifecycle.a0 r8 = r8.z0()
            wd.k0 r0 = new wd.k0
            r0.<init>(r7)
            r8.g(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.FeesDetailsScreen.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        u1(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        N1().F().g(this, new x(this));
    }

    public final void p2(String str) {
        l.f(str, "<set-?>");
        this.W = str;
    }

    public final void q2(h hVar) {
        l.f(hVar, "<set-?>");
        this.G = hVar;
    }

    public final void r2(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new a0(dialog, this));
        dialog.show();
    }

    public final void t2(Context context, String str) {
        l.f(context, "context");
        l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new b0(dialog, this));
        dialog.show();
    }

    public final void u1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        c cVar = new c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new y(dialog, this));
        textView2.setOnClickListener(new z(dialog));
        dialog.show();
    }

    public final String x1() {
        String str = this.f20658n0;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String y1() {
        String str = this.f20657m0;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final s4 z1() {
        s4 s4Var = this.K;
        if (s4Var != null) {
            return s4Var;
        }
        l.v("binding");
        return null;
    }
}
