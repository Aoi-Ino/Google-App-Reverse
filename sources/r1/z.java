package r1;

import cm.l;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public interface z {

    public static final class a {
        public static void a(z zVar, String str, Set set) {
            l.f(str, "id");
            l.f(set, "tags");
            z.super.b(str, set);
        }
    }

    void b(String str, Set set) {
        l.f(str, "id");
        l.f(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c(new y((String) it.next(), str));
        }
    }

    void c(y yVar);

    List d(String str);
}
