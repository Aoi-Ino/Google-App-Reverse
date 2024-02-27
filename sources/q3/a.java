package q3;

import android.content.Context;
import android.os.Looper;
import java.util.Set;
import q3.e;
import r3.h;
import s3.c;
import s3.j;
import s3.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C0202a f14936a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14937b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14938c;

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    public static abstract class C0202a extends e {
        public f a(Context context, Looper looper, s3.e eVar, Object obj, e.a aVar, e.b bVar) {
            return b(context, looper, eVar, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, s3.e eVar, Object obj, r3.c cVar, h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final C0203a f14939a = new C0203a((h) null);

        /* renamed from: q3.a$d$a  reason: collision with other inner class name */
        public static final class C0203a implements d {
            /* synthetic */ C0203a(h hVar) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends b {
        boolean a();

        Set b();

        void c(c.C0213c cVar);

        void d(String str);

        boolean e();

        int f();

        boolean g();

        p3.c[] h();

        String i();

        void j(j jVar, Set set);

        String k();

        void l();

        void m(c.e eVar);

        boolean n();
    }

    public static final class g extends c {
    }

    public a(String str, C0202a aVar, g gVar) {
        o.j(aVar, "Cannot construct an Api with a null ClientBuilder");
        o.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f14938c = str;
        this.f14936a = aVar;
        this.f14937b = gVar;
    }

    public final C0202a a() {
        return this.f14936a;
    }

    public final String b() {
        return this.f14938c;
    }
}
