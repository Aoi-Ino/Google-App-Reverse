package ln;

import java.util.Arrays;
import java.util.Objects;

public abstract class b {

    /* renamed from: h  reason: collision with root package name */
    protected static final kn.a f25048h = kn.a.LENIENT;

    /* renamed from: i  reason: collision with root package name */
    static final byte[] f25049i = {13, 10};

    /* renamed from: a  reason: collision with root package name */
    protected final byte f25050a = 61;

    /* renamed from: b  reason: collision with root package name */
    protected final byte f25051b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25052c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25053d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f25054e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25055f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.a f25056g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f25057a;

        /* renamed from: b  reason: collision with root package name */
        long f25058b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f25059c;

        /* renamed from: d  reason: collision with root package name */
        int f25060d;

        /* renamed from: e  reason: collision with root package name */
        int f25061e;

        /* renamed from: f  reason: collision with root package name */
        boolean f25062f;

        /* renamed from: g  reason: collision with root package name */
        int f25063g;

        /* renamed from: h  reason: collision with root package name */
        int f25064h;

        a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{getClass().getSimpleName(), Arrays.toString(this.f25059c), Integer.valueOf(this.f25063g), Boolean.valueOf(this.f25062f), Integer.valueOf(this.f25057a), Long.valueOf(this.f25058b), Integer.valueOf(this.f25064h), Integer.valueOf(this.f25060d), Integer.valueOf(this.f25061e)});
        }
    }

    protected b(int i10, int i11, int i12, int i13, byte b10, kn.a aVar) {
        this.f25052c = i10;
        this.f25053d = i11;
        this.f25054e = (i12 <= 0 || i13 <= 0) ? 0 : (i12 / i11) * i11;
        this.f25055f = i13;
        this.f25051b = b10;
        Objects.requireNonNull(aVar, "codecPolicy");
        this.f25056g = aVar;
    }

    private static int b(int i10, int i11) {
        return Integer.compare(i10 - 2147483648, i11 - 2147483648);
    }

    private static int d(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i10) & 4294967295L));
        } else if (i10 > 2147483639) {
            return i10;
        } else {
            return 2147483639;
        }
    }

    private static byte[] m(a aVar, int i10) {
        int length = aVar.f25059c.length * 2;
        if (b(length, i10) < 0) {
            length = i10;
        }
        if (b(length, 2147483639) > 0) {
            length = d(i10);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = aVar.f25059c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        aVar.f25059c = bArr;
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public int a(a aVar) {
        if (aVar.f25059c != null) {
            return aVar.f25060d - aVar.f25061e;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (this.f25051b == b10 || k(b10)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract void e(byte[] bArr, int i10, int i11, a aVar);

    public byte[] f(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : g(bArr, 0, bArr.length);
    }

    public byte[] g(byte[] bArr, int i10, int i11) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        e(bArr, i10, i11, aVar);
        e(bArr, i10, -1, aVar);
        int i12 = aVar.f25060d - aVar.f25061e;
        byte[] bArr2 = new byte[i12];
        l(bArr2, 0, i12, aVar);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    public byte[] h(int i10, a aVar) {
        byte[] bArr = aVar.f25059c;
        if (bArr == null) {
            aVar.f25059c = new byte[Math.max(i10, i())];
            aVar.f25060d = 0;
            aVar.f25061e = 0;
        } else {
            int i11 = aVar.f25060d;
            if ((i11 + i10) - bArr.length > 0) {
                return m(aVar, i11 + i10);
            }
        }
        return aVar.f25059c;
    }

    /* access modifiers changed from: protected */
    public int i() {
        return 8192;
    }

    public long j(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f25052c;
        long j10 = ((long) (((length + i10) - 1) / i10)) * ((long) this.f25053d);
        int i11 = this.f25054e;
        return i11 > 0 ? j10 + ((((((long) i11) + j10) - 1) / ((long) i11)) * ((long) this.f25055f)) : j10;
    }

    /* access modifiers changed from: protected */
    public abstract boolean k(byte b10);

    /* access modifiers changed from: package-private */
    public int l(byte[] bArr, int i10, int i11, a aVar) {
        if (aVar.f25059c == null) {
            return aVar.f25062f ? -1 : 0;
        }
        int min = Math.min(a(aVar), i11);
        System.arraycopy(aVar.f25059c, aVar.f25061e, bArr, i10, min);
        int i12 = aVar.f25061e + min;
        aVar.f25061e = i12;
        if (i12 >= aVar.f25060d) {
            aVar.f25059c = null;
        }
        return min;
    }
}
