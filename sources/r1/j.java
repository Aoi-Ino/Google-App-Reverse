package r1;

import cm.l;
import java.util.List;

public interface j {

    public static final class a {
        public static i a(j jVar, m mVar) {
            l.f(mVar, "id");
            return j.super.d(mVar);
        }

        public static void b(j jVar, m mVar) {
            l.f(mVar, "id");
            j.super.i(mVar);
        }
    }

    void a(i iVar);

    List c();

    i d(m mVar) {
        l.f(mVar, "id");
        return g(mVar.b(), mVar.a());
    }

    void e(String str, int i10);

    void f(String str);

    i g(String str, int i10);

    void i(m mVar) {
        l.f(mVar, "id");
        e(mVar.b(), mVar.a());
    }
}
