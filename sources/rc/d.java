package rc;

import cm.g;
import org.json.JSONObject;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15636a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(long j10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pshnotCtzId", j10);
            jSONObject.put("pshnotStatus", 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pushNotification", (Object) jSONObject);
            return jSONObject2;
        }
    }
}
