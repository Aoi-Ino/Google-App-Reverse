package com.nic.mparivahan.dlservices.newlearner;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bj.a4;
import bj.b4;
import bj.c4;
import bj.d3;
import bj.d4;
import bj.e3;
import bj.e4;
import bj.f3;
import bj.f4;
import bj.g3;
import bj.h3;
import bj.i3;
import bj.j3;
import bj.k3;
import bj.l3;
import bj.m3;
import bj.n3;
import bj.o3;
import bj.p3;
import bj.q3;
import bj.r3;
import bj.s3;
import bj.t3;
import bj.u3;
import bj.v3;
import bj.w3;
import bj.x3;
import bj.y3;
import bj.z3;
import cm.l;
import cm.m;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.newlearner.DataClass.LlDrivingSchoolDetRequestModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.NewLLAcknowledgement;
import com.nic.mparivahan.dlservices.newlearner.DataClass.SubmittedLLResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.LearnerLicenceClasDatasModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.LearnerLicenceClassResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import ni.s6;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;
import v9.e;

public final class LearnerLicenseTrainingScreen extends androidx.appcompat.app.d implements CompoundButton.OnCheckedChangeListener {
    private String A0 = "";
    private String B0 = "";
    private String C0 = "";
    private String D0 = "";
    private String E0 = "";
    private int F0;
    private xj.b G;
    private String G0 = "";
    /* access modifiers changed from: private */
    public s6 H;
    private String H0 = "";
    /* access modifiers changed from: private */
    public ProgressDialog I;
    private String I0 = "";
    /* access modifiers changed from: private */
    public ld.c J;
    private String J0 = "";
    private NewLLServices K;
    private String K0 = "";
    private ld.f L;
    private String L0 = "";
    /* access modifiers changed from: private */
    public ArrayList M = new ArrayList();
    private String M0 = "";
    private ArrayList N = new ArrayList();
    private String N0 = "";
    private ArrayList O = new ArrayList();
    private String O0 = "";
    private ArrayList P = new ArrayList();
    private String P0 = "";
    /* access modifiers changed from: private */
    public ArrayList Q = new ArrayList();
    private String Q0 = "";
    private Calendar R = Calendar.getInstance();
    private String R0 = "";
    private String S = "true";
    private String S0 = "";
    private SharedPreferences T;
    private String T0 = "";
    private ArrayList U = new ArrayList();
    private String U0 = "";
    public w9.c V;
    private String V0 = "";
    public FromEligCheck W;
    private String W0 = "";
    public y8.c X;
    private String X0 = "";
    public SubmitInterface Y;
    private String Y0 = "";
    private String Z = "N";
    private String Z0 = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f21809a0 = "N";

    /* renamed from: a1  reason: collision with root package name */
    private String f21810a1 = "G";

    /* renamed from: b0  reason: collision with root package name */
    private String f21811b0 = "";

    /* renamed from: b1  reason: collision with root package name */
    private String f21812b1 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f21813c0 = "";

    /* renamed from: c1  reason: collision with root package name */
    private Aadarkyc.DOEkyc f21814c1;

    /* renamed from: d0  reason: collision with root package name */
    private String f21815d0 = "";

    /* renamed from: d1  reason: collision with root package name */
    private long f21816d1;

    /* renamed from: e0  reason: collision with root package name */
    private String f21817e0 = "";

    /* renamed from: e1  reason: collision with root package name */
    private boolean f21818e1;

    /* renamed from: f0  reason: collision with root package name */
    private String f21819f0 = "";
    /* access modifiers changed from: private */

    /* renamed from: f1  reason: collision with root package name */
    public String f21820f1 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f21821g0 = "";
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public boolean f21822g1;

    /* renamed from: h0  reason: collision with root package name */
    private String f21823h0 = "N";

    /* renamed from: h1  reason: collision with root package name */
    private boolean f21824h1;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public String f21825i0 = "";

    /* renamed from: i1  reason: collision with root package name */
    private String f21826i1 = "";
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public String f21827j0 = "";
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public String f21828k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f21829l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f21830m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f21831n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f21832o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f21833p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f21834q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f21835r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    private String f21836s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f21837t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f21838u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f21839v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f21840w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f21841x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f21842y0 = "";
    /* access modifiers changed from: private */

    /* renamed from: z0  reason: collision with root package name */
    public String f21843z0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTrainingScreen f21844e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f21845f;

        a(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, ArrayList arrayList) {
            this.f21844e = learnerLicenseTrainingScreen;
            this.f21845f = arrayList;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f21844e.N2(((AppCatPojo) this.f21845f.get(i10)).getAppCode());
            this.f21844e.O2(((AppCatPojo) this.f21845f.get(i10)).getAppCode());
            this.f21844e.d2();
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTrainingScreen f21846e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
            super(1);
            this.f21846e = learnerLicenseTrainingScreen;
        }

        public final void b(x9.a aVar) {
            try {
                throw null;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((x9.a) null);
            return x.f30437a;
        }
    }

    public static final class c extends n6.b {
        c() {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTrainingScreen f21847e;

        d(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
            this.f21847e = learnerLicenseTrainingScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (!p.o((String) this.f21847e.Q.get(i10), "Select", true)) {
                s6 J1 = this.f21847e.H;
                s6 s6Var = null;
                if (J1 == null) {
                    l.v("binding");
                    J1 = null;
                }
                J1.H.setText(((String) this.f21847e.Q.get(i10)) + ' ' + this.f21847e.getString(R.string.from_date_ll));
                s6 J12 = this.f21847e.H;
                if (J12 == null) {
                    l.v("binding");
                    J12 = null;
                }
                J12.Z.setText(((String) this.f21847e.Q.get(i10)) + ' ' + this.f21847e.getString(R.string.to_date_ll));
                s6 J13 = this.f21847e.H;
                if (J13 == null) {
                    l.v("binding");
                } else {
                    s6Var = J13;
                }
                s6Var.K.setText(((String) this.f21847e.Q.get(i10)) + ' ' + this.f21847e.getString(R.string.issue_authority_sarthi));
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTrainingScreen f21848e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
            super(1);
            this.f21848e = learnerLicenseTrainingScreen;
        }

        public final void b(LearnerLicenceClassResponseModal learnerLicenceClassResponseModal) {
            try {
                ProgressDialog N1 = this.f21848e.I;
                ProgressDialog progressDialog = null;
                if (N1 == null) {
                    l.v("pDialog");
                    N1 = null;
                }
                if (N1.isShowing()) {
                    ProgressDialog N12 = this.f21848e.I;
                    if (N12 == null) {
                        l.v("pDialog");
                    } else {
                        progressDialog = N12;
                    }
                    progressDialog.dismiss();
                }
                if (p.o(learnerLicenceClassResponseModal.getStatusCode(), "00", true)) {
                    this.f21848e.M = new ArrayList();
                    LearnerLicenseTrainingScreen learnerLicenseTrainingScreen = this.f21848e;
                    ArrayList<LearnerLicenceClasDatasModal> llCovs = learnerLicenceClassResponseModal.getLlCovs();
                    l.c(llCovs);
                    learnerLicenseTrainingScreen.M = llCovs;
                    if (this.f21848e.M.size() > 0) {
                        LearnerLicenseTrainingScreen learnerLicenseTrainingScreen2 = this.f21848e;
                        learnerLicenseTrainingScreen2.U2(learnerLicenseTrainingScreen2.M);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LearnerLicenceClassResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTrainingScreen f21849e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
            super(1);
            this.f21849e = learnerLicenseTrainingScreen;
        }

        public final void b(SubmittedLLResponseModal submittedLLResponseModal) {
            LearnerLicenseTrainingScreen learnerLicenseTrainingScreen;
            String bloodGroupError;
            ProgressDialog N1 = this.f21849e.I;
            ProgressDialog progressDialog = null;
            if (N1 == null) {
                l.v("pDialog");
                N1 = null;
            }
            if (N1.isShowing()) {
                ProgressDialog N12 = this.f21849e.I;
                if (N12 == null) {
                    l.v("pDialog");
                } else {
                    progressDialog = N12;
                }
                progressDialog.dismiss();
            }
            if (l.a(submittedLLResponseModal.getStatus_desc(), "Success")) {
                Intent intent = new Intent(this.f21849e, LLApplicationScreen.class);
                ArrayList<NewLLAcknowledgement> newLLAcknowledgement = submittedLLResponseModal.getNewLLAcknowledgement();
                l.c(newLLAcknowledgement);
                intent.putExtra("appNumber", newLLAcknowledgement.get(0).getApplicationNo());
                intent.putExtra("dobValue", submittedLLResponseModal.getNewLLAcknowledgement().get(0).getDob());
                intent.putExtra("rtoCd", this.f21849e.f21827j0);
                intent.putExtra("stateCd", this.f21849e.f21825i0);
                intent.putExtra("mobileNo", this.f21849e.f21843z0);
                intent.putExtra("rtoName", this.f21849e.f21828k0);
                intent.putExtra("aadharPhoto", this.f21849e.f21820f1);
                this.f21849e.startActivity(intent);
                this.f21849e.finish();
            } else if (p.o(submittedLLResponseModal.getStatus_desc(), "failure", true)) {
                ArrayList<NewLLAcknowledgement> newLLAcknowledgement2 = submittedLLResponseModal.getNewLLAcknowledgement();
                l.c(newLLAcknowledgement2);
                if (com.nic.mparivahan.dlservices.utilities.d.d(newLLAcknowledgement2.get(0).getVehicleClassError())) {
                    learnerLicenseTrainingScreen = this.f21849e;
                    bloodGroupError = submittedLLResponseModal.getNewLLAcknowledgement().get(0).getVehicleClassError();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidLocationError())) {
                    learnerLicenseTrainingScreen = this.f21849e;
                    bloodGroupError = submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidLocationError();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getNameMismatchError())) {
                    learnerLicenseTrainingScreen = this.f21849e;
                    bloodGroupError = submittedLLResponseModal.getNewLLAcknowledgement().get(0).getNameMismatchError();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidSubDistrictInPermanent())) {
                    learnerLicenseTrainingScreen = this.f21849e;
                    bloodGroupError = submittedLLResponseModal.getNewLLAcknowledgement().get(0).getValidSubDistrictInPermanent();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getFreshLLNotSaved())) {
                    learnerLicenseTrainingScreen = this.f21849e;
                    bloodGroupError = submittedLLResponseModal.getNewLLAcknowledgement().get(0).getFreshLLNotSaved();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(submittedLLResponseModal.getNewLLAcknowledgement().get(0).getBloodGroupError())) {
                    learnerLicenseTrainingScreen = this.f21849e;
                    bloodGroupError = submittedLLResponseModal.getNewLLAcknowledgement().get(0).getBloodGroupError();
                } else {
                    return;
                }
                learnerLicenseTrainingScreen.u2(learnerLicenseTrainingScreen, bloodGroupError);
            } else {
                Toast.makeText(this.f21849e, "Service is temporary unavailable. Try After some time", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmittedLLResponseModal) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTrainingScreen f21850e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
            super(1);
            this.f21850e = learnerLicenseTrainingScreen;
        }

        public final void b(String str) {
            ProgressDialog N1 = this.f21850e.I;
            ld.c cVar = null;
            if (N1 == null) {
                l.v("pDialog");
                N1 = null;
            }
            if (N1.isShowing()) {
                ProgressDialog N12 = this.f21850e.I;
                if (N12 == null) {
                    l.v("pDialog");
                    N12 = null;
                }
                N12.dismiss();
            }
            LearnerLicenseTrainingScreen learnerLicenseTrainingScreen = this.f21850e;
            ld.c R1 = learnerLicenseTrainingScreen.J;
            if (R1 == null) {
                l.v("session");
            } else {
                cVar = R1;
            }
            Toast.makeText(learnerLicenseTrainingScreen, cVar.b("service_is_not_present", "Something went wrong, Try after some time"), 0).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenseTrainingScreen f21851e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
            super(1);
            this.f21851e = learnerLicenseTrainingScreen;
        }

        public final void b(SubmitResponse submitResponse) {
            if (p.o(submitResponse.getStatus_desc(), "Success", true)) {
                this.f21851e.f21822g1 = true;
                try {
                    if (!l.a(submitResponse.getFoneObject().get(0).getMsg(), "")) {
                        Toast.makeText(this.f21851e, submitResponse.getFoneObject().get(0).getMsg(), 0).show();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else if (p.o(submitResponse.getStatus_desc(), "Failure", true)) {
                this.f21851e.f21822g1 = false;
                if (!l.a(submitResponse.getFoneObject().get(0).getMsg(), "")) {
                    LearnerLicenseTrainingScreen learnerLicenseTrainingScreen = this.f21851e;
                    learnerLicenseTrainingScreen.u2(learnerLicenseTrainingScreen, submitResponse.getFoneObject().get(0).getMsg());
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21852a;

        i(bm.l lVar) {
            l.f(lVar, "function");
            this.f21852a = lVar;
        }

        public final pl.c a() {
            return this.f21852a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21852a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$cY");
        l.f(radioButton2, "$cN");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21815d0 = "Y";
    }

    /* access modifiers changed from: private */
    public static final void B2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$dY");
        l.f(radioButton2, "$dN");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21817e0 = "Y";
    }

    /* access modifiers changed from: private */
    public static final void C2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$eY");
        l.f(radioButton2, "$eN");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21819f0 = "Y";
    }

    /* access modifiers changed from: private */
    public static final void D2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$fY");
        l.f(radioButton2, "$fN");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21821g0 = "Y";
    }

    /* access modifiers changed from: private */
    public static final void E2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$aN");
        l.f(radioButton2, "$aY");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21811b0 = "N";
    }

    /* access modifiers changed from: private */
    public static final void F2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$bN");
        l.f(radioButton2, "$bY");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21813c0 = "N";
    }

    /* access modifiers changed from: private */
    public static final void G2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$cN");
        l.f(radioButton2, "$cY");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21815d0 = "N";
    }

    /* access modifiers changed from: private */
    public static final void H2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$dN");
        l.f(radioButton2, "$dY");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21817e0 = "N";
    }

    /* access modifiers changed from: private */
    public static final void I2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$eN");
        l.f(radioButton2, "$eY");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21819f0 = "N";
    }

    /* access modifiers changed from: private */
    public static final void J2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$fN");
        l.f(radioButton2, "$fY");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21821g0 = "N";
    }

    /* access modifiers changed from: private */
    public static final void K2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, CheckBox checkBox, Dialog dialog, View view) {
        String str;
        l.f(learnerLicenseTrainingScreen, "this$0");
        l.f(checkBox, "$form_dec_check");
        l.f(dialog, "$d");
        if (l.a(learnerLicenseTrainingScreen.f21811b0, "")) {
            str = "Please select Yes/No option in Point A";
        } else if (l.a(learnerLicenseTrainingScreen.f21813c0, "")) {
            str = "Please select Yes/No option in Point B";
        } else if (l.a(learnerLicenseTrainingScreen.f21815d0, "")) {
            str = "Please select Yes/No option in Point C";
        } else if (l.a(learnerLicenseTrainingScreen.f21817e0, "")) {
            str = "Please select Yes/No option in Point D";
        } else if (l.a(learnerLicenseTrainingScreen.f21819f0, "")) {
            str = "Please select Yes/No option in Point E";
        } else if (l.a(learnerLicenseTrainingScreen.f21821g0, "")) {
            str = "Please select Yes/No option in Point F";
        } else if (!checkBox.isChecked()) {
            str = "Please click the checkbox to confirm the declaration";
        } else {
            dialog.dismiss();
            learnerLicenseTrainingScreen.g2().g(learnerLicenseTrainingScreen.b2());
            return;
        }
        learnerLicenseTrainingScreen.L2(learnerLicenseTrainingScreen, str);
    }

    private final void L2(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new x3(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void T2() {
        s6 s6Var = this.H;
        if (s6Var == null) {
            l.v("binding");
            s6Var = null;
        }
        s6Var.T.removeAllViews();
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            textView.setId(Integer.parseInt(((LearnerLicenceClasDatasModal) this.N.get(i10)).getCovCode()));
            textView.setText(((LearnerLicenceClasDatasModal) this.N.get(i10)).getCovName());
            linearLayout.addView(textView);
            s6 s6Var2 = this.H;
            if (s6Var2 == null) {
                l.v("binding");
                s6Var2 = null;
            }
            s6Var2.T.addView(linearLayout);
        }
    }

    /* access modifiers changed from: private */
    public final void U2(ArrayList arrayList) {
        s6 s6Var = this.H;
        if (s6Var == null) {
            l.v("binding");
            s6Var = null;
        }
        s6Var.S.removeAllViews();
        this.P = new ArrayList();
        this.O = new ArrayList();
        this.N = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            CheckBox checkBox = new CheckBox(this);
            checkBox.setOnCheckedChangeListener(this);
            checkBox.setId(Integer.parseInt(((LearnerLicenceClasDatasModal) arrayList.get(i10)).getCovCode()));
            checkBox.setText(((LearnerLicenceClasDatasModal) arrayList.get(i10)).getCovName());
            linearLayout.addView(checkBox);
            s6 s6Var2 = this.H;
            if (s6Var2 == null) {
                l.v("binding");
                s6Var2 = null;
            }
            s6Var2.S.addView(linearLayout);
        }
    }

    private final void V2(int i10) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new v3(this, i10), this.R.get(1), this.R.get(2), this.R.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void W2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, int i10, DatePicker datePicker, int i11, int i12, int i13) {
        TextView textView;
        StringBuilder sb2;
        l.f(learnerLicenseTrainingScreen, "this$0");
        learnerLicenseTrainingScreen.R.set(1, i11);
        learnerLicenseTrainingScreen.R.set(2, i12);
        learnerLicenseTrainingScreen.R.set(5, i13);
        CharSequence format = DateFormat.format("dd", learnerLicenseTrainingScreen.R.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", learnerLicenseTrainingScreen.R.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", learnerLicenseTrainingScreen.R.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        s6 s6Var = null;
        if (i10 == 1) {
            s6 s6Var2 = learnerLicenseTrainingScreen.H;
            if (s6Var2 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var2;
            }
            textView = s6Var.N;
            sb2 = new StringBuilder();
        } else if (i10 == 2) {
            s6 s6Var3 = learnerLicenseTrainingScreen.H;
            if (s6Var3 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var3;
            }
            textView = s6Var.I;
            sb2 = new StringBuilder();
        } else if (i10 == 3) {
            s6 s6Var4 = learnerLicenseTrainingScreen.H;
            if (s6Var4 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var4;
            }
            textView = s6Var.f28529a0;
            sb2 = new StringBuilder();
        } else {
            return;
        }
        sb2.append(str);
        sb2.append('-');
        sb2.append(str2);
        sb2.append('-');
        sb2.append(str3);
        textView.setText(sb2.toString());
    }

    private final void X1() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(0, new AppCatPojo("0", "Select Category"));
        arrayList.add(1, new AppCatPojo("G", "General"));
        arrayList.add(2, new AppCatPojo("R", "Repatriate"));
        arrayList.add(3, new AppCatPojo("T", "Refugees"));
        arrayList.add(4, new AppCatPojo("X", "Ex-Servicemen"));
        arrayList.add(5, new AppCatPojo("F", "Foreigners (Not Diplomats)"));
        arrayList.add(6, new AppCatPojo("D", "Diplomats (Foreigner)"));
        arrayList.add(7, new AppCatPojo("O", "OCI"));
        arrayList.add(8, new AppCatPojo("P", "Differently Abled"));
        oi.a aVar = new oi.a(this, arrayList);
        s6 s6Var = this.H;
        s6 s6Var2 = null;
        if (s6Var == null) {
            l.v("binding");
            s6Var = null;
        }
        s6Var.X.setAdapter(aVar);
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                break;
            }
            ld.f fVar = this.L;
            if (fVar == null) {
                l.v("sarthiSession");
                fVar = null;
            }
            if (l.a(q.B0(fVar.a()).toString(), q.B0(((AppCatPojo) arrayList.get(i10)).getAppCode()).toString())) {
                s6 s6Var3 = this.H;
                if (s6Var3 == null) {
                    l.v("binding");
                    s6Var3 = null;
                }
                s6Var3.X.setSelection(i10);
            } else {
                i10++;
            }
        }
        s6 s6Var4 = this.H;
        if (s6Var4 == null) {
            l.v("binding");
        } else {
            s6Var2 = s6Var4;
        }
        s6Var2.X.setOnItemSelectedListener(new a(this, arrayList));
    }

    private final void X2() {
        try {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_show_vehicle_info);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View findViewById = dialog.findViewById(R.id.closeIv);
            l.e(findViewById, "findViewById(...)");
            ImageView imageView = (ImageView) findViewById;
            View findViewById2 = dialog.findViewById(R.id.txtVehicleExplanation);
            l.e(findViewById2, "findViewById(...)");
            TextView textView = (TextView) findViewById2;
            ld.c cVar = this.J;
            ld.c cVar2 = null;
            if (cVar == null) {
                l.v("session");
                cVar = null;
            }
            textView.setText(Html.fromHtml(cVar.b("ll_info_explanation", getString(R.string.vehicle_explaination))));
            View findViewById3 = dialog.findViewById(R.id.txtVehicleExplanation1);
            l.e(findViewById3, "findViewById(...)");
            TextView textView2 = (TextView) findViewById3;
            ld.c cVar3 = this.J;
            if (cVar3 == null) {
                l.v("session");
                cVar3 = null;
            }
            textView2.setText(Html.fromHtml(cVar3.b("ll_info_non_transport", getString(R.string.non_transport_explaination))));
            View findViewById4 = dialog.findViewById(R.id.txtVehicleExplanation2);
            l.e(findViewById4, "findViewById(...)");
            TextView textView3 = (TextView) findViewById4;
            ld.c cVar4 = this.J;
            if (cVar4 == null) {
                l.v("session");
                cVar4 = null;
            }
            textView3.setText(Html.fromHtml(cVar4.b("ll_info_transport", getString(R.string.transport_explaination))));
            View findViewById5 = dialog.findViewById(R.id.txtVehicleExplanation3);
            l.e(findViewById5, "findViewById(...)");
            TextView textView4 = (TextView) findViewById5;
            ld.c cVar5 = this.J;
            if (cVar5 == null) {
                l.v("session");
                cVar5 = null;
            }
            textView4.setText(Html.fromHtml(cVar5.b("ll_info_light_motor", getString(R.string.light_vehicle_explaination))));
            View findViewById6 = dialog.findViewById(R.id.txtVehicleExplanation4);
            l.e(findViewById6, "findViewById(...)");
            TextView textView5 = (TextView) findViewById6;
            ld.c cVar6 = this.J;
            if (cVar6 == null) {
                l.v("session");
                cVar6 = null;
            }
            textView5.setText(Html.fromHtml(cVar6.b("ll_info_medium_motor", getString(R.string.medium_vehicle_explaination))));
            View findViewById7 = dialog.findViewById(R.id.txtVehicleExplanation5);
            l.e(findViewById7, "findViewById(...)");
            TextView textView6 = (TextView) findViewById7;
            ld.c cVar7 = this.J;
            if (cVar7 == null) {
                l.v("session");
            } else {
                cVar2 = cVar7;
            }
            textView6.setText(Html.fromHtml(cVar2.b("ll_info_heavy_motor", getString(R.string.heavy_vehicle_explaination))));
            imageView.setOnClickListener(new w3(dialog));
            dialog.show();
            Window window = dialog.getWindow();
            l.c(window);
            window.setLayout(-1, -2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final FormOneRequest Y1() {
        ArrayList arrayList = new ArrayList();
        ld.f fVar = this.L;
        if (fVar == null) {
            l.v("sarthiSession");
            fVar = null;
        }
        arrayList.add(Integer.valueOf(l.a(q.B0(fVar.l()).toString(), "HP") ? 509 : 501));
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", q.B0(this.f21827j0).toString(), arrayList);
    }

    /* access modifiers changed from: private */
    public static final void Y2(Dialog dialog, View view) {
        l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void Z1() {
        this.Q.add(0, "Select");
        this.Q.add(1, "Convicted");
        this.Q.add(2, "Disqualified");
        this.Q.add(3, "Cancelled");
        this.Q.add(4, "Suspended");
        this.Q.add(5, "Revoked");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.Q);
        arrayAdapter.setDropDownViewResource(17367049);
        s6 s6Var = this.H;
        if (s6Var == null) {
            l.v("binding");
            s6Var = null;
        }
        s6Var.Y.setAdapter(arrayAdapter);
    }

    private final void a2() {
        Q2(FromEligCheck.f8099a.a(this));
        P2((w9.c) new u0((x0) this, (u0.b) new w9.b(new w9.a(f2()))).a(w9.c.class));
        S2(SubmitInterface.f7733a.a(this));
        R2((y8.c) new u0((x0) this, (u0.b) new y8.a(new y8.b(h2()))).a(y8.c.class));
        e2().h(Y1());
        e2().j().g(this, new i(new b(this)));
    }

    private final y8.d b2() {
        ld.f fVar = this.L;
        if (fVar == null) {
            l.v("sarthiSession");
            fVar = null;
        }
        return new y8.d("430975", "E18D85C6554A4E4E0B48ABA798FB75E5", "10.128.201.115", "DLTestTrackForAgency", fVar.l(), "G", "", "", this.f21811b0, this.f21813c0, this.f21815d0, this.f21817e0, this.f21819f0, this.f21821g0, this.f21823h0, "Y", this.P);
    }

    private final void c2() {
        String stringExtra = getIntent().getStringExtra("stateCd");
        l.c(stringExtra);
        this.f21825i0 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("rtoCd");
        l.c(stringExtra2);
        this.f21827j0 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("rtoName");
        l.c(stringExtra3);
        this.f21828k0 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("applicantFName");
        l.c(stringExtra4);
        this.f21829l0 = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicantMName");
        l.c(stringExtra5);
        this.f21830m0 = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("applicantLName");
        l.c(stringExtra6);
        this.f21831n0 = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("fullName");
        l.c(stringExtra7);
        this.f21832o0 = stringExtra7;
        String stringExtra8 = getIntent().getStringExtra("relationship");
        l.c(stringExtra8);
        this.f21833p0 = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("relationFName");
        l.c(stringExtra9);
        this.f21834q0 = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("relationMName");
        l.c(stringExtra10);
        this.f21835r0 = stringExtra10;
        String stringExtra11 = getIntent().getStringExtra("relationLName");
        l.c(stringExtra11);
        this.f21836s0 = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("gender");
        l.c(stringExtra12);
        this.f21837t0 = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("dob");
        l.c(stringExtra13);
        this.f21838u0 = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("placeOfBirth");
        l.c(stringExtra14);
        this.f21839v0 = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("country");
        l.c(stringExtra15);
        this.f21840w0 = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("educationQualification");
        l.c(stringExtra16);
        this.f21841x0 = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("bloodGroup");
        l.c(stringExtra17);
        this.f21842y0 = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("applicantMobileNo");
        l.c(stringExtra18);
        this.f21843z0 = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("emailId");
        l.c(stringExtra19);
        this.A0 = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("altMobileNo");
        l.c(stringExtra20);
        this.B0 = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("landlineNo");
        l.c(stringExtra21);
        this.E0 = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("identificationMark1");
        l.c(stringExtra22);
        this.C0 = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("identificationMark2");
        l.c(stringExtra23);
        this.D0 = stringExtra23;
        this.F0 = getIntent().getIntExtra("enteredAge", 0);
        String stringExtra24 = getIntent().getStringExtra("presState");
        l.c(stringExtra24);
        this.G0 = stringExtra24;
        String stringExtra25 = getIntent().getStringExtra("presDistrict");
        l.c(stringExtra25);
        this.H0 = stringExtra25;
        String stringExtra26 = getIntent().getStringExtra("presSubDistrict");
        l.c(stringExtra26);
        this.I0 = stringExtra26;
        String stringExtra27 = getIntent().getStringExtra("presVillageOrTown");
        l.c(stringExtra27);
        this.J0 = stringExtra27;
        String stringExtra28 = getIntent().getStringExtra("preSelectedVillOrTown");
        l.c(stringExtra28);
        this.O0 = stringExtra28;
        String stringExtra29 = getIntent().getStringExtra("presHouseNo");
        l.c(stringExtra29);
        this.K0 = stringExtra29;
        String stringExtra30 = getIntent().getStringExtra("presStreet");
        l.c(stringExtra30);
        this.L0 = stringExtra30;
        String stringExtra31 = getIntent().getStringExtra("presLocation");
        l.c(stringExtra31);
        this.M0 = stringExtra31;
        String stringExtra32 = getIntent().getStringExtra("presPincode");
        l.c(stringExtra32);
        this.N0 = stringExtra32;
        String stringExtra33 = getIntent().getStringExtra("year");
        l.c(stringExtra33);
        this.P0 = stringExtra33;
        String stringExtra34 = getIntent().getStringExtra("month");
        l.c(stringExtra34);
        this.Q0 = stringExtra34;
        String stringExtra35 = getIntent().getStringExtra("perState");
        l.c(stringExtra35);
        this.R0 = stringExtra35;
        String stringExtra36 = getIntent().getStringExtra("perDistrict");
        l.c(stringExtra36);
        this.S0 = stringExtra36;
        String stringExtra37 = getIntent().getStringExtra("perSubDistrict");
        l.c(stringExtra37);
        this.T0 = stringExtra37;
        String stringExtra38 = getIntent().getStringExtra("permVillageOrTown");
        l.c(stringExtra38);
        this.U0 = stringExtra38;
        String stringExtra39 = getIntent().getStringExtra("permSelectedVillOrTown");
        l.c(stringExtra39);
        this.Z0 = stringExtra39;
        String stringExtra40 = getIntent().getStringExtra("perHouseNo");
        l.c(stringExtra40);
        this.V0 = stringExtra40;
        String stringExtra41 = getIntent().getStringExtra("perStreet");
        l.c(stringExtra41);
        this.W0 = stringExtra41;
        String stringExtra42 = getIntent().getStringExtra("perLocation");
        l.c(stringExtra42);
        this.X0 = stringExtra42;
        String stringExtra43 = getIntent().getStringExtra("perPinCode");
        l.c(stringExtra43);
        this.Y0 = stringExtra43;
        if (getIntent().hasExtra("dataFromAadhar") && getIntent().getBooleanExtra("dataFromAadhar", false)) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("aadharData");
            l.c(parcelableExtra);
            this.f21814c1 = (Aadarkyc.DOEkyc) parcelableExtra;
            this.f21816d1 = getIntent().getLongExtra("ekycId", 0);
            this.f21818e1 = getIntent().getBooleanExtra("dataFromAadhar", false);
            Aadarkyc.DOEkyc dOEkyc = this.f21814c1;
            if (dOEkyc == null) {
                l.v("aadharData");
                dOEkyc = null;
            }
            this.f21820f1 = dOEkyc.getPht();
        }
    }

    /* access modifiers changed from: private */
    public final void d2() {
        ProgressDialog progressDialog = this.I;
        xj.b bVar = null;
        if (progressDialog == null) {
            l.v("pDialog");
            progressDialog = null;
        }
        progressDialog.show();
        xj.b bVar2 = this.G;
        if (bVar2 == null) {
            l.v("learnerLicenceVM");
        } else {
            bVar = bVar2;
        }
        bVar.v(this.f21825i0, this.F0, Integer.parseInt(this.f21841x0), this.f21812b1);
    }

    private final void i2() {
        this.L = new ld.f(this);
        s6 s6Var = this.H;
        s6 s6Var2 = null;
        if (s6Var == null) {
            l.v("binding");
            s6Var = null;
        }
        s6Var.O.f28448b.setOnClickListener(new o3(this));
        s6 s6Var3 = this.H;
        if (s6Var3 == null) {
            l.v("binding");
            s6Var3 = null;
        }
        TextView textView = s6Var3.O.f28452f;
        ld.f fVar = this.L;
        if (fVar == null) {
            l.v("sarthiSession");
            fVar = null;
        }
        textView.setText(fVar.i());
        this.K = NewLLServices.f22242a.a(this);
        NewLLServices newLLServices = this.K;
        if (newLLServices == null) {
            l.v("service");
            newLLServices = null;
        }
        this.G = (xj.b) new u0((x0) this, (u0.b) new yj.a(new xj.a(newLLServices))).a(xj.b.class);
        s6 s6Var4 = this.H;
        if (s6Var4 == null) {
            l.v("binding");
            s6Var4 = null;
        }
        s6Var4.f28533e0.setOnCheckedChangeListener(new z3(this));
        s6 s6Var5 = this.H;
        if (s6Var5 == null) {
            l.v("binding");
            s6Var5 = null;
        }
        s6Var5.A.setOnClickListener(new a4(this));
        s6 s6Var6 = this.H;
        if (s6Var6 == null) {
            l.v("binding");
            s6Var6 = null;
        }
        s6Var6.D.setOnCheckedChangeListener(new b4(this));
        s6 s6Var7 = this.H;
        if (s6Var7 == null) {
            l.v("binding");
            s6Var7 = null;
        }
        s6Var7.Y.setOnItemSelectedListener(new d(this));
        s6 s6Var8 = this.H;
        if (s6Var8 == null) {
            l.v("binding");
            s6Var8 = null;
        }
        s6Var8.N.setOnClickListener(new c4(this));
        s6 s6Var9 = this.H;
        if (s6Var9 == null) {
            l.v("binding");
            s6Var9 = null;
        }
        s6Var9.I.setOnClickListener(new d4(this));
        s6 s6Var10 = this.H;
        if (s6Var10 == null) {
            l.v("binding");
            s6Var10 = null;
        }
        s6Var10.f28529a0.setOnClickListener(new e4(this));
        s6 s6Var11 = this.H;
        if (s6Var11 == null) {
            l.v("binding");
            s6Var11 = null;
        }
        s6Var11.J.setOnClickListener(new f4(this));
        s6 s6Var12 = this.H;
        if (s6Var12 == null) {
            l.v("binding");
            s6Var12 = null;
        }
        s6Var12.P.setOnClickListener(new e3(this));
        s6 s6Var13 = this.H;
        if (s6Var13 == null) {
            l.v("binding");
            s6Var13 = null;
        }
        s6Var13.B.setOnClickListener(new f3(this));
        s6 s6Var14 = this.H;
        if (s6Var14 == null) {
            l.v("binding");
        } else {
            s6Var2 = s6Var14;
        }
        s6Var2.G.setOnClickListener(new y3(this));
    }

    /* access modifiers changed from: private */
    public static final void j2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        learnerLicenseTrainingScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void k2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, RadioGroup radioGroup, int i10) {
        AppCompatEditText appCompatEditText;
        int i11;
        l.f(learnerLicenseTrainingScreen, "this$0");
        View findViewById = learnerLicenseTrainingScreen.findViewById(i10);
        l.e(findViewById, "findViewById(...)");
        RadioButton radioButton = (RadioButton) findViewById;
        s6 s6Var = null;
        if (l.a(radioButton.getText(), "Yes")) {
            learnerLicenseTrainingScreen.S = "true";
            s6 s6Var2 = learnerLicenseTrainingScreen.H;
            if (s6Var2 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var2;
            }
            appCompatEditText = s6Var.R;
            i11 = 0;
        } else if (l.a(radioButton.getText(), "No")) {
            learnerLicenseTrainingScreen.S = "false";
            s6 s6Var3 = learnerLicenseTrainingScreen.H;
            if (s6Var3 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var3;
            }
            appCompatEditText = s6Var.R;
            i11 = 8;
        } else {
            return;
        }
        appCompatEditText.setVisibility(i11);
    }

    /* access modifiers changed from: private */
    public static final void l2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        if (learnerLicenseTrainingScreen.P.size() > 0) {
            learnerLicenseTrainingScreen.w2();
            return;
        }
        ld.c cVar = learnerLicenseTrainingScreen.J;
        if (cVar == null) {
            l.v("session");
            cVar = null;
        }
        Toast.makeText(learnerLicenseTrainingScreen, cVar.b("select_one_vehicle_class", learnerLicenseTrainingScreen.getString(R.string.please_select_vehicle_class)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void m2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        Intent intent = new Intent(learnerLicenseTrainingScreen, AddLLDrivingSchoolActivity.class);
        intent.putExtra("stateCd", learnerLicenseTrainingScreen.f21825i0);
        intent.putParcelableArrayListExtra("addedCov", learnerLicenseTrainingScreen.U);
        intent.putParcelableArrayListExtra("selectedVehicleClassId", learnerLicenseTrainingScreen.N);
        learnerLicenseTrainingScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void n2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, CompoundButton compoundButton, boolean z10) {
        LinearLayout linearLayout;
        int i10;
        l.f(learnerLicenseTrainingScreen, "this$0");
        s6 s6Var = null;
        s6 s6Var2 = learnerLicenseTrainingScreen.H;
        if (z10) {
            if (s6Var2 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var2;
            }
            linearLayout = s6Var.C;
            i10 = 0;
        } else {
            if (s6Var2 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var2;
            }
            linearLayout = s6Var.C;
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }

    /* access modifiers changed from: private */
    public static final void o2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        learnerLicenseTrainingScreen.V2(1);
    }

    /* access modifiers changed from: private */
    public static final void p2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        learnerLicenseTrainingScreen.V2(2);
    }

    /* access modifiers changed from: private */
    public static final void q2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        learnerLicenseTrainingScreen.V2(3);
    }

    /* access modifiers changed from: private */
    public static final void r2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        learnerLicenseTrainingScreen.X2();
    }

    /* access modifiers changed from: private */
    public static final void s2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        xj.b bVar;
        String string;
        String str6;
        LearnerLicenseTrainingScreen learnerLicenseTrainingScreen2 = learnerLicenseTrainingScreen;
        l.f(learnerLicenseTrainingScreen2, "this$0");
        ld.c cVar = null;
        if (l.a(learnerLicenseTrainingScreen2.f21810a1, "0")) {
            ld.c cVar2 = learnerLicenseTrainingScreen2.J;
            if (cVar2 == null) {
                l.v("session");
            } else {
                cVar = cVar2;
            }
            string = learnerLicenseTrainingScreen2.getString(R.string.sel_app_category);
            str6 = "select_app_cat";
        } else if (learnerLicenseTrainingScreen2.P.size() == 0) {
            ld.c cVar3 = learnerLicenseTrainingScreen2.J;
            if (cVar3 == null) {
                l.v("session");
            } else {
                cVar = cVar3;
            }
            string = learnerLicenseTrainingScreen2.getString(R.string.please_select_vehicle_class);
            str6 = "select_one_vehicle_class";
        } else if (!learnerLicenseTrainingScreen2.f21824h1 || learnerLicenseTrainingScreen2.f21822g1) {
            if (l.a(learnerLicenseTrainingScreen2.S, "true")) {
                s6 s6Var = learnerLicenseTrainingScreen2.H;
                if (s6Var == null) {
                    l.v("binding");
                    s6Var = null;
                }
                if (String.valueOf(s6Var.R.getText()).length() == 0) {
                    ld.c cVar4 = learnerLicenseTrainingScreen2.J;
                    if (cVar4 == null) {
                        l.v("session");
                    } else {
                        cVar = cVar4;
                    }
                    string = learnerLicenseTrainingScreen2.getString(R.string.emergency_contact);
                    str6 = "edit_dl_serv_emer_cont_no";
                }
            }
            s6 s6Var2 = learnerLicenseTrainingScreen2.H;
            if (s6Var2 == null) {
                l.v("binding");
                s6Var2 = null;
            }
            if (!s6Var2.V.isChecked()) {
                ld.c cVar5 = learnerLicenseTrainingScreen2.J;
                if (cVar5 == null) {
                    l.v("session");
                } else {
                    cVar = cVar5;
                }
                string = learnerLicenseTrainingScreen2.getString(R.string.pls_enter_term_conditions);
                str6 = "plz_accept_term_conditions";
            } else {
                ProgressDialog progressDialog = learnerLicenseTrainingScreen2.I;
                if (progressDialog == null) {
                    l.v("pDialog");
                    progressDialog = null;
                }
                progressDialog.show();
                SharedPreferences sharedPreferences = learnerLicenseTrainingScreen2.T;
                if (sharedPreferences == null) {
                    l.v("pref");
                    sharedPreferences = null;
                }
                String string2 = sharedPreferences.getString("addedDSchoolDetails", (String) null);
                if (com.nic.mparivahan.dlservices.utilities.d.d(string2)) {
                    Type b10 = new c().b();
                    l.e(b10, "getType(...)");
                    Object k10 = new i7.d().k(string2, b10);
                    l.e(k10, "fromJson(...)");
                    learnerLicenseTrainingScreen2.U = (ArrayList) k10;
                }
                ArrayList arrayList = new ArrayList();
                int size = learnerLicenseTrainingScreen2.U.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new LlDrivingSchoolDetRequestModal(((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getEnrollDate(), ((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getCovcd(), ((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getTrainTo(), ((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getCertDate(), ((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getCertNo(), ((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getEnrollNo(), ((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getTrainFrom(), ((DrivingSchoolDetRequestModal) learnerLicenseTrainingScreen2.U.get(i10)).getDrivingSchoolName()));
                }
                JSONArray jSONArray2 = new JSONArray();
                if (arrayList.size() > 0) {
                    jSONArray = new JSONArray(new i7.d().t(arrayList));
                    str = "true";
                } else {
                    jSONArray = jSONArray2;
                    str = "false";
                }
                if (l.a(learnerLicenseTrainingScreen2.O0, "R")) {
                    str3 = learnerLicenseTrainingScreen2.J0;
                    str2 = "";
                } else {
                    str2 = learnerLicenseTrainingScreen2.J0;
                    str3 = "";
                }
                if (l.a(learnerLicenseTrainingScreen2.Z0, "R")) {
                    str5 = learnerLicenseTrainingScreen2.U0;
                    str4 = "";
                } else {
                    str4 = learnerLicenseTrainingScreen2.U0;
                    str5 = "";
                }
                String str7 = learnerLicenseTrainingScreen2.f21822g1 ? "true" : "false";
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                if (learnerLicenseTrainingScreen2.f21822g1) {
                    jSONObject.put("scopea", (Object) learnerLicenseTrainingScreen2.f21811b0);
                    jSONObject.put("scopeb", (Object) learnerLicenseTrainingScreen2.f21813c0);
                    jSONObject.put("scopeb1", (Object) "");
                    jSONObject.put("scopeb2", (Object) "");
                    jSONObject.put("scopec", (Object) learnerLicenseTrainingScreen2.f21815d0);
                    jSONObject.put("scoped", (Object) learnerLicenseTrainingScreen2.f21817e0);
                    jSONObject.put("scopee", (Object) learnerLicenseTrainingScreen2.f21819f0);
                    jSONObject.put("scopef", (Object) learnerLicenseTrainingScreen2.f21821g0);
                    jSONObject.put("scopeg", (Object) learnerLicenseTrainingScreen2.f21823h0);
                    jSONObject.put("declarationCheck", (Object) learnerLicenseTrainingScreen2.f21826i1);
                }
                jSONArray3.put((Object) jSONObject);
                xj.b bVar2 = learnerLicenseTrainingScreen2.G;
                if (bVar2 == null) {
                    l.v("learnerLicenceVM");
                    bVar = null;
                } else {
                    bVar = bVar2;
                }
                bVar.B(learnerLicenseTrainingScreen2.f21825i0, learnerLicenseTrainingScreen2.f21827j0, learnerLicenseTrainingScreen2.f21829l0, learnerLicenseTrainingScreen2.f21830m0, learnerLicenseTrainingScreen2.f21831n0, learnerLicenseTrainingScreen2.f21833p0, learnerLicenseTrainingScreen2.f21834q0, learnerLicenseTrainingScreen2.f21835r0, learnerLicenseTrainingScreen2.f21836s0, learnerLicenseTrainingScreen2.f21832o0, learnerLicenseTrainingScreen2.f21837t0, learnerLicenseTrainingScreen2.f21838u0, learnerLicenseTrainingScreen2.f21839v0, learnerLicenseTrainingScreen2.f21840w0, learnerLicenseTrainingScreen2.f21841x0, learnerLicenseTrainingScreen2.f21842y0, learnerLicenseTrainingScreen2.E0, learnerLicenseTrainingScreen2.A0, learnerLicenseTrainingScreen2.f21843z0, learnerLicenseTrainingScreen2.B0, learnerLicenseTrainingScreen2.C0, learnerLicenseTrainingScreen2.D0, learnerLicenseTrainingScreen2.G0, learnerLicenseTrainingScreen2.H0, learnerLicenseTrainingScreen2.I0, str3, str2, learnerLicenseTrainingScreen2.K0, learnerLicenseTrainingScreen2.L0, learnerLicenseTrainingScreen2.N0, learnerLicenseTrainingScreen2.P0, learnerLicenseTrainingScreen2.Q0, learnerLicenseTrainingScreen2.R0, learnerLicenseTrainingScreen2.S0, learnerLicenseTrainingScreen2.T0, str5, str4, learnerLicenseTrainingScreen2.V0, learnerLicenseTrainingScreen2.W0, learnerLicenseTrainingScreen2.Y0, learnerLicenseTrainingScreen2.P, learnerLicenseTrainingScreen2.S, learnerLicenseTrainingScreen2.O0, learnerLicenseTrainingScreen2.Z0, str, learnerLicenseTrainingScreen2.f21810a1, jSONArray, String.valueOf(learnerLicenseTrainingScreen2.f21816d1), learnerLicenseTrainingScreen2.f21818e1, learnerLicenseTrainingScreen2.f21820f1, str7, jSONArray3);
                return;
            }
        } else {
            ld.c cVar6 = learnerLicenseTrainingScreen2.J;
            if (cVar6 == null) {
                l.v("session");
            } else {
                cVar = cVar6;
            }
            string = learnerLicenseTrainingScreen2.getString(R.string.please_submit_form1);
            str6 = "please_submit_form1";
        }
        Toast.makeText(learnerLicenseTrainingScreen2, cVar.b(str6, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void t2(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(learnerLicenseTrainingScreen, "this$0");
        learnerLicenseTrainingScreen.startActivity(new Intent(learnerLicenseTrainingScreen, LearnerLicenceAadharScreen.class));
        learnerLicenseTrainingScreen.finish();
    }

    /* access modifiers changed from: private */
    public final void u2(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new d3(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void v2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void w2() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.declaration_form);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.next_request);
        l.d(findViewById, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        View findViewById2 = dialog.findViewById(R.id.a_y);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton = (RadioButton) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.b_y);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton2 = (RadioButton) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.c_y);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton3 = (RadioButton) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.d_y);
        l.d(findViewById5, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton4 = (RadioButton) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.e_y);
        l.d(findViewById6, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton5 = (RadioButton) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.f_y);
        l.d(findViewById7, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton6 = (RadioButton) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.a_n);
        l.d(findViewById8, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton7 = (RadioButton) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.b_n);
        l.d(findViewById9, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton8 = (RadioButton) findViewById9;
        View findViewById10 = dialog.findViewById(R.id.c_n);
        l.d(findViewById10, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton9 = (RadioButton) findViewById10;
        View findViewById11 = dialog.findViewById(R.id.d_n);
        l.d(findViewById11, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton10 = (RadioButton) findViewById11;
        View findViewById12 = dialog.findViewById(R.id.e_n);
        l.d(findViewById12, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton11 = (RadioButton) findViewById12;
        View findViewById13 = dialog.findViewById(R.id.f_n);
        l.d(findViewById13, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton12 = (RadioButton) findViewById13;
        View findViewById14 = dialog.findViewById(R.id.closeIv);
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) findViewById;
        l.d(findViewById14, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById14).setOnClickListener(new g3(dialog));
        View findViewById15 = dialog.findViewById(R.id.form_dec_check);
        l.d(findViewById15, "null cannot be cast to non-null type android.widget.CheckBox");
        CheckBox checkBox = (CheckBox) findViewById15;
        radioButton.setOnClickListener(new l3(radioButton, radioButton7, this));
        radioButton2.setOnClickListener(new m3(radioButton2, radioButton8, this));
        radioButton3.setOnClickListener(new n3(radioButton3, radioButton9, this));
        radioButton4.setOnClickListener(new p3(radioButton4, radioButton10, this));
        radioButton5.setOnClickListener(new q3(radioButton5, radioButton11, this));
        radioButton6.setOnClickListener(new r3(radioButton6, radioButton12, this));
        radioButton7.setOnClickListener(new s3(radioButton7, radioButton, this));
        radioButton8.setOnClickListener(new t3(radioButton8, radioButton2, this));
        radioButton9.setOnClickListener(new u3(radioButton9, radioButton3, this));
        radioButton10.setOnClickListener(new h3(radioButton10, radioButton4, this));
        radioButton11.setOnClickListener(new i3(radioButton11, radioButton5, this));
        radioButton12.setOnClickListener(new j3(radioButton12, radioButton6, this));
        this.f21826i1 = checkBox.isChecked() ? "Y" : "N";
        customWegetLayout.setOnClickListener(new k3(this, checkBox, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void x2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$aY");
        l.f(radioButton2, "$aN");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21811b0 = "Y";
    }

    /* access modifiers changed from: private */
    public static final void z2(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, View view) {
        l.f(radioButton, "$bY");
        l.f(radioButton2, "$bN");
        l.f(learnerLicenseTrainingScreen, "this$0");
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        learnerLicenseTrainingScreen.f21813c0 = "Y";
    }

    public final void N2(String str) {
        l.f(str, "<set-?>");
        this.f21810a1 = str;
    }

    public final void O2(String str) {
        l.f(str, "<set-?>");
        this.f21812b1 = str;
    }

    public final void P2(w9.c cVar) {
        l.f(cVar, "<set-?>");
        this.V = cVar;
    }

    public final void Q2(FromEligCheck fromEligCheck) {
        l.f(fromEligCheck, "<set-?>");
        this.W = fromEligCheck;
    }

    public final void R2(y8.c cVar) {
        l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void S2(SubmitInterface submitInterface) {
        l.f(submitInterface, "<set-?>");
        this.Y = submitInterface;
    }

    public final w9.c e2() {
        w9.c cVar = this.V;
        if (cVar != null) {
            return cVar;
        }
        l.v("mFormEligVM");
        return null;
    }

    public final FromEligCheck f2() {
        FromEligCheck fromEligCheck = this.W;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        l.v("mFormsInterface");
        return null;
    }

    public final y8.c g2() {
        y8.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        l.v("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface h2() {
        SubmitInterface submitInterface = this.Y;
        if (submitInterface != null) {
            return submitInterface;
        }
        l.v("mSubmitInterface");
        return null;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ArrayList arrayList = this.O;
        l.c(compoundButton);
        if (arrayList.contains(Integer.valueOf(compoundButton.getId()))) {
            this.O.remove(Integer.valueOf(compoundButton.getId()));
            this.P.remove(String.valueOf(compoundButton.getId()));
            this.N.remove(new LearnerLicenceClasDatasModal(compoundButton.getText().toString(), String.valueOf(compoundButton.getId())));
        } else {
            this.O.add(Integer.valueOf(compoundButton.getId()));
            this.P.add(String.valueOf(compoundButton.getId()));
            this.N.add(new LearnerLicenceClasDatasModal(compoundButton.getText().toString(), String.valueOf(compoundButton.getId())));
        }
        s6 s6Var = null;
        if (this.N.size() > 0) {
            s6 s6Var2 = this.H;
            if (s6Var2 == null) {
                l.v("binding");
                s6Var2 = null;
            }
            s6Var2.U.setVisibility(0);
            s6 s6Var3 = this.H;
            if (s6Var3 == null) {
                l.v("binding");
            } else {
                s6Var = s6Var3;
            }
            s6Var.T.setVisibility(0);
            T2();
            return;
        }
        s6 s6Var4 = this.H;
        if (s6Var4 == null) {
            l.v("binding");
            s6Var4 = null;
        }
        s6Var4.T.setVisibility(8);
        s6 s6Var5 = this.H;
        if (s6Var5 == null) {
            l.v("binding");
        } else {
            s6Var = s6Var5;
        }
        s6Var.U.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s6 x10 = s6.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.H = x10;
        xj.b bVar = null;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        this.J = new ld.c(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.I = progressDialog;
        ld.c cVar = this.J;
        if (cVar == null) {
            l.v("session");
            cVar = null;
        }
        progressDialog.setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        ProgressDialog progressDialog2 = this.I;
        if (progressDialog2 == null) {
            l.v("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.I;
        if (progressDialog3 == null) {
            l.v("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        SharedPreferences sharedPreferences = getSharedPreferences("AddLLVehicleClass", 0);
        l.e(sharedPreferences, "getSharedPreferences(...)");
        this.T = sharedPreferences;
        e.a aVar = v9.e.f17509a;
        s6 s6Var = this.H;
        if (s6Var == null) {
            l.v("binding");
            s6Var = null;
        }
        aVar.c1(this, s6Var);
        c2();
        Z1();
        i2();
        X1();
        a2();
        xj.b bVar2 = this.G;
        if (bVar2 == null) {
            l.v("learnerLicenceVM");
            bVar2 = null;
        }
        bVar2.z().g(this, new i(new e(this)));
        xj.b bVar3 = this.G;
        if (bVar3 == null) {
            l.v("learnerLicenceVM");
            bVar3 = null;
        }
        bVar3.A().g(this, new i(new f(this)));
        xj.b bVar4 = this.G;
        if (bVar4 == null) {
            l.v("learnerLicenceVM");
        } else {
            bVar = bVar4;
        }
        bVar.u().g(this, new i(new g(this)));
        g2().i().g(this, new i(new h(this)));
    }
}
