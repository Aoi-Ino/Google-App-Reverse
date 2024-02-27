package f6;

import com.google.crypto.tink.shaded.protobuf.z;

public enum z implements z.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: k  reason: collision with root package name */
    private static final z.b f11422k = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f11424e;

    class a implements z.b {
        a() {
        }
    }

    static {
        f11422k = new a();
    }

    private z(int i10) {
        this.f11424e = i10;
    }

    public static z a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f11424e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
