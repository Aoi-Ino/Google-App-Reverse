package po;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

public class a extends Provider {

    /* renamed from: e  reason: collision with root package name */
    private static String f30522e = "BouncyCastle Post-Quantum Security Provider v1.70";

    /* renamed from: f  reason: collision with root package name */
    public static String f30523f = "BCPQC";

    /* renamed from: g  reason: collision with root package name */
    private static final Map f30524g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f30525h = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    /* renamed from: po.a$a  reason: collision with other inner class name */
    class C0337a implements PrivilegedAction {
        C0337a() {
        }

        public Object run() {
            a.this.d();
            return null;
        }
    }

    static class b implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f30527a;

        b(String str) {
            this.f30527a = str;
        }

        public Object run() {
            try {
                return Class.forName(this.f30527a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public a() {
        super(f30523f, 1.7d, f30522e);
        AccessController.doPrivileged(new C0337a());
    }

    private void b(String str, String[] strArr) {
        int i10 = 0;
        while (i10 != strArr.length) {
            Class c10 = c(a.class, str + strArr[i10] + "$Mappings");
            if (c10 == null) {
                i10++;
            } else {
                try {
                    android.support.v4.media.session.b.a(c10.newInstance());
                    throw null;
                } catch (Exception e10) {
                    throw new InternalError("cannot create instance of " + str + strArr[i10] + "$Mappings : " + e10);
                }
            }
        }
    }

    static Class c(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        b("org.bouncycastle.pqc.jcajce.provider.", f30525h);
    }
}
