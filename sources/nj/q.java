package nj;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import com.nic.mparivahan.dlservices.data.model.UploadDocFlowResponse;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse;
import com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse;
import com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import fj.p;
import java.util.List;
import pl.x;
import ti.i;
import ti.j;

public final class q extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f29826e;

    /* renamed from: f  reason: collision with root package name */
    private y f29827f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f29828g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f29829h = new y();

    /* renamed from: i  reason: collision with root package name */
    private y f29830i = new y();

    /* renamed from: j  reason: collision with root package name */
    private y f29831j = new y();

    /* renamed from: k  reason: collision with root package name */
    private y f29832k = new y();

    /* renamed from: l  reason: collision with root package name */
    private y f29833l = new y();

    /* synthetic */ class a extends k implements l {
        a(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((DlApplStatusResponse) obj);
            return x.f30437a;
        }

        public final void k(DlApplStatusResponse dlApplStatusResponse) {
            ((y) this.f20212f).m(dlApplStatusResponse);
        }
    }

    /* synthetic */ class b extends k implements l {
        b(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((DlApplStatusDto) obj);
            return x.f30437a;
        }

        public final void k(DlApplStatusDto dlApplStatusDto) {
            ((y) this.f20212f).m(dlApplStatusDto);
        }
    }

    /* synthetic */ class c extends k implements l {
        c(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((UploadDocListResponse) obj);
            return x.f30437a;
        }

        public final void k(UploadDocListResponse uploadDocListResponse) {
            ((y) this.f20212f).m(uploadDocListResponse);
        }
    }

    /* synthetic */ class d extends k implements l {
        d(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((UploadDocListResponse) obj);
            return x.f30437a;
        }

        public final void k(UploadDocListResponse uploadDocListResponse) {
            ((y) this.f20212f).m(uploadDocListResponse);
        }
    }

    /* synthetic */ class e extends k implements l {
        e(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((InsertedUploadDocResponse) obj);
            return x.f30437a;
        }

        public final void k(InsertedUploadDocResponse insertedUploadDocResponse) {
            ((y) this.f20212f).m(insertedUploadDocResponse);
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f29834a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f29834a = lVar;
        }

        public final pl.c a() {
            return this.f29834a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f29834a.invoke(obj);
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

    /* synthetic */ class g extends k implements l {
        g(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((UploadDocFlowResponse) obj);
            return x.f30437a;
        }

        public final void k(UploadDocFlowResponse uploadDocFlowResponse) {
            ((y) this.f20212f).m(uploadDocFlowResponse);
        }
    }

    /* synthetic */ class h extends k implements l {
        h(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((UploadedDocResponse) obj);
            return x.f30437a;
        }

        public final void k(UploadedDocResponse uploadedDocResponse) {
            ((y) this.f20212f).m(uploadedDocResponse);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f29826e = application;
    }

    public final void g(String str, String str2) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        try {
            this.f29827f.n(new p(this.f29826e, str, str2).b(), new f(new a(this.f29827f)));
        } catch (Exception unused) {
        }
    }

    public final void h(String str, String str2) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        try {
            this.f29828g.n(new i(this.f29826e, new DlStatusRequest(str, com.nic.mparivahan.dlservices.utilities.e.k(str2, "dd-MM-yyyy", "dd/MM/yyyy"))).b(), new f(new b(this.f29828g)));
        } catch (Exception unused) {
        }
    }

    public final void i(String str, String str2, String str3) {
        cm.l.f(str, "applicationNumber");
        cm.l.f(str2, "stateCd");
        cm.l.f(str3, "serviceCode");
        try {
            this.f29830i.n(new ti.c(this.f29826e, str, str2, str3).c(), new f(new c(this.f29830i)));
        } catch (Exception unused) {
        }
    }

    public final y j() {
        return this.f29830i;
    }

    public final y k() {
        return this.f29829h;
    }

    public final y l() {
        return this.f29831j;
    }

    public final void m(String str, String str2, String str3, String str4) {
        cm.l.f(str, "applicationNumber");
        cm.l.f(str2, "stateCd");
        cm.l.f(str3, "serviceCode");
        cm.l.f(str4, "apdApplicant");
        try {
            this.f29829h.n(new ti.d(this.f29826e, str, str2, str3, str4).c(), new f(new d(this.f29829h)));
        } catch (Exception unused) {
        }
    }

    public final y n() {
        return this.f29827f;
    }

    public final y o() {
        return this.f29828g;
    }

    public final void p(String str, String str2) {
        cm.l.f(str, "applicationNumber");
        cm.l.f(str2, "stateCd");
        try {
            this.f29831j.n(new ti.e(this.f29826e, str, str2).b(), new f(new e(this.f29831j)));
        } catch (Exception unused) {
        }
    }

    public final y q() {
        return this.f29832k;
    }

    public final void r(String str, String str2, String str3, String str4) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "transCode");
        cm.l.f(str3, "stateCode");
        cm.l.f(str4, "rtoCode");
        try {
            this.f29833l.n(new j(this.f29826e, str, str2, str3, str4, 0, (String) null, 96, (cm.g) null).b(), new f(new g(this.f29833l)));
        } catch (Exception unused) {
        }
    }

    public final void s(String str, List list) {
        cm.l.f(str, "rtoCode");
        cm.l.f(list, "docs");
        try {
            this.f29832k.n(new ti.f(this.f29826e, str, list).a(), new f(new h(this.f29832k)));
        } catch (Exception unused) {
        }
    }
}
