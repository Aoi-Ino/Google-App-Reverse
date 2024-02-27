package y1;

import cm.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f18463a = a(new byte[]{102, 114, 101, 101});

    /* renamed from: b  reason: collision with root package name */
    private static final int f18464b = a(new byte[]{106, 117, 110, 107});

    /* renamed from: c  reason: collision with root package name */
    private static final int f18465c = a(new byte[]{109, 100, 97, 116});

    /* renamed from: d  reason: collision with root package name */
    private static final int f18466d = a(new byte[]{109, 111, 111, 118});

    /* renamed from: e  reason: collision with root package name */
    private static final int f18467e = a(new byte[]{112, 110, 111, 116});

    /* renamed from: f  reason: collision with root package name */
    private static final int f18468f = a(new byte[]{115, 107, 105, 112});

    /* renamed from: g  reason: collision with root package name */
    private static final int f18469g = a(new byte[]{119, 105, 100, 101});

    /* renamed from: h  reason: collision with root package name */
    private static final int f18470h = a(new byte[]{80, 73, 67, 84});

    /* renamed from: i  reason: collision with root package name */
    private static final int f18471i = a(new byte[]{102, 116, 121, 112});

    /* renamed from: j  reason: collision with root package name */
    private static final int f18472j = a(new byte[]{117, 117, 105, 100});

    /* renamed from: k  reason: collision with root package name */
    private static final int f18473k = a(new byte[]{99, 109, 111, 118});

    /* renamed from: l  reason: collision with root package name */
    private static final int f18474l = a(new byte[]{115, 116, 99, 111});

    /* renamed from: m  reason: collision with root package name */
    private static final int f18475m = a(new byte[]{99, 111, 54, 52});

    public static final int a(byte[] bArr) {
        l.f(bArr, "byteArray");
        return ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static final int b() {
        return f18473k;
    }

    public static final int c() {
        return f18475m;
    }

    public static final int d() {
        return f18463a;
    }

    public static final int e() {
        return f18471i;
    }

    public static final int f() {
        return f18464b;
    }

    public static final int g() {
        return f18465c;
    }

    public static final int h() {
        return f18466d;
    }

    public static final int i() {
        return f18470h;
    }

    public static final int j() {
        return f18467e;
    }

    public static final int k() {
        return f18468f;
    }

    public static final int l() {
        return f18474l;
    }

    public static final int m() {
        return f18472j;
    }

    public static final int n() {
        return f18469g;
    }
}
