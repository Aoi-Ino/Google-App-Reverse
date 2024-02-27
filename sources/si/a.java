package si;

import android.content.Context;
import cm.g;
import cm.l;
import hn.a;
import id.b;
import java.util.concurrent.TimeUnit;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import um.z;
import v9.d;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0349a f31253a = new C0349a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private static hn.a f31254b = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);

    /* renamed from: c  reason: collision with root package name */
    private static z f31255c;

    /* renamed from: d  reason: collision with root package name */
    private static z f31256d = c.a();

    /* renamed from: si.a$a  reason: collision with other inner class name */
    public static final class C0349a {
        private C0349a() {
        }

        public /* synthetic */ C0349a(g gVar) {
            this();
        }

        public final Retrofit a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Retrofit build = new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build();
            l.e(build, "build(...)");
            return build;
        }
    }

    static {
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f31255c = aVar.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit).a(f31254b).c();
    }
}
