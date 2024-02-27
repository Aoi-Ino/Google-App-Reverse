package jm;

import bm.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class f implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final bm.a f24642a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f24643b;

    public static final class a implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private Object f24644e;

        /* renamed from: f  reason: collision with root package name */
        private int f24645f = -2;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f24646g;

        a(f fVar) {
            this.f24646g = fVar;
        }

        private final void a() {
            Object obj;
            if (this.f24645f == -2) {
                obj = this.f24646g.f24642a.a();
            } else {
                l c10 = this.f24646g.f24643b;
                Object obj2 = this.f24644e;
                cm.l.c(obj2);
                obj = c10.invoke(obj2);
            }
            this.f24644e = obj;
            this.f24645f = obj == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f24645f < 0) {
                a();
            }
            return this.f24645f == 1;
        }

        public Object next() {
            if (this.f24645f < 0) {
                a();
            }
            if (this.f24645f != 0) {
                Object obj = this.f24644e;
                cm.l.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f24645f = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(bm.a aVar, l lVar) {
        cm.l.f(aVar, "getInitialValue");
        cm.l.f(lVar, "getNextValue");
        this.f24642a = aVar;
        this.f24643b = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
