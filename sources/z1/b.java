package z1;

public abstract class b {
    public static final int a(double d10, double d11) {
        return b(c.a((d10 * d11) / ((double) 16)) * 16);
    }

    private static final int b(int i10) {
        return (i10 + 1) & -2;
    }

    public static final int c(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new Exception("uInt32 value is too large");
    }

    public static final int d(long j10) {
        if (j10 <= 2147483647L && j10 >= 0) {
            return (int) j10;
        }
        throw new Exception("uInt32 value is too large");
    }

    public static final long e(int i10) {
        return (long) i10;
    }

    public static final long f(long j10) {
        if (j10 >= 0) {
            return j10;
        }
        throw new Exception("uInt64 value is too large");
    }
}
