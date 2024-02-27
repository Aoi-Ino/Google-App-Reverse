package qi;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.DupChangeAddResponse;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class d extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f30614d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f30615e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f30616f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f30617g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f30618h = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f30619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f30620b;

        a(u uVar, d dVar) {
            this.f30619a = uVar;
            this.f30620b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f30620b.j().k(th2 != null ? th2.getMessage() : null);
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
                    this.f30620b.j().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = (String) this.f30619a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = (String) this.f30619a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("Response", valueOf);
            Object j10 = new i7.d().j(valueOf, DupChangeAddResponse.class);
            l.e(j10, "fromJson(...)");
            this.f30620b.i().k((DupChangeAddResponse) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f30621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f30622b;

        b(u uVar, d dVar) {
            this.f30621a = uVar;
            this.f30622b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f30622b.j().k(th2 != null ? th2.getMessage() : null);
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
                    this.f30622b.j().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = (String) this.f30621a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = (String) this.f30621a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("Response", valueOf);
            Object j10 = new i7.d().j(valueOf, DupChangeAddResponse.class);
            l.e(j10, "fromJson(...)");
            this.f30622b.i().k((DupChangeAddResponse) j10);
        }
    }

    public d(b bVar) {
        l.f(bVar, "repository");
        this.f30614d = bVar;
    }

    public final void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        l.f(str, "dlno");
        l.f(str2, "dob");
        l.f(str3, "rtoCodeDLTr");
        l.f(str4, "dlHolderAltMobMum");
        l.f(str5, "willtoDonateOrgans");
        l.f(str6, "applcatgDLserReq");
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
        String jSONObject = c.f30613a.a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        u uVar3 = uVar2;
        this.f30614d.a(f10, (String) uVar3.f20234e).enqueue(new a(uVar3, this));
    }

    public final void h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        l.f(str, "dlno");
        l.f(str2, "dob");
        l.f(str3, "rtoCodeDLTr");
        l.f(str4, "dlHolderAltMobMum");
        l.f(str5, "willtoDonateOrgans");
        l.f(str6, "perHouseNo");
        l.f(str7, "perStreet");
        l.f(str8, "perLocation");
        l.f(str9, "permVillageOrTown");
        l.f(str10, "perDistrict");
        l.f(str11, "perSubDistrict");
        l.f(str12, "perState");
        l.f(str13, "perPinCode");
        l.f(str14, "presHouseNo");
        l.f(str15, "presStreet");
        l.f(str16, "presLocation");
        l.f(str17, "presVillageOrTown");
        l.f(str18, "presSubDistrict");
        l.f(str19, "presDistrict");
        l.f(str20, "presState");
        l.f(str21, "presPincode");
        l.f(str22, "mobileNumber");
        l.f(str23, "eKYCId");
        l.f(str24, "eKYCOpted");
        l.f(str25, "eKYCGender");
        l.f(str26, "eKYCPhoto");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        u uVar2 = uVar;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = c.f30613a.b(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        u uVar3 = uVar2;
        this.f30614d.a(f10, (String) uVar3.f20234e).enqueue(new b(uVar3, this));
    }

    public final a0 i() {
        return this.f30615e;
    }

    public final a0 j() {
        return this.f30616f;
    }
}
