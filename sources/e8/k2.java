package e8;

import a8.f;
import a8.g;
import e8.c;
import f8.a;
import java.util.HashMap;
import java.util.StringTokenizer;

class k2 extends c {
    private static a U;
    private static final int[] V = {1, 2, 1};
    private float A = 0.0f;
    private boolean B = false;
    private String C;
    private int D = -50;
    private int E = -200;
    private int F = 1000;
    private int G = 900;
    private int H = -100;
    private int I = 50;
    private String J = "FontSpecific";
    private int K = 700;
    private int L = 480;
    private int M = 800;
    private int N = -200;
    private int O;
    private int P = 80;
    private HashMap Q = new HashMap();
    private HashMap R = new HashMap();
    private String S;
    private boolean T = false;

    /* renamed from: v  reason: collision with root package name */
    protected byte[] f10863v;

    /* renamed from: w  reason: collision with root package name */
    private String f10864w;

    /* renamed from: x  reason: collision with root package name */
    private String f10865x;

    /* renamed from: y  reason: collision with root package name */
    private String f10866y;

    /* renamed from: z  reason: collision with root package name */
    private String f10867z = "";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: e8.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: e8.f2} */
    /* JADX WARNING: type inference failed for: r1v5, types: [e8.f2] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:20|21|(2:22|(1:102)(2:43|44))|24|25|26|27|28|29|30|31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        r4 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00c6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9 A[SYNTHETIC, Splitter:B:37:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fb A[SYNTHETIC, Splitter:B:48:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0196 A[SYNTHETIC, Splitter:B:96:0x0196] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    k2(java.lang.String r4, java.lang.String r5, boolean r6, byte[] r7, byte[] r8, boolean r9) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.f10867z = r0
            r0 = 0
            r3.A = r0
            r0 = 0
            r3.B = r0
            r1 = -50
            r3.D = r1
            r1 = -200(0xffffffffffffff38, float:NaN)
            r3.E = r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r3.F = r2
            r2 = 900(0x384, float:1.261E-42)
            r3.G = r2
            r2 = -100
            r3.H = r2
            r2 = 50
            r3.I = r2
            java.lang.String r2 = "FontSpecific"
            r3.J = r2
            r2 = 700(0x2bc, float:9.81E-43)
            r3.K = r2
            r2 = 480(0x1e0, float:6.73E-43)
            r3.L = r2
            r2 = 800(0x320, float:1.121E-42)
            r3.M = r2
            r3.N = r1
            r1 = 80
            r3.P = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.Q = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.R = r1
            r3.T = r0
            if (r6 == 0) goto L_0x0060
            if (r7 == 0) goto L_0x0060
            if (r8 == 0) goto L_0x0052
            goto L_0x0060
        L_0x0052:
            a8.g r4 = new a8.g
            java.lang.String r5 = "two.byte.arrays.are.needed.if.the.type1.font.is.embedded"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r5 = b8.a.b(r5, r6)
            r4.<init>((java.lang.String) r5)
            throw r4
        L_0x0060:
            if (r6 == 0) goto L_0x0066
            if (r7 == 0) goto L_0x0066
            r3.f10863v = r8
        L_0x0066:
            r3.f10191g = r5
            r3.f10192h = r6
            r3.S = r4
            r3.f10186b = r0
            java.util.HashMap r6 = e8.c.f10184u
            boolean r6 = r6.containsKey(r4)
            java.lang.String r8 = ".afm"
            r1 = 0
            if (r6 == 0) goto L_0x00ff
            r3.f10192h = r0
            r6 = 1
            r3.T = r6
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]
            f8.a r7 = U     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x0090
            f8.a r7 = new f8.a     // Catch:{ all -> 0x008e }
            r7.<init>()     // Catch:{ all -> 0x008e }
            U = r7     // Catch:{ all -> 0x008e }
            goto L_0x0090
        L_0x008e:
            r4 = move-exception
            goto L_0x00f9
        L_0x0090:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r7.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r9 = "com/itextpdf/text/pdf/fonts/"
            r7.append(r9)     // Catch:{ all -> 0x008e }
            r7.append(r4)     // Catch:{ all -> 0x008e }
            r7.append(r8)     // Catch:{ all -> 0x008e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x008e }
            f8.a r8 = U     // Catch:{ all -> 0x008e }
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x008e }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x008e }
            java.io.InputStream r7 = e8.c.r(r7, r8)     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x00e4
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00dd }
            r4.<init>()     // Catch:{ all -> 0x00dd }
        L_0x00b9:
            int r8 = r7.read(r6)     // Catch:{ all -> 0x00dd }
            if (r8 >= 0) goto L_0x00e0
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x00dd }
            r7.close()     // Catch:{ Exception -> 0x00c6 }
        L_0x00c6:
            e8.f2 r6 = new e8.f2     // Catch:{ all -> 0x00d6 }
            r6.<init>((byte[]) r4)     // Catch:{ all -> 0x00d6 }
            r3.F(r6)     // Catch:{ all -> 0x00d3 }
            r6.close()     // Catch:{ Exception -> 0x0162 }
            goto L_0x0162
        L_0x00d3:
            r4 = move-exception
            r1 = r6
            goto L_0x00d7
        L_0x00d6:
            r4 = move-exception
        L_0x00d7:
            if (r1 == 0) goto L_0x00dc
            r1.close()     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            throw r4
        L_0x00dd:
            r4 = move-exception
            r1 = r7
            goto L_0x00f9
        L_0x00e0:
            r4.write(r6, r0, r8)     // Catch:{ all -> 0x00dd }
            goto L_0x00b9
        L_0x00e4:
            java.lang.String r5 = "1.not.found.as.resource"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = b8.a.b(r5, r4)     // Catch:{ all -> 0x00dd }
            java.io.PrintStream r5 = java.lang.System.err     // Catch:{ all -> 0x00dd }
            r5.println(r4)     // Catch:{ all -> 0x00dd }
            a8.g r5 = new a8.g     // Catch:{ all -> 0x00dd }
            r5.<init>((java.lang.String) r4)     // Catch:{ all -> 0x00dd }
            throw r5     // Catch:{ all -> 0x00dd }
        L_0x00f9:
            if (r1 == 0) goto L_0x00fe
            r1.close()     // Catch:{ Exception -> 0x00fe }
        L_0x00fe:
            throw r4
        L_0x00ff:
            java.lang.String r6 = r4.toLowerCase()
            boolean r6 = r6.endsWith(r8)
            if (r6 == 0) goto L_0x0129
            if (r7 != 0) goto L_0x0116
            e8.f2 r6 = new e8.f2     // Catch:{ all -> 0x0114 }
            boolean r7 = a8.f.f266q     // Catch:{ all -> 0x0114 }
            r6.<init>(r4, r9, r7)     // Catch:{ all -> 0x0114 }
            r1 = r6
            goto L_0x011c
        L_0x0114:
            r4 = move-exception
            goto L_0x0123
        L_0x0116:
            e8.f2 r4 = new e8.f2     // Catch:{ all -> 0x0114 }
            r4.<init>((byte[]) r7)     // Catch:{ all -> 0x0114 }
            r1 = r4
        L_0x011c:
            r3.F(r1)     // Catch:{ all -> 0x0114 }
            r1.close()     // Catch:{ Exception -> 0x0162 }
            goto L_0x0162
        L_0x0123:
            if (r1 == 0) goto L_0x0128
            r1.close()     // Catch:{ Exception -> 0x0128 }
        L_0x0128:
            throw r4
        L_0x0129:
            java.lang.String r6 = r4.toLowerCase()
            java.lang.String r8 = ".pfm"
            boolean r6 = r6.endsWith(r8)
            if (r6 == 0) goto L_0x019a
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0145 }
            r6.<init>()     // Catch:{ all -> 0x0145 }
            if (r7 != 0) goto L_0x0147
            e8.f2 r7 = new e8.f2     // Catch:{ all -> 0x0145 }
            boolean r8 = a8.f.f266q     // Catch:{ all -> 0x0145 }
            r7.<init>(r4, r9, r8)     // Catch:{ all -> 0x0145 }
            r1 = r7
            goto L_0x014d
        L_0x0145:
            r4 = move-exception
            goto L_0x0194
        L_0x0147:
            e8.f2 r4 = new e8.f2     // Catch:{ all -> 0x0145 }
            r4.<init>((byte[]) r7)     // Catch:{ all -> 0x0145 }
            r1 = r4
        L_0x014d:
            e8.e2.a(r1, r6)     // Catch:{ all -> 0x0145 }
            r1.close()     // Catch:{ all -> 0x0145 }
            e8.f2 r4 = new e8.f2     // Catch:{ all -> 0x0145 }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x0145 }
            r4.<init>((byte[]) r6)     // Catch:{ all -> 0x0145 }
            r3.F(r4)     // Catch:{ all -> 0x0191 }
            r4.close()     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            java.lang.String r4 = r3.J
            java.lang.String r4 = r4.trim()
            r3.J = r4
            java.lang.String r6 = "AdobeStandardEncoding"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x017c
            java.lang.String r4 = r3.J
            java.lang.String r6 = "StandardEncoding"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x017e
        L_0x017c:
            r3.f10194j = r0
        L_0x017e:
            java.lang.String r4 = r3.f10191g
            java.lang.String r6 = "#"
            boolean r4 = r4.startsWith(r6)
            if (r4 != 0) goto L_0x018d
            java.lang.String r4 = " "
            e8.o0.c(r4, r5)
        L_0x018d:
            r3.c()
            return
        L_0x0191:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L_0x0194:
            if (r1 == 0) goto L_0x0199
            r1.close()     // Catch:{ Exception -> 0x0199 }
        L_0x0199:
            throw r4
        L_0x019a:
            a8.g r5 = new a8.g
            java.lang.String r6 = "1.is.not.an.afm.or.pfm.font.file"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = b8.a.b(r6, r4)
            r5.<init>((java.lang.String) r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.k2.<init>(java.lang.String, java.lang.String, boolean, byte[], byte[], boolean):void");
    }

    private l0 C(x0 x0Var, int i10, int i11, byte[] bArr) {
        c1 c1Var;
        i1 i1Var;
        l0 l0Var = new l0(c1.f10473v3);
        l0Var.r(c1.f10492w9, c1.f10480va);
        l0Var.r(c1.Z, new c1(this.f10864w));
        boolean z10 = this.f10191g.equals("Cp1252") || this.f10191g.equals("MacRoman");
        if (!this.f10194j || this.f10199o != null) {
            int i12 = i10;
            while (true) {
                if (i12 > i11) {
                    break;
                } else if (!this.f10188d[i12].equals(".notdef")) {
                    i10 = i12;
                    break;
                } else {
                    i12++;
                }
            }
            if (z10) {
                c1Var = c1.F2;
                i1Var = this.f10191g.equals("Cp1252") ? c1.f10364mb : c1.C5;
            } else {
                l0 l0Var2 = new l0(c1.F2);
                b0 b0Var = new b0();
                boolean z11 = true;
                for (int i13 = i10; i13 <= i11; i13++) {
                    if (bArr[i13] != 0) {
                        if (z11) {
                            b0Var.m(new f1(i13));
                            z11 = false;
                        }
                        b0Var.m(new c1(this.f10188d[i13]));
                    } else {
                        z11 = true;
                    }
                }
                l0Var2.r(c1.f10217b2, b0Var);
                c1Var = c1.F2;
                i1Var = l0Var2;
            }
            l0Var.r(c1Var, i1Var);
        }
        if (this.f10199o != null || this.f10195k || !this.T || (!this.f10194j && !z10)) {
            l0Var.r(c1.f10266f3, new f1(i10));
            l0Var.r(c1.f10293h5, new f1(i11));
            b0 b0Var2 = new b0();
            while (i10 <= i11) {
                b0Var2.m(bArr[i10] == 0 ? new f1(0) : new f1(this.f10187c[i10]));
                i10++;
            }
            l0Var.r(c1.f10338kb, b0Var2);
        }
        if (!this.T && x0Var != null) {
            l0Var.r(c1.f10499x3, x0Var);
        }
        return l0Var;
    }

    private l0 D(x0 x0Var) {
        if (this.T) {
            return null;
        }
        l0 l0Var = new l0(c1.f10499x3);
        l0Var.r(c1.O, new f1(this.M));
        l0Var.r(c1.E0, new f1(this.K));
        l0Var.r(c1.T1, new f1(this.N));
        l0Var.r(c1.f10486w3, new t1((float) this.D, (float) this.E, (float) this.F, (float) this.G));
        l0Var.r(c1.C3, new c1(this.f10864w));
        l0Var.r(c1.R4, new f1(this.A));
        l0Var.r(c1.f10336k9, new f1(this.P));
        if (x0Var != null) {
            l0Var.r(c1.f10512y3, x0Var);
        }
        boolean z10 = this.B | (this.f10194j ? 4 : ' ');
        if (this.A < 0.0f) {
            z10 |= true;
        }
        if (this.f10864w.indexOf("Caps") >= 0 || this.f10864w.endsWith("SC")) {
            z10 |= true;
        }
        if (this.f10867z.equals("Bold")) {
            z10 |= true;
        }
        l0Var.r(c1.f10408q3, new f1(z10 ? 1 : 0));
        return l0Var;
    }

    /* access modifiers changed from: package-private */
    public void B(c2 c2Var, x0 x0Var, Object[] objArr) {
        int i10 = 0;
        int intValue = objArr[0].intValue();
        int intValue2 = objArr[1].intValue();
        byte[] bArr = objArr[2];
        if (!objArr[3].booleanValue() || !this.f10197m) {
            intValue2 = bArr.length - 1;
            for (int i11 = 0; i11 < bArr.length; i11++) {
                bArr[i11] = 1;
            }
        } else {
            i10 = intValue;
        }
        x1 E2 = E();
        x0 a10 = E2 != null ? c2Var.n(E2).a() : null;
        l0 D2 = D(a10);
        if (D2 != null) {
            a10 = c2Var.n(D2).a();
        }
        c2Var.o(C(a10, i10, intValue2, bArr), x0Var);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [e8.x1, e8.f2] */
    public x1 E() {
        ? r12 = 0;
        if (this.T || !this.f10192h) {
            return r12;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String str = this.S;
            int i10 = 0;
            sb2.append(str.substring(0, str.length() - 3));
            sb2.append("pfb");
            String sb3 = sb2.toString();
            byte[] bArr = this.f10863v;
            f2 f2Var = bArr == null ? new f2(sb3, true, f.f266q) : new f2(bArr);
            byte[] bArr2 = new byte[(f2Var.e() - 18)];
            int[] iArr = new int[3];
            int i11 = 0;
            while (i10 < 3) {
                if (f2Var.read() != 128) {
                    throw new g(b8.a.b("start.marker.missing.in.1", sb3));
                } else if (f2Var.read() == V[i10]) {
                    int read = f2Var.read() + (f2Var.read() << 8) + (f2Var.read() << 16) + (f2Var.read() << 24);
                    iArr[i10] = read;
                    while (read != 0) {
                        int read2 = f2Var.read(bArr2, i11, read);
                        if (read2 >= 0) {
                            i11 += read2;
                            read -= read2;
                        } else {
                            throw new g(b8.a.b("premature.end.in.1", sb3));
                        }
                    }
                    i10++;
                } else {
                    throw new g(b8.a.b("incorrect.segment.type.in.1", sb3));
                }
            }
            c.a aVar = new c.a(bArr2, iArr, this.f10193i);
            try {
                f2Var.close();
            } catch (Exception unused) {
            }
            return aVar;
        } catch (Exception e10) {
            throw new g(e10);
        } catch (Throwable th2) {
            if (r12 != 0) {
                try {
                    r12.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    public void F(f2 f2Var) {
        boolean z10;
        Object[] objArr;
        while (true) {
            String readLine = f2Var.readLine();
            if (readLine == null) {
                z10 = false;
                break;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ,\n\r\t\f");
            if (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.equals("FontName")) {
                    this.f10864w = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (nextToken.equals("FullName")) {
                    this.f10865x = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (nextToken.equals("FamilyName")) {
                    this.f10866y = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (nextToken.equals("Weight")) {
                    this.f10867z = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (nextToken.equals("ItalicAngle")) {
                    this.A = Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("IsFixedPitch")) {
                    this.B = stringTokenizer.nextToken().equals("true");
                } else if (nextToken.equals("CharacterSet")) {
                    this.C = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (nextToken.equals("FontBBox")) {
                    this.D = (int) Float.parseFloat(stringTokenizer.nextToken());
                    this.E = (int) Float.parseFloat(stringTokenizer.nextToken());
                    this.F = (int) Float.parseFloat(stringTokenizer.nextToken());
                    this.G = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("UnderlinePosition")) {
                    this.H = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("UnderlineThickness")) {
                    this.I = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("EncodingScheme")) {
                    this.J = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (nextToken.equals("CapHeight")) {
                    this.K = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("XHeight")) {
                    this.L = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("Ascender")) {
                    this.M = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("Descender")) {
                    this.N = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("StdHW")) {
                    this.O = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("StdVW")) {
                    this.P = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (nextToken.equals("StartCharMetrics")) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            while (true) {
                String readLine2 = f2Var.readLine();
                if (readLine2 == null) {
                    break;
                }
                StringTokenizer stringTokenizer2 = new StringTokenizer(readLine2);
                if (stringTokenizer2.hasMoreTokens()) {
                    if (stringTokenizer2.nextToken().equals("EndCharMetrics")) {
                        z10 = false;
                        break;
                    }
                    Integer num = -1;
                    int i10 = 250;
                    StringTokenizer stringTokenizer3 = new StringTokenizer(readLine2, ";");
                    String str = "";
                    int[] iArr = null;
                    while (stringTokenizer3.hasMoreTokens()) {
                        StringTokenizer stringTokenizer4 = new StringTokenizer(stringTokenizer3.nextToken());
                        if (stringTokenizer4.hasMoreTokens()) {
                            String nextToken2 = stringTokenizer4.nextToken();
                            if (nextToken2.equals("C")) {
                                num = Integer.valueOf(stringTokenizer4.nextToken());
                            } else if (nextToken2.equals("WX")) {
                                i10 = Integer.valueOf((int) Float.parseFloat(stringTokenizer4.nextToken()));
                            } else if (nextToken2.equals("N")) {
                                str = stringTokenizer4.nextToken();
                            } else if (nextToken2.equals("B")) {
                                iArr = new int[]{Integer.parseInt(stringTokenizer4.nextToken()), Integer.parseInt(stringTokenizer4.nextToken()), Integer.parseInt(stringTokenizer4.nextToken()), Integer.parseInt(stringTokenizer4.nextToken())};
                            }
                        }
                    }
                    Object[] objArr2 = {num, i10, str, iArr};
                    if (num.intValue() >= 0) {
                        this.Q.put(num, objArr2);
                    }
                    this.Q.put(str, objArr2);
                }
            }
            if (!z10) {
                if (!this.Q.containsKey("nonbreakingspace") && (objArr = (Object[]) this.Q.get("space")) != null) {
                    this.Q.put("nonbreakingspace", objArr);
                }
                while (true) {
                    String readLine3 = f2Var.readLine();
                    if (readLine3 == null) {
                        break;
                    }
                    StringTokenizer stringTokenizer5 = new StringTokenizer(readLine3);
                    if (stringTokenizer5.hasMoreTokens()) {
                        String nextToken3 = stringTokenizer5.nextToken();
                        if (!nextToken3.equals("EndFontMetrics")) {
                            if (nextToken3.equals("StartKernPairs")) {
                                z10 = true;
                                break;
                            }
                        } else {
                            return;
                        }
                    }
                }
                if (z10) {
                    while (true) {
                        String readLine4 = f2Var.readLine();
                        if (readLine4 != null) {
                            StringTokenizer stringTokenizer6 = new StringTokenizer(readLine4);
                            if (stringTokenizer6.hasMoreTokens()) {
                                String nextToken4 = stringTokenizer6.nextToken();
                                if (nextToken4.equals("KPX")) {
                                    String nextToken5 = stringTokenizer6.nextToken();
                                    String nextToken6 = stringTokenizer6.nextToken();
                                    Integer valueOf = Integer.valueOf((int) Float.parseFloat(stringTokenizer6.nextToken()));
                                    Object[] objArr3 = (Object[]) this.R.get(nextToken5);
                                    if (objArr3 == null) {
                                        this.R.put(nextToken5, new Object[]{nextToken6, valueOf});
                                    } else {
                                        int length = objArr3.length;
                                        Object[] objArr4 = new Object[(length + 2)];
                                        System.arraycopy(objArr3, 0, objArr4, 0, length);
                                        objArr4[length] = nextToken6;
                                        objArr4[length + 1] = valueOf;
                                        this.R.put(nextToken5, objArr4);
                                    }
                                } else if (nextToken4.equals("EndKernPairs")) {
                                    break;
                                }
                            }
                        } else if (z10) {
                            throw new g(b8.a.b("missing.endkernpairs.in.1", this.S));
                        }
                    }
                    f2Var.close();
                    return;
                }
                throw new g(b8.a.b("missing.endfontmetrics.in.1", this.S));
            }
            throw new g(b8.a.b("missing.endcharmetrics.in.1", this.S));
        }
        throw new g(b8.a.b("missing.startcharmetrics.in.1", this.S));
    }

    public String[][] k() {
        return new String[][]{new String[]{"", "", "", this.f10866y}};
    }

    public float l(int i10, float f10) {
        int i11;
        switch (i10) {
            case 1:
            case 9:
                i11 = this.M;
                break;
            case 2:
                i11 = this.K;
                break;
            case 3:
            case 10:
                i11 = this.N;
                break;
            case 4:
                return this.A;
            case 5:
                i11 = this.D;
                break;
            case 6:
                i11 = this.E;
                break;
            case 7:
                i11 = this.F;
                break;
            case 8:
                i11 = this.G;
                break;
            case 12:
                i11 = this.F - this.D;
                break;
            case 13:
                i11 = this.H;
                break;
            case 14:
                i11 = this.I;
                break;
            default:
                return 0.0f;
        }
        return (((float) i11) * f10) / 1000.0f;
    }

    public String n() {
        return this.f10864w;
    }

    /* access modifiers changed from: protected */
    public int[] o(int i10, String str) {
        Object obj;
        if (str == null) {
            obj = this.Q.get(Integer.valueOf(i10));
        } else if (str.equals(".notdef")) {
            return null;
        } else {
            obj = this.Q.get(str);
        }
        Object[] objArr = (Object[]) obj;
        if (objArr != null) {
            return (int[]) objArr[3];
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int p(int i10, String str) {
        Object obj;
        if (str == null) {
            obj = this.Q.get(Integer.valueOf(i10));
        } else if (str.equals(".notdef")) {
            return 0;
        } else {
            obj = this.Q.get(str);
        }
        Object[] objArr = (Object[]) obj;
        if (objArr != null) {
            return ((Integer) objArr[1]).intValue();
        }
        return 0;
    }
}
