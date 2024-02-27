package id;

import android.content.Context;
import cm.l;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Welcome.Model.DataParam;
import i7.d;
import in.e;
import um.b0;
import um.c0;
import um.d0;
import um.w;
import um.x;

public final class b implements w {
    public b(Context context) {
        l.f(context, "context");
    }

    public d0 a(w.a aVar) {
        l.f(aVar, "chain");
        d dVar = new d();
        b0 request = aVar.request();
        c0 a10 = request.a();
        String h10 = APIController.a().getH();
        l.e(h10, "getH(...)");
        String d10 = request.d(h10);
        e eVar = new e();
        if (a10 != null) {
            a10.writeTo(eVar);
        }
        String D0 = eVar.D0();
        x b10 = x.f32156g.b("application/json; charset=utf-8");
        String t10 = dVar.t(new DataParam(String.valueOf(c.f12675a.b(D0.toString(), String.valueOf(d10)))));
        l.e(t10, "toJson(...)");
        c0 f10 = c0.Companion.f(b10, t10);
        return aVar.a(request.h().c("Content-Type", "application/json").c("Content-Length", String.valueOf(f10.contentLength())).e(request.g(), f10).b());
    }
}
