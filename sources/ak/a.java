package ak;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import com.nic.mparivahan.dlservices.data.model.temp.PhotoDto;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import fj.p;
import pl.x;
import ti.i;
import ti.n;
import ti.o;

public final class a extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f19322e;

    /* renamed from: f  reason: collision with root package name */
    private y f19323f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f19324g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f19325h = new y();

    /* renamed from: i  reason: collision with root package name */
    private y f19326i = new y();

    /* renamed from: ak.a$a  reason: collision with other inner class name */
    /* synthetic */ class C0257a extends k implements l {
        C0257a(Object obj) {
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
            k((DlPhotoStatusDycryResponse) obj);
            return x.f30437a;
        }

        public final void k(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse) {
            ((y) this.f20212f).m(dlPhotoStatusDycryResponse);
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f19327a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f19327a = lVar;
        }

        public final pl.c a() {
            return this.f19327a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19327a.invoke(obj);
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

    /* synthetic */ class e extends k implements l {
        e(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((PhotoDto) obj);
            return x.f30437a;
        }

        public final void k(PhotoDto photoDto) {
            ((y) this.f20212f).m(photoDto);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f19322e = application;
    }

    public final void g(String str, String str2) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        try {
            this.f19323f.n(new p(this.f19322e, str, str2).b(), new d(new C0257a(this.f19323f)));
        } catch (Exception unused) {
        }
    }

    public final void h(String str, String str2) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        try {
            this.f19324g.n(new i(this.f19322e, new DlStatusRequest(str, com.nic.mparivahan.dlservices.utilities.e.k(str2, "dd-MM-yyyy", "dd/MM/yyyy"))).b(), new d(new b(this.f19324g)));
        } catch (Exception unused) {
        }
    }

    public final void i(String str, String str2, String str3) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "applDob");
        cm.l.f(str3, "applRtoCd");
        try {
            this.f19325h.n(new n(this.f19322e, str, str2, str3).f(), new d(new c(this.f19325h)));
        } catch (Exception unused) {
        }
    }

    public final y j() {
        return this.f19325h;
    }

    public final y k() {
        return this.f19323f;
    }

    public final y l() {
        return this.f19324g;
    }

    public final y m() {
        return this.f19326i;
    }

    public final void n(String str, String str2, String str3, String str4, String str5, int i10) {
        cm.l.f(str, "applNo");
        cm.l.f(str2, "applDob");
        cm.l.f(str3, "applStateCd");
        cm.l.f(str4, "applPhoto");
        cm.l.f(str5, "applSign");
        try {
            this.f19326i.n(new o(this.f19322e, str, str2, str3, str4, str5, i10).b(), new d(new e(this.f19326i)));
        } catch (Exception unused) {
        }
    }
}
