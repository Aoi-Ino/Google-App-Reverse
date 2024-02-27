package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

public enum u {
    DOUBLE(0, r29, r47),
    FLOAT(1, r29, r53),
    INT64(2, r29, r60),
    UINT64(3, r29, r60),
    INT32(4, r29, r1),
    FIXED64(5, r29, r60),
    FIXED32(6, r29, r1),
    BOOL(7, r29, r2),
    STRING(8, r29, r38),
    MESSAGE(9, r29, r66),
    BYTES(10, r29, r3),
    UINT32(11, r29, r1),
    ENUM(12, r29, r4),
    SFIXED32(13, r29, r1),
    SFIXED64(14, r29, r60),
    SINT32(15, r29, r1),
    SINT64(16, r29, r60),
    GROUP(17, r29, r66),
    DOUBLE_LIST(18, r34, r47),
    FLOAT_LIST(19, r34, r53),
    INT64_LIST(20, r34, r35),
    UINT64_LIST(21, r34, r35),
    INT32_LIST(22, r34, r1),
    FIXED64_LIST(23, r34, r60),
    FIXED32_LIST(24, r65, r1),
    BOOL_LIST(25, r65, r2),
    STRING_LIST(26, r65, r38),
    MESSAGE_LIST(27, r43, r66),
    BYTES_LIST(28, r43, r3),
    UINT32_LIST(29, r65, r1),
    ENUM_LIST(30, r43, r4),
    SFIXED32_LIST(31, r65, r1),
    SFIXED64_LIST(32, r65, r60),
    SINT32_LIST(33, r65, r1),
    SINT64_LIST(34, r65, r60),
    DOUBLE_LIST_PACKED(35, r3, r47),
    FLOAT_LIST_PACKED(36, r3, r53),
    INT64_LIST_PACKED(37, r58, r59),
    UINT64_LIST_PACKED(38, r58, r59),
    INT32_LIST_PACKED(39, r58, r1),
    FIXED64_LIST_PACKED(40, r58, r60),
    FIXED32_LIST_PACKED(41, r58, r1),
    BOOL_LIST_PACKED(42, r58, r2),
    UINT32_LIST_PACKED(43, r58, r1),
    ENUM_LIST_PACKED(44, r58, r4),
    SFIXED32_LIST_PACKED(45, r58, r1),
    SFIXED64_LIST_PACKED(46, r58, r60),
    SINT32_LIST_PACKED(47, r58, r1),
    SINT64_LIST_PACKED(48, r3, r60),
    GROUP_LIST(49, r65, r66),
    MAP(50, b.MAP, b0.VOID);
    

    /* renamed from: i0  reason: collision with root package name */
    private static final u[] f7241i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    private static final Type[] f7243j0 = null;

    /* renamed from: e  reason: collision with root package name */
    private final b0 f7261e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7262f;

    /* renamed from: g  reason: collision with root package name */
    private final b f7263g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f7264h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7265i;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7266a = null;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f7267b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.b0[] r0 = com.google.crypto.tink.shaded.protobuf.b0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7267b = r0
                r1 = 1
                com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.b0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7267b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.b0 r3 = com.google.crypto.tink.shaded.protobuf.b0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f7267b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.b0 r4 = com.google.crypto.tink.shaded.protobuf.b0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.crypto.tink.shaded.protobuf.u$b[] r3 = com.google.crypto.tink.shaded.protobuf.u.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f7266a = r3
                com.google.crypto.tink.shaded.protobuf.u$b r4 = com.google.crypto.tink.shaded.protobuf.u.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f7266a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.crypto.tink.shaded.protobuf.u$b r3 = com.google.crypto.tink.shaded.protobuf.u.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f7266a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.crypto.tink.shaded.protobuf.u$b r1 = com.google.crypto.tink.shaded.protobuf.u.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u.a.<clinit>():void");
        }
    }

    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: e  reason: collision with root package name */
        private final boolean f7273e;

        private b(boolean z10) {
            this.f7273e = z10;
        }
    }

    static {
        f7243j0 = new Type[0];
        u[] values = values();
        f7241i0 = new u[values.length];
        for (u uVar : values) {
            f7241i0[uVar.f7262f] = uVar;
        }
    }

    private u(int i10, b bVar, b0 b0Var) {
        int i11;
        this.f7262f = i10;
        this.f7263g = bVar;
        this.f7261e = b0Var;
        int i12 = a.f7266a[bVar.ordinal()];
        boolean z10 = true;
        this.f7264h = (i12 == 1 || i12 == 2) ? b0Var.a() : null;
        this.f7265i = (bVar != b.SCALAR || (i11 = a.f7267b[b0Var.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : z10;
    }

    public int a() {
        return this.f7262f;
    }
}
