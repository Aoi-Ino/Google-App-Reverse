package ki;

import android.util.Log;
import cm.g;
import cm.l;
import com.nic.mparivahan.Welcome.Model.Version;
import com.nic.mparivahan.Welcome.Model.VersionX;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0316a f24678a = new C0316a((g) null);

    /* renamed from: ki.a$a  reason: collision with other inner class name */
    public static final class C0316a {
        private C0316a() {
        }

        public /* synthetic */ C0316a(g gVar) {
            this();
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionOs", (Object) "Android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", (Object) jSONObject);
            Log.d("version", jSONObject2.toString());
            return jSONObject2;
        }

        public final Version b(String str) {
            l.f(str, "response");
            JSONObject jSONObject = new JSONObject(str.toString());
            if (jSONObject.isNull("statusCode") || jSONObject.isNull("version")) {
                return new Version("400", "", (VersionX) null);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("version");
            String string = jSONObject.getString("statusCode");
            l.e(string, "getString(...)");
            String string2 = jSONObject.getString("statusDesc");
            l.e(string2, "getString(...)");
            int i10 = jSONObject2.getInt("versionNo");
            String string3 = jSONObject2.getString("versionOs");
            l.e(string3, "getString(...)");
            String string4 = jSONObject2.getString("versionDesc");
            l.e(string4, "getString(...)");
            String string5 = jSONObject2.getString("versionUpdatedBy");
            l.e(string5, "getString(...)");
            return new Version(string, string2, new VersionX(string4, jSONObject2.getBoolean("versionMandate"), i10, string3, string5));
        }
    }
}
