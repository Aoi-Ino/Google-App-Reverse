package zo;

import java.math.BigInteger;
import java.security.SecureRandom;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final BigInteger f33332a = BigInteger.valueOf(0);

    /* renamed from: b  reason: collision with root package name */
    private static final BigInteger f33333b = BigInteger.valueOf(1);

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger f33334c = BigInteger.valueOf(2);

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f33335d = BigInteger.valueOf(4);

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f33336e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* renamed from: f  reason: collision with root package name */
    private static SecureRandom f33337f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f33338g = {0, 1, 0, -1, 0, -1, 0, 1};

    public static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 < 0) {
            i10 = -i10;
        }
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 8;
        }
        return i11;
    }
}
