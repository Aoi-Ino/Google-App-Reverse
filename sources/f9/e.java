package f9;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import com.nic.mparivahan.Citizen.Models.GetLastAccident;
import com.nic.mparivahan.R;
import e9.f;
import ld.g;
import pl.x;

public final class e extends i {

    /* renamed from: h0  reason: collision with root package name */
    private ni.c f11441h0;

    /* renamed from: i0  reason: collision with root package name */
    public k9.b f11442i0;

    /* renamed from: j0  reason: collision with root package name */
    public OffenceInterface f11443j0;

    /* renamed from: k0  reason: collision with root package name */
    public Context f11444k0;

    /* renamed from: l0  reason: collision with root package name */
    public ProgressDialog f11445l0;

    /* renamed from: m0  reason: collision with root package name */
    public g f11446m0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11447e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.f11447e = eVar;
        }

        public final void b(String str) {
            this.f11447e.e2().dismiss();
            this.f11447e.a2().f25584f.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11448e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.f11448e = eVar;
        }

        public final void b(String str) {
            this.f11448e.e2().dismiss();
            this.f11448e.a2().f25586h.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f11449a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f11449a = lVar;
        }

        public final pl.c a() {
            return this.f11449a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f11449a.invoke(obj);
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
    public final ni.c a2() {
        ni.c cVar = this.f11441h0;
        cm.l.c(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    public static final void g2(e eVar, GetLastAccident getLastAccident) {
        TextView textView;
        String str;
        TextView textView2;
        String str2;
        cm.l.f(eVar, "this$0");
        try {
            eVar.e2().dismiss();
            if (cm.l.a(getLastAccident.getStatusDesc(), "Success")) {
                eVar.a2().f25588j.setVisibility(8);
                eVar.a2().f25584f.setVisibility(0);
                eVar.a2().f25589k.setText(getLastAccident.getMparCitizenAccident().getAccdRegnNo());
                if (getLastAccident.getMparCitizenAccident().getAccdSubmittedAt().length() > 8) {
                    textView = eVar.a2().f25590l;
                    str = getLastAccident.getMparCitizenAccident().getAccdSubmittedAt().toString();
                } else {
                    textView = eVar.a2().f25590l;
                    str = "Not Available";
                }
                textView.setText(str);
                if (getLastAccident.getMparCitizenAccident().getAccdStatus() == 0) {
                    textView2 = eVar.a2().f25592n;
                    str2 = "Pending";
                } else {
                    textView2 = eVar.a2().f25592n;
                    str2 = "Active";
                }
                textView2.setText(str2);
                eVar.a2().f25591m.setText(getLastAccident.getMparCitizenAccident().getAccdLocation());
            } else if (cm.l.a(getLastAccident.getStatusDesc(), "No Record(s) Found.")) {
                eVar.a2().f25584f.setVisibility(8);
                eVar.a2().f25588j.setVisibility(0);
            } else {
                eVar.a2().f25584f.setVisibility(8);
                eVar.a2().f25588j.setVisibility(0);
                eVar.e2().dismiss();
            }
        } catch (Exception unused) {
            eVar.e2().dismiss();
            eVar.a2().f25584f.setVisibility(8);
            eVar.a2().f25588j.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void h2(e eVar, GetDashboardPojo getDashboardPojo) {
        ni.c a22;
        cm.l.f(eVar, "this$0");
        try {
            eVar.e2().dismiss();
            if (cm.l.a(getDashboardPojo.getStatusCode(), "ACCD001")) {
                eVar.a2().f25586h.setVisibility(0);
                eVar.a2().f25587i.setLayoutManager(new LinearLayoutManager(eVar.D1()));
                eVar.a2().f25587i.setAdapter(new f(getDashboardPojo.getContents(), eVar.b2()));
                return;
            }
            if (cm.l.a(getDashboardPojo.getStatusCode(), "ACCD099")) {
                eVar.e2().dismiss();
                a22 = eVar.a2();
            } else {
                eVar.e2().dismiss();
                a22 = eVar.a2();
            }
            a22.f25586h.setVisibility(8);
        } catch (Exception unused) {
            eVar.e2().dismiss();
            eVar.a2().f25586h.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(e eVar, View view) {
        q F0;
        androidx.fragment.app.x n10;
        androidx.fragment.app.x o10;
        androidx.fragment.app.x g10;
        cm.l.f(eVar, "this$0");
        y yVar = new y();
        j q10 = eVar.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, yVar)) != null && (g10 = o10.g((String) null)) != null) {
            g10.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void j2(e eVar, View view) {
        q F0;
        androidx.fragment.app.x n10;
        androidx.fragment.app.x o10;
        androidx.fragment.app.x g10;
        cm.l.f(eVar, "this$0");
        i iVar = new i();
        j q10 = eVar.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, iVar)) != null && (g10 = o10.g((String) null)) != null) {
            g10.h();
        }
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cm.l.f(layoutInflater, "inflater");
        this.f11441h0 = ni.c.c(layoutInflater, viewGroup, false);
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
        m2((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(c2()))).a(k9.b.class));
        d2().C(f2().k());
        j q10 = q();
        if (q10 != null) {
            d2().x().g(q10, new a(this));
        }
        j q11 = q();
        if (q11 != null) {
            d2().o().g(q11, new c(new a(this)));
        }
        d2().g(f2().k());
        j q12 = q();
        if (q12 != null) {
            d2().u().g(q12, new b(this));
        }
        j q13 = q();
        if (q13 != null) {
            d2().o().g(q13, new c(new b(this)));
        }
        a2().f25585g.setOnClickListener(new c(this));
        a2().f25582d.setOnClickListener(new d(this));
        super.b1(view, bundle);
    }

    public final Context b2() {
        Context context = this.f11444k0;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final OffenceInterface c2() {
        OffenceInterface offenceInterface = this.f11443j0;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        cm.l.v("mOffenceInterface");
        return null;
    }

    public final k9.b d2() {
        k9.b bVar = this.f11442i0;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ProgressDialog e2() {
        ProgressDialog progressDialog = this.f11445l0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final g f2() {
        g gVar = this.f11446m0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void k2(Context context) {
        cm.l.f(context, "<set-?>");
        this.f11444k0 = context;
    }

    public final void l2(OffenceInterface offenceInterface) {
        cm.l.f(offenceInterface, "<set-?>");
        this.f11443j0 = offenceInterface;
    }

    public final void m2(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.f11442i0 = bVar;
    }

    public final void n2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f11445l0 = progressDialog;
    }

    public final void o2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f11446m0 = gVar;
    }
}
