package cd;

import ad.a;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.u;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.RC.Model.GetSharedRecivedDoc;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.SharedDocModle;
import com.nic.mparivahan.RC.Model.SharedRcDeletResponse;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;
import um.x;

public final class c extends t0 {
    private final a0 A = new a0();
    private final a0 B = new a0();
    private final a0 C = new a0();
    private final a0 D = new a0();
    private a0 E = new a0();
    private final a0 F = new a0();
    private a0 G = new a0();
    private a0 H = new a0();
    private a0 I = new a0();
    private a0 J = new a0();
    private final a0 K = new a0();
    private final a0 L = new a0();

    /* renamed from: d  reason: collision with root package name */
    private final bd.b f4973d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f4974e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f4975f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f4976g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f4977h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private a0 f4978i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private a0 f4979j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f4980k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f4981l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f4982m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f4983n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f4984o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f4985p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private final a0 f4986q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private final a0 f4987r = new a0();

    /* renamed from: s  reason: collision with root package name */
    private final a0 f4988s = new a0();

    /* renamed from: t  reason: collision with root package name */
    private final a0 f4989t = new a0();

    /* renamed from: u  reason: collision with root package name */
    private final a0 f4990u = new a0();

    /* renamed from: v  reason: collision with root package name */
    private final a0 f4991v = new a0();

    /* renamed from: w  reason: collision with root package name */
    private final a0 f4992w = new a0();

    /* renamed from: x  reason: collision with root package name */
    private final a0 f4993x = new a0();

    /* renamed from: y  reason: collision with root package name */
    private final a0 f4994y = new a0();

    /* renamed from: z  reason: collision with root package name */
    private final a0 f4995z = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f4996a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f4997b;

        a(u uVar, c cVar) {
            this.f4996a = uVar;
            this.f4997b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4997b.y().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f4997b.y().k("error");
                    Log.d("RcDelete-", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f4996a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f4996a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), MyRcDeletResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f4997b.x().k((MyRcDeletResponse) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f4998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f4999b;

        b(u uVar, c cVar) {
            this.f4998a = uVar;
            this.f4999b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4999b.w().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f4999b.w().k("error");
                    Log.d("RcDelete-", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f4998a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f4998a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), MyRcDeletResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f4999b.v().k((MyRcDeletResponse) j10);
        }
    }

    /* renamed from: cd.c$c  reason: collision with other inner class name */
    public static final class C0094c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5001b;

        C0094c(u uVar, c cVar) {
            this.f5000a = uVar;
            this.f5001b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5001b.A().k(th2 != null ? th2.toString() : null);
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
                    this.f5001b.A().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5000a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5000a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), MyRcDeletResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5001b.z().k((MyRcDeletResponse) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5003b;

        d(u uVar, c cVar) {
            this.f5002a = uVar;
            this.f5003b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5003b.C().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f5003b.C().k("error");
                    Log.d("deletSharedRc-", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f5002a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f5002a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), SharedRcDeletResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5003b.B().k((SharedRcDeletResponse) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5005b;

        e(u uVar, c cVar) {
            this.f5004a = uVar;
            this.f5005b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5005b.K().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f5005b.K().k("error");
                    Log.d("deletSharedRc-", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f5004a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f5004a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), SharedRcDeletResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5005b.J().k((SharedRcDeletResponse) j10);
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5007b;

        f(u uVar, c cVar) {
            this.f5006a = uVar;
            this.f5007b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5007b.q().k(th2 != null ? th2.getMessage() : null);
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
                    this.f5007b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5006a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5006a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), RcModelsDet.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5007b.p().k((RcModelsDet) j10);
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5009b;

        g(u uVar, c cVar) {
            this.f5008a = uVar;
            this.f5009b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5009b.W().k(th2 != null ? th2.getMessage() : null);
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
                    this.f5009b.W().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5008a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5008a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), ValidateRcSuccess.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5009b.V().k((ValidateRcSuccess) j10);
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5011b;

        h(u uVar, c cVar) {
            this.f5010a = uVar;
            this.f5011b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5011b.S().k(th2 != null ? th2.getMessage() : null);
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
                    this.f5011b.S().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5010a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5010a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), RcModelsDet.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5011b.R().k((RcModelsDet) j10);
        }
    }

    public static final class i implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5013b;

        i(u uVar, c cVar) {
            this.f5012a = uVar;
            this.f5013b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5013b.S().k(th2 != null ? th2.getMessage() : null);
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
                    this.f5013b.S().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5012a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5012a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.e("napix-update-rc-dec", valueOf);
            Object j10 = new i7.d().j(valueOf, RcModelsDet.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5013b.R().k((RcModelsDet) j10);
        }
    }

    public static final class j implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5015b;

        j(u uVar, c cVar) {
            this.f5014a = uVar;
            this.f5015b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5015b.t().k(th2 != null ? th2.toString() : null);
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
                    this.f5015b.t().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5014a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5014a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetCitizenDetails.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5015b.u().k((GetCitizenDetails) j10);
        }
    }

    public static final class k implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5017b;

        k(u uVar, c cVar) {
            this.f5016a = uVar;
            this.f5017b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5017b.s().k(th2 != null ? th2.getMessage() : null);
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
                    this.f5017b.s().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5016a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5016a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), RcModelsDet.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5017b.O().k((RcModelsDet) j10);
        }
    }

    public static final class l implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5019b;

        l(u uVar, c cVar) {
            this.f5018a = uVar;
            this.f5019b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5019b.E().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("RecivedRc", e10.getLocalizedMessage());
                    this.f5019b.E().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f5018a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f5018a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), GetSharedRecivedDoc.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5019b.D().k((GetSharedRecivedDoc) j10);
        }
    }

    public static final class m implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5021b;

        m(u uVar, c cVar) {
            this.f5020a = uVar;
            this.f5021b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5021b.G().k(th2 != null ? th2.toString() : null);
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
                    this.f5021b.G().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f5020a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f5020a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetSharedRecivedDoc.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5021b.F().k((GetSharedRecivedDoc) j10);
        }
    }

    public static final class n implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5023b;

        n(u uVar, c cVar) {
            this.f5022a = uVar;
            this.f5023b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5023b.M().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("VirtualRcDetails-", e10.getLocalizedMessage());
                    this.f5023b.M().k("error-->");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f5022a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f5022a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), GetVirtualDocDetails.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5023b.L().k((GetVirtualDocDetails) j10);
        }
    }

    public static final class o implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5025b;

        o(u uVar, c cVar) {
            this.f5024a = uVar;
            this.f5025b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5025b.I().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("SharedDoc-", e10.getLocalizedMessage());
                    this.f5025b.I().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f5024a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f5024a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), SharedDocModle.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5025b.H().k((SharedDocModle) j10);
        }
    }

    public static final class p implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5027b;

        p(u uVar, c cVar) {
            this.f5026a = uVar;
            this.f5027b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f5027b.T().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f5027b.T().k("error");
                    Log.d("virtualRcDoc", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f5026a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f5026a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), MyRcDeletResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f5027b.U().k((MyRcDeletResponse) j10);
        }
    }

    public c(bd.b bVar) {
        cm.l.f(bVar, "repository");
        this.f4973d = bVar;
    }

    public final a0 A() {
        return this.f4995z;
    }

    public final a0 B() {
        return this.f4990u;
    }

    public final a0 C() {
        return this.f4991v;
    }

    public final a0 D() {
        return this.f4986q;
    }

    public final a0 E() {
        return this.f4987r;
    }

    public final a0 F() {
        return this.f4984o;
    }

    public final a0 G() {
        return this.f4985p;
    }

    public final a0 H() {
        return this.f4982m;
    }

    public final a0 I() {
        return this.f4983n;
    }

    public final a0 J() {
        return this.f4988s;
    }

    public final a0 K() {
        return this.f4989t;
    }

    public final a0 L() {
        return this.f4992w;
    }

    public final a0 M() {
        return this.f4993x;
    }

    public final void N(String str, String str2, Context context) {
        cm.l.f(str, "mString");
        cm.l.f(str2, "user_id");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.g(str, str2, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new k(uVar, this));
    }

    public final a0 O() {
        return this.f4974e;
    }

    public final void P(String str, Context context) {
        cm.l.f(str, "citizenId");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.j(str, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.e(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new l(uVar, this));
    }

    public final void Q(String str, Context context) {
        cm.l.f(str, "citizenId");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.j(str, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.e(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new m(uVar, this));
    }

    public final a0 R() {
        return this.G;
    }

    public final a0 S() {
        return this.H;
    }

    public final a0 T() {
        return this.D;
    }

    public final a0 U() {
        return this.C;
    }

    public final a0 V() {
        return this.f4976g;
    }

    public final a0 W() {
        return this.f4977h;
    }

    public final void X(String str, Context context) {
        cm.l.f(str, "citizenId");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        cm.l.c(string);
        String jSONObject = aVar2.h(str, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.g(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new n(uVar, this));
    }

    public final a0 Y() {
        return this.f4979j;
    }

    public final void Z(String str, String str2, String str3, String str4, Context context) {
        Context context2 = context;
        cm.l.f(str, "citizenId");
        cm.l.f(str2, "docnumber");
        String str5 = str3;
        cm.l.f(str5, "shared_id");
        String str6 = str4;
        cm.l.f(str6, "shared_days");
        cm.l.f(context2, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context2);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.h(str, str2, str5, str6, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.h(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new o(uVar, this));
    }

    public final void a0(String str, String str2, Context context) {
        cm.l.f(str, "doc_id");
        cm.l.f(str2, "docType");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.d(str, str2, string, gVar.l(), gVar.e(), gVar.k()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.i(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new p(uVar, this));
    }

    public final void g(String str, Context context) {
        cm.l.f(str, "doc_id");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        this.f4973d.b(aVar.f(b10, String.valueOf(aVar2.c(str, string, gVar.l(), gVar.k(), "DL", gVar.e()))), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final void h(String str, Context context) {
        cm.l.f(str, "doc_id");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        this.f4973d.b(aVar.f(b10, String.valueOf(aVar2.c(str, string, gVar.l(), gVar.k(), "DL", gVar.e()))), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final void i(String str, Context context) {
        cm.l.f(str, "doc_id");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        this.f4973d.b(aVar.f(b10, String.valueOf(aVar2.c(str, string, gVar.l(), gVar.k(), "RC", gVar.e()))), (String) uVar.f20234e).enqueue(new C0094c(uVar, this));
    }

    public final void j(String str, String str2, Context context) {
        cm.l.f(str, "shared_id");
        cm.l.f(str2, "Citizen_id");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.i(str, str2, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void k(String str, String str2, Context context) {
        cm.l.f(str, "shared_id");
        cm.l.f(str2, "Citizen_id");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.i(str, str2, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }

    public final void l(String str, Context context) {
        cm.l.f(str, "rc");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        String k10 = gVar.k();
        cm.l.c(string);
        String jSONObject = aVar2.g(str, k10, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(uVar, this));
    }

    public final void m(String str, String str2, String str3, String str4, Context context, String str5) {
        Context context2 = context;
        cm.l.f(str, "mString");
        String str6 = str2;
        cm.l.f(str6, "user_id");
        String str7 = str3;
        cm.l.f(str7, "chass");
        String str8 = str4;
        cm.l.f(str8, "engin_no");
        cm.l.f(context2, "con");
        String str9 = str5;
        cm.l.f(str9, "type");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context2);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.a(str, str6, str7, str8, string, gVar.l().toString(), str9, gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.j(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new g(uVar, this));
    }

    public final void n(String str, String str2, Context context) {
        cm.l.f(str, "recordId");
        cm.l.f(str2, "docId");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.e(str, str2, string, gVar.l().toString(), gVar.e(), gVar.k()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new h(uVar, this));
    }

    public final void o(String str, String str2, Context context) {
        cm.l.f(str, "recordId");
        cm.l.f(str2, "docId");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        cm.l.c(string);
        String jSONObject = aVar2.f(str, str2, string, gVar.l().toString(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new i(uVar, this));
    }

    public final a0 p() {
        return this.I;
    }

    public final a0 q() {
        return this.J;
    }

    public final void r(String str) {
        cm.l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.g(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f4973d.f(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new j(uVar, this));
    }

    public final a0 s() {
        return this.f4975f;
    }

    public final a0 t() {
        return this.f4981l;
    }

    public final a0 u() {
        return this.f4980k;
    }

    public final a0 v() {
        return this.K;
    }

    public final a0 w() {
        return this.L;
    }

    public final a0 x() {
        return this.A;
    }

    public final a0 y() {
        return this.B;
    }

    public final a0 z() {
        return this.f4994y;
    }
}
