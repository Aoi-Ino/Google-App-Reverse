package com.nic.mparivahan.dlservices.newlearner;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bj.h4;
import bj.i4;
import bj.j4;
import bj.k4;
import bj.l4;
import bj.m4;
import bj.n4;
import bj.o4;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryMasterResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.EducationQualResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.QualificationMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import ni.q6;
import pl.x;
import v9.e;

public final class PersonalDetailsScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public q6 G;
    /* access modifiers changed from: private */
    public ArrayList H = new ArrayList();
    /* access modifiers changed from: private */
    public String I = "";
    private Calendar J = Calendar.getInstance();
    private String K;
    /* access modifiers changed from: private */
    public ProgressDialog L;
    private ld.f M;
    /* access modifiers changed from: private */
    public ld.c N;
    private xj.b O;
    private NewLLServices P;
    /* access modifiers changed from: private */
    public ArrayList Q = new ArrayList();
    /* access modifiers changed from: private */
    public String R = "";
    /* access modifiers changed from: private */
    public ArrayList S = new ArrayList();
    /* access modifiers changed from: private */
    public String T = "";
    /* access modifiers changed from: private */
    public ArrayList U = new ArrayList();
    /* access modifiers changed from: private */
    public String V = "";
    private String W = "1";
    private int X;
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f21853a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f21854b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private Aadarkyc.DOEkyc f21855c0;

    /* renamed from: d0  reason: collision with root package name */
    private long f21856d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f21857e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f21858f0 = "";

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21859e;

        a(PersonalDetailsScreen personalDetailsScreen) {
            this.f21859e = personalDetailsScreen;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.c(editable);
            if (editable.length() > 1) {
                Calendar instance = Calendar.getInstance();
                instance.add(1, -Integer.parseInt(editable.toString()));
                instance.add(2, 1);
                int i10 = instance.get(1);
                int i11 = instance.get(2);
                int i12 = instance.get(5);
                q6 n12 = this.f21859e.G;
                if (n12 == null) {
                    cm.l.v("binding");
                    n12 = null;
                }
                TextView textView = n12.Z;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i12);
                sb2.append('-');
                sb2.append(i11);
                sb2.append('-');
                sb2.append(i10);
                textView.setText(sb2.toString());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21860e;

        b(PersonalDetailsScreen personalDetailsScreen) {
            this.f21860e = personalDetailsScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            PersonalDetailsScreen personalDetailsScreen = this.f21860e;
            personalDetailsScreen.I = ((Relationship) personalDetailsScreen.H.get(i10)).getRelationCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21861e;

        c(PersonalDetailsScreen personalDetailsScreen) {
            this.f21861e = personalDetailsScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            PersonalDetailsScreen personalDetailsScreen = this.f21861e;
            personalDetailsScreen.R = ((CountryMasterResponseModal) personalDetailsScreen.Q.get(i10)).getCountryCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21862e;

        d(PersonalDetailsScreen personalDetailsScreen) {
            this.f21862e = personalDetailsScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            PersonalDetailsScreen personalDetailsScreen = this.f21862e;
            personalDetailsScreen.T = ((QualificationMasterDataModal) personalDetailsScreen.S.get(i10)).getQualificationCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21863e;

        e(PersonalDetailsScreen personalDetailsScreen) {
            this.f21863e = personalDetailsScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            PersonalDetailsScreen personalDetailsScreen = this.f21863e;
            personalDetailsScreen.V = ((BloodGroupMasterDataModal) personalDetailsScreen.U.get(i10)).getBloodGroupCode();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21864e;

        f(PersonalDetailsScreen personalDetailsScreen) {
            this.f21864e = personalDetailsScreen;
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
                com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r4 = r2.f21864e
                ni.q6 r4 = r4.G
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
                com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r4 = r2.f21864e
                ni.q6 r4 = r4.G
                if (r4 != 0) goto L_0x0036
                cm.l.v(r6)
                r4 = r5
            L_0x0036:
                android.widget.EditText r4 = r4.f28161f0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r3 = r2.f21864e
                ni.q6 r3 = r3.G
                if (r3 != 0) goto L_0x004f
                cm.l.v(r6)
                r3 = r5
            L_0x004f:
                androidx.appcompat.widget.AppCompatEditText r3 = r3.F
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r3 = r2.f21864e
                ni.q6 r3 = r3.G
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
                com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r4 = r2.f21864e
                ni.q6 r4 = r4.G
                if (r4 != 0) goto L_0x0085
                cm.l.v(r6)
                r4 = r5
            L_0x0085:
                android.widget.EditText r4 = r4.f28161f0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r3 = r2.f21864e
                ni.q6 r3 = r3.G
                if (r3 != 0) goto L_0x009e
                cm.l.v(r6)
                r3 = r5
            L_0x009e:
                androidx.appcompat.widget.AppCompatEditText r3 = r3.F
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r3 = r2.f21864e
                ni.q6 r3 = r3.G
                if (r3 != 0) goto L_0x0067
                goto L_0x0063
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen.f.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public static final class g implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21865e;

        g(PersonalDetailsScreen personalDetailsScreen) {
            this.f21865e = personalDetailsScreen;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (String.valueOf(charSequence).length() > 0) {
                q6 n12 = this.f21865e.G;
                q6 q6Var = null;
                if (n12 == null) {
                    cm.l.v("binding");
                    n12 = null;
                }
                EditText editText = n12.f28161f0;
                StringBuilder sb2 = new StringBuilder();
                q6 n13 = this.f21865e.G;
                if (n13 == null) {
                    cm.l.v("binding");
                    n13 = null;
                }
                sb2.append(n13.f28174y.getText());
                sb2.append(' ');
                sb2.append(charSequence);
                sb2.append(' ');
                q6 n14 = this.f21865e.G;
                if (n14 == null) {
                    cm.l.v("binding");
                } else {
                    q6Var = n14;
                }
                sb2.append(q6Var.C.getText());
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21866e;

        h(PersonalDetailsScreen personalDetailsScreen) {
            this.f21866e = personalDetailsScreen;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditText editText;
            StringBuilder sb2;
            if (String.valueOf(charSequence).length() > 0) {
                q6 n12 = this.f21866e.G;
                q6 q6Var = null;
                if (n12 == null) {
                    cm.l.v("binding");
                    n12 = null;
                }
                if (String.valueOf(n12.F.getText()).length() > 0) {
                    q6 n13 = this.f21866e.G;
                    if (n13 == null) {
                        cm.l.v("binding");
                        n13 = null;
                    }
                    editText = n13.f28161f0;
                    sb2 = new StringBuilder();
                    q6 n14 = this.f21866e.G;
                    if (n14 == null) {
                        cm.l.v("binding");
                        n14 = null;
                    }
                    sb2.append(n14.f28174y.getText());
                    sb2.append(' ');
                    q6 n15 = this.f21866e.G;
                    if (n15 == null) {
                        cm.l.v("binding");
                    } else {
                        q6Var = n15;
                    }
                    sb2.append(q6Var.F.getText());
                    sb2.append(' ');
                } else {
                    q6 n16 = this.f21866e.G;
                    if (n16 == null) {
                        cm.l.v("binding");
                        n16 = null;
                    }
                    editText = n16.f28161f0;
                    sb2 = new StringBuilder();
                    q6 n17 = this.f21866e.G;
                    if (n17 == null) {
                        cm.l.v("binding");
                        n17 = null;
                    }
                    sb2.append(n17.f28174y.getText());
                    sb2.append(' ');
                    q6 n18 = this.f21866e.G;
                    if (n18 == null) {
                        cm.l.v("binding");
                    } else {
                        q6Var = n18;
                    }
                    sb2.append(q6Var.F.getText());
                }
                sb2.append(charSequence);
                editText.setText(sb2.toString());
            }
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21867e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PersonalDetailsScreen personalDetailsScreen) {
            super(1);
            this.f21867e = personalDetailsScreen;
        }

        public final void b(CountryResponseModal countryResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog q12 = this.f21867e.L;
                if (q12 == null) {
                    cm.l.v("dialog");
                    q12 = null;
                }
                if (q12.isShowing()) {
                    ProgressDialog q13 = this.f21867e.L;
                    if (q13 == null) {
                        cm.l.v("dialog");
                        q13 = null;
                    }
                    q13.dismiss();
                }
                if (p.o(countryResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsScreen personalDetailsScreen = this.f21867e;
                    ArrayList<CountryMasterResponseModal> drivingSchoolMasterList = countryResponseModal.getDrivingSchoolMasterList();
                    cm.l.c(drivingSchoolMasterList);
                    personalDetailsScreen.Q = drivingSchoolMasterList;
                    if (this.f21867e.Q.size() > 0) {
                        this.f21867e.V1();
                        return;
                    }
                    return;
                }
                PersonalDetailsScreen personalDetailsScreen2 = this.f21867e;
                ld.c t12 = personalDetailsScreen2.N;
                if (t12 == null) {
                    cm.l.v("session");
                    t12 = null;
                }
                personalDetailsScreen2.S1(t12.b("service_is_not_present", this.f21867e.getString(R.string.unable_to_get_details)));
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog q14 = this.f21867e.L;
                if (q14 == null) {
                    cm.l.v("dialog");
                    q14 = null;
                }
                if (q14.isShowing()) {
                    ProgressDialog q15 = this.f21867e.L;
                    if (q15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = q15;
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

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21868e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PersonalDetailsScreen personalDetailsScreen) {
            super(1);
            this.f21868e = personalDetailsScreen;
        }

        public final void b(EducationQualResponseModal educationQualResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog q12 = this.f21868e.L;
                if (q12 == null) {
                    cm.l.v("dialog");
                    q12 = null;
                }
                if (q12.isShowing()) {
                    ProgressDialog q13 = this.f21868e.L;
                    if (q13 == null) {
                        cm.l.v("dialog");
                        q13 = null;
                    }
                    q13.dismiss();
                }
                if (p.o(educationQualResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsScreen personalDetailsScreen = this.f21868e;
                    ArrayList<QualificationMasterDataModal> qualificationMasterData = educationQualResponseModal.getQualificationMasterData();
                    cm.l.c(qualificationMasterData);
                    personalDetailsScreen.S = qualificationMasterData;
                    if (this.f21868e.S.size() > 0) {
                        this.f21868e.W1();
                        return;
                    }
                    return;
                }
                PersonalDetailsScreen personalDetailsScreen2 = this.f21868e;
                ld.c t12 = personalDetailsScreen2.N;
                if (t12 == null) {
                    cm.l.v("session");
                    t12 = null;
                }
                personalDetailsScreen2.S1(t12.b("service_is_not_present", this.f21868e.getString(R.string.unable_to_get_details)));
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog q14 = this.f21868e.L;
                if (q14 == null) {
                    cm.l.v("dialog");
                    q14 = null;
                }
                if (q14.isShowing()) {
                    ProgressDialog q15 = this.f21868e.L;
                    if (q15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = q15;
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

    static final class k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21869e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(PersonalDetailsScreen personalDetailsScreen) {
            super(1);
            this.f21869e = personalDetailsScreen;
        }

        public final void b(BloodGroupResponseModal bloodGroupResponseModal) {
            PersonalDetailsScreen personalDetailsScreen;
            String b10;
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog q12 = this.f21869e.L;
                if (q12 == null) {
                    cm.l.v("dialog");
                    q12 = null;
                }
                if (q12.isShowing()) {
                    ProgressDialog q13 = this.f21869e.L;
                    if (q13 == null) {
                        cm.l.v("dialog");
                        q13 = null;
                    }
                    q13.dismiss();
                }
                if (p.o(bloodGroupResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsScreen personalDetailsScreen2 = this.f21869e;
                    ArrayList<BloodGroupMasterDataModal> bloodGroupMasterData = bloodGroupResponseModal.getBloodGroupMasterData();
                    cm.l.c(bloodGroupMasterData);
                    personalDetailsScreen2.U = bloodGroupMasterData;
                    if (this.f21869e.U.size() > 0) {
                        this.f21869e.U1();
                        return;
                    }
                    return;
                }
                if (p.o(bloodGroupResponseModal.getStatusCode(), "01", true)) {
                    ArrayList<BloodGroupMasterDataModal> bloodGroupMasterData2 = bloodGroupResponseModal.getBloodGroupMasterData();
                    cm.l.c(bloodGroupMasterData2);
                    if (com.nic.mparivahan.dlservices.utilities.d.d(bloodGroupMasterData2.get(0).getMasterNotAvailable())) {
                        this.f21869e.S1(bloodGroupResponseModal.getBloodGroupMasterData().get(0).getMasterNotAvailable());
                        return;
                    }
                    personalDetailsScreen = this.f21869e;
                    ld.c t12 = personalDetailsScreen.N;
                    if (t12 == null) {
                        cm.l.v("session");
                        t12 = null;
                    }
                    b10 = t12.b("service_is_not_present", this.f21869e.getString(R.string.unable_to_get_details));
                } else {
                    personalDetailsScreen = this.f21869e;
                    ld.c t13 = personalDetailsScreen.N;
                    if (t13 == null) {
                        cm.l.v("session");
                        t13 = null;
                    }
                    b10 = t13.b("service_is_not_present", this.f21869e.getString(R.string.unable_to_get_details));
                }
                personalDetailsScreen.S1(b10);
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog q14 = this.f21869e.L;
                if (q14 == null) {
                    cm.l.v("dialog");
                    q14 = null;
                }
                if (q14.isShowing()) {
                    ProgressDialog q15 = this.f21869e.L;
                    if (q15 == null) {
                        cm.l.v("dialog");
                    } else {
                        progressDialog = q15;
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

    static final class l extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PersonalDetailsScreen f21870e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PersonalDetailsScreen personalDetailsScreen) {
            super(1);
            this.f21870e = personalDetailsScreen;
        }

        public final void b(String str) {
            ProgressDialog q12 = this.f21870e.L;
            ld.c cVar = null;
            if (q12 == null) {
                cm.l.v("dialog");
                q12 = null;
            }
            if (q12.isShowing()) {
                ProgressDialog q13 = this.f21870e.L;
                if (q13 == null) {
                    cm.l.v("dialog");
                    q13 = null;
                }
                q13.dismiss();
            }
            PersonalDetailsScreen personalDetailsScreen = this.f21870e;
            ld.c t12 = personalDetailsScreen.N;
            if (t12 == null) {
                cm.l.v("session");
            } else {
                cVar = t12;
            }
            personalDetailsScreen.S1(cVar.b("service_is_not_present", this.f21870e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class m implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21871a;

        m(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21871a = lVar;
        }

        public final pl.c a() {
            return this.f21871a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21871a.invoke(obj);
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

    private final void F1() {
        this.H.add(0, new Relationship("0", "Select Relation"));
        this.H.add(1, new Relationship("F", "Father"));
        this.H.add(2, new Relationship("M", "Mother"));
        this.H.add(3, new Relationship("H", "Husband"));
        this.H.add(4, new Relationship("G", "Guardian"));
        wj.a aVar = new wj.a(this, this.H);
        q6 q6Var = this.G;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        q6Var.M.setAdapter(aVar);
    }

    private final void H1() {
        try {
            ProgressDialog progressDialog = this.L;
            xj.b bVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            xj.b bVar2 = this.O;
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

    private final void I1() {
        try {
            ProgressDialog progressDialog = this.L;
            xj.b bVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            xj.b bVar2 = this.O;
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

    private final void J1() {
        try {
            ProgressDialog progressDialog = this.L;
            xj.b bVar = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            xj.b bVar2 = this.O;
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

    private final void K1() {
        this.M = new ld.f(this);
        q6 q6Var = this.G;
        q6 q6Var2 = null;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        TextView textView = q6Var.E.f28452f;
        ld.f fVar = this.M;
        if (fVar == null) {
            cm.l.v("sarthiSession");
            fVar = null;
        }
        textView.setText(fVar.i());
        if (com.nic.mparivahan.dlservices.utilities.d.d(this.f21854b0)) {
            q6 q6Var3 = this.G;
            if (q6Var3 == null) {
                cm.l.v("binding");
                q6Var3 = null;
            }
            q6Var3.U.setText(this.f21854b0);
            q6 q6Var4 = this.G;
            if (q6Var4 == null) {
                cm.l.v("binding");
                q6Var4 = null;
            }
            q6Var4.U.setFocusable(0);
        } else {
            q6 q6Var5 = this.G;
            if (q6Var5 == null) {
                cm.l.v("binding");
                q6Var5 = null;
            }
            q6Var5.U.setText("");
            q6 q6Var6 = this.G;
            if (q6Var6 == null) {
                cm.l.v("binding");
                q6Var6 = null;
            }
            q6Var6.U.setFocusable(1);
        }
        i4 i4Var = new i4(this);
        q6 q6Var7 = this.G;
        if (q6Var7 == null) {
            cm.l.v("binding");
            q6Var7 = null;
        }
        q6Var7.Z.setOnClickListener(new j4(this, i4Var));
        q6 q6Var8 = this.G;
        if (q6Var8 == null) {
            cm.l.v("binding");
            q6Var8 = null;
        }
        q6Var8.f28172w.addTextChangedListener(new a(this));
        q6 q6Var9 = this.G;
        if (q6Var9 == null) {
            cm.l.v("binding");
            q6Var9 = null;
        }
        q6Var9.M.setOnItemSelectedListener(new b(this));
        q6 q6Var10 = this.G;
        if (q6Var10 == null) {
            cm.l.v("binding");
            q6Var10 = null;
        }
        q6Var10.O.setOnItemSelectedListener(new c(this));
        q6 q6Var11 = this.G;
        if (q6Var11 == null) {
            cm.l.v("binding");
            q6Var11 = null;
        }
        q6Var11.Q.setOnItemSelectedListener(new d(this));
        q6 q6Var12 = this.G;
        if (q6Var12 == null) {
            cm.l.v("binding");
            q6Var12 = null;
        }
        q6Var12.P.setOnItemSelectedListener(new e(this));
        q6 q6Var13 = this.G;
        if (q6Var13 == null) {
            cm.l.v("binding");
            q6Var13 = null;
        }
        q6Var13.f28174y.addTextChangedListener(new f(this));
        q6 q6Var14 = this.G;
        if (q6Var14 == null) {
            cm.l.v("binding");
            q6Var14 = null;
        }
        q6Var14.F.addTextChangedListener(new g(this));
        q6 q6Var15 = this.G;
        if (q6Var15 == null) {
            cm.l.v("binding");
            q6Var15 = null;
        }
        q6Var15.C.addTextChangedListener(new h(this));
        q6 q6Var16 = this.G;
        if (q6Var16 == null) {
            cm.l.v("binding");
            q6Var16 = null;
        }
        q6Var16.J.setOnCheckedChangeListener(new k4(this));
        q6 q6Var17 = this.G;
        if (q6Var17 == null) {
            cm.l.v("binding");
            q6Var17 = null;
        }
        q6Var17.A.setOnClickListener(new l4(this));
        q6 q6Var18 = this.G;
        if (q6Var18 == null) {
            cm.l.v("binding");
            q6Var18 = null;
        }
        q6Var18.N.setOnClickListener(new m4(this));
        q6 q6Var19 = this.G;
        if (q6Var19 == null) {
            cm.l.v("binding");
        } else {
            q6Var2 = q6Var19;
        }
        q6Var2.B.setOnClickListener(new n4(this));
    }

    /* access modifiers changed from: private */
    public static final void L1(PersonalDetailsScreen personalDetailsScreen, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(personalDetailsScreen, "this$0");
        personalDetailsScreen.J.set(1, i10);
        personalDetailsScreen.J.set(2, i11);
        personalDetailsScreen.J.set(5, i12);
        CharSequence format = DateFormat.format("dd", personalDetailsScreen.J.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", personalDetailsScreen.J.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", personalDetailsScreen.J.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        personalDetailsScreen.K = str + '-' + str2 + '-' + str3;
        q6 q6Var = personalDetailsScreen.G;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        TextView textView = q6Var.Z;
        textView.setText(str + '-' + str2 + '-' + str3);
        personalDetailsScreen.X = personalDetailsScreen.G1(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
    }

    /* access modifiers changed from: private */
    public static final void M1(PersonalDetailsScreen personalDetailsScreen, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(personalDetailsScreen, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(personalDetailsScreen, onDateSetListener, personalDetailsScreen.J.get(1), personalDetailsScreen.J.get(2), personalDetailsScreen.J.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void N1(PersonalDetailsScreen personalDetailsScreen, RadioGroup radioGroup, int i10) {
        cm.l.f(personalDetailsScreen, "this$0");
        View findViewById = personalDetailsScreen.findViewById(i10);
        cm.l.e(findViewById, "findViewById(...)");
        CharSequence text = ((RadioButton) findViewById).getText();
        personalDetailsScreen.W = cm.l.a(text, "Male") ? "1" : cm.l.a(text, "Female") ? "2" : "0";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX WARNING: type inference failed for: r10v9, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v14, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v17, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r10v20, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v21, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v24, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v27, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v30, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v33, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v38, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v40, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v43, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v45, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v48, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v51, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v54, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v59, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v62, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r10v69, types: [ld.c] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0303, code lost:
        if (r10 == null) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0309, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x032c, code lost:
        if (r10 == null) goto L_0x0305;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 18 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O1(com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen r9, android.view.View r10) {
        /*
            java.lang.String r10 = "this$0"
            cm.l.f(r9, r10)
            ni.q6 r10 = r9.G
            java.lang.String r0 = "binding"
            r1 = 0
            if (r10 != 0) goto L_0x0010
            cm.l.v(r0)
            r10 = r1
        L_0x0010:
            androidx.appcompat.widget.AppCompatEditText r10 = r10.U
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r10 = r10.length()
            r2 = 8
            java.lang.String r3 = ""
            if (r10 <= r2) goto L_0x006e
            ni.q6 r10 = r9.G
            if (r10 != 0) goto L_0x002c
            cm.l.v(r0)
            r10 = r1
        L_0x002c:
            androidx.appcompat.widget.AppCompatEditText r10 = r10.U
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x003e
            cm.l.v(r0)
            r2 = r1
        L_0x003e:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.U
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            int r2 = r2 + -4
            ni.q6 r4 = r9.G
            if (r4 != 0) goto L_0x0056
            cm.l.v(r0)
            r4 = r1
        L_0x0056:
            androidx.appcompat.widget.AppCompatEditText r4 = r4.U
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r4 = r4.length()
            java.lang.String r10 = r10.substring(r2, r4)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r10, r2)
            goto L_0x006f
        L_0x006e:
            r10 = r3
        L_0x006f:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0077
            cm.l.v(r0)
            r2 = r1
        L_0x0077:
            android.widget.EditText r2 = r2.f28174y
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            java.lang.String r4 = "PLEASE_ENTER_FIRST_NAME"
            java.lang.String r5 = "session"
            r6 = 0
            if (r2 != 0) goto L_0x00a9
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0094
            cm.l.v(r5)
            goto L_0x0095
        L_0x0094:
            r1 = r10
        L_0x0095:
            r10 = 2132017829(0x7f1402a5, float:1.9673947E38)
        L_0x0098:
            java.lang.String r10 = r9.getString(r10)
        L_0x009c:
            java.lang.String r10 = r1.b(r4, r10)
        L_0x00a0:
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r6)
            r9.show()
            goto L_0x0534
        L_0x00a9:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x00b1
            cm.l.v(r0)
            r2 = r1
        L_0x00b1:
            android.widget.EditText r2 = r2.f28174y
            android.text.Editable r2 = r2.getText()
            cm.l.c(r2)
            int r2 = r2.length()
            r7 = 3
            if (r2 >= r7) goto L_0x00ce
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x00c9
            cm.l.v(r5)
            goto L_0x00ca
        L_0x00c9:
            r1 = r10
        L_0x00ca:
            r10 = 2132017931(0x7f14030b, float:1.9674154E38)
            goto L_0x0098
        L_0x00ce:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x00d6
            cm.l.v(r0)
            r2 = r1
        L_0x00d6:
            android.widget.EditText r2 = r2.C
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00fd
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x00ee
            cm.l.v(r5)
            goto L_0x00ef
        L_0x00ee:
            r1 = r10
        L_0x00ef:
            r10 = 2132017846(0x7f1402b6, float:1.9673982E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "PLEASE_ENTER_LAST_NAME"
        L_0x00f8:
            java.lang.String r10 = r1.b(r0, r10)
            goto L_0x00a0
        L_0x00fd:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0105
            cm.l.v(r0)
            r2 = r1
        L_0x0105:
            android.widget.EditText r2 = r2.C
            android.text.Editable r2 = r2.getText()
            cm.l.c(r2)
            int r2 = r2.length()
            if (r2 >= r7) goto L_0x0127
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x011c
            cm.l.v(r5)
            goto L_0x011d
        L_0x011c:
            r1 = r10
        L_0x011d:
            r10 = 2132017936(0x7f140310, float:1.9674164E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "PLEASE_ENTER_VALID_LAST_NAME"
            goto L_0x00f8
        L_0x0127:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x012f
            cm.l.v(r0)
            r2 = r1
        L_0x012f:
            android.widget.EditText r2 = r2.f28161f0
            android.text.Editable r2 = r2.getText()
            java.lang.String r4 = "getText(...)"
            cm.l.e(r2, r4)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0153
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0148
            cm.l.v(r5)
            goto L_0x0149
        L_0x0148:
            r1 = r10
        L_0x0149:
            r10 = 2132017832(0x7f1402a8, float:1.9673954E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "PLEASE_ENTER_FULL_NAME"
            goto L_0x00f8
        L_0x0153:
            java.lang.String r2 = r9.I
            java.lang.String r4 = "0"
            r8 = 1
            boolean r2 = km.p.o(r2, r4, r8)
            if (r2 == 0) goto L_0x0171
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0166
            cm.l.v(r5)
            goto L_0x0167
        L_0x0166:
            r1 = r10
        L_0x0167:
            r10 = 2132017985(0x7f140341, float:1.9674264E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "pls_enter_relation"
            goto L_0x00f8
        L_0x0171:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0179
            cm.l.v(r0)
            r2 = r1
        L_0x0179:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28175z
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x019d
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0191
            cm.l.v(r5)
            goto L_0x0192
        L_0x0191:
            r1 = r10
        L_0x0192:
            r10 = 2132018955(0x7f14070b, float:1.9676231E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "PLEASE_ENTER_REL_FIRST_NAME"
            goto L_0x00f8
        L_0x019d:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x01a5
            cm.l.v(r0)
            r2 = r1
        L_0x01a5:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28175z
            android.text.Editable r2 = r2.getText()
            cm.l.c(r2)
            int r2 = r2.length()
            java.lang.String r4 = "PLEASE_ENTER_REL_VALID_FIRST_NAME"
            if (r2 >= r7) goto L_0x01c4
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x01be
            cm.l.v(r5)
            goto L_0x01bf
        L_0x01be:
            r1 = r10
        L_0x01bf:
            r10 = 2132018957(0x7f14070d, float:1.9676235E38)
            goto L_0x0098
        L_0x01c4:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x01cc
            cm.l.v(r0)
            r2 = r1
        L_0x01cc:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.D
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x01f0
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x01e4
            cm.l.v(r5)
            goto L_0x01e5
        L_0x01e4:
            r1 = r10
        L_0x01e5:
            r10 = 2132018956(0x7f14070c, float:1.9676233E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "PLEASE_ENTER_REL_LAST_NAME"
            goto L_0x00f8
        L_0x01f0:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x01f8
            cm.l.v(r0)
            r2 = r1
        L_0x01f8:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.D
            android.text.Editable r2 = r2.getText()
            cm.l.c(r2)
            int r2 = r2.length()
            if (r2 >= r7) goto L_0x0215
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x020f
            cm.l.v(r5)
            goto L_0x0210
        L_0x020f:
            r1 = r10
        L_0x0210:
            r10 = 2132018958(0x7f14070e, float:1.9676237E38)
            goto L_0x0098
        L_0x0215:
            java.lang.String r2 = r9.W
            boolean r2 = cm.l.a(r2, r3)
            if (r2 == 0) goto L_0x0226
            r10 = 2132017966(0x7f14032e, float:1.9674225E38)
            java.lang.String r10 = r9.getString(r10)
            goto L_0x00a0
        L_0x0226:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x022e
            cm.l.v(r0)
            r2 = r1
        L_0x022e:
            android.widget.TextView r2 = r2.Z
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0252
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0246
            cm.l.v(r5)
            goto L_0x0247
        L_0x0246:
            r1 = r10
        L_0x0247:
            r10 = 2132018722(0x7f140622, float:1.9675759E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "please_enter_bd"
            goto L_0x00f8
        L_0x0252:
            int r2 = r9.X
            r4 = 18
            if (r2 >= r4) goto L_0x026c
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0260
            cm.l.v(r5)
            goto L_0x0261
        L_0x0260:
            r1 = r10
        L_0x0261:
            r10 = 2132017952(0x7f140320, float:1.9674197E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "age_above_18"
            goto L_0x00f8
        L_0x026c:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0274
            cm.l.v(r0)
            r2 = r1
        L_0x0274:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28169n0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0298
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x028c
            cm.l.v(r5)
            goto L_0x028d
        L_0x028c:
            r1 = r10
        L_0x028d:
            r10 = 2132017948(0x7f14031c, float:1.9674189E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "edit_dl_serv_enter_birth_plac"
            goto L_0x00f8
        L_0x0298:
            java.lang.String r2 = r9.R
            boolean r2 = cm.l.a(r2, r3)
            if (r2 == 0) goto L_0x02b4
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x02a8
            cm.l.v(r5)
            goto L_0x02a9
        L_0x02a8:
            r1 = r10
        L_0x02a9:
            r10 = 2132019068(0x7f14077c, float:1.967646E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "edit_dl_serv_selc_country"
            goto L_0x00f8
        L_0x02b4:
            java.lang.String r2 = r9.T
            boolean r2 = cm.l.a(r2, r3)
            if (r2 == 0) goto L_0x02d0
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x02c4
            cm.l.v(r5)
            goto L_0x02c5
        L_0x02c4:
            r1 = r10
        L_0x02c5:
            r10 = 2132019076(0x7f140784, float:1.9676477E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "PLEASE_SELECT_EDUCATION"
            goto L_0x00f8
        L_0x02d0:
            java.lang.String r2 = r9.V
            boolean r2 = cm.l.a(r2, r3)
            if (r2 != 0) goto L_0x0520
            java.lang.String r2 = r9.V
            java.lang.String r3 = "Select Blood Group"
            boolean r2 = km.p.o(r2, r3, r8)
            if (r2 == 0) goto L_0x02e4
            goto L_0x0520
        L_0x02e4:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x02ec
            cm.l.v(r0)
            r2 = r1
        L_0x02ec:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.U
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            r3 = 2132017854(0x7f1402be, float:1.9673998E38)
            java.lang.String r4 = "label_log_entr_vali_mobno"
            if (r2 != 0) goto L_0x0310
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0309
        L_0x0305:
            cm.l.v(r5)
            goto L_0x030a
        L_0x0309:
            r1 = r10
        L_0x030a:
            java.lang.String r10 = r9.getString(r3)
            goto L_0x009c
        L_0x0310:
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0318
            cm.l.v(r0)
            r2 = r1
        L_0x0318:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.U
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            r7 = 9
            if (r2 >= r7) goto L_0x032f
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0309
            goto L_0x0305
        L_0x032f:
            boolean r2 = r9.f21857e0
            java.lang.String r3 = "aadharData"
            if (r2 == 0) goto L_0x035f
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r9.f21855c0
            if (r2 != 0) goto L_0x033d
            cm.l.v(r3)
            r2 = r1
        L_0x033d:
            int r2 = r2.getPhone()
            if (r2 != 0) goto L_0x035f
            java.lang.String r2 = r9.f21858f0
            boolean r10 = cm.l.a(r10, r2)
            if (r10 != 0) goto L_0x035f
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0353
            cm.l.v(r5)
            goto L_0x0354
        L_0x0353:
            r1 = r10
        L_0x0354:
            r10 = 2132017340(0x7f1400bc, float:1.9672956E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "valid_aadhaar_mobile_no"
            goto L_0x00f8
        L_0x035f:
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen> r2 = com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen.class
            r10.<init>(r9, r2)
            java.lang.String r2 = "stateCd"
            java.lang.String r4 = r9.Y
            r10.putExtra(r2, r4)
            java.lang.String r2 = "rtoCd"
            java.lang.String r4 = r9.Z
            r10.putExtra(r2, r4)
            java.lang.String r2 = "rtoName"
            java.lang.String r4 = r9.f21853a0
            r10.putExtra(r2, r4)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0383
            cm.l.v(r0)
            r2 = r1
        L_0x0383:
            android.widget.EditText r2 = r2.f28174y
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "applicantFName"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x039a
            cm.l.v(r0)
            r2 = r1
        L_0x039a:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.F
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "applicantMName"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x03b1
            cm.l.v(r0)
            r2 = r1
        L_0x03b1:
            android.widget.EditText r2 = r2.C
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "applicantLName"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x03c8
            cm.l.v(r0)
            r2 = r1
        L_0x03c8:
            android.widget.EditText r2 = r2.f28161f0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "fullName"
            r10.putExtra(r4, r2)
            java.lang.String r2 = "relationship"
            java.lang.String r4 = r9.I
            r10.putExtra(r2, r4)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x03e6
            cm.l.v(r0)
            r2 = r1
        L_0x03e6:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28175z
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "relationFName"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x03fd
            cm.l.v(r0)
            r2 = r1
        L_0x03fd:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.G
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "relationMName"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0414
            cm.l.v(r0)
            r2 = r1
        L_0x0414:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.D
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "relationLName"
            r10.putExtra(r4, r2)
            java.lang.String r2 = "gender"
            java.lang.String r4 = r9.W
            r10.putExtra(r2, r4)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0432
            cm.l.v(r0)
            r2 = r1
        L_0x0432:
            android.widget.TextView r2 = r2.Z
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "dob"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0449
            cm.l.v(r0)
            r2 = r1
        L_0x0449:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28169n0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "placeOfBirth"
            r10.putExtra(r4, r2)
            java.lang.String r2 = "country"
            java.lang.String r4 = r9.R
            r10.putExtra(r2, r4)
            java.lang.String r2 = "educationQualification"
            java.lang.String r4 = r9.T
            r10.putExtra(r2, r4)
            java.lang.String r2 = "bloodGroup"
            java.lang.String r4 = r9.V
            r10.putExtra(r2, r4)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x0475
            cm.l.v(r0)
            r2 = r1
        L_0x0475:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28164i0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "landlineNo"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x048c
            cm.l.v(r0)
            r2 = r1
        L_0x048c:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28157b0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "emailId"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x04a3
            cm.l.v(r0)
            r2 = r1
        L_0x04a3:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.U
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "applicantMobileNo"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x04ba
            cm.l.v(r0)
            r2 = r1
        L_0x04ba:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28159d0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "altMobileNo"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x04d1
            cm.l.v(r0)
            r2 = r1
        L_0x04d1:
            androidx.appcompat.widget.AppCompatEditText r2 = r2.f28166k0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "identificationMark1"
            r10.putExtra(r4, r2)
            ni.q6 r2 = r9.G
            if (r2 != 0) goto L_0x04e8
            cm.l.v(r0)
            r2 = r1
        L_0x04e8:
            androidx.appcompat.widget.AppCompatEditText r0 = r2.f28167l0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "identificationMark2"
            r10.putExtra(r2, r0)
            java.lang.String r0 = "enteredAge"
            int r2 = r9.X
            r10.putExtra(r0, r2)
            boolean r0 = r9.f21857e0
            if (r0 == 0) goto L_0x051c
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r9.f21855c0
            if (r0 != 0) goto L_0x050a
            cm.l.v(r3)
            goto L_0x050b
        L_0x050a:
            r1 = r0
        L_0x050b:
            r10.putExtra(r3, r1)
            java.lang.String r0 = "ekycId"
            long r1 = r9.f21856d0
            r10.putExtra(r0, r1)
            java.lang.String r0 = "dataFromAadhar"
            boolean r1 = r9.f21857e0
            r10.putExtra(r0, r1)
        L_0x051c:
            r9.startActivity(r10)
            goto L_0x0534
        L_0x0520:
            ld.c r10 = r9.N
            if (r10 != 0) goto L_0x0528
            cm.l.v(r5)
            goto L_0x0529
        L_0x0528:
            r1 = r10
        L_0x0529:
            r10 = 2132019066(0x7f14077a, float:1.9676456E38)
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r0 = "PLEASE_SELECT_BG"
            goto L_0x00f8
        L_0x0534:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen.O1(com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void P1(PersonalDetailsScreen personalDetailsScreen, View view) {
        cm.l.f(personalDetailsScreen, "this$0");
        q6 q6Var = personalDetailsScreen.G;
        q6 q6Var2 = null;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        q6Var.f28174y.setText("");
        q6 q6Var3 = personalDetailsScreen.G;
        if (q6Var3 == null) {
            cm.l.v("binding");
            q6Var3 = null;
        }
        q6Var3.F.setText("");
        q6 q6Var4 = personalDetailsScreen.G;
        if (q6Var4 == null) {
            cm.l.v("binding");
            q6Var4 = null;
        }
        q6Var4.C.setText("");
        q6 q6Var5 = personalDetailsScreen.G;
        if (q6Var5 == null) {
            cm.l.v("binding");
            q6Var5 = null;
        }
        q6Var5.f28161f0.setText("");
        q6 q6Var6 = personalDetailsScreen.G;
        if (q6Var6 == null) {
            cm.l.v("binding");
            q6Var6 = null;
        }
        q6Var6.M.setSelection(0);
        q6 q6Var7 = personalDetailsScreen.G;
        if (q6Var7 == null) {
            cm.l.v("binding");
            q6Var7 = null;
        }
        q6Var7.f28175z.setText("");
        q6 q6Var8 = personalDetailsScreen.G;
        if (q6Var8 == null) {
            cm.l.v("binding");
            q6Var8 = null;
        }
        q6Var8.G.setText("");
        q6 q6Var9 = personalDetailsScreen.G;
        if (q6Var9 == null) {
            cm.l.v("binding");
            q6Var9 = null;
        }
        q6Var9.D.setText("");
        q6 q6Var10 = personalDetailsScreen.G;
        if (q6Var10 == null) {
            cm.l.v("binding");
            q6Var10 = null;
        }
        q6Var10.Z.setText("");
        q6 q6Var11 = personalDetailsScreen.G;
        if (q6Var11 == null) {
            cm.l.v("binding");
            q6Var11 = null;
        }
        q6Var11.f28169n0.setText("");
        q6 q6Var12 = personalDetailsScreen.G;
        if (q6Var12 == null) {
            cm.l.v("binding");
            q6Var12 = null;
        }
        q6Var12.O.setSelection(0);
        q6 q6Var13 = personalDetailsScreen.G;
        if (q6Var13 == null) {
            cm.l.v("binding");
            q6Var13 = null;
        }
        q6Var13.Q.setSelection(0);
        q6 q6Var14 = personalDetailsScreen.G;
        if (q6Var14 == null) {
            cm.l.v("binding");
            q6Var14 = null;
        }
        q6Var14.P.setSelection(0);
        q6 q6Var15 = personalDetailsScreen.G;
        if (q6Var15 == null) {
            cm.l.v("binding");
            q6Var15 = null;
        }
        q6Var15.f28164i0.setText("");
        q6 q6Var16 = personalDetailsScreen.G;
        if (q6Var16 == null) {
            cm.l.v("binding");
            q6Var16 = null;
        }
        q6Var16.f28157b0.setText("");
        q6 q6Var17 = personalDetailsScreen.G;
        if (q6Var17 == null) {
            cm.l.v("binding");
            q6Var17 = null;
        }
        q6Var17.U.setText("");
        q6 q6Var18 = personalDetailsScreen.G;
        if (q6Var18 == null) {
            cm.l.v("binding");
            q6Var18 = null;
        }
        q6Var18.f28159d0.setText("");
        q6 q6Var19 = personalDetailsScreen.G;
        if (q6Var19 == null) {
            cm.l.v("binding");
            q6Var19 = null;
        }
        q6Var19.f28166k0.setText("");
        q6 q6Var20 = personalDetailsScreen.G;
        if (q6Var20 == null) {
            cm.l.v("binding");
        } else {
            q6Var2 = q6Var20;
        }
        q6Var2.f28167l0.setText("");
    }

    /* access modifiers changed from: private */
    public static final void Q1(PersonalDetailsScreen personalDetailsScreen, View view) {
        cm.l.f(personalDetailsScreen, "this$0");
        Object systemService = personalDetailsScreen.getSystemService("layout_inflater");
        cm.l.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        q6 q6Var = null;
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_info, (ViewGroup) null);
        cm.l.e(inflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(inflate, (int) (((double) personalDetailsScreen.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        TextView textView = (TextView) inflate.findViewById(R.id.infoMessageTv);
        ((ImageView) inflate.findViewById(R.id.closeIv)).setOnClickListener(new o4(popupWindow));
        ld.c cVar = personalDetailsScreen.N;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        textView.setText(cVar.b("infoDescription", "If Middle name is more than 6 characters, then middle name could be entered either in First Name or Last Name and will be printed on driving licence"));
        q6 q6Var2 = personalDetailsScreen.G;
        if (q6Var2 == null) {
            cm.l.v("binding");
        } else {
            q6Var = q6Var2;
        }
        popupWindow.showAsDropDown(q6Var.R, 0, 10);
    }

    /* access modifiers changed from: private */
    public static final void R1(PopupWindow popupWindow, View view) {
        cm.l.f(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    /* access modifiers changed from: private */
    public final void S1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        ld.c cVar = this.N;
        ld.c cVar2 = null;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        textView2.setText(cVar.b("btn_ok", getString(R.string.ok_txt)));
        textView.setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById3;
        ld.c cVar3 = this.N;
        if (cVar3 == null) {
            cm.l.v("session");
            cVar3 = null;
        }
        textView3.setText(cVar3.b("nex_parivahan", "NextGen mParivahan"));
        ld.c cVar4 = this.N;
        if (cVar4 == null) {
            cm.l.v("session");
        } else {
            cVar2 = cVar4;
        }
        textView2.setText(cVar2.b("btn_ok", "OK"));
        textView2.setOnClickListener(new h4(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void U1() {
        ArrayList arrayList = new ArrayList();
        int size = this.U.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.addAll(p.d(((BloodGroupMasterDataModal) this.U.get(i11)).getBloodGroupName()));
            if (cm.l.a(((BloodGroupMasterDataModal) this.U.get(i11)).getBloodGroupName(), "Unknown")) {
                i10 = i11;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        q6 q6Var = this.G;
        q6 q6Var2 = null;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        q6Var.P.setAdapter(arrayAdapter);
        if (i10 != -1) {
            q6 q6Var3 = this.G;
            if (q6Var3 == null) {
                cm.l.v("binding");
            } else {
                q6Var2 = q6Var3;
            }
            q6Var2.P.setSelection(i10);
        }
    }

    /* access modifiers changed from: private */
    public final void V1() {
        ArrayList arrayList = new ArrayList();
        int size = this.Q.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.addAll(p.d(((CountryMasterResponseModal) this.Q.get(i11)).getCountryName()));
            if (cm.l.a(((CountryMasterResponseModal) this.Q.get(i11)).getCountryName(), "INDIA")) {
                i10 = i11;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        q6 q6Var = this.G;
        q6 q6Var2 = null;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        q6Var.O.setAdapter(arrayAdapter);
        if (i10 != -1) {
            q6 q6Var3 = this.G;
            if (q6Var3 == null) {
                cm.l.v("binding");
            } else {
                q6Var2 = q6Var3;
            }
            q6Var2.O.setSelection(i10);
        }
    }

    /* access modifiers changed from: private */
    public final void W1() {
        ArrayList arrayList = new ArrayList();
        int size = this.S.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.addAll(p.d(((QualificationMasterDataModal) this.S.get(i11)).getQualificationName()));
            if (cm.l.a(((QualificationMasterDataModal) this.S.get(i11)).getQualificationCode(), "999")) {
                i10 = i11;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        q6 q6Var = this.G;
        q6 q6Var2 = null;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        q6Var.Q.setAdapter(arrayAdapter);
        if (i10 != -1) {
            q6 q6Var3 = this.G;
            if (q6Var3 == null) {
                cm.l.v("binding");
            } else {
                q6Var2 = q6Var3;
            }
            q6Var2.Q.setSelection(i10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v243, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [ni.q6] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [ni.q6] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02de, code lost:
        if (r15 == null) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x033a, code lost:
        if (r15 == null) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0384, code lost:
        if (r15 == null) goto L_0x02e0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0507  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void X1(boolean r15) {
        /*
            r14 = this;
            r0 = 1
            java.lang.String r1 = "binding"
            r2 = 0
            if (r15 == 0) goto L_0x0524
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            java.lang.String r3 = "aadharData"
            if (r15 != 0) goto L_0x0010
            cm.l.v(r3)
            r15 = r2
        L_0x0010:
            java.lang.String r15 = r15.getName()
            boolean r15 = com.nic.mparivahan.dlservices.utilities.d.d(r15)
            java.lang.String r4 = ""
            java.lang.String r5 = "\\s+"
            r6 = 2
            r7 = 0
            if (r15 == 0) goto L_0x0104
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x0028
            cm.l.v(r3)
            r15 = r2
        L_0x0028:
            java.lang.String r15 = r15.getName()
            cm.l.c(r15)
            java.lang.CharSequence r15 = km.q.B0(r15)
            java.lang.String r15 = r15.toString()
            km.f r8 = new km.f
            r8.<init>((java.lang.String) r5)
            java.util.List r15 = r8.d(r15, r7)
            java.lang.Object r8 = ql.y.U(r15)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = ql.y.e0(r15)
            java.lang.String r9 = (java.lang.String) r9
            int r10 = r15.size()
            if (r10 <= r6) goto L_0x0059
            java.lang.Object r15 = r15.get(r0)
            java.lang.String r15 = (java.lang.String) r15
            goto L_0x005a
        L_0x0059:
            r15 = r4
        L_0x005a:
            ni.q6 r10 = r14.G
            if (r10 != 0) goto L_0x0062
            cm.l.v(r1)
            r10 = r2
        L_0x0062:
            android.widget.EditText r10 = r10.f28174y
            r10.setText(r8)
            ni.q6 r8 = r14.G
            if (r8 != 0) goto L_0x006f
            cm.l.v(r1)
            r8 = r2
        L_0x006f:
            android.widget.EditText r8 = r8.C
            r8.setText(r9)
            ni.q6 r8 = r14.G
            if (r8 != 0) goto L_0x007c
            cm.l.v(r1)
            r8 = r2
        L_0x007c:
            androidx.appcompat.widget.AppCompatEditText r8 = r8.F
            r8.setText(r15)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0089
            cm.l.v(r1)
            r15 = r2
        L_0x0089:
            android.widget.EditText r15 = r15.f28161f0
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r8 = r14.f21855c0
            if (r8 != 0) goto L_0x0093
            cm.l.v(r3)
            r8 = r2
        L_0x0093:
            java.lang.String r8 = r8.getName()
            r15.setText(r8)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00a2
            cm.l.v(r1)
            r15 = r2
        L_0x00a2:
            android.widget.EditText r15 = r15.f28174y
            r15.setFocusable(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00af
            cm.l.v(r1)
            r15 = r2
        L_0x00af:
            android.widget.EditText r15 = r15.C
            r15.setFocusable(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00bc
            cm.l.v(r1)
            r15 = r2
        L_0x00bc:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.F
            r15.setFocusable(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00c9
            cm.l.v(r1)
            r15 = r2
        L_0x00c9:
            android.widget.EditText r15 = r15.f28161f0
            r15.setFocusable(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00d6
            cm.l.v(r1)
            r15 = r2
        L_0x00d6:
            android.widget.EditText r15 = r15.f28174y
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00e3
            cm.l.v(r1)
            r15 = r2
        L_0x00e3:
            android.widget.EditText r15 = r15.C
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00f0
            cm.l.v(r1)
            r15 = r2
        L_0x00f0:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.F
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x00fd
            cm.l.v(r1)
            r15 = r2
        L_0x00fd:
            android.widget.EditText r15 = r15.f28161f0
            r15.setEnabled(r7)
            goto L_0x016c
        L_0x0104:
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x010c
            cm.l.v(r1)
            r15 = r2
        L_0x010c:
            android.widget.EditText r15 = r15.f28174y
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0119
            cm.l.v(r1)
            r15 = r2
        L_0x0119:
            android.widget.EditText r15 = r15.C
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0126
            cm.l.v(r1)
            r15 = r2
        L_0x0126:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.F
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0133
            cm.l.v(r1)
            r15 = r2
        L_0x0133:
            android.widget.EditText r15 = r15.f28161f0
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0140
            cm.l.v(r1)
            r15 = r2
        L_0x0140:
            android.widget.EditText r15 = r15.f28174y
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x014d
            cm.l.v(r1)
            r15 = r2
        L_0x014d:
            android.widget.EditText r15 = r15.C
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x015a
            cm.l.v(r1)
            r15 = r2
        L_0x015a:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.F
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0167
            cm.l.v(r1)
            r15 = r2
        L_0x0167:
            android.widget.EditText r15 = r15.f28161f0
            r15.setEnabled(r0)
        L_0x016c:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x0174
            cm.l.v(r3)
            r15 = r2
        L_0x0174:
            java.lang.String r15 = r15.getCareOf()
            boolean r15 = com.nic.mparivahan.dlservices.utilities.d.d(r15)
            if (r15 == 0) goto L_0x0271
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x0186
            cm.l.v(r3)
            r15 = r2
        L_0x0186:
            java.lang.String r15 = r15.getCareOf()
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r8 = r14.f21855c0
            if (r8 != 0) goto L_0x0192
            cm.l.v(r3)
            r8 = r2
        L_0x0192:
            java.lang.String r8 = r8.getCareOf()
            java.lang.String r9 = "C/O: "
            boolean r8 = km.q.F(r8, r9, r7, r6, r2)
            if (r8 == 0) goto L_0x01b7
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x01a6
            cm.l.v(r3)
            r15 = r2
        L_0x01a6:
            java.lang.String r8 = r15.getCareOf()
            java.lang.String r9 = "C/O: "
        L_0x01ac:
            java.lang.String r10 = ""
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r15 = km.p.w(r8, r9, r10, r11, r12, r13)
            goto L_0x0220
        L_0x01b7:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r8 = r14.f21855c0
            if (r8 != 0) goto L_0x01bf
            cm.l.v(r3)
            r8 = r2
        L_0x01bf:
            java.lang.String r8 = r8.getCareOf()
            java.lang.String r9 = "D/O: "
            boolean r8 = km.q.F(r8, r9, r7, r6, r2)
            if (r8 == 0) goto L_0x01da
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x01d3
            cm.l.v(r3)
            r15 = r2
        L_0x01d3:
            java.lang.String r8 = r15.getCareOf()
            java.lang.String r9 = "D/O: "
            goto L_0x01ac
        L_0x01da:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r8 = r14.f21855c0
            if (r8 != 0) goto L_0x01e2
            cm.l.v(r3)
            r8 = r2
        L_0x01e2:
            java.lang.String r8 = r8.getCareOf()
            java.lang.String r9 = "W/O: "
            boolean r8 = km.q.F(r8, r9, r7, r6, r2)
            if (r8 == 0) goto L_0x01fd
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x01f6
            cm.l.v(r3)
            r15 = r2
        L_0x01f6:
            java.lang.String r8 = r15.getCareOf()
            java.lang.String r9 = "W/O: "
            goto L_0x01ac
        L_0x01fd:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r8 = r14.f21855c0
            if (r8 != 0) goto L_0x0205
            cm.l.v(r3)
            r8 = r2
        L_0x0205:
            java.lang.String r8 = r8.getCareOf()
            java.lang.String r9 = "S/O: "
            boolean r8 = km.q.F(r8, r9, r7, r6, r2)
            if (r8 == 0) goto L_0x0220
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x0219
            cm.l.v(r3)
            r15 = r2
        L_0x0219:
            java.lang.String r8 = r15.getCareOf()
            java.lang.String r9 = "S/O: "
            goto L_0x01ac
        L_0x0220:
            java.lang.CharSequence r15 = km.q.B0(r15)
            java.lang.String r15 = r15.toString()
            km.f r8 = new km.f
            r8.<init>((java.lang.String) r5)
            java.util.List r15 = r8.d(r15, r7)
            java.lang.Object r5 = ql.y.U(r15)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = ql.y.e0(r15)
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r15.size()
            if (r9 <= r6) goto L_0x024a
            java.lang.Object r15 = r15.get(r0)
            r4 = r15
            java.lang.String r4 = (java.lang.String) r4
        L_0x024a:
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0252
            cm.l.v(r1)
            r15 = r2
        L_0x0252:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.f28175z
            r15.setText(r5)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x025f
            cm.l.v(r1)
            r15 = r2
        L_0x025f:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.D
            r15.setText(r8)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x026c
            cm.l.v(r1)
            r15 = r2
        L_0x026c:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.G
            r15.setText(r4)
        L_0x0271:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x0279
            cm.l.v(r3)
            r15 = r2
        L_0x0279:
            java.lang.String r15 = r15.getGender()
            boolean r15 = com.nic.mparivahan.dlservices.utilities.d.d(r15)
            if (r15 == 0) goto L_0x0388
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x028b
            cm.l.v(r3)
            r15 = r2
        L_0x028b:
            java.lang.String r15 = r15.getGender()
            java.lang.String r4 = "M"
            boolean r4 = cm.l.a(r15, r4)
            if (r4 == 0) goto L_0x02eb
            java.lang.String r15 = "1"
            r14.W = r15
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02a3
            cm.l.v(r1)
            r15 = r2
        L_0x02a3:
            android.widget.RadioButton r15 = r15.K
            r15.setChecked(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02b0
            cm.l.v(r1)
            r15 = r2
        L_0x02b0:
            android.widget.RadioButton r15 = r15.I
            r15.setChecked(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02bd
            cm.l.v(r1)
            r15 = r2
        L_0x02bd:
            android.widget.RadioButton r15 = r15.L
            r15.setChecked(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02ca
            cm.l.v(r1)
            r15 = r2
        L_0x02ca:
            android.widget.RadioButton r15 = r15.K
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02d7
            cm.l.v(r1)
            r15 = r2
        L_0x02d7:
            android.widget.RadioButton r15 = r15.I
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02e4
        L_0x02e0:
            cm.l.v(r1)
            r15 = r2
        L_0x02e4:
            android.widget.RadioButton r15 = r15.L
            r15.setEnabled(r7)
            goto L_0x03af
        L_0x02eb:
            java.lang.String r4 = "F"
            boolean r15 = cm.l.a(r15, r4)
            if (r15 == 0) goto L_0x033d
            java.lang.String r15 = "2"
            r14.W = r15
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02ff
            cm.l.v(r1)
            r15 = r2
        L_0x02ff:
            android.widget.RadioButton r15 = r15.K
            r15.setChecked(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x030c
            cm.l.v(r1)
            r15 = r2
        L_0x030c:
            android.widget.RadioButton r15 = r15.I
            r15.setChecked(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0319
            cm.l.v(r1)
            r15 = r2
        L_0x0319:
            android.widget.RadioButton r15 = r15.L
            r15.setChecked(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0326
            cm.l.v(r1)
            r15 = r2
        L_0x0326:
            android.widget.RadioButton r15 = r15.K
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0333
            cm.l.v(r1)
            r15 = r2
        L_0x0333:
            android.widget.RadioButton r15 = r15.I
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02e4
            goto L_0x02e0
        L_0x033d:
            java.lang.String r15 = "0"
            r14.W = r15
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0349
            cm.l.v(r1)
            r15 = r2
        L_0x0349:
            android.widget.RadioButton r15 = r15.K
            r15.setChecked(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0356
            cm.l.v(r1)
            r15 = r2
        L_0x0356:
            android.widget.RadioButton r15 = r15.I
            r15.setChecked(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0363
            cm.l.v(r1)
            r15 = r2
        L_0x0363:
            android.widget.RadioButton r15 = r15.L
            r15.setChecked(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0370
            cm.l.v(r1)
            r15 = r2
        L_0x0370:
            android.widget.RadioButton r15 = r15.K
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x037d
            cm.l.v(r1)
            r15 = r2
        L_0x037d:
            android.widget.RadioButton r15 = r15.I
            r15.setEnabled(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x02e4
            goto L_0x02e0
        L_0x0388:
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0390
            cm.l.v(r1)
            r15 = r2
        L_0x0390:
            android.widget.RadioButton r15 = r15.K
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x039d
            cm.l.v(r1)
            r15 = r2
        L_0x039d:
            android.widget.RadioButton r15 = r15.I
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x03aa
            cm.l.v(r1)
            r15 = r2
        L_0x03aa:
            android.widget.RadioButton r15 = r15.L
            r15.setEnabled(r0)
        L_0x03af:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x03b7
            cm.l.v(r3)
            r15 = r2
        L_0x03b7:
            int r15 = r15.getPhone()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r15 = com.nic.mparivahan.dlservices.utilities.d.d(r15)
            java.lang.String r4 = "session"
            if (r15 == 0) goto L_0x042f
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x03cf
            cm.l.v(r3)
            r15 = r2
        L_0x03cf:
            int r15 = r15.getPhone()
            if (r15 <= 0) goto L_0x042f
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x03dd
            cm.l.v(r1)
            r15 = r2
        L_0x03dd:
            androidx.appcompat.widget.AppCompatTextView r15 = r15.T
            ld.c r5 = r14.N
            if (r5 != 0) goto L_0x03e7
            cm.l.v(r4)
            r5 = r2
        L_0x03e7:
            r4 = 2132017343(0x7f1400bf, float:1.9672962E38)
            java.lang.String r4 = r14.getString(r4)
            java.lang.String r8 = "applicant_mob_no"
            java.lang.String r4 = r5.b(r8, r4)
            r15.setText(r4)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x03ff
            cm.l.v(r1)
            r15 = r2
        L_0x03ff:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.U
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r14.f21855c0
            if (r4 != 0) goto L_0x0409
            cm.l.v(r3)
            r4 = r2
        L_0x0409:
            int r4 = r4.getPhone()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r15.setText(r4)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x041c
            cm.l.v(r1)
            r15 = r2
        L_0x041c:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.U
            r15.setFocusable(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0429
            cm.l.v(r1)
            r15 = r2
        L_0x0429:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.U
            r15.setEnabled(r7)
            goto L_0x047c
        L_0x042f:
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0437
            cm.l.v(r1)
            r15 = r2
        L_0x0437:
            androidx.appcompat.widget.AppCompatTextView r15 = r15.T
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            ld.c r8 = r14.N
            if (r8 != 0) goto L_0x0446
            cm.l.v(r4)
            r8 = r2
        L_0x0446:
            r4 = 2132017342(0x7f1400be, float:1.967296E38)
            java.lang.String r4 = r14.getString(r4)
            java.lang.String r9 = "applicant_mobile_as_aadhaar"
            java.lang.String r4 = r8.b(r9, r4)
            r5.append(r4)
            java.lang.String r4 = " *"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r15.setText(r4)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x046a
            cm.l.v(r1)
            r15 = r2
        L_0x046a:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.U
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0477
            cm.l.v(r1)
            r15 = r2
        L_0x0477:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.U
            r15.setEnabled(r0)
        L_0x047c:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x0484
            cm.l.v(r3)
            r15 = r2
        L_0x0484:
            java.lang.String r15 = r15.getDob()
            boolean r15 = com.nic.mparivahan.dlservices.utilities.d.d(r15)
            if (r15 == 0) goto L_0x0507
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0496
            cm.l.v(r1)
            r15 = r2
        L_0x0496:
            android.widget.TextView r15 = r15.Z
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r14.f21855c0
            if (r4 != 0) goto L_0x04a0
            cm.l.v(r3)
            r4 = r2
        L_0x04a0:
            java.lang.String r4 = r4.getDob()
            r15.setText(r4)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x04af
            cm.l.v(r1)
            r15 = r2
        L_0x04af:
            android.widget.TextView r15 = r15.Z
            r15.setClickable(r7)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x04bc
            cm.l.v(r1)
            r15 = r2
        L_0x04bc:
            android.widget.TextView r15 = r15.Z
            r15.setEnabled(r7)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r14.f21855c0
            if (r15 != 0) goto L_0x04c9
            cm.l.v(r3)
            goto L_0x04ca
        L_0x04c9:
            r2 = r15
        L_0x04ca:
            java.lang.String r15 = r2.getDob()
            java.lang.CharSequence r15 = km.q.B0(r15)
            java.lang.String r15 = r15.toString()
            km.f r1 = new km.f
            java.lang.String r2 = "-"
            r1.<init>((java.lang.String) r2)
            java.util.List r15 = r1.d(r15, r7)
            java.lang.Object r1 = r15.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.Object r0 = r15.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Object r15 = r15.get(r6)
            java.lang.String r15 = (java.lang.String) r15
            int r15 = java.lang.Integer.parseInt(r15)
            int r15 = r14.G1(r1, r0, r15)
            r14.X = r15
            goto L_0x05db
        L_0x0507:
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x050f
            cm.l.v(r1)
            r15 = r2
        L_0x050f:
            android.widget.TextView r15 = r15.Z
            r15.setClickable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x051c
            cm.l.v(r1)
            goto L_0x051d
        L_0x051c:
            r2 = r15
        L_0x051d:
            android.widget.TextView r15 = r2.Z
            r15.setEnabled(r0)
            goto L_0x05db
        L_0x0524:
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x052c
            cm.l.v(r1)
            r15 = r2
        L_0x052c:
            android.widget.EditText r15 = r15.f28174y
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0539
            cm.l.v(r1)
            r15 = r2
        L_0x0539:
            android.widget.EditText r15 = r15.C
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0546
            cm.l.v(r1)
            r15 = r2
        L_0x0546:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.F
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0553
            cm.l.v(r1)
            r15 = r2
        L_0x0553:
            android.widget.EditText r15 = r15.f28161f0
            r15.setFocusable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0560
            cm.l.v(r1)
            r15 = r2
        L_0x0560:
            android.widget.RadioButton r15 = r15.K
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x056d
            cm.l.v(r1)
            r15 = r2
        L_0x056d:
            android.widget.RadioButton r15 = r15.I
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x057a
            cm.l.v(r1)
            r15 = r2
        L_0x057a:
            android.widget.RadioButton r15 = r15.L
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0587
            cm.l.v(r1)
            r15 = r2
        L_0x0587:
            android.widget.TextView r15 = r15.Z
            r15.setClickable(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x0594
            cm.l.v(r1)
            r15 = r2
        L_0x0594:
            android.widget.TextView r15 = r15.Z
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x05a1
            cm.l.v(r1)
            r15 = r2
        L_0x05a1:
            android.widget.EditText r15 = r15.f28174y
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x05ae
            cm.l.v(r1)
            r15 = r2
        L_0x05ae:
            android.widget.EditText r15 = r15.C
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x05bb
            cm.l.v(r1)
            r15 = r2
        L_0x05bb:
            androidx.appcompat.widget.AppCompatEditText r15 = r15.F
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x05c8
            cm.l.v(r1)
            r15 = r2
        L_0x05c8:
            android.widget.EditText r15 = r15.f28161f0
            r15.setEnabled(r0)
            ni.q6 r15 = r14.G
            if (r15 != 0) goto L_0x05d5
            cm.l.v(r1)
            goto L_0x05d6
        L_0x05d5:
            r2 = r15
        L_0x05d6:
            androidx.appcompat.widget.AppCompatEditText r15 = r2.U
            r15.setEnabled(r0)
        L_0x05db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen.X1(boolean):void");
    }

    public final int G1(int i10, int i11, int i12) {
        return Period.between(LocalDate.of(i12, i11, i10), LocalDate.now()).getYears();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q6 x10 = q6.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        xj.b bVar = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = v9.e.f17509a;
        q6 q6Var = this.G;
        if (q6Var == null) {
            cm.l.v("binding");
            q6Var = null;
        }
        aVar.b1(this, q6Var);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stateCd");
            cm.l.c(stringExtra);
            this.Y = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("rtoCd");
            cm.l.c(stringExtra2);
            this.Z = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("rtoName");
            cm.l.c(stringExtra3);
            this.f21853a0 = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("inputMobileNo");
            cm.l.c(stringExtra4);
            this.f21854b0 = stringExtra4;
            if (getIntent().hasExtra("dataFromAadhar") && getIntent().getBooleanExtra("dataFromAadhar", false)) {
                Parcelable parcelableExtra = getIntent().getParcelableExtra("aadharData");
                cm.l.c(parcelableExtra);
                this.f21855c0 = (Aadarkyc.DOEkyc) parcelableExtra;
                this.f21856d0 = getIntent().getLongExtra("ekycId", 0);
                this.f21857e0 = getIntent().getBooleanExtra("dataFromAadhar", false);
                String stringExtra5 = getIntent().getStringExtra("aadhaarLastFourDigitMobileNo");
                cm.l.c(stringExtra5);
                this.f21858f0 = stringExtra5;
            }
        }
        F1();
        this.P = NewLLServices.f22242a.a(this);
        NewLLServices newLLServices = this.P;
        if (newLLServices == null) {
            cm.l.v("service");
            newLLServices = null;
        }
        this.O = (xj.b) new u0((x0) this, (u0.b) new yj.a(new xj.a(newLLServices))).a(xj.b.class);
        this.N = new ld.c(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.L = progressDialog;
        progressDialog.setCancelable(false);
        ProgressDialog progressDialog2 = this.L;
        if (progressDialog2 == null) {
            cm.l.v("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.L;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        ld.c cVar = this.N;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        progressDialog3.setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        I1();
        J1();
        H1();
        K1();
        boolean z10 = this.f21857e0;
        if (z10) {
            X1(z10);
        }
        xj.b bVar2 = this.O;
        if (bVar2 == null) {
            cm.l.v("learnerLicenceVM");
            bVar2 = null;
        }
        bVar2.n().g(this, new m(new i(this)));
        xj.b bVar3 = this.O;
        if (bVar3 == null) {
            cm.l.v("learnerLicenceVM");
            bVar3 = null;
        }
        bVar3.s().g(this, new m(new j(this)));
        xj.b bVar4 = this.O;
        if (bVar4 == null) {
            cm.l.v("learnerLicenceVM");
            bVar4 = null;
        }
        bVar4.j().g(this, new m(new k(this)));
        xj.b bVar5 = this.O;
        if (bVar5 == null) {
            cm.l.v("learnerLicenceVM");
        } else {
            bVar = bVar5;
        }
        bVar.u().g(this, new m(new l(this)));
    }
}
