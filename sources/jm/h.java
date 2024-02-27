package jm;

import cm.l;
import dm.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import pl.p;
import pl.q;
import pl.x;
import tl.d;
import tl.g;

final class h extends i implements Iterator, d, a {

    /* renamed from: e  reason: collision with root package name */
    private int f24647e;

    /* renamed from: f  reason: collision with root package name */
    private Object f24648f;

    /* renamed from: g  reason: collision with root package name */
    private Iterator f24649g;

    /* renamed from: h  reason: collision with root package name */
    private d f24650h;

    private final Throwable b() {
        int i10 = this.f24647e;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f24647e);
    }

    private final Object d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public Object a(Object obj, d dVar) {
        this.f24648f = obj;
        this.f24647e = 3;
        this.f24650h = dVar;
        Object c10 = d.c();
        if (c10 == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return c10 == d.c() ? c10 : x.f30437a;
    }

    public final void e(d dVar) {
        this.f24650h = dVar;
    }

    public g getContext() {
        return tl.h.f31683e;
    }

    public boolean hasNext() {
        while (true) {
            int i10 = this.f24647e;
            if (i10 != 0) {
                if (i10 == 1) {
                    Iterator it = this.f24649g;
                    l.c(it);
                    if (it.hasNext()) {
                        this.f24647e = 2;
                        return true;
                    }
                    this.f24649g = null;
                } else if (i10 == 2 || i10 == 3) {
                    return true;
                } else {
                    if (i10 == 4) {
                        return false;
                    }
                    throw b();
                }
            }
            this.f24647e = 5;
            d dVar = this.f24650h;
            l.c(dVar);
            this.f24650h = null;
            p.a aVar = p.f30426e;
            dVar.resumeWith(p.a(x.f30437a));
        }
    }

    public Object next() {
        int i10 = this.f24647e;
        if (i10 == 0 || i10 == 1) {
            return d();
        }
        if (i10 == 2) {
            this.f24647e = 1;
            Iterator it = this.f24649g;
            l.c(it);
            return it.next();
        } else if (i10 == 3) {
            this.f24647e = 0;
            Object obj = this.f24648f;
            this.f24648f = null;
            return obj;
        } else {
            throw b();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        q.b(obj);
        this.f24647e = 4;
    }
}
