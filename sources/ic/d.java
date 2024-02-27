package ic;

import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12668a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(int i10, String str) {
            l.f(str, "soscParam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("soscCtzId", i10);
            jSONObject.put("soscParam", (Object) str);
            return jSONObject;
        }
    }
}
