package jk;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.h;
import cm.k;
import org.json.JSONObject;
import pl.x;

public final class a extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f24607e;

    /* renamed from: f  reason: collision with root package name */
    private y f24608f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f24609g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f24610h = new y();

    /* renamed from: jk.a$a  reason: collision with other inner class name */
    /* synthetic */ class C0313a extends k implements l {
        C0313a(Object obj) {
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
            k((JSONObject) obj);
            return x.f30437a;
        }

        public final void k(JSONObject jSONObject) {
            ((y) this.f20212f).m(jSONObject);
        }
    }

    /* synthetic */ class c extends k implements l {
        c(Object obj) {
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

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f24611a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f24611a = lVar;
        }

        public final pl.c a() {
            return this.f24611a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f24611a.invoke(obj);
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
    public a(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f24607e = application;
    }

    public final void g(String str, String str2) {
        cm.l.f(str, "applicationNumber");
        cm.l.f(str2, "dob");
        this.f24608f.n(new ik.b(this.f24607e, str, str2).b(), new d(new C0313a(this.f24608f)));
    }

    public final y h() {
        return this.f24608f;
    }

    public final y i() {
        return this.f24609g;
    }

    public final y j() {
        return this.f24610h;
    }

    public final void k(String str, String str2, String str3) {
        cm.l.f(str, "rtocd");
        cm.l.f(str2, "campid");
        cm.l.f(str3, "campcd");
        this.f24609g.n(new ik.c(this.f24607e, str, str2, str3).b(), new d(new b(this.f24609g)));
    }

    public final void l(String str, String str2, String str3, String str4, String str5, String str6) {
        cm.l.f(str, "rtocd");
        cm.l.f(str2, "applNo");
        cm.l.f(str3, "slotDate");
        cm.l.f(str4, "slotNo");
        cm.l.f(str5, "campid");
        cm.l.f(str6, "campcd");
        this.f24610h.n(new ik.a(this.f24607e, str, str2, str3, str4, str5, str6).b(), new d(new c(this.f24610h)));
    }
}
