package fm;

import cm.l;
import java.util.Random;

public final class b extends a {

    /* renamed from: g  reason: collision with root package name */
    private final a f23592g = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random f() {
        Object obj = this.f23592g.get();
        l.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
