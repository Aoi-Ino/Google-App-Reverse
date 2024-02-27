package ip;

import java.util.Date;
import java.util.GregorianCalendar;

class u implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final n f24540a;

    public u() {
        this(Date.class);
    }

    private GregorianCalendar d(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date != null) {
            gregorianCalendar.setTime(date);
        }
        return gregorianCalendar;
    }

    /* renamed from: c */
    public GregorianCalendar b(String str) {
        return d(this.f24540a.b(str));
    }

    /* renamed from: e */
    public String a(GregorianCalendar gregorianCalendar) {
        return this.f24540a.a(gregorianCalendar.getTime());
    }

    public u(Class cls) {
        this.f24540a = new n(cls);
    }
}
