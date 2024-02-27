package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryMasterResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.EducationQualResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.QualificationMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import java.util.ArrayList;
import java.util.Calendar;
import ni.l4;
import pl.x;
import ub.y;
import ub.z;
import v9.e;

public final class PersonalDetailsEditScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public l4 G;
    private ArrayList H = new ArrayList();
    private ArrayList I = new ArrayList();
    private ArrayList J = new ArrayList();
    private ArrayList K = new ArrayList();
    /* access modifiers changed from: private */
    public ArrayList L = new ArrayList();
    /* access modifiers changed from: private */
    public String M = "";
    private String N = "";
    private Calendar O = Calendar.getInstance();
    private xj.b P;
    private NewLLServices Q;
    /* access modifiers changed from: private */
    public ArrayList R = new ArrayList();
    /* access modifiers changed from: private */
    public String S = "";
    /* access modifiers changed from: private */
    public ArrayList T = new ArrayList();
    /* access modifiers changed from: private */
    public String U = "";
    /* access modifiers changed from: private */
    public ArrayList V = new ArrayList();
    /* access modifiers changed from: private */
    public String W = "";
    /* access modifiers changed from: private */
    public ProgressDialog X;
    private ld.c Y;
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f9194a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f9195b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private boolean f9196c0;

    /* renamed from: d0  reason: collision with root package name */
    private String f9197d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f9198e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f9199f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f9200g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f9201h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f9202i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f9203j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private boolean f9204k0;

    /* renamed from: l0  reason: collision with root package name */
    private String f9205l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f9206m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f9207n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private ld.f f9208o0;

    /* renamed from: p0  reason: collision with root package name */
    private ArrayList f9209p0 = new ArrayList();

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9210e;

        a(PersonalDetailsEditScreen personalDetailsEditScreen) {
            this.f9210e = personalDetailsEditScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            PersonalDetailsEditScreen personalDetailsEditScreen = this.f9210e;
            personalDetailsEditScreen.M = ((Relationship) personalDetailsEditScreen.L.get(i10)).getRelationCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9211e;

        b(PersonalDetailsEditScreen personalDetailsEditScreen) {
            this.f9211e = personalDetailsEditScreen;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
            if (r3 == null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
            if (r3 == null) goto L_0x0063;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                cm.l.c(r3)
                int r4 = r3.length()
                if (r4 <= 0) goto L_0x00b0
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen r4 = r2.f9211e
                ni.l4 r4 = r4.G
                r5 = 0
                java.lang.String r6 = "binding"
                if (r4 != 0) goto L_0x0018
                cm.l.v(r6)
                r4 = r5
            L_0x0018:
                androidx.appcompat.widget.AppCompatEditText r4 = r4.F
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                int r4 = r4.length()
                r0 = 32
                if (r4 <= 0) goto L_0x0079
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen r4 = r2.f9211e
                ni.l4 r4 = r4.G
                if (r4 != 0) goto L_0x0036
                cm.l.v(r6)
                r4 = r5
            L_0x0036:
                android.widget.EditText r4 = r4.f27254f0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen r3 = r2.f9211e
                ni.l4 r3 = r3.G
                if (r3 != 0) goto L_0x004f
                cm.l.v(r6)
                r3 = r5
            L_0x004f:
                androidx.appcompat.widget.AppCompatEditText r3 = r3.F
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen r3 = r2.f9211e
                ni.l4 r3 = r3.G
                if (r3 != 0) goto L_0x0067
            L_0x0063:
                cm.l.v(r6)
                goto L_0x0068
            L_0x0067:
                r5 = r3
            L_0x0068:
                android.widget.EditText r3 = r5.C
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r4.setText(r3)
                goto L_0x00b0
            L_0x0079:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen r4 = r2.f9211e
                ni.l4 r4 = r4.G
                if (r4 != 0) goto L_0x0085
                cm.l.v(r6)
                r4 = r5
            L_0x0085:
                android.widget.EditText r4 = r4.f27254f0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen r3 = r2.f9211e
                ni.l4 r3 = r3.G
                if (r3 != 0) goto L_0x009e
                cm.l.v(r6)
                r3 = r5
            L_0x009e:
                androidx.appcompat.widget.AppCompatEditText r3 = r3.F
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen r3 = r2.f9211e
                ni.l4 r3 = r3.G
                if (r3 != 0) goto L_0x0067
                goto L_0x0063
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen.b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9212e;

        c(PersonalDetailsEditScreen personalDetailsEditScreen) {
            this.f9212e = personalDetailsEditScreen;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (String.valueOf(charSequence).length() > 0) {
                l4 i13 = this.f9212e.G;
                l4 l4Var = null;
                if (i13 == null) {
                    cm.l.v("binding");
                    i13 = null;
                }
                EditText editText = i13.f27254f0;
                StringBuilder sb2 = new StringBuilder();
                l4 i14 = this.f9212e.G;
                if (i14 == null) {
                    cm.l.v("binding");
                    i14 = null;
                }
                sb2.append(i14.f27267y.getText());
                sb2.append(' ');
                sb2.append(charSequence);
                sb2.append(' ');
                l4 i15 = this.f9212e.G;
                if (i15 == null) {
                    cm.l.v("binding");
                } else {
                    l4Var = i15;
                }
                sb2.append(l4Var.C.getText());
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9213e;

        d(PersonalDetailsEditScreen personalDetailsEditScreen) {
            this.f9213e = personalDetailsEditScreen;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditText editText;
            StringBuilder sb2;
            if (String.valueOf(charSequence).length() > 0) {
                l4 i13 = this.f9213e.G;
                l4 l4Var = null;
                if (i13 == null) {
                    cm.l.v("binding");
                    i13 = null;
                }
                if (String.valueOf(i13.F.getText()).length() > 0) {
                    l4 i14 = this.f9213e.G;
                    if (i14 == null) {
                        cm.l.v("binding");
                        i14 = null;
                    }
                    editText = i14.f27254f0;
                    sb2 = new StringBuilder();
                    l4 i15 = this.f9213e.G;
                    if (i15 == null) {
                        cm.l.v("binding");
                        i15 = null;
                    }
                    sb2.append(i15.f27267y.getText());
                    sb2.append(' ');
                    l4 i16 = this.f9213e.G;
                    if (i16 == null) {
                        cm.l.v("binding");
                    } else {
                        l4Var = i16;
                    }
                    sb2.append(l4Var.F.getText());
                    sb2.append(' ');
                } else {
                    l4 i17 = this.f9213e.G;
                    if (i17 == null) {
                        cm.l.v("binding");
                        i17 = null;
                    }
                    editText = i17.f27254f0;
                    sb2 = new StringBuilder();
                    l4 i18 = this.f9213e.G;
                    if (i18 == null) {
                        cm.l.v("binding");
                        i18 = null;
                    }
                    sb2.append(i18.f27267y.getText());
                    sb2.append(' ');
                    l4 i19 = this.f9213e.G;
                    if (i19 == null) {
                        cm.l.v("binding");
                    } else {
                        l4Var = i19;
                    }
                    sb2.append(l4Var.F.getText());
                }
                sb2.append(charSequence);
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9214e;

        e(PersonalDetailsEditScreen personalDetailsEditScreen) {
            this.f9214e = personalDetailsEditScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            PersonalDetailsEditScreen personalDetailsEditScreen = this.f9214e;
            personalDetailsEditScreen.S = ((CountryMasterResponseModal) personalDetailsEditScreen.R.get(i10)).getCountryCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9215e;

        f(PersonalDetailsEditScreen personalDetailsEditScreen) {
            this.f9215e = personalDetailsEditScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            PersonalDetailsEditScreen personalDetailsEditScreen = this.f9215e;
            personalDetailsEditScreen.U = ((QualificationMasterDataModal) personalDetailsEditScreen.T.get(i10)).getQualificationCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9216e;

        g(PersonalDetailsEditScreen personalDetailsEditScreen) {
            this.f9216e = personalDetailsEditScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            PersonalDetailsEditScreen personalDetailsEditScreen = this.f9216e;
            personalDetailsEditScreen.W = ((BloodGroupMasterDataModal) personalDetailsEditScreen.V.get(i10)).getBloodGroupCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9217e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PersonalDetailsEditScreen personalDetailsEditScreen) {
            super(1);
            this.f9217e = personalDetailsEditScreen;
        }

        public final void b(CountryResponseModal countryResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog l12 = this.f9217e.X;
                if (l12 == null) {
                    cm.l.v("dialog");
                    l12 = null;
                }
                if (l12.isShowing()) {
                    ProgressDialog l13 = this.f9217e.X;
                    if (l13 == null) {
                        cm.l.v("dialog");
                        l13 = null;
                    }
                    l13.dismiss();
                }
                if (p.o(countryResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsEditScreen personalDetailsEditScreen = this.f9217e;
                    ArrayList<CountryMasterResponseModal> drivingSchoolMasterList = countryResponseModal.getDrivingSchoolMasterList();
                    cm.l.c(drivingSchoolMasterList);
                    personalDetailsEditScreen.R = drivingSchoolMasterList;
                    if (this.f9217e.R.size() > 0) {
                        this.f9217e.J1();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog l14 = this.f9217e.X;
                if (l14 == null) {
                    cm.l.v("dialog");
                    l14 = null;
                }
                if (l14.isShowing()) {
                    ProgressDialog l15 = this.f9217e.X;
                    if (l15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = l15;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CountryResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9218e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PersonalDetailsEditScreen personalDetailsEditScreen) {
            super(1);
            this.f9218e = personalDetailsEditScreen;
        }

        public final void b(EducationQualResponseModal educationQualResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog l12 = this.f9218e.X;
                if (l12 == null) {
                    cm.l.v("dialog");
                    l12 = null;
                }
                if (l12.isShowing()) {
                    ProgressDialog l13 = this.f9218e.X;
                    if (l13 == null) {
                        cm.l.v("dialog");
                        l13 = null;
                    }
                    l13.dismiss();
                }
                if (p.o(educationQualResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsEditScreen personalDetailsEditScreen = this.f9218e;
                    ArrayList<QualificationMasterDataModal> qualificationMasterData = educationQualResponseModal.getQualificationMasterData();
                    cm.l.c(qualificationMasterData);
                    personalDetailsEditScreen.T = qualificationMasterData;
                    if (this.f9218e.T.size() > 0) {
                        this.f9218e.K1();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog l14 = this.f9218e.X;
                if (l14 == null) {
                    cm.l.v("dialog");
                    l14 = null;
                }
                if (l14.isShowing()) {
                    ProgressDialog l15 = this.f9218e.X;
                    if (l15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = l15;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((EducationQualResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PersonalDetailsEditScreen personalDetailsEditScreen) {
            super(1);
            this.f9219e = personalDetailsEditScreen;
        }

        public final void b(BloodGroupResponseModal bloodGroupResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog l12 = this.f9219e.X;
                if (l12 == null) {
                    cm.l.v("dialog");
                    l12 = null;
                }
                if (l12.isShowing()) {
                    ProgressDialog l13 = this.f9219e.X;
                    if (l13 == null) {
                        cm.l.v("dialog");
                        l13 = null;
                    }
                    l13.dismiss();
                }
                if (p.o(bloodGroupResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsEditScreen personalDetailsEditScreen = this.f9219e;
                    ArrayList<BloodGroupMasterDataModal> bloodGroupMasterData = bloodGroupResponseModal.getBloodGroupMasterData();
                    cm.l.c(bloodGroupMasterData);
                    personalDetailsEditScreen.V = bloodGroupMasterData;
                    if (this.f9219e.V.size() > 0) {
                        this.f9219e.I1();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog l14 = this.f9219e.X;
                if (l14 == null) {
                    cm.l.v("dialog");
                    l14 = null;
                }
                if (l14.isShowing()) {
                    ProgressDialog l15 = this.f9219e.X;
                    if (l15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = l15;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((BloodGroupResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class k extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsEditScreen f9220e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(PersonalDetailsEditScreen personalDetailsEditScreen) {
            super(1);
            this.f9220e = personalDetailsEditScreen;
        }

        public final void b(String str) {
            ProgressDialog l12 = this.f9220e.X;
            ProgressDialog progressDialog = null;
            if (l12 == null) {
                cm.l.v("dialog");
                l12 = null;
            }
            if (l12.isShowing()) {
                ProgressDialog l13 = this.f9220e.X;
                if (l13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = l13;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class l implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9221a;

        l(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f9221a = lVar;
        }

        public final pl.c a() {
            return this.f9221a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9221a.invoke(obj);
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

    private final void A1() {
        try {
            ProgressDialog progressDialog = this.X;
            xj.b bVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            xj.b bVar2 = this.P;
            if (bVar2 == null) {
                cm.l.v("learnerLicenceVM");
            } else {
                bVar = bVar2;
            }
            bVar.m();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void B1() {
        try {
            ProgressDialog progressDialog = this.X;
            xj.b bVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            xj.b bVar2 = this.P;
            if (bVar2 == null) {
                cm.l.v("learnerLicenceVM");
            } else {
                bVar = bVar2;
            }
            bVar.t();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void C1() {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("personalDetails");
        cm.l.c(parcelableArrayListExtra);
        this.H = parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("addressDetails");
        cm.l.c(parcelableArrayListExtra2);
        this.I = parcelableArrayListExtra2;
        ArrayList parcelableArrayListExtra3 = getIntent().getParcelableArrayListExtra("covDetails");
        cm.l.c(parcelableArrayListExtra3);
        this.J = parcelableArrayListExtra3;
        ArrayList parcelableArrayListExtra4 = getIntent().getParcelableArrayListExtra("selectedCovDetails");
        cm.l.c(parcelableArrayListExtra4);
        this.K = parcelableArrayListExtra4;
        this.f9196c0 = getIntent().getBooleanExtra("willingToDonate", false);
        String stringExtra = getIntent().getStringExtra("licenseFromState");
        cm.l.c(stringExtra);
        this.f9197d0 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("licenceFromRTO");
        cm.l.c(stringExtra2);
        this.f9198e0 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("jurisdiction");
        cm.l.c(stringExtra3);
        this.f9199f0 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("licenceFromRTOCode");
        cm.l.c(stringExtra4);
        this.f9200g0 = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicationNo");
        cm.l.c(stringExtra5);
        this.f9201h0 = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("reference");
        cm.l.c(stringExtra6);
        this.f9202i0 = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("applDate");
        cm.l.c(stringExtra7);
        this.f9203j0 = stringExtra7;
        this.f9204k0 = getIntent().getBooleanExtra("allowNewAddr", false);
        String stringExtra8 = getIntent().getStringExtra("applCatg");
        cm.l.c(stringExtra8);
        this.f9205l0 = stringExtra8;
        if (getIntent().hasExtra("bioId")) {
            String stringExtra9 = getIntent().getStringExtra("bioId");
            cm.l.c(stringExtra9);
            this.f9206m0 = stringExtra9;
        }
        if (getIntent().hasExtra("allClassOfVehicles")) {
            String stringExtra10 = getIntent().getStringExtra("allClassOfVehicles");
            cm.l.c(stringExtra10);
            this.f9207n0 = stringExtra10;
        }
        if (getIntent().hasExtra("llRefDetails")) {
            ArrayList parcelableArrayListExtra5 = getIntent().getParcelableArrayListExtra("llRefDetails");
            cm.l.c(parcelableArrayListExtra5);
            this.f9209p0 = parcelableArrayListExtra5;
        }
        if (this.H.size() > 0) {
            H1(this.H);
        }
    }

    private final void D1() {
        this.f9208o0 = new ld.f(this);
        l4 l4Var = this.G;
        l4 l4Var2 = null;
        if (l4Var == null) {
            cm.l.v("binding");
            l4Var = null;
        }
        TextView textView = l4Var.E.f28452f;
        ld.f fVar = this.f9208o0;
        if (fVar == null) {
            cm.l.v("sarthiSession");
            fVar = null;
        }
        textView.setText(fVar.i());
        l4 l4Var3 = this.G;
        if (l4Var3 == null) {
            cm.l.v("binding");
            l4Var3 = null;
        }
        l4Var3.E.f28448b.setOnClickListener(new ub.x(this));
        l4 l4Var4 = this.G;
        if (l4Var4 == null) {
            cm.l.v("binding");
            l4Var4 = null;
        }
        l4Var4.K.setEnabled(false);
        l4 l4Var5 = this.G;
        if (l4Var5 == null) {
            cm.l.v("binding");
            l4Var5 = null;
        }
        l4Var5.I.setEnabled(false);
        l4 l4Var6 = this.G;
        if (l4Var6 == null) {
            cm.l.v("binding");
            l4Var6 = null;
        }
        l4Var6.L.setEnabled(false);
        l4 l4Var7 = this.G;
        if (l4Var7 == null) {
            cm.l.v("binding");
            l4Var7 = null;
        }
        l4Var7.U.setFocusable(false);
        l4 l4Var8 = this.G;
        if (l4Var8 == null) {
            cm.l.v("binding");
            l4Var8 = null;
        }
        l4Var8.M.setOnItemSelectedListener(new a(this));
        l4 l4Var9 = this.G;
        if (l4Var9 == null) {
            cm.l.v("binding");
            l4Var9 = null;
        }
        l4Var9.f27267y.addTextChangedListener(new b(this));
        l4 l4Var10 = this.G;
        if (l4Var10 == null) {
            cm.l.v("binding");
            l4Var10 = null;
        }
        l4Var10.F.addTextChangedListener(new c(this));
        l4 l4Var11 = this.G;
        if (l4Var11 == null) {
            cm.l.v("binding");
            l4Var11 = null;
        }
        l4Var11.C.addTextChangedListener(new d(this));
        l4 l4Var12 = this.G;
        if (l4Var12 == null) {
            cm.l.v("binding");
            l4Var12 = null;
        }
        l4Var12.J.setOnCheckedChangeListener(new y(this));
        l4 l4Var13 = this.G;
        if (l4Var13 == null) {
            cm.l.v("binding");
            l4Var13 = null;
        }
        l4Var13.O.setOnItemSelectedListener(new e(this));
        l4 l4Var14 = this.G;
        if (l4Var14 == null) {
            cm.l.v("binding");
            l4Var14 = null;
        }
        l4Var14.Q.setOnItemSelectedListener(new f(this));
        l4 l4Var15 = this.G;
        if (l4Var15 == null) {
            cm.l.v("binding");
            l4Var15 = null;
        }
        l4Var15.P.setOnItemSelectedListener(new g(this));
        l4 l4Var16 = this.G;
        if (l4Var16 == null) {
            cm.l.v("binding");
        } else {
            l4Var2 = l4Var16;
        }
        l4Var2.A.setOnClickListener(new z(this));
    }

    /* access modifiers changed from: private */
    public static final void E1(PersonalDetailsEditScreen personalDetailsEditScreen, View view) {
        cm.l.f(personalDetailsEditScreen, "this$0");
        personalDetailsEditScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void F1(PersonalDetailsEditScreen personalDetailsEditScreen, RadioGroup radioGroup, int i10) {
        cm.l.f(personalDetailsEditScreen, "this$0");
        View findViewById = personalDetailsEditScreen.findViewById(i10);
        cm.l.e(findViewById, "findViewById(...)");
        CharSequence text = ((RadioButton) findViewById).getText();
        personalDetailsEditScreen.N = cm.l.a(text, "Male") ? "1" : cm.l.a(text, "Female") ? "2" : "0";
    }

    /* access modifiers changed from: private */
    public static final void G1(PersonalDetailsEditScreen personalDetailsEditScreen, View view) {
        int i10;
        String string;
        cm.l.f(personalDetailsEditScreen, "this$0");
        l4 l4Var = personalDetailsEditScreen.G;
        l4 l4Var2 = null;
        if (l4Var == null) {
            cm.l.v("binding");
            l4Var = null;
        }
        if (l4Var.f27267y.getText().toString().length() == 0) {
            i10 = R.string.error_first_name;
        } else {
            l4 l4Var3 = personalDetailsEditScreen.G;
            if (l4Var3 == null) {
                cm.l.v("binding");
                l4Var3 = null;
            }
            Editable text = l4Var3.f27267y.getText();
            cm.l.c(text);
            if (text.length() < 3) {
                i10 = R.string.error_valid_first_name;
            } else {
                l4 l4Var4 = personalDetailsEditScreen.G;
                if (l4Var4 == null) {
                    cm.l.v("binding");
                    l4Var4 = null;
                }
                if (l4Var4.C.getText().toString().length() == 0) {
                    i10 = R.string.error_last_name;
                } else {
                    l4 l4Var5 = personalDetailsEditScreen.G;
                    if (l4Var5 == null) {
                        cm.l.v("binding");
                        l4Var5 = null;
                    }
                    Editable text2 = l4Var5.C.getText();
                    cm.l.c(text2);
                    if (text2.length() < 3) {
                        i10 = R.string.error_valid_last_name;
                    } else {
                        l4 l4Var6 = personalDetailsEditScreen.G;
                        if (l4Var6 == null) {
                            cm.l.v("binding");
                            l4Var6 = null;
                        }
                        Editable text3 = l4Var6.f27254f0.getText();
                        cm.l.e(text3, "getText(...)");
                        if (text3.length() == 0) {
                            i10 = R.string.error_valid_full_name;
                        } else if (p.o(personalDetailsEditScreen.M, "0", true)) {
                            i10 = R.string.error_select_relation;
                        } else {
                            l4 l4Var7 = personalDetailsEditScreen.G;
                            if (l4Var7 == null) {
                                cm.l.v("binding");
                                l4Var7 = null;
                            }
                            if (String.valueOf(l4Var7.f27268z.getText()).length() == 0) {
                                i10 = R.string.error_first_name_rel;
                            } else {
                                l4 l4Var8 = personalDetailsEditScreen.G;
                                if (l4Var8 == null) {
                                    cm.l.v("binding");
                                    l4Var8 = null;
                                }
                                Editable text4 = l4Var8.f27268z.getText();
                                cm.l.c(text4);
                                if (text4.length() < 3) {
                                    i10 = R.string.error_valid_first_name_rel;
                                } else {
                                    l4 l4Var9 = personalDetailsEditScreen.G;
                                    if (l4Var9 == null) {
                                        cm.l.v("binding");
                                        l4Var9 = null;
                                    }
                                    if (String.valueOf(l4Var9.D.getText()).length() == 0) {
                                        i10 = R.string.error_last_name_rel;
                                    } else {
                                        l4 l4Var10 = personalDetailsEditScreen.G;
                                        if (l4Var10 == null) {
                                            cm.l.v("binding");
                                            l4Var10 = null;
                                        }
                                        Editable text5 = l4Var10.D.getText();
                                        cm.l.c(text5);
                                        if (text5.length() < 3) {
                                            i10 = R.string.error_valid_last_name_rel;
                                        } else if (cm.l.a(personalDetailsEditScreen.N, "")) {
                                            i10 = R.string.error_gender;
                                        } else {
                                            l4 l4Var11 = personalDetailsEditScreen.G;
                                            if (l4Var11 == null) {
                                                cm.l.v("binding");
                                                l4Var11 = null;
                                            }
                                            if (l4Var11.Z.getText().toString().length() == 0) {
                                                i10 = R.string.error_dob;
                                            } else {
                                                l4 l4Var12 = personalDetailsEditScreen.G;
                                                if (l4Var12 == null) {
                                                    cm.l.v("binding");
                                                    l4Var12 = null;
                                                }
                                                if (String.valueOf(l4Var12.f27262n0.getText()).length() == 0) {
                                                    i10 = R.string.error_place_of_birth;
                                                } else if (cm.l.a(personalDetailsEditScreen.S, "")) {
                                                    i10 = R.string.error_select_country;
                                                } else if (cm.l.a(personalDetailsEditScreen.U, "")) {
                                                    i10 = R.string.error_select_education_qual;
                                                } else if (cm.l.a(personalDetailsEditScreen.W, "") || p.o(personalDetailsEditScreen.W, "Select Blood Group", true)) {
                                                    i10 = R.string.error_select_blood_group;
                                                } else {
                                                    l4 l4Var13 = personalDetailsEditScreen.G;
                                                    if (l4Var13 == null) {
                                                        cm.l.v("binding");
                                                        l4Var13 = null;
                                                    }
                                                    int length = String.valueOf(l4Var13.U.getText()).length();
                                                    int i11 = R.string.enter_mobile_no;
                                                    if (length != 0) {
                                                        l4 l4Var14 = personalDetailsEditScreen.G;
                                                        if (l4Var14 == null) {
                                                            cm.l.v("binding");
                                                            l4Var14 = null;
                                                        }
                                                        if (String.valueOf(l4Var14.U.getText()).length() >= 9) {
                                                            l4 l4Var15 = personalDetailsEditScreen.G;
                                                            if (l4Var15 == null) {
                                                                cm.l.v("binding");
                                                                l4Var15 = null;
                                                            }
                                                            int length2 = String.valueOf(l4Var15.f27252d0.getText()).length();
                                                            i11 = R.string.error_emergency_no;
                                                            if (length2 != 0) {
                                                                l4 l4Var16 = personalDetailsEditScreen.G;
                                                                if (l4Var16 == null) {
                                                                    cm.l.v("binding");
                                                                    l4Var16 = null;
                                                                }
                                                                if (String.valueOf(l4Var16.f27252d0.getText()).length() >= 9) {
                                                                    l4 l4Var17 = personalDetailsEditScreen.G;
                                                                    if (l4Var17 == null) {
                                                                        cm.l.v("binding");
                                                                        l4Var17 = null;
                                                                    }
                                                                    if (String.valueOf(l4Var17.f27259k0.getText()).length() == 0) {
                                                                        i10 = R.string.error_identification_mark_1;
                                                                    } else {
                                                                        l4 l4Var18 = personalDetailsEditScreen.G;
                                                                        if (l4Var18 == null) {
                                                                            cm.l.v("binding");
                                                                            l4Var18 = null;
                                                                        }
                                                                        if (String.valueOf(l4Var18.f27260l0.getText()).length() == 0) {
                                                                            i10 = R.string.error_identification_mark_2;
                                                                        } else {
                                                                            Intent intent = new Intent(personalDetailsEditScreen, AddressDetailEditScreen.class);
                                                                            intent.putParcelableArrayListExtra("addressDetails", personalDetailsEditScreen.I);
                                                                            intent.putParcelableArrayListExtra("covDetails", personalDetailsEditScreen.J);
                                                                            intent.putParcelableArrayListExtra("selectedCovDetails", personalDetailsEditScreen.K);
                                                                            intent.putExtra("willingToDonate", personalDetailsEditScreen.f9196c0);
                                                                            intent.putExtra("licenseFromState", personalDetailsEditScreen.f9197d0);
                                                                            intent.putExtra("licenceFromRTO", personalDetailsEditScreen.f9198e0);
                                                                            intent.putExtra("jurisdiction", personalDetailsEditScreen.f9199f0);
                                                                            intent.putExtra("licenceFromRTOCode", personalDetailsEditScreen.f9200g0);
                                                                            intent.putExtra("applicationNo", personalDetailsEditScreen.f9201h0);
                                                                            intent.putExtra("reference", personalDetailsEditScreen.f9202i0);
                                                                            intent.putExtra("applDate", personalDetailsEditScreen.f9203j0);
                                                                            intent.putExtra("allowNewAddr", personalDetailsEditScreen.f9204k0);
                                                                            intent.putExtra("applCatg", personalDetailsEditScreen.f9205l0);
                                                                            intent.putParcelableArrayListExtra("llRefDetails", personalDetailsEditScreen.f9209p0);
                                                                            intent.putExtra("bioId", personalDetailsEditScreen.f9206m0);
                                                                            intent.putExtra("allClassOfVehicles", personalDetailsEditScreen.f9207n0);
                                                                            l4 l4Var19 = personalDetailsEditScreen.G;
                                                                            if (l4Var19 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var19 = null;
                                                                            }
                                                                            intent.putExtra("applicantFName", l4Var19.f27267y.getText().toString());
                                                                            l4 l4Var20 = personalDetailsEditScreen.G;
                                                                            if (l4Var20 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var20 = null;
                                                                            }
                                                                            intent.putExtra("applicantMName", String.valueOf(l4Var20.F.getText()));
                                                                            l4 l4Var21 = personalDetailsEditScreen.G;
                                                                            if (l4Var21 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var21 = null;
                                                                            }
                                                                            intent.putExtra("applicantLName", l4Var21.C.getText().toString());
                                                                            l4 l4Var22 = personalDetailsEditScreen.G;
                                                                            if (l4Var22 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var22 = null;
                                                                            }
                                                                            intent.putExtra("fullName", l4Var22.f27254f0.getText().toString());
                                                                            intent.putExtra("relationship", personalDetailsEditScreen.M);
                                                                            l4 l4Var23 = personalDetailsEditScreen.G;
                                                                            if (l4Var23 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var23 = null;
                                                                            }
                                                                            intent.putExtra("relationFName", String.valueOf(l4Var23.f27268z.getText()));
                                                                            l4 l4Var24 = personalDetailsEditScreen.G;
                                                                            if (l4Var24 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var24 = null;
                                                                            }
                                                                            intent.putExtra("relationMName", String.valueOf(l4Var24.G.getText()));
                                                                            l4 l4Var25 = personalDetailsEditScreen.G;
                                                                            if (l4Var25 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var25 = null;
                                                                            }
                                                                            intent.putExtra("relationLName", String.valueOf(l4Var25.D.getText()));
                                                                            intent.putExtra("gender", personalDetailsEditScreen.N);
                                                                            l4 l4Var26 = personalDetailsEditScreen.G;
                                                                            if (l4Var26 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var26 = null;
                                                                            }
                                                                            intent.putExtra("dob", l4Var26.Z.getText().toString());
                                                                            l4 l4Var27 = personalDetailsEditScreen.G;
                                                                            if (l4Var27 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var27 = null;
                                                                            }
                                                                            intent.putExtra("placeOfBirth", String.valueOf(l4Var27.f27262n0.getText()));
                                                                            intent.putExtra("country", personalDetailsEditScreen.S);
                                                                            intent.putExtra("educationQualification", personalDetailsEditScreen.U);
                                                                            intent.putExtra("bloodGroup", personalDetailsEditScreen.W);
                                                                            l4 l4Var28 = personalDetailsEditScreen.G;
                                                                            if (l4Var28 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var28 = null;
                                                                            }
                                                                            intent.putExtra("mobileNo", String.valueOf(l4Var28.f27257i0.getText()));
                                                                            l4 l4Var29 = personalDetailsEditScreen.G;
                                                                            if (l4Var29 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var29 = null;
                                                                            }
                                                                            intent.putExtra("emailId", String.valueOf(l4Var29.f27250b0.getText()));
                                                                            l4 l4Var30 = personalDetailsEditScreen.G;
                                                                            if (l4Var30 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var30 = null;
                                                                            }
                                                                            intent.putExtra("applicantMobileNo", String.valueOf(l4Var30.U.getText()));
                                                                            l4 l4Var31 = personalDetailsEditScreen.G;
                                                                            if (l4Var31 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var31 = null;
                                                                            }
                                                                            intent.putExtra("emergencyContactNo", String.valueOf(l4Var31.f27252d0.getText()));
                                                                            l4 l4Var32 = personalDetailsEditScreen.G;
                                                                            if (l4Var32 == null) {
                                                                                cm.l.v("binding");
                                                                                l4Var32 = null;
                                                                            }
                                                                            intent.putExtra("identificationMark1", String.valueOf(l4Var32.f27259k0.getText()));
                                                                            l4 l4Var33 = personalDetailsEditScreen.G;
                                                                            if (l4Var33 == null) {
                                                                                cm.l.v("binding");
                                                                            } else {
                                                                                l4Var2 = l4Var33;
                                                                            }
                                                                            intent.putExtra("identificationMark2", String.valueOf(l4Var2.f27260l0.getText()));
                                                                            personalDetailsEditScreen.startActivity(intent);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    string = personalDetailsEditScreen.getString(i11);
                                                    Toast.makeText(personalDetailsEditScreen, string, 0).show();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        string = personalDetailsEditScreen.getString(i10);
        Toast.makeText(personalDetailsEditScreen, string, 0).show();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void H1(java.util.ArrayList r7) {
        /*
            r6 = this;
            ni.l4 r0 = r6.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            android.widget.EditText r0 = r0.f27267y
            r3 = 0
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.j()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x0023
            cm.l.v(r2)
            r0 = r1
        L_0x0023:
            android.widget.EditText r0 = r0.C
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.o()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x003a
            cm.l.v(r2)
            r0 = r1
        L_0x003a:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.F
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.p()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x0051
            cm.l.v(r2)
            r0 = r1
        L_0x0051:
            android.widget.EditText r0 = r0.f27254f0
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.k()
            r0.setText(r4)
            java.lang.Object r0 = r7.get(r3)
            vb.i r0 = (vb.i) r0
            java.lang.String r0 = r0.r()
            r6.y1(r0)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x0075
            cm.l.v(r2)
            r0 = r1
        L_0x0075:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27268z
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.s()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x008c
            cm.l.v(r2)
            r0 = r1
        L_0x008c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.G
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.u()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x00a3
            cm.l.v(r2)
            r0 = r1
        L_0x00a3:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.D
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.t()
            r0.setText(r4)
            java.lang.Object r0 = r7.get(r3)
            vb.i r0 = (vb.i) r0
            java.lang.String r0 = r0.l()
            java.lang.String r4 = "1"
            r5 = 1
            boolean r0 = km.p.o(r0, r4, r5)
            if (r0 == 0) goto L_0x00d5
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x00cd
            cm.l.v(r2)
            r0 = r1
        L_0x00cd:
            android.widget.RadioButton r0 = r0.K
        L_0x00cf:
            r0.setChecked(r5)
            r6.N = r4
            goto L_0x0104
        L_0x00d5:
            java.lang.Object r0 = r7.get(r3)
            vb.i r0 = (vb.i) r0
            java.lang.String r0 = r0.l()
            java.lang.String r4 = "0"
            boolean r0 = km.p.o(r0, r4, r5)
            if (r0 == 0) goto L_0x00f9
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x00ef
            cm.l.v(r2)
            r0 = r1
        L_0x00ef:
            android.widget.RadioButton r0 = r0.I
            r0.setChecked(r5)
            java.lang.String r0 = "2"
            r6.N = r0
            goto L_0x0104
        L_0x00f9:
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x0101
            cm.l.v(r2)
            r0 = r1
        L_0x0101:
            android.widget.RadioButton r0 = r0.L
            goto L_0x00cf
        L_0x0104:
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x010c
            cm.l.v(r2)
            r0 = r1
        L_0x010c:
            android.widget.TextView r0 = r0.Z
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.g()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x0123
            cm.l.v(r2)
            r0 = r1
        L_0x0123:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27262n0
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.e()
            r0.setText(r4)
            java.lang.Object r0 = r7.get(r3)
            vb.i r0 = (vb.i) r0
            java.lang.String r0 = r0.f()
            r6.Z = r0
            java.lang.Object r0 = r7.get(r3)
            vb.i r0 = (vb.i) r0
            java.lang.String r0 = r0.d()
            r6.f9194a0 = r0
            java.lang.Object r0 = r7.get(r3)
            vb.i r0 = (vb.i) r0
            java.lang.String r0 = r0.h()
            r6.f9195b0 = r0
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x015e
            cm.l.v(r2)
            r0 = r1
        L_0x015e:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27250b0
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.i()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x0175
            cm.l.v(r2)
            r0 = r1
        L_0x0175:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.U
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.q()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x018c
            cm.l.v(r2)
            r0 = r1
        L_0x018c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27252d0
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.c()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x01a3
            cm.l.v(r2)
            r0 = r1
        L_0x01a3:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27259k0
            java.lang.Object r4 = r7.get(r3)
            vb.i r4 = (vb.i) r4
            java.lang.String r4 = r4.m()
            r0.setText(r4)
            ni.l4 r0 = r6.G
            if (r0 != 0) goto L_0x01ba
            cm.l.v(r2)
            goto L_0x01bb
        L_0x01ba:
            r1 = r0
        L_0x01bb:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f27260l0
            java.lang.Object r7 = r7.get(r3)
            vb.i r7 = (vb.i) r7
            java.lang.String r7 = r7.n()
            r0.setText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen.H1(java.util.ArrayList):void");
    }

    /* access modifiers changed from: private */
    public final void I1() {
        ArrayList arrayList = new ArrayList();
        int size = this.V.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.addAll(p.d(((BloodGroupMasterDataModal) this.V.get(i11)).getBloodGroupName()));
            if (p.o(((BloodGroupMasterDataModal) this.V.get(i11)).getBloodGroupCode(), this.f9194a0, true)) {
                i10 = i11;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        l4 l4Var = this.G;
        l4 l4Var2 = null;
        if (l4Var == null) {
            cm.l.v("binding");
            l4Var = null;
        }
        l4Var.P.setAdapter(arrayAdapter);
        if (i10 != -1) {
            l4 l4Var3 = this.G;
            if (l4Var3 == null) {
                cm.l.v("binding");
            } else {
                l4Var2 = l4Var3;
            }
            l4Var2.P.setSelection(i10);
        }
    }

    /* access modifiers changed from: private */
    public final void J1() {
        ArrayList arrayList = new ArrayList();
        int size = this.R.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.addAll(p.d(((CountryMasterResponseModal) this.R.get(i11)).getCountryName()));
            if (p.o(((CountryMasterResponseModal) this.R.get(i11)).getCountryCode(), this.Z, true)) {
                i10 = i11;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        l4 l4Var = this.G;
        l4 l4Var2 = null;
        if (l4Var == null) {
            cm.l.v("binding");
            l4Var = null;
        }
        l4Var.O.setAdapter(arrayAdapter);
        if (i10 != -1) {
            l4 l4Var3 = this.G;
            if (l4Var3 == null) {
                cm.l.v("binding");
            } else {
                l4Var2 = l4Var3;
            }
            l4Var2.O.setSelection(i10);
        }
    }

    /* access modifiers changed from: private */
    public final void K1() {
        ArrayList arrayList = new ArrayList();
        int size = this.T.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.addAll(p.d(((QualificationMasterDataModal) this.T.get(i11)).getQualificationName()));
            if (p.o(((QualificationMasterDataModal) this.T.get(i11)).getQualificationCode(), this.f9195b0, true)) {
                i10 = i11;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        l4 l4Var = this.G;
        l4 l4Var2 = null;
        if (l4Var == null) {
            cm.l.v("binding");
            l4Var = null;
        }
        l4Var.Q.setAdapter(arrayAdapter);
        if (i10 != -1) {
            l4 l4Var3 = this.G;
            if (l4Var3 == null) {
                cm.l.v("binding");
            } else {
                l4Var2 = l4Var3;
            }
            l4Var2.Q.setSelection(i10);
        }
    }

    private final void y1(String str) {
        this.L.add(0, new Relationship("0", "Select Relation"));
        this.L.add(1, new Relationship("F", "Father"));
        this.L.add(2, new Relationship("M", "Mother"));
        this.L.add(3, new Relationship("H", "Husband"));
        this.L.add(4, new Relationship("G", "Guardian"));
        int size = this.L.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            if (p.o(((Relationship) this.L.get(i11)).getRelationCode(), str, true)) {
                i10 = i11;
            }
        }
        wj.a aVar = new wj.a(this, this.L);
        l4 l4Var = this.G;
        l4 l4Var2 = null;
        if (l4Var == null) {
            cm.l.v("binding");
            l4Var = null;
        }
        l4Var.M.setAdapter(aVar);
        l4 l4Var3 = this.G;
        if (l4Var3 == null) {
            cm.l.v("binding");
        } else {
            l4Var2 = l4Var3;
        }
        l4Var2.M.setSelection(i10);
    }

    private final void z1() {
        try {
            ProgressDialog progressDialog = this.X;
            xj.b bVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            xj.b bVar2 = this.P;
            if (bVar2 == null) {
                cm.l.v("learnerLicenceVM");
            } else {
                bVar = bVar2;
            }
            bVar.i();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l4 x10 = l4.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        xj.b bVar = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        this.Q = NewLLServices.f22242a.a(this);
        NewLLServices newLLServices = this.Q;
        if (newLLServices == null) {
            cm.l.v("service");
            newLLServices = null;
        }
        this.P = (xj.b) new u0((x0) this, (u0.b) new yj.a(new xj.a(newLLServices))).a(xj.b.class);
        this.Y = new ld.c(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.X = progressDialog;
        progressDialog.setCancelable(false);
        ProgressDialog progressDialog2 = this.X;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.X;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        ld.c cVar = this.Y;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        progressDialog3.setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        C1();
        A1();
        B1();
        z1();
        D1();
        e.a aVar = v9.e.f17509a;
        l4 l4Var = this.G;
        if (l4Var == null) {
            cm.l.v("binding");
            l4Var = null;
        }
        aVar.K0(this, l4Var);
        xj.b bVar2 = this.P;
        if (bVar2 == null) {
            cm.l.v("learnerLicenceVM");
            bVar2 = null;
        }
        bVar2.n().g(this, new l(new h(this)));
        xj.b bVar3 = this.P;
        if (bVar3 == null) {
            cm.l.v("learnerLicenceVM");
            bVar3 = null;
        }
        bVar3.s().g(this, new l(new i(this)));
        xj.b bVar4 = this.P;
        if (bVar4 == null) {
            cm.l.v("learnerLicenceVM");
            bVar4 = null;
        }
        bVar4.j().g(this, new l(new j(this)));
        xj.b bVar5 = this.P;
        if (bVar5 == null) {
            cm.l.v("learnerLicenceVM");
        } else {
            bVar = bVar5;
        }
        bVar.u().g(this, new l(new k(this)));
    }
}
