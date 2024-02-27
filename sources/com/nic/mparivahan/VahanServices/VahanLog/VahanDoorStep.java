package com.nic.mparivahan.VahanServices.VahanLog;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.Model.DoorStepReq;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import i7.d;
import id.c;
import j$.util.Base64;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;

public final class VahanDoorStep extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f20962k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f20963j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, DoorStepReq doorStepReq) {
            l.f(context, "context");
            l.f(doorStepReq, "doorStepReq");
            androidx.work.b a10 = new b.a().b("DoorStep", new d().t(doorStepReq)).a();
            l.e(a10, "build(...)");
            m1.d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(VahanDoorStep.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f20964a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VahanDoorStep f20965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DoorStepReq f20966c;

        b(u uVar, VahanDoorStep vahanDoorStep, DoorStepReq doorStepReq) {
            this.f20964a = uVar;
            this.f20965b = vahanDoorStep;
            this.f20966c = doorStepReq;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Login eRRO", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f20964a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f20964a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Log.e("saveVahanLog", String.valueOf(a10));
            this.f20965b.s(this.f20966c);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f20967a;

        c(u uVar) {
            this.f20967a = uVar;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Login eRRO", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f20967a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f20967a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Log.e("saveVahanLog", String.valueOf(a10));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VahanDoorStep(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f20963j = context;
    }

    public c.a p() {
        try {
            Object j10 = new i7.d().j(f().m("DoorStep"), DoorStepReq.class);
            l.e(j10, "fromJson(...)");
            r((DoorStepReq) j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(DoorStepReq doorStepReq) {
        l.f(doorStepReq, "doorstep");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        ld.g gVar = new ld.g(this.f20963j);
        VahanServiceConnection d10 = VahanServiceConnection.f21199a.d(this.f20963j);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.p(gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        d10.usertype(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this, doorStepReq));
    }

    public final void s(DoorStepReq doorStepReq) {
        l.f(doorStepReq, "doorstep");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        VahanServiceConnection.f21199a.d(this.f20963j).vttransappl(c0.Companion.f(um.x.f32156g.b("application/json"), new i7.d().t(doorStepReq).toString()), (String) uVar.f20234e).enqueue(new c(uVar));
    }
}
