package b3;

import b3.g;

final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f4413a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4414b;

    b(g.a aVar, long j10) {
        if (aVar != null) {
            this.f4413a = aVar;
            this.f4414b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f4414b;
    }

    public g.a c() {
        return this.f4413a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f4413a.equals(gVar.c()) && this.f4414b == gVar.b();
    }

    public int hashCode() {
        long j10 = this.f4414b;
        return ((this.f4413a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f4413a + ", nextRequestWaitMillis=" + this.f4414b + "}";
    }
}
