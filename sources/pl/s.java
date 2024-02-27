package pl;

import bm.a;
import cm.g;
import cm.l;
import java.io.Serializable;

final class s implements h, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private a f30433e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f30434f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f30435g;

    public s(a aVar, Object obj) {
        l.f(aVar, "initializer");
        this.f30433e = aVar;
        this.f30434f = v.f30436a;
        this.f30435g = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f30434f != v.f30436a;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this.f30434f;
        v vVar = v.f30436a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.f30435g) {
            obj = this.f30434f;
            if (obj == vVar) {
                a aVar = this.f30433e;
                l.c(aVar);
                obj = aVar.a();
                this.f30434f = obj;
                this.f30433e = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a aVar, Object obj, int i10, g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
