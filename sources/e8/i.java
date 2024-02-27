package e8;

import a8.g;
import b8.a;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.StringTokenizer;

class i extends c {
    static Properties E = new Properties();
    static Properties F = new Properties();
    static Hashtable G = new Hashtable();
    static Hashtable H = new Hashtable();
    private static boolean I = false;
    private s A;
    private s B;
    private HashMap C;
    private boolean D;

    /* renamed from: v  reason: collision with root package name */
    private String f10814v;

    /* renamed from: w  reason: collision with root package name */
    private String f10815w = "";

    /* renamed from: x  reason: collision with root package name */
    private String f10816x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10817y;

    /* renamed from: z  reason: collision with root package name */
    private char[] f10818z;

    i(String str, String str2, boolean z10) {
        this.f10817y = false;
        this.D = false;
        N();
        this.f10186b = 2;
        String i10 = c.i(str);
        if (M(i10, str2)) {
            if (i10.length() < str.length()) {
                this.f10815w = str.substring(i10.length());
                str = i10;
            }
            this.f10814v = str;
            this.f10191g = "UnicodeBigUnmarked";
            this.D = str2.endsWith("V");
            this.f10816x = str2;
            if (str2.startsWith("Identity-")) {
                this.f10817y = true;
                String property = E.getProperty(str);
                String substring = property.substring(0, property.indexOf(95));
                char[] cArr = (char[]) G.get(substring);
                if (cArr == null) {
                    cArr = O(substring);
                    if (cArr != null) {
                        cArr[32767] = 10;
                        G.put(substring, cArr);
                    } else {
                        throw new g(a.b("the.cmap.1.does.not.exist.as.a.resource", substring));
                    }
                }
                this.f10818z = cArr;
            } else {
                char[] cArr2 = (char[]) G.get(str2);
                if (cArr2 == null) {
                    String property2 = F.getProperty(str2);
                    if (property2 != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(property2);
                        String nextToken = stringTokenizer.nextToken();
                        char[] cArr3 = (char[]) G.get(nextToken);
                        if (cArr3 == null) {
                            cArr3 = O(nextToken);
                            G.put(nextToken, cArr3);
                        }
                        cArr2 = cArr3;
                        if (stringTokenizer.hasMoreTokens()) {
                            char[] O = O(stringTokenizer.nextToken());
                            for (int i11 = 0; i11 < 65536; i11++) {
                                if (O[i11] == 0) {
                                    O[i11] = cArr2[i11];
                                }
                            }
                            G.put(str2, O);
                            cArr2 = O;
                        }
                    } else {
                        throw new g(a.b("the.resource.cjkencodings.properties.does.not.contain.the.encoding.1", str2));
                    }
                }
                this.f10818z = cArr2;
            }
            HashMap hashMap = (HashMap) H.get(str);
            this.C = hashMap;
            if (hashMap == null) {
                HashMap P = P(str);
                this.C = P;
                H.put(str, P);
            }
            this.B = (s) this.C.get("W");
            this.A = (s) this.C.get("W2");
            return;
        }
        throw new g(a.b("font.1.with.2.encoding.is.not.a.cjk.font", str, str2));
    }

    static String C(int[] iArr, s sVar) {
        if (iArr.length == 0) {
            return null;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < iArr.length) {
            i11 = iArr[i10];
            i12 = sVar.b(i11);
            i10++;
            if (i12 != 0) {
                break;
            }
        }
        if (i12 == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append(i11);
        boolean z10 = false;
        while (i10 < iArr.length) {
            int i13 = iArr[i10];
            int b10 = sVar.b(i13);
            if (b10 != 0) {
                if (z10) {
                    if (!z10) {
                        if (z10 && !(i13 == i11 + 1 && b10 == i12)) {
                            stringBuffer.append(' ');
                            stringBuffer.append(i11);
                            stringBuffer.append(' ');
                            stringBuffer.append(i12);
                            stringBuffer.append(' ');
                        }
                        i11 = i13;
                        i12 = b10;
                    } else {
                        int i14 = i11 + 1;
                        if (i13 == i14 && b10 == i12) {
                            stringBuffer.append(']');
                            stringBuffer.append(i11);
                        } else {
                            stringBuffer.append(' ');
                            stringBuffer.append(i12);
                            if (i13 != i14) {
                                stringBuffer.append(']');
                            }
                            i11 = i13;
                            i12 = b10;
                        }
                    }
                    stringBuffer.append(i13);
                    z10 = false;
                    i11 = i13;
                    i12 = b10;
                } else {
                    int i15 = i11 + 1;
                    if (!(i13 == i15 && b10 == i12)) {
                        stringBuffer.append('[');
                        stringBuffer.append(i12);
                        if (i13 == i15) {
                            z10 = true;
                        } else {
                            stringBuffer.append(']');
                            stringBuffer.append(i13);
                        }
                        i11 = i13;
                        i12 = b10;
                    }
                }
                z10 = true;
                i11 = i13;
                i12 = b10;
            }
            i10++;
        }
        if (!z10) {
            stringBuffer.append('[');
        } else if (!z10) {
            if (z10) {
                stringBuffer.append(' ');
                stringBuffer.append(i11);
                stringBuffer.append(' ');
                stringBuffer.append(i12);
                stringBuffer.append(']');
            }
            return stringBuffer.toString();
        } else {
            stringBuffer.append(' ');
        }
        stringBuffer.append(i12);
        stringBuffer.append("]]");
        return stringBuffer.toString();
    }

    static String D(int[] iArr, s sVar, s sVar2) {
        int[] iArr2 = iArr;
        s sVar3 = sVar;
        s sVar4 = sVar2;
        if (iArr2.length == 0) {
            return null;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i10 >= iArr2.length) {
                break;
            }
            i13 = iArr2[i10];
            i11 = sVar3.b(i13);
            if (i11 != 0) {
                i10++;
                break;
            }
            i12 = sVar4.b(i13);
            i10++;
        }
        if (i11 == 0) {
            return null;
        }
        if (i12 == 0) {
            i12 = 1000;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append(i13);
        boolean z10 = false;
        while (i10 < iArr2.length) {
            int i14 = iArr2[i10];
            int b10 = sVar3.b(i14);
            if (b10 != 0) {
                int b11 = sVar4.b(i13);
                int i15 = b11 == 0 ? 1000 : b11;
                if (z10) {
                    if (z10 && !(i14 == i13 + 1 && b10 == i11 && i15 == i12)) {
                        stringBuffer.append(' ');
                        stringBuffer.append(i13);
                        stringBuffer.append(' ');
                        stringBuffer.append(-i11);
                        stringBuffer.append(' ');
                        stringBuffer.append(i12 / 2);
                        stringBuffer.append(' ');
                        stringBuffer.append(880);
                        stringBuffer.append(' ');
                        stringBuffer.append(i14);
                        z10 = false;
                    }
                } else if (i14 == i13 + 1 && b10 == i11 && i15 == i12) {
                    z10 = true;
                } else {
                    stringBuffer.append(' ');
                    stringBuffer.append(i13);
                    stringBuffer.append(' ');
                    stringBuffer.append(-i11);
                    stringBuffer.append(' ');
                    stringBuffer.append(i12 / 2);
                    stringBuffer.append(' ');
                    stringBuffer.append(880);
                    stringBuffer.append(' ');
                    stringBuffer.append(i14);
                }
                i12 = i15;
                i13 = i14;
                i11 = b10;
            }
            i10++;
        }
        stringBuffer.append(' ');
        stringBuffer.append(i13);
        stringBuffer.append(' ');
        stringBuffer.append(-i11);
        stringBuffer.append(' ');
        stringBuffer.append(i12 / 2);
        stringBuffer.append(' ');
        stringBuffer.append(880);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    static s E(String str) {
        s sVar = new s();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            sVar.d(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        }
        return sVar;
    }

    private float F(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer((String) this.C.get("FontBBox"), " []\r\n\t\f");
        String nextToken = stringTokenizer.nextToken();
        for (int i11 = 0; i11 < i10; i11++) {
            nextToken = stringTokenizer.nextToken();
        }
        return (float) Integer.parseInt(nextToken);
    }

    private l0 G(x0 x0Var, s sVar) {
        l0 l0Var = new l0(c1.f10473v3);
        l0Var.r(c1.f10492w9, c1.S0);
        c1 c1Var = c1.Z;
        l0Var.r(c1Var, new c1(this.f10814v + this.f10815w));
        l0Var.r(c1.f10499x3, x0Var);
        int[] f10 = sVar.f();
        String C2 = C(f10, this.B);
        if (C2 != null) {
            l0Var.r(c1.f10262eb, new a1(C2));
        }
        if (this.D) {
            String D2 = D(f10, this.A, this.B);
            if (D2 != null) {
                l0Var.r(c1.f10274fb, new a1(D2));
            }
        } else {
            l0Var.r(c1.f10459u2, new f1(1000));
        }
        l0 l0Var2 = new l0();
        l0Var2.r(c1.f10247d8, new y1((String) this.C.get("Registry"), (String) null));
        l0Var2.r(c1.L6, new y1((String) this.C.get("Ordering"), (String) null));
        l0Var2.r(c1.f10505x9, new a1((String) this.C.get("Supplement")));
        l0Var.r(c1.V0, l0Var2);
        return l0Var;
    }

    private float I(String str) {
        return (float) Integer.parseInt((String) this.C.get(str));
    }

    private l0 J(x0 x0Var) {
        l0 l0Var = new l0(c1.f10473v3);
        l0Var.r(c1.f10492w9, c1.f10467ua);
        String str = this.f10814v;
        if (this.f10815w.length() > 0) {
            str = str + "-" + this.f10815w.substring(1);
        }
        l0Var.r(c1.Z, new c1(str + "-" + this.f10816x));
        l0Var.r(c1.F2, new c1(this.f10816x));
        l0Var.r(c1.S1, new b0((i1) x0Var));
        return l0Var;
    }

    private l0 K() {
        l0 l0Var = new l0(c1.f10499x3);
        l0Var.r(c1.O, new a1((String) this.C.get("Ascent")));
        l0Var.r(c1.E0, new a1((String) this.C.get("CapHeight")));
        l0Var.r(c1.T1, new a1((String) this.C.get("Descent")));
        l0Var.r(c1.f10408q3, new a1((String) this.C.get("Flags")));
        l0Var.r(c1.f10486w3, new a1((String) this.C.get("FontBBox")));
        c1 c1Var = c1.C3;
        l0Var.r(c1Var, new c1(this.f10814v + this.f10815w));
        l0Var.r(c1.R4, new a1((String) this.C.get("ItalicAngle")));
        l0Var.r(c1.f10336k9, new a1((String) this.C.get("StemV")));
        l0 l0Var2 = new l0();
        l0Var2.r(c1.f10222b7, new y1((String) this.C.get("Panose"), (String) null));
        l0Var.r(c1.f10440s9, l0Var2);
        return l0Var;
    }

    public static boolean M(String str, String str2) {
        N();
        String property = E.getProperty(str);
        if (property != null) {
            if (!str2.equals("Identity-H") && !str2.equals("Identity-V")) {
                if (property.indexOf("_" + str2 + "_") >= 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:11|12|13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void N() {
        /*
            boolean r0 = I
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Hashtable r0 = H
            monitor-enter(r0)
            boolean r1 = I     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x0040
        L_0x0010:
            java.lang.String r1 = "com/itextpdf/text/pdf/fonts/cjkfonts.properties"
            java.io.InputStream r1 = e8.c.q(r1)     // Catch:{ Exception -> 0x002d }
            java.util.Properties r2 = E     // Catch:{ Exception -> 0x002d }
            r2.load(r1)     // Catch:{ Exception -> 0x002d }
            r1.close()     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = "com/itextpdf/text/pdf/fonts/cjkencodings.properties"
            java.io.InputStream r1 = e8.c.q(r1)     // Catch:{ Exception -> 0x002d }
            java.util.Properties r2 = F     // Catch:{ Exception -> 0x002d }
            r2.load(r1)     // Catch:{ Exception -> 0x002d }
            r1.close()     // Catch:{ Exception -> 0x002d }
            goto L_0x003b
        L_0x002d:
            java.util.Properties r1 = new java.util.Properties     // Catch:{ all -> 0x000e }
            r1.<init>()     // Catch:{ all -> 0x000e }
            E = r1     // Catch:{ all -> 0x000e }
            java.util.Properties r1 = new java.util.Properties     // Catch:{ all -> 0x000e }
            r1.<init>()     // Catch:{ all -> 0x000e }
            F = r1     // Catch:{ all -> 0x000e }
        L_0x003b:
            r1 = 1
            I = r1     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            return
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.i.N():void");
    }

    static char[] O(String str) {
        try {
            InputStream q10 = c.q("com/itextpdf/text/pdf/fonts/" + (str + ".cmap"));
            char[] cArr = new char[65536];
            for (int i10 = 0; i10 < 65536; i10++) {
                cArr[i10] = (char) ((q10.read() << 8) + q10.read());
            }
            q10.close();
            return cArr;
        } catch (Exception unused) {
            return null;
        }
    }

    static HashMap P(String str) {
        try {
            InputStream q10 = c.q("com/itextpdf/text/pdf/fonts/" + (str + ".properties"));
            Properties properties = new Properties();
            properties.load(q10);
            q10.close();
            s E2 = E(properties.getProperty("W"));
            properties.remove("W");
            s E3 = E(properties.getProperty("W2"));
            properties.remove("W2");
            HashMap hashMap = new HashMap();
            Enumeration keys = properties.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                hashMap.put((String) nextElement, properties.getProperty((String) nextElement));
            }
            hashMap.put("W", E2);
            hashMap.put("W2", E3);
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void B(c2 c2Var, x0 x0Var, Object[] objArr) {
        s sVar = objArr[0];
        l0 K = K();
        x0 a10 = K != null ? c2Var.n(K).a() : null;
        l0 G2 = G(a10, sVar);
        if (G2 != null) {
            a10 = c2Var.n(G2).a();
        }
        c2Var.o(J(a10), x0Var);
    }

    public int H(int i10) {
        return this.f10817y ? i10 : this.f10818z[i10];
    }

    public String[][] L() {
        return new String[][]{new String[]{"", "", "", this.f10814v}};
    }

    public String[][] k() {
        return L();
    }

    public float l(int i10, float f10) {
        float F2;
        int i11;
        switch (i10) {
            case 1:
            case 9:
                return (I("Ascent") * f10) / 1000.0f;
            case 2:
                return (I("CapHeight") * f10) / 1000.0f;
            case 3:
            case 10:
                return (I("Descent") * f10) / 1000.0f;
            case 4:
                return I("ItalicAngle");
            case 5:
                F2 = F(0);
                break;
            case 6:
                i11 = 1;
                break;
            case 7:
                F2 = F(2);
                break;
            case 8:
                i11 = 3;
                break;
            case 12:
                F2 = F(2) - F(0);
                break;
            default:
                return 0.0f;
        }
        F2 = F(i11);
        return (f10 * F2) / 1000.0f;
    }

    public String n() {
        return this.f10814v;
    }

    /* access modifiers changed from: protected */
    public int[] o(int i10, String str) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int p(int i10, String str) {
        return 0;
    }

    public int t(int i10) {
        return this.f10817y ? this.f10818z[i10] : i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r2v0 ?, r2v1 ?, r2v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public int u(
/*
Method generation error in method: e8.i.u(int):int, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    public int v(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (!this.f10817y) {
                charAt = this.f10818z[charAt];
            }
            int b10 = (this.D ? this.A : this.B).b(charAt);
            i10 = b10 > 0 ? i10 + b10 : i10 + 1000;
        }
        return i10;
    }
}
