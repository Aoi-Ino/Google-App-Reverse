package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DRcModle.VmServiceReasonEntityById;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
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
import ni.f4;
import og.a0;
import pl.x;
import yg.v0;
import yg.w0;
import yg.y0;
import yg.z0;

public final class VahanDuplicateFitnessActivity extends androidx.appcompat.app.d {
    public f4 G;
    public h H;
    public VahanProService I;
    public qe.b J;
    public DuplicateFitnessService K;
    public ProgressDialog L;
    public String M;
    public NrvDetails N;
    public String O;
    public String P;
    public String Q;
    private Calendar R = Calendar.getInstance();
    public String S;
    private boolean T;
    public ld.c U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateFitnessActivity f21223e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity) {
            super(1);
            this.f21223e = vahanDuplicateFitnessActivity;
        }

        public final void b(DReasonResponse dReasonResponse) {
            this.f21223e.s1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", (VmServiceReasonEntityById) null));
                    VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity = this.f21223e;
                    cm.l.c(dReasonResponse);
                    this.f21223e.n1().f26220g.setAdapter(new a0(vahanDuplicateFitnessActivity, dReasonResponse));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DReasonResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateFitnessActivity f21224e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity) {
            super(1);
            this.f21224e = vahanDuplicateFitnessActivity;
        }

        public final void b(String str) {
            this.f21224e.s1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateFitnessActivity f21225e;

        c(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity) {
            this.f21225e = vahanDuplicateFitnessActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            LinearLayout linearLayout;
            int i11;
            cm.l.f(view, "view");
            Object selectedItem = this.f21225e.n1().f26220g.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (p.o(dReasonResponseItem.getReason_desc(), "OTHER", true) || p.o(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                linearLayout = this.f21225e.n1().f26218e;
                i11 = 8;
            } else {
                linearLayout = this.f21225e.n1().f26218e;
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateFitnessActivity f21226e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity) {
            super(1);
            this.f21226e = vahanDuplicateFitnessActivity;
        }

        public final void b(DuplicateFitessDraft duplicateFitessDraft) {
            this.f21226e.s1().dismiss();
            String appl_no = duplicateFitessDraft.getAppl_no();
            if (appl_no != null && appl_no.length() != 0) {
                Intent intent = new Intent(this.f21226e, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_FITNESS_CODE);
                intent.putExtra(VContant.DUPLICATE_FITNESS_CODE, duplicateFitessDraft);
                intent.putExtra(VContant.APP_NO, duplicateFitessDraft.getAppl_no());
                intent.putExtra("state_code", this.f21226e.u1().getState_cd());
                intent.putExtra("rc_number", this.f21226e.t1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.DUPLICATE_FITNESS_PURPOSE_CODE);
                intent.putExtra("off_code", this.f21226e.r1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21226e.x1());
                intent.putExtra("RC", this.f21226e.t1());
                intent.putExtra("RcDetails", this.f21226e.u1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21226e.m1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21226e.l1());
                this.f21226e.startActivity(intent);
                this.f21226e.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DuplicateFitessDraft) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateFitnessActivity f21227e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity) {
            super(1);
            this.f21227e = vahanDuplicateFitnessActivity;
        }

        public final void b(String str) {
            this.f21227e.s1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21228a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f21228a = lVar;
        }

        public final pl.c a() {
            return this.f21228a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21228a.invoke(obj);
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
    public static final void A1(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(vahanDuplicateFitnessActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(vahanDuplicateFitnessActivity, onDateSetListener, vahanDuplicateFitnessActivity.R.get(1), vahanDuplicateFitnessActivity.R.get(2), vahanDuplicateFitnessActivity.R.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void B1(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity, View view) {
        String b10;
        cm.l.f(vahanDuplicateFitnessActivity, "this$0");
        ld.c cVar = new ld.c(vahanDuplicateFitnessActivity);
        try {
            String obj = vahanDuplicateFitnessActivity.n1().f26221h.getText().toString();
            String obj2 = vahanDuplicateFitnessActivity.n1().f26217d.getText().toString();
            String obj3 = vahanDuplicateFitnessActivity.n1().f26216c.getText().toString();
            String obj4 = vahanDuplicateFitnessActivity.n1().f26219f.getText().toString();
            Object selectedItem = vahanDuplicateFitnessActivity.n1().f26220g.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (vahanDuplicateFitnessActivity.n1().f26220g.getSelectedItemPosition() == 0) {
                b10 = cVar.b("please_Select_the_reason", vahanDuplicateFitnessActivity.getString(R.string.please_Select_the_reason));
            } else if (obj.length() < 3) {
                b10 = cVar.b("please_enter_the_remark", vahanDuplicateFitnessActivity.getString(R.string.please_enter_the_remark));
            } else {
                if (obj2.length() < 3) {
                    if (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true)) {
                        b10 = cVar.b("please_enter_the_valid_fir_no", vahanDuplicateFitnessActivity.getString(R.string.please_enter_the_valid_fir_no));
                    }
                }
                if (obj3.length() < 3 && (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    b10 = cVar.b("please_enter_fir_date", vahanDuplicateFitnessActivity.getString(R.string.please_enter_fir_date));
                } else if (obj4.length() >= 3 || (!p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) && !p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    vahanDuplicateFitnessActivity.s1().show();
                    vahanDuplicateFitnessActivity.o1().I(vahanDuplicateFitnessActivity, new DuplicateFitessDraft("", z9.a.f18947a.h(obj3), obj2, Integer.parseInt(vahanDuplicateFitnessActivity.r1()), v9.d.f17494a.m(), obj4, Integer.parseInt(VContant.DUPLICATE_FITNESS_PURPOSE_CODE), String.valueOf(dReasonResponseItem.getReason_desc()), vahanDuplicateFitnessActivity.t1(), String.valueOf(vahanDuplicateFitnessActivity.u1().getState_cd())));
                    return;
                } else {
                    b10 = cVar.b("please_enter_police_station", vahanDuplicateFitnessActivity.getString(R.string.please_enter_police_station));
                }
            }
            Toast.makeText(vahanDuplicateFitnessActivity, b10, 0).show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity, View view) {
        cm.l.f(vahanDuplicateFitnessActivity, "this$0");
        VUtility.Companion.v(vahanDuplicateFitnessActivity, vahanDuplicateFitnessActivity.q1().b("are_you_sure_you_want_to_leave", vahanDuplicateFitnessActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void D1(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity, View view) {
        cm.l.f(vahanDuplicateFitnessActivity, "this$0");
        vahanDuplicateFitnessActivity.E1();
    }

    private final void E1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity, View view) {
        cm.l.f(vahanDuplicateFitnessActivity, "this$0");
        Intent intent = new Intent(vahanDuplicateFitnessActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanDuplicateFitnessActivity.t1());
        intent.putExtra("RcDetails", vahanDuplicateFitnessActivity.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanDuplicateFitnessActivity.T);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanDuplicateFitnessActivity.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanDuplicateFitnessActivity.l1());
        vahanDuplicateFitnessActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(vahanDuplicateFitnessActivity, "this$0");
        vahanDuplicateFitnessActivity.R.set(1, i10);
        vahanDuplicateFitnessActivity.R.set(2, i11);
        vahanDuplicateFitnessActivity.R.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", vahanDuplicateFitnessActivity.R.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", vahanDuplicateFitnessActivity.R.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", vahanDuplicateFitnessActivity.R.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        vahanDuplicateFitnessActivity.K1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        vahanDuplicateFitnessActivity.n1().f26216c.setText(simpleDateFormat.format(vahanDuplicateFitnessActivity.R.getTime()));
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void H1(f4 f4Var) {
        cm.l.f(f4Var, "<set-?>");
        this.G = f4Var;
    }

    public final void I1(qe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.J = bVar;
    }

    public final void J1(DuplicateFitnessService duplicateFitnessService) {
        cm.l.f(duplicateFitnessService, "<set-?>");
        this.K = duplicateFitnessService;
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void L1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void N1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void P1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.N = nrvDetails;
    }

    public final void Q1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void R1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final String l1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final f4 n1() {
        f4 f4Var = this.G;
        if (f4Var != null) {
            return f4Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final qe.b o1() {
        qe.b bVar = this.J;
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
        setContentView((int) R.layout.activity_duplicate_fitness_certificate);
        f4 c10 = f4.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        H1(c10);
        setContentView((View) n1().b());
        v9.e.f17509a.z2(this, n1());
        Q1(VahanProService.f21196b.b(this));
        J1(DuplicateFitnessService.f20591a.b(this));
        L1(new ld.c(this));
        N1(new ProgressDialog(this));
        s1().setMessage(q1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        R1((h) new u0((x0) this, (u0.b) new g(new wg.d(v1()))).a(h.class));
        I1((qe.b) new u0((x0) this, (u0.b) new qe.a(new pe.a(p1()))).a(qe.b.class));
        M1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.T = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        P1((NrvDetails) serializableExtra);
        L1(new ld.c(this));
        TextView textView = n1().f26230q;
        textView.setText(q1().b("vehicle_no", "Vehicle No.:") + ' ' + t1());
        n1().f26231r.setText(q1().b("view_vehicle_details", "View Vehicle Details"));
        n1().f26231r.setPaintFlags(n1().f26231r.getPaintFlags() | 8);
        n1().f26231r.setOnClickListener(new yg.u0(this));
        try {
            s1().show();
            w1().I0(this, VContant.DUPLICATE_RC_PURPOSE_CODE);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        n1().f26216c.setOnClickListener(new w0(this, new v0(this)));
        w1().H().g(this, new f(new a(this)));
        w1().I().g(this, new f(new b(this)));
        n1().f26220g.setOnItemSelectedListener(new c(this));
        n1().f26215b.setOnClickListener(new yg.x0(this));
        o1().l().g(this, new f(new d(this)));
        w1().K().g(this, new f(new e(this)));
        n1().f26223j.f28305f.setOnClickListener(new y0(this));
        n1().f26223j.f28306g.setOnClickListener(new z0(this));
    }

    public final DuplicateFitnessService p1() {
        DuplicateFitnessService duplicateFitnessService = this.K;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        cm.l.v("fitnessService");
        return null;
    }

    public final ld.c q1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final String r1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.N;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService v1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final h w1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean x1() {
        return this.T;
    }
}
