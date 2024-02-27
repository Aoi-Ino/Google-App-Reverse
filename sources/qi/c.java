package qi;

import android.util.Log;
import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30613a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
            String str29 = str;
            String str30 = str3;
            String str31 = str6;
            String str32 = str7;
            String str33 = str8;
            String str34 = str9;
            String str35 = str10;
            String str36 = str11;
            String str37 = str13;
            String str38 = str14;
            String str39 = str17;
            l.f(str29, "dlno");
            l.f(str2, "dob");
            l.f(str30, "rtoCodeDLTr");
            l.f(str4, "dlHolderAltMobMum");
            l.f(str5, "willtoDonateOrgans");
            l.f(str31, "applcatgDLserReq");
            l.f(str32, "changeOfAddReq");
            l.f(str33, "perHouseNo");
            l.f(str34, "perStreet");
            l.f(str35, "perLocation");
            l.f(str36, "permVillageOrTown");
            l.f(str12, "perDistrict");
            l.f(str37, "perSubDistrict");
            l.f(str38, "perState");
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
            jSONObject.put("dlHolderAltMobMum", (Object) str4);
            jSONObject.put("willtoDonateOrgans", (Object) "N");
            jSONObject.put("applcatgDLserReq", (Object) str31);
            jSONObject.put("changeOfAddReq", (Object) str32);
            jSONObject.put("perHouseNo", (Object) str33);
            jSONObject.put("perStreet", (Object) str34);
            jSONObject.put("perLocation", (Object) str35);
            jSONObject.put("permVillageOrTown", (Object) str36);
            jSONObject.put("perSubDistrict", (Object) str37);
            jSONObject.put("perDistrict", (Object) str12);
            jSONObject.put("perState", (Object) str38);
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
            jSONObject2.put("514", (Object) "Renewal of DL");
            jSONObject2.put("515", (Object) "Change of Address in DL");
            jSONObject.put("selectedDLSerList", (Object) jSONObject2);
            Log.d("request_ren_coa_", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
            String str27 = str;
            String str28 = str3;
            String str29 = str6;
            String str30 = str7;
            String str31 = str8;
            String str32 = str9;
            String str33 = str11;
            String str34 = str12;
            String str35 = str13;
            String str36 = str14;
            String str37 = str17;
            l.f(str27, "dlno");
            l.f(str2, "dob");
            l.f(str28, "rtoCodeDLTr");
            l.f(str4, "dlHolderAltMobMum");
            l.f(str5, "willtoDonateOrgans");
            l.f(str29, "perHouseNo");
            l.f(str30, "perStreet");
            l.f(str31, "perLocation");
            l.f(str32, "permVillageOrTown");
            l.f(str10, "perDistrict");
            l.f(str33, "perSubDistrict");
            l.f(str34, "perState");
            l.f(str35, "perPinCode");
            l.f(str36, "presHouseNo");
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
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlno", (Object) str27);
            jSONObject.put("dob", (Object) str2);
            jSONObject.put("rtoCodeDLTr", (Object) str28);
            jSONObject.put("dlHolderAltMobMum", (Object) str4);
            jSONObject.put("willtoDonateOrgans", (Object) "N");
            jSONObject.put("perHouseNo", (Object) str29);
            jSONObject.put("perStreet", (Object) str30);
            jSONObject.put("perLocation", (Object) str31);
            jSONObject.put("permVillageOrTown", (Object) str32);
            jSONObject.put("perSubDistrict", (Object) str33);
            jSONObject.put("perDistrict", (Object) str10);
            jSONObject.put("perState", (Object) str34);
            jSONObject.put("perPinCode", (Object) str35);
            jSONObject.put("presHouseNo", (Object) str36);
            jSONObject.put("presStreet", (Object) str15);
            jSONObject.put("presLocation", (Object) str16);
            jSONObject.put("presVillageOrTown", (Object) str17);
            jSONObject.put("presSubDistrict", (Object) str18);
            jSONObject.put("presDistrict", (Object) str19);
            jSONObject.put("presState", (Object) str20);
            jSONObject.put("presPincode", (Object) str21);
            jSONObject.put("mobileNumber", (Object) str22);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("514", (Object) "Renewal of DL");
            jSONObject.put("selectedDLSerList", (Object) jSONObject2);
            Log.d("request_ren_coa_", jSONObject.toString());
            return jSONObject;
        }
    }
}
