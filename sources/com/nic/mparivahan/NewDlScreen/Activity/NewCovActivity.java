package com.nic.mparivahan.NewDlScreen.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlApplicationScreen;
import com.nic.mparivahan.NewDlScreen.Modal.CheckCovs;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingClassRequestModal;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.NewDlScreen.Modal.SubmitDlResponseModal;
import com.nic.mparivahan.NewDlScreen.Modal.SubmittedDlDetailsModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.NewDLService;
import ec.t;
import ec.u;
import ec.v;
import ec.w;
import ec.y;
import ec.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import ld.f;
import ni.c2;
import pl.x;
import v9.e;

public final class NewCovActivity extends androidx.appcompat.app.d implements CompoundButton.OnCheckedChangeListener {
    private c2 G;
    /* access modifiers changed from: private */
    public ArrayList H = new ArrayList();
    public ld.c I;
    public f J;
    private ArrayList K = new ArrayList();
    private ArrayList L = new ArrayList();
    public ProgressDialog M;
    private rj.b N;
    private NewDLService O;
    private ArrayList P = new ArrayList();
    private String Q = "Y";
    /* access modifiers changed from: private */
    public String R = "";
    private String S = "";
    private ArrayList T = new ArrayList();
    private SharedPreferences U;

    public static final class a extends n6.b {
        a() {
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewCovActivity f9287e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NewCovActivity newCovActivity) {
            super(1);
            this.f9287e = newCovActivity;
        }

        public final void b(SubmitDlResponseModal submitDlResponseModal) {
            try {
                if (this.f9287e.r1().isShowing()) {
                    this.f9287e.r1().dismiss();
                }
                if (cm.l.a(submitDlResponseModal.getStatusDesc(), "success")) {
                    Toast.makeText(this.f9287e, submitDlResponseModal.getMsg(), 0).show();
                    Intent intent = new Intent(this.f9287e, DlApplicationScreen.class);
                    ArrayList<SubmittedDlDetailsModal> submittedDlDetails = submitDlResponseModal.getSubmittedDlDetails();
                    cm.l.c(submittedDlDetails);
                    intent.putExtra("appNumber", submittedDlDetails.get(0).getApplNo());
                    intent.putExtra("dobValue", submitDlResponseModal.getSubmittedDlDetails().get(0).getDob());
                    intent.putExtra("dlValue", this.f9287e.R);
                    intent.putParcelableArrayListExtra("LLDetails", this.f9287e.H);
                    this.f9287e.startActivity(intent);
                    this.f9287e.finish();
                } else if (p.o(submitDlResponseModal.getStatusDesc(), "failure", true)) {
                    ArrayList<SubmittedDlDetailsModal> submittedDlDetails2 = submitDlResponseModal.getSubmittedDlDetails();
                    cm.l.c(submittedDlDetails2);
                    (com.nic.mparivahan.dlservices.utilities.d.d(submittedDlDetails2.get(0).getIdMarkError()) ? Toast.makeText(this.f9287e, submitDlResponseModal.getSubmittedDlDetails().get(0).getIdMarkError(), 0) : com.nic.mparivahan.dlservices.utilities.d.d(submitDlResponseModal.getSubmittedDlDetails().get(0).getBloodGroupError()) ? Toast.makeText(this.f9287e, submitDlResponseModal.getSubmittedDlDetails().get(0).getBloodGroupError(), 0) : com.nic.mparivahan.dlservices.utilities.d.d(submitDlResponseModal.getSubmittedDlDetails().get(0).getFullNameError()) ? Toast.makeText(this.f9287e, submitDlResponseModal.getSubmittedDlDetails().get(0).getFullNameError(), 0) : com.nic.mparivahan.dlservices.utilities.d.d(submitDlResponseModal.getSubmittedDlDetails().get(0).getMobileNumberError()) ? Toast.makeText(this.f9287e, submitDlResponseModal.getSubmittedDlDetails().get(0).getMobileNumberError(), 0) : Toast.makeText(this.f9287e, submitDlResponseModal.getStatusDesc().toString(), 0)).show();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f9287e.r1().isShowing()) {
                    this.f9287e.r1().dismiss();
                    NewCovActivity newCovActivity = this.f9287e;
                    Toast.makeText(newCovActivity, newCovActivity.q1().b("service_is_not_present", "Something went wrong, Try after some time"), 0).show();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitDlResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewCovActivity f9288e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NewCovActivity newCovActivity) {
            super(1);
            this.f9288e = newCovActivity;
        }

        public final void b(String str) {
            if (this.f9288e.r1().isShowing()) {
                this.f9288e.r1().dismiss();
                NewCovActivity newCovActivity = this.f9288e;
                Toast.makeText(newCovActivity, newCovActivity.q1().b("service_is_not_present", "Something went wrong, Try after some time"), 0).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9289a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f9289a = lVar;
        }

        public final pl.c a() {
            return this.f9289a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9289a.invoke(obj);
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

    private final void A1(ArrayList arrayList) {
        EditText editText;
        String str = "NA";
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getLlFromRTO1().get(0).getRtoName())) {
            c2 c2Var = this.G;
            if (c2Var == null) {
                cm.l.v("binding");
                c2Var = null;
            }
            c2Var.E.setText(((LLDetailsResultModal) arrayList.get(0)).getLlFromRTO1().get(0).getRtoName());
        } else {
            c2 c2Var2 = this.G;
            if (c2Var2 == null) {
                cm.l.v("binding");
                c2Var2 = null;
            }
            c2Var2.E.setText(str);
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getLlFromState1().get(0).getLlFromState1Name())) {
            c2 c2Var3 = this.G;
            if (c2Var3 == null) {
                cm.l.v("binding");
                c2Var3 = null;
            }
            editText = c2Var3.L;
            str = ((LLDetailsResultModal) arrayList.get(0)).getLlFromState1().get(0).getLlFromState1Name();
        } else {
            c2 c2Var4 = this.G;
            if (c2Var4 == null) {
                cm.l.v("binding");
                c2Var4 = null;
            }
            editText = c2Var4.L;
        }
        editText.setText(str);
        if (((LLDetailsResultModal) arrayList.get(0)).getCheckCovs().size() > 0) {
            int size = ((LLDetailsResultModal) arrayList.get(0)).getCheckCovs().size();
            for (int i10 = 0; i10 < size; i10++) {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                CheckBox checkBox = new CheckBox(this);
                checkBox.setOnCheckedChangeListener(this);
                String covCode = ((LLDetailsResultModal) arrayList.get(0)).getCheckCovs().get(i10).getCovCode();
                cm.l.c(covCode);
                checkBox.setId(Integer.parseInt(covCode));
                checkBox.setText(((LLDetailsResultModal) arrayList.get(0)).getCheckCovs().get(i10).getCovAbbrDesc());
                linearLayout.addView(checkBox);
                c2 c2Var5 = this.G;
                if (c2Var5 == null) {
                    cm.l.v("binding");
                    c2Var5 = null;
                }
                c2Var5.G.addView(linearLayout);
            }
        }
    }

    private final void E1() {
        c2 c2Var = this.G;
        if (c2Var == null) {
            cm.l.v("binding");
            c2Var = null;
        }
        c2Var.H.removeAllViews();
        this.T = new ArrayList();
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = this.T;
            String covAbbrDesc = ((CheckCovs) this.K.get(i10)).getCovAbbrDesc();
            cm.l.c(covAbbrDesc);
            arrayList.add(covAbbrDesc);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            String covCode = ((CheckCovs) this.K.get(i10)).getCovCode();
            cm.l.c(covCode);
            textView.setId(Integer.parseInt(covCode));
            textView.setText(((CheckCovs) this.K.get(i10)).getCovAbbrDesc());
            linearLayout.addView(textView);
            c2 c2Var2 = this.G;
            if (c2Var2 == null) {
                cm.l.v("binding");
                c2Var2 = null;
            }
            c2Var2.H.addView(linearLayout);
        }
    }

    private final void F1() {
        try {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_show_vehicle_info);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View findViewById = dialog.findViewById(R.id.closeIv);
            cm.l.e(findViewById, "findViewById(...)");
            View findViewById2 = dialog.findViewById(R.id.txtVehicleExplanation);
            cm.l.e(findViewById2, "findViewById(...)");
            ((TextView) findViewById2).setText(q1().b("ll_info_explanation", getString(R.string.vehicle_explaination)));
            View findViewById3 = dialog.findViewById(R.id.txtVehicleExplanation1);
            cm.l.e(findViewById3, "findViewById(...)");
            ((TextView) findViewById3).setText(q1().b("ll_info_non_transport", getString(R.string.non_transport_explaination)));
            View findViewById4 = dialog.findViewById(R.id.txtVehicleExplanation2);
            cm.l.e(findViewById4, "findViewById(...)");
            ((TextView) findViewById4).setText(q1().b("ll_info_transport", getString(R.string.transport_explaination)));
            View findViewById5 = dialog.findViewById(R.id.txtVehicleExplanation3);
            cm.l.e(findViewById5, "findViewById(...)");
            ((TextView) findViewById5).setText(q1().b("ll_info_light_motor", getString(R.string.light_vehicle_explaination)));
            View findViewById6 = dialog.findViewById(R.id.txtVehicleExplanation4);
            cm.l.e(findViewById6, "findViewById(...)");
            ((TextView) findViewById6).setText(q1().b("ll_info_medium_motor", getString(R.string.medium_vehicle_explaination)));
            View findViewById7 = dialog.findViewById(R.id.txtVehicleExplanation5);
            cm.l.e(findViewById7, "findViewById(...)");
            ((TextView) findViewById7).setText(q1().b("ll_info_heavy_motor", getString(R.string.heavy_vehicle_explaination)));
            ((ImageView) findViewById).setOnClickListener(new z(dialog));
            dialog.show();
            Window window = dialog.getWindow();
            cm.l.c(window);
            window.setLayout(-1, -2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void o1() {
        rj.b bVar;
        try {
            r1().show();
            SharedPreferences sharedPreferences = this.U;
            if (sharedPreferences == null) {
                cm.l.v("pref");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("addedDSchoolDetails", (String) null);
            if (com.nic.mparivahan.dlservices.utilities.d.d(string)) {
                Type b10 = new a().b();
                cm.l.e(b10, "getType(...)");
                Object k10 = new i7.d().k(string, b10);
                cm.l.e(k10, "fromJson(...)");
                this.P = (ArrayList) k10;
            }
            String d02 = y.d0(this.T, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
            ArrayList arrayList = new ArrayList();
            int size = this.P.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new DrivingClassRequestModal(((DrivingSchoolDetRequestModal) this.P.get(i10)).getEnrollDate(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getCovcd(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getTrainTo(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getCertDate(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getCertNo(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getEnrollNo(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getDschoolCode(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getTrainFrom()));
            }
            rj.b bVar2 = this.N;
            if (bVar2 == null) {
                cm.l.v("viewModal");
                bVar = null;
            } else {
                bVar = bVar2;
            }
            String str = this.R;
            String str2 = this.S;
            String rtoCode = ((LLDetailsResultModal) this.H.get(0)).getLlFromRTO1().get(0).getRtoCode();
            String llFromState1Code = ((LLDetailsResultModal) this.H.get(0)).getLlFromState1().get(0).getLlFromState1Code();
            String fname = ((LLDetailsResultModal) this.H.get(0)).getFname();
            String mname = ((LLDetailsResultModal) this.H.get(0)).getMname();
            String lname = ((LLDetailsResultModal) this.H.get(0)).getLname();
            String relationCode = ((LLDetailsResultModal) this.H.get(0)).getRelationType().get(0).getRelationCode();
            String swdfName = ((LLDetailsResultModal) this.H.get(0)).getSwdfName();
            String swdmName = ((LLDetailsResultModal) this.H.get(0)).getSwdmName();
            String swdlName = ((LLDetailsResultModal) this.H.get(0)).getSwdlName();
            String aadhaarNumber = ((LLDetailsResultModal) this.H.get(0)).getAadhaarNumber();
            String newFullName = ((LLDetailsResultModal) this.H.get(0)).getNewFullName();
            String valueOf = String.valueOf(((LLDetailsResultModal) this.H.get(0)).getGender().get(0).getGenderCode());
            String dateOfBirth = ((LLDetailsResultModal) this.H.get(0)).getDateOfBirth();
            String placeOfBirth = ((LLDetailsResultModal) this.H.get(0)).getPlaceOfBirth();
            String countryOfBirthCode = ((LLDetailsResultModal) this.H.get(0)).getCountryOfBirth().get(0).getCountryOfBirthCode();
            String qualCode = ((LLDetailsResultModal) this.H.get(0)).getEduQual().get(0).getQualCode();
            String bloodGroupCode = ((LLDetailsResultModal) this.H.get(0)).getBloodGroup().get(0).getBloodGroupCode();
            String email = ((LLDetailsResultModal) this.H.get(0)).getEmail();
            String mobileNumber = ((LLDetailsResultModal) this.H.get(0)).getMobileNumber();
            String alternatemobileNumber = ((LLDetailsResultModal) this.H.get(0)).getAlternatemobileNumber();
            String idMarks1 = ((LLDetailsResultModal) this.H.get(0)).getIdMarks1();
            String idMarks2 = ((LLDetailsResultModal) this.H.get(0)).getIdMarks2();
            String llFromState1Code2 = ((LLDetailsResultModal) this.H.get(0)).getLlFromState1().get(0).getLlFromState1Code();
            String rtoCode2 = ((LLDetailsResultModal) this.H.get(0)).getLlFromRTO1().get(0).getRtoCode();
            String presStateCode = ((LLDetailsResultModal) this.H.get(0)).getPresState().get(0).getPresStateCode();
            String presDistCode = ((LLDetailsResultModal) this.H.get(0)).getPresDistrict().get(0).getPresDistCode();
            String presSubDistCode = ((LLDetailsResultModal) this.H.get(0)).getPresSubDistrict().get(0).getPresSubDistCode();
            String presPinCode = ((LLDetailsResultModal) this.H.get(0)).getPresPinCode();
            String presHouseNo = ((LLDetailsResultModal) this.H.get(0)).getPresHouseNo();
            String presVillageOrTown = ((LLDetailsResultModal) this.H.get(0)).getPresVillageOrTown();
            String presStreet = ((LLDetailsResultModal) this.H.get(0)).getPresStreet();
            String presVillCode = ((LLDetailsResultModal) this.H.get(0)).getPresCity().get(0).getPresVillCode();
            String presLocation = ((LLDetailsResultModal) this.H.get(0)).getPresLocation();
            String presSameAsPerm = ((LLDetailsResultModal) this.H.get(0)).getPresSameAsPerm();
            String permStateCode = ((LLDetailsResultModal) this.H.get(0)).getPermState().get(0).getPermStateCode();
            String permDistCode = ((LLDetailsResultModal) this.H.get(0)).getPermDistrict().get(0).getPermDistCode();
            String permSubDistCode = ((LLDetailsResultModal) this.H.get(0)).getPermSubDistrict().get(0).getPermSubDistCode();
            String permPinCode = ((LLDetailsResultModal) this.H.get(0)).getPermPinCode();
            String permHouseNo = ((LLDetailsResultModal) this.H.get(0)).getPermHouseNo();
            String permVillageOrTown = ((LLDetailsResultModal) this.H.get(0)).getPermVillageOrTown();
            String permStreet = ((LLDetailsResultModal) this.H.get(0)).getPermStreet();
            String permVillCode = ((LLDetailsResultModal) this.H.get(0)).getPermCity().get(0).getPermVillCode();
            String permLocation = ((LLDetailsResultModal) this.H.get(0)).getPermLocation();
            String presStayMonths = ((LLDetailsResultModal) this.H.get(0)).getPresStayMonths();
            String presStayYears = ((LLDetailsResultModal) this.H.get(0)).getPresStayYears();
            String age = ((LLDetailsResultModal) this.H.get(0)).getAge();
            Boolean onlyEditAddressLL = ((LLDetailsResultModal) this.H.get(0)).getOnlyEditAddressLL();
            cm.l.c(onlyEditAddressLL);
            boolean booleanValue = onlyEditAddressLL.booleanValue();
            Boolean editAddressLL = ((LLDetailsResultModal) this.H.get(0)).getEditAddressLL();
            cm.l.c(editAddressLL);
            bVar.p(str, str2, rtoCode, llFromState1Code, "", "", "0", fname, mname, lname, relationCode, swdfName, swdmName, swdlName, aadhaarNumber, newFullName, valueOf, dateOfBirth, "", placeOfBirth, countryOfBirthCode, qualCode, bloodGroupCode, email, mobileNumber, alternatemobileNumber, idMarks1, idMarks2, llFromState1Code2, rtoCode2, presStateCode, presDistCode, presSubDistCode, presPinCode, presHouseNo, presVillageOrTown, presStreet, presVillCode, presLocation, presSameAsPerm, permStateCode, permDistCode, permSubDistCode, permPinCode, permHouseNo, permVillageOrTown, permStreet, permVillCode, permLocation, presStayMonths, presStayYears, age, booleanValue, editAddressLL.booleanValue(), d02, arrayList);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void p1() {
        if (getIntent().hasExtra("LLDetails")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
            cm.l.c(parcelableArrayListExtra);
            this.H = parcelableArrayListExtra;
        }
        if (getIntent().hasExtra("llNo")) {
            String stringExtra = getIntent().getStringExtra("llNo");
            cm.l.c(stringExtra);
            this.R = stringExtra;
        }
        if (getIntent().hasExtra("dob")) {
            String stringExtra2 = getIntent().getStringExtra("dob");
            cm.l.c(stringExtra2);
            this.S = stringExtra2;
        }
        if (this.H.size() > 0) {
            A1(this.H);
        }
    }

    private final void t1() {
        D1(new f(this));
        B1(new ld.c(this));
        C1(new ProgressDialog(this));
        r1().setMessage(q1().b("label_challan_please_wait", getString(R.string.please_wait)));
        r1().setCancelable(true);
        r1().setCanceledOnTouchOutside(true);
        c2 c2Var = this.G;
        c2 c2Var2 = null;
        if (c2Var == null) {
            cm.l.v("binding");
            c2Var = null;
        }
        c2Var.B.f28452f.setText(s1().i());
        this.O = NewDLService.f22140a.a(this);
        NewDLService newDLService = this.O;
        if (newDLService == null) {
            cm.l.v("service");
            newDLService = null;
        }
        this.N = (rj.b) new u0((x0) this, (u0.b) new sj.a(new rj.a(newDLService))).a(rj.b.class);
        c2 c2Var3 = this.G;
        if (c2Var3 == null) {
            cm.l.v("binding");
            c2Var3 = null;
        }
        c2Var3.f25599y.setOnClickListener(new t(this));
        c2 c2Var4 = this.G;
        if (c2Var4 == null) {
            cm.l.v("binding");
            c2Var4 = null;
        }
        c2Var4.P.setOnCheckedChangeListener(new u(this));
        c2 c2Var5 = this.G;
        if (c2Var5 == null) {
            cm.l.v("binding");
            c2Var5 = null;
        }
        c2Var5.A.setOnClickListener(new v(this));
        c2 c2Var6 = this.G;
        if (c2Var6 == null) {
            cm.l.v("binding");
            c2Var6 = null;
        }
        c2Var6.B.f28448b.setOnClickListener(new w(this));
        c2 c2Var7 = this.G;
        if (c2Var7 == null) {
            cm.l.v("binding");
            c2Var7 = null;
        }
        c2Var7.f25600z.setOnClickListener(new ec.x(this));
        c2 c2Var8 = this.G;
        if (c2Var8 == null) {
            cm.l.v("binding");
        } else {
            c2Var2 = c2Var8;
        }
        c2Var2.C.setOnClickListener(new y(this));
    }

    /* access modifiers changed from: private */
    public static final void u1(NewCovActivity newCovActivity, View view) {
        cm.l.f(newCovActivity, "this$0");
        Intent intent = new Intent(newCovActivity, AddDrivingSchoolActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", newCovActivity.H);
        intent.putParcelableArrayListExtra("addedCov", newCovActivity.P);
        newCovActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void v1(NewCovActivity newCovActivity, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(newCovActivity, "this$0");
        View findViewById = newCovActivity.findViewById(i10);
        cm.l.e(findViewById, "findViewById(...)");
        RadioButton radioButton = (RadioButton) findViewById;
        if (radioButton.getId() == R.id.willingToDonate) {
            str = "Y";
        } else if (radioButton.getId() == R.id.not_willing_to_donate) {
            str = "N";
        } else {
            return;
        }
        newCovActivity.Q = str;
    }

    /* access modifiers changed from: private */
    public static final void w1(NewCovActivity newCovActivity, View view) {
        cm.l.f(newCovActivity, "this$0");
        newCovActivity.F1();
    }

    /* access modifiers changed from: private */
    public static final void x1(NewCovActivity newCovActivity, View view) {
        cm.l.f(newCovActivity, "this$0");
        newCovActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void y1(NewCovActivity newCovActivity, View view) {
        cm.l.f(newCovActivity, "this$0");
        newCovActivity.startActivity(new Intent(newCovActivity, LLNoCheckActivity.class));
        newCovActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void z1(NewCovActivity newCovActivity, View view) {
        ld.c q12;
        String string;
        String str;
        cm.l.f(newCovActivity, "this$0");
        if (newCovActivity.K.size() == 0) {
            q12 = newCovActivity.q1();
            string = newCovActivity.getString(R.string.please_select_vehicle_class);
            str = "select_one_vehicle_class";
        } else {
            c2 c2Var = newCovActivity.G;
            if (c2Var == null) {
                cm.l.v("binding");
                c2Var = null;
            }
            if (!c2Var.J.isChecked()) {
                q12 = newCovActivity.q1();
                string = newCovActivity.getString(R.string.pls_enter_term_conditions);
                str = "plz_accept_term_conditions";
            } else {
                newCovActivity.o1();
                return;
            }
        }
        Toast.makeText(newCovActivity, q12.b(str, string), 0).show();
    }

    public final void B1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.I = cVar;
    }

    public final void C1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final void D1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.J = fVar;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ArrayList arrayList = this.L;
        cm.l.c(compoundButton);
        if (arrayList.contains(Integer.valueOf(compoundButton.getId()))) {
            this.L.remove(Integer.valueOf(compoundButton.getId()));
            this.K.remove(new CheckCovs(String.valueOf(compoundButton.getId()), compoundButton.getText().toString()));
        } else {
            this.L.add(Integer.valueOf(compoundButton.getId()));
            this.K.add(new CheckCovs(String.valueOf(compoundButton.getId()), compoundButton.getText().toString()));
        }
        c2 c2Var = null;
        if (this.K.size() > 0) {
            c2 c2Var2 = this.G;
            if (c2Var2 == null) {
                cm.l.v("binding");
                c2Var2 = null;
            }
            c2Var2.I.setVisibility(0);
            c2 c2Var3 = this.G;
            if (c2Var3 == null) {
                cm.l.v("binding");
            } else {
                c2Var = c2Var3;
            }
            c2Var.H.setVisibility(0);
            E1();
            return;
        }
        c2 c2Var4 = this.G;
        if (c2Var4 == null) {
            cm.l.v("binding");
            c2Var4 = null;
        }
        c2Var4.H.setVisibility(8);
        c2 c2Var5 = this.G;
        if (c2Var5 == null) {
            cm.l.v("binding");
        } else {
            c2Var = c2Var5;
        }
        c2Var.I.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c2 x10 = c2.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        rj.b bVar = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = e.f17509a;
        c2 c2Var = this.G;
        if (c2Var == null) {
            cm.l.v("binding");
            c2Var = null;
        }
        aVar.r0(this, c2Var);
        SharedPreferences sharedPreferences = getSharedPreferences("AddVehicleClass", 0);
        cm.l.e(sharedPreferences, "getSharedPreferences(...)");
        this.U = sharedPreferences;
        p1();
        t1();
        rj.b bVar2 = this.N;
        if (bVar2 == null) {
            cm.l.v("viewModal");
            bVar2 = null;
        }
        bVar2.n().g(this, new d(new b(this)));
        rj.b bVar3 = this.N;
        if (bVar3 == null) {
            cm.l.v("viewModal");
        } else {
            bVar = bVar3;
        }
        bVar.m().g(this, new d(new c(this)));
    }

    public final ld.c q1() {
        ld.c cVar = this.I;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final f s1() {
        f fVar = this.J;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }
}
