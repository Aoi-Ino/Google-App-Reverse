package qm;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f30828a = new l();

    private l() {
    }

    private final Object a(String str, ClassLoader classLoader, Class cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final List b(Class cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return y.t0(ServiceLoader.load(cls, classLoader));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        zl.b.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        pl.b.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0077, code lost:
        zl.b.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List e(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = km.p.A(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005c
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = km.q.u0(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = km.q.z0(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = km.q.u0(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0048 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0048 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0048 }
            r6.<init>(r2)     // Catch:{ all -> 0x0048 }
            qm.l r0 = f30828a     // Catch:{ all -> 0x004a }
            java.util.List r0 = r0.f(r6)     // Catch:{ all -> 0x004a }
            zl.b.a(r6, r4)     // Catch:{ all -> 0x0048 }
            r1.close()
            return r0
        L_0x0048:
            r6 = move-exception
            goto L_0x0051
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2 = move-exception
            zl.b.a(r6, r0)     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0051:
            throw r6     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0057 }
            throw r0
        L_0x0057:
            r0 = move-exception
            pl.b.a(r6, r0)
            throw r6
        L_0x005c:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            qm.l r6 = f30828a     // Catch:{ all -> 0x0074 }
            java.util.List r6 = r6.f(r0)     // Catch:{ all -> 0x0074 }
            zl.b.a(r0, r4)
            return r6
        L_0x0074:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            zl.b.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.l.e(java.net.URL):java.util.List");
    }

    private final List f(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return y.t0(linkedHashSet);
            }
            String obj = q.B0(q.A0(readLine, "#", (String) null, 2, (Object) null)).toString();
            int i10 = 0;
            while (i10 < obj.length()) {
                char charAt = obj.charAt(i10);
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final List c() {
        v vVar;
        Class<v> cls = v.class;
        if (!m.a()) {
            return b(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            v vVar2 = null;
            try {
                vVar = cls.cast(Class.forName("mm.a", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                vVar = null;
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
            try {
                vVar2 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (vVar2 == null) {
                return arrayList;
            }
            arrayList.add(vVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(cls, cls.getClassLoader());
        }
    }

    public final List d(Class cls, ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        cm.l.e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (T e10 : list) {
            boolean unused = v.v(arrayList, f30828a.e(e10));
        }
        Set<String> x02 = y.x0(arrayList);
        if (!x02.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(r.s(x02, 10));
            for (String a10 : x02) {
                arrayList2.add(f30828a.a(a10, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
