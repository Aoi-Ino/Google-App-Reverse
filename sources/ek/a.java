package ek;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.g;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import pl.x;

public final class a extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f23046e;

    /* renamed from: f  reason: collision with root package name */
    private y f23047f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f23048g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f23049h = new y();

    /* renamed from: i  reason: collision with root package name */
    private y f23050i = new y();

    /* renamed from: ek.a$a  reason: collision with other inner class name */
    /* synthetic */ class C0288a extends k implements l {
        C0288a(Object obj) {
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
            k((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }

        public final void k(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            ((y) this.f20212f).m(getAckDetForGivenDLNumberResponse);
        }
    }

    /* synthetic */ class d extends k implements l {
        d(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetReasonsTransWiseResponse) obj);
            return x.f30437a;
        }

        public final void k(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            ((y) this.f20212f).m(getReasonsTransWiseResponse);
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f23051a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f23051a = lVar;
        }

        public final pl.c a() {
            return this.f23051a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f23051a.invoke(obj);
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
        this.f23046e = application;
    }

    public final void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        cm.l.f(str10, "conEffdate");
        cm.l.f(str13, "relFirstName");
        cm.l.f(str14, "relLastName");
        cm.l.f(str15, "mobileNumber");
        cm.l.f(str16, "agentId");
        cm.l.f(str17, "agentPwd");
        cm.l.f(str18, "agentIpAddress");
        cm.l.f(str19, "agentServiceName");
        cm.l.f(str20, "eKYCId");
        cm.l.f(str21, "eKYCOpted");
        cm.l.f(str22, "eKYCGender");
        cm.l.f(str23, "eKYCPhoto");
        try {
            this.f23050i.n(new ij.a(this.f23046e, str, str2, str3, str4, str5, str6, str7, i10, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23).c(), new e(new C0288a(this.f23050i)));
        } catch (Exception unused) {
        }
    }

    public final void h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        cm.l.f(str8, "mobileNumber");
        cm.l.f(str9, "eKYCId");
        cm.l.f(str10, "eKYCOpted");
        cm.l.f(str11, "eKYCGender");
        cm.l.f(str12, "eKYCPhoto");
        try {
            this.f23048g.n(new ui.a(this.f23046e, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12).c(), new e(new b(this.f23048g)));
        } catch (Exception unused) {
        }
    }

    public final void i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        cm.l.f(str8, "mobileNumber");
        cm.l.f(str9, "eKYCId");
        cm.l.f(str10, "eKYCOpted");
        cm.l.f(str11, "eKYCGender");
        cm.l.f(str12, "eKYCPhoto");
        try {
            this.f23049h.n(new yi.a(this.f23046e, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12).b(), new e(new c(this.f23049h)));
        } catch (Exception unused) {
        }
    }

    public final y j() {
        return this.f23050i;
    }

    public final y k() {
        return this.f23048g;
    }

    public final y l() {
        return this.f23049h;
    }

    public final y m() {
        return this.f23047f;
    }

    public final void n(String str) {
        cm.l.f(str, "transCode");
        try {
            this.f23047f.n(new ui.b(this.f23046e, str, (String) null, (String) null, (String) null, (String) null, 60, (g) null).b(), new e(new d(this.f23047f)));
        } catch (Exception unused) {
        }
    }
}
