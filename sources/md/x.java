package md;

import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14046a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(long j10, long j11, String str, String str2, String str3) {
            l.f(str, "mobile");
            l.f(str2, "name");
            l.f(str3, "sosrelation");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscRecordId", j10);
            jSONObject.put("soscCtzId", j11);
            jSONObject.put("soscMobile", (Object) str);
            jSONObject.put("soscName", (Object) str2);
            jSONObject.put("soscRelation", (Object) str3);
            jSONObject.put("soscStatus", (Object) "1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparSosContact", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "1");
            return jSONObject;
        }

        public final JSONObject c(long j10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscCtzId", j10);
            return jSONObject;
        }

        public final JSONObject d(long j10, String str, String str2, String str3) {
            l.f(str, "mobile");
            l.f(str2, "name");
            l.f(str3, "sosrelation");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscCtzId", j10);
            jSONObject.put("soscMobile", (Object) str);
            jSONObject.put("soscName", (Object) str2);
            jSONObject.put("soscRelation", (Object) str3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparSosContact", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject e(String str) {
            l.f(str, "citizenId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscRecordId", Long.parseLong(str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparSosContact", (Object) jSONObject);
            return jSONObject2;
        }
    }
}
