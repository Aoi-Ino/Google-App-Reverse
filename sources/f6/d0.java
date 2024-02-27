package f6;

import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.w0;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;

public final class d0 extends x implements p0 {
    /* access modifiers changed from: private */
    public static final d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile w0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z.d keyInfo_ = x.t();
    private int primaryKeyId_;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.x$d[] r0 = com.google.crypto.tink.shaded.protobuf.x.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11362a = r0
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11362a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11362a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11362a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f11362a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.d0.a.<clinit>():void");
        }
    }

    public static final class b extends x.a implements p0 {
        private b() {
            super(d0.DEFAULT_INSTANCE);
        }

        public b x(c cVar) {
            q();
            ((d0) this.f7278f).O(cVar);
            return this;
        }

        public b z(int i10) {
            q();
            ((d0) this.f7278f).S(i10);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends x implements p0 {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile w0 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class a extends x.a implements p0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a A(z zVar) {
                q();
                ((c) this.f7278f).U(zVar);
                return this;
            }

            public a C(String str) {
                q();
                ((c) this.f7278f).V(str);
                return this;
            }

            public a x(int i10) {
                q();
                ((c) this.f7278f).S(i10);
                return this;
            }

            public a z(i0 i0Var) {
                q();
                ((c) this.f7278f).T(i0Var);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            x.J(c.class, cVar);
        }

        private c() {
        }

        public static a R() {
            return (a) DEFAULT_INSTANCE.p();
        }

        /* access modifiers changed from: private */
        public void S(int i10) {
            this.keyId_ = i10;
        }

        /* access modifiers changed from: private */
        public void T(i0 i0Var) {
            this.outputPrefixType_ = i0Var.b();
        }

        /* access modifiers changed from: private */
        public void U(z zVar) {
            this.status_ = zVar.b();
        }

        /* access modifiers changed from: private */
        public void V(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int Q() {
            return this.keyId_;
        }

        /* access modifiers changed from: protected */
        public final Object s(x.d dVar, Object obj, Object obj2) {
            switch (a.f11362a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a) null);
                case 3:
                    return x.C(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0 w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (c.class) {
                            try {
                                w0Var = PARSER;
                                if (w0Var == null) {
                                    w0Var = new x.b(DEFAULT_INSTANCE);
                                    PARSER = w0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return w0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        x.J(d0.class, d0Var);
    }

    private d0() {
    }

    /* access modifiers changed from: private */
    public void O(c cVar) {
        cVar.getClass();
        P();
        this.keyInfo_.add(cVar);
    }

    private void P() {
        if (!this.keyInfo_.c0()) {
            this.keyInfo_ = x.A(this.keyInfo_);
        }
    }

    public static b R() {
        return (b) DEFAULT_INSTANCE.p();
    }

    /* access modifiers changed from: private */
    public void S(int i10) {
        this.primaryKeyId_ = i10;
    }

    public c Q(int i10) {
        return (c) this.keyInfo_.get(i10);
    }

    /* access modifiers changed from: protected */
    public final Object s(x.d dVar, Object obj, Object obj2) {
        switch (a.f11362a[dVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b((a) null);
            case 3:
                return x.C(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w0 w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (d0.class) {
                        try {
                            w0Var = PARSER;
                            if (w0Var == null) {
                                w0Var = new x.b(DEFAULT_INSTANCE);
                                PARSER = w0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return w0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
