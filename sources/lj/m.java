package lj;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.g;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen;
import pl.x;

public final class m extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f24874e;

    /* renamed from: f  reason: collision with root package name */
    private y f24875f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f24876g = new y();

    /* synthetic */ class a extends k implements l {
        a(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetAckDetEx) obj);
            return x.f30437a;
        }

        public final void k(GetAckDetEx getAckDetEx) {
            ((y) this.f20212f).m(getAckDetEx);
        }
    }

    /* synthetic */ class b extends k implements l {
        b(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetAckDetEx) obj);
            return x.f30437a;
        }

        public final void k(GetAckDetEx getAckDetEx) {
            ((y) this.f20212f).m(getAckDetEx);
        }
    }

    /* synthetic */ class c extends k implements l {
        c(Object obj) {
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

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f24877a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f24877a = lVar;
        }

        public final pl.c a() {
            return this.f24877a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f24877a.invoke(obj);
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
    public m(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f24874e = application;
    }

    public final void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        cm.l.f(str8, "mobileNumber");
        cm.l.f(str9, "eKYCId");
        cm.l.f(str10, "eKYCOpted");
        cm.l.f(str11, "eKYCGender");
        cm.l.f(str12, "eKYCPhoto");
        try {
            this.f24876g.n(new n(this.f24874e, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12).b(), new d(new a(this.f24876g)));
        } catch (Exception unused) {
        }
    }

    public final void h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        cm.l.f(str8, "presHouseNo");
        cm.l.f(str9, "presStreet");
        cm.l.f(str10, "presLocation");
        cm.l.f(str11, "presVillageOrTown");
        cm.l.f(str12, "presSubDistrict");
        cm.l.f(str13, "presDistrict");
        cm.l.f(str14, "presState");
        cm.l.f(str15, "presPincode");
        cm.l.f(str16, "perHouseNo");
        cm.l.f(str17, "perStreet");
        cm.l.f(str18, "perLocation");
        cm.l.f(str19, "permVillageOrTown");
        cm.l.f(str20, "perSubDistrict");
        cm.l.f(str21, "perDistrict");
        cm.l.f(str22, "perState");
        cm.l.f(str23, "perPinCode");
        cm.l.f(str24, "mobileNumber");
        cm.l.f(str25, "eKYCId");
        cm.l.f(str26, "eKYCOpted");
        cm.l.f(str27, "eKYCGender");
        cm.l.f(str28, "eKYCPhoto");
        try {
            this.f24876g.n(new GetAckNumberGen(this.f24874e, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28).getDlResponseData(), new d(new b(this.f24876g)));
        } catch (Exception unused) {
        }
    }

    public final y i() {
        return this.f24875f;
    }

    public final y j() {
        return this.f24876g;
    }

    public final void k() {
        try {
            this.f24875f.n(new l(this.f24874e, (String) null, (String) null, (String) null, (String) null, (String) null, 62, (g) null).b(), new d(new c(this.f24875f)));
        } catch (Exception unused) {
        }
    }
}
