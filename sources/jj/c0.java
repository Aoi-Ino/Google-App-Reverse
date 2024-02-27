package jj;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.g;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import pl.x;
import ti.m;

public final class c0 extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f24579e;

    /* renamed from: f  reason: collision with root package name */
    private y f24580f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f24581g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f24582h = new y();

    /* renamed from: i  reason: collision with root package name */
    private y f24583i = new y();

    /* renamed from: j  reason: collision with root package name */
    private y f24584j = new y();

    /* synthetic */ class a extends k implements l {
        a(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((DistResponse) obj);
            return x.f30437a;
        }

        public final void k(DistResponse distResponse) {
            ((y) this.f20212f).m(distResponse);
        }
    }

    /* synthetic */ class b extends k implements l {
        b(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((StateResponse) obj);
            return x.f30437a;
        }

        public final void k(StateResponse stateResponse) {
            ((y) this.f20212f).m(stateResponse);
        }
    }

    /* synthetic */ class c extends k implements l {
        c(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((TalukaResponse) obj);
            return x.f30437a;
        }

        public final void k(TalukaResponse talukaResponse) {
            ((y) this.f20212f).m(talukaResponse);
        }
    }

    /* synthetic */ class d extends k implements l {
        d(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((VillageOrTownResponse) obj);
            return x.f30437a;
        }

        public final void k(VillageOrTownResponse villageOrTownResponse) {
            ((y) this.f20212f).m(villageOrTownResponse);
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f24585a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f24585a = lVar;
        }

        public final pl.c a() {
            return this.f24585a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f24585a.invoke(obj);
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

    /* synthetic */ class f extends k implements l {
        f(Object obj) {
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
    public c0(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f24579e = application;
    }

    public final void g(String str) {
        cm.l.f(str, "stateCd");
        try {
            this.f24581g.n(new ti.b(this.f24579e, str, (String) null, (String) null, (String) null, (String) null, 60, (g) null).b(), new e(new a(this.f24581g)));
        } catch (Exception unused) {
        }
    }

    public final y h() {
        return this.f24581g;
    }

    public final y i() {
        return this.f24580f;
    }

    public final y j() {
        return this.f24584j;
    }

    public final y k() {
        return this.f24582h;
    }

    public final y l() {
        return this.f24583i;
    }

    public final void m() {
        try {
            this.f24580f.n(new ti.k(this.f24579e, (String) null, (String) null, (String) null, (String) null, 30, (g) null).b(), new e(new b(this.f24580f)));
        } catch (Exception unused) {
        }
    }

    public final void n(String str, String str2) {
        cm.l.f(str, "stateCd");
        cm.l.f(str2, "distCd");
        try {
            this.f24582h.n(new ti.l(this.f24579e, str, str2, (String) null, (String) null, (String) null, (String) null, 120, (g) null).b(), new e(new c(this.f24582h)));
        } catch (Exception unused) {
        }
    }

    public final void o(String str, String str2, String str3, String str4) {
        String str5 = str;
        cm.l.f(str, "stateCd");
        cm.l.f(str2, "distCd");
        cm.l.f(str3, "subDistCd");
        cm.l.f(str4, "villageOrTown");
        try {
            this.f24583i.n(new m(this.f24579e, str, str2, str3, str4, (String) null, (String) null, (String) null, (String) null, 480, (g) null).b(), new e(new d(this.f24583i)));
        } catch (Exception unused) {
        }
    }

    public final void p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        cm.l.f(str, "dlno");
        cm.l.f(str2, "dob");
        cm.l.f(str3, "rtoCodeDLTr");
        cm.l.f(str4, "applcatgDLserReq");
        cm.l.f(str5, "changeOfAddReq");
        cm.l.f(str6, "perHouseNo");
        cm.l.f(str7, "perStreet");
        cm.l.f(str8, "perLocation");
        cm.l.f(str9, "permVillageOrTown");
        cm.l.f(str10, "perSubDistrict");
        cm.l.f(str11, "perDistrict");
        cm.l.f(str12, "perState");
        cm.l.f(str13, "perPinCode");
        cm.l.f(str14, "presHouseNo");
        cm.l.f(str15, "presStreet");
        cm.l.f(str16, "presLocation");
        cm.l.f(str17, "presVillageOrTown");
        cm.l.f(str18, "presSubDistrict");
        cm.l.f(str19, "presDistrict");
        cm.l.f(str20, "presState");
        cm.l.f(str21, "presPincode");
        cm.l.f(str22, "agentId");
        cm.l.f(str23, "agentIpAddress");
        cm.l.f(str24, "agentPwd");
        cm.l.f(str25, "agentServiceName");
        cm.l.f(str26, "mobileNumber");
        cm.l.f(str27, "eKYCId");
        cm.l.f(str28, "eKYCOpted");
        cm.l.f(str29, "eKYCGender");
        cm.l.f(str30, "eKYCPhoto");
        try {
            this.f24584j.n(new ti.a(this.f24579e, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30).a(), new e(new f(this.f24584j)));
        } catch (Exception unused) {
        }
    }
}
