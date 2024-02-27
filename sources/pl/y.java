package pl;

import bm.a;
import cm.l;
import java.io.Serializable;

public final class y implements h, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private a f30438e;

    /* renamed from: f  reason: collision with root package name */
    private Object f30439f = v.f30436a;

    public y(a aVar) {
        l.f(aVar, "initializer");
        this.f30438e = aVar;
    }

    public boolean a() {
        return this.f30439f != v.f30436a;
    }

    public Object getValue() {
        if (this.f30439f == v.f30436a) {
            a aVar = this.f30438e;
            l.c(aVar);
            this.f30439f = aVar.a();
            this.f30438e = null;
        }
        return this.f30439f;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
