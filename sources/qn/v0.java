package qn;

public class v0 extends v {

    /* renamed from: h  reason: collision with root package name */
    private final int f31010h;

    /* renamed from: i  reason: collision with root package name */
    private final v[] f31011i;

    public v0(byte[] bArr) {
        this(bArr, 1000);
    }

    static byte[] m0(v[] vVarArr) {
        if (r0 == 0) {
            return v.f31008g;
        }
        if (r0 == 1) {
            return vVarArr[0].f31009e;
        }
        int i10 = 0;
        for (v vVar : vVarArr) {
            i10 += vVar.f31009e.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (v vVar2 : vVarArr) {
            byte[] bArr2 = vVar2.f31009e;
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        if (!E()) {
            byte[] bArr = this.f31009e;
            q1.m0(xVar, z10, bArr, 0, bArr.length);
            return;
        }
        xVar.s(z10, 36);
        xVar.i(128);
        v[] vVarArr = this.f31011i;
        if (vVarArr == null) {
            int i10 = 0;
            while (true) {
                byte[] bArr2 = this.f31009e;
                if (i10 >= bArr2.length) {
                    break;
                }
                int min = Math.min(bArr2.length - i10, this.f31010h);
                q1.m0(xVar, true, this.f31009e, i10, min);
                i10 += min;
            }
        } else {
            xVar.v(vVarArr);
        }
        xVar.i(0);
        xVar.i(0);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f31011i != null || this.f31009e.length > this.f31010h;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        if (!E()) {
            return q1.n0(z10, this.f31009e.length);
        }
        int i10 = z10 ? 4 : 3;
        if (this.f31011i != null) {
            int i11 = 0;
            while (true) {
                v[] vVarArr = this.f31011i;
                if (i11 >= vVarArr.length) {
                    return i10;
                }
                i10 += vVarArr[i11].T(true);
                i11++;
            }
        } else {
            int length = this.f31009e.length;
            int i12 = this.f31010h;
            int i13 = length / i12;
            int n02 = i10 + (q1.n0(true, i12) * i13);
            int length2 = this.f31009e.length - (i13 * this.f31010h);
            return length2 > 0 ? n02 + q1.n0(true, length2) : n02;
        }
    }

    public v0(byte[] bArr, int i10) {
        this(bArr, (v[]) null, i10);
    }

    private v0(byte[] bArr, v[] vVarArr, int i10) {
        super(bArr);
        this.f31011i = vVarArr;
        this.f31010h = i10;
    }

    public v0(v[] vVarArr) {
        this(vVarArr, 1000);
    }

    public v0(v[] vVarArr, int i10) {
        this(m0(vVarArr), vVarArr, i10);
    }
}
