package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bj.a2;
import bj.b2;
import bj.c2;
import bj.d2;
import bj.e2;
import bj.f2;
import bj.l1;
import bj.m1;
import bj.n1;
import bj.o1;
import bj.p1;
import bj.q1;
import bj.r1;
import bj.s1;
import bj.t1;
import bj.u1;
import bj.w1;
import bj.x1;
import bj.y1;
import bj.z1;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import ni.a5;
import pl.x;
import v9.e;

public final class LearnerLicenceAadharScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public a5 G;
    /* access modifiers changed from: private */
    public ProgressDialog H;
    /* access modifiers changed from: private */
    public ld.c I;
    public ba.b J;
    public ld.f K;
    public DlServiceInt L;
    public ArrayList M;
    /* access modifiers changed from: private */
    public String N = "";
    /* access modifiers changed from: private */
    public String O = "";
    public ld.g P;
    private String Q;
    private SharedPreferences R;
    private int S;
    private String T = "A";
    private int U = 501;
    public ca.c V;
    public EkYCService W;
    private String X;
    private String Y = "NA";
    private String Z = "NA";

    /* renamed from: a0  reason: collision with root package name */
    private String f21739a0 = "NA";

    /* renamed from: b0  reason: collision with root package name */
    public da.c f21740b0;

    /* renamed from: c0  reason: collision with root package name */
    public AadharInterface f21741c0;

    /* renamed from: d0  reason: collision with root package name */
    public ea.a f21742d0;

    /* renamed from: e0  reason: collision with root package name */
    public AdrInterface f21743e0;

    /* renamed from: f0  reason: collision with root package name */
    public Aadarkyc.DOEkyc f21744f0;

    /* renamed from: g0  reason: collision with root package name */
    private String f21745g0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21746e;

        a(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            this.f21746e = learnerLicenceAadharScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            LearnerLicenceAadharScreen learnerLicenceAadharScreen = this.f21746e;
            learnerLicenceAadharScreen.N = i10 == 0 ? "0" : ((RtosMaster) learnerLicenceAadharScreen.U1().get(i10)).getRto_code();
            LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = this.f21746e;
            learnerLicenceAadharScreen2.O = ((RtosMaster) learnerLicenceAadharScreen2.U1().get(i10)).getRto_name();
            Log.e("Rto Cd", this.f21746e.N);
            if (!cm.l.a(this.f21746e.N, "") && !cm.l.a(this.f21746e.N, "0")) {
                this.f21746e.L1();
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21747e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21747e = learnerLicenceAadharScreen;
        }

        public final void b(SubmitAdharApi submitAdharApi) {
            ProgressDialog C1 = this.f21747e.H;
            ld.c cVar = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            try {
                if (p.o(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                    Intent intent = new Intent(this.f21747e, PersonalDetailsScreen.class);
                    intent.putExtra("stateCd", this.f21747e.Y1().l());
                    intent.putExtra("rtoCd", this.f21747e.N);
                    intent.putExtra("rtoName", this.f21747e.O);
                    intent.putExtra("inputMobileNo", "");
                    intent.putExtra("aadharData", this.f21747e.N1());
                    intent.putExtra("ekycId", submitAdharApi.getEkycId());
                    intent.putExtra("aadhaarLastFourDigitMobileNo", this.f21747e.O1());
                    intent.putExtra("dataFromAadhar", true);
                    this.f21747e.startActivity(intent);
                    return;
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen = this.f21747e;
                learnerLicenceAadharScreen.p2(learnerLicenceAadharScreen, submitAdharApi.getStatusDesc());
            } catch (Exception unused) {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = this.f21747e;
                ld.c F1 = learnerLicenceAadharScreen2.I;
                if (F1 == null) {
                    cm.l.v("session");
                } else {
                    cVar = F1;
                }
                learnerLicenceAadharScreen2.p2(learnerLicenceAadharScreen2, cVar.b("service_is_not_present", this.f21747e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitAdharApi) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21748e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21748e = learnerLicenceAadharScreen;
        }

        public final void b(String str) {
            ProgressDialog C1 = this.f21748e.H;
            ld.c cVar = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            try {
                Log.e("adhResp_submit_err", str.toString());
                LearnerLicenceAadharScreen learnerLicenceAadharScreen = this.f21748e;
                ld.c F1 = learnerLicenceAadharScreen.I;
                if (F1 == null) {
                    cm.l.v("session");
                } else {
                    cVar = F1;
                }
                learnerLicenceAadharScreen.p2(learnerLicenceAadharScreen, cVar.b("service_is_not_present", this.f21748e.getString(R.string.unable_to_get_details)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21749e = learnerLicenceAadharScreen;
        }

        public final void b(CurrentRTO currentRTO) {
            ProgressDialog C1 = this.f21749e.H;
            ld.c cVar = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            try {
                if (p.o(currentRTO.getStatus_code(), "00", true)) {
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = this.f21749e;
                    List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                    cm.l.d(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
                    learnerLicenceAadharScreen.z2((ArrayList) rtosMaster);
                    ArrayList U1 = this.f21749e.U1();
                    ld.c F1 = this.f21749e.I;
                    if (F1 == null) {
                        cm.l.v("session");
                        F1 = null;
                    }
                    String b10 = F1.b("select_rto", this.f21749e.getString(R.string.please_select_rto));
                    cm.l.c(b10);
                    U1.add(0, new RtosMaster(b10, "0"));
                } else {
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = this.f21749e;
                    List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
                    cm.l.d(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
                    learnerLicenceAadharScreen2.z2((ArrayList) rtosMaster2);
                    ArrayList U12 = this.f21749e.U1();
                    ld.c F12 = this.f21749e.I;
                    if (F12 == null) {
                        cm.l.v("session");
                        F12 = null;
                    }
                    String b11 = F12.b("select_rto", this.f21749e.getString(R.string.please_select_rto));
                    cm.l.c(b11);
                    U12.add(0, new RtosMaster(b11, "0"));
                }
                this.f21749e.J2();
            } catch (Exception unused) {
                ProgressDialog C12 = this.f21749e.H;
                if (C12 == null) {
                    cm.l.v("pDialog");
                    C12 = null;
                }
                if (C12.isShowing()) {
                    ProgressDialog C13 = this.f21749e.H;
                    if (C13 == null) {
                        cm.l.v("pDialog");
                        C13 = null;
                    }
                    C13.dismiss();
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen3 = this.f21749e;
                ld.c F13 = learnerLicenceAadharScreen3.I;
                if (F13 == null) {
                    cm.l.v("session");
                } else {
                    cVar = F13;
                }
                learnerLicenceAadharScreen3.l2(cVar.b("service_is_not_present", this.f21749e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CurrentRTO) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21750e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21750e = learnerLicenceAadharScreen;
        }

        public final void b(String str) {
            ProgressDialog C1 = this.f21750e.H;
            ld.c cVar = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            LearnerLicenceAadharScreen learnerLicenceAadharScreen = this.f21750e;
            ld.c F1 = learnerLicenceAadharScreen.I;
            if (F1 == null) {
                cm.l.v("session");
            } else {
                cVar = F1;
            }
            learnerLicenceAadharScreen.l2(cVar.b("service_is_not_present", this.f21750e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21751e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21751e = learnerLicenceAadharScreen;
        }

        public final void b(CheckByState checkByState) {
            ProgressDialog C1 = this.f21751e.H;
            a5 a5Var = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            if (C1.isShowing()) {
                ProgressDialog C12 = this.f21751e.H;
                if (C12 == null) {
                    cm.l.v("pDialog");
                    C12 = null;
                }
                C12.dismiss();
            }
            try {
                if (p.o(checkByState.getEkycRequired(), "N", true)) {
                    a5 B1 = this.f21751e.G;
                    if (B1 == null) {
                        cm.l.v("binding");
                        B1 = null;
                    }
                    B1.f25192x.setVisibility(0);
                    a5 B12 = this.f21751e.G;
                    if (B12 == null) {
                        cm.l.v("binding");
                        B12 = null;
                    }
                    B12.P.setVisibility(8);
                    a5 B13 = this.f21751e.G;
                    if (B13 == null) {
                        cm.l.v("binding");
                        B13 = null;
                    }
                    B13.Q.setVisibility(0);
                    a5 B14 = this.f21751e.G;
                    if (B14 == null) {
                        cm.l.v("binding");
                        B14 = null;
                    }
                    B14.D.setVisibility(0);
                    a5 B15 = this.f21751e.G;
                    if (B15 == null) {
                        cm.l.v("binding");
                        B15 = null;
                    }
                    B15.f25191w.setVisibility(8);
                    return;
                }
                a5 B16 = this.f21751e.G;
                if (B16 == null) {
                    cm.l.v("binding");
                    B16 = null;
                }
                B16.f25192x.setVisibility(0);
                a5 B17 = this.f21751e.G;
                if (B17 == null) {
                    cm.l.v("binding");
                    B17 = null;
                }
                B17.P.setVisibility(0);
                a5 B18 = this.f21751e.G;
                if (B18 == null) {
                    cm.l.v("binding");
                    B18 = null;
                }
                B18.Q.setVisibility(0);
                a5 B19 = this.f21751e.G;
                if (B19 == null) {
                    cm.l.v("binding");
                    B19 = null;
                }
                B19.D.setVisibility(8);
                a5 B110 = this.f21751e.G;
                if (B110 == null) {
                    cm.l.v("binding");
                    B110 = null;
                }
                B110.f25191w.setVisibility(0);
            } catch (Exception unused) {
                a5 B111 = this.f21751e.G;
                if (B111 == null) {
                    cm.l.v("binding");
                    B111 = null;
                }
                B111.f25192x.setVisibility(0);
                a5 B112 = this.f21751e.G;
                if (B112 == null) {
                    cm.l.v("binding");
                    B112 = null;
                }
                B112.P.setVisibility(8);
                a5 B113 = this.f21751e.G;
                if (B113 == null) {
                    cm.l.v("binding");
                    B113 = null;
                }
                B113.Q.setVisibility(0);
                a5 B114 = this.f21751e.G;
                if (B114 == null) {
                    cm.l.v("binding");
                    B114 = null;
                }
                B114.D.setVisibility(0);
                a5 B115 = this.f21751e.G;
                if (B115 == null) {
                    cm.l.v("binding");
                } else {
                    a5Var = B115;
                }
                a5Var.f25191w.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckByState) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21752e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21752e = learnerLicenceAadharScreen;
        }

        public final void b(String str) {
            ProgressDialog C1 = this.f21752e.H;
            a5 a5Var = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            if (C1.isShowing()) {
                ProgressDialog C12 = this.f21752e.H;
                if (C12 == null) {
                    cm.l.v("pDialog");
                    C12 = null;
                }
                C12.dismiss();
            }
            a5 B1 = this.f21752e.G;
            if (B1 == null) {
                cm.l.v("binding");
                B1 = null;
            }
            B1.f25192x.setVisibility(0);
            a5 B12 = this.f21752e.G;
            if (B12 == null) {
                cm.l.v("binding");
                B12 = null;
            }
            B12.P.setVisibility(8);
            a5 B13 = this.f21752e.G;
            if (B13 == null) {
                cm.l.v("binding");
                B13 = null;
            }
            B13.Q.setVisibility(0);
            a5 B14 = this.f21752e.G;
            if (B14 == null) {
                cm.l.v("binding");
                B14 = null;
            }
            B14.D.setVisibility(0);
            a5 B15 = this.f21752e.G;
            if (B15 == null) {
                cm.l.v("binding");
            } else {
                a5Var = B15;
            }
            a5Var.f25191w.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21753e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21753e = learnerLicenceAadharScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            ProgressDialog C1 = this.f21753e.H;
            ld.c cVar = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f21753e.C2(String.valueOf(sendOtpResult.getRecordId()));
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = this.f21753e;
                    a5 B1 = learnerLicenceAadharScreen.G;
                    if (B1 == null) {
                        cm.l.v("binding");
                        B1 = null;
                    }
                    learnerLicenceAadharScreen.Q2(learnerLicenceAadharScreen, String.valueOf(B1.F.getText()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f21753e, sendOtpResult.getStatusDesc());
                } else {
                    this.f21753e.n2(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = this.f21753e;
                ld.c F1 = learnerLicenceAadharScreen2.I;
                if (F1 == null) {
                    cm.l.v("session");
                } else {
                    cVar = F1;
                }
                String b10 = cVar.b("label_went_wrong", this.f21753e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b10);
                learnerLicenceAadharScreen2.n2(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21754e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21754e = learnerLicenceAadharScreen;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            ld.c cVar = null;
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(this.f21754e, PersonalDetailsScreen.class);
                    intent.putExtra("stateCd", this.f21754e.Y1().l());
                    intent.putExtra("rtoCd", this.f21754e.N);
                    intent.putExtra("rtoName", this.f21754e.O);
                    a5 B1 = this.f21754e.G;
                    if (B1 == null) {
                        cm.l.v("binding");
                        B1 = null;
                    }
                    intent.putExtra("inputMobileNo", q.B0(String.valueOf(B1.F.getText())).toString());
                    intent.putExtra("dataFromAadhar", false);
                    this.f21754e.startActivity(intent);
                    return;
                }
                this.f21754e.n2(otpVerifyResult.getStatusDesc());
            } catch (Exception unused) {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen = this.f21754e;
                ld.c F1 = learnerLicenceAadharScreen.I;
                if (F1 == null) {
                    cm.l.v("session");
                } else {
                    cVar = F1;
                }
                String b10 = cVar.b("label_went_wrong", this.f21754e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b10);
                learnerLicenceAadharScreen.n2(b10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21755e = learnerLicenceAadharScreen;
        }

        /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanEkyc.AadarkycVerify.Response r6) {
            /*
                r5 = this;
                java.lang.String r0 = "CCTVlOGE"
                java.lang.String r1 = r6.toString()
                java.lang.String r2 = "adhResp_kyc"
                android.util.Log.e(r2, r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r1 = r5.f21755e
                android.app.ProgressDialog r1 = r1.H
                r2 = 0
                if (r1 != 0) goto L_0x001a
                java.lang.String r1 = "pDialog"
                cm.l.v(r1)
                r1 = r2
            L_0x001a:
                r1.dismiss()
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$DoAadhaarResponse r6 = r6.getDoAadhaarResponse()
                if (r6 == 0) goto L_0x0028
                java.lang.String r1 = r6.getStatus()
                goto L_0x0029
            L_0x0028:
                r1 = r2
            L_0x0029:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0035
                goto L_0x0154
            L_0x0035:
                java.lang.String r1 = "1"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x005c }
                r1 = 1
                if (r6 == 0) goto L_0x00df
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$dOEkyc r3 = r6.getDOAuthOTP()     // Catch:{ Exception -> 0x005c }
                if (r3 == 0) goto L_0x00df
                java.lang.Boolean r3 = r3.getMobileverify()     // Catch:{ Exception -> 0x005c }
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005c }
                boolean r3 = cm.l.a(r3, r4)     // Catch:{ Exception -> 0x005c }
                if (r3 == 0) goto L_0x00df
                if (r6 == 0) goto L_0x005f
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$dOEkyc r3 = r6.getDOAuthOTP()     // Catch:{ Exception -> 0x005c }
                if (r3 == 0) goto L_0x005f
                java.lang.String r3 = r3.getLast_four_mobile()     // Catch:{ Exception -> 0x005c }
                goto L_0x0060
            L_0x005c:
                r6 = move-exception
                goto L_0x0151
            L_0x005f:
                r3 = r2
            L_0x0060:
                if (r3 == 0) goto L_0x00df
                int r3 = r3.length()     // Catch:{ Exception -> 0x005c }
                if (r3 != 0) goto L_0x006a
                goto L_0x00df
            L_0x006a:
                if (r6 == 0) goto L_0x0077
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$dOEkyc r3 = r6.getDOAuthOTP()     // Catch:{ Exception -> 0x005c }
                if (r3 == 0) goto L_0x0077
                java.lang.String r3 = r3.getStatus()     // Catch:{ Exception -> 0x005c }
                goto L_0x0078
            L_0x0077:
                r3 = r2
            L_0x0078:
                java.lang.String r4 = "success"
                boolean r3 = km.p.o(r3, r4, r1)     // Catch:{ Exception -> 0x005c }
                if (r3 == 0) goto L_0x00df
                java.lang.String r1 = "2"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x005c }
                if (r6 == 0) goto L_0x0154
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$dOEkyc r0 = r6.getDOAuthOTP()     // Catch:{ Exception -> 0x005c }
                if (r0 == 0) goto L_0x0154
                java.lang.String r0 = r0.getLast_four_mobile()     // Catch:{ Exception -> 0x005c }
                if (r0 == 0) goto L_0x0154
                int r0 = r0.length()     // Catch:{ Exception -> 0x005c }
                r1 = 4
                if (r0 != r1) goto L_0x0154
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r0 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                java.lang.String r1 = r6.getTxnNo()     // Catch:{ Exception -> 0x005c }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x005c }
                r0.I2(r1)     // Catch:{ Exception -> 0x005c }
                java.lang.String r0 = "txnNo"
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r1 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                java.lang.String r1 = r1.b2()     // Catch:{ Exception -> 0x005c }
                cm.l.c(r1)     // Catch:{ Exception -> 0x005c }
                android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x005c }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r0 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$dOEkyc r1 = r6.getDOAuthOTP()     // Catch:{ Exception -> 0x005c }
                if (r1 == 0) goto L_0x00c2
                java.lang.String r1 = r1.getLast_four_mobile()     // Catch:{ Exception -> 0x005c }
                goto L_0x00c3
            L_0x00c2:
                r1 = r2
            L_0x00c3:
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x005c }
                r0.s2(r1)     // Catch:{ Exception -> 0x005c }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r0 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$dOEkyc r6 = r6.getDOAuthOTP()     // Catch:{ Exception -> 0x005c }
                if (r6 == 0) goto L_0x00d6
                java.lang.String r2 = r6.getLast_four_mobile()     // Catch:{ Exception -> 0x005c }
            L_0x00d6:
                java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x005c }
                r0.K2(r0, r6)     // Catch:{ Exception -> 0x005c }
                goto L_0x0154
            L_0x00df:
                java.lang.String r3 = "3"
                android.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x005c }
                if (r6 == 0) goto L_0x00eb
                java.lang.String r0 = r6.getReason()     // Catch:{ Exception -> 0x005c }
                goto L_0x00ec
            L_0x00eb:
                r0 = r2
            L_0x00ec:
                if (r0 == 0) goto L_0x0132
                int r0 = r0.length()     // Catch:{ Exception -> 0x005c }
                if (r0 != 0) goto L_0x00f5
                goto L_0x0132
            L_0x00f5:
                java.lang.String r0 = "reason fail"
                if (r6 == 0) goto L_0x00fe
                java.lang.String r3 = r6.getReason()     // Catch:{ Exception -> 0x005c }
                goto L_0x00ff
            L_0x00fe:
                r3 = r2
            L_0x00ff:
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x005c }
                android.util.Log.v(r0, r3)     // Catch:{ Exception -> 0x005c }
                if (r6 == 0) goto L_0x010d
                java.lang.String r0 = r6.getReason()     // Catch:{ Exception -> 0x005c }
                goto L_0x010e
            L_0x010d:
                r0 = r2
            L_0x010e:
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x005c }
                java.lang.String r3 = "Invalid Auth Xml Format."
                boolean r0 = km.p.o(r0, r3, r1)     // Catch:{ Exception -> 0x005c }
                if (r0 == 0) goto L_0x0122
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r6 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                java.lang.String r0 = "Invalid Aadhaar No.\nPlease try again"
            L_0x011e:
                r6.p2(r6, r0)     // Catch:{ Exception -> 0x005c }
                goto L_0x0154
            L_0x0122:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r0 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                if (r6 == 0) goto L_0x012a
                java.lang.String r2 = r6.getReason()     // Catch:{ Exception -> 0x005c }
            L_0x012a:
                java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x005c }
                r0.p2(r0, r6)     // Catch:{ Exception -> 0x005c }
                goto L_0x0154
            L_0x0132:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r6 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                ld.c r0 = r6.I     // Catch:{ Exception -> 0x005c }
                if (r0 != 0) goto L_0x0140
                java.lang.String r0 = "session"
                cm.l.v(r0)     // Catch:{ Exception -> 0x005c }
                goto L_0x0141
            L_0x0140:
                r2 = r0
            L_0x0141:
                java.lang.String r0 = "service_is_not_present"
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r1 = r5.f21755e     // Catch:{ Exception -> 0x005c }
                r3 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x005c }
                java.lang.String r0 = r2.b(r0, r1)     // Catch:{ Exception -> 0x005c }
                goto L_0x011e
            L_0x0151:
                r6.printStackTrace()
            L_0x0154:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen.j.b(com.nic.mparivahan.VahanEkyc.AadarkycVerify$Response):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AadarkycVerify.Response) obj);
            return x.f30437a;
        }
    }

    static final class k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21756e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21756e = learnerLicenceAadharScreen;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x018c A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0191 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x019e A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01a3 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01b0 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01b5 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01c2 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01c7 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01d4 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01d9 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01e6 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01eb A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x01f8 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0201 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x020f A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0214 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0222 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0227 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0235 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x023a A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x0248 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x024d A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x025b A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x0260 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x026e A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x0273 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x0281 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0286 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x0296 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x029b A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x02ab A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x02b2  */
        /* JADX WARNING: Removed duplicated region for block: B:199:0x02c9 A[Catch:{ Exception -> 0x02ce }] */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x02d0 A[Catch:{ Exception -> 0x02ce }] */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x02ee A[Catch:{ Exception -> 0x02ce }] */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x032a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006a A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006b A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0096 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00c0 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00e3 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00e8 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00f7 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0119 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0121 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0138 A[SYNTHETIC, Splitter:B:77:0x0138] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0156 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x015b A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0168 A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x016d A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x017a A[Catch:{ Exception -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x017f A[Catch:{ Exception -> 0x005a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r35) {
            /*
                r34 = this;
                r1 = r34
                java.lang.String r0 = r35.toString()
                java.lang.String r2 = "adhResp_kyc_req"
                android.util.Log.e(r2, r0)
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DoAadhaarResponse r0 = r35.getDoAadhaarResponse()
                if (r0 == 0) goto L_0x0016
                java.lang.String r3 = r0.getStatus()
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r4 = "status_response"
                android.util.Log.d(r4, r3)
                if (r0 == 0) goto L_0x0027
                java.lang.String r3 = r0.getStatus()
                goto L_0x0028
            L_0x0027:
                r3 = 0
            L_0x0028:
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r3 = r3.length()
                java.lang.String r4 = "pDialog"
                if (r3 != 0) goto L_0x0038
            L_0x0034:
                r33 = r4
                goto L_0x0335
            L_0x0038:
                if (r0 == 0) goto L_0x003f
                java.lang.String r3 = r0.getStatus()
                goto L_0x0040
            L_0x003f:
                r3 = 0
            L_0x0040:
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r5 = "Y"
                r6 = 1
                boolean r3 = km.p.o(r3, r5, r6)
                if (r3 == 0) goto L_0x0034
                if (r0 == 0) goto L_0x005f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r3 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r3 == 0) goto L_0x005f
                java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x005a }
                goto L_0x0060
            L_0x005a:
                r0 = move-exception
                r33 = r4
                goto L_0x0322
            L_0x005f:
                r3 = 0
            L_0x0060:
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x005a }
                int r3 = r3.length()     // Catch:{ Exception -> 0x005a }
                if (r3 != 0) goto L_0x006b
                goto L_0x0082
            L_0x006b:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x007a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r5 == 0) goto L_0x007a
                java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x005a }
                goto L_0x007b
            L_0x007a:
                r5 = 0
            L_0x007b:
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x005a }
                r3.B2(r5)     // Catch:{ Exception -> 0x005a }
            L_0x0082:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
                r5.<init>()     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0096
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r6 == 0) goto L_0x0096
                java.lang.String r6 = r6.getHouse()     // Catch:{ Exception -> 0x005a }
                goto L_0x0097
            L_0x0096:
                r6 = 0
            L_0x0097:
                r5.append(r6)     // Catch:{ Exception -> 0x005a }
                r6 = 32
                r5.append(r6)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x00ac
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r7 == 0) goto L_0x00ac
                java.lang.String r7 = r7.getStreet()     // Catch:{ Exception -> 0x005a }
                goto L_0x00ad
            L_0x00ac:
                r7 = 0
            L_0x00ad:
                r5.append(r7)     // Catch:{ Exception -> 0x005a }
                r5.append(r6)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x00c0
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r7 == 0) goto L_0x00c0
                java.lang.String r7 = r7.getLocalityIfAny()     // Catch:{ Exception -> 0x005a }
                goto L_0x00c1
            L_0x00c0:
                r7 = 0
            L_0x00c1:
                r5.append(r7)     // Catch:{ Exception -> 0x005a }
                r5.append(r6)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x00d4
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r7 == 0) goto L_0x00d4
                java.lang.String r7 = r7.getDist()     // Catch:{ Exception -> 0x005a }
                goto L_0x00d5
            L_0x00d4:
                r7 = 0
            L_0x00d5:
                r5.append(r7)     // Catch:{ Exception -> 0x005a }
                r5.append(r6)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x00e8
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r7 == 0) goto L_0x00e8
                java.lang.String r7 = r7.getState()     // Catch:{ Exception -> 0x005a }
                goto L_0x00e9
            L_0x00e8:
                r7 = 0
            L_0x00e9:
                r5.append(r7)     // Catch:{ Exception -> 0x005a }
                r5.append(r6)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x00fc
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r6 == 0) goto L_0x00fc
                java.lang.String r6 = r6.getPincode()     // Catch:{ Exception -> 0x005a }
                goto L_0x00fd
            L_0x00fc:
                r6 = 0
            L_0x00fd:
                r5.append(r6)     // Catch:{ Exception -> 0x005a }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x005a }
                r3.t2(r5)     // Catch:{ Exception -> 0x005a }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                ld.f r3 = r3.Y1()     // Catch:{ Exception -> 0x005a }
                java.lang.String r3 = r3.l()     // Catch:{ Exception -> 0x005a }
                java.lang.String r5 = "HP"
                boolean r3 = cm.l.a(r3, r5)     // Catch:{ Exception -> 0x005a }
                if (r3 == 0) goto L_0x0121
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                r5 = 509(0x1fd, float:7.13E-43)
                r3.G2(r5)     // Catch:{ Exception -> 0x005a }
                goto L_0x0128
            L_0x0121:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                r5 = 501(0x1f5, float:7.02E-43)
                r3.G2(r5)     // Catch:{ Exception -> 0x005a }
            L_0x0128:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                da.c r5 = r3.S1()     // Catch:{ Exception -> 0x005a }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                ni.a5 r3 = r3.G     // Catch:{ Exception -> 0x005a }
                java.lang.String r6 = "binding"
                if (r3 != 0) goto L_0x013c
                cm.l.v(r6)     // Catch:{ Exception -> 0x005a }
                r3 = 0
            L_0x013c:
                android.widget.EditText r3 = r3.B     // Catch:{ Exception -> 0x005a }
                android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x005a }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x005a }
                java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x005a }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x015b
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r7 == 0) goto L_0x015b
                java.lang.String r7 = r7.getCareOf()     // Catch:{ Exception -> 0x005a }
                goto L_0x015c
            L_0x015b:
                r7 = 0
            L_0x015c:
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x016d
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r8 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r8 == 0) goto L_0x016d
                java.lang.String r8 = r8.getCode()     // Catch:{ Exception -> 0x005a }
                goto L_0x016e
            L_0x016d:
                r8 = 0
            L_0x016e:
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x017f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r9 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r9 == 0) goto L_0x017f
                java.lang.String r9 = r9.getDist()     // Catch:{ Exception -> 0x005a }
                goto L_0x0180
            L_0x017f:
                r9 = 0
            L_0x0180:
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0191
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r10 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r10 == 0) goto L_0x0191
                java.lang.String r10 = r10.getDob()     // Catch:{ Exception -> 0x005a }
                goto L_0x0192
            L_0x0191:
                r10 = 0
            L_0x0192:
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x01a3
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r11 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r11 == 0) goto L_0x01a3
                java.lang.String r11 = r11.getGender()     // Catch:{ Exception -> 0x005a }
                goto L_0x01a4
            L_0x01a3:
                r11 = 0
            L_0x01a4:
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x01b5
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r12 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r12 == 0) goto L_0x01b5
                java.lang.String r12 = r12.getHouse()     // Catch:{ Exception -> 0x005a }
                goto L_0x01b6
            L_0x01b5:
                r12 = 0
            L_0x01b6:
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x01c7
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r13 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r13 == 0) goto L_0x01c7
                java.lang.String r13 = r13.getLandMark()     // Catch:{ Exception -> 0x005a }
                goto L_0x01c8
            L_0x01c7:
                r13 = 0
            L_0x01c8:
                java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x01d9
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r14 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r14 == 0) goto L_0x01d9
                java.lang.String r14 = r14.getLocalityIfAny()     // Catch:{ Exception -> 0x005a }
                goto L_0x01da
            L_0x01d9:
                r14 = 0
            L_0x01da:
                java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x01eb
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r15 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r15 == 0) goto L_0x01eb
                java.lang.String r15 = r15.getName()     // Catch:{ Exception -> 0x005a }
                goto L_0x01ec
            L_0x01eb:
                r15 = 0
            L_0x01ec:
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0201
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r16 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r16 == 0) goto L_0x0201
                int r16 = r16.getPhone()     // Catch:{ Exception -> 0x005a }
                java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x005a }
                goto L_0x0203
            L_0x0201:
                r16 = 0
            L_0x0203:
                java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0214
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r17 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r17 == 0) goto L_0x0214
                java.lang.String r17 = r17.getPht()     // Catch:{ Exception -> 0x005a }
                goto L_0x0216
            L_0x0214:
                r17 = 0
            L_0x0216:
                java.lang.String r17 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0227
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r18 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r18 == 0) goto L_0x0227
                java.lang.String r18 = r18.getPincode()     // Catch:{ Exception -> 0x005a }
                goto L_0x0229
            L_0x0227:
                r18 = 0
            L_0x0229:
                java.lang.String r18 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x023a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r19 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r19 == 0) goto L_0x023a
                java.lang.String r19 = r19.getState()     // Catch:{ Exception -> 0x005a }
                goto L_0x023c
            L_0x023a:
                r19 = 0
            L_0x023c:
                java.lang.String r19 = java.lang.String.valueOf(r19)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x024d
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r20 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r20 == 0) goto L_0x024d
                java.lang.String r20 = r20.getStatus()     // Catch:{ Exception -> 0x005a }
                goto L_0x024f
            L_0x024d:
                r20 = 0
            L_0x024f:
                java.lang.String r20 = java.lang.String.valueOf(r20)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0260
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r21 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r21 == 0) goto L_0x0260
                java.lang.String r21 = r21.getStreet()     // Catch:{ Exception -> 0x005a }
                goto L_0x0262
            L_0x0260:
                r21 = 0
            L_0x0262:
                java.lang.String r21 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0273
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r22 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r22 == 0) goto L_0x0273
                java.lang.String r22 = r22.getVillageTownCity()     // Catch:{ Exception -> 0x005a }
                goto L_0x0275
            L_0x0273:
                r22 = 0
            L_0x0275:
                java.lang.String r22 = java.lang.String.valueOf(r22)     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x0286
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r23 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r23 == 0) goto L_0x0286
                java.lang.String r23 = r23.getXmlUID()     // Catch:{ Exception -> 0x005a }
                goto L_0x0288
            L_0x0286:
                r23 = 0
            L_0x0288:
                java.lang.String r23 = java.lang.String.valueOf(r23)     // Catch:{ Exception -> 0x005a }
                java.lang.String r24 = ""
                if (r0 == 0) goto L_0x029b
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r25 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r25 == 0) goto L_0x029b
                java.lang.String r25 = r25.getName()     // Catch:{ Exception -> 0x005a }
                goto L_0x029d
            L_0x029b:
                r25 = 0
            L_0x029d:
                java.lang.String r25 = java.lang.String.valueOf(r25)     // Catch:{ Exception -> 0x005a }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e     // Catch:{ Exception -> 0x005a }
                if (r0 == 0) goto L_0x02b2
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r26 = r0.getDOEkyc()     // Catch:{ Exception -> 0x005a }
                if (r26 == 0) goto L_0x02b2
                java.lang.String r26 = r26.getDob()     // Catch:{ Exception -> 0x005a }
                r33 = r4
                goto L_0x02b6
            L_0x02b2:
                r33 = r4
                r26 = 0
            L_0x02b6:
                java.lang.String r4 = java.lang.String.valueOf(r26)     // Catch:{ Exception -> 0x02ce }
                java.lang.String r26 = r2.M1(r4)     // Catch:{ Exception -> 0x02ce }
                cm.l.c(r26)     // Catch:{ Exception -> 0x02ce }
                if (r0 == 0) goto L_0x02d0
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r0.getDOEkyc()     // Catch:{ Exception -> 0x02ce }
                if (r2 == 0) goto L_0x02d0
                java.lang.String r2 = r2.getCareOf()     // Catch:{ Exception -> 0x02ce }
                goto L_0x02d1
            L_0x02ce:
                r0 = move-exception
                goto L_0x0322
            L_0x02d0:
                r2 = 0
            L_0x02d1:
                java.lang.String r27 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02ce }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e     // Catch:{ Exception -> 0x02ce }
                int r28 = r2.Z1()     // Catch:{ Exception -> 0x02ce }
                java.lang.String r29 = "Y"
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e     // Catch:{ Exception -> 0x02ce }
                java.lang.String r30 = r2.b2()     // Catch:{ Exception -> 0x02ce }
                cm.l.c(r30)     // Catch:{ Exception -> 0x02ce }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e     // Catch:{ Exception -> 0x02ce }
                ni.a5 r2 = r2.G     // Catch:{ Exception -> 0x02ce }
                if (r2 != 0) goto L_0x02f2
                cm.l.v(r6)     // Catch:{ Exception -> 0x02ce }
                r2 = 0
            L_0x02f2:
                android.widget.EditText r2 = r2.B     // Catch:{ Exception -> 0x02ce }
                android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x02ce }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02ce }
                java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x02ce }
                java.lang.String r31 = r2.toString()     // Catch:{ Exception -> 0x02ce }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e     // Catch:{ Exception -> 0x02ce }
                ld.f r2 = r2.Y1()     // Catch:{ Exception -> 0x02ce }
                java.lang.String r32 = r2.l()     // Catch:{ Exception -> 0x02ce }
                r6 = r3
                r5.m(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x02ce }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e     // Catch:{ Exception -> 0x02ce }
                cm.l.c(r0)     // Catch:{ Exception -> 0x02ce }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x02ce }
                cm.l.c(r0)     // Catch:{ Exception -> 0x02ce }
                r2.r2(r0)     // Catch:{ Exception -> 0x02ce }
                goto L_0x0387
            L_0x0322:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e
                android.app.ProgressDialog r2 = r2.H
                if (r2 != 0) goto L_0x032e
                cm.l.v(r33)
                r2 = 0
            L_0x032e:
                r2.dismiss()
                r0.printStackTrace()
                goto L_0x0387
            L_0x0335:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e
                android.app.ProgressDialog r2 = r2.H
                if (r2 != 0) goto L_0x0341
                cm.l.v(r33)
                r2 = 0
            L_0x0341:
                r2.dismiss()
                if (r0 == 0) goto L_0x034b
                java.lang.String r2 = r0.getReason()
                goto L_0x034c
            L_0x034b:
                r2 = 0
            L_0x034c:
                if (r2 == 0) goto L_0x0367
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0355
                goto L_0x0367
            L_0x0355:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r2 = r1.f21756e
                if (r0 == 0) goto L_0x035e
                java.lang.String r0 = r0.getReason()
                goto L_0x035f
            L_0x035e:
                r0 = 0
            L_0x035f:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r2.p2(r2, r0)
                goto L_0x0387
            L_0x0367:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r0 = r1.f21756e
                ld.c r2 = r0.I
                if (r2 != 0) goto L_0x0375
                java.lang.String r2 = "session"
                cm.l.v(r2)
                r2 = 0
            L_0x0375:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r3 = r1.f21756e
                r4 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "service_is_not_present"
                java.lang.String r2 = r2.b(r4, r3)
                r0.p2(r0, r2)
            L_0x0387:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen.k.b(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Aadarkyc.Response) obj);
            return x.f30437a;
        }
    }

    static final class l extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(LearnerLicenceAadharScreen learnerLicenceAadharScreen) {
            super(1);
            this.f21757e = learnerLicenceAadharScreen;
        }

        public final void b(String str) {
            ProgressDialog C1 = this.f21757e.H;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class m implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21758a;

        m(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21758a = lVar;
        }

        public final pl.c a() {
            return this.f21758a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21758a.invoke(obj);
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

    public static final class n extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21760b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21759a = textView;
            this.f21760b = textView2;
        }

        public void onFinish() {
            this.f21760b.setVisibility(0);
            this.f21759a.setText("0");
            this.f21759a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21759a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21760b.setVisibility(8);
            this.f21759a.setVisibility(0);
        }
    }

    public static final class o extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21761a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f21762b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f21761a = textView;
            this.f21762b = textView2;
        }

        public void onFinish() {
            this.f21762b.setVisibility(0);
            this.f21761a.setText("0");
            this.f21761a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21761a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f21762b.setVisibility(8);
            this.f21761a.setVisibility(0);
        }
    }

    public static final class p extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21763a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21764b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f21765c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(TextView textView, LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView2) {
            super(30000, 1000);
            this.f21763a = textView;
            this.f21764b = learnerLicenceAadharScreen;
            this.f21765c = textView2;
        }

        public void onFinish() {
            this.f21765c.setVisibility(0);
            this.f21763a.setText("0");
            this.f21763a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f21763a;
            StringBuilder sb2 = new StringBuilder();
            ld.c F1 = this.f21764b.I;
            if (F1 == null) {
                cm.l.v("session");
                F1 = null;
            }
            sb2.append(F1.b("time_remaining", this.f21764b.getString(R.string.time_remaining)));
            sb2.append(" : ");
            sb2.append(j10 / ((long) 1000));
            textView.setText(sb2.toString());
            this.f21765c.setVisibility(8);
            this.f21763a.setVisibility(0);
        }
    }

    public static final class q extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f21766a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAadharScreen f21767b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f21768c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(TextView textView, LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView2) {
            super(30000, 1000);
            this.f21766a = textView;
            this.f21767b = learnerLicenceAadharScreen;
            this.f21768c = textView2;
        }

        public void onFinish() {
            this.f21768c.setVisibility(0);
            this.f21766a.setText("0");
            this.f21766a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f21766a;
            StringBuilder sb2 = new StringBuilder();
            ld.c F1 = this.f21767b.I;
            if (F1 == null) {
                cm.l.v("session");
                F1 = null;
            }
            sb2.append(F1.b("time_remaining", this.f21767b.getString(R.string.time_remaining)));
            sb2.append(" : ");
            sb2.append(j10 / ((long) 1000));
            textView.setText(sb2.toString());
            this.f21768c.setVisibility(8);
            this.f21766a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public final void J2() {
        ArrayList arrayList = new ArrayList();
        int size = U1().size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.addAll(p.d(((RtosMaster) U1().get(i11)).getRto_name()));
            if (cm.l.a(Y1().l(), "DL") && cm.l.a(q.B0(((RtosMaster) U1().get(i11)).getRto_code()).toString(), "DL1")) {
                i10 = i11;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        a5 a5Var = null;
        if (cm.l.a(Y1().l(), "DL")) {
            a5 a5Var2 = this.G;
            if (a5Var2 == null) {
                cm.l.v("binding");
                a5Var2 = null;
            }
            a5Var2.K.setClickable(false);
            a5 a5Var3 = this.G;
            if (a5Var3 == null) {
                cm.l.v("binding");
                a5Var3 = null;
            }
            a5Var3.K.setEnabled(false);
        }
        a5 a5Var4 = this.G;
        if (a5Var4 == null) {
            cm.l.v("binding");
            a5Var4 = null;
        }
        a5Var4.K.setAdapter(arrayAdapter);
        if (i10 > 0) {
            a5 a5Var5 = this.G;
            if (a5Var5 == null) {
                cm.l.v("binding");
            } else {
                a5Var = a5Var5;
            }
            a5Var.K.setSelection(i10);
        }
    }

    /* access modifiers changed from: private */
    public final void L1() {
        ProgressDialog progressDialog = this.H;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            cm.l.v("pDialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this.H;
            if (progressDialog3 == null) {
                cm.l.v("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.dismiss();
        }
        ProgressDialog progressDialog4 = this.H;
        if (progressDialog4 == null) {
            cm.l.v("pDialog");
        } else {
            progressDialog2 = progressDialog4;
        }
        progressDialog2.show();
        if (cm.l.a(Y1().l(), "HP")) {
            S1().g(Y1().l(), 509, q.B0(this.N).toString());
        } else {
            S1().g(Y1().l(), this.U, q.B0(this.N).toString());
        }
    }

    /* access modifiers changed from: private */
    public static final void L2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void M2(EditText editText, ImageView imageView, View view) {
        TransformationMethod instance;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(imageView, "$shownPin");
        if (editText.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            imageView.setImageResource(R.drawable.pass_visible);
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            imageView.setImageResource(R.drawable.mvvm_visibility);
            instance = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void N2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView, TextView textView2, View view) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        ProgressDialog progressDialog = learnerLicenceAadharScreen.H;
        a5 a5Var = null;
        if (progressDialog == null) {
            cm.l.v("pDialog");
            progressDialog = null;
        }
        progressDialog.show();
        new o(textView, textView2).start();
        a5 a5Var2 = learnerLicenceAadharScreen.G;
        if (a5Var2 == null) {
            cm.l.v("binding");
        } else {
            a5Var = a5Var2;
        }
        String obj = q.B0(a5Var.B.getText().toString()).toString();
        Charset forName = Charset.forName("UTF-8");
        cm.l.e(forName, "forName(charsetName)");
        byte[] bytes = obj.getBytes(forName);
        cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        int nextInt = new Random().nextInt(1410065407);
        ea.a T1 = learnerLicenceAadharScreen.T1();
        cm.l.c(encodeToString);
        T1.g(encodeToString, false, false, false, true, String.valueOf(nextInt), "", "", false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: ni.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: ni.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: ni.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: ni.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: ni.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: ni.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: ni.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: ld.c} */
    /* JADX WARNING: type inference failed for: r3v18, types: [ld.c] */
    /* JADX WARNING: type inference failed for: r3v23, types: [ld.c] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O2(android.widget.EditText r17, com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r18, android.widget.TextView r19, android.view.View r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "$enterOtp"
            cm.l.f(r0, r3)
            java.lang.String r3 = "this$0"
            cm.l.f(r1, r3)
            java.lang.String r3 = "$txt_reset"
            cm.l.f(r2, r3)
            android.text.Editable r3 = r17.getText()
            java.lang.String r3 = r3.toString()
            int r4 = r3.length()
            java.lang.String r5 = "session"
            r6 = 0
            r7 = 0
            if (r4 != 0) goto L_0x0046
            ld.c r3 = r1.I
            if (r3 != 0) goto L_0x002f
            cm.l.v(r5)
            goto L_0x0030
        L_0x002f:
            r7 = r3
        L_0x0030:
            r3 = 2132018817(0x7f140681, float:1.9675951E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "label_log_entr_otp"
        L_0x0039:
            java.lang.String r3 = r7.b(r4, r3)
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r6)
            r1.show()
            goto L_0x00c1
        L_0x0046:
            int r3 = r3.length()
            r4 = 6
            if (r3 >= r4) goto L_0x0060
            ld.c r3 = r1.I
            if (r3 != 0) goto L_0x0055
            cm.l.v(r5)
            goto L_0x0056
        L_0x0055:
            r7 = r3
        L_0x0056:
            r3 = 2132018820(0x7f140684, float:1.9675957E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "label_log_entr_val_otp"
            goto L_0x0039
        L_0x0060:
            android.app.ProgressDialog r3 = r1.H
            if (r3 != 0) goto L_0x006a
            java.lang.String r3 = "pDialog"
            cm.l.v(r3)
            r3 = r7
        L_0x006a:
            r3.show()
            ni.a5 r3 = r1.G
            if (r3 != 0) goto L_0x0077
            java.lang.String r3 = "binding"
            cm.l.v(r3)
            goto L_0x0078
        L_0x0077:
            r7 = r3
        L_0x0078:
            android.widget.EditText r3 = r7.B
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = km.q.B0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            java.lang.String r5 = "forName(charsetName)"
            cm.l.e(r4, r5)
            byte[] r3 = r3.getBytes(r4)
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            cm.l.e(r3, r4)
            java.lang.String r8 = android.util.Base64.encodeToString(r3, r6)
            ea.a r7 = r18.T1()
            cm.l.c(r8)
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 1
            java.lang.String r13 = "987612345"
            java.lang.String r14 = r1.X
            cm.l.c(r14)
            android.text.Editable r1 = r17.getText()
            java.lang.String r15 = r1.toString()
            r16 = 1
            r7.g(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00c1:
            bj.v1 r1 = new bj.v1
            r1.<init>(r0)
            r2.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen.O2(android.widget.EditText, com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen, android.widget.TextView, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void P2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void R2(EditText editText, ImageView imageView, View view) {
        TransformationMethod instance;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(imageView, "$shownPin");
        if (editText.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            imageView.setImageResource(R.drawable.pass_visible);
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            imageView.setImageResource(R.drawable.mvvm_visibility);
            instance = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void S2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView, TextView textView2, View view) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(textView2, "$resendOtp");
        learnerLicenceAadharScreen.P1().D(learnerLicenceAadharScreen, String.valueOf(learnerLicenceAadharScreen.Q));
        new q(textView, learnerLicenceAadharScreen, textView2).start();
    }

    /* access modifiers changed from: private */
    public static final void T2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, EditText editText, View view) {
        Toast makeText;
        String string;
        String str;
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        cm.l.f(editText, "$enterOtp");
        ld.c cVar = null;
        if (com.nic.mparivahan.a.f9624a.a(learnerLicenceAadharScreen)) {
            Editable text = editText.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                ld.c cVar2 = learnerLicenceAadharScreen.I;
                if (cVar2 == null) {
                    cm.l.v("session");
                } else {
                    cVar = cVar2;
                }
                string = learnerLicenceAadharScreen.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                cm.l.c(text2);
                if (text2.length() < 6) {
                    ld.c cVar3 = learnerLicenceAadharScreen.I;
                    if (cVar3 == null) {
                        cm.l.v("session");
                    } else {
                        cVar = cVar3;
                    }
                    string = learnerLicenceAadharScreen.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    ba.b P1 = learnerLicenceAadharScreen.P1();
                    String obj = editText.getText().toString();
                    String str2 = learnerLicenceAadharScreen.Q;
                    cm.l.c(str2);
                    P1.G(learnerLicenceAadharScreen, obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(learnerLicenceAadharScreen, cVar.b(str, string), 0);
        } else {
            Context applicationContext = learnerLicenceAadharScreen.getApplicationContext();
            ld.c cVar4 = learnerLicenceAadharScreen.I;
            if (cVar4 == null) {
                cm.l.v("session");
            } else {
                cVar = cVar4;
            }
            makeText = Toast.makeText(applicationContext, cVar.b("label_log_check_internet", learnerLicenceAadharScreen.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void U2(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void V2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void X1(String str) {
        try {
            ProgressDialog progressDialog = this.H;
            if (progressDialog == null) {
                cm.l.v("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            P1().h(this, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void c2() {
        F2(new ld.f(this));
        a5 a5Var = this.G;
        a5 a5Var2 = null;
        if (a5Var == null) {
            cm.l.v("binding");
            a5Var = null;
        }
        a5Var.E.f28452f.setText(Y1().i());
        a5 a5Var3 = this.G;
        if (a5Var3 == null) {
            cm.l.v("binding");
            a5Var3 = null;
        }
        a5Var3.E.f28448b.setOnClickListener(new c2(this));
        this.I = new ld.c(this);
        this.H = new ProgressDialog(this);
        H2(new ld.g(this));
        ProgressDialog progressDialog = this.H;
        if (progressDialog == null) {
            cm.l.v("pDialog");
            progressDialog = null;
        }
        ld.c cVar = this.I;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        progressDialog.setMessage(cVar.b("label_challan_please_wait", getString(R.string.please_wait)));
        ProgressDialog progressDialog2 = this.H;
        if (progressDialog2 == null) {
            cm.l.v("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.H;
        if (progressDialog3 == null) {
            cm.l.v("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        D2(DlServiceInt.f21675a.a(this));
        u2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(V1(), this))).a(ba.b.class));
        E2(EkYCService.f20515a.a(this));
        A2((ca.c) new u0((x0) this, (u0.b) new ca.b(new ca.a(W1()))).a(ca.c.class));
        v2(AadharInterface.f8349a.a(this));
        x2((da.c) new u0((x0) this, (u0.b) new da.a(new da.b(Q1()))).a(da.c.class));
        w2(AdrInterface.f8352a.b(this));
        y2((ea.a) new u0((x0) this, (u0.b) new ea.b(new ea.d(R1()))).a(ea.a.class));
        X1(Y1().l());
        a5 a5Var4 = this.G;
        if (a5Var4 == null) {
            cm.l.v("binding");
            a5Var4 = null;
        }
        a5Var4.K.setOnItemSelectedListener(new a(this));
        a5 a5Var5 = this.G;
        if (a5Var5 == null) {
            cm.l.v("binding");
            a5Var5 = null;
        }
        a5Var5.M.setText(VContant.Companion.k(Y1().l()));
        a5 a5Var6 = this.G;
        if (a5Var6 == null) {
            cm.l.v("binding");
            a5Var6 = null;
        }
        TextView textView = a5Var6.C;
        ld.c cVar2 = this.I;
        if (cVar2 == null) {
            cm.l.v("session");
            cVar2 = null;
        }
        textView.setText(cVar2.b("btn_dl_serv_gen_otp", getString(R.string.generate_otp)));
        a5 a5Var7 = this.G;
        if (a5Var7 == null) {
            cm.l.v("binding");
            a5Var7 = null;
        }
        a5Var7.f25194z.setText(Html.fromHtml("I have read and agree to " + "<font color=\"#008ed8\"><b><u>Aadhaar based e-KYC consent</u></b></font>"));
        this.T = "A";
        a5 a5Var8 = this.G;
        if (a5Var8 == null) {
            cm.l.v("binding");
            a5Var8 = null;
        }
        a5Var8.f25194z.setOnClickListener(new d2(this));
        a5 a5Var9 = this.G;
        if (a5Var9 == null) {
            cm.l.v("binding");
            a5Var9 = null;
        }
        a5Var9.f25192x.setOnCheckedChangeListener(new e2(this));
        a5 a5Var10 = this.G;
        if (a5Var10 == null) {
            cm.l.v("binding");
            a5Var10 = null;
        }
        a5Var10.f25193y.setOnCheckedChangeListener(new f2(this));
        a5 a5Var11 = this.G;
        if (a5Var11 == null) {
            cm.l.v("binding");
            a5Var11 = null;
        }
        a5Var11.O.setOnCheckedChangeListener(new m1(this));
        a5 a5Var12 = this.G;
        if (a5Var12 == null) {
            cm.l.v("binding");
            a5Var12 = null;
        }
        a5Var12.C.setOnClickListener(new n1(this));
        a5 a5Var13 = this.G;
        if (a5Var13 == null) {
            cm.l.v("binding");
        } else {
            a5Var2 = a5Var13;
        }
        a5Var2.I.setOnClickListener(new o1(this));
    }

    /* access modifiers changed from: private */
    public static final void d2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, View view) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        learnerLicenceAadharScreen.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void e2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, View view) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        Dialog dialog = new Dialog(learnerLicenceAadharScreen);
        dialog.setContentView(R.layout.term_cond_aadhar_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View findViewById = dialog.findViewById(R.id.cancelIv);
        cm.l.e(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.termConditionWv);
        cm.l.e(findViewById2, "findViewById(...)");
        WebView webView = (WebView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.title);
        cm.l.e(findViewById3, "findViewById(...)");
        TextView textView = (TextView) findViewById3;
        a5 a5Var = learnerLicenceAadharScreen.G;
        ld.c cVar = null;
        if (a5Var == null) {
            cm.l.v("binding");
            a5Var = null;
        }
        textView.setText(a5Var.O.isChecked() ? "VID based e-KYC consent" : "Aadhaar based e-KYC consent");
        imageView.setOnClickListener(new x1(dialog));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hc.a.f12073a.g());
        ld.c cVar2 = learnerLicenceAadharScreen.I;
        if (cVar2 == null) {
            cm.l.v("session");
        } else {
            cVar = cVar2;
        }
        sb2.append(cVar.d());
        sb2.append("/mparivahan-info-terms-of-use-aadhaar.html");
        webView.loadUrl(sb2.toString());
        webView.clearCache(true);
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void f2(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void g2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, RadioGroup radioGroup, int i10) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        ld.c cVar = null;
        if (i10 == R.id.withoutAadharRb) {
            a5 a5Var = learnerLicenceAadharScreen.G;
            if (a5Var == null) {
                cm.l.v("binding");
                a5Var = null;
            }
            a5Var.D.setVisibility(0);
            a5 a5Var2 = learnerLicenceAadharScreen.G;
            if (a5Var2 == null) {
                cm.l.v("binding");
                a5Var2 = null;
            }
            a5Var2.f25191w.setVisibility(8);
            a5 a5Var3 = learnerLicenceAadharScreen.G;
            if (a5Var3 == null) {
                cm.l.v("binding");
                a5Var3 = null;
            }
            TextView textView = a5Var3.C;
            ld.c cVar2 = learnerLicenceAadharScreen.I;
            if (cVar2 == null) {
                cm.l.v("session");
            } else {
                cVar = cVar2;
            }
            textView.setText(cVar.b("btn_dl_serv_gen_otp", learnerLicenceAadharScreen.getString(R.string.generate_otp)));
            learnerLicenceAadharScreen.S = 1;
            return;
        }
        a5 a5Var4 = learnerLicenceAadharScreen.G;
        if (a5Var4 == null) {
            cm.l.v("binding");
            a5Var4 = null;
        }
        a5Var4.D.setVisibility(8);
        a5 a5Var5 = learnerLicenceAadharScreen.G;
        if (a5Var5 == null) {
            cm.l.v("binding");
            a5Var5 = null;
        }
        a5Var5.f25191w.setVisibility(0);
        a5 a5Var6 = learnerLicenceAadharScreen.G;
        if (a5Var6 == null) {
            cm.l.v("binding");
            a5Var6 = null;
        }
        TextView textView2 = a5Var6.C;
        ld.c cVar3 = learnerLicenceAadharScreen.I;
        if (cVar3 == null) {
            cm.l.v("session");
        } else {
            cVar = cVar3;
        }
        textView2.setText(cVar.b("btn_dl_serv_gen_otp", learnerLicenceAadharScreen.getString(R.string.generate_otp)));
        learnerLicenceAadharScreen.S = 0;
    }

    /* access modifiers changed from: private */
    public static final void h2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, CompoundButton compoundButton, boolean z10) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        if (z10) {
            a5 a5Var = learnerLicenceAadharScreen.G;
            a5 a5Var2 = null;
            if (a5Var == null) {
                cm.l.v("binding");
                a5Var = null;
            }
            a5Var.O.setChecked(false);
            a5 a5Var3 = learnerLicenceAadharScreen.G;
            if (a5Var3 == null) {
                cm.l.v("binding");
                a5Var3 = null;
            }
            a5Var3.f25193y.setChecked(true);
            a5 a5Var4 = learnerLicenceAadharScreen.G;
            if (a5Var4 == null) {
                cm.l.v("binding");
                a5Var4 = null;
            }
            a5Var4.B.setHint(learnerLicenceAadharScreen.getString(R.string.enter_vid));
            a5 a5Var5 = learnerLicenceAadharScreen.G;
            if (a5Var5 == null) {
                cm.l.v("binding");
                a5Var5 = null;
            }
            a5Var5.B.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
            a5 a5Var6 = learnerLicenceAadharScreen.G;
            if (a5Var6 == null) {
                cm.l.v("binding");
            } else {
                a5Var2 = a5Var6;
            }
            a5Var2.f25194z.setText(Html.fromHtml("I have read and agree to " + "<font color=\"#008ed8\"><b><u>Aadhaar based e-KYC consent</u></b></font>"));
            learnerLicenceAadharScreen.T = "A";
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, CompoundButton compoundButton, boolean z10) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        if (z10) {
            a5 a5Var = learnerLicenceAadharScreen.G;
            a5 a5Var2 = null;
            if (a5Var == null) {
                cm.l.v("binding");
                a5Var = null;
            }
            a5Var.f25193y.setChecked(false);
            a5 a5Var3 = learnerLicenceAadharScreen.G;
            if (a5Var3 == null) {
                cm.l.v("binding");
                a5Var3 = null;
            }
            a5Var3.O.setChecked(true);
            a5 a5Var4 = learnerLicenceAadharScreen.G;
            if (a5Var4 == null) {
                cm.l.v("binding");
                a5Var4 = null;
            }
            a5Var4.B.setHint(learnerLicenceAadharScreen.getString(R.string.enter_vid));
            a5 a5Var5 = learnerLicenceAadharScreen.G;
            if (a5Var5 == null) {
                cm.l.v("binding");
                a5Var5 = null;
            }
            a5Var5.B.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            a5 a5Var6 = learnerLicenceAadharScreen.G;
            if (a5Var6 == null) {
                cm.l.v("binding");
            } else {
                a5Var2 = a5Var6;
            }
            a5Var2.f25194z.setText(Html.fromHtml("I have read and agree to " + "<font color=\"#008ed8\"><b><u>VID based e-KYC consent</u></b></font>"));
            learnerLicenceAadharScreen.T = "V";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: ld.c} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [ni.a5] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [ni.a5] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [ni.a5] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c3, code lost:
        if (r1 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0213, code lost:
        if (r1 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x025f, code lost:
        if (r1 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x039c, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03fe, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0170, code lost:
        if (r1 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0172, code lost:
        cm.l.v("session");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0176, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0177, code lost:
        r1 = r3.b(r7, r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j2(com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen r21, android.view.View r22) {
        /*
            r0 = r21
            java.lang.String r1 = "this$0"
            cm.l.f(r0, r1)
            ni.a5 r1 = r0.G
            java.lang.String r2 = "binding"
            r3 = 0
            if (r1 != 0) goto L_0x0012
            cm.l.v(r2)
            r1 = r3
        L_0x0012:
            android.widget.TextView r1 = r1.C
            java.lang.CharSequence r1 = r1.getText()
            ld.c r4 = r0.I
            java.lang.String r5 = "session"
            if (r4 != 0) goto L_0x0022
            cm.l.v(r5)
            r4 = r3
        L_0x0022:
            r6 = 2132018098(0x7f1403b2, float:1.9674493E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r7 = "btn_dl_serv_gen_otp"
            java.lang.String r4 = r4.b(r7, r6)
            boolean r1 = r1.equals(r4)
            r4 = 2132018801(0x7f140671, float:1.9675919E38)
            java.lang.String r6 = "select_rto"
            java.lang.String r7 = "0"
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x03a0
            java.lang.String r1 = r0.N
            boolean r1 = cm.l.a(r1, r8)
            if (r1 != 0) goto L_0x039a
            java.lang.String r1 = r0.N
            boolean r1 = km.p.o(r1, r7, r9)
            if (r1 == 0) goto L_0x0052
            goto L_0x039a
        L_0x0052:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x005a
            cm.l.v(r2)
            r1 = r3
        L_0x005a:
            android.widget.LinearLayout r1 = r1.D
            int r1 = r1.getVisibility()
            r4 = 2132017854(0x7f1402be, float:1.9673998E38)
            java.lang.String r6 = "edit_dl_serv_mob_no"
            if (r1 != 0) goto L_0x0099
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x006f
            cm.l.v(r2)
            r1 = r3
        L_0x006f:
            androidx.appcompat.widget.AppCompatEditText r1 = r1.F
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0099
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0087
        L_0x0083:
            cm.l.v(r5)
            goto L_0x0088
        L_0x0087:
            r3 = r1
        L_0x0088:
            java.lang.String r1 = r0.getString(r4)
            java.lang.String r1 = r3.b(r6, r1)
        L_0x0090:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r10)
            r0.show()
            goto L_0x0402
        L_0x0099:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x00a1
            cm.l.v(r2)
            r1 = r3
        L_0x00a1:
            android.widget.LinearLayout r1 = r1.D
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00c8
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x00b1
            cm.l.v(r2)
            r1 = r3
        L_0x00b1:
            androidx.appcompat.widget.AppCompatEditText r1 = r1.F
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r1 = r1.length()
            r7 = 9
            if (r1 >= r7) goto L_0x00c8
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0087
            goto L_0x0083
        L_0x00c8:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x00d0
            cm.l.v(r2)
            r1 = r3
        L_0x00d0:
            android.widget.LinearLayout r1 = r1.f25191w
            int r1 = r1.getVisibility()
            java.lang.String r4 = "getText(...)"
            if (r1 != 0) goto L_0x0124
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x00e2
            cm.l.v(r2)
            r1 = r3
        L_0x00e2:
            android.widget.EditText r1 = r1.B
            android.text.Editable r1 = r1.getText()
            cm.l.e(r1, r4)
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0124
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x00f9
            cm.l.v(r2)
            r1 = r3
        L_0x00f9:
            android.widget.RadioButton r1 = r1.f25193y
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0124
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0109
            cm.l.v(r2)
            r1 = r3
        L_0x0109:
            android.widget.RadioButton r1 = r1.f25193y
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0124
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0119
            cm.l.v(r5)
            goto L_0x011a
        L_0x0119:
            r3 = r1
        L_0x011a:
            java.lang.String r1 = "aadhar_number_error_msg"
            java.lang.String r2 = "Please enter aadhaar number"
        L_0x011e:
            java.lang.String r1 = r3.b(r1, r2)
            goto L_0x0090
        L_0x0124:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x012c
            cm.l.v(r2)
            r1 = r3
        L_0x012c:
            android.widget.LinearLayout r1 = r1.f25191w
            int r1 = r1.getVisibility()
            java.lang.String r6 = "Please enter the valid Aadhaar Number"
            java.lang.String r7 = "valid_aadhaar_no"
            r8 = 12
            if (r1 != 0) goto L_0x017d
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0142
            cm.l.v(r2)
            r1 = r3
        L_0x0142:
            android.widget.EditText r1 = r1.B
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 >= r8) goto L_0x017d
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0156
            cm.l.v(r2)
            r1 = r3
        L_0x0156:
            android.widget.RadioButton r1 = r1.f25193y
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x017d
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0166
            cm.l.v(r2)
            r1 = r3
        L_0x0166:
            android.widget.RadioButton r1 = r1.f25193y
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x017d
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0176
        L_0x0172:
            cm.l.v(r5)
            goto L_0x0177
        L_0x0176:
            r3 = r1
        L_0x0177:
            java.lang.String r1 = r3.b(r7, r6)
            goto L_0x0090
        L_0x017d:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0185
            cm.l.v(r2)
            r1 = r3
        L_0x0185:
            android.widget.LinearLayout r1 = r1.f25191w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x01c6
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0195
            cm.l.v(r2)
            r1 = r3
        L_0x0195:
            android.widget.EditText r1 = r1.B
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 <= r8) goto L_0x01c6
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x01a9
            cm.l.v(r2)
            r1 = r3
        L_0x01a9:
            android.widget.RadioButton r1 = r1.f25193y
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x01c6
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x01b9
            cm.l.v(r2)
            r1 = r3
        L_0x01b9:
            android.widget.RadioButton r1 = r1.f25193y
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x01c6
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0176
            goto L_0x0172
        L_0x01c6:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x01ce
            cm.l.v(r2)
            r1 = r3
        L_0x01ce:
            android.widget.LinearLayout r1 = r1.f25191w
            int r1 = r1.getVisibility()
            java.lang.String r6 = "Please enter the Virtual Id"
            java.lang.String r7 = "enter_virtual_id"
            if (r1 != 0) goto L_0x0217
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x01e2
            cm.l.v(r2)
            r1 = r3
        L_0x01e2:
            android.widget.EditText r1 = r1.B
            android.text.Editable r1 = r1.getText()
            cm.l.e(r1, r4)
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0217
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x01f9
            cm.l.v(r2)
            r1 = r3
        L_0x01f9:
            android.widget.RadioButton r1 = r1.O
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0217
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0209
            cm.l.v(r2)
            r1 = r3
        L_0x0209:
            android.widget.RadioButton r1 = r1.O
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0217
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0176
            goto L_0x0172
        L_0x0217:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x021f
            cm.l.v(r2)
            r1 = r3
        L_0x021f:
            android.widget.LinearLayout r1 = r1.f25191w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0263
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x022f
            cm.l.v(r2)
            r1 = r3
        L_0x022f:
            android.widget.EditText r1 = r1.B
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            r4 = 16
            if (r1 >= r4) goto L_0x0263
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0245
            cm.l.v(r2)
            r1 = r3
        L_0x0245:
            android.widget.RadioButton r1 = r1.O
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0263
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x0255
            cm.l.v(r2)
            r1 = r3
        L_0x0255:
            android.widget.RadioButton r1 = r1.O
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0263
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0176
            goto L_0x0172
        L_0x0263:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x026b
            cm.l.v(r2)
            r1 = r3
        L_0x026b:
            android.widget.LinearLayout r1 = r1.f25191w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x02b2
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x027b
            cm.l.v(r2)
            r1 = r3
        L_0x027b:
            android.widget.CheckBox r1 = r1.A
            boolean r1 = r1.isChecked()
            if (r1 != 0) goto L_0x02b2
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x028b
            cm.l.v(r2)
            r1 = r3
        L_0x028b:
            android.widget.RadioButton r1 = r1.O
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x02b2
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x029b
            cm.l.v(r2)
            r1 = r3
        L_0x029b:
            android.widget.RadioButton r1 = r1.O
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x02b2
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x02ab
            cm.l.v(r5)
            goto L_0x02ac
        L_0x02ab:
            r3 = r1
        L_0x02ac:
            java.lang.String r1 = "agree_with_kyc"
            java.lang.String r2 = "Please agree with VID based e-KYC consent"
            goto L_0x011e
        L_0x02b2:
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x02ba
            cm.l.v(r2)
            r1 = r3
        L_0x02ba:
            android.widget.LinearLayout r1 = r1.f25191w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0301
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x02ca
            cm.l.v(r2)
            r1 = r3
        L_0x02ca:
            android.widget.CheckBox r1 = r1.A
            boolean r1 = r1.isChecked()
            if (r1 != 0) goto L_0x0301
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x02da
            cm.l.v(r2)
            r1 = r3
        L_0x02da:
            android.widget.RadioButton r1 = r1.f25193y
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0301
            ni.a5 r1 = r0.G
            if (r1 != 0) goto L_0x02ea
            cm.l.v(r2)
            r1 = r3
        L_0x02ea:
            android.widget.RadioButton r1 = r1.f25193y
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0301
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x02fa
            cm.l.v(r5)
            goto L_0x02fb
        L_0x02fa:
            r3 = r1
        L_0x02fb:
            java.lang.String r1 = "agree_with_adhar_bases_kyc"
            java.lang.String r2 = "Please agree with Aadhaar based e-KYC consent"
            goto L_0x011e
        L_0x0301:
            int r1 = r0.S
            java.lang.String r4 = "pDialog"
            if (r1 != r9) goto L_0x0336
            android.app.ProgressDialog r1 = r0.H
            if (r1 != 0) goto L_0x030f
            cm.l.v(r4)
            r1 = r3
        L_0x030f:
            r1.show()
            ba.b r1 = r21.P1()
            ni.a5 r4 = r0.G
            if (r4 != 0) goto L_0x031e
            cm.l.v(r2)
            goto L_0x031f
        L_0x031e:
            r3 = r4
        L_0x031f:
            androidx.appcompat.widget.AppCompatEditText r2 = r3.F
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            ld.g r3 = r21.a2()
            java.lang.String r3 = r3.k()
            r1.F(r0, r2, r3)
            goto L_0x0402
        L_0x0336:
            android.app.ProgressDialog r1 = r0.H
            if (r1 != 0) goto L_0x033e
            cm.l.v(r4)
            r1 = r3
        L_0x033e:
            r1.show()
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r4 = 1410065407(0x540be3ff, float:2.40330238E12)
            int r1 = r1.nextInt(r4)
            ni.a5 r4 = r0.G
            if (r4 != 0) goto L_0x0355
            cm.l.v(r2)
            goto L_0x0356
        L_0x0355:
            r3 = r4
        L_0x0356:
            android.widget.EditText r2 = r3.B
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = km.q.B0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            java.lang.String r4 = "forName(charsetName)"
            cm.l.e(r3, r4)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            cm.l.e(r2, r3)
            java.lang.String r12 = android.util.Base64.encodeToString(r2, r10)
            ea.a r11 = r21.T1()
            cm.l.c(r12)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1
            java.lang.String r17 = java.lang.String.valueOf(r1)
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            r20 = 0
            r11.g(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0402
        L_0x039a:
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0087
            goto L_0x0083
        L_0x03a0:
            java.lang.String r1 = r0.N
            boolean r1 = cm.l.a(r1, r8)
            if (r1 != 0) goto L_0x03fc
            java.lang.String r1 = r0.N
            boolean r1 = km.p.o(r1, r7, r9)
            if (r1 == 0) goto L_0x03b1
            goto L_0x03fc
        L_0x03b1:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen> r4 = com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen.class
            r1.<init>(r0, r4)
            ld.f r4 = r21.Y1()
            java.lang.String r4 = r4.l()
            java.lang.String r5 = "stateCd"
            r1.putExtra(r5, r4)
            java.lang.String r4 = "rtoCd"
            java.lang.String r5 = r0.N
            r1.putExtra(r4, r5)
            java.lang.String r4 = "rtoName"
            java.lang.String r5 = r0.O
            r1.putExtra(r4, r5)
            ni.a5 r4 = r0.G
            if (r4 != 0) goto L_0x03db
            cm.l.v(r2)
            goto L_0x03dc
        L_0x03db:
            r3 = r4
        L_0x03dc:
            androidx.appcompat.widget.AppCompatEditText r2 = r3.F
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.CharSequence r2 = km.q.B0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "inputMobileNo"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "dataFromAadhar"
            r1.putExtra(r2, r10)
            r0.startActivity(r1)
            goto L_0x0402
        L_0x03fc:
            ld.c r1 = r0.I
            if (r1 != 0) goto L_0x0087
            goto L_0x0083
        L_0x0402:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen.j2(com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void k2(LearnerLicenceAadharScreen learnerLicenceAadharScreen, View view) {
        cm.l.f(learnerLicenceAadharScreen, "this$0");
        a5 a5Var = learnerLicenceAadharScreen.G;
        if (a5Var == null) {
            cm.l.v("binding");
            a5Var = null;
        }
        a5Var.F.setText("");
    }

    /* access modifiers changed from: private */
    public final void l2(String str) {
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
        ld.c cVar = this.I;
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
        ld.c cVar3 = this.I;
        if (cVar3 == null) {
            cm.l.v("session");
            cVar3 = null;
        }
        textView3.setText(cVar3.b("nex_parivahan", "NextGen mParivahan"));
        ld.c cVar4 = this.I;
        if (cVar4 == null) {
            cm.l.v("session");
        } else {
            cVar2 = cVar4;
        }
        textView2.setText(cVar2.b("btn_ok", "OK"));
        textView2.setOnClickListener(new u1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void m2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void n2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ld.c cVar = this.I;
        ld.c cVar2 = null;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        textView2.setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        ld.c cVar3 = this.I;
        if (cVar3 == null) {
            cm.l.v("session");
        } else {
            cVar2 = cVar3;
        }
        textView.setText(cVar2.b("btn_ok", "OK"));
        textView.setOnClickListener(new b2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void o2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void q2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void A2(ca.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.V = cVar;
    }

    public final void B2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void C2(String str) {
        this.Q = str;
    }

    public final void D2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.L = dlServiceInt;
    }

    public final void E2(EkYCService ekYCService) {
        cm.l.f(ekYCService, "<set-?>");
        this.W = ekYCService;
    }

    public final void F2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void G2(int i10) {
        this.U = i10;
    }

    public final void H2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.P = gVar;
    }

    public final void I2(String str) {
        this.X = str;
    }

    public final void K2(Context context, String str) {
        Dialog dialog;
        ld.c cVar;
        Context context2 = context;
        String str2 = str;
        cm.l.f(context2, "context");
        cm.l.f(str2, "mobile_no");
        Dialog dialog2 = new Dialog(context2);
        dialog2.setContentView(R.layout.validateotp);
        dialog2.setCanceledOnTouchOutside(false);
        dialog2.setCancelable(false);
        Window window = dialog2.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog2.findViewById(R.id.resendOtp);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog2.findViewById(R.id.showmpin);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById2;
        View findViewById3 = dialog2.findViewById(R.id.submitOtp);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog2.findViewById(R.id.enterOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById4;
        View findViewById5 = dialog2.findViewById(R.id.time_text);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById5;
        View findViewById6 = dialog2.findViewById(R.id.txt_reset);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById6;
        View findViewById7 = dialog2.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById7;
        View findViewById8 = dialog2.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById8).setOnClickListener(new l1(dialog2));
        try {
            StringBuilder sb2 = new StringBuilder();
            ld.c cVar2 = this.I;
            if (cVar2 == null) {
                cm.l.v("session");
                dialog = dialog2;
                cVar2 = null;
            } else {
                dialog = dialog2;
            }
            try {
                sb2.append(cVar2.b("aadhar_otp_register_mobile_no", context2.getString(R.string.aadhaar_otp_sent_registe)));
                sb2.append("\n\n+91-XXXXXX");
                sb2.append(str2);
                textView5.setText(sb2.toString());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            dialog = dialog2;
            ld.c cVar3 = this.I;
            if (cVar3 == null) {
                cm.l.v("session");
                cVar = null;
            } else {
                cVar = cVar3;
            }
            textView5.setText(cVar.b("aadhar_otp_register_mobile_no", context2.getString(R.string.aadhaar_otp_sent_registe)));
            new n(textView3, textView).start();
            imageView.setOnClickListener(new w1(editText, imageView));
            textView.setOnClickListener(new y1(this, textView3, textView));
            textView2.setOnClickListener(new z1(editText, this, textView4));
            dialog.show();
        }
        new n(textView3, textView).start();
        imageView.setOnClickListener(new w1(editText, imageView));
        textView.setOnClickListener(new y1(this, textView3, textView));
        textView2.setOnClickListener(new z1(editText, this, textView4));
        dialog.show();
    }

    public final String M1(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            cm.l.c(str);
            Date parse = simpleDateFormat.parse(str);
            cm.l.c(parse);
            return simpleDateFormat2.format(parse);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final Aadarkyc.DOEkyc N1() {
        Aadarkyc.DOEkyc dOEkyc = this.f21744f0;
        if (dOEkyc != null) {
            return dOEkyc;
        }
        cm.l.v("aadhaarData");
        return null;
    }

    public final String O1() {
        return this.f21745g0;
    }

    public final ba.b P1() {
        ba.b bVar = this.J;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final AadharInterface Q1() {
        AadharInterface aadharInterface = this.f21741c0;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        cm.l.v("mAadharInterface");
        return null;
    }

    public final void Q2(Context context, String str) {
        ld.c cVar;
        String b10;
        Context context2 = context;
        String str2 = str;
        cm.l.f(context2, "context");
        cm.l.f(str2, "mobile_no");
        Dialog dialog = new Dialog(context2);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.resendOtp);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.showmpin);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.submitOtp);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.disPlay);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) findViewById9;
        View findViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) findViewById10;
        ld.c cVar2 = this.I;
        if (cVar2 == null) {
            cm.l.v("session");
            cVar2 = null;
        }
        ImageView imageView3 = imageView;
        textView6.setText(cVar2.b("otp_verification", getString(R.string.otp_verification)));
        ld.c cVar3 = this.I;
        if (cVar3 == null) {
            cm.l.v("session");
            cVar3 = null;
        }
        textView2.setText(cVar3.b("vahan_btn_submit", getString(R.string.submit)));
        ld.c cVar4 = this.I;
        if (cVar4 == null) {
            cm.l.v("session");
            cVar4 = null;
        }
        textView4.setText(cVar4.b("btn_reset", getString(R.string.reset)));
        ld.c cVar5 = this.I;
        if (cVar5 == null) {
            cm.l.v("session");
            cVar5 = null;
        }
        textView.setText(cVar5.b("label_resend_otp", getString(R.string.resend_otp)));
        ld.c cVar6 = this.I;
        if (cVar6 == null) {
            cm.l.v("session");
            cVar6 = null;
        }
        editText.setHint(cVar6.b("edit_enter_otp", getString(R.string.enter_otp)));
        ld.c cVar7 = this.I;
        if (cVar7 == null) {
            cm.l.v("session");
            cVar7 = null;
        }
        textView7.setText(cVar7.b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                ld.c cVar8 = this.I;
                if (cVar8 == null) {
                    cm.l.v("session");
                    cVar8 = null;
                }
                sb2.append(cVar8.b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str2.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                ld.c cVar9 = this.I;
                if (cVar9 == null) {
                    cm.l.v("session");
                    cVar9 = null;
                }
                b10 = cVar9.b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView5.setText(b10);
        } catch (Exception unused) {
            ld.c cVar10 = this.I;
            if (cVar10 == null) {
                cm.l.v("session");
                cVar = null;
            } else {
                cVar = cVar10;
            }
            textView5.setText(cVar.b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new p(textView3, this, textView).start();
        imageView2.setOnClickListener(new p1(editText, imageView2));
        textView.setOnClickListener(new q1(this, textView3, textView));
        textView2.setOnClickListener(new r1(this, editText));
        textView4.setOnClickListener(new s1(editText));
        imageView3.setOnClickListener(new t1(dialog));
        dialog.show();
    }

    public final AdrInterface R1() {
        AdrInterface adrInterface = this.f21743e0;
        if (adrInterface != null) {
            return adrInterface;
        }
        cm.l.v("mAadharInterface2");
        return null;
    }

    public final da.c S1() {
        da.c cVar = this.f21740b0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mAadharViewModel");
        return null;
    }

    public final ea.a T1() {
        ea.a aVar = this.f21742d0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mAadharViewModel2");
        return null;
    }

    public final ArrayList U1() {
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mRtosMaster");
        return null;
    }

    public final DlServiceInt V1() {
        DlServiceInt dlServiceInt = this.L;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final EkYCService W1() {
        EkYCService ekYCService = this.W;
        if (ekYCService != null) {
            return ekYCService;
        }
        cm.l.v("retrofitService_one");
        return null;
    }

    public final ld.f Y1() {
        ld.f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final int Z1() {
        return this.U;
    }

    public final ld.g a2() {
        ld.g gVar = this.P;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final String b2() {
        return this.X;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a5 x10 = a5.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        SharedPreferences sharedPreferences = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = v9.e.f17509a;
        a5 a5Var = this.G;
        if (a5Var == null) {
            cm.l.v("binding");
            a5Var = null;
        }
        aVar.Z0(this, a5Var);
        SharedPreferences sharedPreferences2 = getSharedPreferences("AddLLVehicleClass", 0);
        cm.l.e(sharedPreferences2, "getSharedPreferences(...)");
        this.R = sharedPreferences2;
        if (sharedPreferences2 == null) {
            cm.l.v("pref");
        } else {
            sharedPreferences = sharedPreferences2;
        }
        sharedPreferences.edit().clear().apply();
        c2();
        P1().y().g(this, new m(new d(this)));
        P1().A().g(this, new m(new e(this)));
        S1().j().g(this, new m(new f(this)));
        S1().i().g(this, new m(new g(this)));
        P1().u().g(this, new m(new h(this)));
        P1().E().g(this, new m(new i(this)));
        T1().h().g(this, new m(new j(this)));
        T1().j().g(this, new m(new k(this)));
        T1().i().g(this, new m(new l(this)));
        S1().l().g(this, new m(new b(this)));
        S1().h().g(this, new m(new c(this)));
    }

    public final void p2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new a2(dialog));
        dialog.show();
    }

    public final void r2(Aadarkyc.DOEkyc dOEkyc) {
        cm.l.f(dOEkyc, "<set-?>");
        this.f21744f0 = dOEkyc;
    }

    public final void s2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21745g0 = str;
    }

    public final void t2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void u2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.J = bVar;
    }

    public final void v2(AadharInterface aadharInterface) {
        cm.l.f(aadharInterface, "<set-?>");
        this.f21741c0 = aadharInterface;
    }

    public final void w2(AdrInterface adrInterface) {
        cm.l.f(adrInterface, "<set-?>");
        this.f21743e0 = adrInterface;
    }

    public final void x2(da.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21740b0 = cVar;
    }

    public final void y2(ea.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f21742d0 = aVar;
    }

    public final void z2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.M = arrayList;
    }
}
