package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.b;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import eh.a;
import eh.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import ld.c;
import ni.bb;
import pg.g;

public final class HypothecationTerminationViewDetails extends d {
    public ProgressDialog G;
    public h H;
    public VahanProService I;
    public bb J;
    public String K;
    public String L;
    public NrvDetails M;
    private Calendar N = Calendar.getInstance();
    private boolean O;
    public String P;
    public String Q;
    public c R;
    private ArrayList S = new ArrayList();
    private MultiServiceDraftTO T;
    public MultiSelectionViewModel U;
    public MultiService V;
    private DoAadhaarResponse W;

    /* access modifiers changed from: private */
    public static final void t1(HypothecationTerminationViewDetails hypothecationTerminationViewDetails, View view) {
        l.f(hypothecationTerminationViewDetails, "this$0");
        try {
            g.f30363a.e(hypothecationTerminationViewDetails, hypothecationTerminationViewDetails.S);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void u1(HypothecationTerminationViewDetails hypothecationTerminationViewDetails, View view) {
        l.f(hypothecationTerminationViewDetails, "this$0");
        Intent intent = new Intent(hypothecationTerminationViewDetails, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationTerminationViewDetails.q1());
        intent.putExtra("RcDetails", hypothecationTerminationViewDetails.r1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationViewDetails.O);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationViewDetails.l1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationViewDetails.k1());
        hypothecationTerminationViewDetails.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void v1(HypothecationTerminationViewDetails hypothecationTerminationViewDetails, View view) {
        l.f(hypothecationTerminationViewDetails, "this$0");
        Intent intent = new Intent();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.");
        VContant.Companion companion = VContant.Companion;
        ArrayList arrayList = hypothecationTerminationViewDetails.S;
        l.c(arrayList);
        Object obj = arrayList.get(0);
        l.e(obj, "get(...)");
        sb2.append(companion.q((String) obj, "B"));
        intent.setClass(hypothecationTerminationViewDetails, Class.forName(sb2.toString()));
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationTerminationViewDetails.S);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, hypothecationTerminationViewDetails.T);
        intent.putExtra("AadhaarDetails", hypothecationTerminationViewDetails.W);
        intent.putExtra("RC", hypothecationTerminationViewDetails.r1().getRc_regn_no());
        intent.putExtra("RcDetails", hypothecationTerminationViewDetails.r1());
        intent.putExtra("off_code", hypothecationTerminationViewDetails.r1().getRc_off_cd());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationViewDetails.O);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationViewDetails.l1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationViewDetails.k1());
        hypothecationTerminationViewDetails.startActivity(intent);
        hypothecationTerminationViewDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void w1(HypothecationTerminationViewDetails hypothecationTerminationViewDetails, View view) {
        l.f(hypothecationTerminationViewDetails, "this$0");
        VUtility.Companion.v(hypothecationTerminationViewDetails, hypothecationTerminationViewDetails.n1().b("are_you_sure_you_want_to_leave", hypothecationTerminationViewDetails.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void x1(HypothecationTerminationViewDetails hypothecationTerminationViewDetails, View view) {
        l.f(hypothecationTerminationViewDetails, "this$0");
        hypothecationTerminationViewDetails.y1();
    }

    private final void y1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void B1(bb bbVar) {
        l.f(bbVar, "<set-?>");
        this.J = bbVar;
    }

    public final void C1(c cVar) {
        l.f(cVar, "<set-?>");
        this.R = cVar;
    }

    public final void D1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.V = multiService;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void F1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.G = progressDialog;
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void H1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void I1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void J1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void K1(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.U = multiSelectionViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r1.getHptDto();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L1(ni.bb r7) {
        /*
            r6 = this;
            java.lang.String r0 = "binding"
            cm.l.f(r7, r0)
            android.widget.TextView r0 = r7.f25537h
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r1 = r6.T
            r2 = 0
            if (r1 == 0) goto L_0x0017
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r1 = r1.getHptDto()
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = r1.getUpto_dt()
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            r0.setText(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r7.f25553x
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r1 = r6.T
            if (r1 == 0) goto L_0x002c
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r1 = r1.getHptDto()
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = r1.getHp_type()
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            r0.setText(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r7.f25541l
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r1 = r6.T
            if (r1 == 0) goto L_0x0041
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r1 = r1.getHptDto()
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = r1.getFncr_name()
            goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            r0.setText(r1)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r0 = r6.T
            if (r0 == 0) goto L_0x0054
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r0 = r0.getHptDto()
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r0.getFncr_add1()
            goto L_0x0055
        L_0x0054:
            r0 = r2
        L_0x0055:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r1 = r6.T
            if (r1 == 0) goto L_0x0068
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r1 = r1.getHptDto()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = r1.getFncr_add2()
            goto L_0x0069
        L_0x0068:
            r1 = r2
        L_0x0069:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r3 = r6.T
            if (r3 == 0) goto L_0x007c
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r3 = r3.getHptDto()
            if (r3 == 0) goto L_0x007c
            java.lang.String r3 = r3.getFncr_add3()
            goto L_0x007d
        L_0x007c:
            r3 = r2
        L_0x007d:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            android.widget.TextView r4 = r7.f25536g
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r5 = r6.T
            if (r5 == 0) goto L_0x0091
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r5 = r5.getHptDto()
            if (r5 == 0) goto L_0x0091
            java.lang.String r2 = r5.getFrom_dt()
        L_0x0091:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.setText(r2)
            int r2 = r0.length()
            if (r2 != 0) goto L_0x009f
            goto L_0x00b6
        L_0x009f:
            androidx.appcompat.widget.AppCompatTextView r7 = r7.f25539j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r7.setText(r0)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.HypothecationTerminationViewDetails.L1(ni.bb):void");
    }

    public final String k1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String l1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final bb m1() {
        bb bbVar = this.J;
        if (bbVar != null) {
            return bbVar;
        }
        l.v("binding");
        return null;
    }

    public final c n1() {
        c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final MultiService o1() {
        MultiService multiService = this.V;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, new c(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.hpt_details);
        bb c10 = bb.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        B1(c10);
        setContentView((View) m1().b());
        getWindow().addFlags(128);
        C1(new c(this));
        I1(VahanProService.f21196b.b(this));
        F1(new ProgressDialog(this));
        p1().setMessage("Please wait...");
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        J1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(s1()))).a(h.class));
        D1(MultiService.f21070a.b(this));
        K1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(o1()))).a(MultiSelectionViewModel.class));
        G1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        H1((NrvDetails) serializableExtra);
        A1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        z1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.T = (MultiServiceDraftTO) serializableExtra2;
        this.S = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        try {
            DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
            this.W = doAadhaarResponse;
            Log.e("getAddharrdetails-ToBuyerMain", String.valueOf(doAadhaarResponse));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        L1(m1());
        m1().f25533d.setText("Confirm & Proceed");
        m1().f25552w.f28304e.setVisibility(0);
        m1().f25552w.f28304e.setText(q1());
        SpannableString spannableString = new SpannableString(q1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        m1().f25552w.f28304e.setText(spannableString);
        ArrayList arrayList = this.S;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            m1().f25552w.f28308i.setText(String.valueOf(n1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        } else {
            SpannableString spannableString2 = new SpannableString("RC Services");
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            m1().f25552w.f28308i.setText(spannableString2);
        }
        m1().f25552w.f28308i.setOnClickListener(new a(this));
        TextView textView = m1().I;
        textView.setText(n1().b("vehicle_no", "Vehicle No.:") + ' ' + q1());
        m1().J.setText(n1().b("view_vehicle_details", "View Vehicle Details"));
        m1().J.setPaintFlags(m1().J.getPaintFlags() | 8);
        m1().f25552w.f28304e.setOnClickListener(new eh.b(this));
        E1(String.valueOf(r1().getRc_off_cd()));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.O = booleanExtra;
        if (booleanExtra) {
            m1().f25548s.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.O;
        LinearLayout linearLayout = m1().f25548s.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        m1().f25533d.setOnClickListener(new eh.c(this));
        m1().f25552w.f28305f.setOnClickListener(new eh.d(this));
        m1().f25552w.f28306g.setOnClickListener(new e(this));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String q1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails r1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService s1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final void z1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }
}
