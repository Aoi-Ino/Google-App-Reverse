package k6;

import java.util.Arrays;
import java.util.List;

public class r extends s {

    /* renamed from: e  reason: collision with root package name */
    private final List f13008e;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f13008e = list;
    }
}
