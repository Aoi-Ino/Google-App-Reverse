package f6;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.w0;
import com.google.crypto.tink.shaded.protobuf.x;

public final class i extends x implements p0 {
    /* access modifiers changed from: private */
    public static final i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile w0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.f7078f;
    private k params_;
    private int version_;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11371a;

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
                f11371a = r0
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11371a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11371a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11371a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11371a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11371a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f11371a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.x$d r1 = com.google.crypto.tink.shaded.protobuf.x.d.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.i.a.<clinit>():void");
        }
    }

    public static final class b extends x.a implements p0 {
        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        public b A(int i10) {
            q();
            ((i) this.f7278f).W(i10);
            return this;
        }

        public b x(h hVar) {
            q();
            ((i) this.f7278f).U(hVar);
            return this;
        }

        public b z(k kVar) {
            q();
            ((i) this.f7278f).V(kVar);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        x.J(i.class, iVar);
    }

    private i() {
    }

    public static b S() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static i T(h hVar, p pVar) {
        return (i) x.D(DEFAULT_INSTANCE, hVar, pVar);
    }

    /* access modifiers changed from: private */
    public void U(h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    /* access modifiers changed from: private */
    public void V(k kVar) {
        kVar.getClass();
        this.params_ = kVar;
    }

    /* access modifiers changed from: private */
    public void W(int i10) {
        this.version_ = i10;
    }

    public h P() {
        return this.keyValue_;
    }

    public k Q() {
        k kVar = this.params_;
        return kVar == null ? k.M() : kVar;
    }

    public int R() {
        return this.version_;
    }

    /* access modifiers changed from: protected */
    public final Object s(x.d dVar, Object obj, Object obj2) {
        switch (a.f11371a[dVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b((a) null);
            case 3:
                return x.C(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w0 w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (i.class) {
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
