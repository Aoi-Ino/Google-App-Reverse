package h3;

import h3.f;
import java.util.Set;

final class c extends f.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f11942a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11943b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f11944c;

    static final class b extends f.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f11945a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11946b;

        /* renamed from: c  reason: collision with root package name */
        private Set f11947c;

        b() {
        }

        public f.b a() {
            String str = "";
            if (this.f11945a == null) {
                str = str + " delta";
            }
            if (this.f11946b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f11947c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f11945a.longValue(), this.f11946b.longValue(), this.f11947c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.b.a b(long j10) {
            this.f11945a = Long.valueOf(j10);
            return this;
        }

        public f.b.a c(Set set) {
            if (set != null) {
                this.f11947c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public f.b.a d(long j10) {
            this.f11946b = Long.valueOf(j10);
            return this;
        }
    }

    private c(long j10, long j11, Set set) {
        this.f11942a = j10;
        this.f11943b = j11;
        this.f11944c = set;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f11942a;
    }

    /* access modifiers changed from: package-private */
    public Set c() {
        return this.f11944c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f11943b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f11942a == bVar.b() && this.f11943b == bVar.d() && this.f11944c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f11942a;
        long j11 = this.f11943b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f11944c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f11942a + ", maxAllowedDelay=" + this.f11943b + ", flags=" + this.f11944c + "}";
    }
}
