package ri;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAModel.RepCOAPojo;
import id.c;
import j$.util.Base64;
import km.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f31064d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f31065e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f31066f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f31067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f31068b;

        a(u uVar, c cVar) {
            this.f31067a = uVar;
            this.f31068b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f31068b.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f31068b.h().k("Error");
                    Log.d("Response-error", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f31067a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f31067a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), RepCOAPojo.class);
            l.e(j10, "fromJson(...)");
            this.f31068b.g().k((RepCOAPojo) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f31069a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f31070b;

        b(u uVar, c cVar) {
            this.f31069a = uVar;
            this.f31070b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f31070b.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f31070b.h().k("Error");
                    Log.d("Response-error", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f31069a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f31069a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), RepCOAPojo.class);
            l.e(j10, "fromJson(...)");
            this.f31070b.g().k((RepCOAPojo) j10);
        }
    }

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f31064d = aVar;
    }

    public final a0 g() {
        return this.f31065e;
    }

    public final a0 h() {
        return this.f31066f;
    }

    public final void i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
        l.f(str, "dlno");
        l.f(str2, "dob");
        l.f(str3, "rtoCodeDLTr");
        l.f(str4, "dlHolderAltMobMum");
        l.f(str5, "willtoDonateOrgans");
        l.f(str6, "dupDlReasonCode");
        l.f(str7, "dupDlReasonName");
        l.f(str8, "applcatgDLserReq");
        l.f(str9, "changeOfAddReq");
        l.f(str10, "perHouseNo");
        l.f(str11, "perStreet");
        l.f(str12, "perLocation");
        l.f(str13, "permVillageOrTown");
        l.f(str14, "perDistrict");
        l.f(str15, "perSubDistrict");
        l.f(str16, "perState");
        l.f(str17, "perPinCode");
        l.f(str18, "presHouseNo");
        l.f(str19, "presStreet");
        l.f(str20, "presLocation");
        l.f(str21, "presVillageOrTown");
        l.f(str22, "presSubDistrict");
        l.f(str23, "presDistrict");
        l.f(str24, "presState");
        l.f(str25, "presPincode");
        l.f(str26, "agentId");
        l.f(str27, "agentPwd");
        l.f(str28, "agentIpAddress");
        l.f(str29, "agentServiceName");
        l.f(str30, "mobileNumber");
        l.f(str31, "eKYCId");
        l.f(str32, "eKYCOpted");
        l.f(str33, "eKYCGender");
        l.f(str34, "eKYCPhoto");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        u uVar2 = uVar;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = b.f31063a.a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        Log.d("RepCOA", f10.toString());
        u uVar3 = uVar2;
        this.f31064d.a(f10, (String) uVar3.f20234e).enqueue(new a(uVar3, this));
    }

    public final void j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        l.f(str, "dlno");
        l.f(str2, "dob");
        l.f(str3, "rtoCodeDLTr");
        l.f(str4, "dlHolderAltMobMum");
        l.f(str5, "willtoDonateOrgans");
        l.f(str6, "dupDlReasonCode");
        l.f(str7, "changeOfAddReq");
        l.f(str8, "perHouseNo");
        l.f(str9, "perStreet");
        l.f(str10, "perLocation");
        l.f(str11, "permVillageOrTown");
        l.f(str12, "perDistrict");
        l.f(str13, "perSubDistrict");
        l.f(str14, "perState");
        l.f(str15, "perPinCode");
        l.f(str16, "presHouseNo");
        l.f(str17, "presStreet");
        l.f(str18, "presLocation");
        l.f(str19, "presVillageOrTown");
        l.f(str20, "presSubDistrict");
        l.f(str21, "presDistrict");
        l.f(str22, "presState");
        l.f(str23, "presPincode");
        l.f(str24, "mobileNumber");
        l.f(str25, "eKYCId");
        l.f(str26, "eKYCOpted");
        l.f(str27, "eKYCGender");
        l.f(str28, "eKYCPhoto");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        u uVar2 = uVar;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = b.f31063a.b(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        Log.d("RepCOA", f10.toString());
        u uVar3 = uVar2;
        this.f31064d.a(f10, (String) uVar3.f20234e).enqueue(new b(uVar3, this));
    }
}
