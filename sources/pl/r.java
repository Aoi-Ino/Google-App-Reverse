package pl;

import androidx.concurrent.futures.b;
import cm.g;
import cm.l;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class r implements h, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f30428h = new a((g) null);

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30429i = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "f");

    /* renamed from: e  reason: collision with root package name */
    private volatile bm.a f30430e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f30431f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f30432g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public r(bm.a aVar) {
        l.f(aVar, "initializer");
        this.f30430e = aVar;
        v vVar = v.f30436a;
        this.f30431f = vVar;
        this.f30432g = vVar;
    }

    public boolean a() {
        return this.f30431f != v.f30436a;
    }

    public Object getValue() {
        Object obj = this.f30431f;
        v vVar = v.f30436a;
        if (obj != vVar) {
            return obj;
        }
        bm.a aVar = this.f30430e;
        if (aVar != null) {
            Object a10 = aVar.a();
            if (b.a(f30429i, this, vVar, a10)) {
                this.f30430e = null;
                return a10;
            }
        }
        return this.f30431f;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
