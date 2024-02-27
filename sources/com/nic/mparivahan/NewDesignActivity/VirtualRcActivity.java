package com.nic.mparivahan.NewDesignActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cc.d0;
import cc.e0;
import cc.f0;
import cm.h;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import java.util.ArrayList;
import ld.g;
import ni.na;
import pl.x;

public final class VirtualRcActivity extends androidx.appcompat.app.d implements zc.b {
    private na G;
    public DatabaseHelper H;
    public g I;
    public ArrayList J;
    public dc.d K;
    private int L;
    public String M;
    public ProgressDialog N;
    public cd.c O;
    public RcService P;
    private final String Q = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcActivity f9273e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VirtualRcActivity virtualRcActivity) {
            super(1);
            this.f9273e = virtualRcActivity;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            Toast makeText;
            try {
                this.f9273e.o1().dismiss();
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f9273e.m1().I(this.f9273e.n1());
                        this.f9273e.j1().X(this.f9273e.p1());
                        VirtualRcActivity virtualRcActivity = this.f9273e;
                        virtualRcActivity.D1(virtualRcActivity, "Virtual RC successfully deleted!");
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        makeText = Toast.makeText(this.f9273e.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1);
                    }
                } else {
                    makeText = p.o(myRcDeletResponse.getStatusCode(), "VTLD007", true) ? Toast.makeText(this.f9273e.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1) : Toast.makeText(this.f9273e.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1);
                    makeText.show();
                }
            } catch (Exception e11) {
                this.f9273e.o1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                e11.printStackTrace();
                Toast.makeText(this.f9273e.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcActivity f9274e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VirtualRcActivity virtualRcActivity) {
            super(1);
            this.f9274e = virtualRcActivity;
        }

        public final void b(String str) {
            this.f9274e.o1().dismiss();
            Toast.makeText(this.f9274e.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcActivity f9275e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VirtualRcActivity virtualRcActivity) {
            super(1);
            this.f9275e = virtualRcActivity;
        }

        public final void b(RcModelsDet rcModelsDet) {
            this.f9275e.o1().dismiss();
            try {
                if (p.o(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    VirtualRcActivity virtualRcActivity = this.f9275e;
                    virtualRcActivity.D1(virtualRcActivity, "Virtual RC successfully updated!");
                    return;
                }
                VirtualRcActivity virtualRcActivity2 = this.f9275e;
                virtualRcActivity2.D1(virtualRcActivity2, "Unable to Update the Virtual RC, Please try after some times!");
            } catch (Exception unused) {
                this.f9275e.o1().dismiss();
                VirtualRcActivity virtualRcActivity3 = this.f9275e;
                virtualRcActivity3.D1(virtualRcActivity3, "Unable to Update the Virtual RC, Please try after some times!");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RcModelsDet) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcActivity f9276e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VirtualRcActivity virtualRcActivity) {
            super(1);
            this.f9276e = virtualRcActivity;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            if (cm.l.a(myRcDeletResponse.getStatusCode(), "VTLD001")) {
                this.f9276e.l1().N(this.f9276e.p1().toString(), this.f9276e.q1().k(), this.f9276e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualRcActivity f9277e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VirtualRcActivity virtualRcActivity) {
            super(1);
            this.f9277e = virtualRcActivity;
        }

        public final void b(String str) {
            if (this.f9277e.o1().isShowing()) {
                this.f9277e.o1().dismiss();
            }
            VirtualRcActivity virtualRcActivity = this.f9277e;
            virtualRcActivity.D1(virtualRcActivity, "Unable to Update the Virtual RC, Please try after some times!");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9278a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f9278a = lVar;
        }

        public final pl.c a() {
            return this.f9278a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9278a.invoke(obj);
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
    public static final void E1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void r1() {
        y1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(k1()))).a(cd.c.class));
        na naVar = this.G;
        na naVar2 = null;
        if (naVar == null) {
            cm.l.v("binding");
            naVar = null;
        }
        naVar.f27673d.setNestedScrollingEnabled(false);
        na naVar3 = this.G;
        if (naVar3 == null) {
            cm.l.v("binding");
            naVar3 = null;
        }
        naVar3.f27675f.f28305f.setOnClickListener(new d0(this));
        na naVar4 = this.G;
        if (naVar4 == null) {
            cm.l.v("binding");
            naVar4 = null;
        }
        naVar4.f27675f.f28306g.setOnClickListener(new e0(this));
        na naVar5 = this.G;
        if (naVar5 == null) {
            cm.l.v("binding");
            naVar5 = null;
        }
        naVar5.f27672c.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ArrayList D0 = j1().D0();
        cm.l.d(D0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails>");
        v1(D0);
        if (i1().size() > 0) {
            Log.e("test", "1");
            na naVar6 = this.G;
            if (naVar6 == null) {
                cm.l.v("binding");
                naVar6 = null;
            }
            naVar6.f27674e.setVisibility(8);
            na naVar7 = this.G;
            if (naVar7 == null) {
                cm.l.v("binding");
                naVar7 = null;
            }
            naVar7.f27672c.setVisibility(0);
            na naVar8 = this.G;
            if (naVar8 == null) {
                cm.l.v("binding");
                naVar8 = null;
            }
            naVar8.f27672c.setAdapter((RecyclerView.h) null);
            z1(new dc.d(i1(), this, this));
            na naVar9 = this.G;
            if (naVar9 == null) {
                cm.l.v("binding");
            } else {
                naVar2 = naVar9;
            }
            naVar2.f27672c.setAdapter(m1());
        } else {
            na naVar10 = this.G;
            if (naVar10 == null) {
                cm.l.v("binding");
                naVar10 = null;
            }
            naVar10.f27672c.setAdapter((RecyclerView.h) null);
            na naVar11 = this.G;
            if (naVar11 == null) {
                cm.l.v("binding");
                naVar11 = null;
            }
            naVar11.f27672c.setVisibility(8);
            na naVar12 = this.G;
            if (naVar12 == null) {
                cm.l.v("binding");
                naVar12 = null;
            }
            naVar12.f27674e.setVisibility(0);
            na naVar13 = this.G;
            if (naVar13 == null) {
                cm.l.v("binding");
            } else {
                naVar2 = naVar13;
            }
            naVar2.f27674e.setText("No Virtual RC Found");
        }
        l1().z().g(this, new f(new a(this)));
        l1().A().g(this, new f(new b(this)));
        l1().O().g(this, new f(new c(this)));
        l1().U().g(this, new f(new d(this)));
        l1().T().g(this, new f(new e(this)));
    }

    /* access modifiers changed from: private */
    public static final void s1(VirtualRcActivity virtualRcActivity, View view) {
        cm.l.f(virtualRcActivity, "this$0");
        virtualRcActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void t1(VirtualRcActivity virtualRcActivity, View view) {
        cm.l.f(virtualRcActivity, "this$0");
        virtualRcActivity.u1();
    }

    private final void u1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.N = progressDialog;
    }

    public final void B1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void C1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.I = gVar;
    }

    public final void D1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new f0(dialog));
        dialog.show();
    }

    public void P(String str, int i10) {
        if (j1().s0(str) != null) {
            cm.l.c(str);
            B1(str);
            o1().show();
            String s02 = j1().s0(str);
            cd.c l12 = l1();
            cm.l.c(s02);
            l12.a0(s02, "RC", this);
        }
    }

    public final ArrayList i1() {
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("arrayList");
        return null;
    }

    public final DatabaseHelper j1() {
        DatabaseHelper databaseHelper = this.H;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final RcService k1() {
        RcService rcService = this.P;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c l1() {
        cd.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final dc.d m1() {
        dc.d dVar = this.K;
        if (dVar != null) {
            return dVar;
        }
        cm.l.v("myRcAdapter");
        return null;
    }

    public void n(String str, int i10) {
        this.L = i10;
        B1(String.valueOf(str));
        if (j1().s0(str) != null) {
            o1().show();
            String s02 = j1().s0(str);
            cd.c l12 = l1();
            cm.l.c(s02);
            l12.i(s02, this);
        }
    }

    public final int n1() {
        return this.L;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.N;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.doc_virtual_rc);
        na c10 = na.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        x1(RcService.f9484a.c(this));
        C1(new g(this));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        w1(A0);
        A1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        r1();
    }

    public final String p1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("selectedRcNumber");
        return null;
    }

    public final g q1() {
        g gVar = this.I;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void v1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.J = arrayList;
    }

    public final void w1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void x1(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.P = rcService;
    }

    public final void y1(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void z1(dc.d dVar) {
        cm.l.f(dVar, "<set-?>");
        this.K = dVar;
    }
}
