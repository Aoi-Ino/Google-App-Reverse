package a2;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private long f83a;

    /* renamed from: b  reason: collision with root package name */
    private long f84b;

    public g(long j10, long j11) {
        this.f83a = j10;
        this.f84b = j11;
    }

    public final long a() {
        return this.f83a;
    }

    public final long b() {
        return this.f84b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f83a == gVar.f83a && this.f84b == gVar.f84b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f83a) * 31) + Long.hashCode(this.f84b);
    }

    public String toString() {
        return "Sample(offset=" + this.f83a + ", size=" + this.f84b + ')';
    }
}
