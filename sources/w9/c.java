package w9;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.Model.ServiceCheckPojo;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import km.d;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f17969d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f17970e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f17971f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f17972g = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f17974b;

        a(String str, c cVar) {
            this.f17973a = str;
            this.f17974b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            Log.v("form_response4", "err");
            this.f17974b.i().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f17973a;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f17973a;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("service_check", valueOf);
                Object j10 = new i7.d().j(valueOf, x9.a.class);
                l.e(j10, "fromJson(...)");
                android.support.v4.media.session.b.a(j10);
                this.f17974b.j().k((Object) null);
                Log.v("service_response", String.valueOf((SecurityModle) response.body()));
            } catch (Exception unused) {
                this.f17974b.i().k("error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f17976b;

        b(u uVar, c cVar) {
            this.f17975a = uVar;
            this.f17976b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.v("form_response4", "err");
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
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17975a.f20234e;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17975a.f20234e;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("service_check", valueOf);
            Object j10 = new i7.d().j(valueOf, ServiceCheckPojo.class);
            l.e(j10, "fromJson(...)");
            this.f17976b.k().k((ServiceCheckPojo) j10);
            if (response != null) {
                securityModle2 = (SecurityModle) response.body();
            }
            Log.v("service_response", String.valueOf(securityModle2));
        }
    }

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f17969d = aVar;
    }

    private final String g(ArrayList arrayList, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("agentId", (Object) "mobSARATHI");
        jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
        jSONObject.put("agentIpAddress", (Object) "10.248.210.8");
        jSONObject.put("agentServiceName", (Object) "sarathiservice");
        jSONObject.put("stCode", (Object) str);
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(arrayList.get(i10));
        }
        jSONObject.put("reqTrans", (Object) jSONArray);
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final void h(FormOneRequest formOneRequest) {
        l.f(formOneRequest, "mFormOneRequest");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), l(formOneRequest));
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f17969d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final a0 i() {
        return this.f17971f;
    }

    public final a0 j() {
        return this.f17970e;
    }

    public final a0 k() {
        return this.f17972g;
    }

    public final String l(FormOneRequest formOneRequest) {
        l.f(formOneRequest, "req");
        String t10 = new i7.d().t(formOneRequest);
        Log.d("request_submit", formOneRequest.toString());
        l.c(t10);
        return t10;
    }

    public final void m(ArrayList arrayList, String str) {
        l.f(arrayList, "selectedService");
        l.f(str, "state_code");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), g(arrayList, str));
        u uVar = new u();
        String valueOf = String.valueOf(System.currentTimeMillis());
        uVar.f20234e = valueOf;
        this.f17969d.b(f10, valueOf).enqueue(new b(uVar, this));
    }
}
