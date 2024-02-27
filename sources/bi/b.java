package bi;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanApplVerifySuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanDisposeAppSuccessModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanViewModel.PendingTransTaxBreakUpModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.VahanPendingTransBankModel;
import id.c;
import j$.util.Base64;
import java.io.IOException;
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
    private final wg.b f19498d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19499e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19500f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f19501g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f19502h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f19503i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f19504j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f19505k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f19506l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f19507m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f19508n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private a0 f19509o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private a0 f19510p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private a0 f19511q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private a0 f19512r = new a0();

    /* renamed from: s  reason: collision with root package name */
    private a0 f19513s = new a0();

    /* renamed from: t  reason: collision with root package name */
    private a0 f19514t = new a0();

    /* renamed from: u  reason: collision with root package name */
    private a0 f19515u = new a0();

    /* renamed from: v  reason: collision with root package name */
    private a0 f19516v = new a0();

    /* renamed from: w  reason: collision with root package name */
    private a0 f19517w = new a0();

    /* renamed from: x  reason: collision with root package name */
    private a0 f19518x = new a0();

    /* renamed from: y  reason: collision with root package name */
    private a0 f19519y = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19521b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19522c;

        a(Context context, u uVar, b bVar) {
            this.f19520a = context;
            this.f19521b = uVar;
            this.f19522c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19520a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "disposeApplication", aVar2.v(), aVar2.v());
            this.f19522c.o().k("Error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19520a, v9.d.f17494a.z(), "disposeApplication", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19521b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19521b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("pendingDetails", valueOf);
                Object j10 = new i7.d().j(valueOf, VahanDisposeAppSuccessModel.class);
                l.e(j10, "fromJson(...)");
                this.f19522c.p().k((VahanDisposeAppSuccessModel) j10);
            } catch (Exception unused) {
                this.f19522c.o().k("Error");
            }
        }
    }

    /* renamed from: bi.b$b  reason: collision with other inner class name */
    public static final class C0261b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19524b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19525c;

        C0261b(Context context, u uVar, b bVar) {
            this.f19523a = context;
            this.f19524b = uVar;
            this.f19525c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19523a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "detaildisposeapplication", aVar2.v(), aVar2.v());
            this.f19525c.i().k(th2 != null ? th2.getMessage() : null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r11 = new org.json.JSONObject("");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
            if (r11.has("errorDesc") != false) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
            r9.f19525c.i().k(r11.getString("errorDesc"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
            r9.f19525c.i().k("ERROR");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
            r9.f19525c.i().k("ERROR");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00c2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r10, retrofit2.Response r11) {
            /*
                r9 = this;
                java.lang.String r10 = "ERROR"
                java.lang.String r0 = "errorDesc"
                java.lang.String r1 = ""
                com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00c2 }
                android.content.Context r3 = r9.f19523a     // Catch:{ Exception -> 0x00c2 }
                v9.d$a r4 = v9.d.f17494a     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r4 = r4.z()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r5 = "detaildisposeapplication"
                r8 = 0
                if (r11 == 0) goto L_0x001e
                int r6 = r11.code()     // Catch:{ Exception -> 0x00c2 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00c2 }
                goto L_0x001f
            L_0x001e:
                r6 = r8
            L_0x001f:
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00c2 }
                if (r11 == 0) goto L_0x002a
                java.lang.String r7 = r11.message()     // Catch:{ Exception -> 0x00c2 }
                goto L_0x002b
            L_0x002a:
                r7 = r8
            L_0x002b:
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00c2 }
                r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00c2 }
                if (r11 == 0) goto L_0x003b
                java.lang.Object r11 = r11.body()     // Catch:{ Exception -> 0x00c2 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r11 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r11     // Catch:{ Exception -> 0x00c2 }
                goto L_0x003c
            L_0x003b:
                r11 = r8
            L_0x003c:
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c2 }
                r3 = 26
                java.lang.String r4 = "decode(...)"
                if (r2 < r3) goto L_0x006e
                id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00c2 }
                cm.u r3 = r9.f19524b     // Catch:{ Exception -> 0x00c2 }
                java.lang.Object r3 = r3.f20234e     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00c2 }
                j$.util.Base64$Decoder r5 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00c2 }
                if (r11 == 0) goto L_0x0056
                java.lang.String r8 = r11.getData()     // Catch:{ Exception -> 0x00c2 }
            L_0x0056:
                byte[] r11 = r5.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00c2 }
                cm.l.e(r11, r4)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00c2 }
                java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00c2 }
                r4.<init>(r11, r5)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r11 = r2.a(r3, r4)     // Catch:{ Exception -> 0x00c2 }
            L_0x0068:
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00c2 }
                r1 = r11
                goto L_0x0090
            L_0x006e:
                id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00c2 }
                cm.u r3 = r9.f19524b     // Catch:{ Exception -> 0x00c2 }
                java.lang.Object r3 = r3.f20234e     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00c2 }
                if (r11 == 0) goto L_0x007c
                java.lang.String r8 = r11.getData()     // Catch:{ Exception -> 0x00c2 }
            L_0x007c:
                r11 = 0
                byte[] r11 = android.util.Base64.decode(r8, r11)     // Catch:{ Exception -> 0x00c2 }
                cm.l.e(r11, r4)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00c2 }
                java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00c2 }
                r4.<init>(r11, r5)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r11 = r2.a(r3, r4)     // Catch:{ Exception -> 0x00c2 }
                goto L_0x0068
            L_0x0090:
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c2 }
                r11.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x00c2 }
                boolean r2 = r11.has(r0)     // Catch:{ Exception -> 0x00c2 }
                if (r2 == 0) goto L_0x00a9
                bi.b r2 = r9.f19525c     // Catch:{ Exception -> 0x00c2 }
                androidx.lifecycle.a0 r2 = r2.i()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r11 = r11.getString(r0)     // Catch:{ Exception -> 0x00c2 }
            L_0x00a5:
                r2.k(r11)     // Catch:{ Exception -> 0x00c2 }
                goto L_0x00ee
            L_0x00a9:
                i7.d r11 = new i7.d     // Catch:{ Exception -> 0x00c2 }
                r11.<init>()     // Catch:{ Exception -> 0x00c2 }
                java.lang.Class<com.nic.mparivahan.VahanServices.VahanModel.VahanApplDisposeSuccessModel> r2 = com.nic.mparivahan.VahanServices.VahanModel.VahanApplDisposeSuccessModel.class
                java.lang.Object r11 = r11.j(r1, r2)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r2 = "fromJson(...)"
                cm.l.e(r11, r2)     // Catch:{ Exception -> 0x00c2 }
                com.nic.mparivahan.VahanServices.VahanModel.VahanApplDisposeSuccessModel r11 = (com.nic.mparivahan.VahanServices.VahanModel.VahanApplDisposeSuccessModel) r11     // Catch:{ Exception -> 0x00c2 }
                bi.b r2 = r9.f19525c     // Catch:{ Exception -> 0x00c2 }
                androidx.lifecycle.a0 r2 = r2.l()     // Catch:{ Exception -> 0x00c2 }
                goto L_0x00a5
            L_0x00c2:
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e5 }
                r11.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x00e5 }
                boolean r1 = r11.has(r0)     // Catch:{ Exception -> 0x00e5 }
                if (r1 == 0) goto L_0x00db
                bi.b r1 = r9.f19525c     // Catch:{ Exception -> 0x00e5 }
                androidx.lifecycle.a0 r1 = r1.i()     // Catch:{ Exception -> 0x00e5 }
                java.lang.String r11 = r11.getString(r0)     // Catch:{ Exception -> 0x00e5 }
                r1.k(r11)     // Catch:{ Exception -> 0x00e5 }
                goto L_0x00ee
            L_0x00db:
                bi.b r11 = r9.f19525c     // Catch:{ Exception -> 0x00e5 }
                androidx.lifecycle.a0 r11 = r11.i()     // Catch:{ Exception -> 0x00e5 }
                r11.k(r10)     // Catch:{ Exception -> 0x00e5 }
                goto L_0x00ee
            L_0x00e5:
                bi.b r11 = r9.f19525c
                androidx.lifecycle.a0 r11 = r11.i()
                r11.k(r10)
            L_0x00ee:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.b.C0261b.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19527b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19528c;

        c(Context context, u uVar, b bVar) {
            this.f19526a = context;
            this.f19527b = uVar;
            this.f19528c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19526a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.s(), "sendSMSAlerts", aVar2.v(), aVar2.v());
            this.f19528c.j().k("Error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            ApiMonitorLog.f20957k.a(this.f19526a, v9.d.f17494a.s(), "sendSMSAlerts", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
            if (response.isSuccessful() && response.code() == 200) {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19527b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19527b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("appDispose", valueOf);
                Object j10 = new i7.d().j(valueOf, SendOtpResult.class);
                l.e(j10, "fromJson(...)");
                this.f19528c.k().k((SendOtpResult) j10);
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19529a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19530b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19531c;

        d(Context context, u uVar, b bVar) {
            this.f19529a = context;
            this.f19530b = uVar;
            this.f19531c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19529a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "showDetailByReg_No", aVar2.v(), aVar2.v());
            this.f19531c.v().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19529a, v9.d.f17494a.z(), "showDetailByReg_No", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19530b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19530b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("pendingDetails", valueOf);
                Object j10 = new i7.d().j(valueOf, PendingTransRegNoModel.class);
                l.e(j10, "fromJson(...)");
                this.f19531c.x().k((PendingTransRegNoModel) j10);
            } catch (Exception e10) {
                Log.d("pendingDetails-err", e10.getLocalizedMessage());
                try {
                    JSONObject jSONObject = new JSONObject("");
                    if (jSONObject.has("errorDesc")) {
                        this.f19531c.v().k(jSONObject.getString("errorDesc").toString());
                    } else {
                        this.f19531c.v().k("ERROR");
                    }
                } catch (Exception unused) {
                    this.f19531c.v().k("ERROR");
                }
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19533b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19534c;

        e(Context context, u uVar, b bVar) {
            this.f19532a = context;
            this.f19533b = uVar;
            this.f19534c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19532a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "showDetailByTrans_No", aVar2.v(), aVar2.v());
            this.f19534c.v().k(th2 != null ? th2.getMessage() : null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:30|31|32|33) */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r10, retrofit2.Response r11) {
            /*
                r9 = this;
                java.lang.String r10 = "errorDesc"
                java.lang.String r0 = "ERROR"
                java.lang.String r1 = ""
                com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x001e }
                android.content.Context r3 = r9.f19532a     // Catch:{ Exception -> 0x001e }
                v9.d$a r4 = v9.d.f17494a     // Catch:{ Exception -> 0x001e }
                java.lang.String r4 = r4.z()     // Catch:{ Exception -> 0x001e }
                java.lang.String r5 = "showDetailByTrans_No"
                r8 = 0
                if (r11 == 0) goto L_0x0021
                int r6 = r11.code()     // Catch:{ Exception -> 0x001e }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x001e }
                goto L_0x0022
            L_0x001e:
                r11 = move-exception
                goto L_0x00e1
            L_0x0021:
                r6 = r8
            L_0x0022:
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x001e }
                if (r11 == 0) goto L_0x002d
                java.lang.String r7 = r11.message()     // Catch:{ Exception -> 0x001e }
                goto L_0x002e
            L_0x002d:
                r7 = r8
            L_0x002e:
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x001e }
                r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x001e }
                cm.l.c(r11)     // Catch:{ Exception -> 0x001e }
                boolean r2 = r11.isSuccessful()     // Catch:{ Exception -> 0x001e }
                if (r2 == 0) goto L_0x00da
                java.lang.Object r11 = r11.body()     // Catch:{ Exception -> 0x001e }
                com.nic.mparivahan.Security.SecModle.SecurityModle r11 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r11     // Catch:{ Exception -> 0x001e }
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x001e }
                r3 = 26
                r4 = 0
                java.lang.String r5 = "decode(...)"
                if (r2 < r3) goto L_0x0077
                id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x001e }
                cm.u r3 = r9.f19533b     // Catch:{ Exception -> 0x001e }
                java.lang.Object r3 = r3.f20234e     // Catch:{ Exception -> 0x001e }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x001e }
                j$.util.Base64$Decoder r6 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x001e }
                if (r11 == 0) goto L_0x005f
                java.lang.String r8 = r11.getData()     // Catch:{ Exception -> 0x001e }
            L_0x005f:
                byte[] r11 = r6.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x001e }
                cm.l.e(r11, r5)     // Catch:{ Exception -> 0x001e }
                java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x001e }
                java.nio.charset.Charset r6 = km.d.f24740b     // Catch:{ Exception -> 0x001e }
                r5.<init>(r11, r6)     // Catch:{ Exception -> 0x001e }
                java.lang.String r11 = r2.a(r3, r5)     // Catch:{ Exception -> 0x001e }
            L_0x0071:
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x001e }
                r1 = r11
                goto L_0x0098
            L_0x0077:
                id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x001e }
                cm.u r3 = r9.f19533b     // Catch:{ Exception -> 0x001e }
                java.lang.Object r3 = r3.f20234e     // Catch:{ Exception -> 0x001e }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x001e }
                if (r11 == 0) goto L_0x0085
                java.lang.String r8 = r11.getData()     // Catch:{ Exception -> 0x001e }
            L_0x0085:
                byte[] r11 = android.util.Base64.decode(r8, r4)     // Catch:{ Exception -> 0x001e }
                cm.l.e(r11, r5)     // Catch:{ Exception -> 0x001e }
                java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x001e }
                java.nio.charset.Charset r6 = km.d.f24740b     // Catch:{ Exception -> 0x001e }
                r5.<init>(r11, r6)     // Catch:{ Exception -> 0x001e }
                java.lang.String r11 = r2.a(r3, r5)     // Catch:{ Exception -> 0x001e }
                goto L_0x0071
            L_0x0098:
                i7.d r11 = new i7.d     // Catch:{ Exception -> 0x001e }
                r11.<init>()     // Catch:{ Exception -> 0x001e }
                java.lang.Class<com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel> r2 = com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel.class
                java.lang.Object r11 = r11.j(r1, r2)     // Catch:{ Exception -> 0x001e }
                java.lang.String r2 = "fromJson(...)"
                cm.l.e(r11, r2)     // Catch:{ Exception -> 0x001e }
                com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel r11 = (com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel) r11     // Catch:{ Exception -> 0x001e }
                ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x001e }
                java.lang.Object r3 = r11.get(r4)     // Catch:{ Exception -> 0x001e }
                com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel r3 = (com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel) r3     // Catch:{ Exception -> 0x001e }
                java.lang.String r3 = r3.getTransactionID()     // Catch:{ Exception -> 0x001e }
                boolean r2 = r2.m(r3)     // Catch:{ Exception -> 0x001e }
                if (r2 != 0) goto L_0x00c6
                bi.b r2 = r9.f19534c     // Catch:{ Exception -> 0x001e }
                androidx.lifecycle.a0 r2 = r2.x()     // Catch:{ Exception -> 0x001e }
                r2.k(r11)     // Catch:{ Exception -> 0x001e }
                goto L_0x011a
            L_0x00c6:
                bi.b r11 = r9.f19534c     // Catch:{ Exception -> 0x00d0 }
                androidx.lifecycle.a0 r11 = r11.v()     // Catch:{ Exception -> 0x00d0 }
                r11.k(r0)     // Catch:{ Exception -> 0x00d0 }
                goto L_0x011a
            L_0x00d0:
                bi.b r11 = r9.f19534c     // Catch:{ Exception -> 0x001e }
                androidx.lifecycle.a0 r11 = r11.v()     // Catch:{ Exception -> 0x001e }
            L_0x00d6:
                r11.k(r0)     // Catch:{ Exception -> 0x001e }
                goto L_0x011a
            L_0x00da:
                bi.b r11 = r9.f19534c     // Catch:{ Exception -> 0x001e }
                androidx.lifecycle.a0 r11 = r11.i()     // Catch:{ Exception -> 0x001e }
                goto L_0x00d6
            L_0x00e1:
                java.lang.String r2 = "pendingDetails-err"
                java.lang.String r11 = r11.getLocalizedMessage()
                android.util.Log.d(r2, r11)
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0111 }
                r11.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0111 }
                boolean r1 = r11.has(r10)     // Catch:{ Exception -> 0x0111 }
                if (r1 == 0) goto L_0x0107
                bi.b r1 = r9.f19534c     // Catch:{ Exception -> 0x0111 }
                androidx.lifecycle.a0 r1 = r1.v()     // Catch:{ Exception -> 0x0111 }
                java.lang.String r10 = r11.getString(r10)     // Catch:{ Exception -> 0x0111 }
                java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0111 }
                r1.k(r10)     // Catch:{ Exception -> 0x0111 }
                goto L_0x011a
            L_0x0107:
                bi.b r10 = r9.f19534c     // Catch:{ Exception -> 0x0111 }
                androidx.lifecycle.a0 r10 = r10.v()     // Catch:{ Exception -> 0x0111 }
                r10.k(r0)     // Catch:{ Exception -> 0x0111 }
                goto L_0x011a
            L_0x0111:
                bi.b r10 = r9.f19534c
                androidx.lifecycle.a0 r10 = r10.v()
                r10.k(r0)
            L_0x011a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.b.e.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19536b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19537c;

        f(Context context, u uVar, b bVar) {
            this.f19535a = context;
            this.f19536b = uVar;
            this.f19537c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19535a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getTaxBreakUp", aVar2.v(), aVar2.v());
            this.f19537c.y().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            String a11;
            l.f(call, "call");
            l.f(response, "response");
            ApiMonitorLog.f20957k.a(this.f19535a, v9.d.f17494a.z(), "getTaxBreakUp", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
            String str = null;
            if (!response.isSuccessful() || response.code() != 200) {
                if (response.code() == 400) {
                    try {
                        SecurityModle securityModle = (SecurityModle) response.body();
                        if (Build.VERSION.SDK_INT >= 26) {
                            c.a aVar = id.c.f12675a;
                            String str2 = (String) this.f19536b.f20234e;
                            Base64.Decoder decoder = Base64.getDecoder();
                            if (securityModle != null) {
                                str = securityModle.getData();
                            }
                            byte[] decode = decoder.decode(str);
                            l.e(decode, "decode(...)");
                            a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                        } else {
                            c.a aVar2 = id.c.f12675a;
                            String str3 = (String) this.f19536b.f20234e;
                            if (securityModle != null) {
                                str = securityModle.getData();
                            }
                            byte[] decode2 = android.util.Base64.decode(str, 0);
                            l.e(decode2, "decode(...)");
                            a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                        }
                        JSONObject jSONObject = new JSONObject(String.valueOf(a10));
                        if (jSONObject.has("errorDesc")) {
                            this.f19537c.y().k(jSONObject.getString("errorDesc"));
                            return;
                        } else {
                            this.f19537c.y().k("Error");
                            return;
                        }
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                this.f19537c.y().k("Error");
                return;
            }
            SecurityModle securityModle2 = (SecurityModle) response.body();
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar3 = id.c.f12675a;
                String str4 = (String) this.f19536b.f20234e;
                Base64.Decoder decoder2 = Base64.getDecoder();
                if (securityModle2 != null) {
                    str = securityModle2.getData();
                }
                byte[] decode3 = decoder2.decode(str);
                l.e(decode3, "decode(...)");
                a11 = aVar3.a(str4, new String(decode3, km.d.f24740b));
            } else {
                c.a aVar4 = id.c.f12675a;
                String str5 = (String) this.f19536b.f20234e;
                if (securityModle2 != null) {
                    str = securityModle2.getData();
                }
                byte[] decode4 = android.util.Base64.decode(str, 0);
                l.e(decode4, "decode(...)");
                a11 = aVar4.a(str5, new String(decode4, km.d.f24740b));
            }
            String valueOf = String.valueOf(a11);
            JSONObject jSONObject2 = new JSONObject(valueOf);
            if (jSONObject2.has("errorDesc")) {
                this.f19537c.y().k(jSONObject2.getString("errorDesc"));
                return;
            }
            Object j10 = new i7.d().j(valueOf, PendingTransTaxBreakUpModel.class);
            l.e(j10, "fromJson(...)");
            this.f19537c.z().k((PendingTransTaxBreakUpModel) j10);
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19538a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19539b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19540c;

        g(Context context, u uVar, b bVar) {
            this.f19538a = context;
            this.f19539b = uVar;
            this.f19540c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19538a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.s(), "verifySMSOtp", aVar2.v(), aVar2.v());
            this.f19540c.r().k(th2.getMessage());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19538a, v9.d.f17494a.s(), "verifySMSOtp", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19539b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19539b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("pendingDetails", valueOf);
                Object j10 = new i7.d().j(valueOf, OtpVerifyResult.class);
                l.e(j10, "fromJson(...)");
                this.f19540c.s().k((OtpVerifyResult) j10);
            } catch (Exception unused) {
                this.f19540c.r().k("error");
            }
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19542b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19543c;

        h(Context context, u uVar, b bVar) {
            this.f19541a = context;
            this.f19542b = uVar;
            this.f19543c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19541a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getListOfDisposeApplication", aVar2.v(), aVar2.v());
            this.f19543c.m().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19541a, v9.d.f17494a.z(), "getListOfDisposeApplication", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19542b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19542b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), VahanApplVerifySuccessModel.class);
                l.e(j10, "fromJson(...)");
                this.f19543c.n().k((VahanApplVerifySuccessModel) j10);
            } catch (Exception unused) {
                this.f19543c.m().k("ERROR");
            }
        }
    }

    public static final class i implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19545b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f19546c;

        i(Context context, u uVar, b bVar) {
            this.f19544a = context;
            this.f19545b = uVar;
            this.f19546c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19544a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "checkToBank", aVar2.v(), aVar2.v());
            this.f19546c.B().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            ApiMonitorLog.f20957k.a(this.f19544a, v9.d.f17494a.z(), "checkToBank", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
            String str3 = null;
            if (response.isSuccessful() && response.code() == 200) {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19545b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19545b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), VahanPendingTransBankModel.class);
                l.e(j10, "fromJson(...)");
                this.f19546c.C().k((VahanPendingTransBankModel) j10);
            } else if (response.code() == 400) {
                try {
                    SecurityModle securityModle2 = (SecurityModle) response.body();
                    if (Build.VERSION.SDK_INT >= 26) {
                        c.a aVar2 = id.c.f12675a;
                        String str4 = (String) this.f19545b.f20234e;
                        Base64.Decoder decoder2 = Base64.getDecoder();
                        if (securityModle2 != null) {
                            str3 = securityModle2.getData();
                        }
                        byte[] decode3 = decoder2.decode(str3);
                        l.e(decode3, "decode(...)");
                        a10 = aVar2.a(str4, new String(decode3, km.d.f24740b));
                    } else {
                        c.a aVar3 = id.c.f12675a;
                        String str5 = (String) this.f19545b.f20234e;
                        if (securityModle2 != null) {
                            str3 = securityModle2.getData();
                        }
                        byte[] decode4 = android.util.Base64.decode(str3, 0);
                        l.e(decode4, "decode(...)");
                        a10 = aVar3.a(str5, new String(decode4, km.d.f24740b));
                    }
                    JSONObject jSONObject = new JSONObject(String.valueOf(a10));
                    if (jSONObject.has("errorDesc")) {
                        this.f19546c.B().k(jSONObject.getString("errorDesc"));
                    } else {
                        this.f19546c.B().k("Error");
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } else {
                this.f19546c.B().k("Error");
            }
        }
    }

    public b(wg.b bVar) {
        l.f(bVar, "repository");
        this.f19498d = bVar;
    }

    public final void A(Context context, String str, String str2, String str3, String str4, String str5) {
        l.f(context, "context");
        l.f(str, "purCd");
        l.f(str2, "transactionId");
        l.f(str3, "offCd");
        l.f(str4, "stateCd");
        l.f(str5, "regNo");
        try {
            u uVar = new u();
            uVar.f20234e = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject = VUtility.Companion.q0(str, str2, str3, str4, str5).toString();
            l.e(jSONObject, "toString(...)");
            this.f19498d.e(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(context, uVar, this));
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f19517w.k("Error");
        }
    }

    public final a0 B() {
        return this.f19519y;
    }

    public final a0 C() {
        return this.f19518x;
    }

    public final void D(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "otp");
        l.f(str2, "otpid");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.t(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f19498d.h(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new g(context, uVar, this));
    }

    public final void E(Context context, String str, String str2, String str3) {
        l.f(context, "context");
        l.f(str, "regNo");
        l.f(str2, "applNo");
        l.f(str3, "otp");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.s(str, str2, str3).toString();
        l.e(jSONObject, "toString(...)");
        this.f19498d.g(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new h(context, uVar, this));
    }

    public final void F(Context context, JSONObject jSONObject) {
        l.f(context, "context");
        l.f(jSONObject, "jsonObject");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f19498d.i(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new i(context, uVar, this));
    }

    public final void g(Context context, JSONArray jSONArray) {
        l.f(context, "context");
        l.f(jSONArray, "requestArray");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONArray2 = jSONArray.toString();
        l.e(jSONArray2, "toString(...)");
        this.f19498d.a(aVar.f(b10, jSONArray2), (String) uVar.f20234e).enqueue(new a(context, uVar, this));
    }

    public final void h(Context context, String str, String str2, String str3) {
        l.f(context, "context");
        l.f(str, "regNo");
        l.f(str2, "applNo");
        l.f(str3, "chasiNo");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.q(str, str2, str3).toString();
        l.e(jSONObject, "toString(...)");
        this.f19498d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0261b(context, uVar, this));
    }

    public final a0 i() {
        return this.f19500f;
    }

    public final a0 j() {
        return this.f19502h;
    }

    public final a0 k() {
        return this.f19501g;
    }

    public final a0 l() {
        return this.f19499e;
    }

    public final a0 m() {
        return this.f19504j;
    }

    public final a0 n() {
        return this.f19503i;
    }

    public final a0 o() {
        return this.f19506l;
    }

    public final a0 p() {
        return this.f19505k;
    }

    public final void q(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "mobileNo");
        l.f(str2, "record_id");
        try {
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject = VUtility.Companion.U(str, str2).toString();
            l.e(jSONObject, "toString(...)");
            c0 f10 = aVar.f(b10, jSONObject);
            u uVar = new u();
            String valueOf = String.valueOf(System.currentTimeMillis());
            uVar.f20234e = valueOf;
            this.f19498d.f(f10, valueOf).enqueue(new c(context, uVar, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final a0 r() {
        return this.f19512r;
    }

    public final a0 s() {
        return this.f19511q;
    }

    public final void t(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "regNo");
        l.f(str2, "chasiNo");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.P(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f19498d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(context, uVar, this));
    }

    public final void u(Context context, String str) {
        l.f(context, "context");
        l.f(str, "transaction_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.Q(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f19498d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(context, uVar, this));
    }

    public final a0 v() {
        return this.f19514t;
    }

    public final a0 w() {
        return this.f19513s;
    }

    public final a0 x() {
        return this.f19515u;
    }

    public final a0 y() {
        return this.f19517w;
    }

    public final a0 z() {
        return this.f19516v;
    }
}
