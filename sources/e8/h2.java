package e8;

import a8.f;
import a8.g;
import a8.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class h2 extends c {
    static final String[] W = {"1252 Latin 1", "1250 Latin 2: Eastern Europe", "1251 Cyrillic", "1253 Greek", "1254 Turkish", "1255 Hebrew", "1256 Arabic", "1257 Windows Baltic", "1258 Vietnamese", null, null, null, null, null, null, null, "874 Thai", "932 JIS/Japan", "936 Chinese: Simplified chars--PRC and Singapore", "949 Korean Wansung", "950 Chinese: Traditional chars--Taiwan and Hong Kong", "1361 Korean Johab", null, null, null, null, null, null, null, "Macintosh Character Set (US Roman)", "OEM Character Set", "Symbol Character Set", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "869 IBM Greek", "866 MS-DOS Russian", "865 MS-DOS Nordic", "864 Arabic", "863 MS-DOS Canadian French", "862 Hebrew", "861 MS-DOS Icelandic", "860 MS-DOS Portuguese", "857 IBM Turkish", "855 IBM Cyrillic; primarily Russian", "852 Latin 2", "775 MS-DOS Baltic", "737 Greek; former 437 G", "708 Arabic; ASMO 708", "850 WE/Latin 1", "437 US"};
    protected int A;
    protected int B;
    protected int C;
    protected String D;
    protected String E = "";
    protected a F = new a();
    protected b G = new b();
    protected c H = new c();
    protected int[] I;
    protected int[][] J;
    protected HashMap K;
    protected HashMap L;
    protected HashMap M;
    protected s N = new s();
    protected String O;
    protected String[][] P;
    protected String[][] Q;
    protected String[][] R;
    protected double S;
    protected boolean T = false;
    protected int U;
    protected int V;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f10766v = false;

    /* renamed from: w  reason: collision with root package name */
    protected HashMap f10767w;

    /* renamed from: x  reason: collision with root package name */
    protected f2 f10768x;

    /* renamed from: y  reason: collision with root package name */
    protected String f10769y;

    /* renamed from: z  reason: collision with root package name */
    protected boolean f10770z = false;

    protected static class a {

        /* renamed from: a  reason: collision with root package name */
        int f10771a;

        /* renamed from: b  reason: collision with root package name */
        int f10772b;

        /* renamed from: c  reason: collision with root package name */
        short f10773c;

        /* renamed from: d  reason: collision with root package name */
        short f10774d;

        /* renamed from: e  reason: collision with root package name */
        short f10775e;

        /* renamed from: f  reason: collision with root package name */
        short f10776f;

        /* renamed from: g  reason: collision with root package name */
        int f10777g;

        protected a() {
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        short f10778a;

        /* renamed from: b  reason: collision with root package name */
        short f10779b;

        /* renamed from: c  reason: collision with root package name */
        short f10780c;

        /* renamed from: d  reason: collision with root package name */
        int f10781d;

        /* renamed from: e  reason: collision with root package name */
        short f10782e;

        /* renamed from: f  reason: collision with root package name */
        short f10783f;

        /* renamed from: g  reason: collision with root package name */
        short f10784g;

        /* renamed from: h  reason: collision with root package name */
        short f10785h;

        /* renamed from: i  reason: collision with root package name */
        short f10786i;

        /* renamed from: j  reason: collision with root package name */
        int f10787j;

        protected b() {
        }
    }

    protected static class c {
        int A;
        int B;

        /* renamed from: a  reason: collision with root package name */
        short f10788a;

        /* renamed from: b  reason: collision with root package name */
        int f10789b;

        /* renamed from: c  reason: collision with root package name */
        int f10790c;

        /* renamed from: d  reason: collision with root package name */
        short f10791d;

        /* renamed from: e  reason: collision with root package name */
        short f10792e;

        /* renamed from: f  reason: collision with root package name */
        short f10793f;

        /* renamed from: g  reason: collision with root package name */
        short f10794g;

        /* renamed from: h  reason: collision with root package name */
        short f10795h;

        /* renamed from: i  reason: collision with root package name */
        short f10796i;

        /* renamed from: j  reason: collision with root package name */
        short f10797j;

        /* renamed from: k  reason: collision with root package name */
        short f10798k;

        /* renamed from: l  reason: collision with root package name */
        short f10799l;

        /* renamed from: m  reason: collision with root package name */
        short f10800m;

        /* renamed from: n  reason: collision with root package name */
        short f10801n;

        /* renamed from: o  reason: collision with root package name */
        short f10802o;

        /* renamed from: p  reason: collision with root package name */
        byte[] f10803p = new byte[10];

        /* renamed from: q  reason: collision with root package name */
        byte[] f10804q = new byte[4];

        /* renamed from: r  reason: collision with root package name */
        int f10805r;

        /* renamed from: s  reason: collision with root package name */
        int f10806s;

        /* renamed from: t  reason: collision with root package name */
        int f10807t;

        /* renamed from: u  reason: collision with root package name */
        short f10808u;

        /* renamed from: v  reason: collision with root package name */
        short f10809v;

        /* renamed from: w  reason: collision with root package name */
        short f10810w;

        /* renamed from: x  reason: collision with root package name */
        int f10811x;

        /* renamed from: y  reason: collision with root package name */
        int f10812y;

        /* renamed from: z  reason: collision with root package name */
        int f10813z;

        protected c() {
        }
    }

    protected h2() {
    }

    protected static int[] F(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int[] iArr = (int[]) arrayList.get(i10);
            for (int i11 = 0; i11 < iArr.length; i11 += 2) {
                int i12 = i11 + 1;
                arrayList2.add(new int[]{Math.max(0, Math.min(iArr[i11], iArr[i12])), Math.min(65535, Math.max(iArr[i11], iArr[i12]))});
            }
        }
        int i13 = 0;
        while (i13 < arrayList2.size() - 1) {
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 < arrayList2.size()) {
                int[] iArr2 = (int[]) arrayList2.get(i13);
                int[] iArr3 = (int[]) arrayList2.get(i15);
                int i16 = iArr2[0];
                int i17 = iArr3[0];
                if ((i16 >= i17 && i16 <= iArr3[1]) || (iArr2[1] >= i17 && i16 <= iArr3[1])) {
                    iArr2[0] = Math.min(i16, i17);
                    iArr2[1] = Math.max(iArr2[1], iArr3[1]);
                    arrayList2.remove(i15);
                    i15--;
                }
                i15++;
            }
            i13 = i14;
        }
        int[] iArr4 = new int[(arrayList2.size() * 2)];
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            int[] iArr5 = (int[]) arrayList2.get(i18);
            int i19 = i18 * 2;
            iArr4[i19] = iArr5[0];
            iArr4[i19 + 1] = iArr5[1];
        }
        return iArr4;
    }

    protected static String P(String str) {
        int indexOf = str.toLowerCase().indexOf(".ttc,");
        return indexOf < 0 ? str : str.substring(0, indexOf + 4);
    }

    private void R() {
        int[] iArr;
        int[] iArr2 = (int[]) this.f10767w.get("head");
        if (iArr2 != null) {
            int i10 = 0;
            this.f10768x.j(iArr2[0] + 51);
            boolean z10 = this.f10768x.readUnsignedShort() == 0;
            int[] iArr3 = (int[]) this.f10767w.get("loca");
            if (iArr3 != null) {
                this.f10768x.j(iArr3[0]);
                if (z10) {
                    int i11 = iArr3[1] / 2;
                    iArr = new int[i11];
                    for (int i12 = 0; i12 < i11; i12++) {
                        iArr[i12] = this.f10768x.readUnsignedShort() * 2;
                    }
                } else {
                    int i13 = iArr3[1] / 4;
                    iArr = new int[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        iArr[i14] = this.f10768x.readInt();
                    }
                }
                int[] iArr4 = (int[]) this.f10767w.get("glyf");
                if (iArr4 != null) {
                    int i15 = iArr4[0];
                    this.J = new int[(iArr.length - 1)][];
                    while (i10 < iArr.length - 1) {
                        int i16 = iArr[i10];
                        int i17 = i10 + 1;
                        if (i16 != iArr[i17]) {
                            this.f10768x.j(i16 + i15 + 2);
                            this.J[i10] = new int[]{(this.f10768x.readShort() * 1000) / this.F.f10772b, (this.f10768x.readShort() * 1000) / this.F.f10772b, (this.f10768x.readShort() * 1000) / this.F.f10772b, (this.f10768x.readShort() * 1000) / this.F.f10772b};
                        }
                        i10 = i17;
                    }
                    return;
                }
                throw new g(b8.a.b("table.1.does.not.exist.in.2", "glyf", this.f10769y + this.E));
            }
            return;
        }
        throw new g(b8.a.b("table.1.does.not.exist.in.2", "head", this.f10769y + this.E));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: char} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(e8.c2 r19, e8.x0 r20, java.lang.Object[] r21) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r0 = 0
            r1 = r21[r0]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            r3 = r21[r2]
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 2
            r4 = r21[r4]
            r5 = r4
            byte[] r5 = (byte[]) r5
            r4 = 3
            r4 = r21[r4]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x002d
            boolean r4 = r6.f10197m
            if (r4 == 0) goto L_0x002d
            r4 = r2
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            if (r4 != 0) goto L_0x003e
            int r1 = r5.length
            int r1 = r1 - r2
            r3 = r0
        L_0x0033:
            int r8 = r5.length
            if (r3 >= r8) goto L_0x003b
            r5[r3] = r2
            int r3 = r3 + 1
            goto L_0x0033
        L_0x003b:
            r3 = r0
            r8 = r1
            goto L_0x0040
        L_0x003e:
            r8 = r3
            r3 = r1
        L_0x0040:
            boolean r1 = r6.f10192h
            r9 = 0
            java.lang.String r10 = ""
            if (r1 == 0) goto L_0x00e5
            boolean r1 = r6.f10770z
            if (r1 == 0) goto L_0x0063
            e8.c$a r0 = new e8.c$a
            byte[] r1 = r18.T()
            java.lang.String r2 = "Type1C"
            int r4 = r6.f10193i
            r0.<init>((byte[]) r1, (java.lang.String) r2, (int) r4)
            e8.w0 r0 = r7.n(r0)
        L_0x005c:
            e8.x0 r0 = r0.a()
        L_0x0060:
            r2 = r10
            goto L_0x00e8
        L_0x0063:
            if (r4 == 0) goto L_0x0069
            java.lang.String r10 = e8.c.h()
        L_0x0069:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r1 = r3
        L_0x006f:
            if (r1 > r8) goto L_0x00a7
            byte r11 = r5[r1]
            if (r11 == 0) goto L_0x00a4
            e8.s r11 = r6.f10199o
            if (r11 == 0) goto L_0x0088
            java.lang.String[] r11 = r6.f10188d
            r11 = r11[r1]
            int[] r11 = e8.q.a(r11)
            if (r11 == 0) goto L_0x0086
            r11 = r11[r0]
            goto L_0x0095
        L_0x0086:
            r11 = r9
            goto L_0x0099
        L_0x0088:
            boolean r11 = r6.f10194j
            if (r11 == 0) goto L_0x0091
            int[] r11 = r6.N(r1)
            goto L_0x0099
        L_0x0091:
            char[] r11 = r6.f10189e
            char r11 = r11[r1]
        L_0x0095:
            int[] r11 = r6.N(r11)
        L_0x0099:
            if (r11 == 0) goto L_0x00a4
            r11 = r11[r0]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14.add(r11)
        L_0x00a4:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x00a7:
            r6.D(r14, r4)
            if (r4 != 0) goto L_0x00ba
            int r0 = r6.C
            if (r0 != 0) goto L_0x00ba
            java.util.ArrayList r0 = r6.f10185a
            if (r0 == 0) goto L_0x00b5
            goto L_0x00ba
        L_0x00b5:
            byte[] r0 = r18.L()
            goto L_0x00d3
        L_0x00ba:
            e8.i2 r0 = new e8.i2
            java.lang.String r12 = r6.f10769y
            e8.f2 r13 = new e8.f2
            e8.f2 r1 = r6.f10768x
            r13.<init>((e8.f2) r1)
            int r15 = r6.C
            r16 = 1
            r17 = r4 ^ 1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            byte[] r0 = r0.h()
        L_0x00d3:
            int r1 = r0.length
            int[] r1 = new int[]{r1}
            e8.c$a r2 = new e8.c$a
            int r4 = r6.f10193i
            r2.<init>((byte[]) r0, (int[]) r1, (int) r4)
            e8.w0 r0 = r7.n(r2)
            goto L_0x005c
        L_0x00e5:
            r0 = r9
            goto L_0x0060
        L_0x00e8:
            e8.l0 r1 = r6.K(r0, r2, r9)
            if (r1 == 0) goto L_0x00f6
            e8.w0 r0 = r7.n(r1)
            e8.x0 r0 = r0.a()
        L_0x00f6:
            r1 = r0
            r0 = r18
            r4 = r8
            e8.l0 r0 = r0.J(r1, r2, r3, r4, r5)
            r1 = r20
            r7.o(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h2.B(e8.c2, e8.x0, java.lang.Object[]):void");
    }

    /* access modifiers changed from: protected */
    public void C(HashMap hashMap, boolean z10, boolean z11) {
        HashMap hashMap2;
        if (!z11) {
            ArrayList arrayList = this.f10185a;
            if (arrayList != null || this.C > 0) {
                int[] F2 = (arrayList != null || this.C <= 0) ? F(arrayList) : new int[]{0, 65535};
                boolean z12 = this.f10194j;
                if ((z12 || (hashMap2 = this.L) == null) && ((!z12 || (hashMap2 = this.K) == null) && (hashMap2 = this.L) == null)) {
                    hashMap2 = this.K;
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    int[] iArr = (int[]) entry.getValue();
                    Integer valueOf = Integer.valueOf(iArr[0]);
                    if (!hashMap.containsKey(valueOf)) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= F2.length) {
                                break;
                            } else if (intValue < F2[i10] || intValue > F2[i10 + 1]) {
                                i10 += 2;
                            } else {
                                hashMap.put(valueOf, z10 ? new int[]{iArr[0], iArr[1], intValue} : null);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void D(HashSet hashSet, boolean z10) {
        HashMap hashMap;
        if (!z10) {
            ArrayList arrayList = this.f10185a;
            if (arrayList != null || this.C > 0) {
                int[] F2 = (arrayList != null || this.C <= 0) ? F(arrayList) : new int[]{0, 65535};
                boolean z11 = this.f10194j;
                if ((z11 || (hashMap = this.L) == null) && ((!z11 || (hashMap = this.K) == null) && (hashMap = this.L) == null)) {
                    hashMap = this.K;
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer valueOf = Integer.valueOf(((int[]) entry.getValue())[0]);
                    if (!hashSet.contains(valueOf)) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        int i10 = 0;
                        while (true) {
                            if (i10 < F2.length) {
                                if (intValue >= F2[i10] && intValue <= F2[i10 + 1]) {
                                    hashSet.add(valueOf);
                                    break;
                                }
                                i10 += 2;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        int[] iArr = (int[]) this.f10767w.get("CFF ");
        if (iArr != null) {
            this.f10770z = true;
            this.A = iArr[0];
            this.B = iArr[1];
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        c cVar;
        int i10;
        int[] iArr = (int[]) this.f10767w.get("head");
        if (iArr != null) {
            boolean z10 = false;
            this.f10768x.j(iArr[0] + 16);
            this.F.f10771a = this.f10768x.readUnsignedShort();
            this.F.f10772b = this.f10768x.readUnsignedShort();
            this.f10768x.skipBytes(16);
            this.F.f10773c = this.f10768x.readShort();
            this.F.f10774d = this.f10768x.readShort();
            this.F.f10775e = this.f10768x.readShort();
            this.F.f10776f = this.f10768x.readShort();
            this.F.f10777g = this.f10768x.readUnsignedShort();
            int[] iArr2 = (int[]) this.f10767w.get("hhea");
            if (iArr2 != null) {
                this.f10768x.j(iArr2[0] + 4);
                this.G.f10778a = this.f10768x.readShort();
                this.G.f10779b = this.f10768x.readShort();
                this.G.f10780c = this.f10768x.readShort();
                this.G.f10781d = this.f10768x.readUnsignedShort();
                this.G.f10782e = this.f10768x.readShort();
                this.G.f10783f = this.f10768x.readShort();
                this.G.f10784g = this.f10768x.readShort();
                this.G.f10785h = this.f10768x.readShort();
                this.G.f10786i = this.f10768x.readShort();
                this.f10768x.skipBytes(12);
                this.G.f10787j = this.f10768x.readUnsignedShort();
                int[] iArr3 = (int[]) this.f10767w.get("OS/2");
                if (iArr3 != null) {
                    this.f10768x.j(iArr3[0]);
                    int readUnsignedShort = this.f10768x.readUnsignedShort();
                    this.H.f10788a = this.f10768x.readShort();
                    this.H.f10789b = this.f10768x.readUnsignedShort();
                    this.H.f10790c = this.f10768x.readUnsignedShort();
                    this.H.f10791d = this.f10768x.readShort();
                    this.H.f10792e = this.f10768x.readShort();
                    this.H.f10793f = this.f10768x.readShort();
                    this.H.f10794g = this.f10768x.readShort();
                    this.H.f10795h = this.f10768x.readShort();
                    this.H.f10796i = this.f10768x.readShort();
                    this.H.f10797j = this.f10768x.readShort();
                    this.H.f10798k = this.f10768x.readShort();
                    this.H.f10799l = this.f10768x.readShort();
                    this.H.f10800m = this.f10768x.readShort();
                    this.H.f10801n = this.f10768x.readShort();
                    this.H.f10802o = this.f10768x.readShort();
                    this.f10768x.readFully(this.H.f10803p);
                    this.f10768x.skipBytes(16);
                    this.f10768x.readFully(this.H.f10804q);
                    this.H.f10805r = this.f10768x.readUnsignedShort();
                    this.H.f10806s = this.f10768x.readUnsignedShort();
                    this.H.f10807t = this.f10768x.readUnsignedShort();
                    this.H.f10808u = this.f10768x.readShort();
                    this.H.f10809v = this.f10768x.readShort();
                    c cVar2 = this.H;
                    short s10 = cVar2.f10809v;
                    if (s10 > 0) {
                        cVar2.f10809v = (short) (-s10);
                    }
                    cVar2.f10810w = this.f10768x.readShort();
                    this.H.f10811x = this.f10768x.readUnsignedShort();
                    this.H.f10812y = this.f10768x.readUnsignedShort();
                    c cVar3 = this.H;
                    cVar3.f10813z = 0;
                    cVar3.A = 0;
                    if (readUnsignedShort > 0) {
                        cVar3.f10813z = this.f10768x.readInt();
                        this.H.A = this.f10768x.readInt();
                    }
                    if (readUnsignedShort > 1) {
                        this.f10768x.skipBytes(2);
                        cVar = this.H;
                        i10 = this.f10768x.readShort();
                    } else {
                        cVar = this.H;
                        i10 = (int) (((double) this.F.f10772b) * 0.7d);
                    }
                    cVar.B = i10;
                    int[] iArr4 = (int[]) this.f10767w.get("post");
                    if (iArr4 == null) {
                        b bVar = this.G;
                        this.S = ((-Math.atan2((double) bVar.f10786i, (double) bVar.f10785h)) * 180.0d) / 3.141592653589793d;
                        return;
                    }
                    this.f10768x.j(iArr4[0] + 4);
                    this.S = ((double) this.f10768x.readShort()) + (((double) this.f10768x.readUnsignedShort()) / 16384.0d);
                    this.U = this.f10768x.readShort();
                    this.V = this.f10768x.readShort();
                    if (this.f10768x.readInt() != 0) {
                        z10 = true;
                    }
                    this.T = z10;
                    return;
                }
                throw new g(b8.a.b("table.1.does.not.exist.in.2", "OS/2", this.f10769y + this.E));
            }
            throw new g(b8.a.b("table.1.does.not.exist.in.2", "hhea", this.f10769y + this.E));
        }
        throw new g(b8.a.b("table.1.does.not.exist.in.2", "head", this.f10769y + this.E));
    }

    /* access modifiers changed from: package-private */
    public String[][] H() {
        int[] iArr = (int[]) this.f10767w.get("name");
        if (iArr != null) {
            this.f10768x.j(iArr[0] + 2);
            int readUnsignedShort = this.f10768x.readUnsignedShort();
            int readUnsignedShort2 = this.f10768x.readUnsignedShort();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < readUnsignedShort; i10++) {
                int readUnsignedShort3 = this.f10768x.readUnsignedShort();
                int readUnsignedShort4 = this.f10768x.readUnsignedShort();
                int readUnsignedShort5 = this.f10768x.readUnsignedShort();
                int readUnsignedShort6 = this.f10768x.readUnsignedShort();
                int readUnsignedShort7 = this.f10768x.readUnsignedShort();
                int readUnsignedShort8 = this.f10768x.readUnsignedShort();
                int c10 = this.f10768x.c();
                this.f10768x.j(iArr[0] + readUnsignedShort2 + readUnsignedShort8);
                arrayList.add(new String[]{String.valueOf(readUnsignedShort6), String.valueOf(readUnsignedShort3), String.valueOf(readUnsignedShort4), String.valueOf(readUnsignedShort5), (readUnsignedShort3 == 0 || readUnsignedShort3 == 3 || (readUnsignedShort3 == 2 && readUnsignedShort4 == 1)) ? b0(readUnsignedShort7) : a0(readUnsignedShort7)});
                this.f10768x.j(c10);
            }
            String[][] strArr = new String[arrayList.size()][];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                strArr[i11] = (String[]) arrayList.get(i11);
            }
            return strArr;
        }
        throw new g(b8.a.b("table.1.does.not.exist.in.2", "name", this.f10769y + this.E));
    }

    /* access modifiers changed from: package-private */
    public String I() {
        int[] iArr = (int[]) this.f10767w.get("name");
        if (iArr != null) {
            this.f10768x.j(iArr[0] + 2);
            int readUnsignedShort = this.f10768x.readUnsignedShort();
            int readUnsignedShort2 = this.f10768x.readUnsignedShort();
            for (int i10 = 0; i10 < readUnsignedShort; i10++) {
                int readUnsignedShort3 = this.f10768x.readUnsignedShort();
                this.f10768x.readUnsignedShort();
                this.f10768x.readUnsignedShort();
                int readUnsignedShort4 = this.f10768x.readUnsignedShort();
                int readUnsignedShort5 = this.f10768x.readUnsignedShort();
                int readUnsignedShort6 = this.f10768x.readUnsignedShort();
                if (readUnsignedShort4 == 6) {
                    this.f10768x.j(iArr[0] + readUnsignedShort2 + readUnsignedShort6);
                    return (readUnsignedShort3 == 0 || readUnsignedShort3 == 3) ? b0(readUnsignedShort5) : a0(readUnsignedShort5);
                }
            }
            return new File(this.f10769y).getName().replace(' ', '-');
        }
        throw new g(b8.a.b("table.1.does.not.exist.in.2", "name", this.f10769y + this.E));
    }

    /* access modifiers changed from: protected */
    public l0 J(x0 x0Var, String str, int i10, int i11, byte[] bArr) {
        c1 c1Var;
        c1 c1Var2;
        l0 l0Var = new l0(c1.f10473v3);
        if (this.f10770z) {
            l0Var.r(c1.f10492w9, c1.f10480va);
            c1Var = c1.Z;
            c1Var2 = new c1(this.O + this.E);
        } else {
            l0Var.r(c1.f10492w9, c1.f10350la);
            c1Var = c1.Z;
            c1Var2 = new c1(str + this.O + this.E);
        }
        l0Var.r(c1Var, c1Var2);
        l0Var.r(c1.Z, new c1(str + this.O + this.E));
        if (!this.f10194j) {
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
            if (this.f10191g.equals("Cp1252") || this.f10191g.equals("MacRoman")) {
                l0Var.r(c1.F2, this.f10191g.equals("Cp1252") ? c1.f10364mb : c1.C5);
            } else {
                l0 l0Var2 = new l0(c1.F2);
                b0 b0Var = new b0();
                boolean z10 = true;
                for (int i13 = i10; i13 <= i11; i13++) {
                    if (bArr[i13] != 0) {
                        if (z10) {
                            b0Var.m(new f1(i13));
                            z10 = false;
                        }
                        b0Var.m(new c1(this.f10188d[i13]));
                    } else {
                        z10 = true;
                    }
                }
                l0Var2.r(c1.f10217b2, b0Var);
                l0Var.r(c1.F2, l0Var2);
            }
        }
        l0Var.r(c1.f10266f3, new f1(i10));
        l0Var.r(c1.f10293h5, new f1(i11));
        b0 b0Var2 = new b0();
        while (i10 <= i11) {
            b0Var2.m(bArr[i10] == 0 ? new f1(0) : new f1(this.f10187c[i10]));
            i10++;
        }
        l0Var.r(c1.f10338kb, b0Var2);
        if (x0Var != null) {
            l0Var.r(c1.f10499x3, x0Var);
        }
        return l0Var;
    }

    /* access modifiers changed from: protected */
    public l0 K(x0 x0Var, String str, x0 x0Var2) {
        c1 c1Var;
        c1 c1Var2;
        l0 l0Var = new l0(c1.f10499x3);
        l0Var.r(c1.O, new f1((this.H.f10808u * 1000) / this.F.f10772b));
        l0Var.r(c1.E0, new f1((this.H.B * 1000) / this.F.f10772b));
        l0Var.r(c1.T1, new f1((this.H.f10809v * 1000) / this.F.f10772b));
        c1 c1Var3 = c1.f10486w3;
        a aVar = this.F;
        int i10 = aVar.f10772b;
        l0Var.r(c1Var3, new t1((float) ((aVar.f10773c * 1000) / i10), (float) ((aVar.f10774d * 1000) / i10), (float) ((aVar.f10775e * 1000) / i10), (float) ((aVar.f10776f * 1000) / i10)));
        if (x0Var2 != null) {
            l0Var.r(c1.U0, x0Var2);
        }
        if (!this.f10770z) {
            c1Var = c1.C3;
            c1Var2 = new c1(str + this.O + this.E);
        } else if (this.f10191g.startsWith("Identity-")) {
            c1Var = c1.C3;
            c1Var2 = new c1(str + this.O + "-" + this.f10191g);
        } else {
            c1Var = c1.C3;
            c1Var2 = new c1(str + this.O + this.E);
        }
        l0Var.r(c1Var, c1Var2);
        l0Var.r(c1.R4, new f1(this.S));
        l0Var.r(c1.f10336k9, new f1(80));
        if (x0Var != null) {
            l0Var.r(this.f10770z ? c1.A3 : c1.f10525z3, x0Var);
        }
        boolean z10 = this.T | (this.f10194j ? 4 : ' ');
        int i11 = this.F.f10777g;
        if ((i11 & 2) != 0) {
            z10 |= true;
        }
        if ((i11 & 1) != 0) {
            z10 |= true;
        }
        l0Var.r(c1.f10408q3, new f1(z10 ? 1 : 0));
        return l0Var;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[SYNTHETIC, Splitter:B:13:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] L() {
        /*
            r4 = this;
            r0 = 0
            e8.f2 r1 = new e8.f2     // Catch:{ all -> 0x001a }
            e8.f2 r2 = r4.f10768x     // Catch:{ all -> 0x001a }
            r1.<init>((e8.f2) r2)     // Catch:{ all -> 0x001a }
            r1.f()     // Catch:{ all -> 0x0018 }
            int r0 = r1.e()     // Catch:{ all -> 0x0018 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0018 }
            r1.readFully(r0)     // Catch:{ all -> 0x0018 }
            r1.close()     // Catch:{ Exception -> 0x0017 }
        L_0x0017:
            return r0
        L_0x0018:
            r0 = move-exception
            goto L_0x001e
        L_0x001a:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h2.L():byte[]");
    }

    /* access modifiers changed from: protected */
    public int M(int i10) {
        int[] iArr = this.I;
        if (i10 >= iArr.length) {
            i10 = iArr.length - 1;
        }
        return iArr[i10];
    }

    public int[] N(int i10) {
        HashMap hashMap;
        Object obj;
        HashMap hashMap2 = this.M;
        if (hashMap2 == null) {
            boolean z10 = this.f10194j;
            if (!z10 && (hashMap = this.L) != null) {
                obj = hashMap.get(Integer.valueOf(i10));
                return (int[]) obj;
            } else if ((!z10 || (hashMap2 = this.K) == null) && (hashMap2 = this.L) == null && (hashMap2 = this.K) == null) {
                return null;
            }
        }
        obj = hashMap2.get(Integer.valueOf(i10));
        return (int[]) obj;
    }

    /* access modifiers changed from: package-private */
    public String[][] O(int i10) {
        int[] iArr = (int[]) this.f10767w.get("name");
        if (iArr != null) {
            this.f10768x.j(iArr[0] + 2);
            int readUnsignedShort = this.f10768x.readUnsignedShort();
            int readUnsignedShort2 = this.f10768x.readUnsignedShort();
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < readUnsignedShort; i11++) {
                int readUnsignedShort3 = this.f10768x.readUnsignedShort();
                int readUnsignedShort4 = this.f10768x.readUnsignedShort();
                int readUnsignedShort5 = this.f10768x.readUnsignedShort();
                int readUnsignedShort6 = this.f10768x.readUnsignedShort();
                int readUnsignedShort7 = this.f10768x.readUnsignedShort();
                int readUnsignedShort8 = this.f10768x.readUnsignedShort();
                if (readUnsignedShort6 == i10) {
                    int c10 = this.f10768x.c();
                    this.f10768x.j(iArr[0] + readUnsignedShort2 + readUnsignedShort8);
                    arrayList.add(new String[]{String.valueOf(readUnsignedShort3), String.valueOf(readUnsignedShort4), String.valueOf(readUnsignedShort5), (readUnsignedShort3 == 0 || readUnsignedShort3 == 3 || (readUnsignedShort3 == 2 && readUnsignedShort4 == 1)) ? b0(readUnsignedShort7) : a0(readUnsignedShort7)});
                    this.f10768x.j(c10);
                }
            }
            String[][] strArr = new String[arrayList.size()][];
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                strArr[i12] = (String[]) arrayList.get(i12);
            }
            return strArr;
        }
        throw new g(b8.a.b("table.1.does.not.exist.in.2", "name", this.f10769y + this.E));
    }

    /* access modifiers changed from: package-private */
    public void Q(byte[] bArr, boolean z10) {
        this.f10767w = new HashMap();
        if (bArr == null) {
            try {
                this.f10768x = new f2(this.f10769y, z10, f.f266q);
            } catch (Throwable th2) {
                f2 f2Var = this.f10768x;
                if (f2Var != null) {
                    f2Var.close();
                    if (!this.f10192h) {
                        this.f10768x = null;
                    }
                }
                throw th2;
            }
        } else {
            this.f10768x = new f2(bArr);
        }
        if (this.D.length() > 0) {
            int parseInt = Integer.parseInt(this.D);
            if (parseInt < 0) {
                throw new g(b8.a.b("the.font.index.for.1.must.be.positive", this.f10769y));
            } else if (a0(4).equals("ttcf")) {
                this.f10768x.skipBytes(4);
                int readInt = this.f10768x.readInt();
                if (parseInt < readInt) {
                    this.f10768x.skipBytes(parseInt * 4);
                    this.C = this.f10768x.readInt();
                } else {
                    throw new g(b8.a.b("the.font.index.for.1.must.be.between.0.and.2.it.was.3", this.f10769y, String.valueOf(readInt - 1), String.valueOf(parseInt)));
                }
            } else {
                throw new g(b8.a.b("1.is.not.a.valid.ttc.file", this.f10769y));
            }
        }
        this.f10768x.j(this.C);
        int readInt2 = this.f10768x.readInt();
        if (readInt2 != 65536) {
            if (readInt2 != 1330926671) {
                throw new g(b8.a.b("1.is.not.a.valid.ttf.or.otf.file", this.f10769y));
            }
        }
        int readUnsignedShort = this.f10768x.readUnsignedShort();
        this.f10768x.skipBytes(6);
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            String a02 = a0(4);
            this.f10768x.skipBytes(4);
            this.f10767w.put(a02, new int[]{this.f10768x.readInt(), this.f10768x.readInt()});
        }
        E();
        this.O = I();
        this.P = O(4);
        this.R = O(1);
        this.Q = H();
        if (!this.f10766v) {
            G();
            Y();
            S();
            Z();
            R();
            this.I = null;
        }
        f2 f2Var2 = this.f10768x;
        if (f2Var2 != null) {
            f2Var2.close();
            if (!this.f10192h) {
                this.f10768x = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S() {
        HashMap U2;
        HashMap U3;
        int[] iArr = (int[]) this.f10767w.get("cmap");
        if (iArr != null) {
            this.f10768x.j(iArr[0]);
            this.f10768x.skipBytes(2);
            int readUnsignedShort = this.f10768x.readUnsignedShort();
            this.f10194j = false;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < readUnsignedShort; i14++) {
                int readUnsignedShort2 = this.f10768x.readUnsignedShort();
                int readUnsignedShort3 = this.f10768x.readUnsignedShort();
                int readInt = this.f10768x.readInt();
                if (readUnsignedShort2 == 3 && readUnsignedShort3 == 0) {
                    this.f10194j = true;
                    i12 = readInt;
                } else if (readUnsignedShort2 == 3 && readUnsignedShort3 == 1) {
                    i11 = readInt;
                } else if (readUnsignedShort2 == 3 && readUnsignedShort3 == 10) {
                    i13 = readInt;
                }
                if (readUnsignedShort2 == 1 && readUnsignedShort3 == 0) {
                    i10 = readInt;
                }
            }
            if (i10 > 0) {
                this.f10768x.j(iArr[0] + i10);
                int readUnsignedShort4 = this.f10768x.readUnsignedShort();
                if (readUnsignedShort4 == 0) {
                    U3 = U();
                } else if (readUnsignedShort4 == 4) {
                    U3 = W();
                } else if (readUnsignedShort4 == 6) {
                    U3 = X();
                }
                this.K = U3;
            }
            if (i11 > 0) {
                this.f10768x.j(iArr[0] + i11);
                if (this.f10768x.readUnsignedShort() == 4) {
                    this.L = W();
                }
            }
            if (i12 > 0) {
                this.f10768x.j(iArr[0] + i12);
                if (this.f10768x.readUnsignedShort() == 4) {
                    this.K = W();
                }
            }
            if (i13 > 0) {
                this.f10768x.j(iArr[0] + i13);
                int readUnsignedShort5 = this.f10768x.readUnsignedShort();
                if (readUnsignedShort5 == 0) {
                    U2 = U();
                } else if (readUnsignedShort5 == 4) {
                    U2 = W();
                } else if (readUnsignedShort5 == 6) {
                    U2 = X();
                } else if (readUnsignedShort5 == 12) {
                    U2 = V();
                } else {
                    return;
                }
                this.M = U2;
                return;
            }
            return;
        }
        throw new g(b8.a.b("table.1.does.not.exist.in.2", "cmap", this.f10769y + this.E));
    }

    /* access modifiers changed from: protected */
    public byte[] T() {
        f2 f2Var = new f2(this.f10768x);
        byte[] bArr = new byte[this.B];
        try {
            f2Var.f();
            f2Var.j(this.A);
            f2Var.readFully(bArr);
            return bArr;
        } finally {
            try {
                f2Var.close();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public HashMap U() {
        HashMap hashMap = new HashMap();
        this.f10768x.skipBytes(4);
        for (int i10 = 0; i10 < 256; i10++) {
            int readUnsignedByte = this.f10768x.readUnsignedByte();
            hashMap.put(Integer.valueOf(i10), new int[]{readUnsignedByte, M(readUnsignedByte)});
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public HashMap V() {
        HashMap hashMap = new HashMap();
        this.f10768x.skipBytes(2);
        this.f10768x.readInt();
        this.f10768x.skipBytes(4);
        int readInt = this.f10768x.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            int readInt2 = this.f10768x.readInt();
            int readInt3 = this.f10768x.readInt();
            for (int readInt4 = this.f10768x.readInt(); readInt4 <= readInt2; readInt4++) {
                hashMap.put(Integer.valueOf(readInt4), new int[]{readInt3, M(readInt3)});
                readInt3++;
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public HashMap W() {
        int i10;
        HashMap hashMap = new HashMap();
        int readUnsignedShort = this.f10768x.readUnsignedShort();
        this.f10768x.skipBytes(2);
        int readUnsignedShort2 = this.f10768x.readUnsignedShort() / 2;
        this.f10768x.skipBytes(6);
        int[] iArr = new int[readUnsignedShort2];
        for (int i11 = 0; i11 < readUnsignedShort2; i11++) {
            iArr[i11] = this.f10768x.readUnsignedShort();
        }
        this.f10768x.skipBytes(2);
        int[] iArr2 = new int[readUnsignedShort2];
        for (int i12 = 0; i12 < readUnsignedShort2; i12++) {
            iArr2[i12] = this.f10768x.readUnsignedShort();
        }
        int[] iArr3 = new int[readUnsignedShort2];
        for (int i13 = 0; i13 < readUnsignedShort2; i13++) {
            iArr3[i13] = this.f10768x.readUnsignedShort();
        }
        int[] iArr4 = new int[readUnsignedShort2];
        for (int i14 = 0; i14 < readUnsignedShort2; i14++) {
            iArr4[i14] = this.f10768x.readUnsignedShort();
        }
        int i15 = ((readUnsignedShort / 2) - 8) - (readUnsignedShort2 * 4);
        int[] iArr5 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr5[i16] = this.f10768x.readUnsignedShort();
        }
        for (int i17 = 0; i17 < readUnsignedShort2; i17++) {
            int i18 = iArr2[i17];
            while (i18 <= iArr[i17] && i18 != 65535) {
                int i19 = iArr4[i17];
                if (i19 == 0) {
                    i10 = iArr3[i17] + i18;
                } else {
                    int i20 = ((((i19 / 2) + i17) - readUnsignedShort2) + i18) - iArr2[i17];
                    if (i20 >= i15) {
                        i18++;
                    } else {
                        i10 = iArr5[i20] + iArr3[i17];
                    }
                }
                int i21 = 65535 & i10;
                hashMap.put(Integer.valueOf((!this.f10194j || (65280 & i18) != 61440) ? i18 : i18 & 255), new int[]{i21, M(i21)});
                i18++;
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public HashMap X() {
        HashMap hashMap = new HashMap();
        this.f10768x.skipBytes(4);
        int readUnsignedShort = this.f10768x.readUnsignedShort();
        int readUnsignedShort2 = this.f10768x.readUnsignedShort();
        for (int i10 = 0; i10 < readUnsignedShort2; i10++) {
            int readUnsignedShort3 = this.f10768x.readUnsignedShort();
            hashMap.put(Integer.valueOf(i10 + readUnsignedShort), new int[]{readUnsignedShort3, M(readUnsignedShort3)});
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void Y() {
        int[] iArr = (int[]) this.f10767w.get("hmtx");
        if (iArr != null) {
            this.f10768x.j(iArr[0]);
            this.I = new int[this.G.f10787j];
            for (int i10 = 0; i10 < this.G.f10787j; i10++) {
                this.I[i10] = (this.f10768x.readUnsignedShort() * 1000) / this.F.f10772b;
                this.f10768x.readUnsignedShort();
            }
            return;
        }
        throw new g(b8.a.b("table.1.does.not.exist.in.2", "hmtx", this.f10769y + this.E));
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        int[] iArr = (int[]) this.f10767w.get("kern");
        if (iArr != null) {
            this.f10768x.j(iArr[0] + 2);
            int readUnsignedShort = this.f10768x.readUnsignedShort();
            int i10 = iArr[0] + 4;
            int i11 = 0;
            for (int i12 = 0; i12 < readUnsignedShort; i12++) {
                i10 += i11;
                this.f10768x.j(i10);
                this.f10768x.skipBytes(2);
                i11 = this.f10768x.readUnsignedShort();
                if ((this.f10768x.readUnsignedShort() & 65527) == 1) {
                    int readUnsignedShort2 = this.f10768x.readUnsignedShort();
                    this.f10768x.skipBytes(6);
                    for (int i13 = 0; i13 < readUnsignedShort2; i13++) {
                        this.N.d(this.f10768x.readInt(), (this.f10768x.readShort() * 1000) / this.F.f10772b);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String a0(int i10) {
        byte[] bArr = new byte[i10];
        this.f10768x.readFully(bArr);
        try {
            return new String(bArr, "Cp1252");
        } catch (Exception e10) {
            throw new j(e10);
        }
    }

    /* access modifiers changed from: protected */
    public String b0(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = i10 / 2;
        for (int i12 = 0; i12 < i11; i12++) {
            stringBuffer.append(this.f10768x.readChar());
        }
        return stringBuffer.toString();
    }

    public String[][] k() {
        return this.R;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r3 = r3 * ((float) r2);
        r2 = r1.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        return r3 / ((float) r2.f10772b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r3 = r3 * ((float) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float l(int r2, float r3) {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x00cb;
                case 2: goto L_0x00be;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a8;
                case 6: goto L_0x00a3;
                case 7: goto L_0x009e;
                case 8: goto L_0x0097;
                case 9: goto L_0x0092;
                case 10: goto L_0x008d;
                case 11: goto L_0x0088;
                case 12: goto L_0x007b;
                case 13: goto L_0x006b;
                case 14: goto L_0x0060;
                case 15: goto L_0x0053;
                case 16: goto L_0x0046;
                case 17: goto L_0x0039;
                case 18: goto L_0x002b;
                case 19: goto L_0x001e;
                case 20: goto L_0x0011;
                case 21: goto L_0x000b;
                case 22: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            e8.h2$c r2 = r1.H
            int r2 = r2.f10790c
            float r2 = (float) r2
            return r2
        L_0x000b:
            e8.h2$c r2 = r1.H
            int r2 = r2.f10789b
            float r2 = (float) r2
            return r2
        L_0x0011:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10799l
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x001e:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10797j
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x002b:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10795h
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x0039:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10793f
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x0046:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10800m
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x0053:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10801n
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x0060:
            int r2 = r1.V
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x006b:
            int r2 = r1.U
            int r0 = r1.V
            int r0 = r0 / 2
            int r2 = r2 - r0
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x007b:
            e8.h2$b r2 = r1.G
            int r2 = r2.f10781d
        L_0x007f:
            float r2 = (float) r2
            float r3 = r3 * r2
            e8.h2$a r2 = r1.F
        L_0x0083:
            int r2 = r2.f10772b
            float r2 = (float) r2
            float r3 = r3 / r2
            return r3
        L_0x0088:
            e8.h2$b r2 = r1.G
            short r2 = r2.f10780c
            goto L_0x007f
        L_0x008d:
            e8.h2$b r2 = r1.G
            short r2 = r2.f10779b
            goto L_0x007f
        L_0x0092:
            e8.h2$b r2 = r1.G
            short r2 = r2.f10778a
            goto L_0x007f
        L_0x0097:
            e8.h2$a r2 = r1.F
            short r0 = r2.f10776f
        L_0x009b:
            float r0 = (float) r0
            float r3 = r3 * r0
            goto L_0x0083
        L_0x009e:
            e8.h2$a r2 = r1.F
            short r0 = r2.f10775e
            goto L_0x009b
        L_0x00a3:
            e8.h2$a r2 = r1.F
            short r0 = r2.f10774d
            goto L_0x009b
        L_0x00a8:
            e8.h2$a r2 = r1.F
            short r0 = r2.f10773c
            goto L_0x009b
        L_0x00ad:
            double r2 = r1.S
            float r2 = (float) r2
            return r2
        L_0x00b1:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10809v
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x00be:
            e8.h2$c r2 = r1.H
            int r2 = r2.B
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L_0x00cb:
            e8.h2$c r2 = r1.H
            short r2 = r2.f10808u
            float r2 = (float) r2
            float r2 = r2 * r3
            e8.h2$a r3 = r1.F
            int r3 = r3.f10772b
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h2.l(int, float):float");
    }

    public String n() {
        return this.O;
    }

    /* access modifiers changed from: protected */
    public int[] o(int i10, String str) {
        HashMap hashMap;
        int[] iArr;
        int[][] iArr2;
        if (str == null || (hashMap = this.L) == null) {
            hashMap = this.K;
        }
        if (hashMap == null || (iArr = (int[]) hashMap.get(Integer.valueOf(i10))) == null || (iArr2 = this.J) == null) {
            return null;
        }
        return iArr2[iArr[0]];
    }

    /* access modifiers changed from: package-private */
    public int p(int i10, String str) {
        int[] N2 = N(i10);
        if (N2 == null) {
            return 0;
        }
        return N2[1];
    }

    h2(String str, String str2, boolean z10, byte[] bArr, boolean z11, boolean z12) {
        this.f10766v = z11;
        String i10 = c.i(str);
        String P2 = P(i10);
        if (i10.length() < str.length()) {
            this.E = str.substring(i10.length());
        }
        this.f10191g = str2;
        this.f10192h = z10;
        this.f10769y = P2;
        this.f10186b = 1;
        this.D = "";
        if (P2.length() < i10.length()) {
            this.D = i10.substring(P2.length() + 1);
        }
        if (this.f10769y.toLowerCase().endsWith(".ttf") || this.f10769y.toLowerCase().endsWith(".otf") || this.f10769y.toLowerCase().endsWith(".ttc")) {
            Q(bArr, z12);
            if (z11 || !this.f10192h || this.H.f10791d != 2) {
                if (!this.f10191g.startsWith("#")) {
                    o0.c(" ", str2);
                }
                c();
                return;
            }
            throw new g(b8.a.b("1.cannot.be.embedded.due.to.licensing.restrictions", this.f10769y + this.E));
        }
        throw new g(b8.a.b("1.is.not.a.ttf.otf.or.ttc.font.file", this.f10769y + this.E));
    }
}
