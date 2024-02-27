package sb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeAddressLlReq;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeOfNameReq;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.DuplicateLlRequest;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f16126d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f16127e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f16128f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f16129g = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f16131b;

        a(String str, c cVar) {
            this.f16130a = str;
            this.f16131b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16131b.i().k("error");
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
                    this.f16131b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f16130a;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f16130a;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("response = ", valueOf);
            Object j10 = new i7.d().j(valueOf, d.class);
            l.e(j10, "fromJson(...)");
            android.support.v4.media.session.b.a(j10);
            Log.d("response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.f16131b.l().k((Object) null);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16132a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f16133b;

        b(String str, c cVar) {
            this.f16132a = str;
            this.f16133b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16133b.i().k("error");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            SecurityModle securityModle2 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f16133b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f16132a;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f16132a;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("response = ", valueOf);
            Object j10 = new i7.d().j(valueOf, FetchLlDetails.class);
            l.e(j10, "fromJson(...)");
            FetchLlDetails fetchLlDetails = (FetchLlDetails) j10;
            if (response != null) {
                securityModle2 = (SecurityModle) response.body();
            }
            Log.d("response_ll", String.valueOf(securityModle2));
            this.f16133b.k().k(fetchLlDetails);
        }
    }

    /* renamed from: sb.c$c  reason: collision with other inner class name */
    public static final class C0214c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f16135b;

        C0214c(String str, c cVar) {
            this.f16134a = str;
            this.f16135b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16135b.i().k("error");
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
                    this.f16135b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f16134a;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f16134a;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("response = ", valueOf);
            Object j10 = new i7.d().j(valueOf, d.class);
            l.e(j10, "fromJson(...)");
            android.support.v4.media.session.b.a(j10);
            Log.d("response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.f16135b.l().k((Object) null);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f16137b;

        d(String str, c cVar) {
            this.f16136a = str;
            this.f16137b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16137b.i().k("error");
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
                    this.f16137b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f16136a;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f16136a;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("response = ", valueOf);
            Object j10 = new i7.d().j(valueOf, d.class);
            l.e(j10, "fromJson(...)");
            android.support.v4.media.session.b.a(j10);
            Log.d("response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.f16137b.l().k((Object) null);
        }
    }

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f16126d = bVar;
    }

    private final String h(ChangeAddressLlReq changeAddressLlReq) {
        String t10 = new i7.d().t(changeAddressLlReq);
        Log.d("request_address_ll", changeAddressLlReq.toString());
        l.c(t10);
        return t10;
    }

    public final void g(Context context, ChangeAddressLlReq changeAddressLlReq) {
        l.f(context, "context");
        l.f(changeAddressLlReq, "mChangeAddressLlReq");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), h(changeAddressLlReq));
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16126d.b(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final a0 i() {
        return this.f16129g;
    }

    public final void j(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(context, "context");
        l.f(str, "learningLicence");
        l.f(str2, "dateOfBirth");
        l.f(str3, "agentId");
        l.f(str4, "agentPwd");
        l.f(str5, "agentIpAddress");
        l.f(str6, "agentServiceName");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.h(str, str2, str3, str4, str5, str6).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16126d.a(f10, valueOf).enqueue(new b(valueOf, this));
    }

    public final a0 k() {
        return this.f16127e;
    }

    public final a0 l() {
        return this.f16128f;
    }

    public final String m(ChangeOfNameReq changeOfNameReq) {
        l.f(changeOfNameReq, "req");
        String t10 = new i7.d().t(changeOfNameReq);
        Log.d("request_name_ll", changeOfNameReq.toString());
        l.c(t10);
        return t10;
    }

    public final String n(DuplicateLlRequest duplicateLlRequest) {
        l.f(duplicateLlRequest, "req");
        String t10 = new i7.d().t(duplicateLlRequest);
        Log.d("request_dup_ll", duplicateLlRequest.toString());
        l.c(t10);
        return t10;
    }

    public final void o(Context context, ChangeOfNameReq changeOfNameReq) {
        l.f(context, "context");
        l.f(changeOfNameReq, "mChangeOfNameReq");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), m(changeOfNameReq));
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16126d.b(f10, valueOf).enqueue(new C0214c(valueOf, this));
    }

    public final void p(Context context, DuplicateLlRequest duplicateLlRequest) {
        l.f(context, "context");
        l.f(duplicateLlRequest, "mDuplicateLlRequest");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), n(duplicateLlRequest));
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16126d.b(f10, valueOf).enqueue(new d(valueOf, this));
    }
}
