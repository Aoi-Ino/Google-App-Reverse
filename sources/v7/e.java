package v7;

import u7.a;
import u7.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private b f17368a = null;

    /* renamed from: b  reason: collision with root package name */
    private a f17369b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f17370c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f17371d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f17372e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f17373f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f17374g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f17375h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f17376i = -1;

    /* renamed from: j  reason: collision with root package name */
    private r7.b f17377j = null;

    public static boolean j(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public a a() {
        return this.f17369b;
    }

    public int b() {
        return this.f17372e;
    }

    public r7.b c() {
        return this.f17377j;
    }

    public int d() {
        return this.f17371d;
    }

    public int e() {
        return this.f17374g;
    }

    public int f() {
        return this.f17376i;
    }

    public int g() {
        return this.f17373f;
    }

    public int h() {
        return this.f17370c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r0 = r3.f17377j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r0 = r3.f17372e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i() {
        /*
            r3 = this;
            u7.b r0 = r3.f17368a
            if (r0 == 0) goto L_0x0050
            u7.a r0 = r3.f17369b
            if (r0 == 0) goto L_0x0050
            int r0 = r3.f17370c
            r1 = -1
            if (r0 == r1) goto L_0x0050
            int r0 = r3.f17371d
            if (r0 == r1) goto L_0x0050
            int r0 = r3.f17372e
            if (r0 == r1) goto L_0x0050
            int r2 = r3.f17373f
            if (r2 == r1) goto L_0x0050
            int r2 = r3.f17374g
            if (r2 == r1) goto L_0x0050
            int r2 = r3.f17375h
            if (r2 == r1) goto L_0x0050
            int r2 = r3.f17376i
            if (r2 == r1) goto L_0x0050
            boolean r0 = j(r0)
            if (r0 == 0) goto L_0x0050
            int r0 = r3.f17373f
            int r1 = r3.f17374g
            int r2 = r3.f17375h
            int r1 = r1 + r2
            if (r0 != r1) goto L_0x0050
            r7.b r0 = r3.f17377j
            if (r0 == 0) goto L_0x0050
            int r1 = r3.f17371d
            int r0 = r0.f()
            if (r1 != r0) goto L_0x0050
            r7.b r0 = r3.f17377j
            int r0 = r0.f()
            r7.b r1 = r3.f17377j
            int r1 = r1.d()
            if (r0 != r1) goto L_0x0050
            r0 = 1
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.e.i():boolean");
    }

    public void k(a aVar) {
        this.f17369b = aVar;
    }

    public void l(int i10) {
        this.f17372e = i10;
    }

    public void m(r7.b bVar) {
        this.f17377j = bVar;
    }

    public void n(int i10) {
        this.f17371d = i10;
    }

    public void o(b bVar) {
        this.f17368a = bVar;
    }

    public void p(int i10) {
        this.f17374g = i10;
    }

    public void q(int i10) {
        this.f17375h = i10;
    }

    public void r(int i10) {
        this.f17376i = i10;
    }

    public void s(int i10) {
        this.f17373f = i10;
    }

    public void t(int i10) {
        this.f17370c = i10;
    }

    public String toString() {
        String bVar;
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append("<<\n");
        stringBuffer.append(" mode: ");
        stringBuffer.append(this.f17368a);
        stringBuffer.append("\n ecLevel: ");
        stringBuffer.append(this.f17369b);
        stringBuffer.append("\n version: ");
        stringBuffer.append(this.f17370c);
        stringBuffer.append("\n matrixWidth: ");
        stringBuffer.append(this.f17371d);
        stringBuffer.append("\n maskPattern: ");
        stringBuffer.append(this.f17372e);
        stringBuffer.append("\n numTotalBytes: ");
        stringBuffer.append(this.f17373f);
        stringBuffer.append("\n numDataBytes: ");
        stringBuffer.append(this.f17374g);
        stringBuffer.append("\n numECBytes: ");
        stringBuffer.append(this.f17375h);
        stringBuffer.append("\n numRSBlocks: ");
        stringBuffer.append(this.f17376i);
        if (this.f17377j == null) {
            bVar = "\n matrix: null\n";
        } else {
            stringBuffer.append("\n matrix:\n");
            bVar = this.f17377j.toString();
        }
        stringBuffer.append(bVar);
        stringBuffer.append(">>\n");
        return stringBuffer.toString();
    }
}
