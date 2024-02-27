package f6;

import com.google.crypto.tink.shaded.protobuf.z;

public enum i0 implements z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: l  reason: collision with root package name */
    private static final z.b f11378l = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f11380e;

    class a implements z.b {
        a() {
        }
    }

    static {
        f11378l = new a();
    }

    private i0(int i10) {
        this.f11380e = i10;
    }

    public static i0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f11380e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
