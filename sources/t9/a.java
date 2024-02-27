package t9;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.ClServices.Pojo.GetClPojo;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.NewClPojo;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.DLDetailsForCancelApplPojo;
import id.c;
import j$.util.Base64;
import o9.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final n9.a f16585d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f16586e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f16587f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f16588g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f16589h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private a0 f16590i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private a0 f16591j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f16592k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f16593l = new a0();

    /* renamed from: t9.a$a  reason: collision with other inner class name */
    public static final class C0226a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f16596c;

        C0226a(Context context, String str, a aVar) {
            this.f16594a = context;
            this.f16595b = str;
            this.f16596c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16596c.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16594a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "cancelLLAppMob", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                ApiMonitorLog.a aVar2 = ApiMonitorLog.f20957k;
                Context context = this.f16594a;
                String t10 = v9.d.f17494a.t();
                l.c(response);
                aVar2.a(context, t10, "cancelLLAppMob", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f16595b;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f16595b;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), hj.a.class);
                l.e(j10, "fromJson(...)");
                android.support.v4.media.session.b.a(j10);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f16596c.n().k((Object) null);
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16597a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f16598b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f16599c;

        b(String str, a aVar, Context context) {
            this.f16597a = str;
            this.f16598b = aVar;
            this.f16599c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16598b.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16599c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getCLOnServices", aVar2.v(), aVar2.w());
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
                    this.f16598b.l().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f16597a;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f16597a;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("submit_response", valueOf);
            Object j10 = new i7.d().j(valueOf, ServiceSubmitResponse.class);
            l.e(j10, "fromJson(...)");
            ServiceSubmitResponse serviceSubmitResponse = (ServiceSubmitResponse) j10;
            if (response != null) {
                securityModle2 = (SecurityModle) response.body();
            }
            Log.d("response", String.valueOf(securityModle2));
            this.f16598b.s().k(serviceSubmitResponse);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16601b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f16602c;

        c(Context context, String str, a aVar) {
            this.f16600a = context;
            this.f16601b = str;
            this.f16602c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16602c.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16600a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getCLOnServices", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                ApiMonitorLog.a aVar2 = ApiMonitorLog.f20957k;
                Context context = this.f16600a;
                String t10 = v9.d.f17494a.t();
                l.c(response);
                aVar2.a(context, t10, "getCLOnServices", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f16601b;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f16601b;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, ServiceSubmitResponse.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f16602c.s().k((ServiceSubmitResponse) j10);
            } catch (Exception unused) {
                this.f16602c.l().k("error");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f16605c;

        d(Context context, String str, a aVar) {
            this.f16603a = context;
            this.f16604b = str;
            this.f16605c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16605c.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16603a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getCLData", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                ApiMonitorLog.a aVar2 = ApiMonitorLog.f20957k;
                Context context = this.f16603a;
                String t10 = v9.d.f17494a.t();
                l.c(response);
                aVar2.a(context, t10, "getCLData", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f16604b;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f16604b;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, GetClPojo.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f16605c.p().k((GetClPojo) j10);
            } catch (Exception unused) {
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f16608c;

        e(Context context, String str, a aVar) {
            this.f16606a = context;
            this.f16607b = str;
            this.f16608c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16608c.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16606a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getLLdetails", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                ApiMonitorLog.a aVar2 = ApiMonitorLog.f20957k;
                Context context = this.f16606a;
                String t10 = v9.d.f17494a.t();
                l.c(response);
                aVar2.a(context, t10, "getLLdetails", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f16607b;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f16607b;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, DLDetailsForCancelApplPojo.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f16608c.o().k((DLDetailsForCancelApplPojo) j10);
            } catch (Exception unused) {
            }
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16610b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f16611c;

        f(Context context, String str, a aVar) {
            this.f16609a = context;
            this.f16610b = str;
            this.f16611c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16611c.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16609a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getHZHillDrivingSchoolsForST", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                ApiMonitorLog.a aVar2 = ApiMonitorLog.f20957k;
                Context context = this.f16609a;
                String t10 = v9.d.f17494a.t();
                l.c(response);
                aVar2.a(context, t10, "getHZHillDrivingSchoolsForST", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f16610b;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f16610b;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, vi.d.class);
                l.e(j10, "fromJson(...)");
                android.support.v4.media.session.b.a(j10);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f16611c.q().k((Object) null);
            } catch (Exception unused) {
            }
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f16614c;

        g(Context context, String str, a aVar) {
            this.f16612a = context;
            this.f16613b = str;
            this.f16614c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16614c.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16612a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "newCL", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                ApiMonitorLog.a aVar2 = ApiMonitorLog.f20957k;
                Context context = this.f16612a;
                String t10 = v9.d.f17494a.t();
                l.c(response);
                aVar2.a(context, t10, "newCL", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f16613b;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f16613b;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, NewClPojo.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f16614c.r().k((NewClPojo) j10);
            } catch (Exception unused) {
            }
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f16617c;

        h(Context context, String str, a aVar) {
            this.f16615a = context;
            this.f16616b = str;
            this.f16617c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f16617c.l().k("error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f16615a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getCLOnServices", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                ApiMonitorLog.a aVar2 = ApiMonitorLog.f20957k;
                Context context = this.f16615a;
                String t10 = v9.d.f17494a.t();
                l.c(response);
                aVar2.a(context, t10, "getCLOnServices", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f16616b;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f16616b;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, ServiceSubmitResponse.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f16617c.s().k((ServiceSubmitResponse) j10);
            } catch (Exception unused) {
                this.f16617c.l().k("error");
            }
        }
    }

    public a(n9.a aVar) {
        l.f(aVar, "repository");
        this.f16585d = aVar;
    }

    public final void g(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "appNumber");
        l.f(str2, "dob");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.b(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.a(f10, valueOf).enqueue(new C0226a(context, valueOf, this));
    }

    public final void h(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        l.f(context, "context");
        l.f(str, "clState");
        l.f(str2, "clRto");
        l.f(str3, "permHouseNo");
        l.f(str4, "permStreet");
        l.f(str5, "permLocation");
        l.f(str6, "permPinCode");
        l.f(str7, "presHouseNo");
        l.f(str8, "presStreet");
        l.f(str9, "presLocation");
        l.f(str10, "presPinCode");
        l.f(str11, "permDistrict");
        l.f(str12, "permVillageOrTown");
        l.f(str13, "presDistrict");
        l.f(str14, "presVillageOrTown");
        l.f(str15, "permSubDistrict");
        l.f(str16, "presSubDistrict");
        l.f(str17, "serviceCode");
        l.f(str18, "clNumber");
        l.f(str19, "dateOfBirth");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.c(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.f(f10, valueOf).enqueue(new b(valueOf, this, context));
    }

    public final void i(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        l.f(context, "context");
        String str15 = str;
        l.f(str15, "stateCode");
        String str16 = str2;
        l.f(str16, "rtoCode");
        String str17 = str3;
        l.f(str17, "fName");
        String str18 = str4;
        l.f(str18, "mName");
        String str19 = str5;
        l.f(str19, "lName");
        String str20 = str6;
        l.f(str20, "rfName");
        String str21 = str7;
        l.f(str21, "rmName");
        String str22 = str8;
        l.f(str22, "rlName");
        String str23 = str9;
        l.f(str23, "relationTypeEntry");
        String str24 = str10;
        l.f(str24, "fullName");
        String str25 = str11;
        l.f(str25, "relFullName");
        String str26 = str12;
        l.f(str26, "serviceCode");
        l.f(str13, "dlValue");
        l.f(str14, "dobValue");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.d(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str13, str14).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.f(f10, valueOf).enqueue(new c(context, valueOf, this));
    }

    public final void j(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "clNumber");
        l.f(str2, "dob");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.g(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.b(f10, valueOf).enqueue(new d(context, valueOf, this));
    }

    public final void k(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "appNumber");
        l.f(str2, "dob");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.f(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.c(f10, valueOf).enqueue(new e(context, valueOf, this));
    }

    public final a0 l() {
        return this.f16592k;
    }

    public final void m(Context context, String str) {
        l.f(context, "context");
        l.f(str, "stateCode");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.a(str).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.d(f10, valueOf).enqueue(new f(context, valueOf, this));
    }

    public final a0 n() {
        return this.f16589h;
    }

    public final a0 o() {
        return this.f16590i;
    }

    public final a0 p() {
        return this.f16586e;
    }

    public final a0 q() {
        return this.f16588g;
    }

    public final a0 r() {
        return this.f16591j;
    }

    public final a0 s() {
        return this.f16587f;
    }

    public final a0 t() {
        return this.f16593l;
    }

    public final void u(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        l.f(context, "context");
        l.f(str, "newclState");
        l.f(str2, "newclRto");
        l.f(str3, "newclPresState");
        l.f(str4, "newclPermState");
        l.f(str5, "newclPresDistrict");
        l.f(str6, "newclPermDistrict");
        l.f(str7, "newclPresSubDistrict");
        l.f(str8, "newclPermSubDistrict");
        l.f(str9, "newclPresHouseNo");
        l.f(str10, "newclPermHouseNo");
        l.f(str11, "newclPresStreet");
        l.f(str12, "newclPermStreet");
        l.f(str13, "newclPresPincode");
        l.f(str14, "newclPermPincode");
        l.f(str15, "newclPresVillageOrTownCode");
        l.f(str16, "newclPermVillageOrTownCode");
        l.f(str17, "newclPresVillageOrTown");
        l.f(str18, "newclPermVillageOrTown");
        l.f(str19, "newclFname");
        l.f(str20, "newclMname");
        l.f(str21, "newclLname");
        l.f(str22, "newclRelation");
        l.f(str23, "newclRFname");
        l.f(str24, "newclRMname");
        l.f(str25, "newclRLname");
        l.f(str26, "newclGender");
        l.f(str27, "newclDateofBirth");
        l.f(str28, "newclEduQ");
        l.f(str29, "newclBlood");
        l.f(str30, "newclMobile");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0197a aVar2 = o9.a.f14458a;
        String jSONObject = aVar2.i(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str14, str11, str12, str13, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.e(f10, valueOf).enqueue(new g(context, valueOf, this));
    }

    public final void v(Context context, String str, String str2, String str3, String str4, String str5) {
        l.f(context, "context");
        l.f(str, "clState");
        l.f(str2, "clRto");
        l.f(str3, "serviceCode");
        l.f(str4, "clNumber");
        l.f(str5, "dateOfBirth");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.j(str, str2, str3, str4, str5).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16585d.f(f10, valueOf).enqueue(new h(context, valueOf, this));
    }
}
