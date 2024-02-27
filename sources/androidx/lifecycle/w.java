package androidx.lifecycle;

import android.support.v4.media.session.b;
import cm.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f3368a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f3369b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map f3370c = new HashMap();

    private w() {
    }

    private final h a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            l.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            b.a(newInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            l.e(name, "fullPackage");
            if (name.length() != 0) {
                l.e(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                l.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            l.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (name.length() != 0) {
                c10 = name + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            l.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        l.f(str, "className");
        return p.w(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f3369b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class cls) {
        return cls != null && r.class.isAssignableFrom(cls);
    }

    public static final o f(Object obj) {
        l.f(obj, "object");
        boolean z10 = obj instanceof o;
        boolean z11 = obj instanceof e;
        if (z10 && z11) {
            return new f((e) obj, (o) obj);
        }
        if (z11) {
            return new f((e) obj, (o) null);
        }
        if (z10) {
            return (o) obj;
        }
        Class<?> cls = obj.getClass();
        w wVar = f3368a;
        if (wVar.d(cls) != 2) {
            return new f0(obj);
        }
        Object obj2 = f3370c.get(cls);
        l.c(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            wVar.a((Constructor) list.get(0), obj);
            return new s0((h) null);
        }
        int size = list.size();
        h[] hVarArr = new h[size];
        for (int i10 = 0; i10 < size; i10++) {
            f3368a.a((Constructor) list.get(i10), obj);
            hVarArr[i10] = null;
        }
        return new d(hVarArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b10 = b(cls);
        if (b10 != null) {
            f3370c.put(cls, p.d(b10));
            return 2;
        } else if (c.f3257c.d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (e(superclass)) {
                l.e(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                Object obj = f3370c.get(superclass);
                l.c(obj);
                arrayList = new ArrayList((Collection) obj);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            l.e(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    l.e(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj2 = f3370c.get(cls2);
                    l.c(obj2);
                    arrayList.addAll((Collection) obj2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3370c.put(cls, arrayList);
            return 2;
        }
    }
}
