package h6;

final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f12024a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12025b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12026c;

    a(long j10, long j11, long j12) {
        this.f12024a = j10;
        this.f12025b = j11;
        this.f12026c = j12;
    }

    public long b() {
        return this.f12025b;
    }

    public long c() {
        return this.f12024a;
    }

    public long d() {
        return this.f12026c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f12024a == lVar.c() && this.f12025b == lVar.b() && this.f12026c == lVar.d();
    }

    public int hashCode() {
        long j10 = this.f12024a;
        long j11 = this.f12025b;
        long j12 = this.f12026c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f12024a + ", elapsedRealtime=" + this.f12025b + ", uptimeMillis=" + this.f12026c + "}";
    }
}
