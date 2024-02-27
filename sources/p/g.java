package p;

class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f14541a;

    /* renamed from: b  reason: collision with root package name */
    private int f14542b;

    g(int i10) {
        if (i10 > 0) {
            this.f14541a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(Object obj) {
        int i10 = this.f14542b;
        Object[] objArr = this.f14541a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f14542b = i10 + 1;
        return true;
    }

    public Object b() {
        int i10 = this.f14542b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f14541a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f14542b = i10 - 1;
        return obj;
    }

    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f14542b;
            Object[] objArr2 = this.f14541a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f14542b = i12 + 1;
            }
        }
    }
}
