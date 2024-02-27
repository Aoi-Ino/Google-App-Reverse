package g7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f11717b;

    /* renamed from: a  reason: collision with root package name */
    private final Set f11718a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f11717b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f11717b;
                    if (dVar == null) {
                        dVar = new d();
                        f11717b = dVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f11718a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f11718a);
        }
        return unmodifiableSet;
    }
}
