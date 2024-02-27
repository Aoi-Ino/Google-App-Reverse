package cm;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class a implements Iterator, dm.a {

    /* renamed from: e  reason: collision with root package name */
    private final Object[] f20208e;

    /* renamed from: f  reason: collision with root package name */
    private int f20209f;

    public a(Object[] objArr) {
        l.f(objArr, "array");
        this.f20208e = objArr;
    }

    public boolean hasNext() {
        return this.f20209f < this.f20208e.length;
    }

    public Object next() {
        try {
            Object[] objArr = this.f20208e;
            int i10 = this.f20209f;
            this.f20209f = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f20209f--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
