package nc;

import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0190a f14255a = new C0190a((g) null);

    /* renamed from: nc.a$a  reason: collision with other inner class name */
    public static final class C0190a {
        private C0190a() {
        }

        public /* synthetic */ C0190a(g gVar) {
            this();
        }

        public final JSONObject a() {
            return new JSONObject();
        }

        public final JSONObject b(long j10, String str, String str2, String str3) {
            l.f(str, "did");
            l.f(str2, "mdid");
            l.f(str3, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpCtzId", j10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenProfile", (Object) jSONObject);
            jSONObject2.put("did", (Object) str);
            jSONObject2.put("mid", (Object) str2);
            jSONObject2.put("tid", (Object) str3);
            return jSONObject2;
        }

        public final JSONObject c(long j10, String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, String str8) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            l.f(str9, "ctzmobile");
            l.f(str10, "ctzDispName");
            l.f(str11, "ctzEmail");
            l.f(str12, "ctzStateCd");
            l.f(str13, "did");
            l.f(str14, "mdid");
            l.f(str15, "tid");
            l.f(str16, "mpin");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", j10);
            jSONObject.put("ctzMobile", (Object) str9);
            jSONObject.put("ctzDispName", (Object) str10);
            jSONObject.put("ctzEmail", (Object) str11);
            jSONObject.put("ctzMpinStatus", z10);
            jSONObject.put("ctzStateCd", (Object) str12);
            jSONObject.put("ctzMpin", (Object) str16);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", (Object) jSONObject);
            jSONObject2.put("did", (Object) str13);
            jSONObject2.put("mid", (Object) str14);
            jSONObject2.put("sid", (Object) str15);
            return jSONObject2;
        }

        public final JSONObject d(long j10, String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, String str8) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str8;
            l.f(str9, "ctzmobile");
            l.f(str10, "ctzDispName");
            l.f(str11, "ctzEmail");
            l.f(str12, "ctzStateCd");
            l.f(str13, "did");
            l.f(str6, "mdid");
            l.f(str7, "tid");
            l.f(str14, "mpin");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", j10);
            jSONObject.put("ctzMobile", (Object) str9);
            jSONObject.put("ctzDispName", (Object) str10);
            jSONObject.put("ctzEmail", (Object) str11);
            jSONObject.put("ctzMpinStatus", z10);
            jSONObject.put("ctzStateCd", (Object) str12);
            jSONObject.put("ctzMpin", (Object) str14);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", (Object) jSONObject);
            jSONObject2.put("did", (Object) str13);
            jSONObject2.put("mid", (Object) str6);
            jSONObject2.put("tid", (Object) str7);
            return jSONObject2;
        }
    }
}
