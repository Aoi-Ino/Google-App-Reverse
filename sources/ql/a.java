package ql;

import bm.l;
import cm.f;
import cm.m;
import java.util.Collection;

public abstract class a implements Collection, dm.a {

    /* renamed from: ql.a$a  reason: collision with other inner class name */
    static final class C0341a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f30749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0341a(a aVar) {
            super(1);
            this.f30749e = aVar;
        }

        /* renamed from: b */
        public final CharSequence invoke(Object obj) {
            return obj == this.f30749e ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected a() {
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a10 : this) {
            if (cm.l.a(a10, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        cm.l.f(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract int l();

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return l();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public String toString() {
        return y.d0(this, ", ", "[", "]", 0, (CharSequence) null, new C0341a(this), 24, (Object) null);
    }

    public Object[] toArray(Object[] objArr) {
        cm.l.f(objArr, "array");
        return f.b(this, objArr);
    }
}
