package fo;

import ko.a;
import qn.c0;
import qn.g;
import qn.p;
import qn.q1;
import qn.s;
import qn.u;
import qn.u1;
import qn.v;
import qn.z;

public class f extends s {

    /* renamed from: e  reason: collision with root package name */
    private p f23642e;

    /* renamed from: f  reason: collision with root package name */
    private u f23643f;

    /* renamed from: g  reason: collision with root package name */
    private byte[][] f23644g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f23645h;

    /* renamed from: i  reason: collision with root package name */
    private byte[][] f23646i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f23647j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f23648k;

    /* renamed from: l  reason: collision with root package name */
    private a[] f23649l;

    private f(c0 c0Var) {
        c0 c0Var2 = c0Var;
        int i10 = 0;
        if (c0Var2.l0(0) instanceof p) {
            this.f23642e = p.j0(c0Var2.l0(0));
        } else {
            this.f23643f = u.n0(c0Var2.l0(0));
        }
        c0 c0Var3 = (c0) c0Var2.l0(1);
        this.f23644g = new byte[c0Var3.size()][];
        for (int i11 = 0; i11 < c0Var3.size(); i11++) {
            this.f23644g[i11] = ((v) c0Var3.l0(i11)).l0();
        }
        this.f23645h = ((v) ((c0) c0Var2.l0(2)).l0(0)).l0();
        c0 c0Var4 = (c0) c0Var2.l0(3);
        this.f23646i = new byte[c0Var4.size()][];
        for (int i12 = 0; i12 < c0Var4.size(); i12++) {
            this.f23646i[i12] = ((v) c0Var4.l0(i12)).l0();
        }
        this.f23647j = ((v) ((c0) c0Var2.l0(4)).l0(0)).l0();
        this.f23648k = ((v) ((c0) c0Var2.l0(5)).l0(0)).l0();
        c0 c0Var5 = (c0) c0Var2.l0(6);
        byte[][][][] bArr = new byte[c0Var5.size()][][][];
        byte[][][][] bArr2 = new byte[c0Var5.size()][][][];
        byte[][][] bArr3 = new byte[c0Var5.size()][][];
        byte[][] bArr4 = new byte[c0Var5.size()][];
        int i13 = 0;
        while (i13 < c0Var5.size()) {
            c0 c0Var6 = (c0) c0Var5.l0(i13);
            c0 c0Var7 = (c0) c0Var6.l0(i10);
            bArr[i13] = new byte[c0Var7.size()][][];
            for (int i14 = i10; i14 < c0Var7.size(); i14++) {
                c0 c0Var8 = (c0) c0Var7.l0(i14);
                bArr[i13][i14] = new byte[c0Var8.size()][];
                for (int i15 = 0; i15 < c0Var8.size(); i15++) {
                    bArr[i13][i14][i15] = ((v) c0Var8.l0(i15)).l0();
                }
            }
            c0 c0Var9 = (c0) c0Var6.l0(1);
            bArr2[i13] = new byte[c0Var9.size()][][];
            for (int i16 = 0; i16 < c0Var9.size(); i16++) {
                c0 c0Var10 = (c0) c0Var9.l0(i16);
                bArr2[i13][i16] = new byte[c0Var10.size()][];
                for (int i17 = 0; i17 < c0Var10.size(); i17++) {
                    bArr2[i13][i16][i17] = ((v) c0Var10.l0(i17)).l0();
                }
            }
            c0 c0Var11 = (c0) c0Var6.l0(2);
            bArr3[i13] = new byte[c0Var11.size()][];
            for (int i18 = 0; i18 < c0Var11.size(); i18++) {
                bArr3[i13][i18] = ((v) c0Var11.l0(i18)).l0();
            }
            bArr4[i13] = ((v) c0Var6.l0(3)).l0();
            i13++;
            i10 = 0;
        }
        int length = this.f23648k.length - 1;
        this.f23649l = new a[length];
        int i19 = 0;
        while (i19 < length) {
            byte[] bArr5 = this.f23648k;
            int i20 = i19 + 1;
            this.f23649l[i19] = new a(bArr5[i19], bArr5[i20], lo.a.f(bArr[i19]), lo.a.f(bArr2[i19]), lo.a.d(bArr3[i19]), lo.a.b(bArr4[i19]));
            i19 = i20;
        }
    }

    public static f E(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(c0.k0(obj));
        }
        return null;
    }

    public short[] B() {
        return lo.a.b(this.f23647j);
    }

    public short[][] F() {
        return lo.a.d(this.f23644g);
    }

    public short[][] H() {
        return lo.a.d(this.f23646i);
    }

    public a[] T() {
        return this.f23649l;
    }

    public int[] Y() {
        return lo.a.g(this.f23648k);
    }

    public z n() {
        g gVar = new g();
        qn.f fVar = this.f23642e;
        if (fVar == null) {
            fVar = this.f23643f;
        }
        gVar.a(fVar);
        g gVar2 = new g();
        for (byte[] q1Var : this.f23644g) {
            gVar2.a(new q1(q1Var));
        }
        gVar.a(new u1(gVar2));
        g gVar3 = new g();
        gVar3.a(new q1(this.f23645h));
        gVar.a(new u1(gVar3));
        g gVar4 = new g();
        for (byte[] q1Var2 : this.f23646i) {
            gVar4.a(new q1(q1Var2));
        }
        gVar.a(new u1(gVar4));
        g gVar5 = new g();
        gVar5.a(new q1(this.f23647j));
        gVar.a(new u1(gVar5));
        g gVar6 = new g();
        gVar6.a(new q1(this.f23648k));
        gVar.a(new u1(gVar6));
        g gVar7 = new g();
        for (int i10 = 0; i10 < this.f23649l.length; i10++) {
            g gVar8 = new g();
            byte[][][] e10 = lo.a.e(this.f23649l[i10].a());
            g gVar9 = new g();
            for (int i11 = 0; i11 < e10.length; i11++) {
                g gVar10 = new g();
                for (byte[] q1Var3 : e10[i11]) {
                    gVar10.a(new q1(q1Var3));
                }
                gVar9.a(new u1(gVar10));
            }
            gVar8.a(new u1(gVar9));
            byte[][][] e11 = lo.a.e(this.f23649l[i10].b());
            g gVar11 = new g();
            for (int i12 = 0; i12 < e11.length; i12++) {
                g gVar12 = new g();
                for (byte[] q1Var4 : e11[i12]) {
                    gVar12.a(new q1(q1Var4));
                }
                gVar11.a(new u1(gVar12));
            }
            gVar8.a(new u1(gVar11));
            byte[][] c10 = lo.a.c(this.f23649l[i10].d());
            g gVar13 = new g();
            for (byte[] q1Var5 : c10) {
                gVar13.a(new q1(q1Var5));
            }
            gVar8.a(new u1(gVar13));
            gVar8.a(new q1(lo.a.a(this.f23649l[i10].c())));
            gVar7.a(new u1(gVar8));
        }
        gVar.a(new u1(gVar7));
        return new u1(gVar);
    }

    public short[] y() {
        return lo.a.b(this.f23645h);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, a[] aVarArr) {
        this.f23642e = new p(1);
        this.f23644g = lo.a.c(sArr);
        this.f23645h = lo.a.a(sArr2);
        this.f23646i = lo.a.c(sArr3);
        this.f23647j = lo.a.a(sArr4);
        this.f23648k = lo.a.h(iArr);
        this.f23649l = aVarArr;
    }
}
