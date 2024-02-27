package com.nic.mparivahan.NewDesignActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cc.a;
import cc.b;
import cc.c;
import cc.e;
import cc.f;
import cc.g;
import cc.h;
import cc.i;
import cc.j;
import cc.k;
import cc.m;
import cc.n;
import cc.o;
import cc.p;
import cc.q;
import cc.r;
import cc.s;
import cc.t;
import cc.u;
import cc.v;
import cc.w;
import cc.x;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RcSearchHistory;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import ni.ic;
import v9.e;

public final class MyDocActivity extends d {
    private ic G;

    /* access modifiers changed from: private */
    public static final void E1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Intent intent = new Intent(myDocActivity, RcSearchHistory.class);
        intent.putExtra("RC", 1);
        myDocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void G1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Intent intent = new Intent(myDocActivity, RcSearchHistory.class);
        intent.putExtra("RC", 1);
        myDocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void H1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Intent intent = new Intent(myDocActivity, RcSearchHistory.class);
        intent.putExtra("RC", 2);
        myDocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Intent intent = new Intent(myDocActivity, RcSearchHistory.class);
        intent.putExtra("RC", 2);
        myDocActivity.startActivity(intent);
    }

    private final void J1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void K1() {
        ic icVar = this.G;
        ic icVar2 = null;
        if (icVar == null) {
            l.v("binding");
            icVar = null;
        }
        icVar.M.setOnClickListener(new s(this));
        ic icVar3 = this.G;
        if (icVar3 == null) {
            l.v("binding");
            icVar3 = null;
        }
        icVar3.N.setOnClickListener(new cc.d(this));
        ic icVar4 = this.G;
        if (icVar4 == null) {
            l.v("binding");
            icVar4 = null;
        }
        icVar4.K.setOnClickListener(new e(this));
        ic icVar5 = this.G;
        if (icVar5 == null) {
            l.v("binding");
            icVar5 = null;
        }
        icVar5.L.setOnClickListener(new f(this));
        ic icVar6 = this.G;
        if (icVar6 == null) {
            l.v("binding");
            icVar6 = null;
        }
        icVar6.f26849d.setOnClickListener(new g(this));
        ic icVar7 = this.G;
        if (icVar7 == null) {
            l.v("binding");
            icVar7 = null;
        }
        icVar7.f26848c.setOnClickListener(new h(this));
        ic icVar8 = this.G;
        if (icVar8 == null) {
            l.v("binding");
            icVar8 = null;
        }
        icVar8.f26847b.setOnClickListener(new i(this));
        ic icVar9 = this.G;
        if (icVar9 == null) {
            l.v("binding");
            icVar9 = null;
        }
        icVar9.f26852g.setOnClickListener(new j(this));
        ic icVar10 = this.G;
        if (icVar10 == null) {
            l.v("binding");
            icVar10 = null;
        }
        icVar10.f26853h.setOnClickListener(new k(this));
        ic icVar11 = this.G;
        if (icVar11 == null) {
            l.v("binding");
            icVar11 = null;
        }
        icVar11.f26866u.setOnClickListener(new m(this));
        ic icVar12 = this.G;
        if (icVar12 == null) {
            l.v("binding");
            icVar12 = null;
        }
        icVar12.f26867v.setOnClickListener(new t(this));
        ic icVar13 = this.G;
        if (icVar13 == null) {
            l.v("binding");
            icVar13 = null;
        }
        icVar13.f26864s.setOnClickListener(new u(this));
        ic icVar14 = this.G;
        if (icVar14 == null) {
            l.v("binding");
            icVar14 = null;
        }
        icVar14.f26865t.setOnClickListener(new v(this));
        ic icVar15 = this.G;
        if (icVar15 == null) {
            l.v("binding");
            icVar15 = null;
        }
        icVar15.G.setOnClickListener(new w(this));
        ic icVar16 = this.G;
        if (icVar16 == null) {
            l.v("binding");
            icVar16 = null;
        }
        icVar16.H.setOnClickListener(new x(this));
        ic icVar17 = this.G;
        if (icVar17 == null) {
            l.v("binding");
            icVar17 = null;
        }
        icVar17.I.f28305f.setOnClickListener(new b(this));
        ic icVar18 = this.G;
        if (icVar18 == null) {
            l.v("binding");
        } else {
            icVar2 = icVar18;
        }
        icVar2.I.f28306g.setOnClickListener(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void L1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Intent intent = new Intent(myDocActivity, FetchVahanTransactions.class);
        intent.putExtra("trans_val", "1");
        myDocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void M1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Intent intent = new Intent(myDocActivity, FetchVahanTransactions.class);
        intent.putExtra("trans_val", "2");
        myDocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void N1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Intent intent = new Intent(myDocActivity, FetchVahanTransactions.class);
        intent.putExtra("trans_val", VContant.DUPLICATE_RC_PURPOSE_CODE);
        myDocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void O1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void P1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void Q1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void R1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void S1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void T1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void U1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void V1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.D1("No Record available");
    }

    /* access modifiers changed from: private */
    public static final void W1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void X1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.J1();
    }

    /* access modifiers changed from: private */
    public static final void Y1(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new p(myDocActivity), 500);
    }

    /* access modifiers changed from: private */
    public static final void Z1(MyDocActivity myDocActivity) {
        l.f(myDocActivity, "this$0");
        myDocActivity.startActivity(new Intent(myDocActivity, VirtualRcActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void a2(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.startActivity(new Intent(myDocActivity, VirtualRcActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void b2(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        Looper myLooper = Looper.myLooper();
        l.c(myLooper);
        new Handler(myLooper).postDelayed(new n(myDocActivity), 500);
    }

    /* access modifiers changed from: private */
    public static final void c2(MyDocActivity myDocActivity) {
        l.f(myDocActivity, "this$0");
        myDocActivity.startActivity(new Intent(myDocActivity, VirtualDlActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void d2(MyDocActivity myDocActivity, View view) {
        l.f(myDocActivity, "this$0");
        myDocActivity.startActivity(new Intent(myDocActivity, VirtualDlActivity.class));
    }

    public final void D1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new o(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.new_my_doc_activity);
        ic c10 = ic.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        ic icVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        ic icVar2 = this.G;
        if (icVar2 == null) {
            l.v("binding");
            icVar2 = null;
        }
        aVar.q1(this, icVar2);
        try {
            K1();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ic icVar3 = this.G;
        if (icVar3 == null) {
            l.v("binding");
            icVar3 = null;
        }
        icVar3.D.setOnClickListener(new a(this));
        ic icVar4 = this.G;
        if (icVar4 == null) {
            l.v("binding");
            icVar4 = null;
        }
        icVar4.C.setOnClickListener(new cc.l(this));
        ic icVar5 = this.G;
        if (icVar5 == null) {
            l.v("binding");
            icVar5 = null;
        }
        icVar5.f26860o.setOnClickListener(new q(this));
        ic icVar6 = this.G;
        if (icVar6 == null) {
            l.v("binding");
        } else {
            icVar = icVar6;
        }
        icVar.f26871z.setOnClickListener(new r(this));
    }
}
