package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
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
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import dh.i;
import dh.j;
import dh.k;
import dh.m;
import dh.n;
import dh.o;
import dh.p;
import dh.q;
import dh.r;
import dh.s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import og.b0;
import og.g;

public final class AddressDetailToBuyer extends androidx.appcompat.app.d {
    public ni.b G;
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
    private ArrayList U = new ArrayList();
    private MultiServiceDraftTO V;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailToBuyer f21359e;

        a(AddressDetailToBuyer addressDetailToBuyer) {
            this.f21359e = addressDetailToBuyer;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21359e.P1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailToBuyer f21360e;

        b(AddressDetailToBuyer addressDetailToBuyer) {
            this.f21360e = addressDetailToBuyer;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21360e.T1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailToBuyer f21361e;

        c(AddressDetailToBuyer addressDetailToBuyer) {
            this.f21361e = addressDetailToBuyer;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21361e.s1().f25390e.getSelectedItemPosition() != 0) {
                this.f21361e.v1().show();
                Object selectedItem = this.f21361e.s1().f25390e.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21361e.A1().h1(this.f21361e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailToBuyer f21362e;

        d(AddressDetailToBuyer addressDetailToBuyer) {
            this.f21362e = addressDetailToBuyer;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21362e.s1().f25407v.getSelectedItemPosition() != 0) {
                this.f21362e.v1().show();
                Object selectedItem = this.f21362e.s1().f25407v.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21362e.A1().i1(this.f21362e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(AddressDetailToBuyer addressDetailToBuyer, View view) {
        l.f(addressDetailToBuyer, "this$0");
        Intent intent = new Intent(addressDetailToBuyer, VahanVehicleDetailsService.class);
        intent.putExtra("RC", addressDetailToBuyer.w1().getRc_regn_no());
        intent.putExtra("RcDetails", addressDetailToBuyer.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, addressDetailToBuyer.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, addressDetailToBuyer.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, addressDetailToBuyer.q1());
        addressDetailToBuyer.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void C1(AddressDetailToBuyer addressDetailToBuyer, View view) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.finish();
    }

    /* access modifiers changed from: private */
    public static final void D1(AddressDetailToBuyer addressDetailToBuyer, String str) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.v1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void E1(AddressDetailToBuyer addressDetailToBuyer, View view) {
        ld.c t12;
        String string;
        l.f(addressDetailToBuyer, "this$0");
        String str = "please_enter_house_no_street_name";
        if (addressDetailToBuyer.s1().f25393h.getText().length() >= 2) {
            if (addressDetailToBuyer.s1().f25391f.getText().length() < 2) {
                t12 = addressDetailToBuyer.t1();
                string = addressDetailToBuyer.getString(R.string.please_enter_current_village_town_city);
                str = "please_enter_current_village_town_city";
            } else if (addressDetailToBuyer.s1().f25388c.getText().length() < 2) {
                t12 = addressDetailToBuyer.t1();
                string = addressDetailToBuyer.getString(R.string.please_enter_current_landmark_police_station);
                str = "please_enter_current_landmark_police_station";
            } else if (addressDetailToBuyer.s1().f25389d.getText().length() < 2) {
                t12 = addressDetailToBuyer.t1();
                string = addressDetailToBuyer.getString(R.string.please_enter_current_pin_code);
                str = "please_enter_current_pin_code";
            } else if (addressDetailToBuyer.s1().f25390e.getSelectedItemPosition() == 0) {
                t12 = addressDetailToBuyer.t1();
                string = addressDetailToBuyer.getString(R.string.please_select_current_state);
                str = "select_state";
            } else if (addressDetailToBuyer.s1().f25387b.getSelectedItemPosition() == 0) {
                t12 = addressDetailToBuyer.t1();
                string = addressDetailToBuyer.getString(R.string.please_select_current_district);
                str = "select_district";
            } else if (addressDetailToBuyer.s1().f25400o.getText().length() >= 2) {
                if (addressDetailToBuyer.s1().f25408w.getText().length() < 2) {
                    t12 = addressDetailToBuyer.t1();
                    string = addressDetailToBuyer.getString(R.string.please_enter_permanent_village_town_city);
                    str = "please_enter_permanent_village_town_city";
                } else if (addressDetailToBuyer.s1().f25402q.getText().length() < 2) {
                    t12 = addressDetailToBuyer.t1();
                    string = addressDetailToBuyer.getString(R.string.please_enter_permanent_landmark_police_station);
                    str = "please_enter_permanent_landmark_police_station";
                } else if (addressDetailToBuyer.s1().f25399n.getText().length() < 2) {
                    t12 = addressDetailToBuyer.t1();
                    string = addressDetailToBuyer.getString(R.string.please_enter_permanent_pin_code);
                    str = "please_enter_permanent_pin_code";
                } else if (addressDetailToBuyer.s1().f25407v.getSelectedItemPosition() == 0) {
                    t12 = addressDetailToBuyer.t1();
                    string = addressDetailToBuyer.getString(R.string.select_pstate);
                    str = "select_pstate";
                } else if (addressDetailToBuyer.s1().f25398m.getSelectedItemPosition() == 0) {
                    t12 = addressDetailToBuyer.t1();
                    string = addressDetailToBuyer.getString(R.string.select_pdistrict);
                    str = "select_pdistrict";
                } else {
                    Object selectedItem = addressDetailToBuyer.s1().f25387b.getSelectedItem();
                    l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                    Object selectedItem2 = addressDetailToBuyer.s1().f25398m.getSelectedItem();
                    l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                    Object selectedItem3 = addressDetailToBuyer.s1().f25390e.getSelectedItem();
                    l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                    Object selectedItem4 = addressDetailToBuyer.s1().f25407v.getSelectedItem();
                    l.d(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                    new yh.a(addressDetailToBuyer).e(addressDetailToBuyer.s1(), ((String) ((VahanStateModleSubList) selectedItem3).get(0)).toString(), ((String) ((VahanStateModleSubList) selectedItem4).get(0)).toString(), String.valueOf(((DistictModleItem) selectedItem).getDist_cd()), String.valueOf(((DistictModleItem) selectedItem2).getDist_cd()));
                    Intent intent = new Intent(addressDetailToBuyer, NomineeAndInsuranceDetailTOBuyer.class);
                    intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, addressDetailToBuyer.U);
                    intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, addressDetailToBuyer.V);
                    intent.putExtra("off_code", addressDetailToBuyer.u1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, addressDetailToBuyer.S);
                    intent.putExtra("RcDetails", addressDetailToBuyer.w1());
                    intent.putExtra(VContant.NEXGEN_addahar_name, addressDetailToBuyer.r1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, addressDetailToBuyer.q1());
                    addressDetailToBuyer.startActivity(intent);
                    return;
                }
            }
            Toast.makeText(addressDetailToBuyer, t12.b(str, string), 0).show();
        }
        t12 = addressDetailToBuyer.t1();
        string = addressDetailToBuyer.getString(R.string.please_enter_house_no_street_name);
        Toast.makeText(addressDetailToBuyer, t12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void F1(AddressDetailToBuyer addressDetailToBuyer, View view) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void G1(AddressDetailToBuyer addressDetailToBuyer, CompoundButton compoundButton, boolean z10) {
        l.f(addressDetailToBuyer, "this$0");
        if (z10) {
            String obj = addressDetailToBuyer.s1().f25393h.getText().toString();
            String obj2 = addressDetailToBuyer.s1().f25388c.getText().toString();
            String obj3 = addressDetailToBuyer.s1().f25391f.getText().toString();
            String obj4 = addressDetailToBuyer.s1().f25389d.getText().toString();
            if (!(obj == null || obj.length() == 0)) {
                addressDetailToBuyer.s1().f25400o.setText(obj);
            }
            if (!(obj2 == null || obj2.length() == 0)) {
                addressDetailToBuyer.s1().f25402q.setText(obj2);
            }
            if (!(obj3 == null || obj3.length() == 0)) {
                addressDetailToBuyer.s1().f25408w.setText(obj3);
            }
            if (!(obj4 == null || obj4.length() == 0)) {
                addressDetailToBuyer.s1().f25399n.setText(obj4);
            }
            if (addressDetailToBuyer.s1().f25387b.getSelectedItemPosition() > 0) {
                addressDetailToBuyer.s1().f25398m.setSelection(addressDetailToBuyer.s1().f25387b.getSelectedItemPosition());
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(AddressDetailToBuyer addressDetailToBuyer, VahanStateModle vahanStateModle) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.v1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            addressDetailToBuyer.s1().f25390e.setAdapter(new b0(addressDetailToBuyer, vahanStateModle));
            try {
                int y12 = addressDetailToBuyer.y1(addressDetailToBuyer.z1(), vahanStateModle);
                addressDetailToBuyer.s1().f25390e.setSelection(y12);
                addressDetailToBuyer.s1().f25390e.setEnabled(false);
                addressDetailToBuyer.s1().f25407v.setAdapter(new b0(addressDetailToBuyer, vahanStateModle));
                addressDetailToBuyer.s1().f25407v.setSelection(y12);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(AddressDetailToBuyer addressDetailToBuyer, String str) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.v1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J1(AddressDetailToBuyer addressDetailToBuyer, DistictModle distictModle) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.v1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            addressDetailToBuyer.s1().f25387b.setAdapter(new g(addressDetailToBuyer, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void K1(AddressDetailToBuyer addressDetailToBuyer, String str) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.v1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L1(AddressDetailToBuyer addressDetailToBuyer, DistictModle distictModle) {
        l.f(addressDetailToBuyer, "this$0");
        addressDetailToBuyer.v1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            addressDetailToBuyer.s1().f25398m.setAdapter(new g(addressDetailToBuyer, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
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
        this.R = str;
    }

    public final void N1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void O1(ni.b bVar) {
        l.f(bVar, "<set-?>");
        this.G = bVar;
    }

    public final void P1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void Q1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void S1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void T1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void U1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.P = nrvDetails;
    }

    public final void V1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void W1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void X1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ni.b c10 = ni.b.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        O1(c10);
        setContentView((View) s1().b());
        Q1(new ld.c(this));
        if (new ld.h(this).b()) {
            s1().B.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.S;
        LinearLayout linearLayout = s1().B.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        V1(VahanProService.f21196b.b(this));
        S1(new ProgressDialog(this));
        v1().setMessage(t1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        W1(String.valueOf(getIntent().getStringExtra("stateCd")));
        R1(String.valueOf(getIntent().getStringExtra("off_code")));
        N1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        M1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        U1((NrvDetails) serializableExtra);
        this.S = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.V = (MultiServiceDraftTO) serializableExtra2;
        this.U = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        s1().E.f28308i.setText(String.valueOf(t1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        s1().E.f28304e.setVisibility(0);
        s1().E.f28304e.setText(w1().getRc_regn_no());
        SpannableString spannableString = new SpannableString(w1().getRc_regn_no());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        s1().E.f28304e.setText(spannableString);
        s1().E.f28304e.setOnClickListener(new i(this));
        X1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(x1()))).a(h.class));
        s1().E.f28305f.setOnClickListener(new dh.l(this));
        s1().f25397l.setOnClickListener(new m(this));
        s1().A.setOnClickListener(new n(this));
        try {
            v1().show();
            A1().V0(this);
        } catch (Exception unused) {
        }
        s1().C.setOnCheckedChangeListener(new o(this));
        Spinner spinner = s1().f25390e;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new c(this));
        }
        Spinner spinner2 = s1().f25407v;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new d(this));
        }
        A1().U0().g(this, new p(this));
        A1().W0().g(this, new q(this));
        A1().D().g(this, new r(this));
        A1().E().g(this, new s(this));
        A1().F().g(this, new j(this));
        A1().G().g(this, new k(this));
        s1().f25387b.setOnItemSelectedListener(new a(this));
        s1().f25398m.setOnItemSelectedListener(new b(this));
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

    public final ni.b s1() {
        ni.b bVar = this.G;
        if (bVar != null) {
            return bVar;
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

    public final String z1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("stateCd");
        return null;
    }
}
