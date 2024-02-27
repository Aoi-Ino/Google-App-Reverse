package lb;

import cm.g;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13460a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(long j10, boolean z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("echlogRecordId", j10);
            jSONObject.put("echlogStatus", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("Echallan", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject b(long j10, boolean z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("echlogCtzId", j10);
            jSONObject.put("echlogStatus", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("Echallan", (Object) jSONObject);
            return jSONObject2;
        }
    }
}
