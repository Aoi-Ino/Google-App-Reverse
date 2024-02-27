package w6;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.m;
import g7.i;
import h6.e;
import j6.a;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import k6.c;
import k6.d;
import k6.d0;
import k6.q;
import org.json.JSONArray;
import org.json.JSONObject;
import p4.l;
import w6.j;
import y6.b;

public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final b f17916a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f17917b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17918c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f17919d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f17920e;

    private f(Context context, String str, Set set, b bVar, Executor executor) {
        this((b) new e(context, str), set, executor, bVar, context);
    }

    public static c g() {
        d0 a10 = d0.a(a.class, Executor.class);
        return c.d(f.class, i.class, j.class).b(q.i(Context.class)).b(q.i(e.class)).b(q.l(g.class)).b(q.k(i.class)).b(q.j(a10)).e(new b(a10)).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f h(d0 d0Var, d dVar) {
        return new f((Context) dVar.a(Context.class), ((e) dVar.a(e.class)).n(), dVar.c(g.class), dVar.d(i.class), (Executor) dVar.b(d0Var));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String i() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                k kVar = (k) this.f17916a.get();
                List c10 = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    l lVar = (l) c10.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", (Object) lVar.c());
                    jSONObject.put("dates", (Object) new JSONArray((Collection) lVar.b()));
                    jSONArray.put((Object) jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", (Object) jSONArray);
                jSONObject2.put("version", (Object) "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
        throw th;
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((k) this.f17916a.get()).k(System.currentTimeMillis(), ((i) this.f17918c.get()).a());
        }
        return null;
    }

    public p4.i a() {
        return m.a(this.f17917b) ^ true ? l.e("") : l.c(this.f17920e, new c(this));
    }

    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = (k) this.f17916a.get();
        if (kVar.i(currentTimeMillis)) {
            kVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public p4.i l() {
        if (this.f17919d.size() <= 0) {
            return l.e((Object) null);
        }
        return m.a(this.f17917b) ^ true ? l.e((Object) null) : l.c(this.f17920e, new d(this));
    }

    f(b bVar, Set set, Executor executor, b bVar2, Context context) {
        this.f17916a = bVar;
        this.f17919d = set;
        this.f17920e = executor;
        this.f17918c = bVar2;
        this.f17917b = context;
    }
}
