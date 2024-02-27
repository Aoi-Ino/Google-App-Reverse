package a3;

import a3.i;
import java.util.Map;

final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f138a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f139b;

    /* renamed from: c  reason: collision with root package name */
    private final h f140c;

    /* renamed from: d  reason: collision with root package name */
    private final long f141d;

    /* renamed from: e  reason: collision with root package name */
    private final long f142e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f143f;

    /* renamed from: a3.b$b  reason: collision with other inner class name */
    static final class C0004b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f144a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f145b;

        /* renamed from: c  reason: collision with root package name */
        private h f146c;

        /* renamed from: d  reason: collision with root package name */
        private Long f147d;

        /* renamed from: e  reason: collision with root package name */
        private Long f148e;

        /* renamed from: f  reason: collision with root package name */
        private Map f149f;

        C0004b() {
        }

        public i d() {
            String str = "";
            if (this.f144a == null) {
                str = str + " transportName";
            }
            if (this.f146c == null) {
                str = str + " encodedPayload";
            }
            if (this.f147d == null) {
                str = str + " eventMillis";
            }
            if (this.f148e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f149f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f144a, this.f145b, this.f146c, this.f147d.longValue(), this.f148e.longValue(), this.f149f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map e() {
            Map map = this.f149f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public i.a f(Map map) {
            if (map != null) {
                this.f149f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public i.a g(Integer num) {
            this.f145b = num;
            return this;
        }

        public i.a h(h hVar) {
            if (hVar != null) {
                this.f146c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public i.a i(long j10) {
            this.f147d = Long.valueOf(j10);
            return this;
        }

        public i.a j(String str) {
            if (str != null) {
                this.f144a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public i.a k(long j10) {
            this.f148e = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f138a = str;
        this.f139b = num;
        this.f140c = hVar;
        this.f141d = j10;
        this.f142e = j11;
        this.f143f = map;
    }

    /* access modifiers changed from: protected */
    public Map c() {
        return this.f143f;
    }

    public Integer d() {
        return this.f139b;
    }

    public h e() {
        return this.f140c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f139b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof a3.i
            r2 = 0
            if (r1 == 0) goto L_0x005b
            a3.i r8 = (a3.i) r8
            java.lang.String r1 = r7.f138a
            java.lang.String r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f139b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            a3.h r1 = r7.f140c
            a3.h r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f141d
            long r5 = r8.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f142e
            long r5 = r8.k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map r1 = r7.f143f
            java.util.Map r8 = r8.c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b.equals(java.lang.Object):boolean");
    }

    public long f() {
        return this.f141d;
    }

    public int hashCode() {
        int hashCode = (this.f138a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f139b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f141d;
        long j11 = this.f142e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f140c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f143f.hashCode();
    }

    public String j() {
        return this.f138a;
    }

    public long k() {
        return this.f142e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f138a + ", code=" + this.f139b + ", encodedPayload=" + this.f140c + ", eventMillis=" + this.f141d + ", uptimeMillis=" + this.f142e + ", autoMetadata=" + this.f143f + "}";
    }
}
