package androidx.lifecycle;

import android.app.Application;
import cm.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public abstract class q0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List f3330a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final List f3331b;

    static {
        Class<j0> cls = j0.class;
        f3330a = q.l(Application.class, cls);
        f3331b = p.d(cls);
    }

    public static final Constructor c(Class cls, List list) {
        l.f(cls, "modelClass");
        l.f(list, "signature");
        Constructor[] constructors = cls.getConstructors();
        l.e(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor constructor = constructors[i10];
            Class[] parameterTypes = constructor.getParameterTypes();
            l.e(parameterTypes, "constructor.parameterTypes");
            List G = m.G(parameterTypes);
            if (l.a(list, G)) {
                l.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != G.size() || !G.containsAll(list)) {
                i10++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final t0 d(Class cls, Constructor constructor, Object... objArr) {
        l.f(cls, "modelClass");
        l.f(constructor, "constructor");
        l.f(objArr, "params");
        try {
            return (t0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
