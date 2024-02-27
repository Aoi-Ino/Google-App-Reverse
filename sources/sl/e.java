package sl;

import cm.l;
import java.util.Comparator;

final class e implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final e f31269a = new e();

    private e() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        l.f(comparable, "a");
        l.f(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return f.f31270a;
    }
}
