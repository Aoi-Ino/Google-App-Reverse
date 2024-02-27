package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.b;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import fh.f;
import java.io.Serializable;
import java.util.ArrayList;
import ld.c;
import ni.db;
import pg.g;
import v9.e;
import z9.a;

public final class HypothecationContinuationActivityMultiTO extends d {
    public db G;
    public h H;
    public VahanProService I;
    public String J;
    public String K;
    public NrvDetails L;
    public ProgressDialog M;
    private boolean N;
    public c O;
    private ArrayList P = new ArrayList();
    private MultiServiceDraftTO Q;
    public MultiSelectionViewModel R;
    public MultiService S;
    public String T;
    public String U;

    /* access modifiers changed from: private */
    public static final void A1(HypothecationContinuationActivityMultiTO hypothecationContinuationActivityMultiTO, HptDetailsModle hptDetailsModle) {
        l.f(hypothecationContinuationActivityMultiTO, "this$0");
        hypothecationContinuationActivityMultiTO.t1().dismiss();
        try {
            hypothecationContinuationActivityMultiTO.p1().f25943o.setVisibility(0);
            hypothecationContinuationActivityMultiTO.p1().f25932d.setVisibility(0);
            String valueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String valueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String valueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String valueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String valueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String str = hptDetailsModle.getHp_type().toString();
            if (valueOf.length() == 0) {
                hypothecationContinuationActivityMultiTO.p1().f25938j.setText("--");
            } else {
                hypothecationContinuationActivityMultiTO.p1().f25938j.setText(valueOf);
            }
            if (valueOf2.length() != 0) {
                AppCompatTextView appCompatTextView = hypothecationContinuationActivityMultiTO.p1().f25936h;
                appCompatTextView.setText(valueOf2 + valueOf3 + valueOf4);
            }
            if (valueOf5.length() != 0) {
                hypothecationContinuationActivityMultiTO.p1().f25935g.setText(a.f18947a.f(valueOf5));
            }
            if (str == null) {
                return;
            }
            if (str.length() != 0) {
                hypothecationContinuationActivityMultiTO.p1().f25950v.setText(str.toString());
            }
        } catch (Exception e10) {
            hypothecationContinuationActivityMultiTO.p1().f25943o.setVisibility(8);
            hypothecationContinuationActivityMultiTO.p1().f25932d.setVisibility(8);
            hypothecationContinuationActivityMultiTO.S1(hypothecationContinuationActivityMultiTO, hypothecationContinuationActivityMultiTO.getString(R.string.service_unavable_please_try));
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(HypothecationContinuationActivityMultiTO hypothecationContinuationActivityMultiTO, String str) {
        l.f(hypothecationContinuationActivityMultiTO, "this$0");
        hypothecationContinuationActivityMultiTO.t1().dismiss();
        hypothecationContinuationActivityMultiTO.p1().f25943o.setVisibility(8);
        hypothecationContinuationActivityMultiTO.p1().f25932d.setVisibility(8);
        hypothecationContinuationActivityMultiTO.S1(hypothecationContinuationActivityMultiTO, hypothecationContinuationActivityMultiTO.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void C1(HypothecationContinuationActivityMultiTO hypothecationContinuationActivityMultiTO, View view) {
        l.f(hypothecationContinuationActivityMultiTO, "this$0");
        Intent intent = new Intent();
        intent.setClass(hypothecationContinuationActivityMultiTO, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView." + VContant.Companion.s(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, hypothecationContinuationActivityMultiTO.P, "S")));
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationContinuationActivityMultiTO.P);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, hypothecationContinuationActivityMultiTO.Q);
        intent.putExtra("RC", hypothecationContinuationActivityMultiTO.u1());
        intent.putExtra("RcDetails", hypothecationContinuationActivityMultiTO.v1());
        intent.putExtra("off_code", hypothecationContinuationActivityMultiTO.s1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationContinuationActivityMultiTO.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationContinuationActivityMultiTO.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationContinuationActivityMultiTO.n1());
        hypothecationContinuationActivityMultiTO.startActivity(intent);
        hypothecationContinuationActivityMultiTO.finish();
    }

    /* access modifiers changed from: private */
    public static final void D1(HypothecationContinuationActivityMultiTO hypothecationContinuationActivityMultiTO, View view) {
        l.f(hypothecationContinuationActivityMultiTO, "this$0");
        VUtility.Companion.v(hypothecationContinuationActivityMultiTO, hypothecationContinuationActivityMultiTO.q1().b("are_you_sure_you_want_to_leave", hypothecationContinuationActivityMultiTO.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void E1(HypothecationContinuationActivityMultiTO hypothecationContinuationActivityMultiTO, View view) {
        l.f(hypothecationContinuationActivityMultiTO, "this$0");
        hypothecationContinuationActivityMultiTO.F1();
    }

    private final void F1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y1(HypothecationContinuationActivityMultiTO hypothecationContinuationActivityMultiTO, View view) {
        l.f(hypothecationContinuationActivityMultiTO, "this$0");
        try {
            g.f30363a.e(hypothecationContinuationActivityMultiTO, hypothecationContinuationActivityMultiTO.P);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void z1(HypothecationContinuationActivityMultiTO hypothecationContinuationActivityMultiTO, View view) {
        l.f(hypothecationContinuationActivityMultiTO, "this$0");
        Intent intent = new Intent(hypothecationContinuationActivityMultiTO, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationContinuationActivityMultiTO.u1());
        intent.putExtra("RcDetails", hypothecationContinuationActivityMultiTO.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationContinuationActivityMultiTO.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationContinuationActivityMultiTO.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationContinuationActivityMultiTO.n1());
        hypothecationContinuationActivityMultiTO.startActivity(intent);
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.U = str;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void I1(db dbVar) {
        l.f(dbVar, "<set-?>");
        this.G = dbVar;
    }

    public final void J1(c cVar) {
        l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void K1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.S = multiService;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void M1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final void N1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void O1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void P1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void Q1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void R1(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.R = multiSelectionViewModel;
    }

    public final void S1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new fh.h(dialog));
        dialog.show();
    }

    public final String n1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.hypo_continustion_multi);
        db c10 = db.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        I1(c10);
        setContentView((View) p1().b());
        getWindow().addFlags(128);
        e.f17509a.U0(this, p1());
        P1(VahanProService.f21196b.b(this));
        K1(MultiService.f21070a.b(this));
        R1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(r1()))).a(MultiSelectionViewModel.class));
        N1(String.valueOf(getIntent().getStringExtra("RC")));
        L1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.N = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        O1((NrvDetails) serializableExtra);
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.Q = (MultiServiceDraftTO) serializableExtra2;
        this.P = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        p1().f25949u.f28304e.setVisibility(0);
        p1().f25949u.f28304e.setText(u1());
        SpannableString spannableString = new SpannableString(u1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        p1().f25949u.f28304e.setText(spannableString);
        J1(new c(this));
        ArrayList arrayList = this.P;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            p1().f25949u.f28308i.setText(q1().b("hypothecation_continuation", getString(R.string.vahan_hypothecation_continuation)));
        } else {
            SpannableString spannableString2 = new SpannableString(String.valueOf(q1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            p1().f25949u.f28308i.setText(spannableString2);
        }
        p1().f25949u.f28308i.setOnClickListener(new fh.a(this));
        if (this.N) {
            p1().f25945q.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.N;
        LinearLayout linearLayout = p1().f25945q.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        J1(new c(this));
        TextView textView = p1().G;
        textView.setText(q1().b("vehicle_no", "Vehicle No.:") + ' ' + u1());
        p1().H.setText(q1().b("view_vehicle_details", "View Vehicle Details"));
        p1().H.setPaintFlags(p1().H.getPaintFlags() | 8);
        p1().f25949u.f28304e.setOnClickListener(new fh.b(this));
        M1(new ProgressDialog(this));
        t1().setMessage("Please wait...");
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        Q1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(w1()))).a(h.class));
        try {
            t1().show();
            x1().i0(this, u1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        x1().j0().g(this, new fh.c(this));
        x1().k0().g(this, new fh.d(this));
        p1().f25932d.setOnClickListener(new fh.e(this));
        p1().f25949u.f28305f.setOnClickListener(new f(this));
        p1().f25949u.f28306g.setOnClickListener(new fh.g(this));
    }

    public final db p1() {
        db dbVar = this.G;
        if (dbVar != null) {
            return dbVar;
        }
        l.v("binding");
        return null;
    }

    public final c q1() {
        c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final MultiService r1() {
        MultiService multiService = this.S;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public final String s1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h x1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
