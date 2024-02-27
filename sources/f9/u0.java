package f9;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import androidx.fragment.app.q;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetDashboardPojo;
import com.nic.mparivahan.Citizen.Models.GetLastViolation;
import com.nic.mparivahan.R;
import e9.f;
import ld.g;
import ni.id;
import pl.x;

public final class u0 extends i {

    /* renamed from: h0  reason: collision with root package name */
    private id f11532h0;

    /* renamed from: i0  reason: collision with root package name */
    public k9.b f11533i0;

    /* renamed from: j0  reason: collision with root package name */
    public OffenceInterface f11534j0;

    /* renamed from: k0  reason: collision with root package name */
    public Context f11535k0;

    /* renamed from: l0  reason: collision with root package name */
    public ProgressDialog f11536l0;

    /* renamed from: m0  reason: collision with root package name */
    public g f11537m0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u0 f11538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u0 u0Var) {
            super(1);
            this.f11538e = u0Var;
        }

        public final void b(String str) {
            this.f11538e.e2().dismiss();
            this.f11538e.a2().f26877f.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u0 f11539e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u0 u0Var) {
            super(1);
            this.f11539e = u0Var;
        }

        public final void b(String str) {
            this.f11539e.e2().dismiss();
            this.f11539e.a2().f26879h.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f11540a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f11540a = lVar;
        }

        public final pl.c a() {
            return this.f11540a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f11540a.invoke(obj);
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
    public final id a2() {
        id idVar = this.f11532h0;
        cm.l.c(idVar);
        return idVar;
    }

    /* access modifiers changed from: private */
    public static final void g2(u0 u0Var, GetLastViolation getLastViolation) {
        TextView textView;
        String str;
        TextView textView2;
        String str2;
        cm.l.f(u0Var, "this$0");
        try {
            u0Var.e2().dismiss();
            if (p.o(getLastViolation.getStatusCode().toString(), "TRV001", true)) {
                u0Var.a2().f26881j.setVisibility(8);
                u0Var.a2().f26877f.setVisibility(0);
                u0Var.a2().f26882k.setText(getLastViolation.getCitizenViolation().getViolRegnNo());
                if (getLastViolation.getCitizenViolation().getViolSubmittedAt().length() > 8) {
                    textView = u0Var.a2().f26883l;
                    str = getLastViolation.getCitizenViolation().getViolSubmittedAt();
                } else {
                    textView = u0Var.a2().f26883l;
                    str = "Not Available";
                }
                textView.setText(str);
                if (getLastViolation.getCitizenViolation().getViolStatus() == 0) {
                    textView2 = u0Var.a2().f26885n;
                    str2 = "Pending";
                } else {
                    textView2 = u0Var.a2().f26885n;
                    str2 = "Active";
                }
                textView2.setText(str2);
                u0Var.a2().f26884m.setText(getLastViolation.getCitizenViolation().getViolLocation());
            } else if (cm.l.a(getLastViolation.getStatusCode(), "TRV099")) {
                u0Var.a2().f26877f.setVisibility(8);
                u0Var.a2().f26881j.setVisibility(0);
            } else {
                u0Var.a2().f26877f.setVisibility(8);
                u0Var.a2().f26881j.setVisibility(0);
                u0Var.e2().dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            u0Var.e2().dismiss();
            u0Var.a2().f26877f.setVisibility(8);
            u0Var.a2().f26881j.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void h2(u0 u0Var, GetDashboardPojo getDashboardPojo) {
        CardView cardView;
        cm.l.f(u0Var, "this$0");
        try {
            u0Var.e2().dismiss();
            if (p.o(getDashboardPojo.getStatusCode().toString(), "TRV001", true)) {
                u0Var.a2().f26879h.setVisibility(0);
                u0Var.a2().f26880i.setLayoutManager(new LinearLayoutManager(u0Var.D1()));
                u0Var.a2().f26880i.setAdapter(new f(getDashboardPojo.getContents(), u0Var.b2()));
                return;
            }
            if (cm.l.a(getDashboardPojo.getStatusCode(), "TRV099")) {
                u0Var.e2().dismiss();
                cardView = u0Var.a2().f26879h;
            } else {
                u0Var.e2().dismiss();
                cardView = u0Var.a2().f26879h;
            }
            cardView.setVisibility(8);
        } catch (Exception e10) {
            e10.printStackTrace();
            u0Var.e2().dismiss();
            u0Var.a2().f26879h.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(u0 u0Var, View view) {
        q F0;
        androidx.fragment.app.x n10;
        androidx.fragment.app.x o10;
        androidx.fragment.app.x g10;
        cm.l.f(u0Var, "this$0");
        p0 p0Var = new p0();
        j q10 = u0Var.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, p0Var)) != null && (g10 = o10.g((String) null)) != null) {
            g10.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void j2(u0 u0Var, View view) {
        q F0;
        androidx.fragment.app.x n10;
        androidx.fragment.app.x o10;
        androidx.fragment.app.x g10;
        cm.l.f(u0Var, "this$0");
        m mVar = new m();
        j q10 = u0Var.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, mVar)) != null && (g10 = o10.g((String) null)) != null) {
            g10.h();
        }
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cm.l.f(layoutInflater, "inflater");
        this.f11532h0 = id.c(layoutInflater, viewGroup, false);
        return a2().b();
    }

    public void b1(View view, Bundle bundle) {
        cm.l.f(view, "view");
        j D1 = D1();
        cm.l.e(D1, "requireActivity(...)");
        k2(D1);
        o2(new g(D1()));
        l2(OffenceInterface.f7826a.b(b2()));
        n2(new ProgressDialog(D1()));
        e2().setMessage("Please wait...");
        e2().setCancelable(false);
        e2().setCanceledOnTouchOutside(false);
        m2((k9.b) new androidx.lifecycle.u0((x0) this, (u0.b) new k9.a(new i9.a(c2()))).a(k9.b.class));
        d2().D(f2().k());
        j q10 = q();
        if (q10 != null) {
            d2().y().g(q10, new q0(this));
        }
        j q11 = q();
        if (q11 != null) {
            d2().o().g(q11, new c(new a(this)));
        }
        d2().k(f2().k());
        j q12 = q();
        if (q12 != null) {
            d2().w().g(q12, new r0(this));
        }
        j q13 = q();
        if (q13 != null) {
            d2().o().g(q13, new c(new b(this)));
        }
        a2().f26878g.setOnClickListener(new s0(this));
        a2().f26875d.setOnClickListener(new t0(this));
        super.b1(view, bundle);
    }

    public final Context b2() {
        Context context = this.f11535k0;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final OffenceInterface c2() {
        OffenceInterface offenceInterface = this.f11534j0;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        cm.l.v("mOffenceInterface");
        return null;
    }

    public final k9.b d2() {
        k9.b bVar = this.f11533i0;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ProgressDialog e2() {
        ProgressDialog progressDialog = this.f11536l0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final g f2() {
        g gVar = this.f11537m0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void k2(Context context) {
        cm.l.f(context, "<set-?>");
        this.f11535k0 = context;
    }

    public final void l2(OffenceInterface offenceInterface) {
        cm.l.f(offenceInterface, "<set-?>");
        this.f11534j0 = offenceInterface;
    }

    public final void m2(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.f11533i0 = bVar;
    }

    public final void n2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f11536l0 = progressDialog;
    }

    public final void o2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f11537m0 = gVar;
    }
}
