package com.nic.mparivahan.NewDlScreen.Activity;

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
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.NewDlScreen.Modal.CheckCovs;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolModal;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.NewDlScreen.Modal.StateWiseDrivingSchoolList;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.NewDLService;
import ec.g;
import ec.i;
import ec.j;
import ec.k;
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

public final class AddDrivingSchoolActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public j2 G;
    public ProgressDialog H;
    private rj.b I;
    private NewDLService J;
    private ArrayList K = new ArrayList();
    /* access modifiers changed from: private */
    public ArrayList L = new ArrayList();
    public ld.c M;
    public ld.f N;
    /* access modifiers changed from: private */
    public ArrayList O = new ArrayList();
    private int P;
    private ArrayList Q = new ArrayList();
    private fc.b R;
    private Calendar S = Calendar.getInstance();
    private int T = -1;
    /* access modifiers changed from: private */
    public boolean U;
    private SharedPreferences V;

    public static final class a extends n6.b {
        a() {
        }
    }

    public static final class b implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddDrivingSchoolActivity f9279a;

        b(AddDrivingSchoolActivity addDrivingSchoolActivity) {
            this.f9279a = addDrivingSchoolActivity;
        }

        public void a(String str, int i10) {
            String covCode = ((CheckCovs) this.f9279a.L.get(i10)).getCovCode();
            j2 s12 = this.f9279a.G;
            j2 j2Var = null;
            if (s12 == null) {
                l.v("binding");
                s12 = null;
            }
            s12.X.setText(str);
            j2 s13 = this.f9279a.G;
            if (s13 == null) {
                l.v("binding");
                s13 = null;
            }
            s13.X.setContentDescription(covCode);
            j2 s14 = this.f9279a.G;
            if (s14 == null) {
                l.v("binding");
                s14 = null;
            }
            if (p.o(s14.X.getText().toString(), "Select", true)) {
                j2 s15 = this.f9279a.G;
                if (s15 == null) {
                    l.v("binding");
                    s15 = null;
                }
                s15.P.setVisibility(8);
                j2 s16 = this.f9279a.G;
                if (s16 == null) {
                    l.v("binding");
                } else {
                    j2Var = s16;
                }
                j2Var.S.setVisibility(8);
            } else {
                j2 s17 = this.f9279a.G;
                if (s17 == null) {
                    l.v("binding");
                    s17 = null;
                }
                s17.P.setVisibility(0);
                j2 s18 = this.f9279a.G;
                if (s18 == null) {
                    l.v("binding");
                } else {
                    j2Var = s18;
                }
                j2Var.S.setVisibility(0);
            }
            this.f9279a.U = false;
        }
    }

    public static final class c implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddDrivingSchoolActivity f9280a;

        c(AddDrivingSchoolActivity addDrivingSchoolActivity) {
            this.f9280a = addDrivingSchoolActivity;
        }

        public void a(String str, int i10) {
            String code = ((StateWiseDrivingSchoolList) this.f9280a.O.get(i10)).getCode();
            j2 s12 = this.f9280a.G;
            j2 j2Var = null;
            if (s12 == null) {
                l.v("binding");
                s12 = null;
            }
            s12.G.setText(str);
            j2 s13 = this.f9280a.G;
            if (s13 == null) {
                l.v("binding");
            } else {
                j2Var = s13;
            }
            j2Var.G.setContentDescription(code);
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddDrivingSchoolActivity f9281e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddDrivingSchoolActivity addDrivingSchoolActivity) {
            super(1);
            this.f9281e = addDrivingSchoolActivity;
        }

        public final void b(DrivingSchoolModal drivingSchoolModal) {
            try {
                if (this.f9281e.E1().isShowing()) {
                    this.f9281e.E1().dismiss();
                }
                if (p.o(drivingSchoolModal.getStatusDesc(), "Success", true)) {
                    AddDrivingSchoolActivity addDrivingSchoolActivity = this.f9281e;
                    ArrayList<StateWiseDrivingSchoolList> stateWiseSchoolList = drivingSchoolModal.getStateWiseSchoolList();
                    l.c(stateWiseSchoolList);
                    addDrivingSchoolActivity.O = stateWiseSchoolList;
                }
            } catch (Exception unused) {
                if (this.f9281e.E1().isShowing()) {
                    this.f9281e.E1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DrivingSchoolModal) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddDrivingSchoolActivity f9282e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AddDrivingSchoolActivity addDrivingSchoolActivity) {
            super(1);
            this.f9282e = addDrivingSchoolActivity;
        }

        public final void b(String str) {
            if (this.f9282e.E1().isShowing()) {
                this.f9282e.E1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9283a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f9283a = lVar;
        }

        public final pl.c a() {
            return this.f9283a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9283a.invoke(obj);
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
            rj.b bVar = this.I;
            if (bVar == null) {
                l.v("viewModal");
                bVar = null;
            }
            bVar.h(((LLDetailsResultModal) this.K.get(0)).getLlFromState1().get(0).getLlFromState1Code());
        } catch (Exception e10) {
            e10.printStackTrace();
            if (E1().isShowing()) {
                E1().dismiss();
            }
        }
    }

    private final void C1() {
        if (getIntent().hasExtra("LLDetails")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
            l.c(parcelableArrayListExtra);
            this.K = parcelableArrayListExtra;
        }
        SharedPreferences sharedPreferences = this.V;
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
            this.Q = (ArrayList) k10;
        }
        if (this.Q.size() > 0) {
            Y1(this.Q);
        }
        if (this.K.size() > 0) {
            ArrayList<CheckCovs> checkCovs = ((LLDetailsResultModal) this.K.get(0)).getCheckCovs();
            this.L = checkCovs;
            if (checkCovs.size() > 0) {
                int size = this.Q.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (l.a(((CheckCovs) this.L.get(0)).getCovCode(), ((DrivingSchoolDetRequestModal) this.Q.get(i10)).getCovcd())) {
                        this.L.remove(0);
                    }
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
        this.J = NewDLService.f22140a.a(this);
        NewDLService newDLService = this.J;
        if (newDLService == null) {
            l.v("service");
            newDLService = null;
        }
        this.I = (rj.b) new u0((x0) this, (u0.b) new sj.a(new rj.a(newDLService))).a(rj.b.class);
        j2 j2Var7 = this.G;
        if (j2Var7 == null) {
            l.v("binding");
            j2Var7 = null;
        }
        j2Var7.X.setOnClickListener(new ec.a(this));
        j2 j2Var8 = this.G;
        if (j2Var8 == null) {
            l.v("binding");
            j2Var8 = null;
        }
        j2Var8.S.setOnClickListener(new ec.h(this));
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
        j2Var11.V.setOnClickListener(new ec.l(this, kVar));
        j2 j2Var12 = this.G;
        if (j2Var12 == null) {
            l.v("binding");
            j2Var12 = null;
        }
        j2Var12.T.setOnClickListener(new ec.m(this, kVar));
        j2 j2Var13 = this.G;
        if (j2Var13 == null) {
            l.v("binding");
            j2Var13 = null;
        }
        j2Var13.f26927z.setOnClickListener(new ec.b(this, kVar));
        j2 j2Var14 = this.G;
        if (j2Var14 == null) {
            l.v("binding");
            j2Var14 = null;
        }
        j2Var14.H.setOnClickListener(new ec.c(this, kVar));
        j2 j2Var15 = this.G;
        if (j2Var15 == null) {
            l.v("binding");
            j2Var15 = null;
        }
        j2Var15.O.setOnClickListener(new ec.d(this));
        j2 j2Var16 = this.G;
        if (j2Var16 == null) {
            l.v("binding");
            j2Var16 = null;
        }
        j2Var16.N.setOnClickListener(new ec.e(this));
        j2 j2Var17 = this.G;
        if (j2Var17 == null) {
            l.v("binding");
            j2Var17 = null;
        }
        j2Var17.f26926y.setOnClickListener(new ec.f(this));
        j2 j2Var18 = this.G;
        if (j2Var18 == null) {
            l.v("binding");
        } else {
            j2Var2 = j2Var18;
        }
        j2Var2.M.f28448b.setOnClickListener(new g(this));
    }

    /* access modifiers changed from: private */
    public static final void H1(AddDrivingSchoolActivity addDrivingSchoolActivity, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        if (addDrivingSchoolActivity.L.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (CheckCovs covAbbrDesc : addDrivingSchoolActivity.L) {
                String covAbbrDesc2 = covAbbrDesc.getCovAbbrDesc();
                l.c(covAbbrDesc2);
                arrayList.add(covAbbrDesc2);
            }
            kk.e a10 = kk.e.A0.a(addDrivingSchoolActivity.D1().b("select_class_vehicle", addDrivingSchoolActivity.getString(R.string.select_class_of_vehcile)), arrayList);
            a10.k2(addDrivingSchoolActivity.F0(), "DSchoolPicker");
            a10.n2(new b(addDrivingSchoolActivity));
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addDrivingSchoolActivity.P = 0;
        addDrivingSchoolActivity.x1(onDateSetListener);
    }

    /* access modifiers changed from: private */
    public static final void J1(AddDrivingSchoolActivity addDrivingSchoolActivity, View view) {
        ld.c D1;
        String string;
        String str;
        l.f(addDrivingSchoolActivity, "this$0");
        j2 j2Var = addDrivingSchoolActivity.G;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        if (j2Var.G.getText().toString().length() == 0) {
            D1 = addDrivingSchoolActivity.D1();
            string = addDrivingSchoolActivity.getString(R.string.select_d_school);
            str = "select_d_school";
        } else {
            j2 j2Var2 = addDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
                j2Var2 = null;
            }
            if (String.valueOf(j2Var2.K.getText()).length() == 0) {
                D1 = addDrivingSchoolActivity.D1();
                string = addDrivingSchoolActivity.getString(R.string.enter_enrollment_no);
                str = "enter_enrollement_no";
            } else {
                j2 j2Var3 = addDrivingSchoolActivity.G;
                if (j2Var3 == null) {
                    l.v("binding");
                    j2Var3 = null;
                }
                if (String.valueOf(j2Var3.H.getText()).length() == 0) {
                    D1 = addDrivingSchoolActivity.D1();
                    string = addDrivingSchoolActivity.getString(R.string.enter_enrollment_date);
                    str = "enter_enrollement_date";
                } else {
                    j2 j2Var4 = addDrivingSchoolActivity.G;
                    if (j2Var4 == null) {
                        l.v("binding");
                        j2Var4 = null;
                    }
                    if (String.valueOf(j2Var4.B.getText()).length() == 0) {
                        D1 = addDrivingSchoolActivity.D1();
                        string = addDrivingSchoolActivity.getString(R.string.enter_certificate_number);
                        str = "enter_certificate_number";
                    } else {
                        j2 j2Var5 = addDrivingSchoolActivity.G;
                        if (j2Var5 == null) {
                            l.v("binding");
                            j2Var5 = null;
                        }
                        if (String.valueOf(j2Var5.f26927z.getText()).length() == 0) {
                            D1 = addDrivingSchoolActivity.D1();
                            string = addDrivingSchoolActivity.getString(R.string.enter_certificate_date);
                            str = "enter_certificate_date";
                        } else {
                            j2 j2Var6 = addDrivingSchoolActivity.G;
                            if (j2Var6 == null) {
                                l.v("binding");
                                j2Var6 = null;
                            }
                            if (String.valueOf(j2Var6.T.getText()).length() == 0) {
                                D1 = addDrivingSchoolActivity.D1();
                                string = addDrivingSchoolActivity.getString(R.string.enter_trained_from);
                                str = "enter_trained_from";
                            } else {
                                j2 j2Var7 = addDrivingSchoolActivity.G;
                                if (j2Var7 == null) {
                                    l.v("binding");
                                    j2Var7 = null;
                                }
                                if (String.valueOf(j2Var7.V.getText()).length() == 0) {
                                    D1 = addDrivingSchoolActivity.D1();
                                    string = addDrivingSchoolActivity.getString(R.string.enter_trained_to);
                                    str = "enter_trained_to";
                                } else {
                                    j2 j2Var8 = addDrivingSchoolActivity.G;
                                    if (j2Var8 == null) {
                                        l.v("binding");
                                        j2Var8 = null;
                                    }
                                    String valueOf = String.valueOf(j2Var8.f26927z.getText());
                                    j2 j2Var9 = addDrivingSchoolActivity.G;
                                    if (j2Var9 == null) {
                                        l.v("binding");
                                        j2Var9 = null;
                                    }
                                    if (addDrivingSchoolActivity.z1(valueOf, String.valueOf(j2Var9.H.getText()))) {
                                        D1 = addDrivingSchoolActivity.D1();
                                        string = addDrivingSchoolActivity.getString(R.string.certificate_date_error);
                                        str = "enrollment_date_error";
                                    } else {
                                        j2 j2Var10 = addDrivingSchoolActivity.G;
                                        if (j2Var10 == null) {
                                            l.v("binding");
                                            j2Var10 = null;
                                        }
                                        String valueOf2 = String.valueOf(j2Var10.V.getText());
                                        j2 j2Var11 = addDrivingSchoolActivity.G;
                                        if (j2Var11 == null) {
                                            l.v("binding");
                                            j2Var11 = null;
                                        }
                                        if (addDrivingSchoolActivity.z1(valueOf2, String.valueOf(j2Var11.T.getText()))) {
                                            D1 = addDrivingSchoolActivity.D1();
                                            string = addDrivingSchoolActivity.getString(R.string.training_date_error);
                                            str = "training_from_date_error";
                                        } else {
                                            j2 j2Var12 = addDrivingSchoolActivity.G;
                                            if (j2Var12 == null) {
                                                l.v("binding");
                                                j2Var12 = null;
                                            }
                                            String valueOf3 = String.valueOf(j2Var12.H.getText());
                                            j2 j2Var13 = addDrivingSchoolActivity.G;
                                            if (j2Var13 == null) {
                                                l.v("binding");
                                                j2Var13 = null;
                                            }
                                            String obj = j2Var13.X.getContentDescription().toString();
                                            j2 j2Var14 = addDrivingSchoolActivity.G;
                                            if (j2Var14 == null) {
                                                l.v("binding");
                                                j2Var14 = null;
                                            }
                                            String valueOf4 = String.valueOf(j2Var14.V.getText());
                                            j2 j2Var15 = addDrivingSchoolActivity.G;
                                            if (j2Var15 == null) {
                                                l.v("binding");
                                                j2Var15 = null;
                                            }
                                            String valueOf5 = String.valueOf(j2Var15.f26927z.getText());
                                            j2 j2Var16 = addDrivingSchoolActivity.G;
                                            if (j2Var16 == null) {
                                                l.v("binding");
                                                j2Var16 = null;
                                            }
                                            String valueOf6 = String.valueOf(j2Var16.B.getText());
                                            j2 j2Var17 = addDrivingSchoolActivity.G;
                                            if (j2Var17 == null) {
                                                l.v("binding");
                                                j2Var17 = null;
                                            }
                                            String valueOf7 = String.valueOf(j2Var17.K.getText());
                                            j2 j2Var18 = addDrivingSchoolActivity.G;
                                            if (j2Var18 == null) {
                                                l.v("binding");
                                                j2Var18 = null;
                                            }
                                            String obj2 = j2Var18.G.getContentDescription().toString();
                                            j2 j2Var19 = addDrivingSchoolActivity.G;
                                            if (j2Var19 == null) {
                                                l.v("binding");
                                                j2Var19 = null;
                                            }
                                            String valueOf8 = String.valueOf(j2Var19.T.getText());
                                            j2 j2Var20 = addDrivingSchoolActivity.G;
                                            if (j2Var20 == null) {
                                                l.v("binding");
                                                j2Var20 = null;
                                            }
                                            String obj3 = j2Var20.X.getText().toString();
                                            j2 j2Var21 = addDrivingSchoolActivity.G;
                                            if (j2Var21 == null) {
                                                l.v("binding");
                                                j2Var21 = null;
                                            }
                                            DrivingSchoolDetRequestModal drivingSchoolDetRequestModal = new DrivingSchoolDetRequestModal(valueOf3, obj, valueOf4, valueOf5, valueOf6, valueOf7, obj2, valueOf8, obj3, j2Var21.G.getText().toString());
                                            j2 j2Var22 = addDrivingSchoolActivity.G;
                                            if (j2Var22 == null) {
                                                l.v("binding");
                                                j2Var22 = null;
                                            }
                                            if (l.a(j2Var22.O.getText(), addDrivingSchoolActivity.D1().b("btn_Update", addDrivingSchoolActivity.getString(R.string.update)))) {
                                                j2 j2Var23 = addDrivingSchoolActivity.G;
                                                if (j2Var23 == null) {
                                                    l.v("binding");
                                                    j2Var23 = null;
                                                }
                                                j2Var23.X.setClickable(true);
                                                addDrivingSchoolActivity.Q.set(addDrivingSchoolActivity.T, drivingSchoolDetRequestModal);
                                                j2 j2Var24 = addDrivingSchoolActivity.G;
                                                if (j2Var24 == null) {
                                                    l.v("binding");
                                                    j2Var24 = null;
                                                }
                                                j2Var24.O.setText(addDrivingSchoolActivity.D1().b("label_save", addDrivingSchoolActivity.getString(R.string.save)));
                                            } else {
                                                addDrivingSchoolActivity.Q.add(drivingSchoolDetRequestModal);
                                            }
                                            addDrivingSchoolActivity.Y1(addDrivingSchoolActivity.Q);
                                            j2 j2Var25 = addDrivingSchoolActivity.G;
                                            if (j2Var25 == null) {
                                                l.v("binding");
                                                j2Var25 = null;
                                            }
                                            j2Var25.H.setText("");
                                            j2 j2Var26 = addDrivingSchoolActivity.G;
                                            if (j2Var26 == null) {
                                                l.v("binding");
                                                j2Var26 = null;
                                            }
                                            j2Var26.V.setText("");
                                            j2 j2Var27 = addDrivingSchoolActivity.G;
                                            if (j2Var27 == null) {
                                                l.v("binding");
                                                j2Var27 = null;
                                            }
                                            j2Var27.T.setText("");
                                            j2 j2Var28 = addDrivingSchoolActivity.G;
                                            if (j2Var28 == null) {
                                                l.v("binding");
                                                j2Var28 = null;
                                            }
                                            j2Var28.B.setText("");
                                            j2 j2Var29 = addDrivingSchoolActivity.G;
                                            if (j2Var29 == null) {
                                                l.v("binding");
                                                j2Var29 = null;
                                            }
                                            j2Var29.f26927z.setText("");
                                            j2 j2Var30 = addDrivingSchoolActivity.G;
                                            if (j2Var30 == null) {
                                                l.v("binding");
                                                j2Var30 = null;
                                            }
                                            j2Var30.K.setText("");
                                            j2 j2Var31 = addDrivingSchoolActivity.G;
                                            if (j2Var31 == null) {
                                                l.v("binding");
                                                j2Var31 = null;
                                            }
                                            j2Var31.X.setText("");
                                            j2 j2Var32 = addDrivingSchoolActivity.G;
                                            if (j2Var32 == null) {
                                                l.v("binding");
                                                j2Var32 = null;
                                            }
                                            j2Var32.G.setText("");
                                            j2 j2Var33 = addDrivingSchoolActivity.G;
                                            if (j2Var33 == null) {
                                                l.v("binding");
                                                j2Var33 = null;
                                            }
                                            j2Var33.S.setVisibility(8);
                                            j2 j2Var34 = addDrivingSchoolActivity.G;
                                            if (j2Var34 == null) {
                                                l.v("binding");
                                                j2Var34 = null;
                                            }
                                            j2Var34.R.setChecked(false);
                                            j2 j2Var35 = addDrivingSchoolActivity.G;
                                            if (j2Var35 == null) {
                                                l.v("binding");
                                                j2Var35 = null;
                                            }
                                            if (l.a(j2Var35.O.getText(), addDrivingSchoolActivity.D1().b("label_save", addDrivingSchoolActivity.getString(R.string.save)))) {
                                                int size = addDrivingSchoolActivity.L.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    String covCode = ((CheckCovs) addDrivingSchoolActivity.L.get(i10)).getCovCode();
                                                    j2 j2Var36 = addDrivingSchoolActivity.G;
                                                    if (j2Var36 == null) {
                                                        l.v("binding");
                                                        j2Var36 = null;
                                                    }
                                                    if (l.a(covCode, j2Var36.X.getContentDescription().toString())) {
                                                        addDrivingSchoolActivity.L.remove(i10);
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
        Toast.makeText(addDrivingSchoolActivity, D1.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void K1(AddDrivingSchoolActivity addDrivingSchoolActivity, View view) {
        ld.c D1;
        String string;
        String str;
        l.f(addDrivingSchoolActivity, "this$0");
        j2 j2Var = addDrivingSchoolActivity.G;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        if (j2Var.G.getText().toString().length() == 0) {
            D1 = addDrivingSchoolActivity.D1();
            string = addDrivingSchoolActivity.getString(R.string.select_d_school);
            str = "select_d_school";
        } else {
            j2 j2Var2 = addDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
                j2Var2 = null;
            }
            if (String.valueOf(j2Var2.K.getText()).length() == 0) {
                D1 = addDrivingSchoolActivity.D1();
                string = addDrivingSchoolActivity.getString(R.string.enter_enrollment_no);
                str = "enter_enrollement_no";
            } else {
                j2 j2Var3 = addDrivingSchoolActivity.G;
                if (j2Var3 == null) {
                    l.v("binding");
                    j2Var3 = null;
                }
                if (String.valueOf(j2Var3.H.getText()).length() == 0) {
                    D1 = addDrivingSchoolActivity.D1();
                    string = addDrivingSchoolActivity.getString(R.string.enter_enrollment_date);
                    str = "enter_enrollement_date";
                } else {
                    j2 j2Var4 = addDrivingSchoolActivity.G;
                    if (j2Var4 == null) {
                        l.v("binding");
                        j2Var4 = null;
                    }
                    if (String.valueOf(j2Var4.B.getText()).length() == 0) {
                        D1 = addDrivingSchoolActivity.D1();
                        string = addDrivingSchoolActivity.getString(R.string.enter_certificate_number);
                        str = "enter_certificate_number";
                    } else {
                        j2 j2Var5 = addDrivingSchoolActivity.G;
                        if (j2Var5 == null) {
                            l.v("binding");
                            j2Var5 = null;
                        }
                        if (String.valueOf(j2Var5.f26927z.getText()).length() == 0) {
                            D1 = addDrivingSchoolActivity.D1();
                            string = addDrivingSchoolActivity.getString(R.string.enter_certificate_date);
                            str = "enter_certificate_date";
                        } else {
                            j2 j2Var6 = addDrivingSchoolActivity.G;
                            if (j2Var6 == null) {
                                l.v("binding");
                                j2Var6 = null;
                            }
                            if (String.valueOf(j2Var6.T.getText()).length() == 0) {
                                D1 = addDrivingSchoolActivity.D1();
                                string = addDrivingSchoolActivity.getString(R.string.enter_trained_from);
                                str = "enter_trained_from";
                            } else {
                                j2 j2Var7 = addDrivingSchoolActivity.G;
                                if (j2Var7 == null) {
                                    l.v("binding");
                                    j2Var7 = null;
                                }
                                if (String.valueOf(j2Var7.V.getText()).length() == 0) {
                                    D1 = addDrivingSchoolActivity.D1();
                                    string = addDrivingSchoolActivity.getString(R.string.enter_trained_to);
                                    str = "enter_trained_to";
                                } else {
                                    j2 j2Var8 = addDrivingSchoolActivity.G;
                                    if (j2Var8 == null) {
                                        l.v("binding");
                                        j2Var8 = null;
                                    }
                                    String valueOf = String.valueOf(j2Var8.f26927z.getText());
                                    j2 j2Var9 = addDrivingSchoolActivity.G;
                                    if (j2Var9 == null) {
                                        l.v("binding");
                                        j2Var9 = null;
                                    }
                                    if (addDrivingSchoolActivity.z1(valueOf, String.valueOf(j2Var9.H.getText()))) {
                                        D1 = addDrivingSchoolActivity.D1();
                                        string = addDrivingSchoolActivity.getString(R.string.certificate_date_error);
                                        str = "enrollment_date_error";
                                    } else {
                                        j2 j2Var10 = addDrivingSchoolActivity.G;
                                        if (j2Var10 == null) {
                                            l.v("binding");
                                            j2Var10 = null;
                                        }
                                        String valueOf2 = String.valueOf(j2Var10.V.getText());
                                        j2 j2Var11 = addDrivingSchoolActivity.G;
                                        if (j2Var11 == null) {
                                            l.v("binding");
                                            j2Var11 = null;
                                        }
                                        if (addDrivingSchoolActivity.z1(valueOf2, String.valueOf(j2Var11.T.getText()))) {
                                            D1 = addDrivingSchoolActivity.D1();
                                            string = addDrivingSchoolActivity.getString(R.string.training_date_error);
                                            str = "training_from_date_error";
                                        } else {
                                            j2 j2Var12 = addDrivingSchoolActivity.G;
                                            if (j2Var12 == null) {
                                                l.v("binding");
                                                j2Var12 = null;
                                            }
                                            String valueOf3 = String.valueOf(j2Var12.H.getText());
                                            j2 j2Var13 = addDrivingSchoolActivity.G;
                                            if (j2Var13 == null) {
                                                l.v("binding");
                                                j2Var13 = null;
                                            }
                                            String obj = j2Var13.X.getContentDescription().toString();
                                            j2 j2Var14 = addDrivingSchoolActivity.G;
                                            if (j2Var14 == null) {
                                                l.v("binding");
                                                j2Var14 = null;
                                            }
                                            String valueOf4 = String.valueOf(j2Var14.V.getText());
                                            j2 j2Var15 = addDrivingSchoolActivity.G;
                                            if (j2Var15 == null) {
                                                l.v("binding");
                                                j2Var15 = null;
                                            }
                                            String valueOf5 = String.valueOf(j2Var15.f26927z.getText());
                                            j2 j2Var16 = addDrivingSchoolActivity.G;
                                            if (j2Var16 == null) {
                                                l.v("binding");
                                                j2Var16 = null;
                                            }
                                            String valueOf6 = String.valueOf(j2Var16.B.getText());
                                            j2 j2Var17 = addDrivingSchoolActivity.G;
                                            if (j2Var17 == null) {
                                                l.v("binding");
                                                j2Var17 = null;
                                            }
                                            String valueOf7 = String.valueOf(j2Var17.K.getText());
                                            j2 j2Var18 = addDrivingSchoolActivity.G;
                                            if (j2Var18 == null) {
                                                l.v("binding");
                                                j2Var18 = null;
                                            }
                                            String obj2 = j2Var18.G.getContentDescription().toString();
                                            j2 j2Var19 = addDrivingSchoolActivity.G;
                                            if (j2Var19 == null) {
                                                l.v("binding");
                                                j2Var19 = null;
                                            }
                                            String valueOf8 = String.valueOf(j2Var19.T.getText());
                                            j2 j2Var20 = addDrivingSchoolActivity.G;
                                            if (j2Var20 == null) {
                                                l.v("binding");
                                                j2Var20 = null;
                                            }
                                            String obj3 = j2Var20.X.getText().toString();
                                            j2 j2Var21 = addDrivingSchoolActivity.G;
                                            if (j2Var21 == null) {
                                                l.v("binding");
                                                j2Var21 = null;
                                            }
                                            addDrivingSchoolActivity.Q.add(new DrivingSchoolDetRequestModal(valueOf3, obj, valueOf4, valueOf5, valueOf6, valueOf7, obj2, valueOf8, obj3, j2Var21.G.getText().toString()));
                                            addDrivingSchoolActivity.Y1(addDrivingSchoolActivity.Q);
                                            j2 j2Var22 = addDrivingSchoolActivity.G;
                                            if (j2Var22 == null) {
                                                l.v("binding");
                                                j2Var22 = null;
                                            }
                                            j2Var22.H.setText("");
                                            j2 j2Var23 = addDrivingSchoolActivity.G;
                                            if (j2Var23 == null) {
                                                l.v("binding");
                                                j2Var23 = null;
                                            }
                                            j2Var23.V.setText("");
                                            j2 j2Var24 = addDrivingSchoolActivity.G;
                                            if (j2Var24 == null) {
                                                l.v("binding");
                                                j2Var24 = null;
                                            }
                                            j2Var24.T.setText("");
                                            j2 j2Var25 = addDrivingSchoolActivity.G;
                                            if (j2Var25 == null) {
                                                l.v("binding");
                                                j2Var25 = null;
                                            }
                                            j2Var25.B.setText("");
                                            j2 j2Var26 = addDrivingSchoolActivity.G;
                                            if (j2Var26 == null) {
                                                l.v("binding");
                                                j2Var26 = null;
                                            }
                                            j2Var26.f26927z.setText("");
                                            j2 j2Var27 = addDrivingSchoolActivity.G;
                                            if (j2Var27 == null) {
                                                l.v("binding");
                                                j2Var27 = null;
                                            }
                                            j2Var27.K.setText("");
                                            j2 j2Var28 = addDrivingSchoolActivity.G;
                                            if (j2Var28 == null) {
                                                l.v("binding");
                                                j2Var28 = null;
                                            }
                                            j2Var28.X.setText("");
                                            j2 j2Var29 = addDrivingSchoolActivity.G;
                                            if (j2Var29 == null) {
                                                l.v("binding");
                                                j2Var29 = null;
                                            }
                                            j2Var29.G.setText("");
                                            j2 j2Var30 = addDrivingSchoolActivity.G;
                                            if (j2Var30 == null) {
                                                l.v("binding");
                                                j2Var30 = null;
                                            }
                                            j2Var30.S.setVisibility(8);
                                            j2 j2Var31 = addDrivingSchoolActivity.G;
                                            if (j2Var31 == null) {
                                                l.v("binding");
                                                j2Var31 = null;
                                            }
                                            j2Var31.R.setChecked(false);
                                            int size = addDrivingSchoolActivity.L.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                String covCode = ((CheckCovs) addDrivingSchoolActivity.L.get(i10)).getCovCode();
                                                j2 j2Var32 = addDrivingSchoolActivity.G;
                                                if (j2Var32 == null) {
                                                    l.v("binding");
                                                    j2Var32 = null;
                                                }
                                                if (l.a(covCode, j2Var32.X.getContentDescription().toString())) {
                                                    addDrivingSchoolActivity.L.remove(i10);
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
        Toast.makeText(addDrivingSchoolActivity, D1.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void L1(AddDrivingSchoolActivity addDrivingSchoolActivity, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        addDrivingSchoolActivity.U1();
    }

    /* access modifiers changed from: private */
    public static final void M1(AddDrivingSchoolActivity addDrivingSchoolActivity, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        addDrivingSchoolActivity.U1();
    }

    /* access modifiers changed from: private */
    public static final void N1(AddDrivingSchoolActivity addDrivingSchoolActivity, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        j2 j2Var = addDrivingSchoolActivity.G;
        j2 j2Var2 = null;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        if (j2Var.R.isChecked()) {
            j2 j2Var3 = addDrivingSchoolActivity.G;
            if (j2Var3 == null) {
                l.v("binding");
                j2Var3 = null;
            }
            j2Var3.R.setChecked(false);
            j2 j2Var4 = addDrivingSchoolActivity.G;
            if (j2Var4 == null) {
                l.v("binding");
                j2Var4 = null;
            }
            j2Var4.J.setVisibility(8);
            j2 j2Var5 = addDrivingSchoolActivity.G;
            if (j2Var5 == null) {
                l.v("binding");
                j2Var5 = null;
            }
            j2Var5.F.setVisibility(8);
            j2 j2Var6 = addDrivingSchoolActivity.G;
            if (j2Var6 == null) {
                l.v("binding");
                j2Var6 = null;
            }
            j2Var6.E.setVisibility(8);
            j2 j2Var7 = addDrivingSchoolActivity.G;
            if (j2Var7 == null) {
                l.v("binding");
            } else {
                j2Var2 = j2Var7;
            }
            j2Var2.O.setVisibility(8);
            return;
        }
        j2 j2Var8 = addDrivingSchoolActivity.G;
        if (j2Var8 == null) {
            l.v("binding");
            j2Var8 = null;
        }
        j2Var8.R.setChecked(true);
        j2 j2Var9 = addDrivingSchoolActivity.G;
        if (j2Var9 == null) {
            l.v("binding");
            j2Var9 = null;
        }
        j2Var9.J.setVisibility(0);
        j2 j2Var10 = addDrivingSchoolActivity.G;
        if (j2Var10 == null) {
            l.v("binding");
        } else {
            j2Var2 = j2Var10;
        }
        j2Var2.F.setVisibility(0);
        addDrivingSchoolActivity.y1();
    }

    /* access modifiers changed from: private */
    public static final void O1(AddDrivingSchoolActivity addDrivingSchoolActivity, CompoundButton compoundButton, boolean z10) {
        l.f(addDrivingSchoolActivity, "this$0");
        j2 j2Var = null;
        if (z10) {
            j2 j2Var2 = addDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
                j2Var2 = null;
            }
            j2Var2.J.setVisibility(0);
            j2 j2Var3 = addDrivingSchoolActivity.G;
            if (j2Var3 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var3;
            }
            j2Var.F.setVisibility(0);
            addDrivingSchoolActivity.y1();
            return;
        }
        j2 j2Var4 = addDrivingSchoolActivity.G;
        if (j2Var4 == null) {
            l.v("binding");
            j2Var4 = null;
        }
        j2Var4.J.setVisibility(8);
        j2 j2Var5 = addDrivingSchoolActivity.G;
        if (j2Var5 == null) {
            l.v("binding");
            j2Var5 = null;
        }
        j2Var5.F.setVisibility(8);
        j2 j2Var6 = addDrivingSchoolActivity.G;
        if (j2Var6 == null) {
            l.v("binding");
            j2Var6 = null;
        }
        j2Var6.E.setVisibility(8);
        j2 j2Var7 = addDrivingSchoolActivity.G;
        if (j2Var7 == null) {
            l.v("binding");
        } else {
            j2Var = j2Var7;
        }
        j2Var.O.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void P1(AddDrivingSchoolActivity addDrivingSchoolActivity, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        if (addDrivingSchoolActivity.O.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (StateWiseDrivingSchoolList name : addDrivingSchoolActivity.O) {
                arrayList.add(name.getName());
            }
            kk.e a10 = kk.e.A0.a(addDrivingSchoolActivity.D1().b("select_d_school", addDrivingSchoolActivity.getString(R.string.select_d_school)), arrayList);
            a10.k2(addDrivingSchoolActivity.F0(), "DSchoolPicker");
            a10.n2(new c(addDrivingSchoolActivity));
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePicker datePicker, int i10, int i11, int i12) {
        AppCompatEditText appCompatEditText;
        StringBuilder sb2;
        l.f(addDrivingSchoolActivity, "this$0");
        addDrivingSchoolActivity.S.set(1, i10);
        addDrivingSchoolActivity.S.set(2, i11);
        addDrivingSchoolActivity.S.set(5, i12);
        CharSequence format = DateFormat.format("dd", addDrivingSchoolActivity.S.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", addDrivingSchoolActivity.S.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", addDrivingSchoolActivity.S.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        int i13 = addDrivingSchoolActivity.P;
        j2 j2Var = null;
        if (i13 == 0) {
            j2 j2Var2 = addDrivingSchoolActivity.G;
            if (j2Var2 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var2;
            }
            appCompatEditText = j2Var.H;
            sb2 = new StringBuilder();
        } else if (i13 == 1) {
            j2 j2Var3 = addDrivingSchoolActivity.G;
            if (j2Var3 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var3;
            }
            appCompatEditText = j2Var.f26927z;
            sb2 = new StringBuilder();
        } else if (i13 == 2) {
            j2 j2Var4 = addDrivingSchoolActivity.G;
            if (j2Var4 == null) {
                l.v("binding");
            } else {
                j2Var = j2Var4;
            }
            appCompatEditText = j2Var.T;
            sb2 = new StringBuilder();
        } else if (i13 == 3) {
            j2 j2Var5 = addDrivingSchoolActivity.G;
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
    public static final void R1(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addDrivingSchoolActivity.P = 3;
        addDrivingSchoolActivity.x1(onDateSetListener);
    }

    /* access modifiers changed from: private */
    public static final void S1(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addDrivingSchoolActivity.P = 2;
        addDrivingSchoolActivity.x1(onDateSetListener);
    }

    /* access modifiers changed from: private */
    public static final void T1(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(addDrivingSchoolActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        addDrivingSchoolActivity.P = 1;
        addDrivingSchoolActivity.x1(onDateSetListener);
    }

    private final void U1() {
        SharedPreferences sharedPreferences = this.V;
        if (sharedPreferences == null) {
            l.v("pref");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("addedDSchoolDetails", new i7.d().t(this.Q));
        edit.apply();
        onBackPressed();
    }

    private final void Y1(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            this.R = new fc.b(this, arrayList, D1());
            j2 j2Var = this.G;
            fc.b bVar = null;
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
            fc.b bVar2 = this.R;
            if (bVar2 == null) {
                l.v("addedDSchoolAdapter");
            } else {
                bVar = bVar2;
            }
            recyclerView.setAdapter(bVar);
        }
    }

    private final void x1(DatePickerDialog.OnDateSetListener onDateSetListener) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, onDateSetListener, this.S.get(1), this.S.get(2), this.S.get(5));
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
            boolean r0 = r6.U
            r1 = 0
            r2 = 0
            java.lang.String r3 = "binding"
            if (r0 != 0) goto L_0x005f
            java.util.ArrayList r0 = r6.L
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
            java.util.ArrayList r0 = r6.L
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity.y1():void");
    }

    public final void A1(int i10) {
        this.T = i10;
        this.U = true;
        if (this.Q.size() > 0) {
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
            j2Var4.K.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getEnrollNo());
            j2 j2Var5 = this.G;
            if (j2Var5 == null) {
                l.v("binding");
                j2Var5 = null;
            }
            j2Var5.H.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getEnrollDate());
            j2 j2Var6 = this.G;
            if (j2Var6 == null) {
                l.v("binding");
                j2Var6 = null;
            }
            j2Var6.B.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getCertNo());
            j2 j2Var7 = this.G;
            if (j2Var7 == null) {
                l.v("binding");
                j2Var7 = null;
            }
            j2Var7.f26927z.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getCertDate());
            j2 j2Var8 = this.G;
            if (j2Var8 == null) {
                l.v("binding");
                j2Var8 = null;
            }
            j2Var8.T.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getTrainFrom());
            j2 j2Var9 = this.G;
            if (j2Var9 == null) {
                l.v("binding");
                j2Var9 = null;
            }
            j2Var9.V.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getTrainTo());
            j2 j2Var10 = this.G;
            if (j2Var10 == null) {
                l.v("binding");
                j2Var10 = null;
            }
            j2Var10.X.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getVehicleClassName());
            j2 j2Var11 = this.G;
            if (j2Var11 == null) {
                l.v("binding");
                j2Var11 = null;
            }
            j2Var11.G.setText(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getDrivingSchoolName());
            j2 j2Var12 = this.G;
            if (j2Var12 == null) {
                l.v("binding");
                j2Var12 = null;
            }
            j2Var12.G.setContentDescription(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getDschoolCode());
            j2 j2Var13 = this.G;
            if (j2Var13 == null) {
                l.v("binding");
                j2Var13 = null;
            }
            j2Var13.X.setContentDescription(((DrivingSchoolDetRequestModal) this.Q.get(i10)).getCovcd());
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
        ld.c cVar = this.M;
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
        ld.f fVar = this.N;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void V1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void W1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }

    public final void X1(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.N = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j2 x10 = j2.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        rj.b bVar = null;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = v9.e.f17509a;
        j2 j2Var = this.G;
        if (j2Var == null) {
            l.v("binding");
            j2Var = null;
        }
        aVar.u(this, j2Var);
        SharedPreferences sharedPreferences = getSharedPreferences("AddVehicleClass", 0);
        l.e(sharedPreferences, "getSharedPreferences(...)");
        this.V = sharedPreferences;
        C1();
        G1();
        B1();
        rj.b bVar2 = this.I;
        if (bVar2 == null) {
            l.v("viewModal");
            bVar2 = null;
        }
        bVar2.j().g(this, new f(new d(this)));
        rj.b bVar3 = this.I;
        if (bVar3 == null) {
            l.v("viewModal");
        } else {
            bVar = bVar3;
        }
        bVar.m().g(this, new f(new e(this)));
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
