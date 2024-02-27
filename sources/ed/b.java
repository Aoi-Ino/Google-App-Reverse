package ed;

import android.util.Log;
import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11171a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2) {
            l.f(str, "app_no");
            l.f(str2, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNumber", (Object) str);
            jSONObject.put("applDob", (Object) str2);
            return jSONObject;
        }

        public final JSONObject b(String str, String str2) {
            l.f(str, "app_no");
            l.f(str2, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", (Object) str);
            jSONObject.put("dateOfBirth", (Object) str2);
            return jSONObject;
        }

        public final JSONObject c(String str, String str2) {
            l.f(str, "appNo");
            l.f(str2, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", (Object) str);
            jSONObject.put("dob", (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sarathiReq", (Object) jSONObject);
            Log.d("Slot_Pdf", jSONObject2.toString());
            return jSONObject2;
        }
    }
}
