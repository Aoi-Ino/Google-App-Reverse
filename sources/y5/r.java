package y5;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o0;
import f6.a0;
import f6.c0;
import f6.y;
import f6.z;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import y5.p;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f18525a = Logger.getLogger(r.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap f18526b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap f18527c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap f18528d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap f18529e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentMap f18530f = new ConcurrentHashMap();

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18531a;

        a(h hVar) {
            this.f18531a = hVar;
        }

        public e a(Class cls) {
            try {
                return new f(this.f18531a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        public e b() {
            h hVar = this.f18531a;
            return new f(hVar, hVar.a());
        }

        public Class c() {
            return this.f18531a.getClass();
        }

        public Set d() {
            return this.f18531a.h();
        }
    }

    class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18532a;

        b(h hVar) {
            this.f18532a = hVar;
        }
    }

    private interface c {
    }

    private interface d {
        e a(Class cls);

        e b();

        Class c();

        Set d();
    }

    private static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    private static d b(h hVar) {
        return new a(hVar);
    }

    private static c c(h hVar) {
        return new b(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void d(java.lang.String r5, java.lang.Class r6, boolean r7) {
        /*
            java.lang.Class<y5.r> r0 = y5.r.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap r1 = f18526b     // Catch:{ all -> 0x0045 }
            boolean r2 = r1.containsKey(r5)     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            y5.r$d r1 = (y5.r.d) r1     // Catch:{ all -> 0x0045 }
            java.lang.Class r2 = r1.c()     // Catch:{ all -> 0x0045 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0049
            if (r7 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentMap r6 = f18528d     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0045 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r6 == 0) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0045 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r7.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch:{ all -> 0x0045 }
            r7.append(r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0045 }
            r6.<init>(r5)     // Catch:{ all -> 0x0045 }
            throw r6     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            goto L_0x0083
        L_0x0047:
            monitor-exit(r0)
            return
        L_0x0049:
            java.util.logging.Logger r7 = f18525a     // Catch:{ all -> 0x0045 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r2.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch:{ all -> 0x0045 }
            r2.append(r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0045 }
            r7.warning(r2)     // Catch:{ all -> 0x0045 }
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0045 }
            r4 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0045 }
            java.lang.Class r5 = r1.c()     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0045 }
            r1 = 1
            r3[r1] = r5     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = r6.getName()     // Catch:{ all -> 0x0045 }
            r6 = 2
            r3[r6] = r5     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0045 }
            r7.<init>(r5)     // Catch:{ all -> 0x0045 }
            throw r7     // Catch:{ all -> 0x0045 }
        L_0x0083:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.r.d(java.lang.String, java.lang.Class, boolean):void");
    }

    public static Class e(Class cls) {
        q qVar = (q) f18530f.get(cls);
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    private static synchronized d f(String str) {
        d dVar;
        synchronized (r.class) {
            ConcurrentMap concurrentMap = f18526b;
            if (concurrentMap.containsKey(str)) {
                dVar = (d) concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return dVar;
    }

    private static e g(String str, Class cls) {
        d f10 = f(str);
        if (cls == null) {
            return f10.b();
        }
        if (f10.d().contains(cls)) {
            return f10.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f10.c() + ", supported primitives: " + s(f10.d()));
    }

    public static Object h(String str, h hVar, Class cls) {
        return j(str, hVar, (Class) a(cls));
    }

    public static Object i(String str, byte[] bArr, Class cls) {
        return h(str, h.s(bArr), cls);
    }

    private static Object j(String str, h hVar, Class cls) {
        return g(str, cls).b(hVar);
    }

    public static p k(i iVar, Class cls) {
        return l(iVar, (e) null, cls);
    }

    public static p l(i iVar, e eVar, Class cls) {
        return m(iVar, eVar, (Class) a(cls));
    }

    private static p m(i iVar, e eVar, Class cls) {
        s.d(iVar.f());
        p f10 = p.f(cls);
        for (c0.c cVar : iVar.f().S()) {
            if (cVar.T() == z.ENABLED) {
                p.b a10 = f10.a((eVar == null || !eVar.a(cVar.Q().R())) ? j(cVar.Q().R(), cVar.Q().S(), cls) : eVar.b(cVar.Q().S()), cVar);
                if (cVar.R() == iVar.f().T()) {
                    f10.g(a10);
                }
            }
        }
        return f10;
    }

    public static e n(String str) {
        return f(str).b();
    }

    public static synchronized o0 o(a0 a0Var) {
        o0 c10;
        synchronized (r.class) {
            e n10 = n(a0Var.R());
            if (((Boolean) f18528d.get(a0Var.R())).booleanValue()) {
                c10 = n10.c(a0Var.S());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.R());
            }
        }
        return c10;
    }

    public static synchronized y p(a0 a0Var) {
        y d10;
        synchronized (r.class) {
            e n10 = n(a0Var.R());
            if (((Boolean) f18528d.get(a0Var.R())).booleanValue()) {
                d10 = n10.d(a0Var.S());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.R());
            }
        }
        return d10;
    }

    public static synchronized void q(h hVar, boolean z10) {
        synchronized (r.class) {
            if (hVar != null) {
                try {
                    String c10 = hVar.c();
                    d(c10, hVar.getClass(), z10);
                    ConcurrentMap concurrentMap = f18526b;
                    if (!concurrentMap.containsKey(c10)) {
                        concurrentMap.put(c10, b(hVar));
                        f18527c.put(c10, c(hVar));
                    }
                    f18528d.put(c10, Boolean.valueOf(z10));
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized void r(q qVar) {
        synchronized (r.class) {
            if (qVar != null) {
                try {
                    Class c10 = qVar.c();
                    ConcurrentMap concurrentMap = f18530f;
                    if (concurrentMap.containsKey(c10)) {
                        q qVar2 = (q) concurrentMap.get(c10);
                        if (!qVar.getClass().equals(qVar2.getClass())) {
                            Logger logger = f18525a;
                            logger.warning("Attempted overwrite of a registered SetWrapper for type " + c10);
                            throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{c10.getName(), qVar2.getClass().getName(), qVar.getClass().getName()}));
                        }
                    }
                    concurrentMap.put(c10, qVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static String s(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z10 = false;
        }
        return sb2.toString();
    }

    public static Object t(p pVar, Class cls) {
        q qVar = (q) f18530f.get(cls);
        if (qVar == null) {
            throw new GeneralSecurityException("No wrapper found for " + pVar.d().getName());
        } else if (qVar.a().equals(pVar.d())) {
            return qVar.b(pVar);
        } else {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + qVar.a() + ", got " + pVar.d());
        }
    }
}
