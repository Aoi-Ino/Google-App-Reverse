package lb;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.FetchChallanLog.PojoChallan.FetchChallanResponse;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
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
    private final e f13461d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f13462e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f13463f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f13464g = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f13466b;

        a(String str, c cVar) {
            this.f13465a = str;
            this.f13466b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13466b.i().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13466b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f13465a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f13465a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("dlt_trn", valueOf);
            Object j10 = new i7.d().j(valueOf, DltVhnTransaction.class);
            l.e(j10, "fromJson(...)");
            this.f13466b.j().k((DltVhnTransaction) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f13468b;

        b(String str, c cVar) {
            this.f13467a = str;
            this.f13468b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13468b.i().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.e("Error-->0012->", e10.toString());
                    this.f13468b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = this.f13467a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = this.f13467a;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.e("Response0012-->", valueOf);
            Object j10 = new i7.d().j(valueOf, FetchChallanResponse.class);
            l.e(j10, "fromJson(...)");
            this.f13468b.k().k((FetchChallanResponse) j10);
        }
    }

    public c(e eVar) {
        l.f(eVar, "repository");
        this.f13461d = eVar;
    }

    public final void g(long j10, boolean z10) {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = b.f13460a.a(j10, z10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f13461d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final void h(long j10, boolean z10) {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = b.f13460a.b(j10, z10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f13461d.b(f10, valueOf).enqueue(new b(valueOf, this));
    }

    public final a0 i() {
        return this.f13464g;
    }

    public final a0 j() {
        return this.f13463f;
    }

    public final a0 k() {
        return this.f13462e;
    }
}
