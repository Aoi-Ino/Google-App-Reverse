package ip;

import java.util.concurrent.atomic.AtomicInteger;

class c implements g0 {
    c() {
    }

    /* renamed from: c */
    public AtomicInteger b(String str) {
        return new AtomicInteger(Integer.valueOf(str).intValue());
    }

    /* renamed from: d */
    public String a(AtomicInteger atomicInteger) {
        return atomicInteger.toString();
    }
}
