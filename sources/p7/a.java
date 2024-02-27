package p7;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import k7.f;

public class a implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private final Reader f14715e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14716f = false;

    /* renamed from: g  reason: collision with root package name */
    private final char[] f14717g = new char[1024];

    /* renamed from: h  reason: collision with root package name */
    private int f14718h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f14719i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f14720j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f14721k = 0;

    /* renamed from: l  reason: collision with root package name */
    int f14722l = 0;

    /* renamed from: m  reason: collision with root package name */
    private long f14723m;

    /* renamed from: n  reason: collision with root package name */
    private int f14724n;

    /* renamed from: o  reason: collision with root package name */
    private String f14725o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f14726p;

    /* renamed from: q  reason: collision with root package name */
    private int f14727q;

    /* renamed from: r  reason: collision with root package name */
    private String[] f14728r;

    /* renamed from: s  reason: collision with root package name */
    private int[] f14729s;

    /* renamed from: p7.a$a  reason: collision with other inner class name */
    class C0199a extends f {
        C0199a() {
        }

        public void a(a aVar) {
            int i10;
            int i11 = aVar.f14722l;
            if (i11 == 0) {
                i11 = aVar.h();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else if (i11 == 14) {
                i10 = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.D0() + aVar.R());
            }
            aVar.f14722l = i10;
        }
    }

    static {
        f.f13055a = new C0199a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f14726p = iArr;
        this.f14727q = 1;
        iArr[0] = 6;
        this.f14728r = new String[32];
        this.f14729s = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f14715e = reader;
    }

    private String A0(char c10) {
        char[] cArr = this.f14717g;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f14718h;
            int i11 = this.f14719i;
            int i12 = i10;
            while (true) {
                if (i10 < i11) {
                    int i13 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f14718h = i13;
                        int i14 = (i13 - i12) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i12, i14);
                        }
                        sb2.append(cArr, i12, i14);
                        return sb2.toString();
                    } else if (c11 == '\\') {
                        this.f14718h = i13;
                        int i15 = i13 - i12;
                        int i16 = i15 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i15 * 2, 16));
                        }
                        sb2.append(cArr, i12, i16);
                        sb2.append(H0());
                    } else {
                        if (c11 == 10) {
                            this.f14720j++;
                            this.f14721k = i13;
                        }
                        i10 = i13;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i10 - i12) * 2, 16));
                    }
                    sb2.append(cArr, i12, i10 - i12);
                    this.f14718h = i10;
                    if (!o(1)) {
                        throw O0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String C0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f14718h
            int r4 = r3 + r2
            int r5 = r6.f14719i
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f14717g
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.f()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f14717g
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.o(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f14717g
            int r4 = r6.f14718h
            r0.append(r3, r4, r2)
            int r3 = r6.f14718h
            int r3 = r3 + r2
            r6.f14718h = r3
            r2 = 1
            boolean r2 = r6.o(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f14717g
            int r3 = r6.f14718h
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f14717g
            int r3 = r6.f14718h
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f14718h
            int r2 = r2 + r1
            r6.f14718h = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.C0():java.lang.String");
    }

    private int E0() {
        int i10;
        String str;
        String str2;
        char c10 = this.f14717g[this.f14718h];
        if (c10 == 't' || c10 == 'T') {
            str2 = "true";
            str = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str2 = "false";
            str = "FALSE";
            i10 = 6;
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i10 = 7;
        }
        int length = str2.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f14718h + i11 >= this.f14719i && !o(i11 + 1)) {
                return 0;
            }
            char c11 = this.f14717g[this.f14718h + i11];
            if (c11 != str2.charAt(i11) && c11 != str.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f14718h + length < this.f14719i || o(length + 1)) && H(this.f14717g[this.f14718h + length])) {
            return 0;
        }
        this.f14718h += length;
        this.f14722l = i10;
        return i10;
    }

    private int F0() {
        int i10;
        char c10;
        char c11;
        char[] cArr = this.f14717g;
        int i11 = this.f14718h;
        int i12 = this.f14719i;
        int i13 = 0;
        int i14 = 0;
        char c12 = 0;
        boolean z10 = false;
        boolean z11 = true;
        long j10 = 0;
        while (true) {
            if (i11 + i14 == i12) {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!o(i14 + 1)) {
                    break;
                }
                i11 = this.f14718h;
                i12 = this.f14719i;
            }
            c10 = cArr[i11 + i14];
            if (c10 == '+') {
                c11 = 6;
                i13 = 0;
                if (c12 != 5) {
                    return 0;
                }
            } else if (c10 == 'E' || c10 == 'e') {
                i13 = 0;
                if (c12 != 2 && c12 != 4) {
                    return 0;
                }
                c12 = 5;
                i14++;
            } else if (c10 != '-') {
                c11 = 3;
                if (c10 == '.') {
                    i13 = 0;
                    if (c12 != 2) {
                        return 0;
                    }
                } else if (c10 >= '0' && c10 <= '9') {
                    if (c12 == 1 || c12 == 0) {
                        j10 = (long) (-(c10 - '0'));
                        c12 = 2;
                    } else if (c12 != 2) {
                        if (c12 == 3) {
                            i13 = 0;
                            c12 = 4;
                        } else if (c12 == 5 || c12 == 6) {
                            i13 = 0;
                            c12 = 7;
                        }
                        i14++;
                    } else if (j10 == 0) {
                        return 0;
                    } else {
                        long j11 = (10 * j10) - ((long) (c10 - '0'));
                        int i15 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                        z11 &= i15 > 0 || (i15 == 0 && j11 < j10);
                        j10 = j11;
                    }
                    i13 = 0;
                    i14++;
                }
            } else {
                c11 = 6;
                i13 = 0;
                if (c12 == 0) {
                    c12 = 1;
                    z10 = true;
                    i14++;
                } else if (c12 != 5) {
                    return 0;
                }
            }
            c12 = c11;
            i14++;
        }
        if (H(c10)) {
            return 0;
        }
        if (c12 == 2 && z11 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f14723m = j10;
            this.f14718h += i14;
            i10 = 15;
        } else if (c12 != 2 && c12 != 4 && c12 != 7) {
            return 0;
        } else {
            this.f14724n = i14;
            i10 = 16;
        }
        this.f14722l = i10;
        return i10;
    }

    private void G0(int i10) {
        int i11 = this.f14727q;
        int[] iArr = this.f14726p;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f14726p = Arrays.copyOf(iArr, i12);
            this.f14729s = Arrays.copyOf(this.f14729s, i12);
            this.f14728r = (String[]) Arrays.copyOf(this.f14728r, i12);
        }
        int[] iArr2 = this.f14726p;
        int i13 = this.f14727q;
        this.f14727q = i13 + 1;
        iArr2[i13] = i10;
    }

    private boolean H(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    private char H0() {
        int i10;
        if (this.f14718h != this.f14719i || o(1)) {
            char[] cArr = this.f14717g;
            int i11 = this.f14718h;
            int i12 = i11 + 1;
            this.f14718h = i12;
            char c10 = cArr[i11];
            if (c10 == 10) {
                this.f14720j++;
                this.f14721k = i12;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    throw O0("Invalid escape sequence");
                } else if (i11 + 5 <= this.f14719i || o(4)) {
                    int i13 = this.f14718h;
                    int i14 = i13 + 4;
                    char c11 = 0;
                    while (i13 < i14) {
                        char c12 = this.f14717g[i13];
                        char c13 = (char) (c11 << 4);
                        if (c12 >= '0' && c12 <= '9') {
                            i10 = c12 - '0';
                        } else if (c12 >= 'a' && c12 <= 'f') {
                            i10 = c12 - 'W';
                        } else if (c12 < 'A' || c12 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f14717g, this.f14718h, 4));
                        } else {
                            i10 = c12 - '7';
                        }
                        c11 = (char) (c13 + i10);
                        i13++;
                    }
                    this.f14718h += 4;
                    return c11;
                } else {
                    throw O0("Unterminated escape sequence");
                }
            }
            return c10;
        }
        throw O0("Unterminated escape sequence");
    }

    private void J0(char c10) {
        char[] cArr = this.f14717g;
        while (true) {
            int i10 = this.f14718h;
            int i11 = this.f14719i;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f14718h = i12;
                        return;
                    } else if (c11 == '\\') {
                        this.f14718h = i12;
                        H0();
                        break;
                    } else {
                        if (c11 == 10) {
                            this.f14720j++;
                            this.f14721k = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f14718h = i10;
                    if (!o(1)) {
                        throw O0("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean K0(String str) {
        int length = str.length();
        while (true) {
            int i10 = 0;
            if (this.f14718h + length > this.f14719i && !o(length)) {
                return false;
            }
            char[] cArr = this.f14717g;
            int i11 = this.f14718h;
            if (cArr[i11] == 10) {
                this.f14720j++;
                this.f14721k = i11 + 1;
            } else {
                while (i10 < length) {
                    if (this.f14717g[this.f14718h + i10] == str.charAt(i10)) {
                        i10++;
                    }
                }
                return true;
            }
            this.f14718h++;
        }
    }

    private void L0() {
        char c10;
        do {
            if (this.f14718h < this.f14719i || o(1)) {
                char[] cArr = this.f14717g;
                int i10 = this.f14718h;
                int i11 = i10 + 1;
                this.f14718h = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f14720j++;
                    this.f14721k = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f14718h
            int r2 = r1 + r0
            int r3 = r4.f14719i
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f14717g
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.f()
        L_0x004b:
            int r1 = r4.f14718h
            int r1 = r1 + r0
            r4.f14718h = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f14718h = r1
            r0 = 1
            boolean r0 = r4.o(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.M0():void");
    }

    private IOException O0(String str) {
        throw new d(str + R());
    }

    private void f() {
        if (!this.f14716f) {
            throw O0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void g() {
        j0(true);
        int i10 = this.f14718h;
        this.f14718h = i10 - 1;
        if (i10 + 4 <= this.f14719i || o(5)) {
            int i11 = this.f14718h;
            char[] cArr = this.f14717g;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == 10) {
                this.f14718h = i11 + 5;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r5 != '/') goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r8.f14718h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r8.f14718h = r1;
        r1 = o(2);
        r8.f14718h++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r1 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        f();
        r1 = r8.f14718h;
        r2 = r0[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r2 == '*') goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r2 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r8.f14718h = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        r8.f14718h = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (K0("*/") == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        throw O0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r8.f14718h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (r5 != '#') goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int j0(boolean r9) {
        /*
            r8 = this;
            char[] r0 = r8.f14717g
        L_0x0002:
            int r1 = r8.f14718h
        L_0x0004:
            int r2 = r8.f14719i
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r8.f14718h = r1
            boolean r1 = r8.o(r3)
            if (r1 != 0) goto L_0x0030
            if (r9 != 0) goto L_0x0015
            r9 = -1
            return r9
        L_0x0015:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r8.R()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0030:
            int r1 = r8.f14718h
            int r2 = r8.f14719i
        L_0x0034:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L_0x0044
            int r1 = r8.f14720j
            int r1 = r1 + r3
            r8.f14720j = r1
            r8.f14721k = r4
            goto L_0x00a1
        L_0x0044:
            r6 = 32
            if (r5 == r6) goto L_0x00a1
            r6 = 13
            if (r5 == r6) goto L_0x00a1
            r6 = 9
            if (r5 != r6) goto L_0x0051
            goto L_0x00a1
        L_0x0051:
            r6 = 47
            if (r5 != r6) goto L_0x0096
            r8.f14718h = r4
            r7 = 2
            if (r4 != r2) goto L_0x0068
            r8.f14718h = r1
            boolean r1 = r8.o(r7)
            int r2 = r8.f14718h
            int r2 = r2 + r3
            r8.f14718h = r2
            if (r1 != 0) goto L_0x0068
            return r5
        L_0x0068:
            r8.f()
            int r1 = r8.f14718h
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L_0x007e
            if (r2 == r6) goto L_0x0076
            return r5
        L_0x0076:
            int r1 = r1 + 1
            r8.f14718h = r1
        L_0x007a:
            r8.L0()
            goto L_0x0002
        L_0x007e:
            int r1 = r1 + 1
            r8.f14718h = r1
            java.lang.String r1 = "*/"
            boolean r1 = r8.K0(r1)
            if (r1 == 0) goto L_0x008f
            int r1 = r8.f14718h
            int r1 = r1 + r7
            goto L_0x0004
        L_0x008f:
            java.lang.String r9 = "Unterminated comment"
            java.io.IOException r9 = r8.O0(r9)
            throw r9
        L_0x0096:
            r1 = 35
            r8.f14718h = r4
            if (r5 != r1) goto L_0x00a0
            r8.f()
            goto L_0x007a
        L_0x00a0:
            return r5
        L_0x00a1:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.j0(boolean):int");
    }

    private boolean o(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f14717g;
        int i13 = this.f14721k;
        int i14 = this.f14718h;
        this.f14721k = i13 - i14;
        int i15 = this.f14719i;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f14719i = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f14719i = 0;
        }
        this.f14718h = 0;
        do {
            Reader reader = this.f14715e;
            int i17 = this.f14719i;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f14719i + read;
            this.f14719i = i11;
            if (this.f14720j == 0 && (i12 = this.f14721k) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f14718h++;
                this.f14721k = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private String s(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f14727q;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f14726p[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f14729s[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb2.append('[');
                sb2.append(i13);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f14728r[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public boolean B() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public String B0() {
        String str;
        char c10;
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 10) {
            str = C0();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.f14725o;
                this.f14725o = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f14723m);
            } else if (i10 == 16) {
                str = new String(this.f14717g, this.f14718h, this.f14724n);
                this.f14718h += this.f14724n;
            } else {
                throw new IllegalStateException("Expected a string but was " + D0() + R());
            }
            str = A0(c10);
        }
        this.f14722l = 0;
        int[] iArr = this.f14729s;
        int i11 = this.f14727q - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public b D0() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final boolean E() {
        return this.f14716f;
    }

    public final void I0(boolean z10) {
        this.f14716f = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r7.f14727q--;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r7.f14722l = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N0() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.f14722l
            if (r2 != 0) goto L_0x000a
            int r2 = r7.h()
        L_0x000a:
            r3 = 39
            r4 = 34
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x006a;
                case 2: goto L_0x005f;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x006f
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.f14718h
            int r3 = r7.f14724n
            int r2 = r2 + r3
            r7.f14718h = r2
            goto L_0x006f
        L_0x001e:
            r7.M0()
            if (r1 != 0) goto L_0x006f
            java.lang.String[] r2 = r7.f14728r
            int r3 = r7.f14727q
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x006f
        L_0x002b:
            r7.J0(r4)
            if (r1 != 0) goto L_0x006f
            java.lang.String[] r2 = r7.f14728r
            int r3 = r7.f14727q
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x006f
        L_0x0038:
            r7.J0(r3)
            if (r1 != 0) goto L_0x006f
            java.lang.String[] r2 = r7.f14728r
            int r3 = r7.f14727q
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x006f
        L_0x0045:
            r7.M0()
            goto L_0x006f
        L_0x0049:
            r7.J0(r4)
            goto L_0x006f
        L_0x004d:
            r7.J0(r3)
            goto L_0x006f
        L_0x0051:
            int r2 = r7.f14727q
            int r2 = r2 - r6
            r7.f14727q = r2
            int r1 = r1 + -1
            goto L_0x006f
        L_0x0059:
            r7.G0(r6)
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x005f:
            if (r1 != 0) goto L_0x0051
            java.lang.String[] r2 = r7.f14728r
            int r3 = r7.f14727q
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
            goto L_0x0051
        L_0x006a:
            r2 = 3
            r7.G0(r2)
            goto L_0x005c
        L_0x006f:
            r7.f14722l = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.f14729s
            int r1 = r7.f14727q
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.N0():void");
    }

    /* access modifiers changed from: package-private */
    public String R() {
        return " at line " + (this.f14720j + 1) + " column " + ((this.f14718h - this.f14721k) + 1) + " path " + b();
    }

    public boolean X() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 5) {
            this.f14722l = 0;
            int[] iArr = this.f14729s;
            int i11 = this.f14727q - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f14722l = 0;
            int[] iArr2 = this.f14729s;
            int i12 = this.f14727q - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + D0() + R());
        }
    }

    public double Y() {
        String A0;
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            this.f14722l = 0;
            int[] iArr = this.f14729s;
            int i11 = this.f14727q - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f14723m;
        }
        if (i10 == 16) {
            this.f14725o = new String(this.f14717g, this.f14718h, this.f14724n);
            this.f14718h += this.f14724n;
        } else {
            if (i10 == 8 || i10 == 9) {
                A0 = A0(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                A0 = C0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + D0() + R());
            }
            this.f14725o = A0;
        }
        this.f14722l = 11;
        double parseDouble = Double.parseDouble(this.f14725o);
        if (this.f14716f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f14725o = null;
            this.f14722l = 0;
            int[] iArr2 = this.f14729s;
            int i12 = this.f14727q - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + R());
    }

    public int Z() {
        String A0;
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            long j10 = this.f14723m;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f14722l = 0;
                int[] iArr = this.f14729s;
                int i12 = this.f14727q - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f14723m + R());
        }
        if (i10 == 16) {
            this.f14725o = new String(this.f14717g, this.f14718h, this.f14724n);
            this.f14718h += this.f14724n;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                A0 = C0();
            } else {
                A0 = A0(i10 == 8 ? '\'' : '\"');
            }
            this.f14725o = A0;
            try {
                int parseInt = Integer.parseInt(this.f14725o);
                this.f14722l = 0;
                int[] iArr2 = this.f14729s;
                int i13 = this.f14727q - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + D0() + R());
        }
        this.f14722l = 11;
        double parseDouble = Double.parseDouble(this.f14725o);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.f14725o = null;
            this.f14722l = 0;
            int[] iArr3 = this.f14729s;
            int i15 = this.f14727q - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f14725o + R());
    }

    public String b() {
        return s(false);
    }

    public void c() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 3) {
            G0(1);
            this.f14729s[this.f14727q - 1] = 0;
            this.f14722l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + D0() + R());
    }

    public long c0() {
        String A0;
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            this.f14722l = 0;
            int[] iArr = this.f14729s;
            int i11 = this.f14727q - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f14723m;
        }
        if (i10 == 16) {
            this.f14725o = new String(this.f14717g, this.f14718h, this.f14724n);
            this.f14718h += this.f14724n;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                A0 = C0();
            } else {
                A0 = A0(i10 == 8 ? '\'' : '\"');
            }
            this.f14725o = A0;
            try {
                long parseLong = Long.parseLong(this.f14725o);
                this.f14722l = 0;
                int[] iArr2 = this.f14729s;
                int i12 = this.f14727q - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + D0() + R());
        }
        this.f14722l = 11;
        double parseDouble = Double.parseDouble(this.f14725o);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.f14725o = null;
            this.f14722l = 0;
            int[] iArr3 = this.f14729s;
            int i13 = this.f14727q - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f14725o + R());
    }

    public void close() {
        this.f14722l = 0;
        this.f14726p[0] = 8;
        this.f14727q = 1;
        this.f14715e.close();
    }

    public void e() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 1) {
            G0(3);
            this.f14722l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + D0() + R());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h() {
        /*
            r15 = this;
            int[] r0 = r15.f14726p
            int r1 = r15.f14727q
            int r2 = r1 + -1
            r2 = r0[r2]
            r3 = 39
            r4 = 34
            r5 = 8
            r6 = 3
            r7 = 93
            r8 = 7
            r9 = 59
            r10 = 44
            r11 = 4
            r12 = 2
            r13 = 1
            if (r2 != r13) goto L_0x0020
            int r1 = r1 - r13
            r0[r1] = r12
            goto L_0x00a2
        L_0x0020:
            if (r2 != r12) goto L_0x003a
            int r0 = r15.j0(r13)
            if (r0 == r10) goto L_0x00a2
            if (r0 == r9) goto L_0x0036
            if (r0 != r7) goto L_0x002f
            r15.f14722l = r11
            return r11
        L_0x002f:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.O0(r0)
            throw r0
        L_0x0036:
            r15.f()
            goto L_0x00a2
        L_0x003a:
            r14 = 5
            if (r2 == r6) goto L_0x0117
            if (r2 != r14) goto L_0x0041
            goto L_0x0117
        L_0x0041:
            if (r2 != r11) goto L_0x0076
            int r1 = r1 - r13
            r0[r1] = r14
            int r0 = r15.j0(r13)
            r1 = 58
            if (r0 == r1) goto L_0x00a2
            r1 = 61
            if (r0 != r1) goto L_0x006f
            r15.f()
            int r0 = r15.f14718h
            int r1 = r15.f14719i
            if (r0 < r1) goto L_0x0061
            boolean r0 = r15.o(r13)
            if (r0 == 0) goto L_0x00a2
        L_0x0061:
            char[] r0 = r15.f14717g
            int r1 = r15.f14718h
            char r0 = r0[r1]
            r14 = 62
            if (r0 != r14) goto L_0x00a2
            int r1 = r1 + r13
            r15.f14718h = r1
            goto L_0x00a2
        L_0x006f:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.O0(r0)
            throw r0
        L_0x0076:
            r0 = 6
            if (r2 != r0) goto L_0x0088
            boolean r0 = r15.f14716f
            if (r0 == 0) goto L_0x0080
            r15.g()
        L_0x0080:
            int[] r0 = r15.f14726p
            int r1 = r15.f14727q
            int r1 = r1 - r13
            r0[r1] = r8
            goto L_0x00a2
        L_0x0088:
            if (r2 != r8) goto L_0x00a0
            r0 = 0
            int r0 = r15.j0(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0097
            r0 = 17
        L_0x0094:
            r15.f14722l = r0
            return r0
        L_0x0097:
            r15.f()
            int r0 = r15.f14718h
            int r0 = r0 - r13
            r15.f14718h = r0
            goto L_0x00a2
        L_0x00a0:
            if (r2 == r5) goto L_0x010f
        L_0x00a2:
            int r0 = r15.j0(r13)
            if (r0 == r4) goto L_0x010c
            if (r0 == r3) goto L_0x0106
            if (r0 == r10) goto L_0x00ef
            if (r0 == r9) goto L_0x00ef
            r1 = 91
            if (r0 == r1) goto L_0x00ec
            if (r0 == r7) goto L_0x00e7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00e4
            int r0 = r15.f14718h
            int r0 = r0 - r13
            r15.f14718h = r0
            int r0 = r15.E0()
            if (r0 == 0) goto L_0x00c4
            return r0
        L_0x00c4:
            int r0 = r15.F0()
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            char[] r0 = r15.f14717g
            int r1 = r15.f14718h
            char r0 = r0[r1]
            boolean r0 = r15.H(r0)
            if (r0 == 0) goto L_0x00dd
            r15.f()
            r0 = 10
            goto L_0x0094
        L_0x00dd:
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.O0(r0)
            throw r0
        L_0x00e4:
            r15.f14722l = r13
            return r13
        L_0x00e7:
            if (r2 != r13) goto L_0x00ef
            r15.f14722l = r11
            return r11
        L_0x00ec:
            r15.f14722l = r6
            return r6
        L_0x00ef:
            if (r2 == r13) goto L_0x00fb
            if (r2 != r12) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.O0(r0)
            throw r0
        L_0x00fb:
            r15.f()
            int r0 = r15.f14718h
            int r0 = r0 - r13
            r15.f14718h = r0
            r15.f14722l = r8
            return r8
        L_0x0106:
            r15.f()
            r15.f14722l = r5
            return r5
        L_0x010c:
            r0 = 9
            goto L_0x0094
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x0117:
            int r1 = r1 - r13
            r0[r1] = r11
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 != r14) goto L_0x0135
            int r1 = r15.j0(r13)
            if (r1 == r10) goto L_0x0135
            if (r1 == r9) goto L_0x0132
            if (r1 != r0) goto L_0x012b
            r15.f14722l = r12
            return r12
        L_0x012b:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.O0(r0)
            throw r0
        L_0x0132:
            r15.f()
        L_0x0135:
            int r1 = r15.j0(r13)
            if (r1 == r4) goto L_0x016a
            if (r1 == r3) goto L_0x0163
            java.lang.String r3 = "Expected name"
            if (r1 == r0) goto L_0x0159
            r15.f()
            int r0 = r15.f14718h
            int r0 = r0 - r13
            r15.f14718h = r0
            char r0 = (char) r1
            boolean r0 = r15.H(r0)
            if (r0 == 0) goto L_0x0154
            r0 = 14
            goto L_0x0094
        L_0x0154:
            java.io.IOException r0 = r15.O0(r3)
            throw r0
        L_0x0159:
            if (r2 == r14) goto L_0x015e
            r15.f14722l = r12
            return r12
        L_0x015e:
            java.io.IOException r0 = r15.O0(r3)
            throw r0
        L_0x0163:
            r15.f()
            r0 = 12
            goto L_0x0094
        L_0x016a:
            r0 = 13
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.h():int");
    }

    public String i0() {
        String str;
        char c10;
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 14) {
            str = C0();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 == 13) {
                c10 = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + D0() + R());
            }
            str = A0(c10);
        }
        this.f14722l = 0;
        this.f14728r[this.f14727q - 1] = str;
        return str;
    }

    public void l() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 4) {
            int i11 = this.f14727q;
            this.f14727q = i11 - 1;
            int[] iArr = this.f14729s;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f14722l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + D0() + R());
    }

    public void n() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 2) {
            int i11 = this.f14727q;
            int i12 = i11 - 1;
            this.f14727q = i12;
            this.f14728r[i12] = null;
            int[] iArr = this.f14729s;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f14722l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + D0() + R());
    }

    public void s0() {
        int i10 = this.f14722l;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 7) {
            this.f14722l = 0;
            int[] iArr = this.f14729s;
            int i11 = this.f14727q - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + D0() + R());
    }

    public String toString() {
        return getClass().getSimpleName() + R();
    }

    public String y() {
        return s(true);
    }
}
