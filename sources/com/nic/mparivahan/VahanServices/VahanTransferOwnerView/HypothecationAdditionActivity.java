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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ld.c;
import ld.h;
import ni.rd;
import of.b;
import og.b0;
import og.g;
import og.x;
import v9.d;
import v9.e;
import yg.f;
import yg.i;
import yg.j;
import yg.k;
import yg.m;
import yg.n;

public final class HypothecationAdditionActivity extends d {
    public rd G;
    public b H;
    public HServices I;
    public ProgressDialog J;
    private Calendar K = Calendar.getInstance();
    public String L;
    public String M;
    public String N;
    public NrvDetails O;
    public String P;
    public String Q;
    private boolean R;
    public c S;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HypothecationAdditionActivity f21207e;

        a(HypothecationAdditionActivity hypothecationAdditionActivity) {
            this.f21207e = hypothecationAdditionActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21207e.v1().f28468p.getSelectedItemPosition() != 0) {
                this.f21207e.y1().show();
                Object selectedItem = this.f21207e.v1().f28468p.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21207e.C1().q(((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(HypothecationAdditionActivity hypothecationAdditionActivity, View view) {
        l.f(hypothecationAdditionActivity, "this$0");
        Intent intent = new Intent(hypothecationAdditionActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationAdditionActivity.z1());
        intent.putExtra("RcDetails", hypothecationAdditionActivity.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationAdditionActivity.R);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationAdditionActivity.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationAdditionActivity.t1());
        hypothecationAdditionActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void E1(HypothecationAdditionActivity hypothecationAdditionActivity, View view) {
        l.f(hypothecationAdditionActivity, "this$0");
        VUtility.Companion.v(hypothecationAdditionActivity, hypothecationAdditionActivity.w1().b("are_you_sure_you_want_to_leave", hypothecationAdditionActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void F1(HypothecationAdditionActivity hypothecationAdditionActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(hypothecationAdditionActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(hypothecationAdditionActivity, onDateSetListener, hypothecationAdditionActivity.K.get(1), hypothecationAdditionActivity.K.get(2), hypothecationAdditionActivity.K.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void G1(HypothecationAdditionActivity hypothecationAdditionActivity, View view) {
        c w12;
        String string;
        String str;
        HypothecationAdditionActivity hypothecationAdditionActivity2 = hypothecationAdditionActivity;
        l.f(hypothecationAdditionActivity2, "this$0");
        String obj = hypothecationAdditionActivity.v1().f28460h.getText().toString();
        String obj2 = hypothecationAdditionActivity.v1().f28461i.getText().toString();
        String obj3 = hypothecationAdditionActivity.v1().B.getText().toString();
        String obj4 = hypothecationAdditionActivity.v1().f28464l.getText().toString();
        String obj5 = hypothecationAdditionActivity.v1().f28456d.getText().toString();
        String obj6 = hypothecationAdditionActivity.v1().f28458f.getText().toString();
        Object selectedItem = hypothecationAdditionActivity.v1().f28468p.getSelectedItem();
        l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
        if (hypothecationAdditionActivity.v1().f28463k.getSelectedItemPosition() == 0) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_enter_hypothentication_type);
            str = "please_enter_hypothentication_type";
        } else if (obj.length() < 2) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_enter_the_financer_name);
            str = "please_enter_the_financer_name";
        } else if (obj2.length() < 2) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_enter_valid_house_no);
            str = "please_enter_valid_house_no";
        } else if (obj3.length() < 3) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_enter_village_town_city);
            str = "please_enter_village_town_city";
        } else if (hypothecationAdditionActivity.v1().f28468p.getSelectedItemPosition() == 0) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_select_the_state);
            str = "please_select_the_state";
        } else if (hypothecationAdditionActivity.v1().f28455c.getSelectedItemPosition() == 0) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_select_district);
            str = "please_select_district";
        } else if (obj5.length() < 6) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_enter_valid_pincode);
            str = "please_enter_valid_pincode";
        } else if (hypothecationAdditionActivity.v1().f28458f.getText().length() < 2) {
            w12 = hypothecationAdditionActivity.w1();
            string = hypothecationAdditionActivity2.getString(R.string.please_select_date);
            str = "please_select_date";
        } else {
            try {
                d.a aVar = v9.d.f17494a;
                aVar.m();
                Object selectedItem2 = hypothecationAdditionActivity.v1().f28463k.getSelectedItem();
                l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem");
                hypothecationAdditionActivity.y1().show();
                Object selectedItem3 = hypothecationAdditionActivity.v1().f28455c.getSelectedItem();
                l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                hypothecationAdditionActivity.C1().r(obj2, obj3, obj4, String.valueOf(((DistictModleItem) selectedItem3).getDist_cd()), obj, obj5, ((String) vahanStateModleSubList.get(0)).toString(), z9.a.f18947a.h(obj6), aVar.m(), String.valueOf(hypothecationAdditionActivity.A1().getState_cd()), hypothecationAdditionActivity.z1(), hypothecationAdditionActivity.x1(), ((HTPModleItem) selectedItem2).getHp_type_cd());
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        Toast.makeText(hypothecationAdditionActivity2, w12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void H1(HypothecationAdditionActivity hypothecationAdditionActivity, HPAResModle hPAResModle) {
        HPAResModle hPAResModle2;
        HypothecationAdditionActivity hypothecationAdditionActivity2 = hypothecationAdditionActivity;
        l.f(hypothecationAdditionActivity2, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
        try {
            String appl_no = hPAResModle.getAppl_no();
            if (appl_no == null) {
                return;
            }
            if (appl_no.length() != 0) {
                h hVar = new h(hypothecationAdditionActivity2);
                l.c(hPAResModle);
                if (hypothecationAdditionActivity2.R) {
                    hPAResModle2 = HPAResModle.copy$default(hPAResModle, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (String) null, hVar.a(), 65535, (Object) null);
                } else {
                    hPAResModle2 = HPAResModle.copy$default(hPAResModle, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (String) null, " ", 65535, (Object) null);
                }
                Intent intent = new Intent(hypothecationAdditionActivity2, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_ADDITION_CODE);
                intent.putExtra(VContant.HYPOTHECATION_ADDITION_CODE, hPAResModle2);
                intent.putExtra(VContant.APP_NO, hPAResModle.getAppl_no());
                intent.putExtra("state_code", hypothecationAdditionActivity.A1().getState_cd());
                intent.putExtra("rc_number", hypothecationAdditionActivity.z1());
                intent.putExtra("off_code", hypothecationAdditionActivity.x1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
                intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationAdditionActivity2.R);
                intent.putExtra("RC", hypothecationAdditionActivity.z1());
                intent.putExtra("RcDetails", hypothecationAdditionActivity.A1());
                intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationAdditionActivity.u1());
                intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationAdditionActivity.t1());
                hypothecationAdditionActivity2.startActivity(intent);
                hypothecationAdditionActivity.finish();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(HypothecationAdditionActivity hypothecationAdditionActivity, String str) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J1(HypothecationAdditionActivity hypothecationAdditionActivity, View view) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.R1();
    }

    /* access modifiers changed from: private */
    public static final void K1(HypothecationAdditionActivity hypothecationAdditionActivity, VahanStateModle vahanStateModle) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            hypothecationAdditionActivity.v1().f28468p.setAdapter(new b0(hypothecationAdditionActivity, vahanStateModle));
            hypothecationAdditionActivity.y1().show();
            hypothecationAdditionActivity.C1().m();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(HypothecationAdditionActivity hypothecationAdditionActivity, String str) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void M1(HypothecationAdditionActivity hypothecationAdditionActivity, DistictModle distictModle) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            hypothecationAdditionActivity.v1().f28455c.setAdapter(new g(hypothecationAdditionActivity, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void N1(HypothecationAdditionActivity hypothecationAdditionActivity, String str) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void O1(HypothecationAdditionActivity hypothecationAdditionActivity, HtpTypeModle htpTypeModle) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
        try {
            l.c(htpTypeModle);
            htpTypeModle.add(0, new HTPModleItem("0", "Select Type"));
            hypothecationAdditionActivity.v1().f28463k.setAdapter(new x(hypothecationAdditionActivity, htpTypeModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void P1(HypothecationAdditionActivity hypothecationAdditionActivity, String str) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.y1().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new HTPModleItem("0", "Select Type"));
        hypothecationAdditionActivity.v1().f28463k.setAdapter(new x(hypothecationAdditionActivity, arrayList));
    }

    /* access modifiers changed from: private */
    public static final void Q1(HypothecationAdditionActivity hypothecationAdditionActivity, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(hypothecationAdditionActivity, "this$0");
        hypothecationAdditionActivity.K.set(1, i10);
        hypothecationAdditionActivity.K.set(2, i11);
        hypothecationAdditionActivity.K.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", hypothecationAdditionActivity.K.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", hypothecationAdditionActivity.K.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", hypothecationAdditionActivity.K.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        hypothecationAdditionActivity.V1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        hypothecationAdditionActivity.v1().f28458f.setText(simpleDateFormat.format(hypothecationAdditionActivity.K.getTime()));
    }

    private final void R1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.O;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final HServices B1() {
        HServices hServices = this.I;
        if (hServices != null) {
            return hServices;
        }
        l.v("retrofitService");
        return null;
    }

    public final b C1() {
        b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void T1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void U1(rd rdVar) {
        l.f(rdVar, "<set-?>");
        this.G = rdVar;
    }

    public final void V1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void W1(c cVar) {
        l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void X1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void Z1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void a2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.O = nrvDetails;
    }

    public final void b2(HServices hServices) {
        l.f(hServices, "<set-?>");
        this.I = hServices;
    }

    public final void c2(b bVar) {
        l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, w1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_hypothecation_addition);
        rd c10 = rd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        U1(c10);
        setContentView((View) v1().b());
        e.f17509a.R2(this, v1());
        W1(new c(this));
        Y1(new ProgressDialog(this));
        y1().setMessage("Please wait...");
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        b2(HServices.f20664a.b(this));
        c2((b) new u0((x0) this, (u0.b) new of.a(new qf.a(B1()))).a(b.class));
        Z1(String.valueOf(getIntent().getStringExtra("RC")));
        X1(String.valueOf(getIntent().getStringExtra("off_code")));
        T1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        S1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Z1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra);
        if (this.R) {
            v1().f28467o.f27162e.setWeightSum(3.0f);
        }
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.R = booleanExtra;
        VContant.Companion companion = VContant.Companion;
        LinearLayout linearLayout = v1().f28467o.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(booleanExtra, linearLayout);
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra2);
        TextView textView = v1().f28478z;
        textView.setText(w1().b("vehicle_no", "Vehicle No.:") + ' ' + z1());
        v1().A.setText(w1().b("view_vehicle_details", "View Vehicle Details"));
        v1().A.setPaintFlags(v1().A.getPaintFlags() | 8);
        v1().A.setOnClickListener(new yg.a(this));
        v1().f28470r.f28305f.setOnClickListener(new j(this));
        v1().f28470r.f28306g.setOnClickListener(new k(this));
        try {
            y1().show();
            C1().o();
        } catch (Exception unused) {
        }
        C1().n().g(this, new yg.l(this));
        C1().p().g(this, new m(this));
        C1().g().g(this, new n(this));
        C1().h().g(this, new yg.b(this));
        C1().i().g(this, new yg.c(this));
        C1().j().g(this, new yg.d(this));
        Spinner spinner = v1().f28468p;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        v1().f28458f.setOnClickListener(new f(this, new yg.e(this)));
        v1().f28454b.setOnClickListener(new yg.g(this));
        C1().k().g(this, new yg.h(this));
        C1().l().g(this, new i(this));
    }

    public final String t1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String u1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final rd v1() {
        rd rdVar = this.G;
        if (rdVar != null) {
            return rdVar;
        }
        l.v("binding");
        return null;
    }

    public final c w1() {
        c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final String x1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String z1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }
}
