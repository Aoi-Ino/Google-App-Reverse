package en;

import cm.g;
import dn.b;
import dn.j;
import en.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class h implements m {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final l.a f23061f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f23062g;

    /* renamed from: a  reason: collision with root package name */
    private final Method f23063a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f23064b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f23065c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f23066d;

    /* renamed from: e  reason: collision with root package name */
    private final Class f23067e;

    public static final class a {

        /* renamed from: en.h$a$a  reason: collision with other inner class name */
        public static final class C0289a implements l.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f23068a;

            C0289a(String str) {
                this.f23068a = str;
            }

            public boolean a(SSLSocket sSLSocket) {
                cm.l.f(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                cm.l.e(name, "sslSocket.javaClass.name");
                return p.A(name, this.f23068a + '.', false, 2, (Object) null);
            }

            public m b(SSLSocket sSLSocket) {
                cm.l.f(sSLSocket, "sslSocket");
                return h.f23062g.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final h b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && (!cm.l.a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            cm.l.c(cls2);
            return new h(cls2);
        }

        public final l.a c(String str) {
            cm.l.f(str, "packageName");
            return new C0289a(str);
        }

        public final l.a d() {
            return h.f23061f;
        }
    }

    static {
        a aVar = new a((g) null);
        f23062g = aVar;
        f23061f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class cls) {
        cm.l.f(cls, "sslSocketClass");
        this.f23067e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        cm.l.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f23063a = declaredMethod;
        this.f23064b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f23065c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f23066d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public boolean a(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        return this.f23067e.isInstance(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f23065c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            cm.l.e(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e10) {
            if (cm.l.a(e10.getMessage(), "ssl == null")) {
                return null;
            }
            throw e10;
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }

    public boolean c() {
        return b.f22913g.b();
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        cm.l.f(sSLSocket, "sslSocket");
        cm.l.f(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f23063a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f23064b.invoke(sSLSocket, new Object[]{str});
                }
                this.f23066d.invoke(sSLSocket, new Object[]{j.f22941c.c(list)});
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
