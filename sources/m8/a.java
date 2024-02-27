package m8;

import android.content.Context;
import cm.l;
import ld.g;
import um.b0;
import um.d0;
import um.w;

public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    private final g f13758a;

    public a(Context context) {
        l.f(context, "context");
        this.f13758a = new g(context);
    }

    public d0 a(w.a aVar) {
        l.f(aVar, "chain");
        b0.a h10 = aVar.request().h();
        String r10 = this.f13758a.r();
        h10.a("Authorization", "Bearer " + r10);
        h10.a("Param2", "2.0.119");
        h10.a("Param1", this.f13758a.t() ? this.f13758a.e() : "");
        return aVar.a(h10.b());
    }
}
