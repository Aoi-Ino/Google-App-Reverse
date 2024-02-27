package androidx.core.util;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f2517a;

    /* renamed from: b  reason: collision with root package name */
    private int f2518b;

    public e(int i10) {
        if (i10 > 0) {
            this.f2517a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(Object obj) {
        for (int i10 = 0; i10 < this.f2518b; i10++) {
            if (this.f2517a[i10] == obj) {
                return true;
            }
        }
        return false;
    }

    public boolean a(Object obj) {
        if (!c(obj)) {
            int i10 = this.f2518b;
            Object[] objArr = this.f2517a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = obj;
            this.f2518b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public Object b() {
        int i10 = this.f2518b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f2517a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f2518b = i10 - 1;
        return obj;
    }
}
