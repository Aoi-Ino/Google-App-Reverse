package sl;

import cm.l;
import java.util.Comparator;

final class f implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final f f31270a = new f();

    private f() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        l.f(comparable, "a");
        l.f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return e.f31269a;
    }
}
