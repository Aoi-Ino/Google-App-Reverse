package com.nic.mparivahan.Account.View;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.u;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.Model.UserLoginModel;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.RCDownloadService.RCDownloads;
import com.nic.mparivahan.Dashboard.RCDownloadService.SaveVirtualRCService;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MparCitizenDocInfo;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import ka.c;
import m.q;
import ni.fc;
import pl.x;
import r8.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import u8.l0;
import u8.m0;
import u8.n0;
import u8.o0;
import u8.p0;
import u8.q0;
import u8.r0;
import u8.s0;
import u8.t0;
import u8.v0;
import u8.w0;
import um.c0;
import v9.d;
import v9.e;
import xa.a;

public final class SignInScreen extends androidx.appcompat.app.d {
    public v8.h G;
    public v8.f H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public LinearLayout M;
    public EditText N;
    public LinearLayout O;
    public EditText P;
    public ProgressDialog Q;
    public ImageView R;
    public ImageView S;
    private boolean T;
    public ld.g U;
    private fc V;
    public ld.c W;
    private SignService X;
    private int Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private m.q f7678a0;

    /* renamed from: b0  reason: collision with root package name */
    private Executor f7679b0;

    /* renamed from: c0  reason: collision with root package name */
    private q.a f7680c0;

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f7681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f7682b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7683c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f7684d;

        a(u uVar, Context context, String str, String str2) {
            this.f7681a = uVar;
            this.f7682b = context;
            this.f7683c = str;
            this.f7684d = str2;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            new DatabaseHelper(this.f7682b).N0(this.f7684d, (DldetobjX) null, this.f7683c, (String) null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str = (String) this.f7681a.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str2 = (String) this.f7681a.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str2, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DLWithoutdobModel.class);
                cm.l.e(j10, "fromJson(...)");
                DLWithoutdobModel dLWithoutdobModel = (DLWithoutdobModel) j10;
                if (!ka.c.f13158a.m(dLWithoutdobModel.getDlobj().getDlLicno())) {
                    DatabaseHelper databaseHelper = new DatabaseHelper(this.f7682b);
                    String obj = q.B0(dLWithoutdobModel.getDlobj().getDlLicno()).toString();
                    String str3 = this.f7683c;
                    BioObj bioObj = dLWithoutdobModel.getBioObj();
                    databaseHelper.N0(obj, (DldetobjX) null, str3, bioObj != null ? bioObj.getBioDob() : null);
                    return;
                }
                new DatabaseHelper(this.f7682b).N0(this.f7684d, (DldetobjX) null, this.f7683c, (String) null);
            } catch (Exception e10) {
                e10.printStackTrace();
                new DatabaseHelper(this.f7682b).N0(this.f7684d, (DldetobjX) null, this.f7683c, (String) null);
            }
        }
    }

    public static final class b extends q.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7685a;

        b(SignInScreen signInScreen) {
            this.f7685a = signInScreen;
        }

        public void a(int i10, CharSequence charSequence) {
            cm.l.f(charSequence, "errString");
            super.a(i10, charSequence);
        }

        public void b() {
            super.b();
        }

        public void c(q.b bVar) {
            cm.l.f(bVar, "result");
            super.c(bVar);
            if (!new ld.g(this.f7685a).t()) {
                return;
            }
            if (com.nic.mparivahan.a.f9624a.a(this.f7685a)) {
                this.f7685a.H1().show();
                this.f7685a.P1().p(this.f7685a);
                return;
            }
            this.f7685a.startActivity(this.f7685a.C1() == 1 ? new Intent(this.f7685a, SearchChallanOnlineActivity.class) : new Intent(this.f7685a, DashBoard.class));
            this.f7685a.finish();
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7686e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SignInScreen signInScreen) {
            super(1);
            this.f7686e = signInScreen;
        }

        public final void b(String str) {
            this.f7686e.H1().dismiss();
            ld.d.f13490a.a(this.f7686e);
            Toast.makeText(this.f7686e.getApplicationContext(), this.f7686e.E1().b("service_is_not_present", this.f7686e.getString(R.string.unable_to_get_details)), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7687e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SignInScreen signInScreen) {
            super(1);
            this.f7687e = signInScreen;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            try {
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    this.f7687e.O1().A(this.f7687e.F1().getText().toString().toString());
                } else if (p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    this.f7687e.H1().dismiss();
                    if (p.o(getCitizenDetails.getStatusDesc(), "No Record(s) Found.", true)) {
                        SignInScreen signInScreen = this.f7687e;
                        String b10 = signInScreen.E1().b("label_login_not_regt", this.f7687e.getApplicationContext().getString(R.string.mobile_number_not_registered));
                        cm.l.c(b10);
                        signInScreen.r1(signInScreen, b10);
                        return;
                    }
                    SignInScreen signInScreen2 = this.f7687e;
                    signInScreen2.r1(signInScreen2, getCitizenDetails.getStatusDesc().toString());
                } else {
                    this.f7687e.H1().dismiss();
                    Toast.makeText(this.f7687e.getApplicationContext(), this.f7687e.E1().b("service_is_not_present", this.f7687e.getString(R.string.unable_to_get_details)), 1).show();
                }
            } catch (Exception e10) {
                this.f7687e.H1().dismiss();
                e10.printStackTrace();
                ld.d.f13490a.a(this.f7687e);
                Toast.makeText(this.f7687e.getApplicationContext(), this.f7687e.E1().b("service_is_not_present", this.f7687e.getString(R.string.unable_to_get_details)), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7688e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SignInScreen signInScreen) {
            super(1);
            this.f7688e = signInScreen;
        }

        public final void b(String str) {
            this.f7688e.H1().dismiss();
            if (str.toString().equals(v9.d.f17494a.u())) {
                ld.d.f13490a.a(this.f7688e);
            } else {
                Toast.makeText(this.f7688e.getApplicationContext(), this.f7688e.E1().b("service_is_not_present", this.f7688e.getString(R.string.unable_to_get_details)), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7689e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SignInScreen signInScreen) {
            super(1);
            this.f7689e = signInScreen;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            try {
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    this.f7689e.H1().dismiss();
                    if (!this.f7689e.J1().t()) {
                        SignInScreen signInScreen = this.f7689e;
                        String b10 = signInScreen.E1().b("label_log_set_mpin", "You haven't set the MPIN yet, Please request for new MPIN using 'Forgot security MPIN'");
                        cm.l.c(b10);
                        signInScreen.t1(signInScreen, b10);
                    }
                } else if (p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    this.f7689e.H1().dismiss();
                    if (p.o(getCitizenDetails.getStatusDesc(), "No Record(s) Found.", true)) {
                        SignInScreen signInScreen2 = this.f7689e;
                        String b11 = signInScreen2.E1().b("label_login_not_regt", this.f7689e.getApplicationContext().getString(R.string.mobile_number_not_registered));
                        cm.l.c(b11);
                        signInScreen2.r1(signInScreen2, b11);
                        return;
                    }
                    SignInScreen signInScreen3 = this.f7689e;
                    signInScreen3.r1(signInScreen3, getCitizenDetails.getStatusDesc().toString());
                } else {
                    this.f7689e.H1().dismiss();
                    Toast.makeText(this.f7689e.getApplicationContext(), this.f7689e.E1().b("service_is_not_present", this.f7689e.getString(R.string.unable_to_get_details)), 1).show();
                }
            } catch (Exception e10) {
                this.f7689e.H1().dismiss();
                e10.printStackTrace();
                Toast.makeText(this.f7689e.getApplicationContext(), this.f7689e.E1().b("service_is_not_present", this.f7689e.getString(R.string.unable_to_get_details)), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7690e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SignInScreen signInScreen) {
            super(1);
            this.f7690e = signInScreen;
        }

        public final void b(String str) {
            this.f7690e.H1().dismiss();
            Toast.makeText(this.f7690e.getApplicationContext(), this.f7690e.E1().b("service_is_not_present", this.f7690e.getString(R.string.unable_to_get_details)), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7691e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SignInScreen signInScreen) {
            super(1);
            this.f7691e = signInScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            ld.c E1;
            String str;
            String str2;
            try {
                this.f7691e.H1().dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(this.f7691e, ForgotMpinScreen.class);
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    intent.putExtra("MobileNumber", this.f7691e.F1().getText().toString());
                    intent.putExtra("RecreateFlag", 0);
                    if (this.f7691e.D1()) {
                        E1 = this.f7691e.E1();
                        str = "generate";
                        str2 = "Generate";
                    } else {
                        E1 = this.f7691e.E1();
                        str = "title_forgot";
                        str2 = "Forgot";
                    }
                    intent.putExtra("title", E1.b(str, str2));
                    this.f7691e.startActivity(intent);
                } else if (!ka.c.f13158a.m(sendOtpResult.getStatusDesc())) {
                    SignInScreen signInScreen = this.f7691e;
                    signInScreen.Y1(signInScreen, sendOtpResult.getStatusDesc());
                } else {
                    Toast.makeText(this.f7691e.getApplicationContext(), this.f7691e.E1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                }
            } catch (Exception unused) {
                Toast.makeText(this.f7691e.getApplicationContext(), this.f7691e.E1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7692e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SignInScreen signInScreen) {
            super(1);
            this.f7692e = signInScreen;
        }

        public final void b(String str) {
            this.f7692e.H1().dismiss();
            SignInScreen signInScreen = this.f7692e;
            signInScreen.Y1(signInScreen, signInScreen.E1().b(v9.f.f17510a.M0(), "Unable to reset the MPIN, Please try after sometime."));
            if (com.nic.mparivahan.a.f9624a.a(this.f7692e)) {
                ld.d.f13490a.a(this.f7692e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7693e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SignInScreen signInScreen) {
            super(1);
            this.f7693e = signInScreen;
        }

        public final void b(GetCitizenDetails getCitizenDetails) {
            c.a aVar;
            SignInScreen signInScreen;
            String statusDesc;
            try {
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    this.f7693e.O1().B(this.f7693e.F1().getText().toString());
                    return;
                }
                if (p.o(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    this.f7693e.H1().dismiss();
                    if (p.o(getCitizenDetails.getStatusDesc(), "No Record(s) Found.", true)) {
                        c.a aVar2 = t8.c.f16582a;
                        SignInScreen signInScreen2 = this.f7693e;
                        String b10 = signInScreen2.E1().b("label_login_not_regt", this.f7693e.getApplicationContext().getString(R.string.mobile_number_not_registered));
                        cm.l.c(b10);
                        aVar2.c(signInScreen2, b10);
                        return;
                    }
                    aVar = t8.c.f16582a;
                    signInScreen = this.f7693e;
                    statusDesc = getCitizenDetails.getStatusDesc();
                } else {
                    this.f7693e.H1().dismiss();
                    if (!ka.c.f13158a.m(getCitizenDetails.getStatusDesc().toString())) {
                        aVar = t8.c.f16582a;
                        signInScreen = this.f7693e;
                        statusDesc = getCitizenDetails.getStatusDesc();
                    } else {
                        Toast.makeText(this.f7693e.getApplicationContext(), this.f7693e.E1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                        return;
                    }
                }
                aVar.c(signInScreen, statusDesc.toString());
            } catch (Exception unused) {
                this.f7693e.H1().dismiss();
                Toast.makeText(this.f7693e.getApplicationContext(), this.f7693e.E1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetCitizenDetails) obj);
            return x.f30437a;
        }
    }

    static final class k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7694e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SignInScreen signInScreen) {
            super(1);
            this.f7694e = signInScreen;
        }

        public final void b(String str) {
            this.f7694e.H1().dismiss();
            if (com.nic.mparivahan.a.f9624a.a(this.f7694e)) {
                ld.d.f13490a.a(this.f7694e);
            }
            Toast.makeText(this.f7694e.getApplicationContext(), this.f7694e.E1().b(v9.f.f17510a.M0(), "Unable to change/reset the MPIN, Please try after sometime."), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class l implements ActionMode.Callback {
        l() {
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    static final class m extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7695e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SignInScreen signInScreen) {
            super(1);
            this.f7695e = signInScreen;
        }

        public final void b(GetVirtualDocDetails getVirtualDocDetails) {
            Intent intent;
            Intent intent2;
            this.f7695e.H1().dismiss();
            Class<DashBoard> cls = DashBoard.class;
            Class<SearchChallanOnlineActivity> cls2 = SearchChallanOnlineActivity.class;
            if (p.o(getVirtualDocDetails.getStatusCode(), "VTLD005", true)) {
                this.f7695e.H1().dismiss();
                if (this.f7695e.C1() == 1) {
                    intent2 = new Intent(this.f7695e, cls2);
                } else {
                    intent = new Intent(this.f7695e, cls);
                    this.f7695e.startActivity(intent);
                    this.f7695e.finishAffinity();
                    return;
                }
            } else if (p.o(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
                if (getVirtualDocDetails.getMparCitizenDocInfo().size() > 12) {
                    try {
                        SignInScreen signInScreen = this.f7695e;
                        cm.l.c(getVirtualDocDetails);
                        signInScreen.p2(getVirtualDocDetails);
                    } catch (Exception unused) {
                    }
                } else {
                    SaveVirtualRCService.a aVar = SaveVirtualRCService.f8394k;
                    SignInScreen signInScreen2 = this.f7695e;
                    cm.l.c(getVirtualDocDetails);
                    aVar.a(signInScreen2, getVirtualDocDetails);
                }
                this.f7695e.H1().dismiss();
                if (this.f7695e.C1() == 1) {
                    intent2 = new Intent(this.f7695e, cls2);
                } else {
                    intent = new Intent(this.f7695e, cls);
                    this.f7695e.startActivity(intent);
                    this.f7695e.finishAffinity();
                    return;
                }
            } else if (p.o(getVirtualDocDetails.getStatusCode(), "VTLD090", true)) {
                this.f7695e.H1().dismiss();
                SignInScreen signInScreen3 = this.f7695e;
                signInScreen3.Y1(signInScreen3, getVirtualDocDetails.getStatusDesc());
                return;
            } else {
                this.f7695e.H1().dismiss();
                if (this.f7695e.C1() == 1) {
                    intent2 = new Intent(this.f7695e, cls2);
                } else {
                    intent = new Intent(this.f7695e, cls);
                    this.f7695e.startActivity(intent);
                    this.f7695e.finishAffinity();
                    return;
                }
            }
            this.f7695e.startActivity(intent2);
            this.f7695e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetVirtualDocDetails) obj);
            return x.f30437a;
        }
    }

    static final class n extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7696e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(SignInScreen signInScreen) {
            super(1);
            this.f7696e = signInScreen;
        }

        public final void b(String str) {
            ld.d.f13490a.a(this.f7696e);
            this.f7696e.H1().dismiss();
            if (this.f7696e.C1() == 1) {
                this.f7696e.startActivity(new Intent(this.f7696e, SearchChallanOnlineActivity.class));
                this.f7696e.finish();
                return;
            }
            this.f7696e.startActivity(new Intent(this.f7696e, DashBoard.class));
            this.f7696e.finishAffinity();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class o extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7697e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(SignInScreen signInScreen) {
            super(1);
            this.f7697e = signInScreen;
        }

        public final void b(UserLoginModel userLoginModel) {
            SignInScreen signInScreen;
            Class<DashBoard> cls = DashBoard.class;
            try {
                if (p.p(userLoginModel.getStatusCode(), "CTZN001", false, 2, (Object) null)) {
                    new ld.a(this.f7697e);
                    new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                    if (!this.f7697e.P1().g(this.f7697e)) {
                        this.f7697e.P1().s(new ld.g(this.f7697e).k(), this.f7697e);
                        return;
                    }
                    this.f7697e.H1().dismiss();
                    if (this.f7697e.C1() == 1) {
                        this.f7697e.startActivity(new Intent(this.f7697e, SearchChallanOnlineActivity.class));
                        this.f7697e.finish();
                        return;
                    }
                    this.f7697e.startActivity(new Intent(this.f7697e, cls));
                    this.f7697e.finishAffinity();
                    return;
                }
                if (p.p(userLoginModel.getStatusCode(), "CTZN091", false, 2, (Object) null)) {
                    this.f7697e.H1().dismiss();
                    signInScreen = this.f7697e;
                } else if (p.p(userLoginModel.getStatusCode(), "CTZN085", false, 2, (Object) null)) {
                    this.f7697e.H1().dismiss();
                    signInScreen = this.f7697e;
                } else if (p.p(userLoginModel.getStatusCode(), "CTZN086", false, 2, (Object) null)) {
                    this.f7697e.H1().dismiss();
                    signInScreen = this.f7697e;
                } else if (!ka.c.f13158a.m(userLoginModel.getStatusDesc())) {
                    this.f7697e.H1().dismiss();
                    signInScreen = this.f7697e;
                } else {
                    return;
                }
                signInScreen.Y1(signInScreen, userLoginModel.getStatusDesc());
            } catch (Exception unused) {
                this.f7697e.H1().show();
                this.f7697e.startActivity(new Intent(this.f7697e, cls));
                this.f7697e.finishAffinity();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UserLoginModel) obj);
            return x.f30437a;
        }
    }

    static final class p extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7698e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(SignInScreen signInScreen) {
            super(1);
            this.f7698e = signInScreen;
        }

        public final void b(String str) {
            this.f7698e.H1().show();
            this.f7698e.startActivity(new Intent(this.f7698e, DashBoard.class));
            this.f7698e.finishAffinity();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class q extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SignInScreen f7699e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(SignInScreen signInScreen) {
            super(1);
            this.f7699e = signInScreen;
        }

        public final void b(SendOtpResult sendOtpResult) {
            c.a aVar;
            SignInScreen signInScreen;
            try {
                this.f7699e.H1().dismiss();
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(this.f7699e, OtpVerificationforLoginScreen.class);
                    intent.putExtra("Param", sendOtpResult.getParam());
                    intent.putExtra(v9.d.f17494a.o(), this.f7699e.C1());
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    intent.putExtra("MobileNumber", this.f7699e.F1().getText().toString());
                    this.f7699e.startActivity(intent);
                    this.f7699e.finish();
                    return;
                }
                if (p.o(sendOtpResult.getStatusCode(), "AL022", true)) {
                    aVar = t8.c.f16582a;
                    signInScreen = this.f7699e;
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    aVar = t8.c.f16582a;
                    signInScreen = this.f7699e;
                } else {
                    (!ka.c.f13158a.m(sendOtpResult.getStatusDesc()) ? Toast.makeText(this.f7699e.getApplicationContext(), sendOtpResult.getStatusDesc(), 1) : Toast.makeText(this.f7699e.getApplicationContext(), "Unable to Sign In, Please try after sometime.", 1)).show();
                    return;
                }
                aVar.c(signInScreen, sendOtpResult.getStatusDesc());
            } catch (Exception unused) {
                Toast.makeText(this.f7699e.getApplicationContext(), this.f7699e.E1().b("service_is_not_present", this.f7699e.getString(R.string.unable_to_get_details)), 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class r implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7700a;

        r(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f7700a = lVar;
        }

        public final pl.c a() {
            return this.f7700a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7700a.invoke(obj);
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

    private final void G0() {
        Executor h10 = androidx.core.content.a.h(this);
        cm.l.e(h10, "getMainExecutor(...)");
        this.f7679b0 = h10;
        this.f7680c0 = new b(this);
        Executor executor = this.f7679b0;
        q.a aVar = null;
        if (executor == null) {
            cm.l.v("executor");
            executor = null;
        }
        q.a aVar2 = this.f7680c0;
        if (aVar2 == null) {
            cm.l.v("callBack");
        } else {
            aVar = aVar2;
        }
        this.f7678a0 = new m.q(this, executor, aVar);
    }

    /* access modifiers changed from: private */
    public static final void Q1(SignInScreen signInScreen, View view) {
        cm.l.f(signInScreen, "this$0");
        signInScreen.T = true;
        signInScreen.F1().setEnabled(true);
        signInScreen.F1().setClickable(true);
        signInScreen.F1().getText().clear();
        signInScreen.G1().getText().clear();
        signInScreen.N1().setVisibility(8);
        signInScreen.L1().setVisibility(0);
        fc fcVar = signInScreen.V;
        fc fcVar2 = null;
        if (fcVar == null) {
            cm.l.v("binding");
            fcVar = null;
        }
        fcVar.f26344e.setVisibility(8);
        fc fcVar3 = signInScreen.V;
        if (fcVar3 == null) {
            cm.l.v("binding");
            fcVar3 = null;
        }
        fcVar3.f26341b.setVisibility(8);
        fc fcVar4 = signInScreen.V;
        if (fcVar4 == null) {
            cm.l.v("binding");
        } else {
            fcVar2 = fcVar4;
        }
        fcVar2.f26355p.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void R1(SignInScreen signInScreen, View view) {
        cm.l.f(signInScreen, "this$0");
        signInScreen.finishAffinity();
        signInScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void S1(SignInScreen signInScreen, View view) {
        EditText G1;
        TransformationMethod instance;
        cm.l.f(signInScreen, "this$0");
        if (signInScreen.G1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            signInScreen.K1().setImageResource(R.drawable.pass_visible);
            G1 = signInScreen.G1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            signInScreen.K1().setImageResource(R.drawable.mvvm_visibility);
            G1 = signInScreen.G1();
            instance = PasswordTransformationMethod.getInstance();
        }
        G1.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void T1(SignInScreen signInScreen, View view) {
        cm.l.f(signInScreen, "this$0");
        try {
            signInScreen.v1();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(SignInScreen signInScreen, View view) {
        cm.l.f(signInScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(signInScreen)) {
            signInScreen.startActivity(new Intent(signInScreen, CreateAccountScreen.class));
            signInScreen.finish();
            return;
        }
        Toast.makeText(signInScreen, signInScreen.E1().b("label_log_check_internet", signInScreen.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void V1(SignInScreen signInScreen, View view) {
        Context applicationContext;
        ld.c E1;
        String str;
        String str2;
        String b10;
        cm.l.f(signInScreen, "this$0");
        signInScreen.Z = false;
        String obj = signInScreen.F1().getText().toString();
        if (obj == null || obj.length() == 0) {
            applicationContext = signInScreen.getApplicationContext();
            E1 = signInScreen.E1();
            str = "label_mb";
            str2 = "Please enter the mobile number";
            b10 = E1.b(str, str2);
        } else if (obj.length() < 10 || !t8.c.f16582a.q(obj)) {
            applicationContext = signInScreen.getApplicationContext();
            b10 = signInScreen.E1().b("lbl_enter_valid_number", "Please enter the valid mobile number");
        } else if (!com.nic.mparivahan.a.f9624a.a(signInScreen)) {
            applicationContext = signInScreen.getApplicationContext();
            E1 = signInScreen.E1();
            str = "label_log_check_internet";
            str2 = "Please check your internet";
            b10 = E1.b(str, str2);
        } else if (!signInScreen.J1().t() || !obj.equals(signInScreen.J1().l())) {
            signInScreen.H1().show();
            signInScreen.O1().h(obj);
            return;
        } else {
            signInScreen.H1().show();
            signInScreen.O1().B(signInScreen.J1().l());
            return;
        }
        Toast.makeText(applicationContext, b10, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void W1(SignInScreen signInScreen, View view) {
        Context applicationContext;
        String b10;
        cm.l.f(signInScreen, "this$0");
        ka.c.f13158a.l(signInScreen);
        String obj = signInScreen.F1().getText().toString();
        String obj2 = signInScreen.G1().getText().toString();
        ld.g gVar = new ld.g(signInScreen);
        if (obj == null || obj.length() == 0) {
            applicationContext = signInScreen.getApplicationContext();
            b10 = signInScreen.E1().b("label_mb", "Please enter the mobile number");
        } else if (obj.length() < 10 || !t8.c.f16582a.q(obj)) {
            applicationContext = signInScreen.getApplicationContext();
            b10 = signInScreen.E1().b("lbl_enter_valid_number", "Please enter the valid mobile number");
        } else if (obj2.length() == 0 || obj2.length() < 6) {
            applicationContext = signInScreen.getApplicationContext();
            b10 = signInScreen.E1().b("label_log_entr_six_mpin", "Please enter the 6 digit MPIN");
        } else if (!gVar.t()) {
            signInScreen.H1().show();
            signInScreen.O1().g(obj);
            return;
        } else if (!p.o(gVar.l(), obj, true) || !p.o(gVar.m(), obj2, true)) {
            String b11 = (!p.o(gVar.m(), "null", true) && (!gVar.t() || p.o(gVar.l(), obj, true))) ? signInScreen.E1().b("label_log_unbl_sign_mpin", "Unable to Signin With MPIN, Enter correct MPIN") : signInScreen.E1().b("label_log_set_mpin", "You haven't set the MPIN yet, Please request for new MPIN using 'Forgot security MPIN'");
            cm.l.c(b11);
            signInScreen.t1(signInScreen, b11);
            return;
        } else if (com.nic.mparivahan.a.f9624a.a(signInScreen)) {
            signInScreen.H1().show();
            signInScreen.P1().p(signInScreen);
            return;
        } else {
            signInScreen.startActivity(signInScreen.Y == 1 ? new Intent(signInScreen, SearchChallanOnlineActivity.class) : new Intent(signInScreen, DashBoard.class));
            signInScreen.finish();
            return;
        }
        Toast.makeText(applicationContext, b10, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void X1(SignInScreen signInScreen, View view) {
        Context applicationContext;
        ld.c E1;
        String str;
        String str2;
        String b10;
        cm.l.f(signInScreen, "this$0");
        signInScreen.Z = true;
        ka.c.f13158a.l(signInScreen);
        String obj = signInScreen.F1().getText().toString();
        if (obj == null || obj.length() == 0) {
            applicationContext = signInScreen.getApplicationContext();
            E1 = signInScreen.E1();
            str = "label_mb";
            str2 = "Please enter the mobile number";
            b10 = E1.b(str, str2);
        } else if (obj.length() < 10 || !t8.c.f16582a.q(obj)) {
            applicationContext = signInScreen.getApplicationContext();
            b10 = signInScreen.E1().b("lbl_enter_valid_number", "Please enter the valid mobile number");
        } else if (!com.nic.mparivahan.a.f9624a.a(signInScreen)) {
            applicationContext = signInScreen.getApplicationContext();
            E1 = signInScreen.E1();
            str = "label_log_check_internet";
            str2 = "Please check your internet connection";
            b10 = E1.b(str, str2);
        } else {
            signInScreen.H1().show();
            signInScreen.O1().h(obj);
            return;
        }
        Toast.makeText(applicationContext, b10, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s1(Dialog dialog, SignInScreen signInScreen, View view) {
        cm.l.f(dialog, "$dialog");
        cm.l.f(signInScreen, "this$0");
        dialog.dismiss();
        signInScreen.startActivity(new Intent(signInScreen, CreateAccountScreen.class));
        signInScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void u1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void v1() {
        q.d.a aVar = new q.d.a();
        aVar.d(getString(R.string.title_biometric_dialog));
        aVar.c(getString(R.string.text_description_biometrics_dialog));
        aVar.b(33023);
        q.d a10 = aVar.a();
        cm.l.e(a10, "build(...)");
        m.q qVar = this.f7678a0;
        if (qVar == null) {
            cm.l.v("biometricPrompt");
            qVar = null;
        }
        qVar.a(a10);
    }

    private final void w1() {
        String str = Build.MODEL;
        String str2 = Build.PRODUCT;
        if (str2 == null || (!cm.l.a(str2, "sdk") && !q.F(str2, "_sdk", false, 2, (Object) null) && !q.F(str2, "sdk_", false, 2, (Object) null))) {
            d.a aVar = v9.d.f17494a;
            if (aVar.A(this)) {
                aVar.e(this, getString(R.string.usbdebug));
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("It seems device is virtual, Please proceed with real device.").setCancelable(false).setPositiveButton("Okay", new w0(this));
        AlertDialog create = builder.create();
        create.setTitle("Information");
        create.show();
    }

    /* access modifiers changed from: private */
    public static final void x1(SignInScreen signInScreen, DialogInterface dialogInterface, int i10) {
        cm.l.f(signInScreen, "this$0");
        signInScreen.finish();
    }

    public final TextView A1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        cm.l.v("create_account");
        return null;
    }

    public final void B1(String str, String str2, Context context) {
        cm.l.f(str, "dl");
        cm.l.f(str2, "doc");
        cm.l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        DlService c10 = DlService.f8615a.c(context);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        cm.l.c(string);
        String jSONObject = aVar2.c(str, (String) null, context, string, gVar.l()).toString();
        cm.l.e(jSONObject, "toString(...)");
        c10.getDlDetailsWitoutDOB(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, context, str2, str));
    }

    public final int C1() {
        return this.Y;
    }

    public final boolean D1() {
        return this.Z;
    }

    public final ld.c E1() {
        ld.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final EditText F1() {
        EditText editText = this.N;
        if (editText != null) {
            return editText;
        }
        cm.l.v("mobile_number");
        return null;
    }

    public final EditText G1() {
        EditText editText = this.P;
        if (editText != null) {
            return editText;
        }
        cm.l.v("mpinEditText");
        return null;
    }

    public final ProgressDialog H1() {
        ProgressDialog progressDialog = this.Q;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final TextView I1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("redirectToforgotmpin");
        return null;
    }

    public final ld.g J1() {
        ld.g gVar = this.U;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final ImageView K1() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("showmpin");
        return null;
    }

    public final LinearLayout L1() {
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("signInWithOtp");
        return null;
    }

    public final LinearLayout M1() {
        LinearLayout linearLayout = this.O;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("signWithMpin");
        return null;
    }

    public final TextView N1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("user_name");
        return null;
    }

    public final v8.h O1() {
        v8.h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final v8.f P1() {
        v8.f fVar = this.H;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("viewModel1");
        return null;
    }

    public final void Y1(Context context, String str) {
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(E1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(E1().b("btn_ok", "OK"));
        textView.setOnClickListener(new m0(dialog));
        dialog.show();
    }

    public final void a2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.R = imageView;
    }

    public final void b2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void c2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void d2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.W = cVar;
    }

    public final void e2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.N = editText;
    }

    public final void f2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.P = editText;
    }

    public final void g2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.Q = progressDialog;
    }

    public final void h2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void i2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.U = gVar;
    }

    public final void j2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.S = imageView;
    }

    public final void k2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.M = linearLayout;
    }

    public final void l2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.O = linearLayout;
    }

    public final void m2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void n2(v8.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.G = hVar;
    }

    public final void o2(v8.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.H = fVar;
    }

    public void onBackPressed() {
        finishAffinity();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fc c10 = fc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.V = c10;
        SignService signService = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        fc fcVar = this.V;
        if (fcVar == null) {
            cm.l.v("binding");
            fcVar = null;
        }
        aVar.O1(this, fcVar);
        getWindow().addFlags(128);
        d2(new ld.c(this));
        w1();
        View findViewById = findViewById(R.id.sign_up_text);
        cm.l.e(findViewById, "findViewById(...)");
        c2((TextView) findViewById);
        View findViewById2 = findViewById(R.id.forgotmpin);
        cm.l.e(findViewById2, "findViewById(...)");
        h2((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.signInWithOtp);
        cm.l.e(findViewById3, "findViewById(...)");
        k2((LinearLayout) findViewById3);
        View findViewById4 = findViewById(R.id.mobile_number);
        cm.l.e(findViewById4, "findViewById(...)");
        e2((EditText) findViewById4);
        View findViewById5 = findViewById(R.id.mpinEditText);
        cm.l.e(findViewById5, "findViewById(...)");
        f2((EditText) findViewById5);
        View findViewById6 = findViewById(R.id.signWithMpin);
        cm.l.e(findViewById6, "findViewById(...)");
        l2((LinearLayout) findViewById6);
        View findViewById7 = findViewById(R.id.backButton);
        cm.l.e(findViewById7, "findViewById(...)");
        a2((ImageView) findViewById7);
        View findViewById8 = findViewById(R.id.showmpin);
        cm.l.e(findViewById8, "findViewById(...)");
        j2((ImageView) findViewById8);
        View findViewById9 = findViewById(R.id.user_name);
        cm.l.e(findViewById9, "findViewById(...)");
        m2((TextView) findViewById9);
        View findViewById10 = findViewById(R.id.change_account);
        cm.l.e(findViewById10, "findViewById(...)");
        b2((TextView) findViewById10);
        g2(new ProgressDialog(this));
        H1().setMessage(E1().b("label_challan_please_wait", "Please wait..."));
        H1().setCancelable(false);
        H1().setCanceledOnTouchOutside(false);
        i2(new ld.g(this));
        this.X = SignService.f7644a.c(this);
        try {
            G0();
            a.C0209a aVar2 = r8.a.f15612a;
            fc fcVar2 = this.V;
            if (fcVar2 == null) {
                cm.l.v("binding");
                fcVar2 = null;
            }
            aVar2.a(this, fcVar2);
        } catch (Exception unused) {
        }
        SignService signService2 = this.X;
        if (signService2 == null) {
            cm.l.v("retrofitService");
            signService2 = null;
        }
        o2((v8.f) new u0((x0) this, (u0.b) new v8.e(new s8.b(signService2))).a(v8.f.class));
        new ld.e(this).h(0);
        if (!J1().t()) {
            z1().setVisibility(4);
            fc fcVar3 = this.V;
            if (fcVar3 == null) {
                cm.l.v("binding");
                fcVar3 = null;
            }
            fcVar3.f26344e.setVisibility(8);
            fc fcVar4 = this.V;
            if (fcVar4 == null) {
                cm.l.v("binding");
                fcVar4 = null;
            }
            fcVar4.f26341b.setVisibility(8);
            fc fcVar5 = this.V;
            if (fcVar5 == null) {
                cm.l.v("binding");
                fcVar5 = null;
            }
            fcVar5.f26355p.setVisibility(8);
            N1().setText("Welcome to NextGen mParivahan");
            N1().setVisibility(0);
        }
        if (!J1().t() || J1().m() == null) {
            L1().setVisibility(0);
        } else {
            L1().setVisibility(8);
        }
        if (getIntent() != null) {
            this.Y = getIntent().getIntExtra(v9.d.f17494a.o(), 0);
        }
        z1().setOnClickListener(new l0(this));
        y1().setOnClickListener(new o0(this));
        K1().setOnClickListener(new p0(this));
        fc fcVar6 = this.V;
        if (fcVar6 == null) {
            cm.l.v("binding");
            fcVar6 = null;
        }
        fcVar6.f26347h.setOnClickListener(new q0(this));
        if (!J1().t()) {
            F1().setEnabled(true);
        } else if (J1().l() != null) {
            F1().setText(J1().l());
            F1().setEnabled(false);
            F1().setClickable(false);
            F1().setAlpha(1.0f);
            N1().setText(E1().b("label_log_welcome", "Welcome") + ' ' + J1().n());
        }
        A1().setOnClickListener(new r0(this));
        I1().setOnClickListener(new s0(this));
        M1().setOnClickListener(new t0(this));
        L1().setOnClickListener(new u8.u0(this));
        SignService signService3 = this.X;
        if (signService3 == null) {
            cm.l.v("retrofitService");
        } else {
            signService = signService3;
        }
        n2((v8.h) new u0((x0) this, (u0.b) new v8.g(new s8.b(signService))).a(v8.h.class));
        O1().t().g(this, new r(new q(this)));
        O1().j().g(this, new r(new c(this)));
        O1().q().g(this, new r(new d(this)));
        O1().p().g(this, new r(new e(this)));
        O1().m().g(this, new r(new f(this)));
        O1().l().g(this, new r(new g(this)));
        O1().u().g(this, new r(new h(this)));
        O1().k().g(this, new r(new i(this)));
        O1().o().g(this, new r(new j(this)));
        O1().n().g(this, new r(new k(this)));
        G1().setCustomSelectionActionModeCallback(new l());
        P1().j().g(this, new r(new m(this)));
        P1().k().g(this, new r(new n(this)));
        P1().r().g(this, new r(new o(this)));
        P1().q().g(this, new r(new p(this)));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        ld.d.f13490a.a(this);
    }

    public final void p2(GetVirtualDocDetails getVirtualDocDetails) {
        cm.l.f(getVirtualDocDetails, "virtualdetails");
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        ArrayList<MparCitizenDocInfo> mparCitizenDocInfo = getVirtualDocDetails.getMparCitizenDocInfo();
        if (mparCitizenDocInfo.size() > 0) {
            DatabaseHelper A0 = DatabaseHelper.A0(this);
            cm.l.e(A0, "getInstance(...)");
            A0.H();
            A0.close();
        }
        int size = mparCitizenDocInfo.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (p.o(q.B0(mparCitizenDocInfo.get(i10).getDocType()).toString(), "RC", true)) {
                databaseHelper.O0(mparCitizenDocInfo.get(i10).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), (NrvDetails) null, 0);
                RCDownloads.f8390k.a(this, String.valueOf(mparCitizenDocInfo.get(i10).getDocId()));
            }
            if (p.o(q.B0(mparCitizenDocInfo.get(i10).getDocType()).toString(), "DL", true)) {
                c.a aVar = ka.c.f13158a;
                if (!aVar.m(mparCitizenDocInfo.get(i10).getDocDob())) {
                    String docNumber = mparCitizenDocInfo.get(i10).getDocNumber();
                    if (aVar.m(mparCitizenDocInfo.get(i10).getDocDob()) || p.o(mparCitizenDocInfo.get(i10).getDocDob(), "null", true)) {
                        B1(docNumber, String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), this);
                    } else {
                        databaseHelper.L0(docNumber, (DldetobjX) null, String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), mparCitizenDocInfo.get(i10).getDocDob());
                    }
                } else {
                    B1(mparCitizenDocInfo.get(i10).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), this);
                }
            }
        }
        ld.a aVar2 = new ld.a(this);
        String format = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        cm.l.c(format);
        aVar2.h(format);
    }

    public final void r1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new n0(dialog, this));
        dialog.show();
    }

    public final void t1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(E1().b("btn_ok", "OK"));
        textView.setOnClickListener(new v0(dialog));
        dialog.show();
    }

    public final ImageView y1() {
        ImageView imageView = this.R;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("backButton");
        return null;
    }

    public final TextView z1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        cm.l.v("change_account");
        return null;
    }
}
