package uj;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.g;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse;
import com.nic.mparivahan.dlservices.data.model.idp.IdpGenSubmit;
import com.nic.mparivahan.dlservices.data.model.idp.IdpSubmitRequest;
import pl.x;

public final class d0 extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f31819e;

    /* renamed from: f  reason: collision with root package name */
    private y f31820f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f31821g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f31822h = new y();

    /* renamed from: i  reason: collision with root package name */
    private y f31823i = new y();

    /* renamed from: j  reason: collision with root package name */
    private y f31824j = new y();

    /* renamed from: k  reason: collision with root package name */
    private y f31825k = new y();

    /* synthetic */ class a extends k implements l {
        a(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }

        public final void k(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            ((y) this.f20212f).m(getAckDetForGivenDLNumberResponse);
        }
    }

    /* synthetic */ class b extends k implements l {
        b(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }

        public final void k(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            ((y) this.f20212f).m(getAckDetForGivenDLNumberResponse);
        }
    }

    /* synthetic */ class c extends k implements l {
        c(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetIdpCovGradesResponse) obj);
            return x.f30437a;
        }

        public final void k(GetIdpCovGradesResponse getIdpCovGradesResponse) {
            ((y) this.f20212f).m(getIdpCovGradesResponse);
        }
    }

    /* synthetic */ class d extends k implements l {
        d(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetNationsToApplyForResponse) obj);
            return x.f30437a;
        }

        public final void k(GetNationsToApplyForResponse getNationsToApplyForResponse) {
            ((y) this.f20212f).m(getNationsToApplyForResponse);
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f31826a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f31826a = lVar;
        }

        public final pl.c a() {
            return this.f31826a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f31826a.invoke(obj);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f31819e = application;
    }

    public final void g(IdpSubmitRequest idpSubmitRequest) {
        cm.l.f(idpSubmitRequest, "reqObj");
        try {
            this.f31823i.n(new wi.b(this.f31819e, idpSubmitRequest, (String) null, (String) null, (String) null, (String) null, 60, (g) null).b(), new e(new a(this.f31823i)));
        } catch (Exception unused) {
        }
    }

    public final void h(IdpGenSubmit idpGenSubmit) {
        cm.l.f(idpGenSubmit, "reqObj");
        try {
            this.f31823i.n(new wi.a(this.f31819e, idpGenSubmit, (String) null, (String) null, (String) null, (String) null, 60, (g) null).b(), new e(new b(this.f31823i)));
        } catch (Exception unused) {
        }
    }

    public final y i() {
        return this.f31823i;
    }

    public final y j() {
        return this.f31822h;
    }

    public final y k() {
        return this.f31820f;
    }

    public final void l() {
        try {
            this.f31822h.n(new wi.c(this.f31819e, (String) null, (String) null, (String) null, (String) null, 30, (g) null).b(), new e(new c(this.f31822h)));
        } catch (Exception unused) {
        }
    }

    public final void m() {
        try {
            this.f31820f.n(new wi.d(this.f31819e, (String) null, (String) null, (String) null, (String) null, 30, (g) null).b(), new e(new d(this.f31820f)));
        } catch (Exception unused) {
        }
    }
}
