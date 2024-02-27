package ep;

import java.util.Arrays;
import java.util.List;

class l1 {

    /* renamed from: a  reason: collision with root package name */
    private final List f23290a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23291b;

    public l1(j1 j1Var) {
        this(Arrays.asList(new j1[]{j1Var}));
    }

    public List a() {
        return this.f23290a;
    }

    public j1 b() {
        if (this.f23291b > 0) {
            return (j1) this.f23290a.get(0);
        }
        return null;
    }

    public l1(List list) {
        this.f23291b = list.size();
        this.f23290a = list;
    }
}
