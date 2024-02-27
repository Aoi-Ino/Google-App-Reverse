package hd;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import androidx.lifecycle.y;
import cm.l;
import cm.u;
import com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.model.slot_pdf.SlotPdfDownloadResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final ed.a f12074d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f12075e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private y f12076f = new y();

    /* renamed from: g  reason: collision with root package name */
    private y f12077g = new y();

    /* renamed from: h  reason: collision with root package name */
    private y f12078h = new y();

    /* renamed from: i  reason: collision with root package name */
    private y f12079i = new y();

    /* renamed from: j  reason: collision with root package name */
    private y f12080j = new y();

    /* renamed from: k  reason: collision with root package name */
    private y f12081k = new y();

    /* renamed from: hd.a$a  reason: collision with other inner class name */
    public static final class C0156a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f12082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12083b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f12084c;

        C0156a(u uVar, a aVar, Context context) {
            this.f12082a = uVar;
            this.f12083b = aVar;
            this.f12084c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f12083b.i().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f12084c;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.t(), "getApplicationInfo", aVar2.v(), aVar2.w());
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
                    this.f12083b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f12082a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f12082a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("Response", valueOf);
            Object j10 = new i7.d().j(valueOf, GetApplInfoResponse.class);
            l.e(j10, "fromJson(...)");
            this.f12083b.j().k((GetApplInfoResponse) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f12085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f12087c;

        b(u uVar, a aVar, Context context) {
            this.f12085a = uVar;
            this.f12086b = aVar;
            this.f12087c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f12086b.i().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f12087c;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.t(), "applStatus", aVar2.v(), aVar2.w());
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
                    this.f12086b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f12085a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f12085a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("Response", valueOf);
            Object j10 = new i7.d().j(valueOf, GetAppStatusMain.class);
            l.e(j10, "fromJson(...)");
            this.f12086b.k().k((GetAppStatusMain) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f12088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f12090c;

        c(u uVar, a aVar, Context context) {
            this.f12088a = uVar;
            this.f12089b = aVar;
            this.f12090c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f12089b.i().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f12090c;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.t(), "dltprovnlreceipt", aVar2.v(), aVar2.w());
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
                    this.f12089b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f12088a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f12088a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("Response", valueOf);
            Object j10 = new i7.d().j(valueOf, SlotPdfDownloadResponse.class);
            l.e(j10, "fromJson(...)");
            this.f12089b.l().k((SlotPdfDownloadResponse) j10);
        }
    }

    public a(ed.a aVar) {
        l.f(aVar, "repository");
        this.f12074d = aVar;
    }

    public final void g(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "appNo");
        l.f(str2, "dob");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = ed.b.f11171a.b(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f12074d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0156a(uVar, this, context));
    }

    public final void h(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "appNo");
        l.f(str2, "dob");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = ed.b.f11171a.a(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f12074d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this, context));
    }

    public final a0 i() {
        return this.f12075e;
    }

    public final y j() {
        return this.f12076f;
    }

    public final y k() {
        return this.f12080j;
    }

    public final y l() {
        return this.f12081k;
    }

    public final void m(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "appNo");
        l.f(str2, "dob");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = ed.b.f11171a.c(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f12074d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this, context));
    }
}
