package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.ListOfDisposeApplModel;
import com.nic.mparivahan.VahanServices.VahanModel.ModifiedListOfDisposeApplModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanApplVerifySuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.util.ArrayList;
import ni.pb;
import pl.x;

public final class VahanWithdrawOtpVerify extends androidx.appcompat.app.d {
    private pb G;
    /* access modifiers changed from: private */
    public String H = "";
    private String I = "";
    private String J = "";
    /* access modifiers changed from: private */
    public String K = "";
    private String L = "";
    /* access modifiers changed from: private */
    public int M;
    /* access modifiers changed from: private */
    public String N = "";
    /* access modifiers changed from: private */
    public String O = "";
    /* access modifiers changed from: private */
    public bi.b P;
    private ApplicationService Q;
    public ProgressDialog R;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawOtpVerify f20836e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanWithdrawOtpVerify vahanWithdrawOtpVerify) {
            super(1);
            this.f20836e = vahanWithdrawOtpVerify;
        }

        public final void b(SendOtpResult sendOtpResult) {
            if (this.f20836e.s1().isShowing()) {
                this.f20836e.s1().dismiss();
            }
            this.f20836e.M = sendOtpResult.getRecordId();
            VahanWithdrawOtpVerify vahanWithdrawOtpVerify = this.f20836e;
            vahanWithdrawOtpVerify.B1(vahanWithdrawOtpVerify, "We have resent the OTP to your Mobile Number");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawOtpVerify f20837e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanWithdrawOtpVerify vahanWithdrawOtpVerify) {
            super(1);
            this.f20837e = vahanWithdrawOtpVerify;
        }

        public final void b(String str) {
            if (this.f20837e.s1().isShowing()) {
                this.f20837e.s1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawOtpVerify f20838e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanWithdrawOtpVerify vahanWithdrawOtpVerify) {
            super(1);
            this.f20838e = vahanWithdrawOtpVerify;
        }

        public final void b(VahanApplVerifySuccessModel vahanApplVerifySuccessModel) {
            if (this.f20838e.s1().isShowing()) {
                this.f20838e.s1().dismiss();
            }
            try {
                ArrayList arrayList = new ArrayList();
                String str = "";
                int size = vahanApplVerifySuccessModel.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.addAll(p.d(new ModifiedListOfDisposeApplModel(((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getTransaction_no(), ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getPur_cd(), ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getRegn_no(), ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getApplication_status(), ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getRequest_dt(), ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getState_cd(), ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getOff_cd(), ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getDescr())));
                    str = ((ListOfDisposeApplModel) vahanApplVerifySuccessModel.get(i10)).getRequest_dt();
                }
                Intent intent = new Intent(this.f20838e, VahanWithdrawTransactionApplied.class);
                intent.putExtra("arrayList", arrayList);
                intent.putExtra("applicationNo", this.f20838e.H);
                intent.putExtra("ownerName", this.f20838e.N);
                intent.putExtra("stateCd", this.f20838e.O);
                intent.putExtra("regNo", this.f20838e.K);
                intent.putExtra("transactionDate", str);
                this.f20838e.startActivity(intent);
                this.f20838e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify = this.f20838e;
                vahanWithdrawOtpVerify.B1(vahanWithdrawOtpVerify, vahanWithdrawOtpVerify.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanApplVerifySuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawOtpVerify f20839e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanWithdrawOtpVerify vahanWithdrawOtpVerify) {
            super(1);
            this.f20839e = vahanWithdrawOtpVerify;
        }

        public final void b(String str) {
            if (this.f20839e.s1().isShowing()) {
                this.f20839e.s1().dismiss();
            }
            boolean equals = str.equals("Error");
            VahanWithdrawOtpVerify vahanWithdrawOtpVerify = this.f20839e;
            vahanWithdrawOtpVerify.B1(vahanWithdrawOtpVerify, "No Online application is available for withrawal.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawOtpVerify f20840e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanWithdrawOtpVerify vahanWithdrawOtpVerify) {
            super(1);
            this.f20840e = vahanWithdrawOtpVerify;
        }

        public final void b(OtpVerifyResult otpVerifyResult) {
            if (this.f20840e.s1().isShowing()) {
                this.f20840e.s1().dismiss();
            }
            try {
                if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    this.f20840e.s1().show();
                    bi.b q12 = this.f20840e.P;
                    if (q12 == null) {
                        cm.l.v("viewModel");
                        q12 = null;
                    }
                    VahanWithdrawOtpVerify vahanWithdrawOtpVerify = this.f20840e;
                    q12.E(vahanWithdrawOtpVerify, vahanWithdrawOtpVerify.K, this.f20840e.H, "1234");
                    return;
                }
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify2 = this.f20840e;
                vahanWithdrawOtpVerify2.B1(vahanWithdrawOtpVerify2, otpVerifyResult.getStatusDesc());
            } catch (Exception unused) {
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify3 = this.f20840e;
                vahanWithdrawOtpVerify3.B1(vahanWithdrawOtpVerify3, "Unable to Verify the OTP, Please try after some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OtpVerifyResult) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanWithdrawOtpVerify f20841e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanWithdrawOtpVerify vahanWithdrawOtpVerify) {
            super(1);
            this.f20841e = vahanWithdrawOtpVerify;
        }

        public final void b(String str) {
            if (this.f20841e.s1().isShowing()) {
                this.f20841e.s1().dismiss();
            }
            VahanWithdrawOtpVerify vahanWithdrawOtpVerify = this.f20841e;
            vahanWithdrawOtpVerify.B1(vahanWithdrawOtpVerify, "Unable to Verify the OTP, Please try after some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20842a;

        g(l lVar) {
            cm.l.f(lVar, "function");
            this.f20842a = lVar;
        }

        public final pl.c a() {
            return this.f20842a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20842a.invoke(obj);
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

    private final void A1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void t1() {
        pb pbVar = this.G;
        pb pbVar2 = null;
        if (pbVar == null) {
            cm.l.v("binding");
            pbVar = null;
        }
        pbVar.f28019g.setText("Dispose Application");
        pb pbVar3 = this.G;
        if (pbVar3 == null) {
            cm.l.v("binding");
            pbVar3 = null;
        }
        pbVar3.f28014b.f28308i.setText("Dispose Application");
        ApplicationService applicationService = this.Q;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.P = (bi.b) new u0((x0) this, (u0.b) new bi.f(new wg.b(applicationService))).a(bi.b.class);
        if (this.H.length() > 0) {
            pb pbVar4 = this.G;
            if (pbVar4 == null) {
                cm.l.v("binding");
                pbVar4 = null;
            }
            pbVar4.f28022j.setText(this.H);
        }
        if (this.I.length() > 0) {
            pb pbVar5 = this.G;
            if (pbVar5 == null) {
                cm.l.v("binding");
                pbVar5 = null;
            }
            pbVar5.f28023k.setText("xxxxxxx" + this.I);
        }
        if (this.K.length() > 0) {
            pb pbVar6 = this.G;
            if (pbVar6 == null) {
                cm.l.v("binding");
                pbVar6 = null;
            }
            pbVar6.f28024l.setText(this.K);
        }
        try {
            String str = this.L;
            int length = str.length();
            String str2 = "";
            for (int i10 = 0; i10 < length; i10++) {
                str.charAt(i10);
                str2 = new km.f("\\d(?=\\d{4})").b(new km.f("[^0-9]").b(this.L, ""), "X");
            }
            pb pbVar7 = this.G;
            if (pbVar7 == null) {
                cm.l.v("binding");
                pbVar7 = null;
            }
            pbVar7.f28017e.setText("OTP has been sent to your mobile \n+91 " + str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        pb pbVar8 = this.G;
        if (pbVar8 == null) {
            cm.l.v("binding");
            pbVar8 = null;
        }
        pbVar8.f28014b.f28306g.setOnClickListener(new h2(this));
        pb pbVar9 = this.G;
        if (pbVar9 == null) {
            cm.l.v("binding");
            pbVar9 = null;
        }
        pbVar9.f28014b.f28305f.setOnClickListener(new i2(this));
        pb pbVar10 = this.G;
        if (pbVar10 == null) {
            cm.l.v("binding");
            pbVar10 = null;
        }
        pbVar10.f28015c.setOnClickListener(new j2(this));
        pb pbVar11 = this.G;
        if (pbVar11 == null) {
            cm.l.v("binding");
            pbVar11 = null;
        }
        pbVar11.f28016d.setOnClickListener(new k2(this));
        pb pbVar12 = this.G;
        if (pbVar12 == null) {
            cm.l.v("binding");
            pbVar12 = null;
        }
        pbVar12.f28025m.setOnClickListener(new l2(this));
        pb pbVar13 = this.G;
        if (pbVar13 == null) {
            cm.l.v("binding");
        } else {
            pbVar2 = pbVar13;
        }
        pbVar2.f28020h.setOnClickListener(new m2(this));
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanWithdrawOtpVerify vahanWithdrawOtpVerify, View view) {
        cm.l.f(vahanWithdrawOtpVerify, "this$0");
        vahanWithdrawOtpVerify.A1();
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanWithdrawOtpVerify vahanWithdrawOtpVerify, View view) {
        cm.l.f(vahanWithdrawOtpVerify, "this$0");
        vahanWithdrawOtpVerify.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanWithdrawOtpVerify vahanWithdrawOtpVerify, View view) {
        cm.l.f(vahanWithdrawOtpVerify, "this$0");
        vahanWithdrawOtpVerify.finish();
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanWithdrawOtpVerify vahanWithdrawOtpVerify, View view) {
        Boolean bool;
        cm.l.f(vahanWithdrawOtpVerify, "this$0");
        pb pbVar = vahanWithdrawOtpVerify.G;
        pb pbVar2 = null;
        if (pbVar == null) {
            cm.l.v("binding");
            pbVar = null;
        }
        Editable text = pbVar.f28018f.getText();
        if (text != null) {
            bool = Boolean.valueOf(text.length() > 0);
        } else {
            bool = null;
        }
        cm.l.c(bool);
        if (bool.booleanValue()) {
            if (vahanWithdrawOtpVerify.s1().isShowing()) {
                vahanWithdrawOtpVerify.s1().dismiss();
            }
            pb pbVar3 = vahanWithdrawOtpVerify.G;
            if (pbVar3 == null) {
                cm.l.v("binding");
                pbVar3 = null;
            }
            if (String.valueOf(pbVar3.f28018f.getText()).length() >= 4) {
                vahanWithdrawOtpVerify.s1().show();
                bi.b bVar = vahanWithdrawOtpVerify.P;
                if (bVar == null) {
                    cm.l.v("viewModel");
                    bVar = null;
                }
                pb pbVar4 = vahanWithdrawOtpVerify.G;
                if (pbVar4 == null) {
                    cm.l.v("binding");
                } else {
                    pbVar2 = pbVar4;
                }
                bVar.D(vahanWithdrawOtpVerify, String.valueOf(pbVar2.f28018f.getText()), String.valueOf(vahanWithdrawOtpVerify.M));
                return;
            }
        }
        vahanWithdrawOtpVerify.B1(vahanWithdrawOtpVerify, "Please enter the valid OTP");
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanWithdrawOtpVerify vahanWithdrawOtpVerify, View view) {
        cm.l.f(vahanWithdrawOtpVerify, "this$0");
        if (vahanWithdrawOtpVerify.s1().isShowing()) {
            vahanWithdrawOtpVerify.s1().dismiss();
        }
        vahanWithdrawOtpVerify.s1().show();
        ld.g gVar = new ld.g(vahanWithdrawOtpVerify);
        bi.b bVar = vahanWithdrawOtpVerify.P;
        if (bVar == null) {
            cm.l.v("viewModel");
            bVar = null;
        }
        bVar.q(vahanWithdrawOtpVerify, vahanWithdrawOtpVerify.L, gVar.k());
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanWithdrawOtpVerify vahanWithdrawOtpVerify, View view) {
        AppCompatEditText appCompatEditText;
        TransformationMethod instance;
        cm.l.f(vahanWithdrawOtpVerify, "this$0");
        pb pbVar = vahanWithdrawOtpVerify.G;
        pb pbVar2 = null;
        if (pbVar == null) {
            cm.l.v("binding");
            pbVar = null;
        }
        if (pbVar.f28018f.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            pb pbVar3 = vahanWithdrawOtpVerify.G;
            if (pbVar3 == null) {
                cm.l.v("binding");
                pbVar3 = null;
            }
            pbVar3.f28020h.setImageResource(R.drawable.pass_visible);
            pb pbVar4 = vahanWithdrawOtpVerify.G;
            if (pbVar4 == null) {
                cm.l.v("binding");
            } else {
                pbVar2 = pbVar4;
            }
            appCompatEditText = pbVar2.f28018f;
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            pb pbVar5 = vahanWithdrawOtpVerify.G;
            if (pbVar5 == null) {
                cm.l.v("binding");
                pbVar5 = null;
            }
            pbVar5.f28020h.setImageResource(R.drawable.mvvm_visibility);
            pb pbVar6 = vahanWithdrawOtpVerify.G;
            if (pbVar6 == null) {
                cm.l.v("binding");
            } else {
                pbVar2 = pbVar6;
            }
            appCompatEditText = pbVar2.f28018f;
            instance = PasswordTransformationMethod.getInstance();
        }
        appCompatEditText.setTransformationMethod(instance);
    }

    public final void B1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new n2(dialog));
        dialog.show();
    }

    public final void D1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.R = progressDialog;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout_application_otp_verify_vahan_services);
        pb c10 = pb.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        bi.b bVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        this.Q = ApplicationService.f21181a.b(this);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("applicationNo");
            cm.l.c(stringExtra);
            this.H = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("chassisNo");
            cm.l.c(stringExtra2);
            this.I = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("engineNo");
            cm.l.c(stringExtra3);
            this.J = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("regNo");
            cm.l.c(stringExtra4);
            this.K = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("mobileNo");
            cm.l.c(stringExtra5);
            this.L = stringExtra5;
            this.M = getIntent().getIntExtra("otp", 0);
            String stringExtra6 = getIntent().getStringExtra("ownerName");
            cm.l.c(stringExtra6);
            this.N = stringExtra6;
            String stringExtra7 = getIntent().getStringExtra("stateCd");
            cm.l.c(stringExtra7);
            this.O = stringExtra7;
        }
        D1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        t1();
        bi.b bVar2 = this.P;
        if (bVar2 == null) {
            cm.l.v("viewModel");
            bVar2 = null;
        }
        bVar2.k().g(this, new g(new a(this)));
        bi.b bVar3 = this.P;
        if (bVar3 == null) {
            cm.l.v("viewModel");
            bVar3 = null;
        }
        bVar3.j().g(this, new g(new b(this)));
        bi.b bVar4 = this.P;
        if (bVar4 == null) {
            cm.l.v("viewModel");
            bVar4 = null;
        }
        bVar4.n().g(this, new g(new c(this)));
        bi.b bVar5 = this.P;
        if (bVar5 == null) {
            cm.l.v("viewModel");
            bVar5 = null;
        }
        bVar5.m().g(this, new g(new d(this)));
        bi.b bVar6 = this.P;
        if (bVar6 == null) {
            cm.l.v("viewModel");
            bVar6 = null;
        }
        bVar6.s().g(this, new g(new e(this)));
        bi.b bVar7 = this.P;
        if (bVar7 == null) {
            cm.l.v("viewModel");
        } else {
            bVar = bVar7;
        }
        bVar.r().g(this, new g(new f(this)));
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.R;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }
}
