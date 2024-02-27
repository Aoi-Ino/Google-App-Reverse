package ab;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class d extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f394d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f395e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f396f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f398b;

        a(u uVar, d dVar) {
            this.f397a = uVar;
            this.f398b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f398b.h().k(th2 != null ? th2.getMessage() : null);
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
                    this.f398b.h().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = (String) this.f397a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = (String) this.f397a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetAckDetForGivenDLNumberResponse.class);
            l.e(j10, "fromJson(...)");
            this.f398b.i().k((GetAckDetForGivenDLNumberResponse) j10);
        }
    }

    public d(a aVar) {
        l.f(aVar, "repository");
        this.f394d = aVar;
    }

    public final void g(boolean z10, ArrayList arrayList, String str, String str2, ArrayList arrayList2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80) {
        l.f(arrayList, "covsArrayList");
        l.f(str, "bioRecGenesis");
        l.f(str2, "allowAddrChangeAtDlservReqst");
        l.f(arrayList2, "multiListName");
        l.f(str3, "agentId");
        l.f(str4, "agentPwd");
        l.f(str5, "agentIpAddress");
        l.f(str6, "agentServiceName");
        l.f(str7, "applcatgDLserReq");
        l.f(str8, "dlHolderAltMobMum");
        l.f(str9, "dlno");
        l.f(str10, "dob");
        l.f(str11, "rtoCodeDLTr");
        l.f(str12, "willtoDonateOrgans");
        l.f(str13, "relationType");
        l.f(str14, "conDlReasonCode");
        l.f(str15, "conDlReasonName");
        l.f(str16, "dlHolderNaturalName");
        l.f(str17, "conEffdate");
        l.f(str18, "applFirstName");
        l.f(str19, "applLastName");
        l.f(str20, "relFirstName");
        l.f(str21, "relLastName");
        l.f(str22, "mobileNumber");
        l.f(str23, "changeOfAddReq");
        l.f(str24, "perHouseNo");
        l.f(str25, "perStreet");
        l.f(str26, "perLocation");
        l.f(str27, "permVillageOrTown");
        l.f(str28, "perSubDistrict");
        l.f(str29, "perDistrict");
        l.f(str30, "perState");
        l.f(str31, "perPinCode");
        l.f(str32, "presHouseNo");
        l.f(str33, "presStreet");
        l.f(str34, "presLocation");
        l.f(str35, "presVillageOrTown");
        l.f(str36, "presSubDistrict");
        l.f(str37, "presDistrict");
        l.f(str38, "presState");
        l.f(str39, "presPincode");
        l.f(str40, "dleDlReasonCode");
        l.f(str41, "dleDlReasonName");
        l.f(str42, "dupDlReasonName");
        l.f(str43, "dupDlReasonCode");
        l.f(str44, "applDateOfBirth");
        l.f(str45, "codobDlReasonName");
        l.f(str46, "codobDlReasonCode");
        l.f(str47, "declaringcheck");
        l.f(str48, "hillcertificate");
        l.f(str49, "hillissueDate");
        l.f(str50, "hillvalidFrom");
        l.f(str51, "hillvalidTo");
        l.f(str52, "hilldrivingschool");
        l.f(str53, "hillissby");
        l.f(str54, "pofbirth");
        l.f(str55, "country");
        l.f(str56, "passno");
        l.f(str57, "passvaltill");
        l.f(str58, "visano");
        l.f(str59, "visavaltill");
        l.f(str60, "tovisit");
        l.f(str61, "iscountryrestricted");
        l.f(str62, "countryRestrictedReason");
        l.f(str63, "isDlSerdisqualified");
        l.f(str64, "dlSerdisqualifiedReason");
        l.f(str65, "forAdd1");
        l.f(str66, "forAdd2");
        l.f(str67, "forAdd3");
        l.f(str68, "forAddPinCode");
        l.f(str69, "forNationMobNum");
        l.f(str70, "emailID");
        l.f(str71, "appliedIdpfromIndEmb");
        l.f(str72, "indEmbName");
        l.f(str73, "embPlace");
        l.f(str74, "dateOfVerifEmb");
        l.f(str75, "embEndorseNo");
        l.f(str76, "idpcountryapplyfrom");
        l.f(str77, "eKYCId");
        l.f(str78, "eKYCOpted");
        l.f(str79, "eKYCGender");
        l.f(str80, "eKYCapplicantPhoto");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        u uVar2 = uVar;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = c.f393a.a(z10, arrayList, str, str2, arrayList2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        Log.d("RepCOA", f10.toString());
        u uVar3 = uVar2;
        this.f394d.a(f10, (String) uVar3.f20234e).enqueue(new a(uVar3, this));
    }

    public final a0 h() {
        return this.f396f;
    }

    public final a0 i() {
        return this.f395e;
    }
}
