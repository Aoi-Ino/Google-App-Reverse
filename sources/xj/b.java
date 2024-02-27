package xj;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CheckPhotoSignResponseModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.DownloadLLResponseModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.SubmittedLLResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.DrivingSchoolResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.EducationQualResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.LearnerLicenceClassResponseModal;
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

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f32708d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f32709e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f32710f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f32711g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f32712h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f32713i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f32714j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f32715k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f32716l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f32717m = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32718a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32719b;

        a(String str, b bVar) {
            this.f32718a = str;
            this.f32719b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32719b.u().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f32718a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f32718a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, CheckPhotoSignResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32719b.k().k((CheckPhotoSignResponseModal) j10);
            } catch (Exception unused) {
                this.f32719b.u().k("error");
            }
        }
    }

    /* renamed from: xj.b$b  reason: collision with other inner class name */
    public static final class C0380b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32721b;

        C0380b(String str, b bVar) {
            this.f32720a = str;
            this.f32721b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32721b.u().k("error");
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
                    String str2 = this.f32720a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f32720a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, DownloadLLResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32721b.o().k((DownloadLLResponseModal) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f32721b.u().k("error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32723b;

        c(String str, b bVar) {
            this.f32722a = str;
            this.f32723b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32723b.u().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f32722a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f32722a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, BloodGroupResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32723b.j().k((BloodGroupResponseModal) j10);
            } catch (Exception unused) {
                this.f32723b.u().k("error");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32725b;

        d(String str, b bVar) {
            this.f32724a = str;
            this.f32725b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32725b.u().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f32724a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f32724a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, CountryResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32725b.n().k((CountryResponseModal) j10);
            } catch (Exception unused) {
                this.f32725b.u().k("error");
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32727b;

        e(String str, b bVar) {
            this.f32726a = str;
            this.f32727b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32727b.u().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f32726a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f32726a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, DrivingSchoolResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32727b.q().k((DrivingSchoolResponseModal) j10);
            } catch (Exception unused) {
                this.f32727b.u().k("error");
            }
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32729b;

        f(String str, b bVar) {
            this.f32728a = str;
            this.f32729b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32729b.u().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f32728a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f32728a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, EducationQualResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32729b.s().k((EducationQualResponseModal) j10);
            } catch (Exception unused) {
                this.f32729b.u().k("error");
            }
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32731b;

        g(String str, b bVar) {
            this.f32730a = str;
            this.f32731b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32731b.u().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f32730a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f32730a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, LearnerLicenceClassResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32731b.z().k((LearnerLicenceClassResponseModal) j10);
            } catch (Exception unused) {
                this.f32731b.u().k("error");
            }
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32733b;

        h(String str, b bVar) {
            this.f32732a = str;
            this.f32733b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f32733b.u().k("error");
            String message = th2.getMessage();
            l.c(message);
            Log.e("Exception", message);
            String localizedMessage = th2.getLocalizedMessage();
            l.c(localizedMessage);
            Log.e("Local Msg", localizedMessage);
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
                    String str2 = this.f32732a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f32732a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("submit_response", valueOf);
                Object j10 = new i7.d().j(valueOf, SubmittedLLResponseModal.class);
                l.e(j10, "fromJson(...)");
                Log.d("response", String.valueOf(response.body()));
                this.f32733b.A().k((SubmittedLLResponseModal) j10);
            } catch (Exception e10) {
                String message = e10.getMessage();
                l.c(message);
                Log.e("Exception", message);
                String localizedMessage = e10.getLocalizedMessage();
                l.c(localizedMessage);
                Log.e("Local Msg", localizedMessage);
                this.f32733b.u().k("error");
            }
        }
    }

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f32708d = aVar;
    }

    public final a0 A() {
        return this.f32714j;
    }

    public final void B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, ArrayList arrayList, String str41, String str42, String str43, String str44, String str45, JSONArray jSONArray, String str46, boolean z10, String str47, String str48, JSONArray jSONArray2) {
        l.f(str, "stateCd");
        l.f(str2, "rtoCd");
        l.f(str3, "applicationFName");
        l.f(str4, "applicationMName");
        l.f(str5, "applicationSName");
        l.f(str6, "relationType");
        l.f(str7, "relationFName");
        l.f(str8, "relationMName");
        l.f(str9, "relationLName");
        l.f(str10, "fullName");
        l.f(str11, "gender");
        l.f(str12, "dob");
        l.f(str13, "birthPlace");
        l.f(str14, "countryCd");
        l.f(str15, "eduQualification");
        l.f(str16, "bloodGroup");
        l.f(str17, "landlineNo");
        l.f(str18, "emailId");
        l.f(str19, "mobileNo");
        l.f(str20, "altMobileNo");
        l.f(str21, "idMark1");
        l.f(str22, "idMark2");
        l.f(str23, "preState");
        l.f(str24, "preDistrict");
        l.f(str25, "preSubDist");
        l.f(str26, "preVillageName");
        l.f(str27, "preTownName");
        l.f(str28, "preHouseNo");
        l.f(str29, "preStreet");
        l.f(str30, "prePinCode");
        l.f(str31, "preYear");
        l.f(str32, "preMonth");
        l.f(str33, "perState");
        l.f(str34, "perDist");
        l.f(str35, "perSubDist");
        l.f(str36, "perVillage");
        l.f(str37, "perTown");
        l.f(str38, "perHouseNo");
        l.f(str39, "perStreet");
        l.f(str40, "perPinCd");
        l.f(arrayList, "covList");
        l.f(str41, "organsDonation");
        l.f(str42, "presVillageOrTown");
        l.f(str43, "perVillageOrTown");
        l.f(str44, "fromDSchool");
        l.f(str45, "applCatg");
        l.f(jSONArray, "drivingSchoolDetails");
        l.f(str46, "ekycId");
        l.f(str47, "aadhaarPhoto");
        l.f(str48, "form1Value");
        l.f(jSONArray2, "form1SubmittedValue");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = w(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, arrayList, str41, str42, str43, str44, str45, jSONArray, str46, z10, str47, str48, jSONArray2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f32708d.g(f10, valueOf).enqueue(new h(valueOf, this));
    }

    public final void g(String str) {
        l.f(str, "applicationNo");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = y(str).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f32708d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final void h(String str, String str2) {
        l.f(str, "applicationNo");
        l.f(str2, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applno", (Object) str);
            jSONObject.put("dob", (Object) str2);
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            c0 f10 = aVar.f(b10, jSONObject2);
            String valueOf = String.valueOf(System.currentTimeMillis());
            this.f32708d.h(f10, valueOf).enqueue(new C0380b(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f32717m.k("error");
        }
    }

    public final void i() {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = l().toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f32708d.b(f10, valueOf).enqueue(new c(valueOf, this));
    }

    public final a0 j() {
        return this.f32713i;
    }

    public final a0 k() {
        return this.f32715k;
    }

    public final JSONObject l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", (Object) "mobSARATHI");
            jSONObject.put("agentIpAddress", (Object) "10.248.210.8");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final void m() {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = l().toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f32708d.c(f10, valueOf).enqueue(new d(valueOf, this));
    }

    public final a0 n() {
        return this.f32711g;
    }

    public final a0 o() {
        return this.f32716l;
    }

    public final void p(String str) {
        l.f(str, "stateCd");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = r(str).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f32708d.d(f10, valueOf).enqueue(new e(valueOf, this));
    }

    public final a0 q() {
        return this.f32710f;
    }

    public final JSONObject r(String str) {
        l.f(str, "stateCd");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", (Object) str);
            jSONObject.put("agentId", (Object) "mobSARATHI");
            jSONObject.put("agentIpAddress", (Object) "10.248.210.8");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final a0 s() {
        return this.f32712h;
    }

    public final void t() {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = l().toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f32708d.e(f10, valueOf).enqueue(new f(valueOf, this));
    }

    public final a0 u() {
        return this.f32717m;
    }

    public final void v(String str, int i10, int i11, String str2) {
        l.f(str, "stateCd");
        l.f(str2, "applCatg");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = x(str, i10, i11, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f32708d.f(f10, valueOf).enqueue(new g(valueOf, this));
    }

    public final JSONObject w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, ArrayList arrayList, String str41, String str42, String str43, String str44, String str45, JSONArray jSONArray, String str46, boolean z10, String str47, String str48, JSONArray jSONArray2) {
        String str49 = str;
        String str50 = str2;
        String str51 = str3;
        String str52 = str4;
        String str53 = str5;
        String str54 = str7;
        String str55 = str8;
        String str56 = str9;
        String str57 = str10;
        String str58 = str11;
        String str59 = str12;
        String str60 = str16;
        l.f(str49, "stateCd");
        l.f(str50, "rtoCd");
        l.f(str51, "applicationFName");
        l.f(str52, "applicationMName");
        l.f(str53, "applicationSName");
        l.f(str6, "relationType");
        l.f(str54, "relationFName");
        l.f(str55, "relationMName");
        l.f(str56, "relationLName");
        l.f(str57, "fullName");
        l.f(str58, "gender");
        String str61 = "gender";
        l.f(str59, "dob");
        l.f(str13, "birthPlace");
        l.f(str14, "countryCd");
        l.f(str15, "eduQualification");
        l.f(str16, "bloodGroup");
        String str62 = "bloodGroup";
        l.f(str17, "landlineNo");
        l.f(str18, "emailId");
        l.f(str19, "mobileNo");
        l.f(str20, "altMobileNo");
        l.f(str21, "idMark1");
        l.f(str22, "idMark2");
        l.f(str23, "preState");
        l.f(str24, "preDistrict");
        l.f(str25, "preSubDist");
        l.f(str26, "preVillageName");
        l.f(str27, "preTownName");
        l.f(str28, "preHouseNo");
        l.f(str29, "preStreet");
        l.f(str30, "prePinCode");
        l.f(str31, "preYear");
        l.f(str32, "preMonth");
        l.f(str33, "perState");
        String str63 = "perState";
        l.f(str34, "perDist");
        l.f(str35, "perSubDist");
        l.f(str36, "perVillage");
        l.f(str37, "perTown");
        l.f(str38, "perHouseNo");
        String str64 = "perHouseNo";
        l.f(str39, "perStreet");
        String str65 = "perStreet";
        l.f(str40, "perPinCd");
        ArrayList arrayList2 = arrayList;
        l.f(arrayList2, "covList");
        l.f(str41, "organsDonation");
        String str66 = "organsDonation";
        l.f(str42, "presVillageOrTown");
        String str67 = "presVillageOrTown";
        l.f(str43, "perVillageOrTown");
        l.f(str44, "fromDSchool");
        l.f(str45, "applCatg");
        String str68 = "applCatg";
        l.f(jSONArray, "drivingSchoolDetails");
        l.f(str46, "ekycId");
        l.f(str47, "aadhaarPhoto");
        l.f(str48, "form1Value");
        l.f(jSONArray2, "form1SubmittedValue");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray3 = new JSONArray(new i7.d().t(arrayList2));
            jSONObject.put("agentId", (Object) "mobSARATHI");
            jSONObject.put("agentIpAddress", (Object) "10.248.210.8");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("licenseType", (Object) "newLicence");
            jSONObject.put("stCode", (Object) str49);
            jSONObject.put("rtoCode", (Object) str50);
            jSONObject.put("applFirstName", (Object) str51);
            jSONObject.put("applMiddleName", (Object) str52);
            jSONObject.put("applLastName", (Object) str53);
            jSONObject.put("relationType", (Object) str6);
            jSONObject.put("relFirstName", (Object) str54);
            jSONObject.put("relMiddleName", (Object) str55);
            jSONObject.put("relLastName", (Object) str56);
            jSONObject.put("applFullName", (Object) str57);
            jSONObject.put(str61, (Object) str58);
            jSONObject.put("applDateOfBirth", (Object) str59);
            jSONObject.put("applBirthPlace", (Object) str13);
            String str69 = str41;
            jSONObject.put("applBirthCountry", (Object) str14);
            jSONObject.put("eduQual", (Object) str15);
            jSONObject.put(str62, (Object) str16);
            jSONObject.put("phoneNumber", (Object) str17);
            jSONObject.put("email", (Object) str18);
            String str70 = str19;
            String str71 = str20;
            jSONObject.put("mobileNumber", (Object) str70);
            String str72 = str46;
            String str73 = str47;
            if (!l.a(str72, "0")) {
                jSONObject.put("aadhaarMobileNumber", (Object) str70);
            } else {
                jSONObject.put("aadhaarMobileNumber", (Object) "");
            }
            jSONObject.put("altMobileNumber", (Object) str71);
            jSONObject.put("idMarks1", (Object) str21);
            jSONObject.put("idMarks2", (Object) str22);
            jSONObject.put("presState", (Object) str23);
            jSONObject.put("presDistrict", (Object) str24);
            jSONObject.put("presSubDistrict", (Object) str25);
            jSONObject.put("presVillageName", (Object) str26);
            jSONObject.put("presTownName", (Object) str27);
            jSONObject.put("presHouseNo", (Object) str28);
            jSONObject.put("presStreet", (Object) str29);
            jSONObject.put("presPincode", (Object) str30);
            jSONObject.put("presAddrDurYears", (Object) str31);
            jSONObject.put("presAddrDurMonths", (Object) str32);
            jSONObject.put(str63, (Object) str33);
            jSONObject.put("perDistrict", (Object) str34);
            jSONObject.put("perSubDistrict", (Object) str35);
            jSONObject.put("perVillageName", (Object) str36);
            jSONObject.put("perTownName", (Object) str37);
            jSONObject.put(str64, (Object) str38);
            jSONObject.put(str65, (Object) str39);
            jSONObject.put("perPincode", (Object) str40);
            jSONObject.put("selectedCovsList", (Object) jSONArray3);
            jSONObject.put(str66, (Object) str69);
            jSONObject.put(str67, (Object) str42);
            jSONObject.put("permVillageOrTown", (Object) str43);
            jSONObject.put("fromDschool", (Object) str44);
            jSONObject.put(str68, (Object) str45);
            jSONObject.put("eKycId", (Object) str72);
            jSONObject.put("eKycFlag", z10);
            jSONObject.put("applAddress", (Object) "");
            jSONObject.put("applAddress1", (Object) "");
            jSONObject.put("applAddress2", (Object) "");
            jSONObject.put("cmCampDesc", (Object) "");
            jSONObject.put("cmType", (Object) "");
            jSONObject.put("form1Enable", (Object) str48);
            jSONObject.put("formOneDetails", (Object) jSONArray2);
            jSONObject.put("dsTrainedCovsDetails", (Object) jSONArray);
            jSONObject.put("applicantPhoto", (Object) str73);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final JSONObject x(String str, int i10, int i11, String str2) {
        l.f(str, "stateCd");
        l.f(str2, "applCat");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", (Object) str);
            jSONObject.put("age", i10);
            jSONObject.put("eduQual", i11);
            jSONObject.put("applicantCatg", (Object) str2);
            jSONObject.put("agentId", (Object) "mobSARATHI");
            jSONObject.put("agentIpAddress", (Object) "10.248.210.8");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final JSONObject y(String str) {
        l.f(str, "applNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aiApplno", (Object) str);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final a0 z() {
        return this.f32709e;
    }
}
