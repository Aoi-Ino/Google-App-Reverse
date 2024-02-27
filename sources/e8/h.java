package e8;

import e8.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class h extends g {
    static final String[] H = {"RESERVED_0", "hstem", "RESERVED_2", "vstem", "vmoveto", "rlineto", "hlineto", "vlineto", "rrcurveto", "RESERVED_9", "callsubr", "return", "escape", "RESERVED_13", "endchar", "RESERVED_15", "RESERVED_16", "RESERVED_17", "hstemhm", "hintmask", "cntrmask", "rmoveto", "hmoveto", "vstemhm", "rcurveline", "rlinecurve", "vvcurveto", "hhcurveto", "shortint", "callgsubr", "vhcurveto", "hvcurveto"};
    static final String[] I = {"RESERVED_0", "RESERVED_1", "RESERVED_2", "and", "or", "not", "RESERVED_6", "RESERVED_7", "RESERVED_8", "abs", "add", "sub", "div", "RESERVED_13", "neg", "eq", "RESERVED_16", "RESERVED_17", "drop", "RESERVED_19", "put", "get", "ifelse", "random", "mul", "RESERVED_25", "sqrt", "dup", "exch", "index", "roll", "RESERVED_31", "RESERVED_32", "RESERVED_33", "hflex", "flex", "hflex1", "flex1", "RESERVED_REST"};
    byte[][] A;
    byte[] B;
    byte[] C;
    byte[] D;
    int E;
    LinkedList F;
    int G;

    /* renamed from: r  reason: collision with root package name */
    HashMap f10755r;

    /* renamed from: s  reason: collision with root package name */
    ArrayList f10756s;

    /* renamed from: t  reason: collision with root package name */
    HashSet f10757t = new HashSet();

    /* renamed from: u  reason: collision with root package name */
    HashMap[] f10758u;

    /* renamed from: v  reason: collision with root package name */
    ArrayList[] f10759v;

    /* renamed from: w  reason: collision with root package name */
    HashMap f10760w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    ArrayList f10761x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    HashMap f10762y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    ArrayList f10763z = new ArrayList();

    public h(f2 f2Var, HashMap hashMap) {
        super(f2Var);
        int i10 = 0;
        this.E = 0;
        this.G = 0;
        this.f10755r = hashMap;
        this.f10756s = new ArrayList(hashMap.keySet());
        while (true) {
            g.c[] cVarArr = this.f10689o;
            if (i10 < cVarArr.length) {
                m(cVarArr[i10].f10699g);
                this.f10689o[i10].f10706n = b();
                m(this.f10683i);
                this.f10689o[i10].f10707o = b() + g.f10674q.length;
                g.c cVar = this.f10689o[i10];
                cVar.f10709q = f(cVar.f10699g);
                if (this.f10689o[i10].f10703k >= 0) {
                    X(i10);
                    o(i10);
                }
                if (this.f10689o[i10].f10695c) {
                    R(i10);
                }
                g.c cVar2 = this.f10689o[i10];
                cVar2.f10708p = B(cVar2.f10701i, cVar2.f10706n);
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        m(0);
        c();
        c();
        char c10 = c();
        c();
        this.f10675a = c10;
        this.F.addLast(new g.j(this.f10679e, 0, c10));
    }

    /* access modifiers changed from: package-private */
    public int B(int i10, int i11) {
        int C2;
        m(i10);
        char c10 = c();
        if (c10 == 0) {
            return (i11 * 2) + 1;
        }
        if (c10 == 1) {
            C2 = C(i11, 1) * 3;
        } else if (c10 != 2) {
            return 0;
        } else {
            C2 = C(i11, 2) * 4;
        }
        return C2 + 1;
    }

    /* access modifiers changed from: package-private */
    public int C(int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        while (i13 < i10) {
            i12++;
            b();
            i13 += (i11 == 1 ? c() : b()) + 1;
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public void D(g.i iVar, int i10) {
        this.F.addLast(new g.h(iVar));
        this.F.addLast(new g.p(2));
        this.F.addLast(new g.m(1));
        this.F.addLast(new g.m((char) (i10 - 1)));
    }

    /* access modifiers changed from: protected */
    public void E(g.i iVar, g.i iVar2, int i10) {
        this.F.addLast(new g.h(iVar));
        r(1, 1, 1);
        g.f fVar = new g.f(1);
        this.F.addLast(fVar);
        g.d dVar = new g.d();
        this.F.addLast(dVar);
        g.c cVar = this.f10689o[i10];
        int i11 = cVar.f10697e;
        int z10 = z(cVar.f10696d, i11);
        if (z10 != 0) {
            i11 += 5 - z10;
        }
        this.F.addLast(new g.a(i11));
        this.F.addLast(iVar2);
        this.F.addLast(new g.p(18));
        this.F.addLast(new g.e(fVar, dVar));
    }

    /* access modifiers changed from: protected */
    public void F(g.i iVar, int i10) {
        this.F.addLast(new g.h(iVar));
        this.F.addLast(new g.p(3));
        this.F.addLast(new g.m(1));
        this.F.addLast(new g.m(0));
        this.F.addLast(new g.p(0));
        this.F.addLast(new g.m((char) i10));
    }

    /* access modifiers changed from: protected */
    public void G(g.i iVar, g.i iVar2, g.i iVar3, g.i iVar4) {
        this.F.addLast(iVar);
        this.F.addLast(new g.p(12));
        this.F.addLast(new g.p('$'));
        this.F.addLast(iVar2);
        this.F.addLast(new g.p(12));
        this.F.addLast(new g.p('%'));
        this.F.addLast(iVar3);
        this.F.addLast(new g.p(15));
        this.F.addLast(iVar4);
        this.F.addLast(new g.p(17));
    }

    /* access modifiers changed from: protected */
    public void H(int i10) {
        String str = this.f10689o[i10].f10693a + "-OneRange";
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        String str2 = "AdobeIdentity" + str;
        int[] iArr = this.f10687m;
        int i11 = iArr[iArr.length - 1];
        int i12 = iArr[0];
        int i13 = i11 - i12;
        int i14 = i12 - 1;
        int i15 = str2.length() + i13 <= 255 ? 1 : str2.length() + i13 <= 65535 ? 2 : str2.length() + i13 <= 16777215 ? 3 : 4;
        this.F.addLast(new g.m((char) (this.f10687m.length + 2)));
        this.F.addLast(new g.p((char) i15));
        for (int i16 : this.f10687m) {
            this.F.addLast(new g.f(i15, i16 - i14));
        }
        int[] iArr2 = this.f10687m;
        int i17 = iArr2[iArr2.length - 1] - i14;
        this.F.addLast(new g.f(i15, i17 + 5));
        int i18 = i17 + 13;
        this.F.addLast(new g.f(i15, i18));
        this.F.addLast(new g.f(i15, i18 + str.length()));
        this.F.addLast(new g.j(this.f10679e, this.f10687m[0], i13));
        this.F.addLast(new g.k(str2));
    }

    /* access modifiers changed from: package-private */
    public void I(int i10, g.i iVar) {
        m(this.f10689o[i10].f10696d);
        while (true) {
            int j10 = j();
            g.c cVar = this.f10689o[i10];
            if (j10 < cVar.f10696d + cVar.f10697e) {
                int j11 = j();
                d();
                int j12 = j();
                if (this.f10676b == "Subrs") {
                    this.F.addLast(iVar);
                    this.F.addLast(new g.p(19));
                } else {
                    this.F.addLast(new g.j(this.f10679e, j11, j12 - j11));
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J(int i10, g.d dVar, g.i iVar) {
        this.F.addLast(new g.l(iVar, dVar));
        byte[] bArr = this.B;
        if (bArr != null) {
            this.F.addLast(new g.j(new f2(bArr), 0, this.B.length));
        }
    }

    /* access modifiers changed from: protected */
    public void K() {
        for (int i10 = 0; i10 < this.f10678d; i10++) {
            this.f10677c[i10] = null;
        }
        this.f10678d = 0;
    }

    /* access modifiers changed from: protected */
    public void L() {
        int W = W();
        if (W >= 2) {
            K();
        } else if (W == 1) {
            O();
        } else {
            int i10 = W * -1;
            for (int i11 = 0; i11 < i10; i11++) {
                M();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void M() {
        int i10 = this.f10678d;
        if (i10 > 0) {
            this.f10677c[i10 - 1] = null;
            this.f10678d = i10 - 1;
        }
    }

    public byte[] N(String str) {
        try {
            this.f10679e.f();
            int i10 = 0;
            while (true) {
                g.c[] cVarArr = this.f10689o;
                if (i10 >= cVarArr.length) {
                    break;
                } else if (str.equals(cVarArr[i10].f10693a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == this.f10689o.length) {
                try {
                    this.f10679e.close();
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                int i11 = this.f10684j;
                if (i11 >= 0) {
                    this.E = x(i11, i10);
                }
                s(i10);
                v(i10);
                byte[] t10 = t(i10);
                try {
                    this.f10679e.close();
                } catch (Exception unused2) {
                }
                return t10;
            }
        } catch (Throwable th2) {
            try {
                this.f10679e.close();
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void O() {
        this.f10678d++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Integer} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P(int r13, int r14, int r15, int r16, java.util.HashMap r17, java.util.ArrayList r18, int[] r19) {
        /*
            r12 = this;
            r6 = r12
            r7 = r17
            r12.K()
            r8 = 0
            r6.G = r8
            r12.m(r13)
        L_0x000c:
            int r0 = r12.j()
            r9 = r14
            if (r0 >= r9) goto L_0x00e5
            r12.Q()
            int r10 = r12.j()
            int r0 = r6.f10678d
            r1 = 0
            if (r0 <= 0) goto L_0x0026
            java.lang.Object[] r2 = r6.f10677c
            int r3 = r0 + -1
            r2 = r2[r3]
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            r12.L()
            java.lang.String r3 = r6.f10676b
            java.lang.String r4 = "callsubr"
            if (r3 != r4) goto L_0x006d
            if (r0 <= 0) goto L_0x006a
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r0 = r2.intValue()
            int r0 = r0 + r16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r7.containsKey(r2)
            if (r2 != 0) goto L_0x0055
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.put(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r11 = r18
            r11.add(r1)
            goto L_0x0057
        L_0x0055:
            r11 = r18
        L_0x0057:
            r1 = r19[r0]
            int r0 = r0 + 1
            r2 = r19[r0]
            r0 = r12
            r3 = r16
            r4 = r15
            r5 = r19
            r0.y(r1, r2, r3, r4, r5)
        L_0x0066:
            r12.m(r10)
            goto L_0x000c
        L_0x006a:
            r11 = r18
            goto L_0x000c
        L_0x006d:
            r11 = r18
            java.lang.String r4 = "callgsubr"
            if (r3 != r4) goto L_0x00ae
            if (r0 <= 0) goto L_0x000c
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r0 = r2.intValue()
            int r0 = r0 + r15
            java.util.HashMap r2 = r6.f10760w
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x009a
            java.util.HashMap r2 = r6.f10760w
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r1)
            java.util.ArrayList r1 = r6.f10761x
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.add(r2)
        L_0x009a:
            int[] r1 = r6.f10688n
            r2 = r1[r0]
            int r0 = r0 + 1
            r3 = r1[r0]
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r16
            r4 = r15
            r5 = r19
            r0.y(r1, r2, r3, r4, r5)
            goto L_0x0066
        L_0x00ae:
            java.lang.String r1 = "hstem"
            if (r3 == r1) goto L_0x00dc
            java.lang.String r1 = "vstem"
            if (r3 == r1) goto L_0x00dc
            java.lang.String r1 = "hstemhm"
            if (r3 == r1) goto L_0x00dc
            java.lang.String r1 = "vstemhm"
            if (r3 != r1) goto L_0x00bf
            goto L_0x00dc
        L_0x00bf:
            java.lang.String r0 = "hintmask"
            if (r3 == r0) goto L_0x00c7
            java.lang.String r0 = "cntrmask"
            if (r3 != r0) goto L_0x000c
        L_0x00c7:
            int r0 = r6.G
            int r1 = r0 / 8
            int r0 = r0 % 8
            if (r0 != 0) goto L_0x00d1
            if (r1 != 0) goto L_0x00d3
        L_0x00d1:
            int r1 = r1 + 1
        L_0x00d3:
            r0 = r8
        L_0x00d4:
            if (r0 >= r1) goto L_0x000c
            r12.c()
            int r0 = r0 + 1
            goto L_0x00d4
        L_0x00dc:
            int r1 = r6.G
            int r0 = r0 / 2
            int r1 = r1 + r0
            r6.G = r1
            goto L_0x000c
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h.P(int, int, int, int, java.util.HashMap, java.util.ArrayList, int[]):void");
    }

    /* access modifiers changed from: protected */
    public void Q() {
        String str;
        this.f10676b = null;
        boolean z10 = false;
        while (!z10) {
            char c10 = c();
            if (c10 == 28) {
                this.f10677c[this.f10678d] = Integer.valueOf((c() << 8) | c());
            } else if (c10 >= ' ' && c10 <= 246) {
                this.f10677c[this.f10678d] = Integer.valueOf(c10 - 139);
            } else if (c10 >= 247 && c10 <= 250) {
                this.f10677c[this.f10678d] = Integer.valueOf(((c10 - 247) * 256) + c() + 108);
            } else if (c10 >= 251 && c10 <= 254) {
                this.f10677c[this.f10678d] = Integer.valueOf((((-(c10 - 251)) * 256) - c()) - 108);
            } else if (c10 == 255) {
                this.f10677c[this.f10678d] = Integer.valueOf((c() << 24) | (c() << 16) | (c() << 8) | c());
            } else if (c10 <= 31 && c10 != 28) {
                if (c10 == 12) {
                    int c11 = c();
                    String[] strArr = I;
                    if (c11 > strArr.length - 1) {
                        c11 = strArr.length - 1;
                    }
                    str = strArr[c11];
                } else {
                    str = H[c10];
                }
                this.f10676b = str;
                z10 = true;
            }
            this.f10678d++;
        }
    }

    /* access modifiers changed from: protected */
    public void R(int i10) {
        m(this.f10689o[i10].f10702j);
        this.f10689o[i10].f10714v = b();
        this.f10689o[i10].f10715w = c();
        g.c cVar = this.f10689o[i10];
        int i11 = cVar.f10715w;
        if (i11 < 4) {
            cVar.f10715w = i11 + 1;
        }
        cVar.f10716x = f(cVar.f10702j);
    }

    /* access modifiers changed from: package-private */
    public void S(int i10) {
        g.c cVar = this.f10689o[i10];
        g.b[] bVarArr = new g.b[(cVar.f10716x.length - 1)];
        int[] iArr = cVar.f10704l;
        g.d[] dVarArr = new g.d[iArr.length];
        g.b[] bVarArr2 = new g.b[iArr.length];
        T(i10, bVarArr);
        U(i10, bVarArr, dVarArr, bVarArr2);
        V(i10, dVarArr, bVarArr2);
    }

    /* access modifiers changed from: package-private */
    public void T(int i10, g.i[] iVarArr) {
        g.c cVar = this.f10689o[i10];
        r(cVar.f10714v, cVar.f10715w, 1);
        g.f[] fVarArr = new g.f[(this.f10689o[i10].f10716x.length - 1)];
        int i11 = 0;
        while (true) {
            g.c cVar2 = this.f10689o[i10];
            if (i11 >= cVar2.f10716x.length - 1) {
                break;
            }
            g.f fVar = new g.f(cVar2.f10715w);
            fVarArr[i11] = fVar;
            this.F.addLast(fVar);
            i11++;
        }
        g.d dVar = new g.d();
        this.F.addLast(dVar);
        for (int i12 = 0; i12 < this.f10689o[i10].f10716x.length - 1; i12++) {
            if (this.f10757t.contains(Integer.valueOf(i12))) {
                m(this.f10689o[i10].f10716x[i12]);
                while (j() < this.f10689o[i10].f10716x[i12 + 1]) {
                    int j10 = j();
                    d();
                    int j11 = j();
                    if (this.f10676b == "Private") {
                        int intValue = ((Integer) this.f10677c[0]).intValue();
                        g.c cVar3 = this.f10689o[i10];
                        int z10 = z(cVar3.f10704l[i12], cVar3.f10705m[i12]);
                        if (z10 != 0) {
                            intValue += 5 - z10;
                        }
                        this.F.addLast(new g.a(intValue));
                        g.b bVar = new g.b();
                        iVarArr[i12] = bVar;
                        this.F.addLast(bVar);
                        this.F.addLast(new g.p(18));
                        m(j11);
                    } else {
                        this.F.addLast(new g.j(this.f10679e, j10, j11 - j10));
                    }
                }
            }
            this.F.addLast(new g.e(fVarArr[i12], dVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i10, g.i[] iVarArr, g.d[] dVarArr, g.i[] iVarArr2) {
        for (int i11 = 0; i11 < this.f10689o[i10].f10704l.length; i11++) {
            if (this.f10757t.contains(Integer.valueOf(i11))) {
                this.F.addLast(new g.h(iVarArr[i11]));
                g.d dVar = new g.d();
                dVarArr[i11] = dVar;
                this.F.addLast(dVar);
                m(this.f10689o[i10].f10704l[i11]);
                while (true) {
                    int j10 = j();
                    g.c cVar = this.f10689o[i10];
                    if (j10 >= cVar.f10704l[i11] + cVar.f10705m[i11]) {
                        break;
                    }
                    int j11 = j();
                    d();
                    int j12 = j();
                    if (this.f10676b == "Subrs") {
                        g.b bVar = new g.b();
                        iVarArr2[i11] = bVar;
                        this.F.addLast(bVar);
                        this.F.addLast(new g.p(19));
                    } else {
                        this.F.addLast(new g.j(this.f10679e, j11, j12 - j11));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i10, g.d[] dVarArr, g.i[] iVarArr) {
        int i11 = 0;
        while (true) {
            g.c cVar = this.f10689o[i10];
            if (i11 < cVar.f10705m.length) {
                g.i iVar = iVarArr[i11];
                if (iVar != null && cVar.f10717y[i11] >= 0) {
                    this.F.addLast(new g.l(iVar, dVarArr[i11]));
                    this.F.addLast(new g.j(new f2(this.A[i11]), 0, this.A[i11].length));
                }
                i11++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int W() {
        String str = this.f10676b;
        if (str == "ifelse") {
            return -3;
        }
        if (str == "roll" || str == "put") {
            return -2;
        }
        if (str == "callsubr" || str == "callgsubr" || str == "add" || str == "sub" || str == "div" || str == "mul" || str == "drop" || str == "and" || str == "or" || str == "eq") {
            return -1;
        }
        if (str == "abs" || str == "neg" || str == "sqrt" || str == "exch" || str == "index" || str == "get" || str == "not" || str == "return") {
            return 0;
        }
        return (str == "random" || str == "dup") ? 1 : 2;
    }

    /* access modifiers changed from: protected */
    public void X(int i10) {
        g.c cVar = this.f10689o[i10];
        int i11 = cVar.f10706n;
        int[] iArr = new int[i11];
        m(cVar.f10703k);
        this.f10689o[i10].f10712t = c();
        int i12 = this.f10689o[i10].f10712t;
        if (i12 == 0) {
            for (int i13 = 0; i13 < i11; i13++) {
                iArr[i13] = c();
            }
            g.c cVar2 = this.f10689o[i10];
            cVar2.f10711s = cVar2.f10706n + 1;
        } else if (i12 == 3) {
            char b10 = b();
            char b11 = b();
            int i14 = 0;
            int i15 = 0;
            while (i14 < b10) {
                int c10 = c();
                char b12 = b();
                int i16 = b12 - b11;
                for (int i17 = 0; i17 < i16; i17++) {
                    iArr[i15] = c10;
                    i15++;
                }
                i14++;
                b11 = b12;
            }
            this.f10689o[i10].f10711s = (b10 * 3) + 5;
        }
        this.f10689o[i10].f10710r = iArr;
    }

    /* access modifiers changed from: protected */
    public byte[] n(int[] iArr, byte[] bArr) {
        int[] iArr2 = iArr;
        byte[] bArr2 = bArr;
        char length = (char) (iArr2.length - 1);
        int i10 = iArr2[iArr2.length - 1];
        byte b10 = i10 <= 255 ? 1 : i10 <= 65535 ? 2 : i10 <= 16777215 ? (byte) 3 : 4;
        byte[] bArr3 = new byte[(((length + 1) * b10) + 3 + bArr2.length)];
        int i11 = 0;
        bArr3[0] = (byte) ((length >>> 8) & 255);
        bArr3[1] = (byte) (length & 255);
        bArr3[2] = b10;
        int i12 = 3;
        for (int i13 : iArr2) {
            int i14 = (i13 - iArr2[0]) + 1;
            if (b10 != 1) {
                if (b10 != 2) {
                    if (b10 != 3) {
                        if (b10 != 4) {
                        } else {
                            bArr3[i12] = (byte) ((i14 >>> 24) & 255);
                            i12++;
                        }
                    }
                    bArr3[i12] = (byte) ((i14 >>> 16) & 255);
                    i12++;
                }
                bArr3[i12] = (byte) ((i14 >>> 8) & 255);
                i12++;
            }
            bArr3[i12] = (byte) (i14 & 255);
            i12++;
        }
        int length2 = bArr2.length;
        while (i11 < length2) {
            bArr3[i12] = bArr2[i11];
            i11++;
            i12++;
        }
        return bArr3;
    }

    /* access modifiers changed from: protected */
    public void o(int i10) {
        int[] iArr = this.f10689o[i10].f10710r;
        for (int i11 = 0; i11 < this.f10756s.size(); i11++) {
            this.f10757t.add(Integer.valueOf(iArr[((Integer) this.f10756s.get(i11)).intValue()]));
        }
    }

    /* access modifiers changed from: protected */
    public void p(int i10, int i11) {
        g.c cVar;
        g.c cVar2 = this.f10689o[i10];
        cVar2.f10717y[i11] = -1;
        m(cVar2.f10704l[i11]);
        while (true) {
            int j10 = j();
            cVar = this.f10689o[i10];
            if (j10 >= cVar.f10704l[i11] + cVar.f10705m[i11]) {
                break;
            }
            d();
            if (this.f10676b == "Subrs") {
                this.f10689o[i10].f10717y[i11] = ((Integer) this.f10677c[0]).intValue() + this.f10689o[i10].f10704l[i11];
            }
        }
        int i12 = cVar.f10717y[i11];
        if (i12 >= 0) {
            cVar.f10718z[i11] = f(i12);
        }
    }

    /* access modifiers changed from: protected */
    public void q(int i10) {
        int i11;
        int i12;
        int i13 = this.f10689o[i10].f10698f;
        if (i13 >= 0) {
            i12 = x(i13, i10);
            i11 = this.f10763z.size();
        } else {
            i12 = 0;
            i11 = 0;
        }
        for (int i14 = 0; i14 < this.f10761x.size(); i14++) {
            int intValue = ((Integer) this.f10761x.get(i14)).intValue();
            int[] iArr = this.f10688n;
            if (intValue < iArr.length - 1 && intValue >= 0) {
                int i15 = iArr[intValue];
                int i16 = iArr[intValue + 1];
                g.c cVar = this.f10689o[i10];
                if (cVar.f10695c) {
                    P(i15, i16, this.E, 0, this.f10760w, this.f10761x, (int[]) null);
                } else {
                    P(i15, i16, this.E, i12, this.f10762y, this.f10763z, cVar.A);
                    if (i11 < this.f10763z.size()) {
                        while (i11 < this.f10763z.size()) {
                            int intValue2 = ((Integer) this.f10763z.get(i11)).intValue();
                            int[] iArr2 = this.f10689o[i10].A;
                            if (intValue2 < iArr2.length - 1 && intValue2 >= 0) {
                                P(iArr2[intValue2], iArr2[intValue2 + 1], this.E, i12, this.f10762y, this.f10763z, iArr2);
                            }
                            i11++;
                        }
                        i11 = this.f10763z.size();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void r(int i10, int i11, int i12) {
        LinkedList linkedList;
        Object pVar;
        this.F.addLast(new g.m((char) i10));
        this.F.addLast(new g.p((char) i11));
        if (i11 == 1) {
            linkedList = this.F;
            pVar = new g.p((char) i12);
        } else if (i11 == 2) {
            linkedList = this.F;
            pVar = new g.m((char) i12);
        } else if (i11 == 3) {
            linkedList = this.F;
            pVar = new g.n((char) i12);
        } else if (i11 == 4) {
            linkedList = this.F;
            pVar = new g.o((char) i12);
        } else {
            return;
        }
        linkedList.addLast(pVar);
    }

    /* access modifiers changed from: protected */
    public void s(int i10) {
        this.D = u(this.f10689o[i10].f10709q, this.f10755r, (byte) 14);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x021c A[LOOP:1: B:38:0x0216->B:40:0x021c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0232 A[LOOP:2: B:42:0x022c->B:44:0x0232, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x024c A[LOOP:3: B:46:0x0246->B:48:0x024c, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] t(int r14) {
        /*
            r13 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r13.F = r0
            r13.A()
            r0 = 1
            r13.r(r0, r0, r0)
            java.util.LinkedList r1 = r13.F
            e8.g$p r2 = new e8.g$p
            e8.g$c[] r3 = r13.f10689o
            r3 = r3[r14]
            java.lang.String r3 = r3.f10693a
            int r3 = r3.length()
            int r3 = r3 + r0
            char r3 = (char) r3
            r2.<init>(r3)
            r1.addLast(r2)
            java.util.LinkedList r1 = r13.F
            e8.g$k r2 = new e8.g$k
            e8.g$c[] r3 = r13.f10689o
            r3 = r3[r14]
            java.lang.String r3 = r3.f10693a
            r2.<init>(r3)
            r1.addLast(r2)
            r1 = 2
            r13.r(r0, r1, r0)
            e8.g$f r2 = new e8.g$f
            r2.<init>(r1)
            java.util.LinkedList r1 = r13.F
            r1.addLast(r2)
            e8.g$d r1 = new e8.g$d
            r1.<init>()
            java.util.LinkedList r3 = r13.F
            r3.addLast(r1)
            e8.g$b r3 = new e8.g$b
            r3.<init>()
            e8.g$b r4 = new e8.g$b
            r4.<init>()
            e8.g$b r5 = new e8.g$b
            r5.<init>()
            e8.g$b r6 = new e8.g$b
            r6.<init>()
            e8.g$b r7 = new e8.g$b
            r7.<init>()
            e8.g$c[] r8 = r13.f10689o
            r8 = r8[r14]
            boolean r9 = r8.f10695c
            r10 = 0
            if (r9 != 0) goto L_0x00d3
            java.util.LinkedList r9 = r13.F
            e8.g$a r11 = new e8.g$a
            int r8 = r8.f10707o
            r11.<init>(r8)
            r9.addLast(r11)
            java.util.LinkedList r8 = r13.F
            e8.g$a r9 = new e8.g$a
            e8.g$c[] r11 = r13.f10689o
            r11 = r11[r14]
            int r11 = r11.f10707o
            int r11 = r11 + r0
            r9.<init>(r11)
            r8.addLast(r9)
            java.util.LinkedList r0 = r13.F
            e8.g$a r8 = new e8.g$a
            r8.<init>(r10)
            r0.addLast(r8)
            java.util.LinkedList r0 = r13.F
            e8.g$p r8 = new e8.g$p
            r9 = 12
            r8.<init>(r9)
            r0.addLast(r8)
            java.util.LinkedList r0 = r13.F
            e8.g$p r8 = new e8.g$p
            r11 = 30
            r8.<init>(r11)
            r0.addLast(r8)
            java.util.LinkedList r0 = r13.F
            e8.g$a r8 = new e8.g$a
            e8.g$c[] r11 = r13.f10689o
            r11 = r11[r14]
            int r11 = r11.f10706n
            r8.<init>(r11)
            r0.addLast(r8)
            java.util.LinkedList r0 = r13.F
            e8.g$p r8 = new e8.g$p
            r8.<init>(r9)
            r0.addLast(r8)
            java.util.LinkedList r0 = r13.F
            e8.g$p r8 = new e8.g$p
            r9 = 34
            r8.<init>(r9)
            r0.addLast(r8)
        L_0x00d3:
            int[] r0 = r13.f10686l
            r0 = r0[r14]
            r13.m(r0)
        L_0x00da:
            int r0 = r13.j()
            int[] r8 = r13.f10686l
            int r9 = r14 + 1
            r8 = r8[r9]
            if (r0 >= r8) goto L_0x011a
            int r0 = r13.j()
            r13.d()
            int r8 = r13.j()
            java.lang.String r9 = r13.f10676b
            java.lang.String r11 = "Encoding"
            if (r9 == r11) goto L_0x00da
            java.lang.String r11 = "Private"
            if (r9 == r11) goto L_0x00da
            java.lang.String r11 = "FDSelect"
            if (r9 == r11) goto L_0x00da
            java.lang.String r11 = "FDArray"
            if (r9 == r11) goto L_0x00da
            java.lang.String r11 = "charset"
            if (r9 == r11) goto L_0x00da
            java.lang.String r11 = "CharStrings"
            if (r9 != r11) goto L_0x010c
            goto L_0x00da
        L_0x010c:
            java.util.LinkedList r9 = r13.F
            e8.g$j r11 = new e8.g$j
            e8.f2 r12 = r13.f10679e
            int r8 = r8 - r0
            r11.<init>(r12, r0, r8)
            r9.add(r11)
            goto L_0x00da
        L_0x011a:
            r13.G(r5, r6, r3, r4)
            java.util.LinkedList r0 = r13.F
            e8.g$e r8 = new e8.g$e
            r8.<init>(r2, r1)
            r0.addLast(r8)
            e8.g$c[] r0 = r13.f10689o
            r0 = r0[r14]
            boolean r0 = r0.f10695c
            if (r0 == 0) goto L_0x013b
            java.util.LinkedList r0 = r13.F
            int r1 = r13.f10683i
            e8.g$j r1 = r13.e(r1)
            r0.addLast(r1)
            goto L_0x013e
        L_0x013b:
            r13.H(r14)
        L_0x013e:
            java.util.LinkedList r0 = r13.F
            e8.g$j r1 = new e8.g$j
            e8.f2 r2 = new e8.f2
            byte[] r8 = r13.C
            r2.<init>((byte[]) r8)
            byte[] r8 = r13.C
            int r8 = r8.length
            r1.<init>(r2, r10, r8)
            r0.addLast(r1)
            e8.g$c[] r0 = r13.f10689o
            r0 = r0[r14]
            boolean r1 = r0.f10695c
            if (r1 == 0) goto L_0x01b8
            java.util.LinkedList r0 = r13.F
            e8.g$h r1 = new e8.g$h
            r1.<init>(r6)
            r0.addLast(r1)
            e8.g$c[] r0 = r13.f10689o
            r0 = r0[r14]
            int r1 = r0.f10703k
            if (r1 < 0) goto L_0x017b
            java.util.LinkedList r2 = r13.F
            e8.g$j r6 = new e8.g$j
            e8.f2 r8 = r13.f10679e
            int r0 = r0.f10711s
            r6.<init>(r8, r1, r0)
            r2.addLast(r6)
            goto L_0x0180
        L_0x017b:
            int r0 = r0.f10706n
            r13.F(r6, r0)
        L_0x0180:
            java.util.LinkedList r0 = r13.F
            e8.g$h r1 = new e8.g$h
            r1.<init>(r3)
            r0.addLast(r1)
            java.util.LinkedList r0 = r13.F
            e8.g$j r1 = new e8.g$j
            e8.f2 r2 = r13.f10679e
            e8.g$c[] r3 = r13.f10689o
            r3 = r3[r14]
            int r6 = r3.f10701i
            int r3 = r3.f10708p
            r1.<init>(r2, r6, r3)
            r0.addLast(r1)
            e8.g$c[] r0 = r13.f10689o
            r0 = r0[r14]
            int r0 = r0.f10702j
            if (r0 < 0) goto L_0x01b4
            java.util.LinkedList r0 = r13.F
            e8.g$h r1 = new e8.g$h
            r1.<init>(r5)
            r0.addLast(r1)
            r13.S(r14)
            goto L_0x01c7
        L_0x01b4:
            r13.E(r5, r7, r14)
            goto L_0x01c7
        L_0x01b8:
            int r0 = r0.f10706n
            r13.F(r6, r0)
            e8.g$c[] r0 = r13.f10689o
            r0 = r0[r14]
            int r0 = r0.f10706n
            r13.D(r3, r0)
            goto L_0x01b4
        L_0x01c7:
            e8.g$c[] r0 = r13.f10689o
            r0 = r0[r14]
            int r0 = r0.f10696d
            if (r0 < 0) goto L_0x01ee
            e8.g$d r0 = new e8.g$d
            r0.<init>()
            java.util.LinkedList r1 = r13.F
            r1.addLast(r0)
            java.util.LinkedList r1 = r13.F
            e8.g$h r2 = new e8.g$h
            r2.<init>(r7)
            r1.addLast(r2)
            e8.g$b r1 = new e8.g$b
            r1.<init>()
            r13.I(r14, r1)
            r13.J(r14, r0, r1)
        L_0x01ee:
            java.util.LinkedList r14 = r13.F
            e8.g$h r0 = new e8.g$h
            r0.<init>(r4)
            r14.addLast(r0)
            java.util.LinkedList r14 = r13.F
            e8.g$j r0 = new e8.g$j
            e8.f2 r1 = new e8.f2
            byte[] r2 = r13.D
            r1.<init>((byte[]) r2)
            byte[] r2 = r13.D
            int r2 = r2.length
            r0.<init>(r1, r10, r2)
            r14.addLast(r0)
            int[] r14 = new int[]{r10}
            java.util.LinkedList r0 = r13.F
            java.util.Iterator r0 = r0.iterator()
        L_0x0216:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0226
            java.lang.Object r1 = r0.next()
            e8.g$g r1 = (e8.g.C0141g) r1
            r1.b(r14)
            goto L_0x0216
        L_0x0226:
            java.util.LinkedList r0 = r13.F
            java.util.Iterator r0 = r0.iterator()
        L_0x022c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x023c
            java.lang.Object r1 = r0.next()
            e8.g$g r1 = (e8.g.C0141g) r1
            r1.c()
            goto L_0x022c
        L_0x023c:
            r14 = r14[r10]
            byte[] r14 = new byte[r14]
            java.util.LinkedList r0 = r13.F
            java.util.Iterator r0 = r0.iterator()
        L_0x0246:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0256
            java.lang.Object r1 = r0.next()
            e8.g$g r1 = (e8.g.C0141g) r1
            r1.a(r14)
            goto L_0x0246
        L_0x0256:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h.t(int):byte[]");
    }

    /* access modifiers changed from: protected */
    public byte[] u(int[] iArr, HashMap hashMap, byte b10) {
        int[] iArr2 = new int[iArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            iArr2[i13] = i11;
            if (hashMap.containsKey(Integer.valueOf(i13))) {
                i11 += iArr[i13 + 1] - iArr[i13];
            } else {
                i12++;
            }
        }
        byte[] bArr = new byte[(i11 + i12)];
        int i14 = 0;
        while (i10 < iArr.length - 1) {
            int i15 = iArr2[i10];
            int i16 = i10 + 1;
            int i17 = iArr2[i16];
            int i18 = i15 + i14;
            iArr2[i10] = i18;
            if (i15 != i17) {
                this.f10679e.j(iArr[i10]);
                this.f10679e.readFully(bArr, i18, i17 - i15);
            } else {
                bArr[i18] = b10;
                i14++;
            }
            i10 = i16;
        }
        int length = iArr.length - 1;
        iArr2[length] = iArr2[length] + i14;
        return n(iArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public void v(int i10) {
        g.c cVar = this.f10689o[i10];
        if (cVar.f10695c) {
            int[] iArr = cVar.f10704l;
            this.f10758u = new HashMap[iArr.length];
            this.f10759v = new ArrayList[iArr.length];
            this.A = new byte[iArr.length][];
            cVar.f10717y = new int[iArr.length];
            cVar.f10718z = new int[iArr.length][];
            ArrayList arrayList = new ArrayList(this.f10757t);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                int intValue = ((Integer) arrayList.get(i11)).intValue();
                this.f10758u[intValue] = new HashMap();
                this.f10759v[intValue] = new ArrayList();
                p(i10, intValue);
                g.c cVar2 = this.f10689o[i10];
                int i12 = cVar2.f10717y[intValue];
                if (i12 >= 0) {
                    w(i10, intValue, i12, cVar2.f10718z[intValue], this.f10758u[intValue], this.f10759v[intValue]);
                    this.A[intValue] = u(this.f10689o[i10].f10718z[intValue], this.f10758u[intValue], (byte) 11);
                }
            }
        } else {
            int i13 = cVar.f10698f;
            if (i13 >= 0) {
                cVar.A = f(i13);
                g.c cVar3 = this.f10689o[i10];
                w(i10, -1, cVar3.f10698f, cVar3.A, this.f10762y, this.f10763z);
            }
        }
        q(i10);
        g.c cVar4 = this.f10689o[i10];
        if (cVar4.f10698f >= 0) {
            this.B = u(cVar4.A, this.f10762y, (byte) 11);
        }
        this.C = u(this.f10688n, this.f10760w, (byte) 11);
    }

    /* access modifiers changed from: protected */
    public void w(int i10, int i11, int i12, int[] iArr, HashMap hashMap, ArrayList arrayList) {
        int i13 = i10;
        int i14 = i11;
        int[] iArr2 = iArr;
        int x10 = x(i12, i13);
        for (int i15 = 0; i15 < this.f10756s.size(); i15++) {
            int intValue = ((Integer) this.f10756s.get(i15)).intValue();
            int[] iArr3 = this.f10689o[i13].f10709q;
            int i16 = iArr3[intValue];
            int i17 = iArr3[intValue + 1];
            if (i14 >= 0) {
                K();
                this.G = 0;
                if (this.f10689o[i13].f10710r[intValue] == i14) {
                    P(i16, i17, this.E, x10, hashMap, arrayList, iArr);
                }
            } else {
                P(i16, i17, this.E, x10, hashMap, arrayList, iArr);
            }
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            int intValue2 = ((Integer) arrayList.get(i18)).intValue();
            if (intValue2 < iArr2.length - 1 && intValue2 >= 0) {
                P(iArr2[intValue2], iArr2[intValue2 + 1], this.E, x10, hashMap, arrayList, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int x(int i10, int i11) {
        m(i10);
        char b10 = b();
        if (this.f10689o[i11].f10713u == 1) {
            return 0;
        }
        if (b10 < 1240) {
            return 107;
        }
        return b10 < 33900 ? 1131 : 32768;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Integer} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int y(int r9, int r10, int r11, int r12, int[] r13) {
        /*
            r8 = this;
        L_0x0000:
            r8.m(r9)
        L_0x0003:
            int r9 = r8.j()
            if (r9 >= r10) goto L_0x0090
            r8.Q()
            int r9 = r8.j()
            int r0 = r8.f10678d
            if (r0 <= 0) goto L_0x001b
            java.lang.Object[] r1 = r8.f10677c
            int r2 = r0 + -1
            r1 = r1[r2]
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r8.L()
            java.lang.String r2 = r8.f10676b
            java.lang.String r3 = "callsubr"
            if (r2 != r3) goto L_0x003c
            if (r0 <= 0) goto L_0x0003
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            int r0 = r0 + r11
            r2 = r13[r0]
            int r0 = r0 + 1
            r3 = r13[r0]
            r1 = r8
            r4 = r11
            r5 = r12
            r6 = r13
            r1.y(r2, r3, r4, r5, r6)
            goto L_0x0000
        L_0x003c:
            java.lang.String r3 = "callgsubr"
            if (r2 != r3) goto L_0x0059
            if (r0 <= 0) goto L_0x0003
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            int r0 = r0 + r12
            int[] r1 = r8.f10688n
            r3 = r1[r0]
            int r0 = r0 + 1
            r4 = r1[r0]
            r2 = r8
            r5 = r11
            r6 = r12
            r7 = r13
            r2.y(r3, r4, r5, r6, r7)
            goto L_0x0000
        L_0x0059:
            java.lang.String r9 = "hstem"
            if (r2 == r9) goto L_0x0087
            java.lang.String r9 = "vstem"
            if (r2 == r9) goto L_0x0087
            java.lang.String r9 = "hstemhm"
            if (r2 == r9) goto L_0x0087
            java.lang.String r9 = "vstemhm"
            if (r2 != r9) goto L_0x006a
            goto L_0x0087
        L_0x006a:
            java.lang.String r9 = "hintmask"
            if (r2 == r9) goto L_0x0072
            java.lang.String r9 = "cntrmask"
            if (r2 != r9) goto L_0x0003
        L_0x0072:
            int r9 = r8.G
            int r0 = r9 / 8
            int r9 = r9 % 8
            if (r9 != 0) goto L_0x007c
            if (r0 != 0) goto L_0x007e
        L_0x007c:
            int r0 = r0 + 1
        L_0x007e:
            r9 = 0
        L_0x007f:
            if (r9 >= r0) goto L_0x0003
            r8.c()
            int r9 = r9 + 1
            goto L_0x007f
        L_0x0087:
            int r9 = r8.G
            int r0 = r0 / 2
            int r9 = r9 + r0
            r8.G = r9
            goto L_0x0003
        L_0x0090:
            int r9 = r8.G
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h.y(int, int, int, int, int[]):int");
    }

    /* access modifiers changed from: package-private */
    public int z(int i10, int i11) {
        m(i10);
        int i12 = 0;
        while (j() < i10 + i11) {
            int j10 = j();
            d();
            int j11 = j();
            if (this.f10676b == "Subrs") {
                i12 = (j11 - j10) - 1;
            }
        }
        return i12;
    }
}
