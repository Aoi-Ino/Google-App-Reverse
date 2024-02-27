package com.google.firebase.installations;

import com.google.firebase.installations.g;

final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f7357a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7358b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7359c;

    static final class b extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f7360a;

        /* renamed from: b  reason: collision with root package name */
        private Long f7361b;

        /* renamed from: c  reason: collision with root package name */
        private Long f7362c;

        b() {
        }

        public g a() {
            String str = "";
            if (this.f7360a == null) {
                str = str + " token";
            }
            if (this.f7361b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f7362c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f7360a, this.f7361b.longValue(), this.f7362c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.a b(String str) {
            if (str != null) {
                this.f7360a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public g.a c(long j10) {
            this.f7362c = Long.valueOf(j10);
            return this;
        }

        public g.a d(long j10) {
            this.f7361b = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, long j10, long j11) {
        this.f7357a = str;
        this.f7358b = j10;
        this.f7359c = j11;
    }

    public String b() {
        return this.f7357a;
    }

    public long c() {
        return this.f7359c;
    }

    public long d() {
        return this.f7358b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f7357a.equals(gVar.b()) && this.f7358b == gVar.d() && this.f7359c == gVar.c();
    }

    public int hashCode() {
        long j10 = this.f7358b;
        long j11 = this.f7359c;
        return ((((this.f7357a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f7357a + ", tokenExpirationTimestamp=" + this.f7358b + ", tokenCreationTimestamp=" + this.f7359c + "}";
    }
}
