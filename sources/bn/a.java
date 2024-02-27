package bn;

import cm.g;
import cm.l;
import um.u;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0264a f19998c = new C0264a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private long f19999a = ((long) 262144);

    /* renamed from: b  reason: collision with root package name */
    private final in.g f20000b;

    /* renamed from: bn.a$a  reason: collision with other inner class name */
    public static final class C0264a {
        private C0264a() {
        }

        public /* synthetic */ C0264a(g gVar) {
            this();
        }
    }

    public a(in.g gVar) {
        l.f(gVar, "source");
        this.f20000b = gVar;
    }

    public final u a() {
        u.a aVar = new u.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.e();
            }
            aVar.c(b10);
        }
    }

    public final String b() {
        String e02 = this.f20000b.e0(this.f19999a);
        this.f19999a -= (long) e02.length();
        return e02;
    }
}
