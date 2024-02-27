package co;

import java.security.AccessController;
import java.security.PrivilegedAction;

public abstract class a {

    /* renamed from: co.a$a  reason: collision with other inner class name */
    static class C0270a implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20461a;

        C0270a(String str) {
            this.f20461a = str;
        }

        public Object run() {
            try {
                return Class.forName(this.f20461a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C0270a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
