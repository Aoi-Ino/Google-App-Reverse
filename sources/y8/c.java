package y8;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f18620d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f18621e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f18622f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f18624b;

        a(String str, c cVar) {
            this.f18623a = str;
            this.f18624b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f18624b.h().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f18623a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f18623a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("service_check", valueOf);
                Object j10 = new i7.d().j(valueOf, SubmitResponse.class);
                l.e(j10, "fromJson(...)");
                this.f18624b.i().k((SubmitResponse) j10);
                Log.v("service_response", String.valueOf(response.body()));
            } catch (Exception unused) {
                this.f18624b.h().k("error");
            }
        }
    }

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f18620d = bVar;
    }

    public final void g(d dVar) {
        l.f(dVar, "mSubmitRequest");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), j(dVar));
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f18620d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final a0 h() {
        return this.f18622f;
    }

    public final a0 i() {
        return this.f18621e;
    }

    public final String j(d dVar) {
        l.f(dVar, "req");
        String t10 = new i7.d().t(dVar);
        Log.d("request_submit", dVar.toString());
        l.c(t10);
        return t10;
    }
}
