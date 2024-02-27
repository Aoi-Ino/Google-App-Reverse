package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership;

import ah.v;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.lifecycle.b0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.Data;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.TOPurposeResponseData;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ni.ae;
import pl.x;
import t8.c;

public final class VahanTransferOfOwnerShipActivity extends androidx.appcompat.app.d {
    public ae G;
    public qh.a H;
    public TOCommonService I;
    public uh.a J;
    public TOPurposeService K;
    private Calendar L = Calendar.getInstance();
    public String M;
    private boolean N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public NrvDetails U;
    public String V;
    public String W;
    public ld.c X;
    public ProgressDialog Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f21434a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f21435b0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanTransferOfOwnerShipActivity f21436e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity) {
            super(1);
            this.f21436e = vahanTransferOfOwnerShipActivity;
        }

        public final void b(ToCommonModel2 toCommonModel2) {
            this.f21436e.w1().dismiss();
            try {
                Integer rc_owner_srNo = this.f21436e.z1().getRc_owner_srNo();
                this.f21436e.n1().f25363d.setText(String.valueOf(rc_owner_srNo != null ? Integer.valueOf(rc_owner_srNo.intValue() + 1) : null));
                ArrayList<OwnerCatagory> ownerCatagory = toCommonModel2.getData().getOwnerCatagory();
                ownerCatagory.add(0, new OwnerCatagory(0, "Select Owner Category"));
                this.f21436e.n1().f25370k.setAdapter(new hh.a(this.f21436e, ownerCatagory));
                ArrayList<OwnerShipType> ownerShipType = toCommonModel2.getData().getOwnerShipType();
                ownerShipType.add(0, new OwnerShipType("Select Ownership Type", 0));
                this.f21436e.n1().f25375p.setAdapter(new hh.b(this.f21436e, ownerShipType));
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
        final /* synthetic */ VahanTransferOfOwnerShipActivity f21437e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity) {
            super(1);
            this.f21437e = vahanTransferOfOwnerShipActivity;
        }

        public final void b(String str) {
            this.f21437e.w1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanTransferOfOwnerShipActivity f21438e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity) {
            super(1);
            this.f21438e = vahanTransferOfOwnerShipActivity;
        }

        public final void b(TOPurposeResponseData tOPurposeResponseData) {
            try {
                ArrayList<Data> data = tOPurposeResponseData.getData();
                if (data != null) {
                    data.add(0, new Data(0, "Select Purpose", "0"));
                }
                VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity = this.f21438e;
                cm.l.c(data);
                this.f21438e.n1().f25379t.setAdapter(new rh.a(vahanTransferOfOwnerShipActivity, data));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TOPurposeResponseData) obj);
            return x.f30437a;
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanTransferOfOwnerShipActivity f21439e;

        d(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity) {
            this.f21439e = vahanTransferOfOwnerShipActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21439e.X1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
            Log.e("whichPurpose", this.f21439e.x1());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanTransferOfOwnerShipActivity f21440e;

        e(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity) {
            this.f21440e = vahanTransferOfOwnerShipActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21440e.V1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
            Log.e("whichPurpose2", this.f21440e.v1());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanTransferOfOwnerShipActivity f21441e;

        f(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity) {
            this.f21441e = vahanTransferOfOwnerShipActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21441e.S1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21442a;

        g(l lVar) {
            cm.l.f(lVar, "function");
            this.f21442a = lVar;
        }

        public final pl.c a() {
            return this.f21442a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21442a.invoke(obj);
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
    public static final void F1(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity, View view) {
        cm.l.f(vahanTransferOfOwnerShipActivity, "this$0");
        Intent intent = new Intent(vahanTransferOfOwnerShipActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanTransferOfOwnerShipActivity.y1());
        intent.putExtra("RcDetails", vahanTransferOfOwnerShipActivity.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanTransferOfOwnerShipActivity.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanTransferOfOwnerShipActivity.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanTransferOfOwnerShipActivity.l1());
        vahanTransferOfOwnerShipActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void G1(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(vahanTransferOfOwnerShipActivity, "this$0");
        vahanTransferOfOwnerShipActivity.L.set(1, i10);
        vahanTransferOfOwnerShipActivity.L.set(2, i11);
        vahanTransferOfOwnerShipActivity.L.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", vahanTransferOfOwnerShipActivity.L.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", vahanTransferOfOwnerShipActivity.L.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", vahanTransferOfOwnerShipActivity.L.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        vahanTransferOfOwnerShipActivity.Q1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        vahanTransferOfOwnerShipActivity.n1().B.setText(vahanTransferOfOwnerShipActivity.q1().toString());
    }

    /* access modifiers changed from: private */
    public static final void H1(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(vahanTransferOfOwnerShipActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(vahanTransferOfOwnerShipActivity, onDateSetListener, vahanTransferOfOwnerShipActivity.L.get(1), vahanTransferOfOwnerShipActivity.L.get(2), vahanTransferOfOwnerShipActivity.L.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void I1(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity, View view) {
        cm.l.f(vahanTransferOfOwnerShipActivity, "this$0");
        VUtility.Companion.v(vahanTransferOfOwnerShipActivity, vahanTransferOfOwnerShipActivity.r1().b("are_you_sure_you_want_to_leave", vahanTransferOfOwnerShipActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void J1(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity, View view) {
        Intent intent;
        ld.c r12;
        String string;
        String str;
        Toast makeText;
        ld.c r13;
        String str2;
        String string2;
        cm.l.f(vahanTransferOfOwnerShipActivity, "this$0");
        Object selectedItem = vahanTransferOfOwnerShipActivity.n1().f25375p.getSelectedItem();
        cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
        OwnerShipType ownerShipType = (OwnerShipType) selectedItem;
        if (vahanTransferOfOwnerShipActivity.n1().f25379t.getSelectedItemPosition() == 0) {
            r13 = vahanTransferOfOwnerShipActivity.r1();
            string2 = vahanTransferOfOwnerShipActivity.getString(R.string.to_validation_purpose);
            str2 = "to_validation_purpose";
        } else if (vahanTransferOfOwnerShipActivity.n1().f25375p.getSelectedItemPosition() == 0) {
            r13 = vahanTransferOfOwnerShipActivity.r1();
            string2 = vahanTransferOfOwnerShipActivity.getString(R.string.to_validation_ownershipType);
            str2 = "to_validation_ownershipType";
        } else if (vahanTransferOfOwnerShipActivity.n1().f25370k.getSelectedItemPosition() == 0) {
            r13 = vahanTransferOfOwnerShipActivity.r1();
            string2 = vahanTransferOfOwnerShipActivity.getString(R.string.to_validation_newOwnerCat);
            str2 = "to_validation_newOwnerCat";
        } else if (vahanTransferOfOwnerShipActivity.n1().f25372m.getText().length() < 2) {
            r13 = vahanTransferOfOwnerShipActivity.r1();
            string2 = vahanTransferOfOwnerShipActivity.getString(R.string.to_validation_newOwnerName);
            str2 = "to_validation_newOwnerName";
        } else if (vahanTransferOfOwnerShipActivity.n1().f25365f.getText().length() == 0 && p.o(ownerShipType.getCodeDescription(), "INDIVIDUAL", true)) {
            r13 = vahanTransferOfOwnerShipActivity.r1();
            string2 = vahanTransferOfOwnerShipActivity.getString(R.string.please_enter_father_husband_name);
            str2 = "please_enter_father_husband_name";
        } else if (vahanTransferOfOwnerShipActivity.n1().f25385z.getText().length() < 1) {
            r13 = vahanTransferOfOwnerShipActivity.r1();
            string2 = vahanTransferOfOwnerShipActivity.getString(R.string.to_validation_saleAmount);
            str2 = "to_validation_saleAmount";
        } else {
            if (c.d(vahanTransferOfOwnerShipActivity.n1().f25385z.getText().toString().charAt(0), '0', true)) {
                r13 = vahanTransferOfOwnerShipActivity.r1();
                str2 = "please_enter_valid_sale_amount";
            } else if (vahanTransferOfOwnerShipActivity.n1().B.getText().length() < 2) {
                r13 = vahanTransferOfOwnerShipActivity.r1();
                str2 = "to_validation_saleDate";
            } else {
                c.a aVar = t8.c.f16582a;
                if (!aVar.q(vahanTransferOfOwnerShipActivity.n1().f25367h.getText().toString())) {
                    r12 = vahanTransferOfOwnerShipActivity.r1();
                    string = vahanTransferOfOwnerShipActivity.getString(R.string.please_enter_the_valid);
                    str = "label_log_entr_vali_mobno";
                } else if (vahanTransferOfOwnerShipActivity.n1().f25361b.length() <= 0 || aVar.r(vahanTransferOfOwnerShipActivity.n1().f25361b.getText().toString())) {
                    new yh.b(vahanTransferOfOwnerShipActivity).r(vahanTransferOfOwnerShipActivity.n1(), vahanTransferOfOwnerShipActivity.z1().getState_cd(), vahanTransferOfOwnerShipActivity.p1(), vahanTransferOfOwnerShipActivity.A1(), vahanTransferOfOwnerShipActivity.u1(), vahanTransferOfOwnerShipActivity.x1(), vahanTransferOfOwnerShipActivity.v1(), vahanTransferOfOwnerShipActivity.s1());
                    if (vahanTransferOfOwnerShipActivity.N) {
                        intent = new Intent(vahanTransferOfOwnerShipActivity, v.class);
                        intent.putExtra("stateCd", vahanTransferOfOwnerShipActivity.z1().getState_cd());
                        intent.putExtra("off_code", vahanTransferOfOwnerShipActivity.t1());
                        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanTransferOfOwnerShipActivity.N);
                        intent.putExtra("RcDetails", vahanTransferOfOwnerShipActivity.z1());
                        intent.putExtra(VContant.NEXGEN_addahar_name, vahanTransferOfOwnerShipActivity.m1());
                        intent.putExtra(VContant.NEXGEN_addahar_address, vahanTransferOfOwnerShipActivity.l1());
                    } else {
                        intent = new Intent(vahanTransferOfOwnerShipActivity, ah.a.class);
                        intent.putExtra("stateCd", vahanTransferOfOwnerShipActivity.z1().getState_cd());
                        intent.putExtra("off_code", vahanTransferOfOwnerShipActivity.t1());
                        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanTransferOfOwnerShipActivity.N);
                        intent.putExtra("RcDetails", vahanTransferOfOwnerShipActivity.z1());
                        intent.putExtra(VContant.NEXGEN_addahar_name, vahanTransferOfOwnerShipActivity.m1());
                        intent.putExtra(VContant.NEXGEN_addahar_address, vahanTransferOfOwnerShipActivity.l1());
                        intent.putExtra("MobNo", vahanTransferOfOwnerShipActivity.n1().f25367h.getText().toString());
                    }
                    vahanTransferOfOwnerShipActivity.startActivity(intent);
                    return;
                } else {
                    r12 = vahanTransferOfOwnerShipActivity.r1();
                    string = vahanTransferOfOwnerShipActivity.getString(R.string.label_log_entr_valid_email);
                    str = "label_log_entr_valid_email";
                }
                makeText = Toast.makeText(vahanTransferOfOwnerShipActivity, r12.b(str, string), 1);
                makeText.show();
            }
            string2 = vahanTransferOfOwnerShipActivity.getString(R.string.please_enter_valid_sale_amount);
        }
        makeText = Toast.makeText(vahanTransferOfOwnerShipActivity, r13.b(str2, string2), 0);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity, View view) {
        cm.l.f(vahanTransferOfOwnerShipActivity, "this$0");
        vahanTransferOfOwnerShipActivity.n1().f25372m.setText("");
        vahanTransferOfOwnerShipActivity.n1().f25365f.setText("");
        vahanTransferOfOwnerShipActivity.n1().f25385z.setText("");
        vahanTransferOfOwnerShipActivity.n1().f25377r.setText("");
        vahanTransferOfOwnerShipActivity.n1().f25361b.setText("");
        vahanTransferOfOwnerShipActivity.n1().f25367h.setText("");
    }

    public final String A1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("reg_no");
        return null;
    }

    public final TOPurposeService B1() {
        TOPurposeService tOPurposeService = this.K;
        if (tOPurposeService != null) {
            return tOPurposeService;
        }
        cm.l.v("retrofitServicePurposeTO");
        return null;
    }

    public final TOCommonService C1() {
        TOCommonService tOCommonService = this.I;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        cm.l.v("retrofitServiceTO");
        return null;
    }

    public final uh.a D1() {
        uh.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModelPurposeTO");
        return null;
    }

    public final qh.a E1() {
        qh.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModelTO");
        return null;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void N1(ae aeVar) {
        cm.l.f(aeVar, "<set-?>");
        this.G = aeVar;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void R1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.f21435b0 = str;
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.f21434a0 = str;
    }

    public final void W1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.Y = progressDialog;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void Z1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.U = nrvDetails;
    }

    public final void a2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void b2(TOPurposeService tOPurposeService) {
        cm.l.f(tOPurposeService, "<set-?>");
        this.K = tOPurposeService;
    }

    public final void c2(TOCommonService tOCommonService) {
        cm.l.f(tOCommonService, "<set-?>");
        this.I = tOCommonService;
    }

    public final void d2(uh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.J = aVar;
    }

    public final void e2(qh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final String l1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final ae n1() {
        ae aeVar = this.G;
        if (aeVar != null) {
            return aeVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final String o1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("chasis_no");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x01e5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.view.LayoutInflater r6 = r5.getLayoutInflater()
            ni.ae r6 = ni.ae.c(r6)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r6, r0)
            r5.N1(r6)
            ni.ae r6 = r5.n1()
            android.widget.ScrollView r6 = r6.b()
            r5.setContentView((android.view.View) r6)
            v9.e$a r6 = v9.e.f17509a
            ni.ae r0 = r5.n1()
            r6.l2(r5, r0)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService$a r6 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService.f21425a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService r6 = r6.b(r5)
            r5.c2(r6)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService$a r6 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService.f21428a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService r6 = r6.b(r5)
            r5.b2(r6)
            ld.c r6 = new ld.c
            r6.<init>(r5)
            r5.R1(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "off_code"
            java.lang.String r6 = r6.getStringExtra(r0)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.T1(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "aadhaarName"
            java.lang.String r6 = r6.getStringExtra(r0)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.M1(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "aadhaarAddress"
            java.lang.String r6 = r6.getStringExtra(r0)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.L1(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "RC"
            java.lang.String r6 = r6.getStringExtra(r0)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.Y1(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "RcDetails"
            java.io.Serializable r6 = r6.getSerializableExtra(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails"
            cm.l.d(r6, r0)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r6 = (com.nic.mparivahan.VahanServices.VahanModel.NrvDetails) r6
            r5.Z1(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "Face_Less_Staus"
            r1 = 0
            boolean r6 = r6.getBooleanExtra(r0, r1)
            r5.N = r6
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r6 = r5.z1()
            java.lang.String r6 = r6.getRc_chasi_no()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.O1(r6)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r6 = r5.z1()
            java.lang.String r6 = r6.getRc_off_cd()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.U1(r6)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r6 = r5.z1()
            java.lang.String r6 = r6.getRc_regn_no()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.a2(r6)
            java.lang.String r6 = r5.o1()
            java.lang.String r0 = r5.o1()
            int r0 = r0.length()
            int r0 = r0 + -5
            java.lang.String r6 = r6.substring(r0)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            cm.l.e(r6, r0)
            r5.P1(r6)
            ld.c r6 = new ld.c
            r6.<init>(r5)
            r5.R1(r6)
            ni.ae r6 = r5.n1()
            android.widget.TextView r6 = r6.D
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ld.c r2 = r5.r1()
            java.lang.String r3 = "vehicle_no"
            java.lang.String r4 = "Vehicle No.:"
            java.lang.String r2 = r2.b(r3, r4)
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            java.lang.String r2 = r5.y1()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
            ni.ae r6 = r5.n1()
            android.widget.TextView r6 = r6.E
            ld.c r0 = r5.r1()
            java.lang.String r2 = "view_vehicle_details"
            java.lang.String r3 = "View Vehicle Details"
            java.lang.String r0 = r0.b(r2, r3)
            r6.setText(r0)
            ni.ae r6 = r5.n1()
            android.widget.TextView r6 = r6.E
            ni.ae r0 = r5.n1()
            android.widget.TextView r0 = r0.E
            int r0 = r0.getPaintFlags()
            r0 = r0 | 8
            r6.setPaintFlags(r0)
            ni.ae r6 = r5.n1()
            android.widget.TextView r6 = r6.E
            zg.x r0 = new zg.x
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            android.app.ProgressDialog r6 = new android.app.ProgressDialog
            r6.<init>(r5)
            r5.W1(r6)
            android.app.ProgressDialog r6 = r5.w1()
            ld.c r0 = r5.r1()
            r2 = 2132018281(0x7f140469, float:1.9674864E38)
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = "label_challan_please_wait"
            java.lang.String r0 = r0.b(r3, r2)
            r6.setMessage(r0)
            android.app.ProgressDialog r6 = r5.w1()
            r6.setCancelable(r1)
            android.app.ProgressDialog r6 = r5.w1()
            r6.setCanceledOnTouchOutside(r1)
            androidx.lifecycle.u0 r6 = new androidx.lifecycle.u0
            oh.b r0 = new oh.b
            oh.a r1 = new oh.a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService r2 = r5.C1()
            r1.<init>(r2)
            r0.<init>(r1)
            r6.<init>((androidx.lifecycle.x0) r5, (androidx.lifecycle.u0.b) r0)
            java.lang.Class<qh.a> r0 = qh.a.class
            androidx.lifecycle.t0 r6 = r6.a(r0)
            qh.a r6 = (qh.a) r6
            r5.e2(r6)
            androidx.lifecycle.u0 r6 = new androidx.lifecycle.u0
            th.b r0 = new th.b
            sh.a r1 = new sh.a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService r2 = r5.B1()
            r1.<init>(r2)
            r0.<init>(r1)
            r6.<init>((androidx.lifecycle.x0) r5, (androidx.lifecycle.u0.b) r0)
            java.lang.Class<uh.a> r0 = uh.a.class
            androidx.lifecycle.t0 r6 = r6.a(r0)
            uh.a r6 = (uh.a) r6
            r5.d2(r6)
            zg.y r6 = new zg.y
            r6.<init>(r5)
            ni.ae r0 = r5.n1()
            android.widget.TextView r0 = r0.B
            zg.z r1 = new zg.z
            r1.<init>(r5, r6)
            r0.setOnClickListener(r1)
            android.app.ProgressDialog r6 = r5.w1()     // Catch:{ Exception -> 0x01e5 }
            r6.show()     // Catch:{ Exception -> 0x01e5 }
            qh.a r6 = r5.E1()     // Catch:{ Exception -> 0x01e5 }
            r6.g()     // Catch:{ Exception -> 0x01e5 }
        L_0x01e5:
            uh.a r6 = r5.D1()     // Catch:{ Exception -> 0x01f8 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r5.z1()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = r0.getState_cd()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01f8 }
            r6.g(r0)     // Catch:{ Exception -> 0x01f8 }
        L_0x01f8:
            ni.ae r6 = r5.n1()
            ni.dc r6 = r6.f25369j
            android.widget.ImageView r6 = r6.f25959e
            zg.a0 r0 = new zg.a0
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            qh.a r6 = r5.E1()
            androidx.lifecycle.a0 r6 = r6.i()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$a r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$a
            r0.<init>(r5)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$g r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$g
            r1.<init>(r0)
            r6.g(r5, r1)
            qh.a r6 = r5.E1()
            androidx.lifecycle.a0 r6 = r6.h()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$b r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$b
            r0.<init>(r5)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$g r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$g
            r1.<init>(r0)
            r6.g(r5, r1)
            uh.a r6 = r5.D1()
            androidx.lifecycle.a0 r6 = r6.h()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$c r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$c
            r0.<init>(r5)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$g r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$g
            r1.<init>(r0)
            r6.g(r5, r1)
            ni.ae r6 = r5.n1()
            android.widget.Spinner r6 = r6.f25379t
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$d r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$d
            r0.<init>(r5)
            r6.setOnItemSelectedListener(r0)
            ni.ae r6 = r5.n1()
            android.widget.Spinner r6 = r6.f25375p
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$e r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$e
            r0.<init>(r5)
            r6.setOnItemSelectedListener(r0)
            ni.ae r6 = r5.n1()
            android.widget.Spinner r6 = r6.f25370k
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$f r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity$f
            r0.<init>(r5)
            r6.setOnItemSelectedListener(r0)
            ni.ae r6 = r5.n1()
            android.widget.TextView r6 = r6.f25374o
            zg.b0 r0 = new zg.b0
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            ni.ae r6 = r5.n1()
            android.widget.TextView r6 = r6.f25381v
            zg.c0 r0 = new zg.c0
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity.onCreate(android.os.Bundle):void");
    }

    public final String p1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("chasis_no5");
        return null;
    }

    public final String q1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("formated_date");
        return null;
    }

    public final ld.c r1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final String s1() {
        String str = this.f21435b0;
        if (str != null) {
            return str;
        }
        cm.l.v("newOwnerCatagoryGet");
        return null;
    }

    public final String t1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final String u1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("office_code");
        return null;
    }

    public final String v1() {
        String str = this.f21434a0;
        if (str != null) {
            return str;
        }
        cm.l.v("ownershipTypeGet");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.Y;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        cm.l.v("purposeGet");
        return null;
    }

    public final String y1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails z1() {
        NrvDetails nrvDetails = this.U;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }
}
