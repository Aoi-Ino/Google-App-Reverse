package i3;

import a3.i;
import a3.o;

final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f12267a;

    /* renamed from: b  reason: collision with root package name */
    private final o f12268b;

    /* renamed from: c  reason: collision with root package name */
    private final i f12269c;

    b(long j10, o oVar, i iVar) {
        this.f12267a = j10;
        if (oVar != null) {
            this.f12268b = oVar;
            if (iVar != null) {
                this.f12269c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public i b() {
        return this.f12269c;
    }

    public long c() {
        return this.f12267a;
    }

    public o d() {
        return this.f12268b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f12267a == kVar.c() && this.f12268b.equals(kVar.d()) && this.f12269c.equals(kVar.b());
    }

    public int hashCode() {
        long j10 = this.f12267a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f12268b.hashCode()) * 1000003) ^ this.f12269c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f12267a + ", transportContext=" + this.f12268b + ", event=" + this.f12269c + "}";
    }
}
