package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import ld.c;
import ni.sd;
import v9.e;
import yg.o;
import yg.p;
import yg.q;
import yg.r;
import yg.s;
import yg.t;
import yg.u;
import z9.a;

public final class HypothecationContinuationActivity extends d {
    public sd G;
    public h H;
    public VahanProService I;
    public String J;
    public String K;
    public NrvDetails L;
    public ProgressDialog M;
    private boolean N;
    public c O;
    public String P;
    public String Q;

    /* access modifiers changed from: private */
    public static final void A1(HypothecationContinuationActivity hypothecationContinuationActivity, View view) {
        l.f(hypothecationContinuationActivity, "this$0");
        VUtility.Companion.v(hypothecationContinuationActivity, hypothecationContinuationActivity.p1().b("are_you_sure_you_want_to_leave", hypothecationContinuationActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void B1(HypothecationContinuationActivity hypothecationContinuationActivity, View view) {
        l.f(hypothecationContinuationActivity, "this$0");
        hypothecationContinuationActivity.C1();
    }

    private final void C1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void O1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w1(HypothecationContinuationActivity hypothecationContinuationActivity, View view) {
        l.f(hypothecationContinuationActivity, "this$0");
        Intent intent = new Intent(hypothecationContinuationActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationContinuationActivity.s1());
        intent.putExtra("RcDetails", hypothecationContinuationActivity.t1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationContinuationActivity.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationContinuationActivity.n1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationContinuationActivity.m1());
        hypothecationContinuationActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void x1(HypothecationContinuationActivity hypothecationContinuationActivity, HptDetailsModle hptDetailsModle) {
        l.f(hypothecationContinuationActivity, "this$0");
        hypothecationContinuationActivity.r1().dismiss();
        try {
            hypothecationContinuationActivity.o1().f28583o.setVisibility(0);
            hypothecationContinuationActivity.o1().f28572d.setVisibility(0);
            String valueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String valueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String valueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String valueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String valueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String str = hptDetailsModle.getHp_type().toString();
            if (valueOf.length() == 0) {
                hypothecationContinuationActivity.o1().f28578j.setText("--");
            } else {
                hypothecationContinuationActivity.o1().f28578j.setText(valueOf);
            }
            if (valueOf2.length() != 0) {
                AppCompatTextView appCompatTextView = hypothecationContinuationActivity.o1().f28576h;
                appCompatTextView.setText(valueOf2 + valueOf3 + valueOf4);
            }
            if (valueOf5.length() != 0) {
                hypothecationContinuationActivity.o1().f28575g.setText(a.f18947a.f(valueOf5));
            }
            if (str == null) {
                return;
            }
            if (str.length() != 0) {
                hypothecationContinuationActivity.o1().f28589u.setText(str.toString());
            }
        } catch (Exception e10) {
            hypothecationContinuationActivity.o1().f28583o.setVisibility(8);
            hypothecationContinuationActivity.o1().f28572d.setVisibility(8);
            hypothecationContinuationActivity.N1(hypothecationContinuationActivity, hypothecationContinuationActivity.getString(R.string.service_unavable_please_try));
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(HypothecationContinuationActivity hypothecationContinuationActivity, String str) {
        l.f(hypothecationContinuationActivity, "this$0");
        hypothecationContinuationActivity.r1().dismiss();
        hypothecationContinuationActivity.o1().f28583o.setVisibility(8);
        hypothecationContinuationActivity.o1().f28572d.setVisibility(8);
        hypothecationContinuationActivity.N1(hypothecationContinuationActivity, hypothecationContinuationActivity.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void z1(HypothecationContinuationActivity hypothecationContinuationActivity, View view) {
        l.f(hypothecationContinuationActivity, "this$0");
        hypothecationContinuationActivity.setIntent(new Intent(hypothecationContinuationActivity, FeesDetailsScreen.class));
        hypothecationContinuationActivity.getIntent().putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_CONTINUATION_CODE);
        hypothecationContinuationActivity.getIntent().putExtra(VContant.PURPOSE_CODE, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE);
        hypothecationContinuationActivity.getIntent().putExtra("state_code", hypothecationContinuationActivity.t1().getState_cd());
        Intent intent = hypothecationContinuationActivity.getIntent();
        if (intent != null) {
            intent.putExtra("rc_number", hypothecationContinuationActivity.s1());
        }
        Intent intent2 = hypothecationContinuationActivity.getIntent();
        if (intent2 != null) {
            intent2.putExtra("RcDetails", hypothecationContinuationActivity.t1());
        }
        Intent intent3 = hypothecationContinuationActivity.getIntent();
        if (intent3 != null) {
            intent3.putExtra("off_code", hypothecationContinuationActivity.q1());
        }
        hypothecationContinuationActivity.getIntent().putExtra(VContant.SERVICE_NAME, "Hypothecation Continuation");
        hypothecationContinuationActivity.getIntent().putExtra(VContant.NEXGEN_isFACELESS, hypothecationContinuationActivity.N);
        hypothecationContinuationActivity.getIntent().putExtra("RC", hypothecationContinuationActivity.s1());
        Intent intent4 = hypothecationContinuationActivity.getIntent();
        if (intent4 != null) {
            intent4.putExtra(VContant.NEXGEN_addahar_name, hypothecationContinuationActivity.n1());
        }
        Intent intent5 = hypothecationContinuationActivity.getIntent();
        if (intent5 != null) {
            intent5.putExtra(VContant.NEXGEN_addahar_address, hypothecationContinuationActivity.m1());
        }
        hypothecationContinuationActivity.startActivity(hypothecationContinuationActivity.getIntent());
        hypothecationContinuationActivity.finish();
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void F1(sd sdVar) {
        l.f(sdVar, "<set-?>");
        this.G = sdVar;
    }

    public final void G1(c cVar) {
        l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void I1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void K1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void L1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void M1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void N1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new u(dialog));
        dialog.show();
    }

    public final String m1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String n1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final sd o1() {
        sd sdVar = this.G;
        if (sdVar != null) {
            return sdVar;
        }
        l.v("binding");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, p1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_hypothecation_continuation);
        sd c10 = sd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        F1(c10);
        setContentView((View) o1().b());
        e.f17509a.S0(this, o1());
        L1(VahanProService.f21196b.b(this));
        J1(String.valueOf(getIntent().getStringExtra("RC")));
        H1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.N = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        K1((NrvDetails) serializableExtra);
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        if (this.N) {
            o1().f28585q.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.N;
        LinearLayout linearLayout = o1().f28585q.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        G1(new c(this));
        TextView textView = o1().F;
        textView.setText(p1().b("vehicle_no", "Vehicle No.:") + ' ' + s1());
        o1().G.setText(p1().b("view_vehicle_details", "View Vehicle Details"));
        o1().G.setPaintFlags(o1().G.getPaintFlags() | 8);
        o1().G.setOnClickListener(new o(this));
        I1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        M1((h) new u0((x0) this, (u0.b) new g(new wg.d(u1()))).a(h.class));
        try {
            r1().show();
            v1().i0(this, s1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        v1().j0().g(this, new p(this));
        v1().k0().g(this, new q(this));
        o1().f28572d.setOnClickListener(new r(this));
        o1().f28588t.f28305f.setOnClickListener(new s(this));
        o1().f28588t.f28306g.setOnClickListener(new t(this));
    }

    public final c p1() {
        c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String q1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String s1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails t1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService u1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h v1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
