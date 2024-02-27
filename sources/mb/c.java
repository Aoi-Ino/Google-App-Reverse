package mb;

import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13994a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(int i10, boolean z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vahlogRecordId", i10);
            jSONObject.put("vahlogStatus", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vahanLog", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("langActive", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mParLanguage", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject c(String str) {
            l.f(str, "langCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("langVersion", (Object) "1.0");
            jSONObject.put("langCode", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mParLanguage", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject d(int i10, boolean z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vahlogCtzId", i10);
            jSONObject.put("vahlogStatus", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vahanLog", (Object) jSONObject);
            return jSONObject2;
        }
    }
}
