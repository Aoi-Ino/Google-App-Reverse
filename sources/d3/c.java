package d3;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f9714c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f9715a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9716b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f9717a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f9718b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f9717a, this.f9718b);
        }

        public a b(long j10) {
            this.f9717a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f9718b = bVar;
            return this;
        }
    }

    public enum b implements u6.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f9727e;

        private b(int i10) {
            this.f9727e = i10;
        }

        public int a() {
            return this.f9727e;
        }
    }

    c(long j10, b bVar) {
        this.f9715a = j10;
        this.f9716b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f9715a;
    }

    public b b() {
        return this.f9716b;
    }
}
