package b7;

import b7.f;

final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f4462a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4463b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f4464c;

    /* renamed from: b7.b$b  reason: collision with other inner class name */
    static final class C0085b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f4465a;

        /* renamed from: b  reason: collision with root package name */
        private Long f4466b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f4467c;

        C0085b() {
        }

        public f a() {
            String str = "";
            if (this.f4466b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f4465a, this.f4466b.longValue(), this.f4467c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(f.b bVar) {
            this.f4467c = bVar;
            return this;
        }

        public f.a c(String str) {
            this.f4465a = str;
            return this;
        }

        public f.a d(long j10) {
            this.f4466b = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, long j10, f.b bVar) {
        this.f4462a = str;
        this.f4463b = j10;
        this.f4464c = bVar;
    }

    public f.b b() {
        return this.f4464c;
    }

    public String c() {
        return this.f4462a;
    }

    public long d() {
        return this.f4463b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f4462a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f4463b == fVar.d()) {
                f.b bVar = this.f4464c;
                f.b b10 = fVar.b();
                if (bVar == null) {
                    if (b10 == null) {
                        return true;
                    }
                } else if (bVar.equals(b10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4462a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f4463b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f4464c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f4462a + ", tokenExpirationTimestamp=" + this.f4463b + ", responseCode=" + this.f4464c + "}";
    }
}
