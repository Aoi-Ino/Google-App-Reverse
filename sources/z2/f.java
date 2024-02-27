package z2;

import java.util.Arrays;
import z2.l;

final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f18782a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f18783b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18784c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f18785d;

    /* renamed from: e  reason: collision with root package name */
    private final String f18786e;

    /* renamed from: f  reason: collision with root package name */
    private final long f18787f;

    /* renamed from: g  reason: collision with root package name */
    private final o f18788g;

    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f18789a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f18790b;

        /* renamed from: c  reason: collision with root package name */
        private Long f18791c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f18792d;

        /* renamed from: e  reason: collision with root package name */
        private String f18793e;

        /* renamed from: f  reason: collision with root package name */
        private Long f18794f;

        /* renamed from: g  reason: collision with root package name */
        private o f18795g;

        b() {
        }

        public l a() {
            String str = "";
            if (this.f18789a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f18791c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f18794f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f18789a.longValue(), this.f18790b, this.f18791c.longValue(), this.f18792d, this.f18793e, this.f18794f.longValue(), this.f18795g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(Integer num) {
            this.f18790b = num;
            return this;
        }

        public l.a c(long j10) {
            this.f18789a = Long.valueOf(j10);
            return this;
        }

        public l.a d(long j10) {
            this.f18791c = Long.valueOf(j10);
            return this;
        }

        public l.a e(o oVar) {
            this.f18795g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a f(byte[] bArr) {
            this.f18792d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f18793e = str;
            return this;
        }

        public l.a h(long j10) {
            this.f18794f = Long.valueOf(j10);
            return this;
        }
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f18782a = j10;
        this.f18783b = num;
        this.f18784c = j11;
        this.f18785d = bArr;
        this.f18786e = str;
        this.f18787f = j12;
        this.f18788g = oVar;
    }

    public Integer b() {
        return this.f18783b;
    }

    public long c() {
        return this.f18782a;
    }

    public long d() {
        return this.f18784c;
    }

    public o e() {
        return this.f18788g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f18782a == lVar.c() && ((num = this.f18783b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f18784c == lVar.d()) {
            if (Arrays.equals(this.f18785d, lVar instanceof f ? ((f) lVar).f18785d : lVar.f()) && ((str = this.f18786e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f18787f == lVar.h()) {
                o oVar = this.f18788g;
                o e10 = lVar.e();
                if (oVar == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (oVar.equals(e10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f18785d;
    }

    public String g() {
        return this.f18786e;
    }

    public long h() {
        return this.f18787f;
    }

    public int hashCode() {
        long j10 = this.f18782a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f18783b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f18784c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f18785d)) * 1000003;
        String str = this.f18786e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f18787f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f18788g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f18782a + ", eventCode=" + this.f18783b + ", eventUptimeMs=" + this.f18784c + ", sourceExtension=" + Arrays.toString(this.f18785d) + ", sourceExtensionJsonProto3=" + this.f18786e + ", timezoneOffsetSeconds=" + this.f18787f + ", networkConnectionInfo=" + this.f18788g + "}";
    }
}
