package ep;

import dp.c;
import fp.b;
import hp.i;
import hp.r0;
import ip.i0;
import ip.z;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class n3 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f23339a;

    /* renamed from: b  reason: collision with root package name */
    private final a3 f23340b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f23341c = new e0(this, c.FIELD);

    /* renamed from: d  reason: collision with root package name */
    private final e0 f23342d;

    /* renamed from: e  reason: collision with root package name */
    private final k1 f23343e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f23344f;

    /* renamed from: g  reason: collision with root package name */
    private final z f23345g;

    /* renamed from: h  reason: collision with root package name */
    private final b f23346h;

    /* renamed from: i  reason: collision with root package name */
    private final i f23347i;

    public n3(b bVar, z zVar, i iVar) {
        this.f23344f = new i0(zVar);
        this.f23340b = new a3(this);
        this.f23342d = new e0(this);
        this.f23343e = new k1(iVar);
        this.f23339a = new f1();
        this.f23345g = zVar;
        this.f23346h = bVar;
        this.f23347i = iVar;
    }

    private String b(Class<?> cls) {
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        String simpleName = cls.getSimpleName();
        return cls.isPrimitive() ? simpleName : t2.g(simpleName);
    }

    public static Class l(Class cls) {
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Byte.TYPE ? Byte.class : cls;
    }

    public static boolean o(Class cls, Class cls2) {
        if (cls.isPrimitive()) {
            cls = l(cls);
        }
        if (cls2.isPrimitive()) {
            cls2 = l(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    public String a(String str) {
        return this.f23346h.a(str);
    }

    public d0 c(Class cls) {
        return d(cls, (c) null);
    }

    public d0 d(Class cls, c cVar) {
        return (cVar != null ? this.f23341c : this.f23342d).a(cls);
    }

    public u e(Class cls, c cVar) {
        return (cVar != null ? this.f23341c : this.f23342d).b(cls);
    }

    public i f() {
        return this.f23347i;
    }

    public e1 g(Class cls) {
        return this.f23339a.a(cls);
    }

    public j1 h(t tVar, Annotation annotation) {
        return this.f23343e.f(tVar, annotation);
    }

    public List i(t tVar, Annotation annotation) {
        return this.f23343e.i(tVar, annotation);
    }

    public u j(Class cls, c cVar) {
        return (cVar != null ? this.f23341c : this.f23342d).d(cls);
    }

    public String k(Class cls) {
        String name = m(cls).getName();
        return name != null ? name : b(cls);
    }

    public z2 m(Class cls) {
        return this.f23340b.a(cls);
    }

    public r0 n() {
        return this.f23347i.c();
    }

    public boolean p(Class cls) {
        if (!Collection.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return cls.isArray();
        }
        return true;
    }

    public boolean q(Class cls) {
        if (cls == String.class || cls == Float.class || cls == Double.class || cls == Long.class || cls == Integer.class || cls == Boolean.class || cls.isEnum() || cls.isPrimitive()) {
            return true;
        }
        return this.f23344f.d(cls);
    }

    public Object r(String str, Class cls) {
        return this.f23344f.c(str, cls);
    }

    public String s(Object obj, Class cls) {
        return this.f23344f.e(obj, cls);
    }
}
