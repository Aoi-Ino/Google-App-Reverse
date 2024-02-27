package p7;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class c implements Closeable, Flushable {

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f14741n = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f14742o = new String[128];

    /* renamed from: p  reason: collision with root package name */
    private static final String[] f14743p;

    /* renamed from: e  reason: collision with root package name */
    private final Writer f14744e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f14745f = new int[32];

    /* renamed from: g  reason: collision with root package name */
    private int f14746g = 0;

    /* renamed from: h  reason: collision with root package name */
    private String f14747h;

    /* renamed from: i  reason: collision with root package name */
    private String f14748i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14749j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14750k;

    /* renamed from: l  reason: collision with root package name */
    private String f14751l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14752m;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f14742o[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f14742o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f14743p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        Z(6);
        this.f14748i = ":";
        this.f14752m = true;
        Objects.requireNonNull(writer, "out == null");
        this.f14744e = writer;
    }

    private static boolean B(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void B0(String str) {
        String str2;
        String[] strArr = this.f14750k ? f14743p : f14742o;
        this.f14744e.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                this.f14744e.write(str, i10, i11 - i10);
            }
            this.f14744e.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f14744e.write(str, i10, length - i10);
        }
        this.f14744e.write(34);
    }

    private void H() {
        if (this.f14747h != null) {
            this.f14744e.write(10);
            int i10 = this.f14746g;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f14744e.write(this.f14747h);
            }
        }
    }

    private void I0() {
        if (this.f14751l != null) {
            c();
            B0(this.f14751l);
            this.f14751l = null;
        }
    }

    private c X(int i10, char c10) {
        e();
        Z(i10);
        this.f14744e.write(c10);
        return this;
    }

    private int Y() {
        int i10 = this.f14746g;
        if (i10 != 0) {
            return this.f14745f[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void Z(int i10) {
        int i11 = this.f14746g;
        int[] iArr = this.f14745f;
        if (i11 == iArr.length) {
            this.f14745f = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f14745f;
        int i12 = this.f14746g;
        this.f14746g = i12 + 1;
        iArr2[i12] = i10;
    }

    private void c() {
        int Y = Y();
        if (Y == 5) {
            this.f14744e.write(44);
        } else if (Y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        H();
        c0(4);
    }

    private void c0(int i10) {
        this.f14745f[this.f14746g - 1] = i10;
    }

    private void e() {
        int Y = Y();
        if (Y == 1) {
            c0(2);
        } else if (Y == 2) {
            this.f14744e.append(',');
        } else if (Y != 4) {
            if (Y != 6) {
                if (Y != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f14749j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            c0(7);
            return;
        } else {
            this.f14744e.append(this.f14748i);
            c0(5);
            return;
        }
        H();
    }

    private c h(int i10, int i11, char c10) {
        int Y = Y();
        if (Y != i11 && Y != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f14751l == null) {
            this.f14746g--;
            if (Y == i11) {
                H();
            }
            this.f14744e.write(c10);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f14751l);
        }
    }

    public final void A0(boolean z10) {
        this.f14752m = z10;
    }

    public c C0(double d10) {
        I0();
        if (this.f14749j || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            e();
            this.f14744e.append(Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c D0(long j10) {
        I0();
        e();
        this.f14744e.write(Long.toString(j10));
        return this;
    }

    public c E(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f14751l != null) {
            throw new IllegalStateException();
        } else if (this.f14746g != 0) {
            this.f14751l = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c E0(Boolean bool) {
        if (bool == null) {
            return R();
        }
        I0();
        e();
        this.f14744e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c F0(Number number) {
        if (number == null) {
            return R();
        }
        I0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!B(cls) && !f14741n.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f14749j) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        e();
        this.f14744e.append(obj);
        return this;
    }

    public c G0(String str) {
        if (str == null) {
            return R();
        }
        I0();
        e();
        B0(str);
        return this;
    }

    public c H0(boolean z10) {
        I0();
        e();
        this.f14744e.write(z10 ? "true" : "false");
        return this;
    }

    public c R() {
        if (this.f14751l != null) {
            if (this.f14752m) {
                I0();
            } else {
                this.f14751l = null;
                return this;
            }
        }
        e();
        this.f14744e.write("null");
        return this;
    }

    public void close() {
        this.f14744e.close();
        int i10 = this.f14746g;
        if (i10 > 1 || (i10 == 1 && this.f14745f[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f14746g = 0;
    }

    public c f() {
        I0();
        return X(1, '[');
    }

    public void flush() {
        if (this.f14746g != 0) {
            this.f14744e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g() {
        I0();
        return X(3, '{');
    }

    public final void i0(boolean z10) {
        this.f14750k = z10;
    }

    public final void j0(String str) {
        String str2;
        if (str.length() == 0) {
            this.f14747h = null;
            str2 = ":";
        } else {
            this.f14747h = str;
            str2 = ": ";
        }
        this.f14748i = str2;
    }

    public c l() {
        return h(1, 2, ']');
    }

    public c n() {
        return h(3, 5, '}');
    }

    public final boolean o() {
        return this.f14752m;
    }

    public final boolean s() {
        return this.f14750k;
    }

    public final void s0(boolean z10) {
        this.f14749j = z10;
    }

    public boolean y() {
        return this.f14749j;
    }
}
