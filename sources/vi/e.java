package vi;

import android.app.Application;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import bm.l;
import cm.h;
import cm.k;
import pl.c;
import pl.x;

public final class e extends androidx.lifecycle.b {

    /* renamed from: e  reason: collision with root package name */
    private final Application f32380e;

    /* renamed from: f  reason: collision with root package name */
    private y f32381f = new y();

    static final class a implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f32382a;

        a(l lVar) {
            cm.l.f(lVar, "function");
            this.f32382a = lVar;
        }

        public final c a() {
            return this.f32382a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f32382a.invoke(obj);
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

    /* synthetic */ class b extends k implements l {
        b(Object obj) {
            super(1, obj, y.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            k((c) null);
            return x.f30437a;
        }

        public final void k(c cVar) {
            ((y) this.f20212f).m(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Application application) {
        super(application);
        cm.l.f(application, "app");
        this.f32380e = application;
    }

    public final y g() {
        return this.f32381f;
    }

    public final void h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        cm.l.f(str19, "eKYCId");
        cm.l.f(str20, "eKYCOpted");
        cm.l.f(str21, "eKYCGender");
        cm.l.f(str22, "eKYCPhoto");
        try {
            this.f32381f.n(new b(this.f32380e, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22).c(), new a(new b(this.f32381f)));
        } catch (Exception unused) {
        }
    }
}
