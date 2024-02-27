package q5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f15219a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f15220b = new AtomicBoolean(false);

    private final synchronized void b() {
        this.f15219a.put("assetOnlyUpdates", Boolean.FALSE);
    }

    public final synchronized boolean a(String str) {
        try {
            if (!this.f15220b.get()) {
                b();
            }
            Object obj = this.f15219a.get("assetOnlyUpdates");
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return ((Boolean) obj).booleanValue();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
