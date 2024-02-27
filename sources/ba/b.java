package ba;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;
import xa.a;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final y9.a f4490d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f4491e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f4492f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f4493g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f4494h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f4495i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f4496j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f4497k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f4498l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f4499m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f4500n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f4501o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f4502p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private final a0 f4503q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private final a0 f4504r = new a0();

    /* renamed from: s  reason: collision with root package name */
    private final a0 f4505s = new a0();

    /* renamed from: t  reason: collision with root package name */
    private final a0 f4506t = new a0();

    /* renamed from: u  reason: collision with root package name */
    private final a0 f4507u = new a0();

    /* renamed from: v  reason: collision with root package name */
    private final a0 f4508v = new a0();

    /* renamed from: w  reason: collision with root package name */
    private final a0 f4509w = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4512c;

        a(String str, b bVar, Context context) {
            this.f4510a = str;
            this.f4511b = bVar;
            this.f4512c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4511b.s().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4512c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getDLdetForGivenDLNumber", aVar2.v(), aVar2.w());
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
                } catch (Error unused) {
                    this.f4511b.s().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f4510a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f4510a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), DLEligibleMasterData.DlservicesValidationdto.class);
            l.e(j10, "fromJson(...)");
            this.f4511b.r().k((DLEligibleMasterData.DlservicesValidationdto) j10);
        }
    }

    /* renamed from: ba.b$b  reason: collision with other inner class name */
    public static final class C0086b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4514b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4515c;

        C0086b(String str, b bVar, Context context) {
            this.f4513a = str;
            this.f4514b = bVar;
            this.f4515c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4514b.A().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4515c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "rtos", aVar2.v(), aVar2.w());
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
                    this.f4514b.A().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f4513a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f4513a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), CurrentRTO.class);
            l.e(j10, "fromJson(...)");
            this.f4514b.y().k((CurrentRTO) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4518c;

        c(String str, b bVar, Context context) {
            this.f4516a = str;
            this.f4517b = bVar;
            this.f4518c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4517b.B().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4518c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "stateMast", aVar2.v(), aVar2.w());
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
                    this.f4517b.B().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f4516a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f4516a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("mCurrentStateSarathi", valueOf);
            Object j10 = new i7.d().j(valueOf, SarathiStatePojo.class);
            l.e(j10, "fromJson(...)");
            this.f4517b.z().k((SarathiStatePojo) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4521c;

        d(String str, b bVar, Context context) {
            this.f4519a = str;
            this.f4520b = bVar;
            this.f4521c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4520b.m().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4521c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getS4customstDet", aVar2.v(), aVar2.w());
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(3:21|(1:23)|24)(3:26|(1:28)|29)|25|30|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r10 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r10.body();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
            if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
            r0 = id.c.f12675a;
            r1 = r8.f4519a;
            r3 = j$.util.Base64.getDecoder();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
            if (r10 != null) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
            r2 = r10.getData();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
            r10 = r3.decode(r2);
            cm.l.e(r10, "decode(...)");
            r9 = r0.a(r1, new java.lang.String(r10, km.d.f24740b));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
            r9 = java.lang.String.valueOf(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
            r1 = id.c.f12675a;
            r3 = r8.f4519a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
            if (r10 != null) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
            r2 = r10.getData();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
            r10 = android.util.Base64.decode(r2, 0);
            cm.l.e(r10, "decode(...)");
            r9 = r1.a(r3, new java.lang.String(r10, km.d.f24740b));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
            android.util.Log.d("ResponseDec", r9);
            r8.f4520b.m().k(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
            r8.f4520b.m().k("Error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0075 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r9, retrofit2.Response r10) {
            /*
                r8 = this;
                java.lang.String r9 = "decode(...)"
                if (r10 == 0) goto L_0x00db
                r0 = 0
                r1 = 26
                r2 = 0
                java.lang.Object r3 = r10.body()     // Catch:{ Exception -> 0x0075 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r3 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r3     // Catch:{ Exception -> 0x0075 }
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0075 }
                if (r4 < r1) goto L_0x0039
                id.c$a r4 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                java.lang.String r5 = r8.f4519a     // Catch:{ Exception -> 0x0075 }
                j$.util.Base64$Decoder r6 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0075 }
                if (r3 == 0) goto L_0x0021
                java.lang.String r3 = r3.getData()     // Catch:{ Exception -> 0x0075 }
                goto L_0x0022
            L_0x0021:
                r3 = r2
            L_0x0022:
                byte[] r3 = r6.decode((java.lang.String) r3)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r3, r9)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r7 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r6.<init>(r3, r7)     // Catch:{ Exception -> 0x0075 }
            L_0x0030:
                java.lang.String r3 = r4.a(r5, r6)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0054
            L_0x0039:
                id.c$a r4 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                java.lang.String r5 = r8.f4519a     // Catch:{ Exception -> 0x0075 }
                if (r3 == 0) goto L_0x0044
                java.lang.String r3 = r3.getData()     // Catch:{ Exception -> 0x0075 }
                goto L_0x0045
            L_0x0044:
                r3 = r2
            L_0x0045:
                byte[] r3 = android.util.Base64.decode(r3, r0)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r3, r9)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r7 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r6.<init>(r3, r7)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0030
            L_0x0054:
                java.lang.String r4 = "customStateResp"
                android.util.Log.d(r4, r3)     // Catch:{ Exception -> 0x0075 }
                i7.d r4 = new i7.d     // Catch:{ Exception -> 0x0075 }
                r4.<init>()     // Catch:{ Exception -> 0x0075 }
                java.lang.Class<com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState> r5 = com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState.class
                java.lang.Object r3 = r4.j(r3, r5)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r4 = "fromJson(...)"
                cm.l.e(r3, r4)     // Catch:{ Exception -> 0x0075 }
                com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState r3 = (com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState) r3     // Catch:{ Exception -> 0x0075 }
                ba.b r4 = r8.f4520b     // Catch:{ Exception -> 0x0075 }
                androidx.lifecycle.a0 r4 = r4.C()     // Catch:{ Exception -> 0x0075 }
                r4.k(r3)     // Catch:{ Exception -> 0x0075 }
                goto L_0x00db
            L_0x0075:
                java.lang.Object r10 = r10.body()     // Catch:{ Error -> 0x00d0 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r10 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r10     // Catch:{ Error -> 0x00d0 }
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Error -> 0x00d0 }
                if (r3 < r1) goto L_0x00a4
                id.c$a r0 = id.c.f12675a     // Catch:{ Error -> 0x00d0 }
                java.lang.String r1 = r8.f4519a     // Catch:{ Error -> 0x00d0 }
                j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Error -> 0x00d0 }
                if (r10 == 0) goto L_0x008d
                java.lang.String r2 = r10.getData()     // Catch:{ Error -> 0x00d0 }
            L_0x008d:
                byte[] r10 = r3.decode((java.lang.String) r2)     // Catch:{ Error -> 0x00d0 }
                cm.l.e(r10, r9)     // Catch:{ Error -> 0x00d0 }
                java.lang.String r9 = new java.lang.String     // Catch:{ Error -> 0x00d0 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Error -> 0x00d0 }
                r9.<init>(r10, r2)     // Catch:{ Error -> 0x00d0 }
                java.lang.String r9 = r0.a(r1, r9)     // Catch:{ Error -> 0x00d0 }
            L_0x009f:
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Error -> 0x00d0 }
                goto L_0x00c1
            L_0x00a4:
                id.c$a r1 = id.c.f12675a     // Catch:{ Error -> 0x00d0 }
                java.lang.String r3 = r8.f4519a     // Catch:{ Error -> 0x00d0 }
                if (r10 == 0) goto L_0x00ae
                java.lang.String r2 = r10.getData()     // Catch:{ Error -> 0x00d0 }
            L_0x00ae:
                byte[] r10 = android.util.Base64.decode(r2, r0)     // Catch:{ Error -> 0x00d0 }
                cm.l.e(r10, r9)     // Catch:{ Error -> 0x00d0 }
                java.lang.String r9 = new java.lang.String     // Catch:{ Error -> 0x00d0 }
                java.nio.charset.Charset r0 = km.d.f24740b     // Catch:{ Error -> 0x00d0 }
                r9.<init>(r10, r0)     // Catch:{ Error -> 0x00d0 }
                java.lang.String r9 = r1.a(r3, r9)     // Catch:{ Error -> 0x00d0 }
                goto L_0x009f
            L_0x00c1:
                java.lang.String r10 = "ResponseDec"
                android.util.Log.d(r10, r9)     // Catch:{ Error -> 0x00d0 }
                ba.b r10 = r8.f4520b     // Catch:{ Error -> 0x00d0 }
                androidx.lifecycle.a0 r10 = r10.m()     // Catch:{ Error -> 0x00d0 }
                r10.k(r9)     // Catch:{ Error -> 0x00d0 }
                goto L_0x00db
            L_0x00d0:
                ba.b r9 = r8.f4520b
                androidx.lifecycle.a0 r9 = r9.m()
                java.lang.String r10 = "Error"
                r9.k(r10)
            L_0x00db:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.b.d.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4522a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4523b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4524c;

        e(String str, b bVar, Context context) {
            this.f4522a = str;
            this.f4523b = bVar;
            this.f4524c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4523b.p().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4524c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getDLLicence", aVar2.v(), aVar2.w());
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
                    this.f4523b.p().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            int i10 = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = this.f4522a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = this.f4522a;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            int length = valueOf.length() / 1000;
            if (length >= 0) {
                while (true) {
                    int i11 = i10 * 1000;
                    int i12 = i10 + 1;
                    int i13 = i12 * 1000;
                    if (i13 > valueOf.length()) {
                        i13 = valueOf.length();
                    }
                    String substring = valueOf.substring(i11, i13);
                    l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.v("TAG_ADD", substring);
                    if (i10 == length) {
                        break;
                    }
                    i10 = i12;
                }
            }
            Object j10 = new i7.d().j(valueOf, DLServiceResponseModleV1.class);
            l.e(j10, "fromJson(...)");
            this.f4523b.o().k((DLServiceResponseModleV1) j10);
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4527c;

        f(String str, b bVar, Context context) {
            this.f4525a = str;
            this.f4526b = bVar;
            this.f4527c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4526b.m().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4527c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getDLLastEndRTODetForGivenDLNumber", aVar2.v(), aVar2.w());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r4.f4526b.m().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
            r4.f4526b.m().k("Error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x006c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                r4 = this;
                if (r6 == 0) goto L_0x0083
                java.lang.Object r5 = r6.body()     // Catch:{ Exception -> 0x006c }
                com.nic.mparivahan.Security.SecModle.SecurityModle r5 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r5     // Catch:{ Exception -> 0x006c }
                int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x006c }
                r0 = 26
                java.lang.String r1 = "decode(...)"
                r2 = 0
                if (r6 < r0) goto L_0x0036
                id.c$a r6 = id.c.f12675a     // Catch:{ Exception -> 0x006c }
                java.lang.String r0 = r4.f4525a     // Catch:{ Exception -> 0x006c }
                j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x006c }
                if (r5 == 0) goto L_0x001f
                java.lang.String r2 = r5.getData()     // Catch:{ Exception -> 0x006c }
            L_0x001f:
                byte[] r5 = r3.decode((java.lang.String) r2)     // Catch:{ Exception -> 0x006c }
                cm.l.e(r5, r1)     // Catch:{ Exception -> 0x006c }
                java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x006c }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x006c }
                r1.<init>(r5, r2)     // Catch:{ Exception -> 0x006c }
            L_0x002d:
                java.lang.String r5 = r6.a(r0, r1)     // Catch:{ Exception -> 0x006c }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x006c }
                goto L_0x0050
            L_0x0036:
                id.c$a r6 = id.c.f12675a     // Catch:{ Exception -> 0x006c }
                java.lang.String r0 = r4.f4525a     // Catch:{ Exception -> 0x006c }
                if (r5 == 0) goto L_0x0040
                java.lang.String r2 = r5.getData()     // Catch:{ Exception -> 0x006c }
            L_0x0040:
                r5 = 0
                byte[] r5 = android.util.Base64.decode(r2, r5)     // Catch:{ Exception -> 0x006c }
                cm.l.e(r5, r1)     // Catch:{ Exception -> 0x006c }
                java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x006c }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x006c }
                r1.<init>(r5, r2)     // Catch:{ Exception -> 0x006c }
                goto L_0x002d
            L_0x0050:
                i7.d r6 = new i7.d     // Catch:{ Exception -> 0x006c }
                r6.<init>()     // Catch:{ Exception -> 0x006c }
                java.lang.Class<com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto> r0 = com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto.class
                java.lang.Object r5 = r6.j(r5, r0)     // Catch:{ Exception -> 0x006c }
                java.lang.String r6 = "fromJson(...)"
                cm.l.e(r5, r6)     // Catch:{ Exception -> 0x006c }
                com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto r5 = (com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto) r5     // Catch:{ Exception -> 0x006c }
                ba.b r6 = r4.f4526b     // Catch:{ Exception -> 0x006c }
                androidx.lifecycle.a0 r6 = r6.l()     // Catch:{ Exception -> 0x006c }
                r6.k(r5)     // Catch:{ Exception -> 0x006c }
                goto L_0x0083
            L_0x006c:
                ba.b r5 = r4.f4526b     // Catch:{ Error -> 0x0078 }
                androidx.lifecycle.a0 r5 = r5.m()     // Catch:{ Error -> 0x0078 }
                java.lang.String r6 = "error"
                r5.k(r6)     // Catch:{ Error -> 0x0078 }
                goto L_0x0083
            L_0x0078:
                ba.b r5 = r4.f4526b
                androidx.lifecycle.a0 r5 = r5.m()
                java.lang.String r6 = "Error"
                r5.k(r6)
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.b.f.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4530c;

        g(String str, b bVar, Context context) {
            this.f4528a = str;
            this.f4529b = bVar;
            this.f4530c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4530c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "reSendSMSAlerts", aVar2.v(), aVar2.w());
            this.f4529b.v().k(th2 != null ? th2.getMessage() : null);
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
                    this.f4529b.t().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f4528a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f4528a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), ResendOtp.class);
            l.e(j10, "fromJson(...)");
            this.f4529b.w().k((ResendOtp) j10);
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4533c;

        h(String str, b bVar, Context context) {
            this.f4531a = str;
            this.f4532b = bVar;
            this.f4533c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4532b.t().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4533c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "sendSMSAlerts", aVar2.v(), aVar2.w());
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
                    this.f4532b.t().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f4531a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f4531a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SendOtpResult.class);
            l.e(j10, "fromJson(...)");
            this.f4532b.u().k((SendOtpResult) j10);
        }
    }

    public static final class i implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f4535b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f4536c;

        i(String str, b bVar, Context context) {
            this.f4534a = str;
            this.f4535b = bVar;
            this.f4536c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f4535b.t().k(th2 != null ? th2.getMessage() : null);
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f4536c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "verifySMSOtp", aVar2.v(), aVar2.w());
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
                } catch (Error unused) {
                    this.f4535b.t().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f4534a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f4534a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), OtpVerifyResult.class);
            l.e(j10, "fromJson(...)");
            this.f4535b.E().k((OtpVerifyResult) j10);
        }
    }

    public b(y9.a aVar) {
        l.f(aVar, "repository");
        this.f4490d = aVar;
    }

    public final a0 A() {
        return this.f4507u;
    }

    public final a0 B() {
        return this.f4505s;
    }

    public final a0 C() {
        return this.f4508v;
    }

    public final void D(Context context, String str) {
        l.f(context, "context");
        l.f(str, "smsId");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.h(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.g(aVar.f(b10, jSONObject), valueOf).enqueue(new g(valueOf, this, context));
    }

    public final a0 E() {
        return this.f4495i;
    }

    public final void F(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "mobile_no");
        l.f(str2, "smsId");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.j(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.h(aVar.f(b10, jSONObject), valueOf).enqueue(new h(valueOf, this, context));
    }

    public final void G(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "otp");
        l.f(str2, "otpid");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.i(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.i(aVar.f(b10, jSONObject), valueOf).enqueue(new i(valueOf, this, context));
    }

    public final void g(Context context, String str, String str2, String str3, String str4) {
        l.f(context, "context");
        l.f(str, "dlnumber");
        l.f(str2, "dob");
        l.f(str3, "rto");
        l.f(str4, "random_key");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.a(str, str2, str3, str4).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.d(aVar.f(b10, q.B0(jSONObject).toString()), valueOf).enqueue(new a(valueOf, this, context));
    }

    public final void h(Context context, String str) {
        l.f(context, "context");
        l.f(str, "rto");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.c(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.b(aVar.f(b10, jSONObject), valueOf).enqueue(new C0086b(valueOf, this, context));
    }

    public final void i(Context context) {
        l.f(context, "context");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.d().toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.c(aVar.f(b10, jSONObject), valueOf).enqueue(new c(valueOf, this, context));
    }

    public final void j(Context context, String str) {
        l.f(context, "context");
        l.f(str, "stateCode");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.e(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.a(aVar.f(b10, jSONObject), valueOf).enqueue(new d(valueOf, this, context));
    }

    public final void k(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str2, "dob");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, str2, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.e(aVar.f(b10, jSONObject), valueOf).enqueue(new e(valueOf, this, context));
    }

    public final a0 l() {
        return this.f4497k;
    }

    public final a0 m() {
        return this.f4498l;
    }

    public final a0 n() {
        return this.f4502p;
    }

    public final a0 o() {
        return this.f4499m;
    }

    public final a0 p() {
        return this.f4500n;
    }

    public final a0 q() {
        return this.f4503q;
    }

    public final a0 r() {
        return this.f4496j;
    }

    public final a0 s() {
        return this.f4501o;
    }

    public final a0 t() {
        return this.f4491e;
    }

    public final a0 u() {
        return this.f4492f;
    }

    public final a0 v() {
        return this.f4494h;
    }

    public final a0 w() {
        return this.f4493g;
    }

    public final void x(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "dlNumber");
        l.f(str2, "dob");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.f(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f4490d.f(aVar.f(b10, jSONObject), valueOf).enqueue(new f(valueOf, this, context));
    }

    public final a0 y() {
        return this.f4506t;
    }

    public final a0 z() {
        return this.f4504r;
    }
}
