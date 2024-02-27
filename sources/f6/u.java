package f6;

import com.google.crypto.tink.shaded.protobuf.z;

public enum u implements z.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: l  reason: collision with root package name */
    private static final z.b f11401l = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f11403e;

    class a implements z.b {
        a() {
        }
    }

    static {
        f11401l = new a();
    }

    private u(int i10) {
        this.f11403e = i10;
    }

    public static u a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 != 4) {
            return null;
        }
        return SHA512;
    }
}
