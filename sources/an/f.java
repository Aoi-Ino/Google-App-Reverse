package an;

import cm.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f19395a = new f();

    private f() {
    }

    public static final boolean a(String str) {
        l.f(str, "method");
        return !l.a(str, "GET") && !l.a(str, "HEAD");
    }

    public static final boolean d(String str) {
        l.f(str, "method");
        return l.a(str, "POST") || l.a(str, "PUT") || l.a(str, "PATCH") || l.a(str, "PROPPATCH") || l.a(str, "REPORT");
    }

    public final boolean b(String str) {
        l.f(str, "method");
        return !l.a(str, "PROPFIND");
    }

    public final boolean c(String str) {
        l.f(str, "method");
        return l.a(str, "PROPFIND");
    }
}
