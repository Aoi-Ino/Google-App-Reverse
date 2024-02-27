package lm;

import bm.l;
import bm.p;
import java.util.concurrent.CancellationException;
import tl.g;

public interface k1 extends g.b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f24977b = b.f24978e;

    public static final class a {
        public static /* synthetic */ void a(k1 k1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                k1Var.e(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(k1 k1Var, Object obj, p pVar) {
            return g.b.a.a(k1Var, obj, pVar);
        }

        public static g.b c(k1 k1Var, g.c cVar) {
            return g.b.a.b(k1Var, cVar);
        }

        public static /* synthetic */ r0 d(k1 k1Var, boolean z10, boolean z11, l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return k1Var.j0(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g e(k1 k1Var, g.c cVar) {
            return g.b.a.c(k1Var, cVar);
        }

        public static g f(k1 k1Var, g gVar) {
            return g.b.a.d(k1Var, gVar);
        }
    }

    public static final class b implements g.c {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ b f24978e = new b();

        private b() {
        }
    }

    boolean c();

    CancellationException c0();

    void e(CancellationException cancellationException);

    p i0(r rVar);

    r0 j0(boolean z10, boolean z11, l lVar);

    r0 o(l lVar);

    boolean start();
}
