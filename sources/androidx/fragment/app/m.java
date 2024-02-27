package androidx.fragment.app;

import androidx.fragment.app.i;
import o.g;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final g f3106a = new g();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return i.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        g gVar = f3106a;
        g gVar2 = (g) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new g();
            gVar.put(classLoader, gVar2);
        }
        Class cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new i.C0053i("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        } catch (ClassCastException e11) {
            throw new i.C0053i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e11);
        }
    }

    public abstract i a(ClassLoader classLoader, String str);
}
