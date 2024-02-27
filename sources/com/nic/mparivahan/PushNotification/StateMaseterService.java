package com.nic.mparivahan.PushNotification;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.StateMaster;
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

public final class StateMaseterService extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9446k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f9447j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context) {
            l.f(context, "context");
            d a10 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) new p.a(StateMaseterService.class).h(a10)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f9448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f9449b;

        b(u uVar, Context context) {
            this.f9448a = uVar;
            this.f9449b = context;
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
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str2 = (String) this.f9448a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str3 = (String) this.f9448a.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Object j10 = new i7.d().j(valueOf, StateMaster.class);
                l.e(j10, "fromJson(...)");
                StateMaster stateMaster = (StateMaster) j10;
                if (stateMaster.getStatusCode().equals("MSTR001")) {
                    e eVar = new e(this.f9449b);
                    eVar.m(valueOf);
                    eVar.g(stateMaster.getStates().get(0).isNgmp());
                }
            } catch (NullPointerException unused) {
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateMaseterService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f9447j = context;
    }

    public c.a p() {
        try {
            r(this.f9447j);
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
        VersionService.f21650a.c(context).getStateMasterList(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, context));
    }
}
