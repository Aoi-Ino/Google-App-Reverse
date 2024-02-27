package o;

import cm.l;
import java.util.Iterator;
import ql.e0;

public abstract class i {

    public static final class a extends e0 {

        /* renamed from: e  reason: collision with root package name */
        private int f14312e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f14313f;

        a(h hVar) {
            this.f14313f = hVar;
        }

        public int a() {
            h hVar = this.f14313f;
            int i10 = this.f14312e;
            this.f14312e = i10 + 1;
            return hVar.j(i10);
        }

        public boolean hasNext() {
            return this.f14312e < this.f14313f.q();
        }
    }

    public static final class b implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private int f14314e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f14315f;

        b(h hVar) {
            this.f14315f = hVar;
        }

        public boolean hasNext() {
            return this.f14314e < this.f14315f.q();
        }

        public Object next() {
            h hVar = this.f14315f;
            int i10 = this.f14314e;
            this.f14314e = i10 + 1;
            return hVar.r(i10);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final e0 a(h hVar) {
        l.g(hVar, "receiver$0");
        return new a(hVar);
    }

    public static final Iterator b(h hVar) {
        l.g(hVar, "receiver$0");
        return new b(hVar);
    }
}
