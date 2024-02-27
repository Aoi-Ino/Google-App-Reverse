package j9;

import cm.g;
import cm.l;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12769a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(String str) {
            l.f(str, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(str));
            return jSONObject;
        }

        public final JSONObject b(String str, String str2, String str3) {
            l.f(str, "userId");
            l.f(str2, "startDate");
            l.f(str3, "endDate");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accdCitizenId", Long.parseLong(str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenAccident", (Object) jSONObject);
            jSONObject2.put("startDate", (Object) str2);
            jSONObject2.put("endDate", (Object) str3);
            return jSONObject2;
        }

        public final JSONObject c(String str) {
            l.f(str, "feedbackAccidentId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackAccidentId", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparAccidentFeedback", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject d(String str) {
            l.f(str, "violationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accId", (Object) str);
            return jSONObject;
        }

        public final JSONObject e(String str) {
            l.f(str, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(str));
            return jSONObject;
        }

        public final JSONObject f(String str) {
            l.f(str, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(str));
            return jSONObject;
        }

        public final JSONObject g(String str) {
            l.f(str, "ctzIdVal");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(str));
            return jSONObject;
        }

        public final JSONObject h(String str, String str2, String str3) {
            l.f(str, "userId");
            l.f(str2, "startDate");
            l.f(str3, "endDate");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violCitizenId", Integer.parseInt(str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenViolation", (Object) jSONObject);
            jSONObject2.put("startDate", (Object) str2);
            jSONObject2.put("endDate", (Object) str3);
            return jSONObject2;
        }

        public final JSONObject i(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z10, String str15, String str16, String str17) {
            String str18 = str3;
            String str19 = str4;
            String str20 = str5;
            String str21 = str6;
            String str22 = str7;
            String str23 = str8;
            String str24 = str9;
            String str25 = str10;
            String str26 = str16;
            String str27 = str17;
            l.f(str, "userId");
            l.f(str2, "disticId");
            l.f(str18, "location");
            l.f(str19, "locLat");
            l.f(str20, "loc");
            l.f(str21, "locLong");
            l.f(str22, "regNo");
            l.f(str23, "remarks");
            l.f(str24, "stateCode");
            l.f(str25, "updatedByName");
            l.f(str11, "uploadedImgValue");
            l.f(str12, "imageFileName");
            l.f(str13, "uploadedVideoFilePath");
            l.f(str14, "videoFileName");
            l.f(str15, "mid");
            l.f(str26, "did");
            l.f(str27, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violCitizenId", Long.parseLong(str));
            jSONObject.put("violDistId", Integer.parseInt(str2));
            jSONObject.put("violGaddr", (Object) str18);
            jSONObject.put("violLatitude", (Object) str19);
            jSONObject.put("violLocation", (Object) str20);
            jSONObject.put("violLongitude", (Object) str21);
            jSONObject.put("violOffenceId", i10);
            jSONObject.put("violRegnNo", (Object) str22);
            jSONObject.put("violRemarks", (Object) str23);
            jSONObject.put("violStateCd", (Object) str24);
            jSONObject.put("violUpdatedBy", (Object) str25);
            jSONObject.put("violVhclVrfd", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenViolation", (Object) jSONObject);
            jSONObject2.put("did", (Object) str26);
            jSONObject2.put("mid", (Object) str15);
            jSONObject2.put("tid", (Object) str27);
            if (str11.length() > 0 || str13.length() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (str11.length() > 0) {
                    jSONObject3.put("evidenceType", (Object) "IMG");
                    jSONObject3.put("evidenceName", (Object) str12);
                    jSONObject3.put("evidenceVal", (Object) str11);
                    jSONArray.put((Object) jSONObject3);
                }
                JSONObject jSONObject4 = new JSONObject();
                if (str13.length() > 0) {
                    jSONObject4.put("evidenceType", (Object) "VID");
                    jSONObject4.put("evidenceName", (Object) "video79.mp4");
                    jSONObject4.put("evidenceVal", (Object) str13);
                    jSONArray.put((Object) jSONObject4);
                }
                jSONObject2.put("evidences", (Object) jSONArray);
            }
            return jSONObject2;
        }

        public final JSONObject j(String str) {
            l.f(str, "status");
            return new JSONObject();
        }

        public final JSONObject k(String str) {
            l.f(str, "feedbackViolationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violRecordId", (Object) str);
            return jSONObject;
        }

        public final JSONObject l(String str, long j10, String str2, String str3, String str4) {
            l.f(str, "vehicleNo");
            l.f(str2, "mid");
            l.f(str3, "did");
            l.f(str4, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcNumber", (Object) str);
            jSONObject.put("recordId", j10);
            jSONObject.put("did", (Object) str3);
            jSONObject.put("mid", (Object) str2);
            jSONObject.put("tid", (Object) str4);
            return jSONObject;
        }

        public final JSONObject m(String str) {
            l.f(str, "violationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("violRecordId", (Object) str);
            return jSONObject;
        }

        public final JSONObject n(String str, String str2) {
            l.f(str, "feedbackRemarks");
            l.f(str2, "feedbackAccidentId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackRemarks", (Object) str);
            jSONObject.put("feedbackAccidentId", Integer.parseInt(str2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparAccidentFeedback", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z10, String str15, String str16, String str17) {
            String str18 = str3;
            String str19 = str4;
            String str20 = str5;
            String str21 = str6;
            String str22 = str7;
            String str23 = str8;
            String str24 = str9;
            String str25 = str10;
            String str26 = str11;
            String str27 = str12;
            String str28 = str13;
            String str29 = str16;
            l.f(str, "userId");
            l.f(str2, "disticId");
            l.f(str18, "location");
            l.f(str19, "locLat");
            l.f(str20, "loc");
            l.f(str21, "locLong");
            l.f(str22, "regNo");
            l.f(str23, "remarks");
            l.f(str24, "stateCode");
            l.f(str25, "updatedByName");
            l.f(str26, "uploadedImgValue");
            l.f(str27, "imageFileName");
            l.f(str28, "uploadedVideoFilePath");
            l.f(str14, "videoFileName");
            l.f(str15, "mid");
            l.f(str29, "did");
            l.f(str17, "tid");
            String str30 = "tid";
            JSONObject jSONObject = new JSONObject();
            String str31 = "mid";
            String str32 = "did";
            jSONObject.put("accdCitizenId", Long.parseLong(str));
            jSONObject.put("accdDistId", Integer.parseInt(str2));
            jSONObject.put("accdGaddr", (Object) str18);
            jSONObject.put("accdLatitude", (Object) str19);
            jSONObject.put("accdLocation", (Object) str20);
            jSONObject.put("accdLongitude", (Object) str21);
            jSONObject.put("accdRegnNo", (Object) str22);
            jSONObject.put("accdRemarks", (Object) str23);
            jSONObject.put("accdStateCd", (Object) str24);
            jSONObject.put("accdUpdatedBy", (Object) str25);
            jSONObject.put("accdVhclVrfd", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenAccident", (Object) jSONObject);
            if (str11.length() > 0 || str13.length() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (str11.length() > 0) {
                    jSONObject3.put("evidenceType", (Object) "IMG");
                    jSONObject3.put("evidenceName", (Object) str27);
                    jSONObject3.put("evidenceVal", (Object) str26);
                    jSONArray.put((Object) jSONObject3);
                }
                JSONObject jSONObject4 = new JSONObject();
                if (str13.length() > 0) {
                    jSONObject4.put("evidenceType", (Object) "VID");
                    jSONObject4.put("evidenceName", (Object) "video79.mp4");
                    jSONObject4.put("evidenceVal", (Object) str28);
                    jSONArray.put((Object) jSONObject4);
                }
                jSONObject2.put("evidences", (Object) jSONArray);
                jSONObject2.put(str32, (Object) str29);
                jSONObject2.put(str31, (Object) str15);
                jSONObject2.put(str30, (Object) str17);
            }
            return jSONObject2;
        }

        public final JSONObject p(String str, String str2) {
            l.f(str, "feedbackRemarks");
            l.f(str2, "feedbackViolationId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackRemarks", (Object) str);
            jSONObject.put("feedbackViolationId", Integer.parseInt(str2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparViolationFeedback", (Object) jSONObject);
            return jSONObject2;
        }
    }
}
