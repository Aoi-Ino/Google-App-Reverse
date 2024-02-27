package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.CancellationModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCCancellationResponse;
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
import ni.qc;
import pl.x;
import v9.e;
import yg.g2;
import yg.h2;
import yg.i2;
import yg.j2;
import yg.k2;
import yg.l2;

public final class VahanRcCancellationActivity extends d {
    public qc G;
    public VahanProService H;
    public qe.b I;
    public DuplicateFitnessService J;
    public ProgressDialog K;
    public String L;
    public NrvDetails M;
    public String N;
    public String O;
    public String P;
    private Calendar Q = Calendar.getInstance();
    public String R;
    private boolean S;
    public ld.c T;
    private String U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanRcCancellationActivity f21245e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanRcCancellationActivity vahanRcCancellationActivity) {
            super(1);
            this.f21245e = vahanRcCancellationActivity;
        }

        public final void b(RCCancellationResponse rCCancellationResponse) {
            this.f21245e.t1().dismiss();
            if (rCCancellationResponse.getApiMessage().getStatusCode() == 200) {
                Data copy$default = Data.copy$default(rCCancellationResponse.getData(), (String) null, (String) null, (Long) null, (String) null, 0, (Long) null, 0, this.f21245e.n1().f28294f.getText().toString(), (String) null, (String) null, 895, (Object) null);
                Intent intent = new Intent(this.f21245e, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_CANCELLATION_CODE);
                intent.putExtra(VContant.RC_CANCELLATION_CODE, copy$default);
                intent.putExtra(VContant.APP_NO, rCCancellationResponse.getData().getApplNo());
                intent.putExtra("state_code", this.f21245e.v1().getState_cd());
                intent.putExtra("rc_number", this.f21245e.u1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_CACELLATION_PURPOSE_CODE);
                intent.putExtra("off_code", this.f21245e.s1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21245e.w1());
                intent.putExtra("RC", this.f21245e.u1());
                intent.putExtra("RcDetails", this.f21245e.v1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21245e.m1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21245e.l1());
                this.f21245e.startActivity(intent);
                this.f21245e.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RCCancellationResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanRcCancellationActivity f21246e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanRcCancellationActivity vahanRcCancellationActivity) {
            super(1);
            this.f21246e = vahanRcCancellationActivity;
        }

        public final void b(String str) {
            this.f21246e.t1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21247a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21247a = lVar;
        }

        public final pl.c a() {
            return this.f21247a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21247a.invoke(obj);
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
    public static final void A1(VahanRcCancellationActivity vahanRcCancellationActivity, View view) {
        Toast makeText;
        VahanRcCancellationActivity vahanRcCancellationActivity2 = vahanRcCancellationActivity;
        cm.l.f(vahanRcCancellationActivity2, "this$0");
        new ld.c(vahanRcCancellationActivity2);
        try {
            String obj = vahanRcCancellationActivity.n1().f28294f.getText().toString();
            String str = vahanRcCancellationActivity2.U;
            if (str != null) {
                if (!p.q(str)) {
                    if (obj.length() < 3) {
                        makeText = Toast.makeText(vahanRcCancellationActivity2, vahanRcCancellationActivity.r1().b("please_enter_reason", vahanRcCancellationActivity2.getString(R.string.please_enter_reason)), 0);
                        makeText.show();
                    }
                    vahanRcCancellationActivity.t1().show();
                    vahanRcCancellationActivity.o1().K(vahanRcCancellationActivity2, new CancellationModle("", Integer.parseInt(vahanRcCancellationActivity.s1()), Integer.parseInt(VContant.RC_CACELLATION_PURPOSE_CODE), vahanRcCancellationActivity.u1(), String.valueOf(vahanRcCancellationActivity.v1().getState_cd()), "", "", "", obj, "", "", "", "", "", "", "", "", "", "", vahanRcCancellationActivity2.U));
                    return;
                }
            }
            makeText = Toast.makeText(vahanRcCancellationActivity2, vahanRcCancellationActivity.r1().b("pls_enter_RcCancallationDate", vahanRcCancellationActivity2.getString(R.string.pls_enter_rc_cancallation_date)), 0);
            makeText.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(VahanRcCancellationActivity vahanRcCancellationActivity, View view) {
        cm.l.f(vahanRcCancellationActivity, "this$0");
        VUtility.Companion.v(vahanRcCancellationActivity, vahanRcCancellationActivity.r1().b("are_you_sure_you_want_to_leave", vahanRcCancellationActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void C1(VahanRcCancellationActivity vahanRcCancellationActivity, View view) {
        cm.l.f(vahanRcCancellationActivity, "this$0");
        vahanRcCancellationActivity.D1();
    }

    private final void D1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanRcCancellationActivity vahanRcCancellationActivity, View view) {
        cm.l.f(vahanRcCancellationActivity, "this$0");
        Intent intent = new Intent(vahanRcCancellationActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanRcCancellationActivity.u1());
        intent.putExtra("RcDetails", vahanRcCancellationActivity.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanRcCancellationActivity.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanRcCancellationActivity.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanRcCancellationActivity.l1());
        vahanRcCancellationActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanRcCancellationActivity vahanRcCancellationActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(vahanRcCancellationActivity, "this$0");
        vahanRcCancellationActivity.Q.set(1, i10);
        vahanRcCancellationActivity.Q.set(2, i11);
        vahanRcCancellationActivity.Q.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", vahanRcCancellationActivity.Q.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", vahanRcCancellationActivity.Q.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", vahanRcCancellationActivity.Q.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        vahanRcCancellationActivity.J1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        vahanRcCancellationActivity.n1().f28292d.setText(simpleDateFormat.format(vahanRcCancellationActivity.Q.getTime()));
        vahanRcCancellationActivity.U = vahanRcCancellationActivity.q1();
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanRcCancellationActivity vahanRcCancellationActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(vahanRcCancellationActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(vahanRcCancellationActivity, onDateSetListener, vahanRcCancellationActivity.Q.get(1), vahanRcCancellationActivity.Q.get(2), vahanRcCancellationActivity.Q.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public final void E1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void G1(qc qcVar) {
        cm.l.f(qcVar, "<set-?>");
        this.G = qcVar;
    }

    public final void H1(qe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.I = bVar;
    }

    public final void I1(DuplicateFitnessService duplicateFitnessService) {
        cm.l.f(duplicateFitnessService, "<set-?>");
        this.J = duplicateFitnessService;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void K1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void M1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void O1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void P1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final String l1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final qc n1() {
        qc qcVar = this.G;
        if (qcVar != null) {
            return qcVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final qe.b o1() {
        qe.b bVar = this.I;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("fitnessDraftViewModle");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.rccanceltion);
        qc c10 = qc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        G1(c10);
        setContentView((View) n1().b());
        e.f17509a.K2(this, n1());
        P1(VahanProService.f21196b.b(this));
        I1(DuplicateFitnessService.f20591a.b(this));
        K1(new ld.c(this));
        M1(new ProgressDialog(this));
        t1().setMessage(r1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        H1((qe.b) new u0((x0) this, (u0.b) new qe.a(new pe.a(p1()))).a(qe.b.class));
        L1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.S = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        N1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        O1((NrvDetails) serializableExtra);
        K1(new ld.c(this));
        TextView textView = n1().f28298j;
        textView.setText(r1().b("vehicle_no", "Vehicle No.:") + ' ' + u1());
        n1().f28299k.setText(r1().b("view_vehicle_details", "View Vehicle Details"));
        n1().f28299k.setPaintFlags(n1().f28299k.getPaintFlags() | 8);
        n1().f28299k.setOnClickListener(new g2(this));
        n1().f28292d.setOnClickListener(new i2(this, new h2(this)));
        n1().f28291c.setOnClickListener(new j2(this));
        o1().x().g(this, new c(new a(this)));
        o1().y().g(this, new c(new b(this)));
        n1().f28295g.f28305f.setOnClickListener(new k2(this));
        n1().f28295g.f28306g.setOnClickListener(new l2(this));
    }

    public final DuplicateFitnessService p1() {
        DuplicateFitnessService duplicateFitnessService = this.J;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        cm.l.v("fitnessService");
        return null;
    }

    public final String q1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("formated_date");
        return null;
    }

    public final ld.c r1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final String s1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final boolean w1() {
        return this.S;
    }
}
