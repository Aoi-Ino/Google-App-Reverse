package ip;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

class f0 implements g0 {
    f0() {
    }

    /* renamed from: c */
    public TimeZone b(String str) {
        return DesugarTimeZone.getTimeZone(str);
    }

    /* renamed from: d */
    public String a(TimeZone timeZone) {
        return timeZone.getID();
    }
}
