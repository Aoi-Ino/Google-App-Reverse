package o9;

import android.util.Log;
import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0197a f14458a = new C0197a((g) null);

    /* renamed from: o9.a$a  reason: collision with other inner class name */
    public static final class C0197a {
        private C0197a() {
        }

        public /* synthetic */ C0197a(g gVar) {
            this();
        }

        public final JSONObject a(String str) {
            l.f(str, "stateCodeDLTr");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", (Object) "mobSARATHI");
            jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("agentIpAddress", (Object) "10.248.210.8");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            return jSONObject;
        }

        public final JSONObject b(String str, String str2) {
            l.f(str, "appNumber");
            l.f(str2, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", (Object) "mobSARATHI");
            jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("agentIpAddress", (Object) "10.246.82.159");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("applNo", (Object) str);
            jSONObject.put("dob", (Object) str2);
            return jSONObject;
        }

        public final JSONObject c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
            String str20 = str;
            String str21 = str3;
            String str22 = str4;
            String str23 = str5;
            String str24 = str6;
            String str25 = str7;
            String str26 = str8;
            String str27 = str9;
            String str28 = str10;
            String str29 = str11;
            String str30 = str12;
            String str31 = str13;
            String str32 = str16;
            l.f(str20, "clState");
            l.f(str2, "clRto");
            l.f(str21, "permHouseNo");
            l.f(str22, "permStreet");
            l.f(str23, "permLocation");
            l.f(str24, "permPinCode");
            l.f(str25, "presHouseNo");
            l.f(str26, "presStreet");
            l.f(str27, "presLocation");
            l.f(str28, "presPinCode");
            l.f(str29, "permDistrict");
            l.f(str30, "permVillageOrTown");
            l.f(str31, "presDistrict");
            l.f(str14, "presVillageOrTown");
            l.f(str15, "permSubDistrict");
            l.f(str16, "presSubDistrict");
            l.f(str17, "serviceCode");
            l.f(str18, "clNumber");
            l.f(str19, "dateOfBirth");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clState", (Object) str20);
            jSONObject.put("clRto", (Object) str2);
            jSONObject.put("permHouseNo", (Object) str21);
            jSONObject.put("permStreet", (Object) str22);
            jSONObject.put("permLocation", (Object) str23);
            jSONObject.put("permPinCode", (Object) str24);
            jSONObject.put("presHouseNo", (Object) str25);
            jSONObject.put("presStreet", (Object) str26);
            jSONObject.put("presLocation", (Object) str27);
            jSONObject.put("presPinCode", (Object) str28);
            jSONObject.put("permDistrict", (Object) str29);
            jSONObject.put("permVillageOrTown", (Object) str30);
            jSONObject.put("presDistrict", (Object) str31);
            jSONObject.put("presVillageOrTown", (Object) str14);
            jSONObject.put("permSubDistrict", (Object) str15);
            jSONObject.put("presSubDistrict", (Object) str16);
            jSONObject.put("serviceCode", (Object) str17);
            jSONObject.put("clNumber", (Object) str18);
            jSONObject.put("dateOfBirth", (Object) str19);
            return jSONObject;
        }

        public final JSONObject d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            String str15 = str;
            String str16 = str3;
            String str17 = str4;
            String str18 = str5;
            String str19 = str6;
            String str20 = str7;
            String str21 = str8;
            String str22 = str9;
            String str23 = str10;
            String str24 = str11;
            String str25 = str12;
            String str26 = str13;
            String str27 = str14;
            l.f(str15, "clState");
            l.f(str2, "clRto");
            l.f(str16, "fname");
            l.f(str17, "mname");
            l.f(str18, "lname");
            l.f(str19, "swdfName");
            l.f(str20, "swdmName");
            l.f(str21, "swdlName");
            l.f(str22, "relationTypeEntry");
            l.f(str23, "fullName");
            l.f(str24, "swdFullName");
            l.f(str25, "serviceCode");
            l.f(str26, "clNumber");
            l.f(str27, "dateOfBirth");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clState", (Object) str15);
            jSONObject.put("clRto", (Object) str2);
            jSONObject.put("fname", (Object) str16);
            jSONObject.put("mname", (Object) str17);
            jSONObject.put("lname", (Object) str18);
            jSONObject.put("swdfName", (Object) str19);
            jSONObject.put("swdmName", (Object) str20);
            jSONObject.put("swdlName", (Object) str21);
            jSONObject.put("relationTypeEntry", (Object) str22);
            String str28 = "fullName";
            jSONObject.put(str28, (Object) str23);
            jSONObject.put("swdFullName", (Object) str24);
            jSONObject.put(str28, (Object) str23);
            jSONObject.put("serviceCode", (Object) str25);
            jSONObject.put("clNumber", (Object) str26);
            jSONObject.put("dateOfBirth", (Object) str27);
            return jSONObject;
        }

        public final JSONObject e(String str, int i10, String str2) {
            l.f(str, "stateCd");
            l.f(str2, "adharRtoCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCd", (Object) str);
            jSONObject.put("serviceCd", i10);
            jSONObject.put("rtoCode", (Object) str2);
            Log.d("checkAdharRequest", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject f(String str, String str2) {
            l.f(str, "appNumber");
            l.f(str2, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", (Object) "mobSARATHI");
            jSONObject.put("agentPwd", (Object) "657d1c758e2e95af0014e16f5109f933");
            jSONObject.put("agentIpAddress", (Object) "10.246.82.159");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("dob", (Object) str2);
            jSONObject.put("applNo", (Object) str);
            jSONObject.put("trackCd", (Object) "0");
            jSONObject.put("campCd", (Object) "0");
            return jSONObject;
        }

        public final JSONObject g(String str, String str2) {
            l.f(str, "clNumber");
            l.f(str2, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cl", (Object) str);
            jSONObject.put("db", (Object) str2);
            Log.d("cl_data_req", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject h(String str, String str2, String str3, String str4, String str5, String str6) {
            l.f(str, "learningLicence");
            l.f(str2, "dateOfBirth");
            l.f(str3, "agentId");
            l.f(str4, "agentPwd");
            l.f(str5, "agentIpAddress");
            l.f(str6, "agentServiceName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("learningLicence", (Object) str);
            jSONObject.put("dateOfBirth", (Object) str2);
            jSONObject.put("agentId", (Object) str3);
            jSONObject.put("agentPwd", (Object) str4);
            jSONObject.put("agentIpAddress", (Object) str5);
            jSONObject.put("agentServiceName", (Object) str6);
            Log.d("ll_details_req", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
            String str31 = str4;
            String str32 = str5;
            String str33 = str6;
            String str34 = str7;
            String str35 = str8;
            String str36 = str9;
            String str37 = str12;
            String str38 = str13;
            String str39 = str14;
            String str40 = str22;
            String str41 = str26;
            l.f(str, "newclState");
            l.f(str2, "newclRto");
            l.f(str3, "newclPresState");
            l.f(str31, "newclPermState");
            l.f(str32, "newclPresDistrict");
            l.f(str33, "newclPermDistrict");
            l.f(str34, "newclPresSubDistrict");
            l.f(str35, "newclPermSubDistrict");
            l.f(str36, "newclPresHouseNo");
            l.f(str10, "newclPermHouseNo");
            l.f(str11, "newclPermPincode");
            l.f(str37, "newclPresStreet");
            l.f(str38, "newclPermStreet");
            l.f(str39, "newclPresPincode");
            l.f(str15, "newclPresVillageOrTownCode");
            l.f(str16, "newclPermVillageOrTownCode");
            l.f(str17, "newclPresVillageOrTown");
            l.f(str18, "newclPermVillageOrTown");
            l.f(str19, "newclFname");
            l.f(str20, "newclMname");
            l.f(str21, "newclLname");
            l.f(str22, "newclRelation");
            l.f(str23, "newclRFname");
            l.f(str24, "newclRMname");
            l.f(str25, "newclRLname");
            l.f(str26, "newclGender");
            l.f(str27, "newclDateofBirth");
            l.f(str28, "newclEduQ");
            l.f(str29, "newclBlood");
            l.f(str30, "newclMobile");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("newclState", (Object) q.B0(str).toString());
            jSONObject.put("newclRto", (Object) q.B0(str2).toString());
            jSONObject.put("newclPresState", (Object) str3);
            jSONObject.put("newclPermState", (Object) str31);
            jSONObject.put("newclPresDistrict", (Object) str32);
            jSONObject.put("newclPermDistrict", (Object) str33);
            jSONObject.put("newclPresSubDistrict", (Object) str34);
            jSONObject.put("newclPermSubDistrict", (Object) str35);
            jSONObject.put("newclPresHouseNo", (Object) str36);
            jSONObject.put("newclPresStreet", (Object) str37);
            jSONObject.put("newclPermStreet", (Object) str38);
            jSONObject.put("newclPresPincode", (Object) str39);
            jSONObject.put("newclPermHouseNo", (Object) str10);
            jSONObject.put("newclPermPincode", (Object) str11);
            jSONObject.put("newclPresVillageOrTownCode", (Object) str15);
            jSONObject.put("newclPermVillageOrTownCode", (Object) str16);
            jSONObject.put("newclPresVillageOrTown", (Object) q.B0(str17).toString());
            jSONObject.put("newclPermVillageOrTown", (Object) q.B0(str18).toString());
            jSONObject.put("newclFname", (Object) q.B0(str19).toString());
            jSONObject.put("newclMname", (Object) q.B0(str20).toString());
            jSONObject.put("newclLname", (Object) q.B0(str21).toString());
            jSONObject.put("newclRelation", (Object) str22);
            jSONObject.put("newclRFname", (Object) q.B0(str23).toString());
            jSONObject.put("newclRMname", (Object) q.B0(str24).toString());
            jSONObject.put("newclRLname", (Object) q.B0(str25).toString());
            jSONObject.put("newclGender", (Object) str26);
            jSONObject.put("newclDateofBirth", (Object) str27);
            jSONObject.put("newclEduQ", (Object) str28);
            jSONObject.put("newclBlood", (Object) str29);
            jSONObject.put("newclMobile", (Object) q.B0(str30).toString());
            return jSONObject;
        }

        public final JSONObject j(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "clState");
            l.f(str2, "clRto");
            l.f(str3, "serviceCode");
            l.f(str4, "clNumber");
            l.f(str5, "dateOfBirth");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clState", (Object) str);
            jSONObject.put("clRto", (Object) str2);
            jSONObject.put("serviceCode", (Object) str3);
            jSONObject.put("clNumber", (Object) str4);
            jSONObject.put("dateOfBirth", (Object) str5);
            return jSONObject;
        }

        public final JSONObject k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i10, String str23, String str24, String str25, String str26) {
            String str27 = str;
            String str28 = str16;
            l.f(str27, "aadhaarNo");
            l.f(str2, "careOf");
            l.f(str3, "code");
            l.f(str4, "dist");
            l.f(str5, "dobAdhar");
            l.f(str6, "gender");
            l.f(str7, "house");
            l.f(str8, "landMark");
            l.f(str9, "localityIfAny");
            l.f(str10, "name");
            l.f(str11, "phone");
            l.f(str12, "pht");
            l.f(str13, "pincode");
            l.f(str14, "state");
            l.f(str15, "adharStatus");
            l.f(str16, "street");
            l.f(str17, "villageTownCity");
            l.f(str18, "xmlUID");
            String str29 = str19;
            l.f(str29, "dlNo");
            String str30 = str20;
            l.f(str30, "dlOwnerName");
            String str31 = str21;
            l.f(str31, "dob");
            String str32 = str22;
            l.f(str32, "dlOwnerRelationFullName");
            String str33 = str23;
            l.f(str33, "status");
            String str34 = str24;
            l.f(str34, "txNo");
            String str35 = str25;
            l.f(str35, "uid");
            String str36 = str26;
            l.f(str36, "stateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlNo", (Object) str29);
            jSONObject.put("dlOwnerName", (Object) str30);
            jSONObject.put("dob", (Object) str31);
            jSONObject.put("dlOwnerRelationFullName", (Object) str32);
            jSONObject.put("serviceCd", i10);
            jSONObject.put("status", (Object) str33);
            jSONObject.put("txNo", (Object) str34);
            jSONObject.put("uid", (Object) str35);
            jSONObject.put("stateCd", (Object) str36);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aadhaarNo", (Object) str27);
            jSONObject2.put("careOf", (Object) str2);
            jSONObject2.put("code", (Object) str3);
            jSONObject2.put("dist", (Object) str4);
            jSONObject2.put("dobAdhar", (Object) str5);
            jSONObject2.put("gender", (Object) str6);
            jSONObject2.put("house", (Object) str7);
            jSONObject2.put("landMark", (Object) str8);
            jSONObject2.put("localityIfAny", (Object) str9);
            jSONObject2.put("name", (Object) str10);
            jSONObject2.put("phone", (Object) str11);
            jSONObject2.put("pht", (Object) str12);
            jSONObject2.put("pincode", (Object) str13);
            jSONObject2.put("state", (Object) str14);
            jSONObject2.put("adharStatus", (Object) str15);
            jSONObject2.put("street", (Object) str16);
            jSONObject2.put("villageTownCity", (Object) str17);
            jSONObject2.put("xmlUID", (Object) str18);
            jSONObject.put("dOEkyc", (Object) jSONObject2);
            Log.d("adhar_request_json", jSONObject.toString());
            return jSONObject;
        }
    }
}
