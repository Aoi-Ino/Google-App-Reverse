package he;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.CompResponse;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeDraftResponse;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeRelationModle;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f24071d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24072e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f24073f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f24074g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f24075h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f24076i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f24077j = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24079b;

        a(u uVar, c cVar) {
            this.f24078a = uVar;
            this.f24079b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24079b.m().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f24079b.m().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f24078a.f20234e, data), NomineeDraftResponse.class);
            l.e(j10, "fromJson(...)");
            this.f24079b.l().k((NomineeDraftResponse) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24081b;

        b(u uVar, c cVar) {
            this.f24080a = uVar;
            this.f24081b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24081b.k().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f24080a.f20234e, data), CompResponse.class);
            l.e(j10, "fromJson(...)");
            this.f24081b.j().k((CompResponse) j10);
        }
    }

    /* renamed from: he.c$c  reason: collision with other inner class name */
    public static final class C0299c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24083b;

        C0299c(u uVar, c cVar) {
            this.f24082a = uVar;
            this.f24083b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24083b.k().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f24083b.k().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            String a10 = pb.a.f14908a.a((String) this.f24082a.f20234e, data);
            Log.e("decryptedString--> ", a10);
            Object j10 = new i7.d().j(a10, CompResponse.class);
            l.e(j10, "fromJson(...)");
            this.f24083b.j().k((CompResponse) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24085b;

        d(u uVar, c cVar) {
            this.f24084a = uVar;
            this.f24085b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24085b.o().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f24085b.o().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f24084a.f20234e, data), NomineeRelationModle.class);
            l.e(j10, "fromJson(...)");
            this.f24085b.n().k((NomineeRelationModle) j10);
        }
    }

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f24071d = bVar;
    }

    public final void g(String str) {
        l.f(str, "requestParam");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f24071d.a(c0.Companion.f(x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final void h(String str) {
        l.f(str, "requestParam");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f24071d.b(c0.Companion.f(x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final void i(String str) {
        l.f(str, "requestParam");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f24071d.c(c0.Companion.f(x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new C0299c(uVar, this));
    }

    public final a0 j() {
        return this.f24072e;
    }

    public final a0 k() {
        return this.f24073f;
    }

    public final a0 l() {
        return this.f24076i;
    }

    public final a0 m() {
        return this.f24077j;
    }

    public final a0 n() {
        return this.f24074g;
    }

    public final a0 o() {
        return this.f24075h;
    }

    public final void p() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f24071d.d(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }
}
