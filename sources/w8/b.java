package w8;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.AddCov.PojoClass.CovDataSubmit;
import com.nic.mparivahan.AddCov.PojoClass.DataRequestPojo;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final c f17954d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f17955e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f17956f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f17957g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f17958h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private String f17959i = "";

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f17960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f17961b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f17962c;

        a(b bVar, String str, Context context) {
            this.f17960a = bVar;
            this.f17961b = str;
            this.f17962c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17960a.m().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f17962c;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.t(), "dataRequest", aVar2.v(), aVar2.w());
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
                    Log.d("grv", this.f17960a.k());
                    this.f17960a.n().k(this.f17960a.k());
                    return;
                }
            } else {
                securityModle = null;
            }
            b bVar = this.f17960a;
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f17961b;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f17961b;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            bVar.p(String.valueOf(aVar.a(str, str2)));
            Log.d("response", this.f17960a.k());
            Object j10 = new i7.d().j(this.f17960a.k(), DataRequestPojo.class);
            l.e(j10, "fromJson(...)");
            this.f17960a.l().k((DataRequestPojo) j10);
        }
    }

    /* renamed from: w8.b$b  reason: collision with other inner class name */
    public static final class C0233b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17963a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17964b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f17965c;

        C0233b(String str, b bVar, Context context) {
            this.f17963a = str;
            this.f17964b = bVar;
            this.f17965c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17964b.m().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f17965c;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.t(), "dataSubmit", aVar2.v(), aVar2.w());
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
                    this.f17964b.m().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f17963a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f17963a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("response", valueOf);
            Object j10 = new i7.d().j(valueOf, CovDataSubmit.class);
            l.e(j10, "fromJson(...)");
            this.f17964b.o().k((CovDataSubmit) j10);
        }
    }

    public b(c cVar) {
        l.f(cVar, "repository");
        this.f17954d = cVar;
    }

    public final void g(Context context, String str, String str2, String str3) {
        l.f(context, "context");
        l.f(str, "applNumber");
        l.f(str2, "applDob");
        l.f(str3, "stCode");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = h(str, str2, str3).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f17954d.a(f10, valueOf).enqueue(new a(this, valueOf, context));
    }

    public final JSONObject h(String str, String str2, String str3) {
        l.f(str, "applNumber");
        l.f(str2, "applDob");
        l.f(str3, "stCode");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNumber", (Object) str);
        jSONObject.put("applDob", (Object) str2);
        jSONObject.put("stCode", (Object) str3);
        return jSONObject;
    }

    public final void i(Context context, String str, String str2, String str3, ArrayList arrayList) {
        l.f(context, "context");
        l.f(str, "applNumber");
        l.f(str2, "applDob");
        l.f(str3, "stCode");
        l.f(arrayList, "selectedServiceClass");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j(str, str2, str3, arrayList).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f17954d.b(f10, valueOf).enqueue(new C0233b(valueOf, this, context));
    }

    public final JSONObject j(String str, String str2, String str3, ArrayList arrayList) {
        l.f(str, "applNumber");
        l.f(str2, "applDob");
        l.f(str3, "stCode");
        l.f(arrayList, "selectedServiceClass");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNumber", (Object) str);
        jSONObject.put("applDob", (Object) str2);
        jSONObject.put("stCode", (Object) str3);
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(arrayList.get(i10));
        }
        jSONObject.put("selectedCovsList", (Object) jSONArray);
        Log.d("submit_data", jSONObject.toString());
        return jSONObject;
    }

    public final String k() {
        return this.f17959i;
    }

    public final a0 l() {
        return this.f17955e;
    }

    public final a0 m() {
        return this.f17957g;
    }

    public final a0 n() {
        return this.f17958h;
    }

    public final a0 o() {
        return this.f17956f;
    }

    public final void p(String str) {
        l.f(str, "<set-?>");
        this.f17959i = str;
    }
}
