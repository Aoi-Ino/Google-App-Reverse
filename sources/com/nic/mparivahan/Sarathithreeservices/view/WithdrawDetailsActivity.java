package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cb.s0;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplStatusDetail;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import gd.k0;
import gd.l0;
import gd.m0;
import gd.n0;
import java.text.SimpleDateFormat;
import java.util.List;
import ld.f;
import ni.r9;
import oi.g;
import pl.c;
import pl.x;

public final class WithdrawDetailsActivity extends g {
    /* access modifiers changed from: private */
    public r9 J;
    private hd.a K;
    public GetApplStatusService L;
    private s0 M;
    public f N;
    private String O;
    private String P;
    private String Q;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WithdrawDetailsActivity f9582e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(WithdrawDetailsActivity withdrawDetailsActivity) {
            super(1);
            this.f9582e = withdrawDetailsActivity;
        }

        public final void b(GetAppStatusMain getAppStatusMain) {
            this.f9582e.L1(false);
            if (!cm.l.a(getAppStatusMain.getStatus_code(), "00") || !cm.l.a(getAppStatusMain.getStatus_desc(), "Success")) {
                Toast.makeText(this.f9582e, getAppStatusMain.getStatus_desc(), 1).show();
                return;
            }
            List<ApplStatusDetail> applStatus_Details = getAppStatusMain.getApplStatus_Details();
            r9 z12 = this.f9582e.J;
            r9 r9Var = null;
            if (z12 == null) {
                cm.l.v("mBinding");
                z12 = null;
            }
            z12.f28411f.setText(applStatus_Details.get(0).getApplno());
            r9 z13 = this.f9582e.J;
            if (z13 == null) {
                cm.l.v("mBinding");
                z13 = null;
            }
            z13.f28407b.setText(applStatus_Details.get(0).getApplName());
            r9 z14 = this.f9582e.J;
            if (z14 == null) {
                cm.l.v("mBinding");
                z14 = null;
            }
            z14.f28409d.setText(applStatus_Details.get(0).getDob());
            r9 z15 = this.f9582e.J;
            if (z15 == null) {
                cm.l.v("mBinding");
                z15 = null;
            }
            z15.f28423r.setText(applStatus_Details.get(0).getRtoCd());
            r9 z16 = this.f9582e.J;
            if (z16 == null) {
                cm.l.v("mBinding");
            } else {
                r9Var = z16;
            }
            r9Var.f28419n.setText(applStatus_Details.get(0).getRtoName());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAppStatusMain) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9583a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f9583a = lVar;
        }

        public final c a() {
            return this.f9583a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9583a.invoke(obj);
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

    private final void C1() {
        if (dd.a.f9964a.a(this)) {
            L1(true);
            hd.a aVar = this.K;
            hd.a aVar2 = null;
            if (aVar == null) {
                cm.l.v("appStatusVM");
                aVar = null;
            }
            String str = this.O;
            if (str == null) {
                cm.l.v("appNo");
                str = null;
            }
            String str2 = this.Q;
            if (str2 == null) {
                cm.l.v("format_date");
                str2 = null;
            }
            aVar.h(this, str, str2);
            hd.a aVar3 = this.K;
            if (aVar3 == null) {
                cm.l.v("appStatusVM");
            } else {
                aVar2 = aVar3;
            }
            aVar2.k().g(this, new b(new a(this)));
            return;
        }
        Toast.makeText(this, getString(R.string.no_internet), 1).show();
    }

    private final void D1() {
        String stringExtra = getIntent().getStringExtra("app_no");
        cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
        this.O = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("dob");
        cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
        this.P = stringExtra2;
        this.K = (hd.a) new u0((x0) this, (u0.b) new hd.b(new ed.a(B1()))).a(hd.a.class);
        M1(new f(this));
        String str = this.O;
        String str2 = null;
        if (str == null) {
            cm.l.v("appNo");
            str = null;
        }
        if (str.length() <= 0) {
            String str3 = this.P;
            if (str3 == null) {
                cm.l.v("dob");
                str3 = null;
            }
            if (str3.length() <= 0) {
                return;
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        String str4 = this.P;
        if (str4 == null) {
            cm.l.v("dob");
        } else {
            str2 = str4;
        }
        String format = simpleDateFormat2.format(simpleDateFormat.parse(str2));
        cm.l.e(format, "format(...)");
        this.Q = format;
        C1();
    }

    private final void E1() {
        r9 r9Var = this.J;
        r9 r9Var2 = null;
        if (r9Var == null) {
            cm.l.v("mBinding");
            r9Var = null;
        }
        r9Var.f28416k.f28448b.setOnClickListener(new k0(this));
        r9 r9Var3 = this.J;
        if (r9Var3 == null) {
            cm.l.v("mBinding");
            r9Var3 = null;
        }
        r9Var3.f28412g.setOnClickListener(new l0(this));
        r9 r9Var4 = this.J;
        if (r9Var4 == null) {
            cm.l.v("mBinding");
        } else {
            r9Var2 = r9Var4;
        }
        r9Var2.f28428w.setOnClickListener(new m0(this));
    }

    /* access modifiers changed from: private */
    public static final void F1(WithdrawDetailsActivity withdrawDetailsActivity, View view) {
        cm.l.f(withdrawDetailsActivity, "this$0");
        withdrawDetailsActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void G1(WithdrawDetailsActivity withdrawDetailsActivity, View view) {
        cm.l.f(withdrawDetailsActivity, "this$0");
        withdrawDetailsActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void H1(WithdrawDetailsActivity withdrawDetailsActivity, View view) {
        cm.l.f(withdrawDetailsActivity, "this$0");
        withdrawDetailsActivity.I1(withdrawDetailsActivity);
    }

    private final void I1(Context context) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_dialog);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.msg_title);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        dialog.show();
        ((TextView) findViewById).setText(getString(R.string.withdraw_pop_msg));
        ((TextView) findViewById2).setOnClickListener(new n0(dialog));
    }

    /* access modifiers changed from: private */
    public static final void J1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void L1(boolean z10) {
        if (z10) {
            try {
                this.M = new s0(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        s0 s0Var = this.M;
        if (s0Var == null) {
            return;
        }
        if (z10) {
            s0Var.b();
        } else {
            s0Var.a();
        }
    }

    public final GetApplStatusService B1() {
        GetApplStatusService getApplStatusService = this.L;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        cm.l.v("appInfoService");
        return null;
    }

    public final void K1(GetApplStatusService getApplStatusService) {
        cm.l.f(getApplStatusService, "<set-?>");
        this.L = getApplStatusService;
    }

    public final void M1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.N = fVar;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r9 c10 = r9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.J = c10;
        if (c10 == null) {
            cm.l.v("mBinding");
            c10 = null;
        }
        setContentView((View) c10.b());
        K1(GetApplStatusService.f9545a.a(this));
        D1();
        E1();
    }
}
