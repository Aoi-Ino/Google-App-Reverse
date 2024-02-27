package androidx.lifecycle;

import androidx.lifecycle.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class c {

    /* renamed from: c  reason: collision with root package name */
    static c f3257c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Map f3258a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f3259b = new HashMap();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map f3260a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map f3261b;

        a(Map map) {
            this.f3261b = map;
            for (Map.Entry entry : map.entrySet()) {
                k.a aVar = (k.a) entry.getValue();
                List list = (List) this.f3260a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3260a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        private static void b(List list, s sVar, k.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(sVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(s sVar, k.a aVar, Object obj) {
            b((List) this.f3260a.get(aVar), sVar, aVar, obj);
            b((List) this.f3260a.get(k.a.ON_ANY), sVar, aVar, obj);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f3262a;

        /* renamed from: b  reason: collision with root package name */
        final Method f3263b;

        b(int i10, Method method) {
            this.f3262a = i10;
            this.f3263b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(s sVar, k.a aVar, Object obj) {
            try {
                int i10 = this.f3262a;
                if (i10 == 0) {
                    this.f3263b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f3263b.invoke(obj, new Object[]{sVar});
                } else if (i10 == 2) {
                    this.f3263b.invoke(obj, new Object[]{sVar, aVar});
                }
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3262a == bVar.f3262a && this.f3263b.getName().equals(bVar.f3263b.getName());
        }

        public int hashCode() {
            return (this.f3262a * 31) + this.f3263b.getName().hashCode();
        }
    }

    c() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a c10;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c10 = c(superclass)) == null)) {
            hashMap.putAll(c10.f3261b);
        }
        for (Class c11 : cls.getInterfaces()) {
            for (Map.Entry entry : c(c11).f3261b.entrySet()) {
                e(hashMap, (b) entry.getKey(), (k.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            c0 c0Var = (c0) method.getAnnotation(c0.class);
            if (c0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (s.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                k.a value = c0Var.value();
                if (parameterTypes.length > 1) {
                    if (!k.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == k.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f3258a.put(cls, aVar);
        this.f3259b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, k.a aVar, Class cls) {
        k.a aVar2 = (k.a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f3263b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class cls) {
        a aVar = (a) this.f3258a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f3259b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method annotation : b10) {
            if (((c0) annotation.getAnnotation(c0.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f3259b.put(cls, Boolean.FALSE);
        return false;
    }
}
