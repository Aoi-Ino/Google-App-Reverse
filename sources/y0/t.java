package y0;

import android.content.Context;
import cm.l;
import y0.u;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f18387a = new t();

    private t() {
    }

    public static final u.a a(Context context, Class cls, String str) {
        l.f(context, "context");
        l.f(cls, "klass");
        if (true ^ (str == null || p.q(str))) {
            return new u.a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final Object b(Class cls, String str) {
        String str2;
        l.f(cls, "klass");
        l.f(str, "suffix");
        Package packageR = cls.getPackage();
        l.c(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        l.c(canonicalName);
        l.e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            l.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = p.v(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            l.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final u.a c(Context context, Class cls) {
        l.f(context, "context");
        l.f(cls, "klass");
        return new u.a(context, cls, (String) null);
    }
}
