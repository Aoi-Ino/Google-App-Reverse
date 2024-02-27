package cm;

import im.b;
import im.c;
import im.d;
import im.e;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private static final w f20235a;

    /* renamed from: b  reason: collision with root package name */
    private static final b[] f20236b = new b[0];

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        f20235a = wVar;
    }

    public static d a(j jVar) {
        return f20235a.a(jVar);
    }

    public static b b(Class cls) {
        return f20235a.b(cls);
    }

    public static c c(Class cls) {
        return f20235a.c(cls, "");
    }

    public static e d(o oVar) {
        return f20235a.d(oVar);
    }

    public static String e(i iVar) {
        return f20235a.e(iVar);
    }

    public static String f(m mVar) {
        return f20235a.f(mVar);
    }
}
