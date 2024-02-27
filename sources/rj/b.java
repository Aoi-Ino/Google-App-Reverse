package rj;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.NewDlScreen.Modal.CheckLLExitModal;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolModal;
import com.nic.mparivahan.NewDlScreen.Modal.SubmitDlResponseModal;
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

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f31073d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f31074e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f31075f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f31076g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f31077h = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f31079b;

        a(String str, b bVar) {
            this.f31078a = str;
            this.f31079b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31079b.m().k("error");
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
                    str = this.f31078a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31078a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, CheckLLExitModal.class);
                l.e(j10, "fromJson(...)");
                this.f31079b.i().k((CheckLLExitModal) j10);
            } catch (Exception unused) {
                this.f31079b.m().k("error");
            }
        }
    }

    /* renamed from: rj.b$b  reason: collision with other inner class name */
    public static final class C0343b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f31081b;

        C0343b(String str, b bVar) {
            this.f31080a = str;
            this.f31081b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31081b.m().k("error");
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
                    str = this.f31080a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31080a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, DrivingSchoolModal.class);
                l.e(j10, "fromJson(...)");
                this.f31081b.j().k((DrivingSchoolModal) j10);
            } catch (Exception unused) {
                this.f31081b.m().k("error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f31083b;

        c(String str, b bVar) {
            this.f31082a = str;
            this.f31083b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31083b.m().k("error");
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
                    str = this.f31082a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31082a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, SubmitDlResponseModal.class);
                l.e(j10, "fromJson(...)");
                this.f31083b.n().k((SubmitDlResponseModal) j10);
            } catch (Exception unused) {
                this.f31083b.m().k("error");
            }
        }
    }

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f31073d = aVar;
    }

    public final void g(String str, String str2) {
        l.f(str, "enteredLlNo");
        l.f(str2, "dob");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = l(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31073d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final void h(String str) {
        l.f(str, "stateName");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = k(str).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31073d.b(f10, valueOf).enqueue(new C0343b(valueOf, this));
    }

    public final a0 i() {
        return this.f31074e;
    }

    public final a0 j() {
        return this.f31075f;
    }

    public final JSONObject k(String str) {
        l.f(str, "stateName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("llFromState1", (Object) str);
            jSONObject.put("llToDLState", (Object) str);
            jSONObject.put("dsListFlag", (Object) "true");
            jSONObject.put("agentId", (Object) "UmangOD");
            jSONObject.put("agentIpAddress", (Object) "164.100.161.142");
            jSONObject.put("agentServiceName", (Object) "SarathiMobileService");
            jSONObject.put("agentPwd", (Object) "2335647e653c970102713f68f6aad970");
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final JSONObject l(String str, String str2) {
        l.f(str, "llNo");
        l.f(str2, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("learningLicence", (Object) str);
            jSONObject.put("dateOfBirth", (Object) str2);
            jSONObject.put("agentId", (Object) "UmangOD");
            jSONObject.put("agentIpAddress", (Object) "164.100.161.142");
            jSONObject.put("agentServiceName", (Object) "SarathiMobileService");
            jSONObject.put("agentPwd", (Object) "2335647e653c970102713f68f6aad970");
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final a0 m() {
        return this.f31076g;
    }

    public final a0 n() {
        return this.f31077h;
    }

    public final JSONObject o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, boolean z10, boolean z11, String str53, ArrayList arrayList) {
        String str54 = str;
        String str55 = str2;
        String str56 = str4;
        String str57 = str5;
        String str58 = str6;
        String str59 = str7;
        String str60 = str8;
        String str61 = str9;
        String str62 = str10;
        String str63 = str11;
        String str64 = str12;
        String str65 = str16;
        l.f(str54, "llNo");
        l.f(str55, "dob");
        l.f(str3, "llFromRTO1");
        l.f(str56, "llFromState1");
        String str66 = "llFromState1";
        l.f(str57, "aadharFlag");
        l.f(str58, "ekycId");
        String str67 = "ekycId";
        l.f(str59, "userId");
        String str68 = "userId";
        l.f(str60, "fName");
        l.f(str61, "mName");
        l.f(str62, "lName");
        l.f(str63, "relationType");
        String str69 = "relationType";
        l.f(str64, "relationFName");
        l.f(str13, "relationMName");
        l.f(str14, "relationLName");
        l.f(str15, "aadharNo");
        l.f(str16, "fullName");
        l.f(str17, "gender");
        String str70 = "gender";
        l.f(str18, "dateOfBirth");
        String str71 = "dateOfBirth";
        l.f(str19, "nprNo");
        l.f(str20, "placeOfBirth");
        String str72 = "placeOfBirth";
        l.f(str21, "countryOfBirth");
        String str73 = "countryOfBirth";
        l.f(str22, "eduQual");
        String str74 = "eduQual";
        l.f(str23, "bloodGroup");
        String str75 = "bloodGroup";
        l.f(str24, "email");
        String str76 = "email";
        l.f(str25, "mobileNo");
        l.f(str26, "altMobileNo");
        l.f(str27, "idMark1");
        l.f(str28, "idMark2");
        l.f(str29, "llToDlState");
        l.f(str30, "llToDlRto");
        l.f(str31, "presState");
        String str77 = "presState";
        l.f(str32, "presDist");
        l.f(str33, "presSubDist");
        l.f(str34, "presPincode");
        l.f(str35, "presHNo");
        l.f(str36, "presVillTown");
        l.f(str37, "presStreet");
        String str78 = "presStreet";
        l.f(str38, "presCity");
        String str79 = "presCity";
        l.f(str39, "presLoc");
        l.f(str40, "presSameAsPerm");
        String str80 = "presSameAsPerm";
        l.f(str41, "permState");
        String str81 = "permState";
        l.f(str42, "permDist");
        l.f(str43, "permSubDistr");
        l.f(str44, "permPincode");
        l.f(str45, "permHNo");
        l.f(str46, "permVillOrTown");
        l.f(str47, "permStreet");
        String str82 = "permStreet";
        l.f(str48, "permCity");
        String str83 = "permCity";
        l.f(str49, "permLoc");
        l.f(str50, "permStayMonth");
        l.f(str51, "permStayYear");
        l.f(str52, "age");
        String str84 = "age";
        l.f(str53, "selectedCov");
        ArrayList arrayList2 = arrayList;
        l.f(arrayList2, "dSchoolList");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = arrayList.size() > 0 ? new JSONArray(new i7.d().t(arrayList2)) : new JSONArray();
            jSONObject.put("agentId", (Object) "UmangDL");
            jSONObject.put("agentIpAddress", (Object) "164.100.161.142");
            jSONObject.put("agentServiceName", (Object) "SarathiMobileService");
            jSONObject.put("agentPwd", (Object) "2335647e653c970102713f68f6aad970");
            jSONObject.put("learningLicence", (Object) str54);
            jSONObject.put("dOB", (Object) str55);
            jSONObject.put("llFromRTO1", (Object) str3);
            jSONObject.put(str66, (Object) str56);
            jSONObject.put("aadharflag", (Object) str57);
            jSONObject.put(str67, (Object) str58);
            jSONObject.put(str68, (Object) str59);
            jSONObject.put("fname", (Object) str60);
            jSONObject.put("mname", (Object) str61);
            jSONObject.put("lname", (Object) str62);
            jSONObject.put(str69, (Object) str63);
            jSONObject.put("swdfName", (Object) str64);
            jSONObject.put("swdmName", (Object) str13);
            jSONObject.put("swdlName", (Object) str14);
            jSONObject.put("aadharNumber", (Object) str15);
            jSONObject.put("newFullName", (Object) str16);
            jSONObject.put(str70, (Object) str17);
            jSONObject.put(str71, (Object) str18);
            jSONObject.put("nprnumber", (Object) str19);
            jSONObject.put(str72, (Object) str20);
            jSONObject.put(str73, (Object) str21);
            jSONObject.put(str74, (Object) str22);
            jSONObject.put(str75, (Object) str23);
            jSONObject.put(str76, (Object) str24);
            jSONObject.put("mobileNumber", (Object) str25);
            jSONObject.put("alternatemobileNumber", (Object) str26);
            jSONObject.put("idMarks1", (Object) str27);
            jSONObject.put("idMarks2", (Object) str28);
            jSONObject.put("llToDLState", (Object) str29);
            jSONObject.put("llToDLRto", (Object) str30);
            jSONObject.put(str77, (Object) str31);
            jSONObject.put("presDistrict", (Object) str32);
            jSONObject.put("presSubDistrict", (Object) str33);
            jSONObject.put("presPinCode", (Object) str34);
            jSONObject.put("presHouseNo", (Object) str35);
            jSONObject.put("presVillageOrTown", (Object) str36);
            jSONObject.put(str78, (Object) str37);
            jSONObject.put(str79, (Object) str38);
            jSONObject.put("presLocation", (Object) str39);
            jSONObject.put(str80, (Object) str40);
            jSONObject.put(str81, (Object) str41);
            jSONObject.put("permDistrict", (Object) str42);
            jSONObject.put("permSubDistrict", (Object) str43);
            jSONObject.put("permPinCode", (Object) str44);
            jSONObject.put("permHouseNo", (Object) str45);
            jSONObject.put("permVillageOrTown", (Object) str46);
            jSONObject.put(str82, (Object) str47);
            jSONObject.put(str83, (Object) str48);
            jSONObject.put("permLocation", (Object) str49);
            jSONObject.put("presStayMonths", (Object) str50);
            jSONObject.put("presStayYears", (Object) str51);
            jSONObject.put(str84, (Object) str52);
            jSONObject.put("onlyEditAddressLL", z10);
            jSONObject.put("editAddressLL", z11);
            jSONObject.put("selectedCovs", (Object) str53);
            jSONObject.put("drivingSchoolDetforInput", (Object) jSONArray);
            Log.e("Obj", jSONObject.toString());
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final void p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, boolean z10, boolean z11, String str53, ArrayList arrayList) {
        l.f(str, "llNo");
        l.f(str2, "dob");
        l.f(str3, "llFromRTO1");
        l.f(str4, "llFromState1");
        l.f(str5, "aadharFlag");
        l.f(str6, "ekycId");
        l.f(str7, "userId");
        l.f(str8, "fName");
        l.f(str9, "mName");
        l.f(str10, "lName");
        l.f(str11, "relationType");
        l.f(str12, "relationFName");
        l.f(str13, "relationMName");
        l.f(str14, "relationLName");
        l.f(str15, "aadharNo");
        l.f(str16, "fullName");
        l.f(str17, "gender");
        l.f(str18, "dateOfBirth");
        l.f(str19, "nprNo");
        l.f(str20, "placeOfBirth");
        l.f(str21, "countryOfBirth");
        l.f(str22, "eduQual");
        l.f(str23, "bloodGroup");
        l.f(str24, "email");
        l.f(str25, "mobileNo");
        l.f(str26, "altMobileNo");
        l.f(str27, "idMark1");
        l.f(str28, "idMark2");
        l.f(str29, "llToDlState");
        l.f(str30, "llToDlRto");
        l.f(str31, "presState");
        l.f(str32, "presDist");
        l.f(str33, "presSubDist");
        l.f(str34, "presPincode");
        l.f(str35, "presHNo");
        l.f(str36, "presVillTown");
        l.f(str37, "presStreet");
        l.f(str38, "presCity");
        l.f(str39, "presLoc");
        l.f(str40, "presSameAsPerm");
        l.f(str41, "permState");
        l.f(str42, "permDist");
        l.f(str43, "permSubDistr");
        l.f(str44, "permPincode");
        l.f(str45, "permHNo");
        l.f(str46, "permVillOrTown");
        l.f(str47, "permStreet");
        l.f(str48, "permCity");
        l.f(str49, "permLoc");
        l.f(str50, "permStayMonth");
        l.f(str51, "permStayYear");
        l.f(str52, "age");
        l.f(str53, "selectedCov");
        l.f(arrayList, "dSchoolList");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, z10, z11, str53, arrayList).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31073d.c(f10, valueOf).enqueue(new c(valueOf, this));
    }
}
