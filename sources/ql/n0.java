package ql;

import cm.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

final class n0 extends c implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f30778f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f30779g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f30780h;

    /* renamed from: i  reason: collision with root package name */
    private int f30781i;

    public static final class a extends b {

        /* renamed from: g  reason: collision with root package name */
        private int f30782g;

        /* renamed from: h  reason: collision with root package name */
        private int f30783h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ n0 f30784i;

        a(n0 n0Var) {
            this.f30784i = n0Var;
            this.f30782g = n0Var.size();
            this.f30783h = n0Var.f30780h;
        }

        /* access modifiers changed from: protected */
        public void a() {
            if (this.f30782g == 0) {
                b();
                return;
            }
            d(this.f30784i.f30778f[this.f30783h]);
            this.f30783h = (this.f30783h + 1) % this.f30784i.f30779g;
            this.f30782g--;
        }
    }

    public n0(int i10) {
        this(new Object[i10], 0);
    }

    public final void B(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        } else if (i10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        } else if (i10 > 0) {
            int i11 = this.f30780h;
            int o10 = (i11 + i10) % this.f30779g;
            Object[] objArr = this.f30778f;
            if (i11 > o10) {
                l.k(objArr, (Object) null, i11, this.f30779g);
                l.k(this.f30778f, (Object) null, 0, o10);
            } else {
                l.k(objArr, (Object) null, i11, o10);
            }
            this.f30780h = o10;
            this.f30781i = size() - i10;
        }
    }

    public Object get(int i10) {
        c.f30755e.a(i10, size());
        return this.f30778f[(this.f30780h + i10) % this.f30779g];
    }

    public Iterator iterator() {
        return new a(this);
    }

    public int l() {
        return this.f30781i;
    }

    public final void s(Object obj) {
        if (!y()) {
            this.f30778f[(this.f30780h + size()) % this.f30779g] = obj;
            this.f30781i = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public final n0 v(int i10) {
        Object[] objArr;
        int i11 = this.f30779g;
        int d10 = f.d(i11 + (i11 >> 1) + 1, i10);
        if (this.f30780h == 0) {
            objArr = Arrays.copyOf(this.f30778f, d10);
            l.e(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[d10]);
        }
        return new n0(objArr, size());
    }

    public final boolean y() {
        return size() == this.f30779g;
    }

    public n0(Object[] objArr, int i10) {
        l.f(objArr, "buffer");
        this.f30778f = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        } else if (i10 <= objArr.length) {
            this.f30779g = objArr.length;
            this.f30781i = i10;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    public Object[] toArray(Object[] objArr) {
        l.f(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            l.e(objArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = this.f30780h;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size && i10 < this.f30779g) {
            objArr[i12] = this.f30778f[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            objArr[i12] = this.f30778f[i11];
            i12++;
            i11++;
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }
}
