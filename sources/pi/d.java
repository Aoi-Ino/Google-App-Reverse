package pi;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel.DupChangeAddResponse;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;

public final class d extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f30367d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f30368e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f30369f = new a0();

    /* renamed from: g  reason: collision with root package name */
    public String f30370g;

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f30371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f30373c;

        a(d dVar, String str, Context context) {
            this.f30371a = dVar;
            this.f30372b = str;
            this.f30373c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f30371a.k().k(this.f30371a.i());
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30373c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getAckDetForGivenDLNumber", aVar2.v(), aVar2.w());
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
                    this.f30371a.k().k(this.f30371a.i());
                    return;
                }
            } else {
                securityModle = null;
            }
            d dVar = this.f30371a;
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f30372b;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f30372b;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            dVar.l(String.valueOf(aVar.a(str, str2)));
            Object j10 = new i7.d().j(this.f30371a.i().toString(), DupChangeAddResponse.class);
            l.e(j10, "fromJson(...)");
            DupChangeAddResponse dupChangeAddResponse = (DupChangeAddResponse) j10;
            if (response != null) {
                securityModle2 = (SecurityModle) response.body();
            }
            Log.d("offence_resp", String.valueOf(securityModle2));
            this.f30371a.j().k(dupChangeAddResponse);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f30374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f30376c;

        b(d dVar, String str, Context context) {
            this.f30374a = dVar;
            this.f30375b = str;
            this.f30376c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f30374a.k().k(this.f30374a.i());
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30376c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.t(), "getAckDetForGivenDLNumber", aVar2.v(), aVar2.w());
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
                    this.f30374a.k().k(this.f30374a.i());
                    return;
                }
            } else {
                securityModle = null;
            }
            d dVar = this.f30374a;
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f30375b;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f30375b;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            dVar.l(String.valueOf(aVar.a(str, str2)));
            Object j10 = new i7.d().j(this.f30374a.i().toString(), DupChangeAddResponse.class);
            l.e(j10, "fromJson(...)");
            DupChangeAddResponse dupChangeAddResponse = (DupChangeAddResponse) j10;
            if (response != null) {
                securityModle2 = (SecurityModle) response.body();
            }
            Log.d("offence_resp", String.valueOf(securityModle2));
            this.f30374a.j().k(dupChangeAddResponse);
        }
    }

    public d(b bVar) {
        l.f(bVar, "repository");
        this.f30367d = bVar;
    }

    public final void g(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        l.f(context, "context");
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
        l.f(str26, "mobileNumber");
        l.f(str27, "eKYCId");
        l.f(str28, "eKYCOpted");
        l.f(str29, "eKYCGender");
        l.f(str30, "eKYCPhoto");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = c.f30366a.a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f30367d.a(f10, valueOf).enqueue(new a(this, valueOf, context));
    }

    public final void h(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        l.f(context, "context");
        l.f(str, "dlno");
        l.f(str2, "dob");
        l.f(str3, "rtoCodeDLTr");
        l.f(str4, "dlHolderAltMobMum");
        l.f(str5, "willtoDonateOrgans");
        l.f(str6, "dupDlReasonCode");
        l.f(str7, "dupDlReasonName");
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
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = c.f30366a.b(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f30367d.a(f10, valueOf).enqueue(new b(this, valueOf, context));
    }

    public final String i() {
        String str = this.f30370g;
        if (str != null) {
            return str;
        }
        l.v("decryptedString");
        return null;
    }

    public final a0 j() {
        return this.f30368e;
    }

    public final a0 k() {
        return this.f30369f;
    }

    public final void l(String str) {
        l.f(str, "<set-?>");
        this.f30370g = str;
    }
}
