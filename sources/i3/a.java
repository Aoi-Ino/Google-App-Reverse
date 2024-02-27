package i3;

import i3.e;

final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f12254b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12255c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12256d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12257e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12258f;

    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f12259a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f12260b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f12261c;

        /* renamed from: d  reason: collision with root package name */
        private Long f12262d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f12263e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public e a() {
            String str = "";
            if (this.f12259a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f12260b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f12261c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f12262d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f12263e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f12259a.longValue(), this.f12260b.intValue(), this.f12261c.intValue(), this.f12262d.longValue(), this.f12263e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public e.a b(int i10) {
            this.f12261c = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a c(long j10) {
            this.f12262d = Long.valueOf(j10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a d(int i10) {
            this.f12260b = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a e(int i10) {
            this.f12263e = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a f(long j10) {
            this.f12259a = Long.valueOf(j10);
            return this;
        }
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f12254b = j10;
        this.f12255c = i10;
        this.f12256d = i11;
        this.f12257e = j11;
        this.f12258f = i12;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f12256d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f12257e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f12255c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f12258f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12254b == eVar.f() && this.f12255c == eVar.d() && this.f12256d == eVar.b() && this.f12257e == eVar.c() && this.f12258f == eVar.e();
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f12254b;
    }

    public int hashCode() {
        long j10 = this.f12254b;
        long j11 = this.f12257e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f12255c) * 1000003) ^ this.f12256d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f12258f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f12254b + ", loadBatchSize=" + this.f12255c + ", criticalSectionEnterTimeoutMs=" + this.f12256d + ", eventCleanUpAge=" + this.f12257e + ", maxBlobByteSizePerRow=" + this.f12258f + "}";
    }
}
