package d3;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f9738c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f9739a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9740b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f9741a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f9742b = 0;

        a() {
        }

        public f a() {
            return new f(this.f9741a, this.f9742b);
        }

        public a b(long j10) {
            this.f9742b = j10;
            return this;
        }

        public a c(long j10) {
            this.f9741a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f9739a = j10;
        this.f9740b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f9740b;
    }

    public long b() {
        return this.f9739a;
    }
}
