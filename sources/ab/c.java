package ab;

import android.util.Log;
import cm.g;
import cm.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f393a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(boolean z10, ArrayList arrayList, String str, String str2, ArrayList arrayList2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80) {
            String str81;
            String str82;
            String str83;
            String str84;
            String str85;
            String str86;
            String str87;
            String str88;
            String str89 = str3;
            String str90 = str4;
            String str91 = str5;
            String str92 = str9;
            String str93 = str10;
            String str94 = str11;
            String str95 = str12;
            String str96 = str18;
            l.f(arrayList, "covsArrayList");
            l.f(str, "bioRecGenesis");
            l.f(str2, "allowAddrChangeAtDlservReqst");
            l.f(arrayList2, "multiListName");
            l.f(str89, "agentId");
            l.f(str90, "agentPwd");
            l.f(str91, "agentIpAddress");
            l.f(str6, "agentServiceName");
            l.f(str7, "applcatgDLserReq");
            l.f(str8, "dlHolderAltMobMum");
            l.f(str92, "dlno");
            l.f(str93, "dob");
            l.f(str94, "rtoCodeDLTr");
            l.f(str95, "willtoDonateOrgans");
            l.f(str13, "relationType");
            String str97 = "relationType";
            l.f(str14, "conDlReasonCode");
            l.f(str15, "conDlReasonName");
            String str98 = "conDlReasonName";
            l.f(str16, "dlHolderNaturalName");
            String str99 = "dlHolderNaturalName";
            l.f(str17, "conEffdate");
            String str100 = "conEffdate";
            l.f(str18, "applFirstName");
            String str101 = "applFirstName";
            l.f(str19, "applLastName");
            String str102 = "applLastName";
            l.f(str20, "relFirstName");
            String str103 = "relFirstName";
            l.f(str21, "relLastName");
            String str104 = "relLastName";
            String str105 = str22;
            l.f(str105, "mobileNumber");
            l.f(str23, "changeOfAddReq");
            l.f(str24, "perHouseNo");
            String str106 = "conDlReasonCode";
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
            String str107 = "dupDlReasonName";
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
            String str108 = "dupDlReasonCode";
            String str109 = str78;
            l.f(str109, "eKYCOpted");
            l.f(str79, "eKYCGender");
            String str110 = str80;
            l.f(str110, "eKYCapplicantPhoto");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", (Object) str89);
            jSONObject.put("agentPwd", (Object) str90);
            jSONObject.put("agentIpAddress", (Object) str91);
            jSONObject.put("agentServiceName", (Object) str6);
            jSONObject.put("dlno", (Object) str92);
            jSONObject.put("dob", (Object) str93);
            jSONObject.put("rtoCodeDLTr", (Object) str94);
            jSONObject.put("mobileNumber", (Object) str105);
            jSONObject.put("dlHolderAltMobMum", (Object) str8);
            jSONObject.put("willtoDonateOrgans", (Object) str95);
            jSONObject.put("applcatgDLserReq", (Object) "G");
            jSONObject.put("changeOfAddReq", (Object) "B");
            if (l.a(str109, "Y")) {
                jSONObject.put("eKYCId", (Object) str77);
                jSONObject.put("eKYCOpted", (Object) str109);
                jSONObject.put("eKYCGender", (Object) str79);
                jSONObject.put("eKYCapplicantPhoto", (Object) str110);
            }
            JSONObject jSONObject2 = new JSONObject();
            ArrayList arrayList3 = arrayList2;
            if (arrayList3.contains("Issue of Duplicate DL")) {
                String str111 = str43;
                str84 = str44;
                str83 = str108;
                jSONObject.put(str83, (Object) str111);
                str81 = str107;
                str82 = str111;
                str85 = str42;
                jSONObject.put(str81, (Object) str85);
                jSONObject2.put("513", (Object) "Issue of Duplicate DL");
            } else {
                str81 = str107;
                str85 = str42;
                str82 = str43;
                str84 = str44;
                str83 = str108;
            }
            if (arrayList3.contains("Renewal of DL")) {
                jSONObject2.put("514", (Object) "Renewal of DL");
            }
            if (arrayList3.contains("Re-Validation of Expired DL")) {
                JSONArray jSONArray = new JSONArray();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(arrayList.get(i10));
                }
                jSONObject.put("covsForRetest", (Object) jSONArray);
                jSONObject2.put("537", (Object) "Re-Validation of Expired DL");
            }
            if (arrayList3.contains("Change of Address in DL")) {
                str87 = str83;
                jSONObject.put("perHouseNo", (Object) str24);
                jSONObject.put("perStreet", (Object) str25);
                jSONObject.put("perLocation", (Object) str26);
                jSONObject.put("permVillageOrTown", (Object) str27);
                jSONObject.put("perSubDistrict", (Object) str28);
                jSONObject.put("perDistrict", (Object) str29);
                jSONObject.put("perState", (Object) str30);
                jSONObject.put("perPinCode", (Object) str31);
                jSONObject.put("presHouseNo", (Object) str32);
                jSONObject.put("presStreet", (Object) str33);
                jSONObject.put("presLocation", (Object) str34);
                jSONObject.put("presVillageOrTown", (Object) str35);
                jSONObject.put("presSubDistrict", (Object) str36);
                jSONObject.put("presDistrict", (Object) str37);
                jSONObject.put("presState", (Object) str38);
                str86 = str40;
                jSONObject.put("presPincode", (Object) str39);
                if (z10) {
                    jSONObject2.put("515", (Object) "Change of Address in DL");
                }
            } else {
                str86 = str40;
                str87 = str83;
            }
            if (arrayList3.contains("Replacement of DL")) {
                jSONObject.put(str87, (Object) str82);
                jSONObject.put(str81, (Object) str85);
                jSONObject2.put("516", (Object) "Replacement of DL");
            }
            if (arrayList3.contains("DL Extract")) {
                jSONObject.put("dleDlReasonCode", (Object) str86);
                jSONObject.put("dleDlReasonName", (Object) str41);
                jSONObject2.put("523", (Object) "DL Extract");
            }
            if (arrayList3.contains("Endorsement to Drive in Hill Region")) {
                jSONObject.put("declaringcheck", (Object) str47);
                jSONObject.put("hillcertificate", (Object) str48);
                jSONObject.put("hillissueDate", (Object) str49);
                jSONObject.put("hillvalidFrom", (Object) str50);
                jSONObject.put("hillvalidTo", (Object) str51);
                jSONObject.put("hilldrivingschool", (Object) str52);
                str88 = str54;
                jSONObject.put("hillissby", (Object) str53);
                jSONObject2.put("524", (Object) "Endorsement to Drive in Hill Region");
            } else {
                str88 = str54;
            }
            if (arrayList3.contains("Change of Name in DL")) {
                jSONObject.put(str97, (Object) str13);
                jSONObject.put(str106, Integer.parseInt(str14));
                jSONObject.put(str98, (Object) str15);
                jSONObject.put(str99, (Object) str16);
                jSONObject.put(str100, (Object) str17);
                jSONObject.put(str101, (Object) str18);
                jSONObject.put(str102, (Object) str19);
                jSONObject.put(str103, (Object) str20);
                jSONObject.put(str104, (Object) str21);
                jSONObject2.put("526", (Object) "Change of Name in DL");
            }
            if (arrayList3.contains("Change of Date of Birth in DL")) {
                jSONObject.put("codobDlReasonName", (Object) str45);
                jSONObject.put("codobDlReasonCode", (Object) str46);
                jSONObject.put("applDateOfBirth", (Object) str84);
                jSONObject2.put("548", (Object) "Change of Date of Birth in DL");
            }
            if (arrayList3.contains("International Driving Permit")) {
                jSONObject.put("pofbirth", (Object) str88);
                jSONObject.put("country", (Object) str55);
                jSONObject.put("passno", (Object) str56);
                jSONObject.put("passvaltill", (Object) str57);
                jSONObject.put("visano", (Object) str58);
                jSONObject.put("visavaltill", (Object) str59);
                jSONObject.put("tovisit", (Object) str60);
                jSONObject.put("iscountryrestricted", (Object) str61);
                jSONObject.put("countryRestrictedReason", (Object) str62);
                jSONObject.put("isDlSerdisqualified", (Object) str63);
                jSONObject.put("dlSerdisqualifiedReason", (Object) str64);
                jSONObject.put("forAdd1", (Object) str65);
                jSONObject.put("forAdd2", (Object) str66);
                jSONObject.put("forAdd3", (Object) str67);
                jSONObject.put("forAddPinCode", (Object) str68);
                jSONObject.put("forNationMobNum", (Object) str69);
                jSONObject.put("emailID", (Object) str70);
                jSONObject.put("appliedIdpfromIndEmb", (Object) str71);
                jSONObject.put("indEmbName", (Object) str72);
                jSONObject.put("dateOfVerifEmb", (Object) str74);
                jSONObject.put("embPlace", (Object) str73);
                jSONObject.put("embEndorseNo", (Object) str75);
                jSONObject.put("idpcountryapplyfrom", (Object) str76);
                jSONObject2.put("525", (Object) "International Driving Permit");
            }
            jSONObject.put("selectedDLSerList", (Object) jSONObject2);
            Log.d("request_data", jSONObject.toString());
            return jSONObject;
        }
    }
}
