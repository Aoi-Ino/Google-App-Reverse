package ip;

import java.util.concurrent.atomic.AtomicLong;

class d implements g0 {
    d() {
    }

    /* renamed from: c */
    public AtomicLong b(String str) {
        return new AtomicLong(Long.valueOf(str).longValue());
    }

    /* renamed from: d */
    public String a(AtomicLong atomicLong) {
        return atomicLong.toString();
    }
}
