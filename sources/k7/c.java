package k7;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f13025a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13026b;

    /* renamed from: c  reason: collision with root package name */
    private final List f13027c;

    class a implements i {
        a() {
        }

        public Object a() {
            return new TreeSet();
        }
    }

    class b implements i {
        b() {
        }

        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: k7.c$c  reason: collision with other inner class name */
    class C0172c implements i {
        C0172c() {
        }

        public Object a() {
            return new ArrayDeque();
        }
    }

    class d implements i {
        d() {
        }

        public Object a() {
            return new ArrayList();
        }
    }

    class e implements i {
        e() {
        }

        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    class f implements i {
        f() {
        }

        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    class g implements i {
        g() {
        }

        public Object a() {
            return new TreeMap();
        }
    }

    class h implements i {
        h() {
        }

        public Object a() {
            return new LinkedHashMap();
        }
    }

    class i implements i {
        i() {
        }

        public Object a() {
            return new h();
        }
    }

    class j implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f13028a;

        j(Class cls) {
            this.f13028a = cls;
        }

        public Object a() {
            try {
                return n.f13089a.d(this.f13028a);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f13028a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    class k implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13030a;

        k(String str) {
            this.f13030a = str;
        }

        public Object a() {
            throw new i7.h(this.f13030a);
        }
    }

    class l implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13032a;

        l(String str) {
            this.f13032a = str;
        }

        public Object a() {
            throw new i7.h(this.f13032a);
        }
    }

    class m implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13034a;

        m(String str) {
            this.f13034a = str;
        }

        public Object a() {
            throw new i7.h(this.f13034a);
        }
    }

    class n implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f13036a;

        n(Type type) {
            this.f13036a = type;
        }

        public Object a() {
            Type type = this.f13036a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new i7.h("Invalid EnumSet type: " + this.f13036a.toString());
            }
            throw new i7.h("Invalid EnumSet type: " + this.f13036a.toString());
        }
    }

    class o implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f13037a;

        o(Type type) {
            this.f13037a = type;
        }

        public Object a() {
            Type type = this.f13037a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new i7.h("Invalid EnumMap type: " + this.f13037a.toString());
            }
            throw new i7.h("Invalid EnumMap type: " + this.f13037a.toString());
        }
    }

    class p implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13038a;

        p(String str) {
            this.f13038a = str;
        }

        public Object a() {
            throw new i7.h(this.f13038a);
        }
    }

    class q implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13039a;

        q(String str) {
            this.f13039a = str;
        }

        public Object a() {
            throw new i7.h(this.f13039a);
        }
    }

    class r implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f13040a;

        r(Constructor constructor) {
            this.f13040a = constructor;
        }

        public Object a() {
            try {
                return this.f13040a.newInstance(new Object[0]);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + n7.a.c(this.f13040a) + "' with no args", e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + n7.a.c(this.f13040a) + "' with no args", e11.getCause());
            } catch (IllegalAccessException e12) {
                throw n7.a.e(e12);
            }
        }
    }

    public c(Map map, boolean z10, List list) {
        this.f13025a = map;
        this.f13026b = z10;
        this.f13027c = list;
    }

    static String a(Class cls) {
        StringBuilder sb2;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            sb2 = new StringBuilder();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            sb2 = new StringBuilder();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        sb2.append(str);
        sb2.append(cls.getName());
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r3 = n7.a.l(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static k7.i c(java.lang.Class r3, i7.o r4) {
        /*
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x005c }
            java.lang.reflect.Constructor r0 = r3.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x005c }
            i7.o r2 = i7.o.ALLOW
            if (r4 == r2) goto L_0x0048
            boolean r1 = k7.l.a(r0, r1)
            if (r1 == 0) goto L_0x002c
            i7.o r1 = i7.o.BLOCK_ALL
            if (r4 != r1) goto L_0x0048
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L_0x002c
            goto L_0x0048
        L_0x002c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unable to invoke no-args constructor of "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            k7.c$p r4 = new k7.c$p
            r4.<init>(r3)
            return r4
        L_0x0048:
            if (r4 != r2) goto L_0x0056
            java.lang.String r3 = n7.a.l(r0)
            if (r3 == 0) goto L_0x0056
            k7.c$q r4 = new k7.c$q
            r4.<init>(r3)
            return r4
        L_0x0056:
            k7.c$r r3 = new k7.c$r
            r3.<init>(r0)
            return r3
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c.c(java.lang.Class, i7.o):k7.i");
    }

    private static i d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new b();
            }
            return Queue.class.isAssignableFrom(cls) ? new C0172c() : new d();
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new e();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new f();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new g();
            }
            if (type instanceof ParameterizedType) {
                if (!String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                    return new h();
                }
            }
            return new i();
        }
    }

    private static i e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    private i f(Class cls) {
        if (this.f13026b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public i b(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        android.support.v4.media.session.b.a(this.f13025a.get(type));
        android.support.v4.media.session.b.a(this.f13025a.get(rawType));
        i e10 = e(type, rawType);
        if (e10 != null) {
            return e10;
        }
        i7.o b10 = l.b(this.f13027c, rawType);
        i c10 = c(rawType, b10);
        if (c10 != null) {
            return c10;
        }
        i d10 = d(type, rawType);
        if (d10 != null) {
            return d10;
        }
        String a10 = a(rawType);
        if (a10 != null) {
            return new l(a10);
        }
        if (b10 == i7.o.ALLOW) {
            return f(rawType);
        }
        return new m("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f13025a.toString();
    }
}
