package e8;

import a8.g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public abstract class c {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f10179p = {0, 383, 8192, 8303, 8352, 8399, 64256, 64262};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f10180q = {0, 127, 1536, 1663, 8352, 8399, 64336, 64511, 65136, 65279};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f10181r = {0, 127, 1424, 1535, 8352, 8399, 64285, 64335};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f10182s = {0, 127, 1024, 1327, 8192, 8303, 8352, 8399};

    /* renamed from: t  reason: collision with root package name */
    protected static HashMap f10183t = new HashMap();

    /* renamed from: u  reason: collision with root package name */
    protected static final HashMap f10184u;

    /* renamed from: a  reason: collision with root package name */
    protected ArrayList f10185a;

    /* renamed from: b  reason: collision with root package name */
    int f10186b;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f10187c = new int[256];

    /* renamed from: d  reason: collision with root package name */
    protected String[] f10188d = new String[256];

    /* renamed from: e  reason: collision with root package name */
    protected char[] f10189e = new char[256];

    /* renamed from: f  reason: collision with root package name */
    protected int[][] f10190f = new int[256][];

    /* renamed from: g  reason: collision with root package name */
    protected String f10191g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f10192h;

    /* renamed from: i  reason: collision with root package name */
    protected int f10193i = -1;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f10194j = true;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f10195k = false;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f10196l = false;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f10197m = true;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f10198n = false;

    /* renamed from: o  reason: collision with root package name */
    protected s f10199o;

    static class a extends x1 {
        public a(byte[] bArr, String str, int i10) {
            try {
                this.f10819e = bArr;
                r(c1.f10358m5, new f1(bArr.length));
                if (str != null) {
                    r(c1.f10492w9, new c1(str));
                }
                v(i10);
            } catch (Exception e10) {
                throw new g(e10);
            }
        }

        public a(byte[] bArr, int[] iArr, int i10) {
            try {
                this.f10819e = bArr;
                r(c1.f10358m5, new f1(bArr.length));
                int i11 = 0;
                while (i11 < iArr.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Length");
                    int i12 = i11 + 1;
                    sb2.append(i12);
                    r(new c1(sb2.toString()), new f1(iArr[i11]));
                    i11 = i12;
                }
                v(i10);
            } catch (Exception e10) {
                throw new g(e10);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f10184u = hashMap;
        hashMap.put("Courier", c1.f10432s1);
        hashMap.put("Courier-Bold", c1.f10445t1);
        hashMap.put("Courier-BoldOblique", c1.f10471v1);
        hashMap.put("Courier-Oblique", c1.f10458u1);
        hashMap.put("Helvetica", c1.f10318j4);
        hashMap.put("Helvetica-Bold", c1.f10331k4);
        hashMap.put("Helvetica-BoldOblique", c1.f10357m4);
        hashMap.put("Helvetica-Oblique", c1.f10344l4);
        hashMap.put("Symbol", c1.A9);
        hashMap.put("Times-Roman", c1.Q9);
        hashMap.put("Times-Bold", c1.R9);
        hashMap.put("Times-BoldItalic", c1.T9);
        hashMap.put("Times-Italic", c1.S9);
        hashMap.put("ZapfDingbats", c1.Fb);
    }

    protected c() {
    }

    protected static String A(String str) {
        if (str.equals("winansi") || str.equals("")) {
            return "Cp1252";
        }
        return str.equals("macroman") ? "MacRoman" : str;
    }

    public static c d(String str, String str2, boolean z10) {
        return f(str, str2, z10, true, (byte[]) null, (byte[]) null, false);
    }

    public static c e(String str, String str2, boolean z10, boolean z11, byte[] bArr, byte[] bArr2) {
        return f(str, str2, z10, z11, bArr, bArr2, false);
    }

    public static c f(String str, String str2, boolean z10, boolean z11, byte[] bArr, byte[] bArr2, boolean z12) {
        return g(str, str2, z10, z11, bArr, bArr2, z12, false);
    }

    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r1v11, types: [e8.j2] */
    /* JADX WARNING: type inference failed for: r1v12, types: [e8.h2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e8.c g(java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, byte[] r12, byte[] r13, boolean r14, boolean r15) {
        /*
            java.lang.String r0 = i(r8)
            java.lang.String r9 = A(r9)
            java.util.HashMap r1 = f10184u
            boolean r1 = r1.containsKey(r8)
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r3 = r2
            goto L_0x0017
        L_0x0013:
            boolean r3 = e8.i.M(r0, r9)
        L_0x0017:
            if (r1 != 0) goto L_0x0031
            if (r3 == 0) goto L_0x001c
            goto L_0x0031
        L_0x001c:
            java.lang.String r2 = "Identity-H"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x002f
            java.lang.String r2 = "Identity-V"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r4 = r10
            goto L_0x0032
        L_0x002f:
            r10 = 1
            goto L_0x002d
        L_0x0031:
            r4 = r2
        L_0x0032:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r2 = "\n"
            r10.append(r2)
            r10.append(r9)
            java.lang.String r2 = "\n"
            r10.append(r2)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            if (r11 == 0) goto L_0x0062
            java.util.HashMap r2 = f10183t
            monitor-enter(r2)
            java.util.HashMap r5 = f10183t     // Catch:{ all -> 0x005f }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ all -> 0x005f }
            e8.c r5 = (e8.c) r5     // Catch:{ all -> 0x005f }
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x0062
            return r5
        L_0x005f:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            throw r8
        L_0x0062:
            if (r1 != 0) goto L_0x00f1
            java.lang.String r1 = r8.toLowerCase()
            java.lang.String r2 = ".afm"
            boolean r1 = r1.endsWith(r2)
            if (r1 != 0) goto L_0x00f1
            java.lang.String r1 = r8.toLowerCase()
            java.lang.String r2 = ".pfm"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L_0x007e
            goto L_0x00f1
        L_0x007e:
            java.lang.String r13 = r0.toLowerCase()
            java.lang.String r1 = ".ttf"
            boolean r13 = r13.endsWith(r1)
            if (r13 != 0) goto L_0x00c0
            java.lang.String r13 = r0.toLowerCase()
            java.lang.String r1 = ".otf"
            boolean r13 = r13.endsWith(r1)
            if (r13 != 0) goto L_0x00c0
            java.lang.String r13 = r0.toLowerCase()
            java.lang.String r0 = ".ttc,"
            int r13 = r13.indexOf(r0)
            if (r13 <= 0) goto L_0x00a3
            goto L_0x00c0
        L_0x00a3:
            if (r3 == 0) goto L_0x00ac
            e8.i r12 = new e8.i
            r12.<init>(r8, r9, r4)
            goto L_0x0105
        L_0x00ac:
            if (r14 == 0) goto L_0x00b0
            r8 = 0
            return r8
        L_0x00b0:
            a8.g r10 = new a8.g
            java.lang.String r11 = "font.1.with.2.is.not.recognized"
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            java.lang.String r8 = b8.a.b(r11, r8)
            r10.<init>((java.lang.String) r8)
            throw r10
        L_0x00c0:
            java.lang.String r13 = "Identity-H"
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x00e6
            java.lang.String r13 = "Identity-V"
            boolean r13 = r9.equals(r13)
            if (r13 == 0) goto L_0x00d1
            goto L_0x00e6
        L_0x00d1:
            e8.h2 r13 = new e8.h2
            r6 = 0
            r1 = r13
            r2 = r8
            r3 = r9
            r5 = r12
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = "Cp1252"
            boolean r8 = r9.equals(r8)
            r13.f10198n = r8
        L_0x00e4:
            r12 = r13
            goto L_0x0105
        L_0x00e6:
            e8.j2 r13 = new e8.j2
            r1 = r13
            r2 = r8
            r3 = r9
            r5 = r12
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00e4
        L_0x00f1:
            e8.k2 r14 = new e8.k2
            r1 = r14
            r2 = r8
            r3 = r9
            r5 = r12
            r6 = r13
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = "Cp1252"
            boolean r8 = r9.equals(r8)
            r14.f10198n = r8
            r12 = r14
        L_0x0105:
            if (r11 == 0) goto L_0x0121
            java.util.HashMap r8 = f10183t
            monitor-enter(r8)
            java.util.HashMap r9 = f10183t     // Catch:{ all -> 0x0116 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0116 }
            e8.c r9 = (e8.c) r9     // Catch:{ all -> 0x0116 }
            if (r9 == 0) goto L_0x0118
            monitor-exit(r8)     // Catch:{ all -> 0x0116 }
            return r9
        L_0x0116:
            r9 = move-exception
            goto L_0x011f
        L_0x0118:
            java.util.HashMap r9 = f10183t     // Catch:{ all -> 0x0116 }
            r9.put(r10, r12)     // Catch:{ all -> 0x0116 }
            monitor-exit(r8)     // Catch:{ all -> 0x0116 }
            goto L_0x0121
        L_0x011f:
            monitor-exit(r8)     // Catch:{ all -> 0x0116 }
            throw r9
        L_0x0121:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.c.g(java.lang.String, java.lang.String, boolean, boolean, byte[], byte[], boolean, boolean):e8.c");
    }

    public static String h() {
        StringBuilder sb2 = new StringBuilder("");
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) ((int) ((Math.random() * 26.0d) + 65.0d)));
        }
        return sb2 + "+";
    }

    protected static String i(String str) {
        int length;
        if (str.endsWith(",Bold")) {
            length = str.length() - 5;
        } else if (str.endsWith(",Italic")) {
            length = str.length() - 7;
        } else if (!str.endsWith(",BoldItalic")) {
            return str;
        } else {
            length = str.length() - 11;
        }
        return str.substring(0, length);
    }

    public static InputStream q(String str) {
        return r(str, (ClassLoader) null);
    }

    public static InputStream r(String str, ClassLoader classLoader) {
        InputStream inputStream;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (classLoader != null) {
            inputStream = classLoader.getResourceAsStream(str);
            if (inputStream != null) {
                return inputStream;
            }
        } else {
            inputStream = null;
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                inputStream = contextClassLoader.getResourceAsStream(str);
            }
        } catch (Throwable unused) {
        }
        if (inputStream == null) {
            inputStream = c.class.getResourceAsStream("/" + str);
        }
        return inputStream == null ? ClassLoader.getSystemResourceAsStream(str) : inputStream;
    }

    /* access modifiers changed from: package-private */
    public abstract void B(c2 c2Var, x0 x0Var, Object[] objArr);

    /* access modifiers changed from: package-private */
    public byte[] a(int i10) {
        char c10;
        String str;
        if (this.f10196l) {
            c10 = (char) i10;
            str = null;
        } else {
            s sVar = this.f10199o;
            if (sVar == null) {
                c10 = (char) i10;
                str = this.f10191g;
            } else if (!sVar.a(i10)) {
                return new byte[0];
            } else {
                return new byte[]{(byte) this.f10199o.b(i10)};
            }
        }
        return o0.b(c10, str);
    }

    /* access modifiers changed from: package-private */
    public byte[] b(String str) {
        if (this.f10196l) {
            return o0.c(str, (String) null);
        }
        if (this.f10199o == null) {
            return o0.c(str, this.f10191g);
        }
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (this.f10199o.a(charAt)) {
                bArr[i10] = (byte) this.f10199o.b(charAt);
                i10++;
            }
        }
        if (i10 >= length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    public void c() {
        int i10 = 0;
        if (this.f10191g.startsWith("#")) {
            this.f10199o = new s();
            StringTokenizer stringTokenizer = new StringTokenizer(this.f10191g.substring(1), " ,\t\n\r\f");
            if (stringTokenizer.nextToken().equals("full")) {
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    String nextToken2 = stringTokenizer.nextToken();
                    char parseInt = (char) Integer.parseInt(stringTokenizer.nextToken(), 16);
                    int charAt = (nextToken.startsWith("'") ? nextToken.charAt(1) : Integer.parseInt(nextToken)) % 256;
                    this.f10199o.d(parseInt, charAt);
                    this.f10188d[charAt] = nextToken2;
                    this.f10189e[charAt] = parseInt;
                    this.f10187c[charAt] = p(parseInt, nextToken2);
                    this.f10190f[charAt] = o(parseInt, nextToken2);
                }
            } else {
                int parseInt2 = stringTokenizer.hasMoreTokens() ? Integer.parseInt(stringTokenizer.nextToken()) : 0;
                while (stringTokenizer.hasMoreTokens() && parseInt2 < 256) {
                    int parseInt3 = Integer.parseInt(stringTokenizer.nextToken(), 16) % 65536;
                    String b10 = q.b(parseInt3);
                    if (b10 != null) {
                        this.f10199o.d(parseInt3, parseInt2);
                        this.f10188d[parseInt2] = b10;
                        this.f10189e[parseInt2] = (char) parseInt3;
                        this.f10187c[parseInt2] = p(parseInt3, b10);
                        this.f10190f[parseInt2] = o(parseInt3, b10);
                        parseInt2++;
                    }
                }
            }
            while (i10 < 256) {
                String[] strArr = this.f10188d;
                if (strArr[i10] == null) {
                    strArr[i10] = ".notdef";
                }
                i10++;
            }
        } else if (this.f10194j) {
            while (i10 < 256) {
                this.f10187c[i10] = p(i10, (String) null);
                this.f10190f[i10] = o(i10, (String) null);
                i10++;
            }
        } else {
            byte[] bArr = new byte[1];
            for (int i11 = 0; i11 < 256; i11++) {
                bArr[0] = (byte) i11;
                String d10 = o0.d(bArr, this.f10191g);
                char charAt2 = d10.length() > 0 ? d10.charAt(0) : '?';
                String b11 = q.b(charAt2);
                if (b11 == null) {
                    b11 = ".notdef";
                }
                this.f10188d[i11] = b11;
                this.f10189e[i11] = charAt2;
                this.f10187c[i11] = p(charAt2, b11);
                this.f10190f[i11] = o(charAt2, b11);
            }
        }
    }

    public String j() {
        return this.f10191g;
    }

    public abstract String[][] k();

    public abstract float l(int i10, float f10);

    public int m() {
        return this.f10186b;
    }

    public abstract String n();

    /* access modifiers changed from: protected */
    public abstract int[] o(int i10, String str);

    /* access modifiers changed from: package-private */
    public abstract int p(int i10, String str);

    /* access modifiers changed from: package-private */
    public char s(int i10) {
        return this.f10189e[i10];
    }

    public int t(int i10) {
        return i10;
    }

    public int u(int i10) {
        if (this.f10198n) {
            return (i10 < 128 || (i10 >= 160 && i10 <= 255)) ? this.f10187c[i10] : this.f10187c[o0.f10964c.b(i10)];
        }
        byte[] a10 = a((char) i10);
        int i11 = 0;
        for (byte b10 : a10) {
            i11 += this.f10187c[b10 & 255];
        }
        return i11;
    }

    public int v(String str) {
        int i10 = 0;
        if (this.f10198n) {
            int length = str.length();
            int i11 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                i11 += (charAt < 128 || (charAt >= 160 && charAt <= 255)) ? this.f10187c[charAt] : this.f10187c[o0.f10964c.b(charAt)];
                i10++;
            }
            return i11;
        }
        byte[] b10 = b(str);
        int i12 = 0;
        while (i10 < b10.length) {
            i12 += this.f10187c[b10[i10] & 255];
            i10++;
        }
        return i12;
    }

    public float w(int i10, float f10) {
        return ((float) u(i10)) * 0.001f * f10;
    }

    public float x(String str, float f10) {
        return ((float) v(str)) * 0.001f * f10;
    }

    public boolean y() {
        return this.f10192h;
    }

    public boolean z() {
        return this.f10194j;
    }
}
