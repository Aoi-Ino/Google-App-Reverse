package z2;

final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f18810a;

    h(long j10) {
        this.f18810a = j10;
    }

    public long c() {
        return this.f18810a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f18810a == ((n) obj).c();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f18810a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f18810a + "}";
    }
}
