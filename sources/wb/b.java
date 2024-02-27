package wb;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.util.ArrayList;
import km.d;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import vb.e;
import vb.h;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f17978d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f17979e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f17980f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f17981g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f17982h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f17983i = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17985b;

        a(String str, b bVar) {
            this.f17984a = str;
            this.f17985b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f17985b.j().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f17984a;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f17984a;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, e.class);
                l.e(j10, "fromJson(...)");
                android.support.v4.media.session.b.a(j10);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f17985b.k().k((Object) null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: wb.b$b  reason: collision with other inner class name */
    public static final class C0234b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17986a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17987b;

        C0234b(String str, b bVar) {
            this.f17986a = str;
            this.f17987b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f17987b.j().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f17986a;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f17986a;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, vb.d.class);
                l.e(j10, "fromJson(...)");
                android.support.v4.media.session.b.a(j10);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f17987b.i().k((Object) null);
            } catch (Exception unused) {
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17989b;

        c(String str, b bVar) {
            this.f17988a = str;
            this.f17989b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f17989b.j().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = this.f17988a;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f17988a;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, h.class);
                l.e(j10, "fromJson(...)");
                android.support.v4.media.session.b.a(j10);
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.f17989b.o().k((Object) null);
            } catch (Exception unused) {
            }
        }
    }

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f17978d = aVar;
    }

    public final void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, ArrayList arrayList, String str53, String str54, String str55, String str56, String str57) {
        l.f(str, "licenceFromState");
        l.f(str2, "licenceFromRTO");
        l.f(str3, "jurisdiction");
        l.f(str4, "fName");
        l.f(str5, "mName");
        l.f(str6, "lName");
        l.f(str7, "fullName");
        l.f(str8, "relationType");
        l.f(str9, "relationFName");
        l.f(str10, "relationMName");
        l.f(str11, "relationLName");
        l.f(str12, "aadharNo");
        l.f(str13, "gender");
        l.f(str14, "dob");
        l.f(str15, "placeBirth");
        l.f(str16, "countryBirth");
        l.f(str17, "eduQualCode");
        l.f(str18, "bloodGroup");
        l.f(str19, "phoneNo");
        l.f(str20, "mobileNo");
        l.f(str21, "email");
        l.f(str22, "altMobileNo");
        l.f(str23, "idMark");
        l.f(str24, "idMark2");
        l.f(str25, "applNo");
        l.f(str26, "preState");
        l.f(str27, "presDistrictCd");
        l.f(str28, "presSubDistrictCd");
        l.f(str29, "presVillageOrTown");
        l.f(str30, "presCityCd");
        l.f(str31, "presHouseNo");
        l.f(str32, "presStreet");
        l.f(str33, "presLocation");
        l.f(str34, "presPinCode");
        l.f(str35, "permState");
        l.f(str36, "permDistrictCd");
        l.f(str37, "permSubDistrictCd");
        l.f(str38, "permVillageOrTown");
        l.f(str39, "permCityCd");
        l.f(str40, "permHouseNo");
        l.f(str41, "permStreet");
        l.f(str42, "permLocation");
        l.f(str43, "permPinCode");
        l.f(str44, "stayPeriodYear");
        l.f(str45, "stayPeriodMonth");
        l.f(str46, "reference");
        l.f(str47, "referenceType");
        l.f(str48, "llValidUpto");
        l.f(str49, "refRTOCode");
        l.f(str50, "bioId");
        l.f(str51, "allClassOfVehicles");
        l.f(str52, "selectedString");
        l.f(arrayList, "selectedCovsList");
        l.f(str53, "willingToDonate");
        l.f(str54, "allowNewAddr");
        l.f(str55, "applCatg");
        l.f(str56, "applDate");
        l.f(str57, "llLicenceNo");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = l(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, arrayList, str53, str54, str55, str56, str57).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f17978d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final JSONObject h(String str, String str2) {
        l.f(str, "applNo");
        l.f(str2, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", (Object) str);
            jSONObject.put("dateOfBirth", (Object) str2);
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

    public final a0 i() {
        return this.f17979e;
    }

    public final a0 j() {
        return this.f17982h;
    }

    public final a0 k() {
        return this.f17983i;
    }

    public final JSONObject l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, ArrayList arrayList, String str53, String str54, String str55, String str56, String str57) {
        String str58 = str;
        String str59 = str2;
        String str60 = str4;
        String str61 = str5;
        String str62 = str6;
        String str63 = str7;
        String str64 = str8;
        String str65 = str9;
        String str66 = str10;
        String str67 = str11;
        String str68 = str12;
        String str69 = str16;
        l.f(str58, "licenceFromState");
        l.f(str59, "licenceFromRTO");
        l.f(str3, "jurisdiction");
        l.f(str60, "fName");
        l.f(str61, "mName");
        l.f(str62, "lName");
        l.f(str63, "fullName");
        String str70 = "fullName";
        l.f(str64, "relationType");
        String str71 = "relationType";
        l.f(str65, "relationFName");
        l.f(str66, "relationMName");
        l.f(str67, "relationLName");
        l.f(str68, "aadharNo");
        l.f(str13, "gender");
        String str72 = "gender";
        l.f(str14, "dob");
        l.f(str15, "placeBirth");
        l.f(str16, "countryBirth");
        l.f(str17, "eduQualCode");
        String str73 = "eduQualCode";
        l.f(str18, "bloodGroup");
        l.f(str19, "phoneNo");
        l.f(str20, "mobileNo");
        l.f(str21, "email");
        String str74 = "email";
        l.f(str22, "altMobileNo");
        l.f(str23, "idMark");
        l.f(str24, "idMark2");
        l.f(str25, "applNo");
        l.f(str26, "preState");
        l.f(str27, "presDistrictCd");
        l.f(str28, "presSubDistrictCd");
        l.f(str29, "presVillageOrTown");
        String str75 = "presVillageOrTown";
        l.f(str30, "presCityCd");
        l.f(str31, "presHouseNo");
        String str76 = "presHouseNo";
        l.f(str32, "presStreet");
        String str77 = "presStreet";
        l.f(str33, "presLocation");
        String str78 = "presLocation";
        l.f(str34, "presPinCode");
        String str79 = "presPinCode";
        l.f(str35, "permState");
        String str80 = "permState";
        l.f(str36, "permDistrictCd");
        l.f(str37, "permSubDistrictCd");
        l.f(str38, "permVillageOrTown");
        String str81 = "permVillageOrTown";
        l.f(str39, "permCityCd");
        l.f(str40, "permHouseNo");
        String str82 = "permHouseNo";
        l.f(str41, "permStreet");
        String str83 = "permStreet";
        l.f(str42, "permLocation");
        String str84 = "permLocation";
        l.f(str43, "permPinCode");
        String str85 = "permPinCode";
        l.f(str44, "stayPeriodYear");
        l.f(str45, "stayPeriodMonth");
        l.f(str46, "reference");
        String str86 = "reference";
        l.f(str47, "referenceType");
        String str87 = "referenceType";
        l.f(str48, "llValidUpto");
        String str88 = "llValidUpto";
        l.f(str49, "refRTOCode");
        l.f(str50, "bioId");
        String str89 = "bioId";
        l.f(str51, "allClassOfVehicles");
        String str90 = "allClassOfVehicles";
        l.f(str52, "selectedString");
        ArrayList arrayList2 = arrayList;
        l.f(arrayList2, "selectedCovsList");
        l.f(str53, "willingToDonate");
        l.f(str54, "allowNewAddr");
        l.f(str55, "applCatg");
        l.f(str56, "applDate");
        l.f(str57, "llLicenceNo");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(new i7.d().t(arrayList2));
            jSONObject.put("licenceFromStateCode", (Object) str58);
            jSONObject.put("licenceFromRTOCode", (Object) str59);
            jSONObject.put("jurisdiction", (Object) str3);
            jSONObject.put("fname", (Object) str60);
            jSONObject.put("mname", (Object) str61);
            jSONObject.put("lname", (Object) str62);
            jSONObject.put(str70, (Object) str63);
            jSONObject.put(str71, (Object) str64);
            jSONObject.put("swdFname", (Object) str65);
            jSONObject.put("swdMname", (Object) str66);
            jSONObject.put("swdLname", (Object) str67);
            jSONObject.put("aadharNumber", (Object) str68);
            jSONObject.put(str72, (Object) str13);
            jSONObject.put("dateOfBirth", (Object) str14);
            jSONObject.put("placeOfBirth", (Object) str15);
            jSONObject.put("countryOfBirthCode", (Object) str16);
            jSONObject.put(str73, (Object) str17);
            jSONObject.put("bloodGroupCode", (Object) str18);
            jSONObject.put("phoneNumber", (Object) str19);
            jSONObject.put("mobileNumber", (Object) str20);
            jSONObject.put(str74, (Object) str21);
            jSONObject.put("altMobileNumber", (Object) str22);
            jSONObject.put("idMarks1", (Object) str23);
            jSONObject.put("idMarks2", (Object) str24);
            jSONObject.put("applicationNumber", (Object) str25);
            jSONObject.put("presState", (Object) str26);
            jSONObject.put("presDistrictCode", (Object) str27);
            jSONObject.put("presSubDistrictCode", (Object) str28);
            jSONObject.put(str75, (Object) str29);
            jSONObject.put("presCityCode", (Object) str30);
            jSONObject.put(str76, (Object) str31);
            jSONObject.put(str77, (Object) str32);
            jSONObject.put(str78, (Object) str33);
            jSONObject.put(str79, (Object) str34);
            jSONObject.put(str80, (Object) str35);
            jSONObject.put("permDistrictCode", (Object) str36);
            jSONObject.put("permSubDistrictCode", (Object) str37);
            jSONObject.put(str81, (Object) str38);
            jSONObject.put("permCityCode", (Object) str39);
            jSONObject.put(str82, (Object) str40);
            jSONObject.put(str83, (Object) str41);
            jSONObject.put(str84, (Object) str42);
            jSONObject.put(str85, (Object) str43);
            jSONObject.put("stayPeriodYears", (Object) str44);
            jSONObject.put("stayPeriodMonths", (Object) str45);
            jSONObject.put(str86, (Object) str46);
            jSONObject.put("applDate", (Object) str56);
            jSONObject.put(str87, (Object) str47);
            jSONObject.put(str88, (Object) str48);
            jSONObject.put("llRefRTOCode", (Object) str49);
            jSONObject.put(str89, (Object) str50);
            jSONObject.put(str90, (Object) str51);
            jSONObject.put("selectedString", (Object) str52);
            jSONObject.put("selectedCovsList", (Object) jSONArray);
            jSONObject.put("willingToDonate", (Object) str53);
            jSONObject.put("allowNewAddr", (Object) str54);
            jSONObject.put("applCatg", (Object) str55);
            jSONObject.put("llLicenceNo", (Object) str57);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final void m(String str, String str2) {
        l.f(str, "applNo");
        l.f(str2, "dob");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = h(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f17978d.c(f10, valueOf).enqueue(new C0234b(valueOf, this));
    }

    public final JSONObject n(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "transCd");
        l.f(str2, "mobileNo");
        l.f(str3, "applNo");
        l.f(str4, "fullName");
        l.f(str5, "rtoCd");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionCode", (Object) str);
            jSONObject.put("mobileNumber", (Object) str2);
            jSONObject.put("applicationNumber", (Object) str3);
            jSONObject.put("fullName", (Object) str4);
            jSONObject.put("licenceFromRTO", (Object) str5);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final a0 o() {
        return this.f17980f;
    }

    public final void p(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "transCd");
        l.f(str2, "mobileNo");
        l.f(str3, "applNo");
        l.f(str4, "fullName");
        l.f(str5, "rtoCd");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = n(str, str2, str3, str4, str5).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f17978d.b(f10, valueOf).enqueue(new c(valueOf, this));
    }

    public final a0 q() {
        return this.f17981g;
    }
}
