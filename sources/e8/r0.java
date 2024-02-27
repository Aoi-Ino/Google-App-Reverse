package e8;

public class r0 extends l0 {

    /* renamed from: n  reason: collision with root package name */
    protected c2 f11001n;

    /* renamed from: o  reason: collision with root package name */
    protected x0 f11002o;

    public r0() {
        super(c1.f10230c3);
    }

    public static r0 v(c2 c2Var, String str, String str2, byte[] bArr) {
        return w(c2Var, str, str2, bArr, 9);
    }

    public static r0 w(c2 c2Var, String str, String str2, byte[] bArr, int i10) {
        return x(c2Var, str, str2, bArr, (String) null, (l0) null, i10);
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v3, types: [e8.x0, e8.i1] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb A[SYNTHETIC, Splitter:B:47:0x00fb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e8.r0 x(e8.c2 r5, java.lang.String r6, java.lang.String r7, byte[] r8, java.lang.String r9, e8.l0 r10, int r11) {
        /*
            e8.r0 r0 = new e8.r0
            r0.<init>()
            r0.f11001n = r5
            e8.c1 r1 = e8.c1.R2
            e8.y1 r2 = new e8.y1
            r2.<init>(r7)
            r0.r(r1, r2)
            r1 = 0
            r0.A(r7, r1)
            r7 = 0
            if (r8 != 0) goto L_0x007c
            e8.x0 r1 = r5.K()     // Catch:{ all -> 0x002e }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x002e }
            r2.<init>(r6)     // Catch:{ all -> 0x002e }
            boolean r2 = r2.canRead()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0031
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002e }
            r2.<init>(r6)     // Catch:{ all -> 0x002e }
            r7 = r2
            goto L_0x0073
        L_0x002e:
            r5 = move-exception
            goto L_0x00f9
        L_0x0031:
            java.lang.String r2 = "file:/"
            boolean r2 = r6.startsWith(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0069
            java.lang.String r2 = "http://"
            boolean r2 = r6.startsWith(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0069
            java.lang.String r2 = "https://"
            boolean r2 = r6.startsWith(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0069
            java.lang.String r2 = "jar:"
            boolean r2 = r6.startsWith(r2)     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0052
            goto L_0x0069
        L_0x0052:
            java.io.InputStream r7 = e8.c.q(r6)     // Catch:{ all -> 0x002e }
            if (r7 == 0) goto L_0x0059
            goto L_0x0073
        L_0x0059:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x002e }
            java.lang.String r8 = "1.not.found.as.file.or.resource"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x002e }
            java.lang.String r6 = b8.a.b(r8, r6)     // Catch:{ all -> 0x002e }
            r5.<init>(r6)     // Catch:{ all -> 0x002e }
            throw r5     // Catch:{ all -> 0x002e }
        L_0x0069:
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x002e }
            r2.<init>(r6)     // Catch:{ all -> 0x002e }
            java.io.InputStream r6 = r2.openStream()     // Catch:{ all -> 0x002e }
            r7 = r6
        L_0x0073:
            e8.n0 r6 = new e8.n0     // Catch:{ all -> 0x002e }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x002e }
            r4 = r1
            r1 = r7
            r7 = r4
            goto L_0x0082
        L_0x007c:
            e8.n0 r6 = new e8.n0     // Catch:{ all -> 0x002e }
            r6.<init>(r8)     // Catch:{ all -> 0x002e }
            r1 = r7
        L_0x0082:
            e8.c1 r2 = e8.c1.f10454ta     // Catch:{ all -> 0x0097 }
            e8.c1 r3 = e8.c1.B2     // Catch:{ all -> 0x0097 }
            r6.r(r2, r3)     // Catch:{ all -> 0x0097 }
            r6.v(r11)     // Catch:{ all -> 0x0097 }
            e8.l0 r11 = new e8.l0     // Catch:{ all -> 0x0097 }
            r11.<init>()     // Catch:{ all -> 0x0097 }
            if (r10 == 0) goto L_0x009a
            r11.p(r10)     // Catch:{ all -> 0x0097 }
            goto L_0x009a
        L_0x0097:
            r5 = move-exception
            r7 = r1
            goto L_0x00f9
        L_0x009a:
            if (r8 == 0) goto L_0x00b0
            e8.c1 r10 = e8.c1.W8     // Catch:{ all -> 0x0097 }
            e8.f1 r2 = new e8.f1     // Catch:{ all -> 0x0097 }
            int r3 = r6.w()     // Catch:{ all -> 0x0097 }
            r2.<init>((int) r3)     // Catch:{ all -> 0x0097 }
            r11.r(r10, r2)     // Catch:{ all -> 0x0097 }
            e8.c1 r10 = e8.c1.f10234c7     // Catch:{ all -> 0x0097 }
            r6.r(r10, r11)     // Catch:{ all -> 0x0097 }
            goto L_0x00b5
        L_0x00b0:
            e8.c1 r10 = e8.c1.f10234c7     // Catch:{ all -> 0x0097 }
            r6.r(r10, r7)     // Catch:{ all -> 0x0097 }
        L_0x00b5:
            if (r9 == 0) goto L_0x00c1
            e8.c1 r10 = e8.c1.f10492w9     // Catch:{ all -> 0x0097 }
            e8.c1 r2 = new e8.c1     // Catch:{ all -> 0x0097 }
            r2.<init>(r9)     // Catch:{ all -> 0x0097 }
            r6.r(r10, r2)     // Catch:{ all -> 0x0097 }
        L_0x00c1:
            e8.w0 r9 = r5.n(r6)     // Catch:{ all -> 0x0097 }
            e8.x0 r9 = r9.a()     // Catch:{ all -> 0x0097 }
            if (r8 != 0) goto L_0x00df
            r6.y()     // Catch:{ all -> 0x0097 }
            e8.c1 r8 = e8.c1.W8     // Catch:{ all -> 0x0097 }
            e8.f1 r10 = new e8.f1     // Catch:{ all -> 0x0097 }
            int r6 = r6.w()     // Catch:{ all -> 0x0097 }
            r10.<init>((int) r6)     // Catch:{ all -> 0x0097 }
            r11.r(r8, r10)     // Catch:{ all -> 0x0097 }
            r5.o(r11, r7)     // Catch:{ all -> 0x0097 }
        L_0x00df:
            if (r1 == 0) goto L_0x00e4
            r1.close()     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            e8.l0 r5 = new e8.l0
            r5.<init>()
            e8.c1 r6 = e8.c1.R2
            r5.r(r6, r9)
            e8.c1 r6 = e8.c1.f10519ya
            r5.r(r6, r9)
            e8.c1 r6 = e8.c1.f10498x2
            r0.r(r6, r5)
            return r0
        L_0x00f9:
            if (r7 == 0) goto L_0x00fe
            r7.close()     // Catch:{ Exception -> 0x00fe }
        L_0x00fe:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.r0.x(e8.c2, java.lang.String, java.lang.String, byte[], java.lang.String, e8.l0, int):e8.r0");
    }

    public static r0 y(c2 c2Var, String str) {
        r0 r0Var = new r0();
        r0Var.f11001n = c2Var;
        r0Var.r(c1.R2, new y1(str));
        r0Var.A(str, false);
        return r0Var;
    }

    public void A(String str, boolean z10) {
        r(c1.f10519ya, new y1(str, z10 ? "UnicodeBig" : "PDF"));
    }

    public x0 z() {
        x0 x0Var = this.f11002o;
        if (x0Var != null) {
            return x0Var;
        }
        x0 a10 = this.f11001n.n(this).a();
        this.f11002o = a10;
        return a10;
    }
}
