package en;

import cm.g;
import cm.l;
import dn.j;

public final class n extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final a f23079j = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private final Class f23080h;

    /* renamed from: i  reason: collision with root package name */
    private final Class f23081i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ m b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String str) {
            l.f(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                l.e(cls3, "paramsClass");
                return new n(cls, cls2, cls3);
            } catch (Exception e10) {
                j.f22941c.g().j("unable to load android socket classes", 5, e10);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Class cls, Class cls2, Class cls3) {
        super(cls);
        l.f(cls, "sslSocketClass");
        l.f(cls2, "sslSocketFactoryClass");
        l.f(cls3, "paramClass");
        this.f23080h = cls2;
        this.f23081i = cls3;
    }
}
