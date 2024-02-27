package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DRcModle.VmServiceReasonEntityById;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.Doclist;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicateList;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitRe;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ka.c;
import ni.y8;
import og.a0;
import pl.x;
import yg.a1;
import yg.b1;
import yg.c1;
import yg.d1;
import yg.e1;
import yg.f1;

public final class VahanDuplicatePermitActivity extends androidx.appcompat.app.d {
    public y8 G;
    public bi.h H;
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
    private ArrayList V = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicatePermitActivity f21229e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanDuplicatePermitActivity vahanDuplicatePermitActivity) {
            super(1);
            this.f21229e = vahanDuplicatePermitActivity;
        }

        public final void b(String str) {
            this.f21229e.t1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicatePermitActivity f21230e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanDuplicatePermitActivity vahanDuplicatePermitActivity) {
            super(1);
            this.f21230e = vahanDuplicatePermitActivity;
        }

        public final void b(DuplicateList duplicateList) {
            try {
                if (duplicateList.getData().getDoclist().size() > 0) {
                    this.f21230e.L1(duplicateList.getData().getDoclist());
                    this.f21230e.r1().add(0, new Doclist("Select Document", "Select Document"));
                    VahanDuplicatePermitActivity vahanDuplicatePermitActivity = this.f21230e;
                    this.f21230e.n1().f29514j.setAdapter(new re.c(vahanDuplicatePermitActivity, vahanDuplicatePermitActivity.r1()));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DuplicateList) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final c f21231e = new c();

        c() {
            super(1);
        }

        public final void b(String str) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicatePermitActivity f21232e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanDuplicatePermitActivity vahanDuplicatePermitActivity) {
            super(1);
            this.f21232e = vahanDuplicatePermitActivity;
        }

        public final void b(DReasonResponse dReasonResponse) {
            this.f21232e.t1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", (VmServiceReasonEntityById) null));
                    VahanDuplicatePermitActivity vahanDuplicatePermitActivity = this.f21232e;
                    cm.l.c(dReasonResponse);
                    this.f21232e.n1().f29512h.setAdapter(new a0(vahanDuplicatePermitActivity, dReasonResponse));
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

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicatePermitActivity f21233e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanDuplicatePermitActivity vahanDuplicatePermitActivity) {
            super(1);
            this.f21233e = vahanDuplicatePermitActivity;
        }

        public final void b(String str) {
            this.f21233e.t1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicatePermitActivity f21234e;

        f(VahanDuplicatePermitActivity vahanDuplicatePermitActivity) {
            this.f21234e = vahanDuplicatePermitActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            LinearLayout linearLayout;
            int i11;
            cm.l.f(view, "view");
            Object selectedItem = this.f21234e.n1().f29512h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (p.o(dReasonResponseItem.getReason_desc(), "OTHER", true) || p.o(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                linearLayout = this.f21234e.n1().f29510f;
                i11 = 8;
            } else {
                linearLayout = this.f21234e.n1().f29510f;
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicatePermitActivity f21235e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanDuplicatePermitActivity vahanDuplicatePermitActivity) {
            super(1);
            this.f21235e = vahanDuplicatePermitActivity;
        }

        public final void b(DuplicatePermitResponse duplicatePermitResponse) {
            this.f21235e.t1().dismiss();
            c.a aVar = ka.c.f13158a;
            DataX data = duplicatePermitResponse.getData();
            String str = null;
            if (aVar.m(data != null ? data.getApplNo() : null)) {
                VahanDuplicatePermitActivity vahanDuplicatePermitActivity = this.f21235e;
                ApiMessage apiMessage = duplicatePermitResponse.getApiMessage();
                if (apiMessage != null) {
                    str = apiMessage.getDeveloperMessage();
                }
                vahanDuplicatePermitActivity.S1(vahanDuplicatePermitActivity, str);
                return;
            }
            i7.d dVar = new i7.d();
            Object j10 = dVar.j(dVar.t(duplicatePermitResponse), DuplicatePermitDraft.class);
            cm.l.e(j10, "fromJson(...)");
            Intent intent = new Intent(this.f21235e, VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_PERMIT_CODE);
            intent.putExtra(VContant.DUPLICATE_PERMIT_CODE, (DuplicatePermitDraft) j10);
            DataX data2 = duplicatePermitResponse.getData();
            if (data2 != null) {
                str = data2.getApplNo();
            }
            intent.putExtra(VContant.APP_NO, str);
            intent.putExtra("state_code", this.f21235e.v1().getState_cd());
            intent.putExtra("rc_number", this.f21235e.u1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.DUPLICATE_PERMIT_PURPOSE_CODE);
            intent.putExtra("off_code", this.f21235e.s1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21235e.y1());
            intent.putExtra("RC", this.f21235e.u1());
            intent.putExtra("RcDetails", this.f21235e.v1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this.f21235e.m1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this.f21235e.l1());
            this.f21235e.startActivity(intent);
            this.f21235e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DuplicatePermitResponse) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21236a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f21236a = lVar;
        }

        public final pl.c a() {
            return this.f21236a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21236a.invoke(obj);
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
    public static final void A1(VahanDuplicatePermitActivity vahanDuplicatePermitActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(vahanDuplicatePermitActivity, "this$0");
        vahanDuplicatePermitActivity.R.set(1, i10);
        vahanDuplicatePermitActivity.R.set(2, i11);
        vahanDuplicatePermitActivity.R.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", vahanDuplicatePermitActivity.R.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", vahanDuplicatePermitActivity.R.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", vahanDuplicatePermitActivity.R.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        vahanDuplicatePermitActivity.J1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        vahanDuplicatePermitActivity.n1().f29508d.setText(simpleDateFormat.format(vahanDuplicatePermitActivity.R.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void B1(VahanDuplicatePermitActivity vahanDuplicatePermitActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(vahanDuplicatePermitActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(vahanDuplicatePermitActivity, onDateSetListener, vahanDuplicatePermitActivity.R.get(1), vahanDuplicatePermitActivity.R.get(2), vahanDuplicatePermitActivity.R.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void C1(VahanDuplicatePermitActivity vahanDuplicatePermitActivity, View view) {
        String b10;
        VahanDuplicatePermitActivity vahanDuplicatePermitActivity2 = vahanDuplicatePermitActivity;
        cm.l.f(vahanDuplicatePermitActivity2, "this$0");
        ld.c cVar = new ld.c(vahanDuplicatePermitActivity2);
        try {
            String obj = vahanDuplicatePermitActivity.n1().f29513i.getText().toString();
            String obj2 = vahanDuplicatePermitActivity.n1().f29509e.getText().toString();
            String obj3 = vahanDuplicatePermitActivity.n1().f29508d.getText().toString();
            String obj4 = vahanDuplicatePermitActivity.n1().f29511g.getText().toString();
            Object selectedItem = vahanDuplicatePermitActivity.n1().f29512h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            Object selectedItem2 = vahanDuplicatePermitActivity.n1().f29514j.getSelectedItem();
            cm.l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.Doclist");
            Doclist doclist = (Doclist) selectedItem2;
            if (vahanDuplicatePermitActivity.n1().f29514j.getSelectedItemPosition() == 0) {
                b10 = cVar.b("pls_Select_dupPermitReqDoc", "Please select the Required Document");
            } else if (vahanDuplicatePermitActivity.n1().f29512h.getSelectedItemPosition() == 0) {
                b10 = cVar.b("please_Select_the_reason", vahanDuplicatePermitActivity2.getString(R.string.please_Select_the_reason));
            } else if (obj.length() < 3) {
                b10 = cVar.b("please_enter_the_remark", vahanDuplicatePermitActivity2.getString(R.string.please_enter_the_remark));
            } else {
                if (obj2.length() < 3) {
                    if (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true)) {
                        b10 = cVar.b("please_enter_the_valid_fir_no", vahanDuplicatePermitActivity2.getString(R.string.please_enter_the_valid_fir_no));
                    }
                }
                if (obj3.length() < 3 && (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    b10 = cVar.b("please_enter_fir_date", vahanDuplicatePermitActivity2.getString(R.string.please_enter_fir_date));
                } else if (obj4.length() >= 3 || (!p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) && !p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    Object selectedItem3 = vahanDuplicatePermitActivity.n1().f29514j.getSelectedItem();
                    cm.l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.Doclist");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((Doclist) selectedItem3);
                    vahanDuplicatePermitActivity.t1().show();
                    vahanDuplicatePermitActivity.o1().J(vahanDuplicatePermitActivity2, new DuplicatePermitRe("", doclist.getDocId().toString(), arrayList, z9.a.f18947a.h(obj3), obj2, Integer.parseInt(vahanDuplicatePermitActivity.s1()), "", obj4, "", Integer.parseInt(VContant.DUPLICATE_PERMIT_PURPOSE_CODE), String.valueOf(dReasonResponseItem.getReason_desc()), obj, vahanDuplicatePermitActivity.u1(), String.valueOf(vahanDuplicatePermitActivity.v1().getState_cd()), "", v9.d.f17494a.m()));
                    return;
                } else {
                    b10 = cVar.b("please_enter_police_station", vahanDuplicatePermitActivity2.getString(R.string.please_enter_police_station));
                }
            }
            Toast.makeText(vahanDuplicatePermitActivity2, b10, 0).show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(VahanDuplicatePermitActivity vahanDuplicatePermitActivity, View view) {
        cm.l.f(vahanDuplicatePermitActivity, "this$0");
        VUtility.Companion.v(vahanDuplicatePermitActivity, vahanDuplicatePermitActivity.q1().b("are_you_sure_you_want_to_leave", vahanDuplicatePermitActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanDuplicatePermitActivity vahanDuplicatePermitActivity, View view) {
        cm.l.f(vahanDuplicatePermitActivity, "this$0");
        Intent intent = new Intent(vahanDuplicatePermitActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanDuplicatePermitActivity.u1());
        intent.putExtra("RcDetails", vahanDuplicatePermitActivity.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanDuplicatePermitActivity.T);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanDuplicatePermitActivity.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanDuplicatePermitActivity.l1());
        vahanDuplicatePermitActivity.startActivity(intent);
    }

    public final void E1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void G1(y8 y8Var) {
        cm.l.f(y8Var, "<set-?>");
        this.G = y8Var;
    }

    public final void H1(qe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.J = bVar;
    }

    public final void I1(DuplicateFitnessService duplicateFitnessService) {
        cm.l.f(duplicateFitnessService, "<set-?>");
        this.K = duplicateFitnessService;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void K1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void L1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.V = arrayList;
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

    public final void R1(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void S1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
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
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new f1(dialog));
        dialog.show();
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

    public final y8 n1() {
        y8 y8Var = this.G;
        if (y8Var != null) {
            return y8Var;
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
        setContentView((int) R.layout.activity_vahan_duplicate_permit_activity);
        y8 c10 = y8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        G1(c10);
        setContentView((View) n1().b());
        v9.e.f17509a.A2(this, n1());
        Q1(VahanProService.f21196b.b(this));
        I1(DuplicateFitnessService.f20591a.b(this));
        K1(new ld.c(this));
        N1(new ProgressDialog(this));
        t1().setMessage(q1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        R1((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(w1()))).a(bi.h.class));
        H1((qe.b) new u0((x0) this, (u0.b) new qe.a(new pe.a(p1()))).a(qe.b.class));
        M1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.T = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        P1((NrvDetails) serializableExtra);
        K1(new ld.c(this));
        TextView textView = n1().f29524t;
        textView.setText(q1().b("vehicle_no", "Vehicle No.:") + ' ' + u1());
        n1().f29525u.setText(q1().b("view_vehicle_details", "View Vehicle Details"));
        n1().f29525u.setPaintFlags(n1().f29525u.getPaintFlags() | 8);
        n1().f29525u.setOnClickListener(new a1(this));
        try {
            t1().show();
            o1().t(this, u1(), v1().getState_cd());
            x1().I0(this, VContant.DUPLICATE_RC_PURPOSE_CODE);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        n1().f29508d.setOnClickListener(new c1(this, new b1(this)));
        o1().p().g(this, new h(new b(this)));
        o1().q().g(this, new h(c.f21231e));
        x1().H().g(this, new h(new d(this)));
        x1().I().g(this, new h(new e(this)));
        n1().f29512h.setOnItemSelectedListener(new f(this));
        n1().f29507c.setOnClickListener(new d1(this));
        o1().n().g(this, new h(new g(this)));
        o1().o().g(this, new h(new a(this)));
        n1().f29517m.f28305f.setOnClickListener(new e1(this));
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

    public final ArrayList r1() {
        return this.V;
    }

    public final String s1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.N;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final bi.h x1() {
        bi.h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean y1() {
        return this.T;
    }
}
