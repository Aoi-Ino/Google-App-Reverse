package ap;

import java.security.AccessControlException;
import java.security.PrivilegedAction;
import java.security.Security;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f19424a = new ThreadLocal();

    static class a implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19425a;

        a(String str) {
            this.f19425a = str;
        }

        public Object run() {
            return Security.getProperty(this.f19425a);
        }
    }

    static class b implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19426a;

        b(String str) {
            this.f19426a = str;
        }

        public Object run() {
            return System.getProperty(this.f19426a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r0 = (java.lang.String) r0.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r1) {
        /*
            ap.g$a r0 = new ap.g$a
            r0.<init>(r1)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.ThreadLocal r0 = f19424a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            ap.g$b r0 = new ap.g$b
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.g.a(java.lang.String):java.lang.String");
    }

    public static boolean b(String str) {
        try {
            return c(a(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private static boolean c(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) != 't' && str.charAt(0) != 'T') {
            return false;
        }
        if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
            return false;
        }
        if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
            return str.charAt(3) == 'e' || str.charAt(3) == 'E';
        }
        return false;
    }
}
