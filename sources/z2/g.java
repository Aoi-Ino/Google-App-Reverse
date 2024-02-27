package z2;

import java.util.List;
import z2.m;

final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f18796a;

    /* renamed from: b  reason: collision with root package name */
    private final long f18797b;

    /* renamed from: c  reason: collision with root package name */
    private final k f18798c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f18799d;

    /* renamed from: e  reason: collision with root package name */
    private final String f18800e;

    /* renamed from: f  reason: collision with root package name */
    private final List f18801f;

    /* renamed from: g  reason: collision with root package name */
    private final p f18802g;

    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f18803a;

        /* renamed from: b  reason: collision with root package name */
        private Long f18804b;

        /* renamed from: c  reason: collision with root package name */
        private k f18805c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f18806d;

        /* renamed from: e  reason: collision with root package name */
        private String f18807e;

        /* renamed from: f  reason: collision with root package name */
        private List f18808f;

        /* renamed from: g  reason: collision with root package name */
        private p f18809g;

        b() {
        }

        public m a() {
            String str = "";
            if (this.f18803a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f18804b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f18803a.longValue(), this.f18804b.longValue(), this.f18805c, this.f18806d, this.f18807e, this.f18808f, this.f18809g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(k kVar) {
            this.f18805c = kVar;
            return this;
        }

        public m.a c(List list) {
            this.f18808f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a d(Integer num) {
            this.f18806d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(String str) {
            this.f18807e = str;
            return this;
        }

        public m.a f(p pVar) {
            this.f18809g = pVar;
            return this;
        }

        public m.a g(long j10) {
            this.f18803a = Long.valueOf(j10);
            return this;
        }

        public m.a h(long j10) {
            this.f18804b = Long.valueOf(j10);
            return this;
        }
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f18796a = j10;
        this.f18797b = j11;
        this.f18798c = kVar;
        this.f18799d = num;
        this.f18800e = str;
        this.f18801f = list;
        this.f18802g = pVar;
    }

    public k b() {
        return this.f18798c;
    }

    public List c() {
        return this.f18801f;
    }

    public Integer d() {
        return this.f18799d;
    }

    public String e() {
        return this.f18800e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f18796a == mVar.g() && this.f18797b == mVar.h() && ((kVar = this.f18798c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f18799d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f18800e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f18801f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f18802g;
            p f10 = mVar.f();
            if (pVar == null) {
                if (f10 == null) {
                    return true;
                }
            } else if (pVar.equals(f10)) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.f18802g;
    }

    public long g() {
        return this.f18796a;
    }

    public long h() {
        return this.f18797b;
    }

    public int hashCode() {
        long j10 = this.f18796a;
        long j11 = this.f18797b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f18798c;
        int i11 = 0;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f18799d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f18800e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f18801f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f18802g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f18796a + ", requestUptimeMs=" + this.f18797b + ", clientInfo=" + this.f18798c + ", logSource=" + this.f18799d + ", logSourceName=" + this.f18800e + ", logEvents=" + this.f18801f + ", qosTier=" + this.f18802g + "}";
    }
}
