package k9;

import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.u;
import com.nic.mparivahan.Citizen.Models.AccidentReportDetails;
import com.nic.mparivahan.Citizen.Models.ComplaintList;
import com.nic.mparivahan.Citizen.Models.GetDashboardPojo;
import com.nic.mparivahan.Citizen.Models.GetLastAccident;
import com.nic.mparivahan.Citizen.Models.GetLastViolation;
import com.nic.mparivahan.Citizen.Models.GetOffenceList;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.GetTrafficFeedback;
import com.nic.mparivahan.Citizen.Models.GetViolationEvidenceResponse;
import com.nic.mparivahan.Citizen.Models.SaveVioFeedBack;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.Citizen.Models.VerifyVehicleResponseModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends t0 {
    private final a0 A = new a0();
    private a0 B = new a0();
    private final a0 C = new a0();
    private a0 D = new a0();
    private final a0 E = new a0();
    private a0 F = new a0();
    private final a0 G = new a0();
    private final a0 H = new a0();
    private final a0 I = new a0();

    /* renamed from: d  reason: collision with root package name */
    private final i9.a f13098d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f13099e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f13100f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f13101g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f13102h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f13103i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f13104j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f13105k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f13106l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f13107m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f13108n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private a0 f13109o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f13110p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private a0 f13111q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private final a0 f13112r = new a0();

    /* renamed from: s  reason: collision with root package name */
    private a0 f13113s = new a0();

    /* renamed from: t  reason: collision with root package name */
    private final a0 f13114t = new a0();

    /* renamed from: u  reason: collision with root package name */
    private a0 f13115u = new a0();

    /* renamed from: v  reason: collision with root package name */
    private a0 f13116v = new a0();

    /* renamed from: w  reason: collision with root package name */
    private final a0 f13117w = new a0();

    /* renamed from: x  reason: collision with root package name */
    private a0 f13118x = new a0();

    /* renamed from: y  reason: collision with root package name */
    private final a0 f13119y = new a0();

    /* renamed from: z  reason: collision with root package name */
    private a0 f13120z = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13122b;

        a(u uVar, b bVar) {
            this.f13121a = uVar;
            this.f13122b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13122b.l().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13122b.l().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13121a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13121a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetDashboardPojo.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13122b.u().k((GetDashboardPojo) j10);
        }
    }

    /* renamed from: k9.b$b  reason: collision with other inner class name */
    public static final class C0174b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13124b;

        C0174b(u uVar, b bVar) {
            this.f13123a = uVar;
            this.f13124b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13124b.F().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13124b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13123a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13123a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), AccidentReportDetails.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13124b.E().k((AccidentReportDetails) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13125a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13126b;

        c(u uVar, b bVar) {
            this.f13125a = uVar;
            this.f13126b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13126b.m().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13126b.m().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13125a.f20234e;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13125a.f20234e;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), h9.a.class);
            cm.l.e(j10, "fromJson(...)");
            android.support.v4.media.session.b.a(j10);
            this.f13126b.v().k((Object) null);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13127a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13128b;

        d(u uVar, b bVar) {
            this.f13127a = uVar;
            this.f13128b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13128b.s().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13128b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13127a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13127a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetViolationEvidenceResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13128b.B().k((GetViolationEvidenceResponse) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13130b;

        e(u uVar, b bVar) {
            this.f13129a = uVar;
            this.f13130b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13130b.n().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13130b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13129a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13129a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetDashboardPojo.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13130b.w().k((GetDashboardPojo) j10);
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13132b;

        f(u uVar, b bVar) {
            this.f13131a = uVar;
            this.f13132b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13132b.p().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13132b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13131a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13131a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetLastAccident.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13132b.x().k((GetLastAccident) j10);
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13133a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13134b;

        g(u uVar, b bVar) {
            this.f13133a = uVar;
            this.f13134b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13134b.o().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13134b.o().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f13133a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f13133a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), GetLastViolation.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13134b.y().k((GetLastViolation) j10);
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13136b;

        h(u uVar, b bVar) {
            this.f13135a = uVar;
            this.f13136b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13136b.r().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13136b.r().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13135a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13135a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetStated.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13136b.z().k((GetStated) j10);
        }
    }

    public static final class i implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13138b;

        i(u uVar, b bVar) {
            this.f13137a = uVar;
            this.f13138b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13138b.s().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13138b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13137a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13137a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetTrafficFeedback.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13138b.A().k((GetTrafficFeedback) j10);
        }
    }

    public static final class j implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13140b;

        j(u uVar, b bVar) {
            this.f13139a = uVar;
            this.f13140b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13140b.s().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13140b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13139a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13139a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetViolationEvidenceResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13140b.B().k((GetViolationEvidenceResponse) j10);
        }
    }

    public static final class k implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13142b;

        k(u uVar, b bVar) {
            this.f13141a = uVar;
            this.f13142b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13142b.H().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13142b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13141a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13141a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), ComplaintList.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13142b.G().k((ComplaintList) j10);
        }
    }

    public static final class l implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13143a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13144b;

        l(u uVar, b bVar) {
            this.f13143a = uVar;
            this.f13144b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13144b.O().k(th2 != null ? th2.toString() : null);
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
                    this.f13144b.O().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13143a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13143a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetOffenceList.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13144b.N().k((GetOffenceList) j10);
        }
    }

    public static final class m implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13145a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13146b;

        m(u uVar, b bVar) {
            this.f13145a = uVar;
            this.f13146b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13146b.Q().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13146b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13145a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13145a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SaveVioFeedBack.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13146b.P().k((SaveVioFeedBack) j10);
        }
    }

    public static final class n implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13147a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13148b;

        n(u uVar, b bVar) {
            this.f13147a = uVar;
            this.f13148b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13148b.J().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13148b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13147a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13147a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SubmitOffenceReport.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13148b.K().k((SubmitOffenceReport) j10);
        }
    }

    public static final class o implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13150b;

        o(u uVar, b bVar) {
            this.f13149a = uVar;
            this.f13150b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13150b.I().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13150b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13149a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13149a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SaveVioFeedBack.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13150b.L().k((SaveVioFeedBack) j10);
        }
    }

    public static final class p implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13152b;

        p(u uVar, b bVar) {
            this.f13151a = uVar;
            this.f13152b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f13152b.q().k(th2 != null ? th2.getMessage() : null);
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
                    this.f13152b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f13151a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f13151a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SubmitOffenceReport.class);
            cm.l.e(j10, "fromJson(...)");
            this.f13152b.M().k((SubmitOffenceReport) j10);
        }
    }

    public static final class q implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f13153a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13154b;

        q(u uVar, b bVar) {
            this.f13153a = uVar;
            this.f13154b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            a0 t10 = this.f13154b.t();
            String message = th2.getMessage();
            cm.l.c(message);
            t10.k(message);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f13153a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f13153a.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), VerifyVehicleResponseModel.class);
                cm.l.e(j10, "fromJson(...)");
                this.f13154b.T().k((VerifyVehicleResponseModel) j10);
            } catch (Exception e10) {
                a0 t10 = this.f13154b.t();
                String message = e10.getMessage();
                cm.l.c(message);
                t10.k(message);
            }
        }
    }

    public b(i9.a aVar) {
        cm.l.f(aVar, "repository");
        this.f13098d = aVar;
    }

    public final a0 A() {
        return this.f13115u;
    }

    public final a0 B() {
        return this.f13116v;
    }

    public final void C(String str) {
        cm.l.f(str, "cit_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.f(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.g(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(uVar, this));
    }

    public final void D(String str) {
        cm.l.f(str, "cit_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.g(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.h(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new g(uVar, this));
    }

    public final a0 E() {
        return this.f13111q;
    }

    public final a0 F() {
        return this.f13112r;
    }

    public final a0 G() {
        return this.f13101g;
    }

    public final a0 H() {
        return this.f13102h;
    }

    public final a0 I() {
        return this.f13106l;
    }

    public final a0 J() {
        return this.f13110p;
    }

    public final a0 K() {
        return this.f13109o;
    }

    public final a0 L() {
        return this.f13105k;
    }

    public final a0 M() {
        return this.f13099e;
    }

    public final a0 N() {
        return this.f13103i;
    }

    public final a0 O() {
        return this.f13104j;
    }

    public final a0 P() {
        return this.f13107m;
    }

    public final a0 Q() {
        return this.f13108n;
    }

    public final void R(String str) {
        cm.l.f(str, "states");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.j(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.j(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new h(uVar, this));
    }

    public final void S(String str) {
        cm.l.f(str, "feedbackViolationId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.k(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.k(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new i(uVar, this));
    }

    public final a0 T() {
        return this.H;
    }

    public final void U(String str) {
        cm.l.f(str, "violationId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.m(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.l(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new j(uVar, this));
    }

    public final void V(String str, String str2, String str3) {
        cm.l.f(str, "userId");
        cm.l.f(str2, "startDate");
        cm.l.f(str3, "endDate");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.h(str, str2, str3).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.i(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new k(uVar, this));
    }

    public final void W(String str) {
        cm.l.f(str, "stateCode");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("offenceStatus", 1);
        jSONObject.put("stateCd", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("mparOffence", (Object) jSONObject);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject3 = jSONObject2.toString();
        cm.l.e(jSONObject3, "toString(...)");
        this.f13098d.e(aVar.f(b10, jSONObject3), (String) uVar.f20234e).enqueue(new l(uVar, this));
    }

    public final void X(String str, String str2) {
        cm.l.f(str, "feedbackRemarks");
        cm.l.f(str2, "feedbackViolationId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.n(str, str2).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.m(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new m(uVar, this));
    }

    public final void Y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z10, String str15, String str16, String str17) {
        cm.l.f(str, "userId");
        cm.l.f(str2, "disticId");
        cm.l.f(str3, "location");
        cm.l.f(str4, "locLat");
        cm.l.f(str5, "loc");
        cm.l.f(str6, "locLong");
        cm.l.f(str7, "regNo");
        cm.l.f(str8, "remarks");
        cm.l.f(str9, "stateCode");
        cm.l.f(str10, "updatedByName");
        cm.l.f(str11, "uploadedImgValue");
        cm.l.f(str12, "imageFileName");
        cm.l.f(str13, "uploadedVideoFilePath");
        cm.l.f(str14, "videoFileName");
        cm.l.f(str15, "mid");
        cm.l.f(str16, "did");
        cm.l.f(str17, "tid");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        u uVar2 = uVar;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.o(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z10, str15, str16, str17).toString();
        cm.l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        u uVar3 = uVar2;
        this.f13098d.n(f10, (String) uVar3.f20234e).enqueue(new n(uVar3, this));
    }

    public final void Z(String str, String str2) {
        cm.l.f(str, "feedbackRemarks");
        cm.l.f(str2, "feedbackViolationId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.p(str, str2).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.o(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new o(uVar, this));
    }

    public final void a0(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z10, String str15, String str16, String str17) {
        cm.l.f(str, "userId");
        cm.l.f(str2, "disticId");
        cm.l.f(str3, "location");
        cm.l.f(str4, "locLat");
        cm.l.f(str5, "loc");
        cm.l.f(str6, "locLong");
        cm.l.f(str7, "regNo");
        cm.l.f(str8, "remarks");
        cm.l.f(str9, "stateCode");
        cm.l.f(str10, "updatedByName");
        cm.l.f(str11, "uploadedImgValue");
        cm.l.f(str12, "imageFileName");
        cm.l.f(str13, "uploadedVideoFilePath");
        cm.l.f(str14, "videoFileName");
        cm.l.f(str15, "mid");
        cm.l.f(str16, "did");
        cm.l.f(str17, "tid");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        u uVar2 = uVar;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.i(str, str2, str3, str4, str5, str6, i10, str7, str8, str9, str10, str11, str12, str13, str14, z10, str15, str16, str17).toString();
        cm.l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        u uVar3 = uVar2;
        this.f13098d.p(f10, (String) uVar3.f20234e).enqueue(new p(uVar3, this));
    }

    public final void b0(String str, long j10, String str2, String str3, String str4) {
        cm.l.f(str, "vehicleNo");
        cm.l.f(str2, "mid");
        String str5 = str3;
        cm.l.f(str5, "did");
        String str6 = str4;
        cm.l.f(str6, "tid");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.l(str, j10, str2, str5, str6).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.q(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new q(uVar, this));
    }

    public final void g(String str) {
        cm.l.f(str, "cit_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.a(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final void h(String str, String str2, String str3) {
        cm.l.f(str, "userId");
        cm.l.f(str2, "startDate");
        cm.l.f(str3, "endDate");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.b(str, str2, str3).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0174b(uVar, this));
    }

    public final void i(String str) {
        cm.l.f(str, "feedbackAccidentId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.c(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final void j(String str) {
        cm.l.f(str, "violationId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.d(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void k(String str) {
        cm.l.f(str, "cit_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j9.b.f12769a.e(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f13098d.f(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }

    public final a0 l() {
        return this.E;
    }

    public final a0 m() {
        return this.f13114t;
    }

    public final a0 n() {
        return this.C;
    }

    public final a0 o() {
        return this.f13119y;
    }

    public final a0 p() {
        return this.A;
    }

    public final a0 q() {
        return this.f13100f;
    }

    public final a0 r() {
        return this.G;
    }

    public final a0 s() {
        return this.f13117w;
    }

    public final a0 t() {
        return this.I;
    }

    public final a0 u() {
        return this.D;
    }

    public final a0 v() {
        return this.f13113s;
    }

    public final a0 w() {
        return this.B;
    }

    public final a0 x() {
        return this.f13120z;
    }

    public final a0 y() {
        return this.f13118x;
    }

    public final a0 z() {
        return this.F;
    }
}
