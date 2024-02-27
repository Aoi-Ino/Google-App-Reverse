package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
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
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ni.k7;
import pl.x;
import v9.e;
import yg.g0;
import yg.h0;
import yg.i0;
import yg.j0;
import yg.k0;
import yg.l0;

public final class RCReleaseActivity extends d {
    public k7 G;
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

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RCReleaseActivity f21208e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RCReleaseActivity rCReleaseActivity) {
            super(1);
            this.f21208e = rCReleaseActivity;
        }

        public final void b(RCReleaseResponse rCReleaseResponse) {
            Integer statusCode;
            this.f21208e.s1().dismiss();
            ApiMessage apiMessage = rCReleaseResponse.getApiMessage();
            String str = null;
            if (apiMessage == null || (statusCode = apiMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                VContant.Companion companion = VContant.Companion;
                RCReleaseActivity rCReleaseActivity = this.f21208e;
                ApiMessage apiMessage2 = rCReleaseResponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                companion.K(rCReleaseActivity, String.valueOf(str));
                return;
            }
            Data data = rCReleaseResponse.getData();
            Data copy$default = data != null ? Data.copy$default(data, (String) null, (Object) null, (String) null, (Object) null, (String) null, (String) null, this.f21208e.n1().f27090e.getText().toString(), this.f21208e.n1().f27089d.getText().toString(), (Object) null, 319, (Object) null) : null;
            Intent intent = new Intent(this.f21208e, VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_RELEASE_CODE);
            intent.putExtra(VContant.RC_RELEASE_CODE, copy$default);
            Data data2 = rCReleaseResponse.getData();
            intent.putExtra(VContant.APP_NO, data2 != null ? data2.getApplNo() : null);
            NrvDetails u12 = this.f21208e.u1();
            if (u12 != null) {
                str = u12.getState_cd();
            }
            intent.putExtra("state_code", str);
            intent.putExtra("rc_number", this.f21208e.t1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_RELEASE_PURPOSE_CODE);
            intent.putExtra("off_code", this.f21208e.r1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21208e.v1());
            intent.putExtra("RC", this.f21208e.t1());
            intent.putExtra("RcDetails", this.f21208e.u1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this.f21208e.m1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this.f21208e.l1());
            this.f21208e.startActivity(intent);
            this.f21208e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RCReleaseResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RCReleaseActivity f21209e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RCReleaseActivity rCReleaseActivity) {
            super(1);
            this.f21209e = rCReleaseActivity;
        }

        public final void b(String str) {
            this.f21209e.s1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21210a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21210a = lVar;
        }

        public final pl.c a() {
            return this.f21210a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21210a.invoke(obj);
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
    public static final void A1(RCReleaseActivity rCReleaseActivity, View view) {
        cm.l.f(rCReleaseActivity, "this$0");
        VUtility.Companion.v(rCReleaseActivity, rCReleaseActivity.q1().b("are_you_sure_you_want_to_leave", rCReleaseActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void B1(RCReleaseActivity rCReleaseActivity, View view) {
        cm.l.f(rCReleaseActivity, "this$0");
        rCReleaseActivity.C1();
    }

    private final void C1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void w1(RCReleaseActivity rCReleaseActivity, View view) {
        cm.l.f(rCReleaseActivity, "this$0");
        Intent intent = new Intent(rCReleaseActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", rCReleaseActivity.t1());
        intent.putExtra("RcDetails", rCReleaseActivity.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, rCReleaseActivity.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, rCReleaseActivity.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, rCReleaseActivity.l1());
        rCReleaseActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void x1(RCReleaseActivity rCReleaseActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(rCReleaseActivity, "this$0");
        rCReleaseActivity.Q.set(1, i10);
        rCReleaseActivity.Q.set(2, i11);
        rCReleaseActivity.Q.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", rCReleaseActivity.Q.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", rCReleaseActivity.Q.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", rCReleaseActivity.Q.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        rCReleaseActivity.I1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        rCReleaseActivity.n1().f27091f.setText(simpleDateFormat.format(rCReleaseActivity.Q.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void y1(RCReleaseActivity rCReleaseActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(rCReleaseActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(rCReleaseActivity, onDateSetListener, rCReleaseActivity.Q.get(1), rCReleaseActivity.Q.get(2), rCReleaseActivity.Q.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void z1(RCReleaseActivity rCReleaseActivity, View view) {
        String str;
        Toast makeText;
        RCReleaseActivity rCReleaseActivity2 = rCReleaseActivity;
        cm.l.f(rCReleaseActivity2, "this$0");
        ld.c cVar = new ld.c(rCReleaseActivity2);
        try {
            String obj = rCReleaseActivity.n1().f27091f.getText().toString();
            String obj2 = rCReleaseActivity.n1().f27090e.getText().toString();
            String obj3 = rCReleaseActivity.n1().f27089d.getText().toString();
            try {
                str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(obj));
                cm.l.e(str, "format(...)");
            } catch (ParseException e10) {
                e10.printStackTrace();
                str = "";
            }
            if (obj.length() < 3) {
                makeText = Toast.makeText(rCReleaseActivity2, cVar.b("enter_release_date", rCReleaseActivity2.getString(R.string.enter_release_date)), 0);
            } else if (obj2.length() < 3) {
                makeText = Toast.makeText(rCReleaseActivity2, cVar.b("enter_file_reference_number", rCReleaseActivity2.getString(R.string.enter_file_reference_number)), 0);
            } else if (obj3.length() < 3) {
                makeText = Toast.makeText(rCReleaseActivity2, cVar.b("enter_approved_by", rCReleaseActivity2.getString(R.string.enter_approved_by)), 0);
            } else {
                rCReleaseActivity.s1().show();
                Integer valueOf = Integer.valueOf(Integer.parseInt(rCReleaseActivity.r1()));
                String t12 = rCReleaseActivity.t1();
                String str2 = str.toString();
                NrvDetails u12 = rCReleaseActivity.u1();
                rCReleaseActivity.o1().L(rCReleaseActivity2, new RCReleaseModle("", obj3, "", "", "", obj2, valueOf, "", "", VContant.RC_RELEASE_PURPOSE_CODE, "", "", "", t12, "", "", str2, String.valueOf(u12 != null ? u12.getState_cd() : null), "", ""));
                return;
            }
            makeText.show();
        } catch (Exception e11) {
            e11.printStackTrace();
            Log.e("myrequ", x.f30437a.toString());
        }
    }

    public final void D1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void E1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void F1(k7 k7Var) {
        cm.l.f(k7Var, "<set-?>");
        this.G = k7Var;
    }

    public final void G1(qe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.I = bVar;
    }

    public final void H1(DuplicateFitnessService duplicateFitnessService) {
        cm.l.f(duplicateFitnessService, "<set-?>");
        this.J = duplicateFitnessService;
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void J1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void L1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void N1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void O1(VahanProService vahanProService) {
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

    public final k7 n1() {
        k7 k7Var = this.G;
        if (k7Var != null) {
            return k7Var;
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
        VUtility.Companion.v(this, q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k7 c10 = k7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        F1(c10);
        setContentView((View) n1().b());
        e.f17509a.L2(this, n1());
        O1(VahanProService.f21196b.b(this));
        H1(DuplicateFitnessService.f20591a.b(this));
        J1(new ld.c(this));
        L1(new ProgressDialog(this));
        s1().setMessage(q1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        G1((qe.b) new u0((x0) this, (u0.b) new qe.a(new pe.a(p1()))).a(qe.b.class));
        K1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.S = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        M1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        N1((NrvDetails) serializableExtra);
        J1(new ld.c(this));
        TextView textView = n1().f27097l;
        textView.setText(q1().b("vehicle_no", "Vehicle No.:") + ' ' + t1());
        n1().f27098m.setText(q1().b("view_vehicle_details", "View Vehicle Details"));
        n1().f27098m.setPaintFlags(n1().f27098m.getPaintFlags() | 8);
        n1().f27098m.setOnClickListener(new g0(this));
        n1().f27091f.setOnClickListener(new i0(this, new h0(this)));
        n1().f27088c.setOnClickListener(new j0(this));
        o1().z().g(this, new c(new a(this)));
        o1().A().g(this, new c(new b(this)));
        n1().f27095j.f28305f.setOnClickListener(new k0(this));
        n1().f27095j.f28306g.setOnClickListener(new l0(this));
    }

    public final DuplicateFitnessService p1() {
        DuplicateFitnessService duplicateFitnessService = this.J;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        cm.l.v("fitnessService");
        return null;
    }

    public final ld.c q1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final String r1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final boolean v1() {
        return this.S;
    }
}
