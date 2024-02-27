package com.nic.mparivahan.PushNotification;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.PushNotification.BannerModel.BannerModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Welcome.VersionService;
import id.c;
import j$.util.Base64;
import ld.e;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class BannerServices extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9423k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f9424j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context) {
            l.f(context, "context");
            d a10 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) new p.a(BannerServices.class).h(a10)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f9425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f9426b;

        b(u uVar, Context context) {
            this.f9425a = uVar;
            this.f9426b = context;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str = (String) this.f9425a.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str2 = (String) this.f9425a.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str2, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.e("Banner--> ", valueOf);
                Object j10 = new i7.d().j(valueOf, BannerModel.class);
                l.e(j10, "fromJson(...)");
                if (p.p(((BannerModel) j10).getStatusCode(), "MSTR001", false, 2, (Object) null)) {
                    new e(this.f9426b).i(valueOf);
                }
            } catch (NullPointerException unused) {
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerServices(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f9424j = context;
    }

    public c.a p() {
        try {
            r(this.f9424j);
        } catch (Exception unused) {
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(Context context) {
        l.f(context, "context");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.l().toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        VersionService c10 = VersionService.f21650a.c(context);
        c10.getBannerList(hc.a.f12073a.a() + "getBanner/v1.0 ", f10, (String) uVar.f20234e).enqueue(new b(uVar, context));
    }
}
