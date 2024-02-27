package com.nic.mparivahan.VahanServices.Nominee;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.l;
import bi.m;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundFeeServices;
import com.nic.mparivahan.VahanServices.Nominee.NModel.ApiMessageX;
import com.nic.mparivahan.VahanServices.Nominee.NModel.Data;
import com.nic.mparivahan.VahanServices.Nominee.NModel.DataX;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeDraftResponse;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeRelationModle;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeRequest;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanView.VahanFaceLessConfirmation;
import he.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import ka.c;
import ld.c;
import ld.h;
import ni.jc;
import v9.e;
import vf.f;
import vf.i;
import vf.j;
import wf.a;

public final class NomineeActivity extends d {
    public jc G;
    public DatabaseHelper H;
    public ProgressDialog I;
    public l J;
    public VahanServiceConnection K;
    public h L;
    public bi.h M;
    public VahanProService N;
    public bi.h O;
    public VahanProService P;
    private HashMap Q = new HashMap();
    private String R = "NA";
    private String S = "0";
    private String T = "NA";
    public c U;
    private ArrayList V = new ArrayList();
    private String W = "";
    public he.c X;
    public CompoundFeeServices Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public NrvDetails f20677a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f20678b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f20679c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f20680d0;

    /* access modifiers changed from: private */
    public static final void A1(NomineeActivity nomineeActivity, NomineeRelationModle nomineeRelationModle) {
        cm.l.f(nomineeActivity, "this$0");
        nomineeActivity.t1().dismiss();
        if (nomineeRelationModle.getApiMessage().getStatusCode() == 200) {
            Data data = new Data(0, "Select Relation");
            new ArrayList();
            ArrayList<Data> data2 = nomineeRelationModle.getData();
            data2.add(0, data);
            nomineeActivity.p1().f27024h.setAdapter(new a(nomineeActivity, data2));
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(NomineeActivity nomineeActivity, String str) {
        cm.l.f(nomineeActivity, "this$0");
        nomineeActivity.t1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void C1(NomineeActivity nomineeActivity, View view) {
        String b10;
        c s12;
        String str;
        cm.l.f(nomineeActivity, "this$0");
        Editable text = nomineeActivity.p1().f27025i.getText();
        cm.l.c(text);
        if (text.length() < 3) {
            s12 = nomineeActivity.s1();
            str = "please_enter_valid_name";
        } else if (nomineeActivity.p1().f27024h.getSelectedItemPosition() == 0) {
            s12 = nomineeActivity.s1();
            str = "label_please_select_relation";
        } else if (nomineeActivity.p1().f27022f.getText().length() == 0) {
            b10 = nomineeActivity.s1().b("please_select_nomination_date", nomineeActivity.getString(R.string.please_select_nomination_date));
            Toast.makeText(nomineeActivity, b10, 1).show();
        } else {
            nomineeActivity.t1().show();
            Object selectedItem = nomineeActivity.p1().f27024h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.Nominee.NModel.Data");
            Data data = (Data) selectedItem;
            String str2 = nomineeActivity.W;
            String obj = nomineeActivity.p1().f27023g.getText().toString();
            String str3 = nomineeActivity.S;
            Integer valueOf = str3 != null ? Integer.valueOf(Integer.parseInt(str3)) : null;
            cm.l.c(valueOf);
            NomineeRequest nomineeRequest = new NomineeRequest(" ", str2, obj, valueOf.intValue(), v9.d.f17494a.m(), Integer.parseInt(VContant.NOMINEE_PURPOSE_CODE), String.valueOf(nomineeActivity.u1().getRc_regn_no()), data.getCode(), String.valueOf(nomineeActivity.u1().getState_cd()));
            i7.d dVar = new i7.d();
            he.c q12 = nomineeActivity.q1();
            String t10 = dVar.t(nomineeRequest);
            cm.l.e(t10, "toJson(...)");
            q12.g(t10);
            return;
        }
        b10 = s12.b(str, nomineeActivity.getString(R.string.please_enter_valid_name));
        Toast.makeText(nomineeActivity, b10, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void D1(NomineeActivity nomineeActivity, NomineeDraftResponse nomineeDraftResponse) {
        cm.l.f(nomineeActivity, "this$0");
        nomineeActivity.t1().dismiss();
        ApiMessageX apiMessage = nomineeDraftResponse.getApiMessage();
        String str = null;
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            ApiMessageX apiMessage2 = nomineeDraftResponse.getApiMessage();
            if (apiMessage2 != null) {
                str = apiMessage2.getDeveloperMessage();
            }
            nomineeActivity.b2(nomineeActivity, str);
            return;
        }
        c.a aVar = ka.c.f13158a;
        DataX data = nomineeDraftResponse.getData();
        if (!aVar.m(data != null ? data.getApplNo() : null)) {
            Intent intent = new Intent(nomineeActivity, VahanFaceLessConfirmation.class);
            intent.putExtra("state_code", String.valueOf(nomineeActivity.u1().getState_cd()));
            intent.putExtra("rc_number", nomineeActivity.u1().getRc_regn_no());
            DataX data2 = nomineeDraftResponse.getData();
            if (data2 != null) {
                str = data2.getApplNo();
            }
            intent.putExtra(VContant.APP_NO, str);
            intent.putExtra(VContant.PURPOSE_CODE, VContant.NOMINEE_PURPOSE_CODE);
            nomineeActivity.startActivity(intent);
            nomineeActivity.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(NomineeActivity nomineeActivity, String str) {
        cm.l.f(nomineeActivity, "this$0");
        nomineeActivity.t1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F1(NomineeActivity nomineeActivity, View view) {
        cm.l.f(nomineeActivity, "this$0");
        nomineeActivity.H1();
    }

    /* access modifiers changed from: private */
    public static final void G1(NomineeActivity nomineeActivity, View view) {
        cm.l.f(nomineeActivity, "this$0");
        nomineeActivity.I1();
    }

    private final void H1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void I1() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new j(new u(), new u(), this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(androidx.core.content.a.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(androidx.core.content.a.c(this, R.color.red_new));
    }

    /* access modifiers changed from: private */
    public static final void J1(u uVar, u uVar2, NomineeActivity nomineeActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cm.l.f(uVar, "$dayStartString");
        cm.l.f(uVar2, "$dayStartMonth");
        cm.l.f(nomineeActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        uVar.f20234e = str;
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        uVar2.f20234e = str2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        sb4.append('-');
        Object obj = uVar2.f20234e;
        String str6 = null;
        if (obj == null) {
            cm.l.v("dayStartMonth");
            str3 = null;
        } else {
            str3 = (String) obj;
        }
        sb4.append(str3);
        sb4.append('-');
        Object obj2 = uVar.f20234e;
        if (obj2 == null) {
            cm.l.v("dayStartString");
            str4 = null;
        } else {
            str4 = (String) obj2;
        }
        sb4.append(str4);
        nomineeActivity.W = sb4.toString();
        AppCompatTextView appCompatTextView = nomineeActivity.p1().f27022f;
        StringBuilder sb5 = new StringBuilder();
        Object obj3 = uVar.f20234e;
        if (obj3 == null) {
            cm.l.v("dayStartString");
            str5 = null;
        } else {
            str5 = (String) obj3;
        }
        sb5.append(str5);
        sb5.append('-');
        Object obj4 = uVar2.f20234e;
        if (obj4 == null) {
            cm.l.v("dayStartMonth");
        } else {
            str6 = (String) obj4;
        }
        sb5.append(str6);
        sb5.append('-');
        sb5.append(i10);
        appCompatTextView.setText(sb5.toString());
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z1(NomineeActivity nomineeActivity, View view) {
        cm.l.f(nomineeActivity, "this$0");
        nomineeActivity.finish();
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20679c0 = str;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20678b0 = str;
    }

    public final void M1(jc jcVar) {
        cm.l.f(jcVar, "<set-?>");
        this.G = jcVar;
    }

    public final void N1(he.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void O1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void P1(CompoundFeeServices compoundFeeServices) {
        cm.l.f(compoundFeeServices, "<set-?>");
        this.Y = compoundFeeServices;
    }

    public final void Q1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void R1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void T1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f20677a0 = nrvDetails;
    }

    public final void U1(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.K = vahanServiceConnection;
    }

    public final void V1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.P = vahanProService;
    }

    public final void W1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.L = hVar;
    }

    public final void X1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.N = vahanProService;
    }

    public final void Y1(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.M = hVar;
    }

    public final void Z1(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.J = lVar;
    }

    public final void a2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.O = hVar;
    }

    public final void b2(Context context, String str) {
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
        textView.setOnClickListener(new i(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.nominee_layout);
        jc c10 = jc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        M1(c10);
        setContentView((View) p1().b());
        getWindow().addFlags(128);
        Q1(new ld.c(this));
        e.f17509a.w1(this, p1());
        if (getIntent() != null) {
            this.S = String.valueOf(getIntent().getStringExtra("off_code"));
            this.f20680d0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
            L1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
            K1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
            S1(String.valueOf(getIntent().getStringExtra("RC")));
            Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
            T1((NrvDetails) serializableExtra);
        }
        VahanProService.a aVar = VahanProService.f21196b;
        X1(aVar.b(this));
        P1(CompoundFeeServices.f20567a.b(this));
        V1(aVar.b(this));
        N1((he.c) new u0((x0) this, (u0.b) new he.a(new b(r1()))).a(he.c.class));
        U1(VahanServiceConnection.f21199a.b(this));
        Class<bi.h> cls = bi.h.class;
        a2((bi.h) new u0((x0) this, (u0.b) new g(new wg.d(w1()))).a(cls));
        Z1((l) new u0((x0) this, (u0.b) new m(new wg.e(v1()))).a(l.class));
        Y1((bi.h) new u0((x0) this, (u0.b) new g(new wg.d(y1()))).a(cls));
        ld.c cVar = new ld.c(this);
        R1(new ProgressDialog(this));
        t1().setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        W1(new h(this));
        p1().f27027k.f28308i.setText(VContant.Companion.l(this, x1()));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        O1(A0);
        try {
            if (p.o(x1().c(), VContant.COMPOUND_FEE_CODE, true)) {
                this.Q.put(VContant.COMPOUND_FEE, VContant.COMPOUND_FEE_CODE);
            }
            if (p.o(x1().c(), VContant.Nominee_CODE, true)) {
                this.Q.put(VContant.Nominee_Addition, VContant.Nominee_CODE);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        p1().f27027k.f28305f.setOnClickListener(new vf.a(this));
        t1().show();
        q1().p();
        q1().n().g(this, new vf.b(this));
        q1().o().g(this, new vf.c(this));
        p1().f27020d.setOnClickListener(new vf.d(this));
        q1().l().g(this, new vf.e(this));
        q1().m().g(this, new f(this));
        p1().f27027k.f28306g.setOnClickListener(new vf.g(this));
        p1().f27022f.setOnClickListener(new vf.h(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            NaxpToKenService.f9438k.a(this);
        } catch (Exception unused) {
        }
    }

    public final jc p1() {
        jc jcVar = this.G;
        if (jcVar != null) {
            return jcVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final he.c q1() {
        he.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("compoundViewModel");
        return null;
    }

    public final CompoundFeeServices r1() {
        CompoundFeeServices compoundFeeServices = this.Y;
        if (compoundFeeServices != null) {
            return compoundFeeServices;
        }
        cm.l.v("feeService");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.f20677a0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanServiceConnection v1() {
        VahanServiceConnection vahanServiceConnection = this.K;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.P;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitServiceAddMob");
        return null;
    }

    public final h x1() {
        h hVar = this.L;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("session");
        return null;
    }

    public final VahanProService y1() {
        VahanProService vahanProService = this.N;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }
}
