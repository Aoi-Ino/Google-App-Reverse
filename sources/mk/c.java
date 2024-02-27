package mk;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.FetchSarathiPojo;
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
    private final e f25103d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f25104e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f25105f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f25106g = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f25107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f25108b;

        a(String str, c cVar) {
            this.f25107a = str;
            this.f25108b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25108b.i().k(th2 != null ? th2.getMessage() : null);
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
                    this.f25108b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f25107a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f25107a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), DltVhnTransaction.class);
            l.e(j10, "fromJson(...)");
            this.f25108b.j().k((DltVhnTransaction) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f25109a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f25110b;

        b(String str, c cVar) {
            this.f25109a = str;
            this.f25110b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25110b.i().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("fetchSarthiErr", e10.getLocalizedMessage());
                    this.f25110b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = this.f25109a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = this.f25109a;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("fetchSarthiResp", valueOf);
            Object j10 = new i7.d().j(valueOf, FetchSarathiPojo.class);
            l.e(j10, "fromJson(...)");
            this.f25110b.k().k((FetchSarathiPojo) j10);
        }
    }

    public c(e eVar) {
        l.f(eVar, "repository");
        this.f25103d = eVar;
    }

    public final void g(int i10, boolean z10) {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = d.f25111a.a(i10, z10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f25103d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final void h(int i10, boolean z10) {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = d.f25111a.b(i10, z10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f25103d.b(f10, valueOf).enqueue(new b(valueOf, this));
    }

    public final a0 i() {
        return this.f25106g;
    }

    public final a0 j() {
        return this.f25105f;
    }

    public final a0 k() {
        return this.f25104e;
    }
}
