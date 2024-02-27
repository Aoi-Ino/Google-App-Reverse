package mb;

import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.nic.mparivahan.FetchVahanLog.Pojo.VahanPojo;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class d extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final e f13995d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f13996e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f13997f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f13998g = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f14000b;

        a(String str, d dVar) {
            this.f13999a = str;
            this.f14000b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f14000b.i().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f14000b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f13999a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f13999a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), DltVhnTransaction.class);
            l.e(j10, "fromJson(...)");
            this.f14000b.j().k((DltVhnTransaction) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f14001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f14002b;

        b(String str, d dVar) {
            this.f14001a = str;
            this.f14002b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f14002b.i().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f14002b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f14001a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f14001a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), VahanPojo.class);
            l.e(j10, "fromJson(...)");
            this.f14002b.k().k((VahanPojo) j10);
        }
    }

    public d(e eVar) {
        l.f(eVar, "repository");
        this.f13995d = eVar;
    }

    public final void g(int i10, boolean z10) {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = c.f13994a.a(i10, z10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f13995d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final void h(int i10, boolean z10) {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = c.f13994a.d(i10, z10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f13995d.b(f10, valueOf).enqueue(new b(valueOf, this));
    }

    public final a0 i() {
        return this.f13998g;
    }

    public final a0 j() {
        return this.f13997f;
    }

    public final a0 k() {
        return this.f13996e;
    }
}
