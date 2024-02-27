package nm;

import bm.l;
import tl.d;

public interface u {

    public static final class a {
        public static /* synthetic */ boolean a(u uVar, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return uVar.a(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    boolean a(Throwable th2);

    void d(l lVar);

    Object k(Object obj);

    Object m(Object obj, d dVar);

    boolean p();
}
