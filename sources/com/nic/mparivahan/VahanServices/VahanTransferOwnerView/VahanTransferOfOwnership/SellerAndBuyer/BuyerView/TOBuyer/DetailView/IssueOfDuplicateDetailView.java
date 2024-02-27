package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
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
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.b;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import eh.f;
import eh.i;
import eh.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import ld.c;
import ni.hb;
import pg.g;

public final class IssueOfDuplicateDetailView extends d {
    public hb G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    public String K;
    public NrvDetails L;
    public String M;
    public String N;
    public String O;
    private Calendar P = Calendar.getInstance();
    private boolean Q;
    public c R;
    private ArrayList S = new ArrayList();
    private MultiServiceDraftTO T;
    public MultiSelectionViewModel U;
    public MultiService V;
    private DoAadhaarResponse W;
    private ArrayList X = new ArrayList();

    /* access modifiers changed from: private */
    public static final void t1(IssueOfDuplicateDetailView issueOfDuplicateDetailView, View view) {
        l.f(issueOfDuplicateDetailView, "this$0");
        Intent intent = new Intent(issueOfDuplicateDetailView, VahanVehicleDetailsService.class);
        intent.putExtra("RC", issueOfDuplicateDetailView.q1());
        intent.putExtra("RcDetails", issueOfDuplicateDetailView.r1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, issueOfDuplicateDetailView.Q);
        intent.putExtra(VContant.NEXGEN_addahar_name, issueOfDuplicateDetailView.l1());
        intent.putExtra(VContant.NEXGEN_addahar_address, issueOfDuplicateDetailView.k1());
        issueOfDuplicateDetailView.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void u1(IssueOfDuplicateDetailView issueOfDuplicateDetailView, View view) {
        l.f(issueOfDuplicateDetailView, "this$0");
        try {
            g.f30363a.e(issueOfDuplicateDetailView, issueOfDuplicateDetailView.S);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void v1(IssueOfDuplicateDetailView issueOfDuplicateDetailView, View view) {
        l.f(issueOfDuplicateDetailView, "this$0");
        try {
            MultiServiceDraftTO multiServiceDraftTO = issueOfDuplicateDetailView.T;
            l.c(multiServiceDraftTO);
            if (multiServiceDraftTO.getPurposeCode().contains(Integer.valueOf(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)))) {
                Intent intent = new Intent(issueOfDuplicateDetailView, HypothecationTerminationViewDetails.class);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, issueOfDuplicateDetailView.S);
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, issueOfDuplicateDetailView.T);
                intent.putExtra("AadhaarDetails", issueOfDuplicateDetailView.W);
                intent.putExtra("RC", issueOfDuplicateDetailView.r1().getRc_regn_no());
                intent.putExtra("RcDetails", issueOfDuplicateDetailView.r1());
                intent.putExtra("off_code", issueOfDuplicateDetailView.r1().getRc_off_cd());
                intent.putExtra(VContant.NEXGEN_isFACELESS, issueOfDuplicateDetailView.Q);
                intent.putExtra(VContant.NEXGEN_addahar_name, issueOfDuplicateDetailView.l1());
                intent.putExtra(VContant.NEXGEN_addahar_address, issueOfDuplicateDetailView.k1());
                issueOfDuplicateDetailView.startActivity(intent);
            } else {
                Intent intent2 = new Intent();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.");
                VContant.Companion companion = VContant.Companion;
                ArrayList arrayList = issueOfDuplicateDetailView.S;
                l.c(arrayList);
                Object obj = arrayList.get(0);
                l.e(obj, "get(...)");
                sb2.append(companion.q((String) obj, "B"));
                intent2.setClass(issueOfDuplicateDetailView, Class.forName(sb2.toString()));
                intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, issueOfDuplicateDetailView.S);
                intent2.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, issueOfDuplicateDetailView.T);
                intent2.putExtra("AadhaarDetails", issueOfDuplicateDetailView.W);
                intent2.putExtra("RC", issueOfDuplicateDetailView.r1().getRc_regn_no());
                intent2.putExtra("RcDetails", issueOfDuplicateDetailView.r1());
                intent2.putExtra("off_code", issueOfDuplicateDetailView.r1().getRc_off_cd());
                intent2.putExtra(VContant.NEXGEN_isFACELESS, issueOfDuplicateDetailView.Q);
                intent2.putExtra(VContant.NEXGEN_addahar_name, issueOfDuplicateDetailView.l1());
                intent2.putExtra(VContant.NEXGEN_addahar_address, issueOfDuplicateDetailView.k1());
                issueOfDuplicateDetailView.startActivity(intent2);
            }
            issueOfDuplicateDetailView.finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void w1(IssueOfDuplicateDetailView issueOfDuplicateDetailView, View view) {
        l.f(issueOfDuplicateDetailView, "this$0");
        VUtility.Companion.v(issueOfDuplicateDetailView, issueOfDuplicateDetailView.n1().b("are_you_sure_you_want_to_leave", issueOfDuplicateDetailView.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void x1(IssueOfDuplicateDetailView issueOfDuplicateDetailView, View view) {
        l.f(issueOfDuplicateDetailView, "this$0");
        issueOfDuplicateDetailView.y1();
    }

    private final void y1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void B1(hb hbVar) {
        l.f(hbVar, "<set-?>");
        this.G = hbVar;
    }

    public final void C1(hb hbVar, MultiServiceDraftTO multiServiceDraftTO) {
        l.f(hbVar, "binding");
        l.f(multiServiceDraftTO, "multiServiceobj");
        Durcdto durcdto = multiServiceDraftTO.getDurcdto();
        if (durcdto != null) {
            hbVar.f26692h.setText(durcdto.getReason());
            if (p.o(durcdto.getReason(), "OTHER", true) || p.o(durcdto.getReason(), "TORN", true)) {
                hbVar.f26689e.setVisibility(8);
                hbVar.f26693i.setText(durcdto.getReason());
                return;
            }
            try {
                hbVar.f26693i.setText(durcdto.getReason());
                hbVar.f26689e.setVisibility(0);
                hbVar.f26687c.setText(durcdto.getFir_dt());
                hbVar.f26688d.setText(durcdto.getFir_no().toString());
                hbVar.f26693i.setText(durcdto.getMsg());
                hbVar.f26690f.setText(durcdto.getPolice_station());
            } catch (Exception unused) {
            }
        }
    }

    public final void D1(c cVar) {
        l.f(cVar, "<set-?>");
        this.R = cVar;
    }

    public final void E1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.V = multiService;
    }

    public final void F1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void G1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void I1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void J1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void K1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void L1(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.U = multiSelectionViewModel;
    }

    public final String k1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String l1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final hb m1() {
        hb hbVar = this.G;
        if (hbVar != null) {
            return hbVar;
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
        VUtility.Companion.v(this, n1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.issueofduplicate_detailsview);
        hb c10 = hb.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        B1(c10);
        setContentView((View) m1().b());
        getWindow().addFlags(128);
        J1(VahanProService.f21196b.b(this));
        D1(new c(this));
        G1(new ProgressDialog(this));
        p1().setMessage("Please wait...");
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        K1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(s1()))).a(h.class));
        E1(MultiService.f21070a.b(this));
        L1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(o1()))).a(MultiSelectionViewModel.class));
        F1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.Q = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        A1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        z1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        H1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        I1((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.T = (MultiServiceDraftTO) serializableExtra2;
        this.S = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        try {
            this.W = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        hb m12 = m1();
        MultiServiceDraftTO multiServiceDraftTO = this.T;
        l.c(multiServiceDraftTO);
        C1(m12, multiServiceDraftTO);
        ArrayList arrayList = this.S;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            D1(new c(this));
        }
        m1().f26695k.f28308i.setText(String.valueOf(n1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        if (this.Q) {
            m1().f26691g.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.Q;
        LinearLayout linearLayout = m1().f26691g.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        D1(new c(this));
        m1().f26695k.f28304e.setVisibility(0);
        m1().f26695k.f28304e.setText(q1());
        SpannableString spannableString = new SpannableString(q1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        m1().f26695k.f28304e.setText(spannableString);
        m1().f26704t.setText(n1().b("view_vehicle_details", "View Vehicle Details"));
        m1().f26686b.setText("Confirm & Proceed");
        m1().f26704t.setPaintFlags(m1().f26704t.getPaintFlags() | 8);
        m1().f26695k.f28304e.setOnClickListener(new f(this));
        m1().f26695k.f28308i.setOnClickListener(new eh.g(this));
        m1().f26686b.setOnClickListener(new eh.h(this));
        m1().f26695k.f28305f.setOnClickListener(new i(this));
        m1().f26695k.f28306g.setOnClickListener(new j(this));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.J;
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
        NrvDetails nrvDetails = this.L;
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
        this.O = str;
    }
}
