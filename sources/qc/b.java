package qc;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import ld.g;
import nc.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final pc.a f15361d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f15362e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f15363f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f15364g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f15365h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private a0 f15366i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private a0 f15367j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private a0 f15368k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private a0 f15369l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private a0 f15370m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private a0 f15371n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private a0 f15372o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private a0 f15373p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private a0 f15374q = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15376b;

        a(u uVar, b bVar) {
            this.f15375a = uVar;
            this.f15376b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15376b.i().k(th2 != null ? th2.getMessage() : null);
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
                    this.f15376b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f15375a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f15375a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), profiledetails.class);
            l.e(j10, "fromJson(...)");
            this.f15376b.p().k((profiledetails) j10);
        }
    }

    /* renamed from: qc.b$b  reason: collision with other inner class name */
    public static final class C0206b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15378b;

        C0206b(u uVar, b bVar) {
            this.f15377a = uVar;
            this.f15378b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15378b.l().k(th2 != null ? th2.getMessage() : null);
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
                    this.f15378b.l().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f15377a.f20234e;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f15377a.f20234e;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), kc.b.class);
            l.e(j10, "fromJson(...)");
            android.support.v4.media.session.b.a(j10);
            this.f15378b.m().k((Object) null);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15379a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f15380b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f15381c;

        c(u uVar, Context context, b bVar) {
            this.f15379a = uVar;
            this.f15380b = context;
            this.f15381c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15381c.i().k(th2 != null ? th2.getMessage() : null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00d3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r14, retrofit2.Response r15) {
            /*
                r13 = this;
                r14 = 0
                if (r15 == 0) goto L_0x000a
                java.lang.Object r15 = r15.body()     // Catch:{ Exception -> 0x00e8 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r15 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r15     // Catch:{ Exception -> 0x00e8 }
                goto L_0x000b
            L_0x000a:
                r15 = r14
            L_0x000b:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e8 }
                r1 = 26
                java.lang.String r2 = "decode(...)"
                r3 = 0
                if (r0 < r1) goto L_0x003d
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x00e8 }
                cm.u r1 = r13.f15379a     // Catch:{ Exception -> 0x00e8 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00e8 }
                j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00e8 }
                if (r15 == 0) goto L_0x0026
                java.lang.String r14 = r15.getData()     // Catch:{ Exception -> 0x00e8 }
            L_0x0026:
                byte[] r14 = r4.decode((java.lang.String) r14)     // Catch:{ Exception -> 0x00e8 }
                cm.l.e(r14, r2)     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x00e8 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x00e8 }
                r15.<init>(r14, r2)     // Catch:{ Exception -> 0x00e8 }
            L_0x0034:
                java.lang.String r14 = r0.a(r1, r15)     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x00e8 }
                goto L_0x005a
            L_0x003d:
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x00e8 }
                cm.u r1 = r13.f15379a     // Catch:{ Exception -> 0x00e8 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00e8 }
                if (r15 == 0) goto L_0x004b
                java.lang.String r14 = r15.getData()     // Catch:{ Exception -> 0x00e8 }
            L_0x004b:
                byte[] r14 = android.util.Base64.decode(r14, r3)     // Catch:{ Exception -> 0x00e8 }
                cm.l.e(r14, r2)     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x00e8 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x00e8 }
                r15.<init>(r14, r2)     // Catch:{ Exception -> 0x00e8 }
                goto L_0x0034
            L_0x005a:
                i7.d r15 = new i7.d     // Catch:{ Exception -> 0x00e8 }
                r15.<init>()     // Catch:{ Exception -> 0x00e8 }
                java.lang.Class<com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse> r0 = com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse.class
                java.lang.Object r14 = r15.j(r14, r0)     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r15 = "fromJson(...)"
                cm.l.e(r14, r15)     // Catch:{ Exception -> 0x00e8 }
                com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse r14 = (com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse) r14     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r15 = r14.getStatusCode()     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r0 = "CTZN001"
                r1 = 1
                boolean r15 = km.p.o(r15, r0, r1)     // Catch:{ Exception -> 0x00e8 }
                if (r15 == 0) goto L_0x00e1
                ld.g r4 = new ld.g     // Catch:{ Exception -> 0x00d3 }
                android.content.Context r15 = r13.f15380b     // Catch:{ Exception -> 0x00d3 }
                r4.<init>(r15)     // Catch:{ Exception -> 0x00d3 }
                com.nic.mparivahan.ProfileDetails.StateUpdate.MparCitizenUser r15 = r14.getMparCitizenUser()     // Catch:{ Exception -> 0x00d3 }
                long r5 = r15.getCtzRecordId()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00d3 }
                com.nic.mparivahan.ProfileDetails.StateUpdate.MparCitizenUser r15 = r14.getMparCitizenUser()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r6 = r15.getCtzMobile()     // Catch:{ Exception -> 0x00d3 }
                com.nic.mparivahan.ProfileDetails.StateUpdate.MparCitizenUser r15 = r14.getMparCitizenUser()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r7 = r15.getCtzDispName()     // Catch:{ Exception -> 0x00d3 }
                com.nic.mparivahan.ProfileDetails.StateUpdate.MparCitizenUser r15 = r14.getMparCitizenUser()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r8 = r15.getCtzEmail()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r15 = r4.m()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r9 = r15.toString()     // Catch:{ Exception -> 0x00d3 }
                com.nic.mparivahan.ProfileDetails.StateUpdate.MparCitizenUser r15 = r14.getMparCitizenUser()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r10 = r15.getCtzStateCd()     // Catch:{ Exception -> 0x00d3 }
                java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00d3 }
                com.nic.mparivahan.ProfileDetails.StateUpdate.MparCitizenUser r14 = r14.getMparCitizenUser()     // Catch:{ Exception -> 0x00d3 }
                boolean r14 = r14.getCtzMpinStatus()     // Catch:{ Exception -> 0x00d3 }
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r14)     // Catch:{ Exception -> 0x00d3 }
                r4.b(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00d3 }
                qc.b r14 = r13.f15381c     // Catch:{ Exception -> 0x00d3 }
                androidx.lifecycle.a0 r14 = r14.n()     // Catch:{ Exception -> 0x00d3 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00d3 }
                r14.k(r15)     // Catch:{ Exception -> 0x00d3 }
                goto L_0x00f3
            L_0x00d3:
                qc.b r14 = r13.f15381c     // Catch:{ Exception -> 0x00e8 }
                androidx.lifecycle.a0 r14 = r14.n()     // Catch:{ Exception -> 0x00e8 }
            L_0x00d9:
                java.lang.Integer r15 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00e8 }
                r14.k(r15)     // Catch:{ Exception -> 0x00e8 }
                goto L_0x00f3
            L_0x00e1:
                qc.b r14 = r13.f15381c     // Catch:{ Exception -> 0x00e8 }
                androidx.lifecycle.a0 r14 = r14.n()     // Catch:{ Exception -> 0x00e8 }
                goto L_0x00d9
            L_0x00e8:
                qc.b r14 = r13.f15381c
                androidx.lifecycle.a0 r14 = r14.i()
                java.lang.String r15 = "Error"
                r14.k(r15)
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.b.c.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public b(pc.a aVar) {
        l.f(aVar, "repository");
        this.f15361d = aVar;
    }

    public final void g(long j10, Context context) {
        l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        g gVar = new g(context);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0190a aVar2 = nc.a.f14255a;
        l.c(string);
        String jSONObject = aVar2.b(j10, string, gVar.l(), gVar.e()).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        u uVar = new u();
        String valueOf = String.valueOf(System.currentTimeMillis());
        uVar.f20234e = valueOf;
        this.f15361d.b(f10, valueOf).enqueue(new a(uVar, this));
    }

    public final a0 h() {
        return this.f15372o;
    }

    public final a0 i() {
        return this.f15367j;
    }

    public final a0 j() {
        return this.f15370m;
    }

    public final a0 k() {
        return this.f15371n;
    }

    public final a0 l() {
        return this.f15363f;
    }

    public final a0 m() {
        return this.f15362e;
    }

    public final a0 n() {
        return this.f15368k;
    }

    public final a0 o() {
        return this.f15365h;
    }

    public final a0 p() {
        return this.f15364g;
    }

    public final a0 q() {
        return this.f15366i;
    }

    public final a0 r() {
        return this.f15374q;
    }

    public final a0 s() {
        return this.f15373p;
    }

    public final a0 t() {
        return this.f15369l;
    }

    public final void u() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = nc.a.f14255a.a().toString();
        l.e(jSONObject, "toString(...)");
        this.f15361d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0206b(uVar, this));
    }

    public final void v(String str, Context context) {
        l.f(str, "userId");
        l.f(context, "con");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), str.toString());
        u uVar = new u();
        String valueOf = String.valueOf(System.currentTimeMillis());
        uVar.f20234e = valueOf;
        this.f15361d.c(f10, valueOf).enqueue(new c(uVar, context, this));
    }
}
