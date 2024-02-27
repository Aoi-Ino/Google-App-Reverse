package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerValidationWithAadhaar;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.ApiMessageX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService.TOBuyerApplicationService;
import ih.i;
import ih.j;
import ih.k;
import java.util.HashMap;
import ka.c;
import ld.g;
import ni.m8;
import pl.x;

public final class TOBuyerInit extends androidx.appcompat.app.d {
    private m8 G;
    private lh.a H;
    private TOBuyerApplicationService I;
    public ProgressDialog J;
    private final String K = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private String L = "";
    private String M = "ApplicationNo";
    public ld.c N;
    public h O;
    public VahanProService P;
    public NrvDetails Q;
    public ld.c R;
    private String S = "";
    private String T = "NA";
    private String U = "0";
    private HashMap V = new HashMap();
    private String W = " ";
    private String X = "M";
    private TOFetchApplicationDetails Y;
    private final d.c Z;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TOBuyerInit f21419e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TOBuyerInit tOBuyerInit) {
            super(1);
            this.f21419e = tOBuyerInit;
        }

        public final void b(TOFetchApplicationDetails tOFetchApplicationDetails) {
            TransferOwnershipDto transferOwnershipDto;
            TransferOwnershipDto transferOwnershipDto2;
            TransferOwnershipDto transferOwnershipDto3;
            ApiMessageX apiMessage = tOFetchApplicationDetails.getApiMessage();
            String str = null;
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                if (this.f21419e.y1().isShowing()) {
                    this.f21419e.y1().dismiss();
                }
                TOBuyerInit tOBuyerInit = this.f21419e;
                ApiMessageX apiMessage2 = tOFetchApplicationDetails.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                tOBuyerInit.Y1(tOBuyerInit, String.valueOf(str));
                return;
            }
            this.f21419e.V1(tOFetchApplicationDetails);
            g gVar = new g(this.f21419e);
            TOBuyerInit tOBuyerInit2 = this.f21419e;
            DataX data = tOFetchApplicationDetails.getData();
            tOBuyerInit2.M1(String.valueOf(data != null ? data.getApplNo() : null));
            TOBuyerInit tOBuyerInit3 = this.f21419e;
            DataX data2 = tOFetchApplicationDetails.getData();
            tOBuyerInit3.S1(String.valueOf(data2 != null ? Integer.valueOf(data2.getOfficeCode()) : null));
            DataX data3 = tOFetchApplicationDetails.getData();
            String valueOf = String.valueOf(data3 != null ? data3.getChassisNo() : null);
            String substring = valueOf.substring(valueOf.length() - 5, valueOf.length());
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            c.a aVar = ka.c.f13158a;
            DataX data4 = tOFetchApplicationDetails.getData();
            if (aVar.m(String.valueOf((data4 == null || (transferOwnershipDto3 = data4.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto3.getMobileNo()))) {
                this.f21419e.Q1(gVar.l());
            } else {
                TOBuyerInit tOBuyerInit4 = this.f21419e;
                DataX data5 = tOFetchApplicationDetails.getData();
                tOBuyerInit4.Q1(String.valueOf((data5 == null || (transferOwnershipDto2 = data5.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto2.getMobileNo()));
            }
            TOBuyerInit tOBuyerInit5 = this.f21419e;
            DataX data6 = tOFetchApplicationDetails.getData();
            tOBuyerInit5.U1(String.valueOf(data6 != null ? data6.getRegnNo() : null));
            TOBuyerInit tOBuyerInit6 = this.f21419e;
            DataX data7 = tOFetchApplicationDetails.getData();
            tOBuyerInit6.N1(String.valueOf((data7 == null || (transferOwnershipDto = data7.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto.getAuthMode()));
            DataX data8 = tOFetchApplicationDetails.getData();
            String regnNo = data8 != null ? data8.getRegnNo() : null;
            DataX data9 = tOFetchApplicationDetails.getData();
            if (data9 != null) {
                str = data9.getStateCode();
            }
            this.f21419e.A1().A0(this.f21419e, String.valueOf(regnNo), String.valueOf(str), VContant.TRANFER_OF_OWNERSHIP, substring);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TOFetchApplicationDetails) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TOBuyerInit f21420e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TOBuyerInit tOBuyerInit) {
            super(1);
            this.f21420e = tOBuyerInit;
        }

        public final void b(String str) {
            if (this.f21420e.y1().isShowing()) {
                this.f21420e.y1().dismiss();
            }
            if (!p.o(str, "Error", true)) {
                TOBuyerInit tOBuyerInit = this.f21420e;
                tOBuyerInit.Y1(tOBuyerInit, str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TOBuyerInit f21421e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TOBuyerInit tOBuyerInit) {
            super(1);
            this.f21421e = tOBuyerInit;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        TOBuyerInit tOBuyerInit = this.f21421e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        tOBuyerInit.R1(companion.c(ownerDetailPuccPermit));
                        h A1 = this.f21421e.A1();
                        TOBuyerInit tOBuyerInit2 = this.f21421e;
                        A1.g1(tOBuyerInit2, String.valueOf(tOBuyerInit2.x1().getState_cd()));
                        h A12 = this.f21421e.A1();
                        TOBuyerInit tOBuyerInit3 = this.f21421e;
                        A12.i(tOBuyerInit3, String.valueOf(tOBuyerInit3.x1().getState_cd()));
                        return;
                    }
                }
                this.f21421e.y1().dismiss();
                TOBuyerInit tOBuyerInit4 = this.f21421e;
                tOBuyerInit4.r1(tOBuyerInit4, "No details found");
            } catch (Exception e10) {
                this.f21421e.y1().dismiss();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TOBuyerInit f21422e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TOBuyerInit tOBuyerInit) {
            super(1);
            this.f21422e = tOBuyerInit;
        }

        public final void b(String str) {
            this.f21422e.y1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TOBuyerInit f21423e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TOBuyerInit tOBuyerInit) {
            super(1);
            this.f21423e = tOBuyerInit;
        }

        public final void b(StateCostForDms stateCostForDms) {
            if (q.l0(stateCostForDms.getBook_app(), new String[]{","}, false, 0, 6, (Object) null).contains(VContant.TRANFER_OF_OWNERSHIP)) {
                new ld.h(this.f21423e).g(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateCostForDms) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21424a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f21424a = lVar;
        }

        public final pl.c a() {
            return this.f21424a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21424a.invoke(obj);
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

    public TOBuyerInit() {
        d.c y02 = y0(new e.d(), new ih.a(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.Z = y02;
    }

    private final void B1() {
        TOBuyerApplicationService tOBuyerApplicationService = this.I;
        m8 m8Var = null;
        if (tOBuyerApplicationService == null) {
            cm.l.v("retrofitService");
            tOBuyerApplicationService = null;
        }
        this.H = (lh.a) new u0((x0) this, (u0.b) new kh.b(new jh.a(tOBuyerApplicationService))).a(lh.a.class);
        m8 m8Var2 = this.G;
        if (m8Var2 == null) {
            cm.l.v("binding");
            m8Var2 = null;
        }
        m8Var2.f27441e.f28306g.setOnClickListener(new ih.h(this));
        m8 m8Var3 = this.G;
        if (m8Var3 == null) {
            cm.l.v("binding");
            m8Var3 = null;
        }
        m8Var3.f27441e.f28305f.setOnClickListener(new i(this));
        m8 m8Var4 = this.G;
        if (m8Var4 == null) {
            cm.l.v("binding");
            m8Var4 = null;
        }
        m8Var4.f27445i.setOnClickListener(new j(this));
        m8 m8Var5 = this.G;
        if (m8Var5 == null) {
            cm.l.v("binding");
            m8Var5 = null;
        }
        m8Var5.f27443g.setOnClickListener(new k(this));
        m8 m8Var6 = this.G;
        if (m8Var6 == null) {
            cm.l.v("binding");
            m8Var6 = null;
        }
        m8Var6.f27450n.setKeyListener(DigitsKeyListener.getInstance(this.K));
        m8 m8Var7 = this.G;
        if (m8Var7 == null) {
            cm.l.v("binding");
            m8Var7 = null;
        }
        m8Var7.f27450n.setRawInputType(4096);
        m8 m8Var8 = this.G;
        if (m8Var8 == null) {
            cm.l.v("binding");
            m8Var8 = null;
        }
        m8Var8.f27449m.setKeyListener(DigitsKeyListener.getInstance(this.K));
        m8 m8Var9 = this.G;
        if (m8Var9 == null) {
            cm.l.v("binding");
            m8Var9 = null;
        }
        m8Var9.f27449m.setRawInputType(4096);
        m8 m8Var10 = this.G;
        if (m8Var10 == null) {
            cm.l.v("binding");
            m8Var10 = null;
        }
        m8Var10.f27448l.setKeyListener(DigitsKeyListener.getInstance(this.K));
        m8 m8Var11 = this.G;
        if (m8Var11 == null) {
            cm.l.v("binding");
            m8Var11 = null;
        }
        m8Var11.f27448l.setRawInputType(4096);
        m8 m8Var12 = this.G;
        if (m8Var12 == null) {
            cm.l.v("binding");
            m8Var12 = null;
        }
        m8Var12.f27440d.setOnClickListener(new ih.l(this));
        m8 m8Var13 = this.G;
        if (m8Var13 == null) {
            cm.l.v("binding");
        } else {
            m8Var = m8Var13;
        }
        m8Var.f27452p.setOnClickListener(new ih.b(this));
    }

    /* access modifiers changed from: private */
    public static final void C1(TOBuyerInit tOBuyerInit, View view) {
        cm.l.f(tOBuyerInit, "this$0");
        tOBuyerInit.L1();
    }

    /* access modifiers changed from: private */
    public static final void D1(TOBuyerInit tOBuyerInit, View view) {
        cm.l.f(tOBuyerInit, "this$0");
        tOBuyerInit.finish();
    }

    /* access modifiers changed from: private */
    public static final void E1(TOBuyerInit tOBuyerInit, View view) {
        String valueOf;
        boolean z10;
        cm.l.f(tOBuyerInit, "this$0");
        if (tOBuyerInit.b2()) {
            m8 m8Var = null;
            if (cm.l.a(tOBuyerInit.M, "ApplicationNo")) {
                m8 m8Var2 = tOBuyerInit.G;
                if (m8Var2 == null) {
                    cm.l.v("binding");
                } else {
                    m8Var = m8Var2;
                }
                valueOf = String.valueOf(m8Var.f27448l.getText());
                z10 = false;
            } else {
                m8 m8Var3 = tOBuyerInit.G;
                if (m8Var3 == null) {
                    cm.l.v("binding");
                } else {
                    m8Var = m8Var3;
                }
                valueOf = String.valueOf(m8Var.f27448l.getText());
                z10 = true;
            }
            tOBuyerInit.u1(valueOf, z10);
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(TOBuyerInit tOBuyerInit, View view) {
        cm.l.f(tOBuyerInit, "this$0");
        tOBuyerInit.finish();
    }

    /* access modifiers changed from: private */
    public static final void G1(TOBuyerInit tOBuyerInit, View view) {
        cm.l.f(tOBuyerInit, "this$0");
        m8 m8Var = tOBuyerInit.G;
        m8 m8Var2 = null;
        if (m8Var == null) {
            cm.l.v("binding");
            m8Var = null;
        }
        if (!m8Var.f27440d.isSelected()) {
            m8 m8Var3 = tOBuyerInit.G;
            if (m8Var3 == null) {
                cm.l.v("binding");
                m8Var3 = null;
            }
            m8Var3.f27440d.setChecked(true);
            m8 m8Var4 = tOBuyerInit.G;
            if (m8Var4 == null) {
                cm.l.v("binding");
                m8Var4 = null;
            }
            m8Var4.f27440d.setSelected(true);
            m8 m8Var5 = tOBuyerInit.G;
            if (m8Var5 == null) {
                cm.l.v("binding");
                m8Var5 = null;
            }
            m8Var5.f27439c.setBackgroundResource(R.drawable.corner_circle_14_selected);
            m8 m8Var6 = tOBuyerInit.G;
            if (m8Var6 == null) {
                cm.l.v("binding");
                m8Var6 = null;
            }
            m8Var6.f27452p.setChecked(false);
            m8 m8Var7 = tOBuyerInit.G;
            if (m8Var7 == null) {
                cm.l.v("binding");
                m8Var7 = null;
            }
            m8Var7.f27452p.setSelected(false);
            m8 m8Var8 = tOBuyerInit.G;
            if (m8Var8 == null) {
                cm.l.v("binding");
                m8Var8 = null;
            }
            m8Var8.f27451o.setBackgroundResource(R.drawable.corner_circle_bg_14);
            m8 m8Var9 = tOBuyerInit.G;
            if (m8Var9 == null) {
                cm.l.v("binding");
                m8Var9 = null;
            }
            m8Var9.f27448l.setVisibility(0);
            m8 m8Var10 = tOBuyerInit.G;
            if (m8Var10 == null) {
                cm.l.v("binding");
                m8Var10 = null;
            }
            m8Var10.f27438b.setVisibility(0);
            m8 m8Var11 = tOBuyerInit.G;
            if (m8Var11 == null) {
                cm.l.v("binding");
                m8Var11 = null;
            }
            m8Var11.f27446j.setVisibility(8);
            m8 m8Var12 = tOBuyerInit.G;
            if (m8Var12 == null) {
                cm.l.v("binding");
                m8Var12 = null;
            }
            m8Var12.f27450n.setVisibility(8);
            m8 m8Var13 = tOBuyerInit.G;
            if (m8Var13 == null) {
                cm.l.v("binding");
                m8Var13 = null;
            }
            m8Var13.f27442f.setVisibility(8);
            m8 m8Var14 = tOBuyerInit.G;
            if (m8Var14 == null) {
                cm.l.v("binding");
            } else {
                m8Var2 = m8Var14;
            }
            m8Var2.f27449m.setVisibility(8);
            tOBuyerInit.M = "ApplicationNo";
            return;
        }
        m8 m8Var15 = tOBuyerInit.G;
        if (m8Var15 == null) {
            cm.l.v("binding");
            m8Var15 = null;
        }
        m8Var15.f27440d.setChecked(false);
        m8 m8Var16 = tOBuyerInit.G;
        if (m8Var16 == null) {
            cm.l.v("binding");
            m8Var16 = null;
        }
        m8Var16.f27440d.setSelected(false);
        m8 m8Var17 = tOBuyerInit.G;
        if (m8Var17 == null) {
            cm.l.v("binding");
        } else {
            m8Var2 = m8Var17;
        }
        m8Var2.f27439c.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void H1(TOBuyerInit tOBuyerInit, View view) {
        cm.l.f(tOBuyerInit, "this$0");
        m8 m8Var = tOBuyerInit.G;
        m8 m8Var2 = null;
        if (m8Var == null) {
            cm.l.v("binding");
            m8Var = null;
        }
        if (!m8Var.f27452p.isSelected()) {
            m8 m8Var3 = tOBuyerInit.G;
            if (m8Var3 == null) {
                cm.l.v("binding");
                m8Var3 = null;
            }
            m8Var3.f27440d.setChecked(false);
            m8 m8Var4 = tOBuyerInit.G;
            if (m8Var4 == null) {
                cm.l.v("binding");
                m8Var4 = null;
            }
            m8Var4.f27440d.setSelected(false);
            m8 m8Var5 = tOBuyerInit.G;
            if (m8Var5 == null) {
                cm.l.v("binding");
                m8Var5 = null;
            }
            m8Var5.f27439c.setBackgroundResource(R.drawable.corner_circle_bg_14);
            m8 m8Var6 = tOBuyerInit.G;
            if (m8Var6 == null) {
                cm.l.v("binding");
                m8Var6 = null;
            }
            m8Var6.f27452p.setChecked(true);
            m8 m8Var7 = tOBuyerInit.G;
            if (m8Var7 == null) {
                cm.l.v("binding");
                m8Var7 = null;
            }
            m8Var7.f27452p.setSelected(true);
            m8 m8Var8 = tOBuyerInit.G;
            if (m8Var8 == null) {
                cm.l.v("binding");
                m8Var8 = null;
            }
            m8Var8.f27451o.setBackgroundResource(R.drawable.corner_circle_14_selected);
            m8 m8Var9 = tOBuyerInit.G;
            if (m8Var9 == null) {
                cm.l.v("binding");
                m8Var9 = null;
            }
            m8Var9.f27448l.setVisibility(8);
            m8 m8Var10 = tOBuyerInit.G;
            if (m8Var10 == null) {
                cm.l.v("binding");
                m8Var10 = null;
            }
            m8Var10.f27438b.setVisibility(8);
            m8 m8Var11 = tOBuyerInit.G;
            if (m8Var11 == null) {
                cm.l.v("binding");
                m8Var11 = null;
            }
            m8Var11.f27446j.setVisibility(0);
            m8 m8Var12 = tOBuyerInit.G;
            if (m8Var12 == null) {
                cm.l.v("binding");
                m8Var12 = null;
            }
            m8Var12.f27450n.setVisibility(0);
            m8 m8Var13 = tOBuyerInit.G;
            if (m8Var13 == null) {
                cm.l.v("binding");
                m8Var13 = null;
            }
            m8Var13.f27442f.setVisibility(0);
            m8 m8Var14 = tOBuyerInit.G;
            if (m8Var14 == null) {
                cm.l.v("binding");
            } else {
                m8Var2 = m8Var14;
            }
            m8Var2.f27449m.setVisibility(0);
            tOBuyerInit.M = "Vehicle";
            return;
        }
        m8 m8Var15 = tOBuyerInit.G;
        if (m8Var15 == null) {
            cm.l.v("binding");
            m8Var15 = null;
        }
        m8Var15.f27452p.setChecked(false);
        m8 m8Var16 = tOBuyerInit.G;
        if (m8Var16 == null) {
            cm.l.v("binding");
            m8Var16 = null;
        }
        m8Var16.f27452p.setSelected(false);
        m8 m8Var17 = tOBuyerInit.G;
        if (m8Var17 == null) {
            cm.l.v("binding");
        } else {
            m8Var2 = m8Var17;
        }
        m8Var2.f27451o.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void I1(TOBuyerInit tOBuyerInit, d.a aVar) {
        cm.l.f(tOBuyerInit, "this$0");
        if (aVar.d() == -1) {
            Intent intent = new Intent(tOBuyerInit, TOBuyerSelectionScreen.class);
            intent.putExtra("RC", tOBuyerInit.x1().getRc_regn_no());
            intent.putExtra("applNo", tOBuyerInit.W);
            intent.putExtra("Buyerdetails", tOBuyerInit.Y);
            intent.putExtra(VContant.NEXGEN_isFACELESS, false);
            intent.putExtra("RcDetails", tOBuyerInit.x1());
            intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            tOBuyerInit.startActivity(intent);
            tOBuyerInit.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(TOBuyerInit tOBuyerInit, vahanOnlineCheck vahanonlinecheck) {
        cm.l.f(tOBuyerInit, "this$0");
        try {
            tOBuyerInit.y1().dismiss();
            if (tOBuyerInit.X.equals("A")) {
                Intent intent = new Intent(tOBuyerInit, SellerValidationWithAadhaar.class);
                intent.putExtra("RC", tOBuyerInit.x1().getRc_regn_no());
                intent.putExtra("map", tOBuyerInit.V);
                intent.putExtra("RcDetails", tOBuyerInit.x1());
                intent.putExtra("off_code", tOBuyerInit.U);
                intent.putExtra("isBuyer", true);
                intent.putExtra("applNo", tOBuyerInit.W);
                intent.putExtra("Buyerdetails", tOBuyerInit.Y);
                tOBuyerInit.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent(tOBuyerInit, ToGenerateOTPScreenForResult.class);
            intent2.putExtra("stateCd", tOBuyerInit.x1().getState_cd());
            intent2.putExtra("off_code", tOBuyerInit.U);
            intent2.putExtra(VContant.NEXGEN_isFACELESS, false);
            intent2.putExtra("RcDetails", tOBuyerInit.x1());
            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent2.putExtra(VContant.NEXGEN_addahar_address, "NA");
            intent2.putExtra("MobNo", tOBuyerInit.T);
            intent2.putExtra("ServiceName", "Transfer of OwnerShip \n(Buyer)");
            tOBuyerInit.Z.a(intent2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void K1(TOBuyerInit tOBuyerInit, String str) {
        cm.l.f(tOBuyerInit, "this$0");
        tOBuyerInit.y1().dismiss();
        VContant.Companion.K(tOBuyerInit, tOBuyerInit.v1().b("record_error_msg", tOBuyerInit.getString(R.string.service_unavable_please_try)));
    }

    private final void L1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void Y1(Context context, String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
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
        textView2.setVisibility(8);
        textView.setText(cVar.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ih.f(dialog));
        textView2.setOnClickListener(new ih.g(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void a2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r0 = r1.f27448l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r0.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        if (r0 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011f, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0124, code lost:
        r0 = r1.f27450n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
        if (r0 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b0, code lost:
        if (r0 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b2, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b7, code lost:
        r0 = r1.f27449m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f4, code lost:
        if (r0 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b2() {
        /*
            r7 = this;
            ni.m8 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27448l
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r3 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0026
            r3 = 2
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r0, r3)
        L_0x0026:
            ni.m8 r3 = r7.G
            if (r3 != 0) goto L_0x002e
            cm.l.v(r2)
            r3 = r1
        L_0x002e:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f27448l
            java.lang.String r5 = "txtApplicationNo"
            cm.l.e(r3, r5)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0080
            ni.m8 r3 = r7.G
            if (r3 != 0) goto L_0x0043
            cm.l.v(r2)
            r3 = r1
        L_0x0043:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f27448l
            android.text.Editable r3 = r3.getText()
            cm.l.c(r3)
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0080
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x005a
            cm.l.v(r2)
            r0 = r1
        L_0x005a:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27448l
            ld.c r3 = r7.w1()
            r5 = 2132018767(0x7f14064f, float:1.967585E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_APPLICATION"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0078
        L_0x0074:
            cm.l.v(r2)
            goto L_0x0079
        L_0x0078:
            r1 = r0
        L_0x0079:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f27448l
        L_0x007b:
            r0.requestFocus()
            goto L_0x01f7
        L_0x0080:
            ni.m8 r3 = r7.G
            if (r3 != 0) goto L_0x0088
            cm.l.v(r2)
            r3 = r1
        L_0x0088:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f27448l
            cm.l.e(r3, r5)
            int r3 = r3.getVisibility()
            r5 = 1
            if (r3 != 0) goto L_0x00d1
            ni.m8 r3 = r7.G
            if (r3 != 0) goto L_0x009c
            cm.l.v(r2)
            r3 = r1
        L_0x009c:
            androidx.appcompat.widget.AppCompatEditText r3 = r3.f27448l
            android.text.Editable r3 = r3.getText()
            cm.l.c(r3)
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00d1
            java.util.stream.IntStream r0 = r0.chars()
            com.nic.mparivahan.VahanServices.VahanApplicationStatus.s r3 = new com.nic.mparivahan.VahanServices.VahanApplicationStatus.s
            r3.<init>()
            boolean r0 = r0.allMatch(r3)
            if (r0 != 0) goto L_0x00ce
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x00c2
            cm.l.v(r2)
            r0 = r1
        L_0x00c2:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27448l
            java.lang.String r3 = "Invalid Application No."
            r0.setError(r3)
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0078
            goto L_0x0074
        L_0x00ce:
            r4 = r5
            goto L_0x01f7
        L_0x00d1:
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x00d9
            cm.l.v(r2)
            r0 = r1
        L_0x00d9:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27450n
            java.lang.String r3 = "txtRegNo"
            cm.l.e(r0, r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0128
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x00ee
            cm.l.v(r2)
            r0 = r1
        L_0x00ee:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27450n
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0128
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0105
            cm.l.v(r2)
            r0 = r1
        L_0x0105:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27450n
            ld.c r3 = r7.w1()
            r5 = 2132018753(0x7f140641, float:1.9675822E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_REG"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0123
        L_0x011f:
            cm.l.v(r2)
            goto L_0x0124
        L_0x0123:
            r1 = r0
        L_0x0124:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f27450n
            goto L_0x007b
        L_0x0128:
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0130
            cm.l.v(r2)
            r0 = r1
        L_0x0130:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27450n
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r3 = 4
            if (r0 >= r3) goto L_0x0164
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0149
            cm.l.v(r2)
            r0 = r1
        L_0x0149:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27450n
            ld.c r3 = r7.w1()
            r5 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "label_challan_invalid_vehicle_no"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0123
            goto L_0x011f
        L_0x0164:
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x016c
            cm.l.v(r2)
            r0 = r1
        L_0x016c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27449m
            java.lang.String r3 = "txtChassisNo"
            cm.l.e(r0, r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01bb
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0181
            cm.l.v(r2)
            r0 = r1
        L_0x0181:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27449m
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01bb
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x0198
            cm.l.v(r2)
            r0 = r1
        L_0x0198:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27449m
            ld.c r3 = r7.w1()
            r5 = 2132018724(0x7f140624, float:1.9675763E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_CHASSI"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x01b6
        L_0x01b2:
            cm.l.v(r2)
            goto L_0x01b7
        L_0x01b6:
            r1 = r0
        L_0x01b7:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f27449m
            goto L_0x007b
        L_0x01bb:
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x01c3
            cm.l.v(r2)
            r0 = r1
        L_0x01c3:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27449m
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r3 = 5
            if (r0 >= r3) goto L_0x00ce
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x01dc
            cm.l.v(r2)
            r0 = r1
        L_0x01dc:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27449m
            ld.c r3 = r7.w1()
            r5 = 2132018203(0x7f14041b, float:1.9674706E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "INVALID_CHASSI"
            java.lang.String r3 = r3.b(r6, r5)
            r0.setError(r3)
            ni.m8 r0 = r7.G
            if (r0 != 0) goto L_0x01b6
            goto L_0x01b2
        L_0x01f7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerInit.b2():boolean");
    }

    /* access modifiers changed from: private */
    public static final void s1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: lh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ni.m8} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void u1(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "viewModel"
            r1 = 0
            if (r6 == 0) goto L_0x0040
            android.app.ProgressDialog r6 = r4.y1()
            r6.show()
            lh.a r6 = r4.H
            if (r6 != 0) goto L_0x0014
            cm.l.v(r0)
            r6 = r1
        L_0x0014:
            ni.m8 r0 = r4.G
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x001e
            cm.l.v(r2)
            r0 = r1
        L_0x001e:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27450n
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ni.m8 r3 = r4.G
            if (r3 != 0) goto L_0x0030
            cm.l.v(r2)
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            androidx.appcompat.widget.AppCompatEditText r1 = r1.f27449m
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 1
            r6.g(r5, r2, r0, r1)
            goto L_0x0056
        L_0x0040:
            android.app.ProgressDialog r6 = r4.y1()
            r6.show()
            lh.a r6 = r4.H
            if (r6 != 0) goto L_0x004f
            cm.l.v(r0)
            goto L_0x0050
        L_0x004f:
            r1 = r6
        L_0x0050:
            r6 = 0
            java.lang.String r0 = ""
            r1.g(r5, r6, r0, r0)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerInit.u1(java.lang.String, boolean):void");
    }

    public final h A1() {
        h hVar = this.O;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void O1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.R = cVar;
    }

    public final void P1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void R1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.Q = nrvDetails;
    }

    public final void S1(String str) {
        this.U = str;
    }

    public final void T1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void V1(TOFetchApplicationDetails tOFetchApplicationDetails) {
        this.Y = tOFetchApplicationDetails;
    }

    public final void W1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.P = vahanProService;
    }

    public final void X1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.O = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m8 c10 = m8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        lh.a aVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        P1(new ld.c(this));
        this.I = TOBuyerApplicationService.f21413a.b(this);
        W1(VahanProService.f21196b.b(this));
        X1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(z1()))).a(h.class));
        T1(new ProgressDialog(this));
        y1().setMessage(w1().b("label_challan_please_wait", "Please wait..."));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        m8 m8Var = this.G;
        if (m8Var == null) {
            cm.l.v("binding");
            m8Var = null;
        }
        m8Var.f27441e.f28308i.setText(String.valueOf(w1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        O1(new ld.c(this));
        this.V.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        B1();
        lh.a aVar2 = this.H;
        if (aVar2 == null) {
            cm.l.v("viewModel");
            aVar2 = null;
        }
        aVar2.h().g(this, new f(new a(this)));
        lh.a aVar3 = this.H;
        if (aVar3 == null) {
            cm.l.v("viewModel");
        } else {
            aVar = aVar3;
        }
        aVar.i().g(this, new f(new b(this)));
        A1().D0().g(this, new f(new c(this)));
        A1().C0().g(this, new f(new d(this)));
        A1().g0().g(this, new f(new e(this)));
        A1().Z0().g(this, new ih.d(this));
        A1().a1().g(this, new ih.e(this));
    }

    public final void r1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(new ld.c(context).b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new ih.c(dialog));
        dialog.show();
    }

    public final ld.c v1() {
        ld.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.c w1() {
        ld.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.Q;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final VahanProService z1() {
        VahanProService vahanProService = this.P;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }
}
