package com.nic.mparivahan.VahanServices.VahanLog;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import pl.x;

public final class ApiMonitorLog extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f20957k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f20958j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, String str, String str2, String str3, String str4) {
            l.f(context, "context");
            l.f(str, "apiProvider");
            l.f(str2, "apiName");
            l.f(str3, "apiCode");
            l.f(str4, "apiReason");
            b a10 = new b.a().b("servapilogApiProvider", str).b("servapilogApiName", str2).b("servapilogCode", str3).b("servapilogReason", str4).b("servapilogDeviceOsType", "Android").a();
            l.e(a10, "build(...)");
            d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(ApiMonitorLog.class).j(a10)).h(a11)).a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiMonitorLog(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f20958j = context;
    }

    public c.a p() {
        try {
            f().m("servapilogApiProvider");
            f().m("servapilogApiName");
            f().m("servapilogCode");
            f().m("servapilogReason");
            f().m("servapilogDeviceOsType");
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }
}
