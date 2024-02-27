package rc;

import android.os.Build;
import android.support.v4.media.session.b;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
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
    private final b f15630d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f15631e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f15632f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f15633g = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f15635b;

        a(String str, c cVar) {
            this.f15634a = str;
            this.f15635b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15635b.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f15635b.h().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f15634a;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f15634a;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), tc.a.class);
            l.e(j10, "fromJson(...)");
            b.a(j10);
            this.f15635b.i().k((Object) null);
        }
    }

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f15630d = bVar;
    }

    public final a0 g() {
        return this.f15633g;
    }

    public final a0 h() {
        return this.f15632f;
    }

    public final a0 i() {
        return this.f15631e;
    }

    public final void j(long j10) {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = d.f15636a.a(j10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f15630d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }
}
