package ri;

import android.util.Log;
import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31063a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
            String str35 = str;
            String str36 = str3;
            String str37 = str4;
            String str38 = str5;
            String str39 = str6;
            String str40 = str7;
            String str41 = str8;
            String str42 = str9;
            String str43 = str10;
            String str44 = str11;
            String str45 = str12;
            String str46 = str13;
            String str47 = str16;
            l.f(str35, "dlno");
            l.f(str2, "dob");
            l.f(str36, "rtoCodeDLTr");
            l.f(str37, "dlHolderAltMobMum");
            l.f(str38, "willtoDonateOrgans");
            l.f(str39, "dupDlReasonCode");
            l.f(str40, "dupDlReasonName");
            l.f(str41, "applcatgDLserReq");
            l.f(str42, "changeOfAddReq");
            l.f(str43, "perHouseNo");
            l.f(str44, "perStreet");
            l.f(str45, "perLocation");
            l.f(str46, "permVillageOrTown");
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
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlno", (Object) str35);
            jSONObject.put("dob", (Object) str2);
            jSONObject.put("rtoCodeDLTr", (Object) str36);
            jSONObject.put("dlHolderAltMobMum", (Object) str37);
            jSONObject.put("willtoDonateOrgans", (Object) str38);
            jSONObject.put("dupDlReasonCode", (Object) str39);
            jSONObject.put("dupDlReasonName", (Object) str40);
            jSONObject.put("applcatgDLserReq", (Object) str41);
            jSONObject.put("changeOfAddReq", (Object) str42);
            jSONObject.put("perHouseNo", (Object) str43);
            jSONObject.put("perStreet", (Object) str44);
            jSONObject.put("perLocation", (Object) str45);
            jSONObject.put("permVillageOrTown", (Object) str46);
            jSONObject.put("perSubDistrict", (Object) str15);
            jSONObject.put("perDistrict", (Object) str14);
            jSONObject.put("perState", (Object) str16);
            jSONObject.put("perPinCode", (Object) str17);
            jSONObject.put("presHouseNo", (Object) str18);
            jSONObject.put("presStreet", (Object) str19);
            jSONObject.put("presLocation", (Object) str20);
            jSONObject.put("presVillageOrTown", (Object) str21);
            jSONObject.put("presSubDistrict", (Object) str22);
            jSONObject.put("presDistrict", (Object) str23);
            jSONObject.put("presState", (Object) str24);
            jSONObject.put("presPincode", (Object) str25);
            jSONObject.put("agentId", (Object) str26);
            jSONObject.put("agentPwd", (Object) str27);
            jSONObject.put("agentIpAddress", (Object) str28);
            jSONObject.put("agentServiceName", (Object) str29);
            jSONObject.put("mobileNumber", (Object) str30);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("516", (Object) "Replacement of DL");
            jSONObject2.put("515", (Object) "Change of Address in DL");
            jSONObject.put("selectedDLSerList", (Object) jSONObject2);
            Log.d("request_data", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
            String str29 = str;
            String str30 = str3;
            String str31 = str4;
            String str32 = str5;
            String str33 = str6;
            String str34 = str7;
            String str35 = str8;
            String str36 = str9;
            String str37 = str10;
            String str38 = str11;
            String str39 = str13;
            String str40 = str16;
            l.f(str29, "dlno");
            l.f(str2, "dob");
            l.f(str30, "rtoCodeDLTr");
            l.f(str31, "dlHolderAltMobMum");
            l.f(str32, "willtoDonateOrgans");
            l.f(str33, "dupDlReasonCode");
            l.f(str34, "changeOfAddReq");
            l.f(str35, "perHouseNo");
            l.f(str36, "perStreet");
            l.f(str37, "perLocation");
            l.f(str38, "permVillageOrTown");
            l.f(str12, "perDistrict");
            l.f(str39, "perSubDistrict");
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
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlno", (Object) str29);
            jSONObject.put("dob", (Object) str2);
            jSONObject.put("rtoCodeDLTr", (Object) str30);
            jSONObject.put("dlHolderAltMobMum", (Object) str31);
            jSONObject.put("willtoDonateOrgans", (Object) str32);
            jSONObject.put("dupDlReasonCode", (Object) str33);
            jSONObject.put("changeOfAddReq", (Object) str34);
            jSONObject.put("perHouseNo", (Object) str35);
            jSONObject.put("perStreet", (Object) str36);
            jSONObject.put("perLocation", (Object) str37);
            jSONObject.put("permVillageOrTown", (Object) str38);
            jSONObject.put("perSubDistrict", (Object) str39);
            jSONObject.put("perDistrict", (Object) str12);
            jSONObject.put("perState", (Object) str14);
            jSONObject.put("perPinCode", (Object) str15);
            jSONObject.put("presHouseNo", (Object) str16);
            jSONObject.put("presStreet", (Object) str17);
            jSONObject.put("presLocation", (Object) str18);
            jSONObject.put("presVillageOrTown", (Object) str19);
            jSONObject.put("presSubDistrict", (Object) str20);
            jSONObject.put("presDistrict", (Object) str21);
            jSONObject.put("presState", (Object) str22);
            jSONObject.put("presPincode", (Object) str23);
            jSONObject.put("mobileNumber", (Object) str24);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("516", (Object) "Replacement of DL");
            jSONObject.put("selectedDLSerList", (Object) jSONObject2);
            Log.d("request_data", jSONObject.toString());
            return jSONObject;
        }
    }
}
