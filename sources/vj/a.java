package vj;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.h;
import cm.k;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import pl.x;

public final class a extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f32383e;

    /* renamed from: f  reason: collision with root package name */
    private y f32384f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f32385g = new y();

    /* renamed from: vj.a$a  reason: collision with other inner class name */
    /* synthetic */ class C0371a extends k implements l {
        C0371a(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((GetMobDetailsResponse) obj);
            return x.f30437a;
        }

        public final void k(GetMobDetailsResponse getMobDetailsResponse) {
            ((y) this.f20212f).m(getMobDetailsResponse);
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f32386a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f32386a = lVar;
        }

        public final pl.c a() {
            return this.f32386a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f32386a.invoke(obj);
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

    /* synthetic */ class c extends k implements l {
        c(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((DlUpdateMobResponse) obj);
            return x.f30437a;
        }

        public final void k(DlUpdateMobResponse dlUpdateMobResponse) {
            ((y) this.f20212f).m(dlUpdateMobResponse);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f32383e = application;
    }

    public final String g(String str) {
        cm.l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            String format = simpleDateFormat2.format(parse);
            cm.l.e(format, "format(...)");
            return format;
        } catch (ParseException unused) {
            return "";
        }
    }

    public final y h() {
        return this.f32384f;
    }

    public final y i() {
        return this.f32385g;
    }

    public final void j(String str, String str2, boolean z10, String str3) {
        cm.l.f(str, "p2Dob");
        cm.l.f(str2, "p3Type");
        cm.l.f(str3, "p1DlNumber");
        try {
            this.f32384f.n(new xi.a(this.f32383e, g(str), str2, z10, str3).b(), new b(new C0371a(this.f32384f)));
        } catch (Exception unused) {
        }
    }

    public final void k(String str, String str2, String str3, boolean z10, String str4, String str5) {
        cm.l.f(str, "p2Dob");
        cm.l.f(str2, "p3Type");
        cm.l.f(str3, "p4OldMob");
        cm.l.f(str4, "p1DlNumber");
        cm.l.f(str5, "p5NewMob");
        try {
            this.f32385g.n(new xi.b(this.f32383e, g(str), str2, str3, z10, str4, str5).b(), new b(new c(this.f32385g)));
        } catch (Exception unused) {
        }
    }
}
