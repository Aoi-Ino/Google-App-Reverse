package b7;

import b7.d;

final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f4452a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4453b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4454c;

    /* renamed from: d  reason: collision with root package name */
    private final f f4455d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f4456e;

    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f4457a;

        /* renamed from: b  reason: collision with root package name */
        private String f4458b;

        /* renamed from: c  reason: collision with root package name */
        private String f4459c;

        /* renamed from: d  reason: collision with root package name */
        private f f4460d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f4461e;

        b() {
        }

        public d a() {
            return new a(this.f4457a, this.f4458b, this.f4459c, this.f4460d, this.f4461e);
        }

        public d.a b(f fVar) {
            this.f4460d = fVar;
            return this;
        }

        public d.a c(String str) {
            this.f4458b = str;
            return this;
        }

        public d.a d(String str) {
            this.f4459c = str;
            return this;
        }

        public d.a e(d.b bVar) {
            this.f4461e = bVar;
            return this;
        }

        public d.a f(String str) {
            this.f4457a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f4452a = str;
        this.f4453b = str2;
        this.f4454c = str3;
        this.f4455d = fVar;
        this.f4456e = bVar;
    }

    public f b() {
        return this.f4455d;
    }

    public String c() {
        return this.f4453b;
    }

    public String d() {
        return this.f4454c;
    }

    public d.b e() {
        return this.f4456e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f4452a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f4453b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f4454c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f4455d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f4456e;
                        d.b e10 = dVar.e();
                        if (bVar == null) {
                            if (e10 == null) {
                                return true;
                            }
                        } else if (bVar.equals(e10)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f4452a;
    }

    public int hashCode() {
        String str = this.f4452a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f4453b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4454c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f4455d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f4456e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f4452a + ", fid=" + this.f4453b + ", refreshToken=" + this.f4454c + ", authToken=" + this.f4455d + ", responseCode=" + this.f4456e + "}";
    }
}
