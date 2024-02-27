package qn;

public class g {

    /* renamed from: d  reason: collision with root package name */
    static final f[] f30916d = new f[0];

    /* renamed from: a  reason: collision with root package name */
    private f[] f30917a;

    /* renamed from: b  reason: collision with root package name */
    private int f30918b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30919c;

    public g() {
        this(10);
    }

    static f[] b(f[] fVarArr) {
        return fVarArr.length < 1 ? f30916d : (f[]) fVarArr.clone();
    }

    private void e(int i10) {
        f[] fVarArr = new f[Math.max(this.f30917a.length, i10 + (i10 >> 1))];
        System.arraycopy(this.f30917a, 0, fVarArr, 0, this.f30918b);
        this.f30917a = fVarArr;
        this.f30919c = false;
    }

    public void a(f fVar) {
        if (fVar != null) {
            int length = this.f30917a.length;
            boolean z10 = true;
            int i10 = this.f30918b + 1;
            if (i10 <= length) {
                z10 = false;
            }
            if (this.f30919c || z10) {
                e(i10);
            }
            this.f30917a[this.f30918b] = fVar;
            this.f30918b = i10;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* access modifiers changed from: package-private */
    public f[] c() {
        int i10 = this.f30918b;
        if (i10 == 0) {
            return f30916d;
        }
        f[] fVarArr = new f[i10];
        System.arraycopy(this.f30917a, 0, fVarArr, 0, i10);
        return fVarArr;
    }

    public f d(int i10) {
        if (i10 < this.f30918b) {
            return this.f30917a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10 + " >= " + this.f30918b);
    }

    public int f() {
        return this.f30918b;
    }

    /* access modifiers changed from: package-private */
    public f[] g() {
        int i10 = this.f30918b;
        if (i10 == 0) {
            return f30916d;
        }
        f[] fVarArr = this.f30917a;
        if (fVarArr.length == i10) {
            this.f30919c = true;
            return fVarArr;
        }
        f[] fVarArr2 = new f[i10];
        System.arraycopy(fVarArr, 0, fVarArr2, 0, i10);
        return fVarArr2;
    }

    public g(int i10) {
        if (i10 >= 0) {
            this.f30917a = i10 == 0 ? f30916d : new f[i10];
            this.f30918b = 0;
            this.f30919c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }
}
