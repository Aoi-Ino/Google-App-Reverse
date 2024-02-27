package dn;

import cm.g;
import cm.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class e extends j {

    /* renamed from: i  reason: collision with root package name */
    public static final b f22925i = new b((g) null);

    /* renamed from: d  reason: collision with root package name */
    private final Method f22926d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f22927e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f22928f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f22929g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f22930h;

    private static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f22931a;

        /* renamed from: b  reason: collision with root package name */
        private String f22932b;

        /* renamed from: c  reason: collision with root package name */
        private final List f22933c;

        public a(List list) {
            l.f(list, "protocols");
            this.f22933c = list;
        }

        public final String a() {
            return this.f22932b;
        }

        public final boolean b() {
            return this.f22931a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            l.f(obj, "proxy");
            l.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (l.a(name, "supports") && l.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (l.a(name, "unsupported") && l.a(Void.TYPE, returnType)) {
                this.f22931a = true;
                return null;
            } else if (l.a(name, "protocols") && objArr.length == 0) {
                return this.f22933c;
            } else {
                if ((l.a(name, "selectProtocol") || l.a(name, "select")) && l.a(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i10 = 0;
                                while (true) {
                                    Object obj3 = list.get(i10);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (!this.f22933c.contains(str)) {
                                            if (i10 == size) {
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            this.f22932b = str;
                                            return str;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = (String) this.f22933c.get(0);
                            this.f22932b = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!l.a(name, "protocolSelected") && !l.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f22932b = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final j a() {
            Class<SSLSocket> cls = SSLSocket.class;
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                l.e(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls2.getMethod("put", new Class[]{cls, cls3});
                Method method2 = cls2.getMethod("get", new Class[]{cls});
                Method method3 = cls2.getMethod("remove", new Class[]{cls});
                l.e(method, "putMethod");
                l.e(method2, "getMethod");
                l.e(method3, "removeMethod");
                l.e(cls4, "clientProviderClass");
                l.e(cls5, "serverProviderClass");
                return new e(method, method2, method3, cls4, cls5);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class cls, Class cls2) {
        l.f(method, "putMethod");
        l.f(method2, "getMethod");
        l.f(method3, "removeMethod");
        l.f(cls, "clientProviderClass");
        l.f(cls2, "serverProviderClass");
        this.f22926d = method;
        this.f22927e = method2;
        this.f22928f = method3;
        this.f22929g = cls;
        this.f22930h = cls2;
    }

    public void b(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        try {
            this.f22928f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        List b10 = j.f22941c.b(list);
        try {
            this.f22926d.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f22929g, this.f22930h}, new a(b10))});
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    public String g(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f22927e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    j.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
