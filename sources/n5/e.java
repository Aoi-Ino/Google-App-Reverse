package n5;

import android.content.Context;
import t5.p;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static f f14146a;

    static synchronized f a(Context context) {
        f fVar;
        synchronized (e.class) {
            try {
                if (f14146a == null) {
                    c0 c0Var = new c0((b0) null);
                    c0Var.a(new l(p.a(context)));
                    f14146a = c0Var.b();
                }
                fVar = f14146a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
