package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cm.l;
import cm.u;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ka.c;
import ld.c;
import ni.td;
import v9.e;
import yg.a0;
import yg.b0;
import yg.c0;
import yg.d0;
import yg.e0;
import yg.f0;
import yg.v;
import yg.w;
import yg.x;
import yg.y;
import yg.z;
import z9.a;

public final class HypothecationTerminationActivity extends d {
    public ProgressDialog G;
    public h H;
    public VahanProService I;
    public td J;
    public String K;
    public String L;
    public NrvDetails M;
    private Calendar N = Calendar.getInstance();
    public String O;
    public HptDetailsModle P;
    private boolean Q;
    public String R;
    public String S;
    public c T;

    /* access modifiers changed from: private */
    public static final void B1(HypothecationTerminationActivity hypothecationTerminationActivity, View view) {
        l.f(hypothecationTerminationActivity, "this$0");
        Intent intent = new Intent(hypothecationTerminationActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationTerminationActivity.x1());
        intent.putExtra("RcDetails", hypothecationTerminationActivity.y1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationActivity.Q);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationActivity.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationActivity.q1());
        hypothecationTerminationActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void C1(HypothecationTerminationActivity hypothecationTerminationActivity, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(hypothecationTerminationActivity, "this$0");
        hypothecationTerminationActivity.N.set(1, i10);
        hypothecationTerminationActivity.N.set(2, i11);
        hypothecationTerminationActivity.N.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", hypothecationTerminationActivity.N.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", hypothecationTerminationActivity.N.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", hypothecationTerminationActivity.N.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        hypothecationTerminationActivity.P1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        hypothecationTerminationActivity.s1().f28754h.setText(simpleDateFormat.format(hypothecationTerminationActivity.N.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void D1(HypothecationTerminationActivity hypothecationTerminationActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(hypothecationTerminationActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(hypothecationTerminationActivity, onDateSetListener, hypothecationTerminationActivity.N.get(1), hypothecationTerminationActivity.N.get(2), hypothecationTerminationActivity.N.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void E1(HypothecationTerminationActivity hypothecationTerminationActivity, u uVar, HptDetailsModle hptDetailsModle) {
        AppCompatTextView appCompatTextView;
        l.f(hypothecationTerminationActivity, "this$0");
        l.f(uVar, "$languageSession");
        hypothecationTerminationActivity.w1().dismiss();
        try {
            l.c(hptDetailsModle);
            hypothecationTerminationActivity.Q1(hptDetailsModle);
            String valueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String valueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String valueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String valueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String valueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String str = hptDetailsModle.getHp_type().toString();
            c.a aVar = ka.c.f13158a;
            if (!aVar.m(str)) {
                if (!aVar.m(valueOf)) {
                    if (valueOf.length() == 0) {
                        appCompatTextView = hypothecationTerminationActivity.s1().f28758l;
                        valueOf = "--";
                    } else {
                        appCompatTextView = hypothecationTerminationActivity.s1().f28758l;
                    }
                    appCompatTextView.setText(valueOf);
                    if (valueOf2.length() != 0) {
                        AppCompatTextView appCompatTextView2 = hypothecationTerminationActivity.s1().f28756j;
                        appCompatTextView2.setText(valueOf2 + valueOf3 + valueOf4);
                    }
                    if (valueOf5.length() != 0) {
                        hypothecationTerminationActivity.s1().f28753g.setText(a.f18947a.f(valueOf5));
                    }
                    if (str == null) {
                        return;
                    }
                    if (str.length() != 0) {
                        hypothecationTerminationActivity.s1().f28769w.setText(str.toString());
                        return;
                    }
                    return;
                }
            }
            String b10 = ((ld.c) uVar.f20234e).b("unable_to_process_your_request", hypothecationTerminationActivity.getString(R.string.unable_to_process_your_request));
            l.c(b10);
            hypothecationTerminationActivity.Y1(hypothecationTerminationActivity, b10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(HypothecationTerminationActivity hypothecationTerminationActivity, u uVar, String str) {
        l.f(hypothecationTerminationActivity, "this$0");
        l.f(uVar, "$languageSession");
        hypothecationTerminationActivity.w1().dismiss();
        try {
            String b10 = ((ld.c) uVar.f20234e).b("unable_to_process_your_request", hypothecationTerminationActivity.getString(R.string.unable_to_process_your_request));
            l.c(b10);
            hypothecationTerminationActivity.Y1(hypothecationTerminationActivity, b10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(HypothecationTerminationActivity hypothecationTerminationActivity, View view) {
        HypothecationTerminationActivity hypothecationTerminationActivity2 = hypothecationTerminationActivity;
        l.f(hypothecationTerminationActivity2, "this$0");
        if (hypothecationTerminationActivity.s1().f28754h.getText().length() < 2) {
            Toast.makeText(hypothecationTerminationActivity2, hypothecationTerminationActivity.u1().b("please_select_date", hypothecationTerminationActivity2.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            String fncr_add1 = hypothecationTerminationActivity.t1().getFncr_add1();
            String fncr_add2 = hypothecationTerminationActivity.t1().getFncr_add2();
            String fncr_add3 = hypothecationTerminationActivity.t1().getFncr_add3();
            String fncr_district = hypothecationTerminationActivity.t1().getFncr_district();
            String fncr_district2 = hypothecationTerminationActivity.t1().getFncr_district();
            String fncr_name = hypothecationTerminationActivity.t1().getFncr_name();
            String fncr_pincode = hypothecationTerminationActivity.t1().getFncr_pincode();
            String fncr_state = hypothecationTerminationActivity.t1().getFncr_state();
            String fncr_state2 = hypothecationTerminationActivity.t1().getFncr_state();
            String from_dt = hypothecationTerminationActivity.t1().getFrom_dt();
            String hp_type = hypothecationTerminationActivity.t1().getHp_type();
            String v12 = hypothecationTerminationActivity.v1();
            String m10 = v9.d.f17494a.m();
            String x12 = hypothecationTerminationActivity.x1();
            String state_cd = hypothecationTerminationActivity.y1().getState_cd();
            a.C0251a aVar = a.f18947a;
            HPTRequestParamModle hPTRequestParamModle = r1;
            HPTRequestParamModle hPTRequestParamModle2 = new HPTRequestParamModle(" ", fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_district2, fncr_name, fncr_pincode, fncr_state, fncr_state2, "0", "0", "0", "0", from_dt, " ", hp_type, " ", v12, m10, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, x12, "1", state_cd, aVar.h(hypothecationTerminationActivity.s1().f28754h.getText().toString()), "", aVar.h(hypothecationTerminationActivity.s1().f28754h.getText().toString()), "");
            hypothecationTerminationActivity.A1().n1(hypothecationTerminationActivity, hPTRequestParamModle);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(HypothecationTerminationActivity hypothecationTerminationActivity, HptTerResponse hptTerResponse) {
        HptTerResponse hptTerResponse2;
        HypothecationTerminationActivity hypothecationTerminationActivity2 = hypothecationTerminationActivity;
        l.f(hypothecationTerminationActivity2, "this$0");
        hypothecationTerminationActivity.w1().dismiss();
        try {
            String appl_no = hptTerResponse.getAppl_no();
            if (appl_no == null) {
                return;
            }
            if (appl_no.length() != 0) {
                ld.h hVar = new ld.h(hypothecationTerminationActivity2);
                l.c(hptTerResponse);
                if (hypothecationTerminationActivity2.Q) {
                    hptTerResponse2 = HptTerResponse.copy$default(hptTerResponse, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, hVar.a(), 268435455, (Object) null);
                } else {
                    hptTerResponse2 = HptTerResponse.copy$default(hptTerResponse, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, " ", 268435455, (Object) null);
                }
                Intent intent = new Intent(hypothecationTerminationActivity2, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHICATION_TERMINATION_CODE);
                intent.putExtra(VContant.HYPOTHICATION_TERMINATION_CODE, hptTerResponse2);
                intent.putExtra(VContant.APP_NO, hptTerResponse.getAppl_no());
                intent.putExtra("state_code", hypothecationTerminationActivity.y1().getState_cd());
                intent.putExtra("rc_number", hypothecationTerminationActivity.x1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
                intent.putExtra("off_code", hypothecationTerminationActivity.v1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationActivity2.Q);
                intent.putExtra("RC", hypothecationTerminationActivity.x1());
                intent.putExtra("RcDetails", hypothecationTerminationActivity.y1());
                intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationActivity.r1());
                intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationActivity.q1());
                hypothecationTerminationActivity2.startActivity(intent);
                hypothecationTerminationActivity.finish();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(HypothecationTerminationActivity hypothecationTerminationActivity, String str) {
        l.f(hypothecationTerminationActivity, "this$0");
        hypothecationTerminationActivity.w1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J1(HypothecationTerminationActivity hypothecationTerminationActivity, View view) {
        l.f(hypothecationTerminationActivity, "this$0");
        VUtility.Companion.v(hypothecationTerminationActivity, hypothecationTerminationActivity.u1().b("are_you_sure_you_want_to_leave", hypothecationTerminationActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void K1(HypothecationTerminationActivity hypothecationTerminationActivity, View view) {
        l.f(hypothecationTerminationActivity, "this$0");
        hypothecationTerminationActivity.L1();
    }

    private final void L1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, HypothecationTerminationActivity hypothecationTerminationActivity, View view) {
        l.f(dialog, "$dialog");
        l.f(hypothecationTerminationActivity, "this$0");
        dialog.dismiss();
        hypothecationTerminationActivity.finish();
    }

    public final h A1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void N1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void O1(td tdVar) {
        l.f(tdVar, "<set-?>");
        this.J = tdVar;
    }

    public final void P1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void Q1(HptDetailsModle hptDetailsModle) {
        l.f(hptDetailsModle, "<set-?>");
        this.P = hptDetailsModle;
    }

    public final void R1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void T1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.G = progressDialog;
    }

    public final void U1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void V1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void W1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void X1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void Y1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new w(dialog, this));
        dialog.show();
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, new ld.c(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_hypothecation_termination);
        td c10 = td.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        O1(c10);
        setContentView((View) s1().b());
        e.f17509a.V0(this, s1());
        u uVar = new u();
        uVar.f20234e = new ld.c(this);
        W1(VahanProService.f21196b.b(this));
        T1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        X1((h) new u0((x0) this, (u0.b) new g(new wg.d(z1()))).a(h.class));
        U1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        V1((NrvDetails) serializableExtra);
        N1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        M1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        R1(new ld.c(this));
        TextView textView = s1().H;
        textView.setText(u1().b("vehicle_no", "Vehicle No.:") + ' ' + x1());
        s1().I.setText(u1().b("view_vehicle_details", "View Vehicle Details"));
        s1().I.setPaintFlags(s1().I.getPaintFlags() | 8);
        s1().I.setOnClickListener(new v(this));
        S1(String.valueOf(getIntent().getStringExtra("off_code")));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.Q = booleanExtra;
        if (booleanExtra) {
            s1().f28765s.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.Q;
        LinearLayout linearLayout = s1().f28765s.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        try {
            w1().show();
            A1().i0(this, x1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        s1().f28754h.setOnClickListener(new y(this, new x(this)));
        A1().j0().g(this, new z(this, uVar));
        A1().k0().g(this, new a0(this, uVar));
        s1().f28750d.setOnClickListener(new b0(this));
        A1().l0().g(this, new c0(this));
        A1().m0().g(this, new d0(this));
        s1().f28768v.f28305f.setOnClickListener(new e0(this));
        s1().f28768v.f28306g.setOnClickListener(new f0(this));
    }

    public final String q1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String r1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final td s1() {
        td tdVar = this.J;
        if (tdVar != null) {
            return tdVar;
        }
        l.v("binding");
        return null;
    }

    public final HptDetailsModle t1() {
        HptDetailsModle hptDetailsModle = this.P;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        l.v("htpmodle");
        return null;
    }

    public final ld.c u1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String v1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService z1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }
}
