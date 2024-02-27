package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftRepository.TOSaveToDraftService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.Relation;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ni.u6;
import pl.x;
import zg.n;
import zg.o;
import zg.p;
import zg.q;
import zg.r;
import zg.s;
import zg.t;
import zg.u;
import zg.v;
import zg.w;

public final class NomineeAndInsuranceDetail extends androidx.appcompat.app.d {
    public u6 G;
    public xh.a H;
    public TOSaveToDraftService I;
    private Calendar J = Calendar.getInstance();
    public String K;
    public qh.a L;
    public TOCommonService M;
    public ProgressDialog N;
    public String O;
    public ld.c P;
    public String Q;
    public String R;
    public String S;
    public NrvDetails T;
    private boolean U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetail f21295e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NomineeAndInsuranceDetail nomineeAndInsuranceDetail) {
            super(1);
            this.f21295e = nomineeAndInsuranceDetail;
        }

        public final void b(ToCommonModel2 toCommonModel2) {
            this.f21295e.w1().dismiss();
            try {
                ArrayList<Relation> relation = toCommonModel2.getData().getRelation();
                relation.add(0, new Relation(0, "Select Relation With Nominee"));
                this.f21295e.t1().f28847z.setAdapter(new hh.c(this.f21295e, relation));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ToCommonModel2) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetail f21296e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NomineeAndInsuranceDetail nomineeAndInsuranceDetail) {
            super(1);
            this.f21296e = nomineeAndInsuranceDetail;
        }

        public final void b(String str) {
            this.f21296e.w1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetail f21297e;

        c(NomineeAndInsuranceDetail nomineeAndInsuranceDetail) {
            this.f21297e = nomineeAndInsuranceDetail;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21297e.X1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetail f21298e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NomineeAndInsuranceDetail nomineeAndInsuranceDetail) {
            super(1);
            this.f21298e = nomineeAndInsuranceDetail;
        }

        public final void b(vh.a aVar) {
            this.f21298e.w1().dismiss();
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((vh.a) null);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21299a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f21299a = lVar;
        }

        public final pl.c a() {
            return this.f21299a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21299a.invoke(obj);
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
    public static final void D1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, View view) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        Intent intent = new Intent(nomineeAndInsuranceDetail, VahanVehicleDetailsService.class);
        intent.putExtra("RC", nomineeAndInsuranceDetail.x1().getRc_regn_no());
        intent.putExtra("RcDetails", nomineeAndInsuranceDetail.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, nomineeAndInsuranceDetail.U);
        intent.putExtra(VContant.NEXGEN_addahar_name, nomineeAndInsuranceDetail.s1());
        intent.putExtra(VContant.NEXGEN_addahar_address, nomineeAndInsuranceDetail.r1());
        nomineeAndInsuranceDetail.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void E1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, View view) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        nomineeAndInsuranceDetail.finish();
    }

    /* access modifiers changed from: private */
    public static final void F1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        nomineeAndInsuranceDetail.J.set(1, i10);
        nomineeAndInsuranceDetail.J.set(2, i11);
        nomineeAndInsuranceDetail.J.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        nomineeAndInsuranceDetail.S1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        nomineeAndInsuranceDetail.t1().f28834m.setText(nomineeAndInsuranceDetail.u1());
    }

    /* access modifiers changed from: private */
    public static final void G1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerinsuranceUpto");
        DatePickerDialog datePickerDialog = new DatePickerDialog(nomineeAndInsuranceDetail, onDateSetListener, nomineeAndInsuranceDetail.J.get(1), nomineeAndInsuranceDetail.J.get(2), nomineeAndInsuranceDetail.J.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void H1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, CompoundButton compoundButton, boolean z10) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        if (z10) {
            nomineeAndInsuranceDetail.t1().f28825d.setChecked(false);
            nomineeAndInsuranceDetail.t1().f28826e.setChecked(true);
            nomineeAndInsuranceDetail.t1().f28841t.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, CompoundButton compoundButton, boolean z10) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        if (z10) {
            nomineeAndInsuranceDetail.t1().f28825d.setChecked(true);
            nomineeAndInsuranceDetail.t1().f28826e.setChecked(false);
            nomineeAndInsuranceDetail.t1().f28841t.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, View view) {
        vh.b bVar;
        ld.c v12;
        String string;
        String str;
        NomineeAndInsuranceDetail nomineeAndInsuranceDetail2 = nomineeAndInsuranceDetail;
        cm.l.f(nomineeAndInsuranceDetail2, "this$0");
        if (nomineeAndInsuranceDetail.t1().f28840s.getText().length() < 2 && nomineeAndInsuranceDetail.t1().f28826e.isChecked()) {
            v12 = nomineeAndInsuranceDetail.v1();
            string = nomineeAndInsuranceDetail2.getString(R.string.to_validation_nomineeName);
            str = "to_validation_nomineeName";
        } else if (nomineeAndInsuranceDetail.t1().f28847z.getSelectedItemPosition() == 0 && nomineeAndInsuranceDetail.t1().f28826e.isChecked()) {
            v12 = nomineeAndInsuranceDetail.v1();
            string = nomineeAndInsuranceDetail2.getString(R.string.to_validation_nomineeRelation);
            str = "to_validation_nomineeRelation";
        } else if (nomineeAndInsuranceDetail.t1().f28838q.getText().length() >= 2 || !nomineeAndInsuranceDetail.t1().f28826e.isChecked()) {
            nomineeAndInsuranceDetail.w1().show();
            vh.b m10 = new yh.b(nomineeAndInsuranceDetail2).m();
            String p10 = new yh.b(nomineeAndInsuranceDetail2).p();
            if (nomineeAndInsuranceDetail2.C1(m10.s())) {
                String a10 = m10.a();
                String b10 = m10.b();
                String c10 = m10.c();
                String d10 = m10.d();
                String e10 = m10.e();
                String f10 = m10.f();
                int g10 = m10.g();
                String h10 = m10.h();
                String i10 = m10.i();
                String j10 = m10.j();
                cm.l.c(p10);
                bVar = new vh.b("", a10, b10, c10, d10, e10, f10, g10, h10, i10, j10, "", true, "", Integer.parseInt(p10), "", m10.l(), 0, "", m10.m(), m10.n(), m10.o(), m10.p(), m10.q(), m10.r(), m10.s(), m10.t(), m10.u(), m10.v(), m10.w(), m10.x(), m10.y(), m10.z(), "", m10.A(), "", m10.k());
            } else {
                String a11 = m10.a();
                String b11 = m10.b();
                String c11 = m10.c();
                String d11 = m10.d();
                String e11 = m10.e();
                String f11 = m10.f();
                int g11 = m10.g();
                String h11 = m10.h();
                String i11 = m10.i();
                String j11 = m10.j();
                cm.l.c(p10);
                bVar = new vh.b("", a11, b11, c11, d11, e11, f11, g11, h11, i11, j11, "", true, "", Integer.parseInt(p10), "", m10.l(), 0, "", m10.m(), m10.n(), m10.o(), m10.p(), m10.q(), m10.r(), (String) null, m10.t(), m10.u(), m10.v(), m10.w(), m10.x(), m10.y(), m10.z(), "", m10.A(), "", m10.k());
            }
            nomineeAndInsuranceDetail.z1().i(bVar);
            return;
        } else {
            v12 = nomineeAndInsuranceDetail.v1();
            string = nomineeAndInsuranceDetail2.getString(R.string.to_validation_nomineeDOB);
            str = "to_validation_nomineeDOB";
        }
        Toast.makeText(nomineeAndInsuranceDetail2, v12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void K1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, View view) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        nomineeAndInsuranceDetail.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void L1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        nomineeAndInsuranceDetail.J.set(1, i10);
        nomineeAndInsuranceDetail.J.set(2, i11);
        nomineeAndInsuranceDetail.J.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        nomineeAndInsuranceDetail.S1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        nomineeAndInsuranceDetail.t1().f28838q.setText(nomineeAndInsuranceDetail.u1());
    }

    /* access modifiers changed from: private */
    public static final void M1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(nomineeAndInsuranceDetail, onDateSetListener, nomineeAndInsuranceDetail.J.get(1), nomineeAndInsuranceDetail.J.get(2), nomineeAndInsuranceDetail.J.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void N1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        nomineeAndInsuranceDetail.J.set(1, i10);
        nomineeAndInsuranceDetail.J.set(2, i11);
        nomineeAndInsuranceDetail.J.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", nomineeAndInsuranceDetail.J.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        nomineeAndInsuranceDetail.S1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        nomineeAndInsuranceDetail.t1().f28831j.setText(nomineeAndInsuranceDetail.u1());
    }

    /* access modifiers changed from: private */
    public static final void O1(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(nomineeAndInsuranceDetail, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerinsuranceFrom");
        DatePickerDialog datePickerDialog = new DatePickerDialog(nomineeAndInsuranceDetail, onDateSetListener, nomineeAndInsuranceDetail.J.get(1), nomineeAndInsuranceDetail.J.get(2), nomineeAndInsuranceDetail.J.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public final TOSaveToDraftService A1() {
        TOSaveToDraftService tOSaveToDraftService = this.I;
        if (tOSaveToDraftService != null) {
            return tOSaveToDraftService;
        }
        cm.l.v("tosavetodraftService");
        return null;
    }

    public final qh.a B1() {
        qh.a aVar = this.L;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean C1(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void R1(u6 u6Var) {
        cm.l.f(u6Var, "<set-?>");
        this.G = u6Var;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void T1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void V1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.N = progressDialog;
    }

    public final void W1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.T = nrvDetails;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void Y1(TOCommonService tOCommonService) {
        cm.l.f(tOCommonService, "<set-?>");
        this.M = tOCommonService;
    }

    public final void Z1(xh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final void a2(TOSaveToDraftService tOSaveToDraftService) {
        cm.l.f(tOSaveToDraftService, "<set-?>");
        this.I = tOSaveToDraftService;
    }

    public final void b2(qh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.L = aVar;
    }

    public final void c2(u6 u6Var, NrvDetails nrvDetails) {
        cm.l.f(u6Var, "binding");
        cm.l.f(nrvDetails, "rcdetails");
        if (com.nic.mparivahan.dlservices.utilities.d.d(nrvDetails.getRc_insurance_upto()) && com.nic.mparivahan.dlservices.utilities.d.d(nrvDetails.getRc_insurance_from())) {
            u6Var.f28830i.setVisibility(0);
            u6Var.f28837p.setText("");
            u6Var.f28831j.setText(nrvDetails.getRc_insurance_from());
            u6Var.f28834m.setText(nrvDetails.getRc_insurance_upto());
            u6Var.f28836o.setText(nrvDetails.getRc_insurance_comp());
            u6Var.f28842u.setText(nrvDetails.getRc_insurance_policy_no());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u6 c10 = u6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        R1(c10);
        setContentView((View) t1().b());
        T1(new ld.c(this));
        v9.e.f17509a.V1(this, t1());
        Y1(TOCommonService.f21425a.b(this));
        a2(TOSaveToDraftService.f21431a.b(this));
        U1(String.valueOf(getIntent().getStringExtra("off_code")));
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        P1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        W1((NrvDetails) serializableExtra);
        this.U = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        t1().D.f28308i.setText(v1().b("label_transfer_ownership", "Transfer of Ownership"));
        TextView textView = t1().H;
        textView.setText(v1().b("vehicle_no", "Vehicle No.:") + ' ' + x1().getRc_regn_no());
        t1().I.setText(v1().b("view_vehicle_details", "View Vehicle Details"));
        t1().I.setPaintFlags(t1().I.getPaintFlags() | 8);
        t1().I.setOnClickListener(new zg.l(this));
        V1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        b2((qh.a) new u0((x0) this, (u0.b) new oh.b(new oh.a(y1()))).a(qh.a.class));
        Z1((xh.a) new u0((x0) this, (u0.b) new wh.a(new wh.b(A1()))).a(xh.a.class));
        try {
            w1().show();
            B1().g();
            c2(t1(), x1());
        } catch (Exception unused) {
        }
        t1().D.f28305f.setOnClickListener(new q(this));
        B1().i().g(this, new e(new a(this)));
        B1().h().g(this, new e(new b(this)));
        t1().f28826e.setOnCheckedChangeListener(new r(this));
        t1().f28825d.setOnCheckedChangeListener(new s(this));
        t1().f28847z.setOnItemSelectedListener(new c(this));
        t1().C.setOnClickListener(new t(this));
        z1().h().g(this, new e(new d(this)));
        t1().f28844w.setOnClickListener(new u(this));
        t1().f28838q.setOnClickListener(new w(this, new v(this)));
        t1().f28831j.setOnClickListener(new n(this, new zg.m(this)));
        t1().f28834m.setOnClickListener(new p(this, new o(this)));
    }

    public final String r1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String s1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final u6 t1() {
        u6 u6Var = this.G;
        if (u6Var != null) {
            return u6Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final String u1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("formated_date");
        return null;
    }

    public final ld.c v1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.N;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.T;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final TOCommonService y1() {
        TOCommonService tOCommonService = this.M;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final xh.a z1() {
        xh.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("toSaveToDraftViewModel");
        return null;
    }
}
