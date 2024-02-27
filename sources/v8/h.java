package v8;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.LogoutModle;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import org.json.JSONObject;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;

public final class h extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final s8.b f17436d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f17437e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f17438f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f17439g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f17440h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f17441i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f17442j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f17443k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f17444l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f17445m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f17446n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f17447o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f17448p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private final a0 f17449q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private final a0 f17450r = new a0();

    /* renamed from: s  reason: collision with root package name */
    private final a0 f17451s = new a0();

    /* renamed from: t  reason: collision with root package name */
    private final a0 f17452t = new a0();

    /* renamed from: u  reason: collision with root package name */
    private final a0 f17453u = new a0();

    /* renamed from: v  reason: collision with root package name */
    private final a0 f17454v = new a0();

    /* renamed from: w  reason: collision with root package name */
    private final a0 f17455w = new a0();

    /* renamed from: x  reason: collision with root package name */
    private final a0 f17456x = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17457a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17458b;

        a(u uVar, h hVar) {
            this.f17457a = uVar;
            this.f17458b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17458b.l().k(th2 != null ? th2.toString() : null);
        }

        /* JADX WARNING: type inference failed for: r5v3, types: [um.e0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                r4 = this;
                r5 = 0
                if (r6 == 0) goto L_0x007f
                boolean r0 = r6.isSuccessful()     // Catch:{ Exception -> 0x0089 }
                r1 = 1
                if (r0 != r1) goto L_0x007f
                if (r6 == 0) goto L_0x0013
                java.lang.Object r6 = r6.body()     // Catch:{ Exception -> 0x0089 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r6 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r6     // Catch:{ Exception -> 0x0089 }
                goto L_0x0014
            L_0x0013:
                r6 = r5
            L_0x0014:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0089 }
                r1 = 26
                java.lang.String r2 = "decode(...)"
                if (r0 < r1) goto L_0x0045
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0089 }
                cm.u r1 = r4.f17457a     // Catch:{ Exception -> 0x0089 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0089 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0089 }
                j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0089 }
                if (r6 == 0) goto L_0x002e
                java.lang.String r5 = r6.getData()     // Catch:{ Exception -> 0x0089 }
            L_0x002e:
                byte[] r5 = r3.decode((java.lang.String) r5)     // Catch:{ Exception -> 0x0089 }
                cm.l.e(r5, r2)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0089 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x0089 }
                r6.<init>(r5, r2)     // Catch:{ Exception -> 0x0089 }
            L_0x003c:
                java.lang.String r5 = r0.a(r1, r6)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0063
            L_0x0045:
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0089 }
                cm.u r1 = r4.f17457a     // Catch:{ Exception -> 0x0089 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0089 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0089 }
                if (r6 == 0) goto L_0x0053
                java.lang.String r5 = r6.getData()     // Catch:{ Exception -> 0x0089 }
            L_0x0053:
                r6 = 0
                byte[] r5 = android.util.Base64.decode(r5, r6)     // Catch:{ Exception -> 0x0089 }
                cm.l.e(r5, r2)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0089 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x0089 }
                r6.<init>(r5, r2)     // Catch:{ Exception -> 0x0089 }
                goto L_0x003c
            L_0x0063:
                i7.d r6 = new i7.d     // Catch:{ Exception -> 0x0089 }
                r6.<init>()     // Catch:{ Exception -> 0x0089 }
                java.lang.Class<com.nic.mparivahan.Account.Model.GetCitizenDetails> r0 = com.nic.mparivahan.Account.Model.GetCitizenDetails.class
                java.lang.Object r5 = r6.j(r5, r0)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r6 = "fromJson(...)"
                cm.l.e(r5, r6)     // Catch:{ Exception -> 0x0089 }
                com.nic.mparivahan.Account.Model.GetCitizenDetails r5 = (com.nic.mparivahan.Account.Model.GetCitizenDetails) r5     // Catch:{ Exception -> 0x0089 }
                v8.h r6 = r4.f17458b     // Catch:{ Exception -> 0x0089 }
                androidx.lifecycle.a0 r6 = r6.m()     // Catch:{ Exception -> 0x0089 }
                r6.k(r5)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0094
            L_0x007f:
                if (r6 == 0) goto L_0x0085
                um.e0 r5 = r6.errorBody()     // Catch:{ Exception -> 0x0089 }
            L_0x0085:
                java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0094
            L_0x0089:
                v8.h r5 = r4.f17458b
                androidx.lifecycle.a0 r5 = r5.l()
                java.lang.String r6 = "error"
                r5.k(r6)
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v8.h.a.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17460b;

        b(u uVar, h hVar) {
            this.f17459a = uVar;
            this.f17460b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17460b.n().k(th2 != null ? th2.toString() : null);
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
                    this.f17460b.n().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17459a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17459a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetCitizenDetails.class);
            l.e(j10, "fromJson(...)");
            this.f17460b.o().k((GetCitizenDetails) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17461a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17462b;

        c(u uVar, h hVar) {
            this.f17461a = uVar;
            this.f17462b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17462b.x().k(th2 != null ? th2.getMessage() : null);
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
                    this.f17462b.x().k("ERROR");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17461a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17461a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), ResendOtp.class);
            l.e(j10, "fromJson(...)");
            this.f17462b.y().k((ResendOtp) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17464b;

        d(u uVar, h hVar) {
            this.f17463a = uVar;
            this.f17464b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17464b.k().k(th2 != null ? th2.getMessage() : null);
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
                    this.f17464b.k().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17463a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17463a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SendOtpResult.class);
            l.e(j10, "fromJson(...)");
            this.f17464b.u().k((SendOtpResult) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17466b;

        e(u uVar, h hVar) {
            this.f17465a = uVar;
            this.f17466b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17466b.j().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f17466b.j().k("Error");
                    Log.d("DecRes+", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f17465a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f17465a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), SendOtpResult.class);
            l.e(j10, "fromJson(...)");
            this.f17466b.t().k((SendOtpResult) j10);
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17468b;

        f(u uVar, h hVar) {
            this.f17467a = uVar;
            this.f17468b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17468b.k().k(th2 != null ? th2.getMessage() : null);
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
                    this.f17468b.k().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17467a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17467a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SendOtpResult.class);
            l.e(j10, "fromJson(...)");
            this.f17468b.u().k((SendOtpResult) j10);
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17470b;

        g(u uVar, h hVar) {
            this.f17469a = uVar;
            this.f17470b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f17470b.D().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f17469a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f17469a.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), LogoutModle.class);
                l.e(j10, "fromJson(...)");
                this.f17470b.E().k((LogoutModle) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f17470b.D().k("Error");
            }
        }
    }

    /* renamed from: v8.h$h  reason: collision with other inner class name */
    public static final class C0231h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17472b;

        C0231h(u uVar, h hVar) {
            this.f17471a = uVar;
            this.f17472b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17472b.i().k(th2 != null ? th2.getMessage() : null);
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
                    Log.e("ERROR", x.f30437a.toString());
                    this.f17472b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f17471a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f17471a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), CitzValidDoc.class);
            l.e(j10, "fromJson(...)");
            this.f17472b.v().k((CitzValidDoc) j10);
        }
    }

    public static final class i implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17474b;

        i(u uVar, h hVar) {
            this.f17473a = uVar;
            this.f17474b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17474b.r().k(th2 != null ? th2.getMessage() : null);
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
                    this.f17474b.r().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17473a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17473a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SendOtpResult.class);
            l.e(j10, "fromJson(...)");
            this.f17474b.s().k((SendOtpResult) j10);
        }
    }

    public h(s8.b bVar) {
        l.f(bVar, "repository");
        this.f17436d = bVar;
    }

    public final void A(String str) {
        l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.n(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }

    public final void B(String str) {
        l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.n(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(uVar, this));
    }

    public final void C(JSONObject jSONObject) {
        l.f(jSONObject, "objectValue");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f17436d.e(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new g(uVar, this));
    }

    public final a0 D() {
        return this.f17448p;
    }

    public final a0 E() {
        return this.f17447o;
    }

    public final void F(String str, String str2, String str3, String str4, String str5, Context context) {
        Context context2 = context;
        String str6 = str;
        l.f(str6, "otp");
        String str7 = str2;
        l.f(str7, "otpid");
        String str8 = str3;
        l.f(str8, "rc");
        String str9 = str4;
        l.f(str9, "docType");
        String str10 = str5;
        l.f(str10, "dob");
        l.f(context2, "context");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context2);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        l.c(string);
        String jSONObject = aVar2.u(str6, str7, string, gVar.l(), gVar.e(), str8, gVar.k(), str9, str10).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.g(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0231h(uVar, this));
    }

    public final void G(Context context, String str, int i10) {
        l.f(context, "context");
        l.f(str, "mobile_no");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        if (i10 != 1) {
            str = gVar.l();
        }
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.w(str, gVar.k()).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new i(uVar, this));
    }

    public final void g(String str) {
        l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.g(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final void h(String str) {
        l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.g(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final a0 i() {
        return this.f17454v;
    }

    public final a0 j() {
        return this.f17438f;
    }

    public final a0 k() {
        return this.f17440h;
    }

    public final a0 l() {
        return this.f17446n;
    }

    public final a0 m() {
        return this.f17445m;
    }

    public final a0 n() {
        return this.f17444l;
    }

    public final a0 o() {
        return this.f17443k;
    }

    public final a0 p() {
        return this.f17442j;
    }

    public final a0 q() {
        return this.f17441i;
    }

    public final a0 r() {
        return this.f17450r;
    }

    public final a0 s() {
        return this.f17449q;
    }

    public final a0 t() {
        return this.f17437e;
    }

    public final a0 u() {
        return this.f17439g;
    }

    public final a0 v() {
        return this.f17453u;
    }

    public final void w(String str) {
        l.f(str, "smsId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.o(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final a0 x() {
        return this.f17456x;
    }

    public final a0 y() {
        return this.f17455w;
    }

    public final void z(String str, String str2) {
        l.f(str, "mobile_no");
        l.f(str2, "id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.j(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f17436d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }
}
