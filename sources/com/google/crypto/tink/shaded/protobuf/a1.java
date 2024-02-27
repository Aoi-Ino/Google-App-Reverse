package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class a1 extends c implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private static final a1 f7036h;

    /* renamed from: f  reason: collision with root package name */
    private Object[] f7037f;

    /* renamed from: g  reason: collision with root package name */
    private int f7038g;

    static {
        a1 a1Var = new a1(new Object[0], 0);
        f7036h = a1Var;
        a1Var.u();
    }

    private a1(Object[] objArr, int i10) {
        this.f7037f = objArr;
        this.f7038g = i10;
    }

    private static Object[] n(int i10) {
        return new Object[i10];
    }

    public static a1 o() {
        return f7036h;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f7038g) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7038g;
    }

    public void add(int i10, Object obj) {
        int i11;
        l();
        if (i10 < 0 || i10 > (i11 = this.f7038g)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        Object[] objArr = this.f7037f;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] n10 = n(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f7037f, 0, n10, 0, i10);
            System.arraycopy(this.f7037f, i10, n10, i10 + 1, this.f7038g - i10);
            this.f7037f = n10;
        }
        this.f7037f[i10] = obj;
        this.f7038g++;
        this.modCount++;
    }

    public Object get(int i10) {
        r(i10);
        return this.f7037f[i10];
    }

    public Object remove(int i10) {
        l();
        r(i10);
        Object[] objArr = this.f7037f;
        Object obj = objArr[i10];
        int i11 = this.f7038g;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f7038g--;
        this.modCount++;
        return obj;
    }

    public Object set(int i10, Object obj) {
        l();
        r(i10);
        Object[] objArr = this.f7037f;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.f7038g;
    }

    /* renamed from: v */
    public a1 z(int i10) {
        if (i10 >= this.f7038g) {
            return new a1(Arrays.copyOf(this.f7037f, i10), this.f7038g);
        }
        throw new IllegalArgumentException();
    }

    public boolean add(Object obj) {
        l();
        int i10 = this.f7038g;
        Object[] objArr = this.f7037f;
        if (i10 == objArr.length) {
            this.f7037f = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7037f;
        int i11 = this.f7038g;
        this.f7038g = i11 + 1;
        objArr2[i11] = obj;
        this.modCount++;
        return true;
    }
}
