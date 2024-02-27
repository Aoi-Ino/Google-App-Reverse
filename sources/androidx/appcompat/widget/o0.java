package androidx.appcompat.widget;

class o0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1496a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1497b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1498c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1499d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1500e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1501f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1502g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1503h = false;

    o0() {
    }

    public int a() {
        return this.f1502g ? this.f1496a : this.f1497b;
    }

    public int b() {
        return this.f1496a;
    }

    public int c() {
        return this.f1497b;
    }

    public int d() {
        return this.f1502g ? this.f1497b : this.f1496a;
    }

    public void e(int i10, int i11) {
        this.f1503h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1500e = i10;
            this.f1496a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1501f = i11;
            this.f1497b = i11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1502g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1502g = r2
            boolean r0 = r1.f1503h
            if (r0 == 0) goto L_0x002d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001f
            int r2 = r1.f1499d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1500e
        L_0x0016:
            r1.f1496a = r2
            int r2 = r1.f1498c
            if (r2 == r0) goto L_0x0031
        L_0x001c:
            r1.f1497b = r2
            goto L_0x0034
        L_0x001f:
            int r2 = r1.f1498c
            if (r2 == r0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            int r2 = r1.f1500e
        L_0x0026:
            r1.f1496a = r2
            int r2 = r1.f1499d
            if (r2 == r0) goto L_0x0031
            goto L_0x001c
        L_0x002d:
            int r2 = r1.f1500e
            r1.f1496a = r2
        L_0x0031:
            int r2 = r1.f1501f
            goto L_0x001c
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f1498c = i10;
        this.f1499d = i11;
        this.f1503h = true;
        if (this.f1502g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1496a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1497b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1496a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1497b = i11;
        }
    }
}
