package mk;

import android.util.Log;
import cm.g;
import org.json.JSONObject;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25111a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(int i10, boolean z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sarlogRecordId", i10);
            jSONObject.put("sarlogStatus", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sarathiLog", (Object) jSONObject);
            Log.d("dltSarLogReq", jSONObject2.toString());
            return jSONObject2;
        }

        public final JSONObject b(int i10, boolean z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sarlogCtzId", i10);
            jSONObject.put("sarlogStatus", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sarathiLog", (Object) jSONObject);
            Log.d("fetchSarthiReq", jSONObject2.toString());
            return jSONObject2;
        }
    }
}
