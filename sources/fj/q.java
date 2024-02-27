package fj;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import com.nic.mparivahan.dlservices.utilities.e;
import org.json.JSONObject;
import pl.x;
import ti.i;

public final class q extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f23559e;

    /* renamed from: f  reason: collision with root package name */
    private y f23560f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f23561g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f23562h = new y();

    /* synthetic */ class a extends k implements l {
        a(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((JSONObject) obj);
            return x.f30437a;
        }

        public final void k(JSONObject jSONObject) {
            ((y) this.f20212f).m(jSONObject);
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
            k((DlApplStatusDto) obj);
            return x.f30437a;
        }

        public final void k(DlApplStatusDto dlApplStatusDto) {
            ((y) this.f20212f).m(dlApplStatusDto);
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f23563a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f23563a = lVar;
        }

        public final pl.c a() {
            return this.f23563a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f23563a.invoke(obj);
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
    public q(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f23559e = application;
    }

    public final void g(String str, String str2) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        this.f23561g.n(new fk.h(this.f23559e, str, str2).a(), new d(new a(this.f23561g)));
    }

    public final void h(String str, String str2) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        this.f23560f.n(new i(this.f23559e, new DlStatusRequest(str, e.k(str2, "dd-MM-yyyy", "dd/MM/yyyy"))).b(), new d(new b(this.f23560f)));
    }

    public final void i(String str, String str2) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        this.f23562h.n(new i(this.f23559e, new DlStatusRequest(str, str2)).b(), new d(new c(this.f23562h)));
    }

    public final y j() {
        return this.f23561g;
    }

    public final y k() {
        return this.f23562h;
    }

    public final y l() {
        return this.f23560f;
    }
}
