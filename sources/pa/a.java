package pa;

import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0200a f14907a = new C0200a((g) null);

    /* renamed from: pa.a$a  reason: collision with other inner class name */
    public static final class C0200a {
        private C0200a() {
        }

        public /* synthetic */ C0200a(g gVar) {
            this();
        }

        public final JSONObject a(String str) {
            l.f(str, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", (Object) "S4");
            jSONObject.put("servStateCd", (Object) str);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject b(String str) {
            l.f(str, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", (Object) "E4");
            jSONObject.put("servStateCd", (Object) str);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject c(String str) {
            l.f(str, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", (Object) "N4");
            jSONObject.put("servStateCd", (Object) str);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject d(String str) {
            l.f(str, "servStateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("servModule", (Object) "V4");
            jSONObject.put("servStateCd", (Object) str);
            jSONObject.put("servStatus", 1);
            jSONObject.put("servAndroid", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparEnabledService", (Object) jSONObject);
            return jSONObject2;
        }
    }
}
