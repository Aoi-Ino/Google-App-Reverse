package bk;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.g;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import java.util.Map;
import pl.x;

public final class a extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f19948e;

    /* renamed from: f  reason: collision with root package name */
    private y f19949f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f19950g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f19951h = new y();

    /* renamed from: bk.a$a  reason: collision with other inner class name */
    /* synthetic */ class C0263a extends k implements l {
        C0263a(Object obj) {
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

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f19952a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f19952a = lVar;
        }

        public final pl.c a() {
            return this.f19952a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19952a.invoke(obj);
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

    /* synthetic */ class d extends k implements l {
        d(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((DlRenewalSaveDto) obj);
            return x.f30437a;
        }

        public final void k(DlRenewalSaveDto dlRenewalSaveDto) {
            ((y) this.f20212f).m(dlRenewalSaveDto);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f19948e = application;
    }

    public final y g() {
        return this.f19949f;
    }

    public final y h() {
        return this.f19950g;
    }

    public final y i() {
        return this.f19951h;
    }

    public final void j(ck.a aVar) {
        cm.l.f(aVar, "reqObj");
        try {
            this.f19950g.n(new ck.b(this.f19948e, aVar, (String) null, (String) null, (String) null, (String) null, 60, (g) null).b(), new c(new C0263a(this.f19950g)));
        } catch (Exception unused) {
        }
    }

    public final void k(m mVar) {
        cm.l.f(mVar, "reqObj");
        try {
            this.f19950g.n(new n(this.f19948e, mVar, (String) null, (String) null, (String) null, (String) null, 60, (g) null).b(), new c(new b(this.f19950g)));
        } catch (Exception unused) {
        }
    }

    public final void l(String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10 = str;
        cm.l.f(str, "dlNumber");
        cm.l.f(str2, "dob");
        cm.l.f(str3, "rtoCode");
        cm.l.f(str4, "applcatgDLserReq");
        cm.l.f(str5, "mobileNumber");
        cm.l.f(str6, "eKYCId");
        cm.l.f(str7, "eKYCOpted");
        cm.l.f(str8, "eKYCGender");
        cm.l.f(str9, "eKYCPhoto");
        try {
            this.f19949f.n(new ti.g(this.f19948e, str, str2, str3, map, str4, str5, str6, str7, str8, str9).b(), new c(new d(this.f19949f)));
        } catch (Exception unused) {
        }
    }
}
