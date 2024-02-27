package e7;

public final class a {

    /* renamed from: p  reason: collision with root package name */
    private static final a f10104p = new C0138a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f10105a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10106b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10107c;

    /* renamed from: d  reason: collision with root package name */
    private final c f10108d;

    /* renamed from: e  reason: collision with root package name */
    private final d f10109e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10110f;

    /* renamed from: g  reason: collision with root package name */
    private final String f10111g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10112h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10113i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10114j;

    /* renamed from: k  reason: collision with root package name */
    private final long f10115k;

    /* renamed from: l  reason: collision with root package name */
    private final b f10116l;

    /* renamed from: m  reason: collision with root package name */
    private final String f10117m;

    /* renamed from: n  reason: collision with root package name */
    private final long f10118n;

    /* renamed from: o  reason: collision with root package name */
    private final String f10119o;

    /* renamed from: e7.a$a  reason: collision with other inner class name */
    public static final class C0138a {

        /* renamed from: a  reason: collision with root package name */
        private long f10120a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f10121b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f10122c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f10123d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f10124e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f10125f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f10126g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f10127h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f10128i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f10129j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f10130k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f10131l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f10132m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f10133n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f10134o = "";

        C0138a() {
        }

        public a a() {
            return new a(this.f10120a, this.f10121b, this.f10122c, this.f10123d, this.f10124e, this.f10125f, this.f10126g, this.f10127h, this.f10128i, this.f10129j, this.f10130k, this.f10131l, this.f10132m, this.f10133n, this.f10134o);
        }

        public C0138a b(String str) {
            this.f10132m = str;
            return this;
        }

        public C0138a c(String str) {
            this.f10126g = str;
            return this;
        }

        public C0138a d(String str) {
            this.f10134o = str;
            return this;
        }

        public C0138a e(b bVar) {
            this.f10131l = bVar;
            return this;
        }

        public C0138a f(String str) {
            this.f10122c = str;
            return this;
        }

        public C0138a g(String str) {
            this.f10121b = str;
            return this;
        }

        public C0138a h(c cVar) {
            this.f10123d = cVar;
            return this;
        }

        public C0138a i(String str) {
            this.f10125f = str;
            return this;
        }

        public C0138a j(long j10) {
            this.f10120a = j10;
            return this;
        }

        public C0138a k(d dVar) {
            this.f10124e = dVar;
            return this;
        }

        public C0138a l(String str) {
            this.f10129j = str;
            return this;
        }

        public C0138a m(int i10) {
            this.f10128i = i10;
            return this;
        }
    }

    public enum b implements u6.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f10139e;

        private b(int i10) {
            this.f10139e = i10;
        }

        public int a() {
            return this.f10139e;
        }
    }

    public enum c implements u6.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f10145e;

        private c(int i10) {
            this.f10145e = i10;
        }

        public int a() {
            return this.f10145e;
        }
    }

    public enum d implements u6.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f10151e;

        private d(int i10) {
            this.f10151e = i10;
        }

        public int a() {
            return this.f10151e;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f10105a = j10;
        this.f10106b = str;
        this.f10107c = str2;
        this.f10108d = cVar;
        this.f10109e = dVar;
        this.f10110f = str3;
        this.f10111g = str4;
        this.f10112h = i10;
        this.f10113i = i11;
        this.f10114j = str5;
        this.f10115k = j11;
        this.f10116l = bVar;
        this.f10117m = str6;
        this.f10118n = j12;
        this.f10119o = str7;
    }

    public static C0138a p() {
        return new C0138a();
    }

    public String a() {
        return this.f10117m;
    }

    public long b() {
        return this.f10115k;
    }

    public long c() {
        return this.f10118n;
    }

    public String d() {
        return this.f10111g;
    }

    public String e() {
        return this.f10119o;
    }

    public b f() {
        return this.f10116l;
    }

    public String g() {
        return this.f10107c;
    }

    public String h() {
        return this.f10106b;
    }

    public c i() {
        return this.f10108d;
    }

    public String j() {
        return this.f10110f;
    }

    public int k() {
        return this.f10112h;
    }

    public long l() {
        return this.f10105a;
    }

    public d m() {
        return this.f10109e;
    }

    public String n() {
        return this.f10114j;
    }

    public int o() {
        return this.f10113i;
    }
}
