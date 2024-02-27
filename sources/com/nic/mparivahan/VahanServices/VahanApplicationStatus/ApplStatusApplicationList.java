package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi.e;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.Currentlist;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import java.io.Serializable;
import java.util.ArrayList;
import ni.n;
import pl.x;
import wd.e1;

public final class ApplStatusApplicationList extends d implements e1 {
    public n G;
    public AppliByRcModle H;
    private bi.a I;
    private ApplicationServiceOtp J;
    public ProgressDialog K;
    public String L;
    public String M;
    public String N;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplStatusApplicationList f20757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ApplStatusApplicationList applStatusApplicationList) {
            super(1);
            this.f20757e = applStatusApplicationList;
        }

        public final void b(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (this.f20757e.o1().isShowing()) {
                this.f20757e.o1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().size() > 0) {
                    Intent intent = new Intent(this.f20757e, VahanApplicationTransactionStatus.class);
                    intent.putExtra("transList", new i7.d().t(applicationStatusSuccessModel.getTransList()));
                    intent.putExtra("applicationNo", this.f20757e.m1());
                    intent.putExtra("ownerName", "--");
                    intent.putExtra("stateCd", this.f20757e.q1());
                    intent.putExtra("regNo", this.f20757e.p1());
                    this.f20757e.startActivity(intent);
                    return;
                }
                this.f20757e.z1("No application status found for this application no.");
            } catch (Exception e10) {
                e10.printStackTrace();
                ApplStatusApplicationList applStatusApplicationList = this.f20757e;
                applStatusApplicationList.z1(applStatusApplicationList.getString(R.string.service_unavable_please_try));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ApplicationStatusSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplStatusApplicationList f20758e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ApplStatusApplicationList applStatusApplicationList) {
            super(1);
            this.f20758e = applStatusApplicationList;
        }

        public final void b(String str) {
            if (this.f20758e.o1().isShowing()) {
                this.f20758e.o1().dismiss();
            }
            this.f20758e.z1("No application status found for this application no.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20759a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20759a = lVar;
        }

        public final pl.c a() {
            return this.f20759a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20759a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void A1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void k1(String str, String str2) {
        o1().show();
        u1(str);
        y1(str2);
        bi.a aVar = this.I;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.o(this, str, str2);
    }

    /* access modifiers changed from: private */
    public static final void r1(ApplStatusApplicationList applStatusApplicationList, View view) {
        cm.l.f(applStatusApplicationList, "this$0");
        applStatusApplicationList.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void s1(ApplStatusApplicationList applStatusApplicationList, View view) {
        cm.l.f(applStatusApplicationList, "this$0");
        applStatusApplicationList.finish();
    }

    /* access modifiers changed from: private */
    public final void z1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new c(dialog));
        textView2.setOnClickListener(new d(dialog));
        dialog.show();
    }

    public final AppliByRcModle l1() {
        AppliByRcModle appliByRcModle = this.H;
        if (appliByRcModle != null) {
            return appliByRcModle;
        }
        cm.l.v("applicationList");
        return null;
    }

    public final String m1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("application_no");
        return null;
    }

    public final n n1() {
        n nVar = this.G;
        if (nVar != null) {
            return nVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_appl_status_application_list);
        n c10 = n.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        v1(c10);
        setContentView((View) n1().b());
        n1().f27505b.f28308i.setText(new ld.c(this).b("label_application_status", "Application Status"));
        w1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        this.J = ApplicationServiceOtp.f21184a.b(this);
        bi.a aVar = null;
        try {
            ApplicationServiceOtp applicationServiceOtp = this.J;
            if (applicationServiceOtp == null) {
                cm.l.v("otpRetrofitService");
                applicationServiceOtp = null;
            }
            this.I = (bi.a) new u0((x0) this, (u0.b) new e(new wg.a(applicationServiceOtp))).a(bi.a.class);
            n1().f27507d.setLayoutManager(new LinearLayoutManager(this, 1, false));
            Serializable serializableExtra = getIntent().getSerializableExtra("current");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle");
            t1((AppliByRcModle) serializableExtra);
            ArrayList<Currentlist> currentlist = l1().get1().getCurrentlist();
            Log.e("CurrentSize", String.valueOf(currentlist.size()));
            if (currentlist.size() > 0) {
                n1().f27507d.setAdapter(new og.b(currentlist, this, this));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        bi.a aVar2 = this.I;
        if (aVar2 == null) {
            cm.l.v("otpViewModel");
            aVar2 = null;
        }
        aVar2.n().g(this, new c(new a(this)));
        bi.a aVar3 = this.I;
        if (aVar3 == null) {
            cm.l.v("otpViewModel");
        } else {
            aVar = aVar3;
        }
        aVar.k().g(this, new c(new b(this)));
        n1().f27505b.f28305f.setOnClickListener(new a(this));
        n1().f27505b.f28306g.setOnClickListener(new b(this));
    }

    public final String p1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_no");
        return null;
    }

    public final String q1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("state_code");
        return null;
    }

    public final void t1(AppliByRcModle appliByRcModle) {
        cm.l.f(appliByRcModle, "<set-?>");
        this.H = appliByRcModle;
    }

    public final void u1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void v1(n nVar) {
        cm.l.f(nVar, "<set-?>");
        this.G = nVar;
    }

    public final void w1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public void x(String str, int i10, String str2) {
        cm.l.f(str2, "rcno");
        x1(str2);
        String valueOf = String.valueOf(str);
        String substring = String.valueOf(str).substring(0, 2);
        cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        k1(valueOf, substring);
    }

    public final void x1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void y1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }
}
