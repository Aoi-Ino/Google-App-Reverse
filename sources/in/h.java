package in;

import cm.g;
import cm.l;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import jn.b;

public class h implements Serializable, Comparable {

    /* renamed from: h  reason: collision with root package name */
    public static final h f24467h = new h(new byte[0]);

    /* renamed from: i  reason: collision with root package name */
    public static final a f24468i = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private transient int f24469e;

    /* renamed from: f  reason: collision with root package name */
    private transient String f24470f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f24471g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ h e(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return aVar.d(bArr, i10, i11);
        }

        public final h a(String str) {
            l.f(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((b.e(str.charAt(i11)) << 4) + b.e(str.charAt(i11 + 1)));
                }
                return new h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final h b(String str, Charset charset) {
            l.f(str, "$this$encode");
            l.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new h(bytes);
        }

        public final h c(String str) {
            l.f(str, "$this$encodeUtf8");
            h hVar = new h(b.a(str));
            hVar.o(str);
            return hVar;
        }

        public final h d(byte[] bArr, int i10, int i11) {
            l.f(bArr, "$this$toByteString");
            c.b((long) bArr.length, (long) i10, (long) i11);
            return new h(l.h(bArr, i10, i11 + i10));
        }
    }

    public h(byte[] bArr) {
        l.f(bArr, "data");
        this.f24471g = bArr;
    }

    public String a() {
        return a.b(e(), (byte[]) null, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 < r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(in.h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            cm.l.f(r10, r0)
            int r0 = r9.q()
            int r1 = r10.q()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002e
            byte r7 = r9.d(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.d(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x002c
        L_0x002a:
            r3 = r5
            goto L_0x0034
        L_0x002c:
            r3 = r6
            goto L_0x0034
        L_0x002e:
            if (r0 != r1) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            if (r0 >= r1) goto L_0x002c
            goto L_0x002a
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: in.h.compareTo(in.h):int");
    }

    public h c(String str) {
        l.f(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f24471g);
        l.e(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new h(digest);
    }

    public final byte d(int i10) {
        return k(i10);
    }

    public final byte[] e() {
        return this.f24471g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.q() == e().length && hVar.m(0, e(), 0, e().length)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f24469e;
    }

    public int g() {
        return e().length;
    }

    public final String h() {
        return this.f24470f;
    }

    public int hashCode() {
        int f10 = f();
        if (f10 != 0) {
            return f10;
        }
        int hashCode = Arrays.hashCode(e());
        n(hashCode);
        return hashCode;
    }

    public String i() {
        char[] cArr = new char[(e().length * 2)];
        int i10 = 0;
        for (byte b10 : e()) {
            int i11 = i10 + 1;
            cArr[i10] = b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = b.f()[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] j() {
        return e();
    }

    public byte k(int i10) {
        return e()[i10];
    }

    public boolean l(int i10, h hVar, int i11, int i12) {
        l.f(hVar, "other");
        return hVar.m(i11, e(), i10, i12);
    }

    public boolean m(int i10, byte[] bArr, int i11, int i12) {
        l.f(bArr, "other");
        return i10 >= 0 && i10 <= e().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && c.a(e(), i10, bArr, i11, i12);
    }

    public final void n(int i10) {
        this.f24469e = i10;
    }

    public final void o(String str) {
        this.f24470f = str;
    }

    public h p() {
        return c("SHA-256");
    }

    public final int q() {
        return g();
    }

    public final boolean r(h hVar) {
        l.f(hVar, "prefix");
        return l(0, hVar, 0, hVar.q());
    }

    public h s() {
        byte b10;
        int i10 = 0;
        while (i10 < e().length) {
            byte b11 = e()[i10];
            byte b12 = (byte) 65;
            if (b11 < b12 || b11 > (b10 = (byte) 90)) {
                i10++;
            } else {
                byte[] e10 = e();
                byte[] copyOf = Arrays.copyOf(e10, e10.length);
                l.e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new h(copyOf);
            }
        }
        return this;
    }

    public String t() {
        String h10 = h();
        if (h10 != null) {
            return h10;
        }
        String b10 = b.b(j());
        o(b10);
        return b10;
    }

    public String toString() {
        StringBuilder sb2;
        StringBuilder sb3;
        if (e().length == 0) {
            return "[size=0]";
        }
        int a10 = b.c(e(), 64);
        if (a10 != -1) {
            String t10 = t();
            if (t10 != null) {
                String substring = t10.substring(0, a10);
                l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String w10 = p.w(p.w(p.w(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a10 < t10.length()) {
                    sb3 = new StringBuilder();
                    sb3.append("[size=");
                    sb3.append(e().length);
                    sb3.append(" text=");
                    sb3.append(w10);
                    sb3.append("…]");
                    return sb3.toString();
                }
                sb2 = new StringBuilder();
                sb2.append("[text=");
                sb2.append(w10);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else if (e().length <= 64) {
            sb2 = new StringBuilder();
            sb2.append("[hex=");
            sb2.append(i());
        } else {
            sb3 = new StringBuilder();
            sb3.append("[size=");
            sb3.append(e().length);
            sb3.append(" hex=");
            if (64 <= e().length) {
                sb3.append((64 == e().length ? this : new h(l.h(e(), 0, 64))).i());
                sb3.append("…]");
                return sb3.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + e().length + ')').toString());
        }
        sb3.append(']');
        return sb3.toString();
    }

    public void u(e eVar, int i10, int i11) {
        l.f(eVar, "buffer");
        b.d(this, eVar, i10, i11);
    }
}
