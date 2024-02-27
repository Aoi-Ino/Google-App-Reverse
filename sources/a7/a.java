package a7;

import a7.c;
import a7.d;

final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f214b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f215c;

    /* renamed from: d  reason: collision with root package name */
    private final String f216d;

    /* renamed from: e  reason: collision with root package name */
    private final String f217e;

    /* renamed from: f  reason: collision with root package name */
    private final long f218f;

    /* renamed from: g  reason: collision with root package name */
    private final long f219g;

    /* renamed from: h  reason: collision with root package name */
    private final String f220h;

    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f221a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f222b;

        /* renamed from: c  reason: collision with root package name */
        private String f223c;

        /* renamed from: d  reason: collision with root package name */
        private String f224d;

        /* renamed from: e  reason: collision with root package name */
        private Long f225e;

        /* renamed from: f  reason: collision with root package name */
        private Long f226f;

        /* renamed from: g  reason: collision with root package name */
        private String f227g;

        b() {
        }

        public d a() {
            String str = "";
            if (this.f222b == null) {
                str = str + " registrationStatus";
            }
            if (this.f225e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f226f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f221a, this.f222b, this.f223c, this.f224d, this.f225e.longValue(), this.f226f.longValue(), this.f227g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.f223c = str;
            return this;
        }

        public d.a c(long j10) {
            this.f225e = Long.valueOf(j10);
            return this;
        }

        public d.a d(String str) {
            this.f221a = str;
            return this;
        }

        public d.a e(String str) {
            this.f227g = str;
            return this;
        }

        public d.a f(String str) {
            this.f224d = str;
            return this;
        }

        public d.a g(c.a aVar) {
            if (aVar != null) {
                this.f222b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d.a h(long j10) {
            this.f226f = Long.valueOf(j10);
            return this;
        }

        private b(d dVar) {
            this.f221a = dVar.d();
            this.f222b = dVar.g();
            this.f223c = dVar.b();
            this.f224d = dVar.f();
            this.f225e = Long.valueOf(dVar.c());
            this.f226f = Long.valueOf(dVar.h());
            this.f227g = dVar.e();
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f214b = str;
        this.f215c = aVar;
        this.f216d = str2;
        this.f217e = str3;
        this.f218f = j10;
        this.f219g = j11;
        this.f220h = str4;
    }

    public String b() {
        return this.f216d;
    }

    public long c() {
        return this.f218f;
    }

    public String d() {
        return this.f214b;
    }

    public String e() {
        return this.f220h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f214b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f215c.equals(dVar.g()) && ((str = this.f216d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f217e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f218f == dVar.c() && this.f219g == dVar.h()) {
                String str4 = this.f220h;
                String e10 = dVar.e();
                if (str4 == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (str4.equals(e10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f217e;
    }

    public c.a g() {
        return this.f215c;
    }

    public long h() {
        return this.f219g;
    }

    public int hashCode() {
        String str = this.f214b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f215c.hashCode()) * 1000003;
        String str2 = this.f216d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f217e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f218f;
        long j11 = this.f219g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f220h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f214b + ", registrationStatus=" + this.f215c + ", authToken=" + this.f216d + ", refreshToken=" + this.f217e + ", expiresInSecs=" + this.f218f + ", tokenCreationEpochInSecs=" + this.f219g + ", fisError=" + this.f220h + "}";
    }
}
