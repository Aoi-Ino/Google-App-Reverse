package b6;

import f6.j0;
import java.security.GeneralSecurityException;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4447a = new a().c();

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f4448b = j0.M();

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f4449c = j0.M();

    static {
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        a.n(true);
        c.e();
    }
}
