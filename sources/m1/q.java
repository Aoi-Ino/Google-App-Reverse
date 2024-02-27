package m1;

public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f13707a = new b.c();

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0184b f13708b = new b.C0184b();

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f13709a;

            public a(Throwable th2) {
                this.f13709a = th2;
            }

            public Throwable a() {
                return this.f13709a;
            }

            public String toString() {
                return "FAILURE (" + this.f13709a.getMessage() + ")";
            }
        }

        /* renamed from: m1.q$b$b  reason: collision with other inner class name */
        public static final class C0184b extends b {
            private C0184b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }
}
