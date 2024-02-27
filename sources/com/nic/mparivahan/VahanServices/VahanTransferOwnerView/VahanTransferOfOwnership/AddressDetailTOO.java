package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Iterator;
import ni.g0;
import og.b0;
import og.g;
import v9.e;
import zg.f;
import zg.i;
import zg.j;
import zg.k;

public final class AddressDetailTOO extends androidx.appcompat.app.d {
    public g0 G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    private Calendar K = Calendar.getInstance();
    public String L;
    public String M;
    public String N;
    public String O;
    public NrvDetails P;
    public String Q;
    public String R;
    private boolean S;
    public ld.c T;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailTOO f21291e;

        a(AddressDetailTOO addressDetailTOO) {
            this.f21291e = addressDetailTOO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21291e.O1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailTOO f21292e;

        b(AddressDetailTOO addressDetailTOO) {
            this.f21292e = addressDetailTOO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21292e.S1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailTOO f21293e;

        c(AddressDetailTOO addressDetailTOO) {
            this.f21293e = addressDetailTOO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21293e.s1().f26419e.getSelectedItemPosition() != 0) {
                this.f21293e.v1().show();
                Object selectedItem = this.f21293e.s1().f26419e.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21293e.z1().h1(this.f21293e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailTOO f21294e;

        d(AddressDetailTOO addressDetailTOO) {
            this.f21294e = addressDetailTOO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21294e.s1().f26436v.getSelectedItemPosition() != 0) {
                this.f21294e.v1().show();
                Object selectedItem = this.f21294e.s1().f26436v.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21294e.z1().i1(this.f21294e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(AddressDetailTOO addressDetailTOO, View view) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.finish();
    }

    /* access modifiers changed from: private */
    public static final void B1(AddressDetailTOO addressDetailTOO, View view) {
        l.f(addressDetailTOO, "this$0");
        Intent intent = new Intent(addressDetailTOO, VahanVehicleDetailsService.class);
        intent.putExtra("RC", addressDetailTOO.w1().getRc_regn_no());
        intent.putExtra("RcDetails", addressDetailTOO.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, addressDetailTOO.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, addressDetailTOO.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, addressDetailTOO.q1());
        addressDetailTOO.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void C1(AddressDetailTOO addressDetailTOO, String str) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.v1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void D1(AddressDetailTOO addressDetailTOO, View view) {
        ld.c t12;
        String string;
        l.f(addressDetailTOO, "this$0");
        String str = "please_enter_house_no_street_name";
        if (addressDetailTOO.s1().f26422h.getText().length() >= 2) {
            if (addressDetailTOO.s1().f26420f.getText().length() < 2) {
                t12 = addressDetailTOO.t1();
                string = addressDetailTOO.getString(R.string.please_enter_current_village_town_city);
                str = "please_enter_current_village_town_city";
            } else if (addressDetailTOO.s1().f26417c.getText().length() < 2) {
                t12 = addressDetailTOO.t1();
                string = addressDetailTOO.getString(R.string.please_enter_current_landmark_police_station);
                str = "please_enter_current_landmark_police_station";
            } else if (addressDetailTOO.s1().f26418d.getText().length() < 2) {
                t12 = addressDetailTOO.t1();
                string = addressDetailTOO.getString(R.string.please_enter_current_pin_code);
                str = "please_enter_current_pin_code";
            } else if (addressDetailTOO.s1().f26419e.getSelectedItemPosition() == 0) {
                t12 = addressDetailTOO.t1();
                string = addressDetailTOO.getString(R.string.please_select_current_state);
                str = "select_state";
            } else if (addressDetailTOO.s1().f26416b.getSelectedItemPosition() == 0) {
                t12 = addressDetailTOO.t1();
                string = addressDetailTOO.getString(R.string.please_select_current_district);
                str = "select_district";
            } else if (addressDetailTOO.s1().f26429o.getText().length() >= 2) {
                if (addressDetailTOO.s1().f26437w.getText().length() < 2) {
                    t12 = addressDetailTOO.t1();
                    string = addressDetailTOO.getString(R.string.please_enter_permanent_village_town_city);
                    str = "please_enter_permanent_village_town_city";
                } else if (addressDetailTOO.s1().f26431q.getText().length() < 2) {
                    t12 = addressDetailTOO.t1();
                    string = addressDetailTOO.getString(R.string.please_enter_permanent_landmark_police_station);
                    str = "please_enter_permanent_landmark_police_station";
                } else if (addressDetailTOO.s1().f26428n.getText().length() < 2) {
                    t12 = addressDetailTOO.t1();
                    string = addressDetailTOO.getString(R.string.please_enter_permanent_pin_code);
                    str = "please_enter_permanent_pin_code";
                } else if (addressDetailTOO.s1().f26436v.getSelectedItemPosition() == 0) {
                    t12 = addressDetailTOO.t1();
                    string = addressDetailTOO.getString(R.string.select_pstate);
                    str = "select_pstate";
                } else if (addressDetailTOO.s1().f26427m.getSelectedItemPosition() == 0) {
                    t12 = addressDetailTOO.t1();
                    string = addressDetailTOO.getString(R.string.select_pdistrict);
                    str = "select_pdistrict";
                } else {
                    Object selectedItem = addressDetailTOO.s1().f26416b.getSelectedItem();
                    l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                    Object selectedItem2 = addressDetailTOO.s1().f26427m.getSelectedItem();
                    l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                    Object selectedItem3 = addressDetailTOO.s1().f26419e.getSelectedItem();
                    l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                    Object selectedItem4 = addressDetailTOO.s1().f26436v.getSelectedItem();
                    l.d(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                    new yh.b(addressDetailTOO).q(addressDetailTOO.s1(), ((String) ((VahanStateModleSubList) selectedItem3).get(0)).toString(), ((String) ((VahanStateModleSubList) selectedItem4).get(0)).toString(), String.valueOf(((DistictModleItem) selectedItem).getDist_cd()), String.valueOf(((DistictModleItem) selectedItem2).getDist_cd()));
                    Intent intent = new Intent(addressDetailTOO, NomineeAndInsuranceDetail.class);
                    intent.putExtra("off_code", addressDetailTOO.u1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, addressDetailTOO.S);
                    intent.putExtra("RcDetails", addressDetailTOO.w1());
                    intent.putExtra(VContant.NEXGEN_addahar_name, addressDetailTOO.r1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, addressDetailTOO.q1());
                    addressDetailTOO.startActivity(intent);
                    return;
                }
            }
            Toast.makeText(addressDetailTOO, t12.b(str, string), 0).show();
        }
        t12 = addressDetailTOO.t1();
        string = addressDetailTOO.getString(R.string.please_enter_house_no_street_name);
        Toast.makeText(addressDetailTOO, t12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void E1(AddressDetailTOO addressDetailTOO, View view) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void F1(AddressDetailTOO addressDetailTOO, CompoundButton compoundButton, boolean z10) {
        l.f(addressDetailTOO, "this$0");
        if (z10) {
            String obj = addressDetailTOO.s1().f26422h.getText().toString();
            String obj2 = addressDetailTOO.s1().f26417c.getText().toString();
            String obj3 = addressDetailTOO.s1().f26420f.getText().toString();
            String obj4 = addressDetailTOO.s1().f26418d.getText().toString();
            if (!(obj == null || obj.length() == 0)) {
                addressDetailTOO.s1().f26429o.setText(obj);
            }
            if (!(obj2 == null || obj2.length() == 0)) {
                addressDetailTOO.s1().f26431q.setText(obj2);
            }
            if (!(obj3 == null || obj3.length() == 0)) {
                addressDetailTOO.s1().f26437w.setText(obj3);
            }
            if (!(obj4 == null || obj4.length() == 0)) {
                addressDetailTOO.s1().f26428n.setText(obj4);
            }
            if (addressDetailTOO.s1().f26416b.getSelectedItemPosition() > 0) {
                addressDetailTOO.s1().f26427m.setSelection(addressDetailTOO.s1().f26416b.getSelectedItemPosition());
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(AddressDetailTOO addressDetailTOO, VahanStateModle vahanStateModle) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.v1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            addressDetailTOO.s1().f26419e.setAdapter(new b0(addressDetailTOO, vahanStateModle));
            try {
                int y12 = addressDetailTOO.y1(q.B0(String.valueOf(addressDetailTOO.w1().getState_cd())).toString(), vahanStateModle);
                addressDetailTOO.s1().f26419e.setSelection(y12);
                addressDetailTOO.s1().f26419e.setEnabled(false);
                addressDetailTOO.s1().f26436v.setAdapter(new b0(addressDetailTOO, vahanStateModle));
                addressDetailTOO.s1().f26436v.setSelection(y12);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(AddressDetailTOO addressDetailTOO, String str) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.v1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I1(AddressDetailTOO addressDetailTOO, DistictModle distictModle) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.v1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            addressDetailTOO.s1().f26416b.setAdapter(new g(addressDetailTOO, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(AddressDetailTOO addressDetailTOO, String str) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.v1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void K1(AddressDetailTOO addressDetailTOO, DistictModle distictModle) {
        l.f(addressDetailTOO, "this$0");
        addressDetailTOO.v1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            addressDetailTOO.s1().f26427m.setAdapter(new g(addressDetailTOO, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void N1(g0 g0Var) {
        l.f(g0Var, "<set-?>");
        this.G = g0Var;
    }

    public final void O1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void P1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void Q1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void R1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void T1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.P = nrvDetails;
    }

    public final void U1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void V1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void W1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g0 c10 = g0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        N1(c10);
        setContentView((View) s1().b());
        e.f17509a.j2(this, s1());
        P1(new ld.c(this));
        U1(VahanProService.f21196b.b(this));
        R1(new ProgressDialog(this));
        v1().setMessage(t1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        V1(String.valueOf(getIntent().getStringExtra("stateCd")));
        Q1(String.valueOf(getIntent().getStringExtra("off_code")));
        M1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        L1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        T1((NrvDetails) serializableExtra);
        this.S = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        W1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(x1()))).a(h.class));
        s1().D.f28305f.setOnClickListener(new zg.a(this));
        s1().F.setPaintFlags(s1().F.getPaintFlags() | 8);
        s1().F.setOnClickListener(new zg.d(this));
        s1().f26426l.setOnClickListener(new zg.e(this));
        s1().A.setOnClickListener(new f(this));
        try {
            v1().show();
            z1().V0(this);
        } catch (Exception unused) {
        }
        s1().B.setOnCheckedChangeListener(new zg.g(this));
        Spinner spinner = s1().f26419e;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new c(this));
        }
        Spinner spinner2 = s1().f26436v;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new d(this));
        }
        z1().U0().g(this, new zg.h(this));
        z1().W0().g(this, new i(this));
        z1().D().g(this, new j(this));
        z1().E().g(this, new k(this));
        z1().F().g(this, new zg.b(this));
        z1().G().g(this, new zg.c(this));
        s1().f26416b.setOnItemSelectedListener(new a(this));
        s1().f26427m.setOnItemSelectedListener(new b(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final String q1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String r1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final g0 s1() {
        g0 g0Var = this.G;
        if (g0Var != null) {
            return g0Var;
        }
        l.v("binding");
        return null;
    }

    public final ld.c t1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final String u1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.P;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService x1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final int y1(String str, VahanStateModle vahanStateModle) {
        l.f(str, "State_code");
        l.f(vahanStateModle, "list");
        Iterator it = vahanStateModle.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (q.B0(((String) vahanStateModleSubList.get(0)).toString()).toString().equals(str)) {
                return vahanStateModle.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }

    public final h z1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
