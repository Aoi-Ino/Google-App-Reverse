package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.h;
import bi.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanViewModel.PendingTransTaxBreakUpModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.VahanPendingTransBankModel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import ni.h7;
import og.d;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;

public final class VahanVerifyPendingTransactionList extends androidx.appcompat.app.d implements d.b {
    private String G = "";
    private String H = "";
    /* access modifiers changed from: private */
    public String I = "";
    /* access modifiers changed from: private */
    public bi.b J;
    private ApplicationService K;
    public ProgressDialog L;
    private ArrayList M = new ArrayList();
    private og.d N;
    private h7 O;
    /* access modifiers changed from: private */
    public String P = "";
    /* access modifiers changed from: private */
    public h Q;
    private VahanProService R;
    public l S;
    public VahanServiceConnection T;
    /* access modifiers changed from: private */
    public String U = "";
    /* access modifiers changed from: private */
    public String V = "";
    /* access modifiers changed from: private */
    public String W = "";
    /* access modifiers changed from: private */
    public String X = "";
    public NrvDetails Y;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransactionList f20824e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList) {
            super(1);
            this.f20824e = vahanVerifyPendingTransactionList;
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
                bi.b p12 = this.f20824e.J;
                if (p12 == null) {
                    cm.l.v("viewModel");
                    p12 = null;
                }
                p12.F(this.f20824e, jSONObject);
            } catch (Exception e10) {
                this.f20824e.u1().dismiss();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PendingTransTaxBreakUpModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransactionList f20825e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList) {
            super(1);
            this.f20825e = vahanVerifyPendingTransactionList;
        }

        public final void b(String str) {
            if (this.f20825e.u1().isShowing()) {
                this.f20825e.u1().dismiss();
            }
            if (!str.equals("Error")) {
                this.f20825e.E1(str);
            } else {
                this.f20825e.E1("Not able to verify payment from bank. Please try again later");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransactionList f20826e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList) {
            super(1);
            this.f20826e = vahanVerifyPendingTransactionList;
        }

        public final void b(VahanPendingTransBankModel vahanPendingTransBankModel) {
            String m12;
            h hVar;
            this.f20826e.U = vahanPendingTransBankModel.getReturnUrl();
            if (q.F(this.f20826e.V, ".0", false, 2, (Object) null)) {
                m12 = this.f20826e.V.substring(0, this.f20826e.V.length() - 2);
                cm.l.e(m12, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                m12 = this.f20826e.V;
            }
            String obj = q.B0(m12).toString();
            h q12 = this.f20826e.Q;
            if (q12 == null) {
                cm.l.v("viewModelBeforePayment");
                hVar = null;
            } else {
                hVar = q12;
            }
            VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList = this.f20826e;
            hVar.A0(vahanVerifyPendingTransactionList, vahanVerifyPendingTransactionList.X, this.f20826e.W, obj, this.f20826e.I);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanPendingTransBankModel) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransactionList f20827e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList) {
            super(1);
            this.f20827e = vahanVerifyPendingTransactionList;
        }

        public final void b(String str) {
            if (this.f20827e.u1().isShowing()) {
                this.f20827e.u1().dismiss();
            }
            if (!str.equals("Error")) {
                this.f20827e.E1(str);
            } else {
                this.f20827e.E1("Not able to verify payment from bank. Please try again later");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransactionList f20828e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList) {
            super(1);
            this.f20828e = vahanVerifyPendingTransactionList;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            if (this.f20828e.u1().isShowing()) {
                this.f20828e.u1().dismiss();
            }
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList = this.f20828e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanVerifyPendingTransactionList.A1(companion.c(ownerDetailPuccPermit));
                        String j12 = this.f20828e.P;
                        String valueOf = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                        String m12 = this.f20828e.V;
                        Double valueOf2 = Double.valueOf(0.0d);
                        String regn_no2 = ownerDetailPuccPermit.getRegn_no();
                        String o12 = this.f20828e.W;
                        String rc_vh_class_cd = this.f20828e.t1().getRc_vh_class_cd();
                        BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest((String) null, (Boolean) null, "", j12, (ChaangeOfAddressStatus) null, 0, (dulicateRcResponseModle) null, "", "", (HPAResModle) null, (HptTerResponse) null, 0, "", 0, "", "", (NocDraftResponse) null, valueOf, "", "", "", m12, "", "", valueOf2, 0, regn_no2, o12, "", "", "", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, (DuplicateFitessDraft) null, (Data) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) null, (DataX) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) null, (String) null, (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) null, (com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data) null, (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) null);
                        Intent intent = new Intent(this.f20828e, VahanPendingTransactionPayment.class);
                        intent.putExtra(VContant.NEXGEN_INTENT_CODE, "");
                        intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                        intent.putExtra(VContant.APP_NO, this.f20828e.P);
                        intent.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                        intent.putExtra("rc_number", ownerDetailPuccPermit.getRegn_no());
                        intent.putExtra(VContant.PURPOSE_CODE, this.f20828e.V);
                        intent.putExtra("URL", this.f20828e.U);
                        intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
                        intent.putExtra("RC", ownerDetailPuccPermit.getRegn_no());
                        intent.putExtra("RcDetails", this.f20828e.t1());
                        intent.putExtra(VContant.NEXGEN_addahar_name, "");
                        intent.putExtra(VContant.NEXGEN_addahar_address, "");
                        this.f20828e.startActivity(intent);
                        this.f20828e.finish();
                        return;
                    }
                }
                VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList2 = this.f20828e;
                vahanVerifyPendingTransactionList2.E1(vahanVerifyPendingTransactionList2.getString(R.string.service_unavable_please_try));
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f20828e.u1().isShowing()) {
                    this.f20828e.u1().dismiss();
                }
                VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList3 = this.f20828e;
                vahanVerifyPendingTransactionList3.E1(vahanVerifyPendingTransactionList3.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanVerifyPendingTransactionList f20829e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList) {
            super(1);
            this.f20829e = vahanVerifyPendingTransactionList;
        }

        public final void b(String str) {
            if (this.f20829e.u1().isShowing()) {
                this.f20829e.u1().dismiss();
            }
            VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList = this.f20829e;
            vahanVerifyPendingTransactionList.E1(vahanVerifyPendingTransactionList.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20830a;

        g(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f20830a = lVar;
        }

        public final pl.c a() {
            return this.f20830a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20830a.invoke(obj);
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
    public final void E1(String str) {
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
        textView.setOnClickListener(new z1(dialog));
        textView2.setOnClickListener(new a2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void F1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void w1() {
        ApplicationService applicationService = this.K;
        h7 h7Var = null;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.J = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        VahanProService vahanProService = this.R;
        if (vahanProService == null) {
            cm.l.v("retrofitServiceBeforePayment");
            vahanProService = null;
        }
        this.Q = (h) new u0((x0) this, (u0.b) new bi.g(new wg.d(vahanProService))).a(h.class);
        D1((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(v1()))).a(l.class));
        h7 h7Var2 = this.O;
        if (h7Var2 == null) {
            cm.l.v("binding");
            h7Var2 = null;
        }
        h7Var2.f26634b.setLayoutManager(new LinearLayoutManager(this));
        this.N = new og.d(this, this.M, this);
        h7 h7Var3 = this.O;
        if (h7Var3 == null) {
            cm.l.v("binding");
            h7Var3 = null;
        }
        RecyclerView recyclerView = h7Var3.f26634b;
        og.d dVar = this.N;
        if (dVar == null) {
            cm.l.v("adapter");
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        h7 h7Var4 = this.O;
        if (h7Var4 == null) {
            cm.l.v("binding");
            h7Var4 = null;
        }
        h7Var4.f26635c.f28308i.setText("Verify Payment Status");
        h7 h7Var5 = this.O;
        if (h7Var5 == null) {
            cm.l.v("binding");
            h7Var5 = null;
        }
        h7Var5.f26635c.f28305f.setOnClickListener(new x1(this));
        h7 h7Var6 = this.O;
        if (h7Var6 == null) {
            cm.l.v("binding");
        } else {
            h7Var = h7Var6;
        }
        h7Var.f26635c.f28306g.setOnClickListener(new y1(this));
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList, View view) {
        cm.l.f(vahanVerifyPendingTransactionList, "this$0");
        vahanVerifyPendingTransactionList.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanVerifyPendingTransactionList vahanVerifyPendingTransactionList, View view) {
        cm.l.f(vahanVerifyPendingTransactionList, "this$0");
        vahanVerifyPendingTransactionList.z1();
    }

    private final void z1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.Y = nrvDetails;
    }

    public final void B1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void C1(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.T = vahanServiceConnection;
    }

    public final void D1(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.S = lVar;
    }

    public void f0(int i10) {
        if (this.M.size() > 0) {
            this.P = ((PendingTransRegNoDataModel) this.M.get(i10)).getTransactionID();
            this.V = ((PendingTransRegNoDataModel) this.M.get(i10)).getPurCD();
            this.W = ((PendingTransRegNoDataModel) this.M.get(i10)).getStateCD();
            this.X = ((PendingTransRegNoDataModel) this.M.get(i10)).getRegnNo();
            String valueOf = String.valueOf(((PendingTransRegNoDataModel) this.M.get(i10)).getChassisNo());
            String substring = valueOf.substring(valueOf.length() - 5, valueOf.length());
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.I = substring;
            if (u1().isShowing()) {
                u1().dismiss();
            }
            u1().show();
            bi.b bVar = this.J;
            if (bVar == null) {
                cm.l.v("viewModel");
                bVar = null;
            }
            bVar.A(this, ((PendingTransRegNoDataModel) this.M.get(i10)).getPurCD(), ((PendingTransRegNoDataModel) this.M.get(i10)).getTransactionID(), ((PendingTransRegNoDataModel) this.M.get(i10)).getOffCD(), ((PendingTransRegNoDataModel) this.M.get(i10)).getStateCD(), ((PendingTransRegNoDataModel) this.M.get(i10)).getRegnNo());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pending_transaction_list);
        h7 c10 = h7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.O = c10;
        h hVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        this.K = ApplicationService.f21181a.b(this);
        this.R = VahanProService.f21196b.b(this);
        C1(VahanServiceConnection.f21199a.b(this));
        if (getIntent() != null) {
            if (getIntent().hasExtra("selectedTab")) {
                String stringExtra = getIntent().getStringExtra("selectedTab");
                cm.l.c(stringExtra);
                this.G = stringExtra;
            }
            if (getIntent().hasExtra("inputNo")) {
                String stringExtra2 = getIntent().getStringExtra("inputNo");
                cm.l.c(stringExtra2);
                this.H = stringExtra2;
            }
            if (getIntent().hasExtra("chassisNo")) {
                String stringExtra3 = getIntent().getStringExtra("chassisNo");
                cm.l.c(stringExtra3);
                this.I = stringExtra3;
            }
            if (getIntent().hasExtra("listValue")) {
                Type type = new VahanVerifyPendingTransactionList$onCreate$type$1().getType();
                cm.l.e(type, "getType(...)");
                Object k10 = new i7.d().k(getIntent().getStringExtra("listValue"), type);
                cm.l.d(k10, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel> }");
                this.M = (ArrayList) k10;
            }
        }
        B1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        w1();
        bi.b bVar = this.J;
        if (bVar == null) {
            cm.l.v("viewModel");
            bVar = null;
        }
        bVar.z().g(this, new g(new a(this)));
        bi.b bVar2 = this.J;
        if (bVar2 == null) {
            cm.l.v("viewModel");
            bVar2 = null;
        }
        bVar2.y().g(this, new g(new b(this)));
        bi.b bVar3 = this.J;
        if (bVar3 == null) {
            cm.l.v("viewModel");
            bVar3 = null;
        }
        bVar3.C().g(this, new g(new c(this)));
        bi.b bVar4 = this.J;
        if (bVar4 == null) {
            cm.l.v("viewModel");
            bVar4 = null;
        }
        bVar4.B().g(this, new g(new d(this)));
        h hVar2 = this.Q;
        if (hVar2 == null) {
            cm.l.v("viewModelBeforePayment");
            hVar2 = null;
        }
        hVar2.D0().g(this, new g(new e(this)));
        h hVar3 = this.Q;
        if (hVar3 == null) {
            cm.l.v("viewModelBeforePayment");
        } else {
            hVar = hVar3;
        }
        hVar.C0().g(this, new g(new f(this)));
    }

    public final NrvDetails t1() {
        NrvDetails nrvDetails = this.Y;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final VahanServiceConnection v1() {
        VahanServiceConnection vahanServiceConnection = this.T;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitServiceRcDetails");
        return null;
    }
}
