package com.nic.mparivahan.dlservices.newlearner;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.g;
import bj.i;
import bj.j;
import bj.k;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.DrivingSchoolMasterModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.DrivingSchoolResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.LearnerLicenceClasDatasModal;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kk.e;
import ni.j2;
import pl.x;
import v9.e;

public final class AddLLDrivingSchoolActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public j2 G;
    public ProgressDialog H;
    private xj.b I;
    private NewLLServices J;
    /* access modifiers changed from: private */
    public ArrayList K = new ArrayList();
    public ld.c L;
    public ld.f M;
    /* access modifiers changed from: private */
    public ArrayList N = new ArrayList();
    private int O;
    private ArrayList P = new ArrayList();
    private cj.b Q;
    private Calendar R = Calendar.getInstance();
    private int S = -1;
    /* access modifiers changed from: private */
    public boolean T;
    private SharedPreferences U;
    private String V = "";

    public static final class a extends n6.b {
        a() {
        }
    }

    public static final class b implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddLLDrivingSchoolActivity f21678a;

        b(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity) {
            this.f21678a = addLLDrivingSchoolActivity;
        }

        public void a(String str, int i10) {
            String covCode = ((LearnerLicenceClasDatasModal) this.f21678a.K.get(i10)).getCovCode();
            j2 s12 = this.f21678a.G;
            j2 j2Var = null;
            if (s12 == null) {
                l.v("binding");
                s12 = null;
            }
            s12.X.setText(str);
            j2 s13 = this.f21678a.G;
            if (s13 == null) {
                l.v("binding");
                s13 = null;
            }
            s13.X.setContentDescription(covCode);
            j2 s14 = this.f21678a.G;
            if (s14 == null) {
                l.v("binding");
                s14 = null;
            }
            if (p.o(s14.X.getText().toString(), "Select", true)) {
                j2 s15 = this.f21678a.G;
                if (s15 == null) {
                    l.v("binding");
                    s15 = null;
                }
                s15.P.setVisibility(8);
                j2 s16 = this.f21678a.G;
                if (s16 == null) {
                    l.v("binding");
                } else {
                    j2Var = s16;
                }
                j2Var.S.setVisibility(8);
            } else {
                j2 s17 = this.f21678a.G;
                if (s17 == null) {
                    l.v("binding");
                    s17 = null;
                }
                s17.P.setVisibility(0);
                j2 s18 = this.f21678a.G;
                if (s18 == null) {
                    l.v("binding");
                } else {
                    j2Var = s18;
                }
                j2Var.S.setVisibility(0);
            }
            this.f21678a.T = false;
        }
    }

    public static final class c implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddLLDrivingSchoolActivity f21679a;

        c(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity) {
            this.f21679a = addLLDrivingSchoolActivity;
        }

        public void a(String str, int i10) {
            String drivingSchoolCode = ((DrivingSchoolMasterModal) this.f21679a.N.get(i10)).getDrivingSchoolCode();
            j2 s12 = this.f21679a.G;
            j2 j2Var = null;
            if (s12 == null) {
                l.v("binding");
                s12 = null;
            }
            s12.G.setText(str);
            j2 s13 = this.f21679a.G;
            if (s13 == null) {
                l.v("binding");
            } else {
                j2Var = s13;
            }
            j2Var.G.setContentDescription(drivingSchoolCode);
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddLLDrivingSchoolActivity f21680e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity) {
            super(1);
            this.f21680e = addLLDrivingSchoolActivity;
        }

        public final void b(DrivingSchoolResponseModal drivingSchoolResponseModal) {
            try {
                if (this.f21680e.E1().isShowing()) {
                    this.f21680e.E1().dismiss();
                }
                if (p.o(drivingSchoolResponseModal.getStatusDesc(), "Success", true)) {
                    AddLLDrivingSchoolActivity addLLDrivingSchoolActivity = this.f21680e;
                    ArrayList<DrivingSchoolMasterModal> drivingSchoolMasterList = drivingSchoolResponseModal.getDrivingSchoolMasterList();
                    l.c(drivingSchoolMasterList);
                    addLLDrivingSchoolActivity.N = drivingSchoolMasterList;
                }
            } catch (Exception unused) {
                if (this.f21680e.E1().isShowing()) {
                    this.f21680e.E1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DrivingSchoolResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddLLDrivingSchoolActivity f21681e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity) {
            super(1);
            this.f21681e = addLLDrivingSchoolActivity;
        }

        public final void b(String str) {
            if (this.f21681e.E1().isShowing()) {
                this.f21681e.E1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21682a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f21682a = lVar;
        }

        public final pl.c a() {
            return this.f21682a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21682a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void B1() {
        try {
            if (E1().isShowing()) {
                E1().dismiss();
            }
            E1().show();
            xj.b bVar = this.I;
            if (bVar == null) {
                l.v("viewModal");
                bVar = null;
            }
            bVar.p(this.V);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (E1().isShowing()) {
                E1().dismiss();
            }
        }
    }

    private final void C1() {
        if (getIntent().hasExtra("stateCd")) {
            String stringExtra = getIntent().getStringExtra("stateCd");
            l.c(stringExtra);
            this.V = stringExtra;
        }
        if (getIntent().hasExtra("selectedVehicleClassId")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("selectedVehicleClassId");
            l.c(parcelableArrayListExtra);
            this.K = parcelableArrayListExtra;
        }
        SharedPreferences sharedPreferences = this.U;
        if (sharedPreferences == null) {
            l.v("pref");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("addedDSchoolDetails", (String) null);
        if (com.nic.mparivahan.dlservices.utilities.d.d(string)) {
            Type b10 = new a().b();
            l.e(b10, "getType(...)");
            Object k10 = new i7.d().k(string, b10);
            l.e(k10, "fromJson(...)");
            this.P = (ArrayList) k10;
        }
        if (this.P.size() > 0) {
            Y1(this.P);
        }
        if (this.K.size() > 0 && this.K.size() > 0) {
            int size = this.P.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (l.a(((LearnerLicenceClasDatasModal) this.K.get(0)).getCovCode(), ((DrivingSchoolDetRequestModal) this.P.get(i10)).getCovcd())) {
                    this.K.remove(0);
                }
            }
        }
    }

    private final void G1() {
        j2 j2Var = this.G;
        j2 j2Var2 = null;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        j2Var.V.setFocusable(false);
        j2 j2Var3 = this.G;
        if (j2Var3 == null) {
            l.v("binding");
            j2Var3 = null;
        }
        j2Var3.T.setFocusable(false);
        j2 j2Var4 = this.G;
        if (j2Var4 == null) {
            l.v("binding");
            j2Var4 = null;
        }
        j2Var4.f26927z.setFocusable(false);
        j2 j2Var5 = this.G;
        if (j2Var5 == null) {
            l.v("binding");
            j2Var5 = null;
        }
        j2Var5.H.setFocusable(false);
        X1(new ld.f(this));
        V1(new ld.c(this));
        W1(new ProgressDialog(this));
        E1().setMessage(D1().b("label_challan_please_wait", getString(R.string.please_wait)));
        E1().setCancelable(true);
        E1().setCanceledOnTouchOutside(true);
        j2 j2Var6 = this.G;
        if (j2Var6 == null) {
            l.v("binding");
            j2Var6 = null;
        }
        j2Var6.M.f28452f.setText(F1().i());
        this.J = NewLLServices.f22242a.a(this);
        NewLLServices newLLServices = this.J;
        if (newLLServices == null) {
            l.v("service");
            newLLServices = null;
        }
        this.I = (xj.b) new u0((x0) this, (u0.b) new yj.a(new xj.a(newLLServices))).a(xj.b.class);
        j2 j2Var7 = this.G;
        if (j2Var7 == null) {
            l.v("binding");
            j2Var7 = null;
        }
        j2Var7.X.setOnClickListener(new bj.a(this));
        j2 j2Var8 = this.G;
        if (j2Var8 == null) {
            l.v("binding");
            j2Var8 = null;
        }
        j2Var8.S.setOnClickListener(new bj.h(this));
        j2 j2Var9 = this.G;
        if (j2Var9 == null) {
            l.v("binding");
            j2Var9 = null;
        }
        j2Var9.R.setOnCheckedChangeListener(new i(this));
        j2 j2Var10 = this.G;
        if (j2Var10 == null) {
            l.v("binding");
            j2Var10 = null;
        }
        j2Var10.G.setOnClickListener(new j(this));
        k kVar = new k(this);
        j2 j2Var11 = this.G;
        if (j2Var11 == null) {
            l.v("binding");
            j2Var11 = null;
        }
        j2Var11.V.setOnClickListener(new bj.l(this, kVar));
        j2 j2Var12 = this.G;
        if (j2Var12 == null) {
            l.v("binding");
            j2Var12 = null;
        }
        j2Var12.T.setOnClickListener(new bj.m(this, kVar));
        j2 j2Var13 = this.G;
        if (j2Var13 == null) {
            l.v("binding");
            j2Var13 = null;
        }
        j2Var13.f26927z.setOnClickListener(new bj.b(this, kVar));
        j2 j2Var14 = this.G;
        if (j2Var14 == null) {
            l.v("binding");
            j2Var14 = null;
        }
        j2Var14.H.setOnClickListener(new bj.c(this, kVar));
        j2 j2Var15 = this.G;
        if (j2Var15 == null) {
            l.v("binding");
            j2Var15 = null;
        }
        j2Var15.O.setOnClickListener(new bj.d(this));
        j2 j2Var16 = this.G;
        if (j2Var16 == null) {
            l.v("binding");
            j2Var16 = null;
        }
        j2Var16.N.setOnClickListener(new bj.e(this));
        j2 j2Var17 = this.G;
        if (j2Var17 == null) {
            l.v("binding");
            j2Var17 = null;
        }
        j2Var17.f26926y.setOnClickListener(new bj.f(this));
        j2 j2Var18 = this.G;
        if (j2Var18 == null) {
            l.v("binding");
        } else {
            j2Var2 = j2Var18;
        }
        j2Var2.M.f28448b.setOnClickListener(new g(this));
    }

    /* access modifiers changed from: private */
    public static final void H1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        if (addLLDrivingSchoolActivity.K.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (LearnerLicenceClasDatasModal covName : addLLDrivingSchoolActivity.K) {
                arrayList.add(covName.getCovName());
            }
            kk.e a10 = kk.e.A0.a(addLLDrivingSchoolActivity.D1().b("select_class_vehicle", addLLDrivingSchoolActivity.getString(R.string.select_class_of_vehcile)), arrayList);
            a10.k2(addLLDrivingSchoolActivity.F0(), "DSchoolPicker");
            a10.n2(new b(addLLDrivingSchoolActivity));
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addLLDrivingSchoolActivity.O = 0;
        addLLDrivingSchoolActivity.x1(onDateSetListener);
    }

    /* access modifiers changed from: private */
    public static final void J1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, View view) {
        ld.c D1;
        String string;
        String str;
        l.f(addLLDrivingSchoolActivity, "this$0");
        j2 j2Var = addLLDrivingSchoolActivity.G;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        if (j2Var.G.getText().toString().length() == 0) {
            D1 = addLLDrivingSchoolActivity.D1();
            string = addLLDrivingSchoolActivity.getString(R.string.select_d_school);
            str = "select_d_school";
        } else {
            j2 j2Var2 = addLLDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
                j2Var2 = null;
            }
            if (String.valueOf(j2Var2.K.getText()).length() == 0) {
                D1 = addLLDrivingSchoolActivity.D1();
                string = addLLDrivingSchoolActivity.getString(R.string.enter_enrollment_no);
                str = "enter_enrollement_no";
            } else {
                j2 j2Var3 = addLLDrivingSchoolActivity.G;
                if (j2Var3 == null) {
                    l.v("binding");
                    j2Var3 = null;
                }
                if (String.valueOf(j2Var3.H.getText()).length() == 0) {
                    D1 = addLLDrivingSchoolActivity.D1();
                    string = addLLDrivingSchoolActivity.getString(R.string.enter_enrollment_date);
                    str = "enter_enrollement_date";
                } else {
                    j2 j2Var4 = addLLDrivingSchoolActivity.G;
                    if (j2Var4 == null) {
                        l.v("binding");
                        j2Var4 = null;
                    }
                    if (String.valueOf(j2Var4.B.getText()).length() == 0) {
                        D1 = addLLDrivingSchoolActivity.D1();
                        string = addLLDrivingSchoolActivity.getString(R.string.enter_certificate_number);
                        str = "enter_certificate_number";
                    } else {
                        j2 j2Var5 = addLLDrivingSchoolActivity.G;
                        if (j2Var5 == null) {
                            l.v("binding");
                            j2Var5 = null;
                        }
                        if (String.valueOf(j2Var5.f26927z.getText()).length() == 0) {
                            D1 = addLLDrivingSchoolActivity.D1();
                            string = addLLDrivingSchoolActivity.getString(R.string.enter_certificate_date);
                            str = "enter_certificate_date";
                        } else {
                            j2 j2Var6 = addLLDrivingSchoolActivity.G;
                            if (j2Var6 == null) {
                                l.v("binding");
                                j2Var6 = null;
                            }
                            if (String.valueOf(j2Var6.T.getText()).length() == 0) {
                                D1 = addLLDrivingSchoolActivity.D1();
                                string = addLLDrivingSchoolActivity.getString(R.string.enter_trained_from);
                                str = "enter_trained_from";
                            } else {
                                j2 j2Var7 = addLLDrivingSchoolActivity.G;
                                if (j2Var7 == null) {
                                    l.v("binding");
                                    j2Var7 = null;
                                }
                                if (String.valueOf(j2Var7.V.getText()).length() == 0) {
                                    D1 = addLLDrivingSchoolActivity.D1();
                                    string = addLLDrivingSchoolActivity.getString(R.string.enter_trained_to);
                                    str = "enter_trained_to";
                                } else {
                                    j2 j2Var8 = addLLDrivingSchoolActivity.G;
                                    if (j2Var8 == null) {
                                        l.v("binding");
                                        j2Var8 = null;
                                    }
                                    String valueOf = String.valueOf(j2Var8.f26927z.getText());
                                    j2 j2Var9 = addLLDrivingSchoolActivity.G;
                                    if (j2Var9 == null) {
                                        l.v("binding");
                                        j2Var9 = null;
                                    }
                                    if (addLLDrivingSchoolActivity.z1(valueOf, String.valueOf(j2Var9.H.getText()))) {
                                        D1 = addLLDrivingSchoolActivity.D1();
                                        string = addLLDrivingSchoolActivity.getString(R.string.certificate_date_error);
                                        str = "enrollment_date_error";
                                    } else {
                                        j2 j2Var10 = addLLDrivingSchoolActivity.G;
                                        if (j2Var10 == null) {
                                            l.v("binding");
                                            j2Var10 = null;
                                        }
                                        String valueOf2 = String.valueOf(j2Var10.V.getText());
                                        j2 j2Var11 = addLLDrivingSchoolActivity.G;
                                        if (j2Var11 == null) {
                                            l.v("binding");
                                            j2Var11 = null;
                                        }
                                        if (addLLDrivingSchoolActivity.z1(valueOf2, String.valueOf(j2Var11.T.getText()))) {
                                            D1 = addLLDrivingSchoolActivity.D1();
                                            string = addLLDrivingSchoolActivity.getString(R.string.training_date_error);
                                            str = "training_from_date_error";
                                        } else {
                                            j2 j2Var12 = addLLDrivingSchoolActivity.G;
                                            if (j2Var12 == null) {
                                                l.v("binding");
                                                j2Var12 = null;
                                            }
                                            String valueOf3 = String.valueOf(j2Var12.H.getText());
                                            j2 j2Var13 = addLLDrivingSchoolActivity.G;
                                            if (j2Var13 == null) {
                                                l.v("binding");
                                                j2Var13 = null;
                                            }
                                            String obj = j2Var13.X.getContentDescription().toString();
                                            j2 j2Var14 = addLLDrivingSchoolActivity.G;
                                            if (j2Var14 == null) {
                                                l.v("binding");
                                                j2Var14 = null;
                                            }
                                            String valueOf4 = String.valueOf(j2Var14.V.getText());
                                            j2 j2Var15 = addLLDrivingSchoolActivity.G;
                                            if (j2Var15 == null) {
                                                l.v("binding");
                                                j2Var15 = null;
                                            }
                                            String valueOf5 = String.valueOf(j2Var15.f26927z.getText());
                                            j2 j2Var16 = addLLDrivingSchoolActivity.G;
                                            if (j2Var16 == null) {
                                                l.v("binding");
                                                j2Var16 = null;
                                            }
                                            String valueOf6 = String.valueOf(j2Var16.B.getText());
                                            j2 j2Var17 = addLLDrivingSchoolActivity.G;
                                            if (j2Var17 == null) {
                                                l.v("binding");
                                                j2Var17 = null;
                                            }
                                            String valueOf7 = String.valueOf(j2Var17.K.getText());
                                            j2 j2Var18 = addLLDrivingSchoolActivity.G;
                                            if (j2Var18 == null) {
                                                l.v("binding");
                                                j2Var18 = null;
                                            }
                                            String obj2 = j2Var18.G.getContentDescription().toString();
                                            j2 j2Var19 = addLLDrivingSchoolActivity.G;
                                            if (j2Var19 == null) {
                                                l.v("binding");
                                                j2Var19 = null;
                                            }
                                            String valueOf8 = String.valueOf(j2Var19.T.getText());
                                            j2 j2Var20 = addLLDrivingSchoolActivity.G;
                                            if (j2Var20 == null) {
                                                l.v("binding");
                                                j2Var20 = null;
                                            }
                                            String obj3 = j2Var20.X.getText().toString();
                                            j2 j2Var21 = addLLDrivingSchoolActivity.G;
                                            if (j2Var21 == null) {
                                                l.v("binding");
                                                j2Var21 = null;
                                            }
                                            DrivingSchoolDetRequestModal drivingSchoolDetRequestModal = new DrivingSchoolDetRequestModal(valueOf3, obj, valueOf4, valueOf5, valueOf6, valueOf7, obj2, valueOf8, obj3, j2Var21.G.getText().toString());
                                            j2 j2Var22 = addLLDrivingSchoolActivity.G;
                                            if (j2Var22 == null) {
                                                l.v("binding");
                                                j2Var22 = null;
                                            }
                                            if (l.a(j2Var22.O.getText(), addLLDrivingSchoolActivity.D1().b("btn_Update", addLLDrivingSchoolActivity.getString(R.string.update)))) {
                                                j2 j2Var23 = addLLDrivingSchoolActivity.G;
                                                if (j2Var23 == null) {
                                                    l.v("binding");
                                                    j2Var23 = null;
                                                }
                                                j2Var23.X.setClickable(true);
                                                addLLDrivingSchoolActivity.P.set(addLLDrivingSchoolActivity.S, drivingSchoolDetRequestModal);
                                                j2 j2Var24 = addLLDrivingSchoolActivity.G;
                                                if (j2Var24 == null) {
                                                    l.v("binding");
                                                    j2Var24 = null;
                                                }
                                                j2Var24.O.setText(addLLDrivingSchoolActivity.D1().b("label_save", addLLDrivingSchoolActivity.getString(R.string.save)));
                                            } else {
                                                addLLDrivingSchoolActivity.P.add(drivingSchoolDetRequestModal);
                                            }
                                            addLLDrivingSchoolActivity.Y1(addLLDrivingSchoolActivity.P);
                                            j2 j2Var25 = addLLDrivingSchoolActivity.G;
                                            if (j2Var25 == null) {
                                                l.v("binding");
                                                j2Var25 = null;
                                            }
                                            j2Var25.H.setText("");
                                            j2 j2Var26 = addLLDrivingSchoolActivity.G;
                                            if (j2Var26 == null) {
                                                l.v("binding");
                                                j2Var26 = null;
                                            }
                                            j2Var26.V.setText("");
                                            j2 j2Var27 = addLLDrivingSchoolActivity.G;
                                            if (j2Var27 == null) {
                                                l.v("binding");
                                                j2Var27 = null;
                                            }
                                            j2Var27.T.setText("");
                                            j2 j2Var28 = addLLDrivingSchoolActivity.G;
                                            if (j2Var28 == null) {
                                                l.v("binding");
                                                j2Var28 = null;
                                            }
                                            j2Var28.B.setText("");
                                            j2 j2Var29 = addLLDrivingSchoolActivity.G;
                                            if (j2Var29 == null) {
                                                l.v("binding");
                                                j2Var29 = null;
                                            }
                                            j2Var29.f26927z.setText("");
                                            j2 j2Var30 = addLLDrivingSchoolActivity.G;
                                            if (j2Var30 == null) {
                                                l.v("binding");
                                                j2Var30 = null;
                                            }
                                            j2Var30.K.setText("");
                                            j2 j2Var31 = addLLDrivingSchoolActivity.G;
                                            if (j2Var31 == null) {
                                                l.v("binding");
                                                j2Var31 = null;
                                            }
                                            j2Var31.X.setText("");
                                            j2 j2Var32 = addLLDrivingSchoolActivity.G;
                                            if (j2Var32 == null) {
                                                l.v("binding");
                                                j2Var32 = null;
                                            }
                                            j2Var32.G.setText("");
                                            j2 j2Var33 = addLLDrivingSchoolActivity.G;
                                            if (j2Var33 == null) {
                                                l.v("binding");
                                                j2Var33 = null;
                                            }
                                            j2Var33.S.setVisibility(8);
                                            j2 j2Var34 = addLLDrivingSchoolActivity.G;
                                            if (j2Var34 == null) {
                                                l.v("binding");
                                                j2Var34 = null;
                                            }
                                            j2Var34.R.setChecked(false);
                                            j2 j2Var35 = addLLDrivingSchoolActivity.G;
                                            if (j2Var35 == null) {
                                                l.v("binding");
                                                j2Var35 = null;
                                            }
                                            if (l.a(j2Var35.O.getText(), addLLDrivingSchoolActivity.D1().b("label_save", addLLDrivingSchoolActivity.getString(R.string.save)))) {
                                                int size = addLLDrivingSchoolActivity.K.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    String covCode = ((LearnerLicenceClasDatasModal) addLLDrivingSchoolActivity.K.get(i10)).getCovCode();
                                                    j2 j2Var36 = addLLDrivingSchoolActivity.G;
                                                    if (j2Var36 == null) {
                                                        l.v("binding");
                                                        j2Var36 = null;
                                                    }
                                                    if (l.a(covCode, j2Var36.X.getContentDescription().toString())) {
                                                        addLLDrivingSchoolActivity.K.remove(i10);
                                                        return;
                                                    }
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Toast.makeText(addLLDrivingSchoolActivity, D1.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void K1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, View view) {
        ld.c D1;
        String string;
        String str;
        l.f(addLLDrivingSchoolActivity, "this$0");
        j2 j2Var = addLLDrivingSchoolActivity.G;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        if (j2Var.G.getText().toString().length() == 0) {
            D1 = addLLDrivingSchoolActivity.D1();
            string = addLLDrivingSchoolActivity.getString(R.string.select_d_school);
            str = "select_d_school";
        } else {
            j2 j2Var2 = addLLDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
                j2Var2 = null;
            }
            if (String.valueOf(j2Var2.K.getText()).length() == 0) {
                D1 = addLLDrivingSchoolActivity.D1();
                string = addLLDrivingSchoolActivity.getString(R.string.enter_enrollment_no);
                str = "enter_enrollement_no";
            } else {
                j2 j2Var3 = addLLDrivingSchoolActivity.G;
                if (j2Var3 == null) {
                    l.v("binding");
                    j2Var3 = null;
                }
                if (String.valueOf(j2Var3.H.getText()).length() == 0) {
                    D1 = addLLDrivingSchoolActivity.D1();
                    string = addLLDrivingSchoolActivity.getString(R.string.enter_enrollment_date);
                    str = "enter_enrollement_date";
                } else {
                    j2 j2Var4 = addLLDrivingSchoolActivity.G;
                    if (j2Var4 == null) {
                        l.v("binding");
                        j2Var4 = null;
                    }
                    if (String.valueOf(j2Var4.B.getText()).length() == 0) {
                        D1 = addLLDrivingSchoolActivity.D1();
                        string = addLLDrivingSchoolActivity.getString(R.string.enter_certificate_number);
                        str = "enter_certificate_number";
                    } else {
                        j2 j2Var5 = addLLDrivingSchoolActivity.G;
                        if (j2Var5 == null) {
                            l.v("binding");
                            j2Var5 = null;
                        }
                        if (String.valueOf(j2Var5.f26927z.getText()).length() == 0) {
                            D1 = addLLDrivingSchoolActivity.D1();
                            string = addLLDrivingSchoolActivity.getString(R.string.enter_certificate_date);
                            str = "enter_certificate_date";
                        } else {
                            j2 j2Var6 = addLLDrivingSchoolActivity.G;
                            if (j2Var6 == null) {
                                l.v("binding");
                                j2Var6 = null;
                            }
                            if (String.valueOf(j2Var6.T.getText()).length() == 0) {
                                D1 = addLLDrivingSchoolActivity.D1();
                                string = addLLDrivingSchoolActivity.getString(R.string.enter_trained_from);
                                str = "enter_trained_from";
                            } else {
                                j2 j2Var7 = addLLDrivingSchoolActivity.G;
                                if (j2Var7 == null) {
                                    l.v("binding");
                                    j2Var7 = null;
                                }
                                if (String.valueOf(j2Var7.V.getText()).length() == 0) {
                                    D1 = addLLDrivingSchoolActivity.D1();
                                    string = addLLDrivingSchoolActivity.getString(R.string.enter_trained_to);
                                    str = "enter_trained_to";
                                } else {
                                    j2 j2Var8 = addLLDrivingSchoolActivity.G;
                                    if (j2Var8 == null) {
                                        l.v("binding");
                                        j2Var8 = null;
                                    }
                                    String valueOf = String.valueOf(j2Var8.f26927z.getText());
                                    j2 j2Var9 = addLLDrivingSchoolActivity.G;
                                    if (j2Var9 == null) {
                                        l.v("binding");
                                        j2Var9 = null;
                                    }
                                    if (addLLDrivingSchoolActivity.z1(valueOf, String.valueOf(j2Var9.H.getText()))) {
                                        D1 = addLLDrivingSchoolActivity.D1();
                                        string = addLLDrivingSchoolActivity.getString(R.string.certificate_date_error);
                                        str = "enrollment_date_error";
                                    } else {
                                        j2 j2Var10 = addLLDrivingSchoolActivity.G;
                                        if (j2Var10 == null) {
                                            l.v("binding");
                                            j2Var10 = null;
                                        }
                                        String valueOf2 = String.valueOf(j2Var10.V.getText());
                                        j2 j2Var11 = addLLDrivingSchoolActivity.G;
                                        if (j2Var11 == null) {
                                            l.v("binding");
                                            j2Var11 = null;
                                        }
                                        if (addLLDrivingSchoolActivity.z1(valueOf2, String.valueOf(j2Var11.T.getText()))) {
                                            D1 = addLLDrivingSchoolActivity.D1();
                                            string = addLLDrivingSchoolActivity.getString(R.string.training_date_error);
                                            str = "training_from_date_error";
                                        } else {
                                            j2 j2Var12 = addLLDrivingSchoolActivity.G;
                                            if (j2Var12 == null) {
                                                l.v("binding");
                                                j2Var12 = null;
                                            }
                                            String valueOf3 = String.valueOf(j2Var12.H.getText());
                                            j2 j2Var13 = addLLDrivingSchoolActivity.G;
                                            if (j2Var13 == null) {
                                                l.v("binding");
                                                j2Var13 = null;
                                            }
                                            String obj = j2Var13.X.getContentDescription().toString();
                                            j2 j2Var14 = addLLDrivingSchoolActivity.G;
                                            if (j2Var14 == null) {
                                                l.v("binding");
                                                j2Var14 = null;
                                            }
                                            String valueOf4 = String.valueOf(j2Var14.V.getText());
                                            j2 j2Var15 = addLLDrivingSchoolActivity.G;
                                            if (j2Var15 == null) {
                                                l.v("binding");
                                                j2Var15 = null;
                                            }
                                            String valueOf5 = String.valueOf(j2Var15.f26927z.getText());
                                            j2 j2Var16 = addLLDrivingSchoolActivity.G;
                                            if (j2Var16 == null) {
                                                l.v("binding");
                                                j2Var16 = null;
                                            }
                                            String valueOf6 = String.valueOf(j2Var16.B.getText());
                                            j2 j2Var17 = addLLDrivingSchoolActivity.G;
                                            if (j2Var17 == null) {
                                                l.v("binding");
                                                j2Var17 = null;
                                            }
                                            String valueOf7 = String.valueOf(j2Var17.K.getText());
                                            j2 j2Var18 = addLLDrivingSchoolActivity.G;
                                            if (j2Var18 == null) {
                                                l.v("binding");
                                                j2Var18 = null;
                                            }
                                            String obj2 = j2Var18.G.getContentDescription().toString();
                                            j2 j2Var19 = addLLDrivingSchoolActivity.G;
                                            if (j2Var19 == null) {
                                                l.v("binding");
                                                j2Var19 = null;
                                            }
                                            String valueOf8 = String.valueOf(j2Var19.T.getText());
                                            j2 j2Var20 = addLLDrivingSchoolActivity.G;
                                            if (j2Var20 == null) {
                                                l.v("binding");
                                                j2Var20 = null;
                                            }
                                            String obj3 = j2Var20.X.getText().toString();
                                            j2 j2Var21 = addLLDrivingSchoolActivity.G;
                                            if (j2Var21 == null) {
                                                l.v("binding");
                                                j2Var21 = null;
                                            }
                                            addLLDrivingSchoolActivity.P.add(new DrivingSchoolDetRequestModal(valueOf3, obj, valueOf4, valueOf5, valueOf6, valueOf7, obj2, valueOf8, obj3, j2Var21.G.getText().toString()));
                                            addLLDrivingSchoolActivity.Y1(addLLDrivingSchoolActivity.P);
                                            j2 j2Var22 = addLLDrivingSchoolActivity.G;
                                            if (j2Var22 == null) {
                                                l.v("binding");
                                                j2Var22 = null;
                                            }
                                            j2Var22.H.setText("");
                                            j2 j2Var23 = addLLDrivingSchoolActivity.G;
                                            if (j2Var23 == null) {
                                                l.v("binding");
                                                j2Var23 = null;
                                            }
                                            j2Var23.V.setText("");
                                            j2 j2Var24 = addLLDrivingSchoolActivity.G;
                                            if (j2Var24 == null) {
                                                l.v("binding");
                                                j2Var24 = null;
                                            }
                                            j2Var24.T.setText("");
                                            j2 j2Var25 = addLLDrivingSchoolActivity.G;
                                            if (j2Var25 == null) {
                                                l.v("binding");
                                                j2Var25 = null;
                                            }
                                            j2Var25.B.setText("");
                                            j2 j2Var26 = addLLDrivingSchoolActivity.G;
                                            if (j2Var26 == null) {
                                                l.v("binding");
                                                j2Var26 = null;
                                            }
                                            j2Var26.f26927z.setText("");
                                            j2 j2Var27 = addLLDrivingSchoolActivity.G;
                                            if (j2Var27 == null) {
                                                l.v("binding");
                                                j2Var27 = null;
                                            }
                                            j2Var27.K.setText("");
                                            j2 j2Var28 = addLLDrivingSchoolActivity.G;
                                            if (j2Var28 == null) {
                                                l.v("binding");
                                                j2Var28 = null;
                                            }
                                            j2Var28.X.setText("");
                                            j2 j2Var29 = addLLDrivingSchoolActivity.G;
                                            if (j2Var29 == null) {
                                                l.v("binding");
                                                j2Var29 = null;
                                            }
                                            j2Var29.G.setText("");
                                            j2 j2Var30 = addLLDrivingSchoolActivity.G;
                                            if (j2Var30 == null) {
                                                l.v("binding");
                                                j2Var30 = null;
                                            }
                                            j2Var30.S.setVisibility(8);
                                            j2 j2Var31 = addLLDrivingSchoolActivity.G;
                                            if (j2Var31 == null) {
                                                l.v("binding");
                                                j2Var31 = null;
                                            }
                                            j2Var31.R.setChecked(false);
                                            int size = addLLDrivingSchoolActivity.K.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                String covCode = ((LearnerLicenceClasDatasModal) addLLDrivingSchoolActivity.K.get(i10)).getCovCode();
                                                j2 j2Var32 = addLLDrivingSchoolActivity.G;
                                                if (j2Var32 == null) {
                                                    l.v("binding");
                                                    j2Var32 = null;
                                                }
                                                if (l.a(covCode, j2Var32.X.getContentDescription().toString())) {
                                                    addLLDrivingSchoolActivity.K.remove(i10);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Toast.makeText(addLLDrivingSchoolActivity, D1.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void L1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        addLLDrivingSchoolActivity.U1();
    }

    /* access modifiers changed from: private */
    public static final void M1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        addLLDrivingSchoolActivity.U1();
    }

    /* access modifiers changed from: private */
    public static final void N1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        j2 j2Var = addLLDrivingSchoolActivity.G;
        j2 j2Var2 = null;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        if (j2Var.R.isChecked()) {
            j2 j2Var3 = addLLDrivingSchoolActivity.G;
            if (j2Var3 == null) {
                l.v("binding");
                j2Var3 = null;
            }
            j2Var3.R.setChecked(false);
            j2 j2Var4 = addLLDrivingSchoolActivity.G;
            if (j2Var4 == null) {
                l.v("binding");
                j2Var4 = null;
            }
            j2Var4.J.setVisibility(8);
            j2 j2Var5 = addLLDrivingSchoolActivity.G;
            if (j2Var5 == null) {
                l.v("binding");
                j2Var5 = null;
            }
            j2Var5.F.setVisibility(8);
            j2 j2Var6 = addLLDrivingSchoolActivity.G;
            if (j2Var6 == null) {
                l.v("binding");
                j2Var6 = null;
            }
            j2Var6.E.setVisibility(8);
            j2 j2Var7 = addLLDrivingSchoolActivity.G;
            if (j2Var7 == null) {
                l.v("binding");
            } else {
                j2Var2 = j2Var7;
            }
            j2Var2.O.setVisibility(8);
            return;
        }
        j2 j2Var8 = addLLDrivingSchoolActivity.G;
        if (j2Var8 == null) {
            l.v("binding");
            j2Var8 = null;
        }
        j2Var8.R.setChecked(true);
        j2 j2Var9 = addLLDrivingSchoolActivity.G;
        if (j2Var9 == null) {
            l.v("binding");
            j2Var9 = null;
        }
        j2Var9.J.setVisibility(0);
        j2 j2Var10 = addLLDrivingSchoolActivity.G;
        if (j2Var10 == null) {
            l.v("binding");
        } else {
            j2Var2 = j2Var10;
        }
        j2Var2.F.setVisibility(0);
        addLLDrivingSchoolActivity.y1();
    }

    /* access modifiers changed from: private */
    public static final void O1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, CompoundButton compoundButton, boolean z10) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        j2 j2Var = null;
        if (z10) {
            j2 j2Var2 = addLLDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
                j2Var2 = null;
            }
            j2Var2.J.setVisibility(0);
            j2 j2Var3 = addLLDrivingSchoolActivity.G;
            if (j2Var3 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var3;
            }
            j2Var.F.setVisibility(0);
            addLLDrivingSchoolActivity.y1();
            return;
        }
        j2 j2Var4 = addLLDrivingSchoolActivity.G;
        if (j2Var4 == null) {
            l.v("binding");
            j2Var4 = null;
        }
        j2Var4.J.setVisibility(8);
        j2 j2Var5 = addLLDrivingSchoolActivity.G;
        if (j2Var5 == null) {
            l.v("binding");
            j2Var5 = null;
        }
        j2Var5.F.setVisibility(8);
        j2 j2Var6 = addLLDrivingSchoolActivity.G;
        if (j2Var6 == null) {
            l.v("binding");
            j2Var6 = null;
        }
        j2Var6.E.setVisibility(8);
        j2 j2Var7 = addLLDrivingSchoolActivity.G;
        if (j2Var7 == null) {
            l.v("binding");
        } else {
            j2Var = j2Var7;
        }
        j2Var.O.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void P1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        if (addLLDrivingSchoolActivity.N.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (DrivingSchoolMasterModal drivingSchoolName : addLLDrivingSchoolActivity.N) {
                arrayList.add(drivingSchoolName.getDrivingSchoolName());
            }
            kk.e a10 = kk.e.A0.a(addLLDrivingSchoolActivity.D1().b("select_d_school", addLLDrivingSchoolActivity.getString(R.string.select_d_school)), arrayList);
            a10.k2(addLLDrivingSchoolActivity.F0(), "DSchoolPicker");
            a10.n2(new c(addLLDrivingSchoolActivity));
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePicker datePicker, int i10, int i11, int i12) {
        AppCompatEditText appCompatEditText;
        StringBuilder sb2;
        l.f(addLLDrivingSchoolActivity, "this$0");
        addLLDrivingSchoolActivity.R.set(1, i10);
        addLLDrivingSchoolActivity.R.set(2, i11);
        addLLDrivingSchoolActivity.R.set(5, i12);
        CharSequence format = DateFormat.format("dd", addLLDrivingSchoolActivity.R.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", addLLDrivingSchoolActivity.R.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", addLLDrivingSchoolActivity.R.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        int i13 = addLLDrivingSchoolActivity.O;
        j2 j2Var = null;
        if (i13 == 0) {
            j2 j2Var2 = addLLDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var2;
            }
            appCompatEditText = j2Var.H;
            sb2 = new StringBuilder();
        } else if (i13 == 1) {
            j2 j2Var3 = addLLDrivingSchoolActivity.G;
            if (j2Var3 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var3;
            }
            appCompatEditText = j2Var.f26927z;
            sb2 = new StringBuilder();
        } else if (i13 == 2) {
            j2 j2Var4 = addLLDrivingSchoolActivity.G;
            if (j2Var4 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var4;
            }
            appCompatEditText = j2Var.T;
            sb2 = new StringBuilder();
        } else if (i13 == 3) {
            j2 j2Var5 = addLLDrivingSchoolActivity.G;
            if (j2Var5 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var5;
            }
            appCompatEditText = j2Var.V;
            sb2 = new StringBuilder();
        } else {
            return;
        }
        sb2.append(str);
        sb2.append('-');
        sb2.append(str2);
        sb2.append('-');
        sb2.append(str3);
        appCompatEditText.setText(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final void R1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addLLDrivingSchoolActivity.O = 3;
        addLLDrivingSchoolActivity.x1(onDateSetListener);
    }

    /* access modifiers changed from: private */
    public static final void S1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addLLDrivingSchoolActivity.O = 2;
        addLLDrivingSchoolActivity.x1(onDateSetListener);
    }

    /* access modifiers changed from: private */
    public static final void T1(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addLLDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addLLDrivingSchoolActivity.O = 1;
        addLLDrivingSchoolActivity.x1(onDateSetListener);
    }

    private final void U1() {
        SharedPreferences sharedPreferences = this.U;
        if (sharedPreferences == null) {
            l.v("pref");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("addedDSchoolDetails", new i7.d().t(this.P));
        edit.apply();
        onBackPressed();
    }

    private final void Y1(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            this.Q = new cj.b(this, arrayList, D1());
            j2 j2Var = this.G;
            cj.b bVar = null;
            if (j2Var == null) {
                l.v("binding");
                j2Var = null;
            }
            j2Var.f26924w.setLayoutManager(new LinearLayoutManager(this, 1, false));
            j2 j2Var2 = this.G;
            if (j2Var2 == null) {
                l.v("binding");
                j2Var2 = null;
            }
            RecyclerView recyclerView = j2Var2.f26924w;
            cj.b bVar2 = this.Q;
            if (bVar2 == null) {
                l.v("addedDSchoolAdapter");
            } else {
                bVar = bVar2;
            }
            recyclerView.setAdapter(bVar);
        }
    }

    private final void x1(DatePickerDialog.OnDateSetListener onDateSetListener) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, onDateSetListener, this.R.get(1), this.R.get(2), this.R.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r0 == null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void y1() {
        /*
            r6 = this;
            boolean r0 = r6.T
            r1 = 0
            r2 = 0
            java.lang.String r3 = "binding"
            if (r0 != 0) goto L_0x005f
            java.util.ArrayList r0 = r6.K
            int r0 = r0.size()
            r4 = 1
            r5 = 8
            if (r0 <= r4) goto L_0x002f
            ni.j2 r0 = r6.G
            if (r0 != 0) goto L_0x001b
            cm.l.v(r3)
            r0 = r2
        L_0x001b:
            android.widget.LinearLayout r0 = r0.E
            r0.setVisibility(r1)
            ni.j2 r0 = r6.G
            if (r0 != 0) goto L_0x0028
            cm.l.v(r3)
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            android.widget.TextView r0 = r2.O
        L_0x002b:
            r0.setVisibility(r5)
            goto L_0x0064
        L_0x002f:
            java.util.ArrayList r0 = r6.K
            int r0 = r0.size()
            if (r0 != r4) goto L_0x0053
            ni.j2 r0 = r6.G
            if (r0 != 0) goto L_0x003f
            cm.l.v(r3)
            r0 = r2
        L_0x003f:
            android.widget.LinearLayout r0 = r0.E
            r0.setVisibility(r5)
            ni.j2 r0 = r6.G
            if (r0 != 0) goto L_0x004c
        L_0x0048:
            cm.l.v(r3)
            goto L_0x004d
        L_0x004c:
            r2 = r0
        L_0x004d:
            android.widget.TextView r0 = r2.O
            r0.setVisibility(r1)
            goto L_0x0064
        L_0x0053:
            ni.j2 r0 = r6.G
            if (r0 != 0) goto L_0x005b
            cm.l.v(r3)
            goto L_0x005c
        L_0x005b:
            r2 = r0
        L_0x005c:
            android.widget.LinearLayout r0 = r2.P
            goto L_0x002b
        L_0x005f:
            ni.j2 r0 = r6.G
            if (r0 != 0) goto L_0x004c
            goto L_0x0048
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity.y1():void");
    }

    public final void A1(int i10) {
        this.S = i10;
        this.T = true;
        if (this.P.size() > 0) {
            j2 j2Var = this.G;
            j2 j2Var2 = null;
            if (j2Var == null) {
                l.v("binding");
                j2Var = null;
            }
            j2Var.P.setVisibility(0);
            j2 j2Var3 = this.G;
            if (j2Var3 == null) {
                l.v("binding");
                j2Var3 = null;
            }
            j2Var3.X.setClickable(false);
            j2 j2Var4 = this.G;
            if (j2Var4 == null) {
                l.v("binding");
                j2Var4 = null;
            }
            j2Var4.K.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getEnrollNo());
            j2 j2Var5 = this.G;
            if (j2Var5 == null) {
                l.v("binding");
                j2Var5 = null;
            }
            j2Var5.H.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getEnrollDate());
            j2 j2Var6 = this.G;
            if (j2Var6 == null) {
                l.v("binding");
                j2Var6 = null;
            }
            j2Var6.B.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getCertNo());
            j2 j2Var7 = this.G;
            if (j2Var7 == null) {
                l.v("binding");
                j2Var7 = null;
            }
            j2Var7.f26927z.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getCertDate());
            j2 j2Var8 = this.G;
            if (j2Var8 == null) {
                l.v("binding");
                j2Var8 = null;
            }
            j2Var8.T.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getTrainFrom());
            j2 j2Var9 = this.G;
            if (j2Var9 == null) {
                l.v("binding");
                j2Var9 = null;
            }
            j2Var9.V.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getTrainTo());
            j2 j2Var10 = this.G;
            if (j2Var10 == null) {
                l.v("binding");
                j2Var10 = null;
            }
            j2Var10.X.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getVehicleClassName());
            j2 j2Var11 = this.G;
            if (j2Var11 == null) {
                l.v("binding");
                j2Var11 = null;
            }
            j2Var11.G.setText(((DrivingSchoolDetRequestModal) this.P.get(i10)).getDrivingSchoolName());
            j2 j2Var12 = this.G;
            if (j2Var12 == null) {
                l.v("binding");
                j2Var12 = null;
            }
            j2Var12.G.setContentDescription(((DrivingSchoolDetRequestModal) this.P.get(i10)).getDschoolCode());
            j2 j2Var13 = this.G;
            if (j2Var13 == null) {
                l.v("binding");
                j2Var13 = null;
            }
            j2Var13.X.setContentDescription(((DrivingSchoolDetRequestModal) this.P.get(i10)).getCovcd());
            j2 j2Var14 = this.G;
            if (j2Var14 == null) {
                l.v("binding");
                j2Var14 = null;
            }
            j2Var14.N.setVisibility(8);
            j2 j2Var15 = this.G;
            if (j2Var15 == null) {
                l.v("binding");
                j2Var15 = null;
            }
            j2Var15.O.setVisibility(0);
            j2 j2Var16 = this.G;
            if (j2Var16 == null) {
                l.v("binding");
                j2Var16 = null;
            }
            j2Var16.O.setText(D1().b("btn_Update", getString(R.string.update)));
            j2 j2Var17 = this.G;
            if (j2Var17 == null) {
                l.v("binding");
                j2Var17 = null;
            }
            j2Var17.S.setVisibility(0);
            j2 j2Var18 = this.G;
            if (j2Var18 == null) {
                l.v("binding");
            } else {
                j2Var2 = j2Var18;
            }
            j2Var2.R.setChecked(true);
        }
    }

    public final ld.c D1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final ProgressDialog E1() {
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final ld.f F1() {
        ld.f fVar = this.M;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void V1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void W1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }

    public final void X1(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.M = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j2 x10 = j2.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        xj.b bVar = null;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        SharedPreferences sharedPreferences = getSharedPreferences("AddLLVehicleClass", 0);
        l.e(sharedPreferences, "getSharedPreferences(...)");
        this.U = sharedPreferences;
        e.a aVar = v9.e.f17509a;
        j2 j2Var = this.G;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        aVar.v(this, j2Var);
        G1();
        C1();
        B1();
        xj.b bVar2 = this.I;
        if (bVar2 == null) {
            l.v("viewModal");
            bVar2 = null;
        }
        bVar2.q().g(this, new f(new d(this)));
        xj.b bVar3 = this.I;
        if (bVar3 == null) {
            l.v("viewModal");
        } else {
            bVar = bVar3;
        }
        bVar.u().g(this, new f(new e(this)));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        U1();
        return true;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        U1();
        return true;
    }

    public final boolean z1(String str, String str2) {
        l.f(str, "firstDate");
        l.f(str2, "secondDate");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date parse = simpleDateFormat.parse(str);
            Date parse2 = simpleDateFormat.parse(str2);
            l.c(parse);
            return parse.before(parse2);
        } catch (Exception | ParseException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
