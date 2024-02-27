package i7;

import java.io.IOException;
import l7.f;
import p7.b;
import p7.c;

public abstract class r {

    class a extends r {
        a() {
        }

        public Object b(p7.a aVar) {
            if (aVar.D0() != b.NULL) {
                return r.this.b(aVar);
            }
            aVar.s0();
            return null;
        }

        public void d(c cVar, Object obj) {
            if (obj == null) {
                cVar.R();
            } else {
                r.this.d(cVar, obj);
            }
        }
    }

    public final r a() {
        return new a();
    }

    public abstract Object b(p7.a aVar);

    public final g c(Object obj) {
        try {
            f fVar = new f();
            d(fVar, obj);
            return fVar.J0();
        } catch (IOException e10) {
            throw new h((Throwable) e10);
        }
    }

    public abstract void d(c cVar, Object obj);
}
