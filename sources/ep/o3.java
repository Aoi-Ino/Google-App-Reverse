package ep;

class o3 {

    /* renamed from: a  reason: collision with root package name */
    protected String f23361a;

    /* renamed from: b  reason: collision with root package name */
    protected char[] f23362b;

    /* renamed from: c  reason: collision with root package name */
    protected int f23363c;

    public o3() {
        this(16);
    }

    public void a(char c10) {
        f(this.f23363c + 1);
        char[] cArr = this.f23362b;
        int i10 = this.f23363c;
        this.f23363c = i10 + 1;
        cArr[i10] = c10;
    }

    public void b(o3 o3Var) {
        d(o3Var.f23362b, 0, o3Var.f23363c);
    }

    public void c(String str) {
        f(this.f23363c + str.length());
        str.getChars(0, str.length(), this.f23362b, this.f23363c);
        this.f23363c += str.length();
    }

    public void d(char[] cArr, int i10, int i11) {
        f(this.f23363c + i11);
        System.arraycopy(cArr, i10, this.f23362b, this.f23363c, i11);
        this.f23363c += i11;
    }

    public void e() {
        this.f23361a = null;
        this.f23363c = 0;
    }

    /* access modifiers changed from: protected */
    public void f(int i10) {
        char[] cArr = this.f23362b;
        if (cArr.length < i10) {
            char[] cArr2 = new char[Math.max(i10, cArr.length * 2)];
            System.arraycopy(this.f23362b, 0, cArr2, 0, this.f23363c);
            this.f23362b = cArr2;
        }
    }

    public int g() {
        return this.f23363c;
    }

    public String toString() {
        return new String(this.f23362b, 0, this.f23363c);
    }

    public o3(int i10) {
        this.f23362b = new char[i10];
    }
}
