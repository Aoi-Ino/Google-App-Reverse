package pj;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import pl.c;
import pl.x;

public final class b extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f30401e;

    /* renamed from: f  reason: collision with root package name */
    private y f30402f = new y();

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

    /* renamed from: pj.b$b  reason: collision with other inner class name */
    static final class C0333b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f30403a;

        C0333b(l lVar) {
            cm.l.f(lVar, "function");
            this.f30403a = lVar;
        }

        public final c a() {
            return this.f30403a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f30403a.invoke(obj);
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
    public b(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f30401e = application;
    }

    public final void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        cm.l.f(str8, "mobileNumber");
        cm.l.f(str11, "eKYCId");
        cm.l.f(str12, "eKYCOpted");
        cm.l.f(str13, "eKYCGender");
        cm.l.f(str14, "eKYCPhoto");
        try {
            this.f30402f.n(new a(this.f30401e, str, str9, str3, str6, str7, str8, str10, str2, str5, str4, str11, str12, str13, str14).c(), new C0333b(new a(this.f30402f)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final y h() {
        return this.f30402f;
    }
}
