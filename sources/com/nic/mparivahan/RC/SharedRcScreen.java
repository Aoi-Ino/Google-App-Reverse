package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bd.b;
import cd.c;
import cm.l;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.SharedDocModle;
import com.nic.mparivahan.RC.RcInterface.RcService;
import java.util.HashMap;
import ld.g;
import ni.j8;
import v9.e;
import v9.f;
import vc.h1;
import vc.i1;
import vc.j1;
import vc.k1;
import vc.l1;
import vc.m1;
import vc.n1;
import vc.o1;
import vc.p1;
import vc.q1;

public final class SharedRcScreen extends d {
    private j8 G;
    public c H;
    public RcService I;
    public ProgressDialog J;
    /* access modifiers changed from: private */
    public String K;
    public g L;
    public HashMap M;
    public ld.c N;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SharedRcScreen f9527e;

        a(SharedRcScreen sharedRcScreen) {
            this.f9527e = sharedRcScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SharedRcScreen sharedRcScreen;
            String str;
            l.f(view, "view");
            if (i10 > 0) {
                sharedRcScreen = this.f9527e;
                str = String.valueOf(sharedRcScreen.u1(i10));
            } else if (i10 == 0) {
                sharedRcScreen = this.f9527e;
                str = null;
            } else {
                return;
            }
            sharedRcScreen.K = str;
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(SharedRcScreen sharedRcScreen, View view) {
        l.f(sharedRcScreen, "this$0");
        sharedRcScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(SharedRcScreen sharedRcScreen, View view) {
        l.f(sharedRcScreen, "this$0");
        j8 j8Var = sharedRcScreen.G;
        if (j8Var == null) {
            l.v("binding");
            j8Var = null;
        }
        j8Var.f26980c.performClick();
    }

    /* access modifiers changed from: private */
    public static final void D1(SharedRcScreen sharedRcScreen, View view) {
        Context context;
        String str;
        l.f(sharedRcScreen, "this$0");
        j8 j8Var = sharedRcScreen.G;
        j8 j8Var2 = null;
        if (j8Var == null) {
            l.v("binding");
            j8Var = null;
        }
        String obj = j8Var.f26983f.getText().toString();
        if (obj == null || obj.length() == 0 || obj.length() < 10 || !t8.c.f16582a.q(obj)) {
            context = sharedRcScreen.getApplicationContext();
            str = sharedRcScreen.y1().b("label_log_entr_vali_mobno", sharedRcScreen.getString(R.string.enter_mobile_no));
        } else if (p.o(sharedRcScreen.z1().l().toString(), obj, true)) {
            sharedRcScreen.P1(sharedRcScreen, "RC cannot be shared as You are allready Logged-In using this mobile number");
            return;
        } else {
            j8 j8Var3 = sharedRcScreen.G;
            if (j8Var3 == null) {
                l.v("binding");
            } else {
                j8Var2 = j8Var3;
            }
            if (j8Var2.f26980c.getSelectedItemPosition() == 0) {
                context = sharedRcScreen.getApplicationContext();
                str = sharedRcScreen.y1().b(f.f17510a.q0(), "Please Select the duration");
            } else {
                sharedRcScreen.w1().show();
                sharedRcScreen.A1().r(obj);
                return;
            }
        }
        Toast.makeText(context, str, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void E1(SharedRcScreen sharedRcScreen, String str, GetCitizenDetails getCitizenDetails) {
        l.f(sharedRcScreen, "this$0");
        try {
            if (p.o(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                c A1 = sharedRcScreen.A1();
                String str2 = sharedRcScreen.z1().k().toString();
                String valueOf = String.valueOf(str);
                j8 j8Var = sharedRcScreen.G;
                j8 j8Var2 = null;
                if (j8Var == null) {
                    l.v("binding");
                    j8Var = null;
                }
                String obj = j8Var.f26983f.getText().toString();
                HashMap v12 = sharedRcScreen.v1();
                j8 j8Var3 = sharedRcScreen.G;
                if (j8Var3 == null) {
                    l.v("binding");
                } else {
                    j8Var2 = j8Var3;
                }
                A1.Z(str2, valueOf, obj, String.valueOf(v12.get(Integer.valueOf(j8Var2.f26980c.getSelectedItemPosition()))), sharedRcScreen);
            } else if (!ka.c.f13158a.m(getCitizenDetails.getStatusDesc())) {
                sharedRcScreen.w1().dismiss();
                Toast.makeText(sharedRcScreen.getApplicationContext(), getCitizenDetails.getStatusDesc().toString(), 1).show();
            }
        } catch (Exception e10) {
            sharedRcScreen.w1().dismiss();
            e10.printStackTrace();
            Toast.makeText(sharedRcScreen.getApplicationContext(), sharedRcScreen.y1().b(f.f17510a.a0(), "Number is not registered with the mParivahan"), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(SharedRcScreen sharedRcScreen, String str) {
        l.f(sharedRcScreen, "this$0");
        sharedRcScreen.w1().dismiss();
        Toast.makeText(sharedRcScreen.getApplicationContext(), sharedRcScreen.y1().b(f.f17510a.a0(), "Number is not registered with the mParivahan"), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void G1(SharedRcScreen sharedRcScreen, SharedDocModle sharedDocModle) {
        l.f(sharedRcScreen, "this$0");
        try {
            sharedRcScreen.w1().dismiss();
            sharedRcScreen.s1(sharedRcScreen, p.o(sharedDocModle.getStatusCode(), "VTLD001", true) ? "RC Shared Successfully" : sharedDocModle.getStatusDesc().toString());
        } catch (Exception e10) {
            sharedRcScreen.w1().dismiss();
            e10.printStackTrace();
            Toast.makeText(sharedRcScreen.getApplicationContext(), sharedRcScreen.y1().b(f.f17510a.a0(), "Number is not registered with the mParivahan"), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(SharedRcScreen sharedRcScreen, String str) {
        l.f(sharedRcScreen, "this$0");
        sharedRcScreen.w1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I1(SharedRcScreen sharedRcScreen, String str) {
        l.f(sharedRcScreen, "this$0");
        sharedRcScreen.w1().dismiss();
        Toast.makeText(sharedRcScreen.getApplicationContext(), sharedRcScreen.y1().b(f.f17510a.a0(), "Number is not registered with the mParivahan"), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void Q1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void t1(Dialog dialog, SharedRcScreen sharedRcScreen, View view) {
        l.f(dialog, "$d");
        l.f(sharedRcScreen, "this$0");
        dialog.dismiss();
        sharedRcScreen.finish();
    }

    /* access modifiers changed from: private */
    public final int u1(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 7;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 30;
        }
        return 15;
    }

    public final c A1() {
        c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void J1(HashMap hashMap) {
        l.f(hashMap, "<set-?>");
        this.M = hashMap;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void L1(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.I = rcService;
    }

    public final void M1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void N1(g gVar) {
        l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final void O1(c cVar) {
        l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    public final void P1(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        textView.setText(y1().b("btn_ok", "OK"));
        ((TextView) findViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setOnClickListener(new q1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j8 c10 = j8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        j8 j8Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        j8 j8Var2 = this.G;
        if (j8Var2 == null) {
            l.v("binding");
            j8Var2 = null;
        }
        aVar.M1(this, j8Var2);
        M1(new ld.c(this));
        L1(RcService.f9484a.c(this));
        p1();
        K1(new ProgressDialog(this));
        w1().setMessage(y1().b("label_challan_please_wait", "Please wait..."));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        N1(new g(this));
        O1((c) new u0((x0) this, (u0.b) new cd.d(new b(x1()))).a(c.class));
        j8 j8Var3 = this.G;
        if (j8Var3 == null) {
            l.v("binding");
            j8Var3 = null;
        }
        j8Var3.f26989l.setText(y1().b("share_rc", "Share RC"));
        j8 j8Var4 = this.G;
        if (j8Var4 == null) {
            l.v("binding");
            j8Var4 = null;
        }
        j8Var4.f26987j.setText(y1().b("share_rc", "Share RC"));
        String stringExtra = getIntent().getStringExtra("RcNumber");
        if (stringExtra != null && !p.q(stringExtra)) {
            j8 j8Var5 = this.G;
            if (j8Var5 == null) {
                l.v("binding");
                j8Var5 = null;
            }
            j8Var5.f26986i.setText(stringExtra);
            ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.spinnerItems1, 17367048);
            l.e(createFromResource, "createFromResource(...)");
            createFromResource.setDropDownViewResource(17367049);
            j8 j8Var6 = this.G;
            if (j8Var6 == null) {
                l.v("binding");
                j8Var6 = null;
            }
            j8Var6.f26980c.setAdapter((SpinnerAdapter) createFromResource);
            j8 j8Var7 = this.G;
            if (j8Var7 == null) {
                l.v("binding");
                j8Var7 = null;
            }
            j8Var7.f26980c.setOnItemSelectedListener(new a(this));
        }
        j8 j8Var8 = this.G;
        if (j8Var8 == null) {
            l.v("binding");
            j8Var8 = null;
        }
        j8Var8.f26984g.setOnClickListener(new h1(this));
        j8 j8Var9 = this.G;
        if (j8Var9 == null) {
            l.v("binding");
            j8Var9 = null;
        }
        j8Var9.f26979b.setOnClickListener(new i1(this));
        j8 j8Var10 = this.G;
        if (j8Var10 == null) {
            l.v("binding");
            j8Var10 = null;
        }
        j8Var10.f26987j.setOnClickListener(new j1(this));
        A1().u().g(this, new k1(this, stringExtra));
        A1().t().g(this, new l1(this));
        A1().H().g(this, new m1(this));
        A1().I().g(this, new n1(this));
        A1().t().g(this, new o1(this));
        j8 j8Var11 = this.G;
        if (j8Var11 == null) {
            l.v("binding");
            j8Var11 = null;
        }
        j8Var11.f26989l.setText(y1().b("share_rc", "Share RC"));
        j8 j8Var12 = this.G;
        if (j8Var12 == null) {
            l.v("binding");
            j8Var12 = null;
        }
        j8Var12.f26987j.setText(y1().b("share_rc", "Share RC"));
        j8 j8Var13 = this.G;
        if (j8Var13 == null) {
            l.v("binding");
        } else {
            j8Var = j8Var13;
        }
        j8Var.f26983f.setHint(y1().b("label_mb", "Enter Mobile No."));
    }

    public final void p1() {
        J1(new HashMap());
        v1().put(0, 0);
        v1().put(1, 1);
        v1().put(2, 7);
        v1().put(3, 15);
        v1().put(4, 30);
        v1().put(5, 60);
        v1().put(6, 90);
        v1().put(7, 120);
        v1().put(8, 150);
        v1().put(9, 180);
        v1().put(10, 365);
    }

    public final void s1(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.shared_rc_diloge);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(y1().b("btn_dl_serv_close", "Close"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new p1(dialog, this));
        dialog.show();
    }

    public final HashMap v1() {
        HashMap hashMap = this.M;
        if (hashMap != null) {
            return hashMap;
        }
        l.v("hashMap");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final RcService x1() {
        RcService rcService = this.I;
        if (rcService != null) {
            return rcService;
        }
        l.v("retrofitService");
        return null;
    }

    public final ld.c y1() {
        ld.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final g z1() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }
}
