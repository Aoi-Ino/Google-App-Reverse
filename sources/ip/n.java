package ip;

import java.util.Date;

class n implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f24527a;

    public n(Class cls) {
        this.f24527a = new m(cls);
    }

    /* renamed from: c */
    public synchronized Date b(String str) {
        return this.f24527a.a(Long.valueOf(o.a(str).getTime()));
    }

    /* renamed from: d */
    public synchronized String a(Date date) {
        return o.c(date);
    }
}
