package d6;

import f6.j0;
import java.security.GeneralSecurityException;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9772a = new b().c();

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f9773b;

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f9774c;

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f9775d;

    static {
        j0 M = j0.M();
        f9773b = M;
        f9774c = M;
        f9775d = M;
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
        b.m(true);
        a.n(true);
        d.e();
    }
}
