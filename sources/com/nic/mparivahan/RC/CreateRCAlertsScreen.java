package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.m;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import ka.c;
import ni.ba;
import pl.x;
import v9.e;
import vc.j;
import vc.k;
import vc.n;
import vc.o;
import vc.p;
import vc.q;
import vc.r;
import vc.s;
import yc.i;

public final class CreateRCAlertsScreen extends androidx.appcompat.app.d implements ra.c {
    public cd.c G;
    public RcService H;
    public Context I;
    public ProgressDialog J;
    public LinearLayout K;
    public MyTextView L;
    public String M;
    public ld.g N;
    public RcModelsDet O;
    public EditText P;
    public EditText Q;
    public EditText R;
    public DatabaseHelper S;
    public String T;
    public String U;
    public RecyclerView V;
    public RecyclerView W;
    public wc.b X;
    public LinearLayout Y;
    public ArrayList Z;

    /* renamed from: a0  reason: collision with root package name */
    public wc.f f9450a0;

    /* renamed from: b0  reason: collision with root package name */
    public LinearLayout f9451b0;

    /* renamed from: c0  reason: collision with root package name */
    public ld.c f9452c0;

    /* renamed from: d0  reason: collision with root package name */
    private ba f9453d0;

    /* renamed from: e0  reason: collision with root package name */
    private String f9454e0 = "0";

    /* renamed from: f0  reason: collision with root package name */
    public String f9455f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f9456g0;

    /* renamed from: h0  reason: collision with root package name */
    private int f9457h0;

    /* renamed from: i0  reason: collision with root package name */
    public v8.h f9458i0;

    /* renamed from: j0  reason: collision with root package name */
    private SignService f9459j0;

    /* renamed from: k0  reason: collision with root package name */
    private Dialog f9460k0;

    /* renamed from: l0  reason: collision with root package name */
    public bi.h f9461l0;

    /* renamed from: m0  reason: collision with root package name */
    public VahanProService f9462m0;

    /* renamed from: n0  reason: collision with root package name */
    private String f9463n0 = " ";

    /* renamed from: o0  reason: collision with root package name */
    private String f9464o0 = " ";

    /* renamed from: p0  reason: collision with root package name */
    private String f9465p0 = " ";

    /* renamed from: q0  reason: collision with root package name */
    public ld.e f9466q0;

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9467e;

        a(CreateRCAlertsScreen createRCAlertsScreen) {
            this.f9467e = createRCAlertsScreen;
        }

        public void afterTextChanged(Editable editable) {
            l.f(editable, "s");
            if (editable.toString().length() == 5) {
                this.f9467e.H1().requestFocus();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "s");
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9468e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CreateRCAlertsScreen createRCAlertsScreen) {
            super(1);
            this.f9468e = createRCAlertsScreen;
        }

        public final void b(GetStateCode getStateCode) {
            if (getStateCode != null) {
                try {
                    if (!ka.c.f13158a.m(getStateCode.getStateCd())) {
                        this.f9468e.X2(getStateCode.getStateCd());
                        this.f9468e.N2(String.valueOf(getStateCode.getOffCd()));
                        this.f9468e.R1().m(this.f9468e.K1().getText().toString(), this.f9468e.c2().k().toString(), this.f9468e.I1(), this.f9468e.J1(), this.f9468e, v9.d.f17494a.r());
                    }
                } catch (Exception unused) {
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetStateCode) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9469e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CreateRCAlertsScreen createRCAlertsScreen) {
            super(1);
            this.f9469e = createRCAlertsScreen;
        }

        public final void b(String str) {
            this.f9469e.V1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9470e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CreateRCAlertsScreen createRCAlertsScreen) {
            super(1);
            this.f9470e = createRCAlertsScreen;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            Context applicationContext;
            String b10;
            try {
                this.f9470e.V1().dismiss();
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f9470e.S1().M(this.f9470e.T1());
                        this.f9470e.G1().X(this.f9470e.a2());
                        CreateRCAlertsScreen createRCAlertsScreen = this.f9470e;
                        createRCAlertsScreen.b3(createRCAlertsScreen, createRCAlertsScreen.b2().b(v9.f.f17510a.h0(), "Virtual RC successfully deleted!"));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        applicationContext = this.f9470e.getApplicationContext();
                        b10 = this.f9470e.b2().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some time");
                    }
                } else if (!ka.c.f13158a.m(myRcDeletResponse.getStatusDesc())) {
                    CreateRCAlertsScreen createRCAlertsScreen2 = this.f9470e;
                    createRCAlertsScreen2.b3(createRCAlertsScreen2, myRcDeletResponse.getStatusDesc());
                } else {
                    applicationContext = this.f9470e.getApplicationContext();
                    b10 = this.f9470e.b2().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some time");
                    Toast.makeText(applicationContext, b10, 1).show();
                }
            } catch (Exception unused) {
                this.f9470e.V1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                Toast.makeText(this.f9470e.getApplicationContext(), this.f9470e.b2().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some times"), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9471e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CreateRCAlertsScreen createRCAlertsScreen) {
            super(1);
            this.f9471e = createRCAlertsScreen;
        }

        public final void b(String str) {
            this.f9471e.V1().dismiss();
            Toast.makeText(this.f9471e.getApplicationContext(), this.f9471e.b2().b(v9.f.f17510a.F0(), "Unable to delete the Virtual Rc, Please try after some times"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9472e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CreateRCAlertsScreen createRCAlertsScreen) {
            super(1);
            this.f9472e = createRCAlertsScreen;
        }

        public final void b(RcModelsDet rcModelsDet) {
            try {
                if (p.o(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    if (yc.i.f18692a.l(this.f9472e, rcModelsDet.getNrvDetails()) > 0) {
                        this.f9472e.S1().k(this.f9472e.d2());
                    }
                    CreateRCAlertsScreen createRCAlertsScreen = this.f9472e;
                    createRCAlertsScreen.b3(createRCAlertsScreen, createRCAlertsScreen.b2().b(v9.f.f17510a.a1(), "Virtual RC successfully updated!"));
                }
            } catch (Exception unused) {
                this.f9472e.V1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcModelsDet) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CreateRCAlertsScreen createRCAlertsScreen) {
            super(1);
            this.f9473e = createRCAlertsScreen;
        }

        public final void b(ResendOtp resendOtp) {
            Toast makeText;
            this.f9473e.V1().dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    CreateRCAlertsScreen createRCAlertsScreen = this.f9473e;
                    makeText = Toast.makeText(createRCAlertsScreen, createRCAlertsScreen.b2().b("label_log_resend_otp", "We have resent the OTP to your Mobile Number"), 1);
                } else if (!ka.c.f13158a.m(resendOtp.getStatusDesc())) {
                    makeText = Toast.makeText(this.f9473e, resendOtp.getStatusDesc(), 1);
                } else {
                    this.f9473e.V1().dismiss();
                    CreateRCAlertsScreen createRCAlertsScreen2 = this.f9473e;
                    createRCAlertsScreen2.v2(createRCAlertsScreen2, createRCAlertsScreen2.b2().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                    return;
                }
                makeText.show();
            } catch (Exception unused) {
                this.f9473e.V1().dismiss();
                CreateRCAlertsScreen createRCAlertsScreen3 = this.f9473e;
                createRCAlertsScreen3.v2(createRCAlertsScreen3, createRCAlertsScreen3.b2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateRCAlertsScreen f9474e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CreateRCAlertsScreen createRCAlertsScreen) {
            super(1);
            this.f9474e = createRCAlertsScreen;
        }

        public final void b(String str) {
            this.f9474e.V1().dismiss();
            CreateRCAlertsScreen createRCAlertsScreen = this.f9474e;
            createRCAlertsScreen.v2(createRCAlertsScreen, createRCAlertsScreen.b2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9475a;

        i(bm.l lVar) {
            l.f(lVar, "function");
            this.f9475a = lVar;
        }

        public final pl.c a() {
            return this.f9475a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9475a.invoke(obj);
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

    private final void L1() {
        View findViewById = findViewById(R.id.chassis_no_et);
        l.e(findViewById, "findViewById(...)");
        B2((EditText) findViewById);
        View findViewById2 = findViewById(R.id.engin_no);
        l.e(findViewById2, "findViewById(...)");
        E2((EditText) findViewById2);
        View findViewById3 = findViewById(R.id.et_search_rc);
        l.e(findViewById3, "findViewById(...)");
        H2((EditText) findViewById3);
        View findViewById4 = findViewById(R.id.createvirtualrc);
        l.e(findViewById4, "findViewById(...)");
        C2((MyTextView) findViewById4);
        View findViewById5 = findViewById(R.id.alerst_recycle_view);
        l.e(findViewById5, "findViewById(...)");
        y2((RecyclerView) findViewById5);
        View findViewById6 = findViewById(R.id.alerts_layout);
        l.e(findViewById6, "findViewById(...)");
        z2((LinearLayout) findViewById6);
        View findViewById7 = findViewById(R.id.nexgenarrow);
        l.e(findViewById7, "findViewById(...)");
        M2((LinearLayout) findViewById7);
        View findViewById8 = findViewById(R.id.virtualrc_layout);
        l.e(findViewById8, "findViewById(...)");
        a3((LinearLayout) findViewById8);
        View findViewById9 = findViewById(R.id.rec_rc_recycler);
        l.d(findViewById9, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        S2((RecyclerView) findViewById9);
        Y1().setLayoutManager(new LinearLayoutManager(this, 0, false));
        B1().setLayoutManager(new LinearLayoutManager(this, 0, false));
        O2(new ProgressDialog(this));
        V1().setMessage("Please wait...");
        V1().setCancelable(false);
        V1().setCanceledOnTouchOutside(false);
        e3();
        d3();
        U1().setOnClickListener(new vc.d(this));
        E1().addTextChangedListener(new a(this));
        U1().setOnClickListener(new vc.e(this));
        F1().setOnClickListener(new vc.f(this));
        f2().e0().g(this, new i(new b(this)));
        f2().f0().g(this, new i(new c(this)));
        R1().z().g(this, new i(new d(this)));
        R1().A().g(this, new i(new e(this)));
    }

    /* access modifiers changed from: private */
    public static final void M1(CreateRCAlertsScreen createRCAlertsScreen, View view) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void N1(CreateRCAlertsScreen createRCAlertsScreen, View view) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void O1(CreateRCAlertsScreen createRCAlertsScreen, View view) {
        Context context;
        String str;
        Context applicationContext;
        ld.c b22;
        String str2;
        String str3;
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.Q2(createRCAlertsScreen.K1().getText().toString());
        createRCAlertsScreen.F2(createRCAlertsScreen.E1().getText().toString());
        createRCAlertsScreen.G2(createRCAlertsScreen.H1().getText().toString());
        createRCAlertsScreen.K1().getText().toString();
        if (createRCAlertsScreen.K1().getText().toString().length() != 0 && createRCAlertsScreen.K1().getText().toString().length() >= 4) {
            if (new km.f("[a-zA-Z0-9]*").a(createRCAlertsScreen.K1().getText().toString())) {
                if (createRCAlertsScreen.I1().length() < 5) {
                    applicationContext = createRCAlertsScreen.getApplicationContext();
                    b22 = createRCAlertsScreen.b2();
                    str2 = "label_challan_valid_chassis_no";
                    str3 = "Please enter the valid last 5 digit of chassis no.";
                } else if (createRCAlertsScreen.J1().length() < 5) {
                    applicationContext = createRCAlertsScreen.getApplicationContext();
                    b22 = createRCAlertsScreen.b2();
                    str2 = "label_challan_valid_engine_no";
                    str3 = "Please enter the valid last 5 digit of engine no";
                } else if (createRCAlertsScreen.K1().getText().toString().length() >= 4) {
                    if (!new km.f("^[0-9]*$").a(createRCAlertsScreen.K1().getText().toString())) {
                        if (!new km.f("[a-zA-Z]+").a(createRCAlertsScreen.K1().getText().toString())) {
                            createRCAlertsScreen.O2(new ProgressDialog(createRCAlertsScreen.P1()));
                            createRCAlertsScreen.V1().setMessage("Please wait...");
                            createRCAlertsScreen.V1().setCancelable(false);
                            createRCAlertsScreen.V1().setCanceledOnTouchOutside(false);
                            createRCAlertsScreen.V1().show();
                            if (createRCAlertsScreen.W1().c() == 2) {
                                createRCAlertsScreen.f2().n(createRCAlertsScreen, createRCAlertsScreen.K1().getText().toString());
                                return;
                            }
                            createRCAlertsScreen.R1().m(createRCAlertsScreen.K1().getText().toString(), createRCAlertsScreen.c2().k().toString(), createRCAlertsScreen.I1(), createRCAlertsScreen.J1(), createRCAlertsScreen, v9.d.f17494a.r());
                            return;
                        }
                    }
                    context = createRCAlertsScreen.P1();
                    str = createRCAlertsScreen.b2().b("label_challan_rc_validation", createRCAlertsScreen.getString(R.string.rc_text));
                    createRCAlertsScreen.v2(context, str);
                } else {
                    return;
                }
                Toast.makeText(applicationContext, b22.b(str2, str3), 1).show();
                return;
            }
        }
        createRCAlertsScreen.K1().requestFocus();
        context = createRCAlertsScreen.P1();
        str = createRCAlertsScreen.b2().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character");
        createRCAlertsScreen.v2(context, str);
    }

    /* access modifiers changed from: private */
    public static final void c3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void h2(CreateRCAlertsScreen createRCAlertsScreen, RcModelsDet rcModelsDet) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.V1().cancel();
        if (p.o(rcModelsDet.getStatusCode(), "NP001", true)) {
            ba baVar = createRCAlertsScreen.f9453d0;
            ba baVar2 = null;
            if (baVar == null) {
                l.v("binding");
                baVar = null;
            }
            baVar.f25518g.setText("");
            ba baVar3 = createRCAlertsScreen.f9453d0;
            if (baVar3 == null) {
                l.v("binding");
                baVar3 = null;
            }
            baVar3.f25515d.setText("");
            ba baVar4 = createRCAlertsScreen.f9453d0;
            if (baVar4 == null) {
                l.v("binding");
            } else {
                baVar2 = baVar4;
            }
            baVar2.f25517f.setText("");
            l.c(rcModelsDet);
            createRCAlertsScreen.R2(rcModelsDet);
            createRCAlertsScreen.y1(createRCAlertsScreen.P1(), createRCAlertsScreen.b2().b(v9.f.f17510a.U0(), "My Vehicle added successfully!"), createRCAlertsScreen.X1(), createRCAlertsScreen.f9454e0);
        } else if (!ka.c.f13158a.m(rcModelsDet.getStatusDesc())) {
            createRCAlertsScreen.v2(createRCAlertsScreen.P1(), rcModelsDet.getStatusDesc());
        } else {
            createRCAlertsScreen.v2(createRCAlertsScreen.P1(), createRCAlertsScreen.b2().b(v9.f.f17510a.I0(), "Unable to add the Vehicle, Please try after some time"));
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(CreateRCAlertsScreen createRCAlertsScreen, String str) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.v2(createRCAlertsScreen.P1(), createRCAlertsScreen.b2().b(v9.f.f17510a.I0(), "Unable to add the Vehicle, Please try after some times"));
        createRCAlertsScreen.V1().cancel();
    }

    /* access modifiers changed from: private */
    public static final void j2(CreateRCAlertsScreen createRCAlertsScreen, String str) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.V1().dismiss();
        if (p.o(str, "Error", true)) {
            Toast.makeText(createRCAlertsScreen.getApplicationContext(), createRCAlertsScreen.b2().b(v9.f.f17510a.K0(), "Unable to add the Virtual RC, Please try again"), 1).show();
            return;
        }
        yc.i.f18692a.i(createRCAlertsScreen, new ld.c(createRCAlertsScreen).b("validateMobile", createRCAlertsScreen.getString(R.string.validate1)));
    }

    /* access modifiers changed from: private */
    public static final void k2(CreateRCAlertsScreen createRCAlertsScreen, SendOtpResult sendOtpResult) {
        l.f(createRCAlertsScreen, "this$0");
        try {
            createRCAlertsScreen.V1().dismiss();
            if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                ld.g gVar = new ld.g(createRCAlertsScreen);
                if (createRCAlertsScreen.W1().c() < 2) {
                    createRCAlertsScreen.f9465p0 = gVar.l();
                }
                i.a aVar = yc.i.f18692a;
                String str = createRCAlertsScreen.f9465p0;
                v8.h e22 = createRCAlertsScreen.e2();
                String valueOf = String.valueOf(sendOtpResult.getRecordId());
                ba baVar = createRCAlertsScreen.f9453d0;
                if (baVar == null) {
                    l.v("binding");
                    baVar = null;
                }
                createRCAlertsScreen.f9460k0 = aVar.m(createRCAlertsScreen, createRCAlertsScreen, str, e22, valueOf, baVar.f25518g.getText().toString(), "RC", " ", createRCAlertsScreen.V1());
            } else if (!ka.c.f13158a.m(sendOtpResult.getStatusDesc())) {
                createRCAlertsScreen.v2(createRCAlertsScreen, sendOtpResult.getStatusDesc());
            }
        } catch (Exception unused) {
            createRCAlertsScreen.V1().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void l2(CreateRCAlertsScreen createRCAlertsScreen, String str) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.V1().dismiss();
        createRCAlertsScreen.v2(createRCAlertsScreen, createRCAlertsScreen.b2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void m2(CreateRCAlertsScreen createRCAlertsScreen, CitzValidDoc citzValidDoc) {
        String b10;
        l.f(createRCAlertsScreen, "this$0");
        try {
            Long l10 = null;
            if (p.p(citzValidDoc.getStatusCode(), "AL001", false, 2, (Object) null)) {
                c.a aVar = ka.c.f13158a;
                if (aVar.m(citzValidDoc.getParam())) {
                    Dialog dialog = createRCAlertsScreen.f9460k0;
                    if (dialog != null) {
                        l.c(dialog);
                        dialog.dismiss();
                        CitizenDocInfoX citizenDocInfo = citzValidDoc.getCitizenDocInfo();
                        if (citizenDocInfo != null) {
                            l10 = citizenDocInfo.getDocId();
                        }
                        createRCAlertsScreen.f9454e0 = String.valueOf(l10);
                        createRCAlertsScreen.R1().o(createRCAlertsScreen.c2().k(), createRCAlertsScreen.f9454e0, createRCAlertsScreen);
                        return;
                    }
                    return;
                }
                if (createRCAlertsScreen.V1().isShowing()) {
                    createRCAlertsScreen.V1().dismiss();
                }
                if (!aVar.m(citzValidDoc.getParam())) {
                    Dialog dialog2 = createRCAlertsScreen.f9460k0;
                    if (dialog2 != null) {
                        l.c(dialog2);
                        dialog2.dismiss();
                    }
                    b10 = citzValidDoc.getParam();
                } else {
                    Dialog dialog3 = createRCAlertsScreen.f9460k0;
                    if (dialog3 != null) {
                        l.c(dialog3);
                        dialog3.dismiss();
                    }
                    b10 = createRCAlertsScreen.b2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time");
                }
                createRCAlertsScreen.v2(createRCAlertsScreen, b10);
                return;
            }
            if (createRCAlertsScreen.V1().isShowing()) {
                createRCAlertsScreen.V1().dismiss();
            }
            Toast.makeText(createRCAlertsScreen, citzValidDoc.getStatusDesc(), 1).show();
        } catch (Exception unused) {
            if (createRCAlertsScreen.V1().isShowing()) {
                createRCAlertsScreen.V1().dismiss();
            }
            Dialog dialog4 = createRCAlertsScreen.f9460k0;
            if (dialog4 != null) {
                l.c(dialog4);
                dialog4.dismiss();
            }
            createRCAlertsScreen.v2(createRCAlertsScreen, createRCAlertsScreen.b2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
        }
    }

    /* access modifiers changed from: private */
    public static final void n2(CreateRCAlertsScreen createRCAlertsScreen, String str) {
        l.f(createRCAlertsScreen, "this$0");
        Log.e("Test", str.toString());
        createRCAlertsScreen.V1().dismiss();
        Dialog dialog = createRCAlertsScreen.f9460k0;
        if (dialog != null) {
            l.c(dialog);
            dialog.dismiss();
        }
        createRCAlertsScreen.v2(createRCAlertsScreen, createRCAlertsScreen.b2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void o2(CreateRCAlertsScreen createRCAlertsScreen, String str) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.V1().cancel();
        createRCAlertsScreen.v2(createRCAlertsScreen, createRCAlertsScreen.b2().b(v9.f.f17510a.I0(), "Unable to add the My Vehicle, Please try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void p2(CreateRCAlertsScreen createRCAlertsScreen, ValidateRcSuccess validateRcSuccess) {
        l.f(createRCAlertsScreen, "this$0");
        if (p.o(validateRcSuccess.getStatusCode(), "NP001", true)) {
            if (createRCAlertsScreen.W1().c() == 2) {
                bi.h f22 = createRCAlertsScreen.f2();
                String obj = createRCAlertsScreen.K1().getText().toString();
                String str = createRCAlertsScreen.f9463n0;
                ba baVar = createRCAlertsScreen.f9453d0;
                if (baVar == null) {
                    l.v("binding");
                    baVar = null;
                }
                f22.u0(createRCAlertsScreen, obj, str, baVar.f25515d.getText().toString(), createRCAlertsScreen.f9464o0);
                return;
            }
            createRCAlertsScreen.e2().G(createRCAlertsScreen, createRCAlertsScreen.c2().l(), 1);
        } else if (validateRcSuccess.getStatusCode().equals("NR090")) {
            v9.d.f17494a.D(createRCAlertsScreen.P1(), validateRcSuccess.getStatusDesc(), 1);
        } else if (validateRcSuccess.getStatusCode().equals("NR091")) {
            v9.d.f17494a.D(createRCAlertsScreen.P1(), validateRcSuccess.getStatusDesc(), 2);
        } else {
            createRCAlertsScreen.V1().dismiss();
            createRCAlertsScreen.v2(createRCAlertsScreen.P1(), validateRcSuccess.getStatusDesc());
        }
    }

    /* access modifiers changed from: private */
    public static final void q2(CreateRCAlertsScreen createRCAlertsScreen, String str) {
        l.f(createRCAlertsScreen, "this$0");
        createRCAlertsScreen.V1().dismiss();
        Toast.makeText(createRCAlertsScreen.getApplicationContext(), createRCAlertsScreen.b2().b(v9.f.f17510a.K0(), "Unable to add the Virtual RC, Please try again"), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void r2(CreateRCAlertsScreen createRCAlertsScreen, String str) {
        l.f(createRCAlertsScreen, "this$0");
        try {
            if (!ka.c.f13158a.m(str)) {
                l.c(str);
                createRCAlertsScreen.f9465p0 = str;
                createRCAlertsScreen.e2().G(createRCAlertsScreen, createRCAlertsScreen.f9465p0, 1);
                return;
            }
            createRCAlertsScreen.V1().dismiss();
            yc.i.f18692a.i(createRCAlertsScreen, new ld.c(createRCAlertsScreen).b("validateMobile", createRCAlertsScreen.getString(R.string.validate1)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void s2(Context context, String str, String str2) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(b2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(b2().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(b2().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new vc.i(dialog));
        textView.setOnClickListener(new j(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void t2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void u2(Dialog dialog, CreateRCAlertsScreen createRCAlertsScreen, String str, View view) {
        l.f(dialog, "$d");
        l.f(createRCAlertsScreen, "this$0");
        dialog.dismiss();
        if (createRCAlertsScreen.G1().s0(str) != null) {
            String s02 = createRCAlertsScreen.G1().s0(str);
            if (!ka.c.f13158a.m(s02)) {
                createRCAlertsScreen.O2(new ProgressDialog(createRCAlertsScreen.P1()));
                createRCAlertsScreen.V1().setMessage(createRCAlertsScreen.b2().b("label_challan_please_wait", "please wait"));
                createRCAlertsScreen.V1().setCancelable(false);
                createRCAlertsScreen.V1().setCanceledOnTouchOutside(false);
                createRCAlertsScreen.V1().show();
                cd.c R1 = createRCAlertsScreen.R1();
                l.c(s02);
                R1.i(s02, createRCAlertsScreen);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void w2(Dialog dialog, CreateRCAlertsScreen createRCAlertsScreen, View view) {
        l.f(dialog, "$d");
        l.f(createRCAlertsScreen, "this$0");
        dialog.dismiss();
        createRCAlertsScreen.E1().setText((CharSequence) null);
        createRCAlertsScreen.H1().setText((CharSequence) null);
        createRCAlertsScreen.E1().requestFocus();
    }

    /* access modifiers changed from: private */
    public static final void z1(Dialog dialog, CreateRCAlertsScreen createRCAlertsScreen, RcModelsDet rcModelsDet, String str, View view) {
        l.f(dialog, "$d");
        l.f(createRCAlertsScreen, "this$0");
        l.f(rcModelsDet, "$details");
        l.f(str, "$doc_id");
        dialog.dismiss();
        try {
            createRCAlertsScreen.G1().O0(rcModelsDet.getNrvDetails().getRc_regn_no(), str, rcModelsDet.getNrvDetails(), 0);
            createRCAlertsScreen.e3();
            createRCAlertsScreen.d3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final wc.b A1() {
        wc.b bVar = this.X;
        if (bVar != null) {
            return bVar;
        }
        l.v("alerst_adapter");
        return null;
    }

    public final void A2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.Z = arrayList;
    }

    public final RecyclerView B1() {
        RecyclerView recyclerView = this.W;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("alerst_recycle_view");
        return null;
    }

    public final void B2(EditText editText) {
        l.f(editText, "<set-?>");
        this.P = editText;
    }

    public final LinearLayout C1() {
        LinearLayout linearLayout = this.Y;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("alerts_layout");
        return null;
    }

    public final void C2(MyTextView myTextView) {
        l.f(myTextView, "<set-?>");
        this.L = myTextView;
    }

    public final ArrayList D1() {
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("arrayList");
        return null;
    }

    public final void D2(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.S = databaseHelper;
    }

    public final EditText E1() {
        EditText editText = this.P;
        if (editText != null) {
            return editText;
        }
        l.v("chassis_no_et");
        return null;
    }

    public final void E2(EditText editText) {
        l.f(editText, "<set-?>");
        this.Q = editText;
    }

    public final MyTextView F1() {
        MyTextView myTextView = this.L;
        if (myTextView != null) {
            return myTextView;
        }
        l.v("createvirtualrc");
        return null;
    }

    public final void F2(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final DatabaseHelper G1() {
        DatabaseHelper databaseHelper = this.S;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final void G2(String str) {
        l.f(str, "<set-?>");
        this.U = str;
    }

    public final EditText H1() {
        EditText editText = this.Q;
        if (editText != null) {
            return editText;
        }
        l.v("engine_no_et");
        return null;
    }

    public final void H2(EditText editText) {
        l.f(editText, "<set-?>");
        this.R = editText;
    }

    public final String I1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("enter_chassi");
        return null;
    }

    public final void I2(Context context) {
        l.f(context, "<set-?>");
        this.I = context;
    }

    public final String J1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        l.v("enter_engin");
        return null;
    }

    public final void J2(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.H = rcService;
    }

    public final EditText K1() {
        EditText editText = this.R;
        if (editText != null) {
            return editText;
        }
        l.v("etSearchRC");
        return null;
    }

    public final void K2(cd.c cVar) {
        l.f(cVar, "<set-?>");
        this.G = cVar;
    }

    public final void L2(wc.f fVar) {
        l.f(fVar, "<set-?>");
        this.f9450a0 = fVar;
    }

    public final void M2(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.K = linearLayout;
    }

    public final void N2(String str) {
        l.f(str, "<set-?>");
        this.f9464o0 = str;
    }

    public final void O2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final Context P1() {
        Context context = this.I;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final void P2(ld.e eVar) {
        l.f(eVar, "<set-?>");
        this.f9466q0 = eVar;
    }

    public final RcService Q1() {
        RcService rcService = this.H;
        if (rcService != null) {
            return rcService;
        }
        l.v("mRcService");
        return null;
    }

    public final void Q2(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final cd.c R1() {
        cd.c cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRcViewModel");
        return null;
    }

    public final void R2(RcModelsDet rcModelsDet) {
        l.f(rcModelsDet, "<set-?>");
        this.O = rcModelsDet;
    }

    public final wc.f S1() {
        wc.f fVar = this.f9450a0;
        if (fVar != null) {
            return fVar;
        }
        l.v("myRcAdapter");
        return null;
    }

    public final void S2(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.V = recyclerView;
    }

    public final int T1() {
        return this.f9457h0;
    }

    public final void T2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.f9462m0 = vahanProService;
    }

    public final LinearLayout U1() {
        LinearLayout linearLayout = this.K;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("nexgenarrow");
        return null;
    }

    public final void U2(String str) {
        l.f(str, "<set-?>");
        this.f9455f0 = str;
    }

    public final ProgressDialog V1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final void V2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f9452c0 = cVar;
    }

    public final ld.e W1() {
        ld.e eVar = this.f9466q0;
        if (eVar != null) {
            return eVar;
        }
        l.v("pSession");
        return null;
    }

    public final void W2(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.N = gVar;
    }

    public final RcModelsDet X1() {
        RcModelsDet rcModelsDet = this.O;
        if (rcModelsDet != null) {
            return rcModelsDet;
        }
        l.v("rcdetails");
        return null;
    }

    public final void X2(String str) {
        l.f(str, "<set-?>");
        this.f9463n0 = str;
    }

    public final RecyclerView Y1() {
        RecyclerView recyclerView = this.V;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("rec_rc_recycler");
        return null;
    }

    public final void Y2(v8.h hVar) {
        l.f(hVar, "<set-?>");
        this.f9458i0 = hVar;
    }

    public final VahanProService Z1() {
        VahanProService vahanProService = this.f9462m0;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitServiceAddMob");
        return null;
    }

    public final void Z2(bi.h hVar) {
        l.f(hVar, "<set-?>");
        this.f9461l0 = hVar;
    }

    public final String a2() {
        String str = this.f9455f0;
        if (str != null) {
            return str;
        }
        l.v("selectedRcNumber");
        return null;
    }

    public final void a3(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f9451b0 = linearLayout;
    }

    public void b0(Integer num) {
        l.c(num);
        if (num.intValue() > -1) {
            d3();
        }
    }

    public final ld.c b2() {
        ld.c cVar = this.f9452c0;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final void b3(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(b2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(b2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new vc.c(dialog));
        dialog.show();
    }

    public final ld.g c2() {
        ld.g gVar = this.N;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final int d2() {
        return this.f9456g0;
    }

    public final void d3() {
        if (G1().n() == null || G1().n().size() <= 0) {
            C1().setVisibility(8);
            return;
        }
        C1().setVisibility(8);
        ArrayList n10 = G1().n();
        B1().setAdapter((RecyclerView.h) null);
        l.c(n10);
        x2(new wc.b(n10, this));
        B1().setAdapter(A1());
        A1().j();
    }

    public final v8.h e2() {
        v8.h hVar = this.f9458i0;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void e3() {
        ArrayList E0 = G1().E0();
        l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        A2(E0);
        if (D1().size() > 0) {
            g2().setVisibility(0);
            Y1().setVisibility(0);
            wc.f fVar = new wc.f(D1(), this, this);
            l.c(fVar);
            L2(fVar);
            Y1().setAdapter(S1());
            return;
        }
        Y1().setVisibility(8);
        g2().setVisibility(8);
    }

    public void f(String str, Integer num) {
        l.f(str, "rc");
        try {
            l.c(num);
            this.f9456g0 = num.intValue();
            G1().s0(str);
            R1().l(str, this);
        } catch (Exception unused) {
        }
    }

    public final bi.h f2() {
        bi.h hVar = this.f9461l0;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModelAddMob");
        return null;
    }

    public final LinearLayout g2() {
        LinearLayout linearLayout = this.f9451b0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("virtualrc_layout");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ba c10 = ba.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.f9453d0 = c10;
        SignService signService = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        I2(this);
        W2(new ld.g(this));
        P2(new ld.e(this));
        e.a aVar = v9.e.f17509a;
        Context P1 = P1();
        ba baVar = this.f9453d0;
        if (baVar == null) {
            l.v("binding");
            baVar = null;
        }
        aVar.m0(P1, baVar);
        V2(new ld.c(P1()));
        J2(RcService.f9484a.c(this));
        DatabaseHelper A0 = DatabaseHelper.A0(P1());
        l.e(A0, "getInstance(...)");
        D2(A0);
        K2((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(Q1()))).a(cd.c.class));
        this.f9459j0 = SignService.f7644a.c(this);
        T2(VahanProService.f21196b.b(this));
        SignService signService2 = this.f9459j0;
        if (signService2 == null) {
            l.v("retrofitService");
        } else {
            signService = signService2;
        }
        Y2((v8.h) new u0((x0) this, (u0.b) new v8.g(new s8.b(signService))).a(v8.h.class));
        Z2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(Z1()))).a(bi.h.class));
        L1();
        R1().R().g(this, new vc.a(this));
        R1().s().g(this, new vc.l(this));
        e2().s().g(this, new vc.m(this));
        e2().r().g(this, new n(this));
        e2().v().g(this, new o(this));
        e2().i().g(this, new p(this));
        e2().y().g(this, new i(new g(this)));
        e2().x().g(this, new i(new h(this)));
        R1().Y().g(this, new q(this));
        R1().V().g(this, new r(this));
        R1().W().g(this, new s(this));
        f2().s0().g(this, new vc.b(this));
        f2().t0().g(this, new k(this));
        R1().p().g(this, new i(new f(this)));
    }

    public final void v2(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(b2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(b2().b("btn_ok", "OK"));
        textView.setOnClickListener(new vc.g(dialog, this));
        dialog.show();
    }

    public final void x2(wc.b bVar) {
        l.f(bVar, "<set-?>");
        this.X = bVar;
    }

    public void y(String str, int i10) {
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            this.f9457h0 = i10;
            U2(String.valueOf(str));
            s2(this, b2().b("label_want_to_proceed", "Are you sure, You want to delete ?"), a2());
            return;
        }
        Toast.makeText(this, b2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    public final void y1(Context context, String str, RcModelsDet rcModelsDet, String str2) {
        l.f(rcModelsDet, "details");
        l.f(str2, "doc_id");
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(b2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(b2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new vc.h(dialog, this, rcModelsDet, str2));
        dialog.show();
    }

    public final void y2(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.W = recyclerView;
    }

    public final void z2(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.Y = linearLayout;
    }
}
