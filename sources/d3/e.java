package d3;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f9733c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f9734a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9735b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f9736a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f9737b = 0;

        a() {
        }

        public e a() {
            return new e(this.f9736a, this.f9737b);
        }

        public a b(long j10) {
            this.f9736a = j10;
            return this;
        }

        public a c(long j10) {
            this.f9737b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f9734a = j10;
        this.f9735b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f9734a;
    }

    public long b() {
        return this.f9735b;
    }
}
