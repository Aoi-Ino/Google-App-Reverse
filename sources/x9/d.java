package x9;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import um.c0;
import um.x;

public final class d extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f18244d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f18245e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f18246f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f18247g = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f18248a;

        a(d dVar) {
            this.f18248a = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18248a.i().k("error");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r3, retrofit2.Response r4) {
            /*
                r2 = this;
                x9.d r3 = r2.f18248a     // Catch:{ Exception -> 0x0027 }
                androidx.lifecycle.a0 r3 = r3.j()     // Catch:{ Exception -> 0x0027 }
                r0 = 0
                if (r4 == 0) goto L_0x0010
                java.lang.Object r1 = r4.body()     // Catch:{ Exception -> 0x0027 }
                com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo r1 = (com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo) r1     // Catch:{ Exception -> 0x0027 }
                goto L_0x0011
            L_0x0010:
                r1 = r0
            L_0x0011:
                r3.k(r1)     // Catch:{ Exception -> 0x0027 }
                java.lang.String r3 = "dl_response"
                if (r4 == 0) goto L_0x001f
                java.lang.Object r4 = r4.body()     // Catch:{ Exception -> 0x0027 }
                r0 = r4
                com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo r0 = (com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo) r0     // Catch:{ Exception -> 0x0027 }
            L_0x001f:
                java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0027 }
                android.util.Log.v(r3, r4)     // Catch:{ Exception -> 0x0027 }
                goto L_0x0032
            L_0x0027:
                x9.d r3 = r2.f18248a
                androidx.lifecycle.a0 r3 = r3.i()
                java.lang.String r4 = "error"
                r3.k(r4)
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x9.d.a.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f18249a;

        b(d dVar) {
            this.f18249a = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18249a.i().k("error");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r3, retrofit2.Response r4) {
            /*
                r2 = this;
                x9.d r3 = r2.f18249a     // Catch:{ Exception -> 0x0027 }
                androidx.lifecycle.a0 r3 = r3.k()     // Catch:{ Exception -> 0x0027 }
                r0 = 0
                if (r4 == 0) goto L_0x0010
                java.lang.Object r1 = r4.body()     // Catch:{ Exception -> 0x0027 }
                com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo r1 = (com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo) r1     // Catch:{ Exception -> 0x0027 }
                goto L_0x0011
            L_0x0010:
                r1 = r0
            L_0x0011:
                r3.k(r1)     // Catch:{ Exception -> 0x0027 }
                java.lang.String r3 = "dl_response"
                if (r4 == 0) goto L_0x001f
                java.lang.Object r4 = r4.body()     // Catch:{ Exception -> 0x0027 }
                r0 = r4
                com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo r0 = (com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo) r0     // Catch:{ Exception -> 0x0027 }
            L_0x001f:
                java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0027 }
                android.util.Log.v(r3, r4)     // Catch:{ Exception -> 0x0027 }
                goto L_0x0032
            L_0x0027:
                x9.d r3 = r2.f18249a
                androidx.lifecycle.a0 r3 = r3.i()
                java.lang.String r4 = "error"
                r3.k(r4)
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x9.d.b.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public d(b bVar) {
        l.f(bVar, "repository");
        this.f18244d = bVar;
    }

    public final void g(String str, String str2) {
        l.f(str, "apl");
        l.f(str2, "db");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = new JSONObject().toString();
        l.e(jSONObject, "toString(...)");
        this.f18244d.a(aVar.f(b10, jSONObject), str, str2).enqueue(new a(this));
    }

    public final void h(String str, String str2) {
        l.f(str, "apl");
        l.f(str2, "db");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = new JSONObject().toString();
        l.e(jSONObject, "toString(...)");
        this.f18244d.b(aVar.f(b10, jSONObject), str, str2).enqueue(new b(this));
    }

    public final a0 i() {
        return this.f18247g;
    }

    public final a0 j() {
        return this.f18246f;
    }

    public final a0 k() {
        return this.f18245e;
    }
}
